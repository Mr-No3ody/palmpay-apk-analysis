package Rd;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: Rd.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0600p implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MotionLayout f8442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f8443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f8444c;

    public C0600p(MotionLayout motionLayout, k0 k0Var, View view) {
        this.f8442a = motionLayout;
        this.f8443b = k0Var;
        this.f8444c = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8442a;
    }
}
