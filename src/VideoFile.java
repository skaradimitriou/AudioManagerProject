public class VideoFile extends Media{

    //unique audio fields
    private String duration;
    private String producer;

    //constructor

    public VideoFile(int id, String fileName, String fileType, String description, float size, String quality, String duration, String producer) {
        super(id, fileName, fileType, description, size, quality);
        this.duration = duration;
        this.producer = producer;
    }


    // getters & setters

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    //toString method
    @Override
    public String toString() {
        return "VideoFile{" +
                "duration='" + duration + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
