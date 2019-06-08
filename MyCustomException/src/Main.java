import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    static void decideToThrowGrade( double _grade) throws GradeException
    // this function will decide when to throw our custom exception
    {
        if(_grade >= 0 && _grade <= 100) //check if the grade is valid if so we print that it is valid
            {
                System.out.println("VALID GRADE"); // if the grade is valid then we print this
            }
        else
            {
                throw new GradeException(_grade); // if the grade is not valid then we throw our exception
            }
    }

    static void changeGrade()
    {
        Scanner in = new Scanner(System.in); // call a scanner so that we will be able to get input
        double userGrade = 0;
        System.out.print("please enter you're grade: ");
        try// we try to get a double from the user but we might get a letter so we try it first
        {
            userGrade = in.nextDouble();//if the user enters a double we continue else we catch it with InputMismatchException
            try
            {
                decideToThrowGrade(userGrade); //check if the grade is valid if not, we throw our exception
            }
            catch (GradeException g) // here we throw the exception
            {
                System.out.println(g);//we print the exception which is actually the toString of GradeException
            }
        }
        catch (InputMismatchException e)// we use an exception that exists in java
        {
           // we print this if the user enters anything that is not a double
            System.out.println("that is not a double/number, try again");
        }
        in.close(); // close the scanner
    }





    public static void main(String[] args)
    {
        changeGrade(); // and finally we call the function into the main method
    }
}
