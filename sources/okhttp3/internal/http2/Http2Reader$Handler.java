package okhttp3.internal.http2;

import com.google.firebase.messaging.Constants;
import com.google.net.cronet.okhttptransport.CronetNqeKey;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH&¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H&¢\u0006\u0004\b\u001f\u0010 J'\u0010$\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&H&¢\u0006\u0004\b(\u0010)J/\u0010-\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0002H&¢\u0006\u0004\b-\u0010.J-\u00101\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b1\u00102J?\u00109\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\"2\u0006\u00106\u001a\u0002032\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020&H&¢\u0006\u0004\b9\u0010:¨\u0006;"}, d2 = {"okhttp3/internal/http2/Http2Reader$Handler", "", "", "inFinished", "", "streamId", "Lokio/BufferedSource;", "source", "length", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(ZILokio/BufferedSource;I)V", "associatedStreamId", "", "Lokhttp3/internal/http2/e;", "headerBlock", "headers", "(ZIILjava/util/List;)V", "Lokhttp3/internal/http2/c;", "errorCode", "rstStream", "(ILokhttp3/internal/http2/c;)V", "clearPrevious", "Lokhttp3/internal/http2/K;", "settings", "(ZLokhttp3/internal/http2/K;)V", "ackSettings", "()V", "ack", "payload1", "payload2", "ping", "(ZII)V", "lastGoodStreamId", "LPg/m;", "debugData", "goAway", "(ILokhttp3/internal/http2/c;LPg/m;)V", "", "windowSizeIncrement", "windowUpdate", "(IJ)V", "streamDependency", "weight", "exclusive", "priority", "(IIIZ)V", "promisedStreamId", "requestHeaders", "pushPromise", "(IILjava/util/List;)V", "", "origin", CronetNqeKey.KEY_PROTOCOL, "host", "port", "maxAge", "alternateService", "(ILjava/lang/String;LPg/m;Ljava/lang/String;IJ)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Http2Reader$Handler {
    void ackSettings();

    void alternateService(int streamId, @NotNull String origin, @NotNull Pg.m protocol, @NotNull String host, int port, long maxAge);

    void data(boolean inFinished, int streamId, @NotNull BufferedSource source, int length) throws IOException;

    void goAway(int lastGoodStreamId, @NotNull EnumC1932c errorCode, @NotNull Pg.m debugData);

    void headers(boolean inFinished, int streamId, int associatedStreamId, @NotNull List<C1934e> headerBlock);

    void ping(boolean ack, int payload1, int payload2);

    void priority(int streamId, int streamDependency, int weight, boolean exclusive);

    void pushPromise(int streamId, int promisedStreamId, @NotNull List<C1934e> requestHeaders) throws IOException;

    void rstStream(int streamId, @NotNull EnumC1932c errorCode);

    void settings(boolean clearPrevious, @NotNull K settings);

    void windowUpdate(int streamId, long windowSizeIncrement);
}
