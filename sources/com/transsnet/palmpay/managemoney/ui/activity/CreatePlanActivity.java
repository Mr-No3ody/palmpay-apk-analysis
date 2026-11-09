package com.transsnet.palmpay.managemoney.ui.activity;

import Oc.C0500c;
import Pa.n0;
import Pa.r0;
import Ua.ViewOnFocusChangeListenerC0631l;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Z;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.ui.activity.ViewOnClickListenerC1478l;
import com.transsnet.palmpay.custom_view.AmountEditText;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import com.transsnet.palmpay.managemoney.bean.resp.GetBeforeOrderResp;
import com.transsnet.palmpay.managemoney.ui.dialog.PickDateDialogFragment;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CreatePlanViewModel;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.TimeUtils;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/manage_money/create_plan_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/activity/CreatePlanActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/CreatePlanViewModel;", "<init>", "()V", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCreatePlanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreatePlanActivity.kt\ncom/transsnet/palmpay/managemoney/ui/activity/CreatePlanActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,941:1\n115#2,8:942\n145#2:950\n260#2,10:951\n296#2:961\n71#2,8:962\n112#2:970\n171#2,12:971\n215#2:983\n171#2,12:984\n215#2:996\n1878#3,3:997\n1878#3,3:1000\n1#4:1003\n*S KotlinDebug\n*F\n+ 1 CreatePlanActivity.kt\ncom/transsnet/palmpay/managemoney/ui/activity/CreatePlanActivity\n*L\n351#1:942,8\n351#1:950\n418#1:951,10\n418#1:961\n445#1:962,8\n445#1:970\n468#1:971,12\n468#1:983\n487#1:984,12\n487#1:996\n630#1:997,3\n659#1:1000,3\n*E\n"})
public final class CreatePlanActivity extends BaseMvvmActivity<CreatePlanViewModel> {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f32067M = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p355xf.t f32068A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p355xf.t f32069B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final p355xf.t f32070C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Lc.a f32071H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final p355xf.t f32072L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GetBeforeOrderResp.StateInfo f32073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GetBeforeOrderResp.BeforeOrderBean f32074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f32075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f32076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f32077g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f32078i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f32079j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f32080o;
    public int t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f32083w;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f32081p = 50000;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f32082v = new ArrayList();

