package com.kh.dpr.order.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.dpr.order.model.vo.Order;
import com.kh.dpr.order.model.vo.OrderDetail;

@Repository
public class OrderDAOImpl implements OrderDAO {

	@Autowired
	SqlSessionTemplate sqlSession;
	
	@Override
	public int orderInsert(Order order) {
		
		return sqlSession.insert("orderSQL.orderInsert", order);
		//return 1;
	}

	@Override
	public Order orderSelectOne() {
		
		return null;
	}

	@Override
	public int orderDetailInsert(OrderDetail orderDetail) {
	
		//return 1;
		return sqlSession.insert("orderSQL.orderDetailInsert", orderDetail);
	}

}
