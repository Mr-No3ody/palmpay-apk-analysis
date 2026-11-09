package p294tb;

import Pa.n0;
import Ya.e;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.credit.bean.resp.CLOpenAccountData;
import com.transsnet.palmpay.credit.bean.resp.CardRiskLevelResp;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLOpenResultActivity;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class D implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CLOpenResultActivity f42404b;

    public /* synthetic */ D(CLOpenResultActivity cLOpenResultActivity, int i7) {
        this.f42403a = i7;
        this.f42404b = cLOpenResultActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CardRiskLevelResp flexiCashRiskLevel;
        Long creditLimit;
        CLOpenResultActivity cLOpenResultActivity = this.f42404b;
        switch (this.f42403a) {
            case 0:
                int i7 = CLOpenResultActivity.f28955V0;
                cLOpenResultActivity.onBackPressed();
                n0.g().m("CLOpenResultActivity_element_click", "mtb_back_iv", "");
                break;
            case 1:
                CLOpenAccountData cLOpenAccountData = cLOpenResultActivity.f28967H0;
                if (cLOpenAccountData != null && (flexiCashRiskLevel = cLOpenAccountData.getFlexiCashRiskLevel()) != null) {
                    Bundle bundle = new Bundle();
                    CLOpenAccountData cLOpenAccountData2 = cLOpenResultActivity.f28967H0;
                    bundle.putLong("amount", (cLOpenAccountData2 == null || (creditLimit = cLOpenAccountData2.getCreditLimit()) == null) ? 0L : creditLimit.longValue());
                    Integer term = flexiCashRiskLevel.getTerm() == null ? 0 : flexiCashRiskLevel.getTerm();
                    if (term != null) {
                        bundle.putInt(FirebaseAnalytics.Param.TERM, term.intValue());
                    }
                    Integer termSpan = flexiCashRiskLevel.getTermSpan() == null ? 0 : flexiCashRiskLevel.getTermSpan();
                    if (termSpan != null) {
                        bundle.putInt("termSpan", termSpan.intValue());
                    }
                    String termSpanUnit = TextUtils.isEmpty(flexiCashRiskLevel.getTermSpanUnit()) ? "" : flexiCashRiskLevel.getTermSpanUnit();
                    if (termSpanUnit != null) {
                        bundle.putString("termSpanUnit", termSpanUnit);
                    }
                    d.x(bundle, "AboutInstallmentLoan");
                    break;
                }
                break;
            case 2:
                int i10 = CLOpenResultActivity.f28955V0;
                int id2 = view.getId();
                if (id2 == e.cl_double_both_borrow_tv) {
                    cLOpenResultActivity.n();
                } else if (id2 == e.cl_double_open_agreement_tv) {
                    cLOpenResultActivity.u();
                }
                break;
            default:
                int i11 = CLOpenResultActivity.f28955V0;
                int id3 = view.getId();
                if (id3 == e.cl_both_borrow_tv) {
                    cLOpenResultActivity.n();
                } else if (id3 == e.cl_open_agreement_tv) {
                    cLOpenResultActivity.u();
                }
                break;
        }
    }
}
