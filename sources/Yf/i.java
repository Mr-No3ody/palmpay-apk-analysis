package Yf;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.m implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f11402a = new i(3, n.class, "processResultSelectReceiveOrNull", "processResultSelectReceiveOrNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        n nVar = (n) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = n.f11411b;
        nVar.getClass();
        if (obj3 != p.f11433l) {
            return obj3;
        }
        if (nVar.k() == null) {
            return null;
        }
        throw nVar.l();
    }
}
