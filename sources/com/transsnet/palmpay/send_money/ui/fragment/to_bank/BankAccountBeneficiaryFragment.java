package com.transsnet.palmpay.send_money.ui.fragment.to_bank;

import Ab.B;
import Ab.i;
import Ad.c0;
import C9.C0139f;
import C9.C0144k;
import Ed.C0224d;
import Ed.C0225e;
import Ed.C0227g;
import Ed.ViewOnTouchListenerC0223c;
import L6.b;
import Pa.n0;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.CompatStateEditText;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.bean.event.AddRecipientEvent;
import com.transsnet.palmpay.send_money.bean.resp.BankAccountMemberInfoResp;
import com.transsnet.palmpay.send_money.bean.resp.RecipientMemberLogOutResp;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.dialog.AccountUnavailableDialog;
import com.transsnet.palmpay.send_money.ui.dialog.FasterSendToPalmPayAccountDialog;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountBeneficiaryFragment;
import com.transsnet.palmpay.send_money.ui.view.SideBarView;
import com.transsnet.palmpay.send_money.viewmodel.TransferToBankHomeViewModel;
import io.fastkv.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import p159kd.a;
import p159kd.f;
import p159kd.h;
import p161kf.e;
import p173ld.x;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/fragment/to_bank/BankAccountBeneficiaryFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/send_money/viewmodel/TransferToBankHomeViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/send_money/bean/event/AddRecipientEvent;", "event", "", "onAddRecipientMessage", "(Lcom/transsnet/palmpay/send_money/bean/event/AddRecipientEvent;)V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBankAccountBeneficiaryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BankAccountBeneficiaryFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/to_bank/BankAccountBeneficiaryFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,519:1\n115#2,8:520\n145#2:528\n171#2,12:529\n215#2:541\n171#2,12:542\n215#2:554\n1869#3,2:555\n*S KotlinDebug\n*F\n+ 1 BankAccountBeneficiaryFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/to_bank/BankAccountBeneficiaryFragment\n*L\n235#1:520,8\n235#1:528\n281#1:529,12\n281#1:541\n361#1:542,12\n361#1:554\n255#1:555,2\n*E\n"})
public final class BankAccountBeneficiaryFragment extends BaseMvvmFragment<TransferToBankHomeViewModel> {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f33736B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public e f33737C;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f33740j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f33741o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f33742p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f33743v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f33744w;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f33735A = "COMMON";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public List f33738H = new ArrayList();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final String f33739L = "";

