package sample;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Model {
    public void reg(String login, String pass) throws IOException {
        File file = new File("C:/Java 42т/1/Registration.txt");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Login: " + login + "\n" + "Password: " + pass);
        fileWriter.close();
    }
    public void sign(String login, String pass) throws IOException{
        FileReader fileReader = new FileReader("C:/Java 42т/1/Registration.txt");
        fileReader.read();
        if (fileReader.equals(login)){

        }
    }
}