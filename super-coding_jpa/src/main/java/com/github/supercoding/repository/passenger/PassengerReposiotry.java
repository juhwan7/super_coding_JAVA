package com.github.supercoding.repository.passenger;


import java.util.Optional;

public interface PassengerReposiotry {
    Optional<Passenger> findPassengerByUserUserId(Integer userId);
}