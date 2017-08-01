package codeu.chat.common;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import codeu.chat.util.Serializer;
import codeu.chat.util.Serializers;
import codeu.chat.util.Time;
import codeu.chat.util.Uuid;
import java.util.HashSet;

public class UserInterest {

  public HashSet<Uuid> interestedInUsers = new HashSet<>();
  public HashSet<Uuid> interestedInConvos = new HashSet<>();

  public UserInterest(HashSet<Uuid> interestedInUsers, HashSet<Uuid> interestedInConvos) {
    this.interestedInUsers = interestedInUsers;
    this.interestedInConvos = interestedInConvos;
  }

}
