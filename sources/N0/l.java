package N0;

import C0.C0127t;
import android.content.Context;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes.dex */
public final class l implements SupportSQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M0.d f6056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f6059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6060g;

    static {
        new e(null);
    }

    public l(Context context, String str, M0.d callback, boolean z3, boolean z8) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f6054a = context;
        this.f6055b = str;
        this.f6056c = callback;
        this.f6057d = z3;
        this.f6058e = z8;
        this.f6059f = C2131j.b(new C0127t(this, 6));
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t tVar = this.f6059f;
        if (tVar.isInitialized()) {
            ((k) tVar.getValue()).close();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final String getDatabaseName() {
        return this.f6055b;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final SupportSQLiteDatabase getReadableDatabase() {
        return ((k) this.f6059f.getValue()).a(false);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final SupportSQLiteDatabase getWritableDatabase() {
        return ((k) this.f6059f.getValue()).a(true);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final void setWriteAheadLoggingEnabled(boolean z3) {
        t tVar = this.f6059f;
        if (tVar.isInitialized()) {
            k sQLiteOpenHelper = (k) tVar.getValue();
            Intrinsics.checkNotNullParameter(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z3);
        }
        this.f6060g = z3;
    }
}
