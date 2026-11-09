package p223od;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f40503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PpButton f40504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f40505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f40506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PpTitleBar f40507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f40508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f40509g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f40510i;

    public t(ConstraintLayout constraintLayout, PpButton ppButton, LinearLayout linearLayout, View view, PpTitleBar ppTitleBar, TextView textView, TextView textView2, TextView textView3) {
        this.f40503a = constraintLayout;
        this.f40504b = ppButton;
        this.f40505c = linearLayout;
        this.f40506d = view;
        this.f40507e = ppTitleBar;
        this.f40508f = textView;
        this.f40509g = textView2;
        this.f40510i = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f40503a;
    }
}
