/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20191021_sdt_02;

public class Stack {
    int top = -1;
    String[] storage;
    
    public int getSize()
    {
        return storage.length;
    }
    
    public boolean isFull()
    {
        if (top >= getSize()-1) return true;
        else return false;
    }
    
    public boolean isEmpty()
    {
        if (top < 0) return true;
        else return false;
    }
    
    public int getDataCount()
    {
        return top+1;
    }
    
    public String getDataAt(int i)
    {
        if (storage[i].isEmpty()) return "";
        else return storage[i];
    }
    
    public void setDataAt(int i, String data)
    {
        storage[i] = data;
    }
    
    public void push(String data)
    {
        if(!isFull()) setDataAt(++top, data);
    }
    
    public String peek()
    {
        if(!isEmpty()) return getDataAt(top);
        else return "";
    }
    
    public String pop()
    {
        String data = peek();
        //setDataAt(top--, "");
        top--;
        return data;
    }
    
    Stack(int length)
    {
        storage = new String[length];
    }
}