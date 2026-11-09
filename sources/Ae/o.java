package Ae;

import Bc.C0107d;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.alibaba.android.arouter.launcher.ARouter;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankAddLinkCardWebFragment;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelUp3Activity;
import com.transsnet.palmpay.account.ui.fragment.quota.Tier3QuotaAgreementFragment;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.ui.fragment.verify.AddLinkCardWebFragment;
import com.transsnet.palmpay.core.viewmodel.PayResultLotteryView;
import com.transsnet.palmpay.echat.EchatActivity;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.ThirdPartyMerchantActivity;
import com.wang.avi.AVLoadingIndicatorView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f292b;

    public /* synthetic */ o(Object obj, int i7) {
        this.f291a = i7;
        this.f292b = obj;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView view, int i7) {
        PayResultLotteryView payResultLotteryView;
        PushMessage pushMessage;
        PpButton ppButton;
        switch (this.f291a) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                super.onProgressChanged(view, i7);
                if (i7 == 100) {
                    p pVar = (p) this.f292b;
                    ((AVLoadingIndicatorView) pVar.f297g.getValue()).post(new n(pVar, 0));
                }
                break;
            case 1:
                super.onProgressChanged(view, i7);
                AddLinkCardWebFragment addLinkCardWebFragment = (AddLinkCardWebFragment) this.f292b;
                if (i7 != 100) {
                    addLinkCardWebFragment.f27926j.setVisibility(0);
                    addLinkCardWebFragment.f27926j.setProgress(i7);
                } else {
                    addLinkCardWebFragment.f27926j.setVisibility(8);
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(view, "view");
                super.onProgressChanged(view, i7);
                if (i7 == 100) {
                    ((PalmPayLevelUp3Activity) this.f292b).showLoadingDialog(false);
                }
                break;
            case 3:
                Intrinsics.checkNotNullParameter(view, "view");
                super.onProgressChanged(view, i7);
                FlexiBankAddLinkCardWebFragment flexiBankAddLinkCardWebFragment = (FlexiBankAddLinkCardWebFragment) this.f292b;
                if (i7 != 100) {
                    ProgressBar progressBar = flexiBankAddLinkCardWebFragment.t;
                    if (progressBar != null) {
                        progressBar.setVisibility(0);
                    }
                    ProgressBar progressBar2 = flexiBankAddLinkCardWebFragment.t;
                    if (progressBar2 != null) {
                        progressBar2.setProgress(i7);
                    }
                } else {
                    ProgressBar progressBar3 = flexiBankAddLinkCardWebFragment.t;
                    if (progressBar3 != null) {
                        progressBar3.setVisibility(8);
                    }
                }
                break;
            case 4:
                super.onProgressChanged(view, i7);
                if (i7 == 100 && (pushMessage = (payResultLotteryView = (PayResultLotteryView) this.f292b).f28559b) != null) {
                    payResultLotteryView.onReceivePushMessage(pushMessage);
                    break;
                }
                break;
            case 5:
                Intrinsics.checkNotNullParameter(view, "view");
                super.onProgressChanged(view, i7);
                if (i7 == 100) {
                    Tier3QuotaAgreementFragment tier3QuotaAgreementFragment = (Tier3QuotaAgreementFragment) this.f292b;
                    tier3QuotaAgreementFragment.showLoadingDialog(false);
                    C0107d c0107d = tier3QuotaAgreementFragment.f26239i;
                    if (c0107d != null && (ppButton = (PpButton) c0107d.f681c) != null) {
                        ppButton.setEnabled(true);
                        break;
                    }
                }
                break;
            case 6:
            default:
                super.onProgressChanged(view, i7);
                break;
            case 7:
                super.onProgressChanged(view, i7);
                ThirdPartyMerchantActivity thirdPartyMerchantActivity = (ThirdPartyMerchantActivity) this.f292b;
                if (i7 >= 100) {
                    thirdPartyMerchantActivity.f34993b.setVisibility(8);
                } else {
                    thirdPartyMerchantActivity.f34993b.setVisibility(0);
                    thirdPartyMerchantActivity.f34993b.setProgress(i7);
                }
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        switch (this.f291a) {
            case 7:
                super.onReceivedTitle(webView, str);
                if (!TextUtils.isEmpty(str)) {
                    ((ThirdPartyMerchantActivity) this.f292b).f34996e.setTitle(str);
                }
                break;
            default:
                super.onReceivedTitle(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        switch (this.f291a) {
            case 6:
                EchatActivity echatActivity = (EchatActivity) this.f292b;
                echatActivity.f31829b = valueCallback;
                try {
                    ARouter.getInstance().build("/account/setUserPhoto").withBoolean("crop_photo", false).withBoolean("origin_photo", true).withBoolean("photoBig", true).navigation(echatActivity, 254);
                    break;
                } catch (Exception unused) {
                }
                return true;
            default:
                return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
    }
}
