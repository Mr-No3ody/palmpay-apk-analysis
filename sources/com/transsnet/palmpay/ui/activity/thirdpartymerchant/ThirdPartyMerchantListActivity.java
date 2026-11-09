package com.transsnet.palmpay.ui.activity.thirdpartymerchant;

import Ac.e;
import Ac.f;
import Cc.a;
import L6.b;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.q;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import p287se.d;
import p294tb.C2055q;
import p328ve.v;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/app/thied_part_merchant")
public class ThirdPartyMerchantListActivity extends BaseActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f34998c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SwipeRecyclerView f34999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f35000b;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_third_party_merchant_list_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        initStatusBar(getColor(b.ppColorBackgroundLight));
        v vVar = new v(this);
        this.f35000b = vVar;
        vVar.f4986c = new d(this, 12);
        this.f34999a.getRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        C1548f c1548f = new C1548f(getColor(Ac.b.main_divider_color), getResources().getDimensionPixelOffset(q.px1), getResources().getDimensionPixelOffset(q.dp15), getResources().getDimensionPixelOffset(q.dp15));
        c1548f.f31336e = false;
        this.f34999a.setRefreshEnable(false);
        this.f34999a.setLoadMoreEnable(false);
        this.f34999a.getRecyclerView().addItemDecoration(c1548f);
        this.f34999a.setAdapter(this.f35000b);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        showLoadingDialog(true);
        ((IApiMainService) a.f1353a.f39520b).queryThirdPartyMerchant().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2055q(this, 6));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        this.f34999a = (SwipeRecyclerView) findViewById(e.merchant_list);
    }
}
