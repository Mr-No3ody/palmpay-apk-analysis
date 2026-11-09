package com.facebook.react.packagerconnection;

import Pg.m;
import android.net.Uri;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0002! B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u0017\u0010\u001bR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/facebook/react/packagerconnection/JSPackagerClient;", "Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$MessageCallback;", "", "clientId", "Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;", "settings", "", "Lcom/facebook/react/packagerconnection/RequestHandler;", "requestHandlers", "Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$ConnectionCallback;", "connectionCallback", "<init>", "(Ljava/lang/String;Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;Ljava/util/Map;Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$ConnectionCallback;)V", "", "id", "reason", "", "abortOnMessage", "(Ljava/lang/Object;Ljava/lang/String;)V", "init", "()V", "close", ReactTextInputShadowNode.PROP_TEXT, "onMessage", "(Ljava/lang/String;)V", "LPg/m;", "bytes", "(LPg/m;)V", "Ljava/util/Map;", "Lcom/facebook/react/packagerconnection/ReconnectingWebSocket;", "webSocket", "Lcom/facebook/react/packagerconnection/ReconnectingWebSocket;", "Companion", "ResponderImpl", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJSPackagerClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JSPackagerClient.kt\ncom/facebook/react/packagerconnection/JSPackagerClient\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
public final class JSPackagerClient implements ReconnectingWebSocket.MessageCallback {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int PROTOCOL_VERSION = 2;

    @NotNull
    private static final String TAG;

    @NotNull
    private final Map<String, RequestHandler> requestHandlers;

    @NotNull
    private final ReconnectingWebSocket webSocket;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/facebook/react/packagerconnection/JSPackagerClient$Companion;", "", "<init>", "()V", "TAG", "", "PROTOCOL_VERSION", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/facebook/react/packagerconnection/JSPackagerClient$ResponderImpl;", "Lcom/facebook/react/packagerconnection/Responder;", "id", "", "<init>", "(Lcom/facebook/react/packagerconnection/JSPackagerClient;Ljava/lang/Object;)V", "respond", "", "result", "error", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ResponderImpl implements Responder {

        @NotNull
        private final Object id;
        final /* synthetic */ JSPackagerClient this$0;

        public ResponderImpl(@NotNull JSPackagerClient jSPackagerClient, Object id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            this.this$0 = jSPackagerClient;
            this.id = id2;
        }

        @Override // com.facebook.react.packagerconnection.Responder
        public void error(@NotNull Object error) {
            Intrinsics.checkNotNullParameter(error, "error");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", 2);
                jSONObject.put("id", this.id);
                jSONObject.put("error", error);
                ReconnectingWebSocket reconnectingWebSocket = this.this$0.webSocket;
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                reconnectingWebSocket.sendMessage(string);
            } catch (Exception e10) {
                p229p2.a.i(JSPackagerClient.TAG, "Responding with error failed", e10);
            }
        }

        @Override // com.facebook.react.packagerconnection.Responder
        public void respond(@NotNull Object result) {
            Intrinsics.checkNotNullParameter(result, "result");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", 2);
                jSONObject.put("id", this.id);
                jSONObject.put("result", result);
                ReconnectingWebSocket reconnectingWebSocket = this.this$0.webSocket;
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                reconnectingWebSocket.sendMessage(string);
            } catch (Exception e10) {
                p229p2.a.i(JSPackagerClient.TAG, "Responding failed", e10);
            }
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("JSPackagerClient", "getSimpleName(...)");
        TAG = "JSPackagerClient";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JSPackagerClient(@NotNull String clientId, @NotNull PackagerConnectionSettings settings, @NotNull Map<String, ? extends RequestHandler> requestHandlers) {
        this(clientId, settings, requestHandlers, null, 8, null);
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(requestHandlers, "requestHandlers");
    }

    private final void abortOnMessage(Object id2, String reason) {
        if (id2 != null) {
            new ResponderImpl(this, id2).error(reason);
        }
        p229p2.a.h(TAG, "Handling the message failed with reason: " + reason);
    }

    public final void close() {
        this.webSocket.closeQuietly();
    }

    public final void init() {
        this.webSocket.connect();
    }

    @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.MessageCallback
    public void onMessage(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        try {
            JSONObject jSONObject = new JSONObject(text);
            int iOptInt = jSONObject.optInt("version");
            String strOptString = jSONObject.optString(FirebaseAnalytics.Param.METHOD);
            Object objOpt = jSONObject.opt("id");
            Object objOpt2 = jSONObject.opt("params");
            if (iOptInt != 2) {
                p229p2.a.h(TAG, "Message with incompatible or missing version of protocol received: " + iOptInt);
                return;
            }
            if (strOptString == null) {
                abortOnMessage(objOpt, "No method provided");
                return;
            }
            RequestHandler requestHandler = this.requestHandlers.get(strOptString);
            if (requestHandler == null) {
                abortOnMessage(objOpt, "No request handler for method: ".concat(strOptString));
            } else if (objOpt == null) {
                requestHandler.onNotification(objOpt2);
            } else {
                requestHandler.onRequest(objOpt2, new ResponderImpl(this, objOpt));
            }
        } catch (Exception e10) {
            p229p2.a.i(TAG, "Handling the message failed", e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public JSPackagerClient(@NotNull String clientId, @NotNull PackagerConnectionSettings settings, @NotNull Map<String, ? extends RequestHandler> requestHandlers, @Nullable ReconnectingWebSocket.ConnectionCallback connectionCallback) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(requestHandlers, "requestHandlers");
        this.requestHandlers = requestHandlers;
        String string = new Uri.Builder().scheme("ws").encodedAuthority(settings.getDebugServerHost()).appendPath("message").appendQueryParameter("device", AndroidInfoHelpers.getFriendlyDeviceName()).appendQueryParameter("app", settings.getPackageName()).appendQueryParameter("clientid", clientId).build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.webSocket = new ReconnectingWebSocket(string, this, connectionCallback);
    }

    @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.MessageCallback
    public void onMessage(@NotNull m bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        p229p2.a.v(TAG, "Websocket received message with payload of unexpected type binary");
    }

    public /* synthetic */ JSPackagerClient(String str, PackagerConnectionSettings packagerConnectionSettings, Map map, ReconnectingWebSocket.ConnectionCallback connectionCallback, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, packagerConnectionSettings, map, (i7 & 8) != 0 ? null : connectionCallback);
    }
}
