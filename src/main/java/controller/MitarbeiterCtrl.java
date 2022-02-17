package controller;

import model.Mitarbeiter;

import java.util.ArrayList;
import java.util.List;

public class MitarbeiterCtrl implements MitarbeiterInterface {
    private List<Mitarbeiter> mitarbeiters;

    public MitarbeiterCtrl() {
        mitarbeiters = new ArrayList<>();
    }

    /**
     * Adds an employee to the list
     *
     * @param arbeiter Mitarbeiter
     * @return Mitarbeiter
     */
    @Override
    public Mitarbeiter addMitarbeiter(Mitarbeiter arbeiter) {
        if (!mitarbeiters.contains(arbeiter)) {
            mitarbeiters.add(arbeiter);
            return arbeiter;
        }
        return null;

    }

    /**
     * Removes  an employee from the list
     *
     * @param name String
     */
    @Override
    public void deleteMitarbeiter(String name) {
        mitarbeiters.removeIf(mitarbeiter -> mitarbeiter.getName() == name);

    }

    /**
     * Updates the salary of an employee
     *
     * @param name String
     * @param lohn int
     * @return Mitarbeiter
     */
    @Override
    public Mitarbeiter updateMitarbeiter(String name, int lohn) {
        for(Mitarbeiter mitarbeiter:mitarbeiters)
        {
            if(mitarbeiter.getName() == name){
                mitarbeiter.setLohn(lohn);
                return mitarbeiter;
            }
        }
        return null;

    }

    /**
     * @return </Mitarbeiter>
     */
    @Override
    public List<Mitarbeiter> getAllMitarbeiter() {
        return mitarbeiters;
    }
    public Mitarbeiter findByName(String name)
    {
        for(Mitarbeiter mitarbeiter:mitarbeiters)
            if(mitarbeiter.getName() == name)
                return mitarbeiter;
            return null;
    }
}
