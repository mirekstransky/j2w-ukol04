package cz.czechitas.java2webapps.ukol3.entity;

public class Omerta {
  private String jmeno;
  private String status;
  private String foto;
  private String datum;

  public Omerta(String jmeno, String status, String foto, String datum) {
    this.jmeno = jmeno;
    this.status = status;
    this.foto = foto;
    this.datum = datum;
  }

  public String getDatum() {
    return datum;
  }

  public String getJmeno() {
    return jmeno;
  }
  public String getStatus() {
    return status;
  }
  public String getFoto() {
    return foto;
  }

};