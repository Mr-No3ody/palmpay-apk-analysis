package Bc;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.image.RoundImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f877a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PpButton f879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RoundImageView f881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AppCompatImageView f882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f883g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RoundedTextView f884i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f885j;

    public y(ConstraintLayout constraintLayout, PpButton ppButton, View view, AppCompatImageView appCompatImageView, RoundImageView roundImageView, TextView textView, RoundedTextView roundedTextView, TextView textView2) {
        this.f878b = constraintLayout;
        this.f879c = ppButton;
        this.f880d = view;
        this.f882f = appCompatImageView;
        this.f881e = roundImageView;
        this.f883g = textView;
        this.f884i = roundedTextView;
        this.f885j = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f877a) {
            case 0:
                break;
        }
        return this.f878b;
    }

    public y(ConstraintLayout constraintLayout, PpButton ppButton, View view, RoundImageView roundImageView, AppCompatImageView appCompatImageView, TextView textView, RoundedTextView roundedTextView, TextView textView2) {
        this.f878b = constraintLayout;
        this.f879c = ppButton;
        this.f880d = view;
        this.f881e = roundImageView;
        this.f882f = appCompatImageView;
        this.f883g = textView;
        this.f884i = roundedTextView;
        this.f885j = textView2;
    }
}
