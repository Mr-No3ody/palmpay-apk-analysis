package p141j9;

import Pa.i0;
import Pd.c;
import android.view.View;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.airtime.bean.AirtimeGroupPurchaseDetailData;
import com.transsnet.palmpay.airtime.ui.AirtimeGroupPurchaseResultActivity;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import kotlin.Pair;
import p002a.a;

/* JADX INFO: renamed from: j9.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC1797e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AirtimeGroupPurchaseResultActivity f38400b;

    public /* synthetic */ ViewOnClickListenerC1797e(AirtimeGroupPurchaseResultActivity airtimeGroupPurchaseResultActivity, int i7) {
        this.f38399a = i7;
        this.f38400b = airtimeGroupPurchaseResultActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AirtimeGroupPurchaseResultActivity airtimeGroupPurchaseResultActivity = this.f38400b;
        switch (this.f38399a) {
            case 0:
                int i7 = AirtimeGroupPurchaseResultActivity.f26459g;
                int id2 = view.getId();
                if (id2 != c.actur_complete_btn) {
                    if (id2 == c.tv_view_detail || id2 == c.iv_view_detail) {
                        d.x(a.e(new Pair("orderNo", airtimeGroupPurchaseResultActivity.f26460d), new Pair("transType", TransType.TRANS_TYPE_AIRTIME_GROUP_PURCHASE)), "CommonDetail");
                    }
                    break;
                } else {
                    AirtimeGroupPurchaseDetailData airtimeGroupPurchaseDetailData = airtimeGroupPurchaseResultActivity.f26461e;
                    if (airtimeGroupPurchaseDetailData != null && airtimeGroupPurchaseDetailData.getOrderStatus() != null) {
                        airtimeGroupPurchaseResultActivity.finish();
                        break;
                    }
                }
                break;
            case 1:
                int i10 = AirtimeGroupPurchaseResultActivity.f26459g;
                airtimeGroupPurchaseResultActivity.getOnBackPressedDispatcher().d();
                break;
            default:
                int i11 = AirtimeGroupPurchaseResultActivity.f26459g;
                airtimeGroupPurchaseResultActivity.getClass();
                i0.c0(com.transsnet.palmpay.core.config.d.c(GetCustomerServiceUrlReq.ENTER_TYPE_AIRTIME_GROUP_PURCHASE));
                break;
        }
    }
}
