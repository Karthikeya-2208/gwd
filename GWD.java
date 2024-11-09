import java.awt.Desktop;
import java.net.URI;

public class GWD {
    public static void main(String[] args) {
        // Define these variables
        String name = "karthikeya";
        String rollNo = "100523729044";
        String branch = "aiml";
        String githubRepoLink = "https://github.com/Karthikeya-2208/gwd/edit/main/GWD.java";

        try {
            String title = "Roll no: " + rollNo + " - Name: " + name + " - Branch: " + branch;

            URI uri = new URI(githubRepoLink);

            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(uri);
                System.out.println("Opened GitHub repo with title: " + title);
            } else {
                System.out.println("Desktop not supported, cannot open browser.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
