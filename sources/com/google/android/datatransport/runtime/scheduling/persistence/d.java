package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.TransportContext;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements SQLiteEventStore.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22469a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f22470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22471c;

    public /* synthetic */ d(TransportContext transportContext, long j6) {
        this.f22470b = j6;
        this.f22471c = transportContext;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        switch (this.f22469a) {
            case 0:
                return SQLiteEventStore.lambda$recordNextCallTime$7(this.f22470b, (TransportContext) this.f22471c, sQLiteDatabase);
            default:
                return ((SQLiteEventStore) this.f22471c).lambda$cleanUp$12(this.f22470b, sQLiteDatabase);
        }
    }

    public /* synthetic */ d(SQLiteEventStore sQLiteEventStore, long j6) {
        this.f22471c = sQLiteEventStore;
        this.f22470b = j6;
    }
}
