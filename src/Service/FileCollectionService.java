package Service;

import Entity.File;
import Entity.FileCollection;

import java.util.ArrayList;
import java.util.List;


public class FileCollectionService {
    
    private List<FileCollection> allFileCollection = new ArrayList<>();

    public  FileCollectionService(List<FileCollection> list){
        this.allFileCollection=list;
    }

    public boolean addFileToCollection(FileCollection fileCollection, File file){
        int index = allFileCollection.indexOf(fileCollection);
        if(index>=0)
        {
            allFileCollection.get(index).addFile(file);
            return true;
        }
        return false;
    }

    public boolean removeFileFromCollection(FileCollection fileCollection,File file){
        int index = allFileCollection.indexOf(fileCollection);
        if(index>=0)
        {
            allFileCollection.get(index).removeFile(file);
            return true;
        }
        return false;
    }

    public FileCollection getCollectionByName(String name){
        for(FileCollection collection:allFileCollection)
            if(collection.getNames().equals(name))
                return collection;

        return null;
    }

    public boolean saveCollection(FileCollection collection){
        allFileCollection.add(collection);
        return true;
    }
    public boolean removeCollection(FileCollection fileCollection){
        allFileCollection.remove(fileCollection);
        return true;
    }
}
