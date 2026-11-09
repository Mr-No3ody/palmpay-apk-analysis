package com.transsnet.palmpay.core.ui.activity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.material.tabs.TabLayout;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/coreImpl/add_new_card")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/core/ui/activity/AddBankCardAccountActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "Cd/d", "BackPressedListener", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AddBankCardAccountActivity extends BaseActivity {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f27411f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p355xf.t f27412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p355xf.t f27413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p355xf.t f27414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27415d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f27416e = new SparseArray(2);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/core/ui/activity/AddBankCardAccountActivity$BackPressedListener;", "", "onBackPressed", "", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface BackPressedListener {
        void onBackPressed();
    }

    public AddBankCardAccountActivity() {
        final int i7 = 0;
        this.f27412a = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankCardAccountActivity f27739b;

            {
                this.f27739b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankCardAccountActivity addBankCardAccountActivity = this.f27739b;
                switch (i7) {
                    case 0:
                        int i10 = AddBankCardAccountActivity.f27411f;
                        return (ViewPager) addBankCardAccountActivity.findViewById(L9.a.viewpager);
                    case 1:
                        int i11 = AddBankCardAccountActivity.f27411f;
                        return (TabLayout) addBankCardAccountActivity.findViewById(L9.a.tabLayout);
                    default:
                        int i12 = AddBankCardAccountActivity.f27411f;
                        return (PpTitleBar) addBankCardAccountActivity.findViewById(L9.a.titleBar);
                }
            }
        });
        final int i10 = 1;
        this.f27413b = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankCardAccountActivity f27739b;

            {
                this.f27739b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankCardAccountActivity addBankCardAccountActivity = this.f27739b;
                switch (i10) {
                    case 0:
                        int i11 = AddBankCardAccountActivity.f27411f;
                        return (ViewPager) addBankCardAccountActivity.findViewById(L9.a.viewpager);
                    case 1:
                        int i12 = AddBankCardAccountActivity.f27411f;
                        return (TabLayout) addBankCardAccountActivity.findViewById(L9.a.tabLayout);
                    default:
                        int i13 = AddBankCardAccountActivity.f27411f;
                        return (PpTitleBar) addBankCardAccountActivity.findViewById(L9.a.titleBar);
                }
            }
        });
        final int i11 = 2;
        this.f27414c = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankCardAccountActivity f27739b;

            {
                this.f27739b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankCardAccountActivity addBankCardAccountActivity = this.f27739b;
                switch (i11) {
                    case 0:
                        int i12 = AddBankCardAccountActivity.f27411f;
                        return (ViewPager) addBankCardAccountActivity.findViewById(L9.a.viewpager);
                    case 1:
                        int i13 = AddBankCardAccountActivity.f27411f;
                        return (TabLayout) addBankCardAccountActivity.findViewById(L9.a.tabLayout);
                    default:
                        int i14 = AddBankCardAccountActivity.f27411f;
                        return (PpTitleBar) addBankCardAccountActivity.findViewById(L9.a.titleBar);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return L9.b.core_activity_add_bank_card_account;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(L6.b.ppColorBackgroundLight, this));
    }

    public final ViewPager l() {
        return (ViewPager) this.f27412a.getValue();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        ActivityResultCaller activityResultCaller = (Fragment) this.f27416e.get(l().getCurrentItem());
        if (activityResultCaller instanceof BackPressedListener) {
            ((BackPressedListener) activityResultCaller).onBackPressed();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        TabLayout.TabView tabView;
        boolean zIsNG = BaseApplication.isNG();
        p355xf.t tVar = this.f27414c;
        if (zIsNG) {
            ((PpTitleBar) tVar.getValue()).setRightText(CommonViewExtKt.string(p025ba.k.core_faqs, this));
            ((PpTitleBar) tVar.getValue()).setRightTextViewClickListener(new W8.d(26));
        } else {
            ((PpTitleBar) tVar.getValue()).setRightText("");
        }
        ((PpTitleBar) tVar.getValue()).setBackButtonClickListener(new Yd.i(this, 20));
        l().addOnPageChangeListener(new C1468b());
        l().setAdapter(new Cd.d(this, getSupportFragmentManager()));
        l().setOffscreenPageLimit(2);
        p355xf.t tVar2 = this.f27413b;
        ((TabLayout) tVar2.getValue()).setupWithViewPager(l());
        ((TabLayout) tVar2.getValue()).setOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C1469c());
        l().setCurrentItem(this.f27415d == 1 ? 0 : 1);
        int childCount = ((TabLayout) tVar2.getValue()).getChildCount();
        if (childCount < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            TabLayout.Tab tabAt = ((TabLayout) tVar2.getValue()).getTabAt(i7);
            View childAt = (tabAt == null || (tabView = tabAt.view) == null) ? null : tabView.getChildAt(1);
            if (childAt instanceof TextView) {
                ((TextView) childAt).setTypeface(Typeface.create(((TabLayout) tVar2.getValue()).getSelectedTabPosition() == i7 ? "sans-serif-medium" : "sans-serif", 0));
            }
            if (i7 == childCount) {
                return;
            } else {
                i7++;
            }
        }
    }
}
