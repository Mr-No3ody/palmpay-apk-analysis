package p056dg;

import Wf.D;
import com.flexibank.sdk.g;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a extends m implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f35937a = new a(3, b.class, GetCustomerServiceUrlReq.ENTER_TYPE_SIGNUP, "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b bVar = (b) obj;
        SelectInstance selectInstance = (SelectInstance) obj2;
        long j6 = bVar.f35938a;
        if (j6 <= 0) {
            selectInstance.selectInRegistrationPhase(Unit.f38893a);
        } else {
            g gVar = new g(18, selectInstance, bVar);
            Intrinsics.f(selectInstance, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            g gVar2 = (g) selectInstance;
            CoroutineContext coroutineContext = gVar2.f35956a;
            gVar2.f35958c = D.c(coroutineContext).invokeOnTimeout(j6, gVar, coroutineContext);
        }
        return Unit.f38893a;
    }
}
