package com.example.tdplay.repository;

import com.example.tdplay.model.GpsData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhiwen.zuo
 * @date 2019-08-07
 **/
@Mapper
@Repository
public interface GpsDataDAO {
    /**
     * 批量插入。
     *
     * @param subTable
     * @param carrierId
     * @param deviceId
     * @param driverId
     * @param itemList
     * @return
     */
    int bulkInsert(String subTable, String carrierId, String deviceId, String driverId, List<GpsData> itemList);

    /**
     * 插入一条记录。
     *
     * @param subTable
     * @param item
     * @return
     */
    Integer insertOne(String subTable, GpsData item);

    /**
     * 导入一条记录
     *
     * @param subTable
     * @param item
     * @return
     */
    Integer importOne(String subTable, GpsData item);

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
    List<GpsData> selectByFullTag(Long ts, String carrierId, String deviceId, String driverId);

    /**
     * 根据CarrierId获取最后一条GPS数据。
     * @param carrierId
     * @return
     */
    @Select("SELECT last_row(*),carrier_id,driver_id,device_id FROM gps_data WHERE carrier_id=#{carrierId};")
    @ResultMap("LastGpsDataMap")
    GpsData queryLastGpsData(String carrierId);

    @Select("SELECT last_row(*),carrier_id,driver_id,device_id FROM gps_data group by carrier_id;")
    @ResultMap("LastGpsDataMap")
    List<GpsData> queryAllCarrierLastGpsData();

    @Select("SELECT last_row(*),carrier_id,driver_id,device_id FROM gps_data group by tbname;")
    @ResultMap("LastGpsDataMap")
    List<GpsData> queryAllLastGps();
}
