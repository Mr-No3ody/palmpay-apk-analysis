package p270rd;

import A8.b;
import Ab.C;
import Ad.DialogC0066m;
import Pa.r0;
import S6.a;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.mikepenz.iconics.IconicsDrawable;
import com.transsnet.palmpay.send_money.bean.TradeRecordDetailResp;
import com.transsnet.palmpay.send_money.ui.activity.TradeRecordDetailActivity;
import com.transsnet.palmpay.send_money.ui.view.BankCustomerServiceView;
import com.transsnet.palmpay.send_money.ui.view.TransferToFastTransferSafeguardProgressModel;
import com.transsnet.palmpay.send_money.viewmodel.TradeRecordViewModel;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class B implements TransferToFastTransferSafeguardProgressModel.OnFastTransferSafeguardListener, BankCustomerServiceView.OnBankCustomerServiceViewListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TradeRecordDetailActivity f41673a;

    public /* synthetic */ B(TradeRecordDetailActivity tradeRecordDetailActivity) {
        this.f41673a = tradeRecordDetailActivity;
    }

    @Override // com.transsnet.palmpay.send_money.ui.view.BankCustomerServiceView.OnBankCustomerServiceViewListener
    public void onClick(View it) {
        TradeRecordDetailActivity.a aVar = TradeRecordDetailActivity.f33213B;
        Intrinsics.checkNotNullParameter(it, "it");
        TradeRecordDetailActivity tradeRecordDetailActivity = this.f41673a;
        DialogC0066m dialogC0066m = new DialogC0066m(tradeRecordDetailActivity);
        TradeRecordDetailResp.RecordDetail recordDetail = tradeRecordDetailActivity.f33218g;
        if (recordDetail != null) {
            r0.v1(recordDetail.getRecipientBankUrl(), dialogC0066m.f237e);
            TextView textView = dialogC0066m.f236d;
            if (textView != null) {
                textView.setText(recordDetail.getRecipientBankName());
            }
            TextView textView2 = dialogC0066m.f235c;
            if (textView2 != null) {
                textView2.setText(recordDetail.getCustomerServicePhone());
            }
            TextView textView3 = dialogC0066m.f234b;
            if (textView3 != null) {
                SpanUtils spanUtils = new SpanUtils();
                Context context = dialogC0066m.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                IconicsDrawable iconicsDrawable = new IconicsDrawable(context, a.pay_Phone);
                iconicsDrawable.a(new C(dialogC0066m, 1));
                textView3.setText(spanUtils.appendImage(iconicsDrawable).append("  Contact the bank").create());
            }
            if (!TextUtils.isEmpty(recordDetail.getCustomerServicePhone()) && textView3 != null) {
                textView3.setOnClickListener(new b(recordDetail, 5));
            }
        }
        dialogC0066m.show();
    }

    @Override // com.transsnet.palmpay.send_money.ui.view.TransferToFastTransferSafeguardProgressModel.OnFastTransferSafeguardListener
    public void onCountdownFinish() {
        TradeRecordDetailActivity tradeRecordDetailActivity = this.f41673a;
        if (TextUtils.isEmpty(tradeRecordDetailActivity.f33216e)) {
            return;
        }
        ((TradeRecordViewModel) tradeRecordDetailActivity.l()).d(tradeRecordDetailActivity.f33216e);
    }
}
