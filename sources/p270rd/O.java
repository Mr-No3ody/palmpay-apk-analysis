package p270rd;

import Ef.a;
import F6.d;
import Ff.h;
import Wf.D;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.send_money.ui.activity.TransferResultActivity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class O extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferResultActivity f41698b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(TransferResultActivity transferResultActivity, Continuation continuation) {
        super(2, continuation);
        this.f41698b = transferResultActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new O(this.f41698b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((O) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f41697a;
        TransferResultActivity transferResultActivity = this.f41698b;
        if (i7 == 0) {
            g.M(obj);
            if (transferResultActivity.t) {
                return Unit.f38893a;
            }
            d.h(transferResultActivity.TAG, 3, "delayRefreshOrder: refreshOrderDetail");
            long j6 = transferResultActivity.f33255p;
            this.f41697a = 1;
            if (D.b(j6, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        ArrayList arrayList = TransferResultActivity.f33237Z;
        transferResultActivity.t();
        long j10 = transferResultActivity.f33255p;
        if (j10 < 5000) {
            transferResultActivity.f33255p = j10 + ((long) 1500);
        }
        return Unit.f38893a;
    }
}
