public class GradeException extends Throwable{ // we will create an object that extends throwable

    // this object will be our exception

    private double userGrade; //the exception has 1 parameter - the grade


    public GradeException(double _userGrade) // the constructor of the exception
    {
        this.userGrade = _userGrade; // initiate the parameter
    }

    @Override
    public String toString(){
        return "INVALID GRADE[" + userGrade + ']'; // when we throw our exception and print it we will see this
    }

}
