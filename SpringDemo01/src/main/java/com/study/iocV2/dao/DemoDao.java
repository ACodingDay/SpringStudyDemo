package com.study.iocV2.dao;

import java.util.List;

/**
 * @author yyt
 * @date 2021年11月13日 21:50
 * 数据持久层接口
 */
public interface DemoDao {
    /**
     * 模拟返回一些数据
     */
    List<String> findAll();
}
