import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4_ExtractFromTheTextAllPhrasesOfDirectSpeech {
    public static void main(String[] args) {
        String text = "Ты же в курсе, \"что там\" не так, \"как здесь\" или как тут!";
        System.out.println(text);

        Pattern pattern = Pattern.compile("\"(.*?)\"");

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}

