package Rd;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.titlebar.PpTitleBar;

/* JADX INFO: renamed from: Rd.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0604u implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f8523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PpTitleBar f8524c;

    public C0604u(LinearLayout linearLayout, FrameLayout frameLayout, PpTitleBar ppTitleBar) {
        this.f8522a = linearLayout;
        this.f8523b = frameLayout;
        this.f8524c = ppTitleBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8522a;
    }
}
