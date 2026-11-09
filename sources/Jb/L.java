package Jb;

import com.transsnet.palmpay.core.bean.TransferByLoanOpenParams;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class L extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferByLoanOpenParams f4712b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(TransferByLoanOpenParams transferByLoanOpenParams, Continuation continuation) {
        super(2, continuation);
        this.f4712b = transferByLoanOpenParams;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new L(this.f4712b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f4711a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        Eb.a aVar2 = Eb.a.f2268b;
        this.f4711a = 1;
        Object objR = aVar2.r(this.f4712b, this);
        return objR == aVar ? aVar : objR;
    }
}
