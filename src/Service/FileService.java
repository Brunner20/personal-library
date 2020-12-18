package Service;

import Entity.File;
import Entity.User;

public class FileService {

    public boolean uploadFile(File file){
        return false;
    }
    public boolean downloadFile(File file){
        return false;
    }

    public File getFileByAuthor(User author){
        return new File();
    }

    public File getFileByName(String name ){
        return new File();
    }

    public boolean openFile(File file){
        return false;
    }
}
