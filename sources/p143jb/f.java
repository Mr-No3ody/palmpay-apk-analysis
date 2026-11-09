package p143jb;

import Hb.A;
import Hb.L;
import Pa.r0;
import Z4.e;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import com.transsnet.palmpay.credit.bean.req.OcRouterDetail;
import com.transsnet.palmpay.credit.bean.resp.CLInitData;
import com.transsnet.palmpay.credit.bean.resp.OcRouterData;
import com.transsnet.palmpay.credit.bean.resp.OcRouterResp;
import com.transsnet.palmpay.credit.ui.dialog.CLFillYourInformationDialogFragment;
import com.transsnet.palmpay.credit.ui.dialog.CLVerifyPalmPayAccountDialog;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f38509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Fragment f38510g;

    public f(g gVar, Fragment fragment) {
        this.f38509f = gVar;
        this.f38510g = fragment;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        g.a(this.f38509f, d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f38509f.k(false);
        ToastUtils.showShort(message, new Object[0]);
        r0.O1("GET_ROUTE_LIST_FINISH", new JSONObject().toString(), null);
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0111  */
    @Override // Z4.e
    public final void y(Object obj) {
        OcRouterData data;
        List<String> routeList;
        List<String> routeList2;
        Integer sceneType;
        ArrayList arrayList;
        List<OcRouterDetail> routeInfoList;
        List routeInfoList2;
        List routeList3;
        OcRouterResp ocRouterResp = (OcRouterResp) obj;
        g gVar = this.f38509f;
        boolean z3 = false;
        gVar.k(false);
        if (ocRouterResp == null || !ocRouterResp.isSuccess() || ocRouterResp.getData() == null) {
            gVar.k(false);
            ToastUtils.showShort(ocRouterResp != null ? ocRouterResp.getRespMsg() : null, new Object[0]);
        } else {
            OcRouterData data2 = ocRouterResp.getData();
            gVar.f38517e = data2 != null ? data2.getCustomerTag() : null;
            ArrayList arrayList2 = gVar.f38518f;
            arrayList2.clear();
            ArrayList arrayList3 = gVar.f38519g;
            arrayList3.clear();
            OcRouterData data3 = ocRouterResp.getData();
            arrayList3.addAll((data3 == null || (routeList3 = data3.getRouteList()) == null) ? new ArrayList() : routeList3);
            OcRouterData data4 = ocRouterResp.getData();
            arrayList2.addAll((data4 == null || (routeInfoList2 = data4.getRouteInfoList()) == null) ? new ArrayList() : routeInfoList2);
            CLInitData cLInitData = gVar.f38515c;
            Fragment fragment = this.f38510g;
            if (cLInitData == null || (sceneType = cLInitData.getSceneType()) == null || sceneType.intValue() != 1) {
                OcRouterData data5 = ocRouterResp.getData();
                List<String> routeList4 = data5 != null ? data5.getRouteList() : null;
                if (routeList4 == null || routeList4.isEmpty()) {
                    z3 = true;
                } else {
                    OcRouterData data6 = ocRouterResp.getData();
                    if (TextUtils.equals((data6 == null || (routeList2 = data6.getRouteList()) == null) ? null : routeList2.get(0), "oc_permission_router") && (data = ocRouterResp.getData()) != null && (routeList = data.getRouteList()) != null && routeList.size() == 1) {
                        z3 = true;
                    }
                }
                if (!TextUtils.equals(gVar.f38514b, "LOAN_WITHDRAW") || z3) {
                    g.b(gVar, ocRouterResp);
                } else {
                    CLFillYourInformationDialogFragment cLFillYourInformationDialogFragmentNewInstance$default = CLFillYourInformationDialogFragment.a.newInstance$default(CLFillYourInformationDialogFragment.f29940M, null, 1, null);
                    L countDownFinished = new L(20, gVar, ocRouterResp);
                    cLFillYourInformationDialogFragmentNewInstance$default.getClass();
                    Intrinsics.checkNotNullParameter(countDownFinished, "countDownFinished");
                    cLFillYourInformationDialogFragmentNewInstance$default.f29942H = countDownFinished;
                    Z childFragmentManager = fragment.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    cLFillYourInformationDialogFragmentNewInstance$default.show(childFragmentManager, "showFillYourInformationDialog");
                }
            } else {
                CLVerifyPalmPayAccountDialog.a aVar = CLVerifyPalmPayAccountDialog.f29949L;
                OcRouterData data7 = ocRouterResp.getData();
                if (data7 == null || (routeInfoList = data7.getRouteInfoList()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    for (Object obj2 : routeInfoList) {
                        if (z3) {
                            arrayList.add(obj2);
                        } else {
                            OcRouterDetail ocRouterDetail = (OcRouterDetail) obj2;
                            if (!TextUtils.equals("oc_permission_router", ocRouterDetail != null ? ocRouterDetail.getRoutePath() : null)) {
                                arrayList.add(obj2);
                                z3 = true;
                            }
                        }
                    }
                }
                CLVerifyPalmPayAccountDialog cLVerifyPalmPayAccountDialogNewInstance = aVar.newInstance(arrayList, new A(gVar, 10, fragment, ocRouterResp));
                Z childFragmentManager2 = fragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                cLVerifyPalmPayAccountDialogNewInstance.show(childFragmentManager2, "showVerifyPalmPayAccountDialog");
            }
        }
        r0.O1("GET_ROUTE_LIST_FINISH", new JSONObject().toString(), null);
    }
}
