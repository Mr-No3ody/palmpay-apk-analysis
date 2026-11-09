package p041ce;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.teller.ui.view.ModelAvailableCouponAndPointItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f18959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelAvailableCouponAndPointItem f18960b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Throwable th, Continuation continuation, ModelAvailableCouponAndPointItem modelAvailableCouponAndPointItem) {
        super(2, continuation);
        this.f18959a = th;
        this.f18960b = modelAvailableCouponAndPointItem;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new q(this.f18959a, continuation, this.f18960b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        b.W(this.f18959a);
        int i7 = ModelAvailableCouponAndPointItem.f34329i;
        this.f18960b.c(false);
        return Unit.f38893a;
    }
}
