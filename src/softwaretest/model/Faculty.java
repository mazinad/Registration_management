/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaretest.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Faculty {
    @Id
    private String facname;
    @OneToMany(mappedBy = "faculty")
    private List<Department>department;

    public String getFacname() {
        return facname;
    }

    public void setFacname(String facname) {
        this.facname = facname;
    }

    public List<Department> getDepartment() {
        return department;
    }

    public void setDepartment(List<Department> department) {
        this.department = department;
    }

    public Faculty(String facname) {
        this.facname = facname;
    }

    public Faculty() {
    }


}
