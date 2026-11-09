package Rd;

import Bc.C0107d;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;

/* JADX INFO: renamed from: Rd.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0601q implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0107d f8452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PpButton f8453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PpTitleBar f8454d;

    public C0601q(ConstraintLayout constraintLayout, C0107d c0107d, PpButton ppButton, PpTitleBar ppTitleBar) {
        this.f8451a = constraintLayout;
        this.f8452b = c0107d;
        this.f8453c = ppButton;
        this.f8454d = ppTitleBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8451a;
    }
}
