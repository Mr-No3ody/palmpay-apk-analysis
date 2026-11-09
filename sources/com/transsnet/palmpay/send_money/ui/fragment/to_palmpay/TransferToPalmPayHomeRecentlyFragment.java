package com.transsnet.palmpay.send_money.ui.fragment.to_palmpay;

import C9.C0139f;
import C9.Q;
import Fd.F;
import Fd.G;
import L6.b;
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
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.PpSwipeRefreshLayout;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.event.AddRecipientEvent;
import com.transsnet.palmpay.send_money.bean.event.TransactionEvent;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeRecentlyFragment;
import com.transsnet.palmpay.send_money.viewmodel.TransferToPalmPayHomeViewModel;
import com.transsnet.palmpay.util.NetworkUtils;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/fragment/to_palmpay/TransferToPalmPayHomeRecentlyFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/send_money/viewmodel/TransferToPalmPayHomeViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/send_money/bean/event/AddRecipientEvent;", "event", "", "onAddRecipientMessage", "(Lcom/transsnet/palmpay/send_money/bean/event/AddRecipientEvent;)V", "Lcom/transsnet/palmpay/send_money/bean/event/TransactionEvent;", "onTransactionMessage", "(Lcom/transsnet/palmpay/send_money/bean/event/TransactionEvent;)V", "Lcom/transsnet/palmpay/core/message/VoucherOperationMsg;", "msg", "onTransferResultMessage", "(Lcom/transsnet/palmpay/core/message/VoucherOperationMsg;)V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferToPalmPayHomeRecentlyFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferToPalmPayHomeRecentlyFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/to_palmpay/TransferToPalmPayHomeRecentlyFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,256:1\n1#2:257\n152#3:258\n169#3:259\n171#3,12:260\n215#3:272\n*S KotlinDebug\n*F\n+ 1 TransferToPalmPayHomeRecentlyFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/to_palmpay/TransferToPalmPayHomeRecentlyFragment\n*L\n125#1:258\n125#1:259\n181#1:260,12\n181#1:272\n*E\n"})
public final class TransferToPalmPayHomeRecentlyFragment extends BaseMvvmFragment<TransferToPalmPayHomeViewModel> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f33823A = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f33824j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f33825o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f33826p;
    public String t = "COMMON";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Integer f33827v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f33828w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public TransferToPalmPayHomeRecentlyFragment() {
        final int i7 = 0;
        this.f33824j = C2131j.b(new Function0(this) { // from class: Fd.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayHomeRecentlyFragment f2656b;

            {
                this.f2656b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToPalmPayHomeRecentlyFragment transferToPalmPayHomeRecentlyFragment = this.f2656b;
                switch (i7) {
                    case 0:
                        int i10 = TransferToPalmPayHomeRecentlyFragment.f33823A;
                        View view = transferToPalmPayHomeRecentlyFragment.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(p159kd.e.recyclerView);
                        }
                        return null;
                    case 1:
                        int i11 = TransferToPalmPayHomeRecentlyFragment.f33823A;
                        View view2 = transferToPalmPayHomeRecentlyFragment.f27318b;
                        if (view2 != null) {
                            return (PpSwipeRefreshLayout) view2.findViewById(p159kd.e.swipeRefreshLayout);
                        }
                        return null;
                    case 2:
                        int i12 = TransferToPalmPayHomeRecentlyFragment.f33823A;
                        View view3 = transferToPalmPayHomeRecentlyFragment.f27318b;
                        if (view3 != null) {
                            return (SingleAdView) view3.findViewById(p159kd.e.ad_recently);
                        }
                        return null;
                    default:
                        int i13 = TransferToPalmPayHomeRecentlyFragment.f33823A;
                        return new p173ld.B(transferToPalmPayHomeRecentlyFragment.f33827v == null);
                }
            }
        });
        final int i10 = 1;
        this.f33825o = C2131j.b(new Function0(this) { // from class: Fd.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayHomeRecentlyFragment f2656b;

            {
                this.f2656b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToPalmPayHomeRecentlyFragment transferToPalmPayHomeRecentlyFragment = this.f2656b;
                switch (i10) {
                    case 0:
                        int i11 = TransferToPalmPayHomeRecentlyFragment.f33823A;
                        View view = transferToPalmPayHomeRecentlyFragment.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(p159kd.e.recyclerView);
                        }
                        return null;
                    case 1:
                        int i12 = TransferToPalmPayHomeRecentlyFragment.f33823A;
                        View view2 = transferToPalmPayHomeRecentlyFragment.f27318b;
                        if (view2 != null) {
                            return (PpSwipeRefreshLayout) view2.findViewById(p159kd.e.swipeRefreshLayout);
                        }
                        return null;
                    case 2:
                        int i13 = TransferToPalmPayHomeRecentlyFragment.f33823A;
                        View view3 = transferToPalmPayHomeRecentlyFragment.f27318b;
                        if (view3 != null) {
                            return (SingleAdView) view3.findViewById(p159kd.e.ad_recently);
                        }
                        return null;
                    default:
                        int i14 = TransferToPalmPayHomeRecentlyFragment.f33823A;
                        return new p173ld.B(transferToPalmPayHomeRecentlyFragment.f33827v == null);
                }
            }
        });
        final int i11 = 2;
        this.f33826p = C2131j.b(new Function0(this) { // from class: Fd.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayHomeRecentlyFragment f2656b;

            {
                this.f2656b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToPalmPayHomeRecentlyFragment transferToPalmPayHomeRecentlyFragment = this.f2656b;
                switch (i11) {
                    case 0:
                        int i12 = TransferToPalmPayHomeRecentlyFragment.f33823A;
                        View view = transferToPalmPayHomeRecentlyFragment.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(p159kd.e.recyclerView);
                        }
                        return null;
                    case 1:
                        int i13 = TransferToPalmPayHomeRecentlyFragment.f33823A;
                        View view2 = transferToPalmPayHomeRecentlyFragment.f27318b;
                        if (view2 != null) {
                            return (PpSwipeRefreshLayout) view2.findViewById(p159kd.e.swipeRefreshLayout);
                        }
                        return null;
                    case 2:
                        int i14 = TransferToPalmPayHomeRecentlyFragment.f33823A;
                        View view3 = transferToPalmPayHomeRecentlyFragment.f27318b;
                        if (view3 != null) {
                            return (SingleAdView) view3.findViewById(p159kd.e.ad_recently);
                        }
                        return null;
                    default:
                        int i15 = TransferToPalmPayHomeRecentlyFragment.f33823A;
                        return new p173ld.B(transferToPalmPayHomeRecentlyFragment.f33827v == null);
                }
            }
        });
        final int i12 = 3;
        this.f33828w = C2131j.b(new Function0(this) { // from class: Fd.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayHomeRecentlyFragment f2656b;

            {
                this.f2656b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToPalmPayHomeRecentlyFragment transferToPalmPayHomeRecentlyFragment = this.f2656b;
                switch (i12) {
                    case 0:
                        int i13 = TransferToPalmPayHomeRecentlyFragment.f33823A;
                        View view = transferToPalmPayHomeRecentlyFragment.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(p159kd.e.recyclerView);
                        }
                        return null;
                    case 1:
                        int i14 = TransferToPalmPayHomeRecentlyFragment.f33823A;
                        View view2 = transferToPalmPayHomeRecentlyFragment.f27318b;
                        if (view2 != null) {
                            return (PpSwipeRefreshLayout) view2.findViewById(p159kd.e.swipeRefreshLayout);
                        }
                        return null;
                    case 2:
                        int i15 = TransferToPalmPayHomeRecentlyFragment.f33823A;
                        View view3 = transferToPalmPayHomeRecentlyFragment.f27318b;
                        if (view3 != null) {
                            return (SingleAdView) view3.findViewById(p159kd.e.ad_recently);
                        }
                        return null;
                    default:
                        int i16 = TransferToPalmPayHomeRecentlyFragment.f33823A;
                        return new p173ld.B(transferToPalmPayHomeRecentlyFragment.f33827v == null);
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
            lVar.e(this, new G(new C0139f(this, 14), 0));
        }
        TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel2 = (TransferToPalmPayHomeViewModel) this.f27333i;
        n.B(this, transferToPalmPayHomeViewModel2 != null ? transferToPalmPayHomeViewModel2.f34084p : null, this, new Ba.a(this, 8), null, false, null, 248);
        TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel3 = (TransferToPalmPayHomeViewModel) this.f27333i;
        l lVar2 = transferToPalmPayHomeViewModel3 != null ? transferToPalmPayHomeViewModel3.f34083o : null;
        if (lVar2 == null) {
            return 0;
        }
        lVar2.e(this, new G(new Q(14, this, this), 0));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        String string;
        super.o();
        c.b().j(this);
        Bundle arguments = getArguments();
        Integer num = null;
        if (arguments != null && (string = arguments.getString("core_order_source_type", "")) != null) {
            if (TextUtils.isEmpty(string)) {
                string = null;
            }
            if (string != null) {
                this.t = string;
            }
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            Integer numValueOf = Integer.valueOf(arguments2.getInt("recipient_source"));
            Bundle arguments3 = getArguments();
            if (arguments3 != null && arguments3.containsKey("recipient_source")) {
                num = numValueOf;
            }
        }
        this.f33827v = num;
        t tVar = this.f33824j;
        RecyclerView recyclerView = (RecyclerView) tVar.getValue();
        if (recyclerView != null) {
            recyclerView.setAdapter(t());
        }
        RecyclerView recyclerView2 = (RecyclerView) tVar.getValue();
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext()));
        }
        C1548f c1548f = new C1548f(CommonViewExtKt.colorInt(b.ppColorDividerLine, requireContext()), CommonViewExtKt.getDp(1));
        c1548f.f31336e = false;
        RecyclerView recyclerView3 = (RecyclerView) tVar.getValue();
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(c1548f);
        }
        t().setOnItemClickListener(new F(this));
        t().setOnItemChildClickListener(new F(this));
        org.chromium.support_lib_boundary.util.b.d((SingleAdView) this.f33826p.getValue(), Boolean.TRUE);
        PpSwipeRefreshLayout ppSwipeRefreshLayoutU = u();
        if (ppSwipeRefreshLayoutU != null) {
            ppSwipeRefreshLayoutU.setOnRefreshListener(new F(this));
        }
        PpSwipeRefreshLayout ppSwipeRefreshLayoutU2 = u();
        if (ppSwipeRefreshLayoutU2 != null) {
            ppSwipeRefreshLayoutU2.setColorSchemeResources(b.ppColorPrimary);
        }
        PpSwipeRefreshLayout ppSwipeRefreshLayoutU3 = u();
        if (ppSwipeRefreshLayoutU3 != null) {
            ppSwipeRefreshLayoutU3.setRefreshing(true);
        }
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

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onTransactionMessage(@Nullable TransactionEvent event) {
        v();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onTransferResultMessage(@Nullable VoucherOperationMsg msg) {
        v();
    }

    public final B t() {
        return (B) this.f33828w.getValue();
    }

    public final PpSwipeRefreshLayout u() {
        return (PpSwipeRefreshLayout) this.f33825o.getValue();
    }

    public final void v() {
        if (NetworkUtils.isConnected()) {
            TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel = (TransferToPalmPayHomeViewModel) this.f27333i;
            if (transferToPalmPayHomeViewModel != null) {
                transferToPalmPayHomeViewModel.f(this.f33827v);
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
