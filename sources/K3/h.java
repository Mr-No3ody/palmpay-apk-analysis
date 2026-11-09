package K3;

import androidx.lifecycle.F;
import androidx.lifecycle.Observer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Observer f4929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F f4930c;

    public /* synthetic */ h(F f10, Observer observer, int i7) {
        this.f4928a = i7;
        this.f4930c = f10;
        this.f4929b = observer;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f4928a) {
            case 0:
                if (((j) this.f4930c).f4931l.compareAndSet(true, false)) {
                    this.f4929b.onChanged(obj);
                }
                break;
            default:
                if (((com.transsnet.palmpay.core.base.l) this.f4930c).f27355l.compareAndSet(true, false)) {
                    this.f4929b.onChanged(obj);
                }
                break;
        }
    }
}
