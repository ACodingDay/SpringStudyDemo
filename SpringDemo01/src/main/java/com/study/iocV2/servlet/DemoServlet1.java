package com.study.iocV2.servlet;

import com.study.iocV2.dao.DemoDao;
import com.study.iocV2.dao.impl.DemoDaoImpl;
import com.study.iocV2.service.DemoService;
import com.study.iocV2.service.impl.DemoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author yyt
 * @date 2021年11月13日 21:32
 * 控制层 controller
 */
@WebServlet(urlPatterns = "/ioc2")
public class DemoServlet1 extends HttpServlet {

    /**
     * 内部依赖于 DemoService 接口
     */
    DemoService ds = new DemoServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // resp.getWriter().println("DemoServlet1 run ...");
        resp.getWriter().println(ds.findAll().toString());
    }
}
