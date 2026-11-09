package cn.tongdun.android.qgq9qg99.qgq9qg99;

import android.content.Context;
import android.location.LocationManager;

/* JADX INFO: loaded from: classes.dex */
final class gg99ggqgg999g99gq implements cn.tongdun.android.qgq9qg99.qgq9qg99.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private final LocationManager f19135q999ggg99999qqggqqg9qg;
    private final Context qgq9qg99;

    private gg99ggqgg999g99gq(Context context, LocationManager locationManager) {
        this.qgq9qg99 = context;
        this.f19135q999ggg99999qqggqqg9qg = locationManager;
    }

    public static gg99ggqgg999g99gq q999ggg99999qqggqqg9qg(Context context, LocationManager locationManager) {
        return new gg99ggqgg999g99gq(context, locationManager);
    }

    @Override // cn.tongdun.android.qgq9qg99.qgq9qg99.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq
    public final Object q999ggg99999qqggqqg9qg() {
        return gq9qqgq9q9.q999ggg99999qqggqqg9qg(this.qgq9qg99, this.f19135q999ggg99999qqggqqg9qg);
    }
}
