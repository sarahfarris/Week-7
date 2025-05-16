package Generics;

import java.util.List;

public class ChihuahuaBag {

    List<Chihuahua> items;

    public ChihuahuaBag(List<Chihuahua> items) {
        this.items = items;
    }

    public List<Chihuahua> getItems() {
        return items;
    }

    public void setItems(List<Chihuahua> items) {
        this.items = items;
    }

    public void add(Chihuahua chihuahua){
        this.items.add(chihuahua);
    }


    public void printContents(){

    }


}
