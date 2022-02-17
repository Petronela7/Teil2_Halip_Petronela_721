package controller;

import model.Mitarbeiter;

import java.util.List;


interface MitarbeiterInterface {
    /**
     * Adds an employee to the list
     * @param arbeiter Mitarbeiter
     * @return Mitarbeiter
     */
    public Mitarbeiter addMitarbeiter(Mitarbeiter arbeiter);

    /**
     * Removes  an employee from the list
     * @param name String
     */
    public void deleteMitarbeiter(String name);

    /**
     * Updates the salary of an employee
     * @param name String
     * @param lohn int
     * @return Mitarbeiter
     */
    public Mitarbeiter updateMitarbeiter(String name, int lohn);

    /**
     *
     * @return </Mitarbeiter>
     */
    public List<Mitarbeiter> getAllMitarbeiter();
}
