package okhttp3;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\fJ%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lokhttp3/CookieJar;", "", "Lokhttp3/J;", "url", "", "Lokhttp3/t;", "cookies", "", "saveFromResponse", "(Lokhttp3/J;Ljava/util/List;)V", "loadForRequest", "(Lokhttp3/J;)Ljava/util/List;", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface CookieJar {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final C1952u f40559o0;

    public static final class a {
        static final /* synthetic */ a $$INSTANCE = new a();

        private a() {
        }
    }

    static {
        a aVar = a.$$INSTANCE;
        f40559o0 = new C1952u();
    }

    @NotNull
    List<C1951t> loadForRequest(@NotNull J url);

    void saveFromResponse(@NotNull J url, @NotNull List<C1951t> cookies);
}
