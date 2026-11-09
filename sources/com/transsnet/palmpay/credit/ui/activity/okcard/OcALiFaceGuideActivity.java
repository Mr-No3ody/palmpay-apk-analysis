package com.transsnet.palmpay.credit.ui.activity.okcard;

import C0.G;
import Jb.C0351j;
import Pa.n0;
import Ya.e;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.AbstractC1032a;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.bean.req.OcRouterDetail;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcALiFaceGuideActivity;
import com.transsnet.palmpay.credit.view.OpenAccountRouterProgressViewV2;
import com.transsnet.palmpay.credit.viewmodel.OcApplyBaseViewModel;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.PermissionUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p141j9.s;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit授信人脸验证页面", path = "/credit_score/oc_ali_face_guide_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcALiFaceGuideActivity;", "Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcApplyBaseActivity;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOcALiFaceGuideActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OcALiFaceGuideActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/okcard/OcALiFaceGuideActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,177:1\n171#2,12:178\n215#2:190\n*S KotlinDebug\n*F\n+ 1 OcALiFaceGuideActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/okcard/OcALiFaceGuideActivity\n*L\n142#1:178,12\n142#1:190\n*E\n"})
public final class OcALiFaceGuideActivity extends OcApplyBaseActivity {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ int f29218t0 = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f29219Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f29220Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f29221k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t f29222p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f29223q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final t f29224r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final t f29225s0;