    public CreatePlanActivity() {
        final int i7 = 0;
        this.f32068A = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreatePlanActivity f32252b;

            {
                this.f32252b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Bundle extras;
                Bundle extras2;
                Long lValueOf = null;
                CreatePlanActivity createPlanActivity = this.f32252b;
                switch (i7) {
                    case 0:
                        int i10 = CreatePlanActivity.f32067M;
                        Intent intent = createPlanActivity.getIntent();
                        Object obj = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.get("duration_day");
                        if (obj instanceof Long) {
                            lValueOf = (Long) obj;
                        } else if (obj instanceof String) {
                            lValueOf = StringsKt.U((String) obj);
                        } else if (obj instanceof Integer) {
                            lValueOf = Long.valueOf(((Number) obj).intValue());
                        }
                        return Long.valueOf(Math.max(lValueOf != null ? lValueOf.longValue() : 0L, 0L));
                    case 1:
                        int i11 = CreatePlanActivity.f32067M;
                        return createPlanActivity.getIntent().getStringExtra("plan_goal");
                    case 2:
                        int i12 = CreatePlanActivity.f32067M;
                        return createPlanActivity.getIntent().getStringExtra("plan_bg");
                    case 3:
                        int i13 = CreatePlanActivity.f32067M;
                        return createPlanActivity.getIntent().getStringExtra("plan_name");
                    default:
                        int i14 = CreatePlanActivity.f32067M;
                        Intent intent2 = createPlanActivity.getIntent();
                        Object obj2 = (intent2 == null || (extras2 = intent2.getExtras()) == null) ? null : extras2.get(FirebaseAnalytics.Param.PRODUCT_ID);
                        if (obj2 instanceof Long) {
                            lValueOf = (Long) obj2;
                        } else if (obj2 instanceof String) {
                            lValueOf = StringsKt.U((String) obj2);
                        }
                        return Long.valueOf(lValueOf != null ? lValueOf.longValue() : 0L);
                }
            }
        });
        final int i10 = 1;
        this.f32069B = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreatePlanActivity f32252b;

            {
                this.f32252b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Bundle extras;
                Bundle extras2;
                Long lValueOf = null;
                CreatePlanActivity createPlanActivity = this.f32252b;
                switch (i10) {
                    case 0:
                        int i11 = CreatePlanActivity.f32067M;
                        Intent intent = createPlanActivity.getIntent();
                        Object obj = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.get("duration_day");
                        if (obj instanceof Long) {
                            lValueOf = (Long) obj;
                        } else if (obj instanceof String) {
                            lValueOf = StringsKt.U((String) obj);
                        } else if (obj instanceof Integer) {
                            lValueOf = Long.valueOf(((Number) obj).intValue());
                        }
                        return Long.valueOf(Math.max(lValueOf != null ? lValueOf.longValue() : 0L, 0L));
                    case 1:
                        int i12 = CreatePlanActivity.f32067M;
                        return createPlanActivity.getIntent().getStringExtra("plan_goal");
                    case 2:
                        int i13 = CreatePlanActivity.f32067M;
                        return createPlanActivity.getIntent().getStringExtra("plan_bg");
                    case 3:
                        int i14 = CreatePlanActivity.f32067M;
                        return createPlanActivity.getIntent().getStringExtra("plan_name");
                    default:
                        int i15 = CreatePlanActivity.f32067M;
                        Intent intent2 = createPlanActivity.getIntent();
                        Object obj2 = (intent2 == null || (extras2 = intent2.getExtras()) == null) ? null : extras2.get(FirebaseAnalytics.Param.PRODUCT_ID);
                        if (obj2 instanceof Long) {
                            lValueOf = (Long) obj2;
                        } else if (obj2 instanceof String) {
                            lValueOf = StringsKt.U((String) obj2);
                        }
                        return Long.valueOf(lValueOf != null ? lValueOf.longValue() : 0L);
                }
            }
        });
        final int i11 = 2;
        this.f32070C = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreatePlanActivity f32252b;

            {
                this.f32252b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Bundle extras;
                Bundle extras2;
                Long lValueOf = null;
                CreatePlanActivity createPlanActivity = this.f32252b;
                switch (i11) {
                    case 0:
                        int i12 = CreatePlanActivity.f32067M;
                        Intent intent = createPlanActivity.getIntent();
                        Object obj = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.get("duration_day");
                        if (obj instanceof Long) {
                            lValueOf = (Long) obj;
                        } else if (obj instanceof String) {
                            lValueOf = StringsKt.U((String) obj);
                        } else if (obj instanceof Integer) {
                            lValueOf = Long.valueOf(((Number) obj).intValue());
                        }
                        return Long.valueOf(Math.max(lValueOf != null ? lValueOf.longValue() : 0L, 0L));
                    case 1:
                        int i13 = CreatePlanActivity.f32067M;
                        return createPlanActivity.getIntent().getStringExtra("plan_goal");
                    case 2:
                        int i14 = CreatePlanActivity.f32067M;
                        return createPlanActivity.getIntent().getStringExtra("plan_bg");
                    case 3:
                        int i15 = CreatePlanActivity.f32067M;
                        return createPlanActivity.getIntent().getStringExtra("plan_name");
                    default:
                        int i16 = CreatePlanActivity.f32067M;
                        Intent intent2 = createPlanActivity.getIntent();
                        Object obj2 = (intent2 == null || (extras2 = intent2.getExtras()) == null) ? null : extras2.get(FirebaseAnalytics.Param.PRODUCT_ID);
                        if (obj2 instanceof Long) {
                            lValueOf = (Long) obj2;
                        } else if (obj2 instanceof String) {
                            lValueOf = StringsKt.U((String) obj2);
                        }
                        return Long.valueOf(lValueOf != null ? lValueOf.longValue() : 0L);
                }
            }
        });
        final int i12 = 3;
        C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreatePlanActivity f32252b;

            {
                this.f32252b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Bundle extras;
                Bundle extras2;
                Long lValueOf = null;
                CreatePlanActivity createPlanActivity = this.f32252b;
                switch (i12) {
                    case 0:
                        int i13 = CreatePlanActivity.f32067M;
                        Intent intent = createPlanActivity.getIntent();
                        Object obj = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.get("duration_day");
                        if (obj instanceof Long) {
                            lValueOf = (Long) obj;
                        } else if (obj instanceof String) {
                            lValueOf = StringsKt.U((String) obj);
                        } else if (obj instanceof Integer) {
                            lValueOf = Long.valueOf(((Number) obj).intValue());
                        }
                        return Long.valueOf(Math.max(lValueOf != null ? lValueOf.longValue() : 0L, 0L));
                    case 1:
                        int i14 = CreatePlanActivity.f32067M;
                        return createPlanActivity.getIntent().getStringExtra("plan_goal");
                    case 2:
                        int i15 = CreatePlanActivity.f32067M;
                        return createPlanActivity.getIntent().getStringExtra("plan_bg");
                    case 3:
                        int i16 = CreatePlanActivity.f32067M;
                        return createPlanActivity.getIntent().getStringExtra("plan_name");
                    default:
                        int i17 = CreatePlanActivity.f32067M;
                        Intent intent2 = createPlanActivity.getIntent();
                        Object obj2 = (intent2 == null || (extras2 = intent2.getExtras()) == null) ? null : extras2.get(FirebaseAnalytics.Param.PRODUCT_ID);
                        if (obj2 instanceof Long) {
                            lValueOf = (Long) obj2;
                        } else if (obj2 instanceof String) {
                            lValueOf = StringsKt.U((String) obj2);
                        }
                        return Long.valueOf(lValueOf != null ? lValueOf.longValue() : 0L);
                }
            }
        });
        final int i13 = 4;
        this.f32072L = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreatePlanActivity f32252b;

            {
                this.f32252b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Bundle extras;
                Bundle extras2;
                Long lValueOf = null;
                CreatePlanActivity createPlanActivity = this.f32252b;
                switch (i13) {
                    case 0:
                        int i14 = CreatePlanActivity.f32067M;
                        Intent intent = createPlanActivity.getIntent();
                        Object obj = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.get("duration_day");
                        if (obj instanceof Long) {
                            lValueOf = (Long) obj;
                        } else if (obj instanceof String) {
                            lValueOf = StringsKt.U((String) obj);
                        } else if (obj instanceof Integer) {
                            lValueOf = Long.valueOf(((Number) obj).intValue());
                        }
                        return Long.valueOf(Math.max(lValueOf != null ? lValueOf.longValue() : 0L, 0L));
                    case 1:
                        int i15 = CreatePlanActivity.f32067M;
                        return createPlanActivity.getIntent().getStringExtra("plan_goal");
                    case 2:
                        int i16 = CreatePlanActivity.f32067M;
                        return createPlanActivity.getIntent().getStringExtra("plan_bg");
                    case 3:
                        int i17 = CreatePlanActivity.f32067M;
                        return createPlanActivity.getIntent().getStringExtra("plan_name");
                    default:
                        int i18 = CreatePlanActivity.f32067M;
                        Intent intent2 = createPlanActivity.getIntent();
                        Object obj2 = (intent2 == null || (extras2 = intent2.getExtras()) == null) ? null : extras2.get(FirebaseAnalytics.Param.PRODUCT_ID);
                        if (obj2 instanceof Long) {
                            lValueOf = (Long) obj2;
                        } else if (obj2 instanceof String) {
                            lValueOf = StringsKt.U((String) obj2);
                        }
                        return Long.valueOf(lValueOf != null ? lValueOf.longValue() : 0L);
                }
            }
        });
    }

    public static final void m(CreatePlanActivity createPlanActivity, int i7) {
        int i10 = i7 == 1 ? com.transsnet.palmpay.custom_view.r.cv_switch_open_green : com.transsnet.palmpay.custom_view.r.cv_switch_close_gray;
        Lc.a aVar = createPlanActivity.f32071H;
        if (aVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        aVar.f5650w.setImageResource(i10);
        p059e1.a.U(i7, "invest_interest_disable");
    }

    public static final void n(CreatePlanActivity createPlanActivity, int i7) {
        if (i7 == 1) {
            Lc.a aVar = createPlanActivity.f32071H;
            if (aVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            aVar.f5631Z.setText(createPlanActivity.getString(p025ba.k.core_disabled));
            Lc.a aVar2 = createPlanActivity.f32071H;
            if (aVar2 != null) {
                aVar2.f5631Z.setTextColor(createPlanActivity.getResources().getColor(L6.b.ppColorTextAssist));
                return;
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
        Lc.a aVar3 = createPlanActivity.f32071H;
        if (aVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        aVar3.f5631Z.setTextColor(createPlanActivity.getResources().getColor(L6.b.ppColorPrimary));
        Lc.a aVar4 = createPlanActivity.f32071H;
        if (aVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView = aVar4.f5631Z;
        GetBeforeOrderResp.BeforeOrderBean beforeOrderBean = createPlanActivity.f32074d;
        String str = String.format("%s%%", Arrays.copyOf(new Object[]{r0.z0(r0.w1(String.valueOf(beforeOrderBean != null ? Float.valueOf(beforeOrderBean.getAnnualizedIncomeRatio()) : null), "100").toPlainString())}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        textView.setText(str.concat(" p.a."));
    }

    public static final void o(CreatePlanActivity createPlanActivity) {
        GetBeforeOrderResp.BeforeOrderBean beforeOrderBean = createPlanActivity.f32074d;
        if (beforeOrderBean != null) {
            if (!createPlanActivity.p(beforeOrderBean)) {
                createPlanActivity.f32078i = 0L;
                createPlanActivity.v();
                Lc.a aVar = createPlanActivity.f32071H;
                if (aVar != null) {
                    aVar.f5622A.setVisibility(8);
                    return;
                } else {
                    Intrinsics.n("binding");
                    throw null;
                }
            }
            GetBeforeOrderResp.StateInfo stateInfo = createPlanActivity.f32073c;
            if (stateInfo != null) {
                CreatePlanViewModel createPlanViewModel = (CreatePlanViewModel) createPlanActivity.l();
                Long lValueOf = Long.valueOf(beforeOrderBean.getProductId());
                Lc.a aVar2 = createPlanActivity.f32071H;
                if (aVar2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                Long lValueOf2 = Long.valueOf(aVar2.f5637f.getLong());
                String stateCode = stateInfo.getStateCode();
                Long lValueOf3 = Long.valueOf(createPlanActivity.f32075e);
                createPlanViewModel.getClass();
                p140j8.f.s(createPlanViewModel, new Qc.S(lValueOf, lValueOf2, stateCode, lValueOf3, null), createPlanViewModel.f32764g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            }
        }
    }

    public static void x(int i7, View view) {
        if (i7 == 0) {
            view.setBackgroundResource(Jc.a.mm_color_f3f3f3);
            return;
        }
        if (i7 == 1) {
            view.setBackgroundResource(L6.b.ppColorTextPrimary);
        } else if (i7 != 2) {
            view.setBackgroundResource(Jc.a.mm_color_f3f3f3);
        } else {
            view.setBackgroundResource(Jc.a.mm_color_fe5455);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        p355xf.t tVar = this.f32068A;
        this.f32075e = ((Number) tVar.getValue()).longValue();
        p355xf.t tVar2 = this.f32070C;
        boolean zIsEmpty = TextUtils.isEmpty((String) tVar2.getValue());
        Lc.a aVar = this.f32071H;
        if (aVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = aVar.f5642o.getLayoutParams();
        Intrinsics.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams)).topMargin = DensityUtil.dp2px(!zIsEmpty ? 32.0f : 16.0f);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Lc.a aVar2 = this.f32071H;
        if (aVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        aVar2.f5641k0.setText(s(jCurrentTimeMillis, (((Number) tVar.getValue()).longValue() * 86400000) + jCurrentTimeMillis));
        Lc.a aVar3 = this.f32071H;
        if (aVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        aVar3.f5645q0.setText(t((((Number) tVar.getValue()).longValue() * 86400000) + jCurrentTimeMillis));
        Lc.a aVar4 = this.f32071H;
        if (aVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        String str = (String) this.f32069B.getValue();
        if (str == null) {
            str = "";
        }
        aVar4.f5638g.setText(str);
        Lc.a aVar5 = this.f32071H;
        if (aVar5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        r0.p1(aVar5.f5640j, (String) tVar2.getValue(), isDarkMode());
        Lc.a aVar6 = this.f32071H;
        if (aVar6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        String stringExtra = getIntent().getStringExtra("plan_amount");
        aVar6.f5637f.setText(stringExtra != null ? stringExtra : "");
        this.f32073c = (GetBeforeOrderResp.StateInfo) getIntent().getParcelableExtra("state_info");
        com.transsnet.palmpay.core.base.l lVar = ((CreatePlanViewModel) l()).f32762e;
        if (lVar != null) {
            lVar.e(this, new Wd.I(new V8.w(this, 6), 11));
        }
        com.transsnet.palmpay.core.base.l lVar2 = ((CreatePlanViewModel) l()).f32763f;
        if (lVar2 != null) {
            lVar2.e(this, new Wd.I(new C1572s(this, this, 2), 11));
        }
        com.transsnet.palmpay.core.base.l lVar3 = ((CreatePlanViewModel) l()).f32764g;
        if (lVar3 != null) {
            lVar3.e(this, new Wd.I(new C1572s(this, this, 3), 11));
        }
        if (((Number) this.f32072L.getValue()).longValue() == 20046) {
            Lc.a aVar7 = this.f32071H;
            if (aVar7 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            aVar7.f5633b.setSlotId("11955B30FCC54621A37E6DD0EA2C71A3");
            Lc.a aVar8 = this.f32071H;
            if (aVar8 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            org.chromium.support_lib_boundary.util.b.d(aVar8.f5633b, Boolean.TRUE);
        }
        CreatePlanViewModel createPlanViewModel = (CreatePlanViewModel) l();
        com.transsnet.palmpay.core.base.l lVar4 = createPlanViewModel != null ? createPlanViewModel.f32765i : null;
        if (lVar4 != null) {
            lVar4.e(this, new Wd.I(new C1572s(this, this, 0), 11));
        }
        CreatePlanViewModel createPlanViewModel2 = (CreatePlanViewModel) l();
        com.transsnet.palmpay.core.base.l lVar5 = createPlanViewModel2 != null ? createPlanViewModel2.f32766j : null;
        if (lVar5 != null) {
            lVar5.e(this, new Wd.I(new C1572s(this, this, 1), 11));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(true);
        BarUtils.setStatusBarLightMode((Activity) this, true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewM;
        View viewM2;
        View viewM3;
        View viewInflate = getLayoutInflater().inflate(Jc.d.mm_create_plan_activity, (ViewGroup) null, false);
        int i7 = Jc.c.adView;
        SingleAdView singleAdView = (SingleAdView) p059e1.a.m(i7, viewInflate);
        if (singleAdView != null && (viewM = p059e1.a.m((i7 = Jc.c.amountViewDivider), viewInflate)) != null) {
            i7 = Jc.c.barrier;
            if (((Barrier) p059e1.a.m(i7, viewInflate)) != null) {
                i7 = Jc.c.buttonContainer;
                LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                if (linearLayout != null && (viewM2 = p059e1.a.m((i7 = Jc.c.createAutoItem), viewInflate)) != null) {
                    int i10 = Jc.c.layoutAutoSaveOp;
                    if (((ConstraintLayout) p059e1.a.m(i10, viewM2)) != null) {
                        i10 = Jc.c.switchWidget;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) p059e1.a.m(i10, viewM2);
                        if (appCompatImageView != null) {
                            i10 = Jc.c.tvAutoRemark;
                            TextView textView = (TextView) p059e1.a.m(i10, viewM2);
                            if (textView != null) {
                                i10 = Jc.c.tvBalanceAmount;
                                IconicsTextView iconicsTextView = (IconicsTextView) p059e1.a.m(i10, viewM2);
                                if (iconicsTextView != null) {
                                    i10 = Jc.c.tvGoalAutoDesc;
                                    TextView textView2 = (TextView) p059e1.a.m(i10, viewM2);
                                    if (textView2 != null) {
                                        Bc.k kVar = new Bc.k((ConstraintLayout) viewM2, appCompatImageView, textView, iconicsTextView, textView2);
                                        i7 = Jc.c.etAmount;
                                        AmountEditText amountEditText = (AmountEditText) p059e1.a.m(i7, viewInflate);
                                        if (amountEditText != null) {
                                            i7 = Jc.c.etGoal;
                                            AppCompatEditText appCompatEditText = (AppCompatEditText) p059e1.a.m(i7, viewInflate);
                                            if (appCompatEditText != null && (viewM3 = p059e1.a.m((i7 = Jc.c.goalViewDivider), viewInflate)) != null) {
                                                i7 = Jc.c.ivBg;
                                                ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                                                if (imageView != null) {
                                                    i7 = Jc.c.ivClose;
                                                    if (((IconicsImageView) p059e1.a.m(i7, viewInflate)) != null) {
                                                        i7 = Jc.c.layoutAmount;
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
                                                        if (constraintLayout != null) {
                                                            i7 = Jc.c.layoutAutoSave;
                                                            if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                                                i7 = Jc.c.layoutGoal;
                                                                if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                                                    i7 = Jc.c.layoutPaybackDate;
                                                                    if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                                                        i7 = Jc.c.ll_add_money;
                                                                        LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                                                        if (linearLayout2 != null) {
                                                                            i7 = Jc.c.rtvAll;
                                                                            RoundedTextView roundedTextView = (RoundedTextView) p059e1.a.m(i7, viewInflate);
                                                                            if (roundedTextView != null) {
                                                                                i7 = Jc.c.rtvNext;
                                                                                RoundedTextView roundedTextView2 = (RoundedTextView) p059e1.a.m(i7, viewInflate);
                                                                                if (roundedTextView2 != null) {
                                                                                    i7 = Jc.c.switchInterestWidget;
                                                                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) p059e1.a.m(i7, viewInflate);
                                                                                    if (appCompatImageView2 != null) {
                                                                                        i7 = Jc.c.titleBar;
                                                                                        if (((PpTitleBar) p059e1.a.m(i7, viewInflate)) != null) {
                                                                                            i7 = Jc.c.totalBarrier;
                                                                                            Group group = (Group) p059e1.a.m(i7, viewInflate);
                                                                                            if (group != null) {
                                                                                                i7 = Jc.c.tvAmountDesc;
                                                                                                TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                if (textView3 != null) {
                                                                                                    i7 = Jc.c.tvAmountError;
                                                                                                    TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                    if (textView4 != null) {
                                                                                                        i7 = Jc.c.tvAmountUnit;
                                                                                                        TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                        if (textView5 != null) {
                                                                                                            i7 = Jc.c.tvCreatePlanTitle;
                                                                                                            TextView textView6 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                            if (textView6 != null) {
                                                                                                                i7 = Jc.c.tvDisableInterest;
                                                                                                                TextView textView7 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                if (textView7 != null) {
                                                                                                                    i7 = Jc.c.tvGoalDesc;
                                                                                                                    TextView textView8 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                    if (textView8 != null) {
                                                                                                                        i7 = Jc.c.tvGoalError;
                                                                                                                        TextView textView9 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                        if (textView9 != null) {
                                                                                                                            i7 = Jc.c.tvInterest;
                                                                                                                            TextView textView10 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                            if (textView10 != null) {
                                                                                                                                i7 = Jc.c.tvInterestValue;
                                                                                                                                TextView textView11 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                if (textView11 != null) {
                                                                                                                                    i7 = Jc.c.tvMaturityDate;
                                                                                                                                    TextView textView12 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                    if (textView12 != null) {
                                                                                                                                        i7 = Jc.c.tvPalmpayBalance;
                                                                                                                                        TextView textView13 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                        if (textView13 != null) {
                                                                                                                                            i7 = Jc.c.tvPaybackDate;
                                                                                                                                            TextView textView14 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                            if (textView14 != null) {
                                                                                                                                                i7 = Jc.c.tvPaybackDateDesc;
                                                                                                                                                TextView textView15 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                                if (textView15 != null) {
                                                                                                                                                    i7 = Jc.c.tvTotalTitle;
                                                                                                                                                    TextView textView16 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                                    if (textView16 != null) {
                                                                                                                                                        i7 = Jc.c.tvTotalValue;
                                                                                                                                                        TextView textView17 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                                        if (textView17 != null) {
                                                                                                                                                            Lc.a aVar = new Lc.a((ConstraintLayout) viewInflate, singleAdView, viewM, linearLayout, kVar, amountEditText, appCompatEditText, viewM3, imageView, constraintLayout, linearLayout2, roundedTextView, roundedTextView2, appCompatImageView2, group, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17);
                                                                                                                                                            this.f32071H = aVar;
                                                                                                                                                            return aVar;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewM2.getResources().getResourceName(i10)));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        CreatePlanViewModel createPlanViewModel = (CreatePlanViewModel) l();
        Long lValueOf = Long.valueOf(((Number) this.f32072L.getValue()).longValue());
        createPlanViewModel.getClass();
        p140j8.f.s(createPlanViewModel, new Qc.O(lValueOf, null), createPlanViewModel.f32762e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    public final boolean p(GetBeforeOrderResp.BeforeOrderBean beforeOrderBean) {
        Lc.a aVar = this.f32071H;
        if (aVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        if (aVar.f5637f.getLong() <= beforeOrderBean.getBuyMaxLimit()) {
            Lc.a aVar2 = this.f32071H;
            if (aVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            if (aVar2.f5637f.getLong() >= beforeOrderBean.getBuyMinLimit()) {
                Lc.a aVar3 = this.f32071H;
                if (aVar3 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                BigDecimal bigDecimal = new BigDecimal(aVar3.f5637f.getLong());
                BigDecimal bigDecimalU1 = r0.U1(String.valueOf(beforeOrderBean.getMemberDailyMaxBalance()), String.valueOf(beforeOrderBean.getTodayUsedBalance()));
                Intrinsics.checkNotNullExpressionValue(bigDecimalU1, "sub(...)");
                if (bigDecimal.compareTo(bigDecimalU1) <= 0) {
                    return true;
                }
                CommonTipsDialogFragment.a aVar4 = CommonTipsDialogFragment.f31249X;
                String string = getResources().getString(Jc.f.mm_limit_exceeds);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getResources().getString(Jc.f.mm_limit_exceeds_desc, r0.B(bigDecimalU1.longValueExact(), true)));
                Matcher matcher = Pattern.compile(r0.B(bigDecimalU1.longValueExact(), true), 2).matcher(spannableStringBuilder);
                if (matcher.find()) {
                    spannableStringBuilder.setSpan(new C0500c(this, 10), matcher.start(), matcher.end(), 33);
                }
                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(aVar4, string, spannableStringBuilder, getResources().getString(Jc.f.mm_action_upgrade), new com.transsnet.palmpay.core.ui.activity.T(15), getResources().getString(Jc.f.mm_action_later), null, 32, null);
                Z supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                commonTipsDialogFragmentCreateDialog$default.show(supportFragmentManager, "showUpgradeLevelDialog");
                return false;
            }
        }
        w(getResources().getString(Jc.f.mm_input_amount_limit, r0.B(beforeOrderBean.getBuyMinLimit(), true), r0.B(beforeOrderBean.getBuyMaxLimit(), true)));
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        CreatePlanViewModel createPlanViewModel = (CreatePlanViewModel) l();
        createPlanViewModel.getClass();
        p140j8.f.s(createPlanViewModel, new Qc.P(1, null), createPlanViewModel.f32766j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    public final void q() {
        GetBeforeOrderResp.BeforeOrderBean beforeOrderBean = this.f32074d;
        if (beforeOrderBean == null || beforeOrderBean.getDurationDay() == beforeOrderBean.getMaxDurationDay()) {
            return;
        }
        long jMax = Math.max(beforeOrderBean.getDurationDay(), beforeOrderBean.getMaxDurationDay());
        PickDateDialogFragment pickDateDialogFragmentNewInstance = PickDateDialogFragment.f32299v0.newInstance(Math.min(beforeOrderBean.getDurationDay(), beforeOrderBean.getMaxDurationDay()), jMax, this.f32080o, new r(this, jMax), true);
        Z supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        pickDateDialogFragmentNewInstance.show(supportFragmentManager, "showPickDateDialog");
    }

    public final int r(Date date, Date date2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        int i7 = calendar.get(6);
        int i10 = calendar2.get(6);
        int i11 = calendar.get(1);
        int i12 = calendar2.get(1);
        if (i11 == i12) {
            return i10 - i7;
        }
        int i13 = 0;
        while (i11 < i12) {
            i13 += ((i11 % 4 != 0 || i11 % 100 == 0) && i11 % 400 != 0) ? 365 : 366;
            i11++;
        }
        return (i10 - i7) + i13;
    }

    public final String s(long j6, long j10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j6);
        calendar.get(1);
        calendar.setTimeInMillis(j10);
        calendar.get(1);
        Resources resources = getResources();
        int i7 = Jc.f.mm_savings_duration;
        Locale locale = Locale.ENGLISH;
        String string = resources.getString(i7, TimeUtils.millis2String(j6, new SimpleDateFormat("MMM dd, yyyy", locale)), TimeUtils.millis2String(j10, new SimpleDateFormat("MMM dd, yyyy", locale)));
        Intrinsics.checkNotNullExpressionValue(string, "let(...)");
        return string;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        n0.g().v("CreatePlanPage_View");
        Lc.a aVar = this.f32071H;
        if (aVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((TextView) aVar.f5636e.f749c).setVisibility(0);
        Lc.a aVar2 = this.f32071H;
        if (aVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        aVar2.f5625H.setText(BaseApplication.getCurrencySymbol());
        Lc.a aVar3 = this.f32071H;
        if (aVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        aVar3.f5637f.addTextChangedListener(new C1573t(this, 0));
        Lc.a aVar4 = this.f32071H;
        if (aVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        final int i7 = 0;
        aVar4.f5637f.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreatePlanActivity f32250b;

            {
                this.f32250b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z3) {
                switch (i7) {
                    case 0:
                        Lc.a aVar5 = this.f32250b.f32071H;
                        if (aVar5 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        View amountViewDivider = aVar5.f5634c;
                        Intrinsics.checkNotNullExpressionValue(amountViewDivider, "amountViewDivider");
                        CreatePlanActivity.x(z3 ? 1 : 0, amountViewDivider);
                        return;
                    default:
                        Lc.a aVar6 = this.f32250b.f32071H;
                        if (aVar6 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        View goalViewDivider = aVar6.f5639i;
                        Intrinsics.checkNotNullExpressionValue(goalViewDivider, "goalViewDivider");
                        CreatePlanActivity.x(z3 ? 1 : 0, goalViewDivider);
                        return;
                }
            }
        });
        Lc.a aVar5 = this.f32071H;
        if (aVar5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        aVar5.f5638g.addTextChangedListener(new C1573t(this, 1));
        Lc.a aVar6 = this.f32071H;
        if (aVar6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        final int i10 = 1;
        aVar6.f5638g.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreatePlanActivity f32250b;

            {
                this.f32250b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z3) {
                switch (i10) {
                    case 0:
                        Lc.a aVar7 = this.f32250b.f32071H;
                        if (aVar7 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        View amountViewDivider = aVar7.f5634c;
                        Intrinsics.checkNotNullExpressionValue(amountViewDivider, "amountViewDivider");
                        CreatePlanActivity.x(z3 ? 1 : 0, amountViewDivider);
                        return;
                    default:
                        Lc.a aVar8 = this.f32250b.f32071H;
                        if (aVar8 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        View goalViewDivider = aVar8.f5639i;
                        Intrinsics.checkNotNullExpressionValue(goalViewDivider, "goalViewDivider");
                        CreatePlanActivity.x(z3 ? 1 : 0, goalViewDivider);
                        return;
                }
            }
        });
        Lc.a aVar7 = this.f32071H;
        if (aVar7 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        aVar7.f5645q0.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0631l(3));
        Lc.a aVar8 = this.f32071H;
        if (aVar8 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        aVar8.f5649v.setOnClickListener(new ViewOnClickListenerC1571q(this, 1));
        Lc.a aVar9 = this.f32071H;
        if (aVar9 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        aVar9.f5645q0.setOnClickListener(new ViewOnClickListenerC1571q(this, 2));
        Lc.a aVar10 = this.f32071H;
        if (aVar10 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        showSoftInput(aVar10.f5637f);
        Lc.a aVar11 = this.f32071H;
        if (aVar11 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        aVar11.t.setOnClickListener(new ViewOnClickListenerC1571q(this, 3));
        Lc.a aVar12 = this.f32071H;
        if (aVar12 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        aVar12.f5643p.setOnClickListener(new ViewOnClickListenerC1478l(11));
        Lc.a aVar13 = this.f32071H;
        if (aVar13 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((AppCompatImageView) aVar13.f5636e.f748b).setOnClickListener(new ViewOnClickListenerC1571q(this, 4));
        Lc.a aVar14 = this.f32071H;
        if (aVar14 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((IconicsTextView) aVar14.f5636e.f752f).setOnClickListener(new ViewOnClickListenerC1571q(this, 5));
        Lc.a aVar15 = this.f32071H;
        if (aVar15 != null) {
            aVar15.f5650w.setOnClickListener(new ViewOnClickListenerC1571q(this, 6));
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    public final String t(long j6) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j6);
        int i7 = Calendar.getInstance().get(1);
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        long timeInMillis2 = calendar.getTimeInMillis();
        calendar.setTimeInMillis(timeInMillis2);
        int i10 = calendar.get(1);
        this.f32080o = r(new Date(timeInMillis), new Date(timeInMillis2));
        String string = getString(Jc.f.mm_maturity_duration_day, TimeUtils.millis2String(timeInMillis2, new SimpleDateFormat(i7 == i10 ? "dd MMM" : "dd MMM yyyy", Locale.ENGLISH)), Integer.valueOf(r(new Date(timeInMillis), new Date(timeInMillis2))));
        Intrinsics.checkNotNullExpressionValue(string, "let(...)");
        return string;
    }

    public final void u(int i7) {
        AppCompatImageView appCompatImageView;
        int i10 = i7 == 1 ? com.transsnet.palmpay.custom_view.r.cv_switch_open_green : com.transsnet.palmpay.custom_view.r.cv_switch_close_gray;
        Lc.a aVar = this.f32071H;
        if (aVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        Bc.k kVar = aVar.f5636e;
        if (kVar == null || (appCompatImageView = (AppCompatImageView) kVar.f748b) == null) {
            return;
        }
        appCompatImageView.setImageResource(i10);
    }

    public final void v() {
        TextView textView;
        TextView textView2;
        TextView textView3;
        if (this.f32083w != 1) {
            Lc.a aVar = this.f32071H;
            if (aVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            Bc.k kVar = aVar.f5636e;
            if (kVar == null || (textView = (TextView) kVar.f749c) == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        Lc.a aVar2 = this.f32071H;
        if (aVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        Bc.k kVar2 = aVar2.f5636e;
        if (kVar2 != null && (textView3 = (TextView) kVar2.f749c) != null) {
            textView3.setVisibility(0);
        }
        Lc.a aVar3 = this.f32071H;
        if (aVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        Bc.k kVar3 = aVar3.f5636e;
        if (kVar3 == null || (textView2 = (TextView) kVar3.f749c) == null) {
            return;
        }
        textView2.setText(getResources().getString(Jc.f.mm_saving_auto_renewal_open_text, TimeUtils.millis2String(this.f32079j, new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH))));
    }

    public final void w(String str) {
        Lc.a aVar = this.f32071H;
        if (aVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView = aVar.f5624C;
        if (textView != null) {
            textView.setVisibility(!TextUtils.isEmpty(str) ? 0 : 8);
        }
        Lc.a aVar2 = this.f32071H;
        if (aVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView2 = aVar2.f5624C;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    public final void y(int i7) {
        this.t = i7;
        int i10 = 0;
        for (Object obj : this.f32082v) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C1850q.k();
                throw null;
            }
            TextView textView = (TextView) obj;
            textView.setSelected(i10 == i7);
            textView.setBackground(i10 != i7 ? getDrawable(com.transsnet.palmpay.custom_view.r.cv_rect_corner_8_bg_f6f6fa) : getDrawable(com.transsnet.palmpay.custom_view.r.cv_rect_corner_8_bg_second_storke_purple));
            textView.setTextColor(i10 != i7 ? getColor(L6.b.ppColorTextPrimary) : getColor(L6.b.ppColorPrimary));
            i10 = i11;
        }
    }
}
