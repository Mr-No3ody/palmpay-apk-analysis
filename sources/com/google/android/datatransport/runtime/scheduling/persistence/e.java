package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements SQLiteEventStore.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SQLiteEventStore f22473b;

    public /* synthetic */ e(SQLiteEventStore sQLiteEventStore, int i7) {
        this.f22472a = i7;
        this.f22473b = sQLiteEventStore;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        switch (this.f22472a) {
            case 0:
                return this.f22473b.lambda$resetClientMetrics$23((SQLiteDatabase) obj);
            case 1:
                return this.f22473b.lambda$cleanUp$11((Cursor) obj);
            default:
                return this.f22473b.lambda$recordFailure$3((Cursor) obj);
        }
    }
}
