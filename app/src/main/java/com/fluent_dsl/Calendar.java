package com.fluent_dsl;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Calendar {
	class Event {
		private final String name;
		private LocalDate date;
		private LocalTime startTime;
		private LocalTime endTime;
		private String location;

		public Event(String name) {
			this.name = name;
		}

		public Event on(int year, int month, int day) {
			this.date = LocalDate.of(year, month, day);

			return this;
		}

		private LocalTime parseTime(String time) {
			return LocalTime.parse(time);
		}

		public Event from(String startTime) {
			this.startTime = parseTime(startTime);

			return this;
		}

		public Event to(String endTime) {
			this.endTime = parseTime(endTime);

			return this;
		}

		public Event at(String location) {
			this.location = location;

			return this;
		}

		@Override
		public String toString() {
			return String.format("Event:%nname='%s' %ndate=%s %nstartTime=%s %nendTime=%s %nlocation='%s'%n",
					name, date, startTime, endTime, location);
		}
	}

	private List<Event> events;

	public Calendar() {
		this.events = new ArrayList<>();
	}

	public Event add(String name) {
		final Event event = new Event(name);
		events.add(event);

		return event;
	}

	public List<Event> getEvents() {
		return events;
	}

	@Override
	public String toString() {
		return String.format("events: %s%n", events);
	}
}
