package Rd;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;

/* JADX INFO: loaded from: classes4.dex */
public final class Q implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PpButton f8136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PpButton f8137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IconicsImageView f8138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f8139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f8140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f8141g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f8142i;

    public Q(ConstraintLayout constraintLayout, PpButton ppButton, PpButton ppButton2, IconicsImageView iconicsImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f8135a = constraintLayout;
        this.f8136b = ppButton;
        this.f8137c = ppButton2;
        this.f8138d = iconicsImageView;
        this.f8139e = textView;
        this.f8140f = textView2;
        this.f8141g = textView3;
        this.f8142i = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8135a;
    }
}
