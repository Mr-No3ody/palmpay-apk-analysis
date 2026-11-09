package com.transsnet.palmpay.credit.ui.activity.okcard;

import C0.G;
import Pa.C0525w;
import Pa.r0;
import V8.w;
import Ya.e;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.AbstractC1032a;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.core.bean.req.UploadDeviceInfoReq;
import com.transsnet.palmpay.credit.bean.other.CLNoPermissionBean;
import com.transsnet.palmpay.credit.bean.req.MultiMediaReq;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.bean.req.OcLocationInfoReq;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcGetInstallmentCreditActivity;
import com.transsnet.palmpay.credit.ui.dialog.CLNoPermissionDialog;
import com.transsnet.palmpay.credit.viewmodel.OcApplyBaseViewModel;
import com.transsnet.palmpay.util.PermissionUtils;
import df.i;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p284sb.A;
import p284sb.C2023v;
import p285sc.x;
import p310ub.V;
import p310ub.W;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcGetInstallmentCreditActivity;", "Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcApplyBaseActivity;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOcGetInstallmentCreditActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OcGetInstallmentCreditActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/okcard/OcGetInstallmentCreditActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,392:1\n33#2,2:393\n260#2,10:395\n296#2:405\n37#3:406\n36#3,3:407\n1#4:410\n*S KotlinDebug\n*F\n+ 1 OcGetInstallmentCreditActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/okcard/OcGetInstallmentCreditActivity\n*L\n110#1:393,2\n113#1:395,10\n113#1:405\n171#1:406\n171#1:407,3\n*E\n"})
public final class OcGetInstallmentCreditActivity extends OcApplyBaseActivity {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final /* synthetic */ int f29458v0 = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f29459Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f29460Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f29461k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t f29462p0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f29464r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public String f29465s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public String f29466t0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f29463q0 = true;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Integer f29467u0 = -1;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void start(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) OcGetInstallmentCreditActivity.class));
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public OcGetInstallmentCreditActivity() {
        final int i7 = 0;
        this.f29459Y = C2131j.b(new Function0(this) { // from class: ub.U

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGetInstallmentCreditActivity f42794b;

            {
                this.f42794b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGetInstallmentCreditActivity ocGetInstallmentCreditActivity = this.f42794b;
                switch (i7) {
                    case 0:
                        int i10 = OcGetInstallmentCreditActivity.f29458v0;
                        return (TextView) ocGetInstallmentCreditActivity.findViewById(e.tvNext);
                    case 1:
                        int i11 = OcGetInstallmentCreditActivity.f29458v0;
                        return (TextView) ocGetInstallmentCreditActivity.findViewById(e.tvAgreement);
                    case 2:
                        int i12 = OcGetInstallmentCreditActivity.f29458v0;
                        return (CheckBox) ocGetInstallmentCreditActivity.findViewById(e.checkboxAgreement);
                    default:
                        int i13 = OcGetInstallmentCreditActivity.f29458v0;
                        return (ImageView) ocGetInstallmentCreditActivity.findViewById(e.topBg);
                }
            }
        });
        final int i10 = 1;
        this.f29460Z = C2131j.b(new Function0(this) { // from class: ub.U

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGetInstallmentCreditActivity f42794b;

            {
                this.f42794b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGetInstallmentCreditActivity ocGetInstallmentCreditActivity = this.f42794b;
                switch (i10) {
                    case 0:
                        int i11 = OcGetInstallmentCreditActivity.f29458v0;
                        return (TextView) ocGetInstallmentCreditActivity.findViewById(e.tvNext);
                    case 1:
                        int i12 = OcGetInstallmentCreditActivity.f29458v0;
                        return (TextView) ocGetInstallmentCreditActivity.findViewById(e.tvAgreement);
                    case 2:
                        int i13 = OcGetInstallmentCreditActivity.f29458v0;
                        return (CheckBox) ocGetInstallmentCreditActivity.findViewById(e.checkboxAgreement);
                    default:
                        int i14 = OcGetInstallmentCreditActivity.f29458v0;
                        return (ImageView) ocGetInstallmentCreditActivity.findViewById(e.topBg);
                }
            }
        });
        final int i11 = 2;
        this.f29461k0 = C2131j.b(new Function0(this) { // from class: ub.U

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGetInstallmentCreditActivity f42794b;

            {
                this.f42794b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGetInstallmentCreditActivity ocGetInstallmentCreditActivity = this.f42794b;
                switch (i11) {
                    case 0:
                        int i12 = OcGetInstallmentCreditActivity.f29458v0;
                        return (TextView) ocGetInstallmentCreditActivity.findViewById(e.tvNext);
                    case 1:
                        int i13 = OcGetInstallmentCreditActivity.f29458v0;
                        return (TextView) ocGetInstallmentCreditActivity.findViewById(e.tvAgreement);
                    case 2:
                        int i14 = OcGetInstallmentCreditActivity.f29458v0;
                        return (CheckBox) ocGetInstallmentCreditActivity.findViewById(e.checkboxAgreement);
                    default:
                        int i15 = OcGetInstallmentCreditActivity.f29458v0;
                        return (ImageView) ocGetInstallmentCreditActivity.findViewById(e.topBg);
                }
            }
        });
        final int i12 = 3;
        this.f29462p0 = C2131j.b(new Function0(this) { // from class: ub.U

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcGetInstallmentCreditActivity f42794b;

            {
                this.f42794b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcGetInstallmentCreditActivity ocGetInstallmentCreditActivity = this.f42794b;
                switch (i12) {
                    case 0:
                        int i13 = OcGetInstallmentCreditActivity.f29458v0;
                        return (TextView) ocGetInstallmentCreditActivity.findViewById(e.tvNext);
                    case 1:
                        int i14 = OcGetInstallmentCreditActivity.f29458v0;
                        return (TextView) ocGetInstallmentCreditActivity.findViewById(e.tvAgreement);
                    case 2:
                        int i15 = OcGetInstallmentCreditActivity.f29458v0;
                        return (CheckBox) ocGetInstallmentCreditActivity.findViewById(e.checkboxAgreement);
                    default:
                        int i16 = OcGetInstallmentCreditActivity.f29458v0;
                        return (ImageView) ocGetInstallmentCreditActivity.findViewById(e.topBg);
                }
            }
        });
    }

    public static final void y(OcGetInstallmentCreditActivity ocGetInstallmentCreditActivity) {
        ocGetInstallmentCreditActivity.getClass();
        ArrayList arrayList = new ArrayList();
        if (!PermissionUtils.isGranted("android.permission.ACCESS_COARSE_LOCATION")) {
            arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        }
        if (!PermissionUtils.isGranted(com.transsnet.palmpay.core.config.d.j())) {
            arrayList.add(com.transsnet.palmpay.core.config.d.j());
        }
        if (!PermissionUtils.isGranted("android.permission.READ_CONTACTS")) {
            arrayList.add("android.permission.READ_CONTACTS");
        }
        if (!PermissionUtils.isGranted("android.permission.CAMERA")) {
            arrayList.add("android.permission.CAMERA");
        }
        if (arrayList.size() == 0) {
            ocGetInstallmentCreditActivity.B();
        } else {
            AbstractC1032a.g(ocGetInstallmentCreditActivity, (String[]) arrayList.toArray(new String[0]), 1001);
        }
    }

    public final void A() {
        ArrayList arrayList = new ArrayList();
        if (!PermissionUtils.isGranted("android.permission.ACCESS_COARSE_LOCATION") || !PermissionUtils.isGranted(com.transsnet.palmpay.core.config.d.j())) {
            arrayList.add(new CLNoPermissionBean(G8.a.x(this, S6.a.pay_Position, null, Integer.valueOf(L6.b.ppColorTextPrimary), 24.0f, 114), "Local Information"));
        }
        if (!PermissionUtils.isGranted("android.permission.READ_CONTACTS")) {
            arrayList.add(new CLNoPermissionBean(getDrawable(Ya.d.cs_contact_icon), "Phone contact list"));
        }
        if (!PermissionUtils.isGranted("android.permission.CAMERA")) {
            arrayList.add(new CLNoPermissionBean(getDrawable(Ya.d.cs_device_info_icon), "Device Camera and photos"));
        }
        CLNoPermissionDialog cLNoPermissionDialog = new CLNoPermissionDialog(this, arrayList);
        cLNoPermissionDialog.setListener(new V(this));
        cLNoPermissionDialog.show();
    }

    public final void B() {
        double latitude;
        double longitude;
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
        dVarUploadLocationInfo.k(iVar).i(p071ef.b.a()).subscribe(new W(this, 1));
        UploadDeviceInfoReq.DeviceInfoBean ocDeviceInfo = Fb.d.f2639a.getOcDeviceInfo(this.f29466t0, "flexi", "credit");
        aVar.getInstance().getClass();
        p221ob.c.a().uploadDeviceInfoNew(ocDeviceInfo).k(iVar).i(p071ef.b.a()).subscribe(new W(this, 0));
        w();
        Pair pairL = p140j8.f.l(this);
        G.h(aVar).uploadMultiMediaInfo(new MultiMediaReq("flexi", this.f29466t0, ((Number) pairL.f38891a).intValue(), ((Number) pairL.f38892b).intValue(), 0, "credit", 16, null)).k(iVar).i(p071ef.b.a()).subscribe(new W(this, 2));
        z();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_activity_oc_get_installment_credit;
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity, com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        super.initData();
        Object value = this.f29462p0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        r0.l1(r0.y0("oc_offline_installment_img.webp"), (ImageView) value);
        Object value2 = this.f29461k0.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((CheckBox) value2).setOnCheckedChangeListener(new A8.g(this, 15));
        Object value3 = this.f29459Y.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        p220oa.h.l(new x(this, 20), (TextView) value3);
        t tVar = this.f29460Z;
        Object value4 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        p220oa.h.l(new A(22), (TextView) value4);
        l lVar = ((OcApplyBaseViewModel) l()).f30903v;
        if (lVar != null) {
            lVar.e(this, new C2023v(new w(this, 25), 6));
        }
        l lVar2 = ((OcApplyBaseViewModel) l()).t;
        if (lVar2 != null) {
            lVar2.e(this, new C2023v(new p141j9.t(this, this, 24), 6));
        }
        Object value5 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ((TextView) value5).setText(Html.fromHtml(getString(Ya.g.cs_i_agree_to_2)));
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
                    if (this.f29463q0) {
                        A();
                        this.f29463q0 = false;
                        return;
                    }
                    if (AbstractC1032a.h(this, permissions[i10])) {
                        if (grantResults[i10] != 0) {
                            A();
                            return;
                        }
                        return;
                    }
                    Intent intent = new Intent();
                    intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + getPackageName()));
                    startActivity(intent);
                    finish();
                    return;
                }
            }
            B();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    public final void z() {
        ArrayList arrayList = this.f29258o;
        if (arrayList.isEmpty() || TextUtils.isEmpty(this.f29466t0)) {
            return;
        }
        Postcard postcardWithString = ARouter.getInstance().build("/credit_score/oc_start_apply_activity").withInt("oc_current_router_index", this.f29464r0).withString("oc_business_type", "INSTALLMENT_RAISE_AMOUNT");
        C0525w c0525wF = C0525w.f();
        String str = this.f29466t0;
        OcApplyData ocApplyData = this.f29248B;
        Integer sceneType = ocApplyData != null ? ocApplyData.getSceneType() : null;
        String str2 = this.f29465s0;
        OcApplyData ocApplyData2 = this.f29248B;
        postcardWithString.withString("oc_apply_data", ((Gson) c0525wF.f7166b).toJson(new OcApplyData("OTHER", 7, str, "", sceneType, false, false, str2, "INSTALLMENT_RAISE_AMOUNT", arrayList, ocApplyData2 != null ? ocApplyData2.getRouteList() : null))).navigation();
    }
}
