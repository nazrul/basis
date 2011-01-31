package gov.police.dao;

import gov.police.domain.PoliceRecord;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * User: shahed
 * Date: Jan 24, 2011
 * Time: 1:14:50 PM
 */
public class PoliceRecordDaoImpl extends HibernateDaoSupport implements PoliceRecordDao {

    public PoliceRecord getPoliceRecordByNationalId(String nid) {
        List policeRecords = getHibernateTemplate().find("FROM PoliceRecord AS policeRecord WHERE policeRecord.nationalId = ?", nid);
        return policeRecords.size() == 0
                ? null
                : (PoliceRecord)policeRecords.get(0);
    }
}
