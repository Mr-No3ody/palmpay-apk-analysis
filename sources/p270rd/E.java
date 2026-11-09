package p270rd;

import N9.f;
import Pa.i0;
import android.net.Uri;
import android.view.View;
import androidx.camera.camera2.internal.F;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.send_money.bean.TradeRecordDetailResp;
import com.transsnet.palmpay.send_money.ui.activity.TradeRecordDetailActivity;
import com.transsnet.palmpay.send_money.ui.activity.TransReceiptActivity;
import com.transsnet.palmpay.send_money.ui.view.TransferDetailBottomModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class E implements TransferDetailBottomModel.OnTransferDetailBottomModelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TradeRecordDetailActivity f41680a;

    public E(TradeRecordDetailActivity tradeRecordDetailActivity) {
        this.f41680a = tradeRecordDetailActivity;
    }

    @Override // com.transsnet.palmpay.send_money.ui.view.TransferDetailBottomModel.OnTransferDetailBottomModelListener
    public final void onLeftClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        TradeRecordDetailActivity.a aVar = TradeRecordDetailActivity.f33213B;
        TradeRecordDetailActivity tradeRecordDetailActivity = this.f41680a;
        tradeRecordDetailActivity.getClass();
        if (!BaseApplication.isAO()) {
            TradeRecordDetailResp.RecordDetail recordDetail = tradeRecordDetailActivity.f33218g;
            if (recordDetail != null) {
                TransReceiptActivity.a aVar2 = TransReceiptActivity.f33225A;
                String orderNo = recordDetail.getOrderNo();
                aVar2.startAct(tradeRecordDetailActivity, orderNo != null ? orderNo : "");
                return;
            }
            return;
        }
        f fVar = new f();
        TradeRecordDetailResp.RecordDetail recordDetail2 = tradeRecordDetailActivity.f33218g;
        if (recordDetail2 != null) {
            fVar.f6270a = recordDetail2.getOrderNo();
            fVar.f6271b = recordDetail2.getRecipientFullName();
            fVar.f6272c = "";
            fVar.f6273d = recordDetail2.getUpdateTime();
            fVar.f6274e = recordDetail2.getPayAmount();
            fVar.f6275f = tradeRecordDetailActivity.f33219i;
            fVar.f6276g = tradeRecordDetailActivity.f33220j;
            fVar.f6277h = recordDetail2.getSenderFullName();
            fVar.f6278i = "";
            fVar.f6279j = BaseApplication.getInstance().getUser().getFormatAccountNumber();
            fVar.f6280k = Long.valueOf(recordDetail2.getDeductPoint());
            fVar.f6281l = recordDetail2.getPayFee();
            fVar.f6282m = recordDetail2.getSenderRemark();
            fVar.f6283n = recordDetail2.getOrderStatusDesc();
        }
        fVar.a(tradeRecordDetailActivity);
    }

    @Override // com.transsnet.palmpay.send_money.ui.view.TransferDetailBottomModel.OnTransferDetailBottomModelListener
    public final void onRightClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        TradeRecordDetailActivity tradeRecordDetailActivity = this.f41680a;
        TradeRecordDetailResp.RecordDetail recordDetail = tradeRecordDetailActivity.f33218g;
        if (recordDetail != null) {
            String orderNo = recordDetail.getOrderNo();
            String strEncode = Uri.encode(tradeRecordDetailActivity.f33220j);
            String strEncode2 = Uri.encode(recordDetail.getPaymentTypeDesc());
            StringBuilder sbF = F.f("orderType=1&orderNo=", orderNo, "&paymentMethod=", strEncode, "&paymentType=");
            sbF.append(strEncode2);
            i0.a0(sbF.toString());
        }
    }
}
