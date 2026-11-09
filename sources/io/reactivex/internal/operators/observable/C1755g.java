package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import retrofit2.Call;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1755g extends df.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f37818b;

    public /* synthetic */ C1755g(Object obj, int i7) {
        this.f37817a = i7;
        this.f37818b = obj;
    }

    @Override // df.d
    public final void j(Observer observer) {
        switch (this.f37817a) {
            case 0:
                C1753e c1753e = new C1753e(observer);
                observer.onSubscribe(c1753e);
                try {
                    ((ObservableOnSubscribe) this.f37818b).subscribe(c1753e);
                } catch (Throwable th) {
                    D3.a.H(th);
                    c1753e.onError(th);
                    return;
                }
                break;
            case 1:
                Object[] objArr = (Object[]) this.f37818b;
                r rVar = new r(observer, objArr);
                observer.onSubscribe(rVar);
                if (!rVar.f37872d) {
                    int length = objArr.length;
                    for (int i7 = 0; i7 < length && !rVar.f37873e; i7++) {
                        Object obj = objArr[i7];
                        if (obj == null) {
                            rVar.f37869a.onError(new NullPointerException(androidx.camera.camera2.internal.F.c(i7, "The element at index ", " is null")));
                        } else {
                            rVar.f37869a.onNext(obj);
                        }
                        break;
                    }
                    if (!rVar.f37873e) {
                        rVar.f37869a.onComplete();
                    }
                    break;
                }
                break;
            case 2:
                ((ObservableSource) this.f37818b).subscribe(observer);
                break;
            default:
                Call callMo136clone = ((Call) this.f37818b).mo136clone();
                retrofit2.adapter.rxjava2.b bVar = new retrofit2.adapter.rxjava2.b(callMo136clone);
                observer.onSubscribe(bVar);
                if (!bVar.f41908b) {
                    boolean z3 = false;
                    try {
                        retrofit2.K kExecute = callMo136clone.execute();
                        if (!bVar.f41908b) {
                            observer.onNext(kExecute);
                        }
                        if (!bVar.f41908b) {
                            try {
                                observer.onComplete();
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                                z3 = true;
                                D3.a.H(th);
                                if (z3) {
                                    org.chromium.support_lib_boundary.util.b.V(th);
                                    return;
                                }
                                if (bVar.f41908b) {
                                    return;
                                }
                                try {
                                    observer.onError(th);
                                    return;
                                } catch (Throwable th3) {
                                    D3.a.H(th3);
                                    org.chromium.support_lib_boundary.util.b.V(new p118hf.b(th, th3));
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                break;
        }
    }
}
