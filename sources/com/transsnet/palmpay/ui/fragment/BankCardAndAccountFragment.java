package com.transsnet.palmpay.ui.fragment;

import Ac.e;
import Ac.f;
import Ac.h;
import Ce.DialogInterfaceOnDismissListenerC0161c;
import Ce.ViewOnClickListenerC0159a;
import Fe.C0254b;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mikepenz.iconics.view.IconicsTextView;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.LinkBankAccountResp;
import com.transsnet.palmpay.core.bean.LinkBankCardResp;
import com.transsnet.palmpay.core.bean.req.BindBankCardReq;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.dialog.t;
import com.transsnet.palmpay.ui.activity.bankcard.BankCardAndAccountActivity;
import com.transsnet.palmpay.ui.activity.bankcard.SetRepaymentDefaultCardActivity;
import com.transsnet.palmpay.ui.adapter.BankCardAndAccountAdapter$OnClickListener;
import com.transsnet.palmpay.ui.mvp.contract.BankCardAndAccountContract$IView;
import com.transsnet.palmpay.util.ToastUtils;
import org.chromium.support_lib_boundary.util.b;
import p025ba.k;
import p328ve.c;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BankCardAndAccountFragment<T> extends BaseMVPFragment<C0254b> implements BankCardAndAccountContract$IView, BankCardAndAccountAdapter$OnClickListener<T> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public LinkBankCardResp.LinkBankCard f35058A;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SwipeRecyclerView f35059j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public IconicsTextView f35060o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f35061p;
    public MarqueeView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c f35062v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f35063w;

    public abstract void A(ImageView imageView, TextView textView, TextView textView2, Button button, SingleAdView singleAdView);

    public void B() {
        View viewInflate = LayoutInflater.from(this.f27319c).inflate(f.main_bank_card_account_empty_layout, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(e.empty_icon);
        TextView textView = (TextView) viewInflate.findViewById(e.empty_title);
        TextView textView2 = (TextView) viewInflate.findViewById(e.empty_desc);
        Button button = (Button) viewInflate.findViewById(e.add_bt);
        SingleAdView singleAdView = (SingleAdView) viewInflate.findViewById(e.adView);
        viewInflate.findViewById(e.empty_faq);
        A(imageView, textView, textView2, button, singleAdView);
        this.f35059j.setEmptyView(viewInflate);
    }

    public abstract void C(LinkBankCardResp.LinkBankCard linkBankCard);

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.main_bank_card_and_account_fragment;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        super.n();
        showLoadingDialog(true);
        x();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        this.t = (MarqueeView) this.f27318b.findViewById(e.mbc_marquee_ad);
        this.f35061p = this.f27318b.findViewById(e.add_card_container);
        this.f35060o = (IconicsTextView) this.f27318b.findViewById(e.add_card_tv);
        this.f35059j = (SwipeRecyclerView) this.f27318b.findViewById(e.bank_card_or_account_rv);
        c cVar = new c(this.f27319c);
        this.f35062v = cVar;
        cVar.f43182d = this;
        this.f35059j.setLoadMoreEnable(false);
        this.f35059j.setRefreshEnable(false);
        this.f35059j.getRecyclerView().setLayoutManager(new LinearLayoutManager(this.f27319c));
        this.f35059j.setAdapter(this.f35062v);
        b.c(this.t);
        this.f35061p.setOnClickListener(new ViewOnClickListenerC0159a(this, 1));
        w();
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 100 && i10 == -1) {
            if (this.f35063w != null) {
                showLoadingDialog(true);
                y(this.f35063w);
                return;
            }
            return;
        }
        if (i7 == 101 && i10 == -1 && this.f35058A != null) {
            showLoadingDialog(true);
            C(this.f35058A);
        }
    }

    public void onItemClick(Object obj) {
    }

    @Override // com.transsnet.palmpay.ui.adapter.BankCardAndAccountAdapter$OnClickListener
    public final void onRemoveClick(Object obj) {
        this.f35063w = null;
        O6.c cVar = new O6.c(this.f27319c);
        cVar.e(k.core_title_attention);
        cVar.f6598d = u();
        cVar.c(k.core_cancel, null);
        cVar.d(h.main_delete, new A8.c(10, this, obj));
        cVar.g();
    }

    @Override // com.transsnet.palmpay.ui.adapter.BankCardAndAccountAdapter$OnClickListener
    public final void onSetDefaultCardClick() {
        startActivity(new Intent(getContext(), (Class<?>) SetRepaymentDefaultCardActivity.class));
    }

    @Override // com.transsnet.palmpay.ui.adapter.BankCardAndAccountAdapter$OnClickListener
    public final void onUnbindClick(Object obj) {
        if (obj instanceof LinkBankCardResp.LinkBankCard) {
            LinkBankCardResp.LinkBankCard linkBankCard = (LinkBankCardResp.LinkBankCard) obj;
            BindBankCardReq bindBankCardReq = new BindBankCardReq();
            bindBankCardReq.cardNo = linkBankCard.getCardNo();
            bindBankCardReq.bankCode = linkBankCard.getBankCode();
            bindBankCardReq.bankName = linkBankCard.getBankName();
            bindBankCardReq.bankUrl = linkBankCard.getBankUrl();
            if (linkBankCard.getAccountStatus() != 1) {
                ARouter.getInstance().build("/coreImpl/add_new_card").withBoolean("real_name_auth", true).withParcelable("extra_data", bindBankCardReq).navigation();
                return;
            }
            this.f35058A = null;
            O6.c cVar = new O6.c(this.f27319c);
            cVar.e(k.core_title_attention);
            cVar.f6598d = "";
            cVar.c(k.core_cancel, null);
            cVar.d(h.main_unbind_text, new A8.c(11, this, (LinkBankCardResp.LinkBankCard) obj));
            cVar.g();
        }
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.BankCardAndAccountContract$IView
    public final void showDeleteResult(CommonResult commonResult) {
        boolean zIsSuccess = commonResult.isSuccess();
        commonResult.getRespMsg();
        t tVar = new t(this.f27319c);
        if (zIsSuccess) {
            tVar.b();
            tVar.f31304c = v();
        } else {
            tVar.a();
            tVar.c(h.main_bank_remove_fail_text);
        }
        tVar.f31311j = new DialogInterfaceOnDismissListenerC0161c(this, 0);
        tVar.e(true);
        x();
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.BankCardAndAccountContract$IView
    public final void showError(String str) {
        showLoadingDialog(false);
        ToastUtils.showLong(str);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.BankCardAndAccountContract$IView
    public final void showLinkBankAccountResp(LinkBankAccountResp linkBankAccountResp) {
        showLoadingDialog(false);
        if (getActivity() instanceof BankCardAndAccountActivity) {
            ((BankCardAndAccountActivity) getActivity()).l(1, (!linkBankAccountResp.isSuccess() || linkBankAccountResp.getData() == null || linkBankAccountResp.getData().isEmpty()) ? false : true);
        }
        if (!linkBankAccountResp.isSuccess()) {
            B();
            ToastUtils.showLong(linkBankAccountResp.getRespMsg());
            return;
        }
        if (linkBankAccountResp.getData() == null || linkBankAccountResp.getData().isEmpty()) {
            this.f35062v.a();
            this.f35061p.setVisibility(8);
            B();
        } else {
            z();
            c cVar = this.f35062v;
            cVar.f43180b = linkBankAccountResp.getData();
            cVar.notifyDataSetChanged();
            this.f35061p.setVisibility(0);
        }
        if (linkBankAccountResp.getData() == null || linkBankAccountResp.getData().isEmpty()) {
            this.f35062v.a();
            B();
        } else {
            z();
            c cVar2 = this.f35062v;
            cVar2.f43180b = linkBankAccountResp.getData();
            cVar2.notifyDataSetChanged();
        }
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.BankCardAndAccountContract$IView
    public final void showLinkBankCardsResp(LinkBankCardResp linkBankCardResp) {
        showLoadingDialog(false);
        if (getActivity() instanceof BankCardAndAccountActivity) {
            ((BankCardAndAccountActivity) getActivity()).l(0, (!linkBankCardResp.isSuccess() || linkBankCardResp.getData() == null || linkBankCardResp.getData().isEmpty()) ? false : true);
        }
        if (!linkBankCardResp.isSuccess()) {
            B();
            ToastUtils.showLong(linkBankCardResp.getRespMsg());
            return;
        }
        if (linkBankCardResp.getData() == null || linkBankCardResp.getData().isEmpty()) {
            this.f35062v.a();
            this.f35061p.setVisibility(8);
            B();
        } else {
            c cVar = this.f35062v;
            cVar.f43180b = linkBankCardResp.getData();
            cVar.notifyDataSetChanged();
            this.f35061p.setVisibility(0);
            linkBankCardResp.getData();
        }
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.BankCardAndAccountContract$IView
    public final void showUnlinkResult(CommonResult commonResult) {
        boolean zIsSuccess = commonResult.isSuccess();
        String respMsg = commonResult.getRespMsg();
        t tVar = new t(this.f27319c);
        if (zIsSuccess) {
            tVar.b();
            tVar.f31304c = "";
        } else {
            tVar.a();
            if (TextUtils.isEmpty(respMsg)) {
                tVar.c(h.main_bank_remove_fail_text);
            } else {
                tVar.f31304c = respMsg;
            }
        }
        tVar.f31311j = new DialogInterfaceOnDismissListenerC0161c(this, 1);
        tVar.e(true);
        x();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new C0254b();
    }

    public abstract String u();

    public abstract String v();

    public abstract void w();

    public abstract void x();

    public abstract void y(Object obj);

    public void z() {
    }
}
