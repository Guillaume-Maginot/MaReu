package com.example.mareunionmasterdetail.model;
import androidx.annotation.NonNull;

import java.util.Arrays;
import java.util.List;


public class Place {
    /**
     * An array of Meetings Place List items.
     */
    public static final List<Place> FAKE_PLACES = Arrays.asList(
            new Place(1, "Rouge"),
            new Place(2, "Vert"),
            new Place(3, "Bleu"),
            new Place(4, "Cyan"),
            new Place(5, "Violet"),
            new Place(6, "Marron"),
            new Place(7, "Orange"),
            new Place(8, "Jaune"),
            new Place(9, "Rose"),
            new Place(10, "Gris")
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
                new Place(1, "Rouge"),
                new Place(2, "Vert"),
                new Place(3, "Bleu"),
                new Place(4, "Cyan"),
                new Place(5, "Violet"),
                new Place(6, "Marron"),
                new Place(7, "Orange"),
                new Place(8, "Jaune"),
                new Place(9, "Rose"),
                new Place(10, "Gris")
        };
    }

    @Override
    @NonNull
    public String toString() {
        return getName();
    }
}
