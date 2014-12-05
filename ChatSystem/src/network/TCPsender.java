package network;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import signals.Signal;

public class TCPsender extends Thread {

    private Socket s1;
    private OutputStreamWriter out;
    private BufferedWriter writer;
    private InputStream reader;
    private byte[] buffer;
    private long size;
    private File file;

    public TCPsender(Socket s, File file, String remoteName, long size) {

        this.s1 = s;
        this.file = file;
        this.size = size;
        this.buffer = new byte[Signal.MAX_SIZE];
    }

    @Override
    public void run() {
        connectionEstablishement();
        sendFile();

        try {
            // Wainting for an ack from the remote server then close the connection
            reader.read(buffer);
        } catch (IOException ex) {
            Logger.getLogger(TCPsender.class.getName()).log(Level.SEVERE, null, ex);
        }

        connectionTearDown();
    }

    private void connectionEstablishement() {
        try {
            out = new OutputStreamWriter(s1.getOutputStream());
            writer = new BufferedWriter(out);
            reader = s1.getInputStream();
        } catch (IOException ex) {
            Logger.getLogger(TCPsender.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("DEBUG *** TCPsender : Connection established ***");
    }

    public void sendFile() {

        FileInputStream fis = null;
        try {
            byte[] buf = new byte[(int) size];
            fis = new FileInputStream(file);
            fis.read(buf);
            this.writer.write(buf.toString());
            this.writer.newLine();
            this.writer.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TCPsender.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TCPsender.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(TCPsender.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("DEBUG *** TCPsender : File sent ***");
    }

    public void connectionTearDown() {
        try {
            this.s1.close();
        } catch (IOException ex) {
            Logger.getLogger(TCPsender.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("DEBUG *** TCPsender : Closing the connection ***");
    }
}
