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

  public static final Serializer<UserInterest> SERIALIZER = new Serializer<UserInterest>() {

    @Override
    public void write(OutputStream out, UserInterest value) throws IOException {

      Serializers.HashSet.write(out, value.interestedInUsers);
      Serializers.HashSet.write(out, value.interestedInConvos);
    }

    @Override
    public UserInterest read(InputStream in) throws IOException {

      return new User(
          Serializers.HashSet.read(in),
          Serializers.HashSet.read(in)
      );

    }
  };

  public HashSet<Uuid> interestedInUsers = new HashSet<>();
  public HashSet<Uuid> interestedInConvos = new HashSet<>();

  public UserInterest(HashSet<Uuid> interestedInUsers, HashSet<Uuid> interestedInConvos) {
    this.interestedInUsers = interestedInUsers;
    this.interestedInConvos = interestedInConvos;
  }

}
