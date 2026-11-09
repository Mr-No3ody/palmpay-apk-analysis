package com.growingio.android.debugger;

import Pa.C0525w;
import android.app.Activity;
import android.os.Handler;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.growingio.android.sdk.track.listener.IActivityLifecycle;
import com.growingio.android.sdk.track.modelloader.LoadDataFetcher;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.U;
import okhttp3.WebSocket;
import okhttp3.X;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements LoadDataFetcher, IActivityLifecycle, WebSocketHandler$OnWebSocketListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U f23173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.work.impl.model.b f23174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.growingio.android.circler.g f23175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f23176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f23177e = new AtomicInteger(0);

    public g(U u6) {
        b.f23155a.f23156a = new Oe.a(this, 17);
        this.f23173a = u6;
        p279s5.a.f42018a.r(this);
        this.f23174b = new androidx.work.impl.model.b(com.growingio.android.sdk.d.a().getApplicationContext());
        this.f23175c = new com.growingio.android.circler.g(this, 1);
    }

    public final void cancel() {
        this.f23177e.set(2);
        WebSocket webSocket = this.f23175c.f23147b;
        if (webSocket != null) {
            webSocket.cancel();
        }
        c cVar = b.f23155a;
        cVar.f23157b = false;
        i.f23178a.v(cVar);
        e5.d dVar = e5.c.f36164a;
        synchronized (dVar.f36167e) {
            dVar.f36167e.remove(cVar);
        }
        p335w5.b bVar = cVar.f23159d;
        if (bVar != null) {
            Handler handler = p335w5.b.f43268d;
            if (handler != null) {
                handler.removeCallbacks(bVar.f43271c);
            }
            cVar.f23159d.f43269a = null;
            cVar.f23159d = null;
        }
        cVar.f23156a = null;
        androidx.work.impl.model.b bVar2 = this.f23174b;
        bVar2.getClass();
        p291t5.b.e(new j(bVar2, 3));
        p279s5.a.f42018a.v(this);
    }

    @Override // com.growingio.android.sdk.track.modelloader.DataFetcher
    public final Object executeData() {
        loadData(null);
        return new p319v5.d();
    }

    @Override // com.growingio.android.sdk.track.modelloader.DataFetcher
    public final Class getDataClass() {
        return p319v5.d.class;
    }

    @Override // com.growingio.android.sdk.track.modelloader.LoadDataFetcher
    public final void loadData(LoadDataFetcher.DataCallback dataCallback) {
        if (this.f23177e.get() == 1) {
            if (dataCallback != null) {
                dataCallback.onDataReady(new p319v5.d());
                return;
            }
            return;
        }
        com.growingio.android.circler.g gVar = this.f23175c;
        WebSocket webSocket = gVar.f23147b;
        if (webSocket != null) {
            webSocket.cancel();
        }
        String str = (String) this.f23176d.get("wsUrl");
        if (str == null || str.isEmpty()) {
            if (dataCallback != null) {
                dataCallback.onLoadFailed(new NullPointerException("wsUrl is NULL, can't start WebSocketService"));
                return;
            }
            return;
        }
        X x3 = new X();
        x3.k(str);
        this.f23173a.newWebSocket(x3.b(), gVar);
        p279s5.a.f42018a.r(this);
        androidx.work.impl.model.b bVar = this.f23174b;
        bVar.getClass();
        p291t5.b.e(new j(bVar, 0));
        p291t5.b.d().postDelayed(new f(this), DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM);
    }

    @Override // com.growingio.android.sdk.track.listener.IActivityLifecycle
    public final void onActivityLifecycle(p182m5.a aVar) {
        int i7 = aVar.f39477a;
        androidx.work.impl.model.b bVar = this.f23174b;
        if (i7 == 3) {
            Activity activityA = aVar.a();
            bVar.getClass();
            p291t5.b.e(new com.flexibank.sdk.g(10, bVar, activityA));
        } else if (i7 == 5) {
            bVar.getClass();
            p291t5.b.e(new j(bVar, 2));
        }
    }

    @Override // com.growingio.android.debugger.WebSocketHandler$OnWebSocketListener
    public final void onFailed() {
        AtomicInteger atomicInteger = this.f23177e;
        if (atomicInteger.get() >= 2) {
            return;
        }
        atomicInteger.set(2);
        int i7 = h.growing_debugger_connected_to_web_failed;
        androidx.work.impl.model.b bVar = this.f23174b;
        bVar.getClass();
        p291t5.b.e(new B3.a(bVar, i7, 15));
        p198n5.h.c("DebuggerService", "Start CirclerService Failed", new Object[0]);
        androidx.work.impl.model.b.j(new com.google.firebase.crashlytics.internal.concurrency.b(this, 4));
    }

    @Override // com.growingio.android.debugger.WebSocketHandler$OnWebSocketListener
    public final void onMessage(String str) {
        c cVar;
        p335w5.b bVar;
        try {
            String strOptString = new JSONObject(str).optString("msgType");
            if ("logger_open".equals(strOptString)) {
                b.f23155a.b();
                return;
            }
            if ("logger_close".equals(strOptString) && (bVar = (cVar = b.f23155a).f23159d) != null) {
                Handler handler = p335w5.b.f43268d;
                if (handler != null) {
                    handler.removeCallbacks(bVar.f43271c);
                }
                cVar.f23159d.f43269a = null;
                cVar.f23159d = null;
            }
        } catch (JSONException e10) {
            p198n5.h.b("DebuggerService", e10);
        }
    }

    @Override // com.growingio.android.debugger.WebSocketHandler$OnWebSocketListener
    public final void onQuited() {
        AtomicInteger atomicInteger = this.f23177e;
        if (atomicInteger.get() >= 2) {
            return;
        }
        cancel();
        atomicInteger.set(2);
        com.google.firebase.crashlytics.internal.concurrency.b bVar = new com.google.firebase.crashlytics.internal.concurrency.b(this, 4);
        this.f23174b.getClass();
        androidx.work.impl.model.b.j(bVar);
    }

    @Override // com.growingio.android.debugger.WebSocketHandler$OnWebSocketListener
    public final void onReady() {
        String string = androidx.camera.video.internal.c.g().u().toString();
        WebSocket webSocket = this.f23175c.f23147b;
        if (webSocket != null) {
            webSocket.send(string);
        }
        c cVar = b.f23155a;
        cVar.f23156a = new C0525w(this, 19);
        this.f23177e.set(1);
        cVar.f23157b = true;
        e5.c.f36164a.w(cVar);
        U4.i iVar = i.f23178a;
        iVar.r(cVar);
        iVar.x();
        p198n5.d dVar = cVar.f23158c;
        dVar.getClass();
        p198n5.c cVar2 = new p198n5.c(dVar);
        while (cVar2.hasNext()) {
            String str = (String) cVar2.next();
            DebuggerEventWrapper$OnDebuggerEventListener debuggerEventWrapper$OnDebuggerEventListener = cVar.f23156a;
            if (debuggerEventWrapper$OnDebuggerEventListener != null) {
                debuggerEventWrapper$OnDebuggerEventListener.onDebuggerMessage(str);
            }
        }
        dVar.clear();
        androidx.work.impl.model.b bVar = this.f23174b;
        com.google.firebase.crashlytics.internal.concurrency.b bVar2 = new com.google.firebase.crashlytics.internal.concurrency.b(this, 4);
        bVar.getClass();
        p291t5.b.e(new com.flexibank.sdk.g(11, bVar, bVar2));
    }
}
