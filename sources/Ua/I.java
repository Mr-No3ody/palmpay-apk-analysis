package Ua;

import android.text.TextUtils;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.viewmodel.ModelClaimCouponItemView;
import com.transsnet.palmpay.core.viewmodel.ModelClaimCouponListItemView;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class I extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonResult f9338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelClaimCouponListItemView f9339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ModelClaimCouponItemView f9341d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(CommonResult commonResult, Continuation continuation, ModelClaimCouponListItemView modelClaimCouponListItemView, String str, ModelClaimCouponItemView modelClaimCouponItemView) {
        super(2, continuation);
        this.f9338a = commonResult;
        this.f9339b = modelClaimCouponListItemView;
        this.f9340c = str;
        this.f9341d = modelClaimCouponItemView;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        String str = this.f9340c;
        return new I(this.f9338a, continuation, this.f9339b, str, this.f9341d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((I) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        CommonResult commonResult = this.f9338a;
        if (commonResult == null || !commonResult.isSuccess()) {
            if (!TextUtils.isEmpty(commonResult != null ? commonResult.getRespMsg() : null)) {
                ToastUtils.showShort(commonResult != null ? commonResult.getRespMsg() : null, new Object[0]);
            }
        } else {
            this.f9339b.onClaimCouponSuccess(this.f9340c);
            this.f9341d.setVisibility(8);
        }
        return Unit.f38893a;
    }
}
