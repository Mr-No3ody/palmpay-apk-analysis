package androidx.work.impl.constraints;

import V0.C0689h;
import Yf.EnumC0789a;
import android.net.ConnectivityManager;
import androidx.work.impl.constraints.controllers.ConstraintController;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C1871c;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes.dex */
public final class h implements ConstraintController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f18491a;

    public h(ConnectivityManager connManager) {
        Intrinsics.checkNotNullParameter(connManager, "connManager");
        this.f18491a = connManager;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean hasConstraint(androidx.work.impl.model.k workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.f18621j.f9941b.f18699a != null;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean isCurrentlyConstrained(androidx.work.impl.model.k workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        if (hasConstraint(workSpec)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final Flow track(C0689h constraints) {
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        return new C1871c(new g(constraints, this, null), kotlin.coroutines.f.f38943a, -2, EnumC0789a.f11390a);
    }
}
