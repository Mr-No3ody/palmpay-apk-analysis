package retrofit2.adapter.rxjava2;

import io.reactivex.internal.operators.flowable.f;
import io.reactivex.internal.operators.observable.C1755g;
import io.reactivex.internal.operators.observable.H;
import io.reactivex.internal.operators.observable.I;
import io.reactivex.internal.operators.observable.w;
import java.lang.reflect.Type;
import retrofit2.Call;
import retrofit2.CallAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements CallAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f41910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f41911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f41912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f41913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f41914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f41915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f41916g;

    public e(Type type, boolean z3, boolean z8, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f41910a = type;
        this.f41911b = z3;
        this.f41912c = z8;
        this.f41913d = z10;
        this.f41914e = z11;
        this.f41915f = z12;
        this.f41916g = z13;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0031  */
    /* JADX WARN: Code duplicated, block: B:19:0x0035  */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045 A[RETURN] */
    @Override // retrofit2.CallAdapter
    public final Object adapt(Call call) {
        a aVar;
        df.d dVar;
        C1755g c1755g = new C1755g(call, 3);
        if (!this.f41911b) {
            if (this.f41912c) {
                dVar = c1755g;
                aVar = new a(c1755g, 0);
            }
            dVar = c1755g;
            if (this.f41913d) {
                return new f(dVar);
            }
            if (this.f41914e) {
                return new I(dVar);
            }
            if (this.f41915f) {
                return new H(dVar);
            }
            if (this.f41916g) {
                return new w(dVar);
            }
            return dVar;
        }
        aVar = new a(c1755g, 1);
        dVar = aVar;
        dVar = c1755g;
        if (this.f41913d) {
            return new f(dVar);
        }
        if (this.f41914e) {
            return new I(dVar);
        }
        if (this.f41915f) {
            return new H(dVar);
        }
        if (this.f41916g) {
            return new w(dVar);
        }
        return dVar;
    }

    @Override // retrofit2.CallAdapter
    public final Type responseType() {
        return this.f41910a;
    }
}
