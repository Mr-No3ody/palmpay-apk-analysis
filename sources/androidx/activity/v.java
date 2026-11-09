package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f12069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f12072d;

    public v(Executor executor, C0821l reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.f12069a = executor;
        this.f12070b = new Object();
        this.f12072d = new ArrayList();
    }

    public final void a() {
        synchronized (this.f12070b) {
            try {
                this.f12071c = true;
                Iterator it = this.f12072d.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.f12072d.clear();
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
