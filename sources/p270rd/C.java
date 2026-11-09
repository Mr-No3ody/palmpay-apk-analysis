package p270rd;

import android.view.View;
import com.transsnet.palmpay.send_money.bean.TradeRecordDetailResp;
import com.transsnet.palmpay.send_money.ui.activity.TradeRecordDetailActivity;
import com.transsnet.palmpay.send_money.ui.dialog.TransferFeeDetailDialog;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TradeRecordDetailActivity f41675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TradeRecordDetailResp.RecordDetail.TransferTax f41676c;

    public /* synthetic */ C(TradeRecordDetailActivity tradeRecordDetailActivity, TradeRecordDetailResp.RecordDetail.TransferTax transferTax, int i7) {
        this.f41674a = i7;
        this.f41675b = tradeRecordDetailActivity;
        this.f41676c = transferTax;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TradeRecordDetailResp.RecordDetail.TransferTax transferTax = this.f41676c;
        TradeRecordDetailActivity tradeRecordDetailActivity = this.f41675b;
        switch (this.f41674a) {
            case 0:
                TradeRecordDetailActivity.a aVar = TradeRecordDetailActivity.f33213B;
                TransferFeeDetailDialog transferFeeDetailDialog = new TransferFeeDetailDialog(tradeRecordDetailActivity);
                transferFeeDetailDialog.show();
                transferFeeDetailDialog.update(transferTax);
                break;
            default:
                TradeRecordDetailActivity.a aVar2 = TradeRecordDetailActivity.f33213B;
                TransferFeeDetailDialog transferFeeDetailDialog2 = new TransferFeeDetailDialog(tradeRecordDetailActivity);
                transferFeeDetailDialog2.show();
                transferFeeDetailDialog2.update(transferTax);
                break;
        }
    }
}
