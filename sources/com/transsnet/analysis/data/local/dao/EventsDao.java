package com.transsnet.analysis.data.local.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.transsnet.analysis.data.local.entity.EventsEntity;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Dao
public interface EventsDao {
    @Delete
    void deleteBatch(List<EventsEntity> deleteData);

    @Insert
    void insert(EventsEntity event);

    @Query("SELECT * FROM events WHERE type == (:type) ORDER BY id DESC LIMIT (:count)")
    List<EventsEntity> query(int type, int count);
}
