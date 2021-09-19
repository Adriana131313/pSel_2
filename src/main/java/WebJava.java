import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class WebJava {

    public static void main(String[] args) {
        //use the "awt" library to get values or variables to connect to the browser
        if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

            if (desktop.isSupported(Desktop.Action.BROWSE)) {
                try {
                    java.net.URI uri = new java.net.URI("https://www.toolsqa.com/");
                    desktop.browse(uri);
                } catch (URISyntaxException | IOException ex) {}
            }
        }
    }
}
