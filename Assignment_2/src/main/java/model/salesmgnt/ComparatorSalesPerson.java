/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.salesmgnt;

import java.util.Comparator;

/**
 *
 * @author libby
 */
public class ComparatorSalesPerson implements Comparator<SalesPersonProfile>{

    @Override
    public int compare(SalesPersonProfile o1, SalesPersonProfile o2) {
        return Double.compare(o2.getCurrentSales(), o1.getCurrentSales());
    }
    
}
