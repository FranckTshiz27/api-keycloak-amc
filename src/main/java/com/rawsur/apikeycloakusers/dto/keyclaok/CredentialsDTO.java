package com.rawsur.apikeycloakusers.dto.keyclaok;

import lombok.Data;

@Data
public class CredentialsDTO {

  private String type="password";
  private String value;
  private boolean temporary=false;

}
