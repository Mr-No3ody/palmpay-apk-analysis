package androidx.work.impl.constraints.controllers;

import V0.C0689h;
import Yf.EnumC0789a;
import androidx.work.impl.model.k;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C1871c;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements ConstraintController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.work.impl.constraints.trackers.e f18477a;

    public c(androidx.work.impl.constraints.trackers.e tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f18477a = tracker;
    }

    public abstract int a();

    public abstract boolean b(Object obj);

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean isCurrentlyConstrained(k workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return hasConstraint(workSpec) && b(this.f18477a.a());
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final Flow track(C0689h constraints) {
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        return new C1871c(new b(this, null), kotlin.coroutines.f.f38943a, -2, EnumC0789a.f11390a);
    }
}
