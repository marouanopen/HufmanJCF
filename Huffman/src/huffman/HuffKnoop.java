/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffman;


/**
 * @author Sibe
 * @author marouano
 */
public class HuffKnoop implements Comparable<HuffKnoop>{
    public char karakter;
    public int ferquentie;
    public HuffKnoop leftChild, rightChild;
    
    
    
    //'*', left.ferquentie + right.ferquentie,
    public HuffKnoop(HuffKnoop left, HuffKnoop right)
    {
        karakter = '*';
        ferquentie = left.ferquentie + right.ferquentie;
        leftChild = left;
        rightChild = right;
    }

    
    public HuffKnoop(char karakter, int freq)
    {
        this.karakter = karakter;
        this.ferquentie = freq;
        this.leftChild = null;
        this.rightChild = null;
        
    }   

    @Override
    public int compareTo(HuffKnoop other) {
        return Integer.compare(this.ferquentie, other.ferquentie);
    }
    
    
    
}


