package p142ja;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f38483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PpButton f38484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PpButton f38485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f38486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f38487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IconicsImageView f38488f;

    public i(ConstraintLayout constraintLayout, PpButton ppButton, PpButton ppButton2, TextView textView, TextView textView2, IconicsImageView iconicsImageView) {
        this.f38483a = constraintLayout;
        this.f38484b = ppButton;
        this.f38485c = ppButton2;
        this.f38486d = textView;
        this.f38487e = textView2;
        this.f38488f = iconicsImageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f38483a;
    }
}
