package main;

import controller.MitarbeiterCtrl;
import controller.TeamCtrl;
import model.Mitarbeiter;
import model.Team;
import view.View;

public class Main {
    public static void main(String[] args) {
        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Ella",200);
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Bianca",400);

        MitarbeiterCtrl mitarbeiterCtrl = new MitarbeiterCtrl();
        mitarbeiterCtrl.addMitarbeiter(mitarbeiter1);
        mitarbeiterCtrl.addMitarbeiter(mitarbeiter2);

        Team team1 = new Team("Buburuza","C++");
        Team team2 = new Team("12c","Java");


        TeamCtrl teamCtrl = new TeamCtrl();
        teamCtrl.addTeam(team1);
        teamCtrl.addTeam(team2);
        View view = new View(mitarbeiterCtrl, teamCtrl);
        view.run();


    }
}
