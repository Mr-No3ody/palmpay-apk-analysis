package androidx.room;

import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class N extends androidx.lifecycle.B {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final G f17730l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p1.d f17731m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f17732n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Callable f17733o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C1227f f17734p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f17735q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f17736r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f17737s;
    public final M t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final M f17738u;

    public N(G database, p1.d container, boolean z3, Callable computeFunction, String[] tableNames) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f17730l = database;
        this.f17731m = container;
        this.f17732n = z3;
        this.f17733o = computeFunction;
        this.f17734p = new C1227f(tableNames, this, 1);
        this.f17735q = new AtomicBoolean(true);
        this.f17736r = new AtomicBoolean(false);
        this.f17737s = new AtomicBoolean(false);
        this.t = new M(this, 0);
        this.f17738u = new M(this, 1);
    }

    @Override // androidx.lifecycle.B
    public final void g() {
        p1.d dVar = this.f17731m;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(this, "liveData");
        ((Set) dVar.f41179c).add(this);
        boolean z3 = this.f17732n;
        G g7 = this.f17730l;
        (z3 ? g7.getTransactionExecutor() : g7.getQueryExecutor()).execute(this.t);
    }

    @Override // androidx.lifecycle.B
    public final void h() {
        p1.d dVar = this.f17731m;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(this, "liveData");
        ((Set) dVar.f41179c).remove(this);
    }
}
