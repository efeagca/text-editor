/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.util.ArrayList;
import java.util.Iterator;

public class My_Iterator<T> implements Iterator {
    private ArrayList <T> collection;
    private int index=0;
    private int length=0;
    private final int MAX_LENGTH_OF_COLLECTION=10; // textimizin son 10 hali tutulur.
    
    
    public My_Iterator(){
        collection=new ArrayList<>();
    }
   
    public boolean isEmpty(){
        return collection.isEmpty();
    }
    public int getLength(){
        return length;
    }
    
    public void add(T s){ // koleksiyonumuza eleman ekleme
      
        if (collection.size()>MAX_LENGTH_OF_COLLECTION) {
            for (int i = 0; i < 11; i++) {
                if (i==10) {
                    collection.set(i, s);
                    break;
                }
                collection.set(i,collection.get(i+1));
            }
            length=10;
        }else{
        collection.add(s);
        length++;
        }
        
    }
    public Object previous(){ // undo işlemi için bir önceki elemanı alma metodu
        if (length!=0) {
            length--;
            return collection.get(length);
        }else
            return null;
    }
    
    @Override
    public boolean hasNext() {
        return collection.size()>index;
        
    }

    @Override
    public T next() {
       if (this.hasNext())
                return collection.get(index++);
            else
                return null;
        
    }

    
}
