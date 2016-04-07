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
        
        String str = "aabbccddef";
        List<HuffKnoop> HuffArray = new ArrayList<>();
        char[] karakters = str.toCharArray(); 
        HashMap<Character, Integer> freq = new HashMap<>();
        freq = ferquentie(karakters);
        
        for (char a : freq.keySet())
        {
            HuffKnoop huff = new HuffKnoop(a,freq.get(a));
            HuffArray.add(huff);
        }
        PriorityQueue<HuffKnoop> sortedQueue = sorteren(HuffArray);
        HashMap<Character, String>  charCode = new HashMap<>();
        HuffKnoop root = bouwBoom(sortedQueue);
        charCode = getCharCode(root, charCode, "");
        System.out.println(decompress(root, compress(str, charCode)));
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
    
    /**
     * Zet de boom in elkaar door het assignen van de juiste left en right child
     * @param sq
     * @return 
     */
    public static HuffKnoop bouwBoom(PriorityQueue<HuffKnoop> sq)
    {
        while(sq.size() > 1)
        {
            HuffKnoop right = sq.poll();
            HuffKnoop left = sq.poll();
            HuffKnoop ParentHuff = new HuffKnoop( left, right);
            //System.out.println("Made Knoop LeftChild: " + ParentHuff.leftChild.karakter + ParentHuff.leftChild.ferquentie + " Rightchild: " + ParentHuff.rightChild.karakter + ParentHuff.rightChild.ferquentie);
            sq.add(ParentHuff);
        }
        return sq.poll();
    }
    
    /**
     * read the tree
     * @param root
     * @param charCode
     * @param path
     * @return 
     */
    public static HashMap getCharCode(HuffKnoop root, HashMap<Character, String> charCode, String path)
    {
        // Go left
        if (root.leftChild != null && root.rightChild != null)
        {
           charCode.putAll(getCharCode(root.leftChild, charCode, path + "0"));
           
           charCode.putAll(getCharCode(root.rightChild, charCode, path + "1"));
        }
        else 
        {
            System.out.println(root.karakter + " : " + path);
            charCode.put(root.karakter, path);
        }
        return charCode;
    }
    
    public static String compress(String toCompress, HashMap<Character, String> key)
    {
        String finalmsg = "";
        for (char ch : toCompress.toCharArray())
        {
            finalmsg += key.get(ch);
        }
        System.out.println(finalmsg);
        return finalmsg;
    }
    
    public static String decompress(HuffKnoop root, String msg)
    {
        String finalMsg = "";
        HuffKnoop realRoot = root;
        
        for (char charazard : msg.toCharArray())
        {
                if (charazard == '0')
                {
                    //System.out.println("ga naar links");
                    
                    root = root.leftChild;

                }
                else if (charazard == '1')
                {
                    //System.out.println("ga naar rechts");
                    
                    root = root.rightChild;
                }
            
            if (root.leftChild == null && root.rightChild == null)
            {
                //System.out.println("is blaadje: " + root.karakter);
                finalMsg += root.karakter;
                root = realRoot;
            }            
        }
        
        return finalMsg;
    }
}
