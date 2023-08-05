package com.github.supercoding.web.advice;

import com.github.supercoding.service.exceptions.InvalidValueException;
import com.github.supercoding.service.exceptions.NotAcceptException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class ExceptionControllerAdvice {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ChangeSetPersister.NotFoundException.class)
    public String handleNotFoundException(ChangeSetPersister.NotFoundException nfe) {
        log.error("Client 요청 이후 DB 검색 중 에러로 다음처럼 출력합니다."+nfe.getMessage());
        return nfe.getMessage();

    }

    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    @ExceptionHandler(NotAcceptException.class)
    public String handleNotAcceptException(NotAcceptException nfe) {
        log.error("Client 요청이 모종의 이유로 거부됩니다."+nfe.getMessage());
        return nfe.getMessage();
    }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(InvalidValueException.class)
    public String handleInvalidValueException(InvalidValueException nfe) {
        log.error("Client 요청에 문제가 있어 다음처럼 출력합니다."+nfe.getMessage());
        return nfe.getMessage();
    }
}
