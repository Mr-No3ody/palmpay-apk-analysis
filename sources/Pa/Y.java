package Pa;

import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.internal.operators.observable.C1759k;
import io.reactivex.internal.operators.observable.C1760l;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class Y implements ObservableTransformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WeakReference f7061b;

    public /* synthetic */ Y(WeakReference weakReference, int i7) {
        this.f7060a = i7;
        this.f7061b = weakReference;
    }

    @Override // io.reactivex.ObservableTransformer
    public final ObservableSource apply(df.d dVar) {
        switch (this.f7060a) {
            case 0:
                p183m6.j jVar = new p183m6.j(this, 5);
                dVar.getClass();
                C1760l c1760l = new C1760l(dVar, jVar, 0);
                p045d3.k kVar = new p045d3.k(this, 6);
                return new C1759k(c1760l, p147jf.a.f38600d, new C0525w(kVar, 24), kVar);
            default:
                p183m6.j jVar2 = new p183m6.j(this, 6);
                dVar.getClass();
                C1760l c1760l2 = new C1760l(dVar, jVar2, 0);
                p045d3.k kVar2 = new p045d3.k(this, 7);
                return new C1759k(c1760l2, p147jf.a.f38600d, new C0525w(kVar2, 24), kVar2);
        }
    }
}
