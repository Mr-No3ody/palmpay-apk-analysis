package G1;

import C0.G;
import J1.o;
import N8.q0;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class c implements FutureTarget, RequestListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Request f2925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2928g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u f2929i;

    public c(int i7, int i10) {
        this.f2922a = i7;
        this.f2923b = i10;
    }

    public final synchronized Object a(Long l5) {
        if (!isDone()) {
            char[] cArr = o.f4478a;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalArgumentException("You must call this method on a background thread");
            }
        }
        if (this.f2926e) {
            throw new CancellationException();
        }
        if (this.f2928g) {
            throw new ExecutionException(this.f2929i);
        }
        if (this.f2927f) {
            return this.f2924c;
        }
        if (l5 == null) {
            wait(0L);
        } else if (l5.longValue() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = l5.longValue() + jCurrentTimeMillis;
            while (!isDone() && jCurrentTimeMillis < jLongValue) {
                wait(jLongValue - jCurrentTimeMillis);
                jCurrentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.f2928g) {
            throw new ExecutionException(this.f2929i);
        }
        if (this.f2926e) {
            throw new CancellationException();
        }
        if (!this.f2927f) {
            throw new TimeoutException();
        }
        return this.f2924c;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f2926e = true;
                notifyAll();
                Request request = null;
                if (z3) {
                    Request request2 = this.f2925d;
                    this.f2925d = null;
                    request = request2;
                }
                if (request != null) {
                    request.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return a(null);
        } catch (TimeoutException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.bumptech.glide.request.target.Target
    public final synchronized Request getRequest() {
        return this.f2925d;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void getSize(SizeReadyCallback sizeReadyCallback) {
        sizeReadyCallback.onSizeReady(this.f2922a, this.f2923b);
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.f2926e;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        return this.f2926e || this.f2927f || this.f2928g;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final synchronized void onLoadFailed(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final synchronized void onResourceReady(Object obj, Transition transition) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final synchronized void setRequest(Request request) {
        this.f2925d = request;
    }

    public final String toString() {
        Request request;
        String str;
        String strR = G.r(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
            try {
                request = null;
                if (this.f2926e) {
                    str = "CANCELLED";
                } else if (this.f2928g) {
                    str = "FAILURE";
                } else if (this.f2927f) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    request = this.f2925d;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (request == null) {
            return q0.y(strR, str, "]");
        }
        return strR + str + ", request=[" + request + "]]";
    }

    @Override // com.bumptech.glide.request.RequestListener
    public final synchronized boolean onLoadFailed(u uVar, Object obj, Target target, boolean z3) {
        this.f2928g = true;
        this.f2929i = uVar;
        notifyAll();
        return false;
    }

    @Override // com.bumptech.glide.request.RequestListener
    public final synchronized boolean onResourceReady(Object obj, Object obj2, Target target, com.bumptech.glide.load.a aVar, boolean z3) {
        this.f2927f = true;
        this.f2924c = obj;
        notifyAll();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return a(Long.valueOf(timeUnit.toMillis(j6)));
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onStart() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onStop() {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onLoadCleared(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onLoadStarted(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void removeCallback(SizeReadyCallback sizeReadyCallback) {
    }
}
