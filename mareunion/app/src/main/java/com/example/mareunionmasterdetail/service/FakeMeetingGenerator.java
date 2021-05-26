package com.example.mareunionmasterdetail.service;

import com.example.mareunionmasterdetail.model.Meeting;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class FakeMeetingGenerator {
    private static final Date currentDate = new Date(System.currentTimeMillis());
    private static final Date tomorrowDate = new Date(System.currentTimeMillis() + 86400000);

    public static List<Meeting> FAKE_MEETINGS = Arrays.asList(
            new Meeting(1, 0xFF5E855F, currentDate, 1, "Réunion 1", "g.maginot@gmail.com,maginot.lisa@gmail.com"),
            new Meeting(2, 0xFF5E755F, tomorrowDate, 2, "Réunion 2", "g.maginot@gmail.com,maginot.margot@gmail.com"),
            new Meeting(3, 0xFF5E888F, currentDate, 3, "Réunion 3", "maginot.marine@gmail.com,g.maginot@gmail.com"),
            new Meeting(4, 0xFF5E155F, tomorrowDate, 4, "Réunion 4", "g.maginot@gmail.com,maginot.lisa@gmail.com"),
            new Meeting(5, 0xFF5E668F, currentDate, 5, "Réunion 5", "g.maginot@gmail.com,maginot.margot@gmail.com"),
            new Meeting(6, 0xFF5E338F, currentDate, 6, "Réunion 6", "g.maginot@gmail.com,maginot.margot@gmail.com")
    );

    public FakeMeetingGenerator() throws ParseException {
    }
    static List<Meeting> generateMeetings() {
        return new ArrayList<>(FAKE_MEETINGS);
    }
}