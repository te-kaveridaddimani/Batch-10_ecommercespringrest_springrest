package com.te.ecommercespringrest.service;

import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.ecommercespringrest.beans.Items;
import com.te.ecommercespringrest.dao.AdminDAOwithHibernateImpl;





@Service
public  class AdminServiceImpl implements AdminService {


	@Autowired
	AdminDAOwithHibernateImpl adminDao;
	

	@Override
	public boolean addItem(Items item) {
		boolean result = adminDao.addItem(item) ;
		return result;
	}

	@Override
	public boolean removeItem(Integer id) {
		boolean result = adminDao.removeItem(id);
		return result;
	}

	@Override
	public Items searchItem(Integer id) {
		Items item = adminDao.searchItem(id);
		return item;
	}

	@Override
	public List<Items> getAllItems() {
		List<Items> list = adminDao.getAllItems();
		return list;
	}

	@Override
	public boolean updateItem(Items item) {
		boolean result = adminDao.updateItem(item);
		return result;
	}

	@Override
	public boolean updateItem(Item item) {
		// TODO Auto-generated method stub
		return false;
	}



		


}
