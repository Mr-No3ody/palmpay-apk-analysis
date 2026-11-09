package com.growingio.android.circler;

import Ab.r;
import U4.h;
import U4.i;
import U4.k;
import android.app.Activity;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.growingio.android.circler.screenshot.ScreenshotProvider$OnScreenshotRefreshedListener;
import com.growingio.android.sdk.track.listener.IActivityLifecycle;
import com.growingio.android.sdk.track.modelloader.LoadDataFetcher;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.U;
import okhttp3.WebSocket;
import okhttp3.X;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements LoadDataFetcher, IActivityLifecycle, ScreenshotProvider$OnScreenshotRefreshedListener, WebSocketHandler$OnWebSocketListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U f23137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p039cb.c f23138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f23139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f23140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f23141e = new AtomicInteger(0);

    public c(U u6) {
        this.f23137a = u6;
        p279s5.a.f42018a.r(this);
        this.f23138b = new p039cb.c(com.growingio.android.sdk.d.a().getApplicationContext(), 5);
        this.f23139c = new g(this, 0);
    }

    public final void a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("msgType", "quit");
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        WebSocket webSocket = this.f23139c.f23147b;
        if (webSocket != null) {
            webSocket.send(string);
        }
        cancel();
    }

    public final void cancel() {
        this.f23141e.set(2);
        WebSocket webSocket = this.f23139c.f23147b;
        if (webSocket != null) {
            webSocket.cancel();
        }
        h.f9245a.v(this);
        p039cb.c cVar = this.f23138b;
        cVar.getClass();
        p291t5.b.e(new e(cVar, 0));
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
        if (this.f23141e.get() == 1) {
            if (dataCallback != null) {
                dataCallback.onDataReady(new p319v5.d());
                return;
            }
            return;
        }
        g gVar = this.f23139c;
        WebSocket webSocket = gVar.f23147b;
        if (webSocket != null) {
            webSocket.cancel();
        }
        String str = (String) this.f23140d.get("wsUrl");
        if (str == null || str.isEmpty()) {
            if (dataCallback != null) {
                dataCallback.onLoadFailed(new NullPointerException("wsUrl is NULL, can't start WebSocketService"));
                return;
            }
            return;
        }
        X x3 = new X();
        x3.k(str);
        this.f23137a.newWebSocket(x3.b(), gVar);
        p279s5.a.f42018a.r(this);
        p039cb.c cVar = this.f23138b;
        cVar.getClass();
        p291t5.b.e(new e(cVar, 3));
        p291t5.b.d().postDelayed(new b(this), DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM);
    }

    @Override // com.growingio.android.sdk.track.listener.IActivityLifecycle
    public final void onActivityLifecycle(p182m5.a aVar) {
        int i7 = aVar.f39477a;
        p039cb.c cVar = this.f23138b;
        if (i7 == 3) {
            Activity activityA = aVar.a();
            cVar.getClass();
            p291t5.b.e(new com.flexibank.sdk.g(9, cVar, activityA));
        } else if (i7 == 5) {
            cVar.getClass();
            p291t5.b.e(new e(cVar, 2));
        }
    }

    @Override // com.growingio.android.circler.WebSocketHandler$OnWebSocketListener
    public final void onFailed() {
        AtomicInteger atomicInteger = this.f23141e;
        if (atomicInteger.get() >= 2) {
            return;
        }
        atomicInteger.set(2);
        int i7 = d.growing_circler_connected_to_web_failed;
        p039cb.c cVar = this.f23138b;
        cVar.getClass();
        p291t5.b.e(new B3.a(cVar, i7, 14));
        p198n5.h.c("CirclerService", "Start CirclerService Failed", new Object[0]);
        p039cb.c.h(new com.google.firebase.crashlytics.internal.concurrency.b(this, 2));
    }

    @Override // com.growingio.android.circler.WebSocketHandler$OnWebSocketListener
    public final void onMessage(String str) {
    }

    @Override // com.growingio.android.circler.WebSocketHandler$OnWebSocketListener
    public final void onQuited() {
        AtomicInteger atomicInteger = this.f23141e;
        if (atomicInteger.get() >= 2) {
            return;
        }
        cancel();
        atomicInteger.set(2);
        com.google.firebase.crashlytics.internal.concurrency.b bVar = new com.google.firebase.crashlytics.internal.concurrency.b(this, 2);
        this.f23138b.getClass();
        p039cb.c.h(bVar);
    }

    @Override // com.growingio.android.circler.WebSocketHandler$OnWebSocketListener
    public final void onReady() {
        String string = androidx.camera.video.internal.c.g().u().toString();
        WebSocket webSocket = this.f23139c.f23147b;
        if (webSocket != null) {
            webSocket.send(string);
        }
        this.f23141e.set(1);
        i iVar = h.f9245a;
        iVar.r(this);
        iVar.x();
        r rVar = new r(this, 15);
        p039cb.c cVar = this.f23138b;
        cVar.getClass();
        p291t5.b.e(new com.flexibank.sdk.g(8, cVar, rVar));
    }

    @Override // com.growingio.android.circler.screenshot.ScreenshotProvider$OnScreenshotRefreshedListener
    public final void onScreenshotRefreshed(U4.c cVar) {
        if (cVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("screenWidth", cVar.f9220a);
                jSONObject.put("screenHeight", cVar.f9221b);
                jSONObject.put("scale", cVar.f9222c);
                jSONObject.put("screenshot", cVar.f9223d);
                jSONObject.put("msgType", "refreshScreenshot");
                jSONObject.put("snapshotKey", cVar.f9224e);
                JSONArray jSONArray = new JSONArray();
                Iterator it = cVar.f9225f.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((k) it.next()).a());
                }
                jSONObject.put("elements", jSONArray);
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = cVar.f9226g.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(((U4.e) it2.next()).a());
                }
                jSONObject.put("pages", jSONArray2);
            } catch (JSONException unused) {
            }
            String string = jSONObject.toString();
            WebSocket webSocket = this.f23139c.f23147b;
            if (webSocket != null) {
                webSocket.send(string);
            }
        }
    }
}
