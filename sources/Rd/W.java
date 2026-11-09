package Rd;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpFormVertical;

/* JADX INFO: loaded from: classes4.dex */
public final class W implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PpButton f8166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PpFormVertical f8167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f8168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f8169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f8170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f8171g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f8172i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f8173j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f8174o;

    public W(ConstraintLayout constraintLayout, PpButton ppButton, PpFormVertical ppFormVertical, IconicsImageView iconicsImageView, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.f8165a = constraintLayout;
        this.f8166b = ppButton;
        this.f8167c = ppFormVertical;
        this.f8168d = imageView;
        this.f8169e = textView;
        this.f8170f = textView2;
        this.f8171g = textView3;
        this.f8172i = textView4;
        this.f8173j = textView5;
        this.f8174o = textView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8165a;
    }
}
