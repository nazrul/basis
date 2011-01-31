package gov.ec.dao;

import gov.ec.domain.Citizen;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: nazrul
 * Date: Jan 18, 2011
 * Time: 2:32:59 PM
 * To change this template use File | Settings | File Templates.
 */
public interface CitizenDao {

    public Citizen getCitizenById(int id);

    public Citizen getCitizenByNationalId(String nationalId);

    public void save(Citizen citizen);

    public void delete(Citizen citizen);

    public List<Citizen> getCitizenByName(String name);

    public List<Citizen> getCitizenByGender(char gender);

    public List<Citizen> getCitizenByCity(String city);
}