    public BankAccountBeneficiaryFragment() {
        final int i7 = 0;
        this.f33740j = C2131j.b(new Function0(this) { // from class: Ed.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountBeneficiaryFragment f2355b;

            {
                this.f2355b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        View view = this.f2355b.f27318b;
                        if (view != null) {
                            return view.findViewById(p159kd.e.ll_empty_state);
                        }
                        return null;
                    case 1:
                        View view2 = this.f2355b.f27318b;
                        if (view2 != null) {
                            return (SideBarView) view2.findViewById(p159kd.e.side_bar);
                        }
                        return null;
                    case 2:
                        View view3 = this.f2355b.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p159kd.e.rv_beneficiary);
                        }
                        return null;
                    case 3:
                        View view4 = this.f2355b.f27318b;
                        if (view4 != null) {
                            return (CompatStateEditText) view4.findViewById(p159kd.e.search_et);
                        }
                        return null;
                    case 4:
                        View view5 = this.f2355b.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p159kd.e.ll_bank_accounts);
                        }
                        return null;
                    default:
                        return new p173ld.x(0, CommonViewExtKt.getDp(10.0f), 26, this.f2355b.m());
                }
            }
        });
        final int i10 = 1;
        this.f33741o = C2131j.b(new Function0(this) { // from class: Ed.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountBeneficiaryFragment f2355b;

            {
                this.f2355b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        View view = this.f2355b.f27318b;
                        if (view != null) {
                            return view.findViewById(p159kd.e.ll_empty_state);
                        }
                        return null;
                    case 1:
                        View view2 = this.f2355b.f27318b;
                        if (view2 != null) {
                            return (SideBarView) view2.findViewById(p159kd.e.side_bar);
                        }
                        return null;
                    case 2:
                        View view3 = this.f2355b.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p159kd.e.rv_beneficiary);
                        }
                        return null;
                    case 3:
                        View view4 = this.f2355b.f27318b;
                        if (view4 != null) {
                            return (CompatStateEditText) view4.findViewById(p159kd.e.search_et);
                        }
                        return null;
                    case 4:
                        View view5 = this.f2355b.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p159kd.e.ll_bank_accounts);
                        }
                        return null;
                    default:
                        return new p173ld.x(0, CommonViewExtKt.getDp(10.0f), 26, this.f2355b.m());
                }
            }
        });
        final int i11 = 2;
        this.f33742p = C2131j.b(new Function0(this) { // from class: Ed.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountBeneficiaryFragment f2355b;

            {
                this.f2355b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        View view = this.f2355b.f27318b;
                        if (view != null) {
                            return view.findViewById(p159kd.e.ll_empty_state);
                        }
                        return null;
                    case 1:
                        View view2 = this.f2355b.f27318b;
                        if (view2 != null) {
                            return (SideBarView) view2.findViewById(p159kd.e.side_bar);
                        }
                        return null;
                    case 2:
                        View view3 = this.f2355b.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p159kd.e.rv_beneficiary);
                        }
                        return null;
                    case 3:
                        View view4 = this.f2355b.f27318b;
                        if (view4 != null) {
                            return (CompatStateEditText) view4.findViewById(p159kd.e.search_et);
                        }
                        return null;
                    case 4:
                        View view5 = this.f2355b.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p159kd.e.ll_bank_accounts);
                        }
                        return null;
                    default:
                        return new p173ld.x(0, CommonViewExtKt.getDp(10.0f), 26, this.f2355b.m());
                }
            }
        });
        final int i12 = 3;
        this.t = C2131j.b(new Function0(this) { // from class: Ed.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountBeneficiaryFragment f2355b;

            {
                this.f2355b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        View view = this.f2355b.f27318b;
                        if (view != null) {
                            return view.findViewById(p159kd.e.ll_empty_state);
                        }
                        return null;
                    case 1:
                        View view2 = this.f2355b.f27318b;
                        if (view2 != null) {
                            return (SideBarView) view2.findViewById(p159kd.e.side_bar);
                        }
                        return null;
                    case 2:
                        View view3 = this.f2355b.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p159kd.e.rv_beneficiary);
                        }
                        return null;
                    case 3:
                        View view4 = this.f2355b.f27318b;
                        if (view4 != null) {
                            return (CompatStateEditText) view4.findViewById(p159kd.e.search_et);
                        }
                        return null;
                    case 4:
                        View view5 = this.f2355b.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p159kd.e.ll_bank_accounts);
                        }
                        return null;
                    default:
                        return new p173ld.x(0, CommonViewExtKt.getDp(10.0f), 26, this.f2355b.m());
                }
            }
        });
        final int i13 = 4;
        this.f33743v = C2131j.b(new Function0(this) { // from class: Ed.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountBeneficiaryFragment f2355b;

            {
                this.f2355b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        View view = this.f2355b.f27318b;
                        if (view != null) {
                            return view.findViewById(p159kd.e.ll_empty_state);
                        }
                        return null;
                    case 1:
                        View view2 = this.f2355b.f27318b;
                        if (view2 != null) {
                            return (SideBarView) view2.findViewById(p159kd.e.side_bar);
                        }
                        return null;
                    case 2:
                        View view3 = this.f2355b.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p159kd.e.rv_beneficiary);
                        }
                        return null;
                    case 3:
                        View view4 = this.f2355b.f27318b;
                        if (view4 != null) {
                            return (CompatStateEditText) view4.findViewById(p159kd.e.search_et);
                        }
                        return null;
                    case 4:
                        View view5 = this.f2355b.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p159kd.e.ll_bank_accounts);
                        }
                        return null;
                    default:
                        return new p173ld.x(0, CommonViewExtKt.getDp(10.0f), 26, this.f2355b.m());
                }
            }
        });
        final int i14 = 5;
        this.f33736B = C2131j.b(new Function0(this) { // from class: Ed.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountBeneficiaryFragment f2355b;

            {
                this.f2355b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        View view = this.f2355b.f27318b;
                        if (view != null) {
                            return view.findViewById(p159kd.e.ll_empty_state);
                        }
                        return null;
                    case 1:
                        View view2 = this.f2355b.f27318b;
                        if (view2 != null) {
                            return (SideBarView) view2.findViewById(p159kd.e.side_bar);
                        }
                        return null;
                    case 2:
                        View view3 = this.f2355b.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p159kd.e.rv_beneficiary);
                        }
                        return null;
                    case 3:
                        View view4 = this.f2355b.f27318b;
                        if (view4 != null) {
                            return (CompatStateEditText) view4.findViewById(p159kd.e.search_et);
                        }
                        return null;
                    case 4:
                        View view5 = this.f2355b.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p159kd.e.ll_bank_accounts);
                        }
                        return null;
                    default:
                        return new p173ld.x(0, CommonViewExtKt.getDp(10.0f), 26, this.f2355b.m());
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.sm_fragment_bank_account_beneficiary;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        TransferToBankHomeViewModel transferToBankHomeViewModel = (TransferToBankHomeViewModel) this.f27333i;
        l lVar = transferToBankHomeViewModel != null ? transferToBankHomeViewModel.f34048f : null;
        if (lVar != null) {
            lVar.e(this, new C0144k(new C0139f(this, 5), 17));
        }
        TransferToBankHomeViewModel transferToBankHomeViewModel2 = (TransferToBankHomeViewModel) this.f27333i;
        final int i7 = 1;
        n.B(this, transferToBankHomeViewModel2 != null ? transferToBankHomeViewModel2.f34049g : null, this, new Function2(this) { // from class: Ed.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountBeneficiaryFragment f2359b;

            {
                this.f2359b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                RecipientMemberLogOutResp recipientMemberLogOutResp;
                switch (i7) {
                    case 0:
                        RecipientListResp.RecipientBean recipientBean = (RecipientListResp.RecipientBean) obj;
                        CommonBeanResult resp = (CommonBeanResult) obj2;
                        Intrinsics.checkNotNullParameter(resp, "resp");
                        if (resp.isSuccess() && (recipientMemberLogOutResp = (RecipientMemberLogOutResp) resp.data) != null) {
                            Integer accountStatus = recipientMemberLogOutResp.getAccountStatus();
                            if (accountStatus != null && accountStatus.intValue() == 1) {
                                BankAccountBeneficiaryFragment bankAccountBeneficiaryFragment = this.f2359b;
                                Context contextRequireContext = bankAccountBeneficiaryFragment.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                AccountUnavailableDialog accountUnavailableDialog = new AccountUnavailableDialog(contextRequireContext);
                                accountUnavailableDialog.show();
                                accountUnavailableDialog.setDialogInfo(recipientMemberLogOutResp);
                                accountUnavailableDialog.setData(recipientBean);
                                accountUnavailableDialog.setListener(new c0(8, bankAccountBeneficiaryFragment, recipientBean));
                            } else {
                                ARouter.getInstance().build("/sm/palmpay_personal_transfer").withString("MEMBER_ID", recipientBean != null ? recipientBean.payeeMemberId : null).withInt("extra_type", 2).withBoolean("existRecipient", true).withString("core_order_source_type", "2BANK2PALMPAY_5").navigation();
                            }
                        }
                        break;
                    case 1:
                        String str = (String) obj;
                        CommonResult resp2 = (CommonResult) obj2;
                        Intrinsics.checkNotNullParameter(resp2, "resp");
                        boolean zIsSuccess = resp2.isSuccess();
                        BankAccountBeneficiaryFragment bankAccountBeneficiaryFragment2 = this.f2359b;
                        if (zIsSuccess) {
                            Iterator<T> it = bankAccountBeneficiaryFragment2.u().getData().iterator();
                            while (it.hasNext()) {
                                RecipientListResp.RecipientBean recipientBean2 = (RecipientListResp.RecipientBean) it.next();
                                if (Intrinsics.c(recipientBean2.getRecipientId(), str)) {
                                    recipientBean2.setFavorite(!recipientBean2.favorite);
                                    p220oa.h.y(bankAccountBeneficiaryFragment2, "Successfully " + (recipientBean2.isFavorite() ? "add to" : "remove from") + " Favorites");
                                    bankAccountBeneficiaryFragment2.u().notifyDataSetChanged();
                                    org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(2));
                                }
                            }
                            bankAccountBeneficiaryFragment2.u().notifyDataSetChanged();
                            org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(2));
                        } else {
                            p220oa.h.y(bankAccountBeneficiaryFragment2, resp2.getRespMsg());
                        }
                        break;
                    default:
                        RecipientListResp.RecipientBean recipientBean3 = (RecipientListResp.RecipientBean) obj;
                        CommonBeanResult resp3 = (CommonBeanResult) obj2;
                        Intrinsics.checkNotNullParameter(resp3, "resp");
                        boolean zIsSuccess2 = resp3.isSuccess();
                        BankAccountBeneficiaryFragment bankAccountBeneficiaryFragment3 = this.f2359b;
                        if (zIsSuccess2) {
                            BankAccountMemberInfoResp bankAccountMemberInfoResp = (BankAccountMemberInfoResp) resp3.data;
                            if (bankAccountMemberInfoResp != null) {
                                if (bankAccountMemberInfoResp.accountType == BankAccountMemberInfoResp.ACCOUNT_TYPE_OTHER) {
                                    bankAccountBeneficiaryFragment3.w(recipientBean3);
                                } else {
                                    Context contextRequireContext2 = bankAccountBeneficiaryFragment3.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                                    new FasterSendToPalmPayAccountDialog(contextRequireContext2).setData(bankAccountMemberInfoResp).setOnButtonClickListener(new C0226f(bankAccountBeneficiaryFragment3, recipientBean3, bankAccountMemberInfoResp)).show();
                                }
                            }
                        } else {
                            p220oa.h.y(bankAccountBeneficiaryFragment3, resp3.getRespMsg());
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new B(9), false, null, 240);
        TransferToBankHomeViewModel transferToBankHomeViewModel3 = (TransferToBankHomeViewModel) this.f27333i;
        l lVar2 = transferToBankHomeViewModel3 != null ? transferToBankHomeViewModel3.f34050i : null;
        if (lVar2 != null) {
            lVar2.e(this, new C0144k(new C0225e(this, this, 0), 17));
        }
        TransferToBankHomeViewModel transferToBankHomeViewModel4 = (TransferToBankHomeViewModel) this.f27333i;
        final int i10 = 2;
        n.B(this, transferToBankHomeViewModel4 != null ? transferToBankHomeViewModel4.f34052o : null, this, new Function2(this) { // from class: Ed.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountBeneficiaryFragment f2359b;

            {
                this.f2359b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                RecipientMemberLogOutResp recipientMemberLogOutResp;
                switch (i10) {
                    case 0:
                        RecipientListResp.RecipientBean recipientBean = (RecipientListResp.RecipientBean) obj;
                        CommonBeanResult resp = (CommonBeanResult) obj2;
                        Intrinsics.checkNotNullParameter(resp, "resp");
                        if (resp.isSuccess() && (recipientMemberLogOutResp = (RecipientMemberLogOutResp) resp.data) != null) {
                            Integer accountStatus = recipientMemberLogOutResp.getAccountStatus();
                            if (accountStatus != null && accountStatus.intValue() == 1) {
                                BankAccountBeneficiaryFragment bankAccountBeneficiaryFragment = this.f2359b;
                                Context contextRequireContext = bankAccountBeneficiaryFragment.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                AccountUnavailableDialog accountUnavailableDialog = new AccountUnavailableDialog(contextRequireContext);
                                accountUnavailableDialog.show();
                                accountUnavailableDialog.setDialogInfo(recipientMemberLogOutResp);
                                accountUnavailableDialog.setData(recipientBean);
                                accountUnavailableDialog.setListener(new c0(8, bankAccountBeneficiaryFragment, recipientBean));
                            } else {
                                ARouter.getInstance().build("/sm/palmpay_personal_transfer").withString("MEMBER_ID", recipientBean != null ? recipientBean.payeeMemberId : null).withInt("extra_type", 2).withBoolean("existRecipient", true).withString("core_order_source_type", "2BANK2PALMPAY_5").navigation();
                            }
                        }
                        break;
                    case 1:
                        String str = (String) obj;
                        CommonResult resp2 = (CommonResult) obj2;
                        Intrinsics.checkNotNullParameter(resp2, "resp");
                        boolean zIsSuccess = resp2.isSuccess();
                        BankAccountBeneficiaryFragment bankAccountBeneficiaryFragment2 = this.f2359b;
                        if (zIsSuccess) {
                            Iterator<T> it = bankAccountBeneficiaryFragment2.u().getData().iterator();
                            while (it.hasNext()) {
                                RecipientListResp.RecipientBean recipientBean2 = (RecipientListResp.RecipientBean) it.next();
                                if (Intrinsics.c(recipientBean2.getRecipientId(), str)) {
                                    recipientBean2.setFavorite(!recipientBean2.favorite);
                                    p220oa.h.y(bankAccountBeneficiaryFragment2, "Successfully " + (recipientBean2.isFavorite() ? "add to" : "remove from") + " Favorites");
                                    bankAccountBeneficiaryFragment2.u().notifyDataSetChanged();
                                    org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(2));
                                }
                            }
                            bankAccountBeneficiaryFragment2.u().notifyDataSetChanged();
                            org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(2));
                        } else {
                            p220oa.h.y(bankAccountBeneficiaryFragment2, resp2.getRespMsg());
                        }
                        break;
                    default:
                        RecipientListResp.RecipientBean recipientBean3 = (RecipientListResp.RecipientBean) obj;
                        CommonBeanResult resp3 = (CommonBeanResult) obj2;
                        Intrinsics.checkNotNullParameter(resp3, "resp");
                        boolean zIsSuccess2 = resp3.isSuccess();
                        BankAccountBeneficiaryFragment bankAccountBeneficiaryFragment3 = this.f2359b;
                        if (zIsSuccess2) {
                            BankAccountMemberInfoResp bankAccountMemberInfoResp = (BankAccountMemberInfoResp) resp3.data;
                            if (bankAccountMemberInfoResp != null) {
                                if (bankAccountMemberInfoResp.accountType == BankAccountMemberInfoResp.ACCOUNT_TYPE_OTHER) {
                                    bankAccountBeneficiaryFragment3.w(recipientBean3);
                                } else {
                                    Context contextRequireContext2 = bankAccountBeneficiaryFragment3.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                                    new FasterSendToPalmPayAccountDialog(contextRequireContext2).setData(bankAccountMemberInfoResp).setOnButtonClickListener(new C0226f(bankAccountBeneficiaryFragment3, recipientBean3, bankAccountMemberInfoResp)).show();
                                }
                            }
                        } else {
                            p220oa.h.y(bankAccountBeneficiaryFragment3, resp3.getRespMsg());
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new C0224d(this, 1), false, null, 240);
        TransferToBankHomeViewModel transferToBankHomeViewModel5 = (TransferToBankHomeViewModel) this.f27333i;
        final int i11 = 0;
        n.B(this, transferToBankHomeViewModel5 != null ? transferToBankHomeViewModel5.t : null, this, new Function2(this) { // from class: Ed.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountBeneficiaryFragment f2359b;

            {
                this.f2359b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                RecipientMemberLogOutResp recipientMemberLogOutResp;
                switch (i11) {
                    case 0:
                        RecipientListResp.RecipientBean recipientBean = (RecipientListResp.RecipientBean) obj;
                        CommonBeanResult resp = (CommonBeanResult) obj2;
                        Intrinsics.checkNotNullParameter(resp, "resp");
                        if (resp.isSuccess() && (recipientMemberLogOutResp = (RecipientMemberLogOutResp) resp.data) != null) {
                            Integer accountStatus = recipientMemberLogOutResp.getAccountStatus();
                            if (accountStatus != null && accountStatus.intValue() == 1) {
                                BankAccountBeneficiaryFragment bankAccountBeneficiaryFragment = this.f2359b;
                                Context contextRequireContext = bankAccountBeneficiaryFragment.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                AccountUnavailableDialog accountUnavailableDialog = new AccountUnavailableDialog(contextRequireContext);
                                accountUnavailableDialog.show();
                                accountUnavailableDialog.setDialogInfo(recipientMemberLogOutResp);
                                accountUnavailableDialog.setData(recipientBean);
                                accountUnavailableDialog.setListener(new c0(8, bankAccountBeneficiaryFragment, recipientBean));
                            } else {
                                ARouter.getInstance().build("/sm/palmpay_personal_transfer").withString("MEMBER_ID", recipientBean != null ? recipientBean.payeeMemberId : null).withInt("extra_type", 2).withBoolean("existRecipient", true).withString("core_order_source_type", "2BANK2PALMPAY_5").navigation();
                            }
                        }
                        break;
                    case 1:
                        String str = (String) obj;
                        CommonResult resp2 = (CommonResult) obj2;
                        Intrinsics.checkNotNullParameter(resp2, "resp");
                        boolean zIsSuccess = resp2.isSuccess();
                        BankAccountBeneficiaryFragment bankAccountBeneficiaryFragment2 = this.f2359b;
                        if (zIsSuccess) {
                            Iterator<T> it = bankAccountBeneficiaryFragment2.u().getData().iterator();
                            while (it.hasNext()) {
                                RecipientListResp.RecipientBean recipientBean2 = (RecipientListResp.RecipientBean) it.next();
                                if (Intrinsics.c(recipientBean2.getRecipientId(), str)) {
                                    recipientBean2.setFavorite(!recipientBean2.favorite);
                                    p220oa.h.y(bankAccountBeneficiaryFragment2, "Successfully " + (recipientBean2.isFavorite() ? "add to" : "remove from") + " Favorites");
                                    bankAccountBeneficiaryFragment2.u().notifyDataSetChanged();
                                    org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(2));
                                }
                            }
                            bankAccountBeneficiaryFragment2.u().notifyDataSetChanged();
                            org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(2));
                        } else {
                            p220oa.h.y(bankAccountBeneficiaryFragment2, resp2.getRespMsg());
                        }
                        break;
                    default:
                        RecipientListResp.RecipientBean recipientBean3 = (RecipientListResp.RecipientBean) obj;
                        CommonBeanResult resp3 = (CommonBeanResult) obj2;
                        Intrinsics.checkNotNullParameter(resp3, "resp");
                        boolean zIsSuccess2 = resp3.isSuccess();
                        BankAccountBeneficiaryFragment bankAccountBeneficiaryFragment3 = this.f2359b;
                        if (zIsSuccess2) {
                            BankAccountMemberInfoResp bankAccountMemberInfoResp = (BankAccountMemberInfoResp) resp3.data;
                            if (bankAccountMemberInfoResp != null) {
                                if (bankAccountMemberInfoResp.accountType == BankAccountMemberInfoResp.ACCOUNT_TYPE_OTHER) {
                                    bankAccountBeneficiaryFragment3.w(recipientBean3);
                                } else {
                                    Context contextRequireContext2 = bankAccountBeneficiaryFragment3.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                                    new FasterSendToPalmPayAccountDialog(contextRequireContext2).setData(bankAccountMemberInfoResp).setOnButtonClickListener(new C0226f(bankAccountBeneficiaryFragment3, recipientBean3, bankAccountMemberInfoResp)).show();
                                }
                            }
                        } else {
                            p220oa.h.y(bankAccountBeneficiaryFragment3, resp3.getRespMsg());
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, null, false, null, 248);
        TransferToBankHomeViewModel transferToBankHomeViewModel6 = (TransferToBankHomeViewModel) this.f27333i;
        l lVar3 = transferToBankHomeViewModel6 != null ? transferToBankHomeViewModel6.f34054v : null;
        if (lVar3 == null) {
            return 0;
        }
        lVar3.e(this, new C0144k(new C0225e(this, this, 1), 17));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        ARouter.getInstance().inject(this);
        c.b().j(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f33744w = arguments.getBoolean("extra_data", false);
            String string = arguments.getString("core_order_source_type", "COMMON");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            this.f33735A = string;
        }
        t tVar = this.t;
        CompatStateEditText compatStateEditText = (CompatStateEditText) tVar.getValue();
        if (compatStateEditText != null) {
            compatStateEditText.setHint(getString(h.sm_search_recipient_name));
        }
        CompatStateEditText compatStateEditText2 = (CompatStateEditText) tVar.getValue();
        if (compatStateEditText2 != null) {
            compatStateEditText2.setOnTouchListener(new ViewOnTouchListenerC0223c(this, 0));
        }
        CompatStateEditText compatStateEditText3 = (CompatStateEditText) tVar.getValue();
        if (compatStateEditText3 != null) {
            compatStateEditText3.addTextChangedListener(new i(this, 6));
        }
        t tVar2 = this.f33741o;
        SideBarView sideBarView = (SideBarView) tVar2.getValue();
        if (sideBarView != null) {
            sideBarView.setLetters(getResources().getStringArray(a.sm_select_bank_slide_bar_value_new));
        }
        SideBarView sideBarView2 = (SideBarView) tVar2.getValue();
        if (sideBarView2 != null) {
            sideBarView2.setOnLetterChangeListener(new C0227g(this));
        }
        RecyclerView recyclerViewV = v();
        if (recyclerViewV != null) {
            recyclerViewV.setAdapter(u());
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
        RecyclerView recyclerViewV2 = v();
        if (recyclerViewV2 != null) {
            recyclerViewV2.setLayoutManager(linearLayoutManager);
        }
        C1548f c1548f = new C1548f(CommonViewExtKt.colorInt(b.ppColorDividerLine, requireContext()), 1);
        c1548f.f31336e = false;
        RecyclerView recyclerViewV3 = v();
        if (recyclerViewV3 != null) {
            recyclerViewV3.addItemDecoration(c1548f);
        }
        u().setOnItemChildClickListener(new c0(6, this, linearLayoutManager));
        u().setOnItemClickListener(new Dg.a(this, 5));
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
        super.onResume();
        TransferToBankHomeViewModel transferToBankHomeViewModel = (TransferToBankHomeViewModel) this.f27333i;
        if (transferToBankHomeViewModel != null) {
            transferToBankHomeViewModel.g();
        }
    }

    public final void t(String str) {
        n0.g().k(new ClickEvent("to_bank_all_beneficiaries_page_element_click").add("module_name", this.f33739L).add("element_name", str));
    }

    public final x u() {
        return (x) this.f33736B.getValue();
    }

    public final RecyclerView v() {
        return (RecyclerView) this.f33742p.getValue();
    }

    public final void w(RecipientListResp.RecipientBean recipientBean) {
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
            TransferToBankInputAmountActivity.a.startAct$default(aVar, contextRequireContext, recipientBean.getRecipientAccountNumber(), bankInfo, recipientBean.getRecipientNickname(), this.f33735A, null, 32, null);
        }
    }
}
