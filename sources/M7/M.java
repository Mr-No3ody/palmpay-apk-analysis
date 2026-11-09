package M7;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class M extends N {
    public M() {
        super("TEXT", 0);
    }

    @Override // M7.N
    public final int a(I capitalize) {
        Intrinsics.checkNotNullParameter(capitalize, "capitalize");
        int iOrdinal = capitalize.ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal == 1) {
            return UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (iOrdinal == 2) {
            return 16384;
        }
        if (iOrdinal == 3) {
            return 4096;
        }
        throw new p355xf.l();
    }
}
