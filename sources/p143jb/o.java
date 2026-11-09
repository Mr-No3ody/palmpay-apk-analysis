package p143jb;

import C0.G;
import F6.d;
import L6.i;
import N8.C0475t;
import Pa.C0525w;
import Pa.E;
import Pa.T;
import Pa.Y;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Ya.g;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import androidx.emoji2.text.j;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.transsnet.palmpay.account.bean.ResetPinVerifyTypeRsp;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.bean.JumpLinkInfo;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.req.UploadDeviceInfoReq;
import com.transsnet.palmpay.core.bean.rsp.AllAuthInfoRsp;
import com.transsnet.palmpay.credit.bean.CreditProcessInfo;
import com.transsnet.palmpay.credit.bean.RoutePageType;
import com.transsnet.palmpay.credit.bean.RouterNodeInfo;
import com.transsnet.palmpay.credit.bean.RouterPageInfo;
import com.transsnet.palmpay.credit.bean.RouterPageInfoParams;
import com.transsnet.palmpay.credit.bean.req.CLInitReq;
import com.transsnet.palmpay.credit.bean.req.CLOpenAccountReq;
import com.transsnet.palmpay.credit.bean.req.DoubleSignReq;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.bean.req.OcRouterDetail;
import com.transsnet.palmpay.credit.bean.req.OcRouterReq;
import com.transsnet.palmpay.credit.bean.resp.CLOpenAccountData;
import com.transsnet.palmpay.credit.bean.resp.OcInstallmentRaiseAmountRsp;
import com.transsnet.palmpay.credit.bean.resp.OcSignStatusResp;
import com.transsnet.palmpay.credit.ui.fragment.LoanCreditFragment;
import com.transsnet.palmpay.custom_view.dialog.LoadingDialog;
import com.transsnet.palmpay.ui.activity.HomeActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.ToastUtils;
import com.transsnet.palmpay.util.Utils;
import face.security.device.api.FaceSecDevice;
import face.security.device.api.FaceSecToken;
import io.reactivex.internal.operators.observable.C1759k;
import io.reactivex.internal.operators.observable.C1765q;
import io.reactivex.internal.operators.observable.K;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p071ef.b;
import p141j9.C1794b;
import p147jf.a;
import p298tf.f;
import p355xf.C2131j;
import p355xf.p;
import p355xf.q;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final o f38540A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String[] f38541B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final j f38542z = new j(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f38543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f38544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CreditProcessInfo f38545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f38546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f38547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f38548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f38549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f38550h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f38551i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f38552j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f38553k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f38554l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f38555m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Boolean f38556n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Boolean f38557o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f38558p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f38559q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f38560r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f38561s;
    public boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public LoadingDialog f38562u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f38563v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f38564w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f38565x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f38566y;

    static {
        o oVar = k.f38531a;
        f38540A = k.f38531a;
        f38541B = new String[]{"FB_OPEN_ACCOUNT_NOT_ALLOW", "FB_OPEN_ACCOUNT_NOT_ALLOW_PP", "FB_OPEN_ACCOUNT_NOT_ALLOW_PP_EXIST"};
    }

    public o() {
        c.b().j(this);
        this.f38543a = C2131j.b(new com.transsnet.palmpay.managemoney.ui.view.c(26));
        this.f38548f = 0;
        this.f38549g = -1;
        this.f38555m = -1;
        Boolean bool = Boolean.FALSE;
        this.f38556n = bool;
        this.f38557o = bool;
        this.f38558p = -1;
    }

    public static final void a(o oVar, CLOpenAccountData cLOpenAccountData, Boolean bool) {
        oVar.f38563v = true;
        d.h("CreditRouterManager", 3, "gotoApplyResultPage >>> data=" + cLOpenAccountData + ", raiseAmount=" + bool);
        Integer num = oVar.f38549g;
        if (num != null && num.intValue() == 1) {
            com.palmpay.lib.apm.launchcounter.util.d.x(null, "CreditBindSuccess");
            return;
        }
        if (!Intrinsics.c(oVar.f38553k, "PALMPAY_CARD")) {
            Bundle bundle = new Bundle();
            bundle.putString("creditApplyId", oVar.f38547e);
            bundle.putString("loanProduct", oVar.f38553k);
            bundle.putString("submitData", ((Gson) C0525w.f().f7166b).toJson(cLOpenAccountData));
            bundle.putString("raiseAmountData", ((Gson) C0525w.f().f7166b).toJson(cLOpenAccountData));
            bundle.putString("successUrl", oVar.f38560r);
            bundle.putString("errorUrl", oVar.f38559q);
            bundle.putString("pendingUrl", oVar.f38561s);
            bundle.putBoolean("raiseAmount", bool.booleanValue());
            com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanCreditResult");
            return;
        }
        d.h("CreditRouterManager", 3, G.o("gotoApplyResultPage >>> pendingUrl=", oVar.f38561s));
        if (TextUtils.isEmpty(oVar.f38547e) || TextUtils.isEmpty(oVar.f38561s)) {
            ToastUtils.showLong(G.p("Service error, applyId=", oVar.f38547e, ", pendingUrl=", oVar.f38561s), new Object[0]);
            return;
        }
        i0.c0(com.transsnet.palmpay.core.config.d.g(oVar.f38561s) + "&applyId=" + oVar.f38547e);
        d();
    }

    public static final void b(o oVar, String str) {
        oVar.getClass();
        d.h("CreditRouterManager", 3, "showBusinessFailedDialog >>>");
        Activity topActivity = ActivityUtils.getTopActivity();
        if (topActivity == null) {
            return;
        }
        O6.c cVar = new O6.c(topActivity);
        cVar.f6615v = i.ppFlexiCashDialogTheme;
        cVar.f6607m = Ya.d.cs_cl_failed;
        cVar.f6598d = str;
        cVar.f6600f = topActivity.getString(g.cs_confirm);
        cVar.f6602h = null;
        cVar.a().show();
    }

    public static void d() {
        Object objF;
        d.h("CreditRouterManager", 3, "closeAllRoutePage >>>");
        try {
            p355xf.o oVar = q.f43977a;
            HomeActivity.a aVar = HomeActivity.f34463H;
            LinkedList<Activity> activityList = Utils.getActivityList();
            Intrinsics.checkNotNullExpressionValue(activityList, "getActivityList(...)");
            int size = activityList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i7 = size - 1;
                    Activity activity = activityList.get(size);
                    if (activity.getClass().equals(HomeActivity.class)) {
                        return;
                    }
                    ActivityUtils.finishActivity(activity, true);
                    if (i7 < 0) {
                        break;
                    } else {
                        size = i7;
                    }
                }
            }
            objF = Unit.f38893a;
        } catch (Throwable th) {
            p355xf.o oVar2 = q.f43977a;
            objF = androidx.camera.core.impl.utils.executor.g.f(th);
        }
        Throwable thA = q.a(objF);
        if (thA != null) {
            d.c("CreditRouterManager", thA);
        }
    }

    public static int g() {
        Context context = BaseApplication.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            PackageManager packageManager = context.getPackageManager();
            List<PackageInfo> installedPackages = packageManager != null ? packageManager.getInstalledPackages(0) : null;
            List<PackageInfo> list = installedPackages;
            if (list != null && !list.isEmpty()) {
                return installedPackages.size();
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    public static int h() {
        String string = SPUtils.get().getString("credit_bind_times");
        Intrinsics.e(string);
        if (StringsKt.A(string, "_", false)) {
            return E.b(TextUtils.split(string, "_")[1]);
        }
        return 0;
    }

    public static df.d u(String str, String str2, String str3) {
        StringBuilder sbF = F.f("routerListObservable >>> ", str, ", ", str2, ", ");
        sbF.append(str3);
        d.h("CreditRouterManager", 3, sbF.toString());
        return G.h(p221ob.c.f40268a).getRouterList(new OcRouterReq(null, str, 0, null, Boolean.valueOf(TextUtils.equals(str, "CASH_INSTALLMENT_RAISE_AMOUNT")), str2, str3, 13, null));
    }

    public static void z(o oVar, LoanCreditFragment loanCreditFragment, String str, String str2, int i7, String str3, int i10) {
        df.d dVarU;
        String str4;
        String str5;
        String str6 = (i10 & 2) != 0 ? "OTHER" : str;
        int i11 = (i10 & 8) != 0 ? -1 : i7;
        String str7 = (i10 & 16) != 0 ? null : str3;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(loanCreditFragment, "loanCreditFragment");
        d.h("CreditRouterManager", 3, "startApply >>> product=" + str2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j6 = oVar.f38564w;
        boolean z3 = j6 > 0 && jCurrentTimeMillis - j6 < 1500;
        if (Intrinsics.c(str2, oVar.f38553k) && z3) {
            d.h("CreditRouterManager", 5, "startApply >>> intercept repeat apply");
            return;
        }
        oVar.f38564w = jCurrentTimeMillis;
        oVar.f38544b = new WeakReference(loanCreditFragment);
        oVar.f38555m = -1;
        oVar.f38552j = str6;
        oVar.f38558p = i11;
        oVar.f38553k = str2;
        oVar.f38547e = str7;
        oVar.t = false;
        oVar.f38563v = false;
        oVar.f38557o = Boolean.FALSE;
        oVar.f38546d = null;
        oVar.f38545c = null;
        oVar.f38565x = null;
        oVar.f38566y = null;
        d.h("CreditRouterManager", 3, "queryBusinessConfig >>>");
        if (TextUtils.isEmpty(oVar.f38547e)) {
            if (TextUtils.equals(oVar.f38553k, "LOAN_WITHDRAW")) {
                str5 = null;
            } else {
                try {
                    FaceSecToken deviceToken = FaceSecDevice.getInstance().getDeviceToken();
                    if (deviceToken == null || 10000 != deviceToken.code || (str4 = deviceToken.token) == null || str4.length() <= 0) {
                        str4 = null;
                    }
                } catch (Exception unused) {
                }
                str5 = str4;
            }
            dVarU = new C1759k(G.h(p221ob.c.f40268a).clInitApply(new CLInitReq(oVar.f38552j, oVar.f38553k, 2, null, null, str5, 24, null)).i(b.a()), new C1794b(new h(oVar, 0), 5), a.f38600d, a.f38599c).i(f.f42629b).f(new C1794b(new h(oVar, 1), 6));
        } else {
            dVarU = u(oVar.f38553k, oVar.f38552j, oVar.f38547e);
        }
        dVarU.getClass();
        df.i iVar = f.f42629b;
        C1765q c1765qI = new K(dVarU.k(iVar), iVar, 1).i(b.a());
        WeakReference weakReference = oVar.f38544b;
        if (weakReference != null) {
            c1765qI.c(new Y(new WeakReference((BaseFragment) weakReference.get()), 0)).subscribe(new l(oVar, 3));
        } else {
            Intrinsics.n("mLoanCreditFragmentRef");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Code duplicated, block: B:22:0x0077  */
    /* JADX WARN: Code duplicated, block: B:25:0x0080  */
    /* JADX WARN: Code duplicated, block: B:26:0x0085  */
    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    public final void A(Integer num, String str) {
        Object objD;
        int iE;
        StringBuilder sb2;
        OcRouterDetail ocRouterDetail;
        Integer routeId;
        OcRouterDetail ocRouterDetail2;
        Integer routeId2;
        d.h("CreditRouterManager", 3, "toNewBvnPage >>> curRouteId=" + num + ", routePath=" + str);
        try {
            p355xf.o oVar = q.f43977a;
            C0525w c0525wF = C0525w.f();
            String str2 = this.f38565x;
            try {
                c0525wF.getClass();
                objD = C0525w.d(str2, RouterNodeInfo.class);
                try {
                    Unit unit = Unit.f38893a;
                } catch (Throwable th) {
                    th = th;
                    p355xf.o oVar2 = q.f43977a;
                    androidx.camera.core.impl.utils.executor.g.f(th);
                }
            } catch (Throwable th2) {
                th = th2;
                objD = null;
                p355xf.o oVar3 = q.f43977a;
                androidx.camera.core.impl.utils.executor.g.f(th);
                if (objD == null) {
                    d.c("CreditRouterManager", "toNewBvnPage >>> routerNode is null");
                    ToastUtils.showLong("Sorry, the service is unavailable now (code-3)", new Object[0]);
                    return;
                }
                iE = StringsKt.E(str, "?", 0, false, 6);
                sb2 = new StringBuilder(str);
                if (iE != -1) {
                    String strSubstring = str.substring(iE);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    sb2.append(strSubstring);
                    sb2.append("&");
                } else {
                    sb2.append("?");
                }
                RouterNodeInfo routerNodeInfo = (RouterNodeInfo) objD;
                ocRouterDetail = routerNodeInfo.current;
                if (ocRouterDetail != null) {
                    routeId = ocRouterDetail.getRouteId();
                } else {
                    routeId = null;
                }
                sb2.append("current=" + routeId);
                ocRouterDetail2 = routerNodeInfo.prev;
                if (ocRouterDetail2 != null) {
                    routeId2 = ocRouterDetail2.getRouteId();
                } else {
                    routeId2 = null;
                }
                sb2.append("&prev=" + routeId2);
                OcRouterDetail ocRouterDetail3 = routerNodeInfo.next;
                sb2.append("&next=" + (ocRouterDetail3 != null ? ocRouterDetail3.getRouteId() : null));
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                d.h("CreditRouterManager", 3, G.o("toNewBvnPage >>> targetBvnUrl=", string));
                y(num, "/account/upgrade", string);
            }
        } catch (Throwable th3) {
            th = th3;
        }
        if (objD == null) {
            d.c("CreditRouterManager", "toNewBvnPage >>> routerNode is null");
            ToastUtils.showLong("Sorry, the service is unavailable now (code-3)", new Object[0]);
            return;
        }
        iE = StringsKt.E(str, "?", 0, false, 6);
        sb2 = new StringBuilder(str);
        if (iE != -1) {
            String strSubstring2 = str.substring(iE);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            sb2.append(strSubstring2);
            sb2.append("&");
        } else {
            sb2.append("?");
        }
        RouterNodeInfo routerNodeInfo2 = (RouterNodeInfo) objD;
        ocRouterDetail = routerNodeInfo2.current;
        if (ocRouterDetail != null) {
            routeId = ocRouterDetail.getRouteId();
        } else {
            routeId = null;
        }
        sb2.append("current=" + routeId);
        ocRouterDetail2 = routerNodeInfo2.prev;
        if (ocRouterDetail2 != null) {
            routeId2 = ocRouterDetail2.getRouteId();
        } else {
            routeId2 = null;
        }
        sb2.append("&prev=" + routeId2);
        OcRouterDetail ocRouterDetail4 = routerNodeInfo2.next;
        if (ocRouterDetail4 != null) {
        }
        sb2.append("&next=" + (ocRouterDetail4 != null ? ocRouterDetail4.getRouteId() : null));
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        d.h("CreditRouterManager", 3, G.o("toNewBvnPage >>> targetBvnUrl=", string2));
        y(num, "/account/upgrade", string2);
    }

    public final void B() {
        int i7 = this.f38555m - 1;
        this.f38555m = i7;
        d.h("CreditRouterManager", 3, G.m(i7, "当前路由索引为 >>> "));
        p171lb.f eVar = p171lb.f.f39304e.getInstance();
        CreditProcessInfo creditProcessInfo = this.f38545c;
        if (creditProcessInfo != null) {
            creditProcessInfo.currentIndex = this.f38555m;
        } else {
            creditProcessInfo = null;
        }
        eVar.f39308c = creditProcessInfo;
    }

    public final void C(int i7) {
        this.f38555m = i7;
        d.h("CreditRouterManager", 5, G.m(i7, "当前路由索引为 <<< "));
        p171lb.f eVar = p171lb.f.f39304e.getInstance();
        CreditProcessInfo creditProcessInfo = this.f38545c;
        if (creditProcessInfo != null) {
            creditProcessInfo.currentIndex = i7;
        } else {
            creditProcessInfo = null;
        }
        eVar.f39308c = creditProcessInfo;
    }

    public final void D() {
        E();
        UploadDeviceInfoReq.DeviceInfoBean ocDeviceInfo = Fb.d.f2639a.getOcDeviceInfo(this.f38547e, TextUtils.equals(this.f38553k, "OK_CARD") ? "flexi" : "flexi cash", TextUtils.equals(this.f38553k, "LOAN_WITHDRAW") ? "trade" : "credit");
        p221ob.c.f40268a.getInstance().getClass();
        p221ob.c.a().uploadDeviceInfoNew(ocDeviceInfo).k(f.f42629b).i(b.a()).subscribe(new C0475t(3));
        String str = TextUtils.isEmpty(this.f38547e) ? "" : this.f38547e;
        this.f38547e = str;
        Ga.b bVar = Ga.c.f3194a;
        Intrinsics.e(str);
        bVar.upload(str, "4", "flexi cash");
        String str2 = this.f38547e;
        String str3 = TextUtils.equals(this.f38553k, "OK_CARD") ? "flexi" : "flexi cash";
        String str4 = TextUtils.equals(this.f38553k, "LOAN_WITHDRAW") ? "trade" : "credit";
        if (BaseApplication.hasLogin()) {
            T.b(-4).execute(new j(str2, 25, str3, str4));
        }
    }

    public final void E() {
        d.h("CreditRouterManager", 3, "uploadLocationInfo >>> mUploadLocation = " + this.f38557o);
        LocationRecord locationRecordF = p367ya.a.d().f();
        if (!Intrinsics.c(this.f38557o, Boolean.FALSE) || locationRecordF == null) {
            return;
        }
        this.f38557o = Boolean.TRUE;
        u.a(this.f38547e, TextUtils.equals(this.f38553k, "OK_CARD") ? "flexi" : "flexi cash", TextUtils.equals(this.f38553k, "LOAN_WITHDRAW") ? "trade" : "credit");
    }

    public final void c() {
        d.h("CreditRouterManager", 3, G.o("applySubmit >>> loanProduct=", this.f38553k));
        if (q()) {
            d.h("CreditRouterManager", 3, G.o("submitDirectly >>> loanProduct=", this.f38553k));
            Activity topActivity = ActivityUtils.getTopActivity();
            if (ActivityUtils.isValidActivityContext(topActivity) && topActivity != null) {
                topActivity.runOnUiThread(new com.flexibank.sdk.g(22, this, topActivity));
            }
            G.h(p221ob.c.f40268a).openCashLoan(new CLOpenAccountReq(this.f38552j, this.f38547e, null, Integer.valueOf(g()), false, false, this.f38554l, null, null, null, null, null, null, null, null, this.f38553k, 32692, null)).k(f.f42629b).i(b.a()).subscribe(new l(this, 4));
            return;
        }
        Activity topActivity2 = ActivityUtils.getTopActivity();
        if (ActivityUtils.isValidActivityContext(topActivity2) && topActivity2 != null) {
            topActivity2.runOnUiThread(new com.flexibank.sdk.g(22, this, topActivity2));
        }
        df.d<OcSignStatusResp> dVarQuerySignStatus = G.h(p221ob.c.f40268a).querySignStatus(new DoubleSignReq(this.f38553k));
        dVarQuerySignStatus.getClass();
        df.i iVar = f.f42629b;
        new K(dVarQuerySignStatus.k(iVar), iVar, 1).i(b.a()).f(new C1794b(new h(this, 2), 7)).i(b.a()).subscribe(new l(this, 0));
    }

    public final void e(JumpLinkInfo jumpLinkInfo) {
        String str;
        Integer num = this.f38550h;
        String str2 = this.f38553k;
        String str3 = this.f38551i;
        String str4 = jumpLinkInfo != null ? jumpLinkInfo.jumpPath : null;
        String str5 = jumpLinkInfo != null ? jumpLinkInfo.androidLink : null;
        StringBuilder sb2 = new StringBuilder("completeBorrowTrialNavigation >>> mAccountType=");
        sb2.append(num);
        sb2.append(", loanProduct=");
        sb2.append(str2);
        sb2.append(", borrowRoutePath=");
        u.x(sb2, str3, ", jumpLinkInfo.jumpPath=", str4, ", jumpLinkInfo.androidLink=");
        sb2.append(str5);
        d.h("CreditRouterManager", 3, sb2.toString());
        this.f38563v = true;
        String str6 = this.f38551i;
        Integer num2 = this.f38550h;
        String str7 = this.f38553k;
        String str8 = jumpLinkInfo != null ? jumpLinkInfo.jumpPath : null;
        String str9 = jumpLinkInfo != null ? jumpLinkInfo.androidLink : null;
        StringBuilder sb3 = new StringBuilder("navigate enter >>> borrowRoutePath=");
        sb3.append(str6);
        sb3.append(", accountType=");
        sb3.append(num2);
        sb3.append(", loanProduct=");
        u.x(sb3, str7, ", jumpPath=", str8, ", androidLink=");
        sb3.append(str9);
        d.h("BorrowTrialRouteNavigator", 3, sb3.toString());
        String string = str6 != null ? StringsKt.V(str6).toString() : null;
        if (string == null) {
            string = "";
        }
        int iIntValue = 7;
        if (string.length() <= 0) {
            if (jumpLinkInfo == null) {
                d.h("BorrowTrialRouteNavigator", 3, "navigate mode=DEFAULT_BORROW_HOME");
                iIntValue = num2 != null ? num2.intValue() : 7;
                d.h("BorrowTrialRouteNavigator", 3, G.m(iIntValue, "navigateDefaultBorrowHome >>> RouterManager.goToRnPage module=LoanBorrowFlexiLoan, accountType="));
                Bundle bundle = new Bundle();
                bundle.putInt("accountType", iIntValue);
                com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanBorrowFlexiLoan");
                return;
            }
            d.h("BorrowTrialRouteNavigator", 3, F.d(F.f("navigate mode=JUMP_LINK_INFO jumpPath=", jumpLinkInfo.jumpPath, ", jumpType=", jumpLinkInfo.jumpType, ", jumpParams="), jumpLinkInfo.jumpParams, ", androidLink=", jumpLinkInfo.androidLink));
            if (TextUtils.isEmpty(jumpLinkInfo.jumpPath)) {
                d.h("BorrowTrialRouteNavigator", 3, G.o("navigateByJumpLinkInfo >>> PageRouteUtil.gotoPage(androidLink)=", jumpLinkInfo.androidLink));
                Pa.F.g(BaseApplication.getContext(), jumpLinkInfo.androidLink);
                return;
            }
            String str10 = jumpLinkInfo.jumpPath;
            String str11 = jumpLinkInfo.jumpType;
            String str12 = jumpLinkInfo.jumpParams;
            StringBuilder sbF = F.f("navigateByJumpLinkInfo >>> PageRouteUtil.gotoPage jumpPath=", str10, ", jumpType=", str11, ", jumpParams=");
            sbF.append(str12);
            d.h("BorrowTrialRouteNavigator", 3, sbF.toString());
            Pa.F.f(jumpLinkInfo.jumpPath, jumpLinkInfo.jumpType, jumpLinkInfo.jumpParams);
            return;
        }
        d.h("BorrowTrialRouteNavigator", 3, "navigate mode=ROUTE_PATH path=".concat(string));
        if (y.m(string, "arouter://", true) || y.m(string, "palmpay://", true)) {
            d.h("BorrowTrialRouteNavigator", 3, "navigateByRoutePath >>> PageRouteUtil.gotoPage(fullScheme) path=".concat(string));
            Pa.F.g(BaseApplication.getContext(), string);
            return;
        }
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else if (str7 != null) {
            int iHashCode = str7.hashCode();
            if (iHashCode == -722072964) {
                str = "CASH_LOAN";
            } else if (iHashCode == 172275258) {
                str = "CASH_INSTANT_LOAN";
            } else if (iHashCode == 709418006 && str7.equals("INSTALLMENT_LOAN")) {
                iIntValue = 9;
            }
            str7.equals(str);
        }
        d.h("BorrowTrialRouteNavigator", 3, "navigateByRoutePath >>> RouterManager.goToRnPage module=" + string + " (strict) accountType=" + iIntValue + ", preCheckAccountType=" + num2);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("accountType", iIntValue);
        com.palmpay.lib.apm.launchcounter.util.d.x(bundle2, string);
    }

    public final void f() {
        d.h("CreditRouterManager", 3, G.o("doRouterPre >>> routeNodeInfo=", this.f38565x));
        if (this.f38563v) {
            return;
        }
        r0.O1("NoticeCreditRoutePrevious", this.f38565x, null);
    }

    public final p103gf.a i() {
        return (p103gf.a) this.f38543a.getValue();
    }

    public final int j(Integer num, boolean z3) {
        d.h("CreditRouterManager", 3, "getCurRouteIndex >>> routeId=" + num);
        List list = this.f38546d;
        if (list == null) {
            return -1;
        }
        int i7 = 0;
        for (Object obj : list) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                C1850q.k();
                throw null;
            }
            OcRouterDetail ocRouterDetail = (OcRouterDetail) obj;
            if (num.equals(ocRouterDetail != null ? ocRouterDetail.getRouteId() : null)) {
                return (z3 && n()) ? i7 - 1 : i7;
            }
            i7 = i10;
        }
        return -1;
    }

    public final String k(Integer num) {
        OcRouterDetail ocRouterDetail;
        Object next;
        OcRouterDetail ocRouterDetail2;
        d.h("CreditRouterManager", 3, "getRoutePathById >>> routeId=" + num);
        List list = this.f38546d;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ocRouterDetail2 = (OcRouterDetail) next;
            } while (!Intrinsics.c(ocRouterDetail2 != null ? ocRouterDetail2.getRouteId() : null, num));
            ocRouterDetail = (OcRouterDetail) next;
        } else {
            ocRouterDetail = null;
        }
        if (ocRouterDetail != null) {
            return ocRouterDetail.getRoutePath();
        }
        return null;
    }

    public final void l(Integer num, String str) {
        d.h("CreditRouterManager", 3, G.o("getVerifyInfo >>> routerPath = ", str));
        p221ob.c.f40268a.getInstance().getClass();
        df.d<AllAuthInfoRsp> dVarQueryAllVerifyInfo = p221ob.c.a().queryAllVerifyInfo();
        dVarQueryAllVerifyInfo.getClass();
        df.i iVar = f.f42629b;
        new K(dVarQueryAllVerifyInfo.k(iVar), iVar, 1).i(b.a()).subscribe(new m(this, str, num));
    }

    public final void m(List list) throws JSONException {
        d.h("CreditRouterManager", 3, "handleRouterList >>>");
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            if (TextUtils.equals(this.f38553k, "LOAN_WITHDRAW")) {
                e(null);
                return;
            } else {
                c();
                return;
            }
        }
        OcRouterDetail ocRouterDetail = (OcRouterDetail) list.get(0);
        if (!TextUtils.equals("oc_permission_router", ocRouterDetail != null ? ocRouterDetail.getRoutePath() : null)) {
            x();
            return;
        }
        d.h("CreditRouterManager", 3, "handleRouterList >>> checkPermission");
        WeakReference weakReference = this.f38544b;
        if (weakReference == null) {
            Intrinsics.n("mLoanCreditFragmentRef");
            throw null;
        }
        LoanCreditFragment loanCreditFragment = (LoanCreditFragment) weakReference.get();
        if (loanCreditFragment != null) {
            loanCreditFragment.checkPermission(Boolean.FALSE);
        }
    }

    public final boolean n() {
        OcRouterDetail ocRouterDetail;
        List list = this.f38546d;
        return TextUtils.equals("oc_permission_router", (list == null || (ocRouterDetail = (OcRouterDetail) list.get(0)) == null) ? null : ocRouterDetail.getRoutePath());
    }

    public final void o() {
        try {
            p355xf.o oVar = q.f43977a;
            LoadingDialog loadingDialog = this.f38562u;
            if (loadingDialog != null) {
                loadingDialog.dismiss();
            }
            this.f38562u = null;
            Unit unit = Unit.f38893a;
        } catch (Throwable th) {
            p355xf.o oVar2 = q.f43977a;
            androidx.camera.core.impl.utils.executor.g.f(th);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        d.h("CreditRouterManager", 3, G.m(event.getEventType(), "onMessageEvent = "));
        int eventType = event.getEventType();
        if (eventType != 9) {
            if (eventType == 275) {
                if (TextUtils.equals(event.getEventContent(), "1")) {
                    v(this.f38555m);
                    return;
                }
                return;
            }
            if (eventType == 338) {
                E();
                return;
            }
            if (eventType == 547) {
                this.t = true;
                d.h("CreditRouterManager", 3, "mBvnVerified >>> success");
                v(this.f38555m);
                return;
            }
            if (eventType == 553) {
                String eventContent = event.getEventContent();
                d.h("CreditRouterManager", 3, G.o("exitRNRouterPage >>> moduleName=", eventContent));
                RouterPageInfo routerPageInfoR = r(null, eventContent);
                if (q() && routerPageInfoR != null) {
                    Integer type = routerPageInfoR.getType();
                    int code = RoutePageType.RN.getCode();
                    if (type != null && type.intValue() == code) {
                        d.h("CreditRouterManager", 5, G.o("exitRNRouterPage >>> isDynamicRnRoute, routePath=", routerPageInfoR.getName()));
                        f();
                        return;
                    }
                }
                if (eventContent != null) {
                    switch (eventContent.hashCode()) {
                        case -1946423768:
                            if (!eventContent.equals("OneLoopAct")) {
                                return;
                            }
                            break;
                        case -1940115216:
                            if (!eventContent.equals("LoanContact")) {
                                return;
                            }
                            break;
                        case -1795015132:
                            if (!eventContent.equals("BankAuth")) {
                                return;
                            }
                            break;
                        case -799331766:
                            if (!eventContent.equals("PersonalInfoV2")) {
                                return;
                            }
                            break;
                        case -529257026:
                            if (!eventContent.equals("LoanBusinessInfo")) {
                                return;
                            }
                            break;
                        case -89238938:
                            if (!eventContent.equals("LoanFaceVerify")) {
                                return;
                            }
                            break;
                        case 66170:
                            if (!eventContent.equals(ResetPinVerifyTypeRsp.VERIFY_TYPE_BVN)) {
                                return;
                            }
                            break;
                        case 81875706:
                            if (!eventContent.equals("LoanOneLoop")) {
                                return;
                            }
                            break;
                        case 145310476:
                            if (!eventContent.equals("LoanExpectation")) {
                                return;
                            }
                            break;
                        case 153113497:
                            if (!eventContent.equals("LoanOpayReverse")) {
                                return;
                            }
                            break;
                        case 394850388:
                            if (!eventContent.equals("LoanOtpVerify")) {
                                return;
                            }
                            break;
                        case 506204766:
                            if (!eventContent.equals("LoanKycVerify")) {
                                return;
                            }
                            break;
                        case 1139782660:
                            if (!eventContent.equals("LoanKycHome")) {
                                return;
                            }
                            break;
                        case 1455620908:
                            if (!eventContent.equals("LoanBusinessExpectation")) {
                                return;
                            }
                            break;
                        case 1708626607:
                            if (!eventContent.equals("ContactPage")) {
                                return;
                            }
                            break;
                        default:
                            return;
                    }
                    if (q()) {
                        f();
                        return;
                    } else {
                        B();
                        return;
                    }
                }
                return;
            }
            if (eventType != 560) {
                if (eventType == 566) {
                    if (TextUtils.equals(event.getEventContent(), "1")) {
                        t(this.f38555m);
                        return;
                    }
                    return;
                } else {
                    if (eventType != 568) {
                        return;
                    }
                    if (Intrinsics.c(event.getEventObj(), 200) && this.t) {
                        d.h("CreditRouterManager", 5, "mBvnVerified >>> no exit");
                        return;
                    } else {
                        t(this.f38555m);
                        return;
                    }
                }
            }
        }
        d.h("CreditRouterManager", 3, G.m(event.getEventType(), "onMessageEvent routeNext= "));
        v(this.f38555m);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:171:0x0363  */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02b7, code lost:
    
        if (r6.equals("/coreImpl/use_new_card") == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0311, code lost:
    
        if (r6.equals("/credit_score/oc_all_verify_activity") == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0314, code lost:
    
        l(r17.getRouteId(), r17.getRoutePath());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0141, code lost:
    
        if (r6.equals("/coreImpl/add_new_card") == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016b, code lost:
    
        if (r6.equals("/coreImpl/bind_new_bank_account") == false) goto L158;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(com.transsnet.palmpay.credit.bean.req.OcRouterDetail r17) {
        /*
            Method dump skipped, instruction units count: 1132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p143jb.o.p(com.transsnet.palmpay.credit.bean.req.OcRouterDetail):void");
    }

    public final boolean q() {
        return Intrinsics.c(this.f38553k, "PALMPAY_BUSINESS_LOAN");
    }

    public final RouterPageInfo r(Integer num, String str) {
        Object objF;
        Object next;
        Object next2;
        d.h("CreditRouterManager", 3, "isDynamicRnRoute >>> routeId=" + num + ", routePath=" + str);
        if (!TextUtils.isEmpty(this.f38566y)) {
            if (num == null && str == null) {
                d.c("CreditRouterManager", "isDynamicRnRoute >>> routeId and routePath are null");
                return null;
            }
            try {
                p355xf.o oVar = q.f43977a;
                Object objE = C0525w.f().e(this.f38566y, new TypeToken<List<? extends RouterPageInfo>>() { // from class: com.transsnet.palmpay.credit.hook.CreditRouterManager$isDynamicRnRoute$1$listType$1
                }.getType());
                Intrinsics.checkNotNullExpressionValue(objE, "fromJson(...)");
                List list = (List) objE;
                if (!list.isEmpty()) {
                    if (num != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            next2 = it.next();
                            RouterPageInfoParams params = ((RouterPageInfo) next2).getParams();
                            if (Intrinsics.c(params != null ? params.routeId : null, num)) {
                                return (RouterPageInfo) next2;
                            }
                        }
                        next2 = null;
                        return (RouterPageInfo) next2;
                    }
                    if (str != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            next = it2.next();
                            String name = ((RouterPageInfo) next).getName();
                            if (name != null && StringsKt.A(name, str, false)) {
                                return (RouterPageInfo) next;
                            }
                        }
                        next = null;
                        return (RouterPageInfo) next;
                    }
                    objF = Unit.f38893a;
                    Throwable thA = q.a(objF);
                    if (thA != null) {
                        d.c("CreditRouterManager", "isDynamicRnRoute >>> error , " + thA);
                    }
                }
            } catch (Throwable th) {
                p355xf.o oVar2 = q.f43977a;
                objF = androidx.camera.core.impl.utils.executor.g.f(th);
            }
        }
        return null;
    }

    public final void s() {
        d.h("CreditRouterManager", 3, G.o("routerComplete >>> product = ", this.f38553k));
        if (Intrinsics.c(this.f38553k, "LOAN_WITHDRAW")) {
            if (this.f38558p == 1) {
                y(null, "/credit_score/cl_last_protocol_activity", null);
                return;
            } else {
                e(null);
                return;
            }
        }
        if (Intrinsics.c(this.f38553k, "OK_CARD")) {
            y(null, "/credit_score/oc_last_protocol_activity", null);
            return;
        }
        if (Intrinsics.c(this.f38553k, "CASH_LOAN") || Intrinsics.c(this.f38553k, "CASH_INSTANT_LOAN") || Intrinsics.c(this.f38553k, "INSTALLMENT_LOAN") || Intrinsics.c(this.f38553k, "PALMPAY_CARD") || Intrinsics.c(this.f38553k, "PALMPAY_BUSINESS_LOAN")) {
            c();
            return;
        }
        d.h("CreditRouterManager", 3, G.p("upgradeCashLoan, mApplyId = ", this.f38547e, ",  mProduct = ", this.f38553k));
        df.d<OcInstallmentRaiseAmountRsp> dVarInstallmentRaiseAmountV2 = G.h(p221ob.c.f40268a).installmentRaiseAmountV2(this.f38547e, null, this.f38553k);
        dVarInstallmentRaiseAmountV2.getClass();
        df.i iVar = f.f42629b;
        new K(dVarInstallmentRaiseAmountV2.k(iVar), iVar, 1).i(b.a()).subscribe(new l(this, 5));
    }

    public final void t(int i7) {
        d.h("CreditRouterManager", 3, G.m(i7, "routerExit >>> "));
        if (q()) {
            f();
            return;
        }
        int i10 = this.f38555m;
        if (i7 != i10) {
            d.h("CreditRouterManager", 3, u.h(i7, "角标校验 ", i10, " : "));
            return;
        }
        int i11 = i10 - 1;
        this.f38555m = i11;
        C(i11);
    }

    public final void v(int i7) {
        d.h("CreditRouterManager", 3, "routerNext >>>");
        if (q()) {
            d.h("CreditRouterManager", 3, G.o("doRouterNext >>> routeNodeInfo=", this.f38565x));
            if (this.f38563v) {
                return;
            }
            r0.O1("NoticeCreditRouteNext", this.f38565x, null);
            return;
        }
        boolean z3 = this.t;
        if (i7 != -1 && i7 != this.f38555m && z3) {
            d.h("CreditRouterManager", 4, "anyVerified, need fix route index");
            this.f38555m = i7;
        }
        int i10 = this.f38555m;
        if (i7 != i10) {
            d.h("CreditRouterManager", 3, u.h(i7, "角标校验 ", i10, " : "));
            ToastUtils.showLong("Sorry, the service is unavailable now (code-0)", new Object[0]);
            n0.g().r("CreditRouterManager_routerNext", kotlin.collections.G.g(new Pair("loanProduct", this.f38553k), new Pair("applyId", this.f38547e), new Pair("errorMsg", "curIndex != mCurrentIndex")));
            return;
        }
        int i11 = 1;
        if (i10 != -1) {
            i11 = 1 + i10;
        } else if (!n()) {
            i11 = 0;
        }
        C(i11);
        List list = this.f38546d;
        if (i11 >= (list != null ? list.size() : 0)) {
            s();
        } else if (i11 < 0) {
            ToastUtils.showLong("Sorry, the service is unavailable now (code-1)", new Object[0]);
            n0.g().r("CreditRouterManager_routerNext", kotlin.collections.G.g(new Pair("loanProduct", this.f38553k), new Pair("applyId", this.f38547e), new Pair("errorMsg", "nextRouteIndex < 0")));
        } else {
            List list2 = this.f38546d;
            p(list2 != null ? (OcRouterDetail) list2.get(i11) : null);
        }
    }

    public final void x() throws JSONException {
        d.h("CreditRouterManager", 3, "routerStart >>>");
        if (!q()) {
            v(this.f38555m);
            return;
        }
        p171lb.f.f39304e.getInstance().f39309d = this.f38545c;
        d.h("CreditRouterManager", 3, "doRouterStart >>> routerInfoList=" + this.f38546d);
        List list = this.f38546d;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                OcRouterDetail ocRouterDetail = (OcRouterDetail) obj;
                if (!Intrinsics.c(ocRouterDetail != null ? ocRouterDetail.getRoutePath() : null, "oc_permission_router")) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        }
        if (this.f38563v) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("applyId", this.f38547e);
        jSONObject.put("loanProduct", this.f38553k);
        jSONObject.put("customerTag", this.f38554l);
        jSONObject.put("bindCard", false);
        r0.O1("NoticeCreditRouteStart", ((Gson) C0525w.f().f7166b).toJson(arrayList), jSONObject.toString());
    }

    public final void y(Integer num, String str, String str2) {
        Object objF;
        d.h("CreditRouterManager", 3, "routerTarget, routeId=" + num + ", routerPath=" + str + ", url=" + str2);
        Activity topActivity = ActivityUtils.getTopActivity();
        if (topActivity == null) {
            return;
        }
        String json = ((Gson) C0525w.f().f7166b).toJson(new OcApplyData(this.f38552j, null, this.f38547e, null, this.f38549g, false, false, this.f38554l, this.f38553k, this.f38546d, null, 1130, null));
        try {
            p355xf.o oVar = q.f43977a;
            Uri uri = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
            Postcard postcardBuild = ARouter.getInstance().build(uri.getPath());
            Intrinsics.checkNotNullExpressionValue(postcardBuild, "build(...)");
            Postcard postcardH = Pa.F.h(postcardBuild, uri.getQuery());
            Intrinsics.checkNotNullExpressionValue(postcardH, "parseQueryString(...)");
            if (!TextUtils.isEmpty(str2)) {
                postcardH.withString("jump_url", str2);
            }
            if (TextUtils.equals(str, "/coreImpl/add_new_card")) {
                postcardH.withLong("business_type", 1L);
                postcardH.withBoolean("me_bind_bank_card", true);
            }
            Postcard postcardWithInt = postcardH.withString("applyId", this.f38547e).withInt("oc_current_router_index", this.f38555m).withString("oc_business_type", this.f38553k).withInt("key_need_sign_type", this.f38558p);
            Integer num2 = this.f38549g;
            postcardWithInt.withInt("oc_scene_type", num2 != null ? num2.intValue() : -1).withInt("oc_route_id", num != null ? num.intValue() : -1).withString("oc_apply_data", json).withString("ext_business_data", json).withString("businessType", this.f38553k).withString("jump_source", this.f38553k).withInt("extra_type", 1).navigation(topActivity, 1000);
            objF = Unit.f38893a;
        } catch (Throwable th) {
            p355xf.o oVar2 = q.f43977a;
            objF = androidx.camera.core.impl.utils.executor.g.f(th);
        }
        if (!(objF instanceof p)) {
            d.h("CreditRouterManager", 3, "routerTarget >>> success");
        }
        Throwable thA = q.a(objF);
        if (thA != null) {
            d.c("CreditRouterManager", G.o("routerTarget >>> failed, ", thA.getMessage()));
            this.f38555m--;
            ToastUtils.showLong(thA.getMessage(), new Object[0]);
        }
    }
}
