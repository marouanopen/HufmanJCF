/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffman;

import java.util.Comparator;

/**
 *
 * @author Sibe
 */

public  class Huffcomp implements Comparator<HuffKnoop>
{
    public int compare(HuffKnoop knoop1, HuffKnoop knoop2)
    {
        return knoop1.ferquentie - knoop2.ferquentie;
    }
}
