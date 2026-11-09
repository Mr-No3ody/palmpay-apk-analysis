package okhttp3;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l0 {
    public abstract void onClosed(WebSocket webSocket, int i7, String str);

    public void onClosing(@NotNull WebSocket webSocket, int i7, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(reason, "reason");
    }

    public abstract void onFailure(WebSocket webSocket, Throwable th, e0 e0Var);

    public void onMessage(@NotNull WebSocket webSocket, @NotNull Pg.m bytes) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
    }

    public abstract void onMessage(WebSocket webSocket, String str);

    public abstract void onOpen(WebSocket webSocket, e0 e0Var);
}
