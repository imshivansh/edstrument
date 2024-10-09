package com.example.edstruments.Exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ServerErrorResponse<T> {
    private T errorMessage;
    private T errorIdentificationPararam;

    ServerErrorResponse(T errorMessage,T errorIdentificationPararam){
        this.errorMessage=errorMessage;
        this.errorIdentificationPararam= errorIdentificationPararam;
    }
}
