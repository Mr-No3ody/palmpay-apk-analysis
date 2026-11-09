package androidx.room;

import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.util.Arrays;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class L implements SupportSQLiteQuery, SupportSQLiteProgram {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final K f17714j = new K(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final TreeMap f17715o = new TreeMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile String f17717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f17718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double[] f17719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f17720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[][] f17721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f17722g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17723i;

    public L(int i7) {
        this.f17716a = i7;
        int i10 = i7 + 1;
        this.f17722g = new int[i10];
        this.f17718c = new long[i10];
        this.f17719d = new double[i10];
        this.f17720e = new String[i10];
        this.f17721f = new byte[i10][];
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindBlob(int i7, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f17722g[i7] = 5;
        this.f17721f[i7] = value;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindDouble(int i7, double d2) {
        this.f17722g[i7] = 3;
        this.f17719d[i7] = d2;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindLong(int i7, long j6) {
        this.f17722g[i7] = 2;
        this.f17718c[i7] = j6;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindNull(int i7) {
        this.f17722g[i7] = 1;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindString(int i7, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f17722g[i7] = 4;
        this.f17720e[i7] = value;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final void bindTo(SupportSQLiteProgram statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        int i7 = this.f17723i;
        if (1 > i7) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.f17722g[i10];
            if (i11 == 1) {
                statement.bindNull(i10);
            } else if (i11 == 2) {
                statement.bindLong(i10, this.f17718c[i10]);
            } else if (i11 == 3) {
                statement.bindDouble(i10, this.f17719d[i10]);
            } else if (i11 == 4) {
                String str = this.f17720e[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.bindString(i10, str);
            } else if (i11 == 5) {
                byte[] bArr = this.f17721f[i10];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.bindBlob(i10, bArr);
            }
            if (i10 == i7) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void clearBindings() {
        Arrays.fill(this.f17722g, 1);
        Arrays.fill(this.f17720e, (Object) null);
        Arrays.fill(this.f17721f, (Object) null);
        this.f17717b = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final int getArgCount() {
        return this.f17723i;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final String getSql() {
        String str = this.f17717b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void release() {
        TreeMap treeMap = f17715o;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f17716a), this);
            f17714j.prunePoolLocked$room_runtime_release();
            Unit unit = Unit.f38893a;
        }
    }
}
