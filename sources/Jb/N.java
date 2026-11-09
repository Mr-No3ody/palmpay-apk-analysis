package Jb;

import Wf.AbstractC0777v;
import com.transsnet.palmpay.core.bean.TransferByLoanOpenParams;
import com.transsnet.palmpay.credit.viewmodel.TransferByLoanViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class N extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferByLoanViewModel f4718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransferByLoanOpenParams f4719c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(TransferByLoanViewModel transferByLoanViewModel, TransferByLoanOpenParams transferByLoanOpenParams, Continuation continuation) {
        super(1, continuation);
        this.f4718b = transferByLoanViewModel;
        this.f4719c = transferByLoanOpenParams;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new N(this.f4718b, this.f4719c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((N) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f4717a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        M m7 = new M(this.f4718b, this.f4719c, null);
        this.f4717a = 1;
        Object objD = AbstractC0777v.d(m7, this);
        return objD == aVar ? aVar : objD;
    }
}
