package com.java;

public class VideoGame {
    private int ReleaseYear;
    private int Rating;
    private String Title;

    public int getReleaseYear() { return ReleaseYear; }
    public void setReleaseYear(int releaseYear) {
        if (releaseYear < 1958) {
            throw new IllegalArgumentException("Release year must be after 1958!");
        }

        ReleaseYear = releaseYear;
    }

    public int getRating() { return Rating; }
    public void setRating(int rating) {
        if (rating < 1 || rating > 10) {
            throw new IllegalArgumentException("Rating must be between 1 - 10!");
        }

        Rating = rating;
    }

    public String getTitle() { return Title; }
    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title must contain a value!");
        }

        Title = title;
    }

    @Override
    public String toString() {
        return "VideoGame{" + "ReleaseYear=" + ReleaseYear + ", Rating=" + Rating + ", Title='" + Title + '\'' + '}';
    }

    public VideoGame(int releaseYear, int rating, String title) {
        setReleaseYear(releaseYear);
        setRating(rating);
        setTitle(title);
    }
}
