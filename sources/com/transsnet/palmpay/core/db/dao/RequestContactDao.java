package com.transsnet.palmpay.core.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.transsnet.palmpay.core.db.entity.RequestContact;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Dao
public interface RequestContactDao {
    @Delete
    int delete(RequestContact user);

    @Query("DELETE FROM request_contacts WHERE own_member_id = :ownMemberId AND contact_member_id = :contactMemberId")
    int deleteContactByMemberId(String ownMemberId, String contactMemberId);

    @Insert(onConflict = 1)
    long insert(RequestContact contact);

    @Query("SELECT * FROM request_contacts WHERE own_member_id = :memberId Order By create_time desc")
    List<RequestContact> queryRequestContactList(String memberId);

    @Query("SELECT * FROM request_contacts WHERE own_member_id = :memberId AND create_time > :lastTime Order By create_time desc")
    List<RequestContact> queryRequestContactList(String memberId, long lastTime);

    @Update
    int update(RequestContact user);
}
