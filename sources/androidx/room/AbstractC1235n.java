package androidx.room;

import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.room.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1235n extends P {
    public abstract void d(SupportSQLiteStatement supportSQLiteStatement, Object obj);

    public final int e(Object obj) {
        SupportSQLiteStatement supportSQLiteStatementA = a();
        try {
            d(supportSQLiteStatementA, obj);
            return supportSQLiteStatementA.executeUpdateDelete();
        } finally {
            c(supportSQLiteStatementA);
        }
    }

    public final void f(List entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementA = a();
        try {
            Iterator it = entities.iterator();
            while (it.hasNext()) {
                d(supportSQLiteStatementA, it.next());
                supportSQLiteStatementA.executeUpdateDelete();
            }
            c(supportSQLiteStatementA);
        } catch (Throwable th) {
            c(supportSQLiteStatementA);
            throw th;
        }
    }
}
