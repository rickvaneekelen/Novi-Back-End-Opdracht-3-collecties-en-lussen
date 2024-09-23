import java.util.HashMap;
import java.util.Map;



public class Translator {

    Map<Integer,String> numericAlpha = new HashMap<>();
    int[] numerics;
    String[] alphabetics;
    boolean play = true;
    String ongeldig = "ongeldige invoer";

    Translator(int[] numeric, String[] alphabetic){
        this.numerics    = numeric;
        this.alphabetics = alphabetic;
        for(int i = 0; i < numeric.length; i++){
            numericAlpha.put(numerics[i], alphabetics[i]);
        }
    }
    void translatotor(){

    }
    public String translate(int number){
        return numericAlpha.get(number);
    }
}
