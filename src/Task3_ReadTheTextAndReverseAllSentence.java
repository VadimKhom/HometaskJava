import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task3_ReadTheTextAndReverseAllSentence {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("D://reverse.txt"))) {

            StringBuilder stringBuilder = new StringBuilder();
            String s;

            while ((s=bufferedReader.readLine()) != null){
                System.out.println(s);
                stringBuilder.append(s);
                stringBuilder.reverse();
            }

            System.out.println(stringBuilder.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
