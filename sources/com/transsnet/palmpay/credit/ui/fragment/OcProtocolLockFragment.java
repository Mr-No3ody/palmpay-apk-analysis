package com.transsnet.palmpay.credit.ui.fragment;

import A8.g;
import Pa.n0;
import Ya.e;
import Ya.f;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.E;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.config.d;
import com.transsnet.palmpay.credit.bean.ApplyProtoContent;
import com.transsnet.palmpay.credit.bean.resp.OcLockWhiteData;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcProtocolActivity;
import com.transsnet.palmpay.credit.ui.fragment.OcProtocolLockFragment;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.IntentUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p071ef.b;
import p220oa.h;
import p221ob.c;
import p355xf.C2131j;
import p355xf.t;
import p382zb.C2168k;
import p382zb.h0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/OcProtocolLockFragment;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOcProtocolLockFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OcProtocolLockFragment.kt\ncom/transsnet/palmpay/credit/ui/fragment/OcProtocolLockFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,338:1\n1#2:339\n*E\n"})
public final class OcProtocolLockFragment extends BaseFragment {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f30471A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f30472B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f30473C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f30474H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f30475L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f30476M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public OcLockWhiteData f30477Q;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f30478i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f30479j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f30480o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f30481p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f30482v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f30483w;

    public OcProtocolLockFragment() {
        final int i7 = 11;
        this.f30478i = C2131j.b(new Function0(this) { // from class: zb.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcProtocolLockFragment f44581b;

            {
                this.f44581b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        View view = this.f44581b.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(e.install_tips_tv);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44581b.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(e.install_tips_ll);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44581b.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.install_pt_tv);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44581b.f27318b;
                        if (view4 != null) {
                            return (ConstraintLayout) view4.findViewById(e.white_list_cl);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44581b.f27318b;
                        if (view5 != null) {
                            return (Button) view5.findViewById(e.next_bt);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44581b.f27318b;
                        if (view6 != null) {
                            return (Button) view6.findViewById(e.install_bt);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44581b.f27318b;
                        if (view7 != null) {
                            return (Button) view7.findViewById(e.apply_other_way_bt);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44581b.f27318b;
                        if (view8 != null) {
                            return (Button) view8.findViewById(e.install_again_bt);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44581b.f27318b;
                        if (view9 != null) {
                            return (LinearLayout) view9.findViewById(e.install_again_ll);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44581b.f27318b;
                        if (view10 != null) {
                            return (LinearLayout) view10.findViewById(e.bottom_view);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44581b.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.oc_proto_tv);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44581b.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.install_no_pt_tv);
                        }
                        return null;
                    default:
                        View view13 = this.f44581b.f27318b;
                        if (view13 != null) {
                            return (CheckBox) view13.findViewById(e.oc_proto_cb);
                        }
                        return null;
                }
            }
        });
        final int i10 = 2;
        this.f30479j = C2131j.b(new Function0(this) { // from class: zb.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcProtocolLockFragment f44581b;

            {
                this.f44581b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        View view = this.f44581b.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(e.install_tips_tv);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44581b.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(e.install_tips_ll);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44581b.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.install_pt_tv);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44581b.f27318b;
                        if (view4 != null) {
                            return (ConstraintLayout) view4.findViewById(e.white_list_cl);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44581b.f27318b;
                        if (view5 != null) {
                            return (Button) view5.findViewById(e.next_bt);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44581b.f27318b;
                        if (view6 != null) {
                            return (Button) view6.findViewById(e.install_bt);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44581b.f27318b;
                        if (view7 != null) {
                            return (Button) view7.findViewById(e.apply_other_way_bt);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44581b.f27318b;
                        if (view8 != null) {
                            return (Button) view8.findViewById(e.install_again_bt);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44581b.f27318b;
                        if (view9 != null) {
                            return (LinearLayout) view9.findViewById(e.install_again_ll);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44581b.f27318b;
                        if (view10 != null) {
                            return (LinearLayout) view10.findViewById(e.bottom_view);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44581b.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.oc_proto_tv);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44581b.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.install_no_pt_tv);
                        }
                        return null;
                    default:
                        View view13 = this.f44581b.f27318b;
                        if (view13 != null) {
                            return (CheckBox) view13.findViewById(e.oc_proto_cb);
                        }
                        return null;
                }
            }
        });
        final int i11 = 3;
        this.f30480o = C2131j.b(new Function0(this) { // from class: zb.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcProtocolLockFragment f44581b;

            {
                this.f44581b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        View view = this.f44581b.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(e.install_tips_tv);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44581b.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(e.install_tips_ll);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44581b.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.install_pt_tv);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44581b.f27318b;
                        if (view4 != null) {
                            return (ConstraintLayout) view4.findViewById(e.white_list_cl);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44581b.f27318b;
                        if (view5 != null) {
                            return (Button) view5.findViewById(e.next_bt);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44581b.f27318b;
                        if (view6 != null) {
                            return (Button) view6.findViewById(e.install_bt);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44581b.f27318b;
                        if (view7 != null) {
                            return (Button) view7.findViewById(e.apply_other_way_bt);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44581b.f27318b;
                        if (view8 != null) {
                            return (Button) view8.findViewById(e.install_again_bt);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44581b.f27318b;
                        if (view9 != null) {
                            return (LinearLayout) view9.findViewById(e.install_again_ll);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44581b.f27318b;
                        if (view10 != null) {
                            return (LinearLayout) view10.findViewById(e.bottom_view);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44581b.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.oc_proto_tv);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44581b.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.install_no_pt_tv);
                        }
                        return null;
                    default:
                        View view13 = this.f44581b.f27318b;
                        if (view13 != null) {
                            return (CheckBox) view13.findViewById(e.oc_proto_cb);
                        }
                        return null;
                }
            }
        });
        final int i12 = 4;
        this.f30481p = C2131j.b(new Function0(this) { // from class: zb.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcProtocolLockFragment f44581b;

            {
                this.f44581b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        View view = this.f44581b.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(e.install_tips_tv);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44581b.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(e.install_tips_ll);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44581b.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.install_pt_tv);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44581b.f27318b;
                        if (view4 != null) {
                            return (ConstraintLayout) view4.findViewById(e.white_list_cl);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44581b.f27318b;
                        if (view5 != null) {
                            return (Button) view5.findViewById(e.next_bt);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44581b.f27318b;
                        if (view6 != null) {
                            return (Button) view6.findViewById(e.install_bt);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44581b.f27318b;
                        if (view7 != null) {
                            return (Button) view7.findViewById(e.apply_other_way_bt);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44581b.f27318b;
                        if (view8 != null) {
                            return (Button) view8.findViewById(e.install_again_bt);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44581b.f27318b;
                        if (view9 != null) {
                            return (LinearLayout) view9.findViewById(e.install_again_ll);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44581b.f27318b;
                        if (view10 != null) {
                            return (LinearLayout) view10.findViewById(e.bottom_view);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44581b.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.oc_proto_tv);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44581b.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.install_no_pt_tv);
                        }
                        return null;
                    default:
                        View view13 = this.f44581b.f27318b;
                        if (view13 != null) {
                            return (CheckBox) view13.findViewById(e.oc_proto_cb);
                        }
                        return null;
                }
            }
        });
        final int i13 = 5;
        this.t = C2131j.b(new Function0(this) { // from class: zb.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcProtocolLockFragment f44581b;

            {
                this.f44581b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        View view = this.f44581b.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(e.install_tips_tv);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44581b.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(e.install_tips_ll);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44581b.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.install_pt_tv);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44581b.f27318b;
                        if (view4 != null) {
                            return (ConstraintLayout) view4.findViewById(e.white_list_cl);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44581b.f27318b;
                        if (view5 != null) {
                            return (Button) view5.findViewById(e.next_bt);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44581b.f27318b;
                        if (view6 != null) {
                            return (Button) view6.findViewById(e.install_bt);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44581b.f27318b;
                        if (view7 != null) {
                            return (Button) view7.findViewById(e.apply_other_way_bt);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44581b.f27318b;
                        if (view8 != null) {
                            return (Button) view8.findViewById(e.install_again_bt);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44581b.f27318b;
                        if (view9 != null) {
                            return (LinearLayout) view9.findViewById(e.install_again_ll);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44581b.f27318b;
                        if (view10 != null) {
                            return (LinearLayout) view10.findViewById(e.bottom_view);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44581b.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.oc_proto_tv);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44581b.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.install_no_pt_tv);
                        }
                        return null;
                    default:
                        View view13 = this.f44581b.f27318b;
                        if (view13 != null) {
                            return (CheckBox) view13.findViewById(e.oc_proto_cb);
                        }
                        return null;
                }
            }
        });
        final int i14 = 6;
        this.f30482v = C2131j.b(new Function0(this) { // from class: zb.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcProtocolLockFragment f44581b;

            {
                this.f44581b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        View view = this.f44581b.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(e.install_tips_tv);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44581b.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(e.install_tips_ll);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44581b.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.install_pt_tv);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44581b.f27318b;
                        if (view4 != null) {
                            return (ConstraintLayout) view4.findViewById(e.white_list_cl);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44581b.f27318b;
                        if (view5 != null) {
                            return (Button) view5.findViewById(e.next_bt);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44581b.f27318b;
                        if (view6 != null) {
                            return (Button) view6.findViewById(e.install_bt);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44581b.f27318b;
                        if (view7 != null) {
                            return (Button) view7.findViewById(e.apply_other_way_bt);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44581b.f27318b;
                        if (view8 != null) {
                            return (Button) view8.findViewById(e.install_again_bt);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44581b.f27318b;
                        if (view9 != null) {
                            return (LinearLayout) view9.findViewById(e.install_again_ll);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44581b.f27318b;
                        if (view10 != null) {
                            return (LinearLayout) view10.findViewById(e.bottom_view);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44581b.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.oc_proto_tv);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44581b.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.install_no_pt_tv);
                        }
                        return null;
                    default:
                        View view13 = this.f44581b.f27318b;
                        if (view13 != null) {
                            return (CheckBox) view13.findViewById(e.oc_proto_cb);
                        }
                        return null;
                }
            }
        });
        final int i15 = 7;
        this.f30483w = C2131j.b(new Function0(this) { // from class: zb.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcProtocolLockFragment f44581b;

            {
                this.f44581b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        View view = this.f44581b.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(e.install_tips_tv);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44581b.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(e.install_tips_ll);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44581b.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.install_pt_tv);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44581b.f27318b;
                        if (view4 != null) {
                            return (ConstraintLayout) view4.findViewById(e.white_list_cl);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44581b.f27318b;
                        if (view5 != null) {
                            return (Button) view5.findViewById(e.next_bt);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44581b.f27318b;
                        if (view6 != null) {
                            return (Button) view6.findViewById(e.install_bt);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44581b.f27318b;
                        if (view7 != null) {
                            return (Button) view7.findViewById(e.apply_other_way_bt);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44581b.f27318b;
                        if (view8 != null) {
                            return (Button) view8.findViewById(e.install_again_bt);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44581b.f27318b;
                        if (view9 != null) {
                            return (LinearLayout) view9.findViewById(e.install_again_ll);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44581b.f27318b;
                        if (view10 != null) {
                            return (LinearLayout) view10.findViewById(e.bottom_view);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44581b.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.oc_proto_tv);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44581b.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.install_no_pt_tv);
                        }
                        return null;
                    default:
                        View view13 = this.f44581b.f27318b;
                        if (view13 != null) {
                            return (CheckBox) view13.findViewById(e.oc_proto_cb);
                        }
                        return null;
                }
            }
        });
        final int i16 = 8;
        this.f30471A = C2131j.b(new Function0(this) { // from class: zb.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcProtocolLockFragment f44581b;

            {
                this.f44581b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        View view = this.f44581b.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(e.install_tips_tv);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44581b.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(e.install_tips_ll);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44581b.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.install_pt_tv);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44581b.f27318b;
                        if (view4 != null) {
                            return (ConstraintLayout) view4.findViewById(e.white_list_cl);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44581b.f27318b;
                        if (view5 != null) {
                            return (Button) view5.findViewById(e.next_bt);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44581b.f27318b;
                        if (view6 != null) {
                            return (Button) view6.findViewById(e.install_bt);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44581b.f27318b;
                        if (view7 != null) {
                            return (Button) view7.findViewById(e.apply_other_way_bt);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44581b.f27318b;
                        if (view8 != null) {
                            return (Button) view8.findViewById(e.install_again_bt);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44581b.f27318b;
                        if (view9 != null) {
                            return (LinearLayout) view9.findViewById(e.install_again_ll);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44581b.f27318b;
                        if (view10 != null) {
                            return (LinearLayout) view10.findViewById(e.bottom_view);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44581b.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.oc_proto_tv);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44581b.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.install_no_pt_tv);
                        }
                        return null;
                    default:
                        View view13 = this.f44581b.f27318b;
                        if (view13 != null) {
                            return (CheckBox) view13.findViewById(e.oc_proto_cb);
                        }
                        return null;
                }
            }
        });
        final int i17 = 9;
        this.f30472B = C2131j.b(new Function0(this) { // from class: zb.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcProtocolLockFragment f44581b;

            {
                this.f44581b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        View view = this.f44581b.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(e.install_tips_tv);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44581b.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(e.install_tips_ll);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44581b.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.install_pt_tv);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44581b.f27318b;
                        if (view4 != null) {
                            return (ConstraintLayout) view4.findViewById(e.white_list_cl);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44581b.f27318b;
                        if (view5 != null) {
                            return (Button) view5.findViewById(e.next_bt);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44581b.f27318b;
                        if (view6 != null) {
                            return (Button) view6.findViewById(e.install_bt);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44581b.f27318b;
                        if (view7 != null) {
                            return (Button) view7.findViewById(e.apply_other_way_bt);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44581b.f27318b;
                        if (view8 != null) {
                            return (Button) view8.findViewById(e.install_again_bt);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44581b.f27318b;
                        if (view9 != null) {
                            return (LinearLayout) view9.findViewById(e.install_again_ll);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44581b.f27318b;
                        if (view10 != null) {
                            return (LinearLayout) view10.findViewById(e.bottom_view);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44581b.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.oc_proto_tv);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44581b.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.install_no_pt_tv);
                        }
                        return null;
                    default:
                        View view13 = this.f44581b.f27318b;
                        if (view13 != null) {
                            return (CheckBox) view13.findViewById(e.oc_proto_cb);
                        }
                        return null;
                }
            }
        });
        final int i18 = 10;
        this.f30473C = C2131j.b(new Function0(this) { // from class: zb.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcProtocolLockFragment f44581b;

            {
                this.f44581b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        View view = this.f44581b.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(e.install_tips_tv);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44581b.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(e.install_tips_ll);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44581b.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.install_pt_tv);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44581b.f27318b;
                        if (view4 != null) {
                            return (ConstraintLayout) view4.findViewById(e.white_list_cl);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44581b.f27318b;
                        if (view5 != null) {
                            return (Button) view5.findViewById(e.next_bt);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44581b.f27318b;
                        if (view6 != null) {
                            return (Button) view6.findViewById(e.install_bt);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44581b.f27318b;
                        if (view7 != null) {
                            return (Button) view7.findViewById(e.apply_other_way_bt);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44581b.f27318b;
                        if (view8 != null) {
                            return (Button) view8.findViewById(e.install_again_bt);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44581b.f27318b;
                        if (view9 != null) {
                            return (LinearLayout) view9.findViewById(e.install_again_ll);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44581b.f27318b;
                        if (view10 != null) {
                            return (LinearLayout) view10.findViewById(e.bottom_view);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44581b.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.oc_proto_tv);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44581b.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.install_no_pt_tv);
                        }
                        return null;
                    default:
                        View view13 = this.f44581b.f27318b;
                        if (view13 != null) {
                            return (CheckBox) view13.findViewById(e.oc_proto_cb);
                        }
                        return null;
                }
            }
        });
        final int i19 = 12;
        this.f30474H = C2131j.b(new Function0(this) { // from class: zb.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcProtocolLockFragment f44581b;

            {
                this.f44581b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i19) {
                    case 0:
                        View view = this.f44581b.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(e.install_tips_tv);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44581b.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(e.install_tips_ll);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44581b.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.install_pt_tv);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44581b.f27318b;
                        if (view4 != null) {
                            return (ConstraintLayout) view4.findViewById(e.white_list_cl);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44581b.f27318b;
                        if (view5 != null) {
                            return (Button) view5.findViewById(e.next_bt);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44581b.f27318b;
                        if (view6 != null) {
                            return (Button) view6.findViewById(e.install_bt);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44581b.f27318b;
                        if (view7 != null) {
                            return (Button) view7.findViewById(e.apply_other_way_bt);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44581b.f27318b;
                        if (view8 != null) {
                            return (Button) view8.findViewById(e.install_again_bt);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44581b.f27318b;
                        if (view9 != null) {
                            return (LinearLayout) view9.findViewById(e.install_again_ll);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44581b.f27318b;
                        if (view10 != null) {
                            return (LinearLayout) view10.findViewById(e.bottom_view);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44581b.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.oc_proto_tv);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44581b.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.install_no_pt_tv);
                        }
                        return null;
                    default:
                        View view13 = this.f44581b.f27318b;
                        if (view13 != null) {
                            return (CheckBox) view13.findViewById(e.oc_proto_cb);
                        }
                        return null;
                }
            }
        });
        final int i20 = 0;
        this.f30475L = C2131j.b(new Function0(this) { // from class: zb.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcProtocolLockFragment f44581b;

            {
                this.f44581b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i20) {
                    case 0:
                        View view = this.f44581b.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(e.install_tips_tv);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44581b.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(e.install_tips_ll);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44581b.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.install_pt_tv);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44581b.f27318b;
                        if (view4 != null) {
                            return (ConstraintLayout) view4.findViewById(e.white_list_cl);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44581b.f27318b;
                        if (view5 != null) {
                            return (Button) view5.findViewById(e.next_bt);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44581b.f27318b;
                        if (view6 != null) {
                            return (Button) view6.findViewById(e.install_bt);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44581b.f27318b;
                        if (view7 != null) {
                            return (Button) view7.findViewById(e.apply_other_way_bt);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44581b.f27318b;
                        if (view8 != null) {
                            return (Button) view8.findViewById(e.install_again_bt);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44581b.f27318b;
                        if (view9 != null) {
                            return (LinearLayout) view9.findViewById(e.install_again_ll);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44581b.f27318b;
                        if (view10 != null) {
                            return (LinearLayout) view10.findViewById(e.bottom_view);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44581b.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.oc_proto_tv);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44581b.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.install_no_pt_tv);
                        }
                        return null;
                    default:
                        View view13 = this.f44581b.f27318b;
                        if (view13 != null) {
                            return (CheckBox) view13.findViewById(e.oc_proto_cb);
                        }
                        return null;
                }
            }
        });
        final int i21 = 1;
        this.f30476M = C2131j.b(new Function0(this) { // from class: zb.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcProtocolLockFragment f44581b;

            {
                this.f44581b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i21) {
                    case 0:
                        View view = this.f44581b.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(e.install_tips_tv);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44581b.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(e.install_tips_ll);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44581b.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.install_pt_tv);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44581b.f27318b;
                        if (view4 != null) {
                            return (ConstraintLayout) view4.findViewById(e.white_list_cl);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44581b.f27318b;
                        if (view5 != null) {
                            return (Button) view5.findViewById(e.next_bt);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44581b.f27318b;
                        if (view6 != null) {
                            return (Button) view6.findViewById(e.install_bt);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44581b.f27318b;
                        if (view7 != null) {
                            return (Button) view7.findViewById(e.apply_other_way_bt);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44581b.f27318b;
                        if (view8 != null) {
                            return (Button) view8.findViewById(e.install_again_bt);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44581b.f27318b;
                        if (view9 != null) {
                            return (LinearLayout) view9.findViewById(e.install_again_ll);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44581b.f27318b;
                        if (view10 != null) {
                            return (LinearLayout) view10.findViewById(e.bottom_view);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44581b.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.oc_proto_tv);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44581b.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.install_no_pt_tv);
                        }
                        return null;
                    default:
                        View view13 = this.f44581b.f27318b;
                        if (view13 != null) {
                            return (CheckBox) view13.findViewById(e.oc_proto_cb);
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.cs_oc_protocol_lock_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        showLoadingDialog(true);
        c.f40268a.getInstance().getClass();
        c.a().getLockWhite().k(p298tf.f.f42629b).i(b.a()).subscribe(new C2168k(this, 5));
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        Context context = getContext();
        if (context != null) {
            ArrayList arrayList = new ArrayList();
            ApplyProtoContent applyProtoContent = new ApplyProtoContent(0, "I've read and agreed to ");
            ApplyProtoContent applyProtoContent2 = new ApplyProtoContent(1, ", ");
            ApplyProtoContent applyProtoContent3 = new ApplyProtoContent(2, "Privacy Policy");
            arrayList.add(applyProtoContent);
            arrayList.add(applyProtoContent2);
            arrayList.add(applyProtoContent3);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Iterator it = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            int length = 0;
            while (it.hasNext()) {
                Object next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                ApplyProtoContent applyProtoContent4 = (ApplyProtoContent) next;
                spannableStringBuilder.append((CharSequence) applyProtoContent4.content);
                Integer num = applyProtoContent4.clickType;
                if (num == null || num.intValue() != 0) {
                    spannableStringBuilder.setSpan(new h0(this, applyProtoContent4, context), length, spannableStringBuilder.length(), 33);
                }
                length = spannableStringBuilder.length() - 1;
            }
            TextView textViewU = u();
            if (textViewU != null) {
                textViewU.setText(spannableStringBuilder);
            }
            TextView textViewU2 = u();
            if (textViewU2 != null) {
                textViewU2.setHighlightColor(context.getColor(p.transparent));
            }
            TextView textViewU3 = u();
            if (textViewU3 != null) {
                textViewU3.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        CheckBox checkBox = (CheckBox) this.f30474H.getValue();
        if (checkBox != null) {
            checkBox.setOnCheckedChangeListener(new g(this, 19));
        }
        LinearLayout linearLayout = (LinearLayout) this.f30472B.getValue();
        if (linearLayout != null) {
            final int i7 = 0;
            h.l(new View.OnClickListener(this) { // from class: zb.g0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcProtocolLockFragment f44585b;

                {
                    this.f44585b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CheckBox checkBox2;
                    TextView textViewU4;
                    switch (i7) {
                        case 0:
                            this.f44585b.v();
                            n0.g().m("OcProtocolLockFragment_element_click", "bottom_view", "");
                            break;
                        case 1:
                            this.f44585b.v();
                            n0.g().m("OcProtocolLockFragment_element_click", "install_pt_tv", "");
                            break;
                        case 2:
                            this.f44585b.t();
                            n0.g().m("OcProtocolLockFragment_element_click", "install_no_pt_tv", "");
                            break;
                        case 3:
                            this.f44585b.v();
                            n0.g().m("OcProtocolLockFragment_element_click", "install_bt", "");
                            break;
                        case 4:
                            this.f44585b.v();
                            n0.g().m("OcProtocolLockFragment_element_click", "install_again_bt", "");
                            break;
                        case 5:
                            this.f44585b.t();
                            n0.g().m("OcProtocolLockFragment_element_click", "apply_other_way_bt", "");
                            break;
                        default:
                            OcProtocolLockFragment ocProtocolLockFragment = this.f44585b;
                            t tVar = ocProtocolLockFragment.f30474H;
                            CheckBox checkBox3 = (CheckBox) tVar.getValue();
                            if (checkBox3 == null || !checkBox3.isChecked()) {
                                Context context2 = ocProtocolLockFragment.getContext();
                                if (context2 != null && (checkBox2 = (CheckBox) tVar.getValue()) != null && !checkBox2.isChecked() && (textViewU4 = ocProtocolLockFragment.u()) != null) {
                                    textViewU4.setTextColor(context2.getColor(Ya.b.cs_no_agree_txt_color));
                                }
                            } else {
                                E activity = ocProtocolLockFragment.getActivity();
                                Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.credit.ui.activity.okcard.OcProtocolActivity");
                                ((OcProtocolActivity) activity).m();
                            }
                            n0.g().m("OcProtocolLockFragment_element_click", "next_bt", "");
                            break;
                    }
                }
            }, linearLayout);
        }
        TextView textView = (TextView) this.f30479j.getValue();
        if (textView != null) {
            final int i10 = 1;
            h.l(new View.OnClickListener(this) { // from class: zb.g0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcProtocolLockFragment f44585b;

                {
                    this.f44585b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CheckBox checkBox2;
                    TextView textViewU4;
                    switch (i10) {
                        case 0:
                            this.f44585b.v();
                            n0.g().m("OcProtocolLockFragment_element_click", "bottom_view", "");
                            break;
                        case 1:
                            this.f44585b.v();
                            n0.g().m("OcProtocolLockFragment_element_click", "install_pt_tv", "");
                            break;
                        case 2:
                            this.f44585b.t();
                            n0.g().m("OcProtocolLockFragment_element_click", "install_no_pt_tv", "");
                            break;
                        case 3:
                            this.f44585b.v();
                            n0.g().m("OcProtocolLockFragment_element_click", "install_bt", "");
                            break;
                        case 4:
                            this.f44585b.v();
                            n0.g().m("OcProtocolLockFragment_element_click", "install_again_bt", "");
                            break;
                        case 5:
                            this.f44585b.t();
                            n0.g().m("OcProtocolLockFragment_element_click", "apply_other_way_bt", "");
                            break;
                        default:
                            OcProtocolLockFragment ocProtocolLockFragment = this.f44585b;
                            t tVar = ocProtocolLockFragment.f30474H;
                            CheckBox checkBox3 = (CheckBox) tVar.getValue();
                            if (checkBox3 == null || !checkBox3.isChecked()) {
                                Context context2 = ocProtocolLockFragment.getContext();
                                if (context2 != null && (checkBox2 = (CheckBox) tVar.getValue()) != null && !checkBox2.isChecked() && (textViewU4 = ocProtocolLockFragment.u()) != null) {
                                    textViewU4.setTextColor(context2.getColor(Ya.b.cs_no_agree_txt_color));
                                }
                            } else {
                                E activity = ocProtocolLockFragment.getActivity();
                                Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.credit.ui.activity.okcard.OcProtocolActivity");
                                ((OcProtocolActivity) activity).m();
                            }
                            n0.g().m("OcProtocolLockFragment_element_click", "next_bt", "");
                            break;
                    }
                }
            }, textView);
        }
        TextView textView2 = (TextView) this.f30478i.getValue();
        if (textView2 != null) {
            final int i11 = 2;
            h.l(new View.OnClickListener(this) { // from class: zb.g0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcProtocolLockFragment f44585b;

                {
                    this.f44585b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CheckBox checkBox2;
                    TextView textViewU4;
                    switch (i11) {
                        case 0:
                            this.f44585b.v();
                            n0.g().m("OcProtocolLockFragment_element_click", "bottom_view", "");
                            break;
                        case 1:
                            this.f44585b.v();
                            n0.g().m("OcProtocolLockFragment_element_click", "install_pt_tv", "");
                            break;
                        case 2:
                            this.f44585b.t();
                            n0.g().m("OcProtocolLockFragment_element_click", "install_no_pt_tv", "");
                            break;
                        case 3:
                            this.f44585b.v();
                            n0.g().m("OcProtocolLockFragment_element_click", "install_bt", "");
                            break;
                        case 4:
                            this.f44585b.v();
                            n0.g().m("OcProtocolLockFragment_element_click", "install_again_bt", "");
                            break;
                        case 5:
                            this.f44585b.t();
                            n0.g().m("OcProtocolLockFragment_element_click", "apply_other_way_bt", "");
                            break;
                        default:
                            OcProtocolLockFragment ocProtocolLockFragment = this.f44585b;
                            t tVar = ocProtocolLockFragment.f30474H;
                            CheckBox checkBox3 = (CheckBox) tVar.getValue();
                            if (checkBox3 == null || !checkBox3.isChecked()) {
                                Context context2 = ocProtocolLockFragment.getContext();
                                if (context2 != null && (checkBox2 = (CheckBox) tVar.getValue()) != null && !checkBox2.isChecked() && (textViewU4 = ocProtocolLockFragment.u()) != null) {
                                    textViewU4.setTextColor(context2.getColor(Ya.b.cs_no_agree_txt_color));
                                }
                            } else {
                                E activity = ocProtocolLockFragment.getActivity();
                                Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.credit.ui.activity.okcard.OcProtocolActivity");
                                ((OcProtocolActivity) activity).m();
                            }
                            n0.g().m("OcProtocolLockFragment_element_click", "next_bt", "");
                            break;
                    }
                }
            }, textView2);
        }
        Button button = (Button) this.t.getValue();
        if (button != null) {
            final int i12 = 3;
            h.l(new View.OnClickListener(this) { // from class: zb.g0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcProtocolLockFragment f44585b;

                {
                    this.f44585b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CheckBox checkBox2;
                    TextView textViewU4;
                    switch (i12) {
                        case 0:
                            this.f44585b.v();
                            n0.g().m("OcProtocolLockFragment_element_click", "bottom_view", "");
                            break;
                        case 1:
                            this.f44585b.v();
                            n0.g().m("OcProtocolLockFragment_element_click", "install_pt_tv", "");
                            break;
                        case 2:
                            this.f44585b.t();
                            n0.g().m("OcProtocolLockFragment_element_click", "install_no_pt_tv", "");
                            break;
                        case 3:
                            this.f44585b.v();
                            n0.g().m("OcProtocolLockFragment_element_click", "install_bt", "");
                            break;
                        case 4:
                            this.f44585b.v();
                            n0.g().m("OcProtocolLockFragment_element_click", "install_again_bt", "");
                            break;
                        case 5:
                            this.f44585b.t();
                            n0.g().m("OcProtocolLockFragment_element_click", "apply_other_way_bt", "");
                            break;
                        default:
                            OcProtocolLockFragment ocProtocolLockFragment = this.f44585b;
                            t tVar = ocProtocolLockFragment.f30474H;
                            CheckBox checkBox3 = (CheckBox) tVar.getValue();
                            if (checkBox3 == null || !checkBox3.isChecked()) {
                                Context context2 = ocProtocolLockFragment.getContext();
                                if (context2 != null && (checkBox2 = (CheckBox) tVar.getValue()) != null && !checkBox2.isChecked() && (textViewU4 = ocProtocolLockFragment.u()) != null) {
                                    textViewU4.setTextColor(context2.getColor(Ya.b.cs_no_agree_txt_color));
                                }
                            } else {
                                E activity = ocProtocolLockFragment.getActivity();
                                Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.credit.ui.activity.okcard.OcProtocolActivity");
                                ((OcProtocolActivity) activity).m();
                            }
                            n0.g().m("OcProtocolLockFragment_element_click", "next_bt", "");
                            break;
                    }
                }
            }, button);
        }
        Button button2 = (Button) this.f30483w.getValue();
        if (button2 != null) {
            final int i13 = 4;
            h.l(new View.OnClickListener(this) { // from class: zb.g0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcProtocolLockFragment f44585b;

                {
                    this.f44585b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CheckBox checkBox2;
                    TextView textViewU4;
                    switch (i13) {
                        case 0:
                            this.f44585b.v();
                            n0.g().m("OcProtocolLockFragment_element_click", "bottom_view", "");
                            break;
                        case 1:
                            this.f44585b.v();
                            n0.g().m("OcProtocolLockFragment_element_click", "install_pt_tv", "");
                            break;
                        case 2:
                            this.f44585b.t();
                            n0.g().m("OcProtocolLockFragment_element_click", "install_no_pt_tv", "");
                            break;
                        case 3:
                            this.f44585b.v();
                            n0.g().m("OcProtocolLockFragment_element_click", "install_bt", "");
                            break;
                        case 4:
                            this.f44585b.v();
                            n0.g().m("OcProtocolLockFragment_element_click", "install_again_bt", "");
                            break;
                        case 5:
                            this.f44585b.t();
                            n0.g().m("OcProtocolLockFragment_element_click", "apply_other_way_bt", "");
                            break;
                        default:
                            OcProtocolLockFragment ocProtocolLockFragment = this.f44585b;
                            t tVar = ocProtocolLockFragment.f30474H;
                            CheckBox checkBox3 = (CheckBox) tVar.getValue();
                            if (checkBox3 == null || !checkBox3.isChecked()) {
                                Context context2 = ocProtocolLockFragment.getContext();
                                if (context2 != null && (checkBox2 = (CheckBox) tVar.getValue()) != null && !checkBox2.isChecked() && (textViewU4 = ocProtocolLockFragment.u()) != null) {
                                    textViewU4.setTextColor(context2.getColor(Ya.b.cs_no_agree_txt_color));
                                }
                            } else {
                                E activity = ocProtocolLockFragment.getActivity();
                                Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.credit.ui.activity.okcard.OcProtocolActivity");
                                ((OcProtocolActivity) activity).m();
                            }
                            n0.g().m("OcProtocolLockFragment_element_click", "next_bt", "");
                            break;
                    }
                }
            }, button2);
        }
        Button button3 = (Button) this.f30482v.getValue();
        if (button3 != null) {
            final int i14 = 5;
            h.l(new View.OnClickListener(this) { // from class: zb.g0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcProtocolLockFragment f44585b;

                {
                    this.f44585b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CheckBox checkBox2;
                    TextView textViewU4;
                    switch (i14) {
                        case 0:
                            this.f44585b.v();
                            n0.g().m("OcProtocolLockFragment_element_click", "bottom_view", "");
                            break;
                        case 1:
                            this.f44585b.v();
                            n0.g().m("OcProtocolLockFragment_element_click", "install_pt_tv", "");
                            break;
                        case 2:
                            this.f44585b.t();
                            n0.g().m("OcProtocolLockFragment_element_click", "install_no_pt_tv", "");
                            break;
                        case 3:
                            this.f44585b.v();
                            n0.g().m("OcProtocolLockFragment_element_click", "install_bt", "");
                            break;
                        case 4:
                            this.f44585b.v();
                            n0.g().m("OcProtocolLockFragment_element_click", "install_again_bt", "");
                            break;
                        case 5:
                            this.f44585b.t();
                            n0.g().m("OcProtocolLockFragment_element_click", "apply_other_way_bt", "");
                            break;
                        default:
                            OcProtocolLockFragment ocProtocolLockFragment = this.f44585b;
                            t tVar = ocProtocolLockFragment.f30474H;
                            CheckBox checkBox3 = (CheckBox) tVar.getValue();
                            if (checkBox3 == null || !checkBox3.isChecked()) {
                                Context context2 = ocProtocolLockFragment.getContext();
                                if (context2 != null && (checkBox2 = (CheckBox) tVar.getValue()) != null && !checkBox2.isChecked() && (textViewU4 = ocProtocolLockFragment.u()) != null) {
                                    textViewU4.setTextColor(context2.getColor(Ya.b.cs_no_agree_txt_color));
                                }
                            } else {
                                E activity = ocProtocolLockFragment.getActivity();
                                Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.credit.ui.activity.okcard.OcProtocolActivity");
                                ((OcProtocolActivity) activity).m();
                            }
                            n0.g().m("OcProtocolLockFragment_element_click", "next_bt", "");
                            break;
                    }
                }
            }, button3);
        }
        Button button4 = (Button) this.f30481p.getValue();
        if (button4 != null) {
            final int i15 = 6;
            h.l(new View.OnClickListener(this) { // from class: zb.g0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcProtocolLockFragment f44585b;

                {
                    this.f44585b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CheckBox checkBox2;
                    TextView textViewU4;
                    switch (i15) {
                        case 0:
                            this.f44585b.v();
                            n0.g().m("OcProtocolLockFragment_element_click", "bottom_view", "");
                            break;
                        case 1:
                            this.f44585b.v();
                            n0.g().m("OcProtocolLockFragment_element_click", "install_pt_tv", "");
                            break;
                        case 2:
                            this.f44585b.t();
                            n0.g().m("OcProtocolLockFragment_element_click", "install_no_pt_tv", "");
                            break;
                        case 3:
                            this.f44585b.v();
                            n0.g().m("OcProtocolLockFragment_element_click", "install_bt", "");
                            break;
                        case 4:
                            this.f44585b.v();
                            n0.g().m("OcProtocolLockFragment_element_click", "install_again_bt", "");
                            break;
                        case 5:
                            this.f44585b.t();
                            n0.g().m("OcProtocolLockFragment_element_click", "apply_other_way_bt", "");
                            break;
                        default:
                            OcProtocolLockFragment ocProtocolLockFragment = this.f44585b;
                            t tVar = ocProtocolLockFragment.f30474H;
                            CheckBox checkBox3 = (CheckBox) tVar.getValue();
                            if (checkBox3 == null || !checkBox3.isChecked()) {
                                Context context2 = ocProtocolLockFragment.getContext();
                                if (context2 != null && (checkBox2 = (CheckBox) tVar.getValue()) != null && !checkBox2.isChecked() && (textViewU4 = ocProtocolLockFragment.u()) != null) {
                                    textViewU4.setTextColor(context2.getColor(Ya.b.cs_no_agree_txt_color));
                                }
                            } else {
                                E activity = ocProtocolLockFragment.getActivity();
                                Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.credit.ui.activity.okcard.OcProtocolActivity");
                                ((OcProtocolActivity) activity).m();
                            }
                            n0.g().m("OcProtocolLockFragment_element_click", "next_bt", "");
                            break;
                    }
                }
            }, button4);
        }
        return 0;
    }

    public final void t() {
        CheckBox checkBox;
        TextView textViewU;
        t tVar = this.f30474H;
        CheckBox checkBox2 = (CheckBox) tVar.getValue();
        if (checkBox2 != null && checkBox2.isChecked()) {
            E activity = getActivity();
            Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.credit.ui.activity.okcard.OcProtocolActivity");
            E activity2 = getActivity();
            Intrinsics.f(activity2, "null cannot be cast to non-null type com.transsnet.palmpay.credit.ui.activity.okcard.OcProtocolActivity");
            ((OcProtocolActivity) activity2).m();
            return;
        }
        Context context = getContext();
        if (context == null || (checkBox = (CheckBox) tVar.getValue()) == null || checkBox.isChecked() || (textViewU = u()) == null) {
            return;
        }
        textViewU.setTextColor(context.getColor(Ya.b.cs_no_agree_txt_color));
    }

    public final TextView u() {
        return (TextView) this.f30473C.getValue();
    }

    public final void v() {
        Button button;
        E activity;
        Button button2 = (Button) this.t.getValue();
        if (((button2 == null || button2.getVisibility() != 0) && ((button = (Button) this.f30483w.getValue()) == null || button.getVisibility() != 0)) || (activity = getActivity()) == null || !(activity instanceof OcProtocolActivity)) {
            return;
        }
        OcProtocolActivity ocProtocolActivity = (OcProtocolActivity) activity;
        String strG = d.g("/h5/pt-download?loanProduct=%1$s");
        Intrinsics.checkNotNullExpressionValue(strG, "getH5Url(...)");
        String str = String.format(strG, Arrays.copyOf(new Object[]{"OK_CARD"}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Intent openUrlIntent = IntentUtils.getOpenUrlIntent(str, true);
        if (openUrlIntent == null) {
            ToastUtils.showLong("intent is null", new Object[0]);
            return;
        }
        ocProtocolActivity.f29655i = true;
        ocProtocolActivity.f29654g = true;
        ActivityUtils.startActivity(openUrlIntent);
    }

    public final void w() {
        TextView textView = (TextView) this.f30475L.getValue();
        if (textView != null) {
            textView.setText(getString(Ya.g.cs_before_apply_flexi));
        }
        LinearLayout linearLayout = (LinearLayout) this.f30472B.getValue();
        if (linearLayout != null) {
            linearLayout.setBackgroundResource(r.cv_shape_rect_corner_12_bg_primary);
        }
        LinearLayout linearLayout2 = (LinearLayout) this.f30476M.getValue();
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        LinearLayout linearLayout3 = (LinearLayout) this.f30471A.getValue();
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
        Button button = (Button) this.t.getValue();
        if (button != null) {
            button.setVisibility(0);
        }
        Button button2 = (Button) this.f30481p.getValue();
        if (button2 != null) {
            button2.setVisibility(8);
        }
    }

    public final void x(boolean z3) {
        t tVar = this.f30480o;
        t tVar2 = this.f30472B;
        if (z3) {
            LinearLayout linearLayout = (LinearLayout) tVar2.getValue();
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) tVar.getValue();
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) tVar2.getValue();
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) tVar.getValue();
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(8);
        }
    }
}
