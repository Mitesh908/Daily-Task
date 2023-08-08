package com.lvg.bootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lvg.bootdemo.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department,Integer>
{

}
