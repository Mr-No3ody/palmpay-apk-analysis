package H5;

import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Number f3737b;

    public l(Number px) {
        Intrinsics.checkNotNullParameter(px, "px");
        this.f3737b = px;
    }

    @Override // H5.j
    public final int a(Resources res) {
        Intrinsics.checkNotNullParameter(res, "res");
        return this.f3737b.intValue();
    }

    @Override // H5.j
    public final float b(Resources res) {
        Intrinsics.checkNotNullParameter(res, "res");
        return this.f3737b.floatValue();
    }
}
