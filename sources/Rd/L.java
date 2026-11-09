package Rd;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;

/* JADX INFO: loaded from: classes4.dex */
public final class L implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PpButton f8098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IconicsImageView f8099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f8100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f8101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f8102f;

    public L(ConstraintLayout constraintLayout, PpButton ppButton, IconicsImageView iconicsImageView, TextView textView, TextView textView2, TextView textView3) {
        this.f8097a = constraintLayout;
        this.f8098b = ppButton;
        this.f8099c = iconicsImageView;
        this.f8100d = textView;
        this.f8101e = textView2;
        this.f8102f = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8097a;
    }
}
