package androidx.work.impl.constraints.controllers;

import V0.C;
import V0.D;
import android.os.Build;
import androidx.work.impl.constraints.i;
import androidx.work.impl.model.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18480b;

    static {
        new e(null);
        Intrinsics.checkNotNullExpressionValue(C.d("NetworkMeteredCtrlr"), "tagWithPrefix(\"NetworkMeteredCtrlr\")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.work.impl.constraints.trackers.h tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f18480b = 7;
    }

    @Override // androidx.work.impl.constraints.controllers.c
    public final int a() {
        return this.f18480b;
    }

    @Override // androidx.work.impl.constraints.controllers.c
    public final boolean b(Object obj) {
        i value = (i) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        if (Build.VERSION.SDK_INT >= 26) {
            return (value.f18492a && value.f18494c) ? false : true;
        }
        C.c().getClass();
        return !value.f18492a;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean hasConstraint(k workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.f18621j.f9940a == D.f9867e;
    }
}
