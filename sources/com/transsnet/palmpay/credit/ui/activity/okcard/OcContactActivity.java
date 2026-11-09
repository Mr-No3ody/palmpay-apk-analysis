package com.transsnet.palmpay.credit.ui.activity.okcard;

import Ab.r;
import C0.G;
import Ce.DialogInterfaceOnDismissListenerC0168j;
import G9.i;
import Ja.q;
import Jb.C0351j;
import Pa.n0;
import Pa.r0;
import Ya.e;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.app.AbstractC1032a;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.api.Service;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.bean.req.OcRouterDetail;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcContactActivity;
import com.transsnet.palmpay.credit.ui.dialog.OcContactPermissionTipsDialog;
import com.transsnet.palmpay.credit.view.OpenAccountRouterProgressViewV2;
import com.transsnet.palmpay.credit.viewmodel.OcApplyBaseViewModel;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.y;
import p141j9.s;
import p310ub.E;
import p310ub.H;
import p310ub.I;
import p355xf.C2131j;
import p355xf.t;
import p368yb.K;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit授信联系人页面", path = "/credit_score/oc_contact_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcContactActivity;", "Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcApplyBaseActivity;", "<init>", "()V", "V3/a", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOcContactActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OcContactActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/okcard/OcContactActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1491:1\n171#2,12:1492\n215#2:1504\n37#3:1505\n36#3,3:1506\n*S KotlinDebug\n*F\n+ 1 OcContactActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/okcard/OcContactActivity\n*L\n842#1:1492,12\n842#1:1504\n906#1:1505\n906#1:1506,3\n*E\n"})
public final class OcContactActivity extends OcApplyBaseActivity {

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final /* synthetic */ int f29378l1 = 0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final t f29379A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final t f29380B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final t f29381C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final t f29382D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public final t f29383E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final t f29384F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public final t f29385G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final t f29386H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public final t f29387I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final t f29388J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final t f29389K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final t f29390L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public final t f29391M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public final t f29392N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public final t f29393O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public final t f29394P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public final t f29395Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public final t f29396R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public final t f29397S0;
    public final t T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public final t f29398U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public final t f29399V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public final t f29400W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public final t f29401X0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f29402Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public final t f29403Y0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f29404Z;
    public final t Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final t f29405a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final t f29406b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public ArrayList f29407c1;
    public K d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public ArrayList f29408e1;
    public K f1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public String f29411i1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f29412k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t f29414p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f29415q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final t f29416r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final t f29417s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final t f29418t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final t f29419u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final t f29420v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final t f29421w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final t f29422x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final t f29423y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final t f29424z0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public int f29409g1 = 2;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public boolean f29410h1 = true;
    public Integer j1 = 0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public final androidx.activity.result.a f29413k1 = registerForActivityResult(new V3.a(5), new i(this, 10));

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

