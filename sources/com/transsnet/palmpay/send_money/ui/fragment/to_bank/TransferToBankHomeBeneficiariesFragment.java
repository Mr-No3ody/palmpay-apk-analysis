package com.transsnet.palmpay.send_money.ui.fragment.to_bank;

import Ab.C;
import Ad.c0;
import C9.C0139f;
import C9.C0144k;
import C9.Q;
import Ed.F;
import Ed.H;
import L6.b;
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
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeBeneficiariesFragment;
import com.transsnet.palmpay.send_money.viewmodel.TransferToBankHomeViewModel;
import com.transsnet.palmpay.util.NetworkUtils;
import com.transsnet.palmpay.util.SPUtils;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/fragment/to_bank/TransferToBankHomeBeneficiariesFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/send_money/viewmodel/TransferToBankHomeViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/send_money/bean/event/AddRecipientEvent;", "event", "", "onAddRecipientMessage", "(Lcom/transsnet/palmpay/send_money/bean/event/AddRecipientEvent;)V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferToBankHomeBeneficiariesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferToBankHomeBeneficiariesFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/to_bank/TransferToBankHomeBeneficiariesFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,316:1\n115#2,8:317\n145#2:325\n171#2,12:326\n215#2:338\n*S KotlinDebug\n*F\n+ 1 TransferToBankHomeBeneficiariesFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/to_bank/TransferToBankHomeBeneficiariesFragment\n*L\n132#1:317,8\n132#1:325\n213#1:326,12\n213#1:338\n*E\n"})
public final class TransferToBankHomeBeneficiariesFragment extends BaseMvvmFragment<TransferToBankHomeViewModel> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f33768j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f33769o = "COMMON";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f33770p;

    public TransferToBankHomeBeneficiariesFragment() {
        final int i7 = 0;
        this.f33768j = C2131j.b(new Function0(this) { // from class: Ed.G

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBankHomeBeneficiariesFragment f2317b;

            {
                this.f2317b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        View view = this.f2317b.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(p159kd.e.recyclerView);
                        }
                        return null;
                    default:
                        return new p173ld.x(CommonViewExtKt.getDp(12.0f), 0, 41, this.f2317b.m());
                }
            }
        });
        final int i10 = 1;
        this.f33770p = C2131j.b(new Function0(this) { // from class: Ed.G

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBankHomeBeneficiariesFragment f2317b;

            {
                this.f2317b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        View view = this.f2317b.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(p159kd.e.recyclerView);
                        }
                        return null;
                    default:
                        return new p173ld.x(CommonViewExtKt.getDp(12.0f), 0, 41, this.f2317b.m());
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
            lVar.e(this, new C0144k(new C0139f(this, 8), 21));
        }
        TransferToBankHomeViewModel transferToBankHomeViewModel2 = (TransferToBankHomeViewModel) this.f27333i;
        final int i7 = 0;
        n.B(this, transferToBankHomeViewModel2 != null ? transferToBankHomeViewModel2.f34052o : null, this, new Function2(this) { // from class: Ed.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBankHomeBeneficiariesFragment f2314b;

            {
                this.f2314b = this;
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
                        TransferToBankHomeBeneficiariesFragment transferToBankHomeBeneficiariesFragment = this.f2314b;
                        if (zIsSuccess) {
                            BankAccountMemberInfoResp bankAccountMemberInfoResp = (BankAccountMemberInfoResp) resp.data;
                            if (bankAccountMemberInfoResp != null) {
                                if (bankAccountMemberInfoResp.accountType == BankAccountMemberInfoResp.ACCOUNT_TYPE_OTHER) {
                                    transferToBankHomeBeneficiariesFragment.u(recipientBean);
                                } else {
                                    Context contextRequireContext = transferToBankHomeBeneficiariesFragment.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                    new FasterSendToPalmPayAccountDialog(contextRequireContext).setData(bankAccountMemberInfoResp).setOnButtonClickListener(new I(transferToBankHomeBeneficiariesFragment, recipientBean, bankAccountMemberInfoResp)).show();
                                }
                            }
                        } else {
                            p220oa.h.y(transferToBankHomeBeneficiariesFragment, resp.getRespMsg());
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(resp, "resp");
                        if (resp.isSuccess() && (recipientMemberLogOutResp = (RecipientMemberLogOutResp) resp.data) != null) {
                            Integer accountStatus = recipientMemberLogOutResp.getAccountStatus();
                            if (accountStatus != null && accountStatus.intValue() == 1) {
                                TransferToBankHomeBeneficiariesFragment transferToBankHomeBeneficiariesFragment2 = this.f2314b;
                                Context contextRequireContext2 = transferToBankHomeBeneficiariesFragment2.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                                AccountUnavailableDialog accountUnavailableDialog = new AccountUnavailableDialog(contextRequireContext2);
                                accountUnavailableDialog.show();
                                accountUnavailableDialog.setDialogInfo(recipientMemberLogOutResp);
                                accountUnavailableDialog.setData(recipientBean);
                                accountUnavailableDialog.setListener(new c0(12, transferToBankHomeBeneficiariesFragment2, recipientBean));
                            } else {
                                ARouter.getInstance().build("/sm/palmpay_personal_transfer").withString("MEMBER_ID", recipientBean != null ? recipientBean.payeeMemberId : null).withInt("extra_type", 2).withString("core_order_source_type", "2BANK2PALMPAY_3").withBoolean("existRecipient", true).navigation();
                            }
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new C(this, 11), false, null, 240);
        TransferToBankHomeViewModel transferToBankHomeViewModel3 = (TransferToBankHomeViewModel) this.f27333i;
        final int i10 = 1;
        n.B(this, transferToBankHomeViewModel3 != null ? transferToBankHomeViewModel3.t : null, this, new Function2(this) { // from class: Ed.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBankHomeBeneficiariesFragment f2314b;

            {
                this.f2314b = this;
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
                        TransferToBankHomeBeneficiariesFragment transferToBankHomeBeneficiariesFragment = this.f2314b;
                        if (zIsSuccess) {
                            BankAccountMemberInfoResp bankAccountMemberInfoResp = (BankAccountMemberInfoResp) resp.data;
                            if (bankAccountMemberInfoResp != null) {
                                if (bankAccountMemberInfoResp.accountType == BankAccountMemberInfoResp.ACCOUNT_TYPE_OTHER) {
                                    transferToBankHomeBeneficiariesFragment.u(recipientBean);
                                } else {
                                    Context contextRequireContext = transferToBankHomeBeneficiariesFragment.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                    new FasterSendToPalmPayAccountDialog(contextRequireContext).setData(bankAccountMemberInfoResp).setOnButtonClickListener(new I(transferToBankHomeBeneficiariesFragment, recipientBean, bankAccountMemberInfoResp)).show();
                                }
                            }
                        } else {
                            p220oa.h.y(transferToBankHomeBeneficiariesFragment, resp.getRespMsg());
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(resp, "resp");
                        if (resp.isSuccess() && (recipientMemberLogOutResp = (RecipientMemberLogOutResp) resp.data) != null) {
                            Integer accountStatus = recipientMemberLogOutResp.getAccountStatus();
                            if (accountStatus != null && accountStatus.intValue() == 1) {
                                TransferToBankHomeBeneficiariesFragment transferToBankHomeBeneficiariesFragment2 = this.f2314b;
                                Context contextRequireContext2 = transferToBankHomeBeneficiariesFragment2.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                                AccountUnavailableDialog accountUnavailableDialog = new AccountUnavailableDialog(contextRequireContext2);
                                accountUnavailableDialog.show();
                                accountUnavailableDialog.setDialogInfo(recipientMemberLogOutResp);
                                accountUnavailableDialog.setData(recipientBean);
                                accountUnavailableDialog.setListener(new c0(12, transferToBankHomeBeneficiariesFragment2, recipientBean));
                            } else {
                                ARouter.getInstance().build("/sm/palmpay_personal_transfer").withString("MEMBER_ID", recipientBean != null ? recipientBean.payeeMemberId : null).withInt("extra_type", 2).withString("core_order_source_type", "2BANK2PALMPAY_3").withBoolean("existRecipient", true).navigation();
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
        lVar2.e(this, new C0144k(new Q(6, this, this), 21));
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
            this.f33769o = string;
        }
        View viewInflate = getLayoutInflater().inflate(f.sm_layout_to_palmpay_empty_view_68, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(e.iv_empty_icon);
        TextView textView = (TextView) viewInflate.findViewById(e.tv_empty_title);
        TextView textView2 = (TextView) viewInflate.findViewById(e.tv_empty_tip);
        PpButton ppButton = (PpButton) viewInflate.findViewById(e.tv_empty_btn);
        String string2 = getString(h.sm_no_beneficiaries_yet);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        int i7 = r.cv_empty_no_palmpay_contacts;
        if (NetworkUtils.isConnected()) {
            str = "Beneficiaries will be added automatically \nif the transfer is successful";
        } else {
            i7 = r.cv_empty_no_network;
            if (SPUtils.get().getBoolean("show_transfer_via_ussd", false)) {
                Intrinsics.e(ppButton);
                p220oa.h.C(ppButton);
                ppButton.setText(getString(h.sm_transfer_via_ussd));
                ppButton.setOnClickListener(new H(this, 1));
            }
            string2 = "No Network Connection";
            str = "Please check your network settings or refresh";
        }
        imageView.setImageResource(i7);
        textView.setText(string2);
        textView2.setText(str);
        ((LinearLayout) viewInflate.findViewById(e.ll_empty_content)).setBackgroundResource(r.cv_rect_bg_white_corner_bl_br_12);
        t().setEmptyView(viewInflate);
        t tVar = this.f33768j;
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
        t().setOnItemClickListener(new F(this));
        t().setOnItemChildClickListener(new F(this));
        return 0;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onAddRecipientMessage(@NotNull AddRecipientEvent event) {
        TransferToBankHomeViewModel transferToBankHomeViewModel;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getRecipientType() != 2 || (transferToBankHomeViewModel = (TransferToBankHomeViewModel) this.f27333i) == null) {
            return;
        }
        transferToBankHomeViewModel.i();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        c.b().l(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        TransferToBankHomeViewModel transferToBankHomeViewModel = (TransferToBankHomeViewModel) this.f27333i;
        if (transferToBankHomeViewModel != null) {
            transferToBankHomeViewModel.i();
        }
    }

    public final x t() {
        return (x) this.f33770p.getValue();
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
            TransferToBankInputAmountActivity.a.startAct$default(aVar, contextRequireContext, recipientBean.getRecipientAccountNumber(), bankInfo, recipientBean.getRecipientNickname(), this.f33769o, null, 32, null);
        }
    }
}
