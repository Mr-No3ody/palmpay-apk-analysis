package Pe;

import com.transsnet.palmpay.viewmodule.BalanceViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Pe.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0530b extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BalanceViewModel f7220b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0530b(BalanceViewModel balanceViewModel, Continuation continuation) {
        super(2, continuation);
        this.f7220b = balanceViewModel;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C0530b c0530b = new C0530b(this.f7220b, continuation);
        c0530b.f7219a = obj;
        return c0530b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0530b) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        this.f7220b.f35354i.k(new com.transsnet.palmpay.core.base.p((Pair) this.f7219a));
        return Unit.f38893a;
    }
}
