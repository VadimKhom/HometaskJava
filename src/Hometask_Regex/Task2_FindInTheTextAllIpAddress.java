package Hometask_Regex;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2_FindInTheTextAllIpAddress {

    public static void main(String[] args) {

        //создаем новый файл
        File newFileWithIpAddress=new File("D://IpAddress.txt");
        try{
            boolean create=newFileWithIpAddress.createNewFile();
            if (create){
                System.out.println("Ваш файл был успешно создан!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //записываем данные в файл
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D://IpAddress.txt"))) {

            String text = "Ip-адрес Васи 120.20.20.20, Ip-адрес Мутного Поцыка 120.10.10.10, просто текст ля ля ля тополя 120.25.25.25";
            bufferedWriter.write(text);

        } catch (IOException e) {
            e.printStackTrace();
        }

        //нахождение ip-адрессов и замена на "Засекречено"
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("D://IpAddress.txt"))) {
            Pattern pattern = Pattern.compile("(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[0-9]{2}|[0-9])" +
                    "(\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[0-9]{2}|[0-9])){3}");

            String s;
            String newStr = null;
            while ((s = bufferedReader.readLine()) != null){
                System.out.println(s);
                Matcher matcher = pattern.matcher(s);
                if (matcher.find()){
                    newStr = s.replaceAll(matcher.group(),"[засекречено]");
                }
            }
            System.out.println(newStr);
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
