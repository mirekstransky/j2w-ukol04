package cz.czechitas.java2webapps.ukol3.service;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VizitkaService {
  private final List<Vizitka> seznamVizitek = new ArrayList<>();

  public VizitkaService() {

    seznamVizitek.add(
              new Vizitka(
                      "Ennio Salieri",
                      "Salieri´s mafia",
                      "Little Italy",
                      "Chicago",
                      "boss@salieri.com",
                      null,
                      "www.boss.salieri.com",
                      "image-salieri.jpg")
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
                      "image-frank.jpg")
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
                      "image-vincenzo.jpg")
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
                      "image-tommy.jpg")
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
                    "image-paulie.jpg")
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
                    "image-sam.jpg")
    );



  }

  public List<Vizitka> getAll() {
    return seznamVizitek;
  }

  public Vizitka getById(int id) {
    return seznamVizitek.get(id);
  }

  public void deleteById(int id) {
    seznamVizitek.remove(id);
  }
  public void append(Vizitka vizitka ) {
    seznamVizitek.add(vizitka);
  }
}
