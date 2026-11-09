package p217o6;

import android.os.Looper;
import androidx.lifecycle.F;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class e extends F {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f40065l = new AtomicBoolean(false);

    @Override // androidx.lifecycle.B
    public final void e(LifecycleOwner lifecycleOwner, Observer observer) {
        if (this.f17330c > 0) {
            return;
        }
        super.e(lifecycleOwner, new d(this, observer));
    }

    @Override // androidx.lifecycle.B
    public final void k(Object obj) {
        this.f40065l.set(true);
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            super.k(obj);
        } else {
            i(obj);
        }
    }
}
