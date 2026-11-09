package Zf;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z extends kotlin.jvm.internal.m implements Function3, SuspendFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f11807a = new z(3, FlowCollector.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((FlowCollector) obj).emit(obj2, (Continuation) obj3);
    }
}
