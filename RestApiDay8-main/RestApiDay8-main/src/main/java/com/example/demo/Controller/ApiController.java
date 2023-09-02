package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.ApiModel;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {
	@Autowired
	ApiService bser;
	@PostMapping("addbike")
	public ApiModel add(@RequestBody ApiModel ss) {
		return bser.saveinfo(ss);
	 }
	@GetMapping("showbike")
	public List<ApiModel> show(){
		return bser.showinfo();
	}
	@PutMapping("updatebike")
	public ApiModel modify(@RequestBody ApiModel s) {
		return bser.changeinfo(s);
	}
	@DeleteMapping("del")
	public String delinfo(@RequestBody ApiModel s) {
		 bser.deleteinfo(s);
		 return "Deleted successfully";
	}
	@GetMapping("showqueryyear/{year}")
	public List<ApiModel> getstu(@PathVariable int year){
		return bser.getbikeyear(year);
	}
	@GetMapping("showqueryname/{name}")
	public List<ApiModel> getstu(@PathVariable String name){
		return bser.getbikename(name);
	}
	@GetMapping("showquery/{year}/{name}")
	public List<ApiModel> getstu(@PathVariable int year,@PathVariable String name){
		return bser.getinfo(year, name);
	}
}
