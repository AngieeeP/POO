/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Angie Pineda 
 */

   public class Gato extends Animal {

    public Gato(String Pelo, String Boca, String Cola, String Ojo, Integer Pata) {
        super(Pelo, Boca, Cola, Ojo, Pata);
    }
    
    @Override
    public void Sonido (){
        System.out.println("El gato maulla.");
    }
    
}
