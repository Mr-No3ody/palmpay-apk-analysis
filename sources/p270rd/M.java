package p270rd;

import F6.d;
import com.transsnet.palmpay.core.viewmodel.OnClaimRewardListener;
import com.transsnet.palmpay.send_money.ui.activity.TransferResultActivity;
import com.transsnet.palmpay.send_money.ui.view.TransferToFastTransferSafeguardProgressModel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class M implements TransferToFastTransferSafeguardProgressModel.OnFastTransferSafeguardListener, OnClaimRewardListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferResultActivity f41694a;

    public /* synthetic */ M(TransferResultActivity transferResultActivity) {
        this.f41694a = transferResultActivity;
    }

    @Override // com.transsnet.palmpay.send_money.ui.view.TransferToFastTransferSafeguardProgressModel.OnFastTransferSafeguardListener
    public void onCountdownFinish() {
        ArrayList arrayList = TransferResultActivity.f33237Z;
        TransferResultActivity transferResultActivity = this.f41694a;
        d.h(transferResultActivity.TAG, 3, "delayRefreshOrder: setOnFastTransferSafeguardListener refreshOrderDetail");
        transferResultActivity.t();
    }

    @Override // com.transsnet.palmpay.core.viewmodel.OnClaimRewardListener
    public void onShowLoading(boolean z3) {
        ArrayList arrayList = TransferResultActivity.f33237Z;
        this.f41694a.showLoadingDialog(z3);
    }
}
