package Yf;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.m implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f11403a = new j(3, n.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((n) obj).x((SelectInstance) obj2, obj3);
        return Unit.f38893a;
    }
}
