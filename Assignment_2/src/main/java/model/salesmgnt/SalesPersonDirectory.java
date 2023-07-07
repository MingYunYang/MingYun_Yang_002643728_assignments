package model.salesmgnt;

import model.business.Business;
import java.util.ArrayList;
import java.util.Collections;
import model.personnel.Person;

public class SalesPersonDirectory {

    Business business;
    ArrayList<SalesPersonProfile> salespersonlist;

    public SalesPersonDirectory(Business d) {
        business = d;
        salespersonlist = new ArrayList();
    }

    public SalesPersonProfile newSalesPersonProfile(Person p, String name) {
        SalesPersonProfile sp = new SalesPersonProfile(p, name);
        salespersonlist.add(sp);
        return sp;
    }

    public SalesPersonProfile findSalesPerson(String id) {
        for (SalesPersonProfile sp : salespersonlist) {
            if (sp.isMatch(id)) {
                return sp;
            }
        }
        return null;
    }
    
//    public ArrayList<SalesPersonProfile> rankSalesPerson(){
//        ComparatorSalesPerson csp = new ComparatorSalesPerson();
//        Collections.sort(salespersonlist, csp);
//        return salespersonlist;
//    }
    
    public ArrayList<SalesPersonProfile> getSalespersonlist(){
        return salespersonlist;
    }

}
