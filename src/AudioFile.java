public class AudioFile extends Media {

    //unique audio fields
    private String duration;
    private String singer;

    //constructor

    public AudioFile(int id, String fileName, String duration, String fileType, float size, String quality, String duration1, String singer) {
        super(id, fileName, duration, fileType, description, creator, size, quality);
        this.duration = duration1;
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