    public OcALiFaceGuideActivity() {
        final int i7 = 0;
        this.f29219Y = C2131j.b(new Function0(this) { // from class: ub.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcALiFaceGuideActivity f42829b;

            {
                this.f42829b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcALiFaceGuideActivity ocALiFaceGuideActivity = this.f42829b;
                switch (i7) {
                    case 0:
                        int i10 = OcALiFaceGuideActivity.f29218t0;
                        return (TextView) ocALiFaceGuideActivity.findViewById(e.router_title_tv);
                    case 1:
                        int i11 = OcALiFaceGuideActivity.f29218t0;
                        return (ImageView) ocALiFaceGuideActivity.findViewById(e.router_close_img);
                    case 2:
                        int i12 = OcALiFaceGuideActivity.f29218t0;
                        return (ImageView) ocALiFaceGuideActivity.findViewById(e.router_back_img);
                    case 3:
                        int i13 = OcALiFaceGuideActivity.f29218t0;
                        return (Button) ocALiFaceGuideActivity.findViewById(e.take_photo_guide_img);
                    case 4:
                        int i14 = OcALiFaceGuideActivity.f29218t0;
                        return (TextView) ocALiFaceGuideActivity.findViewById(e.take_photo_proto_tv);
                    case 5:
                        int i15 = OcALiFaceGuideActivity.f29218t0;
                        return (TextView) ocALiFaceGuideActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i16 = OcALiFaceGuideActivity.f29218t0;
                        return (OpenAccountRouterProgressViewV2) ocALiFaceGuideActivity.findViewById(e.router_progress_view);
                }
            }
        });
        final int i10 = 1;
        this.f29220Z = C2131j.b(new Function0(this) { // from class: ub.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcALiFaceGuideActivity f42829b;

            {
                this.f42829b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcALiFaceGuideActivity ocALiFaceGuideActivity = this.f42829b;
                switch (i10) {
                    case 0:
                        int i11 = OcALiFaceGuideActivity.f29218t0;
                        return (TextView) ocALiFaceGuideActivity.findViewById(e.router_title_tv);
                    case 1:
                        int i12 = OcALiFaceGuideActivity.f29218t0;
                        return (ImageView) ocALiFaceGuideActivity.findViewById(e.router_close_img);
                    case 2:
                        int i13 = OcALiFaceGuideActivity.f29218t0;
                        return (ImageView) ocALiFaceGuideActivity.findViewById(e.router_back_img);
                    case 3:
                        int i14 = OcALiFaceGuideActivity.f29218t0;
                        return (Button) ocALiFaceGuideActivity.findViewById(e.take_photo_guide_img);
                    case 4:
                        int i15 = OcALiFaceGuideActivity.f29218t0;
                        return (TextView) ocALiFaceGuideActivity.findViewById(e.take_photo_proto_tv);
                    case 5:
                        int i16 = OcALiFaceGuideActivity.f29218t0;
                        return (TextView) ocALiFaceGuideActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i17 = OcALiFaceGuideActivity.f29218t0;
                        return (OpenAccountRouterProgressViewV2) ocALiFaceGuideActivity.findViewById(e.router_progress_view);
                }
            }
        });
        final int i11 = 2;
        this.f29221k0 = C2131j.b(new Function0(this) { // from class: ub.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcALiFaceGuideActivity f42829b;

            {
                this.f42829b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcALiFaceGuideActivity ocALiFaceGuideActivity = this.f42829b;
                switch (i11) {
                    case 0:
                        int i12 = OcALiFaceGuideActivity.f29218t0;
                        return (TextView) ocALiFaceGuideActivity.findViewById(e.router_title_tv);
                    case 1:
                        int i13 = OcALiFaceGuideActivity.f29218t0;
                        return (ImageView) ocALiFaceGuideActivity.findViewById(e.router_close_img);
                    case 2:
                        int i14 = OcALiFaceGuideActivity.f29218t0;
                        return (ImageView) ocALiFaceGuideActivity.findViewById(e.router_back_img);
                    case 3:
                        int i15 = OcALiFaceGuideActivity.f29218t0;
                        return (Button) ocALiFaceGuideActivity.findViewById(e.take_photo_guide_img);
                    case 4:
                        int i16 = OcALiFaceGuideActivity.f29218t0;
                        return (TextView) ocALiFaceGuideActivity.findViewById(e.take_photo_proto_tv);
                    case 5:
                        int i17 = OcALiFaceGuideActivity.f29218t0;
                        return (TextView) ocALiFaceGuideActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i18 = OcALiFaceGuideActivity.f29218t0;
                        return (OpenAccountRouterProgressViewV2) ocALiFaceGuideActivity.findViewById(e.router_progress_view);
                }
            }
        });
        final int i12 = 3;
        this.f29222p0 = C2131j.b(new Function0(this) { // from class: ub.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcALiFaceGuideActivity f42829b;

            {
                this.f42829b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcALiFaceGuideActivity ocALiFaceGuideActivity = this.f42829b;
                switch (i12) {
                    case 0:
                        int i13 = OcALiFaceGuideActivity.f29218t0;
                        return (TextView) ocALiFaceGuideActivity.findViewById(e.router_title_tv);
                    case 1:
                        int i14 = OcALiFaceGuideActivity.f29218t0;
                        return (ImageView) ocALiFaceGuideActivity.findViewById(e.router_close_img);
                    case 2:
                        int i15 = OcALiFaceGuideActivity.f29218t0;
                        return (ImageView) ocALiFaceGuideActivity.findViewById(e.router_back_img);
                    case 3:
                        int i16 = OcALiFaceGuideActivity.f29218t0;
                        return (Button) ocALiFaceGuideActivity.findViewById(e.take_photo_guide_img);
                    case 4:
                        int i17 = OcALiFaceGuideActivity.f29218t0;
                        return (TextView) ocALiFaceGuideActivity.findViewById(e.take_photo_proto_tv);
                    case 5:
                        int i18 = OcALiFaceGuideActivity.f29218t0;
                        return (TextView) ocALiFaceGuideActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i19 = OcALiFaceGuideActivity.f29218t0;
                        return (OpenAccountRouterProgressViewV2) ocALiFaceGuideActivity.findViewById(e.router_progress_view);
                }
            }
        });
        final int i13 = 4;
        this.f29223q0 = C2131j.b(new Function0(this) { // from class: ub.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcALiFaceGuideActivity f42829b;

            {
                this.f42829b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcALiFaceGuideActivity ocALiFaceGuideActivity = this.f42829b;
                switch (i13) {
                    case 0:
                        int i14 = OcALiFaceGuideActivity.f29218t0;
                        return (TextView) ocALiFaceGuideActivity.findViewById(e.router_title_tv);
                    case 1:
                        int i15 = OcALiFaceGuideActivity.f29218t0;
                        return (ImageView) ocALiFaceGuideActivity.findViewById(e.router_close_img);
                    case 2:
                        int i16 = OcALiFaceGuideActivity.f29218t0;
                        return (ImageView) ocALiFaceGuideActivity.findViewById(e.router_back_img);
                    case 3:
                        int i17 = OcALiFaceGuideActivity.f29218t0;
                        return (Button) ocALiFaceGuideActivity.findViewById(e.take_photo_guide_img);
                    case 4:
                        int i18 = OcALiFaceGuideActivity.f29218t0;
                        return (TextView) ocALiFaceGuideActivity.findViewById(e.take_photo_proto_tv);
                    case 5:
                        int i19 = OcALiFaceGuideActivity.f29218t0;
                        return (TextView) ocALiFaceGuideActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i110 = OcALiFaceGuideActivity.f29218t0;
                        return (OpenAccountRouterProgressViewV2) ocALiFaceGuideActivity.findViewById(e.router_progress_view);
                }
            }
        });
        final int i14 = 5;
        this.f29224r0 = C2131j.b(new Function0(this) { // from class: ub.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcALiFaceGuideActivity f42829b;

            {
                this.f42829b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcALiFaceGuideActivity ocALiFaceGuideActivity = this.f42829b;
                switch (i14) {
                    case 0:
                        int i15 = OcALiFaceGuideActivity.f29218t0;
                        return (TextView) ocALiFaceGuideActivity.findViewById(e.router_title_tv);
                    case 1:
                        int i16 = OcALiFaceGuideActivity.f29218t0;
                        return (ImageView) ocALiFaceGuideActivity.findViewById(e.router_close_img);
                    case 2:
                        int i17 = OcALiFaceGuideActivity.f29218t0;
                        return (ImageView) ocALiFaceGuideActivity.findViewById(e.router_back_img);
                    case 3:
                        int i18 = OcALiFaceGuideActivity.f29218t0;
                        return (Button) ocALiFaceGuideActivity.findViewById(e.take_photo_guide_img);
                    case 4:
                        int i19 = OcALiFaceGuideActivity.f29218t0;
                        return (TextView) ocALiFaceGuideActivity.findViewById(e.take_photo_proto_tv);
                    case 5:
                        int i110 = OcALiFaceGuideActivity.f29218t0;
                        return (TextView) ocALiFaceGuideActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i111 = OcALiFaceGuideActivity.f29218t0;
                        return (OpenAccountRouterProgressViewV2) ocALiFaceGuideActivity.findViewById(e.router_progress_view);
                }
            }
        });
        final int i15 = 6;
        this.f29225s0 = C2131j.b(new Function0(this) { // from class: ub.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcALiFaceGuideActivity f42829b;

            {
                this.f42829b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcALiFaceGuideActivity ocALiFaceGuideActivity = this.f42829b;
                switch (i15) {
                    case 0:
                        int i16 = OcALiFaceGuideActivity.f29218t0;
                        return (TextView) ocALiFaceGuideActivity.findViewById(e.router_title_tv);
                    case 1:
                        int i17 = OcALiFaceGuideActivity.f29218t0;
                        return (ImageView) ocALiFaceGuideActivity.findViewById(e.router_close_img);
                    case 2:
                        int i18 = OcALiFaceGuideActivity.f29218t0;
                        return (ImageView) ocALiFaceGuideActivity.findViewById(e.router_back_img);
                    case 3:
                        int i19 = OcALiFaceGuideActivity.f29218t0;
                        return (Button) ocALiFaceGuideActivity.findViewById(e.take_photo_guide_img);
                    case 4:
                        int i110 = OcALiFaceGuideActivity.f29218t0;
                        return (TextView) ocALiFaceGuideActivity.findViewById(e.take_photo_proto_tv);
                    case 5:
                        int i111 = OcALiFaceGuideActivity.f29218t0;
                        return (TextView) ocALiFaceGuideActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i112 = OcALiFaceGuideActivity.f29218t0;
                        return (OpenAccountRouterProgressViewV2) ocALiFaceGuideActivity.findViewById(e.router_progress_view);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_ali_face_guide_layout;
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity, com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        super.initData();
        l lVar = ((OcApplyBaseViewModel) l()).f30895C;
        if (lVar != null) {
            lVar.e(this, new s(new p141j9.t(this, this, 21), 0, false));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
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
            y(false);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        OcApplyBaseViewModel ocApplyBaseViewModel = (OcApplyBaseViewModel) l();
        if (ocApplyBaseViewModel != null) {
            OcApplyData ocApplyData = this.f29248B;
            p140j8.f.s(ocApplyBaseViewModel, new C0351j(ocApplyData != null ? ocApplyData.getApplyId() : null, null), ocApplyBaseViewModel.f30895C, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity, com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        List<OcRouterDetail> routeInfoList;
        super.setupView();
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        BarUtils.setStatusBarLightMode(this, !isDarkMode());
        Object value = this.f29219Y.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((TextView) value).setText(o());
        OcApplyData ocApplyData = this.f29248B;
        if (ocApplyData != null && (routeInfoList = ocApplyData.getRouteInfoList()) != null) {
            t tVar = this.f29225s0;
            Object value2 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((OpenAccountRouterProgressViewV2) value2).setVisibility(0);
            Object value3 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ((OpenAccountRouterProgressViewV2) value3).c(p(), routeInfoList);
        }
        Object value4 = this.f29221k0.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        final int i7 = 0;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcALiFaceGuideActivity f42835b;

            {
                this.f42835b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcALiFaceGuideActivity ocALiFaceGuideActivity = this.f42835b;
                switch (i7) {
                    case 0:
                        int i10 = OcALiFaceGuideActivity.f29218t0;
                        ocALiFaceGuideActivity.onBackPressed();
                        n0 n0VarG = n0.g();
                        OcApplyData ocApplyData2 = ocALiFaceGuideActivity.f29248B;
                        n0VarG.m("OcALiFaceGuideActivity_element_click", "router_back_img", ocApplyData2 != null ? ocApplyData2.getProduct() : null);
                        break;
                    case 1:
                        int i11 = OcALiFaceGuideActivity.f29218t0;
                        ocALiFaceGuideActivity.v();
                        n0 n0VarG2 = n0.g();
                        OcApplyData ocApplyData3 = ocALiFaceGuideActivity.f29248B;
                        n0VarG2.m("OcALiFaceGuideActivity_element_click", "router_close_img", ocApplyData3 != null ? ocApplyData3.getProduct() : null);
                        break;
                    default:
                        int i12 = OcALiFaceGuideActivity.f29218t0;
                        ocALiFaceGuideActivity.y(true);
                        n0 n0VarG3 = n0.g();
                        OcApplyData ocApplyData4 = ocALiFaceGuideActivity.f29248B;
                        n0VarG3.m("OcALiFaceGuideActivity_element_click", "take_photo_guide_img", ocApplyData4 != null ? ocApplyData4.getProduct() : null);
                        break;
                }
            }
        }, (ImageView) value4);
        Object value5 = this.f29220Z.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        final int i10 = 1;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcALiFaceGuideActivity f42835b;

            {
                this.f42835b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcALiFaceGuideActivity ocALiFaceGuideActivity = this.f42835b;
                switch (i10) {
                    case 0:
                        int i11 = OcALiFaceGuideActivity.f29218t0;
                        ocALiFaceGuideActivity.onBackPressed();
                        n0 n0VarG = n0.g();
                        OcApplyData ocApplyData2 = ocALiFaceGuideActivity.f29248B;
                        n0VarG.m("OcALiFaceGuideActivity_element_click", "router_back_img", ocApplyData2 != null ? ocApplyData2.getProduct() : null);
                        break;
                    case 1:
                        int i12 = OcALiFaceGuideActivity.f29218t0;
                        ocALiFaceGuideActivity.v();
                        n0 n0VarG2 = n0.g();
                        OcApplyData ocApplyData3 = ocALiFaceGuideActivity.f29248B;
                        n0VarG2.m("OcALiFaceGuideActivity_element_click", "router_close_img", ocApplyData3 != null ? ocApplyData3.getProduct() : null);
                        break;
                    default:
                        int i13 = OcALiFaceGuideActivity.f29218t0;
                        ocALiFaceGuideActivity.y(true);
                        n0 n0VarG3 = n0.g();
                        OcApplyData ocApplyData4 = ocALiFaceGuideActivity.f29248B;
                        n0VarG3.m("OcALiFaceGuideActivity_element_click", "take_photo_guide_img", ocApplyData4 != null ? ocApplyData4.getProduct() : null);
                        break;
                }
            }
        }, (ImageView) value5);
        Object value6 = this.f29223q0.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        ((TextView) value6).setText(G.i("By completing this operation, you agree to our ").setForegroundColor(getColor(Ya.b.cs_cl_take_photo_proto_txt_color)).append("Terms and Conditions").setForegroundColor(getColor(Ya.b.cs_cl_take_photo_proto_link_txt_color)).setUnderline().create());
        Object value7 = this.f29222p0.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        final int i11 = 2;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcALiFaceGuideActivity f42835b;

            {
                this.f42835b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcALiFaceGuideActivity ocALiFaceGuideActivity = this.f42835b;
                switch (i11) {
                    case 0:
                        int i12 = OcALiFaceGuideActivity.f29218t0;
                        ocALiFaceGuideActivity.onBackPressed();
                        n0 n0VarG = n0.g();
                        OcApplyData ocApplyData2 = ocALiFaceGuideActivity.f29248B;
                        n0VarG.m("OcALiFaceGuideActivity_element_click", "router_back_img", ocApplyData2 != null ? ocApplyData2.getProduct() : null);
                        break;
                    case 1:
                        int i13 = OcALiFaceGuideActivity.f29218t0;
                        ocALiFaceGuideActivity.v();
                        n0 n0VarG2 = n0.g();
                        OcApplyData ocApplyData3 = ocALiFaceGuideActivity.f29248B;
                        n0VarG2.m("OcALiFaceGuideActivity_element_click", "router_close_img", ocApplyData3 != null ? ocApplyData3.getProduct() : null);
                        break;
                    default:
                        int i14 = OcALiFaceGuideActivity.f29218t0;
                        ocALiFaceGuideActivity.y(true);
                        n0 n0VarG3 = n0.g();
                        OcApplyData ocApplyData4 = ocALiFaceGuideActivity.f29248B;
                        n0VarG3.m("OcALiFaceGuideActivity_element_click", "take_photo_guide_img", ocApplyData4 != null ? ocApplyData4.getProduct() : null);
                        break;
                }
            }
        }, (Button) value7);
    }

    public final void y(boolean z3) {
        if (PermissionUtils.isGranted("android.permission.CAMERA")) {
            w();
            t();
        } else if (z3) {
            ToastUtils.showLong(getString(Ya.g.cs_grant_camera_permission), new Object[0]);
            AbstractC1032a.g(this, new String[]{"android.permission.CAMERA"}, 1000);
        }
    }
}
