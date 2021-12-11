//Q2 Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. The following are the details.
//        Name of the class - Patient
//        Member Variables - patientName(String),height(double),width(double)
//        Member Function - double computeBMI()
//        The above method should compute the BMI and return the result. The formula for computation of BMI  is weight (in kg) ÷ height*height(in metres).
//        Create an object of the Patient class and check the results.


import com.sun.source.tree.PackageTree;

import java.util.Scanner;

public class Patient {
    String Name;
    double height;
    double weight;

    public Patient(String name) {
        Name = name;
    }

    public double BMI(){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the height in metres");
        height=sc.nextDouble();
        System.out.println("enter the weight in kg");
        weight= sc.nextDouble();
        //BMI  is weight (in kg) ÷ height*height(in metres).
        double BMI;
        BMI= weight+(height*height);
        return BMI;
    }

    public static void main(String[] args) {

        Patient obj = new Patient("tushar");
        System.out.println("the BMI IS:"+ obj.BMI());
    }
}
