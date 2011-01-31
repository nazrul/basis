package gov.police.service;

import gov.police.domain.PoliceRecord;

/**
 * Created by IntelliJ IDEA.
 * User: nazrul
 * Date: Jan 20, 2011
 * Time: 4:26:24 PM
 * To change this template use File | Settings | File Templates.
 */
public interface PoliceRecordService {

    public PoliceRecord getPoliceRecordByNID(String nid);

}
