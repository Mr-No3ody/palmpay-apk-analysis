package Rd;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.titlebar.PpTitleBar;

/* JADX INFO: renamed from: Rd.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0609z implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PpTitleBar f8556b;

    public C0609z(LinearLayout linearLayout, PpTitleBar ppTitleBar) {
        this.f8555a = linearLayout;
        this.f8556b = ppTitleBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8555a;
    }
}
