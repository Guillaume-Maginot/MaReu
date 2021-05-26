package com.example.mareunionmasterdetail.model;
import androidx.annotation.NonNull;

import java.util.Arrays;
import java.util.List;


public class Place {
    /**
     * An array of Meetings Place List items.
     */
    public static final List<Place> FAKE_PLACES = Arrays.asList(
            new Place(1, "Timon"),
            new Place(2, "Pumba"),
            new Place(3, "Woody"),
            new Place(4, "Buzz"),
            new Place(5, "Elsa"),
            new Place(6, "Anna"),
            new Place(7, "Lilo"),
            new Place(8, "Stitch"),
            new Place(9, "Bob"),
            new Place(10, "Belle")
    );

    private final Integer id;

    @NonNull
    private final String name;

    private Place(Integer id, @NonNull String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public static Place getPlaceById(int id) {
        for (Place place : getAllPlaces()) {
            if (place.id == id)
                return place;
        }
        return null;
    }

    @NonNull
    public static Place[] getAllPlaces() {
        return new Place[]{
                new Place(1, "Timon"),
                new Place(2, "Pumba"),
                new Place(3, "Woody"),
                new Place(4, "Buzz"),
                new Place(5, "Elsa"),
                new Place(6, "Anna"),
                new Place(7, "Lilo"),
                new Place(8, "Stitch"),
                new Place(9, "Bob"),
                new Place(10, "Belle")
        };
    }

    @Override
    @NonNull
    public String toString() {
        return getName();
    }
}
