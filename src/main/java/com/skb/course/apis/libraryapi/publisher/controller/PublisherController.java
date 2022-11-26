package com.skb.course.apis.libraryapi.publisher.controller;

import com.skb.course.apis.libraryapi.publisher.model.Publisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/publishers")
public class PublisherController {

    @GetMapping(path = "/{publisherId}")
    public Publisher getPublisher(@PathVariable Integer publisherId) {
        return new Publisher(publisherId, "Prentice Hall Publisers", "rentice@email.com", "123-456-789");
    }
}
