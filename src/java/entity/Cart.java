/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class Cart {
    private List<Item> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    
    public int getQuantityByID(int id){
        return getItemByID(id).getQuantity();
    }
    
    public Item getItemByID(int id){
        for (Item item : items) {
            if(item.getProduct().getProductID() == id)
                return item;
        }
        return null;
    }
    
    public void addItem(Item t){
        if(getItemByID(t.getProduct().getProductID()) != null){
            Item m = getItemByID(t.getProduct().getProductID());
            m.setQuantity(m.getQuantity() + t.getQuantity());
        }else{
            items.add(t);
        }
    }
    
    public void removeItem(int id){
        if(getItemByID(id) != null){
            items.remove(getItemByID(id));
        }
    }
    
    public double getTotalMoney(){
        double t = 0;
        for(Item i: items){
            t += (i.getQuantity() * i.getProduct().getSalePrice());
        }
        return t;
    }
}
