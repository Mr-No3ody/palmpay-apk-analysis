package com.transsnet.palmpay.send_money.ui.fragment.to_palmpay;

import Aa.a;
import Ab.B;
import Ab.i;
import Ad.c0;
import C0.G;
import C9.C0139f;
import C9.C0144k;
import C9.Q;
import Fd.C0250e;
import Fd.m;
import L6.b;
import Pa.r0;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.CompatStateEditText;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.RecipientBeanV2;
import com.transsnet.palmpay.send_money.bean.event.AddRecipientEvent;
import com.transsnet.palmpay.send_money.bean.req.ToPalmPayBeneficiaryReq;
import com.transsnet.palmpay.send_money.bean.resp.RecipientMemberLogOutResp;
import com.transsnet.palmpay.send_money.ui.dialog.AccountUnavailableDialog;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactAllFragment;
import com.transsnet.palmpay.send_money.ui.view.SideBarView;
import com.transsnet.palmpay.send_money.viewmodel.TransferToPalmPayContactViewModel;
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
import p173ld.y;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/fragment/to_palmpay/TransferToPalmPayContactAllFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/send_money/viewmodel/TransferToPalmPayContactViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/send_money/bean/event/AddRecipientEvent;", "event", "", "onAddRecipientMessage", "(Lcom/transsnet/palmpay/send_money/bean/event/AddRecipientEvent;)V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferToPalmPayContactAllFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferToPalmPayContactAllFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/to_palmpay/TransferToPalmPayContactAllFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,487:1\n1#2:488\n115#3,8:489\n145#3:497\n171#3,12:498\n215#3:510\n*S KotlinDebug\n*F\n+ 1 TransferToPalmPayContactAllFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/to_palmpay/TransferToPalmPayContactAllFragment\n*L\n223#1:489,8\n223#1:497\n314#1:498,12\n314#1:510\n*E\n"})
public final class TransferToPalmPayContactAllFragment extends BaseMvvmFragment<TransferToPalmPayContactViewModel> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f33796A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f33797B;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f33799H;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f33800j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f33801o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f33802p;
    public final t t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f33804w;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f33803v = "COMMON";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f33798C = C2131j.b(new a(28));

    public TransferToPalmPayContactAllFragment() {
        final int i7 = 2;
        this.f33800j = C2131j.b(new Function0(this) { // from class: Fd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayContactAllFragment f2668b;

            {
                this.f2668b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return new p173ld.y(this.f2668b.m());
                    case 1:
                        TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment = this.f2668b;
                        Context contextRequireContext = transferToPalmPayContactAllFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        G7.g gVar = new G7.g(contextRequireContext);
                        Intrinsics.checkNotNullParameter("Add your friend to Favorite here", "value");
                        Intrinsics.checkNotNullParameter("Add your friend to Favorite here", "<set-?>");
                        gVar.f3109v = "Add your friend to Favorite here";
                        gVar.f3110w = -1;
                        gVar.f3111x = 10.0f;
                        gVar.d(8);
                        gVar.i(16);
                        gVar.b(G7.b.f3049b);
                        gVar.c(G7.c.f3055b);
                        gVar.e(4);
                        gVar.g(4.0f);
                        float f10 = 8;
                        gVar.f3094f = C0.G.b(1, f10);
                        gVar.f3095g = C0.G.b(1, f10);
                        gVar.f3096h = C0.G.b(1, f10);
                        gVar.f3097i = C0.G.b(1, f10);
                        gVar.h();
                        gVar.t = transferToPalmPayContactAllFragment.requireContext().getColor(L6.b.ppColorTextPrimary);
                        gVar.f3072K = true;
                        gVar.f3073L = true;
                        gVar.f3074M = true;
                        gVar.f3071J = true;
                        gVar.f3070I = true;
                        gVar.f(G7.q.f3135a);
                        gVar.f3076O = transferToPalmPayContactAllFragment.getViewLifecycleOwner();
                        return gVar.a();
                    case 2:
                        View view = this.f2668b.f27318b;
                        if (view != null) {
                            return (SideBarView) view.findViewById(p159kd.e.side_bar);
                        }
                        return null;
                    case 3:
                        View view2 = this.f2668b.f27318b;
                        if (view2 != null) {
                            return (RecyclerView) view2.findViewById(p159kd.e.recyclerView);
                        }
                        return null;
                    case 4:
                        View view3 = this.f2668b.f27318b;
                        if (view3 != null) {
                            return (CompatStateEditText) view3.findViewById(p159kd.e.search_et);
                        }
                        return null;
                    case 5:
                        View view4 = this.f2668b.f27318b;
                        if (view4 != null) {
                            return view4.findViewById(p159kd.e.search_view);
                        }
                        return null;
                    default:
                        return new LinearLayoutManager(this.f2668b.requireContext());
                }
            }
        });
        final int i10 = 3;
        this.f33801o = C2131j.b(new Function0(this) { // from class: Fd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayContactAllFragment f2668b;

            {
                this.f2668b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return new p173ld.y(this.f2668b.m());
                    case 1:
                        TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment = this.f2668b;
                        Context contextRequireContext = transferToPalmPayContactAllFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        G7.g gVar = new G7.g(contextRequireContext);
                        Intrinsics.checkNotNullParameter("Add your friend to Favorite here", "value");
                        Intrinsics.checkNotNullParameter("Add your friend to Favorite here", "<set-?>");
                        gVar.f3109v = "Add your friend to Favorite here";
                        gVar.f3110w = -1;
                        gVar.f3111x = 10.0f;
                        gVar.d(8);
                        gVar.i(16);
                        gVar.b(G7.b.f3049b);
                        gVar.c(G7.c.f3055b);
                        gVar.e(4);
                        gVar.g(4.0f);
                        float f10 = 8;
                        gVar.f3094f = C0.G.b(1, f10);
                        gVar.f3095g = C0.G.b(1, f10);
                        gVar.f3096h = C0.G.b(1, f10);
                        gVar.f3097i = C0.G.b(1, f10);
                        gVar.h();
                        gVar.t = transferToPalmPayContactAllFragment.requireContext().getColor(L6.b.ppColorTextPrimary);
                        gVar.f3072K = true;
                        gVar.f3073L = true;
                        gVar.f3074M = true;
                        gVar.f3071J = true;
                        gVar.f3070I = true;
                        gVar.f(G7.q.f3135a);
                        gVar.f3076O = transferToPalmPayContactAllFragment.getViewLifecycleOwner();
                        return gVar.a();
                    case 2:
                        View view = this.f2668b.f27318b;
                        if (view != null) {
                            return (SideBarView) view.findViewById(p159kd.e.side_bar);
                        }
                        return null;
                    case 3:
                        View view2 = this.f2668b.f27318b;
                        if (view2 != null) {
                            return (RecyclerView) view2.findViewById(p159kd.e.recyclerView);
                        }
                        return null;
                    case 4:
                        View view3 = this.f2668b.f27318b;
                        if (view3 != null) {
                            return (CompatStateEditText) view3.findViewById(p159kd.e.search_et);
                        }
                        return null;
                    case 5:
                        View view4 = this.f2668b.f27318b;
                        if (view4 != null) {
                            return view4.findViewById(p159kd.e.search_view);
                        }
                        return null;
                    default:
                        return new LinearLayoutManager(this.f2668b.requireContext());
                }
            }
        });
        final int i11 = 4;
        this.f33802p = C2131j.b(new Function0(this) { // from class: Fd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayContactAllFragment f2668b;

            {
                this.f2668b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return new p173ld.y(this.f2668b.m());
                    case 1:
                        TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment = this.f2668b;
                        Context contextRequireContext = transferToPalmPayContactAllFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        G7.g gVar = new G7.g(contextRequireContext);
                        Intrinsics.checkNotNullParameter("Add your friend to Favorite here", "value");
                        Intrinsics.checkNotNullParameter("Add your friend to Favorite here", "<set-?>");
                        gVar.f3109v = "Add your friend to Favorite here";
                        gVar.f3110w = -1;
                        gVar.f3111x = 10.0f;
                        gVar.d(8);
                        gVar.i(16);
                        gVar.b(G7.b.f3049b);
                        gVar.c(G7.c.f3055b);
                        gVar.e(4);
                        gVar.g(4.0f);
                        float f10 = 8;
                        gVar.f3094f = C0.G.b(1, f10);
                        gVar.f3095g = C0.G.b(1, f10);
                        gVar.f3096h = C0.G.b(1, f10);
                        gVar.f3097i = C0.G.b(1, f10);
                        gVar.h();
                        gVar.t = transferToPalmPayContactAllFragment.requireContext().getColor(L6.b.ppColorTextPrimary);
                        gVar.f3072K = true;
                        gVar.f3073L = true;
                        gVar.f3074M = true;
                        gVar.f3071J = true;
                        gVar.f3070I = true;
                        gVar.f(G7.q.f3135a);
                        gVar.f3076O = transferToPalmPayContactAllFragment.getViewLifecycleOwner();
                        return gVar.a();
                    case 2:
                        View view = this.f2668b.f27318b;
                        if (view != null) {
                            return (SideBarView) view.findViewById(p159kd.e.side_bar);
                        }
                        return null;
                    case 3:
                        View view2 = this.f2668b.f27318b;
                        if (view2 != null) {
                            return (RecyclerView) view2.findViewById(p159kd.e.recyclerView);
                        }
                        return null;
                    case 4:
                        View view3 = this.f2668b.f27318b;
                        if (view3 != null) {
                            return (CompatStateEditText) view3.findViewById(p159kd.e.search_et);
                        }
                        return null;
                    case 5:
                        View view4 = this.f2668b.f27318b;
                        if (view4 != null) {
                            return view4.findViewById(p159kd.e.search_view);
                        }
                        return null;
                    default:
                        return new LinearLayoutManager(this.f2668b.requireContext());
                }
            }
        });
        final int i12 = 5;
        this.t = C2131j.b(new Function0(this) { // from class: Fd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayContactAllFragment f2668b;

            {
                this.f2668b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return new p173ld.y(this.f2668b.m());
                    case 1:
                        TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment = this.f2668b;
                        Context contextRequireContext = transferToPalmPayContactAllFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        G7.g gVar = new G7.g(contextRequireContext);
                        Intrinsics.checkNotNullParameter("Add your friend to Favorite here", "value");
                        Intrinsics.checkNotNullParameter("Add your friend to Favorite here", "<set-?>");
                        gVar.f3109v = "Add your friend to Favorite here";
                        gVar.f3110w = -1;
                        gVar.f3111x = 10.0f;
                        gVar.d(8);
                        gVar.i(16);
                        gVar.b(G7.b.f3049b);
                        gVar.c(G7.c.f3055b);
                        gVar.e(4);
                        gVar.g(4.0f);
                        float f10 = 8;
                        gVar.f3094f = C0.G.b(1, f10);
                        gVar.f3095g = C0.G.b(1, f10);
                        gVar.f3096h = C0.G.b(1, f10);
                        gVar.f3097i = C0.G.b(1, f10);
                        gVar.h();
                        gVar.t = transferToPalmPayContactAllFragment.requireContext().getColor(L6.b.ppColorTextPrimary);
                        gVar.f3072K = true;
                        gVar.f3073L = true;
                        gVar.f3074M = true;
                        gVar.f3071J = true;
                        gVar.f3070I = true;
                        gVar.f(G7.q.f3135a);
                        gVar.f3076O = transferToPalmPayContactAllFragment.getViewLifecycleOwner();
                        return gVar.a();
                    case 2:
                        View view = this.f2668b.f27318b;
                        if (view != null) {
                            return (SideBarView) view.findViewById(p159kd.e.side_bar);
                        }
                        return null;
                    case 3:
                        View view2 = this.f2668b.f27318b;
                        if (view2 != null) {
                            return (RecyclerView) view2.findViewById(p159kd.e.recyclerView);
                        }
                        return null;
                    case 4:
                        View view3 = this.f2668b.f27318b;
                        if (view3 != null) {
                            return (CompatStateEditText) view3.findViewById(p159kd.e.search_et);
                        }
                        return null;
                    case 5:
                        View view4 = this.f2668b.f27318b;
                        if (view4 != null) {
                            return view4.findViewById(p159kd.e.search_view);
                        }
                        return null;
                    default:
                        return new LinearLayoutManager(this.f2668b.requireContext());
                }
            }
        });
        final int i13 = 6;
        this.f33796A = C2131j.b(new Function0(this) { // from class: Fd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayContactAllFragment f2668b;

            {
                this.f2668b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return new p173ld.y(this.f2668b.m());
                    case 1:
                        TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment = this.f2668b;
                        Context contextRequireContext = transferToPalmPayContactAllFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        G7.g gVar = new G7.g(contextRequireContext);
                        Intrinsics.checkNotNullParameter("Add your friend to Favorite here", "value");
                        Intrinsics.checkNotNullParameter("Add your friend to Favorite here", "<set-?>");
                        gVar.f3109v = "Add your friend to Favorite here";
                        gVar.f3110w = -1;
                        gVar.f3111x = 10.0f;
                        gVar.d(8);
                        gVar.i(16);
                        gVar.b(G7.b.f3049b);
                        gVar.c(G7.c.f3055b);
                        gVar.e(4);
                        gVar.g(4.0f);
                        float f10 = 8;
                        gVar.f3094f = C0.G.b(1, f10);
                        gVar.f3095g = C0.G.b(1, f10);
                        gVar.f3096h = C0.G.b(1, f10);
                        gVar.f3097i = C0.G.b(1, f10);
                        gVar.h();
                        gVar.t = transferToPalmPayContactAllFragment.requireContext().getColor(L6.b.ppColorTextPrimary);
                        gVar.f3072K = true;
                        gVar.f3073L = true;
                        gVar.f3074M = true;
                        gVar.f3071J = true;
                        gVar.f3070I = true;
                        gVar.f(G7.q.f3135a);
                        gVar.f3076O = transferToPalmPayContactAllFragment.getViewLifecycleOwner();
                        return gVar.a();
                    case 2:
                        View view = this.f2668b.f27318b;
                        if (view != null) {
                            return (SideBarView) view.findViewById(p159kd.e.side_bar);
                        }
                        return null;
                    case 3:
                        View view2 = this.f2668b.f27318b;
                        if (view2 != null) {
                            return (RecyclerView) view2.findViewById(p159kd.e.recyclerView);
                        }
                        return null;
                    case 4:
                        View view3 = this.f2668b.f27318b;
                        if (view3 != null) {
                            return (CompatStateEditText) view3.findViewById(p159kd.e.search_et);
                        }
                        return null;
                    case 5:
                        View view4 = this.f2668b.f27318b;
                        if (view4 != null) {
                            return view4.findViewById(p159kd.e.search_view);
                        }
                        return null;
                    default:
                        return new LinearLayoutManager(this.f2668b.requireContext());
                }
            }
        });
        final int i14 = 0;
        this.f33797B = C2131j.b(new Function0(this) { // from class: Fd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayContactAllFragment f2668b;

            {
                this.f2668b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return new p173ld.y(this.f2668b.m());
                    case 1:
                        TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment = this.f2668b;
                        Context contextRequireContext = transferToPalmPayContactAllFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        G7.g gVar = new G7.g(contextRequireContext);
                        Intrinsics.checkNotNullParameter("Add your friend to Favorite here", "value");
                        Intrinsics.checkNotNullParameter("Add your friend to Favorite here", "<set-?>");
                        gVar.f3109v = "Add your friend to Favorite here";
                        gVar.f3110w = -1;
                        gVar.f3111x = 10.0f;
                        gVar.d(8);
                        gVar.i(16);
                        gVar.b(G7.b.f3049b);
                        gVar.c(G7.c.f3055b);
                        gVar.e(4);
                        gVar.g(4.0f);
                        float f10 = 8;
                        gVar.f3094f = C0.G.b(1, f10);
                        gVar.f3095g = C0.G.b(1, f10);
                        gVar.f3096h = C0.G.b(1, f10);
                        gVar.f3097i = C0.G.b(1, f10);
                        gVar.h();
                        gVar.t = transferToPalmPayContactAllFragment.requireContext().getColor(L6.b.ppColorTextPrimary);
                        gVar.f3072K = true;
                        gVar.f3073L = true;
                        gVar.f3074M = true;
                        gVar.f3071J = true;
                        gVar.f3070I = true;
                        gVar.f(G7.q.f3135a);
                        gVar.f3076O = transferToPalmPayContactAllFragment.getViewLifecycleOwner();
                        return gVar.a();
                    case 2:
                        View view = this.f2668b.f27318b;
                        if (view != null) {
                            return (SideBarView) view.findViewById(p159kd.e.side_bar);
                        }
                        return null;
                    case 3:
                        View view2 = this.f2668b.f27318b;
                        if (view2 != null) {
                            return (RecyclerView) view2.findViewById(p159kd.e.recyclerView);
                        }
                        return null;
                    case 4:
                        View view3 = this.f2668b.f27318b;
                        if (view3 != null) {
                            return (CompatStateEditText) view3.findViewById(p159kd.e.search_et);
                        }
                        return null;
                    case 5:
                        View view4 = this.f2668b.f27318b;
                        if (view4 != null) {
                            return view4.findViewById(p159kd.e.search_view);
                        }
                        return null;
                    default:
                        return new LinearLayoutManager(this.f2668b.requireContext());
                }
            }
        });
        final int i15 = 1;
        this.f33799H = C2131j.b(new Function0(this) { // from class: Fd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayContactAllFragment f2668b;

            {
                this.f2668b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return new p173ld.y(this.f2668b.m());
                    case 1:
                        TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment = this.f2668b;
                        Context contextRequireContext = transferToPalmPayContactAllFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        G7.g gVar = new G7.g(contextRequireContext);
                        Intrinsics.checkNotNullParameter("Add your friend to Favorite here", "value");
                        Intrinsics.checkNotNullParameter("Add your friend to Favorite here", "<set-?>");
                        gVar.f3109v = "Add your friend to Favorite here";
                        gVar.f3110w = -1;
                        gVar.f3111x = 10.0f;
                        gVar.d(8);
                        gVar.i(16);
                        gVar.b(G7.b.f3049b);
                        gVar.c(G7.c.f3055b);
                        gVar.e(4);
                        gVar.g(4.0f);
                        float f10 = 8;
                        gVar.f3094f = C0.G.b(1, f10);
                        gVar.f3095g = C0.G.b(1, f10);
                        gVar.f3096h = C0.G.b(1, f10);
                        gVar.f3097i = C0.G.b(1, f10);
                        gVar.h();
                        gVar.t = transferToPalmPayContactAllFragment.requireContext().getColor(L6.b.ppColorTextPrimary);
                        gVar.f3072K = true;
                        gVar.f3073L = true;
                        gVar.f3074M = true;
                        gVar.f3071J = true;
                        gVar.f3070I = true;
                        gVar.f(G7.q.f3135a);
                        gVar.f3076O = transferToPalmPayContactAllFragment.getViewLifecycleOwner();
                        return gVar.a();
                    case 2:
                        View view = this.f2668b.f27318b;
                        if (view != null) {
                            return (SideBarView) view.findViewById(p159kd.e.side_bar);
                        }
                        return null;
                    case 3:
                        View view2 = this.f2668b.f27318b;
                        if (view2 != null) {
                            return (RecyclerView) view2.findViewById(p159kd.e.recyclerView);
                        }
                        return null;
                    case 4:
                        View view3 = this.f2668b.f27318b;
                        if (view3 != null) {
                            return (CompatStateEditText) view3.findViewById(p159kd.e.search_et);
                        }
                        return null;
                    case 5:
                        View view4 = this.f2668b.f27318b;
                        if (view4 != null) {
                            return view4.findViewById(p159kd.e.search_view);
                        }
                        return null;
                    default:
                        return new LinearLayoutManager(this.f2668b.requireContext());
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.sm_fragment_transfer_to_palmpay_contact_all;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        TransferToPalmPayContactViewModel transferToPalmPayContactViewModel = (TransferToPalmPayContactViewModel) this.f27333i;
        l lVar = transferToPalmPayContactViewModel != null ? transferToPalmPayContactViewModel.f34072e : null;
        if (lVar != null) {
            lVar.e(this, new C0144k(new C0139f(this, 11), 26));
        }
        TransferToPalmPayContactViewModel transferToPalmPayContactViewModel2 = (TransferToPalmPayContactViewModel) this.f27333i;
        final int i7 = 0;
        n.B(this, transferToPalmPayContactViewModel2 != null ? transferToPalmPayContactViewModel2.f34074g : null, this, new Function2(this) { // from class: Fd.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayContactAllFragment f2666b;

            {
                this.f2666b = this;
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
                            p220oa.h.y(this.f2666b, "Successfully delete beneficiary");
                            org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(1));
                        } else {
                            ToastUtils.showLong(resp.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 1:
                        String str = (String) obj;
                        CommonResult resp2 = (CommonResult) obj2;
                        Intrinsics.checkNotNullParameter(resp2, "resp");
                        if (resp2.isSuccess()) {
                            TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment = this.f2666b;
                            int size = transferToPalmPayContactAllFragment.t().getData().size();
                            for (int i10 = 0; i10 < size; i10++) {
                                if (Intrinsics.c(((RecipientBeanV2) transferToPalmPayContactAllFragment.t().getData().get(i10)).getRelationId(), str)) {
                                    RecipientBeanV2 recipientBeanV2 = (RecipientBeanV2) transferToPalmPayContactAllFragment.t().getData().get(i10);
                                    Boolean favorite = ((RecipientBeanV2) transferToPalmPayContactAllFragment.t().getData().get(i10)).getFavorite();
                                    recipientBeanV2.setFavorite(Boolean.valueOf(!(favorite != null ? favorite.booleanValue() : false)));
                                    transferToPalmPayContactAllFragment.t().notifyItemChanged(i10);
                                    p220oa.h.y(transferToPalmPayContactAllFragment, "Successfully " + (Intrinsics.c(((RecipientBeanV2) transferToPalmPayContactAllFragment.t().getData().get(i10)).getFavorite(), Boolean.TRUE) ? "add to" : "remove from") + " Favorites");
                                    org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(1));
                                }
                            }
                            org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(1));
                        } else {
                            ToastUtils.showLong(resp2.getRespMsg(), new Object[0]);
                        }
                        break;
                    default:
                        RecipientBeanV2 recipientBeanV3 = (RecipientBeanV2) obj;
                        CommonBeanResult resp3 = (CommonBeanResult) obj2;
                        Intrinsics.checkNotNullParameter(resp3, "resp");
                        if (resp3.isSuccess() && (recipientMemberLogOutResp = (RecipientMemberLogOutResp) resp3.data) != null) {
                            Integer accountStatus = recipientMemberLogOutResp.getAccountStatus();
                            TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment2 = this.f2666b;
                            if (accountStatus != null && accountStatus.intValue() == 1) {
                                Context contextRequireContext = transferToPalmPayContactAllFragment2.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                AccountUnavailableDialog accountUnavailableDialog = new AccountUnavailableDialog(contextRequireContext);
                                accountUnavailableDialog.show();
                                accountUnavailableDialog.setDialogInfo(recipientMemberLogOutResp);
                                accountUnavailableDialog.setData(recipientBeanV3);
                                accountUnavailableDialog.setListener(new c0(15, transferToPalmPayContactAllFragment2, recipientBeanV3));
                            } else if (recipientBeanV3 != null) {
                                String transType = recipientBeanV3.getTransType();
                                Integer businessType = recipientBeanV3.getBusinessType();
                                r0.O0(transType, Integer.valueOf(businessType != null ? businessType.intValue() : 0), recipientBeanV3.getAccountNo(), p002a.a.e(new Pair("core_order_source_type", transferToPalmPayContactAllFragment2.f33803v), new Pair("MEMBER_ID", recipientBeanV3.getMemberId()), !TextUtils.isEmpty(recipientBeanV3.getPpAccountNo()) ? new Pair("extra_data", recipientBeanV3.getPpAccountNo()) : new Pair("extra_data", null)));
                            }
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new B(16), false, null, 240);
        TransferToPalmPayContactViewModel transferToPalmPayContactViewModel3 = (TransferToPalmPayContactViewModel) this.f27333i;
        final int i10 = 1;
        n.B(this, transferToPalmPayContactViewModel3 != null ? transferToPalmPayContactViewModel3.f34075i : null, this, new Function2(this) { // from class: Fd.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayContactAllFragment f2666b;

            {
                this.f2666b = this;
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
                            p220oa.h.y(this.f2666b, "Successfully delete beneficiary");
                            org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(1));
                        } else {
                            ToastUtils.showLong(resp.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 1:
                        String str = (String) obj;
                        CommonResult resp2 = (CommonResult) obj2;
                        Intrinsics.checkNotNullParameter(resp2, "resp");
                        if (resp2.isSuccess()) {
                            TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment = this.f2666b;
                            int size = transferToPalmPayContactAllFragment.t().getData().size();
                            for (int i11 = 0; i11 < size; i11++) {
                                if (Intrinsics.c(((RecipientBeanV2) transferToPalmPayContactAllFragment.t().getData().get(i11)).getRelationId(), str)) {
                                    RecipientBeanV2 recipientBeanV2 = (RecipientBeanV2) transferToPalmPayContactAllFragment.t().getData().get(i11);
                                    Boolean favorite = ((RecipientBeanV2) transferToPalmPayContactAllFragment.t().getData().get(i11)).getFavorite();
                                    recipientBeanV2.setFavorite(Boolean.valueOf(!(favorite != null ? favorite.booleanValue() : false)));
                                    transferToPalmPayContactAllFragment.t().notifyItemChanged(i11);
                                    p220oa.h.y(transferToPalmPayContactAllFragment, "Successfully " + (Intrinsics.c(((RecipientBeanV2) transferToPalmPayContactAllFragment.t().getData().get(i11)).getFavorite(), Boolean.TRUE) ? "add to" : "remove from") + " Favorites");
                                    org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(1));
                                }
                            }
                            org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(1));
                        } else {
                            ToastUtils.showLong(resp2.getRespMsg(), new Object[0]);
                        }
                        break;
                    default:
                        RecipientBeanV2 recipientBeanV3 = (RecipientBeanV2) obj;
                        CommonBeanResult resp3 = (CommonBeanResult) obj2;
                        Intrinsics.checkNotNullParameter(resp3, "resp");
                        if (resp3.isSuccess() && (recipientMemberLogOutResp = (RecipientMemberLogOutResp) resp3.data) != null) {
                            Integer accountStatus = recipientMemberLogOutResp.getAccountStatus();
                            TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment2 = this.f2666b;
                            if (accountStatus != null && accountStatus.intValue() == 1) {
                                Context contextRequireContext = transferToPalmPayContactAllFragment2.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                AccountUnavailableDialog accountUnavailableDialog = new AccountUnavailableDialog(contextRequireContext);
                                accountUnavailableDialog.show();
                                accountUnavailableDialog.setDialogInfo(recipientMemberLogOutResp);
                                accountUnavailableDialog.setData(recipientBeanV3);
                                accountUnavailableDialog.setListener(new c0(15, transferToPalmPayContactAllFragment2, recipientBeanV3));
                            } else if (recipientBeanV3 != null) {
                                String transType = recipientBeanV3.getTransType();
                                Integer businessType = recipientBeanV3.getBusinessType();
                                r0.O0(transType, Integer.valueOf(businessType != null ? businessType.intValue() : 0), recipientBeanV3.getAccountNo(), p002a.a.e(new Pair("core_order_source_type", transferToPalmPayContactAllFragment2.f33803v), new Pair("MEMBER_ID", recipientBeanV3.getMemberId()), !TextUtils.isEmpty(recipientBeanV3.getPpAccountNo()) ? new Pair("extra_data", recipientBeanV3.getPpAccountNo()) : new Pair("extra_data", null)));
                            }
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new B(17), false, null, 240);
        TransferToPalmPayContactViewModel transferToPalmPayContactViewModel4 = (TransferToPalmPayContactViewModel) this.f27333i;
        final int i11 = 2;
        n.B(this, transferToPalmPayContactViewModel4 != null ? transferToPalmPayContactViewModel4.f34077o : null, this, new Function2(this) { // from class: Fd.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayContactAllFragment f2666b;

            {
                this.f2666b = this;
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
                            p220oa.h.y(this.f2666b, "Successfully delete beneficiary");
                            org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(1));
                        } else {
                            ToastUtils.showLong(resp.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 1:
                        String str = (String) obj;
                        CommonResult resp2 = (CommonResult) obj2;
                        Intrinsics.checkNotNullParameter(resp2, "resp");
                        if (resp2.isSuccess()) {
                            TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment = this.f2666b;
                            int size = transferToPalmPayContactAllFragment.t().getData().size();
                            for (int i12 = 0; i12 < size; i12++) {
                                if (Intrinsics.c(((RecipientBeanV2) transferToPalmPayContactAllFragment.t().getData().get(i12)).getRelationId(), str)) {
                                    RecipientBeanV2 recipientBeanV2 = (RecipientBeanV2) transferToPalmPayContactAllFragment.t().getData().get(i12);
                                    Boolean favorite = ((RecipientBeanV2) transferToPalmPayContactAllFragment.t().getData().get(i12)).getFavorite();
                                    recipientBeanV2.setFavorite(Boolean.valueOf(!(favorite != null ? favorite.booleanValue() : false)));
                                    transferToPalmPayContactAllFragment.t().notifyItemChanged(i12);
                                    p220oa.h.y(transferToPalmPayContactAllFragment, "Successfully " + (Intrinsics.c(((RecipientBeanV2) transferToPalmPayContactAllFragment.t().getData().get(i12)).getFavorite(), Boolean.TRUE) ? "add to" : "remove from") + " Favorites");
                                    org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(1));
                                }
                            }
                            org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(1));
                        } else {
                            ToastUtils.showLong(resp2.getRespMsg(), new Object[0]);
                        }
                        break;
                    default:
                        RecipientBeanV2 recipientBeanV3 = (RecipientBeanV2) obj;
                        CommonBeanResult resp3 = (CommonBeanResult) obj2;
                        Intrinsics.checkNotNullParameter(resp3, "resp");
                        if (resp3.isSuccess() && (recipientMemberLogOutResp = (RecipientMemberLogOutResp) resp3.data) != null) {
                            Integer accountStatus = recipientMemberLogOutResp.getAccountStatus();
                            TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment2 = this.f2666b;
                            if (accountStatus != null && accountStatus.intValue() == 1) {
                                Context contextRequireContext = transferToPalmPayContactAllFragment2.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                AccountUnavailableDialog accountUnavailableDialog = new AccountUnavailableDialog(contextRequireContext);
                                accountUnavailableDialog.show();
                                accountUnavailableDialog.setDialogInfo(recipientMemberLogOutResp);
                                accountUnavailableDialog.setData(recipientBeanV3);
                                accountUnavailableDialog.setListener(new c0(15, transferToPalmPayContactAllFragment2, recipientBeanV3));
                            } else if (recipientBeanV3 != null) {
                                String transType = recipientBeanV3.getTransType();
                                Integer businessType = recipientBeanV3.getBusinessType();
                                r0.O0(transType, Integer.valueOf(businessType != null ? businessType.intValue() : 0), recipientBeanV3.getAccountNo(), p002a.a.e(new Pair("core_order_source_type", transferToPalmPayContactAllFragment2.f33803v), new Pair("MEMBER_ID", recipientBeanV3.getMemberId()), !TextUtils.isEmpty(recipientBeanV3.getPpAccountNo()) ? new Pair("extra_data", recipientBeanV3.getPpAccountNo()) : new Pair("extra_data", null)));
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
        lVar2.e(this, new C0144k(new Q(10, this, this), 26));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        c.b().j(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("core_order_source_type", "");
            if (string != null) {
                if (TextUtils.isEmpty(string)) {
                    string = null;
                }
                if (string != null) {
                    this.f33803v = string;
                }
            }
            String string2 = arguments.getString("MEMBER_ID", "");
            if (string2 != null) {
                if (TextUtils.isEmpty(string2)) {
                    string2 = null;
                }
                if (string2 != null) {
                    this.f33804w = string2;
                }
            }
        }
        t tVar = this.f33802p;
        CompatStateEditText compatStateEditText = (CompatStateEditText) tVar.getValue();
        if (compatStateEditText != null) {
            compatStateEditText.setHint(G.i("").append(getString(h.sm_search_mobile_number_name)).setFontFamily("sans-serif").create());
        }
        View view = (View) this.t.getValue();
        if (view != null) {
            p220oa.h.s(view, !u().isEmpty());
        }
        CompatStateEditText compatStateEditText2 = (CompatStateEditText) tVar.getValue();
        if (compatStateEditText2 != null) {
            compatStateEditText2.addTextChangedListener(new i(this, 10));
        }
        t tVar2 = this.f33800j;
        SideBarView sideBarView = (SideBarView) tVar2.getValue();
        if (sideBarView != null) {
            sideBarView.setLetters(getResources().getStringArray(p159kd.a.sm_select_bank_slide_bar_value_new));
        }
        SideBarView sideBarView2 = (SideBarView) tVar2.getValue();
        if (sideBarView2 != null) {
            sideBarView2.setOnLetterChangeListener(new m(this));
        }
        View viewInflate = getLayoutInflater().inflate(f.sm_layout_to_palmpay_empty_view_168, (ViewGroup) null);
        viewInflate.setBackgroundColor(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, getContext()));
        ImageView imageView = (ImageView) viewInflate.findViewById(e.iv_empty_icon);
        TextView textView = (TextView) viewInflate.findViewById(e.tv_empty_title);
        TextView textView2 = (TextView) viewInflate.findViewById(e.tv_empty_tip);
        imageView.setImageResource(r.cv_empty_no_palmpay_contacts);
        textView.setText(h.sm_no_beneficiaries_yet);
        textView2.setText("Beneficiaries will be added automatically if the transfer is successful");
        t().setEmptyView(viewInflate);
        RecyclerView recyclerViewV = v();
        if (recyclerViewV != null) {
            recyclerViewV.setAdapter(t());
        }
        RecyclerView recyclerViewV2 = v();
        if (recyclerViewV2 != null) {
            recyclerViewV2.setLayoutManager((LinearLayoutManager) this.f33796A.getValue());
        }
        C1548f c1548f = new C1548f(CommonViewExtKt.colorInt(b.ppColorDividerLine, requireContext()), 1);
        c1548f.f31336e = false;
        RecyclerView recyclerViewV3 = v();
        if (recyclerViewV3 != null) {
            recyclerViewV3.addItemDecoration(c1548f);
        }
        t().setOnItemClickListener(new C0250e(this));
        t().setOnItemChildClickListener(new C0250e(this));
        return 0;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onAddRecipientMessage(@NotNull AddRecipientEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getRecipientType() == 1) {
            w();
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
        w();
    }

    public final y t() {
        return (y) this.f33797B.getValue();
    }

    public final CopyOnWriteArrayList u() {
        return (CopyOnWriteArrayList) this.f33798C.getValue();
    }

    public final RecyclerView v() {
        return (RecyclerView) this.f33801o.getValue();
    }

    public final void w() {
        TransferToPalmPayContactViewModel transferToPalmPayContactViewModel = (TransferToPalmPayContactViewModel) this.f27333i;
        if (transferToPalmPayContactViewModel != null) {
            ToPalmPayBeneficiaryReq toPalmPayBeneficiaryReq = new ToPalmPayBeneficiaryReq();
            toPalmPayBeneficiaryReq.pageSize = 200;
            transferToPalmPayContactViewModel.f(toPalmPayBeneficiaryReq);
        }
    }
}
