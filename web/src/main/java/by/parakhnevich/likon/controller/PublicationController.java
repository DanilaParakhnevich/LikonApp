package by.parakhnevich.likon.controller;

import by.parakhnevich.likon.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.springframework.http.HttpStatus.OK;

@Controller
@RequestMapping("publications")
public class PublicationController {
    private PublicationService publicationService;

    @GetMapping
    @ResponseStatus(OK)
    public String readByPage(
            @RequestParam Map<String, String> parameters,
            Model model
    ) {
        model.addAttribute("publications", publicationService.readAllBetween(parameters));
        List<Long> pages = new ArrayList<>();
        for (int i = 1; i <= publicationService.readCountOfPages(); i++) {
            pages.add((long) i);
        }
        model.addAttribute("pages", pages);
        return "publications";
    }

    @Autowired
    public void setPublicationService(PublicationService publicationService) {
        this.publicationService = publicationService;
    }
}
