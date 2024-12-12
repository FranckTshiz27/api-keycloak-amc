package com.rawsur.apikeycloakusers.routes;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.env.Environment;

public interface Routes {

  public static String BASE_URL_KEYCLAOK = "api/keycloak/user/"; //
  public static String BASE_URL_MY_RAWSUR = "api/keycloak/user/"; //
  public static String BASE_URL_INFO_BIP = "api/keycloak/info-bip/"; //
  public static String BASE_URL_KEYCLOAK_CREDENTIAL = "api/keycloak/credential/"; //

  // URI KEYCLAOK
  public static String GET_USER_BY_REALM = "v1/get-by-realm/{realm}"; //
  public static String GET_USER_BY_REALM_AND_USERNAME = "v1/get-by-realm/{realm}/{username}"; //

  // URI MYRAWSUR
  public static String CREATE_USER = "v1/create/"; //
  public static String CREATE_SETTING = "v1/create/"; //
  public static String CHECK_SETTING = "v1/auth/"; //
  public static String GET_SETTINGS = "v1/find/all/"; //
  public static String CHANGE_PASSWORD_USER = "v1/reset-password/"; //

  public static String OTP_REQUEST = "v1/otp-send/"; //
  public static String OTP_VERIFY = "v1/otp-verify/"; //

  public static String CREATE_USER_KEYCLAOK = "http:// 10.10.10.17:8180/auth/admin/realms/rawsur-test/users";
  public static String GET_TOKEN_KEYCLAOK = "http:// 10.10.10.17:8180/auth/realms/master/protocol/openid-connect/token";
  public static String GET_USER = "http:// 10.10.10.17:9006/api/keycloak/user/";

}
