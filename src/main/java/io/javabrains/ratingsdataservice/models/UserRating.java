package io.javabrains.ratingsdataservice.models;

import java.util.Arrays;
import java.util.List;

public class UserRating {
    private List<Rating> userRating;
    private String userId;

    public List<Rating> getUserRating() {
        return userRating;
    }

    public void setUserRating(List<Rating> ratingsList) {
        this.userRating = ratingsList;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void initData(String userId) {
        this.setUserId(userId);
        this.setUserRating(Arrays.asList(
                new Rating("10", 3),
                new Rating("20", 4)
        ));
    }


}
