package Gd;

import com.transsnet.palmpay.send_money.ui.view.TransferResultHeaderModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferResultHeaderModel f3354a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TransferResultHeaderModel transferResultHeaderModel, Continuation continuation) {
        super(2, continuation);
        this.f3354a = transferResultHeaderModel;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        k kVar = new k(this.f3354a, continuation);
        ((Number) obj).longValue();
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create(Long.valueOf(((Number) obj).longValue()), (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        TransferResultHeaderModel.a aVar2 = TransferResultHeaderModel.f33879g;
        this.f3354a.getClass();
        return Unit.f38893a;
    }
}
