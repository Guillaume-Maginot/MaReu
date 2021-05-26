package com.example.mareunionmasterdetail.di;

import com.example.mareunionmasterdetail.service.DummyMeetingApiService;
import com.example.mareunionmasterdetail.service.MeetingApiService;

public class DI {
    private static final MeetingApiService service;

    static {
        service = new DummyMeetingApiService();
    }

    /**
     * Get a new instance on ]{@Link MeetingApiService}
     */
    public static MeetingApiService getMeetingApiService() {
        return service;
    }

    /**
     * Get always a new instance on @{@link MeetingApiService}. Useful for tests, so we ensure the context is clean.
     *
     * @return
     */
    public static MeetingApiService getNewInstanceApiService() {
        return new DummyMeetingApiService();
    }
}