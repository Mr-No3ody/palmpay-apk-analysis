package androidx.work.impl;

import androidx.work.Clock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.work.impl.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1268a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clock f18395a;

    public C1268a(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f18395a = clock;
    }

    public final void a(N0.d db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.beginTransaction();
        try {
            db2.execSQL("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (this.f18395a.currentTimeMillis() - p.f18668a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            db2.setTransactionSuccessful();
        } finally {
            db2.endTransaction();
        }
    }
}
