package androidx.room;

import androidx.sqlite.db.SupportSQLiteStatement;

/* JADX INFO: renamed from: androidx.room.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1236o extends P {
    public abstract void d(SupportSQLiteStatement supportSQLiteStatement, Object obj);

    public final void e(Object obj) {
        SupportSQLiteStatement supportSQLiteStatementA = a();
        try {
            d(supportSQLiteStatementA, obj);
            supportSQLiteStatementA.executeInsert();
        } finally {
            c(supportSQLiteStatementA);
        }
    }
}
