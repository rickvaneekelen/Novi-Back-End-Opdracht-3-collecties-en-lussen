import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Hier mag je je code schrijven voor de hoofd-opdracht
        int[] numeriek       = {1,2,3,4,5,6,7,8,9,10};
        String[] alfabetisch = {"een","twee","drie","vier","vijf","zes","zeven","acht","negen","tien"};
        Translator translator = new Translator(numeriek, alfabetisch);
        Scanner scanner = new Scanner(System.in);
        boolean play = true;
        String input;
        String ongeldig = "ongeldige input";


        while (play == true){
            String defaultText = "Type 'x' om te stoppen \nType 'v' om te vertalen";
            System.out.println(defaultText);
            input = scanner.nextLine();
            switch (input){
                case "x":
                    play = false;
                    break;
                case "v":
                    System.out.println("Type een cijfer in van 0 t/m 9");
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    if (number <= 10){
                        String result = translator.translate(number);
                        System.out.println("De vertaling van " + number + " is " + result);
                    }else{
                        System.out.println("ongeldig");
                    }
                    break;
                default:
                    System.out.println(ongeldig);
            }
        }
    }
}
