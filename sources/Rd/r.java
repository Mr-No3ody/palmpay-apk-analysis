package Rd;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.titlebar.PpTitleBar;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f8461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PpTitleBar f8462c;

    public r(LinearLayout linearLayout, LinearLayout linearLayout2, PpTitleBar ppTitleBar) {
        this.f8460a = linearLayout;
        this.f8461b = linearLayout2;
        this.f8462c = ppTitleBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8460a;
    }
}
