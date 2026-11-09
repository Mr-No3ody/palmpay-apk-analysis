package N0;

import android.database.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o extends n implements SupportSQLiteStatement {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SQLiteStatement f6063c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(SQLiteStatement delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f6063c = delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final void execute() {
        this.f6063c.execute();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final long executeInsert() {
        return this.f6063c.executeInsert();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final int executeUpdateDelete() {
        return this.f6063c.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final long simpleQueryForLong() {
        return this.f6063c.simpleQueryForLong();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final String simpleQueryForString() {
        return this.f6063c.simpleQueryForString();
    }
}
