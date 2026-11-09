package com.transsnet.palmpay.teller.db.dao;

import Ud.a;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface BillerSearchRecordDao {
    @Query("DELETE FROM biller_search_record WHERE memberId LIKE :memberId")
    int clearSearchHistoryByMemberId(String memberId);

    @Delete
    void delete(a record);

    @Query("DELETE FROM biller_search_record WHERE searchText LIKE :searchText")
    int deleteBySearchText(String searchText);

    @Insert
    long insert(a record);

    @Query("SELECT * FROM biller_search_record WHERE memberId LIKE :memberId Order By updateTime desc limit 10")
    List<a> querySearchRecord(String memberId);

    @Query("SELECT * FROM biller_search_record WHERE searchText LIKE :searchText Order By updateTime desc limit 10")
    List<a> querySearchRecordByText(String searchText);

    @Update
    int update(a record);
}
