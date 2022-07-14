import java.lang.Exception;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

class calculator {
    public static void main(String[] args) throws Exception{
        File fl = new File("input.txt");
        File fileWriter = new File("output.txt");
        PrintWriter pw = new PrintWriter(fileWriter);
        Scanner sc = new Scanner(fl);
        double first = 0, second = 0;
        String a = sc.nextLine(), znak;
        String b[] = a.split(" ");
        boolean proverka = true;
        try {
            first = Double.parseDouble(b[0]);
        } catch(NumberFormatException e){
            pw.println("Error! Not number");
            proverka = false;
        }

        if(proverka){
            try {
                second = Double.parseDouble(b[2]);
            } catch(NumberFormatException e){
                pw.println("Error! Not number");
                proverka = false;
            }
        }

        if(proverka){
            try {
                if(b[1].equals("+") || b[1].equals("-") || b[1].equals("/") || b[1].equals("*"));
                else throw new Exception("OperationError");
            } catch (Exception e){
                pw.println("Operation Error!");
                proverka = false;
            }

        }
        if(proverka){
            if(b[1].equals("+")) pw.println(first + second);
            if(b[1].equals("-")) pw.println(first - second);
            if(b[1].equals("*")) pw.println(first * second);
            if(b[1].equals("/")) {
                if(second == 0) pw.println("Error! Division by zero");
                else pw.println(first / second);
            }

        }
        pw.close();
    }
}
