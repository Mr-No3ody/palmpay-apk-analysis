package p141j9;

import O6.c;
import Pa.r0;
import Pd.f;
import android.view.View;
import com.transsnet.palmpay.airtime.bean.AirtimeDetailData;
import com.transsnet.palmpay.airtime.bean.req.AirtimePreOrderCancelReq;
import com.transsnet.palmpay.airtime.ui.AirtimeBillDetailActivity;
import com.transsnet.palmpay.airtime.viewmodel.AirTimeDownTimeOrderDetailViewModel;
import com.transsnet.palmpay.core.ui.dialog.PaymentFeeDetailDialog;
import com.transsnet.palmpay.custom_view.dialog.TipsDialog;
import com.transsnet.palmpay.custom_view.t;
import kotlin.jvm.internal.Intrinsics;
import o9.C1896a;
import p025ba.k;
import p054dd.d;

/* JADX INFO: renamed from: j9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC1793a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AirtimeBillDetailActivity f38391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AirtimeDetailData f38392c;

    public /* synthetic */ ViewOnClickListenerC1793a(AirtimeDetailData airtimeDetailData, AirtimeBillDetailActivity airtimeBillDetailActivity) {
        this.f38390a = 2;
        this.f38392c = airtimeDetailData;
        this.f38391b = airtimeBillDetailActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AirtimeBillDetailActivity airtimeBillDetailActivity = this.f38391b;
        AirtimeDetailData airtimeDetailData = this.f38392c;
        switch (this.f38390a) {
            case 0:
                int i7 = AirtimeBillDetailActivity.f26454i;
                c cVar = new c(airtimeBillDetailActivity);
                cVar.e(f.qt_airtime_down_time_detail_cancel_books_title);
                cVar.f6598d = airtimeBillDetailActivity.getString(f.qt_airtime_down_time_detail_cancel_books_tips);
                String string = airtimeBillDetailActivity.getString(k.core_no);
                d dVar = new d(14);
                cVar.f6601g = string;
                cVar.f6603i = dVar;
                cVar.d(k.core_yes_cancel, new ViewOnClickListenerC1793a(airtimeBillDetailActivity, airtimeDetailData, 1));
                cVar.g();
                break;
            case 1:
                int i10 = AirtimeBillDetailActivity.f26454i;
                AirTimeDownTimeOrderDetailViewModel airTimeDownTimeOrderDetailViewModel = (AirTimeDownTimeOrderDetailViewModel) airtimeBillDetailActivity.l();
                AirtimePreOrderCancelReq req = new AirtimePreOrderCancelReq();
                req.setOrderNo(airtimeDetailData.getOrderNo());
                airTimeDownTimeOrderDetailViewModel.getClass();
                Intrinsics.checkNotNullParameter(req, "req");
                p140j8.f.s(airTimeDownTimeOrderDetailViewModel, new C1896a(req, null), airTimeDownTimeOrderDetailViewModel.f26604e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                break;
            default:
                int i11 = AirtimeBillDetailActivity.f26454i;
                if (airtimeDetailData.getFeeDetailList() == null) {
                    Long taxFee = airtimeDetailData.getTaxFee();
                    String strW = r0.W(airtimeBillDetailActivity, taxFee != null ? taxFee.longValue() : 0L);
                    TipsDialog tipsDialog = new TipsDialog(airtimeBillDetailActivity, t.cv_tips_dialog);
                    tipsDialog.setMessage(strW);
                    tipsDialog.setButtonText(null);
                    tipsDialog.setMessageGravity(17);
                    tipsDialog.show();
                } else {
                    PaymentFeeDetailDialog paymentFeeDetailDialog = new PaymentFeeDetailDialog(airtimeBillDetailActivity);
                    paymentFeeDetailDialog.show();
                    paymentFeeDetailDialog.update(airtimeDetailData.getFeeDetailList());
                }
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC1793a(AirtimeBillDetailActivity airtimeBillDetailActivity, AirtimeDetailData airtimeDetailData, int i7) {
        this.f38390a = i7;
        this.f38391b = airtimeBillDetailActivity;
        this.f38392c = airtimeDetailData;
    }
}
