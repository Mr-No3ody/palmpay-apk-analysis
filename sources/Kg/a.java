package Kg;

import android.os.Build;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.platform.android.SocketAdapter;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public final SocketAdapter buildIfSupported() {
        if (isSupported()) {
            return new b();
        }
        return null;
    }

    public final boolean isSupported() {
        return Jg.t.f4869a.isAndroid() && Build.VERSION.SDK_INT >= 29;
    }

    private a() {
    }
}
