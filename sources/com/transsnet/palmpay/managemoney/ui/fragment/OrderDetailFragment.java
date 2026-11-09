package com.transsnet.palmpay.managemoney.ui.fragment;

import Wf.AbstractC0780y;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.ui.activity.ViewOnClickListenerC1478l;
import com.transsnet.palmpay.credit.ui.dialog.ViewOnClickListenerC1533v;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.managemoney.bean.resp.GetOrderDetailResp;
import com.transsnet.palmpay.managemoney.ui.view.PlanInfoItem;
import com.transsnet.palmpay.managemoney.ui.viewmodel.OrderDetailViewModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/fragment/OrderDetailFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/OrderDetailViewModel;", "<init>", "()V", "OrderDetailType", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOrderDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderDetailFragment.kt\ncom/transsnet/palmpay/managemoney/ui/fragment/OrderDetailFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,404:1\n71#2,8:405\n112#2:413\n115#2,8:414\n145#2:422\n*S KotlinDebug\n*F\n+ 1 OrderDetailFragment.kt\ncom/transsnet/palmpay/managemoney/ui/fragment/OrderDetailFragment\n*L\n107#1:405,8\n107#1:413\n112#1:414,8\n112#1:422\n*E\n"})
public final class OrderDetailFragment extends BaseMvvmFragment<OrderDetailViewModel> {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final a f32510k0 = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p355xf.t f32511A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p355xf.t f32512B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final p355xf.t f32513C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final p355xf.t f32514H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final p355xf.t f32515L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final p355xf.t f32516M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final p355xf.t f32517Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final p355xf.t f32518X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final p355xf.t f32519Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final p355xf.t f32520Z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p355xf.t f32521j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p355xf.t f32522o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p355xf.t f32523p;
    public final p355xf.t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p355xf.t f32524v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p355xf.t f32525w;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0005\b\u0087\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/fragment/OrderDetailFragment$OrderDetailType;", "", "<init>", "()V", "Companion", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(p371yf.a.f44341a)
    public @interface OrderDetailType {
        public static final int BILL_DETAIL = 2;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int ORDER_DETAIL = 1;

        /* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.fragment.OrderDetailFragment$OrderDetailType$a, reason: from kotlin metadata */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int BILL_DETAIL = 2;
            public static final int ORDER_DETAIL = 1;

            private Companion() {
            }
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OrderDetailFragment newInstance(@Nullable String str, int i7, @Nullable String str2) {
            OrderDetailFragment orderDetailFragment = new OrderDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putString("orderNo", str);
            bundle.putInt("order_detail_type", i7);
            bundle.putString("transType", str2);
            orderDetailFragment.setArguments(bundle);
            return orderDetailFragment;
        }

        private a() {
        }
    }

