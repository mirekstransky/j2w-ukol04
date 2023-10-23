package cz.czechitas.java2webapps.ukol3.entity;

import java.util.Objects;

/**
 * Entita obsahující údaje zobrazené na vizitce.
 */
public class Vizitka {
  private String jmeno;
  private String firma;
  private String ulice;
  private String obecPsc;
  private String email;
  private String telefon;
  private String web;
  private String status;
  private String foto;

  public Vizitka() {
  }

  public Vizitka(String jmeno, String firma, String ulice, String obecPsc, String email, String telefon, String web, String status, String foto) {
    this.jmeno = jmeno;
    this.firma = firma;
    this.ulice = ulice;
    this.obecPsc = obecPsc;
    this.email = email;
    this.telefon = telefon;
    this.web = web;
    this.status = status;
    this.foto = foto;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getFoto() {
    return foto;
  }

  public void setFoto(String foto) {
    this.foto = foto;
  }

  public String getJmeno() {
    return jmeno;
  }

  public void setJmeno(String jmeno) {
    this.jmeno = Objects.requireNonNull(jmeno);
  }

  public String getFirma() {
    return firma;
  }

  public void setFirma(String firma) {
    this.firma = Objects.requireNonNull(firma);
  }

  public String getUlice() {
    return ulice;
  }

  public void setUlice(String ulice) {
    this.ulice = Objects.requireNonNull(ulice);
  }

  public String getObecPsc() {
    return obecPsc;
  }

  public void setObecPsc(String obecPsc) {
    this.obecPsc = Objects.requireNonNull(obecPsc);
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTelefon() {
    return telefon;
  }

  public void setTelefon(String telefon) {
    this.telefon = telefon;
  }

  public String getWeb() {
    return web;
  }

  public void setWeb(String web) {
    this.web = web;
  }

  public String getCelaAdresa() {
    if (ulice == null || obecPsc == null) {
      return null;
    } else {
      return ulice + ", " + obecPsc;
    }
//    return ulice + ", " + obecPsc;
  }
}
