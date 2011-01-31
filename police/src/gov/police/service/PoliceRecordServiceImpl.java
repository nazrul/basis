package gov.police.service;

import gov.ec.ws.Citizen;
import gov.ec.ws.NIDService;
import gov.police.dao.PoliceRecordDao;
import gov.police.domain.PoliceRecord;

import javax.xml.datatype.XMLGregorianCalendar;
import java.sql.Date;

/**
 * Created by IntelliJ IDEA.
 * User: nazrul
 * Date: Jan 20, 2011
 * Time: 4:26:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class PoliceRecordServiceImpl implements PoliceRecordService {

    private NIDService nIDServiceClient;
    private PoliceRecordDao policeRecordDao;

    public void setPoliceRecordDao(PoliceRecordDao policeRecordDao) {
        this.policeRecordDao = policeRecordDao;
    }

    public void setnIDServiceClient(NIDService nIDServiceClient) {
        this.nIDServiceClient = nIDServiceClient;
    }

    public PoliceRecord getPoliceRecordByNID(String nid) {

        Citizen c = nIDServiceClient.getCitizenByNationalId(nid);

        PoliceRecord policeRec = policeRecordDao.getPoliceRecordByNationalId(nid);

        policeRec.setName(c.getName());
        policeRec.setNationalId(c.getNationalId());
        policeRec.setDateOfBirth(c.getDateOfBirth().toGregorianCalendar().getTime());
        policeRec.setAddress(c.getAddress());
        policeRec.setGender(c.getGender());

        return policeRec;
    }
}
