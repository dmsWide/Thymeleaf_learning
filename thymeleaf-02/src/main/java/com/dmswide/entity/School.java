package com.dmswide.entity;

public class School {
    private String schoolName;
    private String schoolAddress;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    @Override
    public String toString() {
        return "School{" +
            "schoolName='" + schoolName + '\'' +
            ", schoolAddress='" + schoolAddress + '\'' +
            '}';
    }
}
