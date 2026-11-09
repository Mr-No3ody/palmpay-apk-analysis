package com.transsnet.palmpay.send_money.ui.fragment.to_bank;

import Aa.a;
import C9.C0139f;
import C9.C0144k;
import C9.Q;
import Ed.b0;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.message.VoucherOperationMsg;
import com.transsnet.palmpay.custom_view.PpSwipeRefreshLayout;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.send_money.bean.event.AddRecipientEvent;
import com.transsnet.palmpay.send_money.bean.event.TransactionEvent;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomePalmPayContactsFragment;
import com.transsnet.palmpay.send_money.viewmodel.TransferToPalmPayHomeViewModel;
import com.transsnet.palmpay.util.NetworkUtils;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.chromium.support_lib_boundary.util.b;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159kd.e;
import p159kd.f;
import p159kd.h;
import p173ld.B;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/fragment/to_bank/TransferToBankHomePalmPayContactsFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/send_money/viewmodel/TransferToPalmPayHomeViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/send_money/bean/event/AddRecipientEvent;", "event", "", "onAddRecipientMessage", "(Lcom/transsnet/palmpay/send_money/bean/event/AddRecipientEvent;)V", "Lcom/transsnet/palmpay/send_money/bean/event/TransactionEvent;", "onTransactionMessage", "(Lcom/transsnet/palmpay/send_money/bean/event/TransactionEvent;)V", "Lcom/transsnet/palmpay/core/message/VoucherOperationMsg;", "msg", "onTransferResultMessage", "(Lcom/transsnet/palmpay/core/message/VoucherOperationMsg;)V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferToBankHomePalmPayContactsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferToBankHomePalmPayContactsFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/to_bank/TransferToBankHomePalmPayContactsFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,236:1\n1#2:237\n152#3:238\n169#3:239\n171#3,12:240\n215#3:252\n*S KotlinDebug\n*F\n+ 1 TransferToBankHomePalmPayContactsFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/to_bank/TransferToBankHomePalmPayContactsFragment\n*L\n122#1:238\n122#1:239\n170#1:240,12\n170#1:252\n*E\n"})
public final class TransferToBankHomePalmPayContactsFragment extends BaseMvvmFragment<TransferToPalmPayHomeViewModel> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f33782j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f33783o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f33784p;
    public String t = "COMMON";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f33785v = C2131j.b(new a(25));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f33786w = true;

    public TransferToBankHomePalmPayContactsFragment() {
        final int i7 = 0;
        this.f33782j = C2131j.b(new Function0(this) { // from class: Ed.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBankHomePalmPayContactsFragment f2357b;

            {
                this.f2357b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        View view = this.f2357b.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(p159kd.e.recyclerView);
                        }
                        return null;
                    case 1:
                        View view2 = this.f2357b.f27318b;
                        if (view2 != null) {
                            return (PpSwipeRefreshLayout) view2.findViewById(p159kd.e.swipeRefreshLayout);
                        }
                        return null;
                    default:
                        View view3 = this.f2357b.f27318b;
                        if (view3 != null) {
                            return (SingleAdView) view3.findViewById(p159kd.e.ad_recently);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f33783o = C2131j.b(new Function0(this) { // from class: Ed.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBankHomePalmPayContactsFragment f2357b;

            {
                this.f2357b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        View view = this.f2357b.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(p159kd.e.recyclerView);
                        }
                        return null;
                    case 1:
                        View view2 = this.f2357b.f27318b;
                        if (view2 != null) {
                            return (PpSwipeRefreshLayout) view2.findViewById(p159kd.e.swipeRefreshLayout);
                        }
                        return null;
                    default:
                        View view3 = this.f2357b.f27318b;
                        if (view3 != null) {
                            return (SingleAdView) view3.findViewById(p159kd.e.ad_recently);
                        }
                        return null;
                }
            }
        });
        final int i11 = 2;
        this.f33784p = C2131j.b(new Function0(this) { // from class: Ed.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBankHomePalmPayContactsFragment f2357b;

            {
                this.f2357b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        View view = this.f2357b.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(p159kd.e.recyclerView);
                        }
                        return null;
                    case 1:
                        View view2 = this.f2357b.f27318b;
                        if (view2 != null) {
                            return (PpSwipeRefreshLayout) view2.findViewById(p159kd.e.swipeRefreshLayout);
                        }
                        return null;
                    default:
                        View view3 = this.f2357b.f27318b;
                        if (view3 != null) {
                            return (SingleAdView) view3.findViewById(p159kd.e.ad_recently);
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.sm_fragment_transfer_to_palmpay_home_recently;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel = (TransferToPalmPayHomeViewModel) this.f27333i;
        l lVar = transferToPalmPayHomeViewModel != null ? transferToPalmPayHomeViewModel.f34079f : null;
        if (lVar != null) {
            lVar.e(this, new C0144k(new C0139f(this, 10), 24));
        }
        TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel2 = (TransferToPalmPayHomeViewModel) this.f27333i;
        n.B(this, transferToPalmPayHomeViewModel2 != null ? transferToPalmPayHomeViewModel2.f34084p : null, this, new Ba.a(this, 5), null, false, null, 248);
        TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel3 = (TransferToPalmPayHomeViewModel) this.f27333i;
        l lVar2 = transferToPalmPayHomeViewModel3 != null ? transferToPalmPayHomeViewModel3.f34083o : null;
        if (lVar2 == null) {
            return 0;
        }
        lVar2.e(this, new C0144k(new Q(9, this, this), 24));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
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
        t tVar = this.f33782j;
        RecyclerView recyclerView = (RecyclerView) tVar.getValue();
        if (recyclerView != null) {
            recyclerView.setAdapter(t());
        }
        RecyclerView recyclerView2 = (RecyclerView) tVar.getValue();
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext()));
        }
        t().setOnItemClickListener(new b0(this));
        t().setOnItemChildClickListener(new b0(this));
        t tVar2 = this.f33784p;
        SingleAdView singleAdView = (SingleAdView) tVar2.getValue();
        if (singleAdView != null) {
            singleAdView.setSlotId(getString(h.sm_transfer_to_bank_palmpay_contact_slot_id));
        }
        b.d((SingleAdView) tVar2.getValue(), Boolean.TRUE);
        PpSwipeRefreshLayout ppSwipeRefreshLayoutU = u();
        if (ppSwipeRefreshLayoutU != null) {
            ppSwipeRefreshLayoutU.setOnRefreshListener(new b0(this));
        }
        PpSwipeRefreshLayout ppSwipeRefreshLayoutU2 = u();
        if (ppSwipeRefreshLayoutU2 != null) {
            ppSwipeRefreshLayoutU2.setColorSchemeResources(L6.b.ppColorPrimary);
        }
        PpSwipeRefreshLayout ppSwipeRefreshLayoutU3 = u();
        if (ppSwipeRefreshLayoutU3 == null) {
            return 0;
        }
        ppSwipeRefreshLayoutU3.setRefreshing(true);
        return 0;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onAddRecipientMessage(@NotNull AddRecipientEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getRecipientType() == 1) {
            v();
        } else if (event.getRecipientType() == 2) {
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
        if (this.f33786w) {
            return;
        }
        v();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onTransactionMessage(@Nullable TransactionEvent event) {
        v();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onTransferResultMessage(@Nullable VoucherOperationMsg msg) {
        v();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z3) {
        super.setUserVisibleHint(z3);
        if (z3 && this.f33786w) {
            this.f33786w = false;
            v();
        }
    }

    public final B t() {
        return (B) this.f33785v.getValue();
    }

    public final PpSwipeRefreshLayout u() {
        return (PpSwipeRefreshLayout) this.f33783o.getValue();
    }

    public final void v() {
        if (NetworkUtils.isConnected()) {
            TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel = (TransferToPalmPayHomeViewModel) this.f27333i;
            if (transferToPalmPayHomeViewModel != null) {
                transferToPalmPayHomeViewModel.f(2);
                return;
            }
            return;
        }
        w();
        PpSwipeRefreshLayout ppSwipeRefreshLayoutU = u();
        if (ppSwipeRefreshLayoutU != null) {
            ppSwipeRefreshLayoutU.setRefreshing(false);
        }
    }

    public final void w() {
        String str;
        String string = getString(h.sm_no_beneficiaries_yet);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        int i7 = r.cv_empty_no_palmpay_contacts;
        if (NetworkUtils.isConnected()) {
            str = "Beneficiaries will be added automatically if the transfer is successful";
        } else {
            i7 = r.cv_empty_no_network;
            string = "No Network Connection";
            str = "Please check your network settings or refresh";
        }
        View viewInflate = getLayoutInflater().inflate(f.sm_layout_to_palmpay_empty_view_68, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(e.iv_empty_icon);
        TextView textView = (TextView) viewInflate.findViewById(e.tv_empty_title);
        TextView textView2 = (TextView) viewInflate.findViewById(e.tv_empty_tip);
        imageView.setImageResource(i7);
        textView.setText(string);
        textView2.setText(str);
        ((LinearLayout) viewInflate.findViewById(e.ll_empty_content)).setBackgroundResource(r.cv_rect_corner_bl_br_12_bg_white);
        t().setEmptyView(viewInflate);
    }
}
