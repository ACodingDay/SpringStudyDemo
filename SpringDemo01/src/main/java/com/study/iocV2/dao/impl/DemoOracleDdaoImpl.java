package com.study.iocV2.dao.impl;

import com.study.iocV2.dao.DemoOracleDdao;

import java.util.Arrays;
import java.util.List;

/**
 * @author yyt
 * @date 2021年11月13日 22:25
 */
public class DemoOracleDdaoImpl implements DemoOracleDdao {
    @Override
    public List<String> findAll() {
        // 模拟与 Oracle 数据库的交互，获取数据
        return Arrays.asList("xyz", "ijk", "abc");
    }
}
