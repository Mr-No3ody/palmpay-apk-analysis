package Rd;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: Rd.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0589e implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MotionLayout f8261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f8262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f8263c;

    public C0589e(MotionLayout motionLayout, k0 k0Var, View view) {
        this.f8261a = motionLayout;
        this.f8262b = k0Var;
        this.f8263c = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8261a;
    }
}
