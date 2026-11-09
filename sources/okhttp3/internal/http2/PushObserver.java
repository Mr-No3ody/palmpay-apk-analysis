package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0018J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ-\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/http2/PushObserver;", "", "", "streamId", "", "Lokhttp3/internal/http2/e;", "requestHeaders", "", "onRequest", "(ILjava/util/List;)Z", "responseHeaders", "last", "onHeaders", "(ILjava/util/List;Z)Z", "Lokio/BufferedSource;", "source", "byteCount", "onData", "(ILokio/BufferedSource;IZ)Z", "Lokhttp3/internal/http2/c;", "errorCode", "", "onReset", "(ILokhttp3/internal/http2/c;)V", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PushObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I f40802a;

    public static final class a {
        static final /* synthetic */ a $$INSTANCE = new a();

        private a() {
        }
    }

    static {
        a aVar = a.$$INSTANCE;
        f40802a = new I();
    }

    boolean onData(int streamId, @NotNull BufferedSource source, int byteCount, boolean last) throws IOException;

    boolean onHeaders(int streamId, @NotNull List<C1934e> responseHeaders, boolean last);

    boolean onRequest(int streamId, @NotNull List<C1934e> requestHeaders);

    void onReset(int streamId, @NotNull EnumC1932c errorCode);
}
