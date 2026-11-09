package Gd;

import com.transsnet.palmpay.send_money.ui.view.TransferResultHeaderModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferResultHeaderModel f3353a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TransferResultHeaderModel transferResultHeaderModel, Continuation continuation) {
        super(2, continuation);
        this.f3353a = transferResultHeaderModel;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f3353a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((j) create(bool, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        return Unit.f38893a;
    }
}
