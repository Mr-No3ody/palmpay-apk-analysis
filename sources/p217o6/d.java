package p217o6;

import androidx.lifecycle.Observer;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Observer f40063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f40064b;

    public d(e eVar, Observer observer) {
        this.f40064b = eVar;
        this.f40063a = observer;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        if (this.f40064b.f40065l.compareAndSet(true, false)) {
            this.f40063a.onChanged(obj);
        }
    }
}
