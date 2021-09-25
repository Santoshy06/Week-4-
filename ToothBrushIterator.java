/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toothbrushiterator;

/**
 *
 * @author Welcome
 */
public class ToothBrushIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ToothBrushRepository tbr=new ToothBrushRepository();
        System.out.println("Iterator for displaying the Tooth Brush Types=>");
        for(Iterator i=tbr.getIterator();i.hasNext();)
        {
            String brush=(String)i.next();
            System.out.println("Brush Type: "+brush);
        }
    }
    
}
