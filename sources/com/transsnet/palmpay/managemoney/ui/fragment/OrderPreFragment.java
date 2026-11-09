package com.transsnet.palmpay.managemoney.ui.fragment;

import Oc.C0500c;
import android.R;
import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.managemoney.bean.PayoutOption;
import com.transsnet.palmpay.managemoney.bean.PayoutOptionsChangeEvent;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import com.transsnet.palmpay.managemoney.bean.resp.GetBeforeOrderResp;
import com.transsnet.palmpay.managemoney.ui.view.PlanInfoItem;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.TimeUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/fragment/OrderPreFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/managemoney/ui/fragment/OrderPreViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "Lcom/transsnet/palmpay/managemoney/bean/PayoutOptionsChangeEvent;", "payoutOptionsChangeEvent", "onReceivePushMessage", "(Lcom/transsnet/palmpay/managemoney/bean/PayoutOptionsChangeEvent;)V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOrderPreFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderPreFragment.kt\ncom/transsnet/palmpay/managemoney/ui/fragment/OrderPreFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,762:1\n260#2,10:763\n296#2:773\n115#2,8:774\n145#2:782\n171#2,12:783\n215#2:795\n*S KotlinDebug\n*F\n+ 1 OrderPreFragment.kt\ncom/transsnet/palmpay/managemoney/ui/fragment/OrderPreFragment\n*L\n210#1:763,10\n210#1:773\n282#1:774,8\n282#1:782\n285#1:783,12\n285#1:795\n*E\n"})
public final class OrderPreFragment extends BaseMvvmFragment<OrderPreViewModel> {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final a f32526Q = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p355xf.t f32527A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p355xf.t f32528B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final p355xf.t f32529C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f32530H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f32531L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f32532M;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p355xf.t f32533j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p355xf.t f32534o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p355xf.t f32535p;
    public final p355xf.t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p355xf.t f32536v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p355xf.t f32537w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OrderPreFragment newInstance(@Nullable ProductBean productBean, @Nullable GetBeforeOrderResp.StateInfo stateInfo) {
            OrderPreFragment orderPreFragment = new OrderPreFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("product_bean", productBean);
            bundle.putParcelable("state_info", stateInfo);
            orderPreFragment.setArguments(bundle);
            return orderPreFragment;
        }

