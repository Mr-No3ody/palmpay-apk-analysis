package p369yd;

import android.view.View;
import com.transsnet.palmpay.core.callback.ResultCallback;
import com.transsnet.palmpay.send_money.bean.VerifyPaymentInfoRsp;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmDuplicateTransferDialog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements ConfirmDuplicateTransferDialog.OnContinueClickListener, ResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayInputAmountActivity f44300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VerifyPaymentInfoRsp.DataBean f44301b;

    public /* synthetic */ l(TransferToPalmPayInputAmountActivity transferToPalmPayInputAmountActivity, VerifyPaymentInfoRsp.DataBean dataBean) {
        this.f44300a = transferToPalmPayInputAmountActivity;
        this.f44301b = dataBean;
    }

    @Override // com.transsnet.palmpay.core.callback.ResultCallback
    public void onComplete(Object obj) {
        int i7 = TransferToPalmPayInputAmountActivity.f33602Y;
        if (((Boolean) obj).booleanValue()) {
            this.f44300a.u(this.f44301b);
        }
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.ConfirmDuplicateTransferDialog.OnContinueClickListener
    public void onContinueClick(View it) {
        int i7 = TransferToPalmPayInputAmountActivity.f33602Y;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f44300a.u(this.f44301b);
    }
}
