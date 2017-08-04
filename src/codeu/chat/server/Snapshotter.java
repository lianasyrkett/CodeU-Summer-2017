package codeu.chat.server;

import codeu.chat.server.Model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Snapshotter implements Runnable {

    private Model model;
    private File fp;

    public Snapshotter(Model model, File fp) {
        this.model = model;
        this.fp = fp;
    }

    public void run() {
        boolean infinite = true; 
        while (infinite = true) {
            sleep();
            serialize(fp);
        }
        
    }

    public void serialize(File fp) {
        try {
        FileOutputStream fs = new FileOutputStream(fp);
        ObjectOutputStream os = new ObjectOutputStream(fs);
        os.writeObject(model); 
        os.close();
        fs.close();

        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void sleep() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
