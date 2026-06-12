package com.example.EventRegistration;


import java.util.ArrayList;
import java.util.List;

public class GraduationCeremonyEvent implements CollegeEvent{
    String name;
    String address;
    String time;
    String date;
    int count;
    List<Attendee> eventAttendees;
    Attendee attendee;
//    Attendee attendee;

    GraduationCeremonyEvent() {
        eventAttendees = new ArrayList<Attendee>();
        count=0;
        name="Graduation Ceremony";
        address="new place";
        time="new time";
        date="new date";
    }

    @Override
    public void registerStudent(Attendee user) {
        eventAttendees.add(user);
        count++;
    }

    @Override
    public List<Attendee> getAllAttendees() {
        return eventAttendees;
    }

    @Override
    public void printEventDetails() {
        System.out.println("The Graduation Ceremony details are as follows:\nVenue: Auditorium\nTime: 10AM\nDate: 12 Nov 2023\n");
    }

    @Override
    public int getAttendeeCount() {
        return count;
    }

    @Override
    public void setAttendee(Attendee attendee) {
//        eventAttendees.add(attendee);
//        count++;
        this.attendee = attendee;
    }

//    public void setStudent(Attendee student) {
////        eventAttendees.add(student);
//    }

    /*
    1. Create the following attributes:
        a. name (initialize it as "Graduation Ceremony".
        b. address (String)
        c. time (String)
        d. date (String)
        e. count (int) (initially 0)
        f. eventAttendees (List of Attendee)
        NOTE: Initialize the address, time and date attributes with some values.
    2. Inject Attendee with attribute name "attendee" with setter injection.
    3. Make this class an implementation of CollegeEvent interface and override the interface methods.
    */

}
