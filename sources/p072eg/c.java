package p072eg;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.SelectInstanceInternal;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c extends m implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f36301a = new c(3, e.class, "onLockRegFunction", "onLockRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int andDecrement;
        e eVar = (e) obj;
        SelectInstance selectInstance = (SelectInstance) obj2;
        if (obj3 != null) {
            if (eVar.holdsLock(obj3)) {
                selectInstance.selectInRegistrationPhase(f.f36306b);
            }
            return Unit.f38893a;
        }
        eVar.getClass();
        Intrinsics.f(selectInstance, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>");
        b bVar = new b(eVar, (SelectInstanceInternal) selectInstance, obj3);
        do {
            eVar.getClass();
            do {
                andDecrement = i.f36313g.getAndDecrement(eVar);
            } while (andDecrement > eVar.f36314a);
            if (andDecrement > 0) {
                bVar.selectInRegistrationPhase(Unit.f38893a);
                break;
            }
        } while (!eVar.a(bVar));
        return Unit.f38893a;
    }
}
