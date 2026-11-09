package N0;

import C0.G;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d implements SupportSQLiteDatabase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f6032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f6033c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f6034a;

    static {
        new c(null);
        f6032b = new String[]{"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
        f6033c = new String[0];
    }

    public d(SQLiteDatabase delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f6034a = delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void beginTransaction() {
        this.f6034a.beginTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void beginTransactionNonExclusive() {
        this.f6034a.beginTransactionNonExclusive();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void beginTransactionWithListener(SQLiteTransactionListener transactionListener) {
        Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
        this.f6034a.beginTransactionWithListener(transactionListener);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener transactionListener) {
        Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
        this.f6034a.beginTransactionWithListenerNonExclusive(transactionListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6034a.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final SupportSQLiteStatement compileStatement(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f6034a.compileStatement(sql);
        Intrinsics.checkNotNullExpressionValue(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new o(sQLiteStatementCompileStatement);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final int delete(String table, String str, Object[] objArr) {
        Intrinsics.checkNotNullParameter(table, "table");
        StringBuilder sb2 = new StringBuilder("DELETE FROM ");
        sb2.append(table);
        if (str != null && str.length() != 0) {
            sb2.append(" WHERE ");
            sb2.append(str);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = compileStatement(string);
        M0.b.f5705c.bind(supportSQLiteStatementCompileStatement, objArr);
        return ((o) supportSQLiteStatementCompileStatement).f6063c.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void disableWriteAheadLogging() {
        SQLiteDatabase sQLiteDatabase = this.f6034a;
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
        sQLiteDatabase.disableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean enableWriteAheadLogging() {
        return this.f6034a.enableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void endTransaction() {
        this.f6034a.endTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void execPerConnectionSQL(String sql, Object[] objArr) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30) {
            throw new UnsupportedOperationException(G.m(i7, "execPerConnectionSQL is not supported on a SDK version lower than 30, current version is: "));
        }
        b.f6031a.a(this.f6034a, sql, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void execSQL(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.f6034a.execSQL(sql);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final List getAttachedDbs() {
        return this.f6034a.getAttachedDbs();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long getMaximumSize() {
        return this.f6034a.getMaximumSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long getPageSize() {
        return this.f6034a.getPageSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final String getPath() {
        return this.f6034a.getPath();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final int getVersion() {
        return this.f6034a.getVersion();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean inTransaction() {
        return this.f6034a.inTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long insert(String table, int i7, ContentValues values) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        return this.f6034a.insertWithOnConflict(table, null, values, i7);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean isDatabaseIntegrityOk() {
        return this.f6034a.isDatabaseIntegrityOk();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean isDbLockedByCurrentThread() {
        return this.f6034a.isDbLockedByCurrentThread();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean isExecPerConnectionSQLSupported() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean isOpen() {
        return this.f6034a.isOpen();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean isReadOnly() {
        return this.f6034a.isReadOnly();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean isWriteAheadLoggingEnabled() {
        SQLiteDatabase sQLiteDatabase = this.f6034a;
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean needUpgrade(int i7) {
        return this.f6034a.needUpgrade(i7);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor query(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return query(new M0.b(query));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void setForeignKeyConstraintsEnabled(boolean z3) {
        SQLiteDatabase sQLiteDatabase = this.f6034a;
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
        sQLiteDatabase.setForeignKeyConstraintsEnabled(z3);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void setLocale(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.f6034a.setLocale(locale);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void setMaxSqlCacheSize(int i7) {
        this.f6034a.setMaxSqlCacheSize(i7);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long setMaximumSize(long j6) {
        SQLiteDatabase sQLiteDatabase = this.f6034a;
        sQLiteDatabase.setMaximumSize(j6);
        return sQLiteDatabase.getMaximumSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void setPageSize(long j6) {
        this.f6034a.setPageSize(j6);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void setTransactionSuccessful() {
        this.f6034a.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void setVersion(int i7) {
        this.f6034a.setVersion(i7);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final int update(String table, int i7, ContentValues values, String str, Object[] objArr) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = values.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb2 = new StringBuilder("UPDATE ");
        sb2.append(f6032b[i7]);
        sb2.append(table);
        sb2.append(" SET ");
        int i10 = 0;
        for (String str2 : values.keySet()) {
            sb2.append(i10 > 0 ? "," : "");
            sb2.append(str2);
            objArr2[i10] = values.get(str2);
            sb2.append("=?");
            i10++;
        }
        if (objArr != null) {
            for (int i11 = size; i11 < length; i11++) {
                objArr2[i11] = objArr[i11 - size];
            }
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(" WHERE ");
            sb2.append(str);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = compileStatement(string);
        M0.b.f5705c.bind(supportSQLiteStatementCompileStatement, objArr2);
        return ((o) supportSQLiteStatementCompileStatement).f6063c.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean yieldIfContendedSafely() {
        return this.f6034a.yieldIfContendedSafely();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void execSQL(String sql, Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.f6034a.execSQL(sql, bindArgs);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor query(String query, Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        return query(new M0.b(query, bindArgs));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean yieldIfContendedSafely(long j6) {
        return this.f6034a.yieldIfContendedSafely(j6);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor query(SupportSQLiteQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        Cursor cursorRawQueryWithFactory = this.f6034a.rawQueryWithFactory(new a(new K6.h(query, 1), 1), query.getSql(), f6033c, null);
        Intrinsics.checkNotNullExpressionValue(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor query(SupportSQLiteQuery query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        String sql = query.getSql();
        Intrinsics.e(cancellationSignal);
        a cursorFactory = new a(query, 0);
        SQLiteDatabase sQLiteDatabase = this.f6034a;
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
        Intrinsics.checkNotNullParameter(sql, "sql");
        String[] selectionArgs = f6033c;
        Intrinsics.checkNotNullParameter(selectionArgs, "selectionArgs");
        Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
        Intrinsics.checkNotNullParameter(cursorFactory, "cursorFactory");
        Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, sql, selectionArgs, null, cancellationSignal);
        Intrinsics.checkNotNullExpressionValue(cursorRawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return cursorRawQueryWithFactory;
    }
}
