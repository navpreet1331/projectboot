package com.capgemini.bookstore.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bookstore.dao.AddbooktocartDao;
import com.capgemini.bookstore.entity.Addbooktocart;

@Service
@Transactional
public class AddbooktocartService {
	
	@Autowired
	AddbooktocartDao addbooktocartDao;
	
	public boolean addAddbooktocart(Addbooktocart addbooktocart)
	{
		return addbooktocartDao.save(addbooktocart) != null;
	}
	
	public Optional<Addbooktocart> Addbooktocartdetails(Integer addbooktocartId)
	{
		return addbooktocartDao.findById(addbooktocartId);
	}
	
	public List<Addbooktocart> show()
	{
		return addbooktocartDao.findAll();
	}
	
	public Addbooktocart updateAddbooktocart(Addbooktocart addbooktocart,int addbooktocartId)
	{
		return addbooktocartDao.save(addbooktocart);
	}

}
