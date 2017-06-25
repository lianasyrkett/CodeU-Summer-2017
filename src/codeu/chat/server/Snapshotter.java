package codeu.chat.server;
// Where should this file and StoredData be saved?
//  In the same folder as Model.java?

import codeu.chat.server.Model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Snapshotter implements Runnable {

    private Model model;

    public Snapshotter(Model model) {
        this.model = model;
    }

    public void run() {
        boolean infinite = true; 
        while (infinite = true) { // I feel like this isnt a good way to make an infinite while loop but
            sleep();
            serialize();
        }
        
    }

    public void serialize() {
        try {
        // StoredData.txt is a file to save the serialized data to
        FileOutputStream fs = new FileOutputStream("StoredData.txt");

        ObjectOutputStream os = new ObjectOutputStream(fs);

        // should I be serializing a Model instance I create?
        os.writeObject(model); 
        
        // close the streams
        os.close();
        fs.close();

        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void sleep() {
        try {
            // makes thread sleep for 30 seconds - therefore it updates the data every 30 seconds
            Thread.sleep(30000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    // where should the deserialization occur? 
    // when it checks for the optional flag in ServerMain?
}