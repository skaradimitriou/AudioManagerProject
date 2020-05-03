import java.util.ArrayList;

public class MediaManagement {

    //
    private ArrayList<Media> medias = new ArrayList<>();

    public void addMedia(Media media){
        medias.add(media);
    }

    public void removeMedia(int index) {
        if (index >= 0 && index < medias.size()) {
            medias.remove(index);
        }
    }

        public void deleteMedia(){
            medias.clear();
        }

        public void displayMedia(){
            medias.forEach(media -> System.out.println(media));
        }

    }