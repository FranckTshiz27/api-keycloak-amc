package com.rawsur.apikeycloakusers.services.keycloak;

import com.rawsur.apikeycloakusers.model.keyclaok.User;
import com.rawsur.apikeycloakusers.repository.keycloak.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class UserService {
  @Autowired
  private UserRepository userRepository;
  private static final Logger logger = Logger.getLogger(UserService.class.getName());

  @Transactional
  public List<User> findByRealmId(String realm) {
    List<User> users = this.userRepository.findByRealmId(realm);
    users = users.stream()
        .filter(user -> user.getFirstname() != null || user.getLastname() != null)
        .collect(Collectors.toList());
    return users;
  }

  @Transactional
  public User findByRealmIdAndUsername(String realm, String username) {
    return this.userRepository.findByRealmIdAndUsername(realm, username);
  }
}
