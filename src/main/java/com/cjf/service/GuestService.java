package com.cjf.service;

import com.cjf.dao.GuestDao;
import com.cjf.entity.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GuestService {
    @Autowired
    private GuestDao guestDao;
    //全部记录
    public List<Guest> listAll(){
        return guestDao.listAll();
    }

    public int add(String name,String phone,String state)
    {
        return guestDao.add(name,phone,state);
    }

    public int remove(String phone){
        return guestDao.remove(phone);
    }

    public int update(String phone,String state)
    {
        return guestDao.update(phone,state);
    }
}
