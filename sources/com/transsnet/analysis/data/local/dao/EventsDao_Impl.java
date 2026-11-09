package com.transsnet.analysis.data.local.dao;

import Td.a;
import Td.b;
import android.database.Cursor;
import androidx.camera.core.impl.utils.executor.g;
import androidx.room.AbstractC1235n;
import androidx.room.AbstractC1236o;
import androidx.room.G;
import androidx.room.L;
import com.google.firebase.messaging.Constants;
import com.transsnet.analysis.data.local.entity.EventsEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class EventsDao_Impl implements EventsDao {
    private final G __db;
    private final AbstractC1235n __deletionAdapterOfEventsEntity;
    private final AbstractC1236o __insertionAdapterOfEventsEntity;

    public EventsDao_Impl(G __db) {
        this.__db = __db;
        this.__insertionAdapterOfEventsEntity = new a(__db, 10, false);
        this.__deletionAdapterOfEventsEntity = new b(__db, 7, false);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.transsnet.analysis.data.local.dao.EventsDao
    public void deleteBatch(final List<EventsEntity> deleteData) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfEventsEntity.f(deleteData);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.transsnet.analysis.data.local.dao.EventsDao
    public void insert(final EventsEntity event) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfEventsEntity.e(event);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.transsnet.analysis.data.local.dao.EventsDao
    public List<EventsEntity> query(final int type, final int count) {
        L lAcquire = L.f17714j.acquire("SELECT * FROM events WHERE type == (?) ORDER BY id DESC LIMIT (?)", 2);
        lAcquire.bindLong(1, type);
        lAcquire.bindLong(2, count);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(this.__db, lAcquire, false);
        try {
            int iK = g.k(cursorK, "id");
            int iK2 = g.k(cursorK, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            int iK3 = g.k(cursorK, "create_time");
            int iK4 = g.k(cursorK, "type");
            ArrayList arrayList = new ArrayList(cursorK.getCount());
            while (cursorK.moveToNext()) {
                EventsEntity eventsEntity = new EventsEntity();
                eventsEntity.f25682id = cursorK.getLong(iK);
                if (cursorK.isNull(iK2)) {
                    eventsEntity.data = null;
                } else {
                    eventsEntity.data = cursorK.getString(iK2);
                }
                eventsEntity.create_time = cursorK.getLong(iK3);
                eventsEntity.type = cursorK.getInt(iK4);
                arrayList.add(eventsEntity);
            }
            return arrayList;
        } finally {
            cursorK.close();
            lAcquire.release();
        }
    }
}
