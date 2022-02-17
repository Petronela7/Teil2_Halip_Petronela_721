package view;

import controller.MitarbeiterCtrl;
import controller.TeamCtrl;
import model.Mitarbeiter;
import model.Team;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * View class that uses the Scanner to receive input from the user
 */
public class View {
    private MitarbeiterCtrl mitarbeiterCtrl;
    private TeamCtrl teamCtrl;

    public View(MitarbeiterCtrl mitarbeiterCtrl, TeamCtrl teamCtrl) {
        this.mitarbeiterCtrl = mitarbeiterCtrl;
        this.teamCtrl = teamCtrl;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        loop:
        while (true) {
            System.out.println("""
                     
                     0. Exit Program \r
                     1. Show all Employees \r
                     2. Show all Teams \r
                     3. Add an employee \r
                     4. Add a team \r
                     5. Remove an employee \r
                     6. Remove a team \r
                     7. Update an employee \r
                     8. Update a team \r
                     9. Add employee to team \r
                     10. Get filtered Teams \r
                    """);
            System.out.println("Enter input: ");
            int variant = scanner.nextInt();
            System.out.println("You've entered: " + variant);
            switch (variant) {
                /*case 0:
                    break loop;
                case 1:
                    showMovies();
                    break;
                case 2:
                    showActors();
                    break;
                case 3:
                    addMovie();
                    break;
                case 4:
                    addActor();
                    break;
                case 5:
                    deleteMovie();
                    break;
                case 6:
                    deleteActor();
                    break;
                case 7:
                    updateMovie();
                    break;
                case 8:
                    updateActor();
                    break;
                case 9:
                    addActorToMovie();
                    break;
                case 10:
                    getTopActors();
                    break;*/
            }

        }
    }


}
