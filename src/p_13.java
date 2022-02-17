import java.util.HashMap;
import java.util.Map;

public class p_13 {

    public static void main(String [] args){
        System.out.println("Hello world!!");

    }

    public int romanToInt(String s) {
        int r = 0;
        Map<String,Integer> m = new HashMap<String,Integer>();
        m.put("I",1);
        m.put("V",5);
        m.put("X",10);
        m.put("L",50);
        m.put("C",100);
        m.put("D",500);
        m.put("M",1000);
        for(int i = s.length()-1 ; i > -1  ; i--){
            String g = s.charAt(i)+"";
            if(i!=0){
                if(g.equals("I") ||
                        g.equals("X") ||
                        g.equals("C")
                ){
                    r+=m.get(g);
                }else{
                    r+=(m.get(g)-m.get(s.charAt(i-1)+""));
                    i=i-1;
                }
            }else{
                r+=m.get(g);
            }
        }
        return r;
    }
}
