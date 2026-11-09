package Rd;

import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.viewmodel.FailResultPageAdView;
import com.transsnet.palmpay.custom_view.model.TransactionResultHeaderModel;

/* JADX INFO: renamed from: Rd.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0598n implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f8403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SingleAdView f8404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FailResultPageAdView f8405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IconicsImageView f8406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f8407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TransactionResultHeaderModel f8408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f8409g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ViewStub f8410i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PpTitleBar f8411j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f8412o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f8413p;
    public final TextView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f8414v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinearLayout f8415w;

    public C0598n(RelativeLayout relativeLayout, SingleAdView singleAdView, FailResultPageAdView failResultPageAdView, IconicsImageView iconicsImageView, LinearLayout linearLayout, TransactionResultHeaderModel transactionResultHeaderModel, View view, ViewStub viewStub, PpTitleBar ppTitleBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, LinearLayout linearLayout2) {
        this.f8403a = relativeLayout;
        this.f8404b = singleAdView;
        this.f8405c = failResultPageAdView;
        this.f8406d = iconicsImageView;
        this.f8407e = linearLayout;
        this.f8408f = transactionResultHeaderModel;
        this.f8409g = view;
        this.f8410i = viewStub;
        this.f8411j = ppTitleBar;
        this.f8412o = textView;
        this.f8413p = textView2;
        this.t = textView3;
        this.f8414v = textView4;
        this.f8415w = linearLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8403a;
    }
}
