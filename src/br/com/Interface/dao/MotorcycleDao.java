package br.com.Interface.dao;

import java.sql.SQLException;
import java.util.List;

public interface MotorcycleDao extends BaseDao {

    public abstract List searchByModel(String model) throws SQLException;

}
