package Service;

import Entity.File;
import Entity.User;

import java.util.List;

public class FileService {

    private List<File> files;

    public FileService(List<File> files){
        this.files=files;
    }

    public boolean uploadFile(File file){
        files.add(file);
        return true;
    }
    public boolean downloadFile(File file){
        return false;
    }

    public File getFileByAuthor(User author){

        for (File file:files)
            if(file.getAuthor().equals(author))
                return file;

        return null;
    }

    public File getFileByName(String name ){
        for (File file:files)
            if(file.getName().equals(name))
                return file;

        return null;
    }

    public boolean openFile(File file){
        return true;
    }
}
