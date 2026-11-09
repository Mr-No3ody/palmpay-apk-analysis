package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements SQLiteEventStore.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SQLiteEventStore f22462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22464d;

    public /* synthetic */ a(SQLiteEventStore sQLiteEventStore, Object obj, Object obj2, int i7) {
        this.f22461a = i7;
        this.f22462b = sQLiteEventStore;
        this.f22463c = obj;
        this.f22464d = obj2;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        switch (this.f22461a) {
            case 0:
                return this.f22462b.lambda$loadClientMetrics$20("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", (HashMap) this.f22463c, (ClientMetrics.Builder) this.f22464d, (SQLiteDatabase) obj);
            case 1:
                return this.f22462b.lambda$loadEvents$14((ArrayList) this.f22463c, (TransportContext) this.f22464d, (Cursor) obj);
            case 2:
                return this.f22462b.lambda$persist$1((EventInternal) this.f22463c, (TransportContext) this.f22464d, (SQLiteDatabase) obj);
            default:
                return this.f22462b.lambda$loadClientMetrics$19((Map) this.f22463c, (ClientMetrics.Builder) this.f22464d, (Cursor) obj);
        }
    }
}
