package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Report;



public interface ReportDao extends CrudRepository<Report, Integer> {

}
