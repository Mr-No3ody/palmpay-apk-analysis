package Ua;

import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.reward.OrderResultRewardItemBean;
import com.transsnet.palmpay.core.viewmodel.OnClaimRewardListener;
import com.transsnet.palmpay.core.viewmodel.OrderResultRewardModel;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonResult f9474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OrderResultRewardModel f9475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A0 f9476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ OrderResultRewardItemBean f9477d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(CommonResult commonResult, Continuation continuation, OrderResultRewardModel orderResultRewardModel, A0 a3, OrderResultRewardItemBean orderResultRewardItemBean) {
        super(2, continuation);
        this.f9474a = commonResult;
        this.f9475b = orderResultRewardModel;
        this.f9476c = a3;
        this.f9477d = orderResultRewardItemBean;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new s0(this.f9474a, continuation, this.f9475b, this.f9476c, this.f9477d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        OnClaimRewardListener onClaimRewardListener = this.f9475b.f28526p;
        int i7 = 0;
        if (onClaimRewardListener != null) {
            onClaimRewardListener.onShowLoading(false);
        }
        CommonResult commonResult = this.f9474a;
        if (commonResult.isSuccess()) {
            ToastUtils.showShort("Claim Successfully", new Object[0]);
            A0 a3 = this.f9476c;
            for (Object obj2 : a3.getData()) {
                int i10 = i7 + 1;
                if (i7 < 0) {
                    C1850q.k();
                    throw null;
                }
                OrderResultRewardItemBean orderResultRewardItemBean = (OrderResultRewardItemBean) obj2;
                if (Intrinsics.c(orderResultRewardItemBean.recordNo, this.f9477d.recordNo)) {
                    orderResultRewardItemBean.rewardStatus = new Integer(1);
                    a3.notifyItemChanged(i7);
                    break;
                }
                i7 = i10;
            }
        } else {
            ToastUtils.showShort(commonResult.getRespMsg(), new Object[0]);
        }
        return Unit.f38893a;
    }
}
