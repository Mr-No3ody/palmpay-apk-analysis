package androidx.room;

import C0.C0127t;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f17739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f17740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p355xf.t f17741c;

    public P(G database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f17739a = database;
        this.f17740b = new AtomicBoolean(false);
        this.f17741c = C2131j.b(new C0127t(this, 12));
    }

    public final SupportSQLiteStatement a() {
        G g7 = this.f17739a;
        g7.assertNotMainThread();
        return this.f17740b.compareAndSet(false, true) ? (SupportSQLiteStatement) this.f17741c.getValue() : g7.compileStatement(b());
    }

    public abstract String b();

    public final void c(SupportSQLiteStatement statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        if (statement == ((SupportSQLiteStatement) this.f17741c.getValue())) {
            this.f17740b.set(false);
        }
    }
}
