package de.benjaminborbe.bot.highrise;

import java.io.Serializable;

public class Config implements Serializable {

  private static final long serialVersionUID = -2440985182111371116L;

  private String authUser;

  private String authPassword;

  public String getAuthUrl() {
    return authUrl;
  }

  public void setAuthUrl(final String authUrl) {
    this.authUrl = authUrl;
  }

  private String authUrl;

  public void setAuthPassword(final String authPassword) {
    this.authPassword = authPassword;
  }

  public String getAuthUser() {
    return authUser;
  }

  public void setAuthUser(final String authUser) {
    this.authUser = authUser;
  }

  public String getAuthPassword() {
    return authPassword;
  }

}
