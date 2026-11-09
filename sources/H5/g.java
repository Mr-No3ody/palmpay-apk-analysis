package H5;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f3705b;

    public g(ColorStateList colorList) {
        Intrinsics.checkNotNullParameter(colorList, "colorList");
        this.f3705b = colorList;
    }

    @Override // H5.e
    public final ColorStateList a(Resources res, Resources.Theme theme) {
        Intrinsics.checkNotNullParameter(res, "res");
        return this.f3705b;
    }
}
