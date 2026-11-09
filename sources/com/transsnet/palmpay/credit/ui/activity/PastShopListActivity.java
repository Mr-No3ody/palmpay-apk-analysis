package com.transsnet.palmpay.credit.ui.activity;

import Db.u;
import L6.b;
import V8.w;
import Ya.f;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.credit.base.CreditBaseMvvmActivity;
import com.transsnet.palmpay.credit.ui.viewmodel.PastShopViewModel;
import com.transsnet.palmpay.custom_view.C1548f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p054dd.q;
import p068ec.d;
import p270rd.C1976t;
import p284sb.C2017o;
import p339wb.r;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/credit_score/past_shop")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/PastShopListActivity;", "Lcom/transsnet/palmpay/credit/base/CreditBaseMvvmActivity;", "Lcom/transsnet/palmpay/credit/ui/viewmodel/PastShopViewModel;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPastShopListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PastShopListActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/PastShopListActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,156:1\n115#2,8:157\n145#2:165\n171#2,12:166\n215#2:178\n*S KotlinDebug\n*F\n+ 1 PastShopListActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/PastShopListActivity\n*L\n76#1:157,8\n76#1:165\n101#1:166,12\n101#1:178\n*E\n"})
public final class PastShopListActivity extends CreditBaseMvvmActivity<PastShopViewModel> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f28701j = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f28702f = C2131j.b(new d(this, 16));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f28703g = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f28704i = C2131j.b(new C1976t(4));

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_activity_past_shop;
    }

    public final r n() {
        return (r) this.f28704i.getValue();
    }

    public final RecyclerView o() {
        Object value = this.f28702f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        l lVar = ((PastShopViewModel) l()).f30696f;
        if (lVar != null) {
            lVar.e(this, new q(new w(this, 23), 29));
        }
        l lVar2 = ((PastShopViewModel) l()).f30695e;
        if (lVar2 != null) {
            lVar2.e(this, new q(new p141j9.t(this, this, 15), 29));
        }
        PastShopViewModel pastShopViewModel = (PastShopViewModel) l();
        int i7 = this.f28703g;
        pastShopViewModel.getClass();
        p140j8.f.s(pastShopViewModel, new u(i7, null), pastShopViewModel.f30696f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        initStatusBar(getColor(b.ppColorBackgroundLight));
        n().setOnItemClickListener(new C2017o(this));
        n().getLoadMoreModule().setOnLoadMoreListener(new C2017o(this));
        n().getLoadMoreModule().getClass();
        n().getLoadMoreModule().f8647f = true;
        o().setAdapter(n());
        o().setLayoutManager(new LinearLayoutManager(this));
        C1548f c1548f = new C1548f(getColor(b.ppColorDividerLine), getResources().getDimensionPixelOffset(com.transsnet.palmpay.custom_view.q.dp1), 0, 0);
        c1548f.f31336e = false;
        o().addItemDecoration(c1548f);
    }
}
