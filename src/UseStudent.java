public class UseStudent {

    public static void main(String[] args) {
        Student s = null;
        printStudent(s); // is going to print the exception message for nullPointer

        //creating an array of students objects and storing two student objects inside
        Student[] students = new Student[2];
        Student s1 = new Student("Student1", 20);
        Student s2 = new Student("Student2", 21);
        students[0] = s1;
        students[1] = s2;
        listStudents(students); //is going to print the two students created and then
        // after the second one is printed is going to print the exception message because an index out of bound

        thisIsRisky(); //is going to print the exception message -> / by zero
    }

    private static void printStudent(Student student) {
        try { //implementing a try-catch block to handle exceptions for this part of the code
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
        }
        //declaring the parameter as NullPointerException because it is going to be checking if the string is null
        catch (NullPointerException e) {
            //handling the exception with a message
            System.out.println(e.getMessage());
        }
    }

    private static void listStudents(Student[] students) {
        try { //try-catch block to handle exceptions
            for (int i = 0; i <= students.length; i++) {
                System.out.println(students[i].getName() + " " + students[i].getAge());
            }
        } catch (ArrayIndexOutOfBoundsException e) { //handling exception if the index is out of bound
            System.out.println(e.getMessage());
        } catch (NullPointerException e) { //handling nullPointer exception if the name or age are null
            //handling the exception with a message
            System.out.println(e.getMessage());
        }
    }

    private static void thisIsRisky() {
        try { //try-catch block to check for arithmetic exceptions
            int priceTag = 50;
            int discount = 0;
            System.out.println("Total = " + (priceTag / discount));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
