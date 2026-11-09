package K3;

import androidx.lifecycle.F;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j extends F {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f4931l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f4932m;

    static {
        new i(null);
    }

    @Override // androidx.lifecycle.B
    public final void e(LifecycleOwner owner, Observer observer) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        super.e(owner, new h(this, observer, 0));
    }

    @Override // androidx.lifecycle.B
    public final void k(Object obj) {
        this.f4931l.set(true);
        super.k(obj);
    }
}
