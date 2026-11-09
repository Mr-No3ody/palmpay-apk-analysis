package androidx.fragment.app;

import android.transition.Transition;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.fragment.app.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1173h extends AbstractC1172g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f17136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f17138e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1173h(x0 operation, androidx.core.os.d signal, boolean z3, boolean z8) {
        super(operation, signal);
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(signal, "signal");
        B0 b0 = operation.f17246a;
        B0 b7 = B0.f16951c;
        Fragment fragment = operation.f17248c;
        this.f17136c = b0 == b7 ? z3 ? fragment.getReenterTransition() : fragment.getEnterTransition() : z3 ? fragment.getReturnTransition() : fragment.getExitTransition();
        this.f17137d = operation.f17246a == b7 ? z3 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
        this.f17138e = z8 ? z3 ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
    }

    public final s0 c() {
        Object obj = this.f17136c;
        s0 s0VarD = d(obj);
        Object obj2 = this.f17138e;
        s0 s0VarD2 = d(obj2);
        if (s0VarD == null || s0VarD2 == null || s0VarD == s0VarD2) {
            return s0VarD == null ? s0VarD2 : s0VarD;
        }
        throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f17128a.f17248c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
    }

    public final s0 d(Object obj) {
        if (obj == null) {
            return null;
        }
        q0 q0Var = l0.f17180a;
        if (obj instanceof Transition) {
            return q0Var;
        }
        s0 s0Var = l0.f17181b;
        if (s0Var != null && s0Var.e(obj)) {
            return s0Var;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f17128a.f17248c + " is not a valid framework Transition or AndroidX Transition");
    }
}
