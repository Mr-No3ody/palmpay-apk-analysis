package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements SQLiteEventStore.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f22480b;

    public /* synthetic */ h(long j6, int i7) {
        this.f22479a = i7;
        this.f22480b = j6;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        switch (this.f22479a) {
            case 0:
                return SQLiteEventStore.lambda$getTimeWindow$22(this.f22480b, (SQLiteDatabase) obj);
            default:
                return SQLiteEventStore.lambda$getTimeWindow$21(this.f22480b, (Cursor) obj);
        }
    }
}
