package com.growingio.android.circler;

import android.text.TextUtils;
import androidx.core.provider.m;
import com.growingio.android.debugger.k;
import okhttp3.WebSocket;
import okhttp3.e0;
import okhttp3.l0;
import org.json.JSONException;
import org.json.JSONObject;
import p198n5.h;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WebSocket f23147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f23148c;

    public /* synthetic */ g(Object obj, int i7) {
        this.f23146a = i7;
        this.f23148c = obj;
    }

    @Override // okhttp3.l0
    public final void onClosed(WebSocket webSocket, int i7, String str) {
        switch (this.f23146a) {
            case 0:
                h.c("WebSocketHandler", "webSocket on onClosed, reason: $reason", new Object[0]);
                p291t5.b.e(new f(this, 4));
                break;
            default:
                h.c("WebSocketHandler", "webSocket on onClosed, reason: $reason", new Object[0]);
                p291t5.b.e(new k(this, 3));
                break;
        }
    }

    @Override // okhttp3.l0
    public final void onFailure(WebSocket webSocket, Throwable th, e0 e0Var) {
        switch (this.f23146a) {
            case 0:
                h.d("WebSocketHandler", th, "webSocket on onFailure, reason: ", new Object[0]);
                p291t5.b.e(new f(this, 5));
                break;
            default:
                h.d("WebSocketHandler", th, "webSocket on onFailure, reason: ", new Object[0]);
                p291t5.b.e(new k(this, 4));
                break;
        }
    }

    @Override // okhttp3.l0
    public final void onMessage(WebSocket webSocket, String str) {
        switch (this.f23146a) {
            case 0:
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str.trim())) {
                    h.a("WebSocketHandler", "Received message is ".concat(str), new Object[0]);
                    try {
                        String strOptString = new JSONObject(str).optString("msgType");
                        if (!"ready".equals(strOptString)) {
                            if ("quit".equals(strOptString)) {
                                h.a("WebSocketHandler", "Web is quited", new Object[0]);
                                p291t5.b.e(new f(this, 2));
                            }
                            p291t5.b.e(new f(this, str));
                        } else {
                            h.a("WebSocketHandler", "Web is ready", new Object[0]);
                            p291t5.b.e(new f(this, 1));
                        }
                    } catch (JSONException e10) {
                        h.b("WebSocketHandler", e10);
                    }
                    break;
                }
                break;
            default:
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str.trim())) {
                    h.a("WebSocketHandler", "Received message is ".concat(str), new Object[0]);
                    try {
                        String strOptString2 = new JSONObject(str).optString("msgType");
                        if (!"ready".equals(strOptString2)) {
                            if ("quit".equals(strOptString2)) {
                                h.a("WebSocketHandler", "Web is quited", new Object[0]);
                                p291t5.b.e(new k(this, 2));
                            }
                            p291t5.b.e(new m(this, 8, str, false));
                        } else {
                            h.a("WebSocketHandler", "Web is ready", new Object[0]);
                            p291t5.b.e(new k(this, 1));
                        }
                    } catch (JSONException e11) {
                        h.b("WebSocketHandler", e11);
                    }
                    break;
                }
                break;
        }
    }

    @Override // okhttp3.l0
    public final void onOpen(WebSocket webSocket, e0 e0Var) {
        switch (this.f23146a) {
            case 0:
                h.a("WebSocketHandler", "Created webSocket successfully", new Object[0]);
                if (!webSocket.send(p347x5.a.a().b().toString())) {
                    h.c("WebSocketHandler", "send ready message failed", new Object[0]);
                    p291t5.b.e(new f(this, 0));
                } else {
                    this.f23147b = webSocket;
                }
                break;
            default:
                h.a("WebSocketHandler", "Created webSocket successfully", new Object[0]);
                if (!webSocket.send(p347x5.a.a().b().toString())) {
                    h.c("WebSocketHandler", "send ready message failed", new Object[0]);
                    p291t5.b.e(new k(this, 0));
                } else {
                    this.f23147b = webSocket;
                }
                break;
        }
    }
}
