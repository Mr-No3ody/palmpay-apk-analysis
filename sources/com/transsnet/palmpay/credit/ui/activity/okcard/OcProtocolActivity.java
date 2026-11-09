package com.transsnet.palmpay.credit.ui.activity.okcard;

import C0.G;
import N8.q0;
import Pa.C0525w;
import Ya.g;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.core.impl.utils.n;
import androidx.core.app.AbstractC1032a;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.gson.Gson;
import com.horcrux.svg.d0;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.req.UploadDeviceInfoReq;
import com.transsnet.palmpay.core.interfaces.ILoanCreditService;
import com.transsnet.palmpay.credit.bean.other.CLNoPermissionBean;
import com.transsnet.palmpay.credit.bean.req.MultiMediaReq;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.bean.req.OcLocationInfoReq;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcProtocolActivity;
import com.transsnet.palmpay.credit.ui.dialog.OcNoPermissionDialog;
import com.transsnet.palmpay.credit.ui.fragment.OcProtocolNoLockFragment;
import com.transsnet.palmpay.util.PermissionUtils;
import com.transsnet.palmpay.util.ToastUtils;
import df.i;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p285sc.x;
import p310ub.D0;
import p310ub.E0;
import p310ub.F0;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC授信协议教育页", path = "/credit_score/oc_protocol_activity")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\t\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcProtocolActivity;", "LZa/b;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "com/transsnet/palmpay/credit/ui/activity/okcard/a", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOcProtocolActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OcProtocolActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/okcard/OcProtocolActivity\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,926:1\n37#2:927\n36#2,3:928\n1#3:931\n*S KotlinDebug\n*F\n+ 1 OcProtocolActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/okcard/OcProtocolActivity\n*L\n241#1:927\n241#1:928,3\n*E\n"})
public final class OcProtocolActivity extends Za.b {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final a f29647H = new a(null);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final E0 f29649B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final E0 f29650C;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f29654g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f29655i;
    public OcProtocolNoLockFragment t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public FusedLocationProviderClient f29659v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.transsnet.palmpay.credit.ui.activity.okcard.a f29660w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29651d = C2131j.b(new D0(this, 0));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f29652e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f29653f = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f29656j = "OTHER";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f29657o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f29658p = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Handler f29648A = new Handler(Looper.getMainLooper());

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [ub.E0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [ub.E0] */
    public OcProtocolActivity() {
        final int i7 = 0;
        this.f29649B = new Runnable(this) { // from class: ub.E0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcProtocolActivity f42751b;

            {
                this.f42751b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OcProtocolActivity ocProtocolActivity = this.f42751b;
                switch (i7) {
                    case 0:
                        OcProtocolActivity.a aVar = OcProtocolActivity.f29647H;
                        ocProtocolActivity.showLoadingDialog(false);
                        ToastUtils.showLong(ocProtocolActivity.getString(g.cs_oc_install_plugin_failed), new Object[0]);
                        break;
                    default:
                        OcProtocolActivity.a aVar2 = OcProtocolActivity.f29647H;
                        ocProtocolActivity.p();
                        ocProtocolActivity.r(false, false);
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f29650C = new Runnable(this) { // from class: ub.E0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcProtocolActivity f42751b;

            {
                this.f42751b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OcProtocolActivity ocProtocolActivity = this.f42751b;
                switch (i10) {
                    case 0:
                        OcProtocolActivity.a aVar = OcProtocolActivity.f29647H;
                        ocProtocolActivity.showLoadingDialog(false);
                        ToastUtils.showLong(ocProtocolActivity.getString(g.cs_oc_install_plugin_failed), new Object[0]);
                        break;
                    default:
                        OcProtocolActivity.a aVar2 = OcProtocolActivity.f29647H;
                        ocProtocolActivity.p();
                        ocProtocolActivity.r(false, false);
                        break;
                }
            }
        };
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_protocol_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void m() {
        ILoanCreditService iLoanCreditService = (ILoanCreditService) d0.m("/credit_score/loan_credit_service", "null cannot be cast to non-null type com.transsnet.palmpay.core.interfaces.ILoanCreditService");
        Z supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        n.y(iLoanCreditService, supportFragmentManager, "OK_CARD", null, null, 12);
    }

    public final void n() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + getPackageName()));
        startActivity(intent);
        finish();
    }

    public final void o(String str) {
        Postcard postcardWithString = ARouter.getInstance().build(str).withInt("oc_current_router_index", 0).withString("oc_business_type", "OK_CARD");
        C0525w c0525wF = C0525w.f();
        postcardWithString.withString("oc_apply_data", ((Gson) c0525wF.f7166b).toJson(new OcApplyData(this.f29656j, Integer.valueOf(this.f29657o), null, null, null, false, false, null, "OK_CARD", this.f29652e, this.f29653f))).navigation();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
        this.f29648A.removeCallbacks(this.f29649B);
        p();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int eventType = event.getEventType();
        if (eventType == 340 || eventType == 341 || eventType != 344) {
            return;
        }
        finish();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity, androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback
    public final void onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i7, permissions, grantResults);
        if (i7 == 1001) {
            int length = grantResults.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (grantResults[i10] != 0) {
                    if (this.f29658p) {
                        q();
                        this.f29658p = false;
                    } else if (!AbstractC1032a.h(this, permissions[i10])) {
                        n();
                    } else if (grantResults[i10] != 0) {
                        q();
                    }
                    showLoadingDialog(false);
                    return;
                }
            }
            r(true, false);
            UploadDeviceInfoReq.DeviceInfoBean ocDeviceInfo = Fb.d.f2639a.getOcDeviceInfo(null, "flexi", "credit");
            p221ob.a aVar = p221ob.c.f40268a;
            aVar.getInstance().getClass();
            df.d<CommonResult> dVarUploadDeviceInfoNew = p221ob.c.a().uploadDeviceInfoNew(ocDeviceInfo);
            i iVar = p298tf.f.f42629b;
            dVarUploadDeviceInfoNew.k(iVar).i(p071ef.b.a()).subscribe(new F0(this, 0));
            Pair pairL = p140j8.f.l(this);
            G.h(aVar).uploadMultiMediaInfo(new MultiMediaReq("flexi", null, ((Number) pairL.f38891a).intValue(), ((Number) pairL.f38892b).intValue(), 0, "credit", 16, null)).k(iVar).i(p071ef.b.a()).subscribe(new F0(this, 2));
            ArrayList arrayList = this.f29652e;
            if (arrayList == null || arrayList.isEmpty() || arrayList.size() <= 0) {
                showLoadingDialog(false);
                o("/credit_score/oc_last_protocol_activity");
            } else {
                showLoadingDialog(false);
                o("/credit_score/oc_start_apply_activity");
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f29655i) {
            this.f29655i = false;
        }
        if (this.f29654g) {
            showLoadingDialog(true);
            this.f29654g = false;
            this.f29648A.postDelayed(this.f29649B, 6000L);
        }
    }

    public final void p() {
        FusedLocationProviderClient fusedLocationProviderClient;
        try {
            com.transsnet.palmpay.credit.ui.activity.okcard.a aVar = this.f29660w;
            if (aVar == null || (fusedLocationProviderClient = this.f29659v) == null) {
                return;
            }
            Intrinsics.e(aVar);
            fusedLocationProviderClient.removeLocationUpdates(aVar);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    public final void q() {
        ArrayList arrayList = new ArrayList();
        if (!PermissionUtils.isGranted("android.permission.CAMERA")) {
            arrayList.add(new CLNoPermissionBean(getDrawable(Ya.d.cs_device_info_icon), "Camera permissions"));
        }
        if (!PermissionUtils.isGranted("android.permission.ACCESS_COARSE_LOCATION") || !PermissionUtils.isGranted(com.transsnet.palmpay.core.config.d.j())) {
            arrayList.add(new CLNoPermissionBean(getDrawable(Ya.d.cs_oc_camera_icon), "Local Information"));
        }
        if (!PermissionUtils.isGranted("android.permission.READ_SMS")) {
            arrayList.add(new CLNoPermissionBean(getDrawable(Ya.d.cs_contact_icon), "SMS reading & writing"));
        }
        OcNoPermissionDialog ocNoPermissionDialog = new OcNoPermissionDialog(this, arrayList);
        ocNoPermissionDialog.setOnSetPermissionClickListener(new D0(this, 1));
        ocNoPermissionDialog.setOnSetCountdownListener(new D0(this, 2));
        ocNoPermissionDialog.show();
    }

    public final void r(boolean z3, boolean z8) {
        double latitude;
        double longitude;
        if (!z3) {
            LocationRecord locationRecordF = p367ya.a.d().f();
            if (locationRecordF != null) {
                latitude = locationRecordF.getLatitude();
                longitude = locationRecordF.getLongitude();
            } else {
                latitude = 9999.0d;
                longitude = 9999.0d;
            }
            OcLocationInfoReq ocLocationInfoReq = new OcLocationInfoReq(Double.valueOf(latitude), Double.valueOf(longitude), null, Boolean.valueOf(z8), "flexi", "credit");
            p221ob.c.f40268a.getInstance().getClass();
            p221ob.c.a().uploadLocationInfo(ocLocationInfoReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new F0(this, 1));
            return;
        }
        if (androidx.core.content.d.a(this, com.transsnet.palmpay.core.config.d.j()) == 0 || androidx.core.content.d.a(this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            try {
                if (this.f29659v == null) {
                    this.f29659v = LocationServices.getFusedLocationProviderClient((Activity) this);
                }
                if (this.f29660w == null) {
                    this.f29660w = new com.transsnet.palmpay.credit.ui.activity.okcard.a(this);
                }
                FusedLocationProviderClient fusedLocationProviderClient = this.f29659v;
                if (fusedLocationProviderClient != null) {
                    LocationRequest locationRequest = new LocationRequest();
                    locationRequest.setInterval(300000L);
                    locationRequest.setFastestInterval(5000L);
                    locationRequest.setPriority(102);
                    com.transsnet.palmpay.credit.ui.activity.okcard.a aVar = this.f29660w;
                    Intrinsics.e(aVar);
                    fusedLocationProviderClient.requestLocationUpdates(locationRequest, aVar, Looper.myLooper());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        this.f29648A.postDelayed(this.f29650C, 5000L);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        org.greenrobot.eventbus.c.b().j(this);
        t tVar = this.f29651d;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((PpTitleBar) value).setTitle(getString(Ya.g.cs_start_overdraft_service_no_lock));
        OcProtocolNoLockFragment ocProtocolNoLockFragment = new OcProtocolNoLockFragment();
        this.t = ocProtocolNoLockFragment;
        Z supportFragmentManager = getSupportFragmentManager();
        C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
        c1161aE.e(Ya.e.protocol_detail_fl, ocProtocolNoLockFragment, null);
        c1161aE.h(true);
        this.f29657o = getIntent().getIntExtra("oc_apply_source", 2);
        String stringExtra = getIntent().getStringExtra("oc_apply_enter_point");
        if (stringExtra == null) {
            stringExtra = "OTHER";
        }
        this.f29656j = stringExtra;
        getIntent().getStringExtra("oc_installment_sn_no");
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((PpTitleBar) value2).setBackButtonClickListener(new x(this, 22));
    }
}
