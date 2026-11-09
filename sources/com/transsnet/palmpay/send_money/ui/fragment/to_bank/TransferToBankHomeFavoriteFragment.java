package com.transsnet.palmpay.send_money.ui.fragment.to_bank;

import Ab.C;
import Ad.c0;
import C9.C0139f;
import C9.C0144k;
import C9.Q;
import Ce.ViewOnClickListenerC0159a;
import Dg.a;
import L6.b;
import M1.j;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.bean.event.AddRecipientEvent;
import com.transsnet.palmpay.send_money.bean.resp.BankAccountMemberInfoResp;
import com.transsnet.palmpay.send_money.bean.resp.RecipientMemberLogOutResp;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.dialog.AccountUnavailableDialog;
import com.transsnet.palmpay.send_money.ui.dialog.FasterSendToPalmPayAccountDialog;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeFavoriteFragment;
import com.transsnet.palmpay.send_money.viewmodel.TransferToBankHomeViewModel;
import com.transsnet.palmpay.util.NetworkUtils;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import p159kd.e;
import p159kd.f;
import p159kd.h;
import p173ld.x;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/fragment/to_bank/TransferToBankHomeFavoriteFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/send_money/viewmodel/TransferToBankHomeViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/send_money/bean/event/AddRecipientEvent;", "event", "", "onAddRecipientMessage", "(Lcom/transsnet/palmpay/send_money/bean/event/AddRecipientEvent;)V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferToBankHomeFavoriteFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferToBankHomeFavoriteFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/to_bank/TransferToBankHomeFavoriteFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,291:1\n115#2,8:292\n145#2:300\n171#2,12:301\n215#2:313\n*S KotlinDebug\n*F\n+ 1 TransferToBankHomeFavoriteFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/to_bank/TransferToBankHomeFavoriteFragment\n*L\n117#1:292,8\n117#1:300\n199#1:301,12\n199#1:313\n*E\n"})
public final class TransferToBankHomeFavoriteFragment extends BaseMvvmFragment<TransferToBankHomeViewModel> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f33771j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f33773p;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f33772o = "COMMON";
    public boolean t = true;

    public TransferToBankHomeFavoriteFragment() {
        final int i7 = 0;
        this.f33771j = C2131j.b(new Function0(this) { // from class: Ed.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBankHomeFavoriteFragment f2324b;

            {
                this.f2324b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        View view = this.f2324b.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(p159kd.e.recyclerView);
                        }
                        return null;
                    default:
                        return new p173ld.x(CommonViewExtKt.getDp(12.0f), 0, 43, this.f2324b.m());
                }
            }
        });
        final int i10 = 1;
        this.f33773p = C2131j.b(new Function0(this) { // from class: Ed.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBankHomeFavoriteFragment f2324b;

            {
                this.f2324b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        View view = this.f2324b.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(p159kd.e.recyclerView);
                        }
                        return null;
                    default:
                        return new p173ld.x(CommonViewExtKt.getDp(12.0f), 0, 43, this.f2324b.m());
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.sm_fragment_transfer_to_bank_home_beneficiary;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        TransferToBankHomeViewModel transferToBankHomeViewModel = (TransferToBankHomeViewModel) this.f27333i;
        l lVar = transferToBankHomeViewModel != null ? transferToBankHomeViewModel.f34048f : null;
        if (lVar != null) {
            lVar.e(this, new C0144k(new C0139f(this, 9), 22));
        }
        TransferToBankHomeViewModel transferToBankHomeViewModel2 = (TransferToBankHomeViewModel) this.f27333i;
        final int i7 = 0;
        n.B(this, transferToBankHomeViewModel2 != null ? transferToBankHomeViewModel2.f34052o : null, this, new Function2(this) { // from class: Ed.K

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBankHomeFavoriteFragment f2326b;

            {
                this.f2326b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                RecipientMemberLogOutResp recipientMemberLogOutResp;
                RecipientListResp.RecipientBean recipientBean = (RecipientListResp.RecipientBean) obj;
                CommonBeanResult resp = (CommonBeanResult) obj2;
                switch (i7) {
                    case 0:
                        Intrinsics.checkNotNullParameter(resp, "resp");
                        boolean zIsSuccess = resp.isSuccess();
                        TransferToBankHomeFavoriteFragment transferToBankHomeFavoriteFragment = this.f2326b;
                        if (zIsSuccess) {
                            BankAccountMemberInfoResp bankAccountMemberInfoResp = (BankAccountMemberInfoResp) resp.data;
                            if (bankAccountMemberInfoResp != null) {
                                if (bankAccountMemberInfoResp.accountType == BankAccountMemberInfoResp.ACCOUNT_TYPE_OTHER) {
                                    transferToBankHomeFavoriteFragment.u(recipientBean);
                                } else {
                                    Context contextRequireContext = transferToBankHomeFavoriteFragment.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                    new FasterSendToPalmPayAccountDialog(contextRequireContext).setData(bankAccountMemberInfoResp).setOnButtonClickListener(new L(transferToBankHomeFavoriteFragment, recipientBean, bankAccountMemberInfoResp)).show();
                                }
                            }
                        } else {
                            p220oa.h.y(transferToBankHomeFavoriteFragment, resp.getRespMsg());
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(resp, "resp");
                        if (resp.isSuccess() && (recipientMemberLogOutResp = (RecipientMemberLogOutResp) resp.data) != null) {
                            Integer accountStatus = recipientMemberLogOutResp.getAccountStatus();
                            if (accountStatus != null && accountStatus.intValue() == 1) {
                                TransferToBankHomeFavoriteFragment transferToBankHomeFavoriteFragment2 = this.f2326b;
                                Context contextRequireContext2 = transferToBankHomeFavoriteFragment2.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                                AccountUnavailableDialog accountUnavailableDialog = new AccountUnavailableDialog(contextRequireContext2);
                                accountUnavailableDialog.show();
                                accountUnavailableDialog.setDialogInfo(recipientMemberLogOutResp);
                                accountUnavailableDialog.setData(recipientBean);
                                accountUnavailableDialog.setListener(new c0(13, transferToBankHomeFavoriteFragment2, recipientBean));
                            } else {
                                ARouter.getInstance().build("/sm/palmpay_personal_transfer").withString("MEMBER_ID", recipientBean != null ? recipientBean.payeeMemberId : null).withInt("extra_type", 2).withBoolean("existRecipient", true).withString("core_order_source_type", "2BANK2PALMPAY_3").navigation();
                            }
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new C(this, 12), false, null, 240);
        TransferToBankHomeViewModel transferToBankHomeViewModel3 = (TransferToBankHomeViewModel) this.f27333i;
        final int i10 = 1;
        n.B(this, transferToBankHomeViewModel3 != null ? transferToBankHomeViewModel3.t : null, this, new Function2(this) { // from class: Ed.K

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBankHomeFavoriteFragment f2326b;

            {
                this.f2326b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                RecipientMemberLogOutResp recipientMemberLogOutResp;
                RecipientListResp.RecipientBean recipientBean = (RecipientListResp.RecipientBean) obj;
                CommonBeanResult resp = (CommonBeanResult) obj2;
                switch (i10) {
                    case 0:
                        Intrinsics.checkNotNullParameter(resp, "resp");
                        boolean zIsSuccess = resp.isSuccess();
                        TransferToBankHomeFavoriteFragment transferToBankHomeFavoriteFragment = this.f2326b;
                        if (zIsSuccess) {
                            BankAccountMemberInfoResp bankAccountMemberInfoResp = (BankAccountMemberInfoResp) resp.data;
                            if (bankAccountMemberInfoResp != null) {
                                if (bankAccountMemberInfoResp.accountType == BankAccountMemberInfoResp.ACCOUNT_TYPE_OTHER) {
                                    transferToBankHomeFavoriteFragment.u(recipientBean);
                                } else {
                                    Context contextRequireContext = transferToBankHomeFavoriteFragment.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                    new FasterSendToPalmPayAccountDialog(contextRequireContext).setData(bankAccountMemberInfoResp).setOnButtonClickListener(new L(transferToBankHomeFavoriteFragment, recipientBean, bankAccountMemberInfoResp)).show();
                                }
                            }
                        } else {
                            p220oa.h.y(transferToBankHomeFavoriteFragment, resp.getRespMsg());
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(resp, "resp");
                        if (resp.isSuccess() && (recipientMemberLogOutResp = (RecipientMemberLogOutResp) resp.data) != null) {
                            Integer accountStatus = recipientMemberLogOutResp.getAccountStatus();
                            if (accountStatus != null && accountStatus.intValue() == 1) {
                                TransferToBankHomeFavoriteFragment transferToBankHomeFavoriteFragment2 = this.f2326b;
                                Context contextRequireContext2 = transferToBankHomeFavoriteFragment2.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                                AccountUnavailableDialog accountUnavailableDialog = new AccountUnavailableDialog(contextRequireContext2);
                                accountUnavailableDialog.show();
                                accountUnavailableDialog.setDialogInfo(recipientMemberLogOutResp);
                                accountUnavailableDialog.setData(recipientBean);
                                accountUnavailableDialog.setListener(new c0(13, transferToBankHomeFavoriteFragment2, recipientBean));
                            } else {
                                ARouter.getInstance().build("/sm/palmpay_personal_transfer").withString("MEMBER_ID", recipientBean != null ? recipientBean.payeeMemberId : null).withInt("extra_type", 2).withBoolean("existRecipient", true).withString("core_order_source_type", "2BANK2PALMPAY_3").navigation();
                            }
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, null, false, null, 248);
        TransferToBankHomeViewModel transferToBankHomeViewModel4 = (TransferToBankHomeViewModel) this.f27333i;
        l lVar2 = transferToBankHomeViewModel4 != null ? transferToBankHomeViewModel4.f34054v : null;
        if (lVar2 == null) {
            return 0;
        }
        lVar2.e(this, new C0144k(new Q(7, this, this), 22));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        String str;
        super.o();
        c.b().j(this);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("core_order_source_type", "") : null;
        if (!TextUtils.isEmpty(string)) {
            this.f33772o = string;
        }
        String string2 = getString(h.sm_no_favorite_yet);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        int i7 = r.cv_empty_no_palmpay_contacts;
        if (NetworkUtils.isConnected()) {
            str = "Add your own and frequent beneficiaries as favorites to enjoy free transfers.";
        } else {
            i7 = r.cv_empty_no_network;
            string2 = "No Network Connection";
            str = "Please check your network settings or refresh";
        }
        View viewInflate = getLayoutInflater().inflate(f.sm_layout_to_palmpay_empty_view_68, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(e.iv_empty_icon);
        TextView textView = (TextView) viewInflate.findViewById(e.tv_empty_title);
        TextView textView2 = (TextView) viewInflate.findViewById(e.tv_empty_tip);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(e.ll_empty_content);
        PpButton ppButton = (PpButton) viewInflate.findViewById(e.tv_empty_btn);
        Intrinsics.e(ppButton);
        p220oa.h.C(ppButton);
        ppButton.setText("Add Now");
        ppButton.setOnClickListener(new ViewOnClickListenerC0159a(this, 9));
        imageView.setImageResource(i7);
        textView.setText(string2);
        textView2.setText(str);
        linearLayout.setBackgroundResource(r.cv_rect_corner_bl_br_12_bg_white);
        t().setEmptyView(viewInflate);
        t tVar = this.f33771j;
        RecyclerView recyclerView = (RecyclerView) tVar.getValue();
        if (recyclerView != null) {
            recyclerView.setAdapter(t());
        }
        RecyclerView recyclerView2 = (RecyclerView) tVar.getValue();
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext()));
        }
        C1548f c1548f = new C1548f(CommonViewExtKt.colorInt(b.ppColorDividerLine, requireContext()), 1);
        c1548f.f31336e = false;
        RecyclerView recyclerView3 = (RecyclerView) tVar.getValue();
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(c1548f);
        }
        t().setOnItemClickListener(new a(this, 8));
        x xVarT = t();
        View viewInflate2 = getLayoutInflater().inflate(f.sm_item_foot_beneficiaries, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
        j.setFooterView$default(xVarT, viewInflate2, 0, 0, 6, null);
        return 0;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onAddRecipientMessage(@NotNull AddRecipientEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getRecipientType() == 2) {
            onResume();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        c.b().l(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        TransferToBankHomeViewModel transferToBankHomeViewModel;
        super.onResume();
        if (this.t || (transferToBankHomeViewModel = (TransferToBankHomeViewModel) this.f27333i) == null) {
            return;
        }
        transferToBankHomeViewModel.h();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z3) {
        super.setUserVisibleHint(z3);
        if (z3 && this.t) {
            this.t = false;
            TransferToBankHomeViewModel transferToBankHomeViewModel = (TransferToBankHomeViewModel) this.f27333i;
            if (transferToBankHomeViewModel != null) {
                transferToBankHomeViewModel.h();
            }
        }
    }

    public final x t() {
        return (x) this.f33773p.getValue();
    }

    public final void u(RecipientListResp.RecipientBean recipientBean) {
        if (recipientBean != null) {
            BankInfo bankInfo = new BankInfo();
            bankInfo.mmo = recipientBean.getRecipientType() == 7 ? 1 : 0;
            bankInfo.bankCode = recipientBean.getRecipientBankCode();
            bankInfo.bankName = recipientBean.getRecipientBankName();
            bankInfo.bankUrl = recipientBean.getRecipientHeadImage();
            bankInfo.relationshipPic = recipientBean.relationshipPic;
            bankInfo.relationshipDarkPic = recipientBean.relationshipDarkPic;
            bankInfo.label = recipientBean.getLabel();
            TransferToBankInputAmountActivity.a aVar = TransferToBankInputAmountActivity.f33522C;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            TransferToBankInputAmountActivity.a.startAct$default(aVar, contextRequireContext, recipientBean.getRecipientAccountNumber(), bankInfo, recipientBean.getRecipientNickname(), this.f33772o, null, 32, null);
        }
    }
}
