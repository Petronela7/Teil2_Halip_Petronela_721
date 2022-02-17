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
                case 0:
                    break loop;
                case 1:
                    showEmployees();
                    break;
                case 2:
                    showTeams();
                    break;
                case 3:
                    addEmployee();
                    break;
                case 4:
                    addTeam();
                    break;
                case 5:
                    deleteEmployee();
                    break;
                case 6:
                    deleteTeam();
                    break;
                case 7:
                    updateEmployee();
                    break;
                case 8:
                    updateTeam();
                    break;
                case 9:
                    addEmployeeToTeam();
                    break;
                case 10:
                    getFilteredTeams();
                    break;
            }

        }
    }

    private void showEmployees() {
        System.out.println(mitarbeiterCtrl.getAllMitarbeiter());
    }

    private void addEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee name:");
        try {
            String name = scanner.next();
            System.out.println("Enter salary:");
            int salary = scanner.nextInt();
            Mitarbeiter mitarbeiter = new Mitarbeiter(name,salary);
            mitarbeiterCtrl.addMitarbeiter(mitarbeiter);
        } catch (Exception e) {
            throw e;
        }
    }

    private void deleteEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee name:");
        String name= scanner.next();
        mitarbeiterCtrl.deleteMitarbeiter(name);
    }

    private void updateEmployee() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Employee name:");
            String name  = scanner.next();
            System.out.println("Enter Employee Salary");
            scanner.nextLine(); //throw away the \n not consumed by nextInt()
            int salary = scanner.nextInt();
            mitarbeiterCtrl.updateMitarbeiter(name,salary);
        } catch (Exception e) {
            throw e;
        }
    }

    private void showTeams() {
        System.out.println(teamCtrl.getAllTeams());
    }

    private void addTeam() {

    }

    private void deleteTeam() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Team name");
        String name = scanner.next();
        teamCtrl.deleteTeam(name);
    }

    private void updateTeam() {

    }

    private void addEmployeeToTeam() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter team name:");
        try {
            String name1 = scanner.next();
            System.out.println("Enter Employee name:");
            String name2 = scanner.next();
            Mitarbeiter mitarbeiter = mitarbeiterCtrl.findByName(name2);
            Team team = teamCtrl.findByName(name1);
            team.addEmployee(mitarbeiter);

        } catch (Exception e) {
            throw e;
        }
    }

    private void getFilteredTeams(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Mitarbeiter name:");
        String name = scanner.next();
        List<Team> teams = teamCtrl.filterByTeamMember(mitarbeiterCtrl.findByName(name));
        System.out.println(teams);

    }
}
