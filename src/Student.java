public class Student {

    private String fullName;
    private int grade;
    private boolean passing;

    public Student(String name, int grd, boolean pass) {
        fullName = name;
        grade = grd;
        passing = pass;
    }

    public void printInfo() {
        System.out.println("Name: " + fullName);
        System.out.println("Grade: " + grade);
        System.out.print("Are they passing?: " );
        if (passing = true) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
