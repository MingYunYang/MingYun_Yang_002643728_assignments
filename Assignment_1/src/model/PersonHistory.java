/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author libby
 */
public class PersonHistory {

    private ArrayList<Person> history;
    
    public PersonHistory(){
        history = new ArrayList<Person>();
    }
    
    public ArrayList<Person> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Person> history) {
        this.history = history;
    }
    
    public Person newPerson(){
        Person p = new Person();
        history.add(p);
        return p;
    }
    
    public void deletePerson(Person p){
        history.remove(p);
    }
    
    
    
    
}
