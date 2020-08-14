package com.example.tdplay.repository;

import com.example.tdplay.model.CanData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhiwen.zuo
 * @date 2019-08-05
 **/
@Mapper
@Repository
public interface CanDataDAO {
    /**
     * 插入一条记录。
     *
     * @param subTable
     * @param item
     * @return
     */
    Integer insertOne(String subTable, CanData item);

    /**
     * 导入一条记录
     *
     * @param subTable
     * @param item
     * @return
     */
    Integer importOne(String subTable, CanData item);

    /**
     * 取指定子表最后一条写入记录时间戳。
     *
     * @param subTable
     * @return
     */
    Long selectLastTimestamp(String subTable);

    /**
     * 询指定时间戳的记录是否存在。
     *
     * @param ts
     * @param carrierId
     * @param deviceId
     * @param driverId
     * @return
     */
    List<CanData> selectByFullTag(Long ts, String carrierId, String deviceId, String driverId);

    /**
     * 查找某辆车最后一条Can数据。
     *
     * @param carrierId
     * @return
     */
    @Select("SELECT last_row(*),carrier_id,driver_id,device_id FROM can_data WHERE carrier_id=#{carrierId};")
    @ResultMap("LastCanDataMap")
    CanData queryLastCanData(String carrierId);

    @Select("SELECT last_row(*),carrier_id,driver_id,device_id FROM can_data group by carrier_id;")
    @ResultMap("LastCanDataMap")
    List<CanData> queryAllCarrierLastCan();

    @Select("SELECT last_row(*),carrier_id,driver_id,device_id FROM can_data group by driver_id;")
    @ResultMap("LastCanDataMap")
    List<CanData> queryAllDriverLastCan();

    @Select("SELECT last_row(*),carrier_id,driver_id,device_id FROM can_data group by tbname;")
    @ResultMap("LastCanDataMap")
    List<CanData> queryAllLastCan();
}
