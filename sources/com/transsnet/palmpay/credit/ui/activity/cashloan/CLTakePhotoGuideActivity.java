package com.transsnet.palmpay.credit.ui.activity.cashloan;

import C0.G;
import L6.b;
import Pa.n0;
import Ya.e;
import Ya.f;
import Ya.g;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.AbstractC1032a;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.bean.req.OcRouterDetail;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLTakePhotoGuideActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity;
import com.transsnet.palmpay.credit.view.OpenAccountRouterProgressViewV2;
import com.transsnet.palmpay.util.PermissionUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit拍照引导页", path = "/credit_score/ol_take_photo_guide_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLTakePhotoGuideActivity;", "Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcApplyBaseActivity;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLTakePhotoGuideActivity extends OcApplyBaseActivity {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ int f29154s0 = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f29155Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f29156Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f29157k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t f29158p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f29159q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final t f29160r0;

    public CLTakePhotoGuideActivity() {
        final int i7 = 0;
        this.f29155Y = C2131j.b(new Function0(this) { // from class: tb.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTakePhotoGuideActivity f42509b;

            {
                this.f42509b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTakePhotoGuideActivity cLTakePhotoGuideActivity = this.f42509b;
                switch (i7) {
                    case 0:
                        int i10 = CLTakePhotoGuideActivity.f29154s0;
                        return (TextView) cLTakePhotoGuideActivity.findViewById(e.router_title_tv);
                    case 1:
                        int i11 = CLTakePhotoGuideActivity.f29154s0;
                        return (ImageView) cLTakePhotoGuideActivity.findViewById(e.router_close_img);
                    case 2:
                        int i12 = CLTakePhotoGuideActivity.f29154s0;
                        return (ImageView) cLTakePhotoGuideActivity.findViewById(e.router_back_img);
                    case 3:
                        int i13 = CLTakePhotoGuideActivity.f29154s0;
                        return (Button) cLTakePhotoGuideActivity.findViewById(e.take_photo_guide_img);
                    case 4:
                        int i14 = CLTakePhotoGuideActivity.f29154s0;
                        return (TextView) cLTakePhotoGuideActivity.findViewById(e.take_photo_proto_tv);
                    default:
                        int i15 = CLTakePhotoGuideActivity.f29154s0;
                        return (OpenAccountRouterProgressViewV2) cLTakePhotoGuideActivity.findViewById(e.router_progress_view);
                }
            }
        });
        final int i10 = 1;
        this.f29156Z = C2131j.b(new Function0(this) { // from class: tb.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTakePhotoGuideActivity f42509b;

            {
                this.f42509b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTakePhotoGuideActivity cLTakePhotoGuideActivity = this.f42509b;
                switch (i10) {
                    case 0:
                        int i11 = CLTakePhotoGuideActivity.f29154s0;
                        return (TextView) cLTakePhotoGuideActivity.findViewById(e.router_title_tv);
                    case 1:
                        int i12 = CLTakePhotoGuideActivity.f29154s0;
                        return (ImageView) cLTakePhotoGuideActivity.findViewById(e.router_close_img);
                    case 2:
                        int i13 = CLTakePhotoGuideActivity.f29154s0;
                        return (ImageView) cLTakePhotoGuideActivity.findViewById(e.router_back_img);
                    case 3:
                        int i14 = CLTakePhotoGuideActivity.f29154s0;
                        return (Button) cLTakePhotoGuideActivity.findViewById(e.take_photo_guide_img);
                    case 4:
                        int i15 = CLTakePhotoGuideActivity.f29154s0;
                        return (TextView) cLTakePhotoGuideActivity.findViewById(e.take_photo_proto_tv);
                    default:
                        int i16 = CLTakePhotoGuideActivity.f29154s0;
                        return (OpenAccountRouterProgressViewV2) cLTakePhotoGuideActivity.findViewById(e.router_progress_view);
                }
            }
        });
        final int i11 = 2;
        this.f29157k0 = C2131j.b(new Function0(this) { // from class: tb.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTakePhotoGuideActivity f42509b;

            {
                this.f42509b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTakePhotoGuideActivity cLTakePhotoGuideActivity = this.f42509b;
                switch (i11) {
                    case 0:
                        int i12 = CLTakePhotoGuideActivity.f29154s0;
                        return (TextView) cLTakePhotoGuideActivity.findViewById(e.router_title_tv);
                    case 1:
                        int i13 = CLTakePhotoGuideActivity.f29154s0;
                        return (ImageView) cLTakePhotoGuideActivity.findViewById(e.router_close_img);
                    case 2:
                        int i14 = CLTakePhotoGuideActivity.f29154s0;
                        return (ImageView) cLTakePhotoGuideActivity.findViewById(e.router_back_img);
                    case 3:
                        int i15 = CLTakePhotoGuideActivity.f29154s0;
                        return (Button) cLTakePhotoGuideActivity.findViewById(e.take_photo_guide_img);
                    case 4:
                        int i16 = CLTakePhotoGuideActivity.f29154s0;
                        return (TextView) cLTakePhotoGuideActivity.findViewById(e.take_photo_proto_tv);
                    default:
                        int i17 = CLTakePhotoGuideActivity.f29154s0;
                        return (OpenAccountRouterProgressViewV2) cLTakePhotoGuideActivity.findViewById(e.router_progress_view);
                }
            }
        });
        final int i12 = 3;
        this.f29158p0 = C2131j.b(new Function0(this) { // from class: tb.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTakePhotoGuideActivity f42509b;

            {
                this.f42509b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTakePhotoGuideActivity cLTakePhotoGuideActivity = this.f42509b;
                switch (i12) {
                    case 0:
                        int i13 = CLTakePhotoGuideActivity.f29154s0;
                        return (TextView) cLTakePhotoGuideActivity.findViewById(e.router_title_tv);
                    case 1:
                        int i14 = CLTakePhotoGuideActivity.f29154s0;
                        return (ImageView) cLTakePhotoGuideActivity.findViewById(e.router_close_img);
                    case 2:
                        int i15 = CLTakePhotoGuideActivity.f29154s0;
                        return (ImageView) cLTakePhotoGuideActivity.findViewById(e.router_back_img);
                    case 3:
                        int i16 = CLTakePhotoGuideActivity.f29154s0;
                        return (Button) cLTakePhotoGuideActivity.findViewById(e.take_photo_guide_img);
                    case 4:
                        int i17 = CLTakePhotoGuideActivity.f29154s0;
                        return (TextView) cLTakePhotoGuideActivity.findViewById(e.take_photo_proto_tv);
                    default:
                        int i18 = CLTakePhotoGuideActivity.f29154s0;
                        return (OpenAccountRouterProgressViewV2) cLTakePhotoGuideActivity.findViewById(e.router_progress_view);
                }
            }
        });
        final int i13 = 4;
        this.f29159q0 = C2131j.b(new Function0(this) { // from class: tb.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTakePhotoGuideActivity f42509b;

            {
                this.f42509b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTakePhotoGuideActivity cLTakePhotoGuideActivity = this.f42509b;
                switch (i13) {
                    case 0:
                        int i14 = CLTakePhotoGuideActivity.f29154s0;
                        return (TextView) cLTakePhotoGuideActivity.findViewById(e.router_title_tv);
                    case 1:
                        int i15 = CLTakePhotoGuideActivity.f29154s0;
                        return (ImageView) cLTakePhotoGuideActivity.findViewById(e.router_close_img);
                    case 2:
                        int i16 = CLTakePhotoGuideActivity.f29154s0;
                        return (ImageView) cLTakePhotoGuideActivity.findViewById(e.router_back_img);
                    case 3:
                        int i17 = CLTakePhotoGuideActivity.f29154s0;
                        return (Button) cLTakePhotoGuideActivity.findViewById(e.take_photo_guide_img);
                    case 4:
                        int i18 = CLTakePhotoGuideActivity.f29154s0;
                        return (TextView) cLTakePhotoGuideActivity.findViewById(e.take_photo_proto_tv);
                    default:
                        int i19 = CLTakePhotoGuideActivity.f29154s0;
                        return (OpenAccountRouterProgressViewV2) cLTakePhotoGuideActivity.findViewById(e.router_progress_view);
                }
            }
        });
        final int i14 = 5;
        this.f29160r0 = C2131j.b(new Function0(this) { // from class: tb.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTakePhotoGuideActivity f42509b;

            {
                this.f42509b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTakePhotoGuideActivity cLTakePhotoGuideActivity = this.f42509b;
                switch (i14) {
                    case 0:
                        int i15 = CLTakePhotoGuideActivity.f29154s0;
                        return (TextView) cLTakePhotoGuideActivity.findViewById(e.router_title_tv);
                    case 1:
                        int i16 = CLTakePhotoGuideActivity.f29154s0;
                        return (ImageView) cLTakePhotoGuideActivity.findViewById(e.router_close_img);
                    case 2:
                        int i17 = CLTakePhotoGuideActivity.f29154s0;
                        return (ImageView) cLTakePhotoGuideActivity.findViewById(e.router_back_img);
                    case 3:
                        int i18 = CLTakePhotoGuideActivity.f29154s0;
                        return (Button) cLTakePhotoGuideActivity.findViewById(e.take_photo_guide_img);
                    case 4:
                        int i19 = CLTakePhotoGuideActivity.f29154s0;
                        return (TextView) cLTakePhotoGuideActivity.findViewById(e.take_photo_proto_tv);
                    default:
                        int i110 = CLTakePhotoGuideActivity.f29154s0;
                        return (OpenAccountRouterProgressViewV2) cLTakePhotoGuideActivity.findViewById(e.router_progress_view);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_cl_take_photo_guide_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity, androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback
    public final void onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i7, permissions, grantResults);
        if (i7 == 1000) {
            for (int i10 : grantResults) {
                if (i10 != 0) {
                    return;
                }
            }
            if (PermissionUtils.isGranted("android.permission.CAMERA")) {
                y();
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity, com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        List<OcRouterDetail> routeInfoList;
        super.setupView();
        initStatusBar(getColor(b.ppColorBackgroundLight));
        Object value = this.f29155Y.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((TextView) value).setText(o());
        OcApplyData ocApplyData = this.f29248B;
        if (ocApplyData != null && (routeInfoList = ocApplyData.getRouteInfoList()) != null) {
            t tVar = this.f29160r0;
            Object value2 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((OpenAccountRouterProgressViewV2) value2).setVisibility(0);
            Object value3 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ((OpenAccountRouterProgressViewV2) value3).c(p(), routeInfoList);
        }
        Object value4 = this.f29157k0.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        final int i7 = 0;
        h.l(new View.OnClickListener(this) { // from class: tb.t0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTakePhotoGuideActivity f42513b;

            {
                this.f42513b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CLTakePhotoGuideActivity cLTakePhotoGuideActivity = this.f42513b;
                switch (i7) {
                    case 0:
                        int i10 = CLTakePhotoGuideActivity.f29154s0;
                        cLTakePhotoGuideActivity.onBackPressed();
                        n0 n0VarG = n0.g();
                        OcApplyData ocApplyData2 = cLTakePhotoGuideActivity.f29248B;
                        n0VarG.m("CLTakePhotoGuideActivity_element_click", "router_back_img", ocApplyData2 != null ? ocApplyData2.getProduct() : null);
                        break;
                    case 1:
                        int i11 = CLTakePhotoGuideActivity.f29154s0;
                        cLTakePhotoGuideActivity.v();
                        n0 n0VarG2 = n0.g();
                        OcApplyData ocApplyData3 = cLTakePhotoGuideActivity.f29248B;
                        n0VarG2.m("CLTakePhotoGuideActivity_element_click", "router_close_img", ocApplyData3 != null ? ocApplyData3.getProduct() : null);
                        break;
                    default:
                        int i12 = CLTakePhotoGuideActivity.f29154s0;
                        cLTakePhotoGuideActivity.y();
                        n0 n0VarG3 = n0.g();
                        OcApplyData ocApplyData4 = cLTakePhotoGuideActivity.f29248B;
                        n0VarG3.m("CLTakePhotoGuideActivity_element_click", "take_photo_guide_img", ocApplyData4 != null ? ocApplyData4.getProduct() : null);
                        break;
                }
            }
        }, (ImageView) value4);
        Object value5 = this.f29156Z.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        final int i10 = 1;
        h.l(new View.OnClickListener(this) { // from class: tb.t0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTakePhotoGuideActivity f42513b;

            {
                this.f42513b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CLTakePhotoGuideActivity cLTakePhotoGuideActivity = this.f42513b;
                switch (i10) {
                    case 0:
                        int i11 = CLTakePhotoGuideActivity.f29154s0;
                        cLTakePhotoGuideActivity.onBackPressed();
                        n0 n0VarG = n0.g();
                        OcApplyData ocApplyData2 = cLTakePhotoGuideActivity.f29248B;
                        n0VarG.m("CLTakePhotoGuideActivity_element_click", "router_back_img", ocApplyData2 != null ? ocApplyData2.getProduct() : null);
                        break;
                    case 1:
                        int i12 = CLTakePhotoGuideActivity.f29154s0;
                        cLTakePhotoGuideActivity.v();
                        n0 n0VarG2 = n0.g();
                        OcApplyData ocApplyData3 = cLTakePhotoGuideActivity.f29248B;
                        n0VarG2.m("CLTakePhotoGuideActivity_element_click", "router_close_img", ocApplyData3 != null ? ocApplyData3.getProduct() : null);
                        break;
                    default:
                        int i13 = CLTakePhotoGuideActivity.f29154s0;
                        cLTakePhotoGuideActivity.y();
                        n0 n0VarG3 = n0.g();
                        OcApplyData ocApplyData4 = cLTakePhotoGuideActivity.f29248B;
                        n0VarG3.m("CLTakePhotoGuideActivity_element_click", "take_photo_guide_img", ocApplyData4 != null ? ocApplyData4.getProduct() : null);
                        break;
                }
            }
        }, (ImageView) value5);
        Object value6 = this.f29159q0.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        ((TextView) value6).setText(G.i("By completing this operation, you agree to our ").setForegroundColor(getColor(Ya.b.cs_cl_take_photo_proto_txt_color)).append("Terms and Conditions").setForegroundColor(getColor(Ya.b.cs_cl_take_photo_proto_link_txt_color)).setUnderline().create());
        Object value7 = this.f29158p0.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        final int i11 = 2;
        h.l(new View.OnClickListener(this) { // from class: tb.t0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTakePhotoGuideActivity f42513b;

            {
                this.f42513b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CLTakePhotoGuideActivity cLTakePhotoGuideActivity = this.f42513b;
                switch (i11) {
                    case 0:
                        int i12 = CLTakePhotoGuideActivity.f29154s0;
                        cLTakePhotoGuideActivity.onBackPressed();
                        n0 n0VarG = n0.g();
                        OcApplyData ocApplyData2 = cLTakePhotoGuideActivity.f29248B;
                        n0VarG.m("CLTakePhotoGuideActivity_element_click", "router_back_img", ocApplyData2 != null ? ocApplyData2.getProduct() : null);
                        break;
                    case 1:
                        int i13 = CLTakePhotoGuideActivity.f29154s0;
                        cLTakePhotoGuideActivity.v();
                        n0 n0VarG2 = n0.g();
                        OcApplyData ocApplyData3 = cLTakePhotoGuideActivity.f29248B;
                        n0VarG2.m("CLTakePhotoGuideActivity_element_click", "router_close_img", ocApplyData3 != null ? ocApplyData3.getProduct() : null);
                        break;
                    default:
                        int i14 = CLTakePhotoGuideActivity.f29154s0;
                        cLTakePhotoGuideActivity.y();
                        n0 n0VarG3 = n0.g();
                        OcApplyData ocApplyData4 = cLTakePhotoGuideActivity.f29248B;
                        n0VarG3.m("CLTakePhotoGuideActivity_element_click", "take_photo_guide_img", ocApplyData4 != null ? ocApplyData4.getProduct() : null);
                        break;
                }
            }
        }, (Button) value7);
    }

    public final void y() {
        if (PermissionUtils.isGranted("android.permission.CAMERA")) {
            w();
            s("/credit_score/ol_take_photo_activity", null);
        } else {
            ToastUtils.showLong(getString(g.cs_grant_camera_permission), new Object[0]);
            AbstractC1032a.g(this, new String[]{"android.permission.CAMERA"}, 1000);
        }
    }
}
