package edu.simpson.cis320firstproject;

import java.util.*;

/**
 * Created by Kyle on 1/26/2017.
 */
public class Person {
    private int id;
    private String first;
    private String last;
    private String phone;
    private String email;
    private Date birthday;

    public int getId() {return id; }
    public void setId(int id) { this.id = id; }

    public String getFirst() {return first; }
    public void setFirst(String first) {this.first = first; }

    public String getLast() {return last; }
    public void setLast(String last) {this.last = last; }

    public String getPhone() {return phone; }
    public void setPhone(String phone) {this.phone = phone; }

    public String getEmail() {return email; }
    public void setEmail(String email) {this.email = email; }

    public Date getBirthday() {return birthday; }
    public void setBirthday(Date birthday) {this.birthday = birthday; }

}
