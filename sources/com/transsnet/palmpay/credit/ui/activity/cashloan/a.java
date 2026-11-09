package com.transsnet.palmpay.credit.ui.activity.cashloan;

import C0.G;
import Eb.g;
import Pa.C0525w;
import Pa.E;
import Za.b;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.app.AbstractC1032a;
import androidx.lifecycle.Observer;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.req.UploadDeviceInfoReq;
import com.transsnet.palmpay.core.config.d;
import com.transsnet.palmpay.core.service.CollectDeviceInfoService;
import com.transsnet.palmpay.credit.bean.LoanHomeSource;
import com.transsnet.palmpay.credit.bean.req.CLInitReq;
import com.transsnet.palmpay.credit.bean.req.CLPermissionInfo;
import com.transsnet.palmpay.credit.bean.req.DoubleSignReq;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.bean.req.OcLocationInfoReq;
import com.transsnet.palmpay.credit.bean.req.PermissionReq;
import com.transsnet.palmpay.credit.bean.resp.CLInitData;
import com.transsnet.palmpay.credit.ui.activity.cashloan.a;
import com.transsnet.palmpay.util.PermissionUtils;
import com.transsnet.palmpay.util.SPUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p141j9.C1798f;
import p221ob.c;
import p294tb.A;
import p294tb.C2062y;
import p294tb.RunnableC2060w;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f29197B;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f29202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f29203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CLInitData f29204g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f29207o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f29208p;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f29201d = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f29205i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f29206j = new ArrayList();
    public final Integer t = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f29209v = "CASH_LOAN";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Integer f29210w = 9;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f29196A = "OTHER";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Integer f29198C = -1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Handler f29199H = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final RunnableC2060w f29200L = new RunnableC2060w(this, 0);

    static {
        new C2062y(null);
    }

    public static final void m(a aVar) {
        if (!d.v()) {
            aVar.p();
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!PermissionUtils.isGranted("android.permission.READ_PHONE_STATE")) {
            arrayList.add("android.permission.READ_PHONE_STATE");
        }
        if (!PermissionUtils.isGranted("android.permission.ACCESS_COARSE_LOCATION")) {
            arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        }
        if (!PermissionUtils.isGranted(d.j())) {
            arrayList.add(d.j());
        }
        if (arrayList.size() == 0) {
            aVar.t();
        } else {
            AbstractC1032a.g(aVar, (String[]) arrayList.toArray(new String[0]), 1001);
        }
    }

    public static int n() {
        String string = SPUtils.get().getString("credit_bind_times");
        Intrinsics.e(string);
        if (StringsKt.A(string, "_", false)) {
            return E.b(TextUtils.split(string, "_")[1]);
        }
        return 0;
    }

    public static void o(a aVar, String str) {
        if (str == null) {
            str = "INSTALLMENT_LOAN";
        }
        aVar.f29209v = str;
        aVar.f29210w = 9;
        G.h(c.f40268a).clInitApply(new CLInitReq(aVar.f29196A, aVar.f29209v, 2, null, Boolean.FALSE, null, 32, null)).k(f.f42629b).i(p071ef.b.a()).subscribe(new A(aVar, 0));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
        this.f29199H.removeCallbacks(this.f29200L);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int eventType = event.getEventType();
        if (eventType == 308) {
            r();
            return;
        }
        if (eventType == 338) {
            u();
        } else if (eventType == 361 || eventType == 368 || eventType == 369) {
            finish();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity, androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback
    public final void onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i7, permissions, grantResults);
        if (i7 == 1001) {
            ArrayList arrayList = new ArrayList();
            int length = grantResults.length;
            for (int i10 = 0; i10 < length; i10++) {
                CLPermissionInfo cLPermissionInfo = new CLPermissionInfo(null, 0, 3, null);
                cLPermissionInfo.setName(permissions[i10]);
                if (grantResults[i10] == 0) {
                    cLPermissionInfo.setState(1);
                } else if (this.f29201d) {
                    cLPermissionInfo.setState(2);
                    this.f29201d = false;
                } else if (!AbstractC1032a.h(this, permissions[i10])) {
                    showLoadingDialog(false);
                    cLPermissionInfo.setState(3);
                } else if (grantResults[i10] != 0) {
                    cLPermissionInfo.setState(2);
                }
                arrayList.add(cLPermissionInfo);
            }
            PermissionReq permissionReq = new PermissionReq("flexi cash", "trade", Long.valueOf(System.currentTimeMillis()), Long.valueOf(System.currentTimeMillis()), arrayList);
            c.f40268a.getInstance().getClass();
            c.a().uploadPermissionResult(permissionReq).k(f.f42629b).i(p071ef.b.a()).subscribe(new A(this, 5));
            t();
        }
    }

    public final void p() {
        ArrayList arrayList = this.f29205i;
        if (arrayList != null && !arrayList.isEmpty() && this.f29207o < this.f29205i.size()) {
            showLoadingDialog(false);
            q("/credit_score/oc_start_apply_activity");
            return;
        }
        if (!TextUtils.equals("LOAN_WITHDRAW", this.f29209v)) {
            s();
            return;
        }
        Integer num = this.f29198C;
        if (num != null && num.intValue() == 1) {
            q("/credit_score/cl_last_protocol_activity");
            return;
        }
        Integer num2 = this.f29210w;
        int iIntValue = num2 != null ? num2.intValue() : 9;
        String str = (iIntValue == 7 || iIntValue == 9) ? "LoanBorrowFlexiLoan" : "LoanBorrowHome";
        Bundle bundle = new Bundle();
        bundle.putInt("accountType", iIntValue);
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String str2 = Eb.a.f2267a;
        bundle.putString(LoanHomeSource.TRACK_PARAM_KEY, str2);
        bundle.putString(LoanHomeSource.TRACK_PARAM_KEY, str2);
        com.palmpay.lib.apm.launchcounter.util.d.x(bundle, str);
    }

    public final void q(String str) {
        Postcard postcardWithString = ARouter.getInstance().build(str).withInt("oc_current_router_index", this.f29207o).withString("oc_business_type", this.f29209v);
        C0525w c0525wF = C0525w.f();
        String str2 = this.f29196A;
        String str3 = this.f29203f;
        String str4 = this.f29202e;
        CLInitData cLInitData = this.f29204g;
        Postcard postcardWithString2 = postcardWithString.withString("oc_apply_data", ((Gson) c0525wF.f7166b).toJson(new OcApplyData(str2, 2, str3, str4, cLInitData != null ? cLInitData.getSceneType() : null, false, false, this.f29208p, this.f29209v, this.f29205i, this.f29206j)));
        Integer num = this.f29198C;
        postcardWithString2.withInt("key_need_sign_type", num != null ? num.intValue() : -1).navigation();
    }

    public void r() {
        F6.d.h(this.TAG, 3, "onLoginSuccessEvent >>>");
    }

    public final void s() {
        if (!Intrinsics.c(this.f29209v, "CASH_LOAN") && !Intrinsics.c(this.f29209v, "CASH_INSTANT_LOAN") && !Intrinsics.c(this.f29209v, "INSTALLMENT_LOAN")) {
            G.h(c.f40268a).installmentRaiseAmountV2(this.f29203f, null, this.f29209v).k(f.f42629b).i(p071ef.b.a()).subscribe(new A(this, 2));
        } else {
            G.h(c.f40268a).querySignStatus(new DoubleSignReq(this.f29209v)).k(f.f42629b).i(p071ef.b.a()).f(new p287se.d(new C1798f(this, 19), 5)).i(p071ef.b.a()).subscribe(new A(this, 1));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public void setupView() {
        org.greenrobot.eventbus.c.b().j(this);
        g gVar = g.f2277b;
        final int i7 = 0;
        gVar.a("cs_cl_key_sign_type").e(this, new Observer(this) { // from class: tb.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f42526b;

            {
                this.f42526b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                switch (i7) {
                    case 0:
                        this.f42526b.f29198C = (Integer) obj;
                        break;
                    default:
                        this.f42526b.getClass();
                        break;
                }
            }
        });
        final int i10 = 1;
        gVar.a("cs_cl_key_product_sub_id").e(this, new Observer(this) { // from class: tb.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f42526b;

            {
                this.f42526b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                switch (i10) {
                    case 0:
                        this.f42526b.f29198C = (Integer) obj;
                        break;
                    default:
                        this.f42526b.getClass();
                        break;
                }
            }
        });
        String stringExtra = getIntent().getStringExtra("cl_loan_product_type");
        if (stringExtra == null) {
            stringExtra = "CASH_LOAN";
        }
        this.f29209v = stringExtra;
        this.f29197B = getIntent().getBooleanExtra("cl_is_installment", false);
        String stringExtra2 = getIntent().getStringExtra("cl_apply_enter_point");
        if (stringExtra2 == null) {
            stringExtra2 = "OTHER";
        }
        this.f29196A = stringExtra2;
    }

    public final void t() {
        u();
        UploadDeviceInfoReq.DeviceInfoBean ocDeviceInfo = Fb.d.f2639a.getOcDeviceInfo(this.f29203f, "flexi cash", "credit");
        c.f40268a.getInstance().getClass();
        c.a().uploadDeviceInfoNew(ocDeviceInfo).k(f.f42629b).i(p071ef.b.a()).subscribe(new A(this, 3));
        String str = TextUtils.isEmpty(this.f29203f) ? "" : this.f29203f;
        this.f29203f = str;
        Ga.b bVar = Ga.c.f3194a;
        Intrinsics.e(str);
        bVar.upload(str, "4", "flexi cash");
        CollectDeviceInfoService.a.enqueueWork$default(CollectDeviceInfoService.f27401o, this, true, false, true, false, this.f29203f, "flexi cash", "credit", 4, null);
        p();
    }

    public final void u() {
        double latitude;
        double longitude;
        if (PermissionUtils.isGranted(d.j()) || PermissionUtils.isGranted("android.permission.ACCESS_COARSE_LOCATION")) {
            LocationRecord locationRecordF = p367ya.a.d().f();
            if (locationRecordF != null) {
                latitude = locationRecordF.getLatitude();
                longitude = locationRecordF.getLongitude();
            } else {
                latitude = 9999.0d;
                longitude = 9999.0d;
            }
            OcLocationInfoReq ocLocationInfoReq = new OcLocationInfoReq(Double.valueOf(latitude), Double.valueOf(longitude), null, null, "flexi cash", "credit", 12, null);
            c.f40268a.getInstance().getClass();
            c.a().uploadLocationInfo(ocLocationInfoReq).k(f.f42629b).i(p071ef.b.a()).subscribe(new A(this, 4));
        }
    }
}
