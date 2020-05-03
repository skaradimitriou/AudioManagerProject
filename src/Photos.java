public class Photos extends Media {

    //unique photo fields
    private String photographer;

    //constructor

    public Photos(int id, String fileName, String fileType, String description, float size, String quality, String photographer) {
        super(id, fileName, fileType, description, size, quality);
        this.photographer = photographer;
    }


    //getter & setter

    public String getPhotographer() {
        return photographer;
    }

    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }

    //toString
    @Override
    public String toString() {
        return "Photos{" +
                "photographer='" + photographer + '\'' +
                '}';
    }

}
