package androidx.work.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.work.impl.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1277j implements StartStopTokens {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1276i f18565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18566c;

    public C1277j(C1276i delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f18565b = delegate;
        this.f18566c = new Object();
    }

    @Override // androidx.work.impl.StartStopTokens
    public final boolean contains(androidx.work.impl.model.e id2) {
        boolean zContains;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.f18566c) {
            zContains = this.f18565b.contains(id2);
        }
        return zContains;
    }

    @Override // androidx.work.impl.StartStopTokens
    public final C1275h remove(androidx.work.impl.model.e id2) {
        C1275h c1275hRemove;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.f18566c) {
            c1275hRemove = this.f18565b.remove(id2);
        }
        return c1275hRemove;
    }

    @Override // androidx.work.impl.StartStopTokens
    public final C1275h tokenFor(androidx.work.impl.model.e id2) {
        C1275h c1275h;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.f18566c) {
            c1275h = this.f18565b.tokenFor(id2);
        }
        return c1275h;
    }

    @Override // androidx.work.impl.StartStopTokens
    public final List remove(String workSpecId) {
        List listRemove;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.f18566c) {
            listRemove = this.f18565b.remove(workSpecId);
        }
        return listRemove;
    }
}
