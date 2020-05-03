public class VideoFile extends Media{

    //unique audio fields
    private String duration;
    private String producer;

    //constructor

    public VideoFile(int id, String fileName, String duration, String fileType, float size, String quality, String duration1) {
        super(id, fileName, duration, fileType, description, creator, size, quality);
        this.duration = duration1;
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
