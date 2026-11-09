package Rd;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;

/* JADX INFO: loaded from: classes4.dex */
public final class X implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PpButton f8176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IconicsTextView f8177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f8178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f8179e;

    public X(ConstraintLayout constraintLayout, PpButton ppButton, IconicsTextView iconicsTextView, TextView textView, TextView textView2) {
        this.f8175a = constraintLayout;
        this.f8176b = ppButton;
        this.f8177c = iconicsTextView;
        this.f8178d = textView;
        this.f8179e = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8175a;
    }
}
