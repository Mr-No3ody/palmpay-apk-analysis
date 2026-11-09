package df;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.internal.operators.observable.G;
import io.reactivex.internal.operators.observable.H;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements MaybeSource {
    @Override // io.reactivex.MaybeSource
    public final void subscribe(MaybeObserver maybeObserver) {
        p147jf.a.a(maybeObserver, "observer is null");
        try {
            ((H) this).f37768a.subscribe(new G(maybeObserver, 0));
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th) {
            D3.a.H(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
