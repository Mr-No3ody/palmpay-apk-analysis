package com.growingio.android.debugger;

import android.os.Handler;
import com.didiglobal.booster.instrument.ShadowHandlerThread;
import com.didiglobal.booster.instrument.ShadowThread;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.growingio.android.sdk.track.events.EventBuildInterceptor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements EventBuildInterceptor, ScreenshotProvider$OnScreenshotRefreshedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DebuggerEventWrapper$OnDebuggerEventListener f23156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f23157b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p198n5.d f23158c = new p198n5.d(50);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p335w5.b f23159d;

    public static String a() {
        StringBuilder sb2 = new StringBuilder(((com.growingio.android.sdk.a) p279s5.d.b().f42025b).f23191j);
        if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) != '/') {
            sb2.append("/");
        }
        sb2.append("v3/projects/");
        sb2.append(((com.growingio.android.sdk.a) p279s5.d.b().f42025b).f23183a);
        sb2.append("/collect?stm=");
        sb2.append(System.currentTimeMillis());
        return sb2.toString();
    }

    public final void b() {
        if (this.f23159d == null) {
            p335w5.b bVar = new p335w5.b();
            this.f23159d = bVar;
            if (p335w5.b.f43268d == null) {
                ShadowHandlerThread shadowHandlerThread = new ShadowHandlerThread("WsLogger", "\u200bcom.growingio.android.sdk.track.webservices.log.WsLogger");
                ShadowThread.setThreadName(shadowHandlerThread, "\u200bcom.growingio.android.sdk.track.webservices.log.WsLogger").start();
                p335w5.b.f43268d = new Handler(shadowHandlerThread.getLooper());
            }
            p335w5.b.f43268d.postDelayed(bVar.f43271c, 500L);
        }
        this.f23159d.f43269a = new com.google.firebase.crashlytics.internal.concurrency.b(this, 3);
    }

    @Override // com.growingio.android.sdk.track.events.EventBuildInterceptor
    public final void eventDidBuild(p216o5.d dVar) {
        DebuggerEventWrapper$OnDebuggerEventListener debuggerEventWrapper$OnDebuggerEventListener;
        if (dVar instanceof p111h5.d) {
            try {
                JSONObject jSONObjectC = ((p111h5.d) dVar).c();
                jSONObjectC.put("url", a());
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("msgType", "debugger_data");
                jSONObject.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, "3.3.6");
                jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObjectC);
                if (!this.f23157b || (debuggerEventWrapper$OnDebuggerEventListener = this.f23156a) == null) {
                    this.f23158c.add(jSONObject.toString());
                } else {
                    debuggerEventWrapper$OnDebuggerEventListener.onDebuggerMessage(jSONObject.toString());
                }
            } catch (JSONException unused) {
                p198n5.h.c("DebuggerEventWrapper", "can't get event json " + p111h5.d.b(((p111h5.d) dVar).f37339g), new Object[0]);
            }
        }
    }

    @Override // com.growingio.android.debugger.ScreenshotProvider$OnScreenshotRefreshedListener
    public final void onScreenshotRefreshed(e eVar) {
        DebuggerEventWrapper$OnDebuggerEventListener debuggerEventWrapper$OnDebuggerEventListener = this.f23156a;
        if (debuggerEventWrapper$OnDebuggerEventListener != null) {
            eVar.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("screenWidth", eVar.f23167a);
                jSONObject.put("screenHeight", eVar.f23168b);
                jSONObject.put("scale", eVar.f23169c);
                jSONObject.put("screenshot", eVar.f23170d);
                jSONObject.put("msgType", "refreshScreenshot");
                jSONObject.put("snapshotKey", eVar.f23171e);
            } catch (JSONException unused) {
            }
            debuggerEventWrapper$OnDebuggerEventListener.onDebuggerMessage(jSONObject.toString());
        }
        p335w5.b bVar = this.f23159d;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // com.growingio.android.sdk.track.events.EventBuildInterceptor
    public final void eventWillBuild(p111h5.c cVar) {
    }
}
