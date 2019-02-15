package com.zipcodewilmington.phonebook;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;


/**
 * Created by leon on 1/23/18.
 */

public class PhoneBookTest {
    //TreeMap<String, ArrayList<String>> map = new TreeMap<String, ArrayList<String>>();
    TreeMap<String, List<String>> map = new TreeMap<String, List<String>>();

    List<String> phoneNumbers = new ArrayList<String>();
    List<String> phoneNumbers1 = new ArrayList<String>();

    /* String name;
    String phoneNumber;*/
    @Test
    public void testAdd() {
        //Given
        PhoneBook newPhoneBook = new PhoneBook();
        //When
        String name = "Swapna";
        String name1 = "Latha";
        phoneNumbers.add("403-222-3322");
        phoneNumbers1.add("703-222-3322");
        phoneNumbers.add("403-322-3322");
        phoneNumbers1.add("703-452-3322");

        newPhoneBook.add(name, phoneNumbers);
        newPhoneBook.add(name, phoneNumbers1);
        newPhoneBook.add(name1, phoneNumbers);
        newPhoneBook.add(name1, phoneNumbers1);

        int mapSize = newPhoneBook.map.size();

        //Then
        int expected = 2;
        System.out.println(mapSize);
        Assert.assertEquals(expected, mapSize);
    }


    @Test
    public void testRemoveContact() {
        //Given

        PhoneBook newPhoneBook = new PhoneBook();
        //When
        String name = "Swapna";
        String name1 = "Latha";
        phoneNumbers.add("403-222-3322");
        phoneNumbers1.add("703-222-3322");
        phoneNumbers.add("403-322-3322");
        phoneNumbers1.add("703-452-3322");

        newPhoneBook.add(name, phoneNumbers);
        newPhoneBook.add(name, phoneNumbers1);
        newPhoneBook.add(name1, phoneNumbers);
        newPhoneBook.add(name1, phoneNumbers1);

        newPhoneBook.remove(name);

        int mapSize = newPhoneBook.map.size();

        //Then
        Assert.assertEquals(1, mapSize);

    }

    @Test
    public void testLookUp() {
        PhoneBook newPhoneBook = new PhoneBook();
        String expected = "[403-222-3322]";

        //When
        String name = "Swapna";
        phoneNumbers.add("403-222-3322");
        newPhoneBook.add(name, phoneNumbers);

        //When

        String actual = newPhoneBook.lookup(name);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReverseLookUp() {
        PhoneBook newPhoneBook = new PhoneBook();
        String expected = "Swapna";

        //When
        String name = "Swapna";
        phoneNumbers.add("403-222-3322");
        phoneNumbers.add("403-222-3312");
        newPhoneBook.add(name, phoneNumbers);

        //When

        String actual = newPhoneBook.reverseLookup("403-222-3312");
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReverseLookUpNegative() {
        PhoneBook newPhoneBook = new PhoneBook();
        String expected = null;

        //When
        String name = "Swapna";
        phoneNumbers.add("403-222-3322");
        phoneNumbers.add("403-222-3312");
        newPhoneBook.add(name, phoneNumbers);

        //When

        String actual = newPhoneBook.reverseLookup("303-222-3312");
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDisplay() {
        //Given

        PhoneBook newPhoneBook = new PhoneBook();
        String expected = "Swapna 403-222-3322\n" +
                "Latha 403-322-3322\n";
        //When
        String name = "Swapna";
        String name1 = "Latha";
        phoneNumbers.add("403-222-3322");
        //phoneNumbers1.add("703-222-3322");
        phoneNumbers.add("403-322-3322");
        //phoneNumbers1.add("703-452-3322");

        newPhoneBook.add(name, phoneNumbers);
       // newPhoneBook.add(name, phoneNumbers1);
        newPhoneBook.add(name1, phoneNumbers);
        //newPhoneBook.add(name1, phoneNumbers1);


        String actual = (String) newPhoneBook.display(expected);
        Assert.assertEquals(expected, actual);

    }
}