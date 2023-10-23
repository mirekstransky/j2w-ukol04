package cz.czechitas.java2webapps.ukol3.entity;

public class Omerta {
  private String name;
  private String status;
  private String foto;
  private String dateOmerta;

  public Omerta(String name, String status, String foto, String dateOmerta) {
    this.name = name;
    this.status = status;
    this.foto = foto;
    this.dateOmerta = dateOmerta;
  }

  public String getDateOmerta() {
    return dateOmerta;
  }

  public String getName() {
    return name;
  }
  public String getStatus() {
    return status;
  }
  public String getFoto() {
    return foto;
  }

};