package com.rawsur.apikeycloakusers.httpResponse;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class HttpResponse {

    private int code;
    private String status;
    private String message;
    private Object data;

}
