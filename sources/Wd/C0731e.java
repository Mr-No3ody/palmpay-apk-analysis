package Wd;

import com.transsnet.palmpay.core.callback.CompleteCallback;
import com.transsnet.palmpay.teller.bean.PaymentItemBean;
import com.transsnet.palmpay.teller.bean.QueryRecommendRsp;
import com.transsnet.palmpay.teller.ui.activity.BeneficiariesActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Wd.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0731e implements CompleteCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BeneficiariesActivity f10755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ QueryRecommendRsp f10756b;

    public C0731e(BeneficiariesActivity beneficiariesActivity, QueryRecommendRsp queryRecommendRsp) {
        this.f10755a = beneficiariesActivity;
        this.f10756b = queryRecommendRsp;
    }

    @Override // com.transsnet.palmpay.core.callback.CompleteCallback
    public final void onComplete(Object[] objArr) {
        PaymentItemBean[] objects = (PaymentItemBean[]) objArr;
        Intrinsics.checkNotNullParameter(objects, "objects");
        PaymentItemBean data = this.f10756b.data;
        Intrinsics.checkNotNullExpressionValue(data, "data");
        BeneficiariesActivity beneficiariesActivity = this.f10755a;
        beneficiariesActivity.n(data, beneficiariesActivity.f34156o);
    }
}
