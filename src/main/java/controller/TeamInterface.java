package controller;

import model.Mitarbeiter;
import model.Team;

import java.util.List;

interface TeamInterface {
    /**
     * Adds a team to the teams list
     * @param team Team
     * @return Team
     */
    public Team addTeam(Team team);

    /**
     * Deletes a team from the list
     * @param name String
     */
    void deleteTeam(String name);

    /**
     * Updates a team
     * @param name String
     * @param project String
     * @param mitarbeiters List<Mitarbeiter>
     * @return Team
     */
    public Team updateTeam(String name, String project, List<Mitarbeiter> mitarbeiters);

    /**
     * List of all teams
     * @return List<Team>
     */
    public List<Team> getAllTeams();
}
