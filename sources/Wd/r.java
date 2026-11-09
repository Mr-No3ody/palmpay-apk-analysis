package Wd;

import com.transsnet.palmpay.teller.ui.activity.BillerTransactionResultActivity;
import com.transsnet.palmpay.teller.viewmodel.BillerTransctionResultViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BillerTransactionResultActivity f10780c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(BillerTransactionResultActivity billerTransactionResultActivity, Continuation continuation, boolean z3) {
        super(2, continuation);
        this.f10779b = z3;
        this.f10780c = billerTransactionResultActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new r(this.f10780c, continuation, this.f10779b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f10778a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            if (!this.f10779b) {
                this.f10778a = 1;
                if (Wf.D.b(3000L, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        int i10 = BillerTransactionResultActivity.f34181Y;
        BillerTransactionResultActivity billerTransactionResultActivity = this.f10780c;
        ((BillerTransctionResultViewModel) billerTransactionResultActivity.l()).d(billerTransactionResultActivity.f34197p, billerTransactionResultActivity.f34191e);
        return Unit.f38893a;
    }
}
