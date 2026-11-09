package p282s9;

import C0.G;
import Pa.i0;
import Pa.j0;
import Pa.n0;
import Wf.AbstractC0780y;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.V;
import com.transsnet.palmpay.betting.ui.activity.BettingHomeActivity;
import com.transsnet.palmpay.betting.viewmodel.BettingDepositViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.bill.TransType;
import java.util.ArrayList;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import x9.q;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BettingHomeActivity f42070b;

    public /* synthetic */ d(BettingHomeActivity bettingHomeActivity, int i7) {
        this.f42069a = i7;
        this.f42070b = bettingHomeActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BettingHomeActivity bettingHomeActivity = this.f42070b;
        switch (this.f42069a) {
            case 0:
                KProperty[] kPropertyArr = BettingHomeActivity.f26660w0;
                if (!BaseApplication.hasLogin()) {
                    i0.K(null, null);
                } else {
                    BettingDepositViewModel bettingDepositViewModel = (BettingDepositViewModel) bettingHomeActivity.l();
                    if (bettingDepositViewModel != null) {
                        ArrayList transType = C1850q.e(TransType.TRANS_TYPE_BILLER_BETTING);
                        Intrinsics.checkNotNullParameter(transType, "transType");
                        AbstractC0780y.m(V.h(bettingDepositViewModel), null, null, new q(bettingDepositViewModel.f26771C, G.p("Pref_", "queryTransactionLinkVM_" + transType, "_", BaseApplication.getCountryLocale()), null, transType), 3);
                    }
                    n0.g().l("PPay_Betting_Btn_History");
                }
                break;
            case 1:
                KProperty[] kPropertyArr2 = BettingHomeActivity.f26660w0;
                bettingHomeActivity.getOnBackPressedDispatcher().d();
                break;
            default:
                KProperty[] kPropertyArr3 = BettingHomeActivity.f26660w0;
                Intent intent = new Intent("android.intent.action.DIAL");
                intent.setData(Uri.parse("tel:" + Uri.encode(j0.a(100L, TransType.TRANS_TYPE_BILLER_BETTING, ""))));
                bettingHomeActivity.startActivity(intent);
                n0.g().l("Betting_Homepage_USSD_Dail_Button");
                break;
        }
    }
}
