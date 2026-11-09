package com.transsnet.adsdk.data.local.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Dao
public interface AdDao {
    @Query("DELETE FROM ad_detail")
    void deleteAll();

    @Delete
    void deleteBatch(List<AdEntity> users);

    @Query("DELETE FROM ad_detail WHERE ad_id == (:adId)")
    void deleteByAdId(String adId);

    @Query("DELETE FROM ad_detail WHERE ad_slot_id == (:slotId)")
    void deleteBySlotId(String slotId);

    @Query("UPDATE ad_detail SET current_enable = 0 WHERE current_enable = 1")
    void disableAllData();

    @Query("UPDATE ad_detail SET current_enable = 0 WHERE current_enable = 1 AND ad_slot_id == (:slotId)")
    void disableAllData(String slotId);

    @Query("UPDATE ad_detail SET current_enable = 1 WHERE current_enable = 0 AND ad_slot_id == (:slotId)")
    void enableAllData(String slotId);

    @Insert(onConflict = 1)
    void insert(AdEntity event);

    @Query("SELECT * FROM ad_detail ORDER BY update_time DESC LIMIT (:count)")
    List<AdEntity> query(int count);

    @Query("SELECT * FROM ad_detail WHERE ad_slot_id == (:slotId) AND country_code == (:countryCode) ORDER BY update_time DESC LIMIT (:count)")
    List<AdEntity> queryAllIdBySlotIdLimitCount(String slotId, String countryCode, int count);

    @Query("SELECT * FROM ad_detail WHERE ad_id == (:adId)")
    AdEntity queryByAdId(String adId);

    @Query("SELECT * FROM ad_detail WHERE ad_slot_id == (:slotId) AND country_code == (:countryCode) AND current_enable == 1 ORDER BY update_time DESC")
    List<AdEntity> queryBySlotId(String slotId, String countryCode);

    @Query("SELECT * FROM ad_detail WHERE ad_slot_id == (:slotId) AND country_code == (:countryCode) AND current_enable == 1 ORDER BY update_time DESC LIMIT (:count)")
    List<AdEntity> queryBySlotIdLimitCount(String slotId, String countryCode, int count);

    @Query("SELECT * FROM ad_detail WHERE ad_slot_id == (:slotId) AND country_code == (:countryCode) AND current_enable == 1 ORDER BY display_order ASC")
    List<AdEntity> queryBySlotIdWithOrder(String slotId, String countryCode);

    @Update
    void update(AdEntity entity);
}
