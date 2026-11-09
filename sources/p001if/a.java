package p001if;

import Yf.z;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.support_lib_boundary.util.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f37585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f37586b;

    static {
        a aVar = new a("DISPOSED", 0);
        f37585a = aVar;
        f37586b = new a[]{aVar};
    }

    public static void a(AtomicReference atomicReference) {
        Disposable disposable;
        Disposable disposable2 = (Disposable) atomicReference.get();
        a aVar = f37585a;
        if (disposable2 == aVar || (disposable = (Disposable) atomicReference.getAndSet(aVar)) == aVar || disposable == null) {
            return;
        }
        disposable.dispose();
    }

    public static boolean b(AtomicReference atomicReference, Disposable disposable) {
        while (true) {
            Disposable disposable2 = (Disposable) atomicReference.get();
            if (disposable2 != f37585a) {
                while (!atomicReference.compareAndSet(disposable2, disposable)) {
                    if (atomicReference.get() != disposable2) {
                    }
                }
                return true;
            }
            if (disposable == null) {
                return false;
            }
            disposable.dispose();
            return false;
        }
    }

    public static boolean c(AtomicReference atomicReference, Disposable disposable) {
        p147jf.a.a(disposable, "d is null");
        while (!atomicReference.compareAndSet(null, disposable)) {
            if (atomicReference.get() != null) {
                disposable.dispose();
                if (atomicReference.get() == f37585a) {
                    return false;
                }
                b.V(new z("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean d(Disposable disposable, Disposable disposable2) {
        if (disposable2 == null) {
            b.V(new NullPointerException("next is null"));
            return false;
        }
        if (disposable == null) {
            return true;
        }
        disposable2.dispose();
        b.V(new z("Disposable already set!"));
        return false;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f37586b.clone();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return true;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
    }
}
