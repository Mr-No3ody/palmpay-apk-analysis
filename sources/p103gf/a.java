package p103gf;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import java.util.ArrayList;
import p118hf.b;
import p239pf.c;
import p239pf.f;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Disposable, DisposableContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f37242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f37243b;

    public static void b(f fVar) {
        if (fVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : fVar.f41313d) {
            if (obj instanceof Disposable) {
                try {
                    ((Disposable) obj).dispose();
                } catch (Throwable th) {
                    D3.a.H(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new b(arrayList);
            }
            throw c.a((Throwable) arrayList.get(0));
        }
    }

    public final void a() {
        if (this.f37243b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f37243b) {
                    return;
                }
                f fVar = this.f37242a;
                this.f37242a = null;
                b(fVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public final boolean add(Disposable disposable) {
        p147jf.a.a(disposable, "disposable is null");
        if (!this.f37243b) {
            synchronized (this) {
                try {
                    if (!this.f37243b) {
                        f fVar = this.f37242a;
                        if (fVar == null) {
                            fVar = new f();
                            int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
                            fVar.f41310a = iNumberOfLeadingZeros - 1;
                            fVar.f41312c = (int) (0.75f * iNumberOfLeadingZeros);
                            fVar.f41313d = new Object[iNumberOfLeadingZeros];
                            this.f37242a = fVar;
                        }
                        fVar.a(disposable);
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
        Object obj;
        p147jf.a.a(disposable, "disposables is null");
        if (this.f37243b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f37243b) {
                    return false;
                }
                f fVar = this.f37242a;
                if (fVar != null) {
                    Object[] objArr = fVar.f41313d;
                    int i7 = fVar.f41310a;
                    int iHashCode = disposable.hashCode() * (-1640531527);
                    int i10 = (iHashCode ^ (iHashCode >>> 16)) & i7;
                    Object obj2 = objArr[i10];
                    if (obj2 != null) {
                        if (obj2.equals(disposable)) {
                            fVar.b(i10, i7, objArr);
                        } else {
                            do {
                                i10 = (i10 + 1) & i7;
                                obj = objArr[i10];
                                if (obj == null) {
                                }
                            } while (!obj.equals(disposable));
                            fVar.b(i10, i7, objArr);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (this.f37243b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f37243b) {
                    return;
                }
                this.f37243b = true;
                f fVar = this.f37242a;
                this.f37242a = null;
                b(fVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f37243b;
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
