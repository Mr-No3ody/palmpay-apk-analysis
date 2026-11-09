package com.facebook.react.packagerconnection;

import Pg.m;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.S;
import okhttp3.U;
import okhttp3.WebSocket;
import okhttp3.X;
import okhttp3.e0;
import okhttp3.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p024b9.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 ;2\u00020\u0001:\u0003<=;B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\fJ\r\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\fJ\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010 \u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b \u0010$J'\u0010(\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+J\u0015\u0010*\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\"¢\u0006\u0004\b*\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00108R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010:¨\u0006>"}, d2 = {"Lcom/facebook/react/packagerconnection/ReconnectingWebSocket;", "Lokhttp3/l0;", "", "url", "Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$MessageCallback;", "messageCallback", "Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$ConnectionCallback;", "connectionCallback", "<init>", "(Ljava/lang/String;Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$MessageCallback;Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$ConnectionCallback;)V", "", "delayedReconnect", "()V", "reconnect", "closeWebSocketQuietly", "message", "", "cause", "abort", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "connect", "closeQuietly", "Lokhttp3/WebSocket;", "webSocket", "Lokhttp3/e0;", "response", "onOpen", "(Lokhttp3/WebSocket;Lokhttp3/e0;)V", "t", "onFailure", "(Lokhttp3/WebSocket;Ljava/lang/Throwable;Lokhttp3/e0;)V", ReactTextInputShadowNode.PROP_TEXT, "onMessage", "(Lokhttp3/WebSocket;Ljava/lang/String;)V", "LPg/m;", "bytes", "(Lokhttp3/WebSocket;LPg/m;)V", "", "code", "reason", "onClosed", "(Lokhttp3/WebSocket;ILjava/lang/String;)V", "sendMessage", "(Ljava/lang/String;)V", "(LPg/m;)V", "Ljava/lang/String;", "Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$MessageCallback;", "Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$ConnectionCallback;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Lokhttp3/U;", "okHttpClient", "Lokhttp3/U;", "", "closed", "Z", "suppressConnectionErrors", "Lokhttp3/WebSocket;", "Companion", "MessageCallback", "ConnectionCallback", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReconnectingWebSocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReconnectingWebSocket.kt\ncom/facebook/react/packagerconnection/ReconnectingWebSocket\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
public final class ReconnectingWebSocket extends l0 {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final long RECONNECT_DELAY_MS = 2000;

    @NotNull
    private static final String TAG;
    private boolean closed;

    @Nullable
    private final ConnectionCallback connectionCallback;

    @NotNull
    private final Handler handler;

    @Nullable
    private MessageCallback messageCallback;

    @NotNull
    private final U okHttpClient;
    private boolean suppressConnectionErrors;

    @NotNull
    private final String url;

