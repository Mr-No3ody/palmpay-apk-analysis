package Jg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.Conscrypt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class h {
    public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ boolean atLeastVersion$default(h hVar, int i7, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return hVar.atLeastVersion(i7, i10, i11);
    }

    public final boolean atLeastVersion(int i7, int i10, int i11) {
        Conscrypt.Version version = Conscrypt.version();
        if (version.major() != i7) {
            return version.major() > i7;
        }
        if (version.minor() != i10) {
            return version.minor() > i10;
        }
        return version.patch() >= i11;
    }

    @Nullable
    public final j buildIfSupported() {
        if (isSupported()) {
            return new j();
        }
        return null;
    }

    public final boolean isSupported() {
        return j.f4853f;
    }

    private h() {
    }
}
