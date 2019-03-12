package com.col.dao;

import java.util.List;

import com.col.model.Job;

public interface JobDao{
	void saveJob(Job job);
	List<Job> getAllJobs();
	void deleteJob(int id);
	void updateJob(Job job);
	Job getJob(int id);
}