    @Nullable
    private WebSocket webSocket;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$Companion;", "", "<init>", "()V", "TAG", "", "RECONNECT_DELAY_MS", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$ConnectionCallback;", "", "onConnected", "", "onDisconnected", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ConnectionCallback {
        void onConnected();

        void onDisconnected();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$MessageCallback;", "", "", ReactTextInputShadowNode.PROP_TEXT, "", "onMessage", "(Ljava/lang/String;)V", "LPg/m;", "bytes", "(LPg/m;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface MessageCallback {
        void onMessage(@NotNull m bytes);

        void onMessage(@NotNull String text);
    }

    static {
        Intrinsics.checkNotNullExpressionValue("ReconnectingWebSocket", "getSimpleName(...)");
        TAG = "ReconnectingWebSocket";
    }

    public ReconnectingWebSocket(@NotNull String url, @Nullable MessageCallback messageCallback, @Nullable ConnectionCallback connectionCallback) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.messageCallback = messageCallback;
        this.connectionCallback = connectionCallback;
        this.handler = new Handler(Looper.getMainLooper());
        S s3 = new S();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        s3.b(10L, timeUnit);
        s3.f(10L, timeUnit);
        s3.e(0L, TimeUnit.MINUTES);
        this.okHttpClient = new U(s3);
    }

    private final void abort(String message, Throwable cause) {
        p229p2.a.i(TAG, "Error occurred, shutting down websocket connection: " + message, cause);
        closeWebSocketQuietly();
    }

    private final void closeWebSocketQuietly() {
        try {
            WebSocket webSocket = this.webSocket;
            if (webSocket != null) {
                webSocket.close(1000, "End of session");
            }
        } catch (Exception unused) {
        }
        this.webSocket = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void delayedReconnect() {
        if (!this.closed) {
            connect();
        }
    }

    private final void reconnect() {
        if (this.closed) {
            throw new IllegalStateException("Can't reconnect closed client");
        }
        if (!this.suppressConnectionErrors) {
            p229p2.a.v(TAG, "Couldn't connect to \"" + this.url + "\", will silently retry");
            this.suppressConnectionErrors = true;
        }
        this.handler.postDelayed(new g(this, 9), RECONNECT_DELAY_MS);
    }

    public final void closeQuietly() {
        this.closed = true;
        closeWebSocketQuietly();
        this.messageCallback = null;
        ConnectionCallback connectionCallback = this.connectionCallback;
        if (connectionCallback != null) {
            connectionCallback.onDisconnected();
        }
    }

    public final void connect() {
        if (this.closed) {
            throw new IllegalStateException("Can't connect closed client");
        }
        X x3 = new X();
        x3.k(this.url);
        this.okHttpClient.newWebSocket(x3.b(), this);
    }

    @Override // okhttp3.l0
    public synchronized void onClosed(@NotNull WebSocket webSocket, int code, @NotNull String reason) {
        try {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.webSocket = null;
            if (!this.closed) {
                ConnectionCallback connectionCallback = this.connectionCallback;
                if (connectionCallback != null) {
                    connectionCallback.onDisconnected();
                }
                reconnect();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // okhttp3.l0
    public synchronized void onFailure(@NotNull WebSocket webSocket, @NotNull Throwable t, @Nullable e0 response) {
        try {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(t, "t");
            if (this.webSocket != null) {
                abort("Websocket exception", t);
            }
            if (!this.closed) {
                ConnectionCallback connectionCallback = this.connectionCallback;
                if (connectionCallback != null) {
                    connectionCallback.onDisconnected();
                }
                reconnect();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // okhttp3.l0
    public synchronized void onMessage(@NotNull WebSocket webSocket, @NotNull String text) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(text, "text");
        MessageCallback messageCallback = this.messageCallback;
        if (messageCallback != null) {
            messageCallback.onMessage(text);
        }
    }

    @Override // okhttp3.l0
    public synchronized void onOpen(@NotNull WebSocket webSocket, @NotNull e0 response) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(response, "response");
        this.webSocket = webSocket;
        this.suppressConnectionErrors = false;
        ConnectionCallback connectionCallback = this.connectionCallback;
        if (connectionCallback != null) {
            connectionCallback.onConnected();
        }
    }

    public final synchronized void sendMessage(@NotNull String message) throws IOException {
        Intrinsics.checkNotNullParameter(message, "message");
        WebSocket webSocket = this.webSocket;
        if (webSocket == null) {
            throw new ClosedChannelException();
        }
        webSocket.send(message);
    }

    @Override // okhttp3.l0
    public synchronized void onMessage(@NotNull WebSocket webSocket, @NotNull m bytes) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        MessageCallback messageCallback = this.messageCallback;
        if (messageCallback != null) {
            messageCallback.onMessage(bytes);
        }
    }

    public final synchronized void sendMessage(@NotNull m message) throws IOException {
        Intrinsics.checkNotNullParameter(message, "message");
        WebSocket webSocket = this.webSocket;
        if (webSocket == null) {
            throw new ClosedChannelException();
        }
        webSocket.send(message);
    }
}
