package com.dao.custom;

import java.io.IOException;
import java.util.List;

import com.dao.CrudDAO;
import com.entity.Room;

public interface RoomDAO extends CrudDAO<Room,String> {

     List getRoomIds() throws IOException;
}