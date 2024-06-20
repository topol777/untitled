import java.util.Scanner;

public class Main {
    static String inputText;
    public static void main(String[] args)
    {

        System.out.println(textModifier());
    }
    public static String textModifier() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        inputText = input.next();
        input.close();

        String first = inputText.trim().replaceAll(" +", " ");
        StringBuilder second = new StringBuilder();
        String third = "";
        int count = 0;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) == '-') {
                // swap = swap.substring(0, i) + swap.substring(i + 1);
                String afterSwap;

                char rightChar = first.charAt(i + 1);
                String leftPart = first.substring(0, i - 1);
                String rightPart = first.substring(i + 1);
                afterSwap = leftPart + rightChar + rightPart;
                second.append(afterSwap);
            }
        }

//////////////////////////////////////////////////////////////
        second = new StringBuilder(second.toString().replace("+", "!"));

/////////////////////////////////////////////////////////////////
        for (int i = 0; i < second.length(); i++) {
            if ((int) second.charAt(i) == 9) {
                i++;
                count ++;
            }
            else if ((int) second.charAt(i) == 0){
                i++;
                count++;
            }

        }
        third = third.replaceAll("[09]","");
        third = third + " " + count;
////////////////////////////////////////////////////////////////
        return third;
    }
}