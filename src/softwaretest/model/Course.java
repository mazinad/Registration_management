/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaretest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Course {
    @Id
    @Column(name = "courses")
    private String coursecode;
    private String coursename;
    private int coursecredits;
    @ManyToOne
    @JoinColumn(name = "deptname")
    private Department department;
    public String getCoursecode() {
        return coursecode;
    }

    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public int getCoursecredits() {
        return coursecredits;
    }

    public void setCoursecredits(int coursecredits) {
        this.coursecredits = coursecredits;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Course(String coursecode, String coursename, int coursecredits) {
        this.coursecode = coursecode;
        this.coursename = coursename;
        this.coursecredits = coursecredits;
    }

    public Course() {
    }
    
}
