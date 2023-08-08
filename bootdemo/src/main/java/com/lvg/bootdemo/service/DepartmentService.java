package com.lvg.bootdemo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lvg.bootdemo.entity.Department;
import com.lvg.bootdemo.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;
	public Department getDepartmentByDepartmentId(int departmentId)
	{
		Optional<Department>  od = departmentRepository.findById(departmentId);
		if(od.isPresent())
			return od.get();
		return null;
	}
}
