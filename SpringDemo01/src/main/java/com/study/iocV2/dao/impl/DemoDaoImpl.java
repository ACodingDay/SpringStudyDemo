package com.study.iocV2.dao.impl;

import com.study.iocV2.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

/**
 * @author yyt
 * @date 2021年11月13日 21:56
 * 数据持久层接口的实现类，一般是用来操作数据库
 */
public class DemoDaoImpl implements DemoDao {
    @Override
    public List<String> findAll() {
        // 模拟与 MySQL 数据库的交互，获取数据
        return Arrays.asList("adc", "sup", "top");
        // 【问题1】：一旦需求发生变动，这里就需要改动
        // 例如，这里连接的是 Oracle 数据库、redis 数据库
    }
}
