/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffman;

import java.util.Comparator;


/**
 *
 * @author marouano
 */
public class HuffKnoop  {
    public char karakter;
    public int ferquentie;
    public HuffKnoop leftChild, rightChild;
    
    public HuffKnoop(char karakter, int freq, HuffKnoop left, HuffKnoop right)
    {
        this.karakter = karakter;
        this.ferquentie = freq;
        this.leftChild = left;
        this.rightChild = right;
        
    }   
    
}


