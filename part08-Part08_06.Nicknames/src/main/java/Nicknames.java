
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!

        HashMap<String, String> nickNameHashMap = new HashMap<>();

        nickNameHashMap.put("matthew", "matt");
        nickNameHashMap.put("michael", "mix");
        nickNameHashMap.put("arthur", "artie");

        System.out.println("matthew's nickname is " + nickNameHashMap.get("matthew"));
    }

}
