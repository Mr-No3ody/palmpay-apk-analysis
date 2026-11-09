package Gd;

import android.widget.TextView;
import com.transsnet.palmpay.send_money.bean.TransferDetailCompensation;
import com.transsnet.palmpay.send_money.ui.view.TransferToFastTransferSafeguardProgressModel;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ long f3378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToFastTransferSafeguardProgressModel f3379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransferDetailCompensation f3380c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(TransferToFastTransferSafeguardProgressModel transferToFastTransferSafeguardProgressModel, TransferDetailCompensation transferDetailCompensation, Continuation continuation) {
        super(2, continuation);
        this.f3379b = transferToFastTransferSafeguardProgressModel;
        this.f3380c = transferDetailCompensation;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        x xVar = new x(this.f3379b, this.f3380c, continuation);
        xVar.f3378a = ((Number) obj).longValue();
        return xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create(Long.valueOf(((Number) obj).longValue()), (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        long j6 = this.f3378a;
        TextView btnApplyRefund = this.f3379b.getBtnApplyRefund();
        String bottomButtonDesc = this.f3380c.getBottomButtonDesc();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j10 = 60;
        btnApplyRefund.setText(bottomButtonDesc + " " + com.airbnb.lottie.model.layer.d.n(new Object[]{Long.valueOf(timeUnit.toHours(j6)), Long.valueOf(timeUnit.toMinutes(j6) % j10), Long.valueOf(timeUnit.toSeconds(j6) % j10)}, 3, "%02d:%02d:%02d", "format(...)"));
        return Unit.f38893a;
    }
}
