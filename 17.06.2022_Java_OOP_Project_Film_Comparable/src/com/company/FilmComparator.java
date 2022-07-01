package com.company;

import java.util.Comparator;

public abstract class FilmComparator implements Comparator<Film> {
  private String comparingName;

  public FilmComparator(String comparingName) {
    this.comparingName = comparingName;
  }

  public String getComparingName() {
    return comparingName;
  }

}
