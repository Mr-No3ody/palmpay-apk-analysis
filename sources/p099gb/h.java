package p099gb;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.credit.view.LoanHomeBottomInfoView;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f37153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PpButton f37154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PpTitleBar f37155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f37156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f37157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f37158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f37159g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LoanHomeBottomInfoView f37160i;

    public h(ConstraintLayout constraintLayout, PpButton ppButton, PpTitleBar ppTitleBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, LoanHomeBottomInfoView loanHomeBottomInfoView) {
        this.f37153a = constraintLayout;
        this.f37154b = ppButton;
        this.f37155c = ppTitleBar;
        this.f37156d = textView;
        this.f37157e = textView2;
        this.f37158f = textView3;
        this.f37159g = textView4;
        this.f37160i = loanHomeBottomInfoView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f37153a;
    }
}
