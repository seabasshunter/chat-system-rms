package interfaces;
import java.io.File;
import java.util.ArrayList;

public interface GUIToCtrl {
    
    public void createLocalInfo(String username);
    public void performConnect();
    public void performSendMessage(String message, ArrayList<String> remoteName);
    public void performSendFile(File file,String remoteName);
    public void processAcceptTransfer();
    public void processRefuseTransfer();
    public void performDisconnect(String userName);
    
}
