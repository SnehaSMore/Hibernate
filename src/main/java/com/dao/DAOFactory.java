package com.dao;

import com.dao.custom.impl.QueryDAOImpl;
import com.dao.custom.impl.RoomDAOImpl;
import com.dao.custom.impl.RoomReservationDAOImpl;
import com.dao.custom.impl.StudentDAOImpl;
import com.dao.custom.impl.UserDAOImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory() {

    }

    public static DAOFactory getDaoFactory() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public enum DAOTypes {
        USER, ROOM, STUDENT, ROOM_RESERVATION, QUERY_DAO
    }

    public SuperDAO getDAO(DAOTypes types) {
        switch (types) {
            case USER:
                return new UserDAOImpl();
            case ROOM:
                return new RoomDAOImpl();
            case STUDENT:
                return  new StudentDAOImpl();
            case ROOM_RESERVATION:
                return new RoomReservationDAOImpl();
            case QUERY_DAO:
                return new QueryDAOImpl();
            default:
                return null;
        }
    }
}