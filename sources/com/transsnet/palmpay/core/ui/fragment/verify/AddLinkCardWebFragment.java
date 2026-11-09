package com.transsnet.palmpay.core.ui.fragment.verify;

import Ae.o;
import Ja.C0328a;
import android.text.TextUtils;
import android.widget.ProgressBar;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.viewmodel.AndroidXWebView;
import p025ba.e;
import p025ba.g;

/* JADX INFO: loaded from: classes3.dex */
public class AddLinkCardWebFragment extends BaseFragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AndroidXWebView f27925i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ProgressBar f27926j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f27927o = "";

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return g.core_fragment_add_link_card_web;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        if (getArguments() != null) {
            this.f27927o = getArguments().getString("url");
        }
        this.f27925i = (AndroidXWebView) this.f27318b.findViewById(e.aalaw_webview);
        ProgressBar progressBar = (ProgressBar) this.f27318b.findViewById(e.aalaw_progressbar);
        this.f27926j = progressBar;
        progressBar.setMax(100);
        this.f27925i.requestFocus();
        this.f27925i.getSettings().setJavaScriptEnabled(true);
        this.f27925i.setWebViewClient(new C0328a(this, 0));
        this.f27925i.setWebChromeClient(new o(this, 1));
        if (TextUtils.isEmpty(this.f27927o)) {
            return 0;
        }
        this.f27925i.loadUrl(this.f27927o);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        AndroidXWebView androidXWebView = this.f27925i;
        if (androidXWebView != null) {
            androidXWebView.destroy();
        }
    }
}
