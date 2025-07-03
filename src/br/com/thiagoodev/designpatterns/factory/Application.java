package br.com.thiagoodev.designpatterns.factory;

import java.util.Optional;

public class Application {
    private final Dialog dialog;

    public Application() throws Exception {
        final String osName = readApplicationFile();
        switch(osName) {
            case "Mac OS X":
                this.dialog = new WindowsDialog();
                break;
            case "Windows":
                this.dialog = new WebDialog();
                break;
            default:
                throw new Exception("Error! Unknown operating system.");
        }
    }

    static String readApplicationFile() {
        return Optional
                .ofNullable(System.getProperty("os.name"))
                .orElse("");
    }

    void render() {
        dialog.render();
    }
}
