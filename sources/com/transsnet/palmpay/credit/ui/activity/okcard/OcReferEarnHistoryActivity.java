package com.transsnet.palmpay.credit.ui.activity.okcard;

import Ya.e;
import android.os.Bundle;
import android.widget.TextView;
import androidx.vectordrawable.graphics.drawable.q;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcReferEarnHistoryActivity;
import com.transsnet.palmpay.custom_view.p;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p285sc.x;
import p310ub.N0;
import p355xf.C2131j;
import p355xf.t;
import p368yb.L;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC运营历史记录页", path = "/credit_score/oc_refer_earn_history_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcReferEarnHistoryActivity;", "LZa/b;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcReferEarnHistoryActivity extends Za.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f29690i = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x f29694g = new x(this, 24);

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

    public OcReferEarnHistoryActivity() {
        final int i7 = 0;
        this.f29691d = C2131j.b(new Function0(this) { // from class: ub.M0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcReferEarnHistoryActivity f42775b;

            {
                this.f42775b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcReferEarnHistoryActivity ocReferEarnHistoryActivity = this.f42775b;
                switch (i7) {
                    case 0:
                        int i10 = OcReferEarnHistoryActivity.f29690i;
                        return (ViewPager) ocReferEarnHistoryActivity.findViewById(e.viewPager);
                    case 1:
                        int i11 = OcReferEarnHistoryActivity.f29690i;
                        return (TextView) ocReferEarnHistoryActivity.findViewById(e.tvWithdraw);
                    default:
                        int i12 = OcReferEarnHistoryActivity.f29690i;
                        return (TextView) ocReferEarnHistoryActivity.findViewById(e.tvReward);
                }
            }
        });
        final int i10 = 1;
        this.f29692e = C2131j.b(new Function0(this) { // from class: ub.M0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcReferEarnHistoryActivity f42775b;

            {
                this.f42775b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcReferEarnHistoryActivity ocReferEarnHistoryActivity = this.f42775b;
                switch (i10) {
                    case 0:
                        int i11 = OcReferEarnHistoryActivity.f29690i;
                        return (ViewPager) ocReferEarnHistoryActivity.findViewById(e.viewPager);
                    case 1:
                        int i12 = OcReferEarnHistoryActivity.f29690i;
                        return (TextView) ocReferEarnHistoryActivity.findViewById(e.tvWithdraw);
                    default:
                        int i13 = OcReferEarnHistoryActivity.f29690i;
                        return (TextView) ocReferEarnHistoryActivity.findViewById(e.tvReward);
                }
            }
        });
        final int i11 = 2;
        this.f29693f = C2131j.b(new Function0(this) { // from class: ub.M0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcReferEarnHistoryActivity f42775b;

            {
                this.f42775b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcReferEarnHistoryActivity ocReferEarnHistoryActivity = this.f42775b;
                switch (i11) {
                    case 0:
                        int i12 = OcReferEarnHistoryActivity.f29690i;
                        return (ViewPager) ocReferEarnHistoryActivity.findViewById(e.viewPager);
                    case 1:
                        int i13 = OcReferEarnHistoryActivity.f29690i;
                        return (TextView) ocReferEarnHistoryActivity.findViewById(e.tvWithdraw);
                    default:
                        int i14 = OcReferEarnHistoryActivity.f29690i;
                        return (TextView) ocReferEarnHistoryActivity.findViewById(e.tvReward);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_activity_re_history;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        o().setCurrentItem(getIntent().getIntExtra("ok_card_select_index", 0), false);
    }

    public final TextView m() {
        Object value = this.f29693f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final TextView n() {
        Object value = this.f29692e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final ViewPager o() {
        Object value = this.f29691d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ViewPager) value;
    }

    public final void p(boolean z3) {
        if (z3) {
            m().setBackground(getResources().getDrawable(Ya.d.cs_tab_selected_bg));
            m().setTextColor(getResources().getColor(L6.b.ppColorTextBase));
            n().setBackground(getResources().getDrawable(Ya.d.cs_tab_unselected_bg));
            n().setTextColor(getResources().getColor(p.transparent_white_30));
            return;
        }
        m().setBackground(getResources().getDrawable(Ya.d.cs_tab_unselected_bg));
        m().setTextColor(getResources().getColor(p.transparent_white_30));
        n().setBackground(getResources().getDrawable(Ya.d.cs_tab_selected_bg));
        n().setTextColor(getResources().getColor(L6.b.ppColorTextBase));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(p025ba.c.core_oc_refer_earn_bg));
        o().setAdapter(new L(getSupportFragmentManager(), 0));
        TextView textViewM = m();
        x xVar = this.f29694g;
        p220oa.h.l(xVar, textViewM);
        p220oa.h.l(xVar, n());
        o().addOnPageChangeListener(new N0(this));
        o().setBackground(q.a(getTheme(), getResources(), p025ba.d.core_oc_refer_earn_details_bg));
    }
}
