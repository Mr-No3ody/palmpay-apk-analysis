package Rd;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;

/* JADX INFO: loaded from: classes4.dex */
public final class S implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PpButton f8144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IconicsImageView f8145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f8146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f8147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f8148f;

    public S(ConstraintLayout constraintLayout, PpButton ppButton, IconicsImageView iconicsImageView, TextView textView, TextView textView2, TextView textView3) {
        this.f8143a = constraintLayout;
        this.f8144b = ppButton;
        this.f8145c = iconicsImageView;
        this.f8146d = textView;
        this.f8147e = textView2;
        this.f8148f = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8143a;
    }
}
