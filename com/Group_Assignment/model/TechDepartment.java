package com.Group_Assignment.model;

import com.Group_Assignment.model.SuperDepartment;

public class TechDepartment extends SuperDepartment {
    @Override
    public String departmentName() {
        return "Tech Department";
    }

    @Override
    public String getTodaysWork() {
        return "Complete coding of Module 1";
    }

    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    @Override
    public String isTodayAHoliday() {
        return super.isTodayAHoliday();
    }

    public String getStackInformation() {
        return "Core Java";
    }
}
