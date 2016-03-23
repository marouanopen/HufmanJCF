/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffman;

import java.util.*;

/**
 * 
 * @author marouano
 */
public class Huffman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String str = "Lorem ipsum dolor shit mate";
        List<HuffKnoop> HuffArray = new ArrayList<>();
        char[] karakters = str.toLowerCase().toCharArray(); //args.toString().toCharArray();
 
        HashMap<Character, Integer> freq = new HashMap<>();
        freq = ferquentie(karakters);
        
        for (char a : freq.keySet())
        {
            HuffKnoop huff = new HuffKnoop(a,freq.get(a), null, null);
            HuffArray.add(huff);
        }
        PriorityQueue<HuffKnoop> sortedQueue = sorteren(HuffArray);
        bouwBoom(sortedQueue);
        
    }
    
    /**
     * Counts the ferquency of each character
     * @param chars array of characters
     * @return a hashmap with key the char and value the frequency
     */
    public static HashMap ferquentie (char[] chars)
    {
        HashMap<Character, Integer> hash = new HashMap<>();
        for (char ch : chars)
        {
            if (hash.containsKey(ch))
            {
                int waarde = hash.get(ch) + 1;
                hash.put(ch, waarde);
            }
            else
            {
                hash.put(ch, 1);
            }
        }
        return hash;
    }
    
    /**
     * Sorts list of huffknoops with priorityQueue
     * @param HuffArray
     * @return priorityQueue
     */
    public static PriorityQueue<HuffKnoop> sorteren(List<HuffKnoop> HuffArray)
    {
        PriorityQueue<HuffKnoop> pq = new PriorityQueue<HuffKnoop>();       
        
        for(HuffKnoop i: HuffArray)
        {
            pq.add(i);
        }
        
        return pq;
    }
    
    public static HuffKnoop bouwBoom(PriorityQueue<HuffKnoop> sq)
    {
        int i = sq.size();
        for (int c = 0; c < i; c++)
        {
            HuffKnoop leftHuff = sq.poll();
            System.out.println(leftHuff.karakter);
            HuffKnoop rightHuff = sq.poll();
            System.out.println(rightHuff.karakter);
            HuffKnoop ParentHuff = new HuffKnoop(' ', leftHuff.ferquentie + rightHuff.ferquentie, leftHuff, rightHuff);
            sq.add(ParentHuff);
        }
        HuffKnoop finalK = sq.poll();
        System.out.println(finalK.ferquentie + " " + finalK.leftChild.toString() + " " + finalK.rightChild.toString());
        return finalK;
    }
    
}
