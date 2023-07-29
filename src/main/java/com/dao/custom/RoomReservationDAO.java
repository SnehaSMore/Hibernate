package com.dao.custom;

import java.io.IOException;
import java.sql.SQLException;

import com.dao.CrudDAO;
import com.entity.RoomReservation;

public interface RoomReservationDAO extends CrudDAO<RoomReservation,String> {
    String generateNewId() throws SQLException, ClassNotFoundException, IOException;
    String generateRoomAvailableStatus(String id) throws SQLException, ClassNotFoundException, IOException;
}