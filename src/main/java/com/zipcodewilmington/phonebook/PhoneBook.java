package com.zipcodewilmington.phonebook;

import java.util.*;
import java.util.Map.Entry;

//import static org.graalvm.compiler.nodeinfo.InputType.Value;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {

    List<String> phoneNumbers = new ArrayList<String>();
    TreeMap<String, List<String>> map = new TreeMap<String, List<String>>();

    private String name;
    private List<String> phoneNumber;

    //adds an entry to the composite associate data type
    public void add(String name, List<String> phoneNumber) {
        map.put(name, phoneNumber);
    }
    //removes an entry to the composite associate data type
    public void remove(String name){

        map.remove(name);

    }

    //returns a phone number for the respective input name

    public String lookup(String name){
        List<String> returnPhoneNumbers;

        if(map.containsKey(name)) {
            //phoneNumbers.add(getPhoneNumber());
            returnPhoneNumbers = map.get(name);
        } else {
            returnPhoneNumbers = new ArrayList<String>();
        }

    return returnPhoneNumbers.toString();
    }

    //returns a name for the respective input phoneNumber
    public String reverseLookup(String phoneNumber)
    {



        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if(entry.getValue().contains(phoneNumber)) {
                return entry.getKey();
            }
        }

        return null;
    }

    //print a human-readable list of all entries (names and phone numbers) in alphabetical order
    public String display(String name){
        for(Map.Entry<String, List<String>> entry:map.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
        return name;
    }


    public List<String> getPhoneNumber() {
        return phoneNumber;
    }


    public String getName() {

        return name;
    }



}
