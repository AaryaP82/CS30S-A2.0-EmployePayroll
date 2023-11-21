/********************************************************************
 * Programmer:    Aarya
 * Class:  CS30S
 *
 * Assignment: Programinfo Class
 *
 * Description: OOP Intro Exercise ProgramInfo Class
 ***********************************************************************/

// import libraries as needed here

public class ProgramInfo {
    //*** Class Variables ***
    
    final static String nl = System.lineSeparator();
    
    //*** Instance Variables ***
    
    private String assignment = "";
    
    //*** Constructors ***
    //defult constructor
    public ProgramInfo(){
    }//end defult
    //initialized constructor
    public ProgramInfo(String name){
        assignment = name;
    }//end initialized
    
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
    /*****************************************
    * Description: return string
    * 
    * Interface:
    * @return       Banner String
    * ****************************************/
    
    public String getBanner(){
        String outputBanner = "";
        
        outputBanner = "*******************************************\n";
        outputBanner += "Name:		Aarya\n";
        outputBanner += "Class:		CS30S\n";
        outputBanner += "Assignment:	" + assignment;
        outputBanner += "    \n";
        outputBanner += "*******************************************\n";
        
        return outputBanner;
    }//end get 
    
    /*****************************************
    * Description: return string for closing message and create string for closing message
    * 
    * Interface:
    * @return       closingMessage String
    * ****************************************/
    
    public String getclosingMessage(){
        return "end of proccesing";
    }
    
    //*** Setters ***
    
} // end of public class
