package Eg;

import com.google.common.net.HttpHeaders;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C1943k;
import okhttp3.Y;
import okhttp3.e0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class d {
    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0038  */
    public final boolean isCacheable(@NotNull e0 response, @NotNull Y request) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(request, "request");
        int i7 = response.f40731d;
        if (i7 != 200 && i7 != 410 && i7 != 414 && i7 != 501 && i7 != 203 && i7 != 204) {
            if (i7 == 307) {
                if (response.b(HttpHeaders.EXPIRES, null) == null && response.a().f40928c == -1 && !response.a().f40931f && !response.a().f40930e) {
                    return false;
                }
            } else if (i7 != 308 && i7 != 404 && i7 != 405) {
                switch (i7) {
                    case 300:
                    case 301:
                        break;
                    case 302:
                        if (response.b(HttpHeaders.EXPIRES, null) == null) {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }
        }
        if (response.a().f40927b) {
            return false;
        }
        C1943k c1943k = request.f40690f;
        if (c1943k == null) {
            c1943k = C1943k.f40923n.parse(request.f40687c);
            request.f40690f = c1943k;
        }
        return !c1943k.f40927b;
    }

    private d() {
    }
}
