package Wf;

import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.DisposableHandle;

/* JADX INFO: renamed from: Wf.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0764h implements CancelHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10858b;

    public /* synthetic */ C0764h(Object obj, int i7) {
        this.f10857a = i7;
        this.f10858b = obj;
    }

    @Override // kotlinx.coroutines.CancelHandler
    public final void invoke(Throwable th) {
        switch (this.f10857a) {
            case 0:
                ((ScheduledFuture) this.f10858b).cancel(false);
                break;
            case 1:
                ((Function1) this.f10858b).invoke(th);
                break;
            default:
                ((DisposableHandle) this.f10858b).dispose();
                break;
        }
    }

    public final String toString() {
        switch (this.f10857a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f10858b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((Function1) this.f10858b).getClass().getSimpleName() + '@' + AbstractC0780y.i(this) + ']';
            default:
                return "DisposeOnCancel[" + ((DisposableHandle) this.f10858b) + ']';
        }
    }
}
