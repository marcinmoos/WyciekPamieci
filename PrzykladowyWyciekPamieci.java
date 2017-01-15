package przykladowywyciekpamieci;

import java.util.HashMap;
import java.util.Map;

public class PrzykladowyWyciekPamieci extends HashMap<PrzykladowyWyciekPamieci, String>{

    public final String key;

    public PrzykladowyWyciekPamieci(String key) {
        this.key = key;
        
    }

    public static void main(String[] args) {
        try{
            Map map = System.getProperties();

            for(;;){
                map.put(new PrzykladowyWyciekPamieci("key"), "value");
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }

    }




    
}
