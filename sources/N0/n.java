package N0;

import android.database.sqlite.SQLiteProgram;
import androidx.room.L;
import androidx.sqlite.db.SupportSQLiteProgram;
import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class n implements SupportSQLiteProgram {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6061a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Closeable f6062b;

    public n(SQLiteProgram delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f6062b = delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindBlob(int i7, byte[] value) {
        switch (this.f6061a) {
            case 0:
                Intrinsics.checkNotNullParameter(value, "value");
                ((SQLiteProgram) this.f6062b).bindBlob(i7, value);
                break;
            default:
                Intrinsics.checkNotNullParameter(value, "value");
                ((L) this.f6062b).bindBlob(i7, value);
                break;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindDouble(int i7, double d2) {
        switch (this.f6061a) {
            case 0:
                ((SQLiteProgram) this.f6062b).bindDouble(i7, d2);
                break;
            default:
                ((L) this.f6062b).bindDouble(i7, d2);
                break;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindLong(int i7, long j6) {
        switch (this.f6061a) {
            case 0:
                ((SQLiteProgram) this.f6062b).bindLong(i7, j6);
                break;
            default:
                ((L) this.f6062b).bindLong(i7, j6);
                break;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindNull(int i7) {
        switch (this.f6061a) {
            case 0:
                ((SQLiteProgram) this.f6062b).bindNull(i7);
                break;
            default:
                ((L) this.f6062b).bindNull(i7);
                break;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindString(int i7, String value) {
        switch (this.f6061a) {
            case 0:
                Intrinsics.checkNotNullParameter(value, "value");
                ((SQLiteProgram) this.f6062b).bindString(i7, value);
                break;
            default:
                Intrinsics.checkNotNullParameter(value, "value");
                ((L) this.f6062b).bindString(i7, value);
                break;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void clearBindings() {
        switch (this.f6061a) {
            case 0:
                ((SQLiteProgram) this.f6062b).clearBindings();
                break;
            default:
                ((L) this.f6062b).clearBindings();
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f6061a) {
            case 0:
                ((SQLiteProgram) this.f6062b).close();
                break;
            default:
                ((L) this.f6062b).getClass();
                break;
        }
    }

    public n(L l5) {
        this.f6062b = l5;
    }
}
