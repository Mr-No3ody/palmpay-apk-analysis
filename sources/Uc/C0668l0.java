package Uc;

import com.transsnet.palmpay.p2pcash.bean.rsp.ShopHomeByMemberIdResp;
import com.transsnet.palmpay.p2pcash.ui.atm.NearbyAgent2Page;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Uc.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0668l0 extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ NearbyAgent2Page f9671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o0 f9672g;

    public C0668l0(NearbyAgent2Page nearbyAgent2Page, o0 o0Var) {
        this.f9671f = nearbyAgent2Page;
        this.f9672g = o0Var;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f9671f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        ToastUtils.showLong(msg, new Object[0]);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        List<ShopHomeByMemberIdResp.ReceivedShopListBean> list;
        ShopHomeByMemberIdResp resp = (ShopHomeByMemberIdResp) obj;
        Intrinsics.checkNotNullParameter(resp, "resp");
        ShopHomeByMemberIdResp shopHomeByMemberIdResp = resp.isSuccess() ? resp : null;
        if (shopHomeByMemberIdResp != null) {
            ShopHomeByMemberIdResp.DataBean dataBean = shopHomeByMemberIdResp.data;
            ArrayList arrayList = new ArrayList((dataBean == null || (list = dataBean.receivedShopList) == null) ? kotlin.collections.z.f38935a : list);
            o0 o0Var = this.f9672g;
            o0Var.getClass();
            Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
            o0Var.f9703h.setValue(o0Var, o0.f9695j[3], arrayList);
        }
        if ((resp.isSuccess() ? resp : null) == null) {
            ToastUtils.showLong(resp.getRespMsg(), new Object[0]);
            Unit unit = Unit.f38893a;
        }
    }
}
