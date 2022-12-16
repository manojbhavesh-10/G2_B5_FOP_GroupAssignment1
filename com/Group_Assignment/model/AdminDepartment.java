package com.Group_Assignment.model;

public class AdminDepartment extends SuperDepartment {

    @Override
    public String departmentName() {
        return "Admin Department";
    }

    @Override
    public String getTodaysWork() {
        return "Complete your documents submission";
    }

    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    @Override
    public String isTodayAHoliday() {
        return super.isTodayAHoliday();
    }
}
