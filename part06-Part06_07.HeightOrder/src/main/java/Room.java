/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Ste-PC
 */
public class Room {
    private ArrayList<Person> roomMembers;
    
    public Room(){
        this.roomMembers = new ArrayList<Person>();
    }
    
    public void add(Person person){
        roomMembers.add(person);
    }
    
    public boolean isEmpty(){
        return roomMembers.isEmpty() ? true : false;
    }
    
    public ArrayList<Person> getPersons(){
        return roomMembers;
    }
    
    public Person shortest(){
        if(roomMembers.isEmpty()){
            return null;
        }
        Person returnPerson = roomMembers.get(0);
        
        for(Person person : roomMembers){
            if(person.getHeight() < returnPerson.getHeight()){
                returnPerson = person;
            }
        }
        return returnPerson;
    }
    
    public Person take(){
        if(roomMembers.isEmpty()){
            return null;
        } 
        Person returnPerson = roomMembers.get(0);
        int removeIndex = 0;
        for(int i = 0; i < roomMembers.size(); i++){
            if(roomMembers.get(i).getHeight() < returnPerson.getHeight()){
                returnPerson = roomMembers.get(i);
                removeIndex = i;
            }
        }
        // create new person and assign the first person from the list
        // loop over the people and look for shorter and reassign them
        //remove the shortest from the list
        roomMembers.remove(removeIndex);
        return returnPerson;
    }
        
}
