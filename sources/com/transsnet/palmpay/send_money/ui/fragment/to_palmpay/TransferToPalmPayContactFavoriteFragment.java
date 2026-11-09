package com.transsnet.palmpay.send_money.ui.fragment.to_palmpay;

import Aa.a;
import Ab.B;
import Ab.i;
import Ad.c0;
import C0.G;
import C9.C0139f;
import C9.C0144k;
import C9.Q;
import Ce.ViewOnClickListenerC0159a;
import Kd.P1;
import L6.b;
import N8.q0;
import Pa.r0;
import Wf.AbstractC0780y;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.req.CommonListReq;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.CompatStateEditText;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.RecipientBeanV2;
import com.transsnet.palmpay.send_money.bean.event.AddRecipientEvent;
import com.transsnet.palmpay.send_money.bean.resp.RecipientMemberLogOutResp;
import com.transsnet.palmpay.send_money.ui.dialog.AccountUnavailableDialog;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactFavoriteFragment;
import com.transsnet.palmpay.send_money.viewmodel.TransferToPalmPayContactViewModel;
import com.transsnet.palmpay.util.NetworkUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.fastkv.n;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Pair;
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
import p173ld.z;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/fragment/to_palmpay/TransferToPalmPayContactFavoriteFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/send_money/viewmodel/TransferToPalmPayContactViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/send_money/bean/event/AddRecipientEvent;", "event", "", "onAddRecipientMessage", "(Lcom/transsnet/palmpay/send_money/bean/event/AddRecipientEvent;)V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferToPalmPayContactFavoriteFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferToPalmPayContactFavoriteFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/to_palmpay/TransferToPalmPayContactFavoriteFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,389:1\n1#2:390\n115#3,8:391\n145#3:399\n171#3,12:400\n215#3:412\n*S KotlinDebug\n*F\n+ 1 TransferToPalmPayContactFavoriteFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/to_palmpay/TransferToPalmPayContactFavoriteFragment\n*L\n156#1:391,8\n156#1:399\n236#1:400,12\n236#1:412\n*E\n"})
public final class TransferToPalmPayContactFavoriteFragment extends BaseMvvmFragment<TransferToPalmPayContactViewModel> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f33805j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f33806o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f33807p;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f33808v;
    public String t = "COMMON";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f33809w = C2131j.b(new a(29));

    public TransferToPalmPayContactFavoriteFragment() {
        final int i7 = 1;
        this.f33805j = C2131j.b(new Function0(this) { // from class: Fd.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayContactFavoriteFragment f2694b;

            {
                this.f2694b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return new p173ld.z(this.f2694b.m());
                    case 1:
                        View view = this.f2694b.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(p159kd.e.recyclerView);
                        }
                        return null;
                    case 2:
                        View view2 = this.f2694b.f27318b;
                        if (view2 != null) {
                            return (CompatStateEditText) view2.findViewById(p159kd.e.search_et);
                        }
                        return null;
                    default:
                        View view3 = this.f2694b.f27318b;
                        if (view3 != null) {
                            return view3.findViewById(p159kd.e.search_view);
                        }
                        return null;
                }
            }
        });
        final int i10 = 2;
        this.f33806o = C2131j.b(new Function0(this) { // from class: Fd.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayContactFavoriteFragment f2694b;

            {
                this.f2694b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return new p173ld.z(this.f2694b.m());
                    case 1:
                        View view = this.f2694b.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(p159kd.e.recyclerView);
                        }
                        return null;
                    case 2:
                        View view2 = this.f2694b.f27318b;
                        if (view2 != null) {
                            return (CompatStateEditText) view2.findViewById(p159kd.e.search_et);
                        }
                        return null;
                    default:
                        View view3 = this.f2694b.f27318b;
                        if (view3 != null) {
                            return view3.findViewById(p159kd.e.search_view);
                        }
                        return null;
                }
            }
        });
        final int i11 = 3;
        this.f33807p = C2131j.b(new Function0(this) { // from class: Fd.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayContactFavoriteFragment f2694b;

            {
                this.f2694b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return new p173ld.z(this.f2694b.m());
                    case 1:
                        View view = this.f2694b.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(p159kd.e.recyclerView);
                        }
                        return null;
                    case 2:
                        View view2 = this.f2694b.f27318b;
                        if (view2 != null) {
                            return (CompatStateEditText) view2.findViewById(p159kd.e.search_et);
                        }
                        return null;
                    default:
                        View view3 = this.f2694b.f27318b;
                        if (view3 != null) {
                            return view3.findViewById(p159kd.e.search_view);
                        }
                        return null;
                }
            }
        });
        final int i12 = 0;
        this.f33808v = C2131j.b(new Function0(this) { // from class: Fd.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayContactFavoriteFragment f2694b;

            {
                this.f2694b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return new p173ld.z(this.f2694b.m());
                    case 1:
                        View view = this.f2694b.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(p159kd.e.recyclerView);
                        }
                        return null;
                    case 2:
                        View view2 = this.f2694b.f27318b;
                        if (view2 != null) {
                            return (CompatStateEditText) view2.findViewById(p159kd.e.search_et);
                        }
                        return null;
                    default:
                        View view3 = this.f2694b.f27318b;
                        if (view3 != null) {
                            return view3.findViewById(p159kd.e.search_view);
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.sm_fragment_transfer_to_palmpay_contact_favorite;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        TransferToPalmPayContactViewModel transferToPalmPayContactViewModel = (TransferToPalmPayContactViewModel) this.f27333i;
        l lVar = transferToPalmPayContactViewModel != null ? transferToPalmPayContactViewModel.f34073f : null;
        if (lVar != null) {
            lVar.e(this, new C0144k(new C0139f(this, 12), 27));
        }
        TransferToPalmPayContactViewModel transferToPalmPayContactViewModel2 = (TransferToPalmPayContactViewModel) this.f27333i;
        final int i7 = 0;
        n.B(this, transferToPalmPayContactViewModel2 != null ? transferToPalmPayContactViewModel2.f34074g : null, this, new Function2(this) { // from class: Fd.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayContactFavoriteFragment f2696b;

            {
                this.f2696b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                RecipientMemberLogOutResp recipientMemberLogOutResp;
                switch (i7) {
                    case 0:
                        CommonResult resp = (CommonResult) obj2;
                        Intrinsics.checkNotNullParameter(resp, "resp");
                        if (resp.isSuccess()) {
                            TransferToPalmPayContactFavoriteFragment transferToPalmPayContactFavoriteFragment = this.f2696b;
                            p220oa.h.y(transferToPalmPayContactFavoriteFragment, "Successfully delete beneficiary");
                            transferToPalmPayContactFavoriteFragment.v();
                            org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(1));
                        } else {
                            ToastUtils.showLong(resp.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 1:
                        CommonResult resp2 = (CommonResult) obj2;
                        Intrinsics.checkNotNullParameter(resp2, "resp");
                        if (resp2.isSuccess()) {
                            TransferToPalmPayContactFavoriteFragment transferToPalmPayContactFavoriteFragment2 = this.f2696b;
                            p220oa.h.y(transferToPalmPayContactFavoriteFragment2, "Successfully remove from Favorites");
                            transferToPalmPayContactFavoriteFragment2.v();
                            org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(1));
                        } else {
                            ToastUtils.showLong(resp2.getRespMsg(), new Object[0]);
                        }
                        break;
                    default:
                        RecipientBeanV2 recipientBeanV2 = (RecipientBeanV2) obj;
                        CommonBeanResult resp3 = (CommonBeanResult) obj2;
                        Intrinsics.checkNotNullParameter(resp3, "resp");
                        if (resp3.isSuccess() && (recipientMemberLogOutResp = (RecipientMemberLogOutResp) resp3.data) != null) {
                            Integer accountStatus = recipientMemberLogOutResp.getAccountStatus();
                            TransferToPalmPayContactFavoriteFragment transferToPalmPayContactFavoriteFragment3 = this.f2696b;
                            if (accountStatus != null && accountStatus.intValue() == 1) {
                                Context contextRequireContext = transferToPalmPayContactFavoriteFragment3.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                AccountUnavailableDialog accountUnavailableDialog = new AccountUnavailableDialog(contextRequireContext);
                                accountUnavailableDialog.show();
                                accountUnavailableDialog.setDialogInfo(recipientMemberLogOutResp);
                                accountUnavailableDialog.setData(recipientBeanV2);
                                accountUnavailableDialog.setListener(new c0(16, transferToPalmPayContactFavoriteFragment3, recipientBeanV2));
                            } else if (recipientBeanV2 != null) {
                                String transType = recipientBeanV2.getTransType();
                                Integer businessType = recipientBeanV2.getBusinessType();
                                r0.O0(transType, Integer.valueOf(businessType != null ? businessType.intValue() : 0), recipientBeanV2.getPhone(), p002a.a.e(new Pair("core_order_source_type", transferToPalmPayContactFavoriteFragment3.t), new Pair("MEMBER_ID", recipientBeanV2.getMemberId()), !TextUtils.isEmpty(recipientBeanV2.getPpAccountNo()) ? new Pair("extra_data", recipientBeanV2.getPpAccountNo()) : new Pair("extra_data", null)));
                            }
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new B(18), false, null, 240);
        TransferToPalmPayContactViewModel transferToPalmPayContactViewModel3 = (TransferToPalmPayContactViewModel) this.f27333i;
        final int i10 = 1;
        n.B(this, transferToPalmPayContactViewModel3 != null ? transferToPalmPayContactViewModel3.f34075i : null, this, new Function2(this) { // from class: Fd.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayContactFavoriteFragment f2696b;

            {
                this.f2696b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                RecipientMemberLogOutResp recipientMemberLogOutResp;
                switch (i10) {
                    case 0:
                        CommonResult resp = (CommonResult) obj2;
                        Intrinsics.checkNotNullParameter(resp, "resp");
                        if (resp.isSuccess()) {
                            TransferToPalmPayContactFavoriteFragment transferToPalmPayContactFavoriteFragment = this.f2696b;
                            p220oa.h.y(transferToPalmPayContactFavoriteFragment, "Successfully delete beneficiary");
                            transferToPalmPayContactFavoriteFragment.v();
                            org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(1));
                        } else {
                            ToastUtils.showLong(resp.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 1:
                        CommonResult resp2 = (CommonResult) obj2;
                        Intrinsics.checkNotNullParameter(resp2, "resp");
                        if (resp2.isSuccess()) {
                            TransferToPalmPayContactFavoriteFragment transferToPalmPayContactFavoriteFragment2 = this.f2696b;
                            p220oa.h.y(transferToPalmPayContactFavoriteFragment2, "Successfully remove from Favorites");
                            transferToPalmPayContactFavoriteFragment2.v();
                            org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(1));
                        } else {
                            ToastUtils.showLong(resp2.getRespMsg(), new Object[0]);
                        }
                        break;
                    default:
                        RecipientBeanV2 recipientBeanV2 = (RecipientBeanV2) obj;
                        CommonBeanResult resp3 = (CommonBeanResult) obj2;
                        Intrinsics.checkNotNullParameter(resp3, "resp");
                        if (resp3.isSuccess() && (recipientMemberLogOutResp = (RecipientMemberLogOutResp) resp3.data) != null) {
                            Integer accountStatus = recipientMemberLogOutResp.getAccountStatus();
                            TransferToPalmPayContactFavoriteFragment transferToPalmPayContactFavoriteFragment3 = this.f2696b;
                            if (accountStatus != null && accountStatus.intValue() == 1) {
                                Context contextRequireContext = transferToPalmPayContactFavoriteFragment3.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                AccountUnavailableDialog accountUnavailableDialog = new AccountUnavailableDialog(contextRequireContext);
                                accountUnavailableDialog.show();
                                accountUnavailableDialog.setDialogInfo(recipientMemberLogOutResp);
                                accountUnavailableDialog.setData(recipientBeanV2);
                                accountUnavailableDialog.setListener(new c0(16, transferToPalmPayContactFavoriteFragment3, recipientBeanV2));
                            } else if (recipientBeanV2 != null) {
                                String transType = recipientBeanV2.getTransType();
                                Integer businessType = recipientBeanV2.getBusinessType();
                                r0.O0(transType, Integer.valueOf(businessType != null ? businessType.intValue() : 0), recipientBeanV2.getPhone(), p002a.a.e(new Pair("core_order_source_type", transferToPalmPayContactFavoriteFragment3.t), new Pair("MEMBER_ID", recipientBeanV2.getMemberId()), !TextUtils.isEmpty(recipientBeanV2.getPpAccountNo()) ? new Pair("extra_data", recipientBeanV2.getPpAccountNo()) : new Pair("extra_data", null)));
                            }
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new B(19), false, null, 240);
        TransferToPalmPayContactViewModel transferToPalmPayContactViewModel4 = (TransferToPalmPayContactViewModel) this.f27333i;
        final int i11 = 2;
        n.B(this, transferToPalmPayContactViewModel4 != null ? transferToPalmPayContactViewModel4.f34077o : null, this, new Function2(this) { // from class: Fd.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayContactFavoriteFragment f2696b;

            {
                this.f2696b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                RecipientMemberLogOutResp recipientMemberLogOutResp;
                switch (i11) {
                    case 0:
                        CommonResult resp = (CommonResult) obj2;
                        Intrinsics.checkNotNullParameter(resp, "resp");
                        if (resp.isSuccess()) {
                            TransferToPalmPayContactFavoriteFragment transferToPalmPayContactFavoriteFragment = this.f2696b;
                            p220oa.h.y(transferToPalmPayContactFavoriteFragment, "Successfully delete beneficiary");
                            transferToPalmPayContactFavoriteFragment.v();
                            org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(1));
                        } else {
                            ToastUtils.showLong(resp.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 1:
                        CommonResult resp2 = (CommonResult) obj2;
                        Intrinsics.checkNotNullParameter(resp2, "resp");
                        if (resp2.isSuccess()) {
                            TransferToPalmPayContactFavoriteFragment transferToPalmPayContactFavoriteFragment2 = this.f2696b;
                            p220oa.h.y(transferToPalmPayContactFavoriteFragment2, "Successfully remove from Favorites");
                            transferToPalmPayContactFavoriteFragment2.v();
                            org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(1));
                        } else {
                            ToastUtils.showLong(resp2.getRespMsg(), new Object[0]);
                        }
                        break;
                    default:
                        RecipientBeanV2 recipientBeanV2 = (RecipientBeanV2) obj;
                        CommonBeanResult resp3 = (CommonBeanResult) obj2;
                        Intrinsics.checkNotNullParameter(resp3, "resp");
                        if (resp3.isSuccess() && (recipientMemberLogOutResp = (RecipientMemberLogOutResp) resp3.data) != null) {
                            Integer accountStatus = recipientMemberLogOutResp.getAccountStatus();
                            TransferToPalmPayContactFavoriteFragment transferToPalmPayContactFavoriteFragment3 = this.f2696b;
                            if (accountStatus != null && accountStatus.intValue() == 1) {
                                Context contextRequireContext = transferToPalmPayContactFavoriteFragment3.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                AccountUnavailableDialog accountUnavailableDialog = new AccountUnavailableDialog(contextRequireContext);
                                accountUnavailableDialog.show();
                                accountUnavailableDialog.setDialogInfo(recipientMemberLogOutResp);
                                accountUnavailableDialog.setData(recipientBeanV2);
                                accountUnavailableDialog.setListener(new c0(16, transferToPalmPayContactFavoriteFragment3, recipientBeanV2));
                            } else if (recipientBeanV2 != null) {
                                String transType = recipientBeanV2.getTransType();
                                Integer businessType = recipientBeanV2.getBusinessType();
                                r0.O0(transType, Integer.valueOf(businessType != null ? businessType.intValue() : 0), recipientBeanV2.getPhone(), p002a.a.e(new Pair("core_order_source_type", transferToPalmPayContactFavoriteFragment3.t), new Pair("MEMBER_ID", recipientBeanV2.getMemberId()), !TextUtils.isEmpty(recipientBeanV2.getPpAccountNo()) ? new Pair("extra_data", recipientBeanV2.getPpAccountNo()) : new Pair("extra_data", null)));
                            }
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, null, false, null, 248);
        TransferToPalmPayContactViewModel transferToPalmPayContactViewModel5 = (TransferToPalmPayContactViewModel) this.f27333i;
        l lVar2 = transferToPalmPayContactViewModel5 != null ? transferToPalmPayContactViewModel5.f34076j : null;
        if (lVar2 == null) {
            return 0;
        }
        lVar2.e(this, new C0144k(new Q(11, this, this), 27));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        String str;
        String string;
        super.o();
        c.b().j(this);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("core_order_source_type", "")) != null) {
            if (TextUtils.isEmpty(string)) {
                string = null;
            }
            if (string != null) {
                this.t = string;
            }
        }
        t tVar = this.f33806o;
        CompatStateEditText compatStateEditText = (CompatStateEditText) tVar.getValue();
        if (compatStateEditText != null) {
            compatStateEditText.setHint(G.i("").append(getString(h.sm_search_mobile_number_name)).setFontFamily("sans-serif").create());
        }
        View view = (View) this.f33807p.getValue();
        if (view != null) {
            p220oa.h.s(view, !u().isEmpty());
        }
        CompatStateEditText compatStateEditText2 = (CompatStateEditText) tVar.getValue();
        if (compatStateEditText2 != null) {
            compatStateEditText2.addTextChangedListener(new i(this, 11));
        }
        String string2 = getString(h.sm_no_favorite_yet);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        int i7 = r.cv_empty_no_palmpay_contacts;
        if (NetworkUtils.isConnected()) {
            str = "Add your frequent beneficiaries as favorites to enjoy free transfers.";
        } else {
            i7 = r.cv_empty_no_network;
            string2 = "No Network Connection";
            str = "Please check your network settings or refresh";
        }
        View viewInflate = getLayoutInflater().inflate(f.sm_layout_to_palmpay_empty_view_168, (ViewGroup) null);
        viewInflate.setBackgroundColor(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, getContext()));
        ImageView imageView = (ImageView) viewInflate.findViewById(e.iv_empty_icon);
        TextView textView = (TextView) viewInflate.findViewById(e.tv_empty_title);
        TextView textView2 = (TextView) viewInflate.findViewById(e.tv_empty_tip);
        PpButton ppButton = (PpButton) viewInflate.findViewById(e.tv_empty_btn);
        Intrinsics.e(ppButton);
        p220oa.h.C(ppButton);
        ppButton.setText("Add Now");
        ppButton.setOnClickListener(new ViewOnClickListenerC0159a(this, 11));
        imageView.setImageResource(i7);
        textView.setText(string2);
        textView2.setText(str);
        t().setEmptyView(viewInflate);
        t tVar2 = this.f33805j;
        RecyclerView recyclerView = (RecyclerView) tVar2.getValue();
        if (recyclerView != null) {
            recyclerView.setAdapter(t());
        }
        RecyclerView recyclerView2 = (RecyclerView) tVar2.getValue();
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext()));
        }
        C1548f c1548f = new C1548f(CommonViewExtKt.colorInt(b.ppColorDividerLine, requireContext()), 1);
        c1548f.f31336e = false;
        RecyclerView recyclerView3 = (RecyclerView) tVar2.getValue();
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(c1548f);
        }
        t().setOnItemClickListener(new Fd.n(this));
        t().setOnItemChildClickListener(new Fd.n(this));
        return 0;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onAddRecipientMessage(@NotNull AddRecipientEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getRecipientType() == 1) {
            v();
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
        v();
    }

    public final z t() {
        return (z) this.f33808v.getValue();
    }

    public final CopyOnWriteArrayList u() {
        return (CopyOnWriteArrayList) this.f33809w.getValue();
    }

    public final void v() {
        TransferToPalmPayContactViewModel transferToPalmPayContactViewModel = (TransferToPalmPayContactViewModel) this.f27333i;
        if (transferToPalmPayContactViewModel != null) {
            CommonListReq req = new CommonListReq();
            req.pageSize = 200;
            Intrinsics.checkNotNullParameter(req, "req");
            AbstractC0780y.m(V.h(transferToPalmPayContactViewModel), null, null, new P1(transferToPalmPayContactViewModel.f34073f, q0.y(p367ya.a.d().i(), "_queryContactFavorite_", BaseApplication.getCountryLocale()), null, req), 3);
        }
    }
}
