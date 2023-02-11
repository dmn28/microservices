package com.dmn.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
