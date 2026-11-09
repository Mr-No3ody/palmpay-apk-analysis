package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.C1843j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f11998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1843j f11999b = new C1843j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z f12000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f12001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f12002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12004g;

    public I(Runnable runnable) {
        this.f11998a = runnable;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            this.f12001d = i7 >= 34 ? F.f11994a.a(new A(this, 0), new A(this, 1), new B(this, 0), new B(this, 1)) : D.f11989a.a(new B(this, 2));
        }
    }

    public final void a(LifecycleOwner owner, z onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        AbstractC1205o lifecycle = owner.getLifecycle();
        if (((C1212w) lifecycle).f17478d == EnumC1204n.f17460a) {
            return;
        }
        onBackPressedCallback.addCancellable(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        f();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new H(0, this, I.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0));
    }

    public final G b(z onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f11999b.addLast(onBackPressedCallback);
        G g7 = new G(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(g7);
        f();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new H(0, this, I.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1));
        return g7;
    }

    public final void c() {
        Object objPrevious;
        z zVar = this.f12000c;
        if (zVar == null) {
            C1843j c1843j = this.f11999b;
            ListIterator<E> listIterator = c1843j.listIterator(c1843j.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((z) objPrevious).isEnabled());
            zVar = (z) objPrevious;
        }
        this.f12000c = null;
        if (zVar != null) {
            zVar.handleOnBackCancelled();
        }
    }

    public final void d() {
        Object objPrevious;
        z zVar = this.f12000c;
        if (zVar == null) {
            C1843j c1843j = this.f11999b;
            ListIterator listIterator = c1843j.listIterator(c1843j.a());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((z) objPrevious).isEnabled());
            zVar = (z) objPrevious;
        }
        this.f12000c = null;
        if (zVar != null) {
            zVar.handleOnBackPressed();
        } else {
            this.f11998a.run();
        }
    }

    public final void e(boolean z3) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f12002e;
        OnBackInvokedCallback onBackInvokedCallback = this.f12001d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        D d2 = D.f11989a;
        if (z3 && !this.f12003f) {
            d2.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f12003f = true;
        } else {
            if (z3 || !this.f12003f) {
                return;
            }
            d2.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f12003f = false;
        }
    }

    public final void f() {
        boolean z3 = this.f12004g;
        boolean z8 = false;
        C1843j c1843j = this.f11999b;
        if (c1843j == null || !c1843j.isEmpty()) {
            Iterator<E> it = c1843j.iterator();
            while (it.hasNext()) {
                if (((z) it.next()).isEnabled()) {
                    z8 = true;
                    break;
                }
            }
        }
        this.f12004g = z8;
        if (z8 == z3 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        e(z8);
    }
}
