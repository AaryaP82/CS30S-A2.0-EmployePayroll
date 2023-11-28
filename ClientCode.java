import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Aarya
 *  Class:          CS30S
 * 
 *  Assignment:     Ax Qy
 * 
 *  Description:    Place a short description of your program here
 * 
 *************************************************************/

public class ClientCode {
    // a new line character that works on every computer system
    final static String nl = System.lineSeparator();
    final static String delim = "[ ]+";          // delimiter for splitting input records

    public static void main(String[] args) throws IOException{
        // ***** constants *******

        // ***** variables *****
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input

        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output

        String[] tokens = null;         // used to split input records

        // a new line character that works on every computer system

        // ***** objects *****
        ProgramInfo pInfo = new ProgramInfo("A2.0 EmployePayroll");
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();

        // file io buffers for reading and writing to text files

        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));

        // ***** print banners *****

        System.out.println(pInfo.getBanner());
        //fout.print(banner);

        // ***** Main Processing *****
        //create employe objects
        EmployeClass employe1 = new EmployeClass(15.00, 34);
        EmployeClass employe2 = new EmployeClass(14.00, 42);
        EmployeClass employe3 = new EmployeClass(14.00, 50);
        
        //using getters and setters
        //employe 1
        //hours
        System.out.println(employe1.getHours());
        int employe1hours = employe1.getHours();
        //wage
        System.out.println(employe1.getWage());
        double employe1wage = employe1.getWage();
        
        //employe 2 
        System.out.println(employe2.getHours());
        int employe2hours = employe2.getHours();
        //wage
        System.out.println(employe2.getWage());
        double employe2wage = employe2.getWage();
        
        //employe 3
        System.out.println(employe2.getHours());
        int employe3hours = employe2.getHours();
        //wage
        System.out.println(employe3.getWage());
        double employe3wage = employe3.getWage();
        
        // ***** test utility methods *****
        //get regPay
        System.out.println(employe1.regPay());
        System.out.println(employe2.regPay());
        System.out.println(employe3.regPay());
        
        //get otPay
        System.out.println(employe1.ovPay());
        System.out.println(employe2.ovPay());
        System.out.println(employe3.ovPay());
        
        //get grossPay
        System.out.println(employe1.grossPay());
        System.out.println(employe2.grossPay());
        System.out.println(employe3.grossPay());
        
        
        // use String()
        System.out.println(employe1.toString());
        System.out.println();
        
        System.out.println(employe2.toString());
        System.out.println();
        
        System.out.println(employe3.toString());
        System.out.println();
        
        

        // ***** Closing Message *****

        System.out.println();
        System.out.println(pInfo.getclosingMessage());
        //fout.println("End of Processing");

        // **** close io buffers *****

        //fin.close();
        //fout.close();
    } // end main 

} // end FormatTemplate
