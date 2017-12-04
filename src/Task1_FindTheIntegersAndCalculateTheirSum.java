import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1_FindTheIntegersAndCalculateTheirSum {

    public static void main(String[] args) {

        //создаем новый файл
        File newFileWithNumbers=new File("D://numbers.txt");
        try{
            boolean create=newFileWithNumbers.createNewFile();
            if (create){
                System.out.println("Ваш файл был создан успешно!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //записываем данные в файл
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D://numbers.txt"))) {
          String text="My name is Ivan. I have 13 dollars and 25 euro\n";
          bufferedWriter.write((text));
        } catch (IOException e) {
            e.printStackTrace();
        }

        /////нахождение суммы целых чисел
        try(BufferedReader reader = new BufferedReader(new FileReader("D://numbers.txt"))){
            Pattern pattern=Pattern.compile("[0-9]");
            String s;
            int sum=0;
            int mat=0;
            while ((s=reader.readLine())!=null){
                System.out.println(s);
                Matcher matcher= pattern.matcher(s);
                while (matcher.find()){
                    System.out.println(matcher.group());
                    sum+=Integer.parseInt(matcher.group());
                }
                System.out.println("Сумма целых чисел из вашего текста ="+sum);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
