package p141j9;

import Pa.n0;
import Rd.H;
import com.transsnet.palmpay.airtime.bean.QueryAirtimeV2Rsp;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.airtime.ui.view.DailyFlashSalesView;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.input.OnOperatorItemClickListener;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
public final class E implements OnOperatorItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TopupAirtimeActivity f38369a;

    public E(TopupAirtimeActivity topupAirtimeActivity) {
        this.f38369a = topupAirtimeActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.input.OnOperatorItemClickListener
    public final void onOperatorItemClick(Object obj) {
        DailyFlashSalesView dailyFlashSalesView;
        QueryAirtimeV2Rsp.DataBean wallet = (QueryAirtimeV2Rsp.DataBean) obj;
        Intrinsics.checkNotNullParameter(wallet, "wallet");
        int i7 = TopupAirtimeActivity.f26495x0;
        TopupAirtimeActivity topupAirtimeActivity = this.f38369a;
        H h7 = (H) topupAirtimeActivity.f27334c;
        if (h7 != null && (dailyFlashSalesView = h7.f8057B) != null) {
            h.s(dailyFlashSalesView, false);
        }
        n0.g().k(new ClickEvent("Airtime_Homepage_Airtime_Operator_Click").add("billerName", wallet.getName()));
        topupAirtimeActivity.y(wallet);
    }
}
