package com.transsnet.palmpay.ui.activity.bankcard;

import Ac.e;
import Ac.f;
import Ac.h;
import C0.G;
import Fe.C0258f;
import Pa.r0;
import S6.a;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.LinkBankCardResp;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.req.BindBankCardReq;
import com.transsnet.palmpay.custom_view.dialog.t;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.ui.mvp.contract.BankCardDetailContract;
import org.greenrobot.eventbus.c;
import p025ba.k;
import p052da.ViewOnClickListenerC1649v;
import p132ie.b;
import p132ie.d;

/* JADX INFO: loaded from: classes4.dex */
public class BankCardDetailActivity extends i implements View.OnClickListener, BankCardDetailContract.View {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f34641p = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinkBankCardResp.LinkBankCard f34642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f34643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f34644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f34645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f34646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f34647g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f34648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f34649j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f34650o;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_activity_bank_card_detail;
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.BankCardDetailContract.View
    public final void handleSetDefaultCardResult(CommonResult commonResult) {
        if (commonResult == null) {
            return;
        }
        boolean zIsSuccess = commonResult.isSuccess();
        String respMsg = commonResult.getRespMsg();
        t tVar = new t(this);
        if (zIsSuccess) {
            G.u(MessageEvent.EVENT_REFRESH_BANK_CARD_LIST, c.b());
            this.f34648i.setVisibility(0);
            this.f34649j.f37579b.setVisibility(8);
            tVar.b();
            tVar.c(h.main_bank_card_set_as_default_success_text);
            tVar.f31311j = new d(this, 0);
        } else {
            tVar.a();
            tVar.f31304c = respMsg;
        }
        tVar.e(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        LinkBankCardResp.LinkBankCard linkBankCard = this.f34642b;
        if (linkBankCard == null) {
            return;
        }
        r0.o1(linkBankCard.getBankUrl(), this.f34644d);
        this.f34646f.setText(linkBankCard.getBankName());
        this.f34647g.setText(r0.I(linkBankCard.getCardNo()));
        this.f34645e.setVisibility(8);
        if (linkBankCard.isDefaultPaymentCard()) {
            this.f34648i.setVisibility(0);
            this.f34649j.f37579b.setVisibility(8);
        } else {
            this.f34649j.f37579b.setVisibility(0);
            this.f34648i.setVisibility(8);
        }
        if (linkBankCard.getAccountStatus() != 1) {
            com.bumptech.glide.b.c(this).e(this).load(linkBankCard.getBgUrl()).a(new G1.d().x(r.cv_shape_rect_corner_8_bg_gray_padding_lr_12_tb_6)).S(this.f34643c);
            this.f34650o.f37579b.setVisibility(0);
        } else {
            this.f34645e.setVisibility(0);
            this.f34645e.setText(h.main_bound);
            this.f34650o.f37579b.setVisibility(8);
        }
        com.bumptech.glide.b.c(this).e(this).load(linkBankCard.getBgUrl()).a(new G1.d().x(r.cv_shape_rect_corner_8_bg_gray_padding_lr_12_tb_6)).S(this.f34643c);
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new C0258f();
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 100 && i10 == -1) {
            ((C0258f) this.f27350a).deleteLinkBankCard(this.f34642b);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == e.layoutAuthentication) {
            BindBankCardReq bindBankCardReq = new BindBankCardReq();
            bindBankCardReq.cardNo = this.f34642b.getCardNo();
            bindBankCardReq.bankCode = this.f34642b.getBankCode();
            bindBankCardReq.bankName = this.f34642b.getBankName();
            bindBankCardReq.bankUrl = this.f34642b.getBankUrl();
            ARouter.getInstance().build("/coreImpl/add_new_card").withBoolean("real_name_auth", true).withParcelable("extra_data", bindBankCardReq).navigation();
            return;
        }
        if (view.getId() == e.layoutDefault) {
            ((C0258f) this.f27350a).setDefaultPaymentCard(this.f34642b.getAccountId(), 0);
            return;
        }
        if (view.getId() == e.layoutDelete) {
            O6.c cVar = new O6.c(this);
            cVar.e(k.core_title_attention);
            cVar.b(h.main_bank_card_delete_text);
            cVar.c(k.core_cancel, null);
            cVar.d(h.main_delete, new ViewOnClickListenerC1649v(this, 12));
            cVar.g();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        PpTitleBar ppTitleBar = (PpTitleBar) findViewById(e.titleBar);
        LinkBankCardResp.LinkBankCard linkBankCard = this.f34642b;
        if (linkBankCard == null || !linkBankCard.isDefaultPaymentCard()) {
            ppTitleBar.setTitle(getString(h.main_bank_card));
        } else {
            ppTitleBar.setTitle(getString(h.main_default_payment_bank_card));
        }
        this.f34643c = (ImageView) findViewById(e.card_bg);
        this.f34644d = (ImageView) findViewById(e.bank_icon);
        this.f34645e = (TextView) findViewById(e.tvVerified);
        this.f34646f = (TextView) findViewById(e.bank_name);
        this.f34647g = (TextView) findViewById(e.bank_num);
        this.f34648i = (TextView) findViewById(e.tvDefaultCard);
        this.f34649j = new b(findViewById(e.layoutDefault), a.pay_Bankcard, k.core_set_default_payment_card, this);
        this.f34650o = new b(findViewById(e.layoutAuthentication), a.pay_SecurityOutline, k.core_real_name_authentication, this);
        new b(findViewById(e.layoutDelete), a.pay_Delete, k.core_remove_bank_card, this).f37580c.setVisibility(8);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.BankCardDetailContract.View
    public final void showDeleteResult(CommonResult commonResult) {
        if (commonResult == null) {
            return;
        }
        boolean zIsSuccess = commonResult.isSuccess();
        String respMsg = commonResult.getRespMsg();
        t tVar = new t(this);
        if (zIsSuccess) {
            c.b().f(new MessageEvent(MessageEvent.EVENT_REFRESH_BANK_CARD_LIST));
            tVar.b();
            tVar.c(h.main_bank_card_delete_success_text);
            tVar.f31311j = new d(this, 1);
        } else {
            tVar.a();
            tVar.f31304c = respMsg;
        }
        tVar.e(true);
    }
}
