package com.transsnet.palmpay.credit.ui.activity.cashloan;

import Db.C0186c;
import L6.b;
import Ya.e;
import Ya.f;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.credit.base.CreditBaseMvvmActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLCreditManagementActivity;
import com.transsnet.palmpay.credit.ui.viewmodel.CreditManagementViewModel;
import com.transsnet.palmpay.custom_view.C1548f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p141j9.s;
import p270rd.C1976t;
import p351xb.l;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit提额管理页(废弃)", path = "/credit_score/credit_management_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLCreditManagementActivity;", "Lcom/transsnet/palmpay/credit/base/CreditBaseMvvmActivity;", "Lcom/transsnet/palmpay/credit/ui/viewmodel/CreditManagementViewModel;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCLCreditManagementActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CLCreditManagementActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/cashloan/CLCreditManagementActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,75:1\n260#2,10:76\n296#2:86\n*S KotlinDebug\n*F\n+ 1 CLCreditManagementActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/cashloan/CLCreditManagementActivity\n*L\n56#1:76,10\n56#1:86\n*E\n"})
public final class CLCreditManagementActivity extends CreditBaseMvvmActivity<CreditManagementViewModel> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f28897j = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f28898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f28899g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f28900i = C2131j.b(new C1976t(15));

    public CLCreditManagementActivity() {
        final int i7 = 0;
        this.f28898f = C2131j.b(new Function0(this) { // from class: tb.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLCreditManagementActivity f42489b;

            {
                this.f42489b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLCreditManagementActivity cLCreditManagementActivity = this.f42489b;
                switch (i7) {
                    case 0:
                        int i10 = CLCreditManagementActivity.f28897j;
                        return (RecyclerView) cLCreditManagementActivity.findViewById(e.rvCreditManagementList);
                    default:
                        int i11 = CLCreditManagementActivity.f28897j;
                        return cLCreditManagementActivity.findViewById(e.layoutEmptyView);
                }
            }
        });
        final int i10 = 1;
        this.f28899g = C2131j.b(new Function0(this) { // from class: tb.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLCreditManagementActivity f42489b;

            {
                this.f42489b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLCreditManagementActivity cLCreditManagementActivity = this.f42489b;
                switch (i10) {
                    case 0:
                        int i11 = CLCreditManagementActivity.f28897j;
                        return (RecyclerView) cLCreditManagementActivity.findViewById(e.rvCreditManagementList);
                    default:
                        int i12 = CLCreditManagementActivity.f28897j;
                        return cLCreditManagementActivity.findViewById(e.layoutEmptyView);
                }
            }
        });
    }

    public static final void n(CLCreditManagementActivity cLCreditManagementActivity, List list) {
        View view = (View) cLCreditManagementActivity.f28899g.getValue();
        if (view != null) {
            List list2 = list;
            view.setVisibility((list2 == null || list2.isEmpty()) ? 0 : 8);
        }
        l lVar = (l) cLCreditManagementActivity.f28900i.getValue();
        lVar.f43786a = list;
        lVar.notifyDataSetChanged();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_activity_credit_management;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        com.transsnet.palmpay.core.base.l lVar = ((CreditManagementViewModel) l()).f30672e;
        if (lVar != null) {
            lVar.e(this, new s(new p141j9.t(this, this, 20), (char) 0, (short) 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        CreditManagementViewModel creditManagementViewModel = (CreditManagementViewModel) l();
        creditManagementViewModel.getClass();
        p140j8.f.s(creditManagementViewModel, new C0186c(1, null), creditManagementViewModel.f30672e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        initStatusBar(getColor(b.ppColorBackgroundLight));
        t tVar = this.f28898f;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((RecyclerView) value).setLayoutManager(new LinearLayoutManager(this));
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        C1548f c1548f = new C1548f(getColor(b.ppColorBackgroundDark), DensityUtil.dp2px(0.5f), DensityUtil.dp2px(12.0f), DensityUtil.dp2px(12.0f));
        c1548f.f31336e = false;
        ((RecyclerView) value2).addItemDecoration(c1548f);
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((RecyclerView) value3).setAdapter((l) this.f28900i.getValue());
    }
}
