package cz.czechitas.java2webapps.ukol3.service;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import cz.czechitas.java2webapps.ukol3.entity.Omerta;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

@Service
public class VizitkaService {
  private final List<Omerta> omerta = new ArrayList<>();
  private final List<Vizitka> seznamVizitek = new ArrayList<>();
  public VizitkaService() {

    seznamVizitek.add(
              new Vizitka(
                      "Ennio Salieri",
                      "Salieri´s mafia",
                      "Little Italy",
                      null,
                      "boss@salieri.com",
                      null,
                      "www.boss.salieri.com",
                      "Padrino", "image-salieri.jpg")
    );
      seznamVizitek.add(
              new Vizitka(
                      "Frank Colletti",
                      "Salieri´s mafia",
                      "Little Italy",
                      "Chicago",
                      "frank@salieri.com",
                      null,
                      "www.frank.salieri.com",
                      "Consigliere", "image-frank.jpg")
      );
    seznamVizitek.add(
              new Vizitka(
                      "Vincenzo Ricci",
                      "Salieri´s mafia",
                      "Little Italy",
                      "Chicago",
                      null,
                      null,
                      "www.vincenzo.salieri.com",
                      "Esperto di armi", "image-vincenzo.jpg")
    );
      seznamVizitek.add(

              new Vizitka(
                      "Thomas Angelo",
                      "Salieri´s mafia",
                      "Little Italy",
                      "Chicago",
                      "tommy@salieri.com",
                      "+800123456",
                      "www.tommy.salieri.com",
                      "Soldato", "image-tommy.jpg")
      );
    seznamVizitek.add(
            new Vizitka(
                    "Paulie Lombardo",
                    "Salieri´s mafia",
                    "Little Italy",
                    "Chicago",
                    "paulie@salieri.com",
                    "+800123456",
                    "www.paulie.salieri.com",
                    "Soldato", "image-paulie.jpg")
    );
    seznamVizitek.add(
            new Vizitka(
                    "Sam Trapani",
                    "Salieri´s mafia",
                    "Little Italy",
                    "Chicago",
                    "sam@salieri.com",
                    "+800123456",
                    "www.sam.salieri.com",
                    "Caporegime", "image-sam.jpg")
    );
  }

  public List<Vizitka> getAll() {
    return seznamVizitek;
  }
  public List<Omerta> getAllOmerta() {
    return omerta;
  }

  public Vizitka getById(int id) {
    return seznamVizitek.get(id);
  }
  public void deleteById(int id) {

    long currentTime = System.currentTimeMillis();
    Date date = new Date(currentTime);

    omerta.add(
            new Omerta(
                    seznamVizitek.get(id).getName(),
                    seznamVizitek.get(id).getStatus(),
                    seznamVizitek.get(id).getFoto(), date.toString()));

    seznamVizitek.remove(id);

  }
  public void append(Vizitka vizitka) {
    if (!vizitka.getName().isEmpty()) {
      checkValues(vizitka);
      seznamVizitek.add(vizitka);
      vizitka.setFoto("unknown.jpg");
    }
  }
  public void checkValues(Vizitka vizitka){
    String unknown = "Unknown";
    if (vizitka.getCompany().isEmpty()){
      vizitka.setCompany(unknown);
    }
    if (vizitka.getStreet().isEmpty()){
      vizitka.setStreet(unknown);
    }
    if (vizitka.getStreetPostCode().isEmpty()){
      vizitka.setStreetPostCode(unknown);
    }
    if (vizitka.getEmail().isEmpty()){
      vizitka.setEmail(unknown);
    }
    if (vizitka.getPhoneNumber().isEmpty()){
      vizitka.setPhoneNumber(unknown);
    }
    if (vizitka.getWeb().isEmpty()){
      vizitka.setWeb(unknown);
    }
    if (vizitka.getStatus().isEmpty()){
      vizitka.setStatus(unknown);
    }
  }
}
