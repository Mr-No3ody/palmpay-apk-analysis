package Yf;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o extends kotlin.jvm.internal.m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f11421a = new o(2, p.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long jLongValue = ((Number) obj).longValue();
        w wVar = (w) obj2;
        w wVar2 = p.f11422a;
        n nVar = wVar.f11450e;
        Intrinsics.e(nVar);
        return new w(jLongValue, wVar, nVar, 0);
    }
}
