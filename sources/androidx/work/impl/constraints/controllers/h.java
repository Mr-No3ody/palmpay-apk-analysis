package androidx.work.impl.constraints.controllers;

import V0.C;
import V0.D;
import androidx.work.impl.constraints.i;
import androidx.work.impl.model.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18481b;

    static {
        new g(null);
        Intrinsics.checkNotNullExpressionValue(C.d("NetworkNotRoamingCtrlr"), "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.work.impl.constraints.trackers.h tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f18481b = 7;
    }

    @Override // androidx.work.impl.constraints.controllers.c
    public final int a() {
        return this.f18481b;
    }

    @Override // androidx.work.impl.constraints.controllers.c
    public final boolean b(Object obj) {
        i value = (i) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        return (value.f18492a && value.f18495d) ? false : true;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean hasConstraint(k workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.f18621j.f9940a == D.f9866d;
    }
}
