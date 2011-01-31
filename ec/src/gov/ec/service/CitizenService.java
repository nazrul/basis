package gov.ec.service;

import gov.ec.domain.Citizen;


import java.util.List;

/**
 * @author misbah
 */
public interface CitizenService {

     public Citizen getCitizenById(int id);

    public Citizen getCitizenByNationalId(String nationalId);

    public void save(Citizen citizen);

    public void delete(Citizen citizen);

    public List<Citizen> getCitizenByName(String name);

    public List<Citizen> getCitizenByGender(char gender);

    public List<Citizen> getCitizenByCity(String city);
}