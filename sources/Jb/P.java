package Jb;

import com.transsnet.palmpay.credit.viewmodel.TransferByLoanViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class P extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferByLoanViewModel f4724b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(TransferByLoanViewModel transferByLoanViewModel, Continuation continuation) {
        super(2, continuation);
        this.f4724b = transferByLoanViewModel;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new P(this.f4724b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((P) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f4723a;
        TransferByLoanViewModel transferByLoanViewModel = this.f4724b;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            this.f4723a = 1;
            obj = TransferByLoanViewModel.d(transferByLoanViewModel, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        transferByLoanViewModel.f30939w = bool;
        return obj;
    }
}
