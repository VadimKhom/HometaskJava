import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5_FindInTheTextAndOutputSortedPhoneNumbers {
    public static void main(String[] args) {
        String text = "Мой номер телефона +375(44)7739773, номер телефона Сергея +375(29)7345656";
        System.out.println(text);

        Pattern pattern = Pattern.compile("\\+[0-9]{3}\\([0-9]{2}\\)[0-9]{7}?");

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
