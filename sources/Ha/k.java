package Ha;

import com.transsnet.palmpay.core.ui.dialog.UssdDialingDialog;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ long f3786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UssdDialingDialog f3787b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(UssdDialingDialog ussdDialingDialog, Continuation continuation) {
        super(2, continuation);
        this.f3787b = ussdDialingDialog;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        k kVar = new k(this.f3787b, continuation);
        kVar.f3786a = ((Number) obj).longValue();
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
        int i7 = ((int) this.f3786a) / 1000;
        UssdDialingDialog ussdDialingDialog = this.f3787b;
        ussdDialingDialog.getTv_second().setText(i7 + "s");
        ussdDialingDialog.getCpi_countdown().setProgressCompat(i7, true);
        return Unit.f38893a;
    }
}
