package p223od;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.titlebar.PpTitleBar;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f40338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f40339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f40340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PpTitleBar f40341d;

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, PpTitleBar ppTitleBar) {
        this.f40338a = constraintLayout;
        this.f40339b = constraintLayout2;
        this.f40340c = constraintLayout3;
        this.f40341d = ppTitleBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f40338a;
    }
}
