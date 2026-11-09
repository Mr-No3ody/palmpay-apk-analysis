package Wf;

import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 implements DisposableHandle, ChildHandle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0 f10897a = new s0();

    @Override // kotlinx.coroutines.ChildHandle
    public final boolean childCancelled(Throwable th) {
        return false;
    }

    @Override // kotlinx.coroutines.ChildHandle
    public final Job getParent() {
        return null;
    }

    public final String toString() {
        return "NonDisposableHandle";
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
    }
}
