import com.sun.security.jgss.GSSUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MediaManagement {

    //
    private ArrayList<Media> medias = new ArrayList<>();

    public void addMedia(Media media){
        medias.add(media);
    }

    public void removeMedia(int index) {
        if (index >= 0 && index < medias.size()) {
            medias.remove(index);
            System.out.println("Your file has been removed");
        }
    }

        public void deleteMedia(){
            medias.clear();
            System.out.println("All files have been deleted");
        }

        public void displayMedia(){
            if (medias.size()>0){
                medias.forEach(media -> System.out.println(media));
            }
            else {
                System.out.println("You haven't saved any files yet");
            }
        }

        //save file

    public void saveFiles(String filename) {
        //saves the basket as csv file

        try {
            PrintWriter printWriter = new PrintWriter(new File(filename));
            for (Media m : medias) {
                printWriter.println(m.getId() + "," + m.getFileName() + "," + m.getFileType() + "," + m.getDescription()
                        + "," + m.getDescription() + "," + m.getSize() + "," + m.getQuality());

            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file cannot be saved");
            ;
        }
    }
        //save file

        public void loadFiles(String filename) {
            medias.clear();
            try {
                Scanner scanner = new Scanner(new File(filename));
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] words = line.split(",");

                    Media media = new Photos(
                            Integer.parseInt(words[0]),
                            words[1],words[2],words[3],
                            Float.parseFloat(words[4]),words[6],"Someone");

                    medias.add(media);
                    }

                } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }

        }

    public Media largestMediaSize(){
        Media media;
        return medias.stream()
                .max(Comparator.comparingDouble(Media::getSize))
                .get();
    }

    }