package codeu.chat.common;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import codeu.chat.util.Serializer;
import codeu.chat.util.Serializers;
import codeu.chat.util.Time;
import codeu.chat.util.Uuid;
import java.util.HashSet;
import java.util.Collection;

public class UserInterest {

  public static final Serializer<UserInterest> SERIALIZER = new Serializer<UserInterest>() {

    @Override
    public void write(OutputStream out, UserInterest value) throws IOException {
      Serializer<Collection<Uuid>> serializer = Serializers.collection(Uuid.SERIALIZER);
      serializer.write(out, value.interestedInUsers);
      serializer.write(out, value.interestedInConvos);
    }

    @Override
    public UserInterest read(InputStream in) throws IOException {
      Serializer<Collection<Uuid>> serializer = Serializers.collection(Uuid.SERIALIZER);
      return new UserInterest(
        new HashSet<Uuid>(serializer.read(in)),
        new HashSet<Uuid>(serializer.read(in))
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
