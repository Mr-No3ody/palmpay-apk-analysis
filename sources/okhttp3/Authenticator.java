package okhttp3;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\tJ#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lokhttp3/Authenticator;", "", "Lokhttp3/i0;", "route", "Lokhttp3/e0;", "response", "Lokhttp3/Y;", "authenticate", "(Lokhttp3/i0;Lokhttp3/e0;)Lokhttp3/Y;", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Authenticator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1922b f40556a;

    public static final class a {
        static final /* synthetic */ a $$INSTANCE = new a();

        private a() {
        }
    }

    static {
        a aVar = a.$$INSTANCE;
        f40556a = new C1922b();
        C1953v defaultDns = Dns.f40565a;
        Intrinsics.checkNotNullParameter(defaultDns, "defaultDns");
    }

    @Nullable
    Y authenticate(@Nullable i0 route, @NotNull e0 response) throws IOException;
}
