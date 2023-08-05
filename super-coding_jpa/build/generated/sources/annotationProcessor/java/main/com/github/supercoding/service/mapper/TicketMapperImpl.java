package com.github.supercoding.service.mapper;

import com.github.supercoding.repository.airlineTicket.AirlineTicket;
import com.github.supercoding.web.dto.airline.Ticket;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-05T00:01:11+0900",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.1.jar, environment: Java 11.0.11 (AdoptOpenJDK)"
)
public class TicketMapperImpl implements TicketMapper {

    @Override
    public Ticket airlineTicketToTicket(AirlineTicket airlineTicket) {
        if ( airlineTicket == null ) {
            return null;
        }

        Ticket ticket = new Ticket();

        ticket.setDepart( airlineTicket.getDepartureLocation() );
        ticket.setArrival( airlineTicket.getArrivalLocation() );
        ticket.setDepartureTime( TicketMapper.localDateTimeToString( airlineTicket.getDepartureAt() ) );
        ticket.setReturnTime( TicketMapper.localDateTimeToString( airlineTicket.getReturnAt() ) );
        ticket.setTicketId( airlineTicket.getTicketId() );

        return ticket;
    }
}
