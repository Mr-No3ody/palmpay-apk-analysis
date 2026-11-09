package p270rd;

import android.content.Intent;
import com.transsnet.palmpay.custom_view.dialog.VoucherMsgDialog;
import com.transsnet.palmpay.send_money.ui.activity.CollectMoneyResultActivity;
import com.transsnet.palmpay.send_money.ui.activity.TradeRecordDetailActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class F implements VoucherMsgDialog.OnVoucherMsgClickLister {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TradeRecordDetailActivity f41681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f41682b;

    public F(TradeRecordDetailActivity tradeRecordDetailActivity, String str) {
        this.f41681a = tradeRecordDetailActivity;
        this.f41682b = str;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.VoucherMsgDialog.OnVoucherMsgClickLister
    public final void onConfirm(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        TradeRecordDetailActivity tradeRecordDetailActivity = this.f41681a;
        int i7 = CollectMoneyResultActivity.f33155o;
        tradeRecordDetailActivity.startActivity(new Intent(tradeRecordDetailActivity, (Class<?>) CollectMoneyResultActivity.class).putExtra("orderId", this.f41682b).putExtra("remark", msg));
        tradeRecordDetailActivity.finish();
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.VoucherMsgDialog.OnVoucherMsgClickLister
    public final void onSkip() {
        TradeRecordDetailActivity tradeRecordDetailActivity = this.f41681a;
        int i7 = CollectMoneyResultActivity.f33155o;
        tradeRecordDetailActivity.startActivity(new Intent(tradeRecordDetailActivity, (Class<?>) CollectMoneyResultActivity.class).putExtra("orderId", this.f41682b).putExtra("remark", ""));
        tradeRecordDetailActivity.finish();
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.VoucherMsgDialog.OnVoucherMsgClickLister
    public final void onClose() {
    }
}
