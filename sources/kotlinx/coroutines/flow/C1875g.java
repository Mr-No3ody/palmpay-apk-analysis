package kotlinx.coroutines.flow;

import Zf.AbstractC0807c;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1875g implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39167a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f39168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.F f39169c;

    public C1875g(C1876h c1876h, kotlin.jvm.internal.F f10, FlowCollector flowCollector) {
        this.f39169c = f10;
        this.f39168b = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        C1874f c1874f;
        C1891x c1891x;
        C1875g c1875g;
        switch (this.f39167a) {
            case 0:
                if (continuation instanceof C1874f) {
                    c1874f = (C1874f) continuation;
                    int i7 = c1874f.f39158c;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        c1874f.f39158c = i7 - Integer.MIN_VALUE;
                    } else {
                        c1874f = new C1874f(this, continuation);
                    }
                } else {
                    c1874f = new C1874f(this, continuation);
                }
                Object obj2 = c1874f.f39156a;
                Ef.a aVar = Ef.a.f2423a;
                int i10 = c1874f.f39158c;
                if (i10 == 0) {
                    androidx.camera.core.impl.utils.executor.g.M(obj2);
                    kotlin.jvm.internal.F f10 = this.f39169c;
                    Object obj3 = f10.f38951a;
                    if (obj3 == AbstractC0807c.f11737b || !Intrinsics.c(obj3, obj)) {
                        f10.f38951a = obj;
                        c1874f.f39158c = 1;
                        if (this.f39168b.emit(obj, c1874f) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.camera.core.impl.utils.executor.g.M(obj2);
                }
                return Unit.f38893a;
            default:
                if (continuation instanceof C1891x) {
                    c1891x = (C1891x) continuation;
                    int i11 = c1891x.f39237d;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c1891x.f39237d = i11 - Integer.MIN_VALUE;
                    } else {
                        c1891x = new C1891x(this, continuation);
                    }
                } else {
                    c1891x = new C1891x(this, continuation);
                }
                Object obj4 = c1891x.f39235b;
                Ef.a aVar2 = Ef.a.f2423a;
                int i12 = c1891x.f39237d;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1875g = c1891x.f39234a;
                    try {
                        androidx.camera.core.impl.utils.executor.g.M(obj4);
                        return Unit.f38893a;
                    } catch (Throwable th) {
                        th = th;
                        c1875g.f39169c.f38951a = th;
                        throw th;
                    }
                }
                androidx.camera.core.impl.utils.executor.g.M(obj4);
                try {
                    FlowCollector flowCollector = this.f39168b;
                    c1891x.f39234a = this;
                    c1891x.f39237d = 1;
                    if (flowCollector.emit(obj, c1891x) == aVar2) {
                        return aVar2;
                    }
                    return Unit.f38893a;
                } catch (Throwable th2) {
                    th = th2;
                    c1875g = this;
                    c1875g.f39169c.f38951a = th;
                    throw th;
                }
        }
    }

    public C1875g(FlowCollector flowCollector, kotlin.jvm.internal.F f10) {
        this.f39168b = flowCollector;
        this.f39169c = f10;
    }
}
