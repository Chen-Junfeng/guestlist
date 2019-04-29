package com.cjf.controller;

import com.cjf.entity.Guest;
import com.cjf.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GuestController {
    @Autowired
    private GuestService guestService;

    @RequestMapping(value = "/listAll")
    public List<Guest> listAll() {
        List<Guest> guests = guestService.listAll();
        System.out.println("所有嘉宾："+guests);
        return guests;
    }

    @RequestMapping(value = "/add")
    public int add(@RequestBody Guest guest)
    {
        System.out.println("添加嘉宾："+guest);
        String name=guest.getName();
        String phone=guest.getPhone();
        String state=guest.getState();
        return guestService.add(name,phone,state);
    }

    @RequestMapping(value = "/remove")
    public int remove(@RequestBody Guest guest){
        System.out.println("删除嘉宾："+guest);
        String phone=guest.getPhone();
        return guestService.remove(phone);
    }

    @RequestMapping(value = "/update")
    public int update(@RequestBody Guest guest){
        System.out.println("更新嘉宾："+guest);
        String phone=guest.getPhone();
        String state=guest.getState();
        return guestService.update(phone,state);
    }
}