        private a() {
        }
    }

    public OrderPreFragment() {
        final int i7 = 8;
        this.f32533j = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderPreFragment f32598b;

            {
                this.f32598b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderPreFragment orderPreFragment = this.f32598b;
                switch (i7) {
                    case 0:
                        OrderPreFragment.a aVar = OrderPreFragment.f32526Q;
                        View view = orderPreFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvPreviewPlanProtocol);
                        }
                        return null;
                    case 1:
                        OrderPreFragment.a aVar2 = OrderPreFragment.f32526Q;
                        View view2 = orderPreFragment.f27318b;
                        if (view2 != null) {
                            return (CheckBox) view2.findViewById(Jc.c.ckProtocol);
                        }
                        return null;
                    case 2:
                        OrderPreFragment.a aVar3 = OrderPreFragment.f32526Q;
                        View view3 = orderPreFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(Jc.c.layoutAutoRenewalExtroInfo);
                        }
                        return null;
                    case 3:
                        OrderPreFragment.a aVar4 = OrderPreFragment.f32526Q;
                        View view4 = orderPreFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(Jc.c.layoutExtroInfo);
                        }
                        return null;
                    case 4:
                        OrderPreFragment.a aVar5 = OrderPreFragment.f32526Q;
                        View view5 = orderPreFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(Jc.c.layoutInfo);
                        }
                        return null;
                    case 5:
                        OrderPreFragment.a aVar6 = OrderPreFragment.f32526Q;
                        View view6 = orderPreFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Jc.c.tvProductName);
                        }
                        return null;
                    case 6:
                        OrderPreFragment.a aVar7 = OrderPreFragment.f32526Q;
                        View view7 = orderPreFragment.f27318b;
                        if (view7 != null) {
                            return (AppCompatImageView) view7.findViewById(Jc.c.switchStrictWidget);
                        }
                        return null;
                    case 7:
                        OrderPreFragment.a aVar8 = OrderPreFragment.f32526Q;
                        Bundle arguments = orderPreFragment.getArguments();
                        if (arguments != null) {
                            return (ProductBean) arguments.getParcelable("product_bean");
                        }
                        return null;
                    default:
                        OrderPreFragment.a aVar9 = OrderPreFragment.f32526Q;
                        View view8 = orderPreFragment.f27318b;
                        if (view8 != null) {
                            return (RoundedTextView) view8.findViewById(Jc.c.rtvConfirm);
                        }
                        return null;
                }
            }
        });
        final int i10 = 0;
        this.f32534o = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderPreFragment f32598b;

            {
                this.f32598b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderPreFragment orderPreFragment = this.f32598b;
                switch (i10) {
                    case 0:
                        OrderPreFragment.a aVar = OrderPreFragment.f32526Q;
                        View view = orderPreFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvPreviewPlanProtocol);
                        }
                        return null;
                    case 1:
                        OrderPreFragment.a aVar2 = OrderPreFragment.f32526Q;
                        View view2 = orderPreFragment.f27318b;
                        if (view2 != null) {
                            return (CheckBox) view2.findViewById(Jc.c.ckProtocol);
                        }
                        return null;
                    case 2:
                        OrderPreFragment.a aVar3 = OrderPreFragment.f32526Q;
                        View view3 = orderPreFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(Jc.c.layoutAutoRenewalExtroInfo);
                        }
                        return null;
                    case 3:
                        OrderPreFragment.a aVar4 = OrderPreFragment.f32526Q;
                        View view4 = orderPreFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(Jc.c.layoutExtroInfo);
                        }
                        return null;
                    case 4:
                        OrderPreFragment.a aVar5 = OrderPreFragment.f32526Q;
                        View view5 = orderPreFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(Jc.c.layoutInfo);
                        }
                        return null;
                    case 5:
                        OrderPreFragment.a aVar6 = OrderPreFragment.f32526Q;
                        View view6 = orderPreFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Jc.c.tvProductName);
                        }
                        return null;
                    case 6:
                        OrderPreFragment.a aVar7 = OrderPreFragment.f32526Q;
                        View view7 = orderPreFragment.f27318b;
                        if (view7 != null) {
                            return (AppCompatImageView) view7.findViewById(Jc.c.switchStrictWidget);
                        }
                        return null;
                    case 7:
                        OrderPreFragment.a aVar8 = OrderPreFragment.f32526Q;
                        Bundle arguments = orderPreFragment.getArguments();
                        if (arguments != null) {
                            return (ProductBean) arguments.getParcelable("product_bean");
                        }
                        return null;
                    default:
                        OrderPreFragment.a aVar9 = OrderPreFragment.f32526Q;
                        View view8 = orderPreFragment.f27318b;
                        if (view8 != null) {
                            return (RoundedTextView) view8.findViewById(Jc.c.rtvConfirm);
                        }
                        return null;
                }
            }
        });
        final int i11 = 1;
        this.f32535p = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderPreFragment f32598b;

            {
                this.f32598b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderPreFragment orderPreFragment = this.f32598b;
                switch (i11) {
                    case 0:
                        OrderPreFragment.a aVar = OrderPreFragment.f32526Q;
                        View view = orderPreFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvPreviewPlanProtocol);
                        }
                        return null;
                    case 1:
                        OrderPreFragment.a aVar2 = OrderPreFragment.f32526Q;
                        View view2 = orderPreFragment.f27318b;
                        if (view2 != null) {
                            return (CheckBox) view2.findViewById(Jc.c.ckProtocol);
                        }
                        return null;
                    case 2:
                        OrderPreFragment.a aVar3 = OrderPreFragment.f32526Q;
                        View view3 = orderPreFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(Jc.c.layoutAutoRenewalExtroInfo);
                        }
                        return null;
                    case 3:
                        OrderPreFragment.a aVar4 = OrderPreFragment.f32526Q;
                        View view4 = orderPreFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(Jc.c.layoutExtroInfo);
                        }
                        return null;
                    case 4:
                        OrderPreFragment.a aVar5 = OrderPreFragment.f32526Q;
                        View view5 = orderPreFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(Jc.c.layoutInfo);
                        }
                        return null;
                    case 5:
                        OrderPreFragment.a aVar6 = OrderPreFragment.f32526Q;
                        View view6 = orderPreFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Jc.c.tvProductName);
                        }
                        return null;
                    case 6:
                        OrderPreFragment.a aVar7 = OrderPreFragment.f32526Q;
                        View view7 = orderPreFragment.f27318b;
                        if (view7 != null) {
                            return (AppCompatImageView) view7.findViewById(Jc.c.switchStrictWidget);
                        }
                        return null;
                    case 7:
                        OrderPreFragment.a aVar8 = OrderPreFragment.f32526Q;
                        Bundle arguments = orderPreFragment.getArguments();
                        if (arguments != null) {
                            return (ProductBean) arguments.getParcelable("product_bean");
                        }
                        return null;
                    default:
                        OrderPreFragment.a aVar9 = OrderPreFragment.f32526Q;
                        View view8 = orderPreFragment.f27318b;
                        if (view8 != null) {
                            return (RoundedTextView) view8.findViewById(Jc.c.rtvConfirm);
                        }
                        return null;
                }
            }
        });
        final int i12 = 2;
        this.t = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderPreFragment f32598b;

            {
                this.f32598b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderPreFragment orderPreFragment = this.f32598b;
                switch (i12) {
                    case 0:
                        OrderPreFragment.a aVar = OrderPreFragment.f32526Q;
                        View view = orderPreFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvPreviewPlanProtocol);
                        }
                        return null;
                    case 1:
                        OrderPreFragment.a aVar2 = OrderPreFragment.f32526Q;
                        View view2 = orderPreFragment.f27318b;
                        if (view2 != null) {
                            return (CheckBox) view2.findViewById(Jc.c.ckProtocol);
                        }
                        return null;
                    case 2:
                        OrderPreFragment.a aVar3 = OrderPreFragment.f32526Q;
                        View view3 = orderPreFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(Jc.c.layoutAutoRenewalExtroInfo);
                        }
                        return null;
                    case 3:
                        OrderPreFragment.a aVar4 = OrderPreFragment.f32526Q;
                        View view4 = orderPreFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(Jc.c.layoutExtroInfo);
                        }
                        return null;
                    case 4:
                        OrderPreFragment.a aVar5 = OrderPreFragment.f32526Q;
                        View view5 = orderPreFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(Jc.c.layoutInfo);
                        }
                        return null;
                    case 5:
                        OrderPreFragment.a aVar6 = OrderPreFragment.f32526Q;
                        View view6 = orderPreFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Jc.c.tvProductName);
                        }
                        return null;
                    case 6:
                        OrderPreFragment.a aVar7 = OrderPreFragment.f32526Q;
                        View view7 = orderPreFragment.f27318b;
                        if (view7 != null) {
                            return (AppCompatImageView) view7.findViewById(Jc.c.switchStrictWidget);
                        }
                        return null;
                    case 7:
                        OrderPreFragment.a aVar8 = OrderPreFragment.f32526Q;
                        Bundle arguments = orderPreFragment.getArguments();
                        if (arguments != null) {
                            return (ProductBean) arguments.getParcelable("product_bean");
                        }
                        return null;
                    default:
                        OrderPreFragment.a aVar9 = OrderPreFragment.f32526Q;
                        View view8 = orderPreFragment.f27318b;
                        if (view8 != null) {
                            return (RoundedTextView) view8.findViewById(Jc.c.rtvConfirm);
                        }
                        return null;
                }
            }
        });
        final int i13 = 3;
        this.f32536v = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderPreFragment f32598b;

            {
                this.f32598b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderPreFragment orderPreFragment = this.f32598b;
                switch (i13) {
                    case 0:
                        OrderPreFragment.a aVar = OrderPreFragment.f32526Q;
                        View view = orderPreFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvPreviewPlanProtocol);
                        }
                        return null;
                    case 1:
                        OrderPreFragment.a aVar2 = OrderPreFragment.f32526Q;
                        View view2 = orderPreFragment.f27318b;
                        if (view2 != null) {
                            return (CheckBox) view2.findViewById(Jc.c.ckProtocol);
                        }
                        return null;
                    case 2:
                        OrderPreFragment.a aVar3 = OrderPreFragment.f32526Q;
                        View view3 = orderPreFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(Jc.c.layoutAutoRenewalExtroInfo);
                        }
                        return null;
                    case 3:
                        OrderPreFragment.a aVar4 = OrderPreFragment.f32526Q;
                        View view4 = orderPreFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(Jc.c.layoutExtroInfo);
                        }
                        return null;
                    case 4:
                        OrderPreFragment.a aVar5 = OrderPreFragment.f32526Q;
                        View view5 = orderPreFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(Jc.c.layoutInfo);
                        }
                        return null;
                    case 5:
                        OrderPreFragment.a aVar6 = OrderPreFragment.f32526Q;
                        View view6 = orderPreFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Jc.c.tvProductName);
                        }
                        return null;
                    case 6:
                        OrderPreFragment.a aVar7 = OrderPreFragment.f32526Q;
                        View view7 = orderPreFragment.f27318b;
                        if (view7 != null) {
                            return (AppCompatImageView) view7.findViewById(Jc.c.switchStrictWidget);
                        }
                        return null;
                    case 7:
                        OrderPreFragment.a aVar8 = OrderPreFragment.f32526Q;
                        Bundle arguments = orderPreFragment.getArguments();
                        if (arguments != null) {
                            return (ProductBean) arguments.getParcelable("product_bean");
                        }
                        return null;
                    default:
                        OrderPreFragment.a aVar9 = OrderPreFragment.f32526Q;
                        View view8 = orderPreFragment.f27318b;
                        if (view8 != null) {
                            return (RoundedTextView) view8.findViewById(Jc.c.rtvConfirm);
                        }
                        return null;
                }
            }
        });
        final int i14 = 4;
        this.f32537w = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderPreFragment f32598b;

            {
                this.f32598b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderPreFragment orderPreFragment = this.f32598b;
                switch (i14) {
                    case 0:
                        OrderPreFragment.a aVar = OrderPreFragment.f32526Q;
                        View view = orderPreFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvPreviewPlanProtocol);
                        }
                        return null;
                    case 1:
                        OrderPreFragment.a aVar2 = OrderPreFragment.f32526Q;
                        View view2 = orderPreFragment.f27318b;
                        if (view2 != null) {
                            return (CheckBox) view2.findViewById(Jc.c.ckProtocol);
                        }
                        return null;
                    case 2:
                        OrderPreFragment.a aVar3 = OrderPreFragment.f32526Q;
                        View view3 = orderPreFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(Jc.c.layoutAutoRenewalExtroInfo);
                        }
                        return null;
                    case 3:
                        OrderPreFragment.a aVar4 = OrderPreFragment.f32526Q;
                        View view4 = orderPreFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(Jc.c.layoutExtroInfo);
                        }
                        return null;
                    case 4:
                        OrderPreFragment.a aVar5 = OrderPreFragment.f32526Q;
                        View view5 = orderPreFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(Jc.c.layoutInfo);
                        }
                        return null;
                    case 5:
                        OrderPreFragment.a aVar6 = OrderPreFragment.f32526Q;
                        View view6 = orderPreFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Jc.c.tvProductName);
                        }
                        return null;
                    case 6:
                        OrderPreFragment.a aVar7 = OrderPreFragment.f32526Q;
                        View view7 = orderPreFragment.f27318b;
                        if (view7 != null) {
                            return (AppCompatImageView) view7.findViewById(Jc.c.switchStrictWidget);
                        }
                        return null;
                    case 7:
                        OrderPreFragment.a aVar8 = OrderPreFragment.f32526Q;
                        Bundle arguments = orderPreFragment.getArguments();
                        if (arguments != null) {
                            return (ProductBean) arguments.getParcelable("product_bean");
                        }
                        return null;
                    default:
                        OrderPreFragment.a aVar9 = OrderPreFragment.f32526Q;
                        View view8 = orderPreFragment.f27318b;
                        if (view8 != null) {
                            return (RoundedTextView) view8.findViewById(Jc.c.rtvConfirm);
                        }
                        return null;
                }
            }
        });
        final int i15 = 5;
        this.f32527A = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderPreFragment f32598b;

            {
                this.f32598b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderPreFragment orderPreFragment = this.f32598b;
                switch (i15) {
                    case 0:
                        OrderPreFragment.a aVar = OrderPreFragment.f32526Q;
                        View view = orderPreFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvPreviewPlanProtocol);
                        }
                        return null;
                    case 1:
                        OrderPreFragment.a aVar2 = OrderPreFragment.f32526Q;
                        View view2 = orderPreFragment.f27318b;
                        if (view2 != null) {
                            return (CheckBox) view2.findViewById(Jc.c.ckProtocol);
                        }
                        return null;
                    case 2:
                        OrderPreFragment.a aVar3 = OrderPreFragment.f32526Q;
                        View view3 = orderPreFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(Jc.c.layoutAutoRenewalExtroInfo);
                        }
                        return null;
                    case 3:
                        OrderPreFragment.a aVar4 = OrderPreFragment.f32526Q;
                        View view4 = orderPreFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(Jc.c.layoutExtroInfo);
                        }
                        return null;
                    case 4:
                        OrderPreFragment.a aVar5 = OrderPreFragment.f32526Q;
                        View view5 = orderPreFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(Jc.c.layoutInfo);
                        }
                        return null;
                    case 5:
                        OrderPreFragment.a aVar6 = OrderPreFragment.f32526Q;
                        View view6 = orderPreFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Jc.c.tvProductName);
                        }
                        return null;
                    case 6:
                        OrderPreFragment.a aVar7 = OrderPreFragment.f32526Q;
                        View view7 = orderPreFragment.f27318b;
                        if (view7 != null) {
                            return (AppCompatImageView) view7.findViewById(Jc.c.switchStrictWidget);
                        }
                        return null;
                    case 7:
                        OrderPreFragment.a aVar8 = OrderPreFragment.f32526Q;
                        Bundle arguments = orderPreFragment.getArguments();
                        if (arguments != null) {
                            return (ProductBean) arguments.getParcelable("product_bean");
                        }
                        return null;
                    default:
                        OrderPreFragment.a aVar9 = OrderPreFragment.f32526Q;
                        View view8 = orderPreFragment.f27318b;
                        if (view8 != null) {
                            return (RoundedTextView) view8.findViewById(Jc.c.rtvConfirm);
                        }
                        return null;
                }
            }
        });
        final int i16 = 6;
        this.f32528B = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderPreFragment f32598b;

            {
                this.f32598b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderPreFragment orderPreFragment = this.f32598b;
                switch (i16) {
                    case 0:
                        OrderPreFragment.a aVar = OrderPreFragment.f32526Q;
                        View view = orderPreFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvPreviewPlanProtocol);
                        }
                        return null;
                    case 1:
                        OrderPreFragment.a aVar2 = OrderPreFragment.f32526Q;
                        View view2 = orderPreFragment.f27318b;
                        if (view2 != null) {
                            return (CheckBox) view2.findViewById(Jc.c.ckProtocol);
                        }
                        return null;
                    case 2:
                        OrderPreFragment.a aVar3 = OrderPreFragment.f32526Q;
                        View view3 = orderPreFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(Jc.c.layoutAutoRenewalExtroInfo);
                        }
                        return null;
                    case 3:
                        OrderPreFragment.a aVar4 = OrderPreFragment.f32526Q;
                        View view4 = orderPreFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(Jc.c.layoutExtroInfo);
                        }
                        return null;
                    case 4:
                        OrderPreFragment.a aVar5 = OrderPreFragment.f32526Q;
                        View view5 = orderPreFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(Jc.c.layoutInfo);
                        }
                        return null;
                    case 5:
                        OrderPreFragment.a aVar6 = OrderPreFragment.f32526Q;
                        View view6 = orderPreFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Jc.c.tvProductName);
                        }
                        return null;
                    case 6:
                        OrderPreFragment.a aVar7 = OrderPreFragment.f32526Q;
                        View view7 = orderPreFragment.f27318b;
                        if (view7 != null) {
                            return (AppCompatImageView) view7.findViewById(Jc.c.switchStrictWidget);
                        }
                        return null;
                    case 7:
                        OrderPreFragment.a aVar8 = OrderPreFragment.f32526Q;
                        Bundle arguments = orderPreFragment.getArguments();
                        if (arguments != null) {
                            return (ProductBean) arguments.getParcelable("product_bean");
                        }
                        return null;
                    default:
                        OrderPreFragment.a aVar9 = OrderPreFragment.f32526Q;
                        View view8 = orderPreFragment.f27318b;
                        if (view8 != null) {
                            return (RoundedTextView) view8.findViewById(Jc.c.rtvConfirm);
                        }
                        return null;
                }
            }
        });
        final int i17 = 7;
        this.f32529C = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderPreFragment f32598b;

            {
                this.f32598b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderPreFragment orderPreFragment = this.f32598b;
                switch (i17) {
                    case 0:
                        OrderPreFragment.a aVar = OrderPreFragment.f32526Q;
                        View view = orderPreFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvPreviewPlanProtocol);
                        }
                        return null;
                    case 1:
                        OrderPreFragment.a aVar2 = OrderPreFragment.f32526Q;
                        View view2 = orderPreFragment.f27318b;
                        if (view2 != null) {
                            return (CheckBox) view2.findViewById(Jc.c.ckProtocol);
                        }
                        return null;
                    case 2:
                        OrderPreFragment.a aVar3 = OrderPreFragment.f32526Q;
                        View view3 = orderPreFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(Jc.c.layoutAutoRenewalExtroInfo);
                        }
                        return null;
                    case 3:
                        OrderPreFragment.a aVar4 = OrderPreFragment.f32526Q;
                        View view4 = orderPreFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(Jc.c.layoutExtroInfo);
                        }
                        return null;
                    case 4:
                        OrderPreFragment.a aVar5 = OrderPreFragment.f32526Q;
                        View view5 = orderPreFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(Jc.c.layoutInfo);
                        }
                        return null;
                    case 5:
                        OrderPreFragment.a aVar6 = OrderPreFragment.f32526Q;
                        View view6 = orderPreFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Jc.c.tvProductName);
                        }
                        return null;
                    case 6:
                        OrderPreFragment.a aVar7 = OrderPreFragment.f32526Q;
                        View view7 = orderPreFragment.f27318b;
                        if (view7 != null) {
                            return (AppCompatImageView) view7.findViewById(Jc.c.switchStrictWidget);
                        }
                        return null;
                    case 7:
                        OrderPreFragment.a aVar8 = OrderPreFragment.f32526Q;
                        Bundle arguments = orderPreFragment.getArguments();
                        if (arguments != null) {
                            return (ProductBean) arguments.getParcelable("product_bean");
                        }
                        return null;
                    default:
                        OrderPreFragment.a aVar9 = OrderPreFragment.f32526Q;
                        View view8 = orderPreFragment.f27318b;
                        if (view8 != null) {
                            return (RoundedTextView) view8.findViewById(Jc.c.rtvConfirm);
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return Jc.d.mm_preview_plan_fragment;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        org.greenrobot.eventbus.c.b().j(this);
        Pa.n0.g().v("PreviewPage_View");
        Bundle arguments = getArguments();
        GetBeforeOrderResp.StateInfo stateInfo = arguments != null ? (GetBeforeOrderResp.StateInfo) arguments.getParcelable("state_info") : null;
        CheckBox checkBox = (CheckBox) this.f32535p.getValue();
        if (checkBox != null) {
            checkBox.setOnCheckedChangeListener(new A8.g(this, 11));
        }
        RoundedTextView roundedTextView = (RoundedTextView) this.f32533j.getValue();
        if (roundedTextView != null) {
            roundedTextView.setOnClickListener(new p010a9.b(25, this, stateInfo));
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.f32528B.getValue();
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new d0(this, 1));
        }
        ProductBean productBeanU = u();
        if (productBeanU != null) {
            v(productBeanU);
        }
        OrderPreViewModel orderPreViewModel = (OrderPreViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar = orderPreViewModel != null ? orderPreViewModel.f32538e : null;
        if (lVar != null) {
            lVar.e(this, new Wd.I(new g0(this, this, 1), 25));
        }
        OrderPreViewModel orderPreViewModel2 = (OrderPreViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar2 = orderPreViewModel2 != null ? orderPreViewModel2.f32539f : null;
        if (lVar2 != null) {
            lVar2.e(this, new Wd.I(new f0(), 25));
        }
        OrderPreViewModel orderPreViewModel3 = (OrderPreViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar3 = orderPreViewModel3 != null ? orderPreViewModel3.f32540g : null;
        if (lVar3 != null) {
            lVar3.e(this, new Wd.I(new g0(this, this, 0), 25));
        }
        if (Pa.i0.W(getActivity()) && isAdded() && getContext() != null) {
            try {
                String string = getString(p025ba.k.saving_preview_ad_dialog);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                new InterstitialAdView(string, 0, new Ab.k(16), new org.sufficientlysecure.htmltextview.h(9)).show(getContext(), new h0());
                return 0;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        OrderPreViewModel orderPreViewModel = (OrderPreViewModel) this.f27333i;
        if (orderPreViewModel != null) {
            p140j8.f.s(orderPreViewModel, new k0(1, null), orderPreViewModel.f32539f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        OrderPreViewModel orderPreViewModel2 = (OrderPreViewModel) this.f27333i;
        if (orderPreViewModel2 != null) {
            p140j8.f.s(orderPreViewModel2, new j0(1, null), orderPreViewModel2.f32540g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (org.greenrobot.eventbus.c.b().e(this)) {
            org.greenrobot.eventbus.c.b().l(this);
        }
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        ProductBean productBeanU;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getEventType() != 548 || (productBeanU = u()) == null) {
            return;
        }
        v(productBeanU);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@NotNull PayoutOptionsChangeEvent payoutOptionsChangeEvent) {
        Intrinsics.checkNotNullParameter(payoutOptionsChangeEvent, "payoutOptionsChangeEvent");
        ProductBean productBeanU = u();
        if (productBeanU != null) {
            PayoutOption payoutOption = productBeanU.getPayoutOption();
            if (payoutOption != null) {
                payoutOption.setType(payoutOptionsChangeEvent.getChangeType());
                String name = payoutOptionsChangeEvent.getName();
                if (name == null) {
                    name = payoutOptionsChangeEvent.getChangeType() == 1 ? "PalmPay Balance" : "CashBox";
                }
                payoutOption.setName(name);
            }
            v(productBeanU);
        }
    }

    public final void t(ProductBean productBean) {
        PayoutOption payoutOption;
        int iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, requireContext());
        p355xf.t tVar = this.f32534o;
        TextView textView = (TextView) tVar.getValue();
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        SpanUtils clickSpan = new SpanUtils().append("I agreed to the").setForegroundColor(iColorInt).appendSpace(SizeUtils.dp2px(4.0f)).append("Fixed Savings Terms and Conditions").setClickSpan(new C0500c(productBean, 13));
        if (this.f32531L && (payoutOption = productBean.getPayoutOption()) != null && payoutOption.getType() == 2) {
            clickSpan.appendSpace(SizeUtils.dp2px(4.0f)).append(" and ").setForegroundColor(iColorInt).appendSpace(SizeUtils.dp2px(2.0f)).append("CashBox Terms and Conditions  ").setClickSpan(new C0500c(this, 12));
        }
        if (this.f32532M == 0 && p059e1.a.D(0, "invest_interest_disable") == 0) {
            clickSpan.append(".If I break before the end of any savings cycle, I'll lose the interest earned for that cycle.").setForegroundColor(iColorInt);
        } else if (this.f32532M == 1) {
            ProductBean productBeanU = u();
            String strMillis2String = TimeUtils.millis2String(productBeanU != null ? productBeanU.getMaturityDate() : 0L, new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH));
            ProductBean productBeanU2 = u();
            clickSpan.append(C0.G.q(".Early withdrawal before ", strMillis2String, " incurs a ", Pa.r0.z0(Pa.r0.w1(String.valueOf(productBeanU2 != null ? Float.valueOf(productBeanU2.getEarlyWithdrawalFeeRate()) : null), "100").toString()), "% principal penalty.")).setForegroundColor(iColorInt);
        }
        TextView textView2 = (TextView) tVar.getValue();
        if (textView2 != null) {
            textView2.setText(clickSpan.create());
        }
        TextView textView3 = (TextView) tVar.getValue();
        if (textView3 != null) {
            textView3.setHighlightColor(requireContext().getColor(R.color.transparent));
        }
    }

    public final ProductBean u() {
        return (ProductBean) this.f32529C.getValue();
    }

    public final void v(ProductBean productBean) {
        ProductBean productBean2;
        com.transsnet.palmpay.managemoney.ui.view.d dVar;
        com.transsnet.palmpay.managemoney.ui.view.d dVar2;
        int iIsStrictMode = productBean.isStrictMode();
        this.f32532M = iIsStrictMode;
        int i7 = iIsStrictMode == 1 ? com.transsnet.palmpay.custom_view.r.cv_switch_open_green : com.transsnet.palmpay.custom_view.r.cv_switch_close_gray;
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.f32528B.getValue();
        if (appCompatImageView != null) {
            appCompatImageView.setImageResource(i7);
        }
        int i10 = 0;
        this.f32530H = productBean.getRenewDepositSwitch() == 1;
        int iD = p059e1.a.D(0, "invest_interest_disable");
        TextView textView = (TextView) this.f32527A.getValue();
        if (textView != null) {
            textView.setText(productBean.getShowName());
        }
        p355xf.t tVar = this.f32537w;
        LinearLayout linearLayout = (LinearLayout) tVar.getValue();
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        LinearLayout linearLayout2 = (LinearLayout) tVar.getValue();
        if (linearLayout2 != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            linearLayout2.addView(new PlanInfoItem(contextRequireContext, new com.transsnet.palmpay.managemoney.ui.view.d(linearLayout2.getResources().getString(Jc.f.mm_principal_amount), 12.0f, L6.b.ppColorTextAssist, null, null, false, null, 504), new com.transsnet.palmpay.managemoney.ui.view.d(Pa.r0.B(productBean.getPrincipal(), true), 12.0f, 0, null, null, false, null, 508), i10));
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            com.transsnet.palmpay.managemoney.ui.view.d dVar3 = new com.transsnet.palmpay.managemoney.ui.view.d(linearLayout2.getResources().getString(Jc.f.mm_interest_rate), 12.0f, L6.b.ppColorTextAssist, null, null, false, null, 504);
            if (iD == 0) {
                dVar2 = new com.transsnet.palmpay.managemoney.ui.view.d(N8.q0.j(Pa.r0.z0(String.valueOf(Pa.r0.w1(String.valueOf(productBean.getAnnualizedIncomeRatio()), "100"))), "%p.a."), 12.0f, 0, null, null, false, null, 508);
            } else {
                String string = linearLayout2.getResources().getString(p025ba.k.core_disabled);
                int i11 = L6.b.ppColorTextPrimary;
                androidx.fragment.app.E mActivity = this.f27319c;
                Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
                dVar2 = new com.transsnet.palmpay.managemoney.ui.view.d(string, 12.0f, i11, G8.a.x(mActivity, S6.a.pay_ArrowRight, null, Integer.valueOf(L6.b.ppColorTextPrimary), 16.0f, 114), new com.transsnet.palmpay.core.ui.activity.T(27), false, null, 464);
            }
            linearLayout2.addView(new PlanInfoItem(contextRequireContext2, dVar3, dVar2, i10));
            Context contextRequireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
            linearLayout2.addView(new PlanInfoItem(contextRequireContext3, new com.transsnet.palmpay.managemoney.ui.view.d(linearLayout2.getResources().getString(Jc.f.mm_duration_days), 12.0f, L6.b.ppColorTextAssist, null, null, false, null, 504), new com.transsnet.palmpay.managemoney.ui.view.d(productBean.getDurationDay() + " Days", 12.0f, 0, null, null, false, null, 508), i10));
            String strMillis2String = TimeUtils.millis2String(productBean.getMaturityDate(), new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH));
            Context contextRequireContext4 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
            com.transsnet.palmpay.managemoney.ui.view.d dVar4 = new com.transsnet.palmpay.managemoney.ui.view.d(linearLayout2.getResources().getString(Jc.f.mm_maturity_date), 12.0f, L6.b.ppColorTextAssist, null, null, true, new Hb.L(14, linearLayout2, this), MessageEvent.EVENT_GRAB_COUNT_DOWN_FINISH);
            com.transsnet.palmpay.managemoney.ui.view.d dVar5 = new com.transsnet.palmpay.managemoney.ui.view.d(strMillis2String, 12.0f, 0, null, null, false, null, 508);
            if (this.f32530H) {
                DensityUtil.dp2px(16.0f);
            } else {
                DensityUtil.dp2px(36.0f);
            }
            linearLayout2.addView(new PlanInfoItem(contextRequireContext4, dVar4, dVar5));
            if (this.f32530H) {
                TextView textView2 = new TextView(this.f27319c);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(0, -16, 0, 0);
                textView2.setLayoutParams(layoutParams);
                textView2.setText("Auto-Renewal Enabled");
                textView2.setGravity(8388613);
                textView2.setTextColor(linearLayout2.getResources().getColor(L6.b.ppColorTextAssist));
                textView2.setTextSize(1, 12.0f);
                linearLayout2.addView(textView2);
            }
            View viewInflate = View.inflate(this.f27319c, Jc.d.mm_plan_info_click_payment_item, null);
            ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, DensityUtil.dp2px(36.0f));
            if (viewInflate != null) {
                viewInflate.setLayoutParams(layoutParams2);
            }
            if (viewInflate != null) {
            }
            IconicsImageView iconicsImageView = viewInflate != null ? (IconicsImageView) viewInflate.findViewById(Jc.c.iconImageInfo) : null;
            IconicsTextView iconicsTextView = viewInflate != null ? (IconicsTextView) viewInflate.findViewById(Jc.c.tvPayment) : null;
            IconicsImageView iconicsImageView2 = viewInflate != null ? (IconicsImageView) viewInflate.findViewById(Jc.c.ivArrowRight) : null;
            if (iconicsImageView2 != null) {
                iconicsImageView2.setVisibility(8);
            }
            if (iconicsImageView != null) {
                iconicsImageView.setVisibility(8);
            }
            if (iconicsTextView != null) {
                iconicsTextView.setText("CashBox");
            }
            if (iconicsTextView != null) {
                iconicsTextView.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, linearLayout2.getContext()));
            }
            linearLayout2.addView(viewInflate);
        }
        p355xf.t tVar2 = this.f32536v;
        LinearLayout linearLayout3 = (LinearLayout) tVar2.getValue();
        if (linearLayout3 != null) {
            linearLayout3.removeAllViews();
        }
        LinearLayout linearLayout4 = (LinearLayout) tVar2.getValue();
        if (linearLayout4 != null) {
            Context contextRequireContext5 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "requireContext(...)");
            productBean2 = productBean;
            com.transsnet.palmpay.managemoney.ui.view.d dVar6 = new com.transsnet.palmpay.managemoney.ui.view.d(linearLayout4.getResources().getString(Jc.f.mm_interest_expected_value), 12.0f, L6.b.ppColorTextAssist, null, null, true, new Hb.A(linearLayout4, 4, productBean2, this), MessageEvent.EVENT_GRAB_COUNT_DOWN_FINISH);
            if (iD == 0) {
                dVar = new com.transsnet.palmpay.managemoney.ui.view.d(Pa.r0.B(productBean2.getEarning(), true), 12.0f, 0, null, null, false, null, 508);
            } else {
                String string2 = linearLayout4.getResources().getString(p025ba.k.core_disabled);
                int i12 = L6.b.ppColorTextPrimary;
                androidx.fragment.app.E mActivity2 = this.f27319c;
                Intrinsics.checkNotNullExpressionValue(mActivity2, "mActivity");
                dVar = new com.transsnet.palmpay.managemoney.ui.view.d(string2, 12.0f, i12, G8.a.x(mActivity2, S6.a.pay_ArrowRight, null, Integer.valueOf(L6.b.ppColorTextPrimary), 16.0f, 114), new com.transsnet.palmpay.core.ui.activity.T(28), false, null, 464);
            }
            linearLayout4.addView(new PlanInfoItem(contextRequireContext5, dVar6, dVar, i10));
            Context contextRequireContext6 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext6, "requireContext(...)");
            linearLayout4.addView(new PlanInfoItem(contextRequireContext6, new com.transsnet.palmpay.managemoney.ui.view.d(linearLayout4.getResources().getString(Jc.f.mm_total_value), 12.0f, L6.b.ppColorTextAssist, null, null, false, null, 504), new com.transsnet.palmpay.managemoney.ui.view.d(Pa.r0.B(iD == 0 ? productBean2.getTotalPayback() : productBean2.getPrincipal(), true), 12.0f, 0, null, null, false, null, 508), i10));
        } else {
            productBean2 = productBean;
        }
        p355xf.t tVar3 = this.t;
        LinearLayout linearLayout5 = (LinearLayout) tVar3.getValue();
        if (linearLayout5 != null) {
            linearLayout5.removeAllViews();
        }
        final LinearLayout linearLayout6 = (LinearLayout) tVar3.getValue();
        if (linearLayout6 != null) {
            View viewInflate2 = View.inflate(linearLayout6.getContext(), Jc.d.mm_auto_renewal_item, null);
            ViewGroup.LayoutParams layoutParams3 = viewInflate2.getLayoutParams();
            if (layoutParams3 == null) {
                viewInflate2.setLayoutParams(new ConstraintLayout.LayoutParams(-1, CommonViewExtKt.getDp(36.0f)));
            } else {
                layoutParams3.height = CommonViewExtKt.getDp((float) r9);
                viewInflate2.setLayoutParams(layoutParams3);
            }
            ((AppCompatImageView) viewInflate2.findViewById(Jc.c.switchWidget)).setVisibility(8);
            TextView textView3 = (TextView) viewInflate2.findViewById(Jc.c.tvSwitchStatus);
            textView3.setVisibility(0);
            IconicsTextView iconicsTextView2 = (IconicsTextView) viewInflate2.findViewById(Jc.c.tvBalanceAmount);
            IconicsImageView iconicsImageView3 = (IconicsImageView) viewInflate2.findViewById(Jc.c.iconImageInfo);
            if (this.f32530H) {
                textView3.setText("Enabled");
            } else {
                textView3.setTextColor(linearLayout6.getResources().getColor(L6.b.ppColorTextPrimary));
                textView3.setText("Disabled");
            }
            if (iconicsImageView3 != null) {
                final int i13 = 0;
                iconicsImageView3.setOnClickListener(new View.OnClickListener() { // from class: com.transsnet.palmpay.managemoney.ui.fragment.e0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OrderPreFragment orderPreFragment = this;
                        LinearLayout linearLayout7 = linearLayout6;
                        switch (i13) {
                            case 0:
                                OrderPreFragment.a aVar = OrderPreFragment.f32526Q;
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, linearLayout7.getResources().getString(Jc.f.mm_auto_renewal), linearLayout7.getResources().getString(Jc.f.mm_auto_renewal_dialog_text), linearLayout7.getResources().getString(p025ba.k.core_confirm), null, 8, null);
                                androidx.fragment.app.Z childFragmentManager = orderPreFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default.show(childFragmentManager, "showUpgradeLevelDialog");
                                break;
                            default:
                                OrderPreFragment.a aVar2 = OrderPreFragment.f32526Q;
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default2 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, linearLayout7.getResources().getString(Jc.f.mm_auto_renewal), linearLayout7.getResources().getString(Jc.f.mm_auto_renewal_dialog_text), linearLayout7.getResources().getString(p025ba.k.core_confirm), null, 8, null);
                                androidx.fragment.app.Z childFragmentManager2 = orderPreFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default2.show(childFragmentManager2, "showUpgradeLevelDialog");
                                break;
                        }
                    }
                });
            }
            if (iconicsTextView2 != null) {
                final int i14 = 1;
                iconicsTextView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsnet.palmpay.managemoney.ui.fragment.e0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OrderPreFragment orderPreFragment = this;
                        LinearLayout linearLayout7 = linearLayout6;
                        switch (i14) {
                            case 0:
                                OrderPreFragment.a aVar = OrderPreFragment.f32526Q;
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, linearLayout7.getResources().getString(Jc.f.mm_auto_renewal), linearLayout7.getResources().getString(Jc.f.mm_auto_renewal_dialog_text), linearLayout7.getResources().getString(p025ba.k.core_confirm), null, 8, null);
                                androidx.fragment.app.Z childFragmentManager = orderPreFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default.show(childFragmentManager, "showUpgradeLevelDialog");
                                break;
                            default:
                                OrderPreFragment.a aVar2 = OrderPreFragment.f32526Q;
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default2 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, linearLayout7.getResources().getString(Jc.f.mm_auto_renewal), linearLayout7.getResources().getString(Jc.f.mm_auto_renewal_dialog_text), linearLayout7.getResources().getString(p025ba.k.core_confirm), null, 8, null);
                                androidx.fragment.app.Z childFragmentManager2 = orderPreFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default2.show(childFragmentManager2, "showUpgradeLevelDialog");
                                break;
                        }
                    }
                });
            }
            linearLayout6.addView(viewInflate2);
            if (this.f32530H) {
                Context contextRequireContext7 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext7, "requireContext(...)");
                linearLayout6.addView(new PlanInfoItem(contextRequireContext7, new com.transsnet.palmpay.managemoney.ui.view.d(linearLayout6.getResources().getString(Jc.f.mm_renewal_amount), 12.0f, L6.b.ppColorTextAssist, null, null, false, null, 504), new com.transsnet.palmpay.managemoney.ui.view.d(Pa.r0.B(productBean2.getTotalPayback(), true), 12.0f, 0, null, null, false, null, 508), i10));
            }
        }
        t(productBean);
    }
}
