package I8;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f4078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IconicsImageView f4079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f4080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f4081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f4082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f4083g;

    public g(ConstraintLayout constraintLayout, TextView textView, PpButton ppButton, IconicsImageView iconicsImageView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f4077a = constraintLayout;
        this.f4078b = textView;
        this.f4079c = iconicsImageView;
        this.f4080d = textView2;
        this.f4081e = textView3;
        this.f4082f = textView4;
        this.f4083g = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4077a;
    }
}
