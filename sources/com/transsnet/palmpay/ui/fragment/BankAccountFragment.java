package com.transsnet.palmpay.ui.fragment;

import Ac.d;
import Ac.h;
import Ce.ViewOnAttachStateChangeListenerC0160b;
import Ce.ViewOnClickListenerC0159a;
import Fe.C0254b;
import S6.a;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import com.mikepenz.iconics.IconicsDrawable;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.bean.LinkBankAccountResp;
import com.transsnet.palmpay.core.bean.LinkBankCardResp;
import com.transsnet.palmpay.core.bean.MessageBean;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.ui.activity.bankcard.BankAccountDetailActivity;
import com.transsnet.palmpay.util.SpanUtils;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;

/* JADX INFO: loaded from: classes4.dex */
public class BankAccountFragment extends BankCardAndAccountFragment<LinkBankAccountResp.LinkBankAccount> {
    @Override // com.transsnet.palmpay.ui.fragment.BankCardAndAccountFragment
    public final void A(ImageView imageView, TextView textView, TextView textView2, Button button, SingleAdView singleAdView) {
        singleAdView.setVisibility(8);
        imageView.setImageResource(d.main_no_bank_account_icon);
        textView2.setText(h.main_add_bank_account_desc);
        textView.setText(h.main_add_bank_account_title);
        button.setText(h.main_add_bank_account_text);
        button.setOnClickListener(new ViewOnClickListenerC0159a(this, 0));
    }

    @Override // com.transsnet.palmpay.ui.fragment.BankCardAndAccountFragment
    public final void B() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(View.generateViewId());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0160b(this, 0));
        this.f35059j.setEmptyView(frameLayout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.ui.fragment.BankCardAndAccountFragment
    public final /* bridge */ /* synthetic */ void C(LinkBankCardResp.LinkBankCard linkBankCard) {
    }

    @Override // com.transsnet.palmpay.ui.fragment.BankCardAndAccountFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        c.b().j(this);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(MessageBean messageBean) {
        x();
    }

    @Override // com.transsnet.palmpay.ui.fragment.BankCardAndAccountFragment, com.transsnet.palmpay.ui.adapter.BankCardAndAccountAdapter$OnClickListener
    public final void onItemClick(Object obj) {
        Context context = getContext();
        BankAccountDetailActivity.f34631f.launch(context, (LinkBankAccountResp.LinkBankAccount) obj);
    }

    @Override // com.transsnet.palmpay.ui.fragment.BankCardAndAccountFragment
    public final String u() {
        return getString(h.main_bank_account_remove_text);
    }

    @Override // com.transsnet.palmpay.ui.fragment.BankCardAndAccountFragment
    public final String v() {
        return getString(h.main_bank_account_remove_success_text);
    }

    @Override // com.transsnet.palmpay.ui.fragment.BankCardAndAccountFragment
    public final void w() {
        IconicsDrawable iconicsDrawable = new IconicsDrawable(requireContext(), a.pay_AddOutline);
        D3.a.F(iconicsDrawable, -1);
        p118hf.a.I(iconicsDrawable, 20);
        this.f35060o.setText(new SpanUtils().appendImage(iconicsDrawable).append(" Add New Account").create());
    }

    @Override // com.transsnet.palmpay.ui.fragment.BankCardAndAccountFragment
    public final void x() {
        ((C0254b) this.f27328i).queryLinkBankAccountList();
    }

    @Override // com.transsnet.palmpay.ui.fragment.BankCardAndAccountFragment
    public final void y(Object obj) {
        ((C0254b) this.f27328i).deleteLinkBankAccount(((LinkBankAccountResp.LinkBankAccount) obj).getBankAccountNo());
    }

    @Override // com.transsnet.palmpay.ui.fragment.BankCardAndAccountFragment
    public final void z() {
        Fragment fragmentE = getChildFragmentManager().E("BankAccountFragment");
        if (fragmentE != null) {
            Z childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            C1161a c1161a = new C1161a(childFragmentManager);
            c1161a.m(fragmentE);
            c1161a.h(true);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(MessageEvent messageEvent) {
        if (messageEvent.getEventType() == 282) {
            x();
        }
    }
}
