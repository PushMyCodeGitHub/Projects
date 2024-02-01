package com.jdbcTemplate.DataEntryInJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
        EmployeeDao dao=(EmployeeDao) context.getBean("d1");
        
//        Employee e1=new Employee(12,"neena",40000.0f);
//        
//        int status =dao.save(e1);
//        int status=dao.update(new Employee(11,"neena",23000.0f));
//        if(status>0) {
//        	System.out.println("data save successfully...!");
//        }
//        else {
//        	System.out.println("Something went wrong..");
//        }
//    
    System.out.println(".........Data updatation........");
    
//    int status = dao.update(new Employee(11,"meena",2300));
    
//    System.out.println(status);
//    
//    if(status>0) {
//    	System.out.println("data updated successfully...!");
//    }
//    else {
//    	System.out.println("Something went wrong..");
//   }
//    
    System.out.println("************************data fetch**************");
    

    
  List<Employee>  list =   dao.getAllEmployee();
  
              for(Employee e : list) {
             	  System.out.println(e);
             	 
              }

//System.out.println("************************data delete**************");
//Employee e=new Employee();
// e.setId(11);
//             int status= dao.deleteemployee(e);
//             
//              
//             if(status>0)
//               {
//             	   System.out.println("data delted successfully");
//               }else
//               {
//             	  System.out.println("somthing went wrong");
//               }
//              
//    
    }
}
