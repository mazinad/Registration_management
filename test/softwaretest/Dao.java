/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaretest;

import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.operation.Operation;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;

public class Dao {

    public static Operation INSERT_FACULTY
            = Operations.insertInto("faculty")
                    .columns("facname")
                    .values("Information Technology")
                    .values("Accounting")
                    .build();
    public static Operation INSERT_DEPARTMENT
            = Operations.insertInto("department")
                    .columns("deptname", "facname")
                    .values("Sofware Engineering", "Information Technology")
                    .values("Marketing", "Accounting")
                    .values("Networking", "Information Technology")
                    .build();
    public static Operation INSERT_COURSE
            = Operations.insertInto("course")
                    .columns("courses", "coursename", "coursecredits", "deptname")
                    .values("INSY123", "web Tech", 3, "Sofware Engineering")
                    .values("INSY124", "Java", 4, "Sofware Engineering")
                    .values("INSY143", "Advanced accounting", 2, "Marketing")
                    .build();
    public static Operation INSERT_STUDENT
            = Operations.insertInto("student")
                    .columns("studentId", "name", "gender", "dob", "phoneNumber", "emailAddress", "deptname")
                    .values("22052", "Dan", "Male", Date.valueOf(LocalDate.of(1999, Month.MARCH, 3)), "0786317204", "dan@gmail.com", "Sofware Engineering")
                    .values("22089", "Mussa", "Male",Date.valueOf(LocalDate.of(1998, Month.DECEMBER, 6)), "0781992878", "mussa@gmail.com", "Sofware Engineering")
                    .values("22065", "Linah", "Female",Date.valueOf(LocalDate.of(1997, Month.MAY, 9)), "0786715204", "linah@gmail.com", "Marketing")
                    .build();
    public static Operation DELETE_STUDENT
            = Operations.deleteAllFrom("student");
    public static Operation DELETE_course
            = Operations.deleteAllFrom("course");
    public static Operation DELETE_department
            = Operations.deleteAllFrom("department");
    public static Operation DELETE_faculty
            = Operations.deleteAllFrom("faculty");
    public static Operation DELETE_registration
            = Operations.deleteAllFrom("registration");
}
