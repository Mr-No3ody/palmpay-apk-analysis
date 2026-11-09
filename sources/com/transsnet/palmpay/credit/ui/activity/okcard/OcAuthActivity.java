package com.transsnet.palmpay.credit.ui.activity.okcard;

import C0.G;
import android.os.Bundle;
import android.widget.Button;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.req.UploadDeviceInfoReq;
import com.transsnet.palmpay.core.service.CollectDeviceInfoService;
import com.transsnet.palmpay.credit.bean.req.MultiMediaReq;
import com.transsnet.palmpay.credit.bean.req.OcLocationInfoReq;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import com.transsnet.palmpay.util.CameraUtils;
import com.transsnet.palmpay.util.OcCameraInfoBean;
import df.i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p284sb.A;
import p285sc.x;
import p310ub.C2099s;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC权限授权说明页", path = "/credit_score/oc_auth_activity")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcAuthActivity;", "LZa/b;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOcAuthActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OcAuthActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/okcard/OcAuthActivity\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,294:1\n37#2:295\n36#2,3:296\n*S KotlinDebug\n*F\n+ 1 OcAuthActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/okcard/OcAuthActivity\n*L\n96#1:295\n96#1:296,3\n*E\n"})
public final class OcAuthActivity extends Za.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f29323g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29324d = C2131j.b(new p068ec.d(this, 23));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29325e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f29326f = true;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_auth_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        Object value = this.f29324d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        p220oa.h.l(new x(this, 17), (Button) value);
    }

    public final void m() {
        double latitude;
        double longitude;
        showLoadingDialog(true);
        Ga.c.f3194a.upload("4");
        LocationRecord locationRecordF = p367ya.a.d().f();
        if (locationRecordF != null) {
            latitude = locationRecordF.getLatitude();
            longitude = locationRecordF.getLongitude();
        } else {
            latitude = 9999.0d;
            longitude = 9999.0d;
        }
        OcLocationInfoReq ocLocationInfoReq = new OcLocationInfoReq(Double.valueOf(latitude), Double.valueOf(longitude), null, null, "flexi", "credit", 12, null);
        p221ob.a aVar = p221ob.c.f40268a;
        aVar.getInstance().getClass();
        df.d<CommonResult> dVarUploadLocationInfo = p221ob.c.a().uploadLocationInfo(ocLocationInfoReq);
        i iVar = p298tf.f.f42629b;
        dVarUploadLocationInfo.k(iVar).i(p071ef.b.a()).subscribe(new C2099s(this, 2));
        CollectDeviceInfoService.a.enqueueWork$default(CollectDeviceInfoService.f27401o, this, true, false, true, false, null, "flexi", "credit", 52, null);
        UploadDeviceInfoReq.DeviceInfoBean ocDeviceInfo = Fb.d.f2639a.getOcDeviceInfo("", "flexi", "credit");
        aVar.getInstance().getClass();
        p221ob.c.a().uploadDeviceInfoNew(ocDeviceInfo).k(iVar).i(p071ef.b.a()).subscribe(new C2099s(this, 1));
        aVar.getInstance().getClass();
        IApiCreditService iApiCreditServiceA = p221ob.c.a();
        OcCameraInfoBean ocCameraInfo = CameraUtils.getOcCameraInfo(BaseApplication.get());
        Intrinsics.checkNotNullExpressionValue(ocCameraInfo, "getOcCameraInfo(...)");
        iApiCreditServiceA.uploadCameraInfo(ocCameraInfo).k(iVar).i(p071ef.b.a()).subscribe(new C2099s(this, 0));
        Pair pairL = p140j8.f.l(this);
        G.h(aVar).uploadMultiMediaInfo(new MultiMediaReq("flexi", null, ((Number) pairL.f38891a).intValue(), ((Number) pairL.f38892b).intValue(), 0, "credit", 16, null)).k(iVar).i(p071ef.b.a()).subscribe(new C2099s(this, 3));
    }

    public final void n() {
        if (this.f29325e == 0 && this.f29326f) {
            org.greenrobot.eventbus.c.b().f(new MessageEvent(339));
            showLoadingDialog(false);
            finish();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int eventType = event.getEventType();
        if (eventType == 340) {
            this.f29325e--;
            n();
        } else {
            if (eventType != 341) {
                return;
            }
            this.f29325e--;
            this.f29326f = false;
            n();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity, androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback
    public final void onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i7, permissions, grantResults);
        if (i7 == 1000) {
            for (int i10 : grantResults) {
                if (i10 != 0) {
                    O6.c cVar = new O6.c(this);
                    cVar.f6596b = O6.d.f(getString(k.core_tips));
                    cVar.f6605k = false;
                    cVar.f6598d = getString(Ya.g.cs_oc_auth_permission);
                    String string = getString(k.core_ok);
                    A a3 = new A(18);
                    cVar.f6600f = string;
                    cVar.f6602h = a3;
                    cVar.a().show();
                    return;
                }
            }
            m();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        org.greenrobot.eventbus.c.b().j(this);
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
    }
}
