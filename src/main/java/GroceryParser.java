import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroceryParser {

    //Here I should separate the words using the punctuation marks provided.
    private List<String> groceryList = new ArrayList<>();

    public static boolean hasPunctuation(String input){
        Pattern pattern = Pattern.compile("(:@)|(:!)|(:%)|(:;)(:\\*)");
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    public static List<String> kvString(String stringFound, String rawData){
        return new ArrayList<>(Arrays.asList(rawData.split(stringFound)));
    }

    public static List<String> findKVInRawData(String rawData){
        String stringFound = "[;^%*@!]";
        return kvString(stringFound,rawData);
    }
}
