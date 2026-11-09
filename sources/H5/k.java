package H5;

import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Number f3735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f3736c;

    public k(Number dp) {
        Intrinsics.checkNotNullParameter(dp, "dp");
        this.f3735b = dp;
    }

    @Override // H5.j
    public final int a(Resources res) {
        int iApplyDimension;
        Intrinsics.checkNotNullParameter(res, "res");
        Integer num = this.f3736c;
        if (num != null) {
            iApplyDimension = num.intValue();
        } else {
            Intrinsics.checkNotNullParameter(res, "res");
            Number dp = this.f3735b;
            Intrinsics.checkNotNullParameter(dp, "dp");
            iApplyDimension = (int) TypedValue.applyDimension(1, dp.floatValue(), res.getDisplayMetrics());
        }
        this.f3736c = Integer.valueOf(iApplyDimension);
        return iApplyDimension;
    }

    @Override // H5.j
    public final float b(Resources res) {
        Intrinsics.checkNotNullParameter(res, "res");
        return a(res);
    }
}
