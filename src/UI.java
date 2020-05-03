import java.util.Scanner;

public class UI {

    public UserChoice menu() {

        UserChoice returnChoice;
        System.out.println("Hello! How can I help you today?");
        System.out.println("1. Add a file | 2. Remove a file | 3.Display all files | 4. Clear files | 5. Find Largest File" +
                " | 6. Save files | 7. Load files | 0. Exit");
        int choice;

        //user input

        Scanner scanner = new Scanner(System.in);

        try {
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    return UserChoice.EXIT;
                case 1:
                    return UserChoice.ADD;
                case 2:
                    return UserChoice.REMOVE;
                case 3:
                    return UserChoice.DISPLAY;
                case 4:
                    return UserChoice.DELETE;
                case 5:
                    return UserChoice.TOTALFILESIZE;
                case 6:
                    return UserChoice.SAVE;
                case 7:
                    return UserChoice.LOAD;
                default:
                    return UserChoice.ERROR;
            }
        } catch (Exception e) {
            return UserChoice.ERROR;
        }
    }

    public Media createMedia() {

        int id;
        String fileName;
        String fileType;
        String description;
        float size;
        String quality;
        String photographer;
        String duration;
        String singer;
        String producer;
        int mediaType;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What type of file would you like to add to the system?");
        System.out.println("1. Photo file | 2. Audio file | 3. Video file");

        mediaType = scanner.nextInt();

        System.out.println("Give the media id");
        id = scanner.nextInt();

        System.out.println("Give the media file name ");
        fileName = scanner.next();

        System.out.println("Give the media file type");
        fileType = scanner.next();

        System.out.println("Give the media description");
        description = scanner.next();

        System.out.println("Give the media size");
        size = scanner.nextFloat();

        System.out.println("Give the media quality");
        quality = scanner.next();

        Media media;

        switch (mediaType){
            case 1:
                System.out.println("Give photographer");
                photographer = scanner.next();
                media = new Photos(id,fileName,fileType,description,size,quality,photographer);
                return media;
            case 2:
                System.out.println("Give the track duration");
                duration = scanner.next();
                System.out.println("Give the track singer");
                singer = scanner.next();
                media = new AudioFile(id,fileName,fileType,description,size,quality,duration,singer);
                return media;
            case 3:
                System.out.println("Give the video duration");
                duration = scanner.next();
                System.out.println("Give the video producer");
                producer = scanner.next();
                media = new VideoFile(id,fileName,fileType,description,size,quality,duration,producer);
                return media;
            default:
                return null;
        }
    }

    public void manageFiles(MediaManagement mediaManagement) {

        UserChoice choice;

        do {

            choice = menu();

            switch (choice) {
                case ADD:
                    Media media = this.createMedia();
                    mediaManagement.addMedia(media);
                    break;
                case REMOVE:
                    System.out.println("Give an index to remove");
                    Scanner scanner = new Scanner(System.in);
                    int index = scanner.nextInt();
                    mediaManagement.removeMedia(index);
                    break;
                case DISPLAY:
                    mediaManagement.displayMedia();
                    break;
                case DELETE:
                    mediaManagement.deleteMedia();
                    break;
                case SAVE:
                    mediaManagement.saveFiles("my_media_files.txt");
                    System.out.println("Your file has been saved");
                    break;
                case LOAD:
                    mediaManagement.loadFiles("my_media_files.txt");
                    System.out.println("Load successful");
                break;
                case TOTALFILESIZE:
                    mediaManagement.largestMediaSize();
                case EXIT:
                    return;
                case ERROR:
                    System.out.println("You gave a wrong input");
                    break;
            }
        }
        while (choice != UserChoice.EXIT);
    }
}

