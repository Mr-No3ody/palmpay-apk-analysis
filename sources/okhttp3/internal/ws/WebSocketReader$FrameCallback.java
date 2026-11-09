package okhttp3.internal.ws;

import Pg.m;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\tJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"okhttp3/internal/ws/WebSocketReader$FrameCallback", "", "", ReactTextInputShadowNode.PROP_TEXT, "", "onReadMessage", "(Ljava/lang/String;)V", "LPg/m;", "bytes", "(LPg/m;)V", "payload", "onReadPing", "onReadPong", "", "code", "reason", "onReadClose", "(ILjava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface WebSocketReader$FrameCallback {
    void onReadClose(int code, @NotNull String reason);

    void onReadMessage(@NotNull m bytes) throws IOException;

    void onReadMessage(@NotNull String text) throws IOException;

    void onReadPing(@NotNull m payload);

    void onReadPong(@NotNull m payload);
}
