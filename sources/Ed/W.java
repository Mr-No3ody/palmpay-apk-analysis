package Ed;

import android.view.View;
import com.transsnet.palmpay.send_money.bean.event.AddRecipientEvent;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeFragment;
import com.transsnet.palmpay.send_money.viewmodel.TransferToBankHomeViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class W extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferToBankHomeFragment f2348a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(TransferToBankHomeFragment transferToBankHomeFragment, Continuation continuation) {
        super(2, continuation);
        this.f2348a = transferToBankHomeFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new W(this.f2348a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((W) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        TransferToBankHomeFragment transferToBankHomeFragment = this.f2348a;
        TransferToBankHomeViewModel transferToBankHomeViewModel = (TransferToBankHomeViewModel) transferToBankHomeFragment.f27333i;
        if (transferToBankHomeViewModel != null) {
            transferToBankHomeViewModel.e();
        }
        org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(2));
        View view = transferToBankHomeFragment.f33774A;
        if (view != null) {
            p220oa.h.c(view);
        }
        return Unit.f38893a;
    }
}
