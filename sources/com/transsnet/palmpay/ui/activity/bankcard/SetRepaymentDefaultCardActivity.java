package com.transsnet.palmpay.ui.activity.bankcard;

import Ac.d;
import Ac.e;
import Ac.f;
import Ac.h;
import F5.b;
import Fe.C0254b;
import Pa.r0;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.load.resource.bitmap.z;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.LinkBankAccountResp;
import com.transsnet.palmpay.core.bean.LinkBankCardResp;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.ui.adapter.BankCardAndAccountAdapter$OnClickListener;
import com.transsnet.palmpay.ui.mvp.contract.BankCardAndAccountContract$IView;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.Iterator;
import p025ba.k;
import p328ve.c;

/* JADX INFO: loaded from: classes4.dex */
public class SetRepaymentDefaultCardActivity<T> extends i implements BankCardAndAccountContract$IView, BankCardAndAccountAdapter$OnClickListener<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f34651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f34652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f34653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f34654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f34655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f34656g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f34657i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f34658j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ViewGroup f34659o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public RelativeLayout f34660p;
    public LinkBankCardResp.LinkBankCard t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SwipeRecyclerView f34661v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c f34662w;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_activity_set_default_repayment_card;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new C0254b();
    }

    public final void m() {
        View viewInflate = LayoutInflater.from(this).inflate(f.main_bank_card_account_empty_layout, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(e.empty_icon);
        TextView textView = (TextView) viewInflate.findViewById(e.empty_desc);
        TextView textView2 = (TextView) viewInflate.findViewById(e.empty_title);
        Button button = (Button) viewInflate.findViewById(e.add_bt);
        imageView.setImageResource(d.main_no_bank_card_icon);
        textView.setText(h.main_add_bank_card_desc);
        textView2.setText(h.main_add_bank_card_title);
        button.setText(h.main_add_bank_card_text);
        button.setOnClickListener(new b(8));
        this.f34661v.setEmptyView(viewInflate);
    }

    @Override // com.transsnet.palmpay.ui.adapter.BankCardAndAccountAdapter$OnClickListener
    public final void onItemClick(Object obj) {
    }

    @Override // com.transsnet.palmpay.ui.adapter.BankCardAndAccountAdapter$OnClickListener
    public final void onRemoveClick(Object obj) {
        O6.c cVar = new O6.c(this);
        cVar.e(k.core_title_attention);
        cVar.b(k.core_replace_default_repayment_card_hint);
        cVar.c(k.core_cancel, new b(7));
        cVar.d(k.core_replace, new p132ie.e(this, obj));
        cVar.g();
    }

    @Override // com.transsnet.palmpay.ui.adapter.BankCardAndAccountAdapter$OnClickListener
    public final void onSetDefaultCardClick() {
    }

    @Override // com.transsnet.palmpay.ui.adapter.BankCardAndAccountAdapter$OnClickListener
    public final void onUnbindClick(Object obj) {
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        super.processLogic(bundle);
        showLoadingDialog(true);
        ((C0254b) this.f27350a).queryLinkBankCardList();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        BarUtils.setStatusBarLightMode((Activity) this, true);
        this.f34659o = (ViewGroup) findViewById(e.bank_content);
        this.f34651b = (ImageView) findViewById(e.bank_icon);
        this.f34653d = (TextView) findViewById(e.bank_name);
        this.f34654e = (TextView) findViewById(e.bank_num);
        this.f34655f = (TextView) findViewById(e.tvDefaultCard);
        this.f34656g = findViewById(e.remove_container);
        this.f34657i = (TextView) findViewById(e.remove_tv);
        this.f34660p = (RelativeLayout) findViewById(e.default_card_item);
        this.f34658j = (TextView) findViewById(e.tvVerified);
        this.f34652c = (ImageView) findViewById(e.card_bg);
        this.f34661v = (SwipeRecyclerView) findViewById(e.bank_card_or_account_rv);
        c cVar = new c(this);
        this.f34662w = cVar;
        cVar.f43182d = this;
        cVar.f43181c = true;
        this.f34661v.setLoadMoreEnable(false);
        this.f34661v.setRefreshEnable(false);
        this.f34661v.getRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        this.f34661v.setAdapter(this.f34662w);
        this.f34660p.setBackgroundColor(Color.parseColor("#212755"));
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.BankCardAndAccountContract$IView
    public final void showDeleteResult(CommonResult commonResult) {
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.BankCardAndAccountContract$IView
    public final void showError(String str) {
        showLoadingDialog(false);
        ToastUtils.showLong(str);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.BankCardAndAccountContract$IView
    public final void showLinkBankAccountResp(LinkBankAccountResp linkBankAccountResp) {
        showLoadingDialog(false);
        if (!linkBankAccountResp.isSuccess()) {
            ToastUtils.showShort(linkBankAccountResp.getRespMsg());
            return;
        }
        if (linkBankAccountResp.getData().isEmpty()) {
            this.f34662w.a();
            m();
        } else {
            c cVar = this.f34662w;
            cVar.f43180b = linkBankAccountResp.getData();
            cVar.notifyDataSetChanged();
        }
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.BankCardAndAccountContract$IView
    public final void showLinkBankCardsResp(LinkBankCardResp linkBankCardResp) {
        showLoadingDialog(false);
        if (!linkBankCardResp.isSuccess()) {
            ToastUtils.showShort(linkBankCardResp.getRespMsg());
            return;
        }
        if (linkBankCardResp.getData() == null || linkBankCardResp.getData().isEmpty()) {
            this.f34662w.a();
            m();
            return;
        }
        Iterator<LinkBankCardResp.LinkBankCard> it = linkBankCardResp.getData().iterator();
        LinkBankCardResp.LinkBankCard linkBankCard = null;
        while (it.hasNext()) {
            LinkBankCardResp.LinkBankCard next = it.next();
            if (next.getDefaultCard() == 1) {
                it.remove();
                linkBankCard = next;
            }
        }
        this.t = linkBankCard;
        if (linkBankCard == null) {
            this.f34660p.setVisibility(8);
        } else {
            this.f34660p.setVisibility(0);
            LinkBankCardResp.LinkBankCard linkBankCard2 = this.t;
            String bankUrl = linkBankCard2.getBankUrl();
            com.bumptech.glide.b.c(this).e(this).load(bankUrl).a(G1.d.O(r.cv_default_bank_logo)).S(this.f34651b);
            this.f34653d.setText(linkBankCard2.getBankName());
            this.f34654e.setText(r0.I(linkBankCard2.getCardNo()));
            this.f34658j.setVisibility(0);
            if (linkBankCard2.getReUseable() == 1) {
                this.f34655f.setEnabled(false);
                this.f34655f.setText(h.main_quick_text);
                this.f34655f.setVisibility(0);
            } else {
                this.f34655f.setEnabled(false);
                this.f34655f.setText("");
                this.f34655f.setVisibility(8);
            }
            com.bumptech.glide.b.c(this).e(this).load(linkBankCard2.getBgUrl()).a(((G1.d) new G1.d().I(new z(SizeUtils.dp2px(8.0f)), true)).x(r.cv_shape_rect_corner_8_bg_disable)).S(this.f34652c);
        }
        c cVar = this.f34662w;
        cVar.f43180b = linkBankCardResp.getData();
        cVar.notifyDataSetChanged();
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.BankCardAndAccountContract$IView
    public final void showUnlinkResult(CommonResult commonResult) {
    }
}
