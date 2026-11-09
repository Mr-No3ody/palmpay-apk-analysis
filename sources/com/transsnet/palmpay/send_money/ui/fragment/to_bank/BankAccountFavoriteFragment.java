package com.transsnet.palmpay.send_money.ui.fragment.to_bank;

import Ad.c0;
import C9.C0139f;
import C9.C0144k;
import Ce.ViewOnClickListenerC0159a;
import Dg.a;
import Ed.C0231k;
import Kd.C0372e1;
import L6.b;
import N8.q0;
import Wf.AbstractC0780y;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.req.CommonListReq;
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
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountFavoriteFragment;
import com.transsnet.palmpay.send_money.viewmodel.TransferToBankHomeViewModel;
import com.transsnet.palmpay.util.NetworkUtils;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/fragment/to_bank/BankAccountFavoriteFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/send_money/viewmodel/TransferToBankHomeViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/send_money/bean/event/AddRecipientEvent;", "event", "", "onAddRecipientMessage", "(Lcom/transsnet/palmpay/send_money/bean/event/AddRecipientEvent;)V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBankAccountFavoriteFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BankAccountFavoriteFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/to_bank/BankAccountFavoriteFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,396:1\n115#2,8:397\n145#2:405\n171#2,12:406\n215#2:418\n171#2,12:419\n215#2:431\n*S KotlinDebug\n*F\n+ 1 BankAccountFavoriteFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/to_bank/BankAccountFavoriteFragment\n*L\n155#1:397,8\n155#1:405\n183#1:406,12\n183#1:418\n262#1:419,12\n262#1:431\n*E\n"})
public final class BankAccountFavoriteFragment extends BaseMvvmFragment<TransferToBankHomeViewModel> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f33745j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f33746o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f33747p = "COMMON";
    public final t t;

    public BankAccountFavoriteFragment() {
        final int i7 = 0;
        this.f33745j = C2131j.b(new Function0(this) { // from class: Ed.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountFavoriteFragment f2377b;

            {
                this.f2377b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        View view = this.f2377b.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(p159kd.e.recyclerView);
                        }
                        return null;
                    default:
                        return new p173ld.x(0, CommonViewExtKt.getDp(4.0f), 26, this.f2377b.m());
                }
            }
        });
        final int i10 = 1;
        this.t = C2131j.b(new Function0(this) { // from class: Ed.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountFavoriteFragment f2377b;

            {
                this.f2377b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        View view = this.f2377b.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(p159kd.e.recyclerView);
                        }
                        return null;
                    default:
                        return new p173ld.x(0, CommonViewExtKt.getDp(4.0f), 26, this.f2377b.m());
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
            lVar.e(this, new C0144k(new C0139f(this, 6), 18));
        }
        TransferToBankHomeViewModel transferToBankHomeViewModel2 = (TransferToBankHomeViewModel) this.f27333i;
        final int i7 = 0;
        n.B(this, transferToBankHomeViewModel2 != null ? transferToBankHomeViewModel2.f34049g : null, this, new Function2(this) { // from class: Ed.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountFavoriteFragment f2373b;

            {
                this.f2373b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                RecipientMemberLogOutResp recipientMemberLogOutResp;
                switch (i7) {
                    case 0:
                        CommonResult resp = (CommonResult) obj2;
                        Intrinsics.checkNotNullParameter(resp, "resp");
                        boolean zIsSuccess = resp.isSuccess();
                        BankAccountFavoriteFragment bankAccountFavoriteFragment = this.f2373b;
                        if (zIsSuccess) {
                            p220oa.h.y(bankAccountFavoriteFragment, "Successfully remove from Favorites");
                            org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(2));
                        } else {
                            p220oa.h.y(bankAccountFavoriteFragment, resp.getRespMsg());
                        }
                        break;
                    case 1:
                        RecipientListResp.RecipientBean recipientBean = (RecipientListResp.RecipientBean) obj;
                        CommonBeanResult resp2 = (CommonBeanResult) obj2;
                        Intrinsics.checkNotNullParameter(resp2, "resp");
                        boolean zIsSuccess2 = resp2.isSuccess();
                        BankAccountFavoriteFragment bankAccountFavoriteFragment2 = this.f2373b;
                        if (zIsSuccess2) {
                            BankAccountMemberInfoResp bankAccountMemberInfoResp = (BankAccountMemberInfoResp) resp2.data;
                            if (bankAccountMemberInfoResp != null) {
                                if (bankAccountMemberInfoResp.accountType == BankAccountMemberInfoResp.ACCOUNT_TYPE_OTHER) {
                                    bankAccountFavoriteFragment2.u(recipientBean);
                                } else {
                                    Context contextRequireContext = bankAccountFavoriteFragment2.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                    new FasterSendToPalmPayAccountDialog(contextRequireContext).setData(bankAccountMemberInfoResp).setOnButtonClickListener(new C0232l(bankAccountFavoriteFragment2, recipientBean, bankAccountMemberInfoResp)).show();
                                }
                            }
                        } else {
                            p220oa.h.y(bankAccountFavoriteFragment2, resp2.getRespMsg());
                        }
                        break;
                    default:
                        RecipientListResp.RecipientBean recipientBean2 = (RecipientListResp.RecipientBean) obj;
                        CommonBeanResult resp3 = (CommonBeanResult) obj2;
                        Intrinsics.checkNotNullParameter(resp3, "resp");
                        if (resp3.isSuccess() && (recipientMemberLogOutResp = (RecipientMemberLogOutResp) resp3.data) != null) {
                            Integer accountStatus = recipientMemberLogOutResp.getAccountStatus();
                            if (accountStatus != null && accountStatus.intValue() == 1) {
                                BankAccountFavoriteFragment bankAccountFavoriteFragment3 = this.f2373b;
                                Context contextRequireContext2 = bankAccountFavoriteFragment3.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                                AccountUnavailableDialog accountUnavailableDialog = new AccountUnavailableDialog(contextRequireContext2);
                                accountUnavailableDialog.show();
                                accountUnavailableDialog.setDialogInfo(recipientMemberLogOutResp);
                                accountUnavailableDialog.setData(recipientBean2);
                                accountUnavailableDialog.setListener(new c0(10, bankAccountFavoriteFragment3, recipientBean2));
                            } else {
                                ARouter.getInstance().build("/sm/palmpay_personal_transfer").withString("MEMBER_ID", recipientBean2 != null ? recipientBean2.payeeMemberId : null).withInt("extra_type", 2).withBoolean("existRecipient", true).withString("core_order_source_type", "2BANK2PALMPAY_5").navigation();
                            }
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new Function1(this) { // from class: Ed.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountFavoriteFragment f2375b;

            {
                this.f2375b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String it = (String) obj;
                switch (i7) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        p220oa.h.y(this.f2375b, it);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        p220oa.h.y(this.f2375b, it);
                        break;
                }
                return Unit.f38893a;
            }
        }, false, null, 240);
        TransferToBankHomeViewModel transferToBankHomeViewModel3 = (TransferToBankHomeViewModel) this.f27333i;
        l lVar2 = transferToBankHomeViewModel3 != null ? transferToBankHomeViewModel3.f34050i : null;
        if (lVar2 != null) {
            lVar2.e(this, new C0144k(new C0231k(this, this, 0), 18));
        }
        TransferToBankHomeViewModel transferToBankHomeViewModel4 = (TransferToBankHomeViewModel) this.f27333i;
        final int i10 = 1;
        n.B(this, transferToBankHomeViewModel4 != null ? transferToBankHomeViewModel4.f34052o : null, this, new Function2(this) { // from class: Ed.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountFavoriteFragment f2373b;

            {
                this.f2373b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                RecipientMemberLogOutResp recipientMemberLogOutResp;
                switch (i10) {
                    case 0:
                        CommonResult resp = (CommonResult) obj2;
                        Intrinsics.checkNotNullParameter(resp, "resp");
                        boolean zIsSuccess = resp.isSuccess();
                        BankAccountFavoriteFragment bankAccountFavoriteFragment = this.f2373b;
                        if (zIsSuccess) {
                            p220oa.h.y(bankAccountFavoriteFragment, "Successfully remove from Favorites");
                            org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(2));
                        } else {
                            p220oa.h.y(bankAccountFavoriteFragment, resp.getRespMsg());
                        }
                        break;
                    case 1:
                        RecipientListResp.RecipientBean recipientBean = (RecipientListResp.RecipientBean) obj;
                        CommonBeanResult resp2 = (CommonBeanResult) obj2;
                        Intrinsics.checkNotNullParameter(resp2, "resp");
                        boolean zIsSuccess2 = resp2.isSuccess();
                        BankAccountFavoriteFragment bankAccountFavoriteFragment2 = this.f2373b;
                        if (zIsSuccess2) {
                            BankAccountMemberInfoResp bankAccountMemberInfoResp = (BankAccountMemberInfoResp) resp2.data;
                            if (bankAccountMemberInfoResp != null) {
                                if (bankAccountMemberInfoResp.accountType == BankAccountMemberInfoResp.ACCOUNT_TYPE_OTHER) {
                                    bankAccountFavoriteFragment2.u(recipientBean);
                                } else {
                                    Context contextRequireContext = bankAccountFavoriteFragment2.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                    new FasterSendToPalmPayAccountDialog(contextRequireContext).setData(bankAccountMemberInfoResp).setOnButtonClickListener(new C0232l(bankAccountFavoriteFragment2, recipientBean, bankAccountMemberInfoResp)).show();
                                }
                            }
                        } else {
                            p220oa.h.y(bankAccountFavoriteFragment2, resp2.getRespMsg());
                        }
                        break;
                    default:
                        RecipientListResp.RecipientBean recipientBean2 = (RecipientListResp.RecipientBean) obj;
                        CommonBeanResult resp3 = (CommonBeanResult) obj2;
                        Intrinsics.checkNotNullParameter(resp3, "resp");
                        if (resp3.isSuccess() && (recipientMemberLogOutResp = (RecipientMemberLogOutResp) resp3.data) != null) {
                            Integer accountStatus = recipientMemberLogOutResp.getAccountStatus();
                            if (accountStatus != null && accountStatus.intValue() == 1) {
                                BankAccountFavoriteFragment bankAccountFavoriteFragment3 = this.f2373b;
                                Context contextRequireContext2 = bankAccountFavoriteFragment3.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                                AccountUnavailableDialog accountUnavailableDialog = new AccountUnavailableDialog(contextRequireContext2);
                                accountUnavailableDialog.show();
                                accountUnavailableDialog.setDialogInfo(recipientMemberLogOutResp);
                                accountUnavailableDialog.setData(recipientBean2);
                                accountUnavailableDialog.setListener(new c0(10, bankAccountFavoriteFragment3, recipientBean2));
                            } else {
                                ARouter.getInstance().build("/sm/palmpay_personal_transfer").withString("MEMBER_ID", recipientBean2 != null ? recipientBean2.payeeMemberId : null).withInt("extra_type", 2).withBoolean("existRecipient", true).withString("core_order_source_type", "2BANK2PALMPAY_5").navigation();
                            }
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new Function1(this) { // from class: Ed.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountFavoriteFragment f2375b;

            {
                this.f2375b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String it = (String) obj;
                switch (i10) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        p220oa.h.y(this.f2375b, it);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        p220oa.h.y(this.f2375b, it);
                        break;
                }
                return Unit.f38893a;
            }
        }, false, null, 240);
        TransferToBankHomeViewModel transferToBankHomeViewModel5 = (TransferToBankHomeViewModel) this.f27333i;
        final int i11 = 2;
        n.B(this, transferToBankHomeViewModel5 != null ? transferToBankHomeViewModel5.t : null, this, new Function2(this) { // from class: Ed.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountFavoriteFragment f2373b;

            {
                this.f2373b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                RecipientMemberLogOutResp recipientMemberLogOutResp;
                switch (i11) {
                    case 0:
                        CommonResult resp = (CommonResult) obj2;
                        Intrinsics.checkNotNullParameter(resp, "resp");
                        boolean zIsSuccess = resp.isSuccess();
                        BankAccountFavoriteFragment bankAccountFavoriteFragment = this.f2373b;
                        if (zIsSuccess) {
                            p220oa.h.y(bankAccountFavoriteFragment, "Successfully remove from Favorites");
                            org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(2));
                        } else {
                            p220oa.h.y(bankAccountFavoriteFragment, resp.getRespMsg());
                        }
                        break;
                    case 1:
                        RecipientListResp.RecipientBean recipientBean = (RecipientListResp.RecipientBean) obj;
                        CommonBeanResult resp2 = (CommonBeanResult) obj2;
                        Intrinsics.checkNotNullParameter(resp2, "resp");
                        boolean zIsSuccess2 = resp2.isSuccess();
                        BankAccountFavoriteFragment bankAccountFavoriteFragment2 = this.f2373b;
                        if (zIsSuccess2) {
                            BankAccountMemberInfoResp bankAccountMemberInfoResp = (BankAccountMemberInfoResp) resp2.data;
                            if (bankAccountMemberInfoResp != null) {
                                if (bankAccountMemberInfoResp.accountType == BankAccountMemberInfoResp.ACCOUNT_TYPE_OTHER) {
                                    bankAccountFavoriteFragment2.u(recipientBean);
                                } else {
                                    Context contextRequireContext = bankAccountFavoriteFragment2.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                    new FasterSendToPalmPayAccountDialog(contextRequireContext).setData(bankAccountMemberInfoResp).setOnButtonClickListener(new C0232l(bankAccountFavoriteFragment2, recipientBean, bankAccountMemberInfoResp)).show();
                                }
                            }
                        } else {
                            p220oa.h.y(bankAccountFavoriteFragment2, resp2.getRespMsg());
                        }
                        break;
                    default:
                        RecipientListResp.RecipientBean recipientBean2 = (RecipientListResp.RecipientBean) obj;
                        CommonBeanResult resp3 = (CommonBeanResult) obj2;
                        Intrinsics.checkNotNullParameter(resp3, "resp");
                        if (resp3.isSuccess() && (recipientMemberLogOutResp = (RecipientMemberLogOutResp) resp3.data) != null) {
                            Integer accountStatus = recipientMemberLogOutResp.getAccountStatus();
                            if (accountStatus != null && accountStatus.intValue() == 1) {
                                BankAccountFavoriteFragment bankAccountFavoriteFragment3 = this.f2373b;
                                Context contextRequireContext2 = bankAccountFavoriteFragment3.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                                AccountUnavailableDialog accountUnavailableDialog = new AccountUnavailableDialog(contextRequireContext2);
                                accountUnavailableDialog.show();
                                accountUnavailableDialog.setDialogInfo(recipientMemberLogOutResp);
                                accountUnavailableDialog.setData(recipientBean2);
                                accountUnavailableDialog.setListener(new c0(10, bankAccountFavoriteFragment3, recipientBean2));
                            } else {
                                ARouter.getInstance().build("/sm/palmpay_personal_transfer").withString("MEMBER_ID", recipientBean2 != null ? recipientBean2.payeeMemberId : null).withInt("extra_type", 2).withBoolean("existRecipient", true).withString("core_order_source_type", "2BANK2PALMPAY_5").navigation();
                            }
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
        lVar3.e(this, new C0144k(new C0231k(this, this, 1), 18));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        String str;
        super.o();
        c.b().j(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f33746o = arguments.getBoolean("extra_data", false);
            String string = arguments.getString("core_order_source_type", "COMMON");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            this.f33747p = string;
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
        View viewInflate = getLayoutInflater().inflate(f.sm_layout_to_palmpay_empty_view_168, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(e.iv_empty_icon);
        TextView textView = (TextView) viewInflate.findViewById(e.tv_empty_title);
        TextView textView2 = (TextView) viewInflate.findViewById(e.tv_empty_tip);
        PpButton ppButton = (PpButton) viewInflate.findViewById(e.tv_empty_btn);
        Intrinsics.e(ppButton);
        p220oa.h.C(ppButton);
        ppButton.setText("Add Now");
        ppButton.setOnClickListener(new ViewOnClickListenerC0159a(this, 8));
        imageView.setImageResource(i7);
        textView.setText(string2);
        textView2.setText(str);
        t().setEmptyView(viewInflate);
        t tVar = this.f33745j;
        RecyclerView recyclerView = (RecyclerView) tVar.getValue();
        if (recyclerView != null) {
            recyclerView.setAdapter(t());
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
        RecyclerView recyclerView2 = (RecyclerView) tVar.getValue();
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(linearLayoutManager);
        }
        C1548f c1548f = new C1548f(CommonViewExtKt.colorInt(b.ppColorDividerLine, requireContext()), 1);
        RecyclerView recyclerView3 = (RecyclerView) tVar.getValue();
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(c1548f);
        }
        t().setOnItemChildClickListener(new c0(9, this, linearLayoutManager));
        t().setOnItemClickListener(new a(this, 7));
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
            CommonListReq commonListReq = new CommonListReq();
            commonListReq.pageNum = 200;
            commonListReq.pageSize = 1;
            AbstractC0780y.m(V.h(transferToBankHomeViewModel), null, null, new C0372e1(transferToBankHomeViewModel.f34048f, q0.y(p367ya.a.d().i(), "_queryBeneficiaryFavoriteList_", BaseApplication.getCountryLocale()), null, commonListReq), 3);
        }
    }

    public final x t() {
        return (x) this.t.getValue();
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
            TransferToBankInputAmountActivity.a.startAct$default(aVar, contextRequireContext, recipientBean.getRecipientAccountNumber(), bankInfo, recipientBean.getRecipientNickname(), this.f33747p, null, 32, null);
        }
    }
}
