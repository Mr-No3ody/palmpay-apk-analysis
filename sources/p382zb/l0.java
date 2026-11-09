package p382zb;

import Z4.e;
import android.text.TextUtils;
import androidx.fragment.app.Z;
import com.transsnet.palmpay.credit.bean.req.OcRouterDetail;
import com.transsnet.palmpay.credit.bean.resp.CLInitData;
import com.transsnet.palmpay.credit.bean.resp.OcRouterData;
import com.transsnet.palmpay.credit.bean.resp.OcRouterResp;
import com.transsnet.palmpay.credit.ui.dialog.CLVerifyPalmPayAccountDialog;
import com.transsnet.palmpay.credit.ui.dialog.CreditApplicationDialogFragment;
import com.transsnet.palmpay.credit.ui.fragment.OpenAccountBaseFragment;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p325vb.a;
import p339wb.h;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ OpenAccountBaseFragment f44601f;

    public l0(OpenAccountBaseFragment openAccountBaseFragment) {
        this.f44601f = openAccountBaseFragment;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f44601f.f(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f44601f.showLoadingDialog(false);
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
        List<OcRouterDetail> routeInfoList;
        Integer sceneType;
        List<OcRouterDetail> routeInfoList2;
        List<String> routeList;
        OcRouterResp ocRouterResp = (OcRouterResp) obj;
        int size = 0;
        list = null;
        List<OcRouterDetail> list = null;
        OpenAccountBaseFragment openAccountBaseFragment = this.f44601f;
        if (ocRouterResp == null || !ocRouterResp.isSuccess() || ocRouterResp.getData() == null) {
            openAccountBaseFragment.showLoadingDialog(false);
            ToastUtils.showShort(ocRouterResp != null ? ocRouterResp.getRespMsg() : null, new Object[0]);
            return;
        }
        OcRouterData data = ocRouterResp.getData();
        openAccountBaseFragment.f30496L = data != null ? data.getCustomerTag() : null;
        ArrayList arrayList = openAccountBaseFragment.f30497M;
        arrayList.clear();
        ArrayList arrayList2 = openAccountBaseFragment.f30498Q;
        arrayList2.clear();
        OcRouterData data2 = ocRouterResp.getData();
        if (data2 != null && (routeList = data2.getRouteList()) != null) {
            arrayList2.addAll(routeList);
        }
        CLInitData cLInitData = openAccountBaseFragment.f30492A;
        if (cLInitData != null && (sceneType = cLInitData.getSceneType()) != null && sceneType.intValue() == 1) {
            CLVerifyPalmPayAccountDialog.a aVar = CLVerifyPalmPayAccountDialog.f29949L;
            OcRouterData data3 = ocRouterResp.getData();
            if (data3 != null && (routeInfoList2 = data3.getRouteInfoList()) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : routeInfoList2) {
                    if (size != 0) {
                        arrayList3.add(obj2);
                    } else {
                        OcRouterDetail ocRouterDetail = (OcRouterDetail) obj2;
                        if (!TextUtils.equals("oc_permission_router", ocRouterDetail != null ? ocRouterDetail.getRoutePath() : null)) {
                            arrayList3.add(obj2);
                            size = 1;
                        }
                    }
                }
                list = arrayList3;
            }
            CLVerifyPalmPayAccountDialog cLVerifyPalmPayAccountDialogNewInstance = aVar.newInstance(list, new h(1, openAccountBaseFragment, ocRouterResp));
            Z childFragmentManager = openAccountBaseFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            cLVerifyPalmPayAccountDialogNewInstance.show(childFragmentManager, "showVerifyPalmPayAccountDialog");
            return;
        }
        OcRouterData data4 = ocRouterResp.getData();
        if (data4 != null && (routeInfoList = data4.getRouteInfoList()) != null) {
            size = routeInfoList.size();
        }
        if (size <= 0) {
            openAccountBaseFragment.C();
            return;
        }
        OcRouterData data5 = ocRouterResp.getData();
        List<OcRouterDetail> routeInfoList3 = data5 != null ? data5.getRouteInfoList() : null;
        Intrinsics.e(routeInfoList3);
        arrayList.addAll(routeInfoList3);
        if (size <= 1) {
            OpenAccountBaseFragment.z(openAccountBaseFragment);
            return;
        }
        CreditApplicationDialogFragment creditApplicationDialogFragmentNewInstance = CreditApplicationDialogFragment.f29952L.newInstance(arrayList);
        a countDownListener = new a(openAccountBaseFragment, 10);
        creditApplicationDialogFragmentNewInstance.getClass();
        Intrinsics.checkNotNullParameter(countDownListener, "countDownListener");
        creditApplicationDialogFragmentNewInstance.f29954H = countDownListener;
        Z childFragmentManager2 = openAccountBaseFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
        creditApplicationDialogFragmentNewInstance.show(childFragmentManager2, "CreditApplicationDialogFragment");
    }
}
