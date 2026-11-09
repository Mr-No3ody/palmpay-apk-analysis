package p143jb;

import C0.G;
import Eb.a;
import N8.r;
import Pa.C0525w;
import Pa.E;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.gson.Gson;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.core.bean.req.UploadDeviceInfoReq;
import com.transsnet.palmpay.core.service.CollectDeviceInfoService;
import com.transsnet.palmpay.credit.bean.LoanHomeSource;
import com.transsnet.palmpay.credit.bean.other.CLNoPermissionBean;
import com.transsnet.palmpay.credit.bean.req.CLInitReq;
import com.transsnet.palmpay.credit.bean.req.CLPermissionInfo;
import com.transsnet.palmpay.credit.bean.req.DoubleSignReq;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.bean.req.OcLocationInfoReq;
import com.transsnet.palmpay.credit.bean.req.OcRouterReq;
import com.transsnet.palmpay.credit.bean.req.PermissionReq;
import com.transsnet.palmpay.credit.bean.resp.CLInitData;
import com.transsnet.palmpay.credit.bean.resp.OcRouterData;
import com.transsnet.palmpay.credit.bean.resp.OcRouterResp;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import com.transsnet.palmpay.credit.ui.dialog.OcNoPermissionDialog;
import com.transsnet.palmpay.managemoney.ui.view.c;
import com.transsnet.palmpay.util.CameraUtils;
import com.transsnet.palmpay.util.OcCameraInfoBean;
import com.transsnet.palmpay.util.PermissionUtils;
import com.transsnet.palmpay.util.SPUtils;
import df.i;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p071ef.b;
import p298tf.f;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f38511o = new d(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final t f38512p = C2131j.b(new c(25));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f38513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f38514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CLInitData f38515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f38516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f38517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f38518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f38519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f38520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BaseFragment f38521i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f38522j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f38523k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f38524l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f38525m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Integer f38526n;

    public static final void a(g gVar, Disposable disposable) {
        BaseFragment baseFragment = gVar.f38521i;
        if (baseFragment != null) {
            baseFragment.f(disposable);
        }
    }

    public static final void b(g gVar, OcRouterResp ocRouterResp) {
        OcRouterData data;
        OcRouterData data2;
        gVar.getClass();
        List<String> routeList = null;
        List<String> routeList2 = (ocRouterResp == null || (data2 = ocRouterResp.getData()) == null) ? null : data2.getRouteList();
        if (routeList2 != null && !routeList2.isEmpty()) {
            if (ocRouterResp != null && (data = ocRouterResp.getData()) != null) {
                routeList = data.getRouteList();
            }
            List<String> list = routeList;
            if (list == null || list.isEmpty()) {
                gVar.j();
                return;
            } else if (Intrinsics.c(gVar.f38519g.get(0), "oc_permission_router")) {
                gVar.f38520h = 1;
                gVar.c();
                return;
            } else {
                gVar.f38520h = 0;
                gVar.h();
                return;
            }
        }
        if (!TextUtils.equals(gVar.f38514b, "LOAN_WITHDRAW")) {
            gVar.j();
            return;
        }
        Integer num = gVar.f38523k;
        if (num != null && num.intValue() == 1) {
            gVar.e(gVar.f38522j);
            return;
        }
        Integer num2 = gVar.f38526n;
        int iIntValue = num2 != null ? num2.intValue() : 7;
        Bundle bundle = new Bundle();
        bundle.putInt("accountType", iIntValue);
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String str = a.f2267a;
        bundle.putString(LoanHomeSource.TRACK_PARAM_KEY, str);
        bundle.putString(LoanHomeSource.TRACK_PARAM_KEY, str);
        d.x(bundle, "LoanBorrowHome");
    }

    public static int d() {
        String string = SPUtils.get().getString("credit_bind_times");
        Intrinsics.e(string);
        if (StringsKt.A(string, "_", false)) {
            return E.b(TextUtils.split(string, "_")[1]);
        }
        return 0;
    }

    public static void g(g gVar, Integer num, Integer num2, String str, BaseFragment baseFragment, int i7, String str2, String str3, int i10) {
        String str4 = (i10 & 32) != 0 ? null : str2;
        String str5 = (i10 & 64) != 0 ? null : str3;
        gVar.getClass();
        gVar.f38514b = str == null ? "CASH_LOAN" : str;
        gVar.f38522j = num;
        gVar.f38523k = num2;
        gVar.f38521i = baseFragment;
        gVar.f38524l = i7;
        gVar.f38525m = str5;
        gVar.f38526n = 7;
        if (str4 != null) {
            gVar.f38513a = str4;
        }
        gVar.k(true);
        if (TextUtils.isEmpty(null)) {
            G.h(p221ob.c.f40268a).clInitApply(new CLInitReq(gVar.f38513a, str, 2, null, Boolean.FALSE, null, 32, null)).k(f.f42629b).i(b.a()).subscribe(new r(8, gVar, baseFragment));
        } else {
            gVar.f38516d = null;
            gVar.f(baseFragment);
        }
    }

    public final void c() {
        if (!com.transsnet.palmpay.core.config.d.v()) {
            h();
            return;
        }
        final ArrayList arrayList = new ArrayList();
        if (!PermissionUtils.isGranted("android.permission.READ_PHONE_STATE")) {
            arrayList.add("android.permission.READ_PHONE_STATE");
        }
        if (!PermissionUtils.isGranted("android.permission.ACCESS_COARSE_LOCATION")) {
            arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        }
        if (arrayList.size() == 0) {
            l();
            return;
        }
        final BaseFragment baseFragment = this.f38521i;
        if (baseFragment != null) {
            ArrayList arrayList2 = new ArrayList();
            if (!PermissionUtils.isGranted("android.permission.READ_PHONE_STATE")) {
                arrayList2.add(new CLNoPermissionBean(baseFragment.requireContext().getDrawable(Ya.d.cs_device_info_icon), "Device Information"));
            }
            if (!PermissionUtils.isGranted("android.permission.ACCESS_COARSE_LOCATION") || !PermissionUtils.isGranted(com.transsnet.palmpay.core.config.d.j())) {
                Context contextRequireContext = baseFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                arrayList2.add(new CLNoPermissionBean(G8.a.x(contextRequireContext, S6.a.pay_Position, null, Integer.valueOf(L6.b.ppColorTextPrimary), 24.0f, 114), "Local Information"));
            }
            Context contextRequireContext2 = baseFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            OcNoPermissionDialog ocNoPermissionDialog = new OcNoPermissionDialog(contextRequireContext2, arrayList2);
            final int i7 = 0;
            ocNoPermissionDialog.setOnSetPermissionClickListener(new Function0() { // from class: jb.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i7) {
                        case 0:
                            BaseFragment baseFragment2 = baseFragment;
                            if (baseFragment2.getActivity() != null) {
                                baseFragment2.requestPermissions((String[]) arrayList.toArray(new String[0]), 1001);
                            }
                            break;
                        case 1:
                            BaseFragment baseFragment3 = baseFragment;
                            if (baseFragment3.getActivity() != null) {
                                baseFragment3.requestPermissions((String[]) arrayList.toArray(new String[0]), 1001);
                            }
                            break;
                        default:
                            BaseFragment baseFragment4 = baseFragment;
                            if (baseFragment4.getActivity() != null) {
                                baseFragment4.requestPermissions((String[]) arrayList.toArray(new String[0]), 1001);
                            }
                            break;
                    }
                    return Unit.f38893a;
                }
            });
            final int i10 = 1;
            ocNoPermissionDialog.setOnCloseClickListener(new Function0() { // from class: jb.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i10) {
                        case 0:
                            BaseFragment baseFragment2 = baseFragment;
                            if (baseFragment2.getActivity() != null) {
                                baseFragment2.requestPermissions((String[]) arrayList.toArray(new String[0]), 1001);
                            }
                            break;
                        case 1:
                            BaseFragment baseFragment3 = baseFragment;
                            if (baseFragment3.getActivity() != null) {
                                baseFragment3.requestPermissions((String[]) arrayList.toArray(new String[0]), 1001);
                            }
                            break;
                        default:
                            BaseFragment baseFragment4 = baseFragment;
                            if (baseFragment4.getActivity() != null) {
                                baseFragment4.requestPermissions((String[]) arrayList.toArray(new String[0]), 1001);
                            }
                            break;
                    }
                    return Unit.f38893a;
                }
            });
            final int i11 = 2;
            ocNoPermissionDialog.setOnSetCountdownListener(new Function0() { // from class: jb.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i11) {
                        case 0:
                            BaseFragment baseFragment2 = baseFragment;
                            if (baseFragment2.getActivity() != null) {
                                baseFragment2.requestPermissions((String[]) arrayList.toArray(new String[0]), 1001);
                            }
                            break;
                        case 1:
                            BaseFragment baseFragment3 = baseFragment;
                            if (baseFragment3.getActivity() != null) {
                                baseFragment3.requestPermissions((String[]) arrayList.toArray(new String[0]), 1001);
                            }
                            break;
                        default:
                            BaseFragment baseFragment4 = baseFragment;
                            if (baseFragment4.getActivity() != null) {
                                baseFragment4.requestPermissions((String[]) arrayList.toArray(new String[0]), 1001);
                            }
                            break;
                    }
                    return Unit.f38893a;
                }
            });
            ocNoPermissionDialog.show();
        }
    }

    public final void e(Integer num) {
        p221ob.c.f40268a.getInstance().getClass();
        p221ob.c.a().getH5BorrowUrl(num).k(f.f42629b).i(b.a()).subscribe(new e(this, 0));
    }

    public final void f(Fragment fragment) {
        F6.d.h("CLOpenAccountManager", 3, "getRouterList >>> ");
        IApiCreditService iApiCreditServiceH = G.h(p221ob.c.f40268a);
        Boolean bool = Boolean.FALSE;
        iApiCreditServiceH.getRouterList(new OcRouterReq(bool, this.f38514b, 2, -1, bool, this.f38513a, this.f38516d)).k(f.f42629b).i(b.a()).subscribe(new f(this, fragment));
    }

    public final void h() {
        ArrayList arrayList = this.f38519g;
        if (arrayList != null && !arrayList.isEmpty() && this.f38520h < this.f38519g.size()) {
            k(false);
            i("/credit_score/oc_start_apply_activity");
            return;
        }
        if (!TextUtils.equals(this.f38514b, "LOAN_WITHDRAW")) {
            j();
            return;
        }
        Integer num = this.f38523k;
        if (num != null && num.intValue() == 1) {
            e(this.f38522j);
            return;
        }
        if (this.f38524l == 1) {
            i("/credit_score/cl_last_protocol_activity");
            return;
        }
        Integer num2 = this.f38526n;
        int iIntValue = num2 != null ? num2.intValue() : 7;
        Bundle bundle = new Bundle();
        bundle.putInt("accountType", iIntValue);
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String str = a.f2267a;
        bundle.putString(LoanHomeSource.TRACK_PARAM_KEY, str);
        bundle.putString(LoanHomeSource.TRACK_PARAM_KEY, str);
        d.x(bundle, "LoanBorrowHome");
    }

    public final void i(String str) {
        Postcard postcardWithInt = ARouter.getInstance().build(str).withInt("oc_current_router_index", this.f38520h).withString("oc_business_type", this.f38514b).withString("oc_router_operate_type", this.f38525m).withInt("key_need_sign_type", this.f38524l);
        Integer num = this.f38522j;
        Postcard postcardWithInt2 = postcardWithInt.withInt("cl_product_type", num != null ? num.intValue() : 1);
        C0525w c0525wF = C0525w.f();
        String str2 = this.f38513a;
        String str3 = this.f38516d;
        CLInitData cLInitData = this.f38515c;
        postcardWithInt2.withString("oc_apply_data", ((Gson) c0525wF.f7166b).toJson(new OcApplyData(str2, 2, str3, "", cLInitData != null ? cLInitData.getSceneType() : null, false, false, this.f38517e, this.f38514b, this.f38518f, this.f38519g))).navigation();
    }

    public final void j() {
        if (!this.f38514b.equals("CASH_LOAN") && !this.f38514b.equals("CASH_INSTANT_LOAN") && !this.f38514b.equals("INSTALLMENT_LOAN")) {
            G.h(p221ob.c.f40268a).installmentRaiseAmountV2(this.f38516d, null, this.f38514b).k(f.f42629b).i(b.a()).subscribe(new e(this, 3));
        } else {
            G.h(p221ob.c.f40268a).querySignStatus(new DoubleSignReq(this.f38514b)).k(f.f42629b).i(b.a()).subscribe(new e(this, 2));
        }
    }

    public final void k(boolean z3) {
        BaseFragment baseFragment = this.f38521i;
        if (baseFragment != null) {
            baseFragment.showLoadingDialog(z3);
        }
    }

    public final void l() {
        double latitude;
        double longitude;
        androidx.fragment.app.E eRequireActivity;
        if (this.f38521i != null) {
            ArrayList arrayList = new ArrayList();
            CLPermissionInfo cLPermissionInfo = new CLPermissionInfo(null, 0, 3, null);
            cLPermissionInfo.setName("android.permission.READ_CONTACTS");
            if (PermissionUtils.isGranted("android.permission.READ_CONTACTS")) {
                cLPermissionInfo.setState(1);
            } else {
                cLPermissionInfo.setState(3);
            }
            arrayList.add(cLPermissionInfo);
            CLPermissionInfo cLPermissionInfo2 = new CLPermissionInfo(null, 0, 3, null);
            cLPermissionInfo2.setName("android.permission.READ_PHONE_STATE");
            if (PermissionUtils.isGranted("android.permission.READ_PHONE_STATE")) {
                cLPermissionInfo2.setState(1);
            } else {
                cLPermissionInfo2.setState(3);
            }
            arrayList.add(cLPermissionInfo2);
            PermissionReq permissionReq = new PermissionReq("flexi cash", "trade", Long.valueOf(System.currentTimeMillis()), Long.valueOf(System.currentTimeMillis()), arrayList);
            p221ob.c.f40268a.getInstance().getClass();
            p221ob.c.a().uploadPermissionResult(permissionReq).k(f.f42629b).i(b.a()).subscribe(new e(this, 7));
        }
        if (PermissionUtils.isGranted(com.transsnet.palmpay.core.config.d.j()) || PermissionUtils.isGranted("android.permission.ACCESS_COARSE_LOCATION")) {
            LocationRecord locationRecordF = p367ya.a.d().f();
            if (locationRecordF != null) {
                latitude = locationRecordF.getLatitude();
                longitude = locationRecordF.getLongitude();
            } else {
                latitude = 9999.0d;
                longitude = 9999.0d;
            }
            OcLocationInfoReq ocLocationInfoReq = new OcLocationInfoReq(Double.valueOf(latitude), Double.valueOf(longitude), null, null, "flexi cash", "trade", 12, null);
            p221ob.c.f40268a.getInstance().getClass();
            p221ob.c.a().uploadLocationInfo(ocLocationInfoReq).k(f.f42629b).i(b.a()).subscribe(new e(this, 6));
        }
        UploadDeviceInfoReq.DeviceInfoBean ocDeviceInfo = Fb.d.f2639a.getOcDeviceInfo(this.f38516d, "flexi cash", "trade");
        p221ob.a aVar = p221ob.c.f40268a;
        aVar.getInstance().getClass();
        df.d<CommonResult> dVarUploadDeviceInfoNew = p221ob.c.a().uploadDeviceInfoNew(ocDeviceInfo);
        i iVar = f.f42629b;
        dVarUploadDeviceInfoNew.k(iVar).i(b.a()).subscribe(new e(this, 5));
        if (PermissionUtils.isGranted("android.permission.CAMERA")) {
            IApiCreditService iApiCreditServiceH = G.h(aVar);
            OcCameraInfoBean ocCameraInfo = CameraUtils.getOcCameraInfo(BaseApplication.get());
            Intrinsics.checkNotNullExpressionValue(ocCameraInfo, "getOcCameraInfo(...)");
            iApiCreditServiceH.uploadCameraInfo(ocCameraInfo).k(iVar).i(b.a()).subscribe(new e(this, 4));
        }
        String str = TextUtils.isEmpty(this.f38516d) ? "" : this.f38516d;
        this.f38516d = str;
        Ga.b bVar = Ga.c.f3194a;
        Intrinsics.e(str);
        bVar.upload(str, "4", "flexi cash");
        BaseFragment baseFragment = this.f38521i;
        if (baseFragment != null && (eRequireActivity = baseFragment.requireActivity()) != null) {
            CollectDeviceInfoService.a.enqueueWork$default(CollectDeviceInfoService.f27401o, eRequireActivity, true, false, true, false, this.f38516d, "flexi cash", "trade", 4, null);
        }
        h();
    }
}
