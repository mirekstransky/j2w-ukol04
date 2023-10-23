package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import cz.czechitas.java2webapps.ukol3.service.VizitkaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {
  private final VizitkaService service;
  private final Random random = new Random();
  public static final int randomImage = 10;

  public VizitkaController(VizitkaService service) {
    this.service = service;
  }

  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView result = new ModelAndView("seznam");
    result.addObject("seznam", service.getAll());
    return result;
  }

  @GetMapping("/omerta")
  public ModelAndView omerta() {
    ModelAndView result = new ModelAndView("omerta");
    result.addObject("seznam", service.getAllOmerta());
    return result;
  }
  @GetMapping("/nova")
  public ModelAndView nova() {
    ModelAndView result = new ModelAndView("nova");
    //result.addObject("nova", service.getAll());
    return result;
  }

  @GetMapping("/detail/{id}")
  public ModelAndView detail(@PathVariable int id) {
    ModelAndView result = new ModelAndView("detail");
    result.addObject("vizitka", service.getById(id));
    result.addObject("vizitkaID", id);

    int randomNumber = random.nextInt(randomImage)+1;
    result.addObject("picture", String.format("/images/image-%d.jpg", randomNumber));
    return result;
  }
  @PostMapping("/delete")
  public String delete(int id) {
    service.deleteById(id);
    return "redirect:/omerta";
  }
  @PostMapping("/nova")
  public String addPeople(Vizitka vizitka) {
    service.append(vizitka);
    return "redirect:/";
  };
}