    public OrderDetailFragment() {
        final int i7 = 10;
        this.f32521j = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderDetailFragment f32589b;

            {
                this.f32589b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                String string2;
                OrderDetailFragment orderDetailFragment = this.f32589b;
                switch (i7) {
                    case 0:
                        OrderDetailFragment.a aVar = OrderDetailFragment.f32510k0;
                        Bundle arguments = orderDetailFragment.getArguments();
                        return (arguments == null || (string = arguments.getString("transType")) == null) ? TransType.TRANS_TYPE_FIXED_SAVING : string;
                    case 1:
                        OrderDetailFragment.a aVar2 = OrderDetailFragment.f32510k0;
                        View view = orderDetailFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvCancel);
                        }
                        return null;
                    case 2:
                        OrderDetailFragment.a aVar3 = OrderDetailFragment.f32510k0;
                        View view2 = orderDetailFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Jc.c.layoutCancelAndTry);
                        }
                        return null;
                    case 3:
                        OrderDetailFragment.a aVar4 = OrderDetailFragment.f32510k0;
                        View view3 = orderDetailFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(Jc.c.layoutComplete);
                        }
                        return null;
                    case 4:
                        OrderDetailFragment.a aVar5 = OrderDetailFragment.f32510k0;
                        View view4 = orderDetailFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Jc.c.tvCustomerService);
                        }
                        return null;
                    case 5:
                        OrderDetailFragment.a aVar6 = OrderDetailFragment.f32510k0;
                        View view5 = orderDetailFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Jc.c.tvShareReceipt);
                        }
                        return null;
                    case 6:
                        OrderDetailFragment.a aVar7 = OrderDetailFragment.f32510k0;
                        View view6 = orderDetailFragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Jc.c.layoutOrderInfo);
                        }
                        return null;
                    case 7:
                        OrderDetailFragment.a aVar8 = OrderDetailFragment.f32510k0;
                        View view7 = orderDetailFragment.f27318b;
                        if (view7 != null) {
                            return (LinearLayout) view7.findViewById(Jc.c.layoutBillOrderInfo);
                        }
                        return null;
                    case 8:
                        OrderDetailFragment.a aVar9 = OrderDetailFragment.f32510k0;
                        View view8 = orderDetailFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Jc.c.tvStatus);
                        }
                        return null;
                    case 9:
                        OrderDetailFragment.a aVar10 = OrderDetailFragment.f32510k0;
                        View view9 = orderDetailFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Jc.c.tvAmount);
                        }
                        return null;
                    case 10:
                        OrderDetailFragment.a aVar11 = OrderDetailFragment.f32510k0;
                        View view10 = orderDetailFragment.f27318b;
                        if (view10 != null) {
                            return (RoundedTextView) view10.findViewById(Jc.c.rtvTryAgain);
                        }
                        return null;
                    case 11:
                        OrderDetailFragment.a aVar12 = OrderDetailFragment.f32510k0;
                        View view11 = orderDetailFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Jc.c.tvName);
                        }
                        return null;
                    case 12:
                        OrderDetailFragment.a aVar13 = OrderDetailFragment.f32510k0;
                        View view12 = orderDetailFragment.f27318b;
                        if (view12 != null) {
                            return (NestedScrollView) view12.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 13:
                        OrderDetailFragment.a aVar14 = OrderDetailFragment.f32510k0;
                        View view13 = orderDetailFragment.f27318b;
                        if (view13 != null) {
                            return (PpTitleBar) view13.findViewById(Jc.c.ctb);
                        }
                        return null;
                    case 14:
                        OrderDetailFragment.a aVar15 = OrderDetailFragment.f32510k0;
                        Bundle arguments2 = orderDetailFragment.getArguments();
                        return (arguments2 == null || (string2 = arguments2.getString("orderNo")) == null) ? "" : string2;
                    default:
                        OrderDetailFragment.a aVar16 = OrderDetailFragment.f32510k0;
                        Bundle arguments3 = orderDetailFragment.getArguments();
                        return Integer.valueOf(arguments3 != null ? arguments3.getInt("order_detail_type") : 1);
                }
            }
        });
        final int i10 = 1;
        this.f32522o = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderDetailFragment f32589b;

            {
                this.f32589b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                String string2;
                OrderDetailFragment orderDetailFragment = this.f32589b;
                switch (i10) {
                    case 0:
                        OrderDetailFragment.a aVar = OrderDetailFragment.f32510k0;
                        Bundle arguments = orderDetailFragment.getArguments();
                        return (arguments == null || (string = arguments.getString("transType")) == null) ? TransType.TRANS_TYPE_FIXED_SAVING : string;
                    case 1:
                        OrderDetailFragment.a aVar2 = OrderDetailFragment.f32510k0;
                        View view = orderDetailFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvCancel);
                        }
                        return null;
                    case 2:
                        OrderDetailFragment.a aVar3 = OrderDetailFragment.f32510k0;
                        View view2 = orderDetailFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Jc.c.layoutCancelAndTry);
                        }
                        return null;
                    case 3:
                        OrderDetailFragment.a aVar4 = OrderDetailFragment.f32510k0;
                        View view3 = orderDetailFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(Jc.c.layoutComplete);
                        }
                        return null;
                    case 4:
                        OrderDetailFragment.a aVar5 = OrderDetailFragment.f32510k0;
                        View view4 = orderDetailFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Jc.c.tvCustomerService);
                        }
                        return null;
                    case 5:
                        OrderDetailFragment.a aVar6 = OrderDetailFragment.f32510k0;
                        View view5 = orderDetailFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Jc.c.tvShareReceipt);
                        }
                        return null;
                    case 6:
                        OrderDetailFragment.a aVar7 = OrderDetailFragment.f32510k0;
                        View view6 = orderDetailFragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Jc.c.layoutOrderInfo);
                        }
                        return null;
                    case 7:
                        OrderDetailFragment.a aVar8 = OrderDetailFragment.f32510k0;
                        View view7 = orderDetailFragment.f27318b;
                        if (view7 != null) {
                            return (LinearLayout) view7.findViewById(Jc.c.layoutBillOrderInfo);
                        }
                        return null;
                    case 8:
                        OrderDetailFragment.a aVar9 = OrderDetailFragment.f32510k0;
                        View view8 = orderDetailFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Jc.c.tvStatus);
                        }
                        return null;
                    case 9:
                        OrderDetailFragment.a aVar10 = OrderDetailFragment.f32510k0;
                        View view9 = orderDetailFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Jc.c.tvAmount);
                        }
                        return null;
                    case 10:
                        OrderDetailFragment.a aVar11 = OrderDetailFragment.f32510k0;
                        View view10 = orderDetailFragment.f27318b;
                        if (view10 != null) {
                            return (RoundedTextView) view10.findViewById(Jc.c.rtvTryAgain);
                        }
                        return null;
                    case 11:
                        OrderDetailFragment.a aVar12 = OrderDetailFragment.f32510k0;
                        View view11 = orderDetailFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Jc.c.tvName);
                        }
                        return null;
                    case 12:
                        OrderDetailFragment.a aVar13 = OrderDetailFragment.f32510k0;
                        View view12 = orderDetailFragment.f27318b;
                        if (view12 != null) {
                            return (NestedScrollView) view12.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 13:
                        OrderDetailFragment.a aVar14 = OrderDetailFragment.f32510k0;
                        View view13 = orderDetailFragment.f27318b;
                        if (view13 != null) {
                            return (PpTitleBar) view13.findViewById(Jc.c.ctb);
                        }
                        return null;
                    case 14:
                        OrderDetailFragment.a aVar15 = OrderDetailFragment.f32510k0;
                        Bundle arguments2 = orderDetailFragment.getArguments();
                        return (arguments2 == null || (string2 = arguments2.getString("orderNo")) == null) ? "" : string2;
                    default:
                        OrderDetailFragment.a aVar16 = OrderDetailFragment.f32510k0;
                        Bundle arguments3 = orderDetailFragment.getArguments();
                        return Integer.valueOf(arguments3 != null ? arguments3.getInt("order_detail_type") : 1);
                }
            }
        });
        final int i11 = 2;
        this.f32523p = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderDetailFragment f32589b;

            {
                this.f32589b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                String string2;
                OrderDetailFragment orderDetailFragment = this.f32589b;
                switch (i11) {
                    case 0:
                        OrderDetailFragment.a aVar = OrderDetailFragment.f32510k0;
                        Bundle arguments = orderDetailFragment.getArguments();
                        return (arguments == null || (string = arguments.getString("transType")) == null) ? TransType.TRANS_TYPE_FIXED_SAVING : string;
                    case 1:
                        OrderDetailFragment.a aVar2 = OrderDetailFragment.f32510k0;
                        View view = orderDetailFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvCancel);
                        }
                        return null;
                    case 2:
                        OrderDetailFragment.a aVar3 = OrderDetailFragment.f32510k0;
                        View view2 = orderDetailFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Jc.c.layoutCancelAndTry);
                        }
                        return null;
                    case 3:
                        OrderDetailFragment.a aVar4 = OrderDetailFragment.f32510k0;
                        View view3 = orderDetailFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(Jc.c.layoutComplete);
                        }
                        return null;
                    case 4:
                        OrderDetailFragment.a aVar5 = OrderDetailFragment.f32510k0;
                        View view4 = orderDetailFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Jc.c.tvCustomerService);
                        }
                        return null;
                    case 5:
                        OrderDetailFragment.a aVar6 = OrderDetailFragment.f32510k0;
                        View view5 = orderDetailFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Jc.c.tvShareReceipt);
                        }
                        return null;
                    case 6:
                        OrderDetailFragment.a aVar7 = OrderDetailFragment.f32510k0;
                        View view6 = orderDetailFragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Jc.c.layoutOrderInfo);
                        }
                        return null;
                    case 7:
                        OrderDetailFragment.a aVar8 = OrderDetailFragment.f32510k0;
                        View view7 = orderDetailFragment.f27318b;
                        if (view7 != null) {
                            return (LinearLayout) view7.findViewById(Jc.c.layoutBillOrderInfo);
                        }
                        return null;
                    case 8:
                        OrderDetailFragment.a aVar9 = OrderDetailFragment.f32510k0;
                        View view8 = orderDetailFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Jc.c.tvStatus);
                        }
                        return null;
                    case 9:
                        OrderDetailFragment.a aVar10 = OrderDetailFragment.f32510k0;
                        View view9 = orderDetailFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Jc.c.tvAmount);
                        }
                        return null;
                    case 10:
                        OrderDetailFragment.a aVar11 = OrderDetailFragment.f32510k0;
                        View view10 = orderDetailFragment.f27318b;
                        if (view10 != null) {
                            return (RoundedTextView) view10.findViewById(Jc.c.rtvTryAgain);
                        }
                        return null;
                    case 11:
                        OrderDetailFragment.a aVar12 = OrderDetailFragment.f32510k0;
                        View view11 = orderDetailFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Jc.c.tvName);
                        }
                        return null;
                    case 12:
                        OrderDetailFragment.a aVar13 = OrderDetailFragment.f32510k0;
                        View view12 = orderDetailFragment.f27318b;
                        if (view12 != null) {
                            return (NestedScrollView) view12.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 13:
                        OrderDetailFragment.a aVar14 = OrderDetailFragment.f32510k0;
                        View view13 = orderDetailFragment.f27318b;
                        if (view13 != null) {
                            return (PpTitleBar) view13.findViewById(Jc.c.ctb);
                        }
                        return null;
                    case 14:
                        OrderDetailFragment.a aVar15 = OrderDetailFragment.f32510k0;
                        Bundle arguments2 = orderDetailFragment.getArguments();
                        return (arguments2 == null || (string2 = arguments2.getString("orderNo")) == null) ? "" : string2;
                    default:
                        OrderDetailFragment.a aVar16 = OrderDetailFragment.f32510k0;
                        Bundle arguments3 = orderDetailFragment.getArguments();
                        return Integer.valueOf(arguments3 != null ? arguments3.getInt("order_detail_type") : 1);
                }
            }
        });
        final int i12 = 3;
        this.t = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderDetailFragment f32589b;

            {
                this.f32589b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                String string2;
                OrderDetailFragment orderDetailFragment = this.f32589b;
                switch (i12) {
                    case 0:
                        OrderDetailFragment.a aVar = OrderDetailFragment.f32510k0;
                        Bundle arguments = orderDetailFragment.getArguments();
                        return (arguments == null || (string = arguments.getString("transType")) == null) ? TransType.TRANS_TYPE_FIXED_SAVING : string;
                    case 1:
                        OrderDetailFragment.a aVar2 = OrderDetailFragment.f32510k0;
                        View view = orderDetailFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvCancel);
                        }
                        return null;
                    case 2:
                        OrderDetailFragment.a aVar3 = OrderDetailFragment.f32510k0;
                        View view2 = orderDetailFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Jc.c.layoutCancelAndTry);
                        }
                        return null;
                    case 3:
                        OrderDetailFragment.a aVar4 = OrderDetailFragment.f32510k0;
                        View view3 = orderDetailFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(Jc.c.layoutComplete);
                        }
                        return null;
                    case 4:
                        OrderDetailFragment.a aVar5 = OrderDetailFragment.f32510k0;
                        View view4 = orderDetailFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Jc.c.tvCustomerService);
                        }
                        return null;
                    case 5:
                        OrderDetailFragment.a aVar6 = OrderDetailFragment.f32510k0;
                        View view5 = orderDetailFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Jc.c.tvShareReceipt);
                        }
                        return null;
                    case 6:
                        OrderDetailFragment.a aVar7 = OrderDetailFragment.f32510k0;
                        View view6 = orderDetailFragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Jc.c.layoutOrderInfo);
                        }
                        return null;
                    case 7:
                        OrderDetailFragment.a aVar8 = OrderDetailFragment.f32510k0;
                        View view7 = orderDetailFragment.f27318b;
                        if (view7 != null) {
                            return (LinearLayout) view7.findViewById(Jc.c.layoutBillOrderInfo);
                        }
                        return null;
                    case 8:
                        OrderDetailFragment.a aVar9 = OrderDetailFragment.f32510k0;
                        View view8 = orderDetailFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Jc.c.tvStatus);
                        }
                        return null;
                    case 9:
                        OrderDetailFragment.a aVar10 = OrderDetailFragment.f32510k0;
                        View view9 = orderDetailFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Jc.c.tvAmount);
                        }
                        return null;
                    case 10:
                        OrderDetailFragment.a aVar11 = OrderDetailFragment.f32510k0;
                        View view10 = orderDetailFragment.f27318b;
                        if (view10 != null) {
                            return (RoundedTextView) view10.findViewById(Jc.c.rtvTryAgain);
                        }
                        return null;
                    case 11:
                        OrderDetailFragment.a aVar12 = OrderDetailFragment.f32510k0;
                        View view11 = orderDetailFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Jc.c.tvName);
                        }
                        return null;
                    case 12:
                        OrderDetailFragment.a aVar13 = OrderDetailFragment.f32510k0;
                        View view12 = orderDetailFragment.f27318b;
                        if (view12 != null) {
                            return (NestedScrollView) view12.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 13:
                        OrderDetailFragment.a aVar14 = OrderDetailFragment.f32510k0;
                        View view13 = orderDetailFragment.f27318b;
                        if (view13 != null) {
                            return (PpTitleBar) view13.findViewById(Jc.c.ctb);
                        }
                        return null;
                    case 14:
                        OrderDetailFragment.a aVar15 = OrderDetailFragment.f32510k0;
                        Bundle arguments2 = orderDetailFragment.getArguments();
                        return (arguments2 == null || (string2 = arguments2.getString("orderNo")) == null) ? "" : string2;
                    default:
                        OrderDetailFragment.a aVar16 = OrderDetailFragment.f32510k0;
                        Bundle arguments3 = orderDetailFragment.getArguments();
                        return Integer.valueOf(arguments3 != null ? arguments3.getInt("order_detail_type") : 1);
                }
            }
        });
        final int i13 = 4;
        this.f32524v = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderDetailFragment f32589b;

            {
                this.f32589b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                String string2;
                OrderDetailFragment orderDetailFragment = this.f32589b;
                switch (i13) {
                    case 0:
                        OrderDetailFragment.a aVar = OrderDetailFragment.f32510k0;
                        Bundle arguments = orderDetailFragment.getArguments();
                        return (arguments == null || (string = arguments.getString("transType")) == null) ? TransType.TRANS_TYPE_FIXED_SAVING : string;
                    case 1:
                        OrderDetailFragment.a aVar2 = OrderDetailFragment.f32510k0;
                        View view = orderDetailFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvCancel);
                        }
                        return null;
                    case 2:
                        OrderDetailFragment.a aVar3 = OrderDetailFragment.f32510k0;
                        View view2 = orderDetailFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Jc.c.layoutCancelAndTry);
                        }
                        return null;
                    case 3:
                        OrderDetailFragment.a aVar4 = OrderDetailFragment.f32510k0;
                        View view3 = orderDetailFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(Jc.c.layoutComplete);
                        }
                        return null;
                    case 4:
                        OrderDetailFragment.a aVar5 = OrderDetailFragment.f32510k0;
                        View view4 = orderDetailFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Jc.c.tvCustomerService);
                        }
                        return null;
                    case 5:
                        OrderDetailFragment.a aVar6 = OrderDetailFragment.f32510k0;
                        View view5 = orderDetailFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Jc.c.tvShareReceipt);
                        }
                        return null;
                    case 6:
                        OrderDetailFragment.a aVar7 = OrderDetailFragment.f32510k0;
                        View view6 = orderDetailFragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Jc.c.layoutOrderInfo);
                        }
                        return null;
                    case 7:
                        OrderDetailFragment.a aVar8 = OrderDetailFragment.f32510k0;
                        View view7 = orderDetailFragment.f27318b;
                        if (view7 != null) {
                            return (LinearLayout) view7.findViewById(Jc.c.layoutBillOrderInfo);
                        }
                        return null;
                    case 8:
                        OrderDetailFragment.a aVar9 = OrderDetailFragment.f32510k0;
                        View view8 = orderDetailFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Jc.c.tvStatus);
                        }
                        return null;
                    case 9:
                        OrderDetailFragment.a aVar10 = OrderDetailFragment.f32510k0;
                        View view9 = orderDetailFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Jc.c.tvAmount);
                        }
                        return null;
                    case 10:
                        OrderDetailFragment.a aVar11 = OrderDetailFragment.f32510k0;
                        View view10 = orderDetailFragment.f27318b;
                        if (view10 != null) {
                            return (RoundedTextView) view10.findViewById(Jc.c.rtvTryAgain);
                        }
                        return null;
                    case 11:
                        OrderDetailFragment.a aVar12 = OrderDetailFragment.f32510k0;
                        View view11 = orderDetailFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Jc.c.tvName);
                        }
                        return null;
                    case 12:
                        OrderDetailFragment.a aVar13 = OrderDetailFragment.f32510k0;
                        View view12 = orderDetailFragment.f27318b;
                        if (view12 != null) {
                            return (NestedScrollView) view12.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 13:
                        OrderDetailFragment.a aVar14 = OrderDetailFragment.f32510k0;
                        View view13 = orderDetailFragment.f27318b;
                        if (view13 != null) {
                            return (PpTitleBar) view13.findViewById(Jc.c.ctb);
                        }
                        return null;
                    case 14:
                        OrderDetailFragment.a aVar15 = OrderDetailFragment.f32510k0;
                        Bundle arguments2 = orderDetailFragment.getArguments();
                        return (arguments2 == null || (string2 = arguments2.getString("orderNo")) == null) ? "" : string2;
                    default:
                        OrderDetailFragment.a aVar16 = OrderDetailFragment.f32510k0;
                        Bundle arguments3 = orderDetailFragment.getArguments();
                        return Integer.valueOf(arguments3 != null ? arguments3.getInt("order_detail_type") : 1);
                }
            }
        });
        final int i14 = 5;
        this.f32525w = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderDetailFragment f32589b;

            {
                this.f32589b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                String string2;
                OrderDetailFragment orderDetailFragment = this.f32589b;
                switch (i14) {
                    case 0:
                        OrderDetailFragment.a aVar = OrderDetailFragment.f32510k0;
                        Bundle arguments = orderDetailFragment.getArguments();
                        return (arguments == null || (string = arguments.getString("transType")) == null) ? TransType.TRANS_TYPE_FIXED_SAVING : string;
                    case 1:
                        OrderDetailFragment.a aVar2 = OrderDetailFragment.f32510k0;
                        View view = orderDetailFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvCancel);
                        }
                        return null;
                    case 2:
                        OrderDetailFragment.a aVar3 = OrderDetailFragment.f32510k0;
                        View view2 = orderDetailFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Jc.c.layoutCancelAndTry);
                        }
                        return null;
                    case 3:
                        OrderDetailFragment.a aVar4 = OrderDetailFragment.f32510k0;
                        View view3 = orderDetailFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(Jc.c.layoutComplete);
                        }
                        return null;
                    case 4:
                        OrderDetailFragment.a aVar5 = OrderDetailFragment.f32510k0;
                        View view4 = orderDetailFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Jc.c.tvCustomerService);
                        }
                        return null;
                    case 5:
                        OrderDetailFragment.a aVar6 = OrderDetailFragment.f32510k0;
                        View view5 = orderDetailFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Jc.c.tvShareReceipt);
                        }
                        return null;
                    case 6:
                        OrderDetailFragment.a aVar7 = OrderDetailFragment.f32510k0;
                        View view6 = orderDetailFragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Jc.c.layoutOrderInfo);
                        }
                        return null;
                    case 7:
                        OrderDetailFragment.a aVar8 = OrderDetailFragment.f32510k0;
                        View view7 = orderDetailFragment.f27318b;
                        if (view7 != null) {
                            return (LinearLayout) view7.findViewById(Jc.c.layoutBillOrderInfo);
                        }
                        return null;
                    case 8:
                        OrderDetailFragment.a aVar9 = OrderDetailFragment.f32510k0;
                        View view8 = orderDetailFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Jc.c.tvStatus);
                        }
                        return null;
                    case 9:
                        OrderDetailFragment.a aVar10 = OrderDetailFragment.f32510k0;
                        View view9 = orderDetailFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Jc.c.tvAmount);
                        }
                        return null;
                    case 10:
                        OrderDetailFragment.a aVar11 = OrderDetailFragment.f32510k0;
                        View view10 = orderDetailFragment.f27318b;
                        if (view10 != null) {
                            return (RoundedTextView) view10.findViewById(Jc.c.rtvTryAgain);
                        }
                        return null;
                    case 11:
                        OrderDetailFragment.a aVar12 = OrderDetailFragment.f32510k0;
                        View view11 = orderDetailFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Jc.c.tvName);
                        }
                        return null;
                    case 12:
                        OrderDetailFragment.a aVar13 = OrderDetailFragment.f32510k0;
                        View view12 = orderDetailFragment.f27318b;
                        if (view12 != null) {
                            return (NestedScrollView) view12.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 13:
                        OrderDetailFragment.a aVar14 = OrderDetailFragment.f32510k0;
                        View view13 = orderDetailFragment.f27318b;
                        if (view13 != null) {
                            return (PpTitleBar) view13.findViewById(Jc.c.ctb);
                        }
                        return null;
                    case 14:
                        OrderDetailFragment.a aVar15 = OrderDetailFragment.f32510k0;
                        Bundle arguments2 = orderDetailFragment.getArguments();
                        return (arguments2 == null || (string2 = arguments2.getString("orderNo")) == null) ? "" : string2;
                    default:
                        OrderDetailFragment.a aVar16 = OrderDetailFragment.f32510k0;
                        Bundle arguments3 = orderDetailFragment.getArguments();
                        return Integer.valueOf(arguments3 != null ? arguments3.getInt("order_detail_type") : 1);
                }
            }
        });
        final int i15 = 6;
        this.f32511A = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderDetailFragment f32589b;

            {
                this.f32589b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                String string2;
                OrderDetailFragment orderDetailFragment = this.f32589b;
                switch (i15) {
                    case 0:
                        OrderDetailFragment.a aVar = OrderDetailFragment.f32510k0;
                        Bundle arguments = orderDetailFragment.getArguments();
                        return (arguments == null || (string = arguments.getString("transType")) == null) ? TransType.TRANS_TYPE_FIXED_SAVING : string;
                    case 1:
                        OrderDetailFragment.a aVar2 = OrderDetailFragment.f32510k0;
                        View view = orderDetailFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvCancel);
                        }
                        return null;
                    case 2:
                        OrderDetailFragment.a aVar3 = OrderDetailFragment.f32510k0;
                        View view2 = orderDetailFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Jc.c.layoutCancelAndTry);
                        }
                        return null;
                    case 3:
                        OrderDetailFragment.a aVar4 = OrderDetailFragment.f32510k0;
                        View view3 = orderDetailFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(Jc.c.layoutComplete);
                        }
                        return null;
                    case 4:
                        OrderDetailFragment.a aVar5 = OrderDetailFragment.f32510k0;
                        View view4 = orderDetailFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Jc.c.tvCustomerService);
                        }
                        return null;
                    case 5:
                        OrderDetailFragment.a aVar6 = OrderDetailFragment.f32510k0;
                        View view5 = orderDetailFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Jc.c.tvShareReceipt);
                        }
                        return null;
                    case 6:
                        OrderDetailFragment.a aVar7 = OrderDetailFragment.f32510k0;
                        View view6 = orderDetailFragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Jc.c.layoutOrderInfo);
                        }
                        return null;
                    case 7:
                        OrderDetailFragment.a aVar8 = OrderDetailFragment.f32510k0;
                        View view7 = orderDetailFragment.f27318b;
                        if (view7 != null) {
                            return (LinearLayout) view7.findViewById(Jc.c.layoutBillOrderInfo);
                        }
                        return null;
                    case 8:
                        OrderDetailFragment.a aVar9 = OrderDetailFragment.f32510k0;
                        View view8 = orderDetailFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Jc.c.tvStatus);
                        }
                        return null;
                    case 9:
                        OrderDetailFragment.a aVar10 = OrderDetailFragment.f32510k0;
                        View view9 = orderDetailFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Jc.c.tvAmount);
                        }
                        return null;
                    case 10:
                        OrderDetailFragment.a aVar11 = OrderDetailFragment.f32510k0;
                        View view10 = orderDetailFragment.f27318b;
                        if (view10 != null) {
                            return (RoundedTextView) view10.findViewById(Jc.c.rtvTryAgain);
                        }
                        return null;
                    case 11:
                        OrderDetailFragment.a aVar12 = OrderDetailFragment.f32510k0;
                        View view11 = orderDetailFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Jc.c.tvName);
                        }
                        return null;
                    case 12:
                        OrderDetailFragment.a aVar13 = OrderDetailFragment.f32510k0;
                        View view12 = orderDetailFragment.f27318b;
                        if (view12 != null) {
                            return (NestedScrollView) view12.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 13:
                        OrderDetailFragment.a aVar14 = OrderDetailFragment.f32510k0;
                        View view13 = orderDetailFragment.f27318b;
                        if (view13 != null) {
                            return (PpTitleBar) view13.findViewById(Jc.c.ctb);
                        }
                        return null;
                    case 14:
                        OrderDetailFragment.a aVar15 = OrderDetailFragment.f32510k0;
                        Bundle arguments2 = orderDetailFragment.getArguments();
                        return (arguments2 == null || (string2 = arguments2.getString("orderNo")) == null) ? "" : string2;
                    default:
                        OrderDetailFragment.a aVar16 = OrderDetailFragment.f32510k0;
                        Bundle arguments3 = orderDetailFragment.getArguments();
                        return Integer.valueOf(arguments3 != null ? arguments3.getInt("order_detail_type") : 1);
                }
            }
        });
        final int i16 = 7;
        this.f32512B = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderDetailFragment f32589b;

            {
                this.f32589b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                String string2;
                OrderDetailFragment orderDetailFragment = this.f32589b;
                switch (i16) {
                    case 0:
                        OrderDetailFragment.a aVar = OrderDetailFragment.f32510k0;
                        Bundle arguments = orderDetailFragment.getArguments();
                        return (arguments == null || (string = arguments.getString("transType")) == null) ? TransType.TRANS_TYPE_FIXED_SAVING : string;
                    case 1:
                        OrderDetailFragment.a aVar2 = OrderDetailFragment.f32510k0;
                        View view = orderDetailFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvCancel);
                        }
                        return null;
                    case 2:
                        OrderDetailFragment.a aVar3 = OrderDetailFragment.f32510k0;
                        View view2 = orderDetailFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Jc.c.layoutCancelAndTry);
                        }
                        return null;
                    case 3:
                        OrderDetailFragment.a aVar4 = OrderDetailFragment.f32510k0;
                        View view3 = orderDetailFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(Jc.c.layoutComplete);
                        }
                        return null;
                    case 4:
                        OrderDetailFragment.a aVar5 = OrderDetailFragment.f32510k0;
                        View view4 = orderDetailFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Jc.c.tvCustomerService);
                        }
                        return null;
                    case 5:
                        OrderDetailFragment.a aVar6 = OrderDetailFragment.f32510k0;
                        View view5 = orderDetailFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Jc.c.tvShareReceipt);
                        }
                        return null;
                    case 6:
                        OrderDetailFragment.a aVar7 = OrderDetailFragment.f32510k0;
                        View view6 = orderDetailFragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Jc.c.layoutOrderInfo);
                        }
                        return null;
                    case 7:
                        OrderDetailFragment.a aVar8 = OrderDetailFragment.f32510k0;
                        View view7 = orderDetailFragment.f27318b;
                        if (view7 != null) {
                            return (LinearLayout) view7.findViewById(Jc.c.layoutBillOrderInfo);
                        }
                        return null;
                    case 8:
                        OrderDetailFragment.a aVar9 = OrderDetailFragment.f32510k0;
                        View view8 = orderDetailFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Jc.c.tvStatus);
                        }
                        return null;
                    case 9:
                        OrderDetailFragment.a aVar10 = OrderDetailFragment.f32510k0;
                        View view9 = orderDetailFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Jc.c.tvAmount);
                        }
                        return null;
                    case 10:
                        OrderDetailFragment.a aVar11 = OrderDetailFragment.f32510k0;
                        View view10 = orderDetailFragment.f27318b;
                        if (view10 != null) {
                            return (RoundedTextView) view10.findViewById(Jc.c.rtvTryAgain);
                        }
                        return null;
                    case 11:
                        OrderDetailFragment.a aVar12 = OrderDetailFragment.f32510k0;
                        View view11 = orderDetailFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Jc.c.tvName);
                        }
                        return null;
                    case 12:
                        OrderDetailFragment.a aVar13 = OrderDetailFragment.f32510k0;
                        View view12 = orderDetailFragment.f27318b;
                        if (view12 != null) {
                            return (NestedScrollView) view12.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 13:
                        OrderDetailFragment.a aVar14 = OrderDetailFragment.f32510k0;
                        View view13 = orderDetailFragment.f27318b;
                        if (view13 != null) {
                            return (PpTitleBar) view13.findViewById(Jc.c.ctb);
                        }
                        return null;
                    case 14:
                        OrderDetailFragment.a aVar15 = OrderDetailFragment.f32510k0;
                        Bundle arguments2 = orderDetailFragment.getArguments();
                        return (arguments2 == null || (string2 = arguments2.getString("orderNo")) == null) ? "" : string2;
                    default:
                        OrderDetailFragment.a aVar16 = OrderDetailFragment.f32510k0;
                        Bundle arguments3 = orderDetailFragment.getArguments();
                        return Integer.valueOf(arguments3 != null ? arguments3.getInt("order_detail_type") : 1);
                }
            }
        });
        final int i17 = 8;
        this.f32513C = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderDetailFragment f32589b;

            {
                this.f32589b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                String string2;
                OrderDetailFragment orderDetailFragment = this.f32589b;
                switch (i17) {
                    case 0:
                        OrderDetailFragment.a aVar = OrderDetailFragment.f32510k0;
                        Bundle arguments = orderDetailFragment.getArguments();
                        return (arguments == null || (string = arguments.getString("transType")) == null) ? TransType.TRANS_TYPE_FIXED_SAVING : string;
                    case 1:
                        OrderDetailFragment.a aVar2 = OrderDetailFragment.f32510k0;
                        View view = orderDetailFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvCancel);
                        }
                        return null;
                    case 2:
                        OrderDetailFragment.a aVar3 = OrderDetailFragment.f32510k0;
                        View view2 = orderDetailFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Jc.c.layoutCancelAndTry);
                        }
                        return null;
                    case 3:
                        OrderDetailFragment.a aVar4 = OrderDetailFragment.f32510k0;
                        View view3 = orderDetailFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(Jc.c.layoutComplete);
                        }
                        return null;
                    case 4:
                        OrderDetailFragment.a aVar5 = OrderDetailFragment.f32510k0;
                        View view4 = orderDetailFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Jc.c.tvCustomerService);
                        }
                        return null;
                    case 5:
                        OrderDetailFragment.a aVar6 = OrderDetailFragment.f32510k0;
                        View view5 = orderDetailFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Jc.c.tvShareReceipt);
                        }
                        return null;
                    case 6:
                        OrderDetailFragment.a aVar7 = OrderDetailFragment.f32510k0;
                        View view6 = orderDetailFragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Jc.c.layoutOrderInfo);
                        }
                        return null;
                    case 7:
                        OrderDetailFragment.a aVar8 = OrderDetailFragment.f32510k0;
                        View view7 = orderDetailFragment.f27318b;
                        if (view7 != null) {
                            return (LinearLayout) view7.findViewById(Jc.c.layoutBillOrderInfo);
                        }
                        return null;
                    case 8:
                        OrderDetailFragment.a aVar9 = OrderDetailFragment.f32510k0;
                        View view8 = orderDetailFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Jc.c.tvStatus);
                        }
                        return null;
                    case 9:
                        OrderDetailFragment.a aVar10 = OrderDetailFragment.f32510k0;
                        View view9 = orderDetailFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Jc.c.tvAmount);
                        }
                        return null;
                    case 10:
                        OrderDetailFragment.a aVar11 = OrderDetailFragment.f32510k0;
                        View view10 = orderDetailFragment.f27318b;
                        if (view10 != null) {
                            return (RoundedTextView) view10.findViewById(Jc.c.rtvTryAgain);
                        }
                        return null;
                    case 11:
                        OrderDetailFragment.a aVar12 = OrderDetailFragment.f32510k0;
                        View view11 = orderDetailFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Jc.c.tvName);
                        }
                        return null;
                    case 12:
                        OrderDetailFragment.a aVar13 = OrderDetailFragment.f32510k0;
                        View view12 = orderDetailFragment.f27318b;
                        if (view12 != null) {
                            return (NestedScrollView) view12.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 13:
                        OrderDetailFragment.a aVar14 = OrderDetailFragment.f32510k0;
                        View view13 = orderDetailFragment.f27318b;
                        if (view13 != null) {
                            return (PpTitleBar) view13.findViewById(Jc.c.ctb);
                        }
                        return null;
                    case 14:
                        OrderDetailFragment.a aVar15 = OrderDetailFragment.f32510k0;
                        Bundle arguments2 = orderDetailFragment.getArguments();
                        return (arguments2 == null || (string2 = arguments2.getString("orderNo")) == null) ? "" : string2;
                    default:
                        OrderDetailFragment.a aVar16 = OrderDetailFragment.f32510k0;
                        Bundle arguments3 = orderDetailFragment.getArguments();
                        return Integer.valueOf(arguments3 != null ? arguments3.getInt("order_detail_type") : 1);
                }
            }
        });
        final int i18 = 9;
        this.f32514H = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderDetailFragment f32589b;

            {
                this.f32589b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                String string2;
                OrderDetailFragment orderDetailFragment = this.f32589b;
                switch (i18) {
                    case 0:
                        OrderDetailFragment.a aVar = OrderDetailFragment.f32510k0;
                        Bundle arguments = orderDetailFragment.getArguments();
                        return (arguments == null || (string = arguments.getString("transType")) == null) ? TransType.TRANS_TYPE_FIXED_SAVING : string;
                    case 1:
                        OrderDetailFragment.a aVar2 = OrderDetailFragment.f32510k0;
                        View view = orderDetailFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvCancel);
                        }
                        return null;
                    case 2:
                        OrderDetailFragment.a aVar3 = OrderDetailFragment.f32510k0;
                        View view2 = orderDetailFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Jc.c.layoutCancelAndTry);
                        }
                        return null;
                    case 3:
                        OrderDetailFragment.a aVar4 = OrderDetailFragment.f32510k0;
                        View view3 = orderDetailFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(Jc.c.layoutComplete);
                        }
                        return null;
                    case 4:
                        OrderDetailFragment.a aVar5 = OrderDetailFragment.f32510k0;
                        View view4 = orderDetailFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Jc.c.tvCustomerService);
                        }
                        return null;
                    case 5:
                        OrderDetailFragment.a aVar6 = OrderDetailFragment.f32510k0;
                        View view5 = orderDetailFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Jc.c.tvShareReceipt);
                        }
                        return null;
                    case 6:
                        OrderDetailFragment.a aVar7 = OrderDetailFragment.f32510k0;
                        View view6 = orderDetailFragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Jc.c.layoutOrderInfo);
                        }
                        return null;
                    case 7:
                        OrderDetailFragment.a aVar8 = OrderDetailFragment.f32510k0;
                        View view7 = orderDetailFragment.f27318b;
                        if (view7 != null) {
                            return (LinearLayout) view7.findViewById(Jc.c.layoutBillOrderInfo);
                        }
                        return null;
                    case 8:
                        OrderDetailFragment.a aVar9 = OrderDetailFragment.f32510k0;
                        View view8 = orderDetailFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Jc.c.tvStatus);
                        }
                        return null;
                    case 9:
                        OrderDetailFragment.a aVar10 = OrderDetailFragment.f32510k0;
                        View view9 = orderDetailFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Jc.c.tvAmount);
                        }
                        return null;
                    case 10:
                        OrderDetailFragment.a aVar11 = OrderDetailFragment.f32510k0;
                        View view10 = orderDetailFragment.f27318b;
                        if (view10 != null) {
                            return (RoundedTextView) view10.findViewById(Jc.c.rtvTryAgain);
                        }
                        return null;
                    case 11:
                        OrderDetailFragment.a aVar12 = OrderDetailFragment.f32510k0;
                        View view11 = orderDetailFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Jc.c.tvName);
                        }
                        return null;
                    case 12:
                        OrderDetailFragment.a aVar13 = OrderDetailFragment.f32510k0;
                        View view12 = orderDetailFragment.f27318b;
                        if (view12 != null) {
                            return (NestedScrollView) view12.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 13:
                        OrderDetailFragment.a aVar14 = OrderDetailFragment.f32510k0;
                        View view13 = orderDetailFragment.f27318b;
                        if (view13 != null) {
                            return (PpTitleBar) view13.findViewById(Jc.c.ctb);
                        }
                        return null;
                    case 14:
                        OrderDetailFragment.a aVar15 = OrderDetailFragment.f32510k0;
                        Bundle arguments2 = orderDetailFragment.getArguments();
                        return (arguments2 == null || (string2 = arguments2.getString("orderNo")) == null) ? "" : string2;
                    default:
                        OrderDetailFragment.a aVar16 = OrderDetailFragment.f32510k0;
                        Bundle arguments3 = orderDetailFragment.getArguments();
                        return Integer.valueOf(arguments3 != null ? arguments3.getInt("order_detail_type") : 1);
                }
            }
        });
        final int i19 = 11;
        this.f32515L = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderDetailFragment f32589b;

            {
                this.f32589b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                String string2;
                OrderDetailFragment orderDetailFragment = this.f32589b;
                switch (i19) {
                    case 0:
                        OrderDetailFragment.a aVar = OrderDetailFragment.f32510k0;
                        Bundle arguments = orderDetailFragment.getArguments();
                        return (arguments == null || (string = arguments.getString("transType")) == null) ? TransType.TRANS_TYPE_FIXED_SAVING : string;
                    case 1:
                        OrderDetailFragment.a aVar2 = OrderDetailFragment.f32510k0;
                        View view = orderDetailFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvCancel);
                        }
                        return null;
                    case 2:
                        OrderDetailFragment.a aVar3 = OrderDetailFragment.f32510k0;
                        View view2 = orderDetailFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Jc.c.layoutCancelAndTry);
                        }
                        return null;
                    case 3:
                        OrderDetailFragment.a aVar4 = OrderDetailFragment.f32510k0;
                        View view3 = orderDetailFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(Jc.c.layoutComplete);
                        }
                        return null;
                    case 4:
                        OrderDetailFragment.a aVar5 = OrderDetailFragment.f32510k0;
                        View view4 = orderDetailFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Jc.c.tvCustomerService);
                        }
                        return null;
                    case 5:
                        OrderDetailFragment.a aVar6 = OrderDetailFragment.f32510k0;
                        View view5 = orderDetailFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Jc.c.tvShareReceipt);
                        }
                        return null;
                    case 6:
                        OrderDetailFragment.a aVar7 = OrderDetailFragment.f32510k0;
                        View view6 = orderDetailFragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Jc.c.layoutOrderInfo);
                        }
                        return null;
                    case 7:
                        OrderDetailFragment.a aVar8 = OrderDetailFragment.f32510k0;
                        View view7 = orderDetailFragment.f27318b;
                        if (view7 != null) {
                            return (LinearLayout) view7.findViewById(Jc.c.layoutBillOrderInfo);
                        }
                        return null;
                    case 8:
                        OrderDetailFragment.a aVar9 = OrderDetailFragment.f32510k0;
                        View view8 = orderDetailFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Jc.c.tvStatus);
                        }
                        return null;
                    case 9:
                        OrderDetailFragment.a aVar10 = OrderDetailFragment.f32510k0;
                        View view9 = orderDetailFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Jc.c.tvAmount);
                        }
                        return null;
                    case 10:
                        OrderDetailFragment.a aVar11 = OrderDetailFragment.f32510k0;
                        View view10 = orderDetailFragment.f27318b;
                        if (view10 != null) {
                            return (RoundedTextView) view10.findViewById(Jc.c.rtvTryAgain);
                        }
                        return null;
                    case 11:
                        OrderDetailFragment.a aVar12 = OrderDetailFragment.f32510k0;
                        View view11 = orderDetailFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Jc.c.tvName);
                        }
                        return null;
                    case 12:
                        OrderDetailFragment.a aVar13 = OrderDetailFragment.f32510k0;
                        View view12 = orderDetailFragment.f27318b;
                        if (view12 != null) {
                            return (NestedScrollView) view12.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 13:
                        OrderDetailFragment.a aVar14 = OrderDetailFragment.f32510k0;
                        View view13 = orderDetailFragment.f27318b;
                        if (view13 != null) {
                            return (PpTitleBar) view13.findViewById(Jc.c.ctb);
                        }
                        return null;
                    case 14:
                        OrderDetailFragment.a aVar15 = OrderDetailFragment.f32510k0;
                        Bundle arguments2 = orderDetailFragment.getArguments();
                        return (arguments2 == null || (string2 = arguments2.getString("orderNo")) == null) ? "" : string2;
                    default:
                        OrderDetailFragment.a aVar16 = OrderDetailFragment.f32510k0;
                        Bundle arguments3 = orderDetailFragment.getArguments();
                        return Integer.valueOf(arguments3 != null ? arguments3.getInt("order_detail_type") : 1);
                }
            }
        });
        final int i20 = 12;
        this.f32516M = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderDetailFragment f32589b;

            {
                this.f32589b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                String string2;
                OrderDetailFragment orderDetailFragment = this.f32589b;
                switch (i20) {
                    case 0:
                        OrderDetailFragment.a aVar = OrderDetailFragment.f32510k0;
                        Bundle arguments = orderDetailFragment.getArguments();
                        return (arguments == null || (string = arguments.getString("transType")) == null) ? TransType.TRANS_TYPE_FIXED_SAVING : string;
                    case 1:
                        OrderDetailFragment.a aVar2 = OrderDetailFragment.f32510k0;
                        View view = orderDetailFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvCancel);
                        }
                        return null;
                    case 2:
                        OrderDetailFragment.a aVar3 = OrderDetailFragment.f32510k0;
                        View view2 = orderDetailFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Jc.c.layoutCancelAndTry);
                        }
                        return null;
                    case 3:
                        OrderDetailFragment.a aVar4 = OrderDetailFragment.f32510k0;
                        View view3 = orderDetailFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(Jc.c.layoutComplete);
                        }
                        return null;
                    case 4:
                        OrderDetailFragment.a aVar5 = OrderDetailFragment.f32510k0;
                        View view4 = orderDetailFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Jc.c.tvCustomerService);
                        }
                        return null;
                    case 5:
                        OrderDetailFragment.a aVar6 = OrderDetailFragment.f32510k0;
                        View view5 = orderDetailFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Jc.c.tvShareReceipt);
                        }
                        return null;
                    case 6:
                        OrderDetailFragment.a aVar7 = OrderDetailFragment.f32510k0;
                        View view6 = orderDetailFragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Jc.c.layoutOrderInfo);
                        }
                        return null;
                    case 7:
                        OrderDetailFragment.a aVar8 = OrderDetailFragment.f32510k0;
                        View view7 = orderDetailFragment.f27318b;
                        if (view7 != null) {
                            return (LinearLayout) view7.findViewById(Jc.c.layoutBillOrderInfo);
                        }
                        return null;
                    case 8:
                        OrderDetailFragment.a aVar9 = OrderDetailFragment.f32510k0;
                        View view8 = orderDetailFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Jc.c.tvStatus);
                        }
                        return null;
                    case 9:
                        OrderDetailFragment.a aVar10 = OrderDetailFragment.f32510k0;
                        View view9 = orderDetailFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Jc.c.tvAmount);
                        }
                        return null;
                    case 10:
                        OrderDetailFragment.a aVar11 = OrderDetailFragment.f32510k0;
                        View view10 = orderDetailFragment.f27318b;
                        if (view10 != null) {
                            return (RoundedTextView) view10.findViewById(Jc.c.rtvTryAgain);
                        }
                        return null;
                    case 11:
                        OrderDetailFragment.a aVar12 = OrderDetailFragment.f32510k0;
                        View view11 = orderDetailFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Jc.c.tvName);
                        }
                        return null;
                    case 12:
                        OrderDetailFragment.a aVar13 = OrderDetailFragment.f32510k0;
                        View view12 = orderDetailFragment.f27318b;
                        if (view12 != null) {
                            return (NestedScrollView) view12.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 13:
                        OrderDetailFragment.a aVar14 = OrderDetailFragment.f32510k0;
                        View view13 = orderDetailFragment.f27318b;
                        if (view13 != null) {
                            return (PpTitleBar) view13.findViewById(Jc.c.ctb);
                        }
                        return null;
                    case 14:
                        OrderDetailFragment.a aVar15 = OrderDetailFragment.f32510k0;
                        Bundle arguments2 = orderDetailFragment.getArguments();
                        return (arguments2 == null || (string2 = arguments2.getString("orderNo")) == null) ? "" : string2;
                    default:
                        OrderDetailFragment.a aVar16 = OrderDetailFragment.f32510k0;
                        Bundle arguments3 = orderDetailFragment.getArguments();
                        return Integer.valueOf(arguments3 != null ? arguments3.getInt("order_detail_type") : 1);
                }
            }
        });
        final int i21 = 13;
        this.f32517Q = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderDetailFragment f32589b;

            {
                this.f32589b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                String string2;
                OrderDetailFragment orderDetailFragment = this.f32589b;
                switch (i21) {
                    case 0:
                        OrderDetailFragment.a aVar = OrderDetailFragment.f32510k0;
                        Bundle arguments = orderDetailFragment.getArguments();
                        return (arguments == null || (string = arguments.getString("transType")) == null) ? TransType.TRANS_TYPE_FIXED_SAVING : string;
                    case 1:
                        OrderDetailFragment.a aVar2 = OrderDetailFragment.f32510k0;
                        View view = orderDetailFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvCancel);
                        }
                        return null;
                    case 2:
                        OrderDetailFragment.a aVar3 = OrderDetailFragment.f32510k0;
                        View view2 = orderDetailFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Jc.c.layoutCancelAndTry);
                        }
                        return null;
                    case 3:
                        OrderDetailFragment.a aVar4 = OrderDetailFragment.f32510k0;
                        View view3 = orderDetailFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(Jc.c.layoutComplete);
                        }
                        return null;
                    case 4:
                        OrderDetailFragment.a aVar5 = OrderDetailFragment.f32510k0;
                        View view4 = orderDetailFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Jc.c.tvCustomerService);
                        }
                        return null;
                    case 5:
                        OrderDetailFragment.a aVar6 = OrderDetailFragment.f32510k0;
                        View view5 = orderDetailFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Jc.c.tvShareReceipt);
                        }
                        return null;
                    case 6:
                        OrderDetailFragment.a aVar7 = OrderDetailFragment.f32510k0;
                        View view6 = orderDetailFragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Jc.c.layoutOrderInfo);
                        }
                        return null;
                    case 7:
                        OrderDetailFragment.a aVar8 = OrderDetailFragment.f32510k0;
                        View view7 = orderDetailFragment.f27318b;
                        if (view7 != null) {
                            return (LinearLayout) view7.findViewById(Jc.c.layoutBillOrderInfo);
                        }
                        return null;
                    case 8:
                        OrderDetailFragment.a aVar9 = OrderDetailFragment.f32510k0;
                        View view8 = orderDetailFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Jc.c.tvStatus);
                        }
                        return null;
                    case 9:
                        OrderDetailFragment.a aVar10 = OrderDetailFragment.f32510k0;
                        View view9 = orderDetailFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Jc.c.tvAmount);
                        }
                        return null;
                    case 10:
                        OrderDetailFragment.a aVar11 = OrderDetailFragment.f32510k0;
                        View view10 = orderDetailFragment.f27318b;
                        if (view10 != null) {
                            return (RoundedTextView) view10.findViewById(Jc.c.rtvTryAgain);
                        }
                        return null;
                    case 11:
                        OrderDetailFragment.a aVar12 = OrderDetailFragment.f32510k0;
                        View view11 = orderDetailFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Jc.c.tvName);
                        }
                        return null;
                    case 12:
                        OrderDetailFragment.a aVar13 = OrderDetailFragment.f32510k0;
                        View view12 = orderDetailFragment.f27318b;
                        if (view12 != null) {
                            return (NestedScrollView) view12.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 13:
                        OrderDetailFragment.a aVar14 = OrderDetailFragment.f32510k0;
                        View view13 = orderDetailFragment.f27318b;
                        if (view13 != null) {
                            return (PpTitleBar) view13.findViewById(Jc.c.ctb);
                        }
                        return null;
                    case 14:
                        OrderDetailFragment.a aVar15 = OrderDetailFragment.f32510k0;
                        Bundle arguments2 = orderDetailFragment.getArguments();
                        return (arguments2 == null || (string2 = arguments2.getString("orderNo")) == null) ? "" : string2;
                    default:
                        OrderDetailFragment.a aVar16 = OrderDetailFragment.f32510k0;
                        Bundle arguments3 = orderDetailFragment.getArguments();
                        return Integer.valueOf(arguments3 != null ? arguments3.getInt("order_detail_type") : 1);
                }
            }
        });
        final int i22 = 14;
        this.f32518X = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderDetailFragment f32589b;

            {
                this.f32589b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                String string2;
                OrderDetailFragment orderDetailFragment = this.f32589b;
                switch (i22) {
                    case 0:
                        OrderDetailFragment.a aVar = OrderDetailFragment.f32510k0;
                        Bundle arguments = orderDetailFragment.getArguments();
                        return (arguments == null || (string = arguments.getString("transType")) == null) ? TransType.TRANS_TYPE_FIXED_SAVING : string;
                    case 1:
                        OrderDetailFragment.a aVar2 = OrderDetailFragment.f32510k0;
                        View view = orderDetailFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvCancel);
                        }
                        return null;
                    case 2:
                        OrderDetailFragment.a aVar3 = OrderDetailFragment.f32510k0;
                        View view2 = orderDetailFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Jc.c.layoutCancelAndTry);
                        }
                        return null;
                    case 3:
                        OrderDetailFragment.a aVar4 = OrderDetailFragment.f32510k0;
                        View view3 = orderDetailFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(Jc.c.layoutComplete);
                        }
                        return null;
                    case 4:
                        OrderDetailFragment.a aVar5 = OrderDetailFragment.f32510k0;
                        View view4 = orderDetailFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Jc.c.tvCustomerService);
                        }
                        return null;
                    case 5:
                        OrderDetailFragment.a aVar6 = OrderDetailFragment.f32510k0;
                        View view5 = orderDetailFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Jc.c.tvShareReceipt);
                        }
                        return null;
                    case 6:
                        OrderDetailFragment.a aVar7 = OrderDetailFragment.f32510k0;
                        View view6 = orderDetailFragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Jc.c.layoutOrderInfo);
                        }
                        return null;
                    case 7:
                        OrderDetailFragment.a aVar8 = OrderDetailFragment.f32510k0;
                        View view7 = orderDetailFragment.f27318b;
                        if (view7 != null) {
                            return (LinearLayout) view7.findViewById(Jc.c.layoutBillOrderInfo);
                        }
                        return null;
                    case 8:
                        OrderDetailFragment.a aVar9 = OrderDetailFragment.f32510k0;
                        View view8 = orderDetailFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Jc.c.tvStatus);
                        }
                        return null;
                    case 9:
                        OrderDetailFragment.a aVar10 = OrderDetailFragment.f32510k0;
                        View view9 = orderDetailFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Jc.c.tvAmount);
                        }
                        return null;
                    case 10:
                        OrderDetailFragment.a aVar11 = OrderDetailFragment.f32510k0;
                        View view10 = orderDetailFragment.f27318b;
                        if (view10 != null) {
                            return (RoundedTextView) view10.findViewById(Jc.c.rtvTryAgain);
                        }
                        return null;
                    case 11:
                        OrderDetailFragment.a aVar12 = OrderDetailFragment.f32510k0;
                        View view11 = orderDetailFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Jc.c.tvName);
                        }
                        return null;
                    case 12:
                        OrderDetailFragment.a aVar13 = OrderDetailFragment.f32510k0;
                        View view12 = orderDetailFragment.f27318b;
                        if (view12 != null) {
                            return (NestedScrollView) view12.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 13:
                        OrderDetailFragment.a aVar14 = OrderDetailFragment.f32510k0;
                        View view13 = orderDetailFragment.f27318b;
                        if (view13 != null) {
                            return (PpTitleBar) view13.findViewById(Jc.c.ctb);
                        }
                        return null;
                    case 14:
                        OrderDetailFragment.a aVar15 = OrderDetailFragment.f32510k0;
                        Bundle arguments2 = orderDetailFragment.getArguments();
                        return (arguments2 == null || (string2 = arguments2.getString("orderNo")) == null) ? "" : string2;
                    default:
                        OrderDetailFragment.a aVar16 = OrderDetailFragment.f32510k0;
                        Bundle arguments3 = orderDetailFragment.getArguments();
                        return Integer.valueOf(arguments3 != null ? arguments3.getInt("order_detail_type") : 1);
                }
            }
        });
        final int i23 = 15;
        this.f32519Y = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderDetailFragment f32589b;

            {
                this.f32589b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                String string2;
                OrderDetailFragment orderDetailFragment = this.f32589b;
                switch (i23) {
                    case 0:
                        OrderDetailFragment.a aVar = OrderDetailFragment.f32510k0;
                        Bundle arguments = orderDetailFragment.getArguments();
                        return (arguments == null || (string = arguments.getString("transType")) == null) ? TransType.TRANS_TYPE_FIXED_SAVING : string;
                    case 1:
                        OrderDetailFragment.a aVar2 = OrderDetailFragment.f32510k0;
                        View view = orderDetailFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvCancel);
                        }
                        return null;
                    case 2:
                        OrderDetailFragment.a aVar3 = OrderDetailFragment.f32510k0;
                        View view2 = orderDetailFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Jc.c.layoutCancelAndTry);
                        }
                        return null;
                    case 3:
                        OrderDetailFragment.a aVar4 = OrderDetailFragment.f32510k0;
                        View view3 = orderDetailFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(Jc.c.layoutComplete);
                        }
                        return null;
                    case 4:
                        OrderDetailFragment.a aVar5 = OrderDetailFragment.f32510k0;
                        View view4 = orderDetailFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Jc.c.tvCustomerService);
                        }
                        return null;
                    case 5:
                        OrderDetailFragment.a aVar6 = OrderDetailFragment.f32510k0;
                        View view5 = orderDetailFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Jc.c.tvShareReceipt);
                        }
                        return null;
                    case 6:
                        OrderDetailFragment.a aVar7 = OrderDetailFragment.f32510k0;
                        View view6 = orderDetailFragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Jc.c.layoutOrderInfo);
                        }
                        return null;
                    case 7:
                        OrderDetailFragment.a aVar8 = OrderDetailFragment.f32510k0;
                        View view7 = orderDetailFragment.f27318b;
                        if (view7 != null) {
                            return (LinearLayout) view7.findViewById(Jc.c.layoutBillOrderInfo);
                        }
                        return null;
                    case 8:
                        OrderDetailFragment.a aVar9 = OrderDetailFragment.f32510k0;
                        View view8 = orderDetailFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Jc.c.tvStatus);
                        }
                        return null;
                    case 9:
                        OrderDetailFragment.a aVar10 = OrderDetailFragment.f32510k0;
                        View view9 = orderDetailFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Jc.c.tvAmount);
                        }
                        return null;
                    case 10:
                        OrderDetailFragment.a aVar11 = OrderDetailFragment.f32510k0;
                        View view10 = orderDetailFragment.f27318b;
                        if (view10 != null) {
                            return (RoundedTextView) view10.findViewById(Jc.c.rtvTryAgain);
                        }
                        return null;
                    case 11:
                        OrderDetailFragment.a aVar12 = OrderDetailFragment.f32510k0;
                        View view11 = orderDetailFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Jc.c.tvName);
                        }
                        return null;
                    case 12:
                        OrderDetailFragment.a aVar13 = OrderDetailFragment.f32510k0;
                        View view12 = orderDetailFragment.f27318b;
                        if (view12 != null) {
                            return (NestedScrollView) view12.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 13:
                        OrderDetailFragment.a aVar14 = OrderDetailFragment.f32510k0;
                        View view13 = orderDetailFragment.f27318b;
                        if (view13 != null) {
                            return (PpTitleBar) view13.findViewById(Jc.c.ctb);
                        }
                        return null;
                    case 14:
                        OrderDetailFragment.a aVar15 = OrderDetailFragment.f32510k0;
                        Bundle arguments2 = orderDetailFragment.getArguments();
                        return (arguments2 == null || (string2 = arguments2.getString("orderNo")) == null) ? "" : string2;
                    default:
                        OrderDetailFragment.a aVar16 = OrderDetailFragment.f32510k0;
                        Bundle arguments3 = orderDetailFragment.getArguments();
                        return Integer.valueOf(arguments3 != null ? arguments3.getInt("order_detail_type") : 1);
                }
            }
        });
        final int i24 = 0;
        this.f32520Z = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderDetailFragment f32589b;

            {
                this.f32589b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                String string2;
                OrderDetailFragment orderDetailFragment = this.f32589b;
                switch (i24) {
                    case 0:
                        OrderDetailFragment.a aVar = OrderDetailFragment.f32510k0;
                        Bundle arguments = orderDetailFragment.getArguments();
                        return (arguments == null || (string = arguments.getString("transType")) == null) ? TransType.TRANS_TYPE_FIXED_SAVING : string;
                    case 1:
                        OrderDetailFragment.a aVar2 = OrderDetailFragment.f32510k0;
                        View view = orderDetailFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvCancel);
                        }
                        return null;
                    case 2:
                        OrderDetailFragment.a aVar3 = OrderDetailFragment.f32510k0;
                        View view2 = orderDetailFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Jc.c.layoutCancelAndTry);
                        }
                        return null;
                    case 3:
                        OrderDetailFragment.a aVar4 = OrderDetailFragment.f32510k0;
                        View view3 = orderDetailFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(Jc.c.layoutComplete);
                        }
                        return null;
                    case 4:
                        OrderDetailFragment.a aVar5 = OrderDetailFragment.f32510k0;
                        View view4 = orderDetailFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Jc.c.tvCustomerService);
                        }
                        return null;
                    case 5:
                        OrderDetailFragment.a aVar6 = OrderDetailFragment.f32510k0;
                        View view5 = orderDetailFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Jc.c.tvShareReceipt);
                        }
                        return null;
                    case 6:
                        OrderDetailFragment.a aVar7 = OrderDetailFragment.f32510k0;
                        View view6 = orderDetailFragment.f27318b;
                        if (view6 != null) {
                            return (LinearLayout) view6.findViewById(Jc.c.layoutOrderInfo);
                        }
                        return null;
                    case 7:
                        OrderDetailFragment.a aVar8 = OrderDetailFragment.f32510k0;
                        View view7 = orderDetailFragment.f27318b;
                        if (view7 != null) {
                            return (LinearLayout) view7.findViewById(Jc.c.layoutBillOrderInfo);
                        }
                        return null;
                    case 8:
                        OrderDetailFragment.a aVar9 = OrderDetailFragment.f32510k0;
                        View view8 = orderDetailFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Jc.c.tvStatus);
                        }
                        return null;
                    case 9:
                        OrderDetailFragment.a aVar10 = OrderDetailFragment.f32510k0;
                        View view9 = orderDetailFragment.f27318b;
                        if (view9 != null) {
                            return (TextView) view9.findViewById(Jc.c.tvAmount);
                        }
                        return null;
                    case 10:
                        OrderDetailFragment.a aVar11 = OrderDetailFragment.f32510k0;
                        View view10 = orderDetailFragment.f27318b;
                        if (view10 != null) {
                            return (RoundedTextView) view10.findViewById(Jc.c.rtvTryAgain);
                        }
                        return null;
                    case 11:
                        OrderDetailFragment.a aVar12 = OrderDetailFragment.f32510k0;
                        View view11 = orderDetailFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(Jc.c.tvName);
                        }
                        return null;
                    case 12:
                        OrderDetailFragment.a aVar13 = OrderDetailFragment.f32510k0;
                        View view12 = orderDetailFragment.f27318b;
                        if (view12 != null) {
                            return (NestedScrollView) view12.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 13:
                        OrderDetailFragment.a aVar14 = OrderDetailFragment.f32510k0;
                        View view13 = orderDetailFragment.f27318b;
                        if (view13 != null) {
                            return (PpTitleBar) view13.findViewById(Jc.c.ctb);
                        }
                        return null;
                    case 14:
                        OrderDetailFragment.a aVar15 = OrderDetailFragment.f32510k0;
                        Bundle arguments2 = orderDetailFragment.getArguments();
                        return (arguments2 == null || (string2 = arguments2.getString("orderNo")) == null) ? "" : string2;
                    default:
                        OrderDetailFragment.a aVar16 = OrderDetailFragment.f32510k0;
                        Bundle arguments3 = orderDetailFragment.getArguments();
                        return Integer.valueOf(arguments3 != null ? arguments3.getInt("order_detail_type") : 1);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return Jc.d.mm_order_detail_fragment;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        if (u() == 1 && TextUtils.equals((String) this.f32520Z.getValue(), TransType.TRANS_TYPE_FIXED_SAVING)) {
            Pa.n0.g().v("Fixed_Save_Result_View_Success");
        }
        PpTitleBar ppTitleBar = (PpTitleBar) this.f32517Q.getValue();
        if (ppTitleBar != null) {
            final int i7 = 0;
            ppTitleBar.setBackButtonClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.Z

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OrderDetailFragment f32585b;

                {
                    this.f32585b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OrderDetailFragment orderDetailFragment = this.f32585b;
                    switch (i7) {
                        case 0:
                            OrderDetailFragment.a aVar = OrderDetailFragment.f32510k0;
                            if (orderDetailFragment.u() == 1) {
                                ARouter.getInstance().build("/manage_money/loading_activity").withInt("identity_type", 2).navigation();
                            }
                            androidx.fragment.app.E activity = orderDetailFragment.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                            break;
                        case 1:
                            OrderDetailFragment.a aVar2 = OrderDetailFragment.f32510k0;
                            if (TextUtils.equals(com.transsnet.palmpay.main.export.c.f31994b.getInstance().f31995a, "finance")) {
                                N8.q0.u("/main/home");
                            } else {
                                ARouter.getInstance().build("/manage_money/loading_activity").withInt("identity_type", 2).navigation();
                            }
                            androidx.fragment.app.E activity2 = orderDetailFragment.getActivity();
                            if (activity2 != null) {
                                activity2.finish();
                            }
                            break;
                        default:
                            OrderDetailFragment.a aVar3 = OrderDetailFragment.f32510k0;
                            ARouter.getInstance().build("/manage_money/loading_activity").withInt("identity_type", 2).navigation();
                            androidx.fragment.app.E activity3 = orderDetailFragment.getActivity();
                            if (activity3 != null) {
                                activity3.finish();
                            }
                            break;
                    }
                }
            });
        }
        TextView textView = (TextView) this.f32524v.getValue();
        if (textView != null) {
            textView.setOnClickListener(new ViewOnClickListenerC1478l(26));
        }
        LinearLayout linearLayout = (LinearLayout) this.t.getValue();
        if (linearLayout != null) {
            final int i10 = 1;
            linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.Z

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OrderDetailFragment f32585b;

                {
                    this.f32585b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OrderDetailFragment orderDetailFragment = this.f32585b;
                    switch (i10) {
                        case 0:
                            OrderDetailFragment.a aVar = OrderDetailFragment.f32510k0;
                            if (orderDetailFragment.u() == 1) {
                                ARouter.getInstance().build("/manage_money/loading_activity").withInt("identity_type", 2).navigation();
                            }
                            androidx.fragment.app.E activity = orderDetailFragment.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                            break;
                        case 1:
                            OrderDetailFragment.a aVar2 = OrderDetailFragment.f32510k0;
                            if (TextUtils.equals(com.transsnet.palmpay.main.export.c.f31994b.getInstance().f31995a, "finance")) {
                                N8.q0.u("/main/home");
                            } else {
                                ARouter.getInstance().build("/manage_money/loading_activity").withInt("identity_type", 2).navigation();
                            }
                            androidx.fragment.app.E activity2 = orderDetailFragment.getActivity();
                            if (activity2 != null) {
                                activity2.finish();
                            }
                            break;
                        default:
                            OrderDetailFragment.a aVar3 = OrderDetailFragment.f32510k0;
                            ARouter.getInstance().build("/manage_money/loading_activity").withInt("identity_type", 2).navigation();
                            androidx.fragment.app.E activity3 = orderDetailFragment.getActivity();
                            if (activity3 != null) {
                                activity3.finish();
                            }
                            break;
                    }
                }
            });
        }
        RoundedTextView roundedTextView = (RoundedTextView) this.f32522o.getValue();
        if (roundedTextView != null) {
            final int i11 = 2;
            roundedTextView.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.Z

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OrderDetailFragment f32585b;

                {
                    this.f32585b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OrderDetailFragment orderDetailFragment = this.f32585b;
                    switch (i11) {
                        case 0:
                            OrderDetailFragment.a aVar = OrderDetailFragment.f32510k0;
                            if (orderDetailFragment.u() == 1) {
                                ARouter.getInstance().build("/manage_money/loading_activity").withInt("identity_type", 2).navigation();
                            }
                            androidx.fragment.app.E activity = orderDetailFragment.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                            break;
                        case 1:
                            OrderDetailFragment.a aVar2 = OrderDetailFragment.f32510k0;
                            if (TextUtils.equals(com.transsnet.palmpay.main.export.c.f31994b.getInstance().f31995a, "finance")) {
                                N8.q0.u("/main/home");
                            } else {
                                ARouter.getInstance().build("/manage_money/loading_activity").withInt("identity_type", 2).navigation();
                            }
                            androidx.fragment.app.E activity2 = orderDetailFragment.getActivity();
                            if (activity2 != null) {
                                activity2.finish();
                            }
                            break;
                        default:
                            OrderDetailFragment.a aVar3 = OrderDetailFragment.f32510k0;
                            ARouter.getInstance().build("/manage_money/loading_activity").withInt("identity_type", 2).navigation();
                            androidx.fragment.app.E activity3 = orderDetailFragment.getActivity();
                            if (activity3 != null) {
                                activity3.finish();
                            }
                            break;
                    }
                }
            });
        }
        if (u() == 1) {
            C0.G.u(MessageEvent.EVENT_CREATE_SAVINGS_PLAN, org.greenrobot.eventbus.c.b());
        }
        OrderDetailViewModel orderDetailViewModel = (OrderDetailViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar = orderDetailViewModel != null ? orderDetailViewModel.f32779e : null;
        if (lVar != null) {
            lVar.e(this, new Wd.I(new T8.o(19, this, this), 24));
        }
        OrderDetailViewModel orderDetailViewModel2 = (OrderDetailViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar2 = orderDetailViewModel2 != null ? orderDetailViewModel2.f32780f : null;
        if (lVar2 != null) {
            lVar2.e(this, new Wd.I(new V8.w(this, 10), 24));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        OrderDetailViewModel orderDetailViewModel = (OrderDetailViewModel) this.f27333i;
        if (orderDetailViewModel != null) {
            AbstractC0780y.m(androidx.lifecycle.V.h(orderDetailViewModel), null, null, new Qc.b0((String) this.f32518X.getValue(), (String) this.f32520Z.getValue(), orderDetailViewModel, null), 3);
        }
        OrderDetailViewModel orderDetailViewModel2 = (OrderDetailViewModel) this.f27333i;
        if (orderDetailViewModel2 != null) {
            Intrinsics.checkNotNullParameter(TransType.TRANS_TYPE_FIXED_SAVING, "transType");
            Intrinsics.checkNotNullParameter("", "subTransType");
            AbstractC0780y.m(androidx.lifecycle.V.h(orderDetailViewModel2), null, null, new Qc.d0(orderDetailViewModel2, null), 3);
        }
    }

    public final LinearLayout t() {
        return (LinearLayout) this.f32511A.getValue();
    }

    public final int u() {
        return ((Number) this.f32519Y.getValue()).intValue();
    }

    public final TextView v() {
        return (TextView) this.f32513C.getValue();
    }

    public final void w(GetOrderDetailResp.OrderDetailInfo orderDetailInfo) {
        if (orderDetailInfo != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            ArrayList<String> arrayList2 = new ArrayList<>();
            arrayList.add(getResources().getString(p025ba.k.core_account_number));
            arrayList.add(getResources().getString(Jc.f.mm_acount_name));
            arrayList.add(getResources().getString(p025ba.k.core_receipt_transaction_type));
            arrayList.add(getResources().getString(p025ba.k.core_amount));
            arrayList.add(getResources().getString(p025ba.k.core_reference_no_2));
            arrayList.add(getResources().getString(p025ba.k.core_transaction_time_2));
            arrayList2.add(String.valueOf(orderDetailInfo.getAccountNumber()));
            arrayList2.add(String.valueOf(orderDetailInfo.getAccountName()));
            p355xf.t tVar = this.f32520Z;
            arrayList2.add(TextUtils.equals((String) tVar.getValue(), TransType.TRANS_TYPE_FIXED_SAVING_PAID) ? getResources().getString(Jc.f.mm_payment_mature) : getResources().getString(Jc.f.mm_fixed_savings_investment));
            arrayList2.add(TextUtils.equals((String) tVar.getValue(), TransType.TRANS_TYPE_FIXED_SAVING_PAID) ? Pa.r0.B(orderDetailInfo.getTotalPayback(), false) : Pa.r0.B(orderDetailInfo.getAmount(), false));
            arrayList2.add(String.valueOf(orderDetailInfo.getTransactionId()));
            arrayList2.add(Pa.r0.Q(orderDetailInfo.getTransactionTime()));
            ARouter.getInstance().build("/coreImpl/transaction_receipt_page").withLong("extra_amount", orderDetailInfo.getAmount()).withLong("extra_data", orderDetailInfo.getTransactionTime()).withStringArrayList("extra_data_1", arrayList).withStringArrayList("extra_data_2", arrayList2).navigation();
        }
    }

    public final void x(final GetOrderDetailResp.OrderDetailInfo orderDetailInfo) {
        int i7;
        TextView rightTextView;
        int i10;
        int i11;
        LinearLayout linearLayoutT;
        LinearLayout linearLayoutT2;
        String string;
        Resources resources;
        int i12;
        TextView rightTextView2;
        ImageView backImageView;
        if (orderDetailInfo != null) {
            LinearLayout linearLayoutT3 = t();
            if (linearLayoutT3 != null) {
                linearLayoutT3.removeAllViews();
            }
            p355xf.t tVar = this.f32512B;
            LinearLayout linearLayout = (LinearLayout) tVar.getValue();
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            p355xf.t tVar2 = this.f32517Q;
            PpTitleBar ppTitleBar = (PpTitleBar) tVar2.getValue();
            if (ppTitleBar != null && (backImageView = ppTitleBar.getBackImageView()) != null) {
                backImageView.setVisibility(u() == 2 ? 0 : 8);
            }
            PpTitleBar ppTitleBar2 = (PpTitleBar) tVar2.getValue();
            if (ppTitleBar2 != null && (rightTextView2 = ppTitleBar2.getRightTextView()) != null) {
                rightTextView2.setVisibility(u() == 2 ? 8 : 0);
            }
            p355xf.t tVar3 = this.f32525w;
            TextView textView = (TextView) tVar3.getValue();
            if (textView != null) {
                textView.setVisibility(u() == 2 ? 0 : 8);
            }
            LinearLayout linearLayout2 = (LinearLayout) tVar.getValue();
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(u() == 2 ? 0 : 8);
            }
            PpTitleBar ppTitleBar3 = (PpTitleBar) tVar2.getValue();
            if (ppTitleBar3 != null) {
                final int i13 = 0;
                ppTitleBar3.setRightTextViewClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.b0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ OrderDetailFragment f32593b;

                    {
                        this.f32593b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        GetOrderDetailResp.OrderDetailInfo orderDetailInfo2 = orderDetailInfo;
                        OrderDetailFragment orderDetailFragment = this.f32593b;
                        switch (i13) {
                            case 0:
                                OrderDetailFragment.a aVar = OrderDetailFragment.f32510k0;
                                orderDetailFragment.w(orderDetailInfo2);
                                break;
                            default:
                                OrderDetailFragment.a aVar2 = OrderDetailFragment.f32510k0;
                                orderDetailFragment.w(orderDetailInfo2);
                                break;
                        }
                    }
                });
            }
            TextView textView2 = (TextView) tVar3.getValue();
            if (textView2 != null) {
                final int i14 = 1;
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.b0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ OrderDetailFragment f32593b;

                    {
                        this.f32593b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        GetOrderDetailResp.OrderDetailInfo orderDetailInfo2 = orderDetailInfo;
                        OrderDetailFragment orderDetailFragment = this.f32593b;
                        switch (i14) {
                            case 0:
                                OrderDetailFragment.a aVar = OrderDetailFragment.f32510k0;
                                orderDetailFragment.w(orderDetailInfo2);
                                break;
                            default:
                                OrderDetailFragment.a aVar2 = OrderDetailFragment.f32510k0;
                                orderDetailFragment.w(orderDetailInfo2);
                                break;
                        }
                    }
                });
            }
            RoundedTextView roundedTextView = (RoundedTextView) this.f32521j.getValue();
            if (roundedTextView != null) {
                roundedTextView.setOnClickListener(new ViewOnClickListenerC1533v(orderDetailInfo, 28));
            }
            TextView textView3 = (TextView) this.f32514H.getValue();
            if (textView3 != null) {
                textView3.setText(Pa.r0.B(orderDetailInfo.getAmount(), true));
            }
            TextView textView4 = (TextView) this.f32515L.getValue();
            if (textView4 != null) {
                textView4.setText(orderDetailInfo.getProductName());
            }
            int payStatus = orderDetailInfo.getPayStatus();
            if (payStatus == 0) {
                TextView textViewV = v();
                if (textViewV != null) {
                    textViewV.setText(getResources().getString(Jc.f.mm_plan_status_processing));
                }
                Drawable drawable = requireContext().getDrawable(com.transsnet.palmpay.custom_view.r.cv_icon_processing_small);
                if (drawable != null) {
                    drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                }
                TextView textViewV2 = v();
                if (textViewV2 != null) {
                    textViewV2.setCompoundDrawables(drawable, null, null, null);
                }
            } else if (payStatus == 1) {
                TextView textViewV3 = v();
                if (textViewV3 != null) {
                    if (TextUtils.equals((String) this.f32520Z.getValue(), TransType.TRANS_TYPE_FIXED_SAVING_PAID)) {
                        resources = getResources();
                        i12 = Jc.f.mm_transaction_matured;
                    } else {
                        resources = getResources();
                        i12 = Jc.f.mm_transaction_completed;
                    }
                    textViewV3.setText(resources.getString(i12));
                }
                Drawable drawable2 = requireContext().getDrawable(com.transsnet.palmpay.custom_view.r.cv_icon_success_small);
                if (drawable2 != null) {
                    drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                }
                TextView textViewV4 = v();
                if (textViewV4 != null) {
                    textViewV4.setCompoundDrawables(drawable2, null, null, null);
                }
            } else if (payStatus == 2) {
                TextView textViewV5 = v();
                if (textViewV5 != null) {
                    textViewV5.setText(getResources().getString(Jc.f.mm_transaction_failed));
                }
                Drawable drawable3 = requireContext().getDrawable(Jc.b.mm_icon_failed_small);
                if (drawable3 != null) {
                    drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), drawable3.getIntrinsicHeight());
                }
                TextView textViewV6 = v();
                if (textViewV6 != null) {
                    textViewV6.setCompoundDrawables(drawable3, null, null, null);
                }
            }
            int iU = u();
            p355xf.t tVar4 = this.f32523p;
            p355xf.t tVar5 = this.t;
            if (iU == 2) {
                LinearLayout linearLayout3 = (LinearLayout) tVar5.getValue();
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                }
                LinearLayout linearLayout4 = (LinearLayout) tVar4.getValue();
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(8);
                }
                LinearLayout linearLayout5 = (LinearLayout) tVar.getValue();
                if (linearLayout5 != null) {
                    Context contextRequireContext = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    com.transsnet.palmpay.managemoney.ui.view.d dVar = new com.transsnet.palmpay.managemoney.ui.view.d(getResources().getString(Jc.f.mm_payment_amount), 0.0f, L6.b.ppColorTextNormal, null, null, false, null, 506);
                    com.transsnet.palmpay.managemoney.ui.view.d dVar2 = new com.transsnet.palmpay.managemoney.ui.view.d(Pa.r0.B(orderDetailInfo.getAmount(), false), 0.0f, 0, null, null, false, null, 510);
                    DensityUtil.dp2px(48.0f);
                    linearLayout5.addView(new PlanInfoItem(contextRequireContext, dVar, dVar2));
                }
                LinearLayout linearLayout6 = (LinearLayout) tVar.getValue();
                if (linearLayout6 != null) {
                    LinearLayout linearLayout7 = new LinearLayout(requireContext());
                    linearLayout7.setOrientation(1);
                    Context contextRequireContext2 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                    com.transsnet.palmpay.managemoney.ui.view.d dVar3 = new com.transsnet.palmpay.managemoney.ui.view.d(linearLayout7.getResources().getString(Jc.f.mm_interest_value), 12.0f, L6.b.ppColorTextNormal, null, null, false, null, 504);
                    com.transsnet.palmpay.managemoney.ui.view.d dVar4 = new com.transsnet.palmpay.managemoney.ui.view.d(Pa.r0.B(orderDetailInfo.getEarning(), false), 12.0f, 0, null, null, false, null, 508);
                    DensityUtil.dp2px(42.0f);
                    linearLayout7.addView(new PlanInfoItem(contextRequireContext2, dVar3, dVar4));
                    Context contextRequireContext3 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                    com.transsnet.palmpay.managemoney.ui.view.d dVar5 = new com.transsnet.palmpay.managemoney.ui.view.d(linearLayout7.getResources().getString(Jc.f.mm_total_payback), 12.0f, L6.b.ppColorTextNormal, null, null, false, null, 504);
                    com.transsnet.palmpay.managemoney.ui.view.d dVar6 = new com.transsnet.palmpay.managemoney.ui.view.d(Pa.r0.B(orderDetailInfo.getTotalPayback(), false), 12.0f, 0, null, null, false, null, 508);
                    DensityUtil.dp2px(42.0f);
                    linearLayout7.addView(new PlanInfoItem(contextRequireContext3, dVar5, dVar6));
                    linearLayout6.addView(linearLayout7, new LinearLayout.LayoutParams(-1, DensityUtil.dp2px(84.0f)));
                }
                LinearLayout linearLayoutT4 = t();
                if (linearLayoutT4 != null) {
                    Context contextRequireContext4 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                    com.transsnet.palmpay.managemoney.ui.view.d dVar7 = new com.transsnet.palmpay.managemoney.ui.view.d(getResources().getString(Jc.f.mm_interest_rate), 0.0f, 0, null, null, false, null, 510);
                    com.transsnet.palmpay.managemoney.ui.view.d dVar8 = new com.transsnet.palmpay.managemoney.ui.view.d(N8.q0.j(Pa.r0.z0(String.valueOf(Pa.r0.w1(String.valueOf(orderDetailInfo.getAnnualizedIncomeRatio()), "100"))), "%p.a."), 0.0f, 0, null, null, false, null, 510);
                    DensityUtil.dp2px(48.0f);
                    linearLayoutT4.addView(new PlanInfoItem(contextRequireContext4, dVar7, dVar8));
                }
                LinearLayout linearLayoutT5 = t();
                if (linearLayoutT5 != null) {
                    Context contextRequireContext5 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "requireContext(...)");
                    com.transsnet.palmpay.managemoney.ui.view.d dVar9 = new com.transsnet.palmpay.managemoney.ui.view.d(getResources().getString(Jc.f.mm_duration_days), 0.0f, 0, null, null, false, null, 510);
                    com.transsnet.palmpay.managemoney.ui.view.d dVar10 = new com.transsnet.palmpay.managemoney.ui.view.d(String.valueOf(orderDetailInfo.getDurationDay()), 0.0f, 0, null, null, false, null, 510);
                    DensityUtil.dp2px(48.0f);
                    linearLayoutT5.addView(new PlanInfoItem(contextRequireContext5, dVar9, dVar10));
                }
            } else {
                LinearLayout linearLayout8 = (LinearLayout) tVar5.getValue();
                if (linearLayout8 != null) {
                    i7 = 2;
                    linearLayout8.setVisibility(orderDetailInfo.getPayStatus() == 2 ? 8 : 0);
                } else {
                    i7 = 2;
                }
                LinearLayout linearLayout9 = (LinearLayout) tVar4.getValue();
                if (linearLayout9 != null) {
                    linearLayout9.setVisibility(orderDetailInfo.getPayStatus() == i7 ? 0 : 8);
                }
                PpTitleBar ppTitleBar4 = (PpTitleBar) tVar2.getValue();
                if (ppTitleBar4 != null && (rightTextView = ppTitleBar4.getRightTextView()) != null) {
                    rightTextView.setVisibility(orderDetailInfo.getPayStatus() == 1 ? 0 : 8);
                }
                LinearLayout linearLayoutT6 = t();
                if (linearLayoutT6 != null) {
                    Context contextRequireContext6 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext6, "requireContext(...)");
                    com.transsnet.palmpay.managemoney.ui.view.d dVar11 = new com.transsnet.palmpay.managemoney.ui.view.d(getResources().getString(p025ba.k.core_amount), 0.0f, L6.b.ppColorTextNormal, null, null, false, null, 506);
                    com.transsnet.palmpay.managemoney.ui.view.d dVar12 = new com.transsnet.palmpay.managemoney.ui.view.d(Pa.r0.B(orderDetailInfo.getAmount(), false), 0.0f, 0, null, null, false, null, 510);
                    DensityUtil.dp2px(48.0f);
                    linearLayoutT6.addView(new PlanInfoItem(contextRequireContext6, dVar11, dVar12));
                }
                LinearLayout linearLayoutT7 = t();
                if (linearLayoutT7 != null) {
                    Context contextRequireContext7 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext7, "requireContext(...)");
                    com.transsnet.palmpay.managemoney.ui.view.d dVar13 = new com.transsnet.palmpay.managemoney.ui.view.d(getResources().getString(Jc.f.mm_interest_rate), 0.0f, L6.b.ppColorTextNormal, null, null, false, null, 506);
                    com.transsnet.palmpay.managemoney.ui.view.d dVar14 = new com.transsnet.palmpay.managemoney.ui.view.d(N8.q0.j(Pa.r0.z0(String.valueOf(Pa.r0.w1(String.valueOf(orderDetailInfo.getAnnualizedIncomeRatio()), "100"))), "%p.a."), 0.0f, 0, null, null, false, null, 510);
                    DensityUtil.dp2px(48.0f);
                    linearLayoutT7.addView(new PlanInfoItem(contextRequireContext7, dVar13, dVar14));
                }
            }
            LinearLayout linearLayoutT8 = t();
            if (linearLayoutT8 != null) {
                Context contextRequireContext8 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext8, "requireContext(...)");
                com.transsnet.palmpay.managemoney.ui.view.d dVar15 = new com.transsnet.palmpay.managemoney.ui.view.d(getResources().getString(p025ba.k.core_payment_method), 0.0f, L6.b.ppColorTextNormal, null, null, false, null, 506);
                Integer payType = orderDetailInfo.getPayType();
                if (payType != null && payType.intValue() == 1) {
                    string = getResources().getString(Jc.f.mm_plan_palmpay_balance);
                } else {
                    string = (payType != null && payType.intValue() == 40) ? getString(p025ba.k.core_cash_box) : N8.q0.l(orderDetailInfo.getBankName(), "(", orderDetailInfo.getBankCard(), ")");
                }
                com.transsnet.palmpay.managemoney.ui.view.d dVar16 = new com.transsnet.palmpay.managemoney.ui.view.d(string, 0.0f, 0, null, null, false, null, 510);
                DensityUtil.dp2px(48.0f);
                linearLayoutT8.addView(new PlanInfoItem(contextRequireContext8, dVar15, dVar16));
            }
            if (orderDetailInfo.getTransactionTime() <= 0) {
                i10 = 8;
            } else {
                if (u() == 1) {
                    LinearLayout linearLayoutT9 = t();
                    if (linearLayoutT9 != null) {
                        Context contextRequireContext9 = requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext9, "requireContext(...)");
                        com.transsnet.palmpay.managemoney.ui.view.d dVar17 = new com.transsnet.palmpay.managemoney.ui.view.d(getResources().getString(Jc.f.mm_completion_time), 0.0f, L6.b.ppColorTextNormal, null, null, false, null, 506);
                        com.transsnet.palmpay.managemoney.ui.view.d dVar18 = new com.transsnet.palmpay.managemoney.ui.view.d(Pa.r0.Q(orderDetailInfo.getTransactionTime()), 0.0f, 0, null, null, false, null, 510);
                        DensityUtil.dp2px(48.0f);
                        linearLayoutT9.addView(new PlanInfoItem(contextRequireContext9, dVar17, dVar18));
                    }
                } else if (orderDetailInfo.getPayStatus() == 1 && (linearLayoutT2 = t()) != null) {
                    Context contextRequireContext10 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext10, "requireContext(...)");
                    com.transsnet.palmpay.managemoney.ui.view.d dVar19 = new com.transsnet.palmpay.managemoney.ui.view.d(getResources().getString(Jc.f.mm_completion_time), 0.0f, L6.b.ppColorTextNormal, null, null, false, null, 506);
                    com.transsnet.palmpay.managemoney.ui.view.d dVar20 = new com.transsnet.palmpay.managemoney.ui.view.d(Pa.r0.Q(orderDetailInfo.getTransactionTime()), 0.0f, 0, null, null, false, null, 510);
                    DensityUtil.dp2px(48.0f);
                    PlanInfoItem planInfoItem = new PlanInfoItem(contextRequireContext10, dVar19, dVar20);
                    i10 = 8;
                    planInfoItem.setVisibility(8);
                    linearLayoutT2.addView(planInfoItem);
                }
                i10 = 8;
            }
            LinearLayout linearLayoutT10 = t();
            if (linearLayoutT10 != null) {
                Context contextRequireContext11 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext11, "requireContext(...)");
                com.transsnet.palmpay.managemoney.ui.view.d dVar21 = new com.transsnet.palmpay.managemoney.ui.view.d(getResources().getString(p025ba.k.core_receipt_transaction_id), 0.0f, L6.b.ppColorTextNormal, null, null, false, null, 506);
                com.transsnet.palmpay.managemoney.ui.view.d dVar22 = new com.transsnet.palmpay.managemoney.ui.view.d(orderDetailInfo.getTransactionId(), 0.0f, 0, null, null, false, null, 510);
                DensityUtil.dp2px(48.0f);
                PlanInfoItem planInfoItem2 = new PlanInfoItem(contextRequireContext11, dVar21, dVar22);
                i11 = 2;
                planInfoItem2.setVisibility(u() == 2 ? i10 : 0);
                linearLayoutT10.addView(planInfoItem2);
            } else {
                i11 = 2;
            }
            if (u() == i11 && (linearLayoutT = t()) != null) {
                View viewInflate = LayoutInflater.from(requireContext()).inflate(Jc.d.mm_collapse_order_info, (ViewGroup) null);
                viewInflate.setOnClickListener(new p010a9.b(24, (ImageView) viewInflate.findViewById(Jc.c.ivCollapse), this));
                linearLayoutT.addView(viewInflate, new LinearLayout.LayoutParams(-1, -2));
            }
            NestedScrollView nestedScrollView = (NestedScrollView) this.f32516M.getValue();
            if (nestedScrollView != null) {
                nestedScrollView.setVisibility(0);
            }
        }
    }
}
