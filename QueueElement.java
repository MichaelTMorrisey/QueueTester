/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuetester;

/**
 *
 * @author Michael.T.Morrisey
 */
public class QueueElement {
    
    //data
    PersonInLine person;
    //a pointer to the next node in the queue
    QueueElement next;
    
    //null constructor QueueElement()
    QueueElement()
    {
        
    }//end null constructor QueueElement()
    
    //initializing constructor QueueElement()
    QueueElement(PersonInLine myPerson)
    {
        person = myPerson;
        next = null;
    }//end initializing constructor QueueElement()
    
    //getIdentifier()
    public PersonInLine getPerson()
    {
        return person;
    }//end getIdentifier()
    
    //setIdentifier()
    public void setPerson(PersonInLine myPerson)
    {
        person = myPerson;
    }//end setIdentifier
    
    //getNext()
    public QueueElement getNext()
    {
        return next;
    }//end getNext()
    
    //setNext()
    public void setNext(QueueElement myNext)
    {
        next = myNext;
    }//end setNext()
    
    //toString
    @Override
    public String toString()
    {
        //a String to return
        String result;
        result = person.toString();
        return result;
    }//end toString()
    
}//end class QueueElement
