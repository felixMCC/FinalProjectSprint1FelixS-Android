package com.example;
import java.util.*;

/**
 * Created by Felix on 11/1/15.
 */
public class Model {
    //create random number generator object
    Random generator = new Random(System.currentTimeMillis());
    int randomLimit = 12;           //range for random number from 0 to randomLimit

    //identify that this is the view class
    public void identify(){
        System.out.println("Im the Model!");
    }

    //generate a random number
    public int randomNumber(){
        //get random number from generator
        int randomNum = generator.nextInt(randomLimit);
        return randomNum;
    }
}
