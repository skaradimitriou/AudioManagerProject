import java.util.Scanner;

public class UI {

    public UserChoice menu() {

        UserChoice returnChoice;

        System.out.println("What would you like to do?");
        System.out.println("1. ADD 2. REMOVE 3. DISPLAY 4.DELETE 0.EXIT");

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
                System.out.println("Give the singer");
                singer = scanner.next();
                media = new AudioFile(id,fileName,fileType,description,size,quality,duration,singer);
                return media;
            case 3:
                System.out.println("Give the video duration");
                duration = scanner.next();
                System.out.println("Give color");
                producer = scanner.next();
                media = new VideoFile(id,fileName,fileType,description,size,quality,producer);
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

