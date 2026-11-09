package com.transsnet.palmpay.credit.ui.activity.okcard;

import Ed.ViewOnFocusChangeListenerC0235o;
import Pa.n0;
import Ya.e;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.transsnet.palmpay.credit.bean.other.OcContactSocialLabelBean;
import com.transsnet.palmpay.credit.bean.req.OcAddContactReq;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.bean.req.OcRouterDetail;
import com.transsnet.palmpay.credit.bean.req.SocialMediaInfo;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcMediaActivity;
import com.transsnet.palmpay.credit.view.OpenAccountRouterProgressViewV2;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.SPUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p221ob.c;
import p294tb.C2055q;
import p298tf.f;
import p310ub.C2091n0;
import p355xf.C2131j;
import p355xf.t;
import p368yb.C2150s;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC授信社媒页面", path = "/credit_score/oc_media_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcMediaActivity;", "Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcApplyBaseActivity;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcMediaActivity extends OcApplyBaseActivity {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ int f29577y0 = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f29578Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f29579Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f29580k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t f29581p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f29582q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final t f29583r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final t f29584s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final t f29585t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final t f29586u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public String f29587v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ArrayList f29588w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public C2150s f29589x0;

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

    public OcMediaActivity() {
        final int i7 = 4;
        this.f29578Y = C2131j.b(new Function0(this) { // from class: ub.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMediaActivity f42890b;

            {
                this.f42890b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcMediaActivity ocMediaActivity = this.f42890b;
                switch (i7) {
                    case 0:
                        int i10 = OcMediaActivity.f29577y0;
                        return (ImageView) ocMediaActivity.findViewById(e.social_contact_img);
                    case 1:
                        int i11 = OcMediaActivity.f29577y0;
                        return (EditText) ocMediaActivity.findViewById(e.account_num_et);
                    case 2:
                        int i12 = OcMediaActivity.f29577y0;
                        return (RecyclerView) ocMediaActivity.findViewById(e.social_contact_rv);
                    case 3:
                        int i13 = OcMediaActivity.f29577y0;
                        return (OpenAccountRouterProgressViewV2) ocMediaActivity.findViewById(e.router_progress_view);
                    case 4:
                        int i14 = OcMediaActivity.f29577y0;
                        return (TextView) ocMediaActivity.findViewById(e.router_right_tv);
                    case 5:
                        int i15 = OcMediaActivity.f29577y0;
                        return (TextView) ocMediaActivity.findViewById(e.router_title_tv);
                    case 6:
                        int i16 = OcMediaActivity.f29577y0;
                        return (ImageView) ocMediaActivity.findViewById(e.router_close_img);
                    case 7:
                        int i17 = OcMediaActivity.f29577y0;
                        return (ImageView) ocMediaActivity.findViewById(e.router_back_img);
                    default:
                        int i18 = OcMediaActivity.f29577y0;
                        return (Button) ocMediaActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i10 = 5;
        this.f29579Z = C2131j.b(new Function0(this) { // from class: ub.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMediaActivity f42890b;

            {
                this.f42890b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcMediaActivity ocMediaActivity = this.f42890b;
                switch (i10) {
                    case 0:
                        int i11 = OcMediaActivity.f29577y0;
                        return (ImageView) ocMediaActivity.findViewById(e.social_contact_img);
                    case 1:
                        int i12 = OcMediaActivity.f29577y0;
                        return (EditText) ocMediaActivity.findViewById(e.account_num_et);
                    case 2:
                        int i13 = OcMediaActivity.f29577y0;
                        return (RecyclerView) ocMediaActivity.findViewById(e.social_contact_rv);
                    case 3:
                        int i14 = OcMediaActivity.f29577y0;
                        return (OpenAccountRouterProgressViewV2) ocMediaActivity.findViewById(e.router_progress_view);
                    case 4:
                        int i15 = OcMediaActivity.f29577y0;
                        return (TextView) ocMediaActivity.findViewById(e.router_right_tv);
                    case 5:
                        int i16 = OcMediaActivity.f29577y0;
                        return (TextView) ocMediaActivity.findViewById(e.router_title_tv);
                    case 6:
                        int i17 = OcMediaActivity.f29577y0;
                        return (ImageView) ocMediaActivity.findViewById(e.router_close_img);
                    case 7:
                        int i18 = OcMediaActivity.f29577y0;
                        return (ImageView) ocMediaActivity.findViewById(e.router_back_img);
                    default:
                        int i19 = OcMediaActivity.f29577y0;
                        return (Button) ocMediaActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i11 = 6;
        this.f29580k0 = C2131j.b(new Function0(this) { // from class: ub.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMediaActivity f42890b;

            {
                this.f42890b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcMediaActivity ocMediaActivity = this.f42890b;
                switch (i11) {
                    case 0:
                        int i12 = OcMediaActivity.f29577y0;
                        return (ImageView) ocMediaActivity.findViewById(e.social_contact_img);
                    case 1:
                        int i13 = OcMediaActivity.f29577y0;
                        return (EditText) ocMediaActivity.findViewById(e.account_num_et);
                    case 2:
                        int i14 = OcMediaActivity.f29577y0;
                        return (RecyclerView) ocMediaActivity.findViewById(e.social_contact_rv);
                    case 3:
                        int i15 = OcMediaActivity.f29577y0;
                        return (OpenAccountRouterProgressViewV2) ocMediaActivity.findViewById(e.router_progress_view);
                    case 4:
                        int i16 = OcMediaActivity.f29577y0;
                        return (TextView) ocMediaActivity.findViewById(e.router_right_tv);
                    case 5:
                        int i17 = OcMediaActivity.f29577y0;
                        return (TextView) ocMediaActivity.findViewById(e.router_title_tv);
                    case 6:
                        int i18 = OcMediaActivity.f29577y0;
                        return (ImageView) ocMediaActivity.findViewById(e.router_close_img);
                    case 7:
                        int i19 = OcMediaActivity.f29577y0;
                        return (ImageView) ocMediaActivity.findViewById(e.router_back_img);
                    default:
                        int i110 = OcMediaActivity.f29577y0;
                        return (Button) ocMediaActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i12 = 7;
        this.f29581p0 = C2131j.b(new Function0(this) { // from class: ub.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMediaActivity f42890b;

            {
                this.f42890b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcMediaActivity ocMediaActivity = this.f42890b;
                switch (i12) {
                    case 0:
                        int i13 = OcMediaActivity.f29577y0;
                        return (ImageView) ocMediaActivity.findViewById(e.social_contact_img);
                    case 1:
                        int i14 = OcMediaActivity.f29577y0;
                        return (EditText) ocMediaActivity.findViewById(e.account_num_et);
                    case 2:
                        int i15 = OcMediaActivity.f29577y0;
                        return (RecyclerView) ocMediaActivity.findViewById(e.social_contact_rv);
                    case 3:
                        int i16 = OcMediaActivity.f29577y0;
                        return (OpenAccountRouterProgressViewV2) ocMediaActivity.findViewById(e.router_progress_view);
                    case 4:
                        int i17 = OcMediaActivity.f29577y0;
                        return (TextView) ocMediaActivity.findViewById(e.router_right_tv);
                    case 5:
                        int i18 = OcMediaActivity.f29577y0;
                        return (TextView) ocMediaActivity.findViewById(e.router_title_tv);
                    case 6:
                        int i19 = OcMediaActivity.f29577y0;
                        return (ImageView) ocMediaActivity.findViewById(e.router_close_img);
                    case 7:
                        int i110 = OcMediaActivity.f29577y0;
                        return (ImageView) ocMediaActivity.findViewById(e.router_back_img);
                    default:
                        int i111 = OcMediaActivity.f29577y0;
                        return (Button) ocMediaActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i13 = 8;
        this.f29582q0 = C2131j.b(new Function0(this) { // from class: ub.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMediaActivity f42890b;

            {
                this.f42890b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcMediaActivity ocMediaActivity = this.f42890b;
                switch (i13) {
                    case 0:
                        int i14 = OcMediaActivity.f29577y0;
                        return (ImageView) ocMediaActivity.findViewById(e.social_contact_img);
                    case 1:
                        int i15 = OcMediaActivity.f29577y0;
                        return (EditText) ocMediaActivity.findViewById(e.account_num_et);
                    case 2:
                        int i16 = OcMediaActivity.f29577y0;
                        return (RecyclerView) ocMediaActivity.findViewById(e.social_contact_rv);
                    case 3:
                        int i17 = OcMediaActivity.f29577y0;
                        return (OpenAccountRouterProgressViewV2) ocMediaActivity.findViewById(e.router_progress_view);
                    case 4:
                        int i18 = OcMediaActivity.f29577y0;
                        return (TextView) ocMediaActivity.findViewById(e.router_right_tv);
                    case 5:
                        int i19 = OcMediaActivity.f29577y0;
                        return (TextView) ocMediaActivity.findViewById(e.router_title_tv);
                    case 6:
                        int i110 = OcMediaActivity.f29577y0;
                        return (ImageView) ocMediaActivity.findViewById(e.router_close_img);
                    case 7:
                        int i111 = OcMediaActivity.f29577y0;
                        return (ImageView) ocMediaActivity.findViewById(e.router_back_img);
                    default:
                        int i112 = OcMediaActivity.f29577y0;
                        return (Button) ocMediaActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i14 = 0;
        this.f29583r0 = C2131j.b(new Function0(this) { // from class: ub.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMediaActivity f42890b;

            {
                this.f42890b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcMediaActivity ocMediaActivity = this.f42890b;
                switch (i14) {
                    case 0:
                        int i15 = OcMediaActivity.f29577y0;
                        return (ImageView) ocMediaActivity.findViewById(e.social_contact_img);
                    case 1:
                        int i16 = OcMediaActivity.f29577y0;
                        return (EditText) ocMediaActivity.findViewById(e.account_num_et);
                    case 2:
                        int i17 = OcMediaActivity.f29577y0;
                        return (RecyclerView) ocMediaActivity.findViewById(e.social_contact_rv);
                    case 3:
                        int i18 = OcMediaActivity.f29577y0;
                        return (OpenAccountRouterProgressViewV2) ocMediaActivity.findViewById(e.router_progress_view);
                    case 4:
                        int i19 = OcMediaActivity.f29577y0;
                        return (TextView) ocMediaActivity.findViewById(e.router_right_tv);
                    case 5:
                        int i110 = OcMediaActivity.f29577y0;
                        return (TextView) ocMediaActivity.findViewById(e.router_title_tv);
                    case 6:
                        int i111 = OcMediaActivity.f29577y0;
                        return (ImageView) ocMediaActivity.findViewById(e.router_close_img);
                    case 7:
                        int i112 = OcMediaActivity.f29577y0;
                        return (ImageView) ocMediaActivity.findViewById(e.router_back_img);
                    default:
                        int i113 = OcMediaActivity.f29577y0;
                        return (Button) ocMediaActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i15 = 1;
        this.f29584s0 = C2131j.b(new Function0(this) { // from class: ub.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMediaActivity f42890b;

            {
                this.f42890b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcMediaActivity ocMediaActivity = this.f42890b;
                switch (i15) {
                    case 0:
                        int i16 = OcMediaActivity.f29577y0;
                        return (ImageView) ocMediaActivity.findViewById(e.social_contact_img);
                    case 1:
                        int i17 = OcMediaActivity.f29577y0;
                        return (EditText) ocMediaActivity.findViewById(e.account_num_et);
                    case 2:
                        int i18 = OcMediaActivity.f29577y0;
                        return (RecyclerView) ocMediaActivity.findViewById(e.social_contact_rv);
                    case 3:
                        int i19 = OcMediaActivity.f29577y0;
                        return (OpenAccountRouterProgressViewV2) ocMediaActivity.findViewById(e.router_progress_view);
                    case 4:
                        int i110 = OcMediaActivity.f29577y0;
                        return (TextView) ocMediaActivity.findViewById(e.router_right_tv);
                    case 5:
                        int i111 = OcMediaActivity.f29577y0;
                        return (TextView) ocMediaActivity.findViewById(e.router_title_tv);
                    case 6:
                        int i112 = OcMediaActivity.f29577y0;
                        return (ImageView) ocMediaActivity.findViewById(e.router_close_img);
                    case 7:
                        int i113 = OcMediaActivity.f29577y0;
                        return (ImageView) ocMediaActivity.findViewById(e.router_back_img);
                    default:
                        int i114 = OcMediaActivity.f29577y0;
                        return (Button) ocMediaActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i16 = 2;
        this.f29585t0 = C2131j.b(new Function0(this) { // from class: ub.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMediaActivity f42890b;

            {
                this.f42890b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcMediaActivity ocMediaActivity = this.f42890b;
                switch (i16) {
                    case 0:
                        int i17 = OcMediaActivity.f29577y0;
                        return (ImageView) ocMediaActivity.findViewById(e.social_contact_img);
                    case 1:
                        int i18 = OcMediaActivity.f29577y0;
                        return (EditText) ocMediaActivity.findViewById(e.account_num_et);
                    case 2:
                        int i19 = OcMediaActivity.f29577y0;
                        return (RecyclerView) ocMediaActivity.findViewById(e.social_contact_rv);
                    case 3:
                        int i110 = OcMediaActivity.f29577y0;
                        return (OpenAccountRouterProgressViewV2) ocMediaActivity.findViewById(e.router_progress_view);
                    case 4:
                        int i111 = OcMediaActivity.f29577y0;
                        return (TextView) ocMediaActivity.findViewById(e.router_right_tv);
                    case 5:
                        int i112 = OcMediaActivity.f29577y0;
                        return (TextView) ocMediaActivity.findViewById(e.router_title_tv);
                    case 6:
                        int i113 = OcMediaActivity.f29577y0;
                        return (ImageView) ocMediaActivity.findViewById(e.router_close_img);
                    case 7:
                        int i114 = OcMediaActivity.f29577y0;
                        return (ImageView) ocMediaActivity.findViewById(e.router_back_img);
                    default:
                        int i115 = OcMediaActivity.f29577y0;
                        return (Button) ocMediaActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i17 = 3;
        this.f29586u0 = C2131j.b(new Function0(this) { // from class: ub.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMediaActivity f42890b;

            {
                this.f42890b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcMediaActivity ocMediaActivity = this.f42890b;
                switch (i17) {
                    case 0:
                        int i18 = OcMediaActivity.f29577y0;
                        return (ImageView) ocMediaActivity.findViewById(e.social_contact_img);
                    case 1:
                        int i19 = OcMediaActivity.f29577y0;
                        return (EditText) ocMediaActivity.findViewById(e.account_num_et);
                    case 2:
                        int i110 = OcMediaActivity.f29577y0;
                        return (RecyclerView) ocMediaActivity.findViewById(e.social_contact_rv);
                    case 3:
                        int i111 = OcMediaActivity.f29577y0;
                        return (OpenAccountRouterProgressViewV2) ocMediaActivity.findViewById(e.router_progress_view);
                    case 4:
                        int i112 = OcMediaActivity.f29577y0;
                        return (TextView) ocMediaActivity.findViewById(e.router_right_tv);
                    case 5:
                        int i113 = OcMediaActivity.f29577y0;
                        return (TextView) ocMediaActivity.findViewById(e.router_title_tv);
                    case 6:
                        int i114 = OcMediaActivity.f29577y0;
                        return (ImageView) ocMediaActivity.findViewById(e.router_close_img);
                    case 7:
                        int i115 = OcMediaActivity.f29577y0;
                        return (ImageView) ocMediaActivity.findViewById(e.router_back_img);
                    default:
                        int i116 = OcMediaActivity.f29577y0;
                        return (Button) ocMediaActivity.findViewById(e.contact_next_bt);
                }
            }
        });
    }

    public final void A() {
        if (TextUtils.isEmpty(y().getText())) {
            z().setVisibility(8);
        } else {
            z().setVisibility(0);
        }
        C2150s c2150s = this.f29589x0;
        if (c2150s == null) {
            Intrinsics.n("mSocialLabelAdapter");
            throw null;
        }
        if (c2150s.f44261g == -1 || TextUtils.isEmpty(y().getText())) {
            z().setVisibility(8);
        } else {
            z().setVisibility(0);
        }
        Object value = this.f29582q0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((Button) value).setEnabled(true);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View currentFocus;
        if (motionEvent != null && motionEvent.getAction() == 0 && (currentFocus = getCurrentFocus()) != null && (currentFocus instanceof EditText) && motionEvent != null) {
            int[] iArr = {0, 0};
            currentFocus.getLocationInWindow(iArr);
            int i7 = iArr[0];
            int i10 = iArr[1];
            EditText editText = (EditText) currentFocus;
            int height = editText.getHeight() + i10;
            int width = editText.getWidth() + i7;
            if (motionEvent.getX() <= i7 || motionEvent.getX() >= width || motionEvent.getY() <= i10 || motionEvent.getY() >= height) {
                KeyboardUtils.hideSoftInput(this);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_media_layout;
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (TextUtils.isEmpty(y().getText())) {
            return;
        }
        HashMap map = new HashMap();
        map.put("screen_name", "OcMediaActivity");
        map.put(getResources().getResourceEntryName(y().getId()), y().getText());
        n0.g().w("oc_input_router_screen", map);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity, com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        List<OcRouterDetail> routeInfoList;
        super.setupView();
        initStatusBar(getColor(Ya.b.cs_oc_contact_bg_color));
        BarUtils.setStatusBarLightMode((Activity) this, true);
        this.f29587v0 = getIntent().getStringExtra("oc_router_operate_type");
        Object value = this.f29579Z.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((TextView) value).setText(o());
        t tVar = this.f29578Y;
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((TextView) value2).setText(getString(Ya.g.cs_oc_apply_skip));
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((TextView) value3).setVisibility(0);
        OcApplyData ocApplyData = this.f29248B;
        if (ocApplyData != null && (routeInfoList = ocApplyData.getRouteInfoList()) != null) {
            t tVar2 = this.f29586u0;
            Object value4 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            ((OpenAccountRouterProgressViewV2) value4).setVisibility(0);
            Object value5 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            ((OpenAccountRouterProgressViewV2) value5).c(p(), routeInfoList);
        }
        String string = SPUtils.getInstance().getString("oc_social_contact_tag", getString(Ya.g.cs_whats_app));
        y().setText(SPUtils.getInstance().getString("oc_social_contact_account"));
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this);
        flexboxLayoutManager.setFlexDirection(0);
        flexboxLayoutManager.setFlexWrap(1);
        FlexboxLayoutManager flexboxLayoutManager2 = new FlexboxLayoutManager(this);
        flexboxLayoutManager2.setFlexDirection(0);
        flexboxLayoutManager2.setFlexWrap(1);
        ArrayList arrayList = new ArrayList();
        this.f29588w0 = arrayList;
        String string2 = getString(Ya.g.cs_whats_app);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        arrayList.add(new OcContactSocialLabelBean(string2, getDrawable(Ya.d.cs_whats_icon)));
        ArrayList arrayList2 = this.f29588w0;
        if (arrayList2 == null) {
            Intrinsics.n("mSocialLabelData");
            throw null;
        }
        String string3 = getString(Ya.g.cs_facebook);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        arrayList2.add(new OcContactSocialLabelBean(string3, getDrawable(Ya.d.cs_facebook_icon)));
        ArrayList arrayList3 = this.f29588w0;
        if (arrayList3 == null) {
            Intrinsics.n("mSocialLabelData");
            throw null;
        }
        String string4 = getString(Ya.g.cs_instagram);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        arrayList3.add(new OcContactSocialLabelBean(string4, getDrawable(Ya.d.cs_instagram_icon)));
        ArrayList arrayList4 = this.f29588w0;
        if (arrayList4 == null) {
            Intrinsics.n("mSocialLabelData");
            throw null;
        }
        String string5 = getString(Ya.g.cs_twitter);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        arrayList4.add(new OcContactSocialLabelBean(string5, getDrawable(Ya.d.cs_twitter_icon)));
        ArrayList arrayList5 = this.f29588w0;
        if (arrayList5 == null) {
            Intrinsics.n("mSocialLabelData");
            throw null;
        }
        String string6 = getString(Ya.g.cs_telegram);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        arrayList5.add(new OcContactSocialLabelBean(string6, getDrawable(Ya.d.cs_telegram_icon)));
        ArrayList arrayList6 = this.f29588w0;
        if (arrayList6 == null) {
            Intrinsics.n("mSocialLabelData");
            throw null;
        }
        this.f29589x0 = new C2150s(this, arrayList6, string);
        GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) this, 3, 1, false);
        t tVar3 = this.f29585t0;
        Object value6 = tVar3.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        ((RecyclerView) value6).addItemDecoration(new C2091n0());
        Object value7 = tVar3.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        ((RecyclerView) value7).setLayoutManager(gridLayoutManager);
        Object value8 = tVar3.getValue();
        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
        RecyclerView recyclerView = (RecyclerView) value8;
        C2150s c2150s = this.f29589x0;
        if (c2150s == null) {
            Intrinsics.n("mSocialLabelAdapter");
            throw null;
        }
        recyclerView.setAdapter(c2150s);
        A();
        Object value9 = this.f29581p0.getValue();
        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
        final int i7 = 0;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMediaActivity f42885b;

            {
                this.f42885b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SocialMediaInfo socialMediaInfo;
                String str;
                OcMediaActivity ocMediaActivity = this.f42885b;
                switch (i7) {
                    case 0:
                        int i10 = OcMediaActivity.f29577y0;
                        ocMediaActivity.onBackPressed();
                        n0.g().m("OcMediaActivity_element_click", "router_back_img", "");
                        return;
                    case 1:
                        int i11 = OcMediaActivity.f29577y0;
                        ocMediaActivity.v();
                        n0.g().m("OcMediaActivity_element_click", "router_close_img", "");
                        return;
                    case 2:
                        int i12 = OcMediaActivity.f29577y0;
                        ocMediaActivity.r();
                        n0.g().m("OcMediaActivity_element_click", "router_right_tv", "");
                        return;
                    default:
                        int i13 = OcMediaActivity.f29577y0;
                        ocMediaActivity.showLoadingDialog(true);
                        C2150s c2150s2 = ocMediaActivity.f29589x0;
                        if (c2150s2 == null) {
                            Intrinsics.n("mSocialLabelAdapter");
                            throw null;
                        }
                        if (c2150s2.f44261g == -1 || TextUtils.isEmpty(ocMediaActivity.y().getText())) {
                            socialMediaInfo = null;
                        } else {
                            String string7 = ocMediaActivity.y().getText().toString();
                            ArrayList arrayList7 = ocMediaActivity.f29588w0;
                            if (arrayList7 == null) {
                                Intrinsics.n("mSocialLabelData");
                                throw null;
                            }
                            C2150s c2150s3 = ocMediaActivity.f29589x0;
                            if (c2150s3 == null) {
                                Intrinsics.n("mSocialLabelAdapter");
                                throw null;
                            }
                            socialMediaInfo = new SocialMediaInfo(string7, ((OcContactSocialLabelBean) arrayList7.get(c2150s3.f44261g)).getName());
                        }
                        if (TextUtils.isEmpty(ocMediaActivity.f29587v0)) {
                            if (Intrinsics.c(ocMediaActivity.f29249C, "oc_use_type_router")) {
                                str = Intrinsics.c(ocMediaActivity.f29261w, "OK_CARD") ? "OK_CARD_APPLY" : "CASH_LOAN_APPLY";
                            } else {
                                str = Intrinsics.c(ocMediaActivity.f29261w, "OK_CARD") ? "OK_CARD_RAISE" : "CASH_LOAN_RAISE";
                            }
                            ocMediaActivity.f29587v0 = str;
                        }
                        OcApplyData ocApplyData2 = ocMediaActivity.f29248B;
                        OcAddContactReq ocAddContactReq = new OcAddContactReq(ocApplyData2 != null ? ocApplyData2.getApplyId() : null, null, socialMediaInfo, ocMediaActivity.f29261w, ocMediaActivity.f29587v0, null);
                        c.f40268a.getInstance().getClass();
                        c.a().addContact(ocAddContactReq).k(f.f42629b).i(b.a()).subscribe(new C2055q(ocMediaActivity, 19));
                        n0.g().m("OcMediaActivity_element_click", "contact_next_bt", "");
                        return;
                }
            }
        }, (ImageView) value9);
        Object value10 = this.f29580k0.getValue();
        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
        final int i10 = 1;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMediaActivity f42885b;

            {
                this.f42885b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SocialMediaInfo socialMediaInfo;
                String str;
                OcMediaActivity ocMediaActivity = this.f42885b;
                switch (i10) {
                    case 0:
                        int i11 = OcMediaActivity.f29577y0;
                        ocMediaActivity.onBackPressed();
                        n0.g().m("OcMediaActivity_element_click", "router_back_img", "");
                        return;
                    case 1:
                        int i12 = OcMediaActivity.f29577y0;
                        ocMediaActivity.v();
                        n0.g().m("OcMediaActivity_element_click", "router_close_img", "");
                        return;
                    case 2:
                        int i13 = OcMediaActivity.f29577y0;
                        ocMediaActivity.r();
                        n0.g().m("OcMediaActivity_element_click", "router_right_tv", "");
                        return;
                    default:
                        int i14 = OcMediaActivity.f29577y0;
                        ocMediaActivity.showLoadingDialog(true);
                        C2150s c2150s2 = ocMediaActivity.f29589x0;
                        if (c2150s2 == null) {
                            Intrinsics.n("mSocialLabelAdapter");
                            throw null;
                        }
                        if (c2150s2.f44261g == -1 || TextUtils.isEmpty(ocMediaActivity.y().getText())) {
                            socialMediaInfo = null;
                        } else {
                            String string7 = ocMediaActivity.y().getText().toString();
                            ArrayList arrayList7 = ocMediaActivity.f29588w0;
                            if (arrayList7 == null) {
                                Intrinsics.n("mSocialLabelData");
                                throw null;
                            }
                            C2150s c2150s3 = ocMediaActivity.f29589x0;
                            if (c2150s3 == null) {
                                Intrinsics.n("mSocialLabelAdapter");
                                throw null;
                            }
                            socialMediaInfo = new SocialMediaInfo(string7, ((OcContactSocialLabelBean) arrayList7.get(c2150s3.f44261g)).getName());
                        }
                        if (TextUtils.isEmpty(ocMediaActivity.f29587v0)) {
                            if (Intrinsics.c(ocMediaActivity.f29249C, "oc_use_type_router")) {
                                str = Intrinsics.c(ocMediaActivity.f29261w, "OK_CARD") ? "OK_CARD_APPLY" : "CASH_LOAN_APPLY";
                            } else {
                                str = Intrinsics.c(ocMediaActivity.f29261w, "OK_CARD") ? "OK_CARD_RAISE" : "CASH_LOAN_RAISE";
                            }
                            ocMediaActivity.f29587v0 = str;
                        }
                        OcApplyData ocApplyData2 = ocMediaActivity.f29248B;
                        OcAddContactReq ocAddContactReq = new OcAddContactReq(ocApplyData2 != null ? ocApplyData2.getApplyId() : null, null, socialMediaInfo, ocMediaActivity.f29261w, ocMediaActivity.f29587v0, null);
                        c.f40268a.getInstance().getClass();
                        c.a().addContact(ocAddContactReq).k(f.f42629b).i(b.a()).subscribe(new C2055q(ocMediaActivity, 19));
                        n0.g().m("OcMediaActivity_element_click", "contact_next_bt", "");
                        return;
                }
            }
        }, (ImageView) value10);
        Object value11 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
        final int i11 = 2;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMediaActivity f42885b;

            {
                this.f42885b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SocialMediaInfo socialMediaInfo;
                String str;
                OcMediaActivity ocMediaActivity = this.f42885b;
                switch (i11) {
                    case 0:
                        int i12 = OcMediaActivity.f29577y0;
                        ocMediaActivity.onBackPressed();
                        n0.g().m("OcMediaActivity_element_click", "router_back_img", "");
                        return;
                    case 1:
                        int i13 = OcMediaActivity.f29577y0;
                        ocMediaActivity.v();
                        n0.g().m("OcMediaActivity_element_click", "router_close_img", "");
                        return;
                    case 2:
                        int i14 = OcMediaActivity.f29577y0;
                        ocMediaActivity.r();
                        n0.g().m("OcMediaActivity_element_click", "router_right_tv", "");
                        return;
                    default:
                        int i15 = OcMediaActivity.f29577y0;
                        ocMediaActivity.showLoadingDialog(true);
                        C2150s c2150s2 = ocMediaActivity.f29589x0;
                        if (c2150s2 == null) {
                            Intrinsics.n("mSocialLabelAdapter");
                            throw null;
                        }
                        if (c2150s2.f44261g == -1 || TextUtils.isEmpty(ocMediaActivity.y().getText())) {
                            socialMediaInfo = null;
                        } else {
                            String string7 = ocMediaActivity.y().getText().toString();
                            ArrayList arrayList7 = ocMediaActivity.f29588w0;
                            if (arrayList7 == null) {
                                Intrinsics.n("mSocialLabelData");
                                throw null;
                            }
                            C2150s c2150s3 = ocMediaActivity.f29589x0;
                            if (c2150s3 == null) {
                                Intrinsics.n("mSocialLabelAdapter");
                                throw null;
                            }
                            socialMediaInfo = new SocialMediaInfo(string7, ((OcContactSocialLabelBean) arrayList7.get(c2150s3.f44261g)).getName());
                        }
                        if (TextUtils.isEmpty(ocMediaActivity.f29587v0)) {
                            if (Intrinsics.c(ocMediaActivity.f29249C, "oc_use_type_router")) {
                                str = Intrinsics.c(ocMediaActivity.f29261w, "OK_CARD") ? "OK_CARD_APPLY" : "CASH_LOAN_APPLY";
                            } else {
                                str = Intrinsics.c(ocMediaActivity.f29261w, "OK_CARD") ? "OK_CARD_RAISE" : "CASH_LOAN_RAISE";
                            }
                            ocMediaActivity.f29587v0 = str;
                        }
                        OcApplyData ocApplyData2 = ocMediaActivity.f29248B;
                        OcAddContactReq ocAddContactReq = new OcAddContactReq(ocApplyData2 != null ? ocApplyData2.getApplyId() : null, null, socialMediaInfo, ocMediaActivity.f29261w, ocMediaActivity.f29587v0, null);
                        c.f40268a.getInstance().getClass();
                        c.a().addContact(ocAddContactReq).k(f.f42629b).i(b.a()).subscribe(new C2055q(ocMediaActivity, 19));
                        n0.g().m("OcMediaActivity_element_click", "contact_next_bt", "");
                        return;
                }
            }
        }, (TextView) value11);
        C2150s c2150s2 = this.f29589x0;
        if (c2150s2 == null) {
            Intrinsics.n("mSocialLabelAdapter");
            throw null;
        }
        org.greenrobot.eventbus.f itemClickListener = new org.greenrobot.eventbus.f(this, 23);
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        c2150s2.f4993c = itemClickListener;
        y().addTextChangedListener(new R3.e(this, 22));
        y().setOnFocusChangeListener(new ViewOnFocusChangeListenerC0235o(this, 24));
        Object value12 = this.f29582q0.getValue();
        Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
        final int i12 = 3;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMediaActivity f42885b;

            {
                this.f42885b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SocialMediaInfo socialMediaInfo;
                String str;
                OcMediaActivity ocMediaActivity = this.f42885b;
                switch (i12) {
                    case 0:
                        int i13 = OcMediaActivity.f29577y0;
                        ocMediaActivity.onBackPressed();
                        n0.g().m("OcMediaActivity_element_click", "router_back_img", "");
                        return;
                    case 1:
                        int i14 = OcMediaActivity.f29577y0;
                        ocMediaActivity.v();
                        n0.g().m("OcMediaActivity_element_click", "router_close_img", "");
                        return;
                    case 2:
                        int i15 = OcMediaActivity.f29577y0;
                        ocMediaActivity.r();
                        n0.g().m("OcMediaActivity_element_click", "router_right_tv", "");
                        return;
                    default:
                        int i16 = OcMediaActivity.f29577y0;
                        ocMediaActivity.showLoadingDialog(true);
                        C2150s c2150s3 = ocMediaActivity.f29589x0;
                        if (c2150s3 == null) {
                            Intrinsics.n("mSocialLabelAdapter");
                            throw null;
                        }
                        if (c2150s3.f44261g == -1 || TextUtils.isEmpty(ocMediaActivity.y().getText())) {
                            socialMediaInfo = null;
                        } else {
                            String string7 = ocMediaActivity.y().getText().toString();
                            ArrayList arrayList7 = ocMediaActivity.f29588w0;
                            if (arrayList7 == null) {
                                Intrinsics.n("mSocialLabelData");
                                throw null;
                            }
                            C2150s c2150s4 = ocMediaActivity.f29589x0;
                            if (c2150s4 == null) {
                                Intrinsics.n("mSocialLabelAdapter");
                                throw null;
                            }
                            socialMediaInfo = new SocialMediaInfo(string7, ((OcContactSocialLabelBean) arrayList7.get(c2150s4.f44261g)).getName());
                        }
                        if (TextUtils.isEmpty(ocMediaActivity.f29587v0)) {
                            if (Intrinsics.c(ocMediaActivity.f29249C, "oc_use_type_router")) {
                                str = Intrinsics.c(ocMediaActivity.f29261w, "OK_CARD") ? "OK_CARD_APPLY" : "CASH_LOAN_APPLY";
                            } else {
                                str = Intrinsics.c(ocMediaActivity.f29261w, "OK_CARD") ? "OK_CARD_RAISE" : "CASH_LOAN_RAISE";
                            }
                            ocMediaActivity.f29587v0 = str;
                        }
                        OcApplyData ocApplyData2 = ocMediaActivity.f29248B;
                        OcAddContactReq ocAddContactReq = new OcAddContactReq(ocApplyData2 != null ? ocApplyData2.getApplyId() : null, null, socialMediaInfo, ocMediaActivity.f29261w, ocMediaActivity.f29587v0, null);
                        c.f40268a.getInstance().getClass();
                        c.a().addContact(ocAddContactReq).k(f.f42629b).i(b.a()).subscribe(new C2055q(ocMediaActivity, 19));
                        n0.g().m("OcMediaActivity_element_click", "contact_next_bt", "");
                        return;
                }
            }
        }, (Button) value12);
    }

    public final EditText y() {
        Object value = this.f29584s0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (EditText) value;
    }

    public final ImageView z() {
        Object value = this.f29583r0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }
}
