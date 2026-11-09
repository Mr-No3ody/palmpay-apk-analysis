package Rd;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.titlebar.PpTitleBar;

/* JADX INFO: renamed from: Rd.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0594j implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f8356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PpTitleBar f8357c;

    public C0594j(LinearLayout linearLayout, FrameLayout frameLayout, PpTitleBar ppTitleBar) {
        this.f8355a = linearLayout;
        this.f8356b = frameLayout;
        this.f8357c = ppTitleBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8355a;
    }
}
