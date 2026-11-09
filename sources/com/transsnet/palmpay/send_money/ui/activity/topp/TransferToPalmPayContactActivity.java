package com.transsnet.palmpay.send_money.ui.activity.topp;

import L6.b;
import android.os.Bundle;
import androidx.fragment.app.Z;
import androidx.lifecycle.AbstractC1205o;
import androidx.viewpager2.widget.ViewPager2;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayContactActivity;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactAllFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactFavoriteFragment;
import com.transsnet.palmpay.send_money.viewmodel.TransferToPalmPayContactViewModel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p052da.E;
import p059e1.a;
import p159kd.e;
import p159kd.f;
import p287se.d;
import p327vd.c;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/sm/transfer_to_palmpay_contact")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/topp/TransferToPalmPayContactActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/TransferToPalmPayContactViewModel;", "<init>", "()V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransferToPalmPayContactActivity extends BaseMvvmActivity<TransferToPalmPayContactViewModel> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f33591j = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f33592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f33594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f33595f = "COMMON";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f33596g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f33597i;

    public TransferToPalmPayContactActivity() {
        final int i7 = 0;
        this.f33592c = C2131j.b(new Function0(this) { // from class: yd.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayContactActivity f44298b;

            {
                this.f44298b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToPalmPayContactActivity transferToPalmPayContactActivity = this.f44298b;
                switch (i7) {
                    case 0:
                        int i10 = TransferToPalmPayContactActivity.f33591j;
                        return (ViewPager2) transferToPalmPayContactActivity.findViewById(e.vp_contacts);
                    case 1:
                        int i11 = TransferToPalmPayContactActivity.f33591j;
                        return (TabLayout) transferToPalmPayContactActivity.findViewById(e.tabLayout);
                    case 2:
                        int i12 = TransferToPalmPayContactActivity.f33591j;
                        return (PpTitleBar) transferToPalmPayContactActivity.findViewById(e.title_bar);
                    default:
                        int i13 = TransferToPalmPayContactActivity.f33591j;
                        return C1850q.e(transferToPalmPayContactActivity.getString(k.core_all), transferToPalmPayContactActivity.getString(k.core_favorites));
                }
            }
        });
        final int i10 = 1;
        this.f33593d = C2131j.b(new Function0(this) { // from class: yd.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayContactActivity f44298b;

            {
                this.f44298b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToPalmPayContactActivity transferToPalmPayContactActivity = this.f44298b;
                switch (i10) {
                    case 0:
                        int i11 = TransferToPalmPayContactActivity.f33591j;
                        return (ViewPager2) transferToPalmPayContactActivity.findViewById(e.vp_contacts);
                    case 1:
                        int i12 = TransferToPalmPayContactActivity.f33591j;
                        return (TabLayout) transferToPalmPayContactActivity.findViewById(e.tabLayout);
                    case 2:
                        int i13 = TransferToPalmPayContactActivity.f33591j;
                        return (PpTitleBar) transferToPalmPayContactActivity.findViewById(e.title_bar);
                    default:
                        int i14 = TransferToPalmPayContactActivity.f33591j;
                        return C1850q.e(transferToPalmPayContactActivity.getString(k.core_all), transferToPalmPayContactActivity.getString(k.core_favorites));
                }
            }
        });
        final int i11 = 2;
        this.f33594e = C2131j.b(new Function0(this) { // from class: yd.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayContactActivity f44298b;

            {
                this.f44298b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToPalmPayContactActivity transferToPalmPayContactActivity = this.f44298b;
                switch (i11) {
                    case 0:
                        int i12 = TransferToPalmPayContactActivity.f33591j;
                        return (ViewPager2) transferToPalmPayContactActivity.findViewById(e.vp_contacts);
                    case 1:
                        int i13 = TransferToPalmPayContactActivity.f33591j;
                        return (TabLayout) transferToPalmPayContactActivity.findViewById(e.tabLayout);
                    case 2:
                        int i14 = TransferToPalmPayContactActivity.f33591j;
                        return (PpTitleBar) transferToPalmPayContactActivity.findViewById(e.title_bar);
                    default:
                        int i15 = TransferToPalmPayContactActivity.f33591j;
                        return C1850q.e(transferToPalmPayContactActivity.getString(k.core_all), transferToPalmPayContactActivity.getString(k.core_favorites));
                }
            }
        });
        final int i12 = 3;
        this.f33597i = C2131j.b(new Function0(this) { // from class: yd.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayContactActivity f44298b;

            {
                this.f44298b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToPalmPayContactActivity transferToPalmPayContactActivity = this.f44298b;
                switch (i12) {
                    case 0:
                        int i13 = TransferToPalmPayContactActivity.f33591j;
                        return (ViewPager2) transferToPalmPayContactActivity.findViewById(e.vp_contacts);
                    case 1:
                        int i14 = TransferToPalmPayContactActivity.f33591j;
                        return (TabLayout) transferToPalmPayContactActivity.findViewById(e.tabLayout);
                    case 2:
                        int i15 = TransferToPalmPayContactActivity.f33591j;
                        return (PpTitleBar) transferToPalmPayContactActivity.findViewById(e.title_bar);
                    default:
                        int i16 = TransferToPalmPayContactActivity.f33591j;
                        return C1850q.e(transferToPalmPayContactActivity.getString(k.core_all), transferToPalmPayContactActivity.getString(k.core_favorites));
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_activity_transfer_to_palmpay_contact;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(b.ppColorBackgroundLight));
        t tVar = this.f33594e;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((PpTitleBar) value).getRightImageView1().setImageDrawable(a.h(this, S6.a.pay_AddOutline, null, CommonViewExtKt.colorInt(b.ppColorTextPrimary, this), 24.0f));
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((PpTitleBar) value2).getRightImageView1().setOnClickListener(new c(this, 15));
        t tVar2 = this.f33592c;
        Object value3 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ViewPager2 viewPager2 = (ViewPager2) value3;
        Z supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        AbstractC1205o lifecycle = getLifecycle();
        TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment = new TransferToPalmPayContactAllFragment();
        Pair pair = new Pair("core_order_source_type", this.f33595f);
        String str = this.f33596g;
        if (str == null) {
            str = "";
        }
        transferToPalmPayContactAllFragment.setArguments(p002a.a.e(pair, new Pair("MEMBER_ID", str)));
        Unit unit = Unit.f38893a;
        TransferToPalmPayContactFavoriteFragment transferToPalmPayContactFavoriteFragment = new TransferToPalmPayContactFavoriteFragment();
        transferToPalmPayContactFavoriteFragment.setArguments(p002a.a.e(new Pair("core_order_source_type", this.f33595f)));
        viewPager2.setAdapter(new E(supportFragmentManager, lifecycle, C1850q.e(transferToPalmPayContactAllFragment, transferToPalmPayContactFavoriteFragment), 0));
        Object value4 = this.f33593d.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        Object value5 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        new TabLayoutMediator((TabLayout) value4, (ViewPager2) value5, new d(this, 24)).attach();
    }
}
