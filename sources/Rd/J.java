package Rd;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.viewmodel.FailResultPageAdView;
import com.transsnet.palmpay.custom_view.model.TransactionResultHeaderModel;

/* JADX INFO: loaded from: classes4.dex */
public final class J implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f8082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransactionResultHeaderModel f8083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SingleAdView f8084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f8085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FailResultPageAdView f8086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bc.k f8087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PpTitleBar f8088g;

    public J(RelativeLayout relativeLayout, TransactionResultHeaderModel transactionResultHeaderModel, SingleAdView singleAdView, TextView textView, FailResultPageAdView failResultPageAdView, Bc.k kVar, PpTitleBar ppTitleBar) {
        this.f8082a = relativeLayout;
        this.f8083b = transactionResultHeaderModel;
        this.f8084c = singleAdView;
        this.f8085d = textView;
        this.f8086e = failResultPageAdView;
        this.f8087f = kVar;
        this.f8088g = ppTitleBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8082a;
    }
}
