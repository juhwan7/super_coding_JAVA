package com.github.supercoding.web.controller;

import com.github.supercoding.service.AirReservationService;
import com.github.supercoding.service.exceptions.NotFoundException;
import com.github.supercoding.web.dto.airline.ReservationRequest;
import com.github.supercoding.web.dto.airline.ReservationResult;
import com.github.supercoding.web.dto.airline.Ticket;
import com.github.supercoding.web.dto.airline.TicketResponse;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/v1/api/air-reservation")
public class AirReservationController {

    private AirReservationService airReservationService;

    public AirReservationController(AirReservationService airReservationService) {
        this.airReservationService = airReservationService;
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public String handleNotFoundException(NotFoundException nfe) {
        log.error("Client 요청이후 DB 검색 중 에러로 다음처럼 출력합니다." + nfe.getMessage());
        return nfe.getMessage();
    }

    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    @GetMapping("/tickets")
    public TicketResponse findAirlineTickets(@RequestParam("user-Id") Integer userId,
                                             @RequestParam("airline-ticket-type") String ticketType) {
        List<Ticket> tickets = airReservationService.findUserFavoritePlaceTickets(userId, ticketType);
        return new TicketResponse(tickets);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/reservations")
    public ReservationResult makeReservation(@RequestBody ReservationRequest reservationRequest) {
        return airReservationService.makeReservation(reservationRequest);
    }
}

