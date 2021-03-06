package com.nicksoddsandends.service;

import java.util.List;

import com.nicksoddsandends.entity.Complaint;
import com.nicksoddsandends.entity.Employee;

public interface ComplaintService {
    public Complaint createComplaint(Complaint complaint);
    public List<Complaint> getAllComplaintsByEmployee(Employee employee);
}