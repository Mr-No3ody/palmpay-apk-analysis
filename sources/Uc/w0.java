package Uc;

import com.transsnet.palmpay.p2pcash.ui.atm.NearbyAgent2Page;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NearbyAgent2Page f9734b;

    public w0(NearbyAgent2Page nearbyAgent2Page) {
        this.f9734b = nearbyAgent2Page;
    }

    public final void a() {
        if (this.f9733a) {
            int i7 = NearbyAgent2Page.f32889k0;
            NearbyAgent2Page nearbyAgent2Page = this.f9734b;
            int size = nearbyAgent2Page.n().a().size();
            Vc.a aVar = new Vc.a();
            aVar.l();
            if (size != 0) {
                if (size < 3) {
                    nearbyAgent2Page.n().a().add(aVar);
                    nearbyAgent2Page.n().e(nearbyAgent2Page.n().a());
                    return;
                }
                List listSubList = nearbyAgent2Page.n().a().subList(0, 2);
                Intrinsics.checkNotNullExpressionValue(listSubList, "subList(...)");
                List listSubList2 = nearbyAgent2Page.n().a().subList(2, nearbyAgent2Page.n().a().size());
                Intrinsics.checkNotNullExpressionValue(listSubList2, "subList(...)");
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(listSubList);
                arrayList.add(aVar);
                arrayList.addAll(listSubList2);
                nearbyAgent2Page.n().e(new ArrayList(arrayList));
            }
        }
    }
}
