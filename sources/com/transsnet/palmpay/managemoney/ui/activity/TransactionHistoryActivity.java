package com.transsnet.palmpay.managemoney.ui.activity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Z;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.material.tabs.TabLayout;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.ui.activity.ViewOnClickListenerC1478l;
import com.transsnet.palmpay.managemoney.ui.fragment.UserFixedSavingFragment;
import com.transsnet.palmpay.managemoney.ui.viewmodel.TransactionHistoryViewModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/manage_money/transaction_history_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/activity/TransactionHistoryActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/TransactionHistoryViewModel;", "<init>", "()V", "TransactionType", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransactionHistoryActivity extends BaseMvvmActivity<TransactionHistoryViewModel> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f32203f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p355xf.t f32204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p355xf.t f32205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p355xf.t f32206e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0005\b\u0087\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/activity/TransactionHistoryActivity$TransactionType;", "", "<init>", "()V", "Companion", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(p371yf.a.f44341a)
    public @interface TransactionType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int INVESTMENTS = 1;
        public static final int MATURED = 2;

        /* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.activity.TransactionHistoryActivity$TransactionType$a, reason: from kotlin metadata */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int INVESTMENTS = 1;
            public static final int MATURED = 2;

            private Companion() {
            }
        }
    }

    public TransactionHistoryActivity() {
        final int i7 = 0;
        this.f32204c = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.V

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionHistoryActivity f32217b;

            {
                this.f32217b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionHistoryActivity transactionHistoryActivity = this.f32217b;
                switch (i7) {
                    case 0:
                        int i10 = TransactionHistoryActivity.f32203f;
                        return (ViewPager) transactionHistoryActivity.findViewById(Jc.c.viewPager);
                    case 1:
                        int i11 = TransactionHistoryActivity.f32203f;
                        return (TabLayout) transactionHistoryActivity.findViewById(Jc.c.tabLayout);
                    default:
                        int i12 = TransactionHistoryActivity.f32203f;
                        return (PpTitleBar) transactionHistoryActivity.findViewById(Jc.c.titleBar);
                }
            }
        });
        final int i10 = 1;
        this.f32205d = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.V

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionHistoryActivity f32217b;

            {
                this.f32217b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionHistoryActivity transactionHistoryActivity = this.f32217b;
                switch (i10) {
                    case 0:
                        int i11 = TransactionHistoryActivity.f32203f;
                        return (ViewPager) transactionHistoryActivity.findViewById(Jc.c.viewPager);
                    case 1:
                        int i12 = TransactionHistoryActivity.f32203f;
                        return (TabLayout) transactionHistoryActivity.findViewById(Jc.c.tabLayout);
                    default:
                        int i13 = TransactionHistoryActivity.f32203f;
                        return (PpTitleBar) transactionHistoryActivity.findViewById(Jc.c.titleBar);
                }
            }
        });
        final int i11 = 2;
        this.f32206e = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.V

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionHistoryActivity f32217b;

            {
                this.f32217b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionHistoryActivity transactionHistoryActivity = this.f32217b;
                switch (i11) {
                    case 0:
                        int i12 = TransactionHistoryActivity.f32203f;
                        return (ViewPager) transactionHistoryActivity.findViewById(Jc.c.viewPager);
                    case 1:
                        int i13 = TransactionHistoryActivity.f32203f;
                        return (TabLayout) transactionHistoryActivity.findViewById(Jc.c.tabLayout);
                    default:
                        int i14 = TransactionHistoryActivity.f32203f;
                        return (PpTitleBar) transactionHistoryActivity.findViewById(Jc.c.titleBar);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Jc.d.mm_transaction_history_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight), true);
    }

    public final TextView m(String str) {
        TextView textView = new TextView(this);
        textView.setTextSize(2, 14.0f);
        textView.setTextColor(getColor(Jc.a.mm_color_202046));
        textView.setText(str);
        textView.setTypeface(Typeface.create("sans-serif-medium", 0));
        textView.setGravity(17);
        return textView;
    }

    public final TabLayout n() {
        Object value = this.f32205d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TabLayout) value;
    }

    public final void o(TabLayout.Tab tab, boolean z3) {
        View customView;
        if (tab == null || (customView = tab.getCustomView()) == null || !(customView instanceof TextView)) {
            return;
        }
        ((TextView) customView).setTextColor(getColor(z3 ? Jc.a.mm_color_6306b2 : Jc.a.mm_color_202046));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        p355xf.t tVar = this.f32204c;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((ViewPager) value).setOffscreenPageLimit(2);
        n().addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new W(this));
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        Z supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        ArrayList arrayList = new ArrayList();
        UserFixedSavingFragment.a aVar = UserFixedSavingFragment.f32574v;
        arrayList.add(aVar.newInstance(1, 1));
        arrayList.add(aVar.newInstance(1, 2));
        Unit unit = Unit.f38893a;
        ((ViewPager) value2).setAdapter(new com.transsnet.palmpay.managemoney.ui.fragment.X(supportFragmentManager, arrayList));
        TabLayout tabLayoutN = n();
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        tabLayoutN.setupWithViewPager((ViewPager) value3);
        TabLayout.Tab tabAt = n().getTabAt(0);
        if (tabAt != null) {
            String string = getResources().getString(Jc.f.mm_tab_saving);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            tabAt.setCustomView(m(string));
        }
        TabLayout.Tab tabAt2 = n().getTabAt(1);
        if (tabAt2 != null) {
            String string2 = getResources().getString(Jc.f.mm_tab_matured);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            tabAt2.setCustomView(m(string2));
        }
        o(n().getTabAt(0), true);
        p355xf.t tVar2 = this.f32206e;
        Object value4 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        PpTitleBar ppTitleBar = (PpTitleBar) value4;
        if (ppTitleBar != null) {
            ppTitleBar.setRightImageView2Icon(S6.a.pay_Question);
        }
        Object value5 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        PpTitleBar ppTitleBar2 = (PpTitleBar) value5;
        if (ppTitleBar2 != null) {
            ppTitleBar2.setRightImageView2ClickListener(new ViewOnClickListenerC1478l(17));
        }
    }
}
