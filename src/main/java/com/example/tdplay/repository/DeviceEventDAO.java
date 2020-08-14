package com.example.tdplay.repository;

import com.example.tdplay.model.DeviceEvent;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhiwen.zuo
 * @date 2019-08-05
 **/
@Mapper
@Repository
public interface DeviceEventDAO {
    /**
     * @param subTable
     * @param carrierId
     * @param deviceId
     * @param driverId
     * @param itemList
     * @return
     */
    Integer bulkInsert(String subTable, String carrierId, String deviceId, String driverId, Integer eventCmdId, List<DeviceEvent> itemList);

    /**
     * 插入一条记录。
     *
     * @param subTable
     * @param item
     * @return
     */
    Integer insertOne(String subTable, DeviceEvent item);

    /**
     * 导入一条记录
     *
     * @param subTable
     * @param item
     * @return
     */
    Integer importOne(String subTable, DeviceEvent item);

    /**
     * 取指定子表最后一条写入记录时间戳。
     *
     * @param subTable
     * @return
     */
    Long selectLastTimestamp(String subTable);

    /**
     * 查询指定时间戳的记录是否存在。
     *
     * @param ts
     * @param carrierId
     * @param deviceId
     * @param driverId
     * @param eventCmdId
     * @return
     */
    List<DeviceEvent> selectByFullTag(Long ts, String carrierId, String deviceId, String driverId, Integer eventCmdId);

    @Select("SELECT last_row(*),carrier_id,driver_id,device_id FROM device_event group by tbname;")
    @ResultMap("LastDeviceEventMap")
    List<DeviceEvent> queryAllLastDeviceEvent();
}
