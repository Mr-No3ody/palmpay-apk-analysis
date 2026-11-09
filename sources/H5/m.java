package H5;

import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3738b;

    public m(int i7) {
        this.f3738b = i7;
    }

    @Override // H5.j
    public final int a(Resources res) {
        Intrinsics.checkNotNullParameter(res, "res");
        return res.getDimensionPixelSize(this.f3738b);
    }

    @Override // H5.j
    public final float b(Resources res) {
        Intrinsics.checkNotNullParameter(res, "res");
        return a(res);
    }
}
