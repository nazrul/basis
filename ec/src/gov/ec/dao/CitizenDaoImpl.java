package gov.ec.dao;

import gov.ec.domain.Citizen;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: nazrul
 * Date: Jan 18, 2011
 * Time: 2:33:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class CitizenDaoImpl  extends HibernateDaoSupport  implements CitizenDao {

    public void save(Citizen citizen) {
        getHibernateTemplate().save(citizen);
    }

    public void delete(Citizen citizen) {
        getHibernateTemplate().delete(citizen);
    }

    public Citizen getCitizenByNationalId(String nationalId) {

         List citizens = getHibernateTemplate().find("FROM Citizen AS citizen WHERE citizen.nationalId = ?", nationalId);
        return citizens.size() == 0
                ? null
                : (Citizen)citizens.get(0);

    }

    public Citizen getCitizenById(int id) {
        return (Citizen) getHibernateTemplate().get(Citizen.class, id);
    }

    public List<Citizen> getCitizenByName(String name) {
        List<Citizen> citizens = getHibernateTemplate().find("FROM Citizen AS citizen WHERE citizen.name = ?", name);

        return citizens;
    }

    public List<Citizen> getCitizenByGender(char gender) {
        List<Citizen> citizens = getHibernateTemplate().find("FROM Citizen AS citizen WHERE citizen.gender = ?", gender);

        return citizens;
    }

    public List<Citizen> getCitizenByCity(String city) {
        List<Citizen> citizens = getHibernateTemplate().find("FROM Citizen AS citizen WHERE citizen.city = ?", city);
        return citizens;
    }
}
