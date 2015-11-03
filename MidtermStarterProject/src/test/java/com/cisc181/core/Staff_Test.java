package com.cisc181.core;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.cisc181.eNums.eTitle;
public class Staff_Test {
	
	
	@Test
	public final void test() throws PersonException{
	eTitle title = null;	
	Date hireDate = new Date();
	Date dBirthDate = null;
	Date dBirthDate2 = null;
	Date dBirthDate3 = null;
	double aveSalary;
	try {
		dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		dBirthDate2 = new SimpleDateFormat("yyyy-MM-dd").parse("1996-04-09");
		dBirthDate3 = new SimpleDateFormat("yyyy-MM-dd").parse("1980-07-31");
	} catch (ParseException e) {
		e.printStackTrace();
	}
	ArrayList<Staff> staff = new ArrayList<Staff>();
	staff.add(new Staff("Carson", "Doyle", "Hake", dBirthDate2, "36 Prospect Ave", "9089022357", "carsonhake@gmail.com","5-7 p.m.", 1, 50.00, hireDate, title.Professor));
	staff.add(new Staff("Bob", "Evans", "Hake", dBirthDate, "1 Penn. Ave. D.C.", "9089022357", "carsonhake@gmail.com","5-7 p.m.", 1, 40.00, hireDate, title.Professor));
	staff.add(new Staff("Charles", "Dayton", "Hake", dBirthDate2, "34 Prospect Ave", "9089022357", "carsonhake@gmail.com","5-7 p.m.", 1, 30.00, hireDate, title.Professor));
	staff.add(new Staff("Kevin", "Newark", "Hake", dBirthDate, "32 Prospect Ave", "9089022357", "carsonhake@gmail.com","5-7 p.m.", 1, 20.00, hireDate, title.Professor));
	staff.add(new Staff("Mike", "Linda", "Haines", dBirthDate3, "30 Prospect Ave", "9089022357", "carsonhake@gmail.com","5-7 p.m.", 1, 10.00, hireDate, title.Professor));
	
	



	aveSalary = (staff.get(0).getSalary() + staff.get(1).getSalary() + staff.get(2).getSalary() + staff.get(3).getSalary() + staff.get(4).getSalary())/5 ;	
	assertEquals(aveSalary, 30, 1);
		} 
	
	
	@Test(expected=PersonException.class)
	public void testOldException() throws PersonException{
		Date dBirthDate2 = null;
		try {
			dBirthDate2 = new SimpleDateFormat("yyyy-MM-dd").parse("19022-04-09");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date hireDate = new Date();
		new Staff("Carson", "Doyle", "Hake", dBirthDate2, "36 Prospect Ave", "908902357", "carsonhake@gmail.com","5-7 p.m.", 1, 50.00, hireDate, eTitle.Professor);
	}
	
	
	@Test(expected=PersonException.class)
	public void testPhone() throws PersonException{
		Date dBirthDate2 = null;
		try {
			dBirthDate2 = new SimpleDateFormat("yyyy-MM-dd").parse("1996-04-09");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date hireDate = new Date();
		Staff Carson = new Staff();
		Carson.setPhone("9999");
	}
		
		
}

