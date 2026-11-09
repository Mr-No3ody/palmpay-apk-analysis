package p054dd;

import Ef.a;
import Ff.h;
import Wf.D;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashResultActivity;
import com.transsnet.palmpay.r2c.viewmodel.Recharge2CashResultViewModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p085fd.c;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Recharge2CashResultActivity f35897b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Recharge2CashResultActivity recharge2CashResultActivity, Continuation continuation) {
        super(2, continuation);
        this.f35897b = recharge2CashResultActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new o(this.f35897b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f35896a;
        Recharge2CashResultActivity recharge2CashResultActivity = this.f35897b;
        if (i7 == 0) {
            g.M(obj);
            long j6 = recharge2CashResultActivity.f33135g;
            this.f35896a = 1;
            if (D.b(j6, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        ArrayList arrayList = Recharge2CashResultActivity.f33131i;
        Recharge2CashResultViewModel recharge2CashResultViewModel = (Recharge2CashResultViewModel) recharge2CashResultActivity.l();
        String str = recharge2CashResultActivity.f33132d;
        recharge2CashResultViewModel.getClass();
        f.s(recharge2CashResultViewModel, new c(str, null), recharge2CashResultViewModel.f33138e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        long j10 = recharge2CashResultActivity.f33135g;
        if (j10 < 5000) {
            recharge2CashResultActivity.f33135g = j10 + ((long) 1500);
        }
        return Unit.f38893a;
    }
}
