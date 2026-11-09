package L8;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean isBiometricInternalFragment(@NotNull String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return Intrinsics.c(className, "androidx.biometric.FingerprintDialogFragment") || Intrinsics.c(className, "androidx.biometric.BiometricFragment");
    }

    private d() {
    }
}
