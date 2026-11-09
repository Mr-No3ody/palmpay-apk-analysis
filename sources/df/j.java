package df;

import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.internal.operators.observable.G;
import io.reactivex.internal.operators.observable.I;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j implements SingleSource {
    @Override // io.reactivex.SingleSource
    public final void subscribe(SingleObserver singleObserver) {
        p147jf.a.a(singleObserver, "observer is null");
        try {
            ((I) this).f37769a.subscribe(new G(singleObserver, 1));
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
