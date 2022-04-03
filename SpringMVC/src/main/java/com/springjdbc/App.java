package com.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.dao.StudentDao;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Application Started........" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
       StudentDao stdDao = context.getBean("stdDao",StudentDao.class);
        
       //inserting a record 
      /* Student st=new Student();
       st.setSid(1219);
       st.setCity("Delhi");
       st.setName("Chamira");
       
       int r=stdDao.insert(st);
       
       System.out.println(r+" Record inserted");
        */
       
       //updating a record
     /*  Student st=new Student();
       st.setSid(1215);
       st.setCity("Delhi");
       st.setName("Rohit Kumar");
       int r = stdDao.change(st);
       System.out.println(r+ "record updated successfully....");
    */
       
       //Deleting a Record
      /* int r = stdDao.delete(1216);
       
    System.out.println(r+" record deleted successfully....");
    */
       //fetching single row 
       
      /* Student s = stdDao.getStudent(1215);
       System.out.println(s);
       */
       
       //fetching all records 
       
       List<Client> allStudents = stdDao.getAllStudents();
       for(Client s:allStudents) {
    	   System.out.println(s);
       }
       
       //fetching all the records using ResultSet Extractor
//      List<Student> students = stdDao.getStudents();
//       for(Student s:students) {
//    	   System.out.println(s);
//       }
//       
    }
}
