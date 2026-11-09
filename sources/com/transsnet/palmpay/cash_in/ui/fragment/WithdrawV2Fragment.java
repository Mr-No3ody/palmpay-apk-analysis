package com.transsnet.palmpay.cash_in.ui.fragment;

import Ab.C;
import Ab.ViewOnClickListenerC0053e;
import Ab.i;
import C9.C0138e;
import C9.Q;
import Ce.ViewOnClickListenerC0159a;
import E9.k;
import Ed.ViewOnTouchListenerC0223c;
import Fd.G;
import G9.r;
import G9.s;
import G9.u;
import G9.v;
import J9.D;
import J9.x;
import J9.y;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.E;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeView;
import com.transsnet.palmpay.cash_in.bean.response.WithdrawHomeEntranceBean;
import com.transsnet.palmpay.cash_in.ui.fragment.WithdrawV2Fragment;
import com.transsnet.palmpay.cash_in.ui.viewmodel.WithdrawHomeViewModel;
import com.transsnet.palmpay.cash_in.ui.viewmodel.WithdrawViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BankCardInfo;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.req.AddFamilyAccontReq;
import com.transsnet.palmpay.core.bean.req.QueryLimitAmountV2Req;
import com.transsnet.palmpay.core.bean.rsp.QueryLimitAmountResp;
import com.transsnet.palmpay.core.dialog.NgSelectBankCardDialog;
import com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView;
import com.transsnet.palmpay.core.viewmodel.ModelWithdrawBankaccountItem;
import com.transsnet.palmpay.custom_view.StateAmountEditText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.chromium.support_lib_boundary.util.b;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.Nullable;
import p140j8.f;
import p355xf.C2131j;
import p355xf.t;
import p366y9.c;
import p366y9.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/cash_in/ui/fragment/WithdrawV2Fragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/cash_in/ui/viewmodel/WithdrawViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "messageEvent", "", "onReceiveMessage", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWithdrawV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithdrawV2Fragment.kt\ncom/transsnet/palmpay/cash_in/ui/fragment/WithdrawV2Fragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,557:1\n152#2:558\n169#2:559\n152#2:560\n169#2:561\n260#2,10:562\n296#2:572\n260#2,10:573\n296#2:583\n260#2,10:584\n296#2:594\n115#2,8:595\n145#2:603\n*S KotlinDebug\n*F\n+ 1 WithdrawV2Fragment.kt\ncom/transsnet/palmpay/cash_in/ui/fragment/WithdrawV2Fragment\n*L\n319#1:558\n319#1:559\n335#1:560\n335#1:561\n352#1:562,10\n352#1:572\n360#1:573,10\n360#1:583\n398#1:584,10\n398#1:594\n416#1:595,8\n416#1:603\n*E\n"})
public final class WithdrawV2Fragment extends BaseMvvmFragment<WithdrawViewModel> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f27047A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f27048B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f27049C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f27050H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f27051L;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public long f27053Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public BankCardInfo f27054X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ArrayList f27055Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public NgSelectBankCardDialog f27056Z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f27057j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public QueryLimitAmountResp.DataBean f27058k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f27059o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f27060p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public long f27061p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f27062q0;
    public final t t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public r f27065t0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f27067v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public WithdrawHomeEntranceBean f27068v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f27069w;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public String f27052M = "";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f27063r0 = true;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ArrayList f27064s0 = new ArrayList();

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f27066u0 = true;

    public WithdrawV2Fragment() {
        final int i7 = 0;
        this.f27057j = C2131j.b(new Function0(this) { // from class: G9.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawV2Fragment f3185b;

            {
                this.f3185b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        View view = this.f3185b.f27318b;
                        if (view != null) {
                            return (DigitalKeyboardView) view.findViewById(p366y9.b.keyboard_view);
                        }
                        return null;
                    case 1:
                        View view2 = this.f3185b.f27318b;
                        if (view2 != null) {
                            return (MarqueeView) view2.findViewById(p366y9.b.viewNotice);
                        }
                        return null;
                    case 2:
                        E eRequireActivity = this.f3185b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (WithdrawHomeViewModel) new androidx.camera.video.internal.c(eRequireActivity).h(WithdrawHomeViewModel.class);
                    case 3:
                        View view3 = this.f3185b.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p366y9.b.rvMoneyList);
                        }
                        return null;
                    case 4:
                        View view4 = this.f3185b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p366y9.b.balance_tv);
                        }
                        return null;
                    case 5:
                        View view5 = this.f3185b.f27318b;
                        if (view5 != null) {
                            return (StateAmountEditText) view5.findViewById(p366y9.b.etAmount);
                        }
                        return null;
                    case 6:
                        View view6 = this.f3185b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p366y9.b.tvTips);
                        }
                        return null;
                    case 7:
                        View view7 = this.f3185b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p366y9.b.tvAmountUnit);
                        }
                        return null;
                    case 8:
                        View view8 = this.f3185b.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(p366y9.b.tvAmountTitle);
                        }
                        return null;
                    case 9:
                        View view9 = this.f3185b.f27318b;
                        if (view9 != null) {
                            return (RelativeLayout) view9.findViewById(p366y9.b.ci_add_bank_account);
                        }
                        return null;
                    default:
                        View view10 = this.f3185b.f27318b;
                        if (view10 != null) {
                            return (ModelWithdrawBankaccountItem) view10.findViewById(p366y9.b.ci_bank_account_item);
                        }
                        return null;
                }
            }
        });
        final int i10 = 3;
        this.f27059o = C2131j.b(new Function0(this) { // from class: G9.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawV2Fragment f3185b;

            {
                this.f3185b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        View view = this.f3185b.f27318b;
                        if (view != null) {
                            return (DigitalKeyboardView) view.findViewById(p366y9.b.keyboard_view);
                        }
                        return null;
                    case 1:
                        View view2 = this.f3185b.f27318b;
                        if (view2 != null) {
                            return (MarqueeView) view2.findViewById(p366y9.b.viewNotice);
                        }
                        return null;
                    case 2:
                        E eRequireActivity = this.f3185b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (WithdrawHomeViewModel) new androidx.camera.video.internal.c(eRequireActivity).h(WithdrawHomeViewModel.class);
                    case 3:
                        View view3 = this.f3185b.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p366y9.b.rvMoneyList);
                        }
                        return null;
                    case 4:
                        View view4 = this.f3185b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p366y9.b.balance_tv);
                        }
                        return null;
                    case 5:
                        View view5 = this.f3185b.f27318b;
                        if (view5 != null) {
                            return (StateAmountEditText) view5.findViewById(p366y9.b.etAmount);
                        }
                        return null;
                    case 6:
                        View view6 = this.f3185b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p366y9.b.tvTips);
                        }
                        return null;
                    case 7:
                        View view7 = this.f3185b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p366y9.b.tvAmountUnit);
                        }
                        return null;
                    case 8:
                        View view8 = this.f3185b.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(p366y9.b.tvAmountTitle);
                        }
                        return null;
                    case 9:
                        View view9 = this.f3185b.f27318b;
                        if (view9 != null) {
                            return (RelativeLayout) view9.findViewById(p366y9.b.ci_add_bank_account);
                        }
                        return null;
                    default:
                        View view10 = this.f3185b.f27318b;
                        if (view10 != null) {
                            return (ModelWithdrawBankaccountItem) view10.findViewById(p366y9.b.ci_bank_account_item);
                        }
                        return null;
                }
            }
        });
        final int i11 = 4;
        this.f27060p = C2131j.b(new Function0(this) { // from class: G9.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawV2Fragment f3185b;

            {
                this.f3185b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        View view = this.f3185b.f27318b;
                        if (view != null) {
                            return (DigitalKeyboardView) view.findViewById(p366y9.b.keyboard_view);
                        }
                        return null;
                    case 1:
                        View view2 = this.f3185b.f27318b;
                        if (view2 != null) {
                            return (MarqueeView) view2.findViewById(p366y9.b.viewNotice);
                        }
                        return null;
                    case 2:
                        E eRequireActivity = this.f3185b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (WithdrawHomeViewModel) new androidx.camera.video.internal.c(eRequireActivity).h(WithdrawHomeViewModel.class);
                    case 3:
                        View view3 = this.f3185b.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p366y9.b.rvMoneyList);
                        }
                        return null;
                    case 4:
                        View view4 = this.f3185b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p366y9.b.balance_tv);
                        }
                        return null;
                    case 5:
                        View view5 = this.f3185b.f27318b;
                        if (view5 != null) {
                            return (StateAmountEditText) view5.findViewById(p366y9.b.etAmount);
                        }
                        return null;
                    case 6:
                        View view6 = this.f3185b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p366y9.b.tvTips);
                        }
                        return null;
                    case 7:
                        View view7 = this.f3185b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p366y9.b.tvAmountUnit);
                        }
                        return null;
                    case 8:
                        View view8 = this.f3185b.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(p366y9.b.tvAmountTitle);
                        }
                        return null;
                    case 9:
                        View view9 = this.f3185b.f27318b;
                        if (view9 != null) {
                            return (RelativeLayout) view9.findViewById(p366y9.b.ci_add_bank_account);
                        }
                        return null;
                    default:
                        View view10 = this.f3185b.f27318b;
                        if (view10 != null) {
                            return (ModelWithdrawBankaccountItem) view10.findViewById(p366y9.b.ci_bank_account_item);
                        }
                        return null;
                }
            }
        });
        final int i12 = 5;
        this.t = C2131j.b(new Function0(this) { // from class: G9.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawV2Fragment f3185b;

            {
                this.f3185b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        View view = this.f3185b.f27318b;
                        if (view != null) {
                            return (DigitalKeyboardView) view.findViewById(p366y9.b.keyboard_view);
                        }
                        return null;
                    case 1:
                        View view2 = this.f3185b.f27318b;
                        if (view2 != null) {
                            return (MarqueeView) view2.findViewById(p366y9.b.viewNotice);
                        }
                        return null;
                    case 2:
                        E eRequireActivity = this.f3185b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (WithdrawHomeViewModel) new androidx.camera.video.internal.c(eRequireActivity).h(WithdrawHomeViewModel.class);
                    case 3:
                        View view3 = this.f3185b.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p366y9.b.rvMoneyList);
                        }
                        return null;
                    case 4:
                        View view4 = this.f3185b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p366y9.b.balance_tv);
                        }
                        return null;
                    case 5:
                        View view5 = this.f3185b.f27318b;
                        if (view5 != null) {
                            return (StateAmountEditText) view5.findViewById(p366y9.b.etAmount);
                        }
                        return null;
                    case 6:
                        View view6 = this.f3185b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p366y9.b.tvTips);
                        }
                        return null;
                    case 7:
                        View view7 = this.f3185b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p366y9.b.tvAmountUnit);
                        }
                        return null;
                    case 8:
                        View view8 = this.f3185b.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(p366y9.b.tvAmountTitle);
                        }
                        return null;
                    case 9:
                        View view9 = this.f3185b.f27318b;
                        if (view9 != null) {
                            return (RelativeLayout) view9.findViewById(p366y9.b.ci_add_bank_account);
                        }
                        return null;
                    default:
                        View view10 = this.f3185b.f27318b;
                        if (view10 != null) {
                            return (ModelWithdrawBankaccountItem) view10.findViewById(p366y9.b.ci_bank_account_item);
                        }
                        return null;
                }
            }
        });
        final int i13 = 6;
        this.f27067v = C2131j.b(new Function0(this) { // from class: G9.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawV2Fragment f3185b;

            {
                this.f3185b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        View view = this.f3185b.f27318b;
                        if (view != null) {
                            return (DigitalKeyboardView) view.findViewById(p366y9.b.keyboard_view);
                        }
                        return null;
                    case 1:
                        View view2 = this.f3185b.f27318b;
                        if (view2 != null) {
                            return (MarqueeView) view2.findViewById(p366y9.b.viewNotice);
                        }
                        return null;
                    case 2:
                        E eRequireActivity = this.f3185b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (WithdrawHomeViewModel) new androidx.camera.video.internal.c(eRequireActivity).h(WithdrawHomeViewModel.class);
                    case 3:
                        View view3 = this.f3185b.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p366y9.b.rvMoneyList);
                        }
                        return null;
                    case 4:
                        View view4 = this.f3185b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p366y9.b.balance_tv);
                        }
                        return null;
                    case 5:
                        View view5 = this.f3185b.f27318b;
                        if (view5 != null) {
                            return (StateAmountEditText) view5.findViewById(p366y9.b.etAmount);
                        }
                        return null;
                    case 6:
                        View view6 = this.f3185b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p366y9.b.tvTips);
                        }
                        return null;
                    case 7:
                        View view7 = this.f3185b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p366y9.b.tvAmountUnit);
                        }
                        return null;
                    case 8:
                        View view8 = this.f3185b.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(p366y9.b.tvAmountTitle);
                        }
                        return null;
                    case 9:
                        View view9 = this.f3185b.f27318b;
                        if (view9 != null) {
                            return (RelativeLayout) view9.findViewById(p366y9.b.ci_add_bank_account);
                        }
                        return null;
                    default:
                        View view10 = this.f3185b.f27318b;
                        if (view10 != null) {
                            return (ModelWithdrawBankaccountItem) view10.findViewById(p366y9.b.ci_bank_account_item);
                        }
                        return null;
                }
            }
        });
        final int i14 = 7;
        this.f27069w = C2131j.b(new Function0(this) { // from class: G9.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawV2Fragment f3185b;

            {
                this.f3185b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        View view = this.f3185b.f27318b;
                        if (view != null) {
                            return (DigitalKeyboardView) view.findViewById(p366y9.b.keyboard_view);
                        }
                        return null;
                    case 1:
                        View view2 = this.f3185b.f27318b;
                        if (view2 != null) {
                            return (MarqueeView) view2.findViewById(p366y9.b.viewNotice);
                        }
                        return null;
                    case 2:
                        E eRequireActivity = this.f3185b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (WithdrawHomeViewModel) new androidx.camera.video.internal.c(eRequireActivity).h(WithdrawHomeViewModel.class);
                    case 3:
                        View view3 = this.f3185b.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p366y9.b.rvMoneyList);
                        }
                        return null;
                    case 4:
                        View view4 = this.f3185b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p366y9.b.balance_tv);
                        }
                        return null;
                    case 5:
                        View view5 = this.f3185b.f27318b;
                        if (view5 != null) {
                            return (StateAmountEditText) view5.findViewById(p366y9.b.etAmount);
                        }
                        return null;
                    case 6:
                        View view6 = this.f3185b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p366y9.b.tvTips);
                        }
                        return null;
                    case 7:
                        View view7 = this.f3185b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p366y9.b.tvAmountUnit);
                        }
                        return null;
                    case 8:
                        View view8 = this.f3185b.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(p366y9.b.tvAmountTitle);
                        }
                        return null;
                    case 9:
                        View view9 = this.f3185b.f27318b;
                        if (view9 != null) {
                            return (RelativeLayout) view9.findViewById(p366y9.b.ci_add_bank_account);
                        }
                        return null;
                    default:
                        View view10 = this.f3185b.f27318b;
                        if (view10 != null) {
                            return (ModelWithdrawBankaccountItem) view10.findViewById(p366y9.b.ci_bank_account_item);
                        }
                        return null;
                }
            }
        });
        final int i15 = 8;
        this.f27047A = C2131j.b(new Function0(this) { // from class: G9.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawV2Fragment f3185b;

            {
                this.f3185b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        View view = this.f3185b.f27318b;
                        if (view != null) {
                            return (DigitalKeyboardView) view.findViewById(p366y9.b.keyboard_view);
                        }
                        return null;
                    case 1:
                        View view2 = this.f3185b.f27318b;
                        if (view2 != null) {
                            return (MarqueeView) view2.findViewById(p366y9.b.viewNotice);
                        }
                        return null;
                    case 2:
                        E eRequireActivity = this.f3185b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (WithdrawHomeViewModel) new androidx.camera.video.internal.c(eRequireActivity).h(WithdrawHomeViewModel.class);
                    case 3:
                        View view3 = this.f3185b.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p366y9.b.rvMoneyList);
                        }
                        return null;
                    case 4:
                        View view4 = this.f3185b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p366y9.b.balance_tv);
                        }
                        return null;
                    case 5:
                        View view5 = this.f3185b.f27318b;
                        if (view5 != null) {
                            return (StateAmountEditText) view5.findViewById(p366y9.b.etAmount);
                        }
                        return null;
                    case 6:
                        View view6 = this.f3185b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p366y9.b.tvTips);
                        }
                        return null;
                    case 7:
                        View view7 = this.f3185b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p366y9.b.tvAmountUnit);
                        }
                        return null;
                    case 8:
                        View view8 = this.f3185b.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(p366y9.b.tvAmountTitle);
                        }
                        return null;
                    case 9:
                        View view9 = this.f3185b.f27318b;
                        if (view9 != null) {
                            return (RelativeLayout) view9.findViewById(p366y9.b.ci_add_bank_account);
                        }
                        return null;
                    default:
                        View view10 = this.f3185b.f27318b;
                        if (view10 != null) {
                            return (ModelWithdrawBankaccountItem) view10.findViewById(p366y9.b.ci_bank_account_item);
                        }
                        return null;
                }
            }
        });
        final int i16 = 9;
        this.f27048B = C2131j.b(new Function0(this) { // from class: G9.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawV2Fragment f3185b;

            {
                this.f3185b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        View view = this.f3185b.f27318b;
                        if (view != null) {
                            return (DigitalKeyboardView) view.findViewById(p366y9.b.keyboard_view);
                        }
                        return null;
                    case 1:
                        View view2 = this.f3185b.f27318b;
                        if (view2 != null) {
                            return (MarqueeView) view2.findViewById(p366y9.b.viewNotice);
                        }
                        return null;
                    case 2:
                        E eRequireActivity = this.f3185b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (WithdrawHomeViewModel) new androidx.camera.video.internal.c(eRequireActivity).h(WithdrawHomeViewModel.class);
                    case 3:
                        View view3 = this.f3185b.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p366y9.b.rvMoneyList);
                        }
                        return null;
                    case 4:
                        View view4 = this.f3185b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p366y9.b.balance_tv);
                        }
                        return null;
                    case 5:
                        View view5 = this.f3185b.f27318b;
                        if (view5 != null) {
                            return (StateAmountEditText) view5.findViewById(p366y9.b.etAmount);
                        }
                        return null;
                    case 6:
                        View view6 = this.f3185b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p366y9.b.tvTips);
                        }
                        return null;
                    case 7:
                        View view7 = this.f3185b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p366y9.b.tvAmountUnit);
                        }
                        return null;
                    case 8:
                        View view8 = this.f3185b.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(p366y9.b.tvAmountTitle);
                        }
                        return null;
                    case 9:
                        View view9 = this.f3185b.f27318b;
                        if (view9 != null) {
                            return (RelativeLayout) view9.findViewById(p366y9.b.ci_add_bank_account);
                        }
                        return null;
                    default:
                        View view10 = this.f3185b.f27318b;
                        if (view10 != null) {
                            return (ModelWithdrawBankaccountItem) view10.findViewById(p366y9.b.ci_bank_account_item);
                        }
                        return null;
                }
            }
        });
        final int i17 = 10;
        this.f27049C = C2131j.b(new Function0(this) { // from class: G9.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawV2Fragment f3185b;

            {
                this.f3185b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        View view = this.f3185b.f27318b;
                        if (view != null) {
                            return (DigitalKeyboardView) view.findViewById(p366y9.b.keyboard_view);
                        }
                        return null;
                    case 1:
                        View view2 = this.f3185b.f27318b;
                        if (view2 != null) {
                            return (MarqueeView) view2.findViewById(p366y9.b.viewNotice);
                        }
                        return null;
                    case 2:
                        E eRequireActivity = this.f3185b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (WithdrawHomeViewModel) new androidx.camera.video.internal.c(eRequireActivity).h(WithdrawHomeViewModel.class);
                    case 3:
                        View view3 = this.f3185b.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p366y9.b.rvMoneyList);
                        }
                        return null;
                    case 4:
                        View view4 = this.f3185b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p366y9.b.balance_tv);
                        }
                        return null;
                    case 5:
                        View view5 = this.f3185b.f27318b;
                        if (view5 != null) {
                            return (StateAmountEditText) view5.findViewById(p366y9.b.etAmount);
                        }
                        return null;
                    case 6:
                        View view6 = this.f3185b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p366y9.b.tvTips);
                        }
                        return null;
                    case 7:
                        View view7 = this.f3185b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p366y9.b.tvAmountUnit);
                        }
                        return null;
                    case 8:
                        View view8 = this.f3185b.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(p366y9.b.tvAmountTitle);
                        }
                        return null;
                    case 9:
                        View view9 = this.f3185b.f27318b;
                        if (view9 != null) {
                            return (RelativeLayout) view9.findViewById(p366y9.b.ci_add_bank_account);
                        }
                        return null;
                    default:
                        View view10 = this.f3185b.f27318b;
                        if (view10 != null) {
                            return (ModelWithdrawBankaccountItem) view10.findViewById(p366y9.b.ci_bank_account_item);
                        }
                        return null;
                }
            }
        });
        final int i18 = 1;
        this.f27050H = C2131j.b(new Function0(this) { // from class: G9.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawV2Fragment f3185b;

            {
                this.f3185b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        View view = this.f3185b.f27318b;
                        if (view != null) {
                            return (DigitalKeyboardView) view.findViewById(p366y9.b.keyboard_view);
                        }
                        return null;
                    case 1:
                        View view2 = this.f3185b.f27318b;
                        if (view2 != null) {
                            return (MarqueeView) view2.findViewById(p366y9.b.viewNotice);
                        }
                        return null;
                    case 2:
                        E eRequireActivity = this.f3185b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (WithdrawHomeViewModel) new androidx.camera.video.internal.c(eRequireActivity).h(WithdrawHomeViewModel.class);
                    case 3:
                        View view3 = this.f3185b.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p366y9.b.rvMoneyList);
                        }
                        return null;
                    case 4:
                        View view4 = this.f3185b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p366y9.b.balance_tv);
                        }
                        return null;
                    case 5:
                        View view5 = this.f3185b.f27318b;
                        if (view5 != null) {
                            return (StateAmountEditText) view5.findViewById(p366y9.b.etAmount);
                        }
                        return null;
                    case 6:
                        View view6 = this.f3185b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p366y9.b.tvTips);
                        }
                        return null;
                    case 7:
                        View view7 = this.f3185b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p366y9.b.tvAmountUnit);
                        }
                        return null;
                    case 8:
                        View view8 = this.f3185b.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(p366y9.b.tvAmountTitle);
                        }
                        return null;
                    case 9:
                        View view9 = this.f3185b.f27318b;
                        if (view9 != null) {
                            return (RelativeLayout) view9.findViewById(p366y9.b.ci_add_bank_account);
                        }
                        return null;
                    default:
                        View view10 = this.f3185b.f27318b;
                        if (view10 != null) {
                            return (ModelWithdrawBankaccountItem) view10.findViewById(p366y9.b.ci_bank_account_item);
                        }
                        return null;
                }
            }
        });
        final int i19 = 2;
        this.f27051L = C2131j.b(new Function0(this) { // from class: G9.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawV2Fragment f3185b;

            {
                this.f3185b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i19) {
                    case 0:
                        View view = this.f3185b.f27318b;
                        if (view != null) {
                            return (DigitalKeyboardView) view.findViewById(p366y9.b.keyboard_view);
                        }
                        return null;
                    case 1:
                        View view2 = this.f3185b.f27318b;
                        if (view2 != null) {
                            return (MarqueeView) view2.findViewById(p366y9.b.viewNotice);
                        }
                        return null;
                    case 2:
                        E eRequireActivity = this.f3185b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (WithdrawHomeViewModel) new androidx.camera.video.internal.c(eRequireActivity).h(WithdrawHomeViewModel.class);
                    case 3:
                        View view3 = this.f3185b.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p366y9.b.rvMoneyList);
                        }
                        return null;
                    case 4:
                        View view4 = this.f3185b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p366y9.b.balance_tv);
                        }
                        return null;
                    case 5:
                        View view5 = this.f3185b.f27318b;
                        if (view5 != null) {
                            return (StateAmountEditText) view5.findViewById(p366y9.b.etAmount);
                        }
                        return null;
                    case 6:
                        View view6 = this.f3185b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p366y9.b.tvTips);
                        }
                        return null;
                    case 7:
                        View view7 = this.f3185b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p366y9.b.tvAmountUnit);
                        }
                        return null;
                    case 8:
                        View view8 = this.f3185b.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(p366y9.b.tvAmountTitle);
                        }
                        return null;
                    case 9:
                        View view9 = this.f3185b.f27318b;
                        if (view9 != null) {
                            return (RelativeLayout) view9.findViewById(p366y9.b.ci_add_bank_account);
                        }
                        return null;
                    default:
                        View view10 = this.f3185b.f27318b;
                        if (view10 != null) {
                            return (ModelWithdrawBankaccountItem) view10.findViewById(p366y9.b.ci_bank_account_item);
                        }
                        return null;
                }
            }
        });
    }

    public static final void t(WithdrawV2Fragment withdrawV2Fragment, BankCardInfo bankCardInfo) {
        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.payType = 2;
        paymentMethod.senderAccountType = bankCardInfo != null ? bankCardInfo.payeeAccountType : 0;
        paymentMethod.reUseable = 0;
        paymentMethod.cardNo = bankCardInfo != null ? bankCardInfo.cardNo : null;
        paymentMethod.bankAccountNo = bankCardInfo != null ? bankCardInfo.bankAccountNo : null;
        paymentMethod.bankCode = bankCardInfo != null ? bankCardInfo.bankCode : null;
        paymentMethod.bankName = bankCardInfo != null ? bankCardInfo.bankName : null;
        paymentMethod.bankUrl = bankCardInfo != null ? bankCardInfo.bankUrl : null;
        paymentMethod.userName = bankCardInfo != null ? bankCardInfo.userName : null;
        paymentMethod.authFlag = bankCardInfo != null ? bankCardInfo.authFlag : 0;
        ModelWithdrawBankaccountItem modelWithdrawBankaccountItem = (ModelWithdrawBankaccountItem) withdrawV2Fragment.f27049C.getValue();
        if (modelWithdrawBankaccountItem != null) {
            modelWithdrawBankaccountItem.setPaymentMethod(paymentMethod);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return c.ci_in_fragment_withdraw_v2;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        org.greenrobot.eventbus.c.b().j(this);
        WithdrawViewModel withdrawViewModel = (WithdrawViewModel) this.f27333i;
        l lVar = withdrawViewModel != null ? withdrawViewModel.f27111e : null;
        if (lVar != null) {
            lVar.e(this, new G(new s(this, 3), 2));
        }
        WithdrawViewModel withdrawViewModel2 = (WithdrawViewModel) this.f27333i;
        l lVar2 = withdrawViewModel2 != null ? withdrawViewModel2.f27115j : null;
        if (lVar2 != null) {
            lVar2.e(this, new G(new s(this, 4), 2));
        }
        WithdrawViewModel withdrawViewModel3 = (WithdrawViewModel) this.f27333i;
        l lVar3 = withdrawViewModel3 != null ? withdrawViewModel3.f27112f : null;
        if (lVar3 != null) {
            lVar3.e(this, new G(new Q(18, this, this), 2));
        }
        WithdrawViewModel withdrawViewModel4 = (WithdrawViewModel) this.f27333i;
        l lVar4 = withdrawViewModel4 != null ? withdrawViewModel4.f27113g : null;
        if (lVar4 != null) {
            lVar4.e(this, new G(new s(this, this, 1), 2));
        }
        WithdrawViewModel withdrawViewModel5 = (WithdrawViewModel) this.f27333i;
        l lVar5 = withdrawViewModel5 != null ? withdrawViewModel5.f27114i : null;
        if (lVar5 != null) {
            lVar5.e(this, new G(new s(this, this, 2), 2));
        }
        WithdrawViewModel withdrawViewModel6 = (WithdrawViewModel) this.f27333i;
        l lVar6 = withdrawViewModel6 != null ? withdrawViewModel6.f27119w : null;
        if (lVar6 != null) {
            lVar6.e(this, new G(new s(this, 0), 2));
        }
        return 1;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        v((this.f27066u0 || this.f27333i == null) ? false : true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        StateAmountEditText stateAmountEditTextU = u();
        if (stateAmountEditTextU != null) {
            stateAmountEditTextU.setShowSoftInputOnFocus(false);
        }
        ((WithdrawHomeViewModel) this.f27051L.getValue()).f27109e.e(getViewLifecycleOwner(), new C0138e(new C(this, 14), (char) 0));
        StateAmountEditText stateAmountEditTextU2 = u();
        if (stateAmountEditTextU2 != null) {
            stateAmountEditTextU2.setOnTouchListener(new ViewOnTouchListenerC0223c(this, 1));
        }
        StateAmountEditText stateAmountEditTextU3 = u();
        if (stateAmountEditTextU3 != null) {
            stateAmountEditTextU3.f30975b = false;
        }
        StateAmountEditText stateAmountEditTextU4 = u();
        if (stateAmountEditTextU4 != null) {
            stateAmountEditTextU4.addTextChangedListener(new i(this, 12));
        }
        TextView textView = (TextView) this.f27047A.getValue();
        if (textView != null) {
            textView.setText(getString(d.ci_withdraw_input_amount_hint, BaseApplication.getCurrencySymbol()));
        }
        TextView textView2 = (TextView) this.f27069w.getValue();
        if (textView2 != null) {
            textView2.setText(BaseApplication.getCurrencySymbol());
        }
        t tVar = this.f27059o;
        RecyclerView recyclerView = (RecyclerView) tVar.getValue();
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 4, 1, false));
        }
        RecyclerView recyclerView2 = (RecyclerView) tVar.getValue();
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(new u());
        }
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        ArrayList data = this.f27064s0;
        if (data == null) {
            data = new ArrayList();
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        k kVar = new k(context, data);
        RecyclerView recyclerView3 = (RecyclerView) tVar.getValue();
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(kVar);
        }
        p1.d itemClickListener = new p1.d(7, this, kVar);
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        kVar.f4993c = itemClickListener;
        t tVar2 = this.f27057j;
        DigitalKeyboardView digitalKeyboardView = (DigitalKeyboardView) tVar2.getValue();
        if (digitalKeyboardView != null) {
            digitalKeyboardView.setActionButtonEnable(false);
        }
        DigitalKeyboardView digitalKeyboardView2 = (DigitalKeyboardView) tVar2.getValue();
        if (digitalKeyboardView2 != null) {
            digitalKeyboardView2.setDigitalKeyboardClickListener(new v(this));
        }
        this.f27065t0 = new r(this, 0);
        E activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewTreeObserver = decorView.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f27065t0);
        }
        this.f27055Y = new ArrayList();
        NgSelectBankCardDialog ngSelectBankCardDialog = new NgSelectBankCardDialog(getContext());
        this.f27056Z = ngSelectBankCardDialog;
        ngSelectBankCardDialog.setDialogTitle(getString(d.ci_select_a_withdrawl_account));
        ModelWithdrawBankaccountItem modelWithdrawBankaccountItem = (ModelWithdrawBankaccountItem) this.f27049C.getValue();
        if (modelWithdrawBankaccountItem != null) {
            modelWithdrawBankaccountItem.setOnClickListener(new ViewOnClickListenerC0159a(this, 15));
        }
        RelativeLayout relativeLayout = (RelativeLayout) this.f27048B.getValue();
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new ViewOnClickListenerC0053e(12));
        }
        NgSelectBankCardDialog ngSelectBankCardDialog2 = this.f27056Z;
        if (ngSelectBankCardDialog2 != null) {
            ngSelectBankCardDialog2.setCallBack(new G9.t(this));
        }
        b.d((MarqueeView) this.f27050H.getValue(), Boolean.TRUE);
        super.o();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceiveMessage(@Nullable MessageEvent messageEvent) {
        WithdrawViewModel withdrawViewModel;
        if (messageEvent == null || messageEvent.getEventType() != 9 || (withdrawViewModel = (WithdrawViewModel) this.f27333i) == null) {
            return;
        }
        withdrawViewModel.d();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z3) {
        super.setUserVisibleHint(z3);
        v(z3 && this.f27066u0 && this.f27333i != null);
        this.f27066u0 = false;
    }

    public final StateAmountEditText u() {
        return (StateAmountEditText) this.t.getValue();
    }

    public final void v(boolean z3) {
        WithdrawViewModel withdrawViewModel;
        if (z3) {
            if (this.f27061p0 <= 0 && (withdrawViewModel = (WithdrawViewModel) this.f27333i) != null) {
                f.s(withdrawViewModel, new y(1, null), withdrawViewModel.f27111e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            }
            QueryLimitAmountV2Req queryLimitAmountV2Req = new QueryLimitAmountV2Req();
            queryLimitAmountV2Req.countryCode = BaseApplication.getCountryLocale();
            queryLimitAmountV2Req.currency = BaseApplication.getCurrency();
            queryLimitAmountV2Req.transType = "02";
            queryLimitAmountV2Req.payeeAccountType = AddFamilyAccontReq.BILLER_CATEGORY_ID_BUNDLE;
            queryLimitAmountV2Req.payerAccountType = "1";
            WithdrawViewModel withdrawViewModel2 = (WithdrawViewModel) this.f27333i;
            if (withdrawViewModel2 != null) {
                f.s(withdrawViewModel2, new D(queryLimitAmountV2Req, null), withdrawViewModel2.f27115j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            }
            WithdrawViewModel withdrawViewModel3 = (WithdrawViewModel) this.f27333i;
            if (withdrawViewModel3 != null) {
                withdrawViewModel3.d();
            }
            WithdrawViewModel withdrawViewModel4 = (WithdrawViewModel) this.f27333i;
            if (withdrawViewModel4 != null) {
                f.s(withdrawViewModel4, new x(1, null), withdrawViewModel4.f27119w, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            }
        }
    }
}
