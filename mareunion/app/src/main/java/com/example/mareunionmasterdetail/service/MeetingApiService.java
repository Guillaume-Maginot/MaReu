package com.example.mareunionmasterdetail.service;

import com.example.mareunionmasterdetail.model.Meeting;

import java.util.List;

/**
 * Meeting Api Service
 */
public interface MeetingApiService {

    /**
     * @return {@Link List}
     */
    List<Meeting> getMeetings();


    /**
     * Reset meeting List
     */
    void resetMeetings();

    /**
     * Add a meeting
     *
     * @param  meeting
     */
    void addMeeting(Meeting meeting);

    /**
     * Delete a meeting
     *
     * @param meeting
     */
    void deleteMeeting(Meeting meeting);
}