package com.groupproject.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.groupproject.beans.Attendance;

public class AttendanceDAO {
	
	JdbcTemplate jdbcTemplate;
	
	public void setTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int save(Attendance attendance) {
		String sql = "insert into attendance(member_id, attendance_date, checkin_time, workout_type, checkout_time) "
				+ "values(?, ?, ?, ?, ?)";
		return jdbcTemplate.update(sql, attendance.getMemberId(), attendance.getAttendanceDate(), attendance.getCheckinTime(), 
				attendance.getWorkoutTime(), attendance.getCheckoutTime());
	}
	
	public List<Attendance> getAttendance() {
		return jdbcTemplate.query("select * from attendance", new RowMapper<Attendance>() {

			public Attendance mapRow(ResultSet rs, int row) throws SQLException {
				Attendance attend = new Attendance();
				attend.setAid(rs.getInt(1));
				attend.setMemberId(rs.getInt(2));
				attend.setAttendanceDate(rs.getString(3));
				attend.setCheckinTime(rs.getString(4));
				attend.setWorkoutTime(rs.getString(5));
				attend.setCheckoutTime(rs.getString(6));
				return attend;
			}
			
		});
	}

}
