package Wf;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.DisposableHandle;

/* JADX INFO: renamed from: Wf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0758d implements CancelHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0756c[] f10844a;

    public C0758d(C0756c[] c0756cArr) {
        this.f10844a = c0756cArr;
    }

    public final void a() {
        for (C0756c c0756c : this.f10844a) {
            DisposableHandle disposableHandle = c0756c.f10841f;
            if (disposableHandle == null) {
                Intrinsics.n("handle");
                throw null;
            }
            disposableHandle.dispose();
        }
    }

    @Override // kotlinx.coroutines.CancelHandler
    public final void invoke(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f10844a + ']';
    }
}
