package Rd;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.flexbox.FlexboxLayout;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.edit.PpAmountEditText;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f8359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PpAmountEditText f8360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FlexboxLayout f8361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IconicsImageView f8362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f8363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f8364g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f8365i;

    public j0(ConstraintLayout constraintLayout, Button button, PpAmountEditText ppAmountEditText, FlexboxLayout flexboxLayout, IconicsImageView iconicsImageView, TextView textView, TextView textView2, TextView textView3) {
        this.f8358a = constraintLayout;
        this.f8359b = button;
        this.f8360c = ppAmountEditText;
        this.f8361d = flexboxLayout;
        this.f8362e = iconicsImageView;
        this.f8363f = textView;
        this.f8364g = textView2;
        this.f8365i = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8358a;
    }
}
