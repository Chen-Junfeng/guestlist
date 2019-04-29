package com.cjf.dao;

import com.cjf.entity.Guest;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface GuestDao {
    List<Guest> listAll();

    int add(@Param("guestName") String name, @Param("guestPhone") String phone, @Param("guestState") String state);

    int remove(String phone);

    int update(@Param("phone") String phone, @Param("state") String state);

}
