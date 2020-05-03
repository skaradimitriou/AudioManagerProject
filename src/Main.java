
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        UI ui = new UI();
        MediaManagement mediamanagement = new MediaManagement();
        ui.manageFiles(mediamanagement);

    }

}
