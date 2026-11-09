package Uc;

import com.transsnet.palmpay.p2pcash.bean.rsp.QueryNearbyAgentByLocationResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.ShopHomeByMemberIdResp;
import com.transsnet.palmpay.p2pcash.ui.atm.MapPage;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class V extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MapPage f9592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ W f9593g;

    public V(MapPage mapPage, W w3) {
        this.f9592f = mapPage;
        this.f9593g = w3;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f9592f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        int i7 = MapPage.f32859u0;
        this.f9592f.s().a(new Pa.b0(12));
        ToastUtils.showLong(msg, new Object[0]);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        QueryNearbyAgentByLocationResp resp = (QueryNearbyAgentByLocationResp) obj;
        Intrinsics.checkNotNullParameter(resp, "resp");
        if ((resp.isSuccess() ? this : null) == null) {
            ToastUtils.showLong(resp.getRespMsg(), new Object[0]);
            return;
        }
        List<ShopHomeByMemberIdResp.NearbyShopListBean> list = resp.data;
        ArrayList arrayList = new ArrayList(list != null ? list : kotlin.collections.z.f38935a);
        W w3 = this.f9593g;
        w3.getClass();
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        w3.f9602h.setValue(w3, W.f9594j[0], arrayList);
    }
}
