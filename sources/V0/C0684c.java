package V0;

import Wf.AbstractC0774s;
import androidx.core.util.Consumer;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: V0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0684c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f9920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC0774s f9921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f9922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0697p f9923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0697p f9924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0697p f9925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p045d3.k f9926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Consumer f9927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Consumer f9928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f9929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f9930k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f9931l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f9932m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f9933n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0697p f9934o;

    static {
        new C0683b(null);
    }

    public C0684c(p279s5.d builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f9920a = AbstractC0686e.a(false);
        this.f9921b = Wf.I.f10809a;
        this.f9922c = AbstractC0686e.a(true);
        this.f9923d = new C0697p();
        this.f9924e = C0697p.f9960a;
        this.f9925f = C0697p.f9961b;
        this.f9926g = new p045d3.k((byte) 0, 16);
        this.f9929j = 4;
        this.f9930k = Integer.MAX_VALUE;
        this.f9932m = 20;
        this.f9927h = (Consumer) builder.f42025b;
        this.f9928i = (Consumer) builder.f42026c;
        this.f9931l = 8;
        this.f9933n = true;
        this.f9934o = new C0697p();
    }
}
