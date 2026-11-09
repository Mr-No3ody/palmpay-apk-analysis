package com.transsnet.analysis.data.local.database;

import android.content.Context;
import androidx.room.C;
import androidx.room.Database;
import androidx.room.G;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.analysis.data.local.dao.EventsDao;
import com.transsnet.analysis.data.local.entity.EventsEntity;
import com.transsnet.analysis.data.local.migrates.Migrate1To2;

/* JADX INFO: loaded from: classes3.dex */
@Database(entities = {EventsEntity.class}, exportSchema = false, version = 2)
public abstract class EventsDatabase extends G {
    private static volatile EventsDatabase INSTANCE;

    public static EventsDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (EventsDatabase.class) {
                try {
                    if (INSTANCE == null) {
                        C cL = d.l(context.getApplicationContext(), "transsnet_analysis.db", EventsDatabase.class);
                        cL.a(new Migrate1To2(1, 2));
                        INSTANCE = (EventsDatabase) cL.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return INSTANCE;
    }

    public abstract EventsDao eventsDao();
}
