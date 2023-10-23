package cz.czechitas.java2webapps.ukol3.entity;

import java.util.Objects;

/**
 * Entita obsahující údaje zobrazené na vizitce.
 */
public class Vizitka {
  private String name;
  private String company;
  private String street;
  private String streetPostCode;
  private String email;
  private String phoneNumber;
  private String web;
  private String status;
  private String foto;

  public Vizitka() {
  }

  public Vizitka(String name, String company, String street, String streetPostCode, String email, String phoneNumber, String web, String status, String foto) {
    this.name = name;
    this.company = company;
    this.street = street;
    this.streetPostCode = streetPostCode;
    this.email = email;
    this.phoneNumber = phoneNumber;
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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = Objects.requireNonNull(name);
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = Objects.requireNonNull(company);
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = Objects.requireNonNull(street);
  }

  public String getStreetPostCode() {
    return streetPostCode;
  }

  public void setStreetPostCode(String streetPostCode) {
    this.streetPostCode = Objects.requireNonNull(streetPostCode);
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getWeb() {
    return web;
  }

  public void setWeb(String web) {
    this.web = web;
  }

  public String getCelaAdresa() {
    if (street == null || streetPostCode == null) {
      return null;
    } else {
      return street + ", " + streetPostCode;
    }
  }
}
