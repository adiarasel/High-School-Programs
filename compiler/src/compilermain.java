import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class compilermain {
    static ArrayList<intint> allints = new ArrayList<>();
    static ArrayList<strstr> allstrings = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        File codeFile = new File("/Users/aditi/Desktop/AP CompSci/Projects/compiler/src/compilercode.txt");
        Scanner scan = new Scanner(codeFile);
        int lineNum = 0;
        String[] notloops = {"coutcout", "intint", "strstr", "comcomint", "comcomstr", "++", "--",
                "**", "//", "%%", "inpinp"};
        while (scan.hasNextLine()) {
            String code = scan.nextLine();
            boolean notaloop = false;
            for (String temp : notloops) {
                if (code.contains(temp) && !code.contains("looploop")) {
                    notaloop = true;
                }
            }
            if (code.contains("looploop")) {
                // Identify the number of times we will loop
                String subcode = code.substring(9);
                subcode = subcode.substring(0, subcode.indexOf(")"));
                int numofloops = Integer.parseInt(subcode);

                // Identify actions
                String actions = code.substring(code.indexOf("[") + 2, code.indexOf("]"));

                // Loop for the specified number of iterations
                for (int i = 0; i < numofloops; i++) {
                    // Split the actions by semicolons to get individual commands
                    String[] actionList = actions.split(";");

                    // Execute each command in the loop
                    for (String action : actionList) {
                        if (action.contains("++") ||
                                action.contains("--") ||
                                action.contains("//") ||
                                action.contains("**") ||
                                action.contains("%%")) {
                            operations(action);
                        }
                        if (action.contains("coutcout")) {
                            execute(action);
                        }
                        if (action.contains("intint")) {
                            execute(action);
                        }
                        if (action.contains("strstr")) {
                            execute(action);
                        }
                        if(!(action.contains("++") ||
                                action.contains("--") ||
                                action.contains("//") ||
                                action.contains("**") ||
                                action.contains("%%") ||
                                action.contains("coutcout") ||
                                action.contains("intint") ||
                                action.contains("strstr"))){
                            System.out.println("Invalid command: " + action);
                        }
                    }
                }
            }
            else if (code.contains("ifif")){
                int a = 0, b = 0;
                boolean intaExists = false, intbExists = false;
                String bool = code.substring(5, code.indexOf(")"));
                String command = code.substring(code.indexOf("[[") + 2, code.indexOf("]]"));
                if(bool.contains(">=")){
                    String num1 = bool.substring(0, bool.indexOf(" >="));
                    String num2 = bool.substring(bool.indexOf(">= ") + 3);
                    for (intint temp : allints) {
                        if (temp.getName().equals(num1)) {
                            intaExists = true;
                        } else if (temp.getName().equals(num2)) {
                            intbExists = true;
                        }
                    }
                    if (intaExists || intbExists) {
                        for (intint temp : allints) {
                            if (temp.getName().equals(num1)) {
                                a = temp.getValue();
                            } else if (temp.getName().equals(num2)) {
                                b = temp.getValue();
                            }
                        }
                    }
                    else {

                        //if num1 or num2 are stringed numbers
                        a = Integer.parseInt(num1);
                        b = Integer.parseInt(num2);
                    }
                    if(a >= b) execute(command);
                    else System.out.println("This statement is false.");
                }
                else if(bool.contains("<=")){
                    String num1 = bool.substring(0, bool.indexOf(" <="));
                    String num2 = bool.substring(bool.indexOf("<= ") + 3);
                    for (intint temp : allints) {
                        if (temp.getName().equals(num1)) {
                            intaExists = true;
                        } else if (temp.getName().equals(num2)) {
                            intbExists = true;
                        }
                    }
                    if (intaExists || intbExists) {
                        for (intint temp : allints) {
                            if (temp.getName().equals(num1)) {
                                a = temp.getValue();
                            } else if (temp.getName().equals(num2)) {
                                b = temp.getValue();
                            }
                        }
                    }
                    else {

                        //if num1 or num2 are Stringed numbers
                        a = Integer.parseInt(num1);
                        b = Integer.parseInt(num2);
                    }
                    if(a <= b) execute(command);
                    else System.out.println("This statement is false.");
                }
                else if(bool.contains("!=")){
                    String num1 = bool.substring(0, bool.indexOf("!="));
                    String num2 = bool.substring(bool.indexOf("!= ") + 3);
                    for (intint temp : allints) {
                        if (temp.getName().equals(num1)){
                            intaExists = true;
                        } else if (temp.getName().equals(num2)) {
                            intbExists = true;
                        }
                    }
                    if (intaExists || intbExists) {
                        for (intint temp : allints) {
                            if (temp.getName().equals(num1)) {
                                a = temp.getValue();
                            } else if (temp.getName().equals(num2)) {
                                b = temp.getValue();
                            }
                        }
                    }
                    else {

                        //if num1 or num2 are stringed numbers
                        a = Integer.parseInt(num1);
                        b = Integer.parseInt(num2);
                    }
                    if(a != b) execute(command);
                    else System.out.println("This statement is false.");
                }
                else if(bool.contains(">")){
                    String num1 = bool.substring(0, bool.indexOf(" >"));
                    String num2 = bool.substring(bool.indexOf("> ") + 2);
                    for (intint temp : allints) {
                        if (temp.getName().equals(num1)) {
                            intaExists = true;
                        } else if (temp.getName().equals(num2)) {
                            intbExists = true;
                        }
                    }
                    if (intaExists || intbExists) {
                        for (intint temp : allints) {
                            if (temp.getName().equals(num1)) {
                                a = temp.getValue();
                            } else if (temp.getName().equals(num2)) {
                                b = temp.getValue();
                            }
                        }
                    }
                    else {

                        //if num1 or num2 are stringed numbers
                        a = Integer.parseInt(num1);
                        b = Integer.parseInt(num2);
                    }
                    if(a > b) execute(command);
                    else System.out.println("This statement is false.");
                }
                else if(bool.contains("<")) {
                    String num1 = bool.substring(0, bool.indexOf(" <"));
                    String num2 = bool.substring(bool.indexOf("< ") + 2);
                    for (intint temp : allints) {
                        if (temp.getName().equals(num1)) {
                            intaExists = true;
                        } else if (temp.getName().equals(num2)) {
                            intbExists = true;
                        }
                    }
                    if (intaExists || intbExists) {
                        for (intint temp : allints) {
                            if (temp.getName().equals(num1)) {
                                a = temp.getValue();
                            } else if (temp.getName().equals(num2)) {
                                b = temp.getValue();
                            }
                        }
                    }
                    else {

                        //if num1 or num2 are stringed numbers
                        a = Integer.parseInt(num1);
                        b = Integer.parseInt(num2);
                    }
                    if(a < b) execute(command);
                    else System.out.println("This statement is false.");
                }
                else if(bool.contains("=")){
                    String num1 = bool.substring(0, bool.indexOf(" ="));
                    String num2 = bool.substring(bool.indexOf("= ") + 2);
                    for (intint temp : allints) {
                        if (temp.getName().equals(num1)){
                            intaExists = true;
                        } else if (temp.getName().equals(num2)) {
                            intbExists = true;
                        }
                    }
                    if (intaExists || intbExists) {
                        for (intint temp : allints) {
                            if (temp.getName().equals(num1)) {
                                a = temp.getValue();
                            } else if (temp.getName().equals(num2)) {
                                b = temp.getValue();
                            }
                        }
                    }
                    else {

                        //if num1 or num2 are stringed numbers
                        a = Integer.parseInt(num1);
                        b = Integer.parseInt(num2);
                    }
                    if(a == b) execute(command);
                    else System.out.println("This statement is false.");
                }
                else System.out.println("This is an invalid comparison; check again!");
            }
            else if (notaloop) {
                execute(code);
            }
        }
    }
    public static void execute(String code) {
        Scanner scanner = new Scanner(System.in);
        //ignoring comments
        if(code.contains("::"));
        else{
            //printing variables and strings
            if(code.contains("coutcout")) {
                //checks for variable otherwise prints the string
                if(code.contains("((")){ // this works
                    System.out.println(code.substring(code.indexOf("((") + 2, code.indexOf("))")));
                }
                // can only print one variable at a time!
                else{
                    String var = code.substring(9);
                    for(intint i : allints){
                        if(var.equals(i.getName())){
                            System.out.println(i.getValue());
                            break;
                        }
                    }
                    for(strstr s : allstrings){
                        if(var.equals(s.getName())){
                            System.out.println(s.getValue());
                            break;
                        }
                    }
                }
            }
            //gets user input based on a prompt, asks for both variable name and value assigned to variable
            else if(code.contains("inpinp")){
                System.out.println(code.substring(16));
                if(code.contains(("intint"))){
                    //input is an integer
                    System.out.println("enter the name of the integer please!");
                    String name = scanner.nextLine();
                    System.out.println("enter the value you wish to assign! (if this is not an integer, it will err!)");
                    intint input = new intint(scanner.nextInt(),name);
                    System.out.println(input);
                    allints.add(input);

                }
                else if(code.contains("strstr")){
                    //input must be a string
                    System.out.println("enter the name of the string please!");
                    String name = scanner.nextLine();
                    System.out.println("enter the string you wish to assign!");
                    strstr input = new strstr(name,scanner.nextLine());
                    System.out.println(input);
                    allstrings.add(input);
                }
                else throw new IllegalArgumentException("You need to look at your syntax very carefully; check again!");
            }
            //int & string input
            else if(code.contains("intint") || code.contains("strstr")){
                String codeseg = code.substring(code.indexOf("==") + 3);
                //int input
                if (code.contains("intint")) {
                    String name = code.substring(7);
                    name = name.substring(0, name.indexOf(" =="));
                    String value = codeseg;
                    int val = Integer.parseInt(value);
                    intint x = new intint(val, name);
                    allints.add(x);
                    System.out.println(x);
                }
                //string input
                else if (code.contains("strstr")) {
                    String name = code.substring(7);
                    name = name.substring(0, name.indexOf(" =="));
                    String text = codeseg;
                    text = text.substring(0, text.indexOf("\"\""));
                    strstr x = new strstr(name, text);
                    allstrings.add(x);
                    System.out.println(x);
                }
            }
            //OPERATIONS
            else if (code.contains("++") ||
                    code.contains("--") ||
                    code.contains("//") ||
                    code.contains("**") ||
                    code.contains(("%%"))) {
                operations(code);

            }
            else if (code.contains("comcomint")) {
                // <, >, =
                //identify the 1st and 2nd number
                String num1 = code.substring(10);
                num1 = num1.substring(0, num1.indexOf(" &&"));


                String num2 = code.substring(code.indexOf("&& ") + 4);


                int a = 0, b = 0, sum = 0;

                //if num1 or num2 belongs to ints
                boolean aExists = false, bExists = false;
                for (intint temp : allints) {
                    if (temp.getName().equals(num1)) {
                        aExists = true;
                    } else if (temp.getName().equals(num2)) {
                        bExists = true;
                    }
                }

                if (aExists || bExists) {
                    for (intint temp : allints) {
                        if (temp.getName().equals(num1)) {
                            a = temp.getValue();
                        } else if (temp.getName().equals(num2)) {
                            b = temp.getValue();
                        }
                    }
                } else {

                    //if num1 or num2 are Stringed numbers
                    if (Integer.parseInt(num1) >= 0 || Integer.parseInt(num1) <= 0) {
                        a = Integer.parseInt(num1);
                    }
                    if (Integer.parseInt(num2) >= 0 || Integer.parseInt(num2) <= 0) {
                        b = Integer.parseInt(num2);
                    }
                }
                if (a > b) {
                    System.out.println(a + " > " + b);
                } else if (a == b) {
                    System.out.println(a + " = " + b);
                } else {
                    System.out.println(a + " < " + b);
                }
            }
            else if (code.contains("comcomstr")) {
                String str1 = code.substring(10);
                str1 = str1.substring(0, str1.indexOf(" &&"));
                String str2 = code.substring(code.indexOf("&& ") + 3);

                //compare the strings lexicographically
                int result = str1.compareTo(str2);

                if (result > 0) {
                    System.out.println(str1 + " is greater than " + str2);
                } else if (result == 0) {
                    System.out.println(str1 + " is equal to " + str2);
                } else {
                    System.out.println(str1 + " is less than " + str2);
                }
            }
            else throw new IllegalArgumentException("I think you might've made a typo in your code, check again please!");
        }
    }

    public static void operations(String code) {
        int a = 0, b = 0, ans;
        boolean aExists = false, bExists = false;
        //OPERATIONS
        if (code.contains("++")) {
            //identify the 1st and 2nd number
            String num1 = code.substring(0, code.indexOf(" "));
            String num2 = code.substring(code.indexOf("++ ") + 3);

            //if num1 or num2 belongs to ints
            for (intint temp : allints) {
                if (temp.getName().equals(num1)) {
                    aExists = true;
                } else if (temp.getName().equals(num2)) {
                    bExists = true;
                }
            }

            if (aExists || bExists) {
                for (intint temp : allints) {
                    if (temp.getName().equals(num1)) {
                        a = temp.getValue();
                    } else if (temp.getName().equals(num2)) {
                        b = temp.getValue();
                    }
                }
            } else {

                //if num1 or num2 are Stringed numbers
                a = Integer.parseInt(num1);
                b = Integer.parseInt(num2);
            }
            ans = a + b;
            System.out.println(ans);
        }
        if (code.contains("**")) {
            //identify the 1st and 2nd number
            String num1 = code.substring(0, code.indexOf(" "));
            String num2 = code.substring(code.indexOf("** ") + 3);

            //if num1 or num2 belongs to ints
            for (intint temp : allints) {
                if (temp.getName().equals(num1)) {
                    aExists = true;
                } else if (temp.getName().equals(num2)) {
                    bExists = true;
                }
            }

            if (aExists || bExists) {
                for (intint temp : allints) {
                    if (temp.getName().equals(num1)) {
                        a = temp.getValue();
                    } else if (temp.getName().equals(num2)) {
                        b = temp.getValue();
                    }
                }
            } else {

                //if num1 or num2 are Stringed numbers
                 a = Integer.parseInt(num1);
                b = Integer.parseInt(num2);
            }
            ans = a * b;
            System.out.println(ans);

        }
        if (code.contains("--")) {
            //identify the 1st and 2nd number
            String num1 = code.substring(0, code.indexOf(" "));
            String num2 = code.substring(code.indexOf("-- ") + 3);

            //if num1 or num2 belongs to ints
            for (intint temp : allints) {
                if (temp.getName().equals(num1)) {
                    aExists = true;
                } else if (temp.getName().equals(num2)) {
                    bExists = true;
                }
            }

            if (aExists || bExists) {
                for (intint temp : allints) {
                    if (temp.getName().equals(num1)) {
                        a = temp.getValue();
                    } else if (temp.getName().equals(num2)) {
                        b = temp.getValue();
                    }
                }
            } else {

                //if num1 or num2 are Stringed numbers
                a = Integer.parseInt(num1);
                b = Integer.parseInt(num2);
            }
            ans = a - b;
            System.out.println(ans);
        }
        if (code.contains("//")) {
            //identify the 1st and 2nd number
            String num1 = code.substring(0, code.indexOf(" "));
            String num2 = code.substring(code.indexOf("// ") + 3);


            double newa = 0, newb = 0, newans = 0;

            //if num1 or num2 belongs to ints
            for (intint temp : allints) {
                if (temp.getName().equals(num1)) {
                    aExists = true;
                } else if (temp.getName().equals(num2)) {
                    bExists = true;
                }
            }

            if (aExists || bExists) {
                for (intint temp : allints) {
                    if (temp.getName().equals(num1)) {
                        newa = temp.getValue();
                    } else if (temp.getName().equals(num2)) {
                        newb = temp.getValue();
                    }
                }
            } else {

                //if num1 or num2 are Stringed numbers
                newa = Integer.parseInt(num1);
                newb = Integer.parseInt(num2);
            }
            newans = newa / newb;
            System.out.println(newans);
        }
        if (code.contains("%%")) {
            //identify the 1st and 2nd number
            String num1 = code.substring(0, code.indexOf(" "));
            String num2 = code.substring(code.indexOf("%% ") + 3);


            double newa = 0, newb = 0, newans = 0;

            //if num1 or num2 belongs to ints
            for (intint temp : allints) {
                if (temp.getName().equals(num1)) {
                    aExists = true;
                } else if (temp.getName().equals(num2)) {
                    bExists = true;
                }
            }

            if (aExists || bExists) {
                for (intint temp : allints) {
                    if (temp.getName().equals(num1)) {
                        newa = temp.getValue();
                    } else if (temp.getName().equals(num2)) {
                        newb = temp.getValue();
                    }
                }
            } else {
                //if num1 or num2 are Stringed numbers
                newa = Integer.parseInt(num1);
                newb = Integer.parseInt(num2);
            }
            newans = newa % newb;
            System.out.println(newans);
        }
    }
}