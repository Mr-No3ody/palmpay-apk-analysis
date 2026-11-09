package K8;

import C0.G;
import Nc.n;
import Pa.i0;
import Pa.n0;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import com.google.api.Service;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.account.kotlin.ui.fragment.auth.ResetPinVerification3Fragment;
import com.transsnet.palmpay.account.kotlin.ui.fragment.auth.ResetPinVerification5Fragment;
import com.transsnet.palmpay.account.ui.activity.EnableCashBoxAutoSaveActivity;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.activity.PalmPayTier3ApplicationDetailActivity;
import com.transsnet.palmpay.account.ui.activity.ResetPinActivity;
import com.transsnet.palmpay.account.ui.fragment.auth.VerifyFingerPrintFragment;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.ui.widget.ModelResultAmountList;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.PhoneUtils;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4967a;

    public /* synthetic */ a(int i7) {
        this.f4967a = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4967a) {
            case 0:
                i0.b0("/h5/help/service");
                break;
            case 1:
                i0.b0("/h5/help/service");
                break;
            case 2:
                ResetPinVerification3Fragment.a aVar = ResetPinVerification3Fragment.f25800p;
                i0.b0("/h5/help/service");
                break;
            case 3:
                i0.b0("/h5/help/service");
                break;
            case 4:
                ResetPinVerification5Fragment.a aVar2 = ResetPinVerification5Fragment.f25805p;
                i0.b0("/h5/help/service");
                break;
            case 5:
                n0.g().l("Me_TxnHistory_Click");
                d.F("/main/trans_history");
                break;
            case 6:
                if (!BaseApplication.hasLogin()) {
                    i0.K(null, null);
                } else {
                    d.F("/account/ask_apply_for_balance");
                }
                break;
            case 7:
                n0.g().l("me_click_monthly_overview");
                d.x(null, "MonthlyOverviewHome");
                break;
            case 8:
                EnableCashBoxAutoSaveActivity.a aVar3 = EnableCashBoxAutoSaveActivity.f25851j;
                i0.c0(com.transsnet.palmpay.core.config.d.a(null));
                break;
            case 9:
                int i7 = IdentityVerificationActivity.f25861A;
                i0.b0("/h5/help/service?entryType=register");
                break;
            case 10:
                PalmPayTier3ApplicationDetailActivity.a aVar4 = PalmPayTier3ApplicationDetailActivity.f25934d;
                i0.c0(com.transsnet.palmpay.core.config.d.a(null));
                break;
            case 11:
                int i10 = ResetPinActivity.f25967o;
                i0.b0("/h5/help/service");
                break;
            case 12:
                int i11 = n.f6338c;
                break;
            case 13:
                i0.b0("/cashbox/fixed-savings/security-guaranteed");
                break;
            case 14:
                int i12 = ModelResultAmountList.f28146H;
                i0.b0("/#/transfers/save-money");
                break;
            case 15:
                if (Build.VERSION.SDK_INT < 28) {
                    ActivityUtils.startActivity(new Intent("android.settings.SECURITY_SETTINGS"));
                } else {
                    ActivityUtils.startActivity(new Intent("android.settings.FINGERPRINT_ENROLL"));
                }
                break;
            case 16:
                PhoneUtils.dial(Uri.encode("*861#"));
                break;
            case 17:
                PhoneUtils.dial(Uri.encode("*861#"));
                break;
            case 18:
                d.F("/account/upgrade");
                break;
            case 19:
                d.F("/account/palmpayLevel");
                break;
            case 20:
                d.F("/account/tier3_quota");
                break;
            case 21:
                d.F("/account/upgrade");
                break;
            case 22:
                int i13 = VerifyFingerPrintFragment.f26112C;
                break;
            case 23:
                n0.g().k((ClickEvent) G.f("Popup_Guardian_PP_Account_Click", FirebaseAnalytics.Param.CONTENT, "Close"));
                break;
            case 24:
                i0.b0("/h5/help/service");
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                i0.H(null);
                break;
            case 26:
                i0.H(null);
                break;
            case 27:
                i0.H(null);
                break;
            case 28:
                i0.b0("/compensation/#/home");
                break;
            default:
                i0.b0("/compensation/#/home");
                break;
        }
    }
}
