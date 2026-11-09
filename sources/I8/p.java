package I8;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.adsdk.widgets.SingleAdView;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SingleAdView f4176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PpFormVertical f4177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PpFormVertical f4178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PpFormVertical f4179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PpFormVertical f4180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NestedScrollView f4181g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PpButton f4182i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f4183j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f4184o;

    public p(ConstraintLayout constraintLayout, SingleAdView singleAdView, PpFormVertical ppFormVertical, PpFormVertical ppFormVertical2, PpFormVertical ppFormVertical3, PpFormVertical ppFormVertical4, NestedScrollView nestedScrollView, PpButton ppButton, TextView textView, TextView textView2) {
        this.f4175a = constraintLayout;
        this.f4176b = singleAdView;
        this.f4177c = ppFormVertical;
        this.f4178d = ppFormVertical2;
        this.f4179e = ppFormVertical3;
        this.f4180f = ppFormVertical4;
        this.f4181g = nestedScrollView;
        this.f4182i = ppButton;
        this.f4183j = textView;
        this.f4184o = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4175a;
    }
}
