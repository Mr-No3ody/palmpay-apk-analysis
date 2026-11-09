package Rd;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.titlebar.PpTitleBar;

/* JADX INFO: renamed from: Rd.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0586b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PpTitleBar f8208b;

    public C0586b(LinearLayout linearLayout, PpTitleBar ppTitleBar) {
        this.f8207a = linearLayout;
        this.f8208b = ppTitleBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8207a;
    }
}