    public OcContactActivity() {
        final int i7 = 0;
        this.f29402Y = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i7) {
                    case 0:
                        int i10 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i11 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i12 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i13 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i14 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i15 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i16 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i17 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i18 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i19 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i20 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i21 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i22 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i23 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i24 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i25 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i26 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i27 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i28 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i29 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i30 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i31 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i32 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i33 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i34 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i36 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i37 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i38 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i39 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i10 = 2;
        this.f29404Z = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i10) {
                    case 0:
                        int i11 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i12 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i13 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i14 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i15 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i16 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i17 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i18 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i19 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i20 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i21 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i22 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i23 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i24 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i25 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i26 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i27 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i28 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i29 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i30 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i31 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i32 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i33 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i34 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i36 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i37 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i38 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i39 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i11 = 14;
        this.f29412k0 = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i11) {
                    case 0:
                        int i12 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i13 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i14 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i15 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i16 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i17 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i18 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i19 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i110 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i111 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i20 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i21 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i22 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i23 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i24 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i25 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i26 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i27 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i28 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i29 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i30 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i31 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i32 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i33 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i34 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i36 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i37 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i38 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i39 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i12 = 26;
        this.f29414p0 = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i12) {
                    case 0:
                        int i13 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i14 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i15 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i16 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i17 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i18 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i19 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i111 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i112 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i20 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i21 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i22 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i23 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i24 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i25 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i26 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i27 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i28 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i29 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i30 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i31 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i32 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i33 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i34 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i36 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i37 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i38 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i39 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i13 = 29;
        this.f29415q0 = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i13) {
                    case 0:
                        int i14 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i15 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i16 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i17 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i18 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i19 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i110 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i111 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i112 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i113 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i20 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i21 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i22 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i23 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i24 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i25 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i26 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i27 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i28 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i29 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i30 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i31 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i32 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i33 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i34 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i36 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i37 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i38 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i39 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i14 = 0;
        this.f29416r0 = C2131j.b(new Function0(this) { // from class: ub.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42745b;

            {
                this.f42745b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42745b;
                switch (i14) {
                    case 0:
                        int i15 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.self_error_tips_tv);
                    case 1:
                        int i16 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_self_phone_img);
                    case 2:
                        int i17 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.second_manual_input_group);
                    case 3:
                        int i18 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.self_phone_num_et);
                    case 4:
                        int i19 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.self_phone_content_tips_tv);
                    case 5:
                        int i20 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_category_tips_tv);
                    case 6:
                        int i21 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_error_tips_tv);
                    case 7:
                        int i22 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_two_tv);
                    case 8:
                        int i23 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_second_phone_img);
                    case 9:
                        int i24 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_phone_et);
                    case 10:
                        int i25 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_second_name_img);
                    default:
                        int i26 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_name_tips_tv);
                }
            }
        });
        final int i15 = 1;
        this.f29417s0 = C2131j.b(new Function0(this) { // from class: ub.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42745b;

            {
                this.f42745b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42745b;
                switch (i15) {
                    case 0:
                        int i16 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.self_error_tips_tv);
                    case 1:
                        int i17 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_self_phone_img);
                    case 2:
                        int i18 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.second_manual_input_group);
                    case 3:
                        int i19 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.self_phone_num_et);
                    case 4:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.self_phone_content_tips_tv);
                    case 5:
                        int i20 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_category_tips_tv);
                    case 6:
                        int i21 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_error_tips_tv);
                    case 7:
                        int i22 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_two_tv);
                    case 8:
                        int i23 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_second_phone_img);
                    case 9:
                        int i24 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_phone_et);
                    case 10:
                        int i25 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_second_name_img);
                    default:
                        int i26 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_name_tips_tv);
                }
            }
        });
        final int i16 = 3;
        this.f29418t0 = C2131j.b(new Function0(this) { // from class: ub.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42745b;

            {
                this.f42745b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42745b;
                switch (i16) {
                    case 0:
                        int i17 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.self_error_tips_tv);
                    case 1:
                        int i18 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_self_phone_img);
                    case 2:
                        int i19 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.second_manual_input_group);
                    case 3:
                        int i110 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.self_phone_num_et);
                    case 4:
                        int i111 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.self_phone_content_tips_tv);
                    case 5:
                        int i20 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_category_tips_tv);
                    case 6:
                        int i21 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_error_tips_tv);
                    case 7:
                        int i22 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_two_tv);
                    case 8:
                        int i23 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_second_phone_img);
                    case 9:
                        int i24 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_phone_et);
                    case 10:
                        int i25 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_second_name_img);
                    default:
                        int i26 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_name_tips_tv);
                }
            }
        });
        final int i17 = 4;
        this.f29419u0 = C2131j.b(new Function0(this) { // from class: ub.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42745b;

            {
                this.f42745b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42745b;
                switch (i17) {
                    case 0:
                        int i18 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.self_error_tips_tv);
                    case 1:
                        int i19 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_self_phone_img);
                    case 2:
                        int i110 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.second_manual_input_group);
                    case 3:
                        int i111 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.self_phone_num_et);
                    case 4:
                        int i112 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.self_phone_content_tips_tv);
                    case 5:
                        int i20 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_category_tips_tv);
                    case 6:
                        int i21 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_error_tips_tv);
                    case 7:
                        int i22 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_two_tv);
                    case 8:
                        int i23 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_second_phone_img);
                    case 9:
                        int i24 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_phone_et);
                    case 10:
                        int i25 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_second_name_img);
                    default:
                        int i26 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_name_tips_tv);
                }
            }
        });
        final int i18 = 5;
        this.f29420v0 = C2131j.b(new Function0(this) { // from class: ub.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42745b;

            {
                this.f42745b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42745b;
                switch (i18) {
                    case 0:
                        int i19 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.self_error_tips_tv);
                    case 1:
                        int i110 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_self_phone_img);
                    case 2:
                        int i111 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.second_manual_input_group);
                    case 3:
                        int i112 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.self_phone_num_et);
                    case 4:
                        int i113 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.self_phone_content_tips_tv);
                    case 5:
                        int i20 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_category_tips_tv);
                    case 6:
                        int i21 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_error_tips_tv);
                    case 7:
                        int i22 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_two_tv);
                    case 8:
                        int i23 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_second_phone_img);
                    case 9:
                        int i24 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_phone_et);
                    case 10:
                        int i25 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_second_name_img);
                    default:
                        int i26 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_name_tips_tv);
                }
            }
        });
        final int i19 = 11;
        this.f29421w0 = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i19) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i115 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i116 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i117 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i118 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i119 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i20 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i21 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i22 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i23 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i24 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i25 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i26 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i27 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i28 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i29 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i30 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i31 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i32 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i33 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i34 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i36 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i37 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i38 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i39 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i20 = 22;
        this.f29422x0 = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i20) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i115 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i116 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i117 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i118 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i119 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i21 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i22 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i23 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i24 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i25 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i26 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i27 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i28 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i29 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i210 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i30 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i31 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i32 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i33 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i34 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i36 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i37 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i38 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i39 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i21 = 2;
        this.f29423y0 = C2131j.b(new Function0(this) { // from class: ub.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42745b;

            {
                this.f42745b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42745b;
                switch (i21) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.self_error_tips_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_self_phone_img);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.second_manual_input_group);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.self_phone_num_et);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.self_phone_content_tips_tv);
                    case 5:
                        int i22 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_category_tips_tv);
                    case 6:
                        int i23 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_error_tips_tv);
                    case 7:
                        int i24 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_two_tv);
                    case 8:
                        int i25 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_second_phone_img);
                    case 9:
                        int i26 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_phone_et);
                    case 10:
                        int i27 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_second_name_img);
                    default:
                        int i28 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_name_tips_tv);
                }
            }
        });
        final int i22 = 6;
        this.f29424z0 = C2131j.b(new Function0(this) { // from class: ub.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42745b;

            {
                this.f42745b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42745b;
                switch (i22) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.self_error_tips_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_self_phone_img);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.second_manual_input_group);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.self_phone_num_et);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.self_phone_content_tips_tv);
                    case 5:
                        int i23 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_category_tips_tv);
                    case 6:
                        int i24 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_error_tips_tv);
                    case 7:
                        int i25 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_two_tv);
                    case 8:
                        int i26 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_second_phone_img);
                    case 9:
                        int i27 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_phone_et);
                    case 10:
                        int i28 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_second_name_img);
                    default:
                        int i29 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_name_tips_tv);
                }
            }
        });
        final int i23 = 7;
        this.f29379A0 = C2131j.b(new Function0(this) { // from class: ub.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42745b;

            {
                this.f42745b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42745b;
                switch (i23) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.self_error_tips_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_self_phone_img);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.second_manual_input_group);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.self_phone_num_et);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.self_phone_content_tips_tv);
                    case 5:
                        int i24 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_category_tips_tv);
                    case 6:
                        int i25 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_error_tips_tv);
                    case 7:
                        int i26 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_two_tv);
                    case 8:
                        int i27 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_second_phone_img);
                    case 9:
                        int i28 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_phone_et);
                    case 10:
                        int i29 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_second_name_img);
                    default:
                        int i210 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_name_tips_tv);
                }
            }
        });
        final int i24 = 8;
        this.f29380B0 = C2131j.b(new Function0(this) { // from class: ub.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42745b;

            {
                this.f42745b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42745b;
                switch (i24) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.self_error_tips_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_self_phone_img);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.second_manual_input_group);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.self_phone_num_et);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.self_phone_content_tips_tv);
                    case 5:
                        int i25 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_category_tips_tv);
                    case 6:
                        int i26 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_error_tips_tv);
                    case 7:
                        int i27 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_two_tv);
                    case 8:
                        int i28 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_second_phone_img);
                    case 9:
                        int i29 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_phone_et);
                    case 10:
                        int i210 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_second_name_img);
                    default:
                        int i211 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_name_tips_tv);
                }
            }
        });
        final int i25 = 9;
        this.f29381C0 = C2131j.b(new Function0(this) { // from class: ub.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42745b;

            {
                this.f42745b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42745b;
                switch (i25) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.self_error_tips_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_self_phone_img);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.second_manual_input_group);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.self_phone_num_et);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.self_phone_content_tips_tv);
                    case 5:
                        int i26 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_category_tips_tv);
                    case 6:
                        int i27 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_error_tips_tv);
                    case 7:
                        int i28 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_two_tv);
                    case 8:
                        int i29 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_second_phone_img);
                    case 9:
                        int i210 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_phone_et);
                    case 10:
                        int i211 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_second_name_img);
                    default:
                        int i212 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_name_tips_tv);
                }
            }
        });
        final int i26 = 10;
        this.f29382D0 = C2131j.b(new Function0(this) { // from class: ub.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42745b;

            {
                this.f42745b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42745b;
                switch (i26) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.self_error_tips_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_self_phone_img);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.second_manual_input_group);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.self_phone_num_et);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.self_phone_content_tips_tv);
                    case 5:
                        int i27 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_category_tips_tv);
                    case 6:
                        int i28 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_error_tips_tv);
                    case 7:
                        int i29 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_two_tv);
                    case 8:
                        int i210 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_second_phone_img);
                    case 9:
                        int i211 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_phone_et);
                    case 10:
                        int i212 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_second_name_img);
                    default:
                        int i213 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_name_tips_tv);
                }
            }
        });
        final int i27 = 11;
        this.f29383E0 = C2131j.b(new Function0(this) { // from class: ub.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42745b;

            {
                this.f42745b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42745b;
                switch (i27) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.self_error_tips_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_self_phone_img);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.second_manual_input_group);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.self_phone_num_et);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.self_phone_content_tips_tv);
                    case 5:
                        int i28 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_category_tips_tv);
                    case 6:
                        int i29 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_error_tips_tv);
                    case 7:
                        int i210 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_two_tv);
                    case 8:
                        int i211 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_second_phone_img);
                    case 9:
                        int i212 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_phone_et);
                    case 10:
                        int i213 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_second_name_img);
                    default:
                        int i214 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_name_tips_tv);
                }
            }
        });
        final int i28 = 1;
        this.f29384F0 = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i28) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i115 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i116 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i117 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i118 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i119 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i29 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i210 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i211 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i212 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i213 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i214 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i215 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i216 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i217 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i218 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i30 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i31 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i32 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i33 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i34 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i36 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i37 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i38 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i39 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i29 = 3;
        this.f29385G0 = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i29) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i115 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i116 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i117 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i118 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i119 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i210 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i211 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i212 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i213 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i214 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i215 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i216 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i217 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i218 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i219 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i30 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i31 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i32 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i33 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i34 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i36 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i37 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i38 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i39 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i30 = 4;
        this.f29386H0 = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i30) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i115 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i116 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i117 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i118 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i119 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i210 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i211 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i212 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i213 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i214 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i215 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i216 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i217 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i218 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i219 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i31 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i32 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i33 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i34 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i35 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i36 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i37 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i38 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i39 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i310 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i31 = 5;
        this.f29387I0 = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i31) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i115 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i116 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i117 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i118 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i119 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i210 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i211 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i212 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i213 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i214 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i215 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i216 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i217 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i218 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i219 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i32 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i33 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i34 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i35 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i36 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i37 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i38 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i39 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i310 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i311 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i32 = 6;
        this.f29388J0 = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i32) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i115 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i116 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i117 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i118 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i119 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i210 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i211 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i212 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i213 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i214 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i215 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i216 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i217 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i218 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i219 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i33 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i34 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i35 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i36 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i37 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i38 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i39 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i310 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i311 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i312 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i33 = 7;
        this.f29389K0 = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i33) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i115 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i116 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i117 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i118 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i119 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i210 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i211 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i212 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i213 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i214 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i215 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i216 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i217 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i218 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i219 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i34 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i35 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i36 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i37 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i38 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i39 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i310 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i311 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i312 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i313 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i34 = 8;
        this.f29390L0 = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i34) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i115 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i116 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i117 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i118 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i119 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i210 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i211 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i212 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i213 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i214 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i215 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i216 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i217 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i218 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i219 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i35 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i36 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i37 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i38 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i39 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i310 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i311 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i312 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i313 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i314 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i35 = 9;
        this.f29391M0 = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i35) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i115 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i116 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i117 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i118 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i119 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i210 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i211 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i212 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i213 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i214 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i215 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i216 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i217 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i218 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i219 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i36 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i37 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i38 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i39 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i310 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i311 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i312 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i313 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i314 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i315 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i36 = 10;
        this.f29392N0 = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i36) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i115 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i116 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i117 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i118 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i119 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i210 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i211 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i212 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i213 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i214 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i215 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i216 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i217 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i218 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i219 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i37 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i38 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i39 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i310 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i311 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i312 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i313 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i314 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i315 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i316 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i37 = 12;
        this.f29393O0 = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i37) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i115 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i116 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i117 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i118 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i119 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i210 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i211 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i212 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i213 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i214 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i215 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i216 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i217 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i218 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i219 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i38 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i39 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i310 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i311 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i312 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i313 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i314 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i315 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i316 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i317 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i38 = 13;
        this.f29394P0 = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i38) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i115 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i116 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i117 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i118 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i119 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i210 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i211 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i212 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i213 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i214 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i215 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i216 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i217 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i218 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i219 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i39 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i310 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i311 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i312 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i313 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i314 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i315 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i316 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i317 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i318 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i39 = 15;
        this.f29395Q0 = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i39) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i115 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i116 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i117 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i118 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i119 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i210 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i211 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i212 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i213 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i214 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i215 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i216 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i217 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i218 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i219 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i310 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i311 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i312 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i313 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i314 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i316 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i317 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i318 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i319 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i40 = 16;
        this.f29396R0 = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i40) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i115 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i116 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i117 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i118 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i119 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i210 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i211 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i212 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i213 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i214 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i215 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i216 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i217 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i218 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i219 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i310 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i311 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i312 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i313 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i314 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i316 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i317 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i318 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i319 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i41 = 17;
        this.f29397S0 = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i41) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i115 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i116 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i117 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i118 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i119 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i210 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i211 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i212 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i213 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i214 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i215 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i216 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i217 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i218 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i219 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i310 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i311 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i312 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i313 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i314 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i316 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i317 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i318 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i319 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i42 = 18;
        this.T0 = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i42) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i115 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i116 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i117 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i118 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i119 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i210 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i211 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i212 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i213 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i214 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i215 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i216 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i217 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i218 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i219 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i310 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i311 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i312 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i313 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i314 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i316 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i317 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i318 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i319 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i43 = 19;
        this.f29398U0 = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i43) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i115 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i116 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i117 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i118 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i119 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i210 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i211 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i212 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i213 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i214 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i215 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i216 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i217 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i218 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i219 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i310 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i311 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i312 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i313 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i314 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i316 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i317 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i318 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i319 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i44 = 20;
        this.f29399V0 = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i44) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i115 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i116 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i117 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i118 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i119 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i210 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i211 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i212 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i213 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i214 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i215 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i216 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i217 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i218 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i219 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i310 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i311 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i312 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i313 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i314 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i316 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i317 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i318 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i319 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i45 = 21;
        this.f29400W0 = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i45) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i115 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i116 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i117 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i118 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i119 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i210 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i211 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i212 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i213 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i214 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i215 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i216 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i217 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i218 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i219 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i310 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i311 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i312 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i313 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i314 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i316 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i317 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i318 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i319 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i46 = 23;
        this.f29401X0 = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i46) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i115 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i116 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i117 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i118 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i119 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i210 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i211 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i212 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i213 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i214 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i215 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i216 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i217 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i218 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i219 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i310 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i311 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i312 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i313 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i314 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i316 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i317 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i318 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i319 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i47 = 24;
        this.f29403Y0 = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i47) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i115 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i116 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i117 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i118 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i119 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i210 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i211 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i212 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i213 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i214 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i215 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i216 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i217 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i218 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i219 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i310 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i311 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i312 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i313 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i314 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i316 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i317 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i318 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i319 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i48 = 25;
        this.Z0 = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i48) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i115 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i116 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i117 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i118 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i119 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i210 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i211 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i212 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i213 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i214 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i215 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i216 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i217 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i218 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i219 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i310 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i311 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i312 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i313 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i314 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i316 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i317 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i318 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i319 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i49 = 27;
        this.f29405a1 = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i49) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i115 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i116 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i117 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i118 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i119 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i210 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i211 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i212 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i213 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i214 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i215 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i216 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i217 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i218 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i219 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i310 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i311 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i312 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i313 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i314 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i316 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i317 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i318 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i319 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
        final int i50 = 28;
        this.f29406b1 = C2131j.b(new Function0(this) { // from class: ub.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42741b;

            {
                this.f42741b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcContactActivity ocContactActivity = this.f42741b;
                switch (i50) {
                    case 0:
                        int i110 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_right_tv);
                    case 1:
                        int i111 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.second_contact_last_name_et);
                    case 2:
                        int i112 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.router_title_tv);
                    case 3:
                        int i113 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_select_error_tips_tv);
                    case 4:
                        int i114 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_number_tv);
                    case 5:
                        int i115 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.second_contact_name_tv);
                    case 6:
                        int i116 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.second_select_ll);
                    case 7:
                        int i117 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_category_tips_tv);
                    case 8:
                        int i118 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.first_contact_rv);
                    case 9:
                        int i119 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_first_category_tv);
                    case 10:
                        int i210 = OcContactActivity.f29378l1;
                        return (Group) ocContactActivity.findViewById(e.first_manual_input_group);
                    case 11:
                        int i211 = OcContactActivity.f29378l1;
                        return (RecyclerView) ocContactActivity.findViewById(e.second_contact_rv);
                    case 12:
                        int i212 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_error_tips_tv);
                    case 13:
                        int i213 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.phone_num_one_tv);
                    case 14:
                        int i214 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_close_img);
                    case 15:
                        int i215 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_phone_img);
                    case 16:
                        int i216 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_phone_et);
                    case 17:
                        int i217 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.clear_first_name_img);
                    case 18:
                        int i218 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_name_tips_tv);
                    case 19:
                        int i219 = OcContactActivity.f29378l1;
                        return (EditText) ocContactActivity.findViewById(e.first_contact_last_name_et);
                    case 20:
                        int i310 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_select_error_tips_tv);
                    case 21:
                        int i311 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_number_tv);
                    case 22:
                        int i312 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.oc_second_category_tv);
                    case 23:
                        int i313 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.first_contact_name_tv);
                    case 24:
                        int i314 = OcContactActivity.f29378l1;
                        return (LinearLayout) ocContactActivity.findViewById(e.first_select_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = OcContactActivity.f29378l1;
                        return (OpenAccountRouterProgressViewV2) ocContactActivity.findViewById(e.router_progress_view);
                    case 26:
                        int i316 = OcContactActivity.f29378l1;
                        return (ImageView) ocContactActivity.findViewById(e.router_back_img);
                    case 27:
                        int i317 = OcContactActivity.f29378l1;
                        return (NestedScrollView) ocContactActivity.findViewById(e.contact_nsv);
                    case 28:
                        int i318 = OcContactActivity.f29378l1;
                        return (TextView) ocContactActivity.findViewById(e.tvDeclinedMsg);
                    default:
                        int i319 = OcContactActivity.f29378l1;
                        return (Button) ocContactActivity.findViewById(e.contact_next_bt);
                }
            }
        });
    }

    public static boolean z(String str) {
        return !TextUtils.isEmpty(str) && str.length() >= 10 && str.length() <= 11 && (str.length() != 10 || y.m(str, "7", false) || y.m(str, "8", false) || y.m(str, "9", false)) && (str.length() != 11 || y.m(str, "0", false));
    }

    public final ImageView A() {
        Object value = this.f29397S0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    public final ImageView B() {
        Object value = this.f29395Q0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    public final ImageView C() {
        Object value = this.f29382D0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    public final ImageView D() {
        Object value = this.f29380B0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    public final ImageView E() {
        Object value = this.f29417s0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    public final EditText F() {
        Object value = this.f29398U0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (EditText) value;
    }

    public final TextView G() {
        Object value = this.f29401X0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final TextView H() {
        Object value = this.f29400W0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final EditText I() {
        Object value = this.f29396R0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (EditText) value;
    }

    public final RecyclerView J() {
        Object value = this.f29390L0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    public final TextView K() {
        Object value = this.f29393O0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final TextView L() {
        Object value = this.T0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final TextView M() {
        Object value = this.f29399V0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final LinearLayout N() {
        Object value = this.f29403Y0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    public final EditText O() {
        Object value = this.f29384F0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (EditText) value;
    }

    public final TextView P() {
        Object value = this.f29387I0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final TextView Q() {
        Object value = this.f29386H0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final EditText R() {
        Object value = this.f29381C0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (EditText) value;
    }

    public final RecyclerView S() {
        Object value = this.f29421w0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    public final TextView T() {
        Object value = this.f29424z0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final TextView U() {
        Object value = this.f29383E0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final TextView V() {
        Object value = this.f29385G0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final LinearLayout W() {
        Object value = this.f29388J0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    public final TextView X() {
        Object value = this.f29416r0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final EditText Y() {
        Object value = this.f29418t0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (EditText) value;
    }

    public final void Z(int i7, String str, String str2) {
        F6.d.h(this.TAG, 3, "inputSelectContact >>> contactType = " + i7 + ", name = " + str + ", phoneNumber = " + str2);
        String strReplace = str2 != null ? new Regex("[^0-9]").replace(str2, "") : null;
        if (strReplace != null && y.m(strReplace, "0234", false)) {
            strReplace = strReplace.substring(4, strReplace.length());
            Intrinsics.checkNotNullExpressionValue(strReplace, "substring(...)");
        } else if (strReplace != null && y.m(strReplace, "234", false)) {
            strReplace = strReplace.substring(3, strReplace.length());
            Intrinsics.checkNotNullExpressionValue(strReplace, "substring(...)");
        }
        boolean zC = Intrinsics.c(r0.w0(BaseApplication.get().getUser().getPhoneNumber()), strReplace);
        if (i7 == 1000) {
            G().setText(str);
            H().setText(strReplace);
            H().setVisibility(0);
            N().setBackgroundResource(Ya.d.cs_oc_contact_et_bg);
            M().setVisibility(8);
            if (zC) {
                M().setText(getString(Ya.g.cs_oc_not_use_own_phone_number));
                M().setVisibility(0);
                N().setBackgroundResource(Ya.d.cs_oc_contact_et_bg);
                return;
            } else {
                if (z(strReplace != null ? strReplace : "")) {
                    return;
                }
                M().setText(getString(Ya.g.cs_oc_input_correct_number));
                M().setVisibility(0);
                N().setBackgroundResource(Ya.d.cs_oc_contact_et_bg);
                return;
            }
        }
        if (i7 != 1001) {
            return;
        }
        P().setText(str);
        Q().setText(strReplace);
        Q().setVisibility(0);
        W().setBackgroundResource(Ya.d.cs_oc_contact_et_bg);
        V().setVisibility(8);
        if (zC) {
            V().setText(getString(Ya.g.cs_oc_not_use_own_phone_number));
            V().setVisibility(0);
            W().setBackgroundResource(Ya.d.cs_oc_contact_et_bg);
        } else {
            if (z(strReplace != null ? strReplace : "")) {
                return;
            }
            V().setText(getString(Ya.g.cs_oc_input_correct_number));
            V().setVisibility(0);
            W().setBackgroundResource(Ya.d.cs_oc_contact_et_bg);
        }
    }

    public final void a0(int i7, String str) {
        showLoadingDialog(true);
        p221ob.c.f40268a.getInstance().getClass();
        p221ob.c.a().queryPhoneNumValid(str).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new q(this, i7, 3));
    }

    public final void b0(TextView textView) {
        Rect rect = new Rect();
        t tVar = this.f29405a1;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((NestedScrollView) value).getHitRect(rect);
        if (textView.getLocalVisibleRect(rect)) {
            return;
        }
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((NestedScrollView) value2).post(new p297te.g(1, this, textView));
    }

    public final void c0() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("1.Contact list");
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        OcContactPermissionTipsDialog ocContactPermissionTipsDialog = new OcContactPermissionTipsDialog(this);
        ocContactPermissionTipsDialog.setContent(sb2);
        ocContactPermissionTipsDialog.setOnDismissListener(new DialogInterfaceOnDismissListenerC0168j(5));
        ocContactPermissionTipsDialog.show();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_contact_layout;
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity, com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        super.initData();
        l lVar = ((OcApplyBaseViewModel) l()).f30895C;
        if (lVar != null) {
            lVar.e(this, new s(new p141j9.t(this, this, 23), 0, (byte) 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i10 == -1) {
            if (i7 == 1000 || i7 == 1001) {
                if (intent == null) {
                    ToastUtils.showLong("select nothing", new Object[0]);
                } else {
                    Z(i7, intent.getStringExtra("contact_name"), intent.getStringExtra("PHONE_NUMBER"));
                }
            }
        }
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        K k2 = this.d1;
        if (k2 == null) {
            Intrinsics.n("mFirstLabelAdapter");
            throw null;
        }
        if (k2.f44185g != -1) {
            SPUtils sPUtils = SPUtils.getInstance();
            ArrayList arrayList = this.f29407c1;
            if (arrayList == null) {
                Intrinsics.n("mFirstLabelData");
                throw null;
            }
            K k8 = this.d1;
            if (k8 == null) {
                Intrinsics.n("mFirstLabelAdapter");
                throw null;
            }
            sPUtils.put("oc_first_contact_tag", (String) arrayList.get(k8.f44185g));
        }
        if (F().getVisibility() == 0 && !TextUtils.isEmpty(F().getText())) {
            SPUtils.getInstance().put("oc_first_contact_name", F().getText().toString());
        } else if (G().getVisibility() == 0 && !TextUtils.isEmpty(G().getText())) {
            SPUtils.getInstance().put("oc_first_contact_name", G().getText().toString());
        }
        if (I().getVisibility() == 0 && !TextUtils.isEmpty(I().getText())) {
            SPUtils.getInstance().put("oc_first_contact_phone", I().getText().toString());
        } else if (H().getVisibility() == 0 && !TextUtils.isEmpty(H().getText())) {
            SPUtils.getInstance().put("oc_first_contact_phone", H().getText().toString());
        }
        K k10 = this.f1;
        if (k10 == null) {
            Intrinsics.n("mSecondLabelAdapter");
            throw null;
        }
        if (k10.f44185g != -1) {
            SPUtils sPUtils2 = SPUtils.getInstance();
            ArrayList arrayList2 = this.f29408e1;
            if (arrayList2 == null) {
                Intrinsics.n("mSecondLabelData");
                throw null;
            }
            K k11 = this.f1;
            if (k11 == null) {
                Intrinsics.n("mSecondLabelAdapter");
                throw null;
            }
            sPUtils2.put("oc_second_contact_tag", (String) arrayList2.get(k11.f44185g));
        }
        if (O().getVisibility() == 0 && !TextUtils.isEmpty(O().getText())) {
            SPUtils.getInstance().put("oc_second_contact_name", O().getText().toString());
        } else if (P().getVisibility() == 0 && !TextUtils.isEmpty(P().getText())) {
            SPUtils.getInstance().put("oc_second_contact_name", P().getText().toString());
        }
        if (R().getVisibility() == 0 && !TextUtils.isEmpty(R().getText())) {
            SPUtils.getInstance().put("oc_second_contact_phone", R().getText().toString());
        } else if (Q().getVisibility() == 0 && !TextUtils.isEmpty(Q().getText())) {
            SPUtils.getInstance().put("oc_second_contact_phone", Q().getText().toString());
        }
        SPUtils.getInstance().put("oc_self_phone", Y().getText().toString());
        HashMap map = new HashMap();
        map.put("screen_name", "OcContactActivity");
        K k12 = this.d1;
        if (k12 == null) {
            Intrinsics.n("mFirstLabelAdapter");
            throw null;
        }
        if (k12.f44185g != -1) {
            String resourceEntryName = getResources().getResourceEntryName(J().getId());
            ArrayList arrayList3 = this.f29407c1;
            if (arrayList3 == null) {
                Intrinsics.n("mFirstLabelData");
                throw null;
            }
            K k13 = this.d1;
            if (k13 == null) {
                Intrinsics.n("mFirstLabelAdapter");
                throw null;
            }
            map.put(resourceEntryName, arrayList3.get(k13.f44185g));
        }
        if (!TextUtils.isEmpty(F().getText())) {
            map.put(getResources().getResourceEntryName(F().getId()), F().getText());
        }
        if (!TextUtils.isEmpty(I().getText())) {
            map.put(getResources().getResourceEntryName(I().getId()), I().getText());
        }
        K k14 = this.f1;
        if (k14 == null) {
            Intrinsics.n("mSecondLabelAdapter");
            throw null;
        }
        if (k14.f44185g != -1) {
            String resourceEntryName2 = getResources().getResourceEntryName(S().getId());
            ArrayList arrayList4 = this.f29408e1;
            if (arrayList4 == null) {
                Intrinsics.n("mSecondLabelData");
                throw null;
            }
            K k15 = this.f1;
            if (k15 == null) {
                Intrinsics.n("mSecondLabelAdapter");
                throw null;
            }
            map.put(resourceEntryName2, arrayList4.get(k15.f44185g));
        }
        if (!TextUtils.isEmpty(O().getText())) {
            map.put(getResources().getResourceEntryName(O().getId()), O().getText());
        }
        if (!TextUtils.isEmpty(R().getText())) {
            map.put(getResources().getResourceEntryName(R().getId()), R().getText());
        }
        if (!TextUtils.isEmpty(Y().getText())) {
            map.put(getResources().getResourceEntryName(Y().getId()), Y().getText());
        }
        n0.g().w("oc_input_router_screen", map);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity, androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback
    public final void onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i7, permissions, grantResults);
        switch (i7) {
            case 1000:
            case 1001:
                for (int i10 : grantResults) {
                    if (i10 != 0) {
                        ToastUtils.showShort(getString(Ya.g.cs_you_reject_contact), new Object[0]);
                    }
                    break;
                }
                try {
                    ARouter.getInstance().build("/credit_score/oc_select_contact_activity").navigation(this, i7);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
                break;
            case 1002:
                int length = grantResults.length;
                for (int i11 = 0; i11 < length; i11++) {
                    if (grantResults[i11] != 0) {
                        if (this.f29410h1) {
                            c0();
                            this.f29410h1 = false;
                        } else if (!AbstractC1032a.h(this, permissions[i11])) {
                            Intent intent = new Intent();
                            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + getPackageName()));
                            startActivity(intent);
                            finish();
                        } else if (grantResults[i11] != 0) {
                            c0();
                        }
                    }
                    break;
                }
                y();
                break;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        N().setVisibility(0);
        Object value = this.f29392N0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((Group) value).setVisibility(8);
        W().setVisibility(0);
        Object value2 = this.f29423y0.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((Group) value2).setVisibility(8);
        Object value3 = this.f29391M0.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((TextView) value3).setCompoundDrawablesWithIntrinsicBounds(Ya.d.cs_cl_person, 0, 0, 0);
        Object value4 = this.f29422x0.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((TextView) value4).setCompoundDrawablesWithIntrinsicBounds(Ya.d.cs_cl_person, 0, 0, 0);
        OcApplyBaseViewModel ocApplyBaseViewModel = (OcApplyBaseViewModel) l();
        if (ocApplyBaseViewModel != null) {
            OcApplyData ocApplyData = this.f29248B;
            p140j8.f.s(ocApplyBaseViewModel, new C0351j(ocApplyData != null ? ocApplyData.getApplyId() : null, null), ocApplyBaseViewModel.f30895C, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity, com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        List<OcRouterDetail> routeInfoList;
        OcApplyData ocApplyData;
        super.setupView();
        initStatusBar(getColor(L6.b.ppColorBackgroundDark));
        BarUtils.setStatusBarLightMode(this, !isDarkMode());
        Object value = this.f29404Z.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((TextView) value).setText(o());
        this.f29411i1 = getIntent().getStringExtra("oc_router_operate_type");
        boolean zC = Intrinsics.c(this.f29249C, "oc_use_type_alone");
        t tVar = this.f29412k0;
        t tVar2 = this.Z0;
        if (zC) {
            Object value2 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((ImageView) value2).setVisibility(8);
            Object value3 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ((OpenAccountRouterProgressViewV2) value3).setVisibility(8);
        } else {
            OcApplyData ocApplyData2 = this.f29248B;
            if (ocApplyData2 != null && (routeInfoList = ocApplyData2.getRouteInfoList()) != null) {
                Object value4 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                ((OpenAccountRouterProgressViewV2) value4).setVisibility(0);
                Object value5 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                ((OpenAccountRouterProgressViewV2) value5).c(p(), routeInfoList);
            }
        }
        if (Intrinsics.c(this.f29261w, "OK_CARD") && (ocApplyData = this.f29248B) != null) {
            ocApplyData.getPlIsInstall();
        }
        String string = SPUtils.getInstance().getString("oc_first_contact_tag", getString(Ya.g.cs_family));
        String string2 = SPUtils.getInstance().getString("oc_first_contact_name");
        String string3 = SPUtils.getInstance().getString("oc_first_contact_phone");
        String string4 = SPUtils.getInstance().getString("oc_second_contact_tag", getString(Ya.g.cs_family));
        String string5 = SPUtils.getInstance().getString("oc_second_contact_name");
        String string6 = SPUtils.getInstance().getString("oc_second_contact_phone");
        String string7 = SPUtils.getInstance().getString("oc_self_phone");
        String string8 = getString(Ya.g.cs_oc_select_a_contact);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        if (!TextUtils.isEmpty(string2) && !Intrinsics.c(string2, string8)) {
            G().setText(string2);
            H().setText(string3);
            H().setVisibility(0);
        }
        F().setText(string2);
        I().setText(string3);
        if (!TextUtils.isEmpty(string5) && !Intrinsics.c(string5, string8)) {
            P().setText(string5);
            Q().setText(string6);
            Q().setVisibility(0);
        }
        O().setText(string5);
        R().setText(string6);
        Y().setText(string7);
        Object value6 = this.f29419u0.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        TextView textView = (TextView) value6;
        int i7 = Ya.g.cs_oc_self_phone_tips;
        String strA = G.A();
        String strE0 = r0.E0(strA);
        if (!TextUtils.isEmpty(strE0)) {
            strA = strE0.replace(" ", "-");
        }
        textView.setText(getString(i7, strA));
        ArrayList arrayList = new ArrayList();
        arrayList.add(getString(Ya.g.cs_family));
        arrayList.add(getString(Ya.g.cs_friends));
        arrayList.add(getString(Ya.g.cs_colleague));
        arrayList.add(getString(Ya.g.cs_other));
        this.f29407c1 = arrayList;
        ArrayList arrayList2 = this.f29407c1;
        if (arrayList2 == null) {
            Intrinsics.n("mFirstLabelData");
            throw null;
        }
        this.d1 = new K(this, arrayList2, string);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this);
        flexboxLayoutManager.setFlexDirection(0);
        flexboxLayoutManager.setFlexWrap(1);
        J().setLayoutManager(flexboxLayoutManager);
        J().addItemDecoration(new H());
        RecyclerView recyclerViewJ = J();
        K k2 = this.d1;
        if (k2 == null) {
            Intrinsics.n("mFirstLabelAdapter");
            throw null;
        }
        recyclerViewJ.setAdapter(k2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(getString(Ya.g.cs_family));
        arrayList3.add(getString(Ya.g.cs_friends));
        arrayList3.add(getString(Ya.g.cs_colleague));
        arrayList3.add(getString(Ya.g.cs_other));
        this.f29408e1 = arrayList3;
        ArrayList arrayList4 = this.f29408e1;
        if (arrayList4 == null) {
            Intrinsics.n("mSecondLabelData");
            throw null;
        }
        this.f1 = new K(this, arrayList4, string4);
        FlexboxLayoutManager flexboxLayoutManager2 = new FlexboxLayoutManager(this);
        flexboxLayoutManager2.setFlexDirection(0);
        flexboxLayoutManager2.setFlexWrap(1);
        S().setLayoutManager(flexboxLayoutManager2);
        S().addItemDecoration(new I());
        RecyclerView recyclerViewS = S();
        K k8 = this.f1;
        if (k8 == null) {
            Intrinsics.n("mSecondLabelAdapter");
            throw null;
        }
        recyclerViewS.setAdapter(k8);
        Object value7 = this.f29414p0.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        p220oa.h.l(new E(this, 0), (ImageView) value7);
        Object value8 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
        p220oa.h.l(new E(this, 9), (ImageView) value8);
        Object value9 = this.f29402Y.getValue();
        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
        p220oa.h.l(new E(this, 10), (TextView) value9);
        p220oa.h.l(new E(this, 11), N());
        p220oa.h.l(new E(this, 12), W());
        K k10 = this.d1;
        if (k10 == null) {
            Intrinsics.n("mFirstLabelAdapter");
            throw null;
        }
        r itemClickListener = new r(this, 25);
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        k10.f4993c = itemClickListener;
        F().addTextChangedListener(new p310ub.G(this, 4));
        final int i10 = 0;
        F().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: ub.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42753b;

            {
                this.f42753b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z3) {
                OcContactActivity ocContactActivity = this.f42753b;
                switch (i10) {
                    case 0:
                        int i11 = OcContactActivity.f29378l1;
                        if (!z3) {
                            ocContactActivity.A().setVisibility(8);
                        } else if (!TextUtils.isEmpty(ocContactActivity.Y().getText())) {
                            ocContactActivity.A().setVisibility(0);
                        }
                        n0.g().m(ocContactActivity.getClass().getSimpleName().concat("_element_click"), "first_contact_last_name_et", String.valueOf(z3));
                        break;
                    case 1:
                        int i12 = OcContactActivity.f29378l1;
                        if (!z3) {
                            ocContactActivity.B().setVisibility(8);
                        } else if (!TextUtils.isEmpty(ocContactActivity.Y().getText())) {
                            ocContactActivity.B().setVisibility(0);
                        }
                        n0.g().m(ocContactActivity.getClass().getSimpleName().concat("_element_click"), "first_contact_phone_et", String.valueOf(z3));
                        break;
                    case 2:
                        int i13 = OcContactActivity.f29378l1;
                        if (!z3) {
                            ocContactActivity.C().setVisibility(8);
                        } else if (!TextUtils.isEmpty(ocContactActivity.Y().getText())) {
                            ocContactActivity.C().setVisibility(0);
                        }
                        n0.g().m(ocContactActivity.getClass().getSimpleName().concat("_element_click"), "second_contact_last_name_et", String.valueOf(z3));
                        break;
                    case 3:
                        int i14 = OcContactActivity.f29378l1;
                        if (!z3) {
                            ocContactActivity.D().setVisibility(8);
                        } else if (!TextUtils.isEmpty(ocContactActivity.Y().getText())) {
                            ocContactActivity.D().setVisibility(0);
                        }
                        n0.g().m(ocContactActivity.getClass().getSimpleName().concat("_element_click"), "second_contact_phone_et", String.valueOf(z3));
                        break;
                    default:
                        int i15 = OcContactActivity.f29378l1;
                        if (!z3) {
                            ocContactActivity.E().setVisibility(8);
                        } else if (!TextUtils.isEmpty(ocContactActivity.Y().getText())) {
                            ocContactActivity.E().setVisibility(0);
                        }
                        n0.g().m(ocContactActivity.getClass().getSimpleName().concat("_element_click"), "self_phone_num_et", String.valueOf(z3));
                        break;
                }
            }
        });
        K k11 = this.f1;
        if (k11 == null) {
            Intrinsics.n("mSecondLabelAdapter");
            throw null;
        }
        Oe.a itemClickListener2 = new Oe.a(this, 27);
        Intrinsics.checkNotNullParameter(itemClickListener2, "itemClickListener");
        k11.f4993c = itemClickListener2;
        I().addTextChangedListener(new p310ub.G(this, 0));
        final int i11 = 1;
        I().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: ub.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42753b;

            {
                this.f42753b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z3) {
                OcContactActivity ocContactActivity = this.f42753b;
                switch (i11) {
                    case 0:
                        int i12 = OcContactActivity.f29378l1;
                        if (!z3) {
                            ocContactActivity.A().setVisibility(8);
                        } else if (!TextUtils.isEmpty(ocContactActivity.Y().getText())) {
                            ocContactActivity.A().setVisibility(0);
                        }
                        n0.g().m(ocContactActivity.getClass().getSimpleName().concat("_element_click"), "first_contact_last_name_et", String.valueOf(z3));
                        break;
                    case 1:
                        int i13 = OcContactActivity.f29378l1;
                        if (!z3) {
                            ocContactActivity.B().setVisibility(8);
                        } else if (!TextUtils.isEmpty(ocContactActivity.Y().getText())) {
                            ocContactActivity.B().setVisibility(0);
                        }
                        n0.g().m(ocContactActivity.getClass().getSimpleName().concat("_element_click"), "first_contact_phone_et", String.valueOf(z3));
                        break;
                    case 2:
                        int i14 = OcContactActivity.f29378l1;
                        if (!z3) {
                            ocContactActivity.C().setVisibility(8);
                        } else if (!TextUtils.isEmpty(ocContactActivity.Y().getText())) {
                            ocContactActivity.C().setVisibility(0);
                        }
                        n0.g().m(ocContactActivity.getClass().getSimpleName().concat("_element_click"), "second_contact_last_name_et", String.valueOf(z3));
                        break;
                    case 3:
                        int i15 = OcContactActivity.f29378l1;
                        if (!z3) {
                            ocContactActivity.D().setVisibility(8);
                        } else if (!TextUtils.isEmpty(ocContactActivity.Y().getText())) {
                            ocContactActivity.D().setVisibility(0);
                        }
                        n0.g().m(ocContactActivity.getClass().getSimpleName().concat("_element_click"), "second_contact_phone_et", String.valueOf(z3));
                        break;
                    default:
                        int i16 = OcContactActivity.f29378l1;
                        if (!z3) {
                            ocContactActivity.E().setVisibility(8);
                        } else if (!TextUtils.isEmpty(ocContactActivity.Y().getText())) {
                            ocContactActivity.E().setVisibility(0);
                        }
                        n0.g().m(ocContactActivity.getClass().getSimpleName().concat("_element_click"), "self_phone_num_et", String.valueOf(z3));
                        break;
                }
            }
        });
        O().addTextChangedListener(new p310ub.G(this, 1));
        final int i12 = 2;
        O().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: ub.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42753b;

            {
                this.f42753b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z3) {
                OcContactActivity ocContactActivity = this.f42753b;
                switch (i12) {
                    case 0:
                        int i13 = OcContactActivity.f29378l1;
                        if (!z3) {
                            ocContactActivity.A().setVisibility(8);
                        } else if (!TextUtils.isEmpty(ocContactActivity.Y().getText())) {
                            ocContactActivity.A().setVisibility(0);
                        }
                        n0.g().m(ocContactActivity.getClass().getSimpleName().concat("_element_click"), "first_contact_last_name_et", String.valueOf(z3));
                        break;
                    case 1:
                        int i14 = OcContactActivity.f29378l1;
                        if (!z3) {
                            ocContactActivity.B().setVisibility(8);
                        } else if (!TextUtils.isEmpty(ocContactActivity.Y().getText())) {
                            ocContactActivity.B().setVisibility(0);
                        }
                        n0.g().m(ocContactActivity.getClass().getSimpleName().concat("_element_click"), "first_contact_phone_et", String.valueOf(z3));
                        break;
                    case 2:
                        int i15 = OcContactActivity.f29378l1;
                        if (!z3) {
                            ocContactActivity.C().setVisibility(8);
                        } else if (!TextUtils.isEmpty(ocContactActivity.Y().getText())) {
                            ocContactActivity.C().setVisibility(0);
                        }
                        n0.g().m(ocContactActivity.getClass().getSimpleName().concat("_element_click"), "second_contact_last_name_et", String.valueOf(z3));
                        break;
                    case 3:
                        int i16 = OcContactActivity.f29378l1;
                        if (!z3) {
                            ocContactActivity.D().setVisibility(8);
                        } else if (!TextUtils.isEmpty(ocContactActivity.Y().getText())) {
                            ocContactActivity.D().setVisibility(0);
                        }
                        n0.g().m(ocContactActivity.getClass().getSimpleName().concat("_element_click"), "second_contact_phone_et", String.valueOf(z3));
                        break;
                    default:
                        int i17 = OcContactActivity.f29378l1;
                        if (!z3) {
                            ocContactActivity.E().setVisibility(8);
                        } else if (!TextUtils.isEmpty(ocContactActivity.Y().getText())) {
                            ocContactActivity.E().setVisibility(0);
                        }
                        n0.g().m(ocContactActivity.getClass().getSimpleName().concat("_element_click"), "self_phone_num_et", String.valueOf(z3));
                        break;
                }
            }
        });
        R().addTextChangedListener(new p310ub.G(this, 2));
        final int i13 = 3;
        R().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: ub.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42753b;

            {
                this.f42753b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z3) {
                OcContactActivity ocContactActivity = this.f42753b;
                switch (i13) {
                    case 0:
                        int i14 = OcContactActivity.f29378l1;
                        if (!z3) {
                            ocContactActivity.A().setVisibility(8);
                        } else if (!TextUtils.isEmpty(ocContactActivity.Y().getText())) {
                            ocContactActivity.A().setVisibility(0);
                        }
                        n0.g().m(ocContactActivity.getClass().getSimpleName().concat("_element_click"), "first_contact_last_name_et", String.valueOf(z3));
                        break;
                    case 1:
                        int i15 = OcContactActivity.f29378l1;
                        if (!z3) {
                            ocContactActivity.B().setVisibility(8);
                        } else if (!TextUtils.isEmpty(ocContactActivity.Y().getText())) {
                            ocContactActivity.B().setVisibility(0);
                        }
                        n0.g().m(ocContactActivity.getClass().getSimpleName().concat("_element_click"), "first_contact_phone_et", String.valueOf(z3));
                        break;
                    case 2:
                        int i16 = OcContactActivity.f29378l1;
                        if (!z3) {
                            ocContactActivity.C().setVisibility(8);
                        } else if (!TextUtils.isEmpty(ocContactActivity.Y().getText())) {
                            ocContactActivity.C().setVisibility(0);
                        }
                        n0.g().m(ocContactActivity.getClass().getSimpleName().concat("_element_click"), "second_contact_last_name_et", String.valueOf(z3));
                        break;
                    case 3:
                        int i17 = OcContactActivity.f29378l1;
                        if (!z3) {
                            ocContactActivity.D().setVisibility(8);
                        } else if (!TextUtils.isEmpty(ocContactActivity.Y().getText())) {
                            ocContactActivity.D().setVisibility(0);
                        }
                        n0.g().m(ocContactActivity.getClass().getSimpleName().concat("_element_click"), "second_contact_phone_et", String.valueOf(z3));
                        break;
                    default:
                        int i18 = OcContactActivity.f29378l1;
                        if (!z3) {
                            ocContactActivity.E().setVisibility(8);
                        } else if (!TextUtils.isEmpty(ocContactActivity.Y().getText())) {
                            ocContactActivity.E().setVisibility(0);
                        }
                        n0.g().m(ocContactActivity.getClass().getSimpleName().concat("_element_click"), "self_phone_num_et", String.valueOf(z3));
                        break;
                }
            }
        });
        Y().addTextChangedListener(new p310ub.G(this, 3));
        final int i14 = 4;
        Y().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: ub.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactActivity f42753b;

            {
                this.f42753b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z3) {
                OcContactActivity ocContactActivity = this.f42753b;
                switch (i14) {
                    case 0:
                        int i15 = OcContactActivity.f29378l1;
                        if (!z3) {
                            ocContactActivity.A().setVisibility(8);
                        } else if (!TextUtils.isEmpty(ocContactActivity.Y().getText())) {
                            ocContactActivity.A().setVisibility(0);
                        }
                        n0.g().m(ocContactActivity.getClass().getSimpleName().concat("_element_click"), "first_contact_last_name_et", String.valueOf(z3));
                        break;
                    case 1:
                        int i16 = OcContactActivity.f29378l1;
                        if (!z3) {
                            ocContactActivity.B().setVisibility(8);
                        } else if (!TextUtils.isEmpty(ocContactActivity.Y().getText())) {
                            ocContactActivity.B().setVisibility(0);
                        }
                        n0.g().m(ocContactActivity.getClass().getSimpleName().concat("_element_click"), "first_contact_phone_et", String.valueOf(z3));
                        break;
                    case 2:
                        int i17 = OcContactActivity.f29378l1;
                        if (!z3) {
                            ocContactActivity.C().setVisibility(8);
                        } else if (!TextUtils.isEmpty(ocContactActivity.Y().getText())) {
                            ocContactActivity.C().setVisibility(0);
                        }
                        n0.g().m(ocContactActivity.getClass().getSimpleName().concat("_element_click"), "second_contact_last_name_et", String.valueOf(z3));
                        break;
                    case 3:
                        int i18 = OcContactActivity.f29378l1;
                        if (!z3) {
                            ocContactActivity.D().setVisibility(8);
                        } else if (!TextUtils.isEmpty(ocContactActivity.Y().getText())) {
                            ocContactActivity.D().setVisibility(0);
                        }
                        n0.g().m(ocContactActivity.getClass().getSimpleName().concat("_element_click"), "second_contact_phone_et", String.valueOf(z3));
                        break;
                    default:
                        int i19 = OcContactActivity.f29378l1;
                        if (!z3) {
                            ocContactActivity.E().setVisibility(8);
                        } else if (!TextUtils.isEmpty(ocContactActivity.Y().getText())) {
                            ocContactActivity.E().setVisibility(0);
                        }
                        n0.g().m(ocContactActivity.getClass().getSimpleName().concat("_element_click"), "self_phone_num_et", String.valueOf(z3));
                        break;
                }
            }
        });
        Object value10 = this.f29394P0.getValue();
        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
        p220oa.h.l(new E(this, 1), (TextView) value10);
        Object value11 = this.f29379A0.getValue();
        Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
        p220oa.h.l(new E(this, 2), (TextView) value11);
        p220oa.h.l(new E(this, 3), A());
        p220oa.h.l(new E(this, 4), B());
        p220oa.h.l(new E(this, 5), C());
        p220oa.h.l(new E(this, 6), D());
        p220oa.h.l(new E(this, 7), E());
        Object value12 = this.f29415q0.getValue();
        Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
        p220oa.h.l(new E(this, 8), (Button) value12);
    }

    public final void y() {
        int count;
        Cursor cursorQuery = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"contact_id", "data1"}, "has_phone_number = '1'", null, null);
        if (cursorQuery != null) {
            try {
                count = cursorQuery.getCount();
                try {
                    cursorQuery.close();
                } catch (Exception e10) {
                    e = e10;
                    e.printStackTrace();
                }
            } catch (Exception e11) {
                e = e11;
                count = 0;
            }
        } else {
            count = 0;
        }
        this.f29409g1 = count;
        t tVar = this.f29422x0;
        t tVar2 = this.f29391M0;
        t tVar3 = this.f29423y0;
        t tVar4 = this.f29392N0;
        if (count >= 2) {
            N().setVisibility(0);
            Object value = tVar4.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((Group) value).setVisibility(8);
            W().setVisibility(0);
            Object value2 = tVar3.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((Group) value2).setVisibility(8);
            Object value3 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ((TextView) value3).setCompoundDrawablesWithIntrinsicBounds(Ya.d.cs_cl_person, 0, 0, 0);
            Object value4 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            ((TextView) value4).setCompoundDrawablesWithIntrinsicBounds(Ya.d.cs_cl_person, 0, 0, 0);
            return;
        }
        N().setVisibility(8);
        Object value5 = tVar4.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ((Group) value5).setVisibility(0);
        W().setVisibility(8);
        Object value6 = tVar3.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        ((Group) value6).setVisibility(0);
        Object value7 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        ((TextView) value7).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        Object value8 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
        ((TextView) value8).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }
}
