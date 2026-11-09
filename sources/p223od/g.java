package p223od;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.viewmodel.FailResultPageAdView;
import com.transsnet.palmpay.send_money.ui.view.TransferResultHeaderModel;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements ViewBinding {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final TransferResultHeaderModel f40342A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final FailResultPageAdView f40343B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f40344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f40345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f40346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IconicsImageView f40347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f40348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearLayout f40349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinearLayout f40350g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Button f40351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinearLayout f40352j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ConstraintLayout f40353o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PpTitleBar f40354p;
    public final TextView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f40355v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final IconicsTextView f40356w;

    public g(ConstraintLayout constraintLayout, LinearLayout linearLayout, LinearLayout linearLayout2, IconicsImageView iconicsImageView, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, Button button, LinearLayout linearLayout6, ConstraintLayout constraintLayout2, PpTitleBar ppTitleBar, TextView textView, TextView textView2, IconicsTextView iconicsTextView, TransferResultHeaderModel transferResultHeaderModel, FailResultPageAdView failResultPageAdView) {
        this.f40344a = constraintLayout;
        this.f40345b = linearLayout;
        this.f40346c = linearLayout2;
        this.f40347d = iconicsImageView;
        this.f40348e = linearLayout3;
        this.f40349f = linearLayout4;
        this.f40350g = linearLayout5;
        this.f40351i = button;
        this.f40352j = linearLayout6;
        this.f40353o = constraintLayout2;
        this.f40354p = ppTitleBar;
        this.t = textView;
        this.f40355v = textView2;
        this.f40356w = iconicsTextView;
        this.f40342A = transferResultHeaderModel;
        this.f40343B = failResultPageAdView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f40344a;
    }
}
