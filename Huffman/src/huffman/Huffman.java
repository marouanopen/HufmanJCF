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
        sorteren(HuffArray);
        
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
    
    public static List sorteren(List<HuffKnoop> HuffArray)
    {
        PriorityQueue<HuffKnoop> pq = new PriorityQueue<HuffKnoop>();       
        
        for(HuffKnoop i: HuffArray)
        {
            System.out.println(i.karakter + " : " + i.ferquentie);
            pq.add(i);
           
        }
        System.out.println(" pq: ");
        
        for (int i = 0; i < HuffArray.size(); i++)
        {
            HuffKnoop h = pq.poll();
            System.out.println(h.karakter + " : " + h.ferquentie );

        }

        
        return null;
    }
    
}
