package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.TransportContext;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements SQLiteEventStore.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SQLiteEventStore f22467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22468c;

    public /* synthetic */ c(SQLiteEventStore sQLiteEventStore, Object obj, int i7) {
        this.f22466a = i7;
        this.f22467b = sQLiteEventStore;
        this.f22468c = obj;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        switch (this.f22466a) {
            case 0:
                return this.f22467b.lambda$hasPendingEventsFor$6((TransportContext) this.f22468c, sQLiteDatabase);
            case 1:
                return this.f22467b.lambda$loadBatch$8((TransportContext) this.f22468c, sQLiteDatabase);
            default:
                return this.f22467b.lambda$recordFailure$4((String) this.f22468c, "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", sQLiteDatabase);
        }
    }
}
