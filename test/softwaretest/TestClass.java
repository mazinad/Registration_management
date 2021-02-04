/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaretest;

import java.time.LocalDate;
import java.time.Month;
import java.sql.Date;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import softwaretest.dao.GeneralDao;
import softwaretest.model.Course;
import softwaretest.model.Department;
import softwaretest.model.Faculty;
import softwaretest.model.Gender;
import softwaretest.model.Registration;
import softwaretest.model.Student;
import softwaretest.util.HibernateUtil;

/**
 *
 * @author mazinad
 */
public class TestClass extends AbstractTestCase {
    
    GeneralDao<Department> dept = new GeneralDao<>(Department.class);
    GeneralDao<Faculty> fac = new GeneralDao<>(Faculty.class);
    GeneralDao<Student> stud = new GeneralDao<>(Student.class);
    GeneralDao<Course> cour = new GeneralDao<>(Course.class);
    GeneralDao<Registration> reg1 = new GeneralDao<>(Registration.class);

    public TestClass() {
    }
    @Test
    public void art(){
        
    }
//    @Test
//    public void createNewCourse() {
//        Department de = dept.findbyId("Sofware Engineering");
//        Course c = new Course("INSY 124", "Sofware Security", 4);
//        c.setDepartment(de);
//        Course cr = cour.Create(c);
//        System.out.println("Course created");
//        
//    }
//
//    @Test
//    public void updateNewCourse() {
//        Department de = dept.findbyId("Sofware Engineering");
//        Course c = new Course("INSY123", "English", 3);
//        c.setDepartment(de);
//        Course cr = cour.createUpdate(c);
//        System.out.println("Course Updated");
//        
//    }
//    
//    @Test
//    public void updateNewStudent() {
//        Department de = dept.findbyId("Sofware Engineering");
//        Student s = new Student("22052", "Dani", Gender.Male,Date.valueOf(LocalDate.of(2000, Month.MARCH, 3)), "0786317204", "dan@gmail.com");
//        s.setDepartments(de);
//        Student st = stud.createUpdate(s);
//        System.out.println("Student update");
//        
//    }
//
//    @Test
//    public void createNewStudent() {
//        Department de = dept.findbyId("Sofware Engineering");
//        Student s = new Student("22224", "Joshua", Gender.Male,Date.valueOf(LocalDate.of(1994, Month.MARCH, 12)), "0782764303", "joshua@gmail.com");
//        s.setDepartments(de);
//        Student st = stud.Create(s);
//        System.out.println("Student updated");
//    }
//
//    @Test
//    public void createNewFaculty() {
//        Faculty fax = new Faculty("BIT");
//        fac.Create(fax);
//    }
//    
//    @Test
//    public void createNewDepartment() {
//        Faculty f = fac.findbyId("Information Technology");
//        Department dep = new Department("Managerial");
//        dep.setFaculty(f);
//        Department depp = dept.Create(dep);
//        System.out.println("Department Created successfully");
//    }
//
//    @Test
//    public void testFindStudent() {
//        List<Student> stu = stud.findByAll();
//        Assert.assertEquals(stu.size(), 3);
//    }
//    @Test
//    public void testFindDepartment(){
//        List<Department>depp=dept.findByAll();
//        Assert.assertEquals(depp.size(),3);
//    }
//    @Test
//    public void testFindFaculty() {
//        List<Faculty> fax = fac.findByAll();
//        Assert.assertEquals(fax.size(), 2);
//    }
// @Test
//    public void testFindCourse() {
//        List<Course> cr = cour.findByAll();
//        Assert.assertEquals(cr.size(), 3);
//    }
//    @Test
//    public void createNewRegistration() {
//        Registration reg = new Registration();
//        Student stdent = stud.findbyId("22089");
//        Course cr = cour.findbyId("INSY123");
//        reg.setReg_student(stdent);
//        reg.setReg_course(cr);
//        reg1.Create(reg);
//    }
//
    @BeforeMethod
    public void initializationData() {
        execute(Dao.INSERT_FACULTY);
        execute(Dao.INSERT_DEPARTMENT);
        execute(Dao.INSERT_COURSE);
        execute(Dao.INSERT_STUDENT);
        System.out.println("Inserted succesfully");
    }

//    @AfterMethod
//    public void cleanInitialization() {
//        execute(Dao.DELETE_registration);
//        execute(Dao.DELETE_STUDENT);
//        execute(Dao.DELETE_course);
//        execute(Dao.DELETE_department);
//        execute(Dao.DELETE_faculty);
//        System.out.println("Deleted succesfully");
//    }
    @BeforeTest
    public void init() {
        System.out.println("Create Tables");
        HibernateUtil.getSessionFactory();
    }
    
}
