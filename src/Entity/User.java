package Entity;

import Entity.FileCollection;

import java.util.Set;

public class User {

    private String name;
    private String password;
    private Set<FileCollection> playlists;

    public boolean addFile(){
        return false;
    }
    public boolean removeCost(){

        return false;
    }

    public boolean addCollection(){
        return false;
    }

    public boolean removeCollection(){
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<FileCollection> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(Set<FileCollection> playlists) {
        this.playlists = playlists;
    }
}
