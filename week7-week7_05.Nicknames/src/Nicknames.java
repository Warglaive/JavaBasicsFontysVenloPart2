
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations requested in the assignment here!
        HashMap<String, String> nameNickname = new HashMap<String, String>();
        nameNickname.put("matti", "mage");
        nameNickname.put("mikael", "mixu");
        nameNickname.put("arto", "arppa");
        String nm = nameNickname.get("mikael");
        System.out.println(nm);
    }

}
