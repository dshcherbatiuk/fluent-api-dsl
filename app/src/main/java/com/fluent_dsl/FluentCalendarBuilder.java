package com.fluent_dsl;

import com.github.misberner.duzzt.annotations.DSLAction;
import com.github.misberner.duzzt.annotations.GenerateEmbeddedDSL;

import javax.annotation.concurrent.NotThreadSafe;

/**
 * See <a href="https://github.com/misberner/duzzt/wiki/A-Tutorial-Introduction-to-Duzzt"/>
 */
@GenerateEmbeddedDSL(name = "FluentCalendar", syntax = "(add on from to at)+ end")
@NotThreadSafe
public class FluentCalendarBuilder {
	private final Calendar calendar;

	public FluentCalendarBuilder() {
		this.calendar = new Calendar();
	}

	@DSLAction
	public FluentCalendarBuilder add(String name) {
		calendar.add(name);

		return this;
	}

	private Calendar.Event getCurrentEvent() {
		return calendar.getEvents().get(calendar.getEvents().size() - 1);
	}

	@DSLAction
	public FluentCalendarBuilder on(int year, int month, int day) {
		getCurrentEvent().on(year, month, day);

		return this;
	}

	@DSLAction
	public FluentCalendarBuilder from(String startTime) {
		getCurrentEvent().from(startTime);

		return this;
	}

	@DSLAction
	public FluentCalendarBuilder to(String endTime) {
		getCurrentEvent().to(endTime);

		return this;
	}

	@DSLAction
	public FluentCalendarBuilder at(String location) {
		getCurrentEvent().at(location);

		return this;
	}

	@DSLAction
	public Calendar end() {
		return calendar;
	}
}
