package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.ApiModel;

public interface ApiRepo extends JpaRepository<ApiModel, Integer>{
	@Query(value = "select * from Bike where year=:ns",nativeQuery = true)
	public List<ApiModel> getBikeinfoyear(@Param("ns") int year);
	@Query(value = "select * from Bike where year=:ns or bikename=:s",nativeQuery = true)
	public List<ApiModel> getBikeinfo(@Param("ns") int year,@Param("s") String bikename);
	@Query(value = "select * from Bike where bikename=:s",nativeQuery = true)
	public List<ApiModel> getBikename(@Param("s") String bikename);
}
