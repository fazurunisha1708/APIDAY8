package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.ApiModel;
import com.example.demo.Repository.ApiRepo;

@Service
public class ApiService {
	@Autowired
	ApiRepo reb;
	public ApiModel saveinfo (ApiModel ss){
		   return reb.save(ss);
	}
	public List<ApiModel> showinfo(){
		   return reb.findAll();
	}
	public ApiModel changeinfo(ApiModel s) {
		   return reb.saveAndFlush(s);
	}
	public void deleteinfo(ApiModel s) {
		   reb.delete(s);
	}
	public List<ApiModel> getbikeyear(int year){
		   return reb.getBikeinfoyear(year);
	}
	public List<ApiModel> getbikename(String s){
		   return reb.getBikename(s);
	}
	public List<ApiModel> getinfo(int id,String s){
		   return reb.getBikeinfo(id,s);
	}
}
