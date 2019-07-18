package com.service;
import java.util.LinkedList;
import com.bean.Employee;
import com.dao.DaoLayer;
public class ServiceLayer {
	DaoLayer dobj=new DaoLayer();
    public void addEmp(Employee e) {
        dobj.addEmp(e);
        
        
    }
public void retriveEmpId() {
        
    }
    public LinkedList<Employee> sortname() {
        return dobj.sortname();
        
    }
    public LinkedList<Employee> sortid() {
        return dobj.sortid();
        
    }
    public void retriveEmpName() {
        
    }
    
}
 

