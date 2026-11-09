package H5;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3704c;

    public /* synthetic */ f(int i7, int i10) {
        this.f3703b = i10;
        this.f3704c = i7;
    }

    @Override // H5.e
    public final ColorStateList a(Resources res, Resources.Theme theme) {
        switch (this.f3703b) {
            case 0:
                Intrinsics.checkNotNullParameter(res, "res");
                return ColorStateList.valueOf(this.f3704c);
            default:
                Intrinsics.checkNotNullParameter(res, "res");
                return res.getColorStateList(this.f3704c, theme);
        }
    }
}
