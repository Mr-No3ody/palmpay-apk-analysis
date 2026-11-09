package androidx.work.impl.constraints;

import C0.C0126s;
import C0.C0127t;
import V0.C;
import V0.C0689h;
import Wf.AbstractC0780y;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0689h f18489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f18490d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C0689h c0689h, h hVar, Continuation continuation) {
        super(2, continuation);
        this.f18489c = c0689h;
        this.f18490d = hVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        g gVar = new g(this.f18489c, this.f18490d, continuation);
        gVar.f18488b = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Function0<Unit> function0AddCallback;
        NetworkCapabilities networkCapabilities;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f18487a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            ProducerScope producerScope = (ProducerScope) this.f18488b;
            NetworkRequest networkRequest = this.f18489c.f9941b.f18699a;
            if (networkRequest == null) {
                producerScope.getChannel().close(null);
                return Unit.f38893a;
            }
            C0126s onConstraintState = new C0126s(6, AbstractC0780y.m(producerScope, null, null, new f(this.f18490d, producerScope, null), 3), producerScope);
            if (Build.VERSION.SDK_INT >= 30) {
                j jVar = j.f18496a;
                ConnectivityManager connManager = this.f18490d.f18491a;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(connManager, "connManager");
                Intrinsics.checkNotNullParameter(networkRequest, "networkRequest");
                Intrinsics.checkNotNullParameter(onConstraintState, "onConstraintState");
                synchronized (j.f18497b) {
                    try {
                        LinkedHashMap linkedHashMap = j.f18498c;
                        boolean zIsEmpty = linkedHashMap.isEmpty();
                        linkedHashMap.put(onConstraintState, networkRequest);
                        if (zIsEmpty) {
                            C c6 = C.c();
                            int i10 = m.f18506a;
                            c6.getClass();
                            connManager.registerDefaultNetworkCallback(jVar);
                        }
                        C c10 = C.c();
                        int i11 = m.f18506a;
                        c10.getClass();
                        Intrinsics.checkNotNullParameter(connManager, "<this>");
                        if (j.f18500e) {
                            networkCapabilities = j.f18499d;
                        } else {
                            networkCapabilities = connManager.getNetworkCapabilities(connManager.getActiveNetwork());
                            j.f18499d = networkCapabilities;
                            j.f18500e = true;
                        }
                        onConstraintState.invoke(networkRequest.canBeSatisfiedBy(networkCapabilities) ? a.f18470a : new b(7));
                        Unit unit = Unit.f38893a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                function0AddCallback = new Gg.l(onConstraintState, 2, connManager, jVar);
            } else {
                function0AddCallback = e.f18482b.addCallback(this.f18490d.f18491a, networkRequest, onConstraintState);
            }
            C0127t c0127t = new C0127t(function0AddCallback, 13);
            this.f18487a = 1;
            if (Yf.C.a(producerScope, c0127t, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        return Unit.f38893a;
    }
}
