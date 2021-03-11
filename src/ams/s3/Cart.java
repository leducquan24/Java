package ams.s3;

import java.util.ArrayList

public class Cart {
    int id;
    String customer;
    double grandTotal;
    String city;
    ArrayList<product> productsList;

    public Cart(){
        productsList = new ArrayList<>();
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCustomer(){
        return customer;
    }
    public void setCustomer(String customer){
        this.customer = customer;
    }
    public void getGrandTotal(){
        return grandTotal;
    }
    public void setGrandTotal(double grandTotal){
        this.grandTotal = grandTotal;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void addProduct(Product sp){
        if(sp.checkQty()){
            productsList.add(sp);
            sp.setQty(sp.getQty()-1);
            setGrandTotal(grandTotal()+sp.getPrice());
        }

    }
    public void removeProduct(int index){
        Product sp = productsList.get(index);
        productsList.remove(index);
        sp.setQty(sp.getQty()+1);
        setGrandTotal(grandTotal() - sp.getPrice);
    }
    public double calculateGrandTotal(){
        if (getCity() =="TH" || getCity() == "HP" ){
            return grandTotal + grandTotal*1/100;
        }
        return grandTotal + grandTotal*2/100;
    }
}
