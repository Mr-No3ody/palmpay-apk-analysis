package com.transsnet.palmpay.credit.ui.activity.cashloan;

import Ya.e;
import Ya.f;
import Za.b;
import android.os.Bundle;
import androidx.fragment.app.Z;
import androidx.viewpager2.widget.ViewPager2;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRecordActivity;
import com.transsnet.palmpay.credit.ui.fragment.CLBorrowListFragment;
import com.transsnet.palmpay.credit.ui.fragment.CLRepaymentListFragment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p052da.E;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit还款记录页", path = "/credit_score/cl_record_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLRecordActivity;", "LZa/b;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLRecordActivity extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f29016g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29019f;

    public CLRecordActivity() {
        final int i7 = 0;
        this.f29017d = C2131j.b(new Function0(this) { // from class: tb.P

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRecordActivity f42425b;

            {
                this.f42425b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRecordActivity cLRecordActivity = this.f42425b;
                switch (i7) {
                    case 0:
                        int i10 = CLRecordActivity.f29016g;
                        return (ViewPager2) cLRecordActivity.findViewById(e.record_vp2);
                    default:
                        int i11 = CLRecordActivity.f29016g;
                        return (TabLayout) cLRecordActivity.findViewById(e.record_tl);
                }
            }
        });
        final int i10 = 1;
        this.f29018e = C2131j.b(new Function0(this) { // from class: tb.P

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRecordActivity f42425b;

            {
                this.f42425b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRecordActivity cLRecordActivity = this.f42425b;
                switch (i10) {
                    case 0:
                        int i11 = CLRecordActivity.f29016g;
                        return (ViewPager2) cLRecordActivity.findViewById(e.record_vp2);
                    default:
                        int i12 = CLRecordActivity.f29016g;
                        return (TabLayout) cLRecordActivity.findViewById(e.record_tl);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_cl_record_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CLBorrowListFragment());
        arrayList.add(new CLRepaymentListFragment());
        Z supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        E e10 = new E(supportFragmentManager, getLifecycle(), arrayList, 2);
        t tVar = this.f29017d;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((ViewPager2) value).setAdapter(e10);
        t tVar2 = this.f29018e;
        Object value2 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        new TabLayoutMediator((TabLayout) value2, (ViewPager2) value3, new p184m8.b(13)).attach();
        Object value4 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        Object value5 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ((TabLayout) value4).selectTab(((TabLayout) value5).getTabAt(this.f29019f));
    }
}
