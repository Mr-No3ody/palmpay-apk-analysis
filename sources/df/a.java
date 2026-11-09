package df;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.internal.operators.observable.u;
import io.reactivex.internal.operators.observable.w;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements CompletableSource {
    @Override // io.reactivex.CompletableSource
    public final void subscribe(CompletableObserver completableObserver) {
        p147jf.a.a(completableObserver, "observer is null");
        try {
            ((w) this).f37877a.subscribe(new u(completableObserver, 1));
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th) {
            D3.a.H(th);
            org.chromium.support_lib_boundary.util.b.V(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
