import java.util.Scanner;
import java.io.File;
import java.net.URL;

public class HandleBigDatabase
{
    public static void main(String [] args) throws Exception {
        URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
        Scanner input = new Scanner(url.openStream());
        double assistantTotal = 0.0;
        int countAssistant = 0;
        double associateTotal = 0.0;
        int countAssociate = 0;
        double fullTotal = 0.0;
        int countFull = 0;

        while (input.hasNext()) {
            String line = input.nextLine();
            String[] message = line.split(" ");
            switch (message[2]) {
                case "assistant" -> {
                    assistantTotal += Double.parseDouble(message[3]);
                    countAssistant++;
                }
                case "associate" -> {
                    associateTotal += Double.parseDouble(message[3]);
                    countAssociate++;
                }
                case "full" -> {
                    fullTotal += Double.parseDouble(message[3]);
                    countFull++;
                }
            }
        }

        System.out.println("Assistant total " + assistantTotal + ", Average " + (assistantTotal / countAssistant));
        System.out.println("Associate total " + associateTotal + ", Average " + (associateTotal / countAssociate));
        System.out.println("Full total " + fullTotal + ", Average " + (fullTotal / countFull));
    }
}