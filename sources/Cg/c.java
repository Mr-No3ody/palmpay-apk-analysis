package Cg;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Dns;
import okhttp3.J;
import okhttp3.L;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Dns buildBootstrapClient(b bVar) {
        List list = bVar.f1559f;
        if (list == null) {
            return bVar.f1558e;
        }
        J j6 = bVar.f1555b;
        Intrinsics.e(j6);
        return new a(j6.f40582d, list);
    }

    @NotNull
    public final L getDNS_MESSAGE() {
        return d.f1562h;
    }

    public final boolean isPrivateHost$okhttp_dnsoverhttps(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        return PublicSuffixDatabase.f40915e.get().a(host) == null;
    }

    private c() {
    }
}
