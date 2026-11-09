package P3;

import com.flexibank.sdk.cashier.bean.FlexiBankPayByOrderResp;
import com.flexibank.sdk.cashier.ui.activity.FlexiBankPayVerificationLauncher$PayVerificationResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k implements FlexiBankPayVerificationLauncher$PayVerificationResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.flexibank.sdk.cashier.ui.activity.a f6898a;

    public k(com.flexibank.sdk.cashier.ui.activity.a aVar) {
        this.f6898a = aVar;
    }

    @Override // com.flexibank.sdk.cashier.ui.activity.FlexiBankPayVerificationLauncher$PayVerificationResult
    public final void onPayVerificationComplete() {
        this.f6898a.finish();
    }

    @Override // com.flexibank.sdk.cashier.ui.activity.FlexiBankPayVerificationLauncher$PayVerificationResult
    public final void onPayVerificationFail(String errorCode, String errorMsg) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
    }

    @Override // com.flexibank.sdk.cashier.ui.activity.FlexiBankPayVerificationLauncher$PayVerificationResult
    public final void onPayVerificationSuccess(FlexiBankPayByOrderResp.DataBean dataBean) {
        this.f6898a.g(dataBean);
    }
}
