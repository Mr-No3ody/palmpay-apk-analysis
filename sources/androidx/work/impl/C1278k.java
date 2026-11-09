package androidx.work.impl;

import com.adjust.sdk.Constants;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: androidx.work.impl.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1278k extends Ff.h implements Function4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Throwable f18568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f18569c;

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        C1278k c1278k = new C1278k(4, (Continuation) obj4);
        c1278k.f18568b = (Throwable) obj2;
        c1278k.f18569c = jLongValue;
        return c1278k.invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f18567a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            Throwable th = this.f18568b;
            long j6 = this.f18569c;
            V0.C.c().b(m.f18572a, "Cannot check for unfinished work", th);
            long jMin = Math.min(j6 * ((long) Constants.CONNECTION_TIMEOUT_VERIFY), m.f18573b);
            this.f18567a = 1;
            if (Wf.D.b(jMin, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        return Boolean.TRUE;
    }
}
