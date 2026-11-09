package p339wb;

import O6.c;
import Ya.d;
import Ya.g;
import android.text.TextUtils;
import androidx.activity.result.a;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.credit.bean.req.OcRouterDetail;
import com.transsnet.palmpay.credit.bean.resp.CLInitData;
import com.transsnet.palmpay.credit.bean.resp.OcRouterData;
import com.transsnet.palmpay.credit.bean.resp.OcRouterResp;
import com.transsnet.palmpay.credit.ui.fragment.OpenAccountBaseFragment;
import com.transsnet.palmpay.util.SPUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f43378c;

    public /* synthetic */ h(int i7, Object obj, Object obj2) {
        this.f43376a = i7;
        this.f43377b = obj;
        this.f43378c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Integer creditSceneRouteBindingFailTimes;
        switch (this.f43376a) {
            case 0:
                ((i) this.f43377b).notifyItemChanged(((BaseViewHolder) this.f43378c).getBindingAdapterPosition());
                break;
            default:
                OpenAccountBaseFragment openAccountBaseFragment = (OpenAccountBaseFragment) this.f43377b;
                CLInitData cLInitData = openAccountBaseFragment.f30492A;
                if (((cLInitData == null || (creditSceneRouteBindingFailTimes = cLInitData.getCreditSceneRouteBindingFailTimes()) == null) ? 0 : creditSceneRouteBindingFailTimes.intValue()) < OpenAccountBaseFragment.x()) {
                    c cVar = new c(openAccountBaseFragment.getContext());
                    cVar.f6607m = d.cs_failed_sorry_icon;
                    cVar.f6596b = O6.d.f("Sorry");
                    cVar.b(g.cs_cl_credit_bind_failed_tips);
                    cVar.d(g.cs_confirm, null);
                    cVar.g();
                } else {
                    SPUtils.get().put("credit_bind_times", TextUtils.join("_", C1850q.h(String.valueOf(System.currentTimeMillis()), String.valueOf(OpenAccountBaseFragment.x() + 1))));
                    OcRouterResp ocRouterResp = (OcRouterResp) this.f43378c;
                    OcRouterData data = ocRouterResp.getData();
                    List<OcRouterDetail> routeInfoList = data != null ? data.getRouteInfoList() : null;
                    if (routeInfoList == null || routeInfoList.isEmpty()) {
                        openAccountBaseFragment.C();
                    } else {
                        ArrayList arrayList = openAccountBaseFragment.f30497M;
                        OcRouterData data2 = ocRouterResp.getData();
                        List<OcRouterDetail> routeInfoList2 = data2 != null ? data2.getRouteInfoList() : null;
                        Intrinsics.e(routeInfoList2);
                        arrayList.addAll(routeInfoList2);
                        OcRouterDetail ocRouterDetail = (OcRouterDetail) arrayList.get(0);
                        if (Intrinsics.c(ocRouterDetail != null ? ocRouterDetail.getRoutePath() : null, "oc_permission_router")) {
                            openAccountBaseFragment.f30499X = 1;
                            if (com.transsnet.palmpay.core.config.d.v()) {
                                a aVar = openAccountBaseFragment.f30500Y;
                                if (aVar != null) {
                                    aVar.a(new String[]{"android.permission.READ_PHONE_STATE", "android.permission.ACCESS_COARSE_LOCATION"});
                                }
                            } else {
                                openAccountBaseFragment.A();
                            }
                        } else {
                            openAccountBaseFragment.f30499X = 0;
                            openAccountBaseFragment.A();
                        }
                    }
                }
                break;
        }
        return Unit.f38893a;
    }
}
