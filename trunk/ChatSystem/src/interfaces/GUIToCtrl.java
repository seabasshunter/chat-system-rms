package interfaces;
import java.io.File;
import java.util.ArrayList;
import signals.FileProposal;

public interface GUIToCtrl {
    
    public void createLocalInfo(String username);
    public void performConnect();
    public void performSendMessage(String message, ArrayList<String> remoteName);
    public void performSendFile(File file, ArrayList<String> remoteName);
    public void processAcceptTransfer(FileProposal fp);
    public void processRefuseTransfer(FileProposal fp);
    public void performDisconnect(String userName);
    
}
