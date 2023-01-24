import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
String name;
String address;
    public Person(){

    }

    public void runProgram(){
        List<Staff> staff = new ArrayList<>(2);
        List<Student> student = new ArrayList<>(5);

        Scanner scan = new Scanner(System.in);
        System.out.println("How many Staff?");

        while(true){
            int input = integerInput(0, Integer.MAX_VALUE);
            System.out.println("School?");
            String school = scan.next();

            System.out.println("Pay?");
            double pay = scan.nextDouble();

            for(int i = 0; i < input;i++){
                staff.set(i, new Staff(school, pay));
            }
            break;
        }

        while(true){
            System.out.println("How many Students?");
            int input = integerInput(0, Integer.MAX_VALUE);
            System.out.println("Program?");
            String program = scan.next();

            System.out.println("Year?");
            int year = scan.nextInt();

            System.out.println("Fee?");
            double fee = scan.nextDouble();

            for(int i = 0; i < input;i++){
                student.set(i, new Student(program, year, fee));
            }
        }
    }

    public Person(String name, String address){
        name = this.name;
        address = this.name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }

    public class Staff extends Person {
        String school;
        double pay;

        public Staff(String school, double pay){
            school = this.school;
            pay = this.pay;
        }

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        public double getPay() {
            return pay;
        }

        public void setPay(double pay) {
            this.pay = pay;
        }

        @Override
        public String toString() {
            return "Staff{" +
                    "school='" + school + '\'' +
                    ", pay=" + pay +
                    '}';
        }
    }
    public class Student extends Person{
        String program;
        int year;
        double fee;

        public String getProgram() {
            return program;
        }

        public void setProgram(String program) {
            this.program = program;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public double getFee() {
            return fee;
        }

        public void setFee(double fee) {
            this.fee = fee;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "program='" + program + '\'' +
                    ", year=" + year +
                    ", fee=" + fee +
                    '}';
        }

        public Student(String program, int year , double fee){
            program = this.program;
            year = this.year;
            fee = this.fee;
        }
    }

    public static int integerInput(int lowerLimit, int upperLimit ){ //Limits the answer range
        Scanner scanner = new Scanner(System.in);
        int input;
        while (true) {
            try {
                System.out.println("Pick between presented alternatives, " + lowerLimit + " - " + upperLimit + "\n");
                input = scanner.nextInt();
                if(input < lowerLimit || input > upperLimit){
                    System.out.println("Please enter an integer between " + lowerLimit + " - " + upperLimit + "\n");
                }
                else{
                    break;
                }
            }
            catch (Exception e) {
                System.out.println("Error!");
            }
        }
        return input;
    }

}
