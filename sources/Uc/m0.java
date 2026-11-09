package Uc;

import Pa.C0525w;
import com.google.gson.Gson;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.p2pcash.bean.rsp.QueryNearbyAgentResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.ShopHomeByMemberIdResp;
import com.transsnet.palmpay.p2pcash.ui.atm.NearbyAgent2Page;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ NearbyAgent2Page f9684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9685g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o0 f9686i;

    public m0(NearbyAgent2Page nearbyAgent2Page, int i7, o0 o0Var) {
        this.f9684f = nearbyAgent2Page;
        this.f9685g = i7;
        this.f9686i = o0Var;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f9684f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        ToastUtils.showLong(msg, new Object[0]);
        int i7 = NearbyAgent2Page.f32889k0;
        SwipeRecyclerView swipeRecyclerViewL = NearbyAgent2Page.l(this.f9684f.p().f9734b);
        swipeRecyclerViewL.f31142d.setRefreshing(false);
        swipeRecyclerViewL.c();
    }

    @Override // Z4.e
    public final void y(Object obj) {
        QueryNearbyAgentResp resp = (QueryNearbyAgentResp) obj;
        Intrinsics.checkNotNullParameter(resp, "resp");
        int i7 = NearbyAgent2Page.f32889k0;
        NearbyAgent2Page nearbyAgent2Page = this.f9684f;
        SwipeRecyclerView swipeRecyclerViewL = NearbyAgent2Page.l(nearbyAgent2Page.p().f9734b);
        swipeRecyclerViewL.f31142d.setRefreshing(false);
        swipeRecyclerViewL.c();
        QueryNearbyAgentResp queryNearbyAgentResp = resp.isSuccess() ? resp : null;
        if (queryNearbyAgentResp != null) {
            Iterable iterable = queryNearbyAgentResp.data.receivedShopList;
            if (iterable == null) {
                iterable = kotlin.collections.z.f38935a;
            }
            Iterable<ShopHomeByMemberIdResp.ReceivedShopListBean> iterable2 = iterable;
            ArrayList arrayList = new ArrayList(kotlin.collections.r.l(iterable2, 10));
            for (ShopHomeByMemberIdResp.ReceivedShopListBean receivedShopListBean : iterable2) {
                Vc.a aVar = new Vc.a();
                aVar.s(receivedShopListBean.networkName);
                aVar.m(receivedShopListBean.networkAddress);
                aVar.u(receivedShopListBean.networkMobile);
                aVar.q(receivedShopListBean.latitude);
                aVar.r(receivedShopListBean.longitude);
                aVar.o(receivedShopListBean.distance);
                aVar.x(receivedShopListBean.shopId);
                aVar.n(receivedShopListBean.agentId);
                String json = ((Gson) C0525w.f().f7166b).toJson(receivedShopListBean);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                aVar.t(json);
                arrayList.add(aVar);
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            Iterable iterable3 = queryNearbyAgentResp.data.nearbyShopList;
            if (iterable3 == null) {
                iterable3 = kotlin.collections.z.f38935a;
            }
            Iterable<ShopHomeByMemberIdResp.NearbyShopListBean> iterable4 = iterable3;
            ArrayList arrayList3 = new ArrayList(kotlin.collections.r.l(iterable4, 10));
            for (ShopHomeByMemberIdResp.NearbyShopListBean nearbyShopListBean : iterable4) {
                Vc.a aVar2 = new Vc.a();
                aVar2.s(nearbyShopListBean.networkName);
                aVar2.m(nearbyShopListBean.networkAddress);
                aVar2.u(nearbyShopListBean.networkMobile);
                aVar2.q(nearbyShopListBean.latitude);
                aVar2.r(nearbyShopListBean.longitude);
                aVar2.o(nearbyShopListBean.distance);
                aVar2.x(nearbyShopListBean.shopId);
                aVar2.n(nearbyShopListBean.agentId);
                List list = nearbyShopListBean.businessLabel;
                if (list == null) {
                    list = kotlin.collections.z.f38935a;
                }
                aVar2.p(list);
                String json2 = ((Gson) C0525w.f().f7166b).toJson(nearbyShopListBean);
                Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
                aVar2.t(json2);
                arrayList3.add(aVar2);
            }
            ArrayList arrayList4 = new ArrayList(arrayList3);
            int i10 = this.f9685g;
            o0 o0Var = this.f9686i;
            if (i10 == 1) {
                o0Var.a().clear();
                o0Var.a().addAll(arrayList2);
                o0Var.a().addAll(arrayList4);
                if (!arrayList2.isEmpty() && o0Var.a().size() > arrayList2.size()) {
                    ((Vc.a) o0Var.a().get(0)).v();
                    ((Vc.a) o0Var.a().get(0)).w("Past Agent");
                    ((Vc.a) o0Var.a().get(arrayList2.size())).v();
                    ((Vc.a) o0Var.a().get(arrayList2.size())).w("Nearby Agent");
                }
                o0Var.e(o0Var.a());
                o0Var.f9697b = false;
                o0Var.f9696a = 1;
                nearbyAgent2Page.p().a();
            } else if (arrayList4.isEmpty()) {
                o0Var.f9697b = true;
                NearbyAgent2Page nearbyAgent2Page2 = nearbyAgent2Page.p().f9734b;
                NearbyAgent2Page.l(nearbyAgent2Page2).b(nearbyAgent2Page2.getString(Sc.e.p2p_str_end));
            } else {
                o0Var.a().addAll(arrayList4);
                o0Var.e(o0Var.a());
                o0Var.f9696a = i10;
            }
        }
        if ((resp.isSuccess() ? resp : null) == null) {
            ToastUtils.showLong(resp.getRespMsg(), new Object[0]);
            Unit unit = Unit.f38893a;
        }
    }
}
