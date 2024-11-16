/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Angie Pineda 
 */

import java.util.ArrayList;
import java.util.List;

public class Herencia {

    public static void main(String[] args) {
        Animal p = new Perro ("Negro", "Si", "Si", "Si", 4);
        p.Sonido();
        
        Animal g = new Gato ("Blanco", "Si", "Si", "Si", 4);
        g.Sonido();
        
        List <Animal> Lista = new ArrayList <Animal>();
        Lista.add (p);
        Lista.add (g);
        Lista.add(new Queqo ("No", "Si", "Si", "Si", 4));
        
        for (Animal item : Lista){
            item.Sonido();
        } 
    }
}