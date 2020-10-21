package sample;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.ArrayList;

public class Model {
    public void reg(String login, String pass , Label status) throws IOException {
        File file = new File("C:/Java_42/1/Registration.txt");
        FileWriter fileWriter = new FileWriter(file);
        file.createNewFile();
        if (login .isEmpty() || pass.isEmpty()) {
            status.setText("Введите логин или пароль");
        }else status.setText("Вы зарегистрированы.");
        fileWriter.write(login +"\n" + pass);
        fileWriter.close();

    }
    public void sign(TextField login, PasswordField pass, Label status) throws IOException{
        FileReader fileReader = new FileReader("C:/Java_42/1/Registration.txt");
        String str;
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        ArrayList<String> arrayList = new ArrayList<>();
        while ((str = bufferedReader.readLine()) !=null){
            if (str.isEmpty()) break;
            arrayList.add(str);
        }
        ArrayList <String> arrayList1 = new ArrayList<>();
        arrayList1.add(login.getText());
        arrayList1.add(pass.getText());
        if (arrayList.equals(arrayList1)){
            status.setText("Вы успешно вошли в систему");
        }else status.setText("Неверный логин или пароль");
        fileReader.close();
    }
}