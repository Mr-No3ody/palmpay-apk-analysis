package p223od;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.titlebar.PpTitleBar;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f40357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f40358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f40359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f40360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f40361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f40362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PpTitleBar f40363g;

    public h(ConstraintLayout constraintLayout, View view, ConstraintLayout constraintLayout2, TextView textView, ConstraintLayout constraintLayout3, TextView textView2, PpTitleBar ppTitleBar) {
        this.f40357a = constraintLayout;
        this.f40358b = view;
        this.f40359c = constraintLayout2;
        this.f40360d = textView;
        this.f40361e = constraintLayout3;
        this.f40362f = textView2;
        this.f40363g = ppTitleBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f40357a;
    }
}
