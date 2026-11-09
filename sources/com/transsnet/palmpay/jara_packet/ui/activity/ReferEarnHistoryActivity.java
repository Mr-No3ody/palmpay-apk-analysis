package com.transsnet.palmpay.jara_packet.ui.activity;

import android.widget.RelativeLayout;
import androidx.fragment.app.Z;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.V;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.material.tabs.TabLayout;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnHistoryActivity;
import com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnHistoryContract;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p173ld.o;
import p236pc.b;
import p236pc.d;
import p236pc.e;
import p236pc.f;
import p295tc.c;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/refer_earn/history")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/ui/activity/ReferEarnHistoryActivity;", "Lcom/transsnet/palmpay/core/base/i;", "Lzc/a;", "Lcom/transsnet/palmpay/jara_packet/ui/mvp/contract/ReferEarnHistoryContract$View;", "<init>", "()V", "a", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReferEarnHistoryActivity extends i implements ReferEarnHistoryContract.View {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f31864j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f31865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f31866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f31867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f31868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f31869f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f31870g = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o f31871i = new o(this, 29);

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

    public ReferEarnHistoryActivity() {
        final int i7 = 0;
        this.f31865b = C2131j.b(new Function0(this) { // from class: sc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnHistoryActivity f42213b;

            {
                this.f42213b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnHistoryActivity referEarnHistoryActivity = this.f42213b;
                switch (i7) {
                    case 0:
                        int i10 = ReferEarnHistoryActivity.f31864j;
                        return (RelativeLayout) referEarnHistoryActivity.findViewById(d.jp_rl_invite);
                    case 1:
                        int i11 = ReferEarnHistoryActivity.f31864j;
                        return (ViewPager) referEarnHistoryActivity.findViewById(d.jp_history_viewpager);
                    case 2:
                        int i12 = ReferEarnHistoryActivity.f31864j;
                        return (TabLayout) referEarnHistoryActivity.findViewById(d.tabLayout);
                    default:
                        int i13 = ReferEarnHistoryActivity.f31864j;
                        return (PpTitleBar) referEarnHistoryActivity.findViewById(d.titleBar);
                }
            }
        });
        final int i10 = 1;
        this.f31866c = C2131j.b(new Function0(this) { // from class: sc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnHistoryActivity f42213b;

            {
                this.f42213b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnHistoryActivity referEarnHistoryActivity = this.f42213b;
                switch (i10) {
                    case 0:
                        int i11 = ReferEarnHistoryActivity.f31864j;
                        return (RelativeLayout) referEarnHistoryActivity.findViewById(d.jp_rl_invite);
                    case 1:
                        int i12 = ReferEarnHistoryActivity.f31864j;
                        return (ViewPager) referEarnHistoryActivity.findViewById(d.jp_history_viewpager);
                    case 2:
                        int i13 = ReferEarnHistoryActivity.f31864j;
                        return (TabLayout) referEarnHistoryActivity.findViewById(d.tabLayout);
                    default:
                        int i14 = ReferEarnHistoryActivity.f31864j;
                        return (PpTitleBar) referEarnHistoryActivity.findViewById(d.titleBar);
                }
            }
        });
        final int i11 = 2;
        this.f31867d = C2131j.b(new Function0(this) { // from class: sc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnHistoryActivity f42213b;

            {
                this.f42213b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnHistoryActivity referEarnHistoryActivity = this.f42213b;
                switch (i11) {
                    case 0:
                        int i12 = ReferEarnHistoryActivity.f31864j;
                        return (RelativeLayout) referEarnHistoryActivity.findViewById(d.jp_rl_invite);
                    case 1:
                        int i13 = ReferEarnHistoryActivity.f31864j;
                        return (ViewPager) referEarnHistoryActivity.findViewById(d.jp_history_viewpager);
                    case 2:
                        int i14 = ReferEarnHistoryActivity.f31864j;
                        return (TabLayout) referEarnHistoryActivity.findViewById(d.tabLayout);
                    default:
                        int i15 = ReferEarnHistoryActivity.f31864j;
                        return (PpTitleBar) referEarnHistoryActivity.findViewById(d.titleBar);
                }
            }
        });
        final int i12 = 3;
        this.f31868e = C2131j.b(new Function0(this) { // from class: sc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnHistoryActivity f42213b;

            {
                this.f42213b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnHistoryActivity referEarnHistoryActivity = this.f42213b;
                switch (i12) {
                    case 0:
                        int i13 = ReferEarnHistoryActivity.f31864j;
                        return (RelativeLayout) referEarnHistoryActivity.findViewById(d.jp_rl_invite);
                    case 1:
                        int i14 = ReferEarnHistoryActivity.f31864j;
                        return (ViewPager) referEarnHistoryActivity.findViewById(d.jp_history_viewpager);
                    case 2:
                        int i15 = ReferEarnHistoryActivity.f31864j;
                        return (TabLayout) referEarnHistoryActivity.findViewById(d.tabLayout);
                    default:
                        int i16 = ReferEarnHistoryActivity.f31864j;
                        return (PpTitleBar) referEarnHistoryActivity.findViewById(d.titleBar);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.jp_activity_cs_history;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        int intExtra = getIntent().getIntExtra("ok_card_select_index", 0);
        Object value = this.f31866c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((ViewPager) value).setCurrentItem(intExtra, false);
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new p383zc.a();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(b.jp_refer_earn_bg));
        String stringExtra = getIntent().getStringExtra("extra_data");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f31869f = stringExtra;
        ArrayList arrayList = this.f31870g;
        arrayList.add(getString(f.jp_reward));
        arrayList.add(getString(f.jp_withdrawal));
        Z supportFragmentManager = getSupportFragmentManager();
        String str = this.f31869f;
        c cVar = new c(supportFragmentManager, 0);
        cVar.f42544j = str;
        cVar.f42545k = arrayList;
        t tVar = this.f31866c;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((ViewPager) value).setAdapter(cVar);
        Object value2 = this.f31867d.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((TabLayout) value2).setupWithViewPager((ViewPager) value3);
        Object value4 = this.f31865b.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((RelativeLayout) value4).setOnClickListener(this.f31871i);
        PpTitleBar ppTitleBar = (PpTitleBar) this.f31868e.getValue();
        if (ppTitleBar != null) {
            ppTitleBar.c(S6.a.pay_ArrowLeft, CommonViewExtKt.colorInt(L6.b.ppColorBackgroundLight, this));
        }
    }
}
