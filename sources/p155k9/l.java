package p155k9;

import M1.d;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends d {
    static {
        new k(null);
    }

    @Override // M1.d
    public final int c(int i7, List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data.size() == 1 ? 1 : 2;
    }
}
