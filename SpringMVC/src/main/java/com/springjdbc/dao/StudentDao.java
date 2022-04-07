package com.springjdbc.dao;

import java.util.List;

import com.springjdbc.Client;
import com.springjdbc.Invoice;
import com.springjdbc.Student;

public interface StudentDao {

	public int insert(Student student);
	public int change(Student student);
	public int delete(int stdId);
	public Client getClient(String sId);
    public List<Client> getAllClients();
	public List<Client> getStudents();
	public Invoice getInvoice(String inv) ;
}
