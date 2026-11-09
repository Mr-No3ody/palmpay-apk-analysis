package okhttp3;

import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\u0018J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0000H&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lokhttp3/Call;", "", "Lokhttp3/Y;", "request", "()Lokhttp3/Y;", "Lokhttp3/e0;", "execute", "()Lokhttp3/e0;", "Lokhttp3/Callback;", "responseCallback", "", "enqueue", "(Lokhttp3/Callback;)V", PPRNBridge.DIALOG_ACTION_CANCEL, "()V", "", "isExecuted", "()Z", "isCanceled", "LPg/F;", "timeout", "()LPg/F;", "clone", "()Lokhttp3/Call;", "Factory", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Call extends Cloneable {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/Call$Factory;", "", "Lokhttp3/Y;", "request", "Lokhttp3/Call;", "newCall", "(Lokhttp3/Y;)Lokhttp3/Call;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Factory {
        @NotNull
        Call newCall(@NotNull Y request);
    }

    void cancel();

    @NotNull
    /* JADX INFO: renamed from: clone */
    Call mo0clone();

    void enqueue(@NotNull Callback responseCallback);

    @NotNull
    e0 execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    @NotNull
    Y request();

    @NotNull
    Pg.F timeout();
}
