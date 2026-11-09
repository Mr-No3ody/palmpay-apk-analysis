package Bc;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IconicsTextView f706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IconicsTextView f707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IconicsImageView f708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PpTitleBar f709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f710g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f711i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f712j;

    public g(LinearLayout linearLayout, ConstraintLayout constraintLayout, IconicsTextView iconicsTextView, IconicsTextView iconicsTextView2, IconicsImageView iconicsImageView, PpTitleBar ppTitleBar, TextView textView, TextView textView2, TextView textView3) {
        this.f704a = linearLayout;
        this.f705b = constraintLayout;
        this.f706c = iconicsTextView;
        this.f707d = iconicsTextView2;
        this.f708e = iconicsImageView;
        this.f709f = ppTitleBar;
        this.f710g = textView;
        this.f711i = textView2;
        this.f712j = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f704a;
    }
}
