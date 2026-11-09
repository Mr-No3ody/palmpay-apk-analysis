package p142ja;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f38489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f38490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PpButton f38491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PpTitleBar f38492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f38493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f38494f;

    public j(ConstraintLayout constraintLayout, LinearLayout linearLayout, PpButton ppButton, PpTitleBar ppTitleBar, TextView textView, TextView textView2) {
        this.f38489a = constraintLayout;
        this.f38490b = linearLayout;
        this.f38491c = ppButton;
        this.f38492d = ppTitleBar;
        this.f38493e = textView;
        this.f38494f = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f38489a;
    }
}
