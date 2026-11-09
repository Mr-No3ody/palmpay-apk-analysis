package Uc;

import com.transsnet.palmpay.p2pcash.ui.atm.NearbyAgent2Page;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NearbyAgent2Page f9710a;

    public p0(NearbyAgent2Page nearbyAgent2Page) {
        this.f9710a = nearbyAgent2Page;
    }

    public final boolean a() {
        NearbyAgent2Page nearbyAgent2Page = this.f9710a;
        Intrinsics.checkNotNullParameter(nearbyAgent2Page, "<this>");
        return androidx.core.content.d.a(nearbyAgent2Page, com.transsnet.palmpay.core.config.d.j()) == 0;
    }
}
