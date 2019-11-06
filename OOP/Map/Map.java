import java.util.HashMap;
import java.util.Set;

public class Map{

     public static void main(String []args){

HashMap<String, String> trackList = new HashMap<String, String>();
trackList.put("Sway","Frank");
trackList.put("Dear life","delta goodrem");
trackList.put("Dorian","Agnes Obel");
trackList.put("Video games","Lana del rey");

String song = trackList.get("Sway");
System.out.println(song);

//get all songs
Set<String> keyes = trackList.keySet();
for (String key:keyes){
    System.out.println(key);
}

     }
}
