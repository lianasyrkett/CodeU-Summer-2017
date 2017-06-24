package codeu.chat.common;

import java.util.HashSet;
import codeu.chat.util.Uuid;

public class UserInterests {

  public HashSet<Uuid> interestedInUsers = new HashSet<>();
  public HashSet<Uuid> interestedInConvos = new HashSet<>();

  public UserInterests(HashSet<Uuid> interestedInUsers, HashSet<Uuid> interestedInConvos) {
    this.interestedInUsers = interestedInUsers;
    this.interestedInConvos = interestedInConvos;
  }

}
