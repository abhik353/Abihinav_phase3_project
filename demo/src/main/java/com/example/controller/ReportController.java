package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.model.Report;
import com.example.service.ReportService;

@Controller
@SessionAttributes("name")
public class ReportController {
	
	@Autowired
	ReportService service;
	
	@RequestMapping(value = "/list-reports", method = RequestMethod.GET)
	public String listReportssPage(ModelMap model) {
		String name = (String) model.get("name");
		model.put("reports", service.getReports());
		return "list-reports";
	}
	
	@RequestMapping(value = "/add-report", method = RequestMethod.GET)
	public String addReport(ModelMap model) {
		model.addAttribute("report",new Report());
		
		return "add-report";
	}
	
	@RequestMapping(value = "/add-report", method = RequestMethod.POST)
	public String addReport(ModelMap model,@ModelAttribute("report") Report report,BindingResult result) {
		if (result.hasErrors()) {
			return "add-report";
		}
		
		service.addReport(report.getName(), report.getProduct(),report.getCategory(),report.getDate());
		return "redirect:/list-reports";
	}
	
	
	@RequestMapping(value = "/search-report-category",method = RequestMethod.POST)
	public String searchReportsByCategory(@RequestParam (value="rc", required= false) String name,Model model) {
		

		model.addAttribute("rc",service.searchReportsByCategory(name));
		return "filtered-Reports";
	}
	
	@RequestMapping(value = "/search-report-date",method = RequestMethod.POST)
	public String searchReportsByDate(@RequestParam (value="rd", required= false) String name,Model model) {
		

		model.addAttribute("rc",service.searchReportsByDate(name));
		return "filtered-Reports";
	}
	
}
