/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toothbrushiterator;

public class ToothBrushRepository implements Container{
    public String BrushTypes[]={"Manual Brush","Electric Brush","Inter-dental Brush","Sulcabrush","End-tuff Brush","Chewable brush","Ecological Brush"};
    public Iterator getIterator()
    {
        return new BrushIterator();
    }
    public class BrushIterator implements Iterator {
   int brushIndex;
   public boolean hasNext()
   {
       if(brushIndex<BrushTypes.length)
           return true;
       return false;
   }
   public Object next()
   {
       if(this.hasNext())
       {
           return BrushTypes[brushIndex++];
       }
       return null;
   }
}
}
