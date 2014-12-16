package chatsystem;

import interfaces.*;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import signals.FileProposal;

public class GUI extends javax.swing.JFrame implements CtrlToGUI {
    
    /**
     * Creates new form EntryFrame
     */
    private StyledDocument doc; //for the text customization
    private Style chatSystemStyle, errorStyle, receiveStyle, sendStyle; // different print style
    private File file; // the file we propose
    private ArrayList<String> receiverList; // receiverlist given to ctrl
    private String fileHandled;// file that we are handling ( accept receive or not)
    
    public GUI() {
        initComponents();
        
        doc = receivedMessageArea.getStyledDocument();
        /*
        * styles' initialization
        * Green for System
        * yellow for received message
        * orange for sent message
        * Red for error printed for user
        */
        chatSystemStyle = receivedMessageArea.addStyle("chatSystemStyle", null);
        receiveStyle = receivedMessageArea.addStyle("fromStyle", null);
        sendStyle = receivedMessageArea.addStyle("toStyle", null);
        errorStyle = receivedMessageArea.addStyle("errStyle", null);
        
        StyleConstants.setForeground(errorStyle, Color.RED);
        StyleConstants.setForeground(chatSystemStyle,Color.GREEN);
        StyleConstants.setForeground(receiveStyle, Color.YELLOW);
        StyleConstants.setForeground(sendStyle, Color.ORANGE);
        receiverList = new ArrayList<String>();
        usageFrame.setTitle("RMS ChatSystem");
        queryDialog.setTitle("File Proposed");
        this.setTitle("RMS ChatSystem");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usageFrame = new javax.swing.JFrame();
        UsagePanel = new javax.swing.JPanel();
        receivedMessagePanel = new javax.swing.JScrollPane();
        receivedMessageArea = new javax.swing.JTextPane();
        sendButton = new javax.swing.JButton();
        receiverTextField = new javax.swing.JTextField();
        toLabel = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        sendMessagePanel = new javax.swing.JScrollPane();
        sendMessageArea = new javax.swing.JTextArea();
        showHideButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        userlistLabel = new javax.swing.JLabel();
        listPanel = new javax.swing.JScrollPane();
        connectedList = new javax.swing.JList();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        proposeFile = new javax.swing.JMenuItem();
        proposedFile = new javax.swing.JMenuItem();
        downloadedFile = new javax.swing.JMenuItem();
        userlistMenu = new javax.swing.JMenu();
        showList = new javax.swing.JMenuItem();
        hideList = new javax.swing.JMenuItem();
        quitMenu = new javax.swing.JMenu();
        queryDialog = new javax.swing.JDialog();
        filePanel = new javax.swing.JPanel();
        questionLabel = new javax.swing.JLabel();
        noButton = new javax.swing.JButton();
        yesButton = new javax.swing.JButton();
        scrolFilepanel = new javax.swing.JScrollPane();
        listFile = new javax.swing.JList();
        entryPanel = new javax.swing.JPanel();
        presentationLabel = new javax.swing.JLabel();
        usernameArea = new javax.swing.JTextField();
        connectButton = new javax.swing.JButton();
        proprietaryLabel = new javax.swing.JLabel();

        usageFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        usageFrame.setResizable(false);
        usageFrame.setSize(new java.awt.Dimension(620, 520));
        usageFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                usageFrameWindowClosing(evt);
            }
        });

        UsagePanel.setBackground(new java.awt.Color(102, 102, 102));
        UsagePanel.setPreferredSize(new java.awt.Dimension(650, 447));

        receivedMessageArea.setEditable(false);
        receivedMessageArea.setBackground(new java.awt.Color(51, 51, 51));
        receivedMessageArea.setForeground(new java.awt.Color(255, 255, 255));
        receivedMessagePanel.setViewportView(receivedMessageArea);

        sendButton.setText("SEND");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        receiverTextField.setEditable(false);
        receiverTextField.setBackground(new java.awt.Color(51, 51, 51));
        receiverTextField.setForeground(new java.awt.Color(255, 255, 255));
        receiverTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        toLabel.setForeground(new java.awt.Color(255, 255, 255));
        toLabel.setText("To :");

        messageLabel.setForeground(new java.awt.Color(255, 255, 255));
        messageLabel.setText("Message :");

        sendMessageArea.setBackground(new java.awt.Color(51, 51, 51));
        sendMessageArea.setColumns(20);
        sendMessageArea.setForeground(new java.awt.Color(255, 255, 255));
        sendMessageArea.setRows(5);
        sendMessageArea.setCaretColor(new java.awt.Color(255, 255, 255));
        sendMessageArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        sendMessagePanel.setViewportView(sendMessageArea);

        showHideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showHideButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UsagePanelLayout = new javax.swing.GroupLayout(UsagePanel);
        UsagePanel.setLayout(UsagePanelLayout);
        UsagePanelLayout.setHorizontalGroup(
            UsagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UsagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UsagePanelLayout.createSequentialGroup()
                        .addGroup(UsagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, UsagePanelLayout.createSequentialGroup()
                                .addComponent(toLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(receiverTextField))
                            .addGroup(UsagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(receivedMessagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, UsagePanelLayout.createSequentialGroup()
                                    .addComponent(sendMessagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sendButton))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(showHideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(messageLabel))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        UsagePanelLayout.setVerticalGroup(
            UsagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsagePanelLayout.createSequentialGroup()
                .addGroup(UsagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UsagePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(receivedMessagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UsagePanelLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(showHideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(UsagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toLabel)
                    .addComponent(receiverTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(UsagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sendButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sendMessagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                .addGap(249, 249, 249))
        );

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        userlistLabel.setBackground(new java.awt.Color(51, 0, 0));
        userlistLabel.setForeground(new java.awt.Color(255, 255, 255));
        userlistLabel.setText("Connected user");

        connectedList.setBackground(new java.awt.Color(51, 51, 51));
        connectedList.setForeground(new java.awt.Color(255, 255, 255));
        connectedList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                connectedListMousePressed(evt);
            }
        });
        listPanel.setViewportView(connectedList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(listPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(userlistLabel)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(userlistLabel)
                .addGap(18, 18, 18)
                .addComponent(listPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        fileMenu.setText("File");

        proposeFile.setText("Send File");
        proposeFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proposeFileActionPerformed(evt);
            }
        });
        fileMenu.add(proposeFile);

        proposedFile.setText("See Files");
        proposedFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proposedFileActionPerformed(evt);
            }
        });
        fileMenu.add(proposedFile);

        downloadedFile.setText("Downloads");
        downloadedFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadedFileActionPerformed(evt);
            }
        });
        fileMenu.add(downloadedFile);

        menuBar.add(fileMenu);

        userlistMenu.setText("Userlist");

        showList.setText("Show");
        showList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showListActionPerformed(evt);
            }
        });
        userlistMenu.add(showList);

        hideList.setText("Hide");
        hideList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hideListActionPerformed(evt);
            }
        });
        userlistMenu.add(hideList);

        menuBar.add(userlistMenu);

        quitMenu.setText("Quit");
        quitMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                quitMenuMousePressed(evt);
            }
        });
        menuBar.add(quitMenu);

        usageFrame.setJMenuBar(menuBar);

        javax.swing.GroupLayout usageFrameLayout = new javax.swing.GroupLayout(usageFrame.getContentPane());
        usageFrame.getContentPane().setLayout(usageFrameLayout);
        usageFrameLayout.setHorizontalGroup(
            usageFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usageFrameLayout.createSequentialGroup()
                .addComponent(UsagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        usageFrameLayout.setVerticalGroup(
            usageFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UsagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        queryDialog.setBackground(new java.awt.Color(255, 255, 255));
        queryDialog.setResizable(false);
        queryDialog.setSize(new java.awt.Dimension(457, 400));

        filePanel.setBackground(new java.awt.Color(102, 102, 102));

        questionLabel.setForeground(new java.awt.Color(255, 255, 255));
        questionLabel.setText("   Do you accept to receive this file ?");

        noButton.setText("no");
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButtonActionPerformed(evt);
            }
        });

        yesButton.setText("yes");
        yesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesButtonActionPerformed(evt);
            }
        });

        listFile.setBackground(new java.awt.Color(51, 51, 51));
        listFile.setForeground(new java.awt.Color(255, 255, 255));
        listFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listFileMousePressed(evt);
            }
        });
        scrolFilepanel.setViewportView(listFile);

        javax.swing.GroupLayout filePanelLayout = new javax.swing.GroupLayout(filePanel);
        filePanel.setLayout(filePanelLayout);
        filePanelLayout.setHorizontalGroup(
            filePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filePanelLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(yesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(noButton)
                .addGap(97, 97, 97))
            .addGroup(filePanelLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(filePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrolFilepanel)
                .addContainerGap())
        );
        filePanelLayout.setVerticalGroup(
            filePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(questionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrolFilepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(filePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yesButton)
                    .addComponent(noButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout queryDialogLayout = new javax.swing.GroupLayout(queryDialog.getContentPane());
        queryDialog.getContentPane().setLayout(queryDialogLayout);
        queryDialogLayout.setHorizontalGroup(
            queryDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(filePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        queryDialogLayout.setVerticalGroup(
            queryDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(filePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        entryPanel.setBackground(new java.awt.Color(51, 51, 51));

        presentationLabel.setBackground(new java.awt.Color(0, 0, 51));
        presentationLabel.setFont(new java.awt.Font("Malayalam MN", 2, 18)); // NOI18N
        presentationLabel.setForeground(new java.awt.Color(255, 255, 255));
        presentationLabel.setText("Welcome to the ChatSystem !");

        usernameArea.setBackground(new java.awt.Color(0, 0, 0));
        usernameArea.setForeground(new java.awt.Color(255, 255, 255));
        usernameArea.setText("username");
        usernameArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        usernameArea.setCaretColor(new java.awt.Color(255, 255, 255));
        usernameArea.setSelectedTextColor(new java.awt.Color(153, 153, 255));

        connectButton.setText("CONNECT");
        connectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectButtonActionPerformed(evt);
            }
        });

        proprietaryLabel.setForeground(new java.awt.Color(255, 255, 255));
        proprietaryLabel.setText("©RMS");

        javax.swing.GroupLayout entryPanelLayout = new javax.swing.GroupLayout(entryPanel);
        entryPanel.setLayout(entryPanelLayout);
        entryPanelLayout.setHorizontalGroup(
            entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entryPanelLayout.createSequentialGroup()
                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entryPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(proprietaryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(entryPanelLayout.createSequentialGroup()
                        .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(entryPanelLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(presentationLabel))
                            .addGroup(entryPanelLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(usernameArea)
                                    .addComponent(connectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
        );
        entryPanelLayout.setVerticalGroup(
            entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entryPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(presentationLabel)
                .addGap(18, 18, 18)
                .addComponent(usernameArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(connectButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(proprietaryLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void connectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectButtonActionPerformed
        System.out.println("DEBUG *** GUI : pressed CONNECT ***");
        // create info thanks to the user input : name
        ChatSystem.getControler().createLocalInfo(usernameArea.getText());        
        // initialize the list of connected users
        connectedList.setModel(ChatSystem.getModel().getRemoteTable());
        connectedList.validate();
        // initialize the list of proposed files
        listFile.setModel(ChatSystem.getModel().getFileStringProposed());
        ChatSystem.getControler().performConnect();
        // print to the chat the welcome message
        try {
            doc.insertString(doc.getLength(), "Welcome to the chat " + usernameArea.getText() + " ! \nyour adress ip is : " + ChatSystem.getModel().getLocalAdress() + "\n", chatSystemStyle);
        } catch (BadLocationException e) {
            System.err.println(e);
        }
        // disable the entry frame and enable the main frame
        this.setVisible(false);
        this.usageFrame.setVisible(true);                      
    }//GEN-LAST:event_connectButtonActionPerformed
    
    
    /*
    *for query Dialog
    */
    
    private void yesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesButtonActionPerformed
        System.out.println("DEBUG *** GUI : file accepted ***");
        queryDialog.setVisible(false);
        ChatSystem.getControler().performAcceptTransfer(fileHandled);
        fileHandled = null;
    }//GEN-LAST:event_yesButtonActionPerformed
    
    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed
        System.out.println("DEBUG *** GUI : file refused ***");
        queryDialog.setVisible(false);
        ChatSystem.getControler().performRefuseTransfer(fileHandled);
        fileHandled = null;
    }//GEN-LAST:event_noButtonActionPerformed
    
    /*
    *for Usage frame
    */
    
    private void connectedListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connectedListMousePressed
        System.out.println("DEBUG *** GUI : selected a receiver ***");
        if(!receiverList.contains((String) connectedList.getSelectedValue())){
            // if the selected user hasn't been selected yet
            System.out.println("DEBUG *** GUI : add to receivers ***");
            // we add it to receivers
            receiverList.add((String) connectedList.getSelectedValue());
            receiverTextField.setText(receiverList.toString());
        }else{
            // else we delete it
            System.out.println("DEBUG *** GUI : delete from receivers ***");
            receiverList.remove((String) connectedList.getSelectedValue());
        }
        receiverTextField.setText(arrayToString(receiverList));       
    }//GEN-LAST:event_connectedListMousePressed
    
    private void proposedFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proposedFileActionPerformed
        queryDialog.setVisible(true);
    }//GEN-LAST:event_proposedFileActionPerformed
    
    private void quitMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitMenuMousePressed
        disconnection();
    }//GEN-LAST:event_quitMenuMousePressed
    
    private void proposeFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proposeFileActionPerformed
        System.out.println("DEBUG *** GUI : pressed FILE ***");
        JFileChooser chooser = new JFileChooser();
        int retValue = chooser.showOpenDialog(null);
        
        if (retValue == JFileChooser.APPROVE_OPTION){
            file = chooser.getSelectedFile();
            sendMessageArea.setText("File : " + file.getAbsolutePath());
        }
    }//GEN-LAST:event_proposeFileActionPerformed
    
    private void showListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showListActionPerformed
        if (usageFrame.getWidth() < 700){
            usageFrame.setSize(usageFrame.getWidth()+ 230,usageFrame.getHeight());
        }
    }//GEN-LAST:event_showListActionPerformed
    
    private void hideListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hideListActionPerformed
        if (usageFrame.getWidth() > 800){
            usageFrame.setSize(usageFrame.getWidth()- 230,usageFrame.getHeight());
        }
    }//GEN-LAST:event_hideListActionPerformed
    
    private void showHideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showHideButtonActionPerformed
        if (usageFrame.getWidth() < 700){
            usageFrame.setSize(usageFrame.getWidth()+ 230,usageFrame.getHeight());
        }else if(usageFrame.getWidth() > 800){
            usageFrame.setSize(usageFrame.getWidth()- 230,usageFrame.getHeight());
        }
    }//GEN-LAST:event_showHideButtonActionPerformed
    
    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        System.out.println("DEBUG *** GUI : pressed SEND ***");
        
        if (receiverTextField.getText().equals("")) {
            // if no receivers were selected
            System.err.println("DEBUG *** GUI : no user selected ***");
            erreurReceiver();
        } else {
            // if we selected one or more users
            try {
                // print a message to the chat
                for (String s : receiverList){
                    doc.insertString(doc.getLength(), "To " + s + " : " + sendMessageArea.getText() + "\n", sendStyle);
                }
                // if text / file
                if(sendMessageArea.getText().contains("File :")){
                    System.out.println("DEBUG *** GUI : File transmitted to ctrl : " + sendMessageArea.getText() + " ***");
                    ChatSystem.getControler().performSendFile(file, receiverList);
                    file = null;
                }else{
                    System.out.println("DEBUG *** GUI : message transmitted to ctrl : " + sendMessageArea.getText() + " ***");
                    ChatSystem.getControler().performSendMessage(sendMessageArea.getText(), receiverList);
                }
            } catch (BadLocationException e) {
                System.err.println(e);
            }
            sendMessageArea.setText("");
            receiverTextField.setText("");
            receiverList.clear();
        }
    }//GEN-LAST:event_sendButtonActionPerformed
    
    private void listFileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listFileMousePressed
        System.out.println("DEBUG *** GUI : selected a file ***");
        fileHandled = (String)listFile.getSelectedValue();
        
    }//GEN-LAST:event_listFileMousePressed
    
    private void downloadedFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadedFileActionPerformed
        System.out.println("DEBUG *** GUI : selected downloaded file menu ***");
        JFileChooser chooser = new JFileChooser("./chatDownload");
        int retValue = chooser.showOpenDialog(null);
        if (retValue == JFileChooser.APPROVE_OPTION){
            // if user pushed open button : open the file
            file = chooser.getSelectedFile();          
            try{
                Desktop.getDesktop().open(file);
            }catch(IOException e){
                System.err.println(e);
            }
            file = null;
        }
    }//GEN-LAST:event_downloadedFileActionPerformed

    private void usageFrameWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_usageFrameWindowClosing
        disconnection();                
    }//GEN-LAST:event_usageFrameWindowClosing
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel UsagePanel;
    private javax.swing.JButton connectButton;
    private javax.swing.JList connectedList;
    private javax.swing.JMenuItem downloadedFile;
    private javax.swing.JPanel entryPanel;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JPanel filePanel;
    private javax.swing.JMenuItem hideList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JList listFile;
    private javax.swing.JScrollPane listPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JButton noButton;
    private javax.swing.JLabel presentationLabel;
    private javax.swing.JMenuItem proposeFile;
    private javax.swing.JMenuItem proposedFile;
    private javax.swing.JLabel proprietaryLabel;
    private javax.swing.JDialog queryDialog;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JMenu quitMenu;
    private javax.swing.JTextPane receivedMessageArea;
    private javax.swing.JScrollPane receivedMessagePanel;
    private javax.swing.JTextField receiverTextField;
    private javax.swing.JScrollPane scrolFilepanel;
    private javax.swing.JButton sendButton;
    private javax.swing.JTextArea sendMessageArea;
    private javax.swing.JScrollPane sendMessagePanel;
    private javax.swing.JButton showHideButton;
    private javax.swing.JMenuItem showList;
    private javax.swing.JLabel toLabel;
    private javax.swing.JFrame usageFrame;
    private javax.swing.JLabel userlistLabel;
    private javax.swing.JMenu userlistMenu;
    private javax.swing.JTextField usernameArea;
    private javax.swing.JButton yesButton;
    // End of variables declaration//GEN-END:variables
    
     // called when we receive hello or helloOk
    @Override
    public void addUser(String remoteName) {
        System.out.println("DEBUG *** GUI : addUser <= when we receive a hello ***"); 
        
        try {
            doc.insertString(doc.getLength(), remoteName + " is now connected !\n", chatSystemStyle);
            connectedList.revalidate();
        } catch (BadLocationException e) {
            System.err.println(e);
        }
        
    }
    
    // called when we receive a text message
    @Override
    public void processTextMessage(String message, String remoteName,ArrayList<String> to) {
        System.out.println("DEBUG *** GUI : processTextMessage :" + message + " dest : " +arrayToString(to)+ " <= when we receive a message ***");
        try {
            doc.insertString(doc.getLength(), "from " + remoteName + " : " + message + "\n", receiveStyle);
            if (to.size()>1){
                doc.insertString(doc.getLength(),"(sent to these people : "+arrayToString(to)+")\n" , receiveStyle);
            }
        } catch (BadLocationException e) {
            System.err.println(e);
        }
    }
    
    // notify if we successfully received the file and created it
    @Override
    public void notifyReceived(String fileName){
        System.out.println("DEBUG *** GUI : notify received ***");
        
        try {
            doc.insertString(doc.getLength(), "File :"+ fileName+ " received successfully !\n", chatSystemStyle);
        } catch (BadLocationException e) {
            System.err.println(e);
        }
    }
    
    // notify if we didn't succeed to received the whole file 
    @Override
    public void notifyNotReceived(String fileName){
        System.out.println("DEBUG *** GUI : notify not received ***");
        
        try {
            doc.insertString(doc.getLength(), "File :"+ fileName+ " failed in reception !\n", errorStyle);
        } catch (BadLocationException e) {
            System.err.println(e);
        }
    }
    
    
    // called when we have successfully sent a file
    @Override
    public void notifyTransmitted() {
        System.out.println("DEBUG *** GUI : notifyTransmitted <= when we have successfully sent the file ***");
        
        try {
            doc.insertString(doc.getLength(), "File Transmitted ! " + "\n", chatSystemStyle);
        } catch (BadLocationException e) {
            System.err.println(e);
        }
    }
   
    // called when we haven't successfully sent a file
    @Override
    public void notifyNotTransmitted() {
        System.out.println("DEBUG *** GUI : notifyNotTransmitted <= when we haven't successfully sent the file ***");
        
        try {
            doc.insertString(doc.getLength(), "File failed to Transmit ! " + "\n", errorStyle);
        } catch (BadLocationException e) {
            System.err.println(e);
        }
    }
    
    //called when the remote user accepted our proposal
    @Override
    public void processFileAccepted(){
        System.out.println("DEBUG *** GUI : processFileAccepted <= when the file have been accepted***");
        
        try {
            doc.insertString(doc.getLength(), "File accepted ! " + "\n", chatSystemStyle);
        } catch (BadLocationException e) {
            System.err.println(e);
        }
    }
    
    //called when the remote user didn't accept our proposal
    @Override
    public void processFileNotAccepted(){
        System.out.println("DEBUG *** GUI : processFileNotAccepted <= when the file have been refused ***");
        
        try {
            doc.insertString(doc.getLength(), "File refused ! " + "\n", errorStyle);
        } catch (BadLocationException e) {
            System.err.println(e);
        }
        
    }
       
    //called when we receive a file proposal
    @Override
    public void processFileQuery(FileProposal fp){
        System.out.println("DEBUG *** GUI : processFileQuery <= when we receive a proposal ***");
        
        try {
            doc.insertString(doc.getLength(), "You received a knew file proposal !\n", chatSystemStyle);
            listFile.revalidate();
        } catch (BadLocationException e) {
            System.err.println(e);
        }
    }
    
    // called when we receive a goodbye
    @Override
    public void deleteUser(String remoteName) {
        System.out.println("DEBUG *** GUI : deleteUser <= when we receive a goodBye ***");
        
        try {
            doc.insertString(doc.getLength(), remoteName + " is now disconnected !\n", chatSystemStyle);
            connectedList.revalidate();
        } catch (BadLocationException e) {
            System.err.println(e);
        }     
    }
   
    // to put in string the array of receivers we create here
    public String arrayToString(ArrayList<String> a){
        String result =new String();
        for (String s : a){
            if(!(s == null)){
                result += s +",";
            }
        }
        return result;
    }
    
    // disconnection procedure ( used when pushed quit or close frame )
    public void disconnection(){
        System.out.println("DEBUG *** GUI : pressed DISCONNECT ***");
        ChatSystem.getControler().performDisconnect(ChatSystem.getModel().getUsername());
        receivedMessageArea.setText("");
        receiverTextField.setText("");
        usageFrame.setVisible(false);
        this.setVisible(true);
    }
    
    // when the user did something wrong : did not select any receiver 
    public void erreurReceiver() {
        System.out.println("DEBUG *** GUI : erreurReceiver <= when we didn't choose any receiver ***");
        
        try {
            doc.insertString(doc.getLength(), "Erreur : selectionnez un utilisateur distant\n", errorStyle);
        } catch (BadLocationException e) {
            System.err.println(e);
        }
    }
}
