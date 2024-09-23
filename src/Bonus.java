import java.util.*;

public class Bonus {

    public static void main(String[] args) {

        // Onderstaande code is uitgecommentarieerd. Haal de code uit de comment (delete /* en */) om aan de slag te gaan met de bonus
        // In de code staan op verschillende plekken comments tussen "/*...*/" als hint wat je moet doen


        Set<Integer> secretnumber = new HashSet<>();
//        secretnumber.add(1);
//        secretnumber.add(2);
//        secretnumber.add(3);
        secretnumber.addAll(randomnumbergenerator());

        for(Integer i : secretnumber){
            System.out.println(i);
        }



        System.out.println(secretnumber);

        String stringnumber = setToStringConverter(secretnumber);
       // System.out.println(stringnumber);
        feedback(stringnumber);

    }

    public static Set<Integer> randomnumbergenerator(){
         /*
        Vul hier de body van de methode in.


        Stappenplan:
        - Maak een nieuwe variabele van type Random. (Tip: Zoek op internet hoe je Random kunt gebruiken)
        - Maak een nieuwe variabele van type HashSet.
        - Schrijf een while-loop om 4 random nummers aan de hashset toe te voegen
        - return de hashset
         */
        Set<Integer> number = new HashSet<>();
        Random rand = new Random();
        while (number.size() < 4) {
            int result = rand.nextInt(4)+1;
            //System.out.println("result: " + result);
            number.add(result);
        }
        return number;
    }

    public static String setToStringConverter(Set<Integer> hs){

        //Vul hier de body van de methode in.
        String s = "";
        for(Integer i : hs){
            s += i;
        }
       // Stappenplan:
       // - Maak als eerst een String variabele met als waarde een lege String. (of gebruik een StringBuilder)
       // - Schrijf vervolgens een for-loop om de items in de hashset een voor een aan de String variabele toe te voegen.
       // - Return de (gevulde) String variabele

        return s;
    }



    public static void/*moet dit "void" zijn of wat anders?*/ feedback(String stringnumber) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder feedback = new StringBuilder();
        System.out.println("+ = juiste nummer op de juiste plek, O = juiste nummer verkeerde plek, X = verkeerde nummer");
        System.out.println("Doe een gok, Let op vul 4 getallen in.");
        String guess = scanner.nextLine();
        if (Objects.equals(guess, stringnumber)) {
            System.out.println("gefeliciteerd je hebt het goed");
        } else {
            for (int i = 0; i < 4; i++) {
                if (guess.substring(i, i + 1).equals(stringnumber.substring(i, i + 1))) {
                    feedback.append("+");
                } else if (stringnumber.contains(guess.substring(i, i + 1))) {
                    feedback.append("0");
                } else {
                    feedback.append("X");
                }
            }
        }
        System.out.println(feedback.toString());
    }
}
