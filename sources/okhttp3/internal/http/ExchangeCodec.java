package okhttp3.internal.http;

import Gg.n;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import java.io.IOException;
import kotlin.Metadata;
import okhttp3.F;
import okhttp3.Y;
import okhttp3.d0;
import okhttp3.e0;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\tH&¢\u0006\u0004\b\u001e\u0010\rR\u0014\u0010\"\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lokhttp3/internal/http/ExchangeCodec;", "", "Lokhttp3/Y;", "request", "", "contentLength", "Lokio/Sink;", "createRequestBody", "(Lokhttp3/Y;J)Lokio/Sink;", "", "writeRequestHeaders", "(Lokhttp3/Y;)V", "flushRequest", "()V", "finishRequest", "", "expectContinue", "Lokhttp3/d0;", "readResponseHeaders", "(Z)Lokhttp3/d0;", "Lokhttp3/e0;", "response", "reportedContentLength", "(Lokhttp3/e0;)J", "Lokio/Source;", "openResponseBodySource", "(Lokhttp3/e0;)Lokio/Source;", "Lokhttp3/F;", "trailers", "()Lokhttp3/F;", PPRNBridge.DIALOG_ACTION_CANCEL, "LGg/n;", "getConnection", "()LGg/n;", "connection", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ExchangeCodec {
    void cancel();

    @NotNull
    Sink createRequestBody(@NotNull Y request, long contentLength) throws IOException;

    void finishRequest() throws IOException;

    void flushRequest() throws IOException;

    @NotNull
    n getConnection();

    @NotNull
    Source openResponseBodySource(@NotNull e0 response) throws IOException;

    @Nullable
    d0 readResponseHeaders(boolean expectContinue) throws IOException;

    long reportedContentLength(@NotNull e0 response) throws IOException;

    @NotNull
    F trailers() throws IOException;

    void writeRequestHeaders(@NotNull Y request) throws IOException;
}
