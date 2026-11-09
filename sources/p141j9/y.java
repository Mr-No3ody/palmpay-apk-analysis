package p141j9;

import C0.G;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Wf.AbstractC0780y;
import android.view.View;
import androidx.lifecycle.V;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.palmpay.airtime.bean.QueryAirtimeV2Rsp;
import com.transsnet.palmpay.airtime.ui.TopUpRecordActivity;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.airtime.viewmodel.AirTimeTopupViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.s;
import java.util.ArrayList;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import o9.I;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TopupAirtimeActivity f38440b;

    public /* synthetic */ y(TopupAirtimeActivity topupAirtimeActivity, int i7) {
        this.f38439a = i7;
        this.f38440b = topupAirtimeActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        QueryAirtimeV2Rsp.DataBean dataBean;
        TopupAirtimeActivity topupAirtimeActivity = this.f38440b;
        switch (this.f38439a) {
            case 0:
                int i7 = TopupAirtimeActivity.f26495x0;
                if (!BaseApplication.hasLogin()) {
                    i0.K(null, null);
                } else {
                    AirTimeTopupViewModel airTimeTopupViewModel = (AirTimeTopupViewModel) topupAirtimeActivity.l();
                    if (airTimeTopupViewModel != null) {
                        ArrayList transType = C1850q.e("04", TransType.TRANS_TYPE_ONELOOP_AIRTIME_BUY, TransType.TRANS_TYPE_AIRTIME_GROUP_PURCHASE);
                        Intrinsics.checkNotNullParameter(transType, "transType");
                        AbstractC0780y.m(V.h(airTimeTopupViewModel), null, null, new I(airTimeTopupViewModel.f26617H, G.p("Pref_", "queryTransactionLinkVM_" + transType, "_", BaseApplication.getCountryLocale()), null, transType), 3);
                    }
                    n0.g().l("PPay_Airtime_Btn_History");
                }
                break;
            case 1:
                int i10 = TopupAirtimeActivity.f26495x0;
                topupAirtimeActivity.getOnBackPressedDispatcher().d();
                break;
            case 2:
                int i11 = TopupAirtimeActivity.f26495x0;
                if (!BaseApplication.hasLogin()) {
                    i0.K(null, null);
                } else {
                    TopUpRecordActivity.f26486p.start(topupAirtimeActivity);
                }
                break;
            case 3:
                int i12 = TopupAirtimeActivity.f26495x0;
                if (BaseApplication.hasLogin()) {
                    TopUpRecordActivity.f26486p.start(topupAirtimeActivity);
                }
                break;
            case 4:
                PpAmountEditText ppAmountEditText = topupAirtimeActivity.f26507j;
                long longAmount = ppAmountEditText != null ? ppAmountEditText.getLongAmount() : 0L;
                topupAirtimeActivity.f26502Q = longAmount;
                if (longAmount < topupAirtimeActivity.t()) {
                    String string = topupAirtimeActivity.getString(k.core_msg_amount_above_desc, r0.B(topupAirtimeActivity.t(), true));
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    topupAirtimeActivity.E(string);
                    break;
                } else if (topupAirtimeActivity.f26502Q > topupAirtimeActivity.s()) {
                    String string2 = topupAirtimeActivity.getString(k.core_msg_amount_below_desc, r0.B(topupAirtimeActivity.s(), true));
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    topupAirtimeActivity.E(string2);
                    break;
                } else {
                    topupAirtimeActivity.E("");
                    if (!topupAirtimeActivity.v()) {
                        PpAmountEditText ppAmountEditText2 = topupAirtimeActivity.f26507j;
                        if (ppAmountEditText2 != null) {
                            ppAmountEditText2.clearFocus();
                        }
                        topupAirtimeActivity.f26508k0 = null;
                        if (!r0.U0() && (dataBean = topupAirtimeActivity.f26505Z) != null) {
                            if (!Intrinsics.c(dataBean.getSuspend(), Boolean.TRUE)) {
                                TopupAirtimeActivity.G(topupAirtimeActivity, 0, null, 3);
                                n0.g().k(((ClickEvent) G.f("airtime_recharge_info_page_element_click", "module_name", "Fund Area")).add("element_name", "Pay"));
                                n0 n0VarG = n0.g();
                                ClickEvent clickEvent = (ClickEvent) G.f("airtime_recharge_info_page_element_click", "module_name", "Fund Area-Pay");
                                PpAmountEditText ppAmountEditText3 = topupAirtimeActivity.f26507j;
                                n0VarG.k(clickEvent.add("element_name", ppAmountEditText3 != null ? ppAmountEditText3.getAmountString() : null));
                                n0.g().l("Airtime_click_Confirm");
                            } else {
                                TopupAirtimeActivity.G(topupAirtimeActivity, 3, null, 2);
                            }
                            break;
                        }
                    }
                }
                break;
            default:
                int i13 = TopupAirtimeActivity.f26495x0;
                if (view.getId() == s.iv_contacts) {
                    ARouter.getInstance().build("/contact/all").withString("orderType", "0").withString("transType", "04").navigation(topupAirtimeActivity, 1810);
                    n0.g().l("PPay_Airtime_Btn_Contacts");
                    n0.g().k(((ClickEvent) G.f("airtime_recharge_info_page_element_click", "module_name", "Fund Area")).add("element_name", "Contact"));
                }
                break;
        }
    }
}
