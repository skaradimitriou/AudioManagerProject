public class AudioFile extends Media {

    //unique audio fields
    private String duration;
    private String singer;

    //constructor

    public AudioFile(int id, String fileName, String fileType, String description, float size, String quality, String duration, String singer) {
        super(id, fileName, fileType, description, size, quality);
        this.duration = duration;
        this.singer = singer;
    }


    //getter & setters


    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    //toString method

    @Override
    public String toString() {
        return "AudioFile{" +
                "duration='" + duration + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }
}
