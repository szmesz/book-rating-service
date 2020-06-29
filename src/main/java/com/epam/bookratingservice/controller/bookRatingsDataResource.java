package com.epam.bookratingservice.controller;

import com.epam.bookratingservice.model.BookRatingsData;
import com.epam.bookratingservice.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/bookratings")
public class bookRatingsDataResource {

    @RequestMapping(value = "/{bookId}", produces={"application/json"})
    public BookRatingsData getRating(@PathVariable("bookId") String bookId) {
        return new BookRatingsData(bookId, "Game Of Thrones", 4);
    }

    @RequestMapping(value = "/users/{userId}", produces={"application/json"})
    public UserRating getUserRatings(@PathVariable("userId") String userId) {
        UserRating userRating = new UserRating();
        userRating.setUserRating(Arrays.asList(
                new BookRatingsData("1", "Game Of Thrones", 3.9),
                new BookRatingsData("2", "Sapiens", 2.5)));
        return userRating;
    }

}
