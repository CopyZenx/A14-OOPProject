package com.musayilmaz.oopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        User myUser = new User();

        myUser.name = "Musa";
        myUser.job = "Engineer";

        User newUser = new User();
        newUser.name = "Kirk";
        newUser.job = "Musician";

        */

        User myUser = new User("Musa","Engineer");
        System.out.println(myUser.information());

        //Encapsulation

        Musician james = new Musician("James", "Guitar", 50);
        System.out.println(james.getName());
        james.setAge(60,"Musa");
        System.out.println(james.getAge());

        //Inheritance

        SuperMusician lars = new SuperMusician("Lars", "Drums", 55);
        System.out.println(lars.sing());
        System.out.println(lars.getAge());

        //Polymorphism

        //Static Polymorhism

        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(5,3));
        System.out.println(mathematics.sum(3,5,7));

        //Dynamic Polymorhism

        Animal myAnimal = new Animal();
        myAnimal.sing();

        Dog max = new Dog();
        max.test();
        max.sign();


        //Abstract & Interface

        Piano myPiano = new  Piano();
        myPiano.brand="Yamaha";
        myPiano.digital=true;
        myPiano.info();




    }
}