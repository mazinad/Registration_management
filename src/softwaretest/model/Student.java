
package softwaretest.model;

import java.sql.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Student {
    @Id
    private String studentId;
    private String name;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Date dob;
    private String phoneNumber;
    private String emailAddress;
    @ManyToOne
    @JoinColumn(name = "deptname")
    private Department departments;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Department getDepartments() {
        return departments;
    }

    public void setDepartments(Department departments) {
        this.departments = departments;
    }

    public Student(String studentId, String name, Gender gender, Date dob, String phoneNumber, String emailAddress) {
        this.studentId = studentId;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public Student() {
    }
    
}
