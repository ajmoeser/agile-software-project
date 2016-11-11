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

    private int workload;

    public Course () {}

    public Course(String name, String code, String taughtBy, int workload) {
        this.name = name;
        this.code = code;
        this.taughtBy = taughtBy;
        this.workload = workload;
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

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

}

