package gov.police.dao;

import gov.police.domain.PoliceRecord;

/**
 * User: shahed
 * Date: Jan 24, 2011
 * Time: 1:13:49 PM
 */
public interface PoliceRecordDao {
    public PoliceRecord getPoliceRecordByNationalId(String nid);
}
