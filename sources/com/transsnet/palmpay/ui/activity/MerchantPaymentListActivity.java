package com.transsnet.palmpay.ui.activity;

import Ac.e;
import Ac.f;
import Ac.h;
import Fe.M;
import O6.c;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.custom_view.dialog.t;
import com.transsnet.palmpay.main.export.bean.rsp.MerchantListRsp;
import com.transsnet.palmpay.ui.adapter.MerchantPaymentListAdapter$OnActionListener;
import com.transsnet.palmpay.ui.mvp.contract.MerchantPaymentListContract;
import java.util.List;
import p025ba.k;
import p054dd.n;
import p102ge.E;
import p328ve.o;

/* JADX INFO: loaded from: classes4.dex */
public class MerchantPaymentListActivity extends i implements MerchantPaymentListContract.View, MerchantPaymentListAdapter$OnActionListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f34496d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f34497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f34498c;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_activity_merchant_payment_list;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(-1);
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new M();
    }

    @Override // com.transsnet.palmpay.ui.adapter.MerchantPaymentListAdapter$OnActionListener
    public final void onItemClicked(MerchantListRsp merchantListRsp) {
    }

    @Override // com.transsnet.palmpay.ui.adapter.MerchantPaymentListAdapter$OnActionListener
    public final void onItemDeleted(MerchantListRsp merchantListRsp, int i7) {
        if (merchantListRsp == null) {
            return;
        }
        c cVar = new c(this);
        cVar.e(k.core_title_attention);
        cVar.b(h.main_msg_unbind_merchant);
        cVar.d(h.main_remove, new n(5, this, merchantListRsp));
        cVar.c(k.core_cancel, null);
        cVar.g();
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        super.processLogic(bundle);
        ((M) this.f27350a).queryMerchantList();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        this.f34498c = (ImageView) findViewById(e.imageViewEmpty);
        RecyclerView recyclerView = (RecyclerView) findViewById(e.merchantList);
        Context applicationContext = getApplicationContext();
        o oVar = new o();
        oVar.f43195b = applicationContext;
        this.f34497b = oVar;
        oVar.f43196c = this;
        oVar.registerAdapterDataObserver(new E(this));
        recyclerView.setAdapter(this.f34497b);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        recyclerView.setItemViewCacheSize(4);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.MerchantPaymentListContract.View
    public final void showFailMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        t tVar = new t(this);
        tVar.a();
        tVar.f31304c = str;
        tVar.e(true);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.MerchantPaymentListContract.View
    public final void updateMerchantList(List list) {
        o oVar = this.f34497b;
        oVar.f43197d = list;
        oVar.notifyDataSetChanged();
    }
}
