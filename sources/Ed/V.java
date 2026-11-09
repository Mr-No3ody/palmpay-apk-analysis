package Ed;

import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class V extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferToBankHomeFragment f2347a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(TransferToBankHomeFragment transferToBankHomeFragment, Continuation continuation) {
        super(2, continuation);
        this.f2347a = transferToBankHomeFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new V(this.f2347a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((V) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        this.f2347a.w();
        return Unit.f38893a;
    }
}
