package com.example.mareunionmasterdetail.service;

import com.example.mareunionmasterdetail.model.Meeting;

import java.util.ArrayList;
import java.util.List;

public class DummyMeetingApiService implements MeetingApiService {
    private List<Meeting> meetings = new ArrayList<>();

    @Override
    public List<Meeting> getMeetings() {
        return meetings;
    }

    @Override
    public void resetMeetings() {
        meetings = new ArrayList<>();
    }

    /**
     * add a {@Link Meeting} to the meeting list
     *
     * @param meeting
     */
    @Override
    public void addMeeting(Meeting meeting) {
        meetings.add(meeting);
    }

    /**
     * remove a {@Link Meeting} to the meting list
     *
     * @param meeting
     */
    @Override
    public void deleteMeeting(Meeting meeting) {
        meetings.remove(meeting);
    }

   }