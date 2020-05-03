import java.util.Comparator;

public abstract class Media {

    //fields

    private int id;
    private String fileName;
    private String fileType;
    private String description;
    private float size;
    private String quality;

    //constructor

    public Media(int id, String fileName, String fileType, String description, float size, String quality) {
        this.id = id;
        this.fileName = fileName;
        this.fileType = fileType;
        this.description = description;
        this.size = size;
        this.quality = quality;
    }


    //getter & setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    //toString

    @Override
    public String toString() {
        return "Media{" +
                "id=" + id +
                ", fileName='" + fileName + '\'' +
                ", fileType='" + fileType + '\'' +
                ", description='" + description + '\'' +
                ", size=" + size +
                ", quality='" + quality + '\'' +
                '}';
    }


    //hash & equals

}


