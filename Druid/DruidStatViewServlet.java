package com.panda.filter;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
	  
	@WebServlet
	(urlPatterns="/druid/*",
	           initParams={
	                   @WebInitParam(name="allow",value=""),// IP白名单(没有配置或者为空，则允许所有访问)
	                    @WebInitParam(name="deny",value=""),// IP黑名单 (存在共同时，deny优先于allow)
	                    @WebInitParam(name="loginUsername",value="admin"),// 用户名
	                    @WebInitParam(name="loginPassword",value="123456"),// 密码
	                    @WebInitParam(name="resetEnable",value="true")// 禁用HTML页面上的“Reset All”功能
	           }
	)	
	
	/**
	 * druid数据源状态监控.
	 * @author Administrator
	 *
	 */
	public class DruidStatViewServlet extends StatViewServlet{
	    private static final long serialVersionUID = 1L;
	}

