package com.transsnet.palmpay.account.ui.fragment.quota;

import Ae.o;
import Bc.C0107d;
import F8.e;
import Ja.C0328a;
import Pa.i0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.E;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.config.d;
import com.transsnet.palmpay.core.viewmodel.ActivityWebView;
import com.transsnet.palmpay.core.web.WebJsCallback;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/quota/Tier3QuotaAgreementFragment;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Tier3QuotaAgreementFragment extends BaseFragment {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f26238p = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C0107d f26239i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f26240j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f26241o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Tier3QuotaAgreementFragment get(long j6, boolean z3) {
            Tier3QuotaAgreementFragment tier3QuotaAgreementFragment = new Tier3QuotaAgreementFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("extra_amount", j6);
            bundle.putBoolean("extra_flag", z3);
            tier3QuotaAgreementFragment.setArguments(bundle);
            return tier3QuotaAgreementFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        C0107d c0107d;
        C0107d c0107d2;
        Bundle arguments = getArguments();
        this.f26240j = arguments != null ? arguments.getLong("extra_amount", 0L) : 0L;
        Bundle arguments2 = getArguments();
        this.f26241o = arguments2 != null ? arguments2.getBoolean("extra_flag", false) : false;
        C0107d c0107d3 = this.f26239i;
        if (c0107d3 != null) {
            ((ActivityWebView) c0107d3.f682d).setLayerType(2, null);
        }
        C0107d c0107d4 = this.f26239i;
        if (c0107d4 != null) {
            ActivityWebView activityWebView = (ActivityWebView) c0107d4.f682d;
            E activity = getActivity();
            C0107d c0107d5 = this.f26239i;
            activityWebView.setJsCallback(new WebJsCallback(activity, c0107d5 != null ? (ActivityWebView) c0107d5.f682d : null, null));
        }
        showLoadingDialog(true);
        C0107d c0107d6 = this.f26239i;
        if (c0107d6 != null) {
            ((ActivityWebView) c0107d6.f682d).setWebChromeClient(new o(this, 5));
        }
        String strG = d.g("/h5/conditions/ng/indemnity?amount=" + this.f26240j);
        C0107d c0107d7 = this.f26239i;
        if (c0107d7 != null) {
            ((ActivityWebView) c0107d7.f682d).setWebViewClient(new C0328a(strG));
        }
        C0107d c0107d8 = this.f26239i;
        if (c0107d8 != null) {
            ((ActivityWebView) c0107d8.f682d).loadUrl(strG);
        }
        if (i0.T() && (c0107d2 = this.f26239i) != null) {
            ((ActivityWebView) c0107d2.f682d).addJavascriptInterface(Boolean.TRUE, "themeDark");
        }
        C0107d c0107d9 = this.f26239i;
        if (c0107d9 != null) {
            ((PpTitleBar) c0107d9.f683e).setBackButtonClickListener(new X8.a(this, 1));
        }
        if (this.f26241o && (c0107d = this.f26239i) != null) {
            ((PpButton) c0107d.f681c).setText(CommonViewExtKt.string(k.core_confirm, getActivity()));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_t3_quota_agreement, viewGroup, false);
        int i7 = F8.d.btnNext;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
        if (ppButton != null) {
            i7 = F8.d.titleBar;
            PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
            if (ppTitleBar != null) {
                i7 = F8.d.webView;
                ActivityWebView activityWebView = (ActivityWebView) p059e1.a.m(i7, viewInflate);
                if (activityWebView != null) {
                    C0107d c0107d = new C0107d((ConstraintLayout) viewInflate, ppButton, ppTitleBar, activityWebView);
                    this.f26239i = c0107d;
                    return c0107d;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        C0107d c0107d = this.f26239i;
        if (c0107d != null) {
            ((PpButton) c0107d.f681c).setOnClickListener(new X8.a(this, 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        return 0;
    }
}
