import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        System.out.println(textModifier());
    }
    public static String textModifier() {
        String inputText;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        inputText = input.next();
        input.close();

        String first = inputText.trim().replaceAll(" +", " ");
        StringBuilder second = new StringBuilder();
        StringBuilder end = new StringBuilder();
        int count = 0;
        if (!first.contains("-")){
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) == '-') {
                // swap = swap.substring(0, i) + swap.substring(i + 1);


               // char rightChar = first.charAt(i + 1);
                String leftPart = first.substring(0, i - 1)+first.charAt(i+1);
                String rightPart = first.substring(i - 1,i)+first.substring(i + 2);
                String afterSwap = leftPart + rightPart;
                second.append(afterSwap);
            }


            }
        }
        else {
            second.append(first);
        }
//////////////////////////////////////////////////////////////

        String second2 = second.toString().replace("+", "!");

/////////////////////////////////////////////////////////////////
        for (int i = 0; i < second2.length(); i++) {
            if (second2.charAt(i) == 9) {
                i++;
                count ++;
            }
            else if (second2.charAt(i) == 0){
                i++;
                count++;
            }

        }

        String third = second2.replaceAll("[09]","");
        end.append(String.valueOf(third));
        end.append(" ");
        if (count>0)
        {end.append(count);}

        return String.valueOf(end);
    }
}
