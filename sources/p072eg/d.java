package p072eg;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d extends m implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f36302a = new d(3, e.class, "onLockProcessResult", "onLockProcessResult(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        e eVar = (e) obj;
        eVar.getClass();
        if (!Intrinsics.c(obj3, f.f36306b)) {
            return eVar;
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj2).toString());
    }
}
