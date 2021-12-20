package com.slokam.SlokamStudentmgt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.SlokamStudentmgt.entity.SlokamStudent;
@RestController
@RequestMapping("SStudent")
public class SlokamStudentController {
	//Hello iam ravikumar from slokam
	@Autowired
private SlokamStudent SlokamStudentRepo;
	
	@PostMapping()
	public void saveSStudent(@RequestBody SlokamStudent student) {

	
	}@GetMapping("/{pptNo}")
public SlokamStudent getSStudentByPPassportNo(@PathVariable String pptNo ) {
	return SlokamStudentRepo;
	
	
}
}
