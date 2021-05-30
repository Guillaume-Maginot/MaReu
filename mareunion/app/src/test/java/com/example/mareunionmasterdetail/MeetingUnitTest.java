package com.example.mareunionmasterdetail;

import com.example.mareunionmasterdetail.di.DI;
import com.example.mareunionmasterdetail.model.Meeting;
import com.example.mareunionmasterdetail.service.MeetingApiService;

import org.hamcrest.collection.IsIterableContainingInAnyOrder;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;

import static com.example.mareunionmasterdetail.service.FakeMeetingGenerator.FAKE_MEETINGS;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class MeetingUnitTest {

    private MeetingApiService service;

    @Before // Permet de préparer notre test
    public void setup() {
        service = DI.getNewInstanceApiService(); // On initialise l'objet qui va nous permettre d'utiliser MeetingApiService
    }

    @Test
    public void getMeetingsWithSuccess() {
        List<Meeting> meetings = service.getMeetings(); // On récupère la liste des meetings
        List<Meeting> fakeMeetingsExpected = FAKE_MEETINGS; // On récupère la ligne des réunions factices
        assertThat(meetings, IsIterableContainingInAnyOrder.containsInAnyOrder(fakeMeetingsExpected.toArray())); // On compare que les 2 listes de réunions sont identiques (la Fake et la meetings)
    }

    @Test
    public void addMeetingWithSuccess() {
        Date currentDate = new Date(System.currentTimeMillis()); // Définition d'une variable de type date avec la date en cours.
        Meeting meeting = new Meeting(1, R.drawable.ic_red, currentDate, 1, "Réunion 1", "g.maginot@gmail.com,maginot.lisa@gmail.com");
        service.addMeeting(meeting); // Ajout de la réunion factice à la liste des réunions.
        assertEquals(7, service.getMeetings().size()); // Vérification que la liste contient bien 7 éléments.
    }

    @Test
    public void deleteMeetingWithSuccess() {
        Meeting meetingToDelete = FAKE_MEETINGS.get(0); // Création d'une variable et récupération de la première réunion.
        service.deleteMeeting(meetingToDelete); // Appelle de la méthode de suppression d'une réunion.
        assertEquals(5, service.getMeetings().size()); // On vérifie que la liste contient bien 5 réunions.
    }

}