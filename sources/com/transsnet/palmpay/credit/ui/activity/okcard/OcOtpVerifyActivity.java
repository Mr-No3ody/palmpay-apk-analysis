package com.transsnet.palmpay.credit.ui.activity.okcard;

import C0.G;
import N8.r;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Ya.e;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.maps.android.BuildConfig;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;
import com.transsnet.palmpay.core.config.d;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV2View;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.bean.req.OcRouterDetail;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcOtpVerifyActivity;
import com.transsnet.palmpay.credit.view.OpenAccountRouterProgressViewV2;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p310ub.C2110x0;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit授信OTP验证页面", path = "/credit_score/oc_otp_verify_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcOtpVerifyActivity;", "Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcApplyBaseActivity;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcOtpVerifyActivity extends OcApplyBaseActivity {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final /* synthetic */ int f29624v0 = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f29625Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f29626Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f29627k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t f29628p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f29629q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final t f29630r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final t f29631s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public String f29632t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public String f29633u0;

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

    public OcOtpVerifyActivity() {
        final int i7 = 0;
        this.f29625Y = C2131j.b(new Function0(this) { // from class: ub.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOtpVerifyActivity f42940b;

            {
                this.f42940b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcOtpVerifyActivity ocOtpVerifyActivity = this.f42940b;
                switch (i7) {
                    case 0:
                        int i10 = OcOtpVerifyActivity.f29624v0;
                        return (TextView) ocOtpVerifyActivity.findViewById(e.router_title_tv);
                    case 1:
                        int i11 = OcOtpVerifyActivity.f29624v0;
                        return (ImageView) ocOtpVerifyActivity.findViewById(e.router_close_img);
                    case 2:
                        int i12 = OcOtpVerifyActivity.f29624v0;
                        return (ImageView) ocOtpVerifyActivity.findViewById(e.router_back_img);
                    case 3:
                        int i13 = OcOtpVerifyActivity.f29624v0;
                        return (TextView) ocOtpVerifyActivity.findViewById(e.contact_us_tv);
                    case 4:
                        int i14 = OcOtpVerifyActivity.f29624v0;
                        return (OneTimeCodeV2View) ocOtpVerifyActivity.findViewById(e.otp_view);
                    case 5:
                        int i15 = OcOtpVerifyActivity.f29624v0;
                        return (TextView) ocOtpVerifyActivity.findViewById(e.phone_number_tv);
                    default:
                        int i16 = OcOtpVerifyActivity.f29624v0;
                        return (OpenAccountRouterProgressViewV2) ocOtpVerifyActivity.findViewById(e.router_progress_view);
                }
            }
        });
        final int i10 = 1;
        this.f29626Z = C2131j.b(new Function0(this) { // from class: ub.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOtpVerifyActivity f42940b;

            {
                this.f42940b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcOtpVerifyActivity ocOtpVerifyActivity = this.f42940b;
                switch (i10) {
                    case 0:
                        int i11 = OcOtpVerifyActivity.f29624v0;
                        return (TextView) ocOtpVerifyActivity.findViewById(e.router_title_tv);
                    case 1:
                        int i12 = OcOtpVerifyActivity.f29624v0;
                        return (ImageView) ocOtpVerifyActivity.findViewById(e.router_close_img);
                    case 2:
                        int i13 = OcOtpVerifyActivity.f29624v0;
                        return (ImageView) ocOtpVerifyActivity.findViewById(e.router_back_img);
                    case 3:
                        int i14 = OcOtpVerifyActivity.f29624v0;
                        return (TextView) ocOtpVerifyActivity.findViewById(e.contact_us_tv);
                    case 4:
                        int i15 = OcOtpVerifyActivity.f29624v0;
                        return (OneTimeCodeV2View) ocOtpVerifyActivity.findViewById(e.otp_view);
                    case 5:
                        int i16 = OcOtpVerifyActivity.f29624v0;
                        return (TextView) ocOtpVerifyActivity.findViewById(e.phone_number_tv);
                    default:
                        int i17 = OcOtpVerifyActivity.f29624v0;
                        return (OpenAccountRouterProgressViewV2) ocOtpVerifyActivity.findViewById(e.router_progress_view);
                }
            }
        });
        final int i11 = 2;
        this.f29627k0 = C2131j.b(new Function0(this) { // from class: ub.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOtpVerifyActivity f42940b;

            {
                this.f42940b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcOtpVerifyActivity ocOtpVerifyActivity = this.f42940b;
                switch (i11) {
                    case 0:
                        int i12 = OcOtpVerifyActivity.f29624v0;
                        return (TextView) ocOtpVerifyActivity.findViewById(e.router_title_tv);
                    case 1:
                        int i13 = OcOtpVerifyActivity.f29624v0;
                        return (ImageView) ocOtpVerifyActivity.findViewById(e.router_close_img);
                    case 2:
                        int i14 = OcOtpVerifyActivity.f29624v0;
                        return (ImageView) ocOtpVerifyActivity.findViewById(e.router_back_img);
                    case 3:
                        int i15 = OcOtpVerifyActivity.f29624v0;
                        return (TextView) ocOtpVerifyActivity.findViewById(e.contact_us_tv);
                    case 4:
                        int i16 = OcOtpVerifyActivity.f29624v0;
                        return (OneTimeCodeV2View) ocOtpVerifyActivity.findViewById(e.otp_view);
                    case 5:
                        int i17 = OcOtpVerifyActivity.f29624v0;
                        return (TextView) ocOtpVerifyActivity.findViewById(e.phone_number_tv);
                    default:
                        int i18 = OcOtpVerifyActivity.f29624v0;
                        return (OpenAccountRouterProgressViewV2) ocOtpVerifyActivity.findViewById(e.router_progress_view);
                }
            }
        });
        final int i12 = 3;
        this.f29628p0 = C2131j.b(new Function0(this) { // from class: ub.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOtpVerifyActivity f42940b;

            {
                this.f42940b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcOtpVerifyActivity ocOtpVerifyActivity = this.f42940b;
                switch (i12) {
                    case 0:
                        int i13 = OcOtpVerifyActivity.f29624v0;
                        return (TextView) ocOtpVerifyActivity.findViewById(e.router_title_tv);
                    case 1:
                        int i14 = OcOtpVerifyActivity.f29624v0;
                        return (ImageView) ocOtpVerifyActivity.findViewById(e.router_close_img);
                    case 2:
                        int i15 = OcOtpVerifyActivity.f29624v0;
                        return (ImageView) ocOtpVerifyActivity.findViewById(e.router_back_img);
                    case 3:
                        int i16 = OcOtpVerifyActivity.f29624v0;
                        return (TextView) ocOtpVerifyActivity.findViewById(e.contact_us_tv);
                    case 4:
                        int i17 = OcOtpVerifyActivity.f29624v0;
                        return (OneTimeCodeV2View) ocOtpVerifyActivity.findViewById(e.otp_view);
                    case 5:
                        int i18 = OcOtpVerifyActivity.f29624v0;
                        return (TextView) ocOtpVerifyActivity.findViewById(e.phone_number_tv);
                    default:
                        int i19 = OcOtpVerifyActivity.f29624v0;
                        return (OpenAccountRouterProgressViewV2) ocOtpVerifyActivity.findViewById(e.router_progress_view);
                }
            }
        });
        final int i13 = 4;
        this.f29629q0 = C2131j.b(new Function0(this) { // from class: ub.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOtpVerifyActivity f42940b;

            {
                this.f42940b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcOtpVerifyActivity ocOtpVerifyActivity = this.f42940b;
                switch (i13) {
                    case 0:
                        int i14 = OcOtpVerifyActivity.f29624v0;
                        return (TextView) ocOtpVerifyActivity.findViewById(e.router_title_tv);
                    case 1:
                        int i15 = OcOtpVerifyActivity.f29624v0;
                        return (ImageView) ocOtpVerifyActivity.findViewById(e.router_close_img);
                    case 2:
                        int i16 = OcOtpVerifyActivity.f29624v0;
                        return (ImageView) ocOtpVerifyActivity.findViewById(e.router_back_img);
                    case 3:
                        int i17 = OcOtpVerifyActivity.f29624v0;
                        return (TextView) ocOtpVerifyActivity.findViewById(e.contact_us_tv);
                    case 4:
                        int i18 = OcOtpVerifyActivity.f29624v0;
                        return (OneTimeCodeV2View) ocOtpVerifyActivity.findViewById(e.otp_view);
                    case 5:
                        int i19 = OcOtpVerifyActivity.f29624v0;
                        return (TextView) ocOtpVerifyActivity.findViewById(e.phone_number_tv);
                    default:
                        int i110 = OcOtpVerifyActivity.f29624v0;
                        return (OpenAccountRouterProgressViewV2) ocOtpVerifyActivity.findViewById(e.router_progress_view);
                }
            }
        });
        final int i14 = 5;
        this.f29630r0 = C2131j.b(new Function0(this) { // from class: ub.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOtpVerifyActivity f42940b;

            {
                this.f42940b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcOtpVerifyActivity ocOtpVerifyActivity = this.f42940b;
                switch (i14) {
                    case 0:
                        int i15 = OcOtpVerifyActivity.f29624v0;
                        return (TextView) ocOtpVerifyActivity.findViewById(e.router_title_tv);
                    case 1:
                        int i16 = OcOtpVerifyActivity.f29624v0;
                        return (ImageView) ocOtpVerifyActivity.findViewById(e.router_close_img);
                    case 2:
                        int i17 = OcOtpVerifyActivity.f29624v0;
                        return (ImageView) ocOtpVerifyActivity.findViewById(e.router_back_img);
                    case 3:
                        int i18 = OcOtpVerifyActivity.f29624v0;
                        return (TextView) ocOtpVerifyActivity.findViewById(e.contact_us_tv);
                    case 4:
                        int i19 = OcOtpVerifyActivity.f29624v0;
                        return (OneTimeCodeV2View) ocOtpVerifyActivity.findViewById(e.otp_view);
                    case 5:
                        int i110 = OcOtpVerifyActivity.f29624v0;
                        return (TextView) ocOtpVerifyActivity.findViewById(e.phone_number_tv);
                    default:
                        int i111 = OcOtpVerifyActivity.f29624v0;
                        return (OpenAccountRouterProgressViewV2) ocOtpVerifyActivity.findViewById(e.router_progress_view);
                }
            }
        });
        final int i15 = 6;
        this.f29631s0 = C2131j.b(new Function0(this) { // from class: ub.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOtpVerifyActivity f42940b;

            {
                this.f42940b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcOtpVerifyActivity ocOtpVerifyActivity = this.f42940b;
                switch (i15) {
                    case 0:
                        int i16 = OcOtpVerifyActivity.f29624v0;
                        return (TextView) ocOtpVerifyActivity.findViewById(e.router_title_tv);
                    case 1:
                        int i17 = OcOtpVerifyActivity.f29624v0;
                        return (ImageView) ocOtpVerifyActivity.findViewById(e.router_close_img);
                    case 2:
                        int i18 = OcOtpVerifyActivity.f29624v0;
                        return (ImageView) ocOtpVerifyActivity.findViewById(e.router_back_img);
                    case 3:
                        int i19 = OcOtpVerifyActivity.f29624v0;
                        return (TextView) ocOtpVerifyActivity.findViewById(e.contact_us_tv);
                    case 4:
                        int i110 = OcOtpVerifyActivity.f29624v0;
                        return (OneTimeCodeV2View) ocOtpVerifyActivity.findViewById(e.otp_view);
                    case 5:
                        int i111 = OcOtpVerifyActivity.f29624v0;
                        return (TextView) ocOtpVerifyActivity.findViewById(e.phone_number_tv);
                    default:
                        int i112 = OcOtpVerifyActivity.f29624v0;
                        return (OpenAccountRouterProgressViewV2) ocOtpVerifyActivity.findViewById(e.router_progress_view);
                }
            }
        });
    }

    public static String y() {
        if (BaseApplication.hasLogin()) {
            return G.A();
        }
        return null;
    }

    public final void A(int i7) {
        SmsActionReq smsActionReq = new SmsActionReq();
        smsActionReq.businessType = 15;
        smsActionReq.phoneNo = y();
        smsActionReq.voiceSms = i7;
        smsActionReq.codeCount = 4;
        smsActionReq.email = z().getEmail();
        ((PayApiService) p324va.c.f43141a.f14621b).sendSms(smsActionReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new r(15, smsActionReq, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_verify_layout;
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (TextUtils.isEmpty(this.f29633u0)) {
            return;
        }
        HashMap map = new HashMap();
        map.put("screen_name", "OcOtpVerifyActivity");
        String resourceEntryName = getResources().getResourceEntryName(z().getId());
        String str = this.f29633u0;
        if (str == null) {
            str = BuildConfig.TRAVIS;
        }
        map.put(resourceEntryName, str);
        n0.g().w("oc_input_router_screen", map);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        A(0);
        z().b();
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity, com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        List<OcRouterDetail> routeInfoList;
        super.setupView();
        initStatusBar(-1);
        Object value = this.f29625Y.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((TextView) value).setText(o());
        OcApplyData ocApplyData = this.f29248B;
        if (ocApplyData != null && (routeInfoList = ocApplyData.getRouteInfoList()) != null) {
            t tVar = this.f29631s0;
            Object value2 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((OpenAccountRouterProgressViewV2) value2).setVisibility(0);
            Object value3 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ((OpenAccountRouterProgressViewV2) value3).c(p(), routeInfoList);
        }
        Object value4 = this.f29630r0.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((TextView) value4).setText(r0.D0(y()));
        Object value5 = this.f29627k0.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        final int i7 = 1;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOtpVerifyActivity f42950b;

            {
                this.f42950b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcOtpVerifyActivity ocOtpVerifyActivity = this.f42950b;
                switch (i7) {
                    case 0:
                        int i10 = OcOtpVerifyActivity.f29624v0;
                        i0.c0(d.a(GetCustomerServiceUrlReq.ENTER_TYPE_FLEXI));
                        n0.g().m(ocOtpVerifyActivity.getClass().getSimpleName().concat("_element_click"), "contact_us_tv", "");
                        break;
                    case 1:
                        int i11 = OcOtpVerifyActivity.f29624v0;
                        ocOtpVerifyActivity.onBackPressed();
                        n0.g().m("OcOtpVerifyActivity_element_click", "router_back_img", "");
                        break;
                    default:
                        int i12 = OcOtpVerifyActivity.f29624v0;
                        ocOtpVerifyActivity.v();
                        n0.g().m("OcOtpVerifyActivity_element_click", "router_close_img", "");
                        break;
                }
            }
        }, (ImageView) value5);
        Object value6 = this.f29626Z.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        final int i10 = 2;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOtpVerifyActivity f42950b;

            {
                this.f42950b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcOtpVerifyActivity ocOtpVerifyActivity = this.f42950b;
                switch (i10) {
                    case 0:
                        int i11 = OcOtpVerifyActivity.f29624v0;
                        i0.c0(d.a(GetCustomerServiceUrlReq.ENTER_TYPE_FLEXI));
                        n0.g().m(ocOtpVerifyActivity.getClass().getSimpleName().concat("_element_click"), "contact_us_tv", "");
                        break;
                    case 1:
                        int i12 = OcOtpVerifyActivity.f29624v0;
                        ocOtpVerifyActivity.onBackPressed();
                        n0.g().m("OcOtpVerifyActivity_element_click", "router_back_img", "");
                        break;
                    default:
                        int i13 = OcOtpVerifyActivity.f29624v0;
                        ocOtpVerifyActivity.v();
                        n0.g().m("OcOtpVerifyActivity_element_click", "router_close_img", "");
                        break;
                }
            }
        }, (ImageView) value6);
        z().setSendCodeListener(new C2110x0(this));
        z().setCodeEnteredListener(new C2110x0(this));
        Object value7 = this.f29628p0.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        final int i11 = 0;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOtpVerifyActivity f42950b;

            {
                this.f42950b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcOtpVerifyActivity ocOtpVerifyActivity = this.f42950b;
                switch (i11) {
                    case 0:
                        int i12 = OcOtpVerifyActivity.f29624v0;
                        i0.c0(d.a(GetCustomerServiceUrlReq.ENTER_TYPE_FLEXI));
                        n0.g().m(ocOtpVerifyActivity.getClass().getSimpleName().concat("_element_click"), "contact_us_tv", "");
                        break;
                    case 1:
                        int i13 = OcOtpVerifyActivity.f29624v0;
                        ocOtpVerifyActivity.onBackPressed();
                        n0.g().m("OcOtpVerifyActivity_element_click", "router_back_img", "");
                        break;
                    default:
                        int i14 = OcOtpVerifyActivity.f29624v0;
                        ocOtpVerifyActivity.v();
                        n0.g().m("OcOtpVerifyActivity_element_click", "router_close_img", "");
                        break;
                }
            }
        }, (TextView) value7);
    }

    public final OneTimeCodeV2View z() {
        Object value = this.f29629q0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (OneTimeCodeV2View) value;
    }
}
