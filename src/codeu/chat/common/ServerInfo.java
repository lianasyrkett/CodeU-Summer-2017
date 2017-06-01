package codeu.chat.common;

import codeu.chat.util.Uuid;
import java.io.IOException;

public final class ServerInfo {
  private final static String SERVER_VERSION = "1.0.0";

  public final Uuid version;
  public Uuid parseResult;

  public ServerInfo() {
    try {
      parseResult = Uuid.parse(SERVER_VERSION);
    } catch (IOException exception) {
      exception.getMessage();
    }
    version = parseResult;
  }

  public ServerInfo(Uuid version) {
    this.version = version;
  }
}
