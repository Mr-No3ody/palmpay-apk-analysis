package p078f5;

import M7.s;
import android.os.Handler;
import com.growingio.android.sdk.track.async.Disposable;
import java.util.logging.Level;
import org.greenrobot.eventbus.Poster;
import org.greenrobot.eventbus.c;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable, Disposable, Poster {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f36404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f36405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f36406d;

    public b(c cVar) {
        this.f36403a = 1;
        this.f36406d = cVar;
        this.f36405c = new p039cb.c(14, false);
    }

    @Override // com.growingio.android.sdk.track.async.Disposable
    public void dispose() {
        ((Handler) this.f36405c).removeCallbacks(this);
        this.f36404b = true;
    }

    @Override // org.greenrobot.eventbus.Poster
    public void enqueue(l lVar, Object obj) {
        g gVarA = g.a(lVar, obj);
        synchronized (this) {
            try {
                ((p039cb.c) this.f36405c).a(gVarA);
                if (!this.f36404b) {
                    this.f36404b = true;
                    ((c) this.f36406d).f41065j.execute(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.growingio.android.sdk.track.async.Disposable
    public boolean isDisposed() {
        return this.f36404b;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        g gVarE;
        switch (this.f36403a) {
            case 0:
                this.f36404b = true;
                ((s) this.f36406d).run();
                return;
        }
        while (true) {
            try {
                try {
                    p039cb.c cVar = (p039cb.c) this.f36405c;
                    synchronized (cVar) {
                        try {
                            if (((g) cVar.f18901b) == null) {
                                cVar.wait(1000);
                            }
                            gVarE = cVar.e();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (gVarE == null) {
                        synchronized (this) {
                            gVarE = ((p039cb.c) this.f36405c).e();
                            if (gVarE == null) {
                                this.f36404b = false;
                            }
                        }
                        this.f36404b = false;
                        return;
                    }
                    ((c) this.f36406d).c(gVarE);
                } catch (InterruptedException e10) {
                    ((c) this.f36406d).f41071p.log(Level.WARNING, Thread.currentThread().getName() + " was interruppted", e10);
                }
            } catch (Throwable th2) {
                this.f36404b = false;
                throw th2;
            }
        }
    }

    public b(Handler handler, s sVar) {
        this.f36403a = 0;
        this.f36405c = handler;
        this.f36406d = sVar;
    }
}
