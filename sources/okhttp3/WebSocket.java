package okhttp3;

import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0018J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000b\u0010\u000fJ!\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lokhttp3/WebSocket;", "", "Lokhttp3/Y;", "request", "()Lokhttp3/Y;", "", "queueSize", "()J", "", ReactTextInputShadowNode.PROP_TEXT, "", "send", "(Ljava/lang/String;)Z", "LPg/m;", "bytes", "(LPg/m;)Z", "", "code", "reason", "close", "(ILjava/lang/String;)Z", "", PPRNBridge.DIALOG_ACTION_CANCEL, "()V", "Factory", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface WebSocket {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/WebSocket$Factory;", "", "Lokhttp3/Y;", "request", "Lokhttp3/l0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lokhttp3/WebSocket;", "newWebSocket", "(Lokhttp3/Y;Lokhttp3/l0;)Lokhttp3/WebSocket;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Factory {
        @NotNull
        WebSocket newWebSocket(@NotNull Y request, @NotNull l0 listener);
    }

    void cancel();

    boolean close(int code, @Nullable String reason);

    long queueSize();

    @NotNull
    Y request();

    boolean send(@NotNull Pg.m bytes);

    boolean send(@NotNull String text);
}
