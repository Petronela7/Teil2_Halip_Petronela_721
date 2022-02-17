package controller;

import model.Mitarbeiter;
import model.Team;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TeamCtrl implements TeamInterface{
    private List<Team> teams;
    /**
     * Adds a team to the teams list
     *
     * @param team Team
     * @return Team
     */
    @Override
    public Team addTeam(Team team) {
        if (!teams.contains(team)) {
            teams.add(team);
            return team;
        }
        return null;
    }

    /**
     * Deletes a team from the list
     *
     * @param name String
     */
    @Override
    public void deleteTeam(String name) {
        teams.removeIf(mitarbeiter -> mitarbeiter.getName() == name);

    }

    /**
     * Updates a team
     *
     * @param name         String
     * @param project      String
     * @param mitarbeiters List<Mitarbeiter>
     * @return Team
     */
    @Override
    public Team updateTeam(String name, String project, List<Mitarbeiter> mitarbeiters) {
        for(Team team:teams)
        {
            if(team.getName() == name){
                team.setProjekt(project);
                team.setMitarbeiters(mitarbeiters);
                return team;
            }
        }
        return null;
    }

    /**
     * List of all teams
     *
     * @return List<Team>
     */
    @Override
    public List<Team> getAllTeams() {
        return teams;
    }

    /**
     * Function that filters by  a team member
     * @param mitarbeiter Mitarbeiter
     * @return List</Team>
     */
    public List<Team> filterByTeamMember(Mitarbeiter mitarbeiter)
    {
        List<Team> teams1 = new ArrayList<>();
        teams1 = teams.stream()
                .filter(x->x.getMitarbeiters().contains(mitarbeiter))
                .collect(Collectors.toList());
        return teams1;
    }

}
