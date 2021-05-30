package com.example.mareunionmasterdetail.service;

import com.example.mareunionmasterdetail.R;
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
            new Meeting(1, R.drawable.ic_red, currentDate, 1, "Réunion 1", "g.maginot@gmail.com,maginot.lisa@gmail.com"),
            new Meeting(2, R.drawable.ic_jaune, tomorrowDate, 2, "Réunion 2", "g.maginot@gmail.com,maginot.margot@gmail.com"),
            new Meeting(3, R.drawable.ic_jaune, currentDate, 3, "Réunion 3", "maginot.marine@gmail.com,g.maginot@gmail.com"),
            new Meeting(4, R.drawable.ic_orange, tomorrowDate, 4, "Réunion 4", "g.maginot@gmail.com,maginot.lisa@gmail.com"),
            new Meeting(5, R.drawable.ic_bleu, currentDate, 5, "Réunion 5", "g.maginot@gmail.com,maginot.margot@gmail.com"),
            new Meeting(6, R.drawable.ic_gris, currentDate, 6, "Réunion 6", "g.maginot@gmail.com,maginot.margot@gmail.com")
    );

    public FakeMeetingGenerator() throws ParseException {
    }
    static List<Meeting> generateMeetings() {
        return new ArrayList<>(FAKE_MEETINGS);
    }
}