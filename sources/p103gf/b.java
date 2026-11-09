package p103gf;

import D3.a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Cancellable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends AtomicReference implements Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37244a;

    public /* synthetic */ b() {
        this.f37244a = 2;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        Object andSet;
        Cancellable cancellable;
        switch (this.f37244a) {
            case 0:
                if (get() != null && (andSet = getAndSet(null)) != null) {
                    ((Runnable) andSet).run();
                    break;
                }
                break;
            case 1:
                if (get() != null && (cancellable = (Cancellable) getAndSet(null)) != null) {
                    try {
                        cancellable.cancel();
                    } catch (Exception e10) {
                        a.H(e10);
                        org.chromium.support_lib_boundary.util.b.V(e10);
                        return;
                    }
                    break;
                }
                break;
            default:
                p001if.a.a(this);
                break;
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f37244a) {
            case 0:
                return get() == null;
            case 1:
                return get() == null;
            default:
                return ((Disposable) get()) == p001if.a.f37585a;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.f37244a) {
            case 0:
                return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i7) {
        super(obj);
        this.f37244a = i7;
    }
}
