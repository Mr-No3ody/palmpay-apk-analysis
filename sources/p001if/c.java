package p001if;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import p118hf.b;
import p147jf.a;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Disposable, DisposableContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinkedList f37589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f37590b;

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public final boolean add(Disposable disposable) {
        a.a(disposable, "d is null");
        if (!this.f37590b) {
            synchronized (this) {
                try {
                    if (!this.f37590b) {
                        LinkedList linkedList = this.f37589a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f37589a = linkedList;
                        }
                        linkedList.add(disposable);
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        disposable.dispose();
        return false;
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public final boolean delete(Disposable disposable) {
        a.a(disposable, "Disposable item is null");
        if (this.f37590b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f37590b) {
                    return false;
                }
                LinkedList linkedList = this.f37589a;
                if (linkedList != null && linkedList.remove(disposable)) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (this.f37590b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f37590b) {
                    return;
                }
                this.f37590b = true;
                LinkedList linkedList = this.f37589a;
                ArrayList arrayList = null;
                this.f37589a = null;
                if (linkedList == null) {
                    return;
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    try {
                        ((Disposable) it.next()).dispose();
                    } catch (Throwable th) {
                        D3.a.H(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new b(arrayList);
                    }
                    throw p239pf.c.a((Throwable) arrayList.get(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f37590b;
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public final boolean remove(Disposable disposable) {
        if (!delete(disposable)) {
            return false;
        }
        disposable.dispose();
        return true;
    }
}
