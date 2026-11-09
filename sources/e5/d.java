package e5;

import D4.f;
import Gb.HandlerC0283f;
import android.os.Looper;
import androidx.core.provider.m;
import com.didiglobal.booster.instrument.ShadowHandlerThread;
import com.didiglobal.booster.instrument.ShadowThread;
import com.growingio.android.sdk.track.events.EventBuildInterceptor;
import com.growingio.android.sdk.track.interfaces.OnTrackMainInitSDKCallback;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HandlerC0283f f36165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p216o5.c f36166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f36167e;

    public d() {
        super(7);
        this.f36167e = new ArrayList();
        com.growingio.android.sdk.a aVar = (com.growingio.android.sdk.a) p279s5.d.b().f42025b;
        aVar.getClass();
        this.f36166d = new p216o5.c(com.growingio.android.sdk.d.a().getApplicationContext(), new G6.b(2), aVar.f23187e, aVar.f23186d, aVar.f23188f, aVar.f23189g);
        ShadowHandlerThread shadowHandlerThread = new ShadowHandlerThread("TrackMainThread", "\u200bcom.growingio.android.sdk.track.TrackMainThread");
        ShadowThread.setThreadName(shadowHandlerThread, "\u200bcom.growingio.android.sdk.track.TrackMainThread").start();
        HandlerC0283f handlerC0283f = new HandlerC0283f(this, shadowHandlerThread.getLooper(), 4);
        this.f36165c = handlerC0283f;
        handlerC0283f.sendEmptyMessage(1);
    }

    @Override // D4.f
    public final void u(Object obj, Object obj2) {
        ((OnTrackMainInitSDKCallback) obj).onTrackMainInitSDK();
    }

    public final void w(EventBuildInterceptor eventBuildInterceptor) {
        synchronized (this.f36167e) {
            try {
                Iterator it = this.f36167e.iterator();
                boolean z3 = true;
                while (it.hasNext()) {
                    EventBuildInterceptor eventBuildInterceptor2 = (EventBuildInterceptor) it.next();
                    if (eventBuildInterceptor2 == null) {
                        it.remove();
                    } else if (eventBuildInterceptor2 == eventBuildInterceptor) {
                        z3 = false;
                    }
                }
                if (z3) {
                    this.f36167e.add(eventBuildInterceptor);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(Runnable runnable) {
        HandlerC0283f handlerC0283f = this.f36165c;
        if (handlerC0283f.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handlerC0283f.post(runnable);
        }
    }

    public final void y(p111h5.c cVar) {
        x(new m(this, 14, cVar, false));
    }
}
