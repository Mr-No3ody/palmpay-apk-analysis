package Rd;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;

/* JADX INFO: loaded from: classes4.dex */
public final class K implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PpButton f8090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PpButton f8091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IconicsImageView f8092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f8093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f8094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f8095g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f8096i;

    public K(ConstraintLayout constraintLayout, PpButton ppButton, PpButton ppButton2, IconicsImageView iconicsImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f8089a = constraintLayout;
        this.f8090b = ppButton;
        this.f8091c = ppButton2;
        this.f8092d = iconicsImageView;
        this.f8093e = textView;
        this.f8094f = textView2;
        this.f8095g = textView3;
        this.f8096i = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8089a;
    }
}
