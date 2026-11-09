package androidx.core.os;

import android.os.ext.SdkExtensions;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f16083a = new a();

    private a() {
    }

    public final int a(int i7) {
        return SdkExtensions.getExtensionVersion(i7);
    }
}
