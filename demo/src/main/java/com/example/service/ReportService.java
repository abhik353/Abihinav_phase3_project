package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ReportDao;
import com.example.model.Report;

@Service
public class ReportService {
	private static int reportCount = 1;
	
	@Autowired
	private ReportDao reportDao;
	
	public void addReport(String name,String product,String category,String date) {
		reportDao.save(new Report(++reportCount,name,date,product,category));
	}
	
	public List<Report> getReports(){
		List<Report> reports = new ArrayList<Report>();
		reportDao.findAll().forEach(x -> reports.add(x));
		return reports;
	}
	
	public List<Report> searchReportsByCategory(String name){
		List<Report> reports = new ArrayList<Report>();
		reportDao.findAll().forEach(x ->{
		if((x.getCategory()).equals(name)) 
		{
			reports.add(x);
		}
		});
		return reports;
	}
	
	public List<Report> searchReportsByDate(String name){
		List<Report> reports = new ArrayList<Report>();
		reportDao.findAll().forEach(x ->{
		if((x.getDate()).equalsIgnoreCase(name)) 
		{
			reports.add(x);
		}
		});
		return reports;
	}
}
