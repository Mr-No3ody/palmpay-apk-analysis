package p297te;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.MerchantPaymentActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f42603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MerchantPaymentActivity f42604b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Throwable th, Continuation continuation, MerchantPaymentActivity merchantPaymentActivity) {
        super(2, continuation);
        this.f42603a = th;
        this.f42604b = merchantPaymentActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f42603a, continuation, this.f42604b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        String strW = org.chromium.support_lib_boundary.util.b.W(this.f42603a);
        this.f42604b.showLoadingDialog(false);
        ToastUtils.showLong(strW, new Object[0]);
        ActivityUtils.finishAllActivities();
        return Unit.f38893a;
    }
}
