package Kg;

import androidx.camera.video.u;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.android.DeferredSocketAdapter$Factory;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class h {
    public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i build(Class<? super SSLSocket> cls) {
        Class<? super SSLSocket> superclass = cls;
        while (superclass != null && !superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError(u.l(cls, "No OpenSSLSocketImpl superclass of socket of type "));
            }
        }
        Intrinsics.e(superclass);
        return new i(superclass);
    }

    @NotNull
    public final DeferredSocketAdapter$Factory factory(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return new g(packageName);
    }

    @NotNull
    public final DeferredSocketAdapter$Factory getPlayProviderFactory() {
        return i.f5496g;
    }

    private h() {
    }
}
