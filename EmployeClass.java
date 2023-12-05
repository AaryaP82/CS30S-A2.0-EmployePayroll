import java.text.NumberFormat;
/********************************************************************
 * Programmer:    Aarya
 * Class:  CS30S
 *
 * Assignment: Assignment 2.0
 *
 * Description: Employe Payroll
 ***********************************************************************/

// import libraries as needed here

public class EmployeClass {
    //*** Class Variables ***
    
    //currency format
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    // a new line character that works on every computer system
    final static String nl = System.lineSeparator();
    
    private static int nextID = 1000;
    
    private static double OVERTIMEPAY = 1.5;
    
    private static int MAXHOURS = 40;
    
    //private static int maxHours = 
    
    //private static double ovetimeRate = 
    
    //*** Instance Variables ***
    
    private int hours;
    
    private double wage;
    
    private int id;
    
    //*** Constructors ***
    
    public EmployeClass(){
        this.hours = 0;
        this.wage = 0.0;
        id = getNextID();
    }
    
    public EmployeClass(double wage, int hours){
        this.wage = wage;
        this.hours = hours;
        id = getNextID();
    }
    
    private int getNextID(){
        return nextID++;
    }//end get unique ID
    
    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
    
    
    //*** Getters ***
    
    public int getID(){
        return this.id;
    }//end get id
    
    /*****************************************
    * Description: returns the wage
    * 
    * Interface:
    * @return      wage double
    * ****************************************/
    
    public double getWage(){
        return wage;
    }//end get wage
    
    /*****************************************
    * Description: returns the hours
    * 
    * Interface:
    * @return      hours int
    * ****************************************/
    
    public int getHours(){
        return hours;
    }//end get hours
    
    //*** Setters ***
    /*****************************************
    * Description: set the wage to a new value
    * 
    * Interface:
    * 
    * @param        double = wage
    * ****************************************/
    public void setwage(double w){
        this.wage = w;
    }//end set hourly wage
    
    /*****************************************
    * Description: set the hours to a new value
    * 
    * Interface:
    * 
    * @param        int = hours
    * ****************************************/
    public void sethours(int h){
        this.hours = h;
    }//end set hourly wage
    
    // ***** utility methods *****
    
    //get regPay
    /*****************************************
    * Description: returns the regPay
    * 
    * Interface:
    * @return       regPay : double
    * ****************************************/
    public double regPay(){
        if(this.hours > MAXHOURS){
            return (this.hours * this.wage) - (this.wage * OVERTIMEPAY * (this.hours - MAXHOURS));
        }//end if over max hours
        else{
            return this.hours * this.wage;
        }//end if under max hours
    }//end regPay
    
    //get otPay
    /*****************************************
    * Description: returns the ovPay
    * Interface:
    * @return       ovPay : double
    * ****************************************/
    public double ovPay(){
        if(this.hours > MAXHOURS){
            return this.wage * OVERTIMEPAY * (this.hours - MAXHOURS);
        }//end if overtime
        else{
            return 0;
        }//end no overtime
    }//end ovPay
    
    //get grossPay
    /*****************************************
    * Description: returns the grossPay
    * 
    * Interface:
    * @return       grossPay : double
    * ****************************************/
    public double grossPay(){
        return this.regPay() + this.ovPay();
    }//end grossPay
    
    // *** Override methods ***
    boolean equals(EmployeClass other){
        boolean equal;
        equal = this.grossPay() == other.grossPay();
        return equal;
    }//end equals
    
    @Override
    public String toString(){
        String st;
        
        st = "Employe ID: " + this.getID() + nl;
        st += "Wage: " + currency.format(this.getWage()) + nl;
        st += "Hours Worked: " + this.getHours() + nl;
        st += "Regular Pay: " + currency.format(this.regPay()) + nl;
        st += "Overtime Pay: " + currency.format(this.ovPay()) + nl;
        st += "Gross Pay: " + currency.format(this.grossPay()) + nl;
        
        return st;
    }//end to string
    
    
} // end of public class
