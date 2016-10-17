package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void test() throws PersonException {
		ArrayList<Staff> staffs = new ArrayList<Staff>();
		Calendar date = Calendar.getInstance();
		date.set(1980, 1, 1);
		Staff staff1 = new Staff("Will", "Tom", "mm", date.getTime(),
				"address", "(111)-111-1111", "1@qq.com", "", 1, 7000, null,
				eTitle.MR);
		Staff staff2 = new Staff("Will", "Tom", "mm", date.getTime(),
				"address", "(111)-111-1111", "1@qq.com", "", 2, 6200, null,
				eTitle.MR);
		Staff staff3 = new Staff("Will", "Tom", "mm", date.getTime(),
				"address", "(111)-111-1111", "1@qq.com", "", 3, 5400, null,
				eTitle.MR);
		Staff staff4 = new Staff("Will", "Tom", "mm", date.getTime(),
				"address", "(111)-111-1111", "1@qq.com", "", 4, 4600, null,
				eTitle.MR);
		Staff staff5 = new Staff("Will", "Tom", "mm", date.getTime(),
				"address", "(111)-111-1111", "1@qq.com", "", 5, 4000, null,
				eTitle.MR);
		staffs.add(staff1);
		staffs.add(staff2);
		staffs.add(staff3);
		staffs.add(staff4);
		staffs.add(staff5);
		double sum = 0;
		for (Staff staff : staffs) {
			sum += staff.getSalary();
		}
		// Test equal
		assertEquals(5440, sum / 5, 0);
	}

	@Test
	public void test1() {
		Calendar date = Calendar.getInstance();
		date.set(2600, 1, 1);
		try {
			// Test error date
			new Staff("Will", "Tom", "mm", date.getTime(), "address",
					"(111)-111-1111", "1@qq.com", "", 0, 1000, null, eTitle.MR);
			assertTrue(false);
		} catch (PersonException e) {
			assertTrue(true);
		}
		try {
			// Test error phone
			new Staff("Will", "Tom", "mm", new Date(), "address",
					"(111)111-1111", "1@qq.com", "", 0, 1000, null, eTitle.MR);
			assertTrue(false);
		} catch (PersonException e) {
			assertTrue(true);
		}
	}

}
