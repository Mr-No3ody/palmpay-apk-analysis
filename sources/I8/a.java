package I8;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PpButton f4034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f4035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final NestedScrollView f4036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PpTitleBar f4037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f4038f;

    public a(ConstraintLayout constraintLayout, PpButton ppButton, LinearLayout linearLayout, NestedScrollView nestedScrollView, PpTitleBar ppTitleBar, TextView textView) {
        this.f4033a = constraintLayout;
        this.f4034b = ppButton;
        this.f4035c = linearLayout;
        this.f4036d = nestedScrollView;
        this.f4037e = ppTitleBar;
        this.f4038f = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4033a;
    }
}
