package Uc;

import com.google.android.gms.maps.GoogleMap;
import com.transsnet.palmpay.p2pcash.ui.atm.MapPage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GoogleMap f9605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MapPage f9608d;

    public Y(MapPage mapPage) {
        this.f9608d = mapPage;
    }

    public final void a(Function0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        int i7 = this.f9607c + 1;
        this.f9607c = i7;
        this.f9608d.getWindow().getDecorView().postDelayed(new H0.a(i7, this, action, 3), 1000L);
    }

    public final GoogleMap b() {
        GoogleMap googleMap = this.f9605a;
        if (googleMap != null) {
            return googleMap;
        }
        Intrinsics.n("googleMap");
        throw null;
    }
}
