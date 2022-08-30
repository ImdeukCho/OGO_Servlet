package com.service.pay;

import org.apache.ibatis.session.SqlSession;

import com.config.pay.MySqlSessionFactory;
import com.dao.pay.PayDAO;
import com.dto.pay.PayDTO;

public class PayService {
	PayDAO dao = new PayDAO();
	
	public PayDTO selectOrder(String ordernum) {
		SqlSession session = MySqlSessionFactory.getSession();
		PayDTO dto = null;
		try {
			dto = dao.selectOrder(session, ordernum);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			session.close();
		}
		return dto;
	}

}