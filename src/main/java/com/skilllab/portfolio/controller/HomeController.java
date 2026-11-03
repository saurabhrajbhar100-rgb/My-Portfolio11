
package com.skilllab.portfolio.controller;

import com.skilllab.portfolio.Model.Skill;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        // ---- Hero Section ----
        model.addAttribute("name", "Saurabh Rajbhar");
        model.addAttribute("title", "Java Backend Developer");
        model.addAttribute("tagline",
                "I build web applications with Java and Spring Boot "
                + "and I'm looking for my first role as a backend developer.");

        // ---- About Section ----
        model.addAttribute("about",
                "I'm a BCA student at SHEAT College of Engineering, "
                + "Varanasi. I enjoy building web applications and "
                + "learning Java and Spring Boot to grow as a backend developer.");

        // ---- Contact Details ----
        model.addAttribute("location", "Azamgarh, India");
        model.addAttribute("email", "saurabhrajbhar100@gmail.com");

        model.addAttribute("github",
                "https://github.com/saurabhrajbhar100-rgb");

        model.addAttribute("linkedin",
                "https://www.linkedin.com/in/saurabh-rajbhar-909ba3263/");

        // ---- Resume ----
        model.addAttribute("resumeUrl",
                "https://drive.google.com/file/d/1x0hj0LEAV-wHpf3mUSJnV7SQ2aTfwOCd/view?usp=drive_link");

        // ---- Skills ----

        List<Skill> skills = new ArrayList<>();

        // Frontend Skills
        skills.add(new Skill("HTML", "Frontend"));
        skills.add(new Skill("CSS", "Frontend"));
        skills.add(new Skill("JavaScript", "Frontend"));
        skills.add(new Skill("Thymeleaf", "Frontend"));

        // Backend Skills
        skills.add(new Skill("Java", "Backend"));
        skills.add(new Skill("Spring Boot", "Backend"));
        skills.add(new Skill("Spring MVC", "Backend"));
        skills.add(new Skill("Spring Data JPA", "Backend"));
        skills.add(new Skill("REST APIs", "Backend"));
        skills.add(new Skill("MySQL", "Backend"));

        // Development Tools
        skills.add(new Skill("Git & GitHub", "Tools"));
        skills.add(new Skill("IntelliJ IDEA", "Tools"));
        skills.add(new Skill("Maven", "Tools"));
        skills.add(new Skill("Postman", "Tools"));

        // ---- Group Skills by Category ----

        Map<String, List<Skill>> skillsByCategory =
                new LinkedHashMap<>();

        for (Skill skill : skills) {

            skillsByCategory.putIfAbsent(
                    skill.getCategory(),
                    new ArrayList<>()
            );

            skillsByCategory.get(skill.getCategory())
                    .add(skill);
        }

        // Send skills to Thymeleaf
        model.addAttribute("skillsByCategory", skillsByCategory);

        return "index";
    }
}
