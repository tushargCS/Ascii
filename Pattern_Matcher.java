
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Pattern_Matcher {

    public static  void main(String[] args) {
        int ctr=0;
        String obj= "you the the Str great boy Str";
          Pattern p= Pattern.compile("Str");
           Matcher m= p.matcher(obj);
           while(m.find()){
               ctr++;
               System.out.println(m.start()+"......"+m.end());

           }
        System.out.println(ctr);
    }
}
