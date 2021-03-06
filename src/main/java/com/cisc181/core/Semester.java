package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

/**
 * SemesterID (UUID), StartDate (date), EndDate (date).
 */
public class Semester {
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;

	public Semester(Date startDate, Date endDate) {
		super();
		StartDate = startDate;
		EndDate = endDate;
		SemesterID = UUID.randomUUID();
	}

	public UUID getSemesterID() {
		return SemesterID;
	}

	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

}
