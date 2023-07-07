package model.salesmgnt;

import java.util.ArrayList;
import model.ordermgnt.Order;
import model.personnel.Person;
import model.personnel.Profile;

public class SalesPersonProfile extends Profile {
    
    Person p;
    String name;
    ArrayList<Order> salesorders;
    double comission = 0.0;
    double currentSales = 0.0;
    double salesTarget = 30000.0;

    public SalesPersonProfile(Person p, String name) {
        super(p); 
        this.p = p;
        this.name = name;
        salesorders = new ArrayList();
    }
    
    public void addSalesOrder(Order o){
        salesorders.add(o);
    }
    
    public void updateCommission(double commission){
        comission = commission;
    }
    
    public void addSales(double sales){
        currentSales = currentSales + sales;
    }
    
    public boolean achieveSalesTarget(){
        if(currentSales < salesTarget){
            return false;
        }
        return true;
    }
    
    public double getComission(){
        return comission;
    }
    
    public double getCurrentSales(){
        return currentSales;
    }
    
    public double getSalesTarget(){
        return salesTarget;
    }
    
    public String getName(){
        return name;
    }
   
    
    @Override
    public String getRole(){
        return  "Sales";
    }

}
