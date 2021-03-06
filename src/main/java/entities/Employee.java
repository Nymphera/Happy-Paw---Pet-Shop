package entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "employees")
public class Employee extends User {

    public Employee() {
    }

    public Employee(String email, String password) {
        super(email, password);
    }
}
