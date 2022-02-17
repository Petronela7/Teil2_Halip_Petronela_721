package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Team {
    private String name;
    private String projekt;
    private List<Mitarbeiter> mitarbeiters;

    public Team(String name, String projekt) {
        this.name = name;
        this.projekt = projekt;
        this.mitarbeiters = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProjekt() {
        return projekt;
    }

    public void setProjekt(String projekt) {
        this.projekt = projekt;
    }

    public List<Mitarbeiter> getMitarbeiters() {
        return mitarbeiters;
    }

    public void setMitarbeiters(List<Mitarbeiter> mitarbeiters) {
        this.mitarbeiters = mitarbeiters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(name, team.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", projekt='" + projekt + '\'' +
                ", mitarbeiters=" + mitarbeiters +
                '}';
    }
    public void addEmployee(Mitarbeiter mitarbeiter)
    {
        this.mitarbeiters.add(mitarbeiter);
    }
}
