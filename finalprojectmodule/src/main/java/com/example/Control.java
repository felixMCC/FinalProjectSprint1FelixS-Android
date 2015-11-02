package com.example;

/**
 * Created by Felix on 11/1/15.
 */
public class Control {
    //MVC objects for paradigm
    Model theModel = new Model();
    View theView = new View();

    //main program
    public void runProgram(){
        //make sure I can reference the Model and View
        theModel.identify();
        theView.identify();

        for(int cnt = 0; cnt < 10; cnt++){
            theView.printToUser("Random Number: " + theModel.randomNumber());
        }
    }
}
