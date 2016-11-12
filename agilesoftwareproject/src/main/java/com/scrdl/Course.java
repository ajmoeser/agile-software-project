package com.scrdl;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String code;
    private String taughtBy;
    private String school;

    private int workload;

    public Course () {}

    public Course(String name, String code, String school, String taughtBy, int workload) {
        this.name = name;
        this.code = code;
        this.taughtBy = taughtBy;
        this.workload = workload;
        this.school = school;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaughtBy() {
        return taughtBy;
    }

    public void setTaughtBy(String taughtBy) {
        this.taughtBy = taughtBy;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getWorkload() { return workload;}

    public void setWorkload(int workload) {
        this.workload = workload;
    }

}

