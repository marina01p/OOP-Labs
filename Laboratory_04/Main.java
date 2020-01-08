package Laboratory_04;

import java.io.File;
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) throws Exception
            {
                File file = new File("C:\\Users\\Asus\\IdeaProjects\\OOP Labs\\src\\Laboratory_04\\one_expression.txt");
                Scanner sc = new Scanner(file);
                System.out.println("File Expression:");
                while (sc.hasNextLine()) {
                    String input = sc.nextLine();
                    String inputWithoutSpaces = input.replaceAll("\\s+","");
                    System.out.println(input);

                    if (ParenthesisValidation.checkParenthesis((inputWithoutSpaces))) {
                        System.out.println("Expression is: TRUE!");
                    }

                    else {
                        System.out.println("Expression is: FALSE!");
                    }
                }
                sc.close();
            }
        }