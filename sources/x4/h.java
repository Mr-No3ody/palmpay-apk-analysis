package x4;

import android.view.View;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.titlebar.PpTitleBar;

/* JADX INFO: loaded from: classes.dex */
public final class h implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f43609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f43610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PpTitleBar f43611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewStub f43612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ViewStub f43613e;

    public h(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, PpTitleBar ppTitleBar, ViewStub viewStub, ViewStub viewStub2) {
        this.f43609a = constraintLayout;
        this.f43610b = constraintLayout2;
        this.f43611c = ppTitleBar;
        this.f43612d = viewStub;
        this.f43613e = viewStub2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f43609a;
    }
}
