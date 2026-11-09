package com.facebook.react.devsupport;

import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.WebSocket;
import okhttp3.e0;
import okhttp3.l0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$connectWebSocket$webSocket$1", "Lokhttp3/l0;", "Lokhttp3/WebSocket;", "webSocket", "", "t", "Lokhttp3/e0;", "response", "", "onFailure", "(Lokhttp3/WebSocket;Ljava/lang/Throwable;Lokhttp3/e0;)V", "", ReactTextInputShadowNode.PROP_TEXT, "onMessage", "(Lokhttp3/WebSocket;Ljava/lang/String;)V", "onOpen", "(Lokhttp3/WebSocket;Lokhttp3/e0;)V", "", "code", "reason", "onClosed", "(Lokhttp3/WebSocket;ILjava/lang/String;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CxxInspectorPackagerConnection$DelegateImpl$connectWebSocket$webSocket$1 extends l0 {
    final /* synthetic */ CxxInspectorPackagerConnection.WebSocketDelegate $delegate;
    final /* synthetic */ CxxInspectorPackagerConnection.DelegateImpl this$0;

    public CxxInspectorPackagerConnection$DelegateImpl$connectWebSocket$webSocket$1(CxxInspectorPackagerConnection.DelegateImpl delegateImpl, CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate) {
        this.this$0 = delegateImpl;
        this.$delegate = webSocketDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClosed$lambda$3(CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate) {
        webSocketDelegate.didClose();
        webSocketDelegate.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFailure$lambda$0(Throwable th, CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate) {
        String message = th.getMessage();
        if (message == null) {
            message = "<Unknown error>";
        }
        webSocketDelegate.didFailWithError(null, message);
        webSocketDelegate.close();
    }

    @Override // okhttp3.l0
    public void onClosed(WebSocket webSocket, int code, String reason) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.this$0.scheduleCallback(new e(this.$delegate, 0), 0L);
    }

    @Override // okhttp3.l0
    public void onFailure(WebSocket webSocket, Throwable t, e0 response) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(t, "t");
        this.this$0.scheduleCallback(new d(0, t, this.$delegate), 0L);
    }

    @Override // okhttp3.l0
    public void onMessage(WebSocket webSocket, String text) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(text, "text");
        this.this$0.scheduleCallback(new d(this.$delegate, text), 0L);
    }

    @Override // okhttp3.l0
    public void onOpen(WebSocket webSocket, e0 response) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(response, "response");
        this.this$0.scheduleCallback(new e(this.$delegate, 1), 0L);
    }
}
