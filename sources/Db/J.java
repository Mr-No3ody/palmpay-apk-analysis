package Db;

import com.transsnet.palmpay.credit.ui.viewmodel.UnfreezeViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final class J extends Ff.h implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Throwable f1789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnfreezeViewModel f1790b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(UnfreezeViewModel unfreezeViewModel, Continuation continuation) {
        super(3, continuation);
        this.f1790b = unfreezeViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        J j6 = new J(this.f1790b, (Continuation) obj3);
        j6.f1789a = (Throwable) obj2;
        return j6.invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        Throwable th = this.f1789a;
        com.transsnet.palmpay.core.base.l lVar = this.f1790b.f30706e;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        lVar.k(new com.transsnet.palmpay.core.base.n(message));
        return Unit.f38893a;
    }
}
