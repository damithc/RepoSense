package frontend;


public class RepoSense {
    public static void main(String[] args) {
        if (args.length == 0) {
            new Thread() {
                @Override
                public void run() {
                    javafx.application.Application.launch(Gui.class);
                }
            }.start();
        } else {
            new Client().run(args);
        }
    }
}