package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements SQLiteEventStore.Function, SQLiteEventStore.Producer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22475b;

    public /* synthetic */ f(Object obj, int i7) {
        this.f22474a = i7;
        this.f22475b = obj;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public Object apply(Object obj) {
        return SQLiteEventStore.lambda$loadMetadata$16((HashMap) this.f22475b, (Cursor) obj);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer
    public Object produce() {
        switch (this.f22474a) {
            case 1:
                return SQLiteEventStore.lambda$ensureBeginTransaction$24((SQLiteDatabase) this.f22475b);
            default:
                return ((SchemaManager) this.f22475b).getWritableDatabase();
        }
    }
}
