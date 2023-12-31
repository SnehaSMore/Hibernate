package com.dao;

import java.util.List;

public interface CrudDAO<Entity, ID> extends SuperDAO{
    boolean add(Entity entity) throws Exception;

    boolean update(Entity entity) throws Exception;

    boolean delete(ID id) throws Exception;

    Entity find(ID id) throws Exception;

    List<Entity> findAll() throws Exception;
}	