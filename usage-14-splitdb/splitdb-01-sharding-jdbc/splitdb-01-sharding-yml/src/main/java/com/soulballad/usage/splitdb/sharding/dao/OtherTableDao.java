package com.soulballad.usage.splitdb.sharding.dao;

import com.soulballad.usage.splitdb.sharding.entity.OtherTable;

import java.util.List;

/**
 * @Author: qingshan
 * @Description: 咕泡学院，只为更好的你
 */
public interface OtherTableDao {

    long addOne(OtherTable table);

    List<OtherTable> getAll();

}
