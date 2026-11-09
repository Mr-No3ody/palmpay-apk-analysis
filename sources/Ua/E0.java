package Ua;

import Ad.C0058e;
import C9.C0145l;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.transsnet.palmpay.core.viewmodel.TimeRemindViewHandler$CallBack1;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C1847n;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
public final class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p355xf.t f9311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p355xf.t f9312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p355xf.t f9313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p355xf.t f9314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p355xf.t f9315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p355xf.t f9316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p355xf.t f9317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p355xf.t f9318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p355xf.t f9319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p355xf.t f9320j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f9321k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f9322l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f9323m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f9324n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f9325o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f9326p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public X6.r f9327q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f9328r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f9329s;
    public final View t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TimeRemindViewHandler$CallBack1 f9330u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f9331v;

    static {
        new D0(null);
    }

    public E0(View view, boolean z3) {
        Intrinsics.checkNotNullParameter(view, "view");
        final int i7 = 0;
        this.f9311a = C2131j.b(new Function0(this) { // from class: Ua.C0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E0 f9308b;

            {
                this.f9308b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        View view2 = this.f9308b.t;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.cltr_title2);
                        }
                        return null;
                    case 1:
                        View view3 = this.f9308b.t;
                        if (view3 != null) {
                            return (SwitchCompat) view3.findViewById(p025ba.e.cltr_switch);
                        }
                        return null;
                    case 2:
                        View view4 = this.f9308b.t;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(p025ba.e.cltr_area2);
                        }
                        return null;
                    case 3:
                        View view5 = this.f9308b.t;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.cltr_remind_time_tv);
                        }
                        return null;
                    case 4:
                        View view6 = this.f9308b.t;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p025ba.e.cltr_remind_period_tv);
                        }
                        return null;
                    case 5:
                        View view7 = this.f9308b.t;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p025ba.e.clt_bundle_tv);
                        }
                        return null;
                    case 6:
                        View view8 = this.f9308b.t;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(p025ba.e.clt_bundle_check_iv);
                        }
                        return null;
                    case 7:
                        View view9 = this.f9308b.t;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(p025ba.e.clt_airtime_tv);
                        }
                        return null;
                    case 8:
                        View view10 = this.f9308b.t;
                        if (view10 != null) {
                            return (ImageView) view10.findViewById(p025ba.e.clt_airtime_check_iv);
                        }
                        return null;
                    default:
                        View view11 = this.f9308b.t;
                        if (view11 != null) {
                            return (RelativeLayout) view11.findViewById(p025ba.e.cltr_bill_type);
                        }
                        return null;
                }
            }
        });
        final int i10 = 2;
        this.f9312b = C2131j.b(new Function0(this) { // from class: Ua.C0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E0 f9308b;

            {
                this.f9308b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        View view2 = this.f9308b.t;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.cltr_title2);
                        }
                        return null;
                    case 1:
                        View view3 = this.f9308b.t;
                        if (view3 != null) {
                            return (SwitchCompat) view3.findViewById(p025ba.e.cltr_switch);
                        }
                        return null;
                    case 2:
                        View view4 = this.f9308b.t;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(p025ba.e.cltr_area2);
                        }
                        return null;
                    case 3:
                        View view5 = this.f9308b.t;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.cltr_remind_time_tv);
                        }
                        return null;
                    case 4:
                        View view6 = this.f9308b.t;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p025ba.e.cltr_remind_period_tv);
                        }
                        return null;
                    case 5:
                        View view7 = this.f9308b.t;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p025ba.e.clt_bundle_tv);
                        }
                        return null;
                    case 6:
                        View view8 = this.f9308b.t;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(p025ba.e.clt_bundle_check_iv);
                        }
                        return null;
                    case 7:
                        View view9 = this.f9308b.t;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(p025ba.e.clt_airtime_tv);
                        }
                        return null;
                    case 8:
                        View view10 = this.f9308b.t;
                        if (view10 != null) {
                            return (ImageView) view10.findViewById(p025ba.e.clt_airtime_check_iv);
                        }
                        return null;
                    default:
                        View view11 = this.f9308b.t;
                        if (view11 != null) {
                            return (RelativeLayout) view11.findViewById(p025ba.e.cltr_bill_type);
                        }
                        return null;
                }
            }
        });
        final int i11 = 3;
        p355xf.t tVarB = C2131j.b(new Function0(this) { // from class: Ua.C0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E0 f9308b;

            {
                this.f9308b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        View view2 = this.f9308b.t;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.cltr_title2);
                        }
                        return null;
                    case 1:
                        View view3 = this.f9308b.t;
                        if (view3 != null) {
                            return (SwitchCompat) view3.findViewById(p025ba.e.cltr_switch);
                        }
                        return null;
                    case 2:
                        View view4 = this.f9308b.t;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(p025ba.e.cltr_area2);
                        }
                        return null;
                    case 3:
                        View view5 = this.f9308b.t;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.cltr_remind_time_tv);
                        }
                        return null;
                    case 4:
                        View view6 = this.f9308b.t;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p025ba.e.cltr_remind_period_tv);
                        }
                        return null;
                    case 5:
                        View view7 = this.f9308b.t;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p025ba.e.clt_bundle_tv);
                        }
                        return null;
                    case 6:
                        View view8 = this.f9308b.t;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(p025ba.e.clt_bundle_check_iv);
                        }
                        return null;
                    case 7:
                        View view9 = this.f9308b.t;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(p025ba.e.clt_airtime_tv);
                        }
                        return null;
                    case 8:
                        View view10 = this.f9308b.t;
                        if (view10 != null) {
                            return (ImageView) view10.findViewById(p025ba.e.clt_airtime_check_iv);
                        }
                        return null;
                    default:
                        View view11 = this.f9308b.t;
                        if (view11 != null) {
                            return (RelativeLayout) view11.findViewById(p025ba.e.cltr_bill_type);
                        }
                        return null;
                }
            }
        });
        this.f9313c = tVarB;
        final int i12 = 4;
        p355xf.t tVarB2 = C2131j.b(new Function0(this) { // from class: Ua.C0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E0 f9308b;

            {
                this.f9308b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        View view2 = this.f9308b.t;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.cltr_title2);
                        }
                        return null;
                    case 1:
                        View view3 = this.f9308b.t;
                        if (view3 != null) {
                            return (SwitchCompat) view3.findViewById(p025ba.e.cltr_switch);
                        }
                        return null;
                    case 2:
                        View view4 = this.f9308b.t;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(p025ba.e.cltr_area2);
                        }
                        return null;
                    case 3:
                        View view5 = this.f9308b.t;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.cltr_remind_time_tv);
                        }
                        return null;
                    case 4:
                        View view6 = this.f9308b.t;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p025ba.e.cltr_remind_period_tv);
                        }
                        return null;
                    case 5:
                        View view7 = this.f9308b.t;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p025ba.e.clt_bundle_tv);
                        }
                        return null;
                    case 6:
                        View view8 = this.f9308b.t;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(p025ba.e.clt_bundle_check_iv);
                        }
                        return null;
                    case 7:
                        View view9 = this.f9308b.t;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(p025ba.e.clt_airtime_tv);
                        }
                        return null;
                    case 8:
                        View view10 = this.f9308b.t;
                        if (view10 != null) {
                            return (ImageView) view10.findViewById(p025ba.e.clt_airtime_check_iv);
                        }
                        return null;
                    default:
                        View view11 = this.f9308b.t;
                        if (view11 != null) {
                            return (RelativeLayout) view11.findViewById(p025ba.e.cltr_bill_type);
                        }
                        return null;
                }
            }
        });
        this.f9314d = tVarB2;
        final int i13 = 5;
        this.f9315e = C2131j.b(new Function0(this) { // from class: Ua.C0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E0 f9308b;

            {
                this.f9308b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        View view2 = this.f9308b.t;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.cltr_title2);
                        }
                        return null;
                    case 1:
                        View view3 = this.f9308b.t;
                        if (view3 != null) {
                            return (SwitchCompat) view3.findViewById(p025ba.e.cltr_switch);
                        }
                        return null;
                    case 2:
                        View view4 = this.f9308b.t;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(p025ba.e.cltr_area2);
                        }
                        return null;
                    case 3:
                        View view5 = this.f9308b.t;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.cltr_remind_time_tv);
                        }
                        return null;
                    case 4:
                        View view6 = this.f9308b.t;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p025ba.e.cltr_remind_period_tv);
                        }
                        return null;
                    case 5:
                        View view7 = this.f9308b.t;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p025ba.e.clt_bundle_tv);
                        }
                        return null;
                    case 6:
                        View view8 = this.f9308b.t;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(p025ba.e.clt_bundle_check_iv);
                        }
                        return null;
                    case 7:
                        View view9 = this.f9308b.t;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(p025ba.e.clt_airtime_tv);
                        }
                        return null;
                    case 8:
                        View view10 = this.f9308b.t;
                        if (view10 != null) {
                            return (ImageView) view10.findViewById(p025ba.e.clt_airtime_check_iv);
                        }
                        return null;
                    default:
                        View view11 = this.f9308b.t;
                        if (view11 != null) {
                            return (RelativeLayout) view11.findViewById(p025ba.e.cltr_bill_type);
                        }
                        return null;
                }
            }
        });
        final int i14 = 6;
        p355xf.t tVarB3 = C2131j.b(new Function0(this) { // from class: Ua.C0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E0 f9308b;

            {
                this.f9308b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        View view2 = this.f9308b.t;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.cltr_title2);
                        }
                        return null;
                    case 1:
                        View view3 = this.f9308b.t;
                        if (view3 != null) {
                            return (SwitchCompat) view3.findViewById(p025ba.e.cltr_switch);
                        }
                        return null;
                    case 2:
                        View view4 = this.f9308b.t;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(p025ba.e.cltr_area2);
                        }
                        return null;
                    case 3:
                        View view5 = this.f9308b.t;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.cltr_remind_time_tv);
                        }
                        return null;
                    case 4:
                        View view6 = this.f9308b.t;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p025ba.e.cltr_remind_period_tv);
                        }
                        return null;
                    case 5:
                        View view7 = this.f9308b.t;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p025ba.e.clt_bundle_tv);
                        }
                        return null;
                    case 6:
                        View view8 = this.f9308b.t;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(p025ba.e.clt_bundle_check_iv);
                        }
                        return null;
                    case 7:
                        View view9 = this.f9308b.t;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(p025ba.e.clt_airtime_tv);
                        }
                        return null;
                    case 8:
                        View view10 = this.f9308b.t;
                        if (view10 != null) {
                            return (ImageView) view10.findViewById(p025ba.e.clt_airtime_check_iv);
                        }
                        return null;
                    default:
                        View view11 = this.f9308b.t;
                        if (view11 != null) {
                            return (RelativeLayout) view11.findViewById(p025ba.e.cltr_bill_type);
                        }
                        return null;
                }
            }
        });
        this.f9316f = tVarB3;
        final int i15 = 7;
        this.f9317g = C2131j.b(new Function0(this) { // from class: Ua.C0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E0 f9308b;

            {
                this.f9308b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        View view2 = this.f9308b.t;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.cltr_title2);
                        }
                        return null;
                    case 1:
                        View view3 = this.f9308b.t;
                        if (view3 != null) {
                            return (SwitchCompat) view3.findViewById(p025ba.e.cltr_switch);
                        }
                        return null;
                    case 2:
                        View view4 = this.f9308b.t;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(p025ba.e.cltr_area2);
                        }
                        return null;
                    case 3:
                        View view5 = this.f9308b.t;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.cltr_remind_time_tv);
                        }
                        return null;
                    case 4:
                        View view6 = this.f9308b.t;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p025ba.e.cltr_remind_period_tv);
                        }
                        return null;
                    case 5:
                        View view7 = this.f9308b.t;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p025ba.e.clt_bundle_tv);
                        }
                        return null;
                    case 6:
                        View view8 = this.f9308b.t;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(p025ba.e.clt_bundle_check_iv);
                        }
                        return null;
                    case 7:
                        View view9 = this.f9308b.t;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(p025ba.e.clt_airtime_tv);
                        }
                        return null;
                    case 8:
                        View view10 = this.f9308b.t;
                        if (view10 != null) {
                            return (ImageView) view10.findViewById(p025ba.e.clt_airtime_check_iv);
                        }
                        return null;
                    default:
                        View view11 = this.f9308b.t;
                        if (view11 != null) {
                            return (RelativeLayout) view11.findViewById(p025ba.e.cltr_bill_type);
                        }
                        return null;
                }
            }
        });
        final int i16 = 8;
        p355xf.t tVarB4 = C2131j.b(new Function0(this) { // from class: Ua.C0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E0 f9308b;

            {
                this.f9308b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        View view2 = this.f9308b.t;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.cltr_title2);
                        }
                        return null;
                    case 1:
                        View view3 = this.f9308b.t;
                        if (view3 != null) {
                            return (SwitchCompat) view3.findViewById(p025ba.e.cltr_switch);
                        }
                        return null;
                    case 2:
                        View view4 = this.f9308b.t;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(p025ba.e.cltr_area2);
                        }
                        return null;
                    case 3:
                        View view5 = this.f9308b.t;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.cltr_remind_time_tv);
                        }
                        return null;
                    case 4:
                        View view6 = this.f9308b.t;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p025ba.e.cltr_remind_period_tv);
                        }
                        return null;
                    case 5:
                        View view7 = this.f9308b.t;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p025ba.e.clt_bundle_tv);
                        }
                        return null;
                    case 6:
                        View view8 = this.f9308b.t;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(p025ba.e.clt_bundle_check_iv);
                        }
                        return null;
                    case 7:
                        View view9 = this.f9308b.t;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(p025ba.e.clt_airtime_tv);
                        }
                        return null;
                    case 8:
                        View view10 = this.f9308b.t;
                        if (view10 != null) {
                            return (ImageView) view10.findViewById(p025ba.e.clt_airtime_check_iv);
                        }
                        return null;
                    default:
                        View view11 = this.f9308b.t;
                        if (view11 != null) {
                            return (RelativeLayout) view11.findViewById(p025ba.e.cltr_bill_type);
                        }
                        return null;
                }
            }
        });
        this.f9318h = tVarB4;
        final int i17 = 9;
        this.f9319i = C2131j.b(new Function0(this) { // from class: Ua.C0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E0 f9308b;

            {
                this.f9308b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        View view2 = this.f9308b.t;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.cltr_title2);
                        }
                        return null;
                    case 1:
                        View view3 = this.f9308b.t;
                        if (view3 != null) {
                            return (SwitchCompat) view3.findViewById(p025ba.e.cltr_switch);
                        }
                        return null;
                    case 2:
                        View view4 = this.f9308b.t;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(p025ba.e.cltr_area2);
                        }
                        return null;
                    case 3:
                        View view5 = this.f9308b.t;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.cltr_remind_time_tv);
                        }
                        return null;
                    case 4:
                        View view6 = this.f9308b.t;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p025ba.e.cltr_remind_period_tv);
                        }
                        return null;
                    case 5:
                        View view7 = this.f9308b.t;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p025ba.e.clt_bundle_tv);
                        }
                        return null;
                    case 6:
                        View view8 = this.f9308b.t;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(p025ba.e.clt_bundle_check_iv);
                        }
                        return null;
                    case 7:
                        View view9 = this.f9308b.t;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(p025ba.e.clt_airtime_tv);
                        }
                        return null;
                    case 8:
                        View view10 = this.f9308b.t;
                        if (view10 != null) {
                            return (ImageView) view10.findViewById(p025ba.e.clt_airtime_check_iv);
                        }
                        return null;
                    default:
                        View view11 = this.f9308b.t;
                        if (view11 != null) {
                            return (RelativeLayout) view11.findViewById(p025ba.e.cltr_bill_type);
                        }
                        return null;
                }
            }
        });
        final int i18 = 1;
        p355xf.t tVarB5 = C2131j.b(new Function0(this) { // from class: Ua.C0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E0 f9308b;

            {
                this.f9308b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        View view2 = this.f9308b.t;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.cltr_title2);
                        }
                        return null;
                    case 1:
                        View view3 = this.f9308b.t;
                        if (view3 != null) {
                            return (SwitchCompat) view3.findViewById(p025ba.e.cltr_switch);
                        }
                        return null;
                    case 2:
                        View view4 = this.f9308b.t;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(p025ba.e.cltr_area2);
                        }
                        return null;
                    case 3:
                        View view5 = this.f9308b.t;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.cltr_remind_time_tv);
                        }
                        return null;
                    case 4:
                        View view6 = this.f9308b.t;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p025ba.e.cltr_remind_period_tv);
                        }
                        return null;
                    case 5:
                        View view7 = this.f9308b.t;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p025ba.e.clt_bundle_tv);
                        }
                        return null;
                    case 6:
                        View view8 = this.f9308b.t;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(p025ba.e.clt_bundle_check_iv);
                        }
                        return null;
                    case 7:
                        View view9 = this.f9308b.t;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(p025ba.e.clt_airtime_tv);
                        }
                        return null;
                    case 8:
                        View view10 = this.f9308b.t;
                        if (view10 != null) {
                            return (ImageView) view10.findViewById(p025ba.e.clt_airtime_check_iv);
                        }
                        return null;
                    default:
                        View view11 = this.f9308b.t;
                        if (view11 != null) {
                            return (RelativeLayout) view11.findViewById(p025ba.e.cltr_bill_type);
                        }
                        return null;
                }
            }
        });
        this.f9320j = tVarB5;
        this.f9321k = "week";
        this.f9322l = "day";
        this.f9323m = "month";
        this.f9324n = "";
        this.f9325o = "week";
        this.f9326p = "";
        List listH = z3 ? C1850q.h("day", "week", "month") : C1850q.h("week", "month");
        this.f9328r = listH;
        this.t = view;
        this.f9329s = view.getContext();
        SwitchCompat switchCompat = (SwitchCompat) tVarB5.getValue();
        if (switchCompat != null) {
            switchCompat.setOnCheckedChangeListener(new C0145l(this, 1));
        }
        R8.d dVar = new R8.d(this, 24);
        TextView textView = (TextView) tVarB2.getValue();
        if (textView != null) {
            textView.setOnClickListener(dVar);
        }
        TextView textView2 = (TextView) tVarB.getValue();
        if (textView2 != null) {
            textView2.setOnClickListener(dVar);
        }
        ImageView imageView = (ImageView) tVarB4.getValue();
        if (imageView != null) {
            imageView.setOnClickListener(dVar);
        }
        ImageView imageView2 = (ImageView) tVarB3.getValue();
        if (imageView2 != null) {
            imageView2.setOnClickListener(dVar);
        }
        R3.e eVar = new R3.e(this, 6);
        TextView textView3 = (TextView) tVarB2.getValue();
        if (textView3 != null) {
            textView3.addTextChangedListener(eVar);
        }
        TextView textView4 = (TextView) tVarB.getValue();
        if (textView4 != null) {
            textView4.addTextChangedListener(eVar);
        }
        SwitchCompat switchCompat2 = (SwitchCompat) tVarB5.getValue();
        if (switchCompat2 != null) {
            switchCompat2.setChecked(true);
        }
        f((String) CollectionsKt.F(listH));
        g((String) CollectionsKt.F(i(this.f9325o)));
    }

    public final void a(boolean z3) {
        Context context = this.f9329s;
        p355xf.t tVar = this.f9317g;
        p355xf.t tVar2 = this.f9318h;
        if (z3) {
            ImageView imageView = (ImageView) tVar2.getValue();
            if (imageView != null) {
                imageView.setEnabled(true);
            }
            TextView textView = (TextView) tVar.getValue();
            if (textView != null) {
                textView.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, context));
                return;
            }
            return;
        }
        ImageView imageView2 = (ImageView) tVar2.getValue();
        if (imageView2 != null) {
            imageView2.setEnabled(false);
        }
        TextView textView2 = (TextView) tVar.getValue();
        if (textView2 != null) {
            textView2.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorTextDisable, context));
        }
    }

    public final void b(boolean z3) {
        Context context = this.f9329s;
        p355xf.t tVar = this.f9315e;
        p355xf.t tVar2 = this.f9316f;
        if (z3) {
            ImageView imageView = (ImageView) tVar2.getValue();
            if (imageView != null) {
                imageView.setEnabled(true);
            }
            TextView textView = (TextView) tVar.getValue();
            if (textView != null) {
                textView.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, context));
                return;
            }
            return;
        }
        ImageView imageView2 = (ImageView) tVar2.getValue();
        if (imageView2 != null) {
            imageView2.setEnabled(false);
        }
        TextView textView2 = (TextView) tVar.getValue();
        if (textView2 != null) {
            textView2.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorTextDisable, context));
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    public final boolean c() {
        boolean z3;
        SwitchCompat switchCompat = (SwitchCompat) this.f9320j.getValue();
        if (switchCompat == null || !switchCompat.isChecked()) {
            TimeRemindViewHandler$CallBack1 timeRemindViewHandler$CallBack1 = this.f9330u;
            if (timeRemindViewHandler$CallBack1 != null) {
                timeRemindViewHandler$CallBack1.onInputChanged(true);
            }
            return true;
        }
        TextView textView = (TextView) this.f9314d.getValue();
        if (!TextUtils.isEmpty(textView != null ? textView.getText() : null)) {
            TextView textView2 = (TextView) this.f9313c.getValue();
            z3 = TextUtils.isEmpty(textView2 != null ? textView2.getText() : null) ? false : true;
        }
        TimeRemindViewHandler$CallBack1 timeRemindViewHandler$CallBack2 = this.f9330u;
        if (timeRemindViewHandler$CallBack2 != null) {
            timeRemindViewHandler$CallBack2.onInputChanged(z3);
        }
        return z3;
    }

    public final boolean d() {
        SwitchCompat switchCompat = (SwitchCompat) this.f9320j.getValue();
        if (switchCompat != null) {
            return switchCompat.isChecked();
        }
        return false;
    }

    public final void e(int i7) {
        p355xf.t tVar = this.f9316f;
        p355xf.t tVar2 = this.f9318h;
        if (i7 == 0) {
            this.f9331v = 0;
            ImageView imageView = (ImageView) tVar2.getValue();
            if (imageView != null) {
                imageView.setImageResource(com.transsnet.palmpay.custom_view.r.cv_purple_checked);
            }
            ImageView imageView2 = (ImageView) tVar.getValue();
            if (imageView2 != null) {
                imageView2.setImageResource(com.transsnet.palmpay.custom_view.r.cv_gray_unchecked);
                return;
            }
            return;
        }
        this.f9331v = 1;
        ImageView imageView3 = (ImageView) tVar2.getValue();
        if (imageView3 != null) {
            imageView3.setImageResource(com.transsnet.palmpay.custom_view.r.cv_gray_unchecked);
        }
        ImageView imageView4 = (ImageView) tVar.getValue();
        if (imageView4 != null) {
            imageView4.setImageResource(com.transsnet.palmpay.custom_view.r.cv_purple_checked);
        }
    }

    public final void f(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        String str = this.f9321k;
        boolean zC = Intrinsics.c(str, text);
        String str2 = this.f9322l;
        if (zC) {
            this.f9324n = "Every Week";
            this.f9325o = str;
        } else if (Intrinsics.c(str2, text)) {
            this.f9324n = "Every Day";
            this.f9325o = str2;
        } else {
            this.f9324n = "Every Month";
            this.f9325o = this.f9323m;
        }
        TextView textView = (TextView) this.f9311a.getValue();
        if (textView != null) {
            textView.setText(Intrinsics.c(this.f9325o, str2) ? p025ba.k.core_time : p025ba.k.core_day);
        }
        TextView textView2 = (TextView) this.f9314d.getValue();
        if (textView2 != null) {
            textView2.setText(this.f9324n);
        }
    }

    public final void g(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f9326p = text;
        TextView textView = (TextView) this.f9313c.getValue();
        if (textView != null) {
            textView.setText(this.f9326p);
        }
    }

    public final void h(int i7, List list, int i10, Function1 function1) {
        Context context;
        X6.r rVar = this.f9327q;
        if ((rVar == null || !rVar.isShowing()) && (context = this.f9329s) != null) {
            C0058e c0058e = new C0058e(16, list, function1);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            X6.r rVar2 = new X6.r(context, 0);
            rVar2.f11048d = c0058e;
            rVar2.f11005c = context.getString(i7);
            int i11 = 0;
            rVar2.f11050f = kotlin.ranges.b.c(i10, 0, C1850q.g(list));
            List list2 = list;
            ArrayList arrayList = new ArrayList(kotlin.collections.r.l(list2, 10));
            for (Object obj : list2) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C1850q.k();
                    throw null;
                }
                arrayList.add(new Y6.a((String) obj, String.valueOf(i11)));
                i11 = i12;
            }
            rVar2.f11051g = arrayList;
            rVar2.setOnDismissListener(new Ce.p0(5, this, rVar2));
            this.f9327q = rVar2;
            rVar2.show();
        }
    }

    public final List i(String str) {
        if (Intrinsics.c(str, this.f9321k)) {
            String[] strArr = p185ma.m.f39611a;
            return C1847n.y(p185ma.m.f39611a);
        }
        if (Intrinsics.c(str, this.f9322l)) {
            String[] strArr2 = p185ma.m.f39611a;
            return C1847n.y(p185ma.m.f39612b);
        }
        IntRange intRange = new IntRange(1, 31, 1);
        ArrayList arrayList = new ArrayList(kotlin.collections.r.l(intRange, 10));
        Iterator it = intRange.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((kotlin.collections.C) it).a()));
        }
        return arrayList;
    }
}
