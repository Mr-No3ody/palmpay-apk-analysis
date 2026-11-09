package Uc;

import android.content.Intent;
import com.transsnet.palmpay.p2pcash.ui.atm.MapPage;
import com.transsnet.palmpay.p2pcash.ui.atm.NearbyAgent2Page;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NearbyAgent2Page f9737a;

    public x0(NearbyAgent2Page nearbyAgent2Page) {
        this.f9737a = nearbyAgent2Page;
    }

    public final void a(int i7, String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        NearbyAgent2Page nearbyAgent2Page = this.f9737a;
        Intrinsics.checkNotNullParameter(nearbyAgent2Page, "<this>");
        Intent intent = new Intent(nearbyAgent2Page, (Class<?>) MapPage.class);
        intent.putExtra("MAP_TYPE", i7);
        intent.putExtra("MAP_DATA", data);
        nearbyAgent2Page.startActivity(intent);
    }
}
