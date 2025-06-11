package it.epicode.W6_D3_U2_F.model;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
public class ApiError {
    private HttpStatus status;
    private String message;
    private LocalDateTime dataErrore;

    public ApiError(HttpStatus status) {
        this.status = status;
        this.message = message;
        this.dataErrore = LocalDateTime.now();
    }

}

