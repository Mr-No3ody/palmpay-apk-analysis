package retrofit2.adapter.rxjava2;

import C9.N;
import io.reactivex.Observer;
import io.reactivex.internal.operators.observable.C1755g;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends df.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1755g f41906b;

    public /* synthetic */ a(C1755g c1755g, int i7) {
        this.f41905a = i7;
        this.f41906b = c1755g;
    }

    @Override // df.d
    public final void j(Observer observer) {
        switch (this.f41905a) {
            case 0:
                this.f41906b.subscribe(new N(observer, 7));
                break;
            default:
                this.f41906b.subscribe(new C2085k0(observer, 27));
                break;
        }
    }
}
