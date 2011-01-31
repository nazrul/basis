package gov.ec.service;

import gov.ec.dao.CitizenDao;
import gov.ec.domain.Citizen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: nazrul
 * Date: Jan 18, 2011
 * Time: 3:14:18 PM
 * To change this template use File | Settings | File Templates.
 */

public class CitizenServiceImpl implements CitizenService {
    private static final Logger log = LoggerFactory.getLogger(CitizenServiceImpl.class);


    private CitizenDao citizenDao;

    public void setCitizenDao(CitizenDao citizenDao) {
        this.citizenDao = citizenDao;
    }

    public Citizen getCitizenById(int id) {
        return citizenDao.getCitizenById(id);
    }

    public Citizen getCitizenByNationalId(String nationalId) {
        return citizenDao.getCitizenByNationalId(nationalId);
    }

    public void save(Citizen citizen) {
        citizenDao.save(citizen);
    }

    public void delete(Citizen citizen) {
        citizenDao.delete(citizen);
    }

    public List<Citizen> getCitizenByName(String name) {
        return citizenDao.getCitizenByName(name);
    }

    public List<Citizen> getCitizenByGender(char gender) {
        return citizenDao.getCitizenByGender(gender);
    }

    public List<Citizen> getCitizenByCity(String city) {
        return citizenDao.getCitizenByCity(city);
    }
}
