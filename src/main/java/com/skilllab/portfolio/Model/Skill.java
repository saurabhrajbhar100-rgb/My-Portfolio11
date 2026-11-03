
package com.skilllab.portfolio.Model;

public class Skill {

    private String name;
    private String category;

    // Constructor
    public Skill(String name, String category) {
        this.name = name;
        this.category = category;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public String getCategory() {
        return category;
    }

    // Setter
    public void setCategory(String category) {
        this.category = category;
    }
}
