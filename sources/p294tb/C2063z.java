package p294tb;

import Hb.L;
import Z4.e;
import android.text.TextUtils;
import androidx.fragment.app.Z;
import com.transsnet.palmpay.credit.bean.req.OcRouterDetail;
import com.transsnet.palmpay.credit.bean.resp.CLInitData;
import com.transsnet.palmpay.credit.bean.resp.OcRouterData;
import com.transsnet.palmpay.credit.bean.resp.OcRouterResp;
import com.transsnet.palmpay.credit.ui.activity.cashloan.a;
import com.transsnet.palmpay.credit.ui.dialog.CLVerifyPalmPayAccountDialog;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: tb.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2063z extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f42531f;

    public C2063z(a aVar) {
        this.f42531f = aVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f42531f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f42531f.showLoadingDialog(false);
        ToastUtils.showShort(message, new Object[0]);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // Z4.e
    public final void y(Object obj) {
        Integer sceneType;
        List<OcRouterDetail> routeInfoList;
        List<String> routeList;
        OcRouterResp ocRouterResp = (OcRouterResp) obj;
        a aVar = this.f42531f;
        boolean z3 = false;
        arrayList = null;
        ArrayList arrayList = null;
        if (ocRouterResp == null || !ocRouterResp.isSuccess() || ocRouterResp.getData() == null) {
            aVar.showLoadingDialog(false);
            ToastUtils.showShort(ocRouterResp != null ? ocRouterResp.getRespMsg() : null, new Object[0]);
            return;
        }
        OcRouterData data = ocRouterResp.getData();
        aVar.f29208p = data != null ? data.getCustomerTag() : null;
        ArrayList arrayList2 = aVar.f29205i;
        arrayList2.clear();
        ArrayList arrayList3 = aVar.f29206j;
        arrayList3.clear();
        OcRouterData data2 = ocRouterResp.getData();
        arrayList3.addAll((data2 == null || (routeList = data2.getRouteList()) == null) ? new ArrayList() : routeList);
        CLInitData cLInitData = aVar.f29204g;
        if (cLInitData == null || (sceneType = cLInitData.getSceneType()) == null || sceneType.intValue() != 1) {
            OcRouterData data3 = ocRouterResp.getData();
            List<OcRouterDetail> routeInfoList2 = data3 != null ? data3.getRouteInfoList() : null;
            if (routeInfoList2 == null || routeInfoList2.isEmpty()) {
                aVar.s();
                return;
            }
            OcRouterData data4 = ocRouterResp.getData();
            List<OcRouterDetail> routeInfoList3 = data4 != null ? data4.getRouteInfoList() : null;
            Intrinsics.e(routeInfoList3);
            arrayList2.addAll(routeInfoList3);
            OcRouterDetail ocRouterDetail = (OcRouterDetail) arrayList2.get(0);
            if (Intrinsics.c(ocRouterDetail != null ? ocRouterDetail.getRoutePath() : null, "oc_permission_router")) {
                aVar.f29207o = 1;
                a.m(aVar);
                return;
            } else {
                aVar.f29207o = 0;
                aVar.p();
                return;
            }
        }
        CLVerifyPalmPayAccountDialog.a aVar2 = CLVerifyPalmPayAccountDialog.f29949L;
        OcRouterData data5 = ocRouterResp.getData();
        if (data5 != null && (routeInfoList = data5.getRouteInfoList()) != null) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : routeInfoList) {
                if (z3) {
                    arrayList4.add(obj2);
                } else {
                    OcRouterDetail ocRouterDetail2 = (OcRouterDetail) obj2;
                    if (!TextUtils.equals("oc_permission_router", ocRouterDetail2 != null ? ocRouterDetail2.getRoutePath() : null)) {
                        arrayList4.add(obj2);
                        z3 = true;
                    }
                }
            }
            arrayList = arrayList4;
        }
        CLVerifyPalmPayAccountDialog cLVerifyPalmPayAccountDialogNewInstance = aVar2.newInstance(arrayList, new L(28, aVar, ocRouterResp));
        Z supportFragmentManager = aVar.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        cLVerifyPalmPayAccountDialogNewInstance.show(supportFragmentManager, "showVerifyPalmPayAccountDialog");
    }
}
