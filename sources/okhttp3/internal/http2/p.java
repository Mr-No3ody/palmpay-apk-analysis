package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends Fg.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ V8.p f40849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f40850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ K f40851g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, V8.p pVar, boolean z3, K k2) {
        super(str, true);
        this.f40849e = pVar;
        this.f40850f = z3;
        this.f40851g = k2;
    }

    @Override // Fg.a
    public final long a() {
        long jA;
        E[] eArr;
        V8.p pVar = this.f40849e;
        boolean z3 = this.f40850f;
        K settings = this.f40851g;
        Intrinsics.checkNotNullParameter(settings, "settings");
        kotlin.jvm.internal.F f10 = new kotlin.jvm.internal.F();
        u uVar = (u) pVar.f10154b;
        synchronized (uVar.f40878Y) {
            synchronized (uVar) {
                try {
                    K k2 = uVar.f40872C;
                    if (!z3) {
                        K k8 = new K();
                        k8.b(k2);
                        k8.b(settings);
                        settings = k8;
                    }
                    f10.f38951a = settings;
                    jA = ((long) settings.a()) - ((long) k2.a());
                    eArr = (jA == 0 || uVar.f40881b.isEmpty()) ? null : (E[]) uVar.f40881b.values().toArray(new E[0]);
                    K k10 = (K) f10.f38951a;
                    Intrinsics.checkNotNullParameter(k10, "<set-?>");
                    uVar.f40872C = k10;
                    uVar.f40890o.c(new n(uVar.f40882c + " onSettings", uVar, f10, 0), 0L);
                    Unit unit = Unit.f38893a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                uVar.f40878Y.a((K) f10.f38951a);
            } catch (IOException e10) {
                uVar.b(e10);
            }
            Unit unit2 = Unit.f38893a;
        }
        if (eArr == null) {
            return -1L;
        }
        for (E e11 : eArr) {
            synchronized (e11) {
                e11.f40781f += jA;
                if (jA > 0) {
                    e11.notifyAll();
                }
                Unit unit3 = Unit.f38893a;
            }
        }
        return -1L;
    }
}
