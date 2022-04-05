package com.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.springjdbc.Client;
import com.springjdbc.User;
import com.springjdbc.Userdata;
import com.springjdbc.Usertype;

@Service
public class RowMapperUserImpl implements RowMapper<User>{

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User st=new User();
		Userdata ud =new Userdata();
		ud.setId(rs.getInt("ud.id"));
		ud.setName(rs.getString("ud.name"));
		ud.setImg(rs.getString("ud.img"));
		
		Usertype ut= new Usertype();
		ut.setUsertypeid(rs.getInt("ut.usertypeid"));
		ut.setUsertype(rs.getString("ut.usertype"));
		
		st.setUsername(rs.getString(1));
		st.setPassword(rs.getString(2));
		st.setUserdataById(ud);
		st.setUsertypeByUsertypeid(ut);
		st.setApprove(rs.getInt(5));
		st.setUsertypeid(rs.getInt(3));
		st.setId(rs.getInt(4));
		return st;
	}

}
