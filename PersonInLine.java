/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuetester;

//import statement to use the date & time
import java.time.LocalDateTime;
/**
 *
 * @author Michael.T.Morrisey
 */
public class PersonInLine {
    
    //a key field
    String identifier;
    String name;
    
    //null constructor
    PersonInLine()
    {}//end null constructor
    
    //initializing constructor
    PersonInLine(String myName)
    {
        name = myName;
        //make "identifier" a key property by initializing it to 
        //equal the current date and time
        identifier = LocalDateTime.now();
    }//end initializing constructor
    
    public void setName(String myName)
    {
        name = myName;
    }//end setName()
    
    public String getName()
    {
        return name;
    }//end getName()
    
    public String getIdentifier()
    {
        return identifier;
    }//end getIdentifier()
    
    //toString() returns a String which contains the PersonInLine's name property
    @Override
    public String toString()
    {
        //a String to return
        String result;
        result = "Name = " + name;
        return result;
    }//end toString()
    
}//end class PersonInLine
