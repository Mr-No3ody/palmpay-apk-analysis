package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\bJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lokhttp3/Dns;", "", "", "hostname", "", "Ljava/net/InetAddress;", "lookup", "(Ljava/lang/String;)Ljava/util/List;", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Dns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1953v f40565a;

    public static final class a {
        static final /* synthetic */ a $$INSTANCE = new a();

        private a() {
        }
    }

    static {
        a aVar = a.$$INSTANCE;
        f40565a = new C1953v();
    }

    @NotNull
    List<InetAddress> lookup(@NotNull String hostname) throws UnknownHostException;
}
