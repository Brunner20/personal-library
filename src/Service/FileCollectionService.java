package Service;

import Entity.File;
import Entity.FileCollection;

public class FileCollectionService {

    public boolean addFileToCollection(FileCollection fileCollection, File file){
        return false;
    }

    public boolean removeFileFromCollection(FileCollection fileCollection,File file){
        return false;
    }

    public FileCollection getCollectionByName(String name){
        return new FileCollection();
    }

    public boolean saveCollection(FileCollection collection){
        return false;
    }
    public boolean removeCollection(FileCollection fileCollection){
        return false;
    }
}
