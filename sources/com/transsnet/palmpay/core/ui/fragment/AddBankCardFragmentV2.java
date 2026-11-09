package com.transsnet.palmpay.core.ui.fragment;

import C0.G;
import Pa.C0525w;
import Pa.J;
import Pa.K;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Ua.C0617b;
import Ua.C0619c;
import Ua.C0621d;
import Ua.C0623e;
import Ua.C0625f;
import Ua.C0626g;
import Wd.I;
import Wf.t0;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.E;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.gson.Gson;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.common.export.bean.req.AddBankCardReq;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BankCardExtInfo;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.payment.CheckPayReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.bean.req.BindBankCardReq;
import com.transsnet.palmpay.core.bean.req.CheckCardBindNumReq;
import com.transsnet.palmpay.core.bean.req.CheckModifyBankCardReq;
import com.transsnet.palmpay.core.dialog.MonthPickDialog;
import com.transsnet.palmpay.core.ui.activity.AddBankCardAccountActivity;
import com.transsnet.palmpay.core.ui.activity.ViewOnClickListenerC1478l;
import com.transsnet.palmpay.core.ui.activity.d0;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.viewmodel.AddBankCardViewModel;
import com.transsnet.palmpay.custom_view.input.MaxLengthFilter;
import com.transsnet.palmpay.custom_view.model.ModelErrorDivider;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.TimeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.fastkv.n;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.y;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/coreImpl/add_new_fragment")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002\u000e\u000fB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/core/ui/fragment/AddBankCardFragmentV2;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/core/viewmodel/AddBankCardViewModel;", "Lcom/transsnet/palmpay/core/dialog/MonthPickDialog$CallBack;", "Lcom/transsnet/palmpay/core/ui/activity/AddBankCardAccountActivity$BackPressedListener;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "messageEvent", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "event", "onMessageEvent", "CheckCvvDialog", "a", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAddBankCardFragmentV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddBankCardFragmentV2.kt\ncom/transsnet/palmpay/core/ui/fragment/AddBankCardFragmentV2\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,928:1\n55#2,12:929\n84#2,3:941\n55#2,12:944\n84#2,3:956\n152#3:959\n169#3:960\n152#3:961\n169#3:962\n1#4:963\n*S KotlinDebug\n*F\n+ 1 AddBankCardFragmentV2.kt\ncom/transsnet/palmpay/core/ui/fragment/AddBankCardFragmentV2\n*L\n197#1:929,12\n197#1:941,3\n203#1:944,12\n203#1:956,3\n282#1:959\n282#1:960\n299#1:961\n299#1:962\n*E\n"})
public final class AddBankCardFragmentV2 extends BaseMvvmFragment<AddBankCardViewModel> implements MonthPickDialog.CallBack, AddBankCardAccountActivity.BackPressedListener {

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public static final /* synthetic */ int f27826C0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f27827A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public Long f27828A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f27829B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final t f27830B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f27831C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f27832H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f27833L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f27834M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f27835Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final t f27836X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f27837Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f27838Z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f27839j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public O6.d f27840k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f27841o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f27842p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f27843p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f27844q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public AddBankCardReq f27845r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public BankInfo f27846s0;
    public final t t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public MaxLengthFilter f27847t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f27848u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f27849v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public BindBankCardReq f27850v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f27851w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public String f27852w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f27853x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f27854y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public Long f27855z0;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/core/ui/fragment/AddBankCardFragmentV2$CheckCvvDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Lcom/transsnet/palmpay/core/ui/fragment/AddBankCardFragmentV2;Landroid/content/Context;)V", "", "initViews", "()V", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class CheckCvvDialog extends com.transsnet.palmpay.custom_view.dialog.b {
        public CheckCvvDialog(Context context) {
            super(context, p025ba.g.core_layout_how_to_get_cvv);
        }

        @Override // com.transsnet.palmpay.custom_view.dialog.b
        public void initViews() {
            View viewFindViewById = findViewById(p025ba.e.tvOk);
            if (viewFindViewById != null) {
                viewFindViewById.setOnClickListener(new Yd.i(this, 26));
            }
        }
    }

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

    public AddBankCardFragmentV2() {
        final int i7 = 0;
        C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.fragment.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankCardFragmentV2 f27911b;

            {
                this.f27911b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankCardFragmentV2 addBankCardFragmentV2 = this.f27911b;
                switch (i7) {
                    case 0:
                        int i10 = AddBankCardFragmentV2.f27826C0;
                        View view = addBankCardFragmentV2.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(L9.a.select_other_method_tv);
                        }
                        return null;
                    case 1:
                        int i11 = AddBankCardFragmentV2.f27826C0;
                        View view2 = addBankCardFragmentV2.f27318b;
                        if (view2 != null) {
                            return (ModelErrorDivider) view2.findViewById(L9.a.med_valid_thru);
                        }
                        return null;
                    case 2:
                        int i12 = AddBankCardFragmentV2.f27826C0;
                        View view3 = addBankCardFragmentV2.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(L9.a.tv_valid_thru);
                        }
                        return null;
                    case 3:
                        int i13 = AddBankCardFragmentV2.f27826C0;
                        View view4 = addBankCardFragmentV2.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(L9.a.tv_valid_thru_title);
                        }
                        return null;
                    case 4:
                        int i14 = AddBankCardFragmentV2.f27826C0;
                        View view5 = addBankCardFragmentV2.f27318b;
                        if (view5 != null) {
                            return (ModelErrorDivider) view5.findViewById(L9.a.med_card_no);
                        }
                        return null;
                    case 5:
                        int i15 = AddBankCardFragmentV2.f27826C0;
                        View view6 = addBankCardFragmentV2.f27318b;
                        if (view6 != null) {
                            return (EditText) view6.findViewById(L9.a.et_bank_card_no);
                        }
                        return null;
                    case 6:
                        int i16 = AddBankCardFragmentV2.f27826C0;
                        View view7 = addBankCardFragmentV2.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(L9.a.tv_card_no_title);
                        }
                        return null;
                    case 7:
                        int i17 = AddBankCardFragmentV2.f27826C0;
                        View view8 = addBankCardFragmentV2.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(L9.a.tvTopTips);
                        }
                        return null;
                    case 8:
                        int i18 = AddBankCardFragmentV2.f27826C0;
                        MonthPickDialog monthPickDialog = new MonthPickDialog(addBankCardFragmentV2.requireContext());
                        monthPickDialog.setShowConfirmBtn(true);
                        monthPickDialog.setDateRange(0, 30);
                        monthPickDialog.setCallBack(addBankCardFragmentV2);
                        return monthPickDialog;
                    case 9:
                        int i19 = AddBankCardFragmentV2.f27826C0;
                        E eRequireActivity = addBankCardFragmentV2.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (C0617b) new androidx.camera.video.internal.c(eRequireActivity).h(C0617b.class);
                    case 10:
                        int i20 = AddBankCardFragmentV2.f27826C0;
                        View view9 = addBankCardFragmentV2.f27318b;
                        if (view9 != null) {
                            return (PpButton) view9.findViewById(L9.a.next_bt);
                        }
                        return null;
                    case 11:
                        int i21 = AddBankCardFragmentV2.f27826C0;
                        View view10 = addBankCardFragmentV2.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(L9.a.tv_add_card_tips);
                        }
                        return null;
                    case 12:
                        int i22 = AddBankCardFragmentV2.f27826C0;
                        View view11 = addBankCardFragmentV2.f27318b;
                        if (view11 != null) {
                            return (ModelErrorDivider) view11.findViewById(L9.a.med_card_pin);
                        }
                        return null;
                    case 13:
                        int i23 = AddBankCardFragmentV2.f27826C0;
                        View view12 = addBankCardFragmentV2.f27318b;
                        if (view12 != null) {
                            return (IconicsImageView) view12.findViewById(L9.a.iiv_card_pin_show);
                        }
                        return null;
                    case 14:
                        int i24 = AddBankCardFragmentV2.f27826C0;
                        View view13 = addBankCardFragmentV2.f27318b;
                        if (view13 != null) {
                            return (EditText) view13.findViewById(L9.a.et_card_pin);
                        }
                        return null;
                    case 15:
                        int i25 = AddBankCardFragmentV2.f27826C0;
                        View view14 = addBankCardFragmentV2.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(L9.a.tv_card_pin_title);
                        }
                        return null;
                    case 16:
                        int i26 = AddBankCardFragmentV2.f27826C0;
                        View view15 = addBankCardFragmentV2.f27318b;
                        if (view15 != null) {
                            return (ModelErrorDivider) view15.findViewById(L9.a.med_cvv);
                        }
                        return null;
                    case 17:
                        int i27 = AddBankCardFragmentV2.f27826C0;
                        View view16 = addBankCardFragmentV2.f27318b;
                        if (view16 != null) {
                            return (EditText) view16.findViewById(L9.a.et_cvv);
                        }
                        return null;
                    default:
                        int i28 = AddBankCardFragmentV2.f27826C0;
                        View view17 = addBankCardFragmentV2.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(L9.a.tv_cvv_title);
                        }
                        return null;
                }
            }
        });
        final int i10 = 10;
        this.f27839j = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.fragment.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankCardFragmentV2 f27911b;

            {
                this.f27911b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankCardFragmentV2 addBankCardFragmentV2 = this.f27911b;
                switch (i10) {
                    case 0:
                        int i11 = AddBankCardFragmentV2.f27826C0;
                        View view = addBankCardFragmentV2.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(L9.a.select_other_method_tv);
                        }
                        return null;
                    case 1:
                        int i12 = AddBankCardFragmentV2.f27826C0;
                        View view2 = addBankCardFragmentV2.f27318b;
                        if (view2 != null) {
                            return (ModelErrorDivider) view2.findViewById(L9.a.med_valid_thru);
                        }
                        return null;
                    case 2:
                        int i13 = AddBankCardFragmentV2.f27826C0;
                        View view3 = addBankCardFragmentV2.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(L9.a.tv_valid_thru);
                        }
                        return null;
                    case 3:
                        int i14 = AddBankCardFragmentV2.f27826C0;
                        View view4 = addBankCardFragmentV2.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(L9.a.tv_valid_thru_title);
                        }
                        return null;
                    case 4:
                        int i15 = AddBankCardFragmentV2.f27826C0;
                        View view5 = addBankCardFragmentV2.f27318b;
                        if (view5 != null) {
                            return (ModelErrorDivider) view5.findViewById(L9.a.med_card_no);
                        }
                        return null;
                    case 5:
                        int i16 = AddBankCardFragmentV2.f27826C0;
                        View view6 = addBankCardFragmentV2.f27318b;
                        if (view6 != null) {
                            return (EditText) view6.findViewById(L9.a.et_bank_card_no);
                        }
                        return null;
                    case 6:
                        int i17 = AddBankCardFragmentV2.f27826C0;
                        View view7 = addBankCardFragmentV2.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(L9.a.tv_card_no_title);
                        }
                        return null;
                    case 7:
                        int i18 = AddBankCardFragmentV2.f27826C0;
                        View view8 = addBankCardFragmentV2.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(L9.a.tvTopTips);
                        }
                        return null;
                    case 8:
                        int i19 = AddBankCardFragmentV2.f27826C0;
                        MonthPickDialog monthPickDialog = new MonthPickDialog(addBankCardFragmentV2.requireContext());
                        monthPickDialog.setShowConfirmBtn(true);
                        monthPickDialog.setDateRange(0, 30);
                        monthPickDialog.setCallBack(addBankCardFragmentV2);
                        return monthPickDialog;
                    case 9:
                        int i110 = AddBankCardFragmentV2.f27826C0;
                        E eRequireActivity = addBankCardFragmentV2.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (C0617b) new androidx.camera.video.internal.c(eRequireActivity).h(C0617b.class);
                    case 10:
                        int i20 = AddBankCardFragmentV2.f27826C0;
                        View view9 = addBankCardFragmentV2.f27318b;
                        if (view9 != null) {
                            return (PpButton) view9.findViewById(L9.a.next_bt);
                        }
                        return null;
                    case 11:
                        int i21 = AddBankCardFragmentV2.f27826C0;
                        View view10 = addBankCardFragmentV2.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(L9.a.tv_add_card_tips);
                        }
                        return null;
                    case 12:
                        int i22 = AddBankCardFragmentV2.f27826C0;
                        View view11 = addBankCardFragmentV2.f27318b;
                        if (view11 != null) {
                            return (ModelErrorDivider) view11.findViewById(L9.a.med_card_pin);
                        }
                        return null;
                    case 13:
                        int i23 = AddBankCardFragmentV2.f27826C0;
                        View view12 = addBankCardFragmentV2.f27318b;
                        if (view12 != null) {
                            return (IconicsImageView) view12.findViewById(L9.a.iiv_card_pin_show);
                        }
                        return null;
                    case 14:
                        int i24 = AddBankCardFragmentV2.f27826C0;
                        View view13 = addBankCardFragmentV2.f27318b;
                        if (view13 != null) {
                            return (EditText) view13.findViewById(L9.a.et_card_pin);
                        }
                        return null;
                    case 15:
                        int i25 = AddBankCardFragmentV2.f27826C0;
                        View view14 = addBankCardFragmentV2.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(L9.a.tv_card_pin_title);
                        }
                        return null;
                    case 16:
                        int i26 = AddBankCardFragmentV2.f27826C0;
                        View view15 = addBankCardFragmentV2.f27318b;
                        if (view15 != null) {
                            return (ModelErrorDivider) view15.findViewById(L9.a.med_cvv);
                        }
                        return null;
                    case 17:
                        int i27 = AddBankCardFragmentV2.f27826C0;
                        View view16 = addBankCardFragmentV2.f27318b;
                        if (view16 != null) {
                            return (EditText) view16.findViewById(L9.a.et_cvv);
                        }
                        return null;
                    default:
                        int i28 = AddBankCardFragmentV2.f27826C0;
                        View view17 = addBankCardFragmentV2.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(L9.a.tv_cvv_title);
                        }
                        return null;
                }
            }
        });
        final int i11 = 11;
        this.f27841o = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.fragment.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankCardFragmentV2 f27911b;

            {
                this.f27911b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankCardFragmentV2 addBankCardFragmentV2 = this.f27911b;
                switch (i11) {
                    case 0:
                        int i12 = AddBankCardFragmentV2.f27826C0;
                        View view = addBankCardFragmentV2.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(L9.a.select_other_method_tv);
                        }
                        return null;
                    case 1:
                        int i13 = AddBankCardFragmentV2.f27826C0;
                        View view2 = addBankCardFragmentV2.f27318b;
                        if (view2 != null) {
                            return (ModelErrorDivider) view2.findViewById(L9.a.med_valid_thru);
                        }
                        return null;
                    case 2:
                        int i14 = AddBankCardFragmentV2.f27826C0;
                        View view3 = addBankCardFragmentV2.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(L9.a.tv_valid_thru);
                        }
                        return null;
                    case 3:
                        int i15 = AddBankCardFragmentV2.f27826C0;
                        View view4 = addBankCardFragmentV2.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(L9.a.tv_valid_thru_title);
                        }
                        return null;
                    case 4:
                        int i16 = AddBankCardFragmentV2.f27826C0;
                        View view5 = addBankCardFragmentV2.f27318b;
                        if (view5 != null) {
                            return (ModelErrorDivider) view5.findViewById(L9.a.med_card_no);
                        }
                        return null;
                    case 5:
                        int i17 = AddBankCardFragmentV2.f27826C0;
                        View view6 = addBankCardFragmentV2.f27318b;
                        if (view6 != null) {
                            return (EditText) view6.findViewById(L9.a.et_bank_card_no);
                        }
                        return null;
                    case 6:
                        int i18 = AddBankCardFragmentV2.f27826C0;
                        View view7 = addBankCardFragmentV2.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(L9.a.tv_card_no_title);
                        }
                        return null;
                    case 7:
                        int i19 = AddBankCardFragmentV2.f27826C0;
                        View view8 = addBankCardFragmentV2.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(L9.a.tvTopTips);
                        }
                        return null;
                    case 8:
                        int i110 = AddBankCardFragmentV2.f27826C0;
                        MonthPickDialog monthPickDialog = new MonthPickDialog(addBankCardFragmentV2.requireContext());
                        monthPickDialog.setShowConfirmBtn(true);
                        monthPickDialog.setDateRange(0, 30);
                        monthPickDialog.setCallBack(addBankCardFragmentV2);
                        return monthPickDialog;
                    case 9:
                        int i111 = AddBankCardFragmentV2.f27826C0;
                        E eRequireActivity = addBankCardFragmentV2.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (C0617b) new androidx.camera.video.internal.c(eRequireActivity).h(C0617b.class);
                    case 10:
                        int i20 = AddBankCardFragmentV2.f27826C0;
                        View view9 = addBankCardFragmentV2.f27318b;
                        if (view9 != null) {
                            return (PpButton) view9.findViewById(L9.a.next_bt);
                        }
                        return null;
                    case 11:
                        int i21 = AddBankCardFragmentV2.f27826C0;
                        View view10 = addBankCardFragmentV2.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(L9.a.tv_add_card_tips);
                        }
                        return null;
                    case 12:
                        int i22 = AddBankCardFragmentV2.f27826C0;
                        View view11 = addBankCardFragmentV2.f27318b;
                        if (view11 != null) {
                            return (ModelErrorDivider) view11.findViewById(L9.a.med_card_pin);
                        }
                        return null;
                    case 13:
                        int i23 = AddBankCardFragmentV2.f27826C0;
                        View view12 = addBankCardFragmentV2.f27318b;
                        if (view12 != null) {
                            return (IconicsImageView) view12.findViewById(L9.a.iiv_card_pin_show);
                        }
                        return null;
                    case 14:
                        int i24 = AddBankCardFragmentV2.f27826C0;
                        View view13 = addBankCardFragmentV2.f27318b;
                        if (view13 != null) {
                            return (EditText) view13.findViewById(L9.a.et_card_pin);
                        }
                        return null;
                    case 15:
                        int i25 = AddBankCardFragmentV2.f27826C0;
                        View view14 = addBankCardFragmentV2.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(L9.a.tv_card_pin_title);
                        }
                        return null;
                    case 16:
                        int i26 = AddBankCardFragmentV2.f27826C0;
                        View view15 = addBankCardFragmentV2.f27318b;
                        if (view15 != null) {
                            return (ModelErrorDivider) view15.findViewById(L9.a.med_cvv);
                        }
                        return null;
                    case 17:
                        int i27 = AddBankCardFragmentV2.f27826C0;
                        View view16 = addBankCardFragmentV2.f27318b;
                        if (view16 != null) {
                            return (EditText) view16.findViewById(L9.a.et_cvv);
                        }
                        return null;
                    default:
                        int i28 = AddBankCardFragmentV2.f27826C0;
                        View view17 = addBankCardFragmentV2.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(L9.a.tv_cvv_title);
                        }
                        return null;
                }
            }
        });
        final int i12 = 12;
        this.f27842p = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.fragment.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankCardFragmentV2 f27911b;

            {
                this.f27911b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankCardFragmentV2 addBankCardFragmentV2 = this.f27911b;
                switch (i12) {
                    case 0:
                        int i13 = AddBankCardFragmentV2.f27826C0;
                        View view = addBankCardFragmentV2.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(L9.a.select_other_method_tv);
                        }
                        return null;
                    case 1:
                        int i14 = AddBankCardFragmentV2.f27826C0;
                        View view2 = addBankCardFragmentV2.f27318b;
                        if (view2 != null) {
                            return (ModelErrorDivider) view2.findViewById(L9.a.med_valid_thru);
                        }
                        return null;
                    case 2:
                        int i15 = AddBankCardFragmentV2.f27826C0;
                        View view3 = addBankCardFragmentV2.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(L9.a.tv_valid_thru);
                        }
                        return null;
                    case 3:
                        int i16 = AddBankCardFragmentV2.f27826C0;
                        View view4 = addBankCardFragmentV2.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(L9.a.tv_valid_thru_title);
                        }
                        return null;
                    case 4:
                        int i17 = AddBankCardFragmentV2.f27826C0;
                        View view5 = addBankCardFragmentV2.f27318b;
                        if (view5 != null) {
                            return (ModelErrorDivider) view5.findViewById(L9.a.med_card_no);
                        }
                        return null;
                    case 5:
                        int i18 = AddBankCardFragmentV2.f27826C0;
                        View view6 = addBankCardFragmentV2.f27318b;
                        if (view6 != null) {
                            return (EditText) view6.findViewById(L9.a.et_bank_card_no);
                        }
                        return null;
                    case 6:
                        int i19 = AddBankCardFragmentV2.f27826C0;
                        View view7 = addBankCardFragmentV2.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(L9.a.tv_card_no_title);
                        }
                        return null;
                    case 7:
                        int i110 = AddBankCardFragmentV2.f27826C0;
                        View view8 = addBankCardFragmentV2.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(L9.a.tvTopTips);
                        }
                        return null;
                    case 8:
                        int i111 = AddBankCardFragmentV2.f27826C0;
                        MonthPickDialog monthPickDialog = new MonthPickDialog(addBankCardFragmentV2.requireContext());
                        monthPickDialog.setShowConfirmBtn(true);
                        monthPickDialog.setDateRange(0, 30);
                        monthPickDialog.setCallBack(addBankCardFragmentV2);
                        return monthPickDialog;
                    case 9:
                        int i112 = AddBankCardFragmentV2.f27826C0;
                        E eRequireActivity = addBankCardFragmentV2.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (C0617b) new androidx.camera.video.internal.c(eRequireActivity).h(C0617b.class);
                    case 10:
                        int i20 = AddBankCardFragmentV2.f27826C0;
                        View view9 = addBankCardFragmentV2.f27318b;
                        if (view9 != null) {
                            return (PpButton) view9.findViewById(L9.a.next_bt);
                        }
                        return null;
                    case 11:
                        int i21 = AddBankCardFragmentV2.f27826C0;
                        View view10 = addBankCardFragmentV2.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(L9.a.tv_add_card_tips);
                        }
                        return null;
                    case 12:
                        int i22 = AddBankCardFragmentV2.f27826C0;
                        View view11 = addBankCardFragmentV2.f27318b;
                        if (view11 != null) {
                            return (ModelErrorDivider) view11.findViewById(L9.a.med_card_pin);
                        }
                        return null;
                    case 13:
                        int i23 = AddBankCardFragmentV2.f27826C0;
                        View view12 = addBankCardFragmentV2.f27318b;
                        if (view12 != null) {
                            return (IconicsImageView) view12.findViewById(L9.a.iiv_card_pin_show);
                        }
                        return null;
                    case 14:
                        int i24 = AddBankCardFragmentV2.f27826C0;
                        View view13 = addBankCardFragmentV2.f27318b;
                        if (view13 != null) {
                            return (EditText) view13.findViewById(L9.a.et_card_pin);
                        }
                        return null;
                    case 15:
                        int i25 = AddBankCardFragmentV2.f27826C0;
                        View view14 = addBankCardFragmentV2.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(L9.a.tv_card_pin_title);
                        }
                        return null;
                    case 16:
                        int i26 = AddBankCardFragmentV2.f27826C0;
                        View view15 = addBankCardFragmentV2.f27318b;
                        if (view15 != null) {
                            return (ModelErrorDivider) view15.findViewById(L9.a.med_cvv);
                        }
                        return null;
                    case 17:
                        int i27 = AddBankCardFragmentV2.f27826C0;
                        View view16 = addBankCardFragmentV2.f27318b;
                        if (view16 != null) {
                            return (EditText) view16.findViewById(L9.a.et_cvv);
                        }
                        return null;
                    default:
                        int i28 = AddBankCardFragmentV2.f27826C0;
                        View view17 = addBankCardFragmentV2.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(L9.a.tv_cvv_title);
                        }
                        return null;
                }
            }
        });
        final int i13 = 13;
        this.t = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.fragment.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankCardFragmentV2 f27911b;

            {
                this.f27911b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankCardFragmentV2 addBankCardFragmentV2 = this.f27911b;
                switch (i13) {
                    case 0:
                        int i14 = AddBankCardFragmentV2.f27826C0;
                        View view = addBankCardFragmentV2.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(L9.a.select_other_method_tv);
                        }
                        return null;
                    case 1:
                        int i15 = AddBankCardFragmentV2.f27826C0;
                        View view2 = addBankCardFragmentV2.f27318b;
                        if (view2 != null) {
                            return (ModelErrorDivider) view2.findViewById(L9.a.med_valid_thru);
                        }
                        return null;
                    case 2:
                        int i16 = AddBankCardFragmentV2.f27826C0;
                        View view3 = addBankCardFragmentV2.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(L9.a.tv_valid_thru);
                        }
                        return null;
                    case 3:
                        int i17 = AddBankCardFragmentV2.f27826C0;
                        View view4 = addBankCardFragmentV2.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(L9.a.tv_valid_thru_title);
                        }
                        return null;
                    case 4:
                        int i18 = AddBankCardFragmentV2.f27826C0;
                        View view5 = addBankCardFragmentV2.f27318b;
                        if (view5 != null) {
                            return (ModelErrorDivider) view5.findViewById(L9.a.med_card_no);
                        }
                        return null;
                    case 5:
                        int i19 = AddBankCardFragmentV2.f27826C0;
                        View view6 = addBankCardFragmentV2.f27318b;
                        if (view6 != null) {
                            return (EditText) view6.findViewById(L9.a.et_bank_card_no);
                        }
                        return null;
                    case 6:
                        int i110 = AddBankCardFragmentV2.f27826C0;
                        View view7 = addBankCardFragmentV2.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(L9.a.tv_card_no_title);
                        }
                        return null;
                    case 7:
                        int i111 = AddBankCardFragmentV2.f27826C0;
                        View view8 = addBankCardFragmentV2.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(L9.a.tvTopTips);
                        }
                        return null;
                    case 8:
                        int i112 = AddBankCardFragmentV2.f27826C0;
                        MonthPickDialog monthPickDialog = new MonthPickDialog(addBankCardFragmentV2.requireContext());
                        monthPickDialog.setShowConfirmBtn(true);
                        monthPickDialog.setDateRange(0, 30);
                        monthPickDialog.setCallBack(addBankCardFragmentV2);
                        return monthPickDialog;
                    case 9:
                        int i113 = AddBankCardFragmentV2.f27826C0;
                        E eRequireActivity = addBankCardFragmentV2.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (C0617b) new androidx.camera.video.internal.c(eRequireActivity).h(C0617b.class);
                    case 10:
                        int i20 = AddBankCardFragmentV2.f27826C0;
                        View view9 = addBankCardFragmentV2.f27318b;
                        if (view9 != null) {
                            return (PpButton) view9.findViewById(L9.a.next_bt);
                        }
                        return null;
                    case 11:
                        int i21 = AddBankCardFragmentV2.f27826C0;
                        View view10 = addBankCardFragmentV2.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(L9.a.tv_add_card_tips);
                        }
                        return null;
                    case 12:
                        int i22 = AddBankCardFragmentV2.f27826C0;
                        View view11 = addBankCardFragmentV2.f27318b;
                        if (view11 != null) {
                            return (ModelErrorDivider) view11.findViewById(L9.a.med_card_pin);
                        }
                        return null;
                    case 13:
                        int i23 = AddBankCardFragmentV2.f27826C0;
                        View view12 = addBankCardFragmentV2.f27318b;
                        if (view12 != null) {
                            return (IconicsImageView) view12.findViewById(L9.a.iiv_card_pin_show);
                        }
                        return null;
                    case 14:
                        int i24 = AddBankCardFragmentV2.f27826C0;
                        View view13 = addBankCardFragmentV2.f27318b;
                        if (view13 != null) {
                            return (EditText) view13.findViewById(L9.a.et_card_pin);
                        }
                        return null;
                    case 15:
                        int i25 = AddBankCardFragmentV2.f27826C0;
                        View view14 = addBankCardFragmentV2.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(L9.a.tv_card_pin_title);
                        }
                        return null;
                    case 16:
                        int i26 = AddBankCardFragmentV2.f27826C0;
                        View view15 = addBankCardFragmentV2.f27318b;
                        if (view15 != null) {
                            return (ModelErrorDivider) view15.findViewById(L9.a.med_cvv);
                        }
                        return null;
                    case 17:
                        int i27 = AddBankCardFragmentV2.f27826C0;
                        View view16 = addBankCardFragmentV2.f27318b;
                        if (view16 != null) {
                            return (EditText) view16.findViewById(L9.a.et_cvv);
                        }
                        return null;
                    default:
                        int i28 = AddBankCardFragmentV2.f27826C0;
                        View view17 = addBankCardFragmentV2.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(L9.a.tv_cvv_title);
                        }
                        return null;
                }
            }
        });
        final int i14 = 14;
        this.f27849v = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.fragment.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankCardFragmentV2 f27911b;

            {
                this.f27911b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankCardFragmentV2 addBankCardFragmentV2 = this.f27911b;
                switch (i14) {
                    case 0:
                        int i15 = AddBankCardFragmentV2.f27826C0;
                        View view = addBankCardFragmentV2.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(L9.a.select_other_method_tv);
                        }
                        return null;
                    case 1:
                        int i16 = AddBankCardFragmentV2.f27826C0;
                        View view2 = addBankCardFragmentV2.f27318b;
                        if (view2 != null) {
                            return (ModelErrorDivider) view2.findViewById(L9.a.med_valid_thru);
                        }
                        return null;
                    case 2:
                        int i17 = AddBankCardFragmentV2.f27826C0;
                        View view3 = addBankCardFragmentV2.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(L9.a.tv_valid_thru);
                        }
                        return null;
                    case 3:
                        int i18 = AddBankCardFragmentV2.f27826C0;
                        View view4 = addBankCardFragmentV2.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(L9.a.tv_valid_thru_title);
                        }
                        return null;
                    case 4:
                        int i19 = AddBankCardFragmentV2.f27826C0;
                        View view5 = addBankCardFragmentV2.f27318b;
                        if (view5 != null) {
                            return (ModelErrorDivider) view5.findViewById(L9.a.med_card_no);
                        }
                        return null;
                    case 5:
                        int i110 = AddBankCardFragmentV2.f27826C0;
                        View view6 = addBankCardFragmentV2.f27318b;
                        if (view6 != null) {
                            return (EditText) view6.findViewById(L9.a.et_bank_card_no);
                        }
                        return null;
                    case 6:
                        int i111 = AddBankCardFragmentV2.f27826C0;
                        View view7 = addBankCardFragmentV2.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(L9.a.tv_card_no_title);
                        }
                        return null;
                    case 7:
                        int i112 = AddBankCardFragmentV2.f27826C0;
                        View view8 = addBankCardFragmentV2.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(L9.a.tvTopTips);
                        }
                        return null;
                    case 8:
                        int i113 = AddBankCardFragmentV2.f27826C0;
                        MonthPickDialog monthPickDialog = new MonthPickDialog(addBankCardFragmentV2.requireContext());
                        monthPickDialog.setShowConfirmBtn(true);
                        monthPickDialog.setDateRange(0, 30);
                        monthPickDialog.setCallBack(addBankCardFragmentV2);
                        return monthPickDialog;
                    case 9:
                        int i114 = AddBankCardFragmentV2.f27826C0;
                        E eRequireActivity = addBankCardFragmentV2.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (C0617b) new androidx.camera.video.internal.c(eRequireActivity).h(C0617b.class);
                    case 10:
                        int i20 = AddBankCardFragmentV2.f27826C0;
                        View view9 = addBankCardFragmentV2.f27318b;
                        if (view9 != null) {
                            return (PpButton) view9.findViewById(L9.a.next_bt);
                        }
                        return null;
                    case 11:
                        int i21 = AddBankCardFragmentV2.f27826C0;
                        View view10 = addBankCardFragmentV2.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(L9.a.tv_add_card_tips);
                        }
                        return null;
                    case 12:
                        int i22 = AddBankCardFragmentV2.f27826C0;
                        View view11 = addBankCardFragmentV2.f27318b;
                        if (view11 != null) {
                            return (ModelErrorDivider) view11.findViewById(L9.a.med_card_pin);
                        }
                        return null;
                    case 13:
                        int i23 = AddBankCardFragmentV2.f27826C0;
                        View view12 = addBankCardFragmentV2.f27318b;
                        if (view12 != null) {
                            return (IconicsImageView) view12.findViewById(L9.a.iiv_card_pin_show);
                        }
                        return null;
                    case 14:
                        int i24 = AddBankCardFragmentV2.f27826C0;
                        View view13 = addBankCardFragmentV2.f27318b;
                        if (view13 != null) {
                            return (EditText) view13.findViewById(L9.a.et_card_pin);
                        }
                        return null;
                    case 15:
                        int i25 = AddBankCardFragmentV2.f27826C0;
                        View view14 = addBankCardFragmentV2.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(L9.a.tv_card_pin_title);
                        }
                        return null;
                    case 16:
                        int i26 = AddBankCardFragmentV2.f27826C0;
                        View view15 = addBankCardFragmentV2.f27318b;
                        if (view15 != null) {
                            return (ModelErrorDivider) view15.findViewById(L9.a.med_cvv);
                        }
                        return null;
                    case 17:
                        int i27 = AddBankCardFragmentV2.f27826C0;
                        View view16 = addBankCardFragmentV2.f27318b;
                        if (view16 != null) {
                            return (EditText) view16.findViewById(L9.a.et_cvv);
                        }
                        return null;
                    default:
                        int i28 = AddBankCardFragmentV2.f27826C0;
                        View view17 = addBankCardFragmentV2.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(L9.a.tv_cvv_title);
                        }
                        return null;
                }
            }
        });
        final int i15 = 15;
        this.f27851w = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.fragment.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankCardFragmentV2 f27911b;

            {
                this.f27911b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankCardFragmentV2 addBankCardFragmentV2 = this.f27911b;
                switch (i15) {
                    case 0:
                        int i16 = AddBankCardFragmentV2.f27826C0;
                        View view = addBankCardFragmentV2.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(L9.a.select_other_method_tv);
                        }
                        return null;
                    case 1:
                        int i17 = AddBankCardFragmentV2.f27826C0;
                        View view2 = addBankCardFragmentV2.f27318b;
                        if (view2 != null) {
                            return (ModelErrorDivider) view2.findViewById(L9.a.med_valid_thru);
                        }
                        return null;
                    case 2:
                        int i18 = AddBankCardFragmentV2.f27826C0;
                        View view3 = addBankCardFragmentV2.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(L9.a.tv_valid_thru);
                        }
                        return null;
                    case 3:
                        int i19 = AddBankCardFragmentV2.f27826C0;
                        View view4 = addBankCardFragmentV2.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(L9.a.tv_valid_thru_title);
                        }
                        return null;
                    case 4:
                        int i110 = AddBankCardFragmentV2.f27826C0;
                        View view5 = addBankCardFragmentV2.f27318b;
                        if (view5 != null) {
                            return (ModelErrorDivider) view5.findViewById(L9.a.med_card_no);
                        }
                        return null;
                    case 5:
                        int i111 = AddBankCardFragmentV2.f27826C0;
                        View view6 = addBankCardFragmentV2.f27318b;
                        if (view6 != null) {
                            return (EditText) view6.findViewById(L9.a.et_bank_card_no);
                        }
                        return null;
                    case 6:
                        int i112 = AddBankCardFragmentV2.f27826C0;
                        View view7 = addBankCardFragmentV2.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(L9.a.tv_card_no_title);
                        }
                        return null;
                    case 7:
                        int i113 = AddBankCardFragmentV2.f27826C0;
                        View view8 = addBankCardFragmentV2.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(L9.a.tvTopTips);
                        }
                        return null;
                    case 8:
                        int i114 = AddBankCardFragmentV2.f27826C0;
                        MonthPickDialog monthPickDialog = new MonthPickDialog(addBankCardFragmentV2.requireContext());
                        monthPickDialog.setShowConfirmBtn(true);
                        monthPickDialog.setDateRange(0, 30);
                        monthPickDialog.setCallBack(addBankCardFragmentV2);
                        return monthPickDialog;
                    case 9:
                        int i115 = AddBankCardFragmentV2.f27826C0;
                        E eRequireActivity = addBankCardFragmentV2.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (C0617b) new androidx.camera.video.internal.c(eRequireActivity).h(C0617b.class);
                    case 10:
                        int i20 = AddBankCardFragmentV2.f27826C0;
                        View view9 = addBankCardFragmentV2.f27318b;
                        if (view9 != null) {
                            return (PpButton) view9.findViewById(L9.a.next_bt);
                        }
                        return null;
                    case 11:
                        int i21 = AddBankCardFragmentV2.f27826C0;
                        View view10 = addBankCardFragmentV2.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(L9.a.tv_add_card_tips);
                        }
                        return null;
                    case 12:
                        int i22 = AddBankCardFragmentV2.f27826C0;
                        View view11 = addBankCardFragmentV2.f27318b;
                        if (view11 != null) {
                            return (ModelErrorDivider) view11.findViewById(L9.a.med_card_pin);
                        }
                        return null;
                    case 13:
                        int i23 = AddBankCardFragmentV2.f27826C0;
                        View view12 = addBankCardFragmentV2.f27318b;
                        if (view12 != null) {
                            return (IconicsImageView) view12.findViewById(L9.a.iiv_card_pin_show);
                        }
                        return null;
                    case 14:
                        int i24 = AddBankCardFragmentV2.f27826C0;
                        View view13 = addBankCardFragmentV2.f27318b;
                        if (view13 != null) {
                            return (EditText) view13.findViewById(L9.a.et_card_pin);
                        }
                        return null;
                    case 15:
                        int i25 = AddBankCardFragmentV2.f27826C0;
                        View view14 = addBankCardFragmentV2.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(L9.a.tv_card_pin_title);
                        }
                        return null;
                    case 16:
                        int i26 = AddBankCardFragmentV2.f27826C0;
                        View view15 = addBankCardFragmentV2.f27318b;
                        if (view15 != null) {
                            return (ModelErrorDivider) view15.findViewById(L9.a.med_cvv);
                        }
                        return null;
                    case 17:
                        int i27 = AddBankCardFragmentV2.f27826C0;
                        View view16 = addBankCardFragmentV2.f27318b;
                        if (view16 != null) {
                            return (EditText) view16.findViewById(L9.a.et_cvv);
                        }
                        return null;
                    default:
                        int i28 = AddBankCardFragmentV2.f27826C0;
                        View view17 = addBankCardFragmentV2.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(L9.a.tv_cvv_title);
                        }
                        return null;
                }
            }
        });
        final int i16 = 16;
        this.f27827A = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.fragment.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankCardFragmentV2 f27911b;

            {
                this.f27911b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankCardFragmentV2 addBankCardFragmentV2 = this.f27911b;
                switch (i16) {
                    case 0:
                        int i17 = AddBankCardFragmentV2.f27826C0;
                        View view = addBankCardFragmentV2.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(L9.a.select_other_method_tv);
                        }
                        return null;
                    case 1:
                        int i18 = AddBankCardFragmentV2.f27826C0;
                        View view2 = addBankCardFragmentV2.f27318b;
                        if (view2 != null) {
                            return (ModelErrorDivider) view2.findViewById(L9.a.med_valid_thru);
                        }
                        return null;
                    case 2:
                        int i19 = AddBankCardFragmentV2.f27826C0;
                        View view3 = addBankCardFragmentV2.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(L9.a.tv_valid_thru);
                        }
                        return null;
                    case 3:
                        int i110 = AddBankCardFragmentV2.f27826C0;
                        View view4 = addBankCardFragmentV2.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(L9.a.tv_valid_thru_title);
                        }
                        return null;
                    case 4:
                        int i111 = AddBankCardFragmentV2.f27826C0;
                        View view5 = addBankCardFragmentV2.f27318b;
                        if (view5 != null) {
                            return (ModelErrorDivider) view5.findViewById(L9.a.med_card_no);
                        }
                        return null;
                    case 5:
                        int i112 = AddBankCardFragmentV2.f27826C0;
                        View view6 = addBankCardFragmentV2.f27318b;
                        if (view6 != null) {
                            return (EditText) view6.findViewById(L9.a.et_bank_card_no);
                        }
                        return null;
                    case 6:
                        int i113 = AddBankCardFragmentV2.f27826C0;
                        View view7 = addBankCardFragmentV2.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(L9.a.tv_card_no_title);
                        }
                        return null;
                    case 7:
                        int i114 = AddBankCardFragmentV2.f27826C0;
                        View view8 = addBankCardFragmentV2.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(L9.a.tvTopTips);
                        }
                        return null;
                    case 8:
                        int i115 = AddBankCardFragmentV2.f27826C0;
                        MonthPickDialog monthPickDialog = new MonthPickDialog(addBankCardFragmentV2.requireContext());
                        monthPickDialog.setShowConfirmBtn(true);
                        monthPickDialog.setDateRange(0, 30);
                        monthPickDialog.setCallBack(addBankCardFragmentV2);
                        return monthPickDialog;
                    case 9:
                        int i116 = AddBankCardFragmentV2.f27826C0;
                        E eRequireActivity = addBankCardFragmentV2.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (C0617b) new androidx.camera.video.internal.c(eRequireActivity).h(C0617b.class);
                    case 10:
                        int i20 = AddBankCardFragmentV2.f27826C0;
                        View view9 = addBankCardFragmentV2.f27318b;
                        if (view9 != null) {
                            return (PpButton) view9.findViewById(L9.a.next_bt);
                        }
                        return null;
                    case 11:
                        int i21 = AddBankCardFragmentV2.f27826C0;
                        View view10 = addBankCardFragmentV2.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(L9.a.tv_add_card_tips);
                        }
                        return null;
                    case 12:
                        int i22 = AddBankCardFragmentV2.f27826C0;
                        View view11 = addBankCardFragmentV2.f27318b;
                        if (view11 != null) {
                            return (ModelErrorDivider) view11.findViewById(L9.a.med_card_pin);
                        }
                        return null;
                    case 13:
                        int i23 = AddBankCardFragmentV2.f27826C0;
                        View view12 = addBankCardFragmentV2.f27318b;
                        if (view12 != null) {
                            return (IconicsImageView) view12.findViewById(L9.a.iiv_card_pin_show);
                        }
                        return null;
                    case 14:
                        int i24 = AddBankCardFragmentV2.f27826C0;
                        View view13 = addBankCardFragmentV2.f27318b;
                        if (view13 != null) {
                            return (EditText) view13.findViewById(L9.a.et_card_pin);
                        }
                        return null;
                    case 15:
                        int i25 = AddBankCardFragmentV2.f27826C0;
                        View view14 = addBankCardFragmentV2.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(L9.a.tv_card_pin_title);
                        }
                        return null;
                    case 16:
                        int i26 = AddBankCardFragmentV2.f27826C0;
                        View view15 = addBankCardFragmentV2.f27318b;
                        if (view15 != null) {
                            return (ModelErrorDivider) view15.findViewById(L9.a.med_cvv);
                        }
                        return null;
                    case 17:
                        int i27 = AddBankCardFragmentV2.f27826C0;
                        View view16 = addBankCardFragmentV2.f27318b;
                        if (view16 != null) {
                            return (EditText) view16.findViewById(L9.a.et_cvv);
                        }
                        return null;
                    default:
                        int i28 = AddBankCardFragmentV2.f27826C0;
                        View view17 = addBankCardFragmentV2.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(L9.a.tv_cvv_title);
                        }
                        return null;
                }
            }
        });
        final int i17 = 17;
        this.f27829B = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.fragment.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankCardFragmentV2 f27911b;

            {
                this.f27911b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankCardFragmentV2 addBankCardFragmentV2 = this.f27911b;
                switch (i17) {
                    case 0:
                        int i18 = AddBankCardFragmentV2.f27826C0;
                        View view = addBankCardFragmentV2.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(L9.a.select_other_method_tv);
                        }
                        return null;
                    case 1:
                        int i19 = AddBankCardFragmentV2.f27826C0;
                        View view2 = addBankCardFragmentV2.f27318b;
                        if (view2 != null) {
                            return (ModelErrorDivider) view2.findViewById(L9.a.med_valid_thru);
                        }
                        return null;
                    case 2:
                        int i110 = AddBankCardFragmentV2.f27826C0;
                        View view3 = addBankCardFragmentV2.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(L9.a.tv_valid_thru);
                        }
                        return null;
                    case 3:
                        int i111 = AddBankCardFragmentV2.f27826C0;
                        View view4 = addBankCardFragmentV2.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(L9.a.tv_valid_thru_title);
                        }
                        return null;
                    case 4:
                        int i112 = AddBankCardFragmentV2.f27826C0;
                        View view5 = addBankCardFragmentV2.f27318b;
                        if (view5 != null) {
                            return (ModelErrorDivider) view5.findViewById(L9.a.med_card_no);
                        }
                        return null;
                    case 5:
                        int i113 = AddBankCardFragmentV2.f27826C0;
                        View view6 = addBankCardFragmentV2.f27318b;
                        if (view6 != null) {
                            return (EditText) view6.findViewById(L9.a.et_bank_card_no);
                        }
                        return null;
                    case 6:
                        int i114 = AddBankCardFragmentV2.f27826C0;
                        View view7 = addBankCardFragmentV2.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(L9.a.tv_card_no_title);
                        }
                        return null;
                    case 7:
                        int i115 = AddBankCardFragmentV2.f27826C0;
                        View view8 = addBankCardFragmentV2.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(L9.a.tvTopTips);
                        }
                        return null;
                    case 8:
                        int i116 = AddBankCardFragmentV2.f27826C0;
                        MonthPickDialog monthPickDialog = new MonthPickDialog(addBankCardFragmentV2.requireContext());
                        monthPickDialog.setShowConfirmBtn(true);
                        monthPickDialog.setDateRange(0, 30);
                        monthPickDialog.setCallBack(addBankCardFragmentV2);
                        return monthPickDialog;
                    case 9:
                        int i117 = AddBankCardFragmentV2.f27826C0;
                        E eRequireActivity = addBankCardFragmentV2.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (C0617b) new androidx.camera.video.internal.c(eRequireActivity).h(C0617b.class);
                    case 10:
                        int i20 = AddBankCardFragmentV2.f27826C0;
                        View view9 = addBankCardFragmentV2.f27318b;
                        if (view9 != null) {
                            return (PpButton) view9.findViewById(L9.a.next_bt);
                        }
                        return null;
                    case 11:
                        int i21 = AddBankCardFragmentV2.f27826C0;
                        View view10 = addBankCardFragmentV2.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(L9.a.tv_add_card_tips);
                        }
                        return null;
                    case 12:
                        int i22 = AddBankCardFragmentV2.f27826C0;
                        View view11 = addBankCardFragmentV2.f27318b;
                        if (view11 != null) {
                            return (ModelErrorDivider) view11.findViewById(L9.a.med_card_pin);
                        }
                        return null;
                    case 13:
                        int i23 = AddBankCardFragmentV2.f27826C0;
                        View view12 = addBankCardFragmentV2.f27318b;
                        if (view12 != null) {
                            return (IconicsImageView) view12.findViewById(L9.a.iiv_card_pin_show);
                        }
                        return null;
                    case 14:
                        int i24 = AddBankCardFragmentV2.f27826C0;
                        View view13 = addBankCardFragmentV2.f27318b;
                        if (view13 != null) {
                            return (EditText) view13.findViewById(L9.a.et_card_pin);
                        }
                        return null;
                    case 15:
                        int i25 = AddBankCardFragmentV2.f27826C0;
                        View view14 = addBankCardFragmentV2.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(L9.a.tv_card_pin_title);
                        }
                        return null;
                    case 16:
                        int i26 = AddBankCardFragmentV2.f27826C0;
                        View view15 = addBankCardFragmentV2.f27318b;
                        if (view15 != null) {
                            return (ModelErrorDivider) view15.findViewById(L9.a.med_cvv);
                        }
                        return null;
                    case 17:
                        int i27 = AddBankCardFragmentV2.f27826C0;
                        View view16 = addBankCardFragmentV2.f27318b;
                        if (view16 != null) {
                            return (EditText) view16.findViewById(L9.a.et_cvv);
                        }
                        return null;
                    default:
                        int i28 = AddBankCardFragmentV2.f27826C0;
                        View view17 = addBankCardFragmentV2.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(L9.a.tv_cvv_title);
                        }
                        return null;
                }
            }
        });
        final int i18 = 18;
        this.f27831C = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.fragment.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankCardFragmentV2 f27911b;

            {
                this.f27911b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankCardFragmentV2 addBankCardFragmentV2 = this.f27911b;
                switch (i18) {
                    case 0:
                        int i19 = AddBankCardFragmentV2.f27826C0;
                        View view = addBankCardFragmentV2.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(L9.a.select_other_method_tv);
                        }
                        return null;
                    case 1:
                        int i110 = AddBankCardFragmentV2.f27826C0;
                        View view2 = addBankCardFragmentV2.f27318b;
                        if (view2 != null) {
                            return (ModelErrorDivider) view2.findViewById(L9.a.med_valid_thru);
                        }
                        return null;
                    case 2:
                        int i111 = AddBankCardFragmentV2.f27826C0;
                        View view3 = addBankCardFragmentV2.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(L9.a.tv_valid_thru);
                        }
                        return null;
                    case 3:
                        int i112 = AddBankCardFragmentV2.f27826C0;
                        View view4 = addBankCardFragmentV2.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(L9.a.tv_valid_thru_title);
                        }
                        return null;
                    case 4:
                        int i113 = AddBankCardFragmentV2.f27826C0;
                        View view5 = addBankCardFragmentV2.f27318b;
                        if (view5 != null) {
                            return (ModelErrorDivider) view5.findViewById(L9.a.med_card_no);
                        }
                        return null;
                    case 5:
                        int i114 = AddBankCardFragmentV2.f27826C0;
                        View view6 = addBankCardFragmentV2.f27318b;
                        if (view6 != null) {
                            return (EditText) view6.findViewById(L9.a.et_bank_card_no);
                        }
                        return null;
                    case 6:
                        int i115 = AddBankCardFragmentV2.f27826C0;
                        View view7 = addBankCardFragmentV2.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(L9.a.tv_card_no_title);
                        }
                        return null;
                    case 7:
                        int i116 = AddBankCardFragmentV2.f27826C0;
                        View view8 = addBankCardFragmentV2.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(L9.a.tvTopTips);
                        }
                        return null;
                    case 8:
                        int i117 = AddBankCardFragmentV2.f27826C0;
                        MonthPickDialog monthPickDialog = new MonthPickDialog(addBankCardFragmentV2.requireContext());
                        monthPickDialog.setShowConfirmBtn(true);
                        monthPickDialog.setDateRange(0, 30);
                        monthPickDialog.setCallBack(addBankCardFragmentV2);
                        return monthPickDialog;
                    case 9:
                        int i118 = AddBankCardFragmentV2.f27826C0;
                        E eRequireActivity = addBankCardFragmentV2.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (C0617b) new androidx.camera.video.internal.c(eRequireActivity).h(C0617b.class);
                    case 10:
                        int i20 = AddBankCardFragmentV2.f27826C0;
                        View view9 = addBankCardFragmentV2.f27318b;
                        if (view9 != null) {
                            return (PpButton) view9.findViewById(L9.a.next_bt);
                        }
                        return null;
                    case 11:
                        int i21 = AddBankCardFragmentV2.f27826C0;
                        View view10 = addBankCardFragmentV2.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(L9.a.tv_add_card_tips);
                        }
                        return null;
                    case 12:
                        int i22 = AddBankCardFragmentV2.f27826C0;
                        View view11 = addBankCardFragmentV2.f27318b;
                        if (view11 != null) {
                            return (ModelErrorDivider) view11.findViewById(L9.a.med_card_pin);
                        }
                        return null;
                    case 13:
                        int i23 = AddBankCardFragmentV2.f27826C0;
                        View view12 = addBankCardFragmentV2.f27318b;
                        if (view12 != null) {
                            return (IconicsImageView) view12.findViewById(L9.a.iiv_card_pin_show);
                        }
                        return null;
                    case 14:
                        int i24 = AddBankCardFragmentV2.f27826C0;
                        View view13 = addBankCardFragmentV2.f27318b;
                        if (view13 != null) {
                            return (EditText) view13.findViewById(L9.a.et_card_pin);
                        }
                        return null;
                    case 15:
                        int i25 = AddBankCardFragmentV2.f27826C0;
                        View view14 = addBankCardFragmentV2.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(L9.a.tv_card_pin_title);
                        }
                        return null;
                    case 16:
                        int i26 = AddBankCardFragmentV2.f27826C0;
                        View view15 = addBankCardFragmentV2.f27318b;
                        if (view15 != null) {
                            return (ModelErrorDivider) view15.findViewById(L9.a.med_cvv);
                        }
                        return null;
                    case 17:
                        int i27 = AddBankCardFragmentV2.f27826C0;
                        View view16 = addBankCardFragmentV2.f27318b;
                        if (view16 != null) {
                            return (EditText) view16.findViewById(L9.a.et_cvv);
                        }
                        return null;
                    default:
                        int i28 = AddBankCardFragmentV2.f27826C0;
                        View view17 = addBankCardFragmentV2.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(L9.a.tv_cvv_title);
                        }
                        return null;
                }
            }
        });
        final int i19 = 1;
        this.f27832H = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.fragment.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankCardFragmentV2 f27911b;

            {
                this.f27911b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankCardFragmentV2 addBankCardFragmentV2 = this.f27911b;
                switch (i19) {
                    case 0:
                        int i110 = AddBankCardFragmentV2.f27826C0;
                        View view = addBankCardFragmentV2.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(L9.a.select_other_method_tv);
                        }
                        return null;
                    case 1:
                        int i111 = AddBankCardFragmentV2.f27826C0;
                        View view2 = addBankCardFragmentV2.f27318b;
                        if (view2 != null) {
                            return (ModelErrorDivider) view2.findViewById(L9.a.med_valid_thru);
                        }
                        return null;
                    case 2:
                        int i112 = AddBankCardFragmentV2.f27826C0;
                        View view3 = addBankCardFragmentV2.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(L9.a.tv_valid_thru);
                        }
                        return null;
                    case 3:
                        int i113 = AddBankCardFragmentV2.f27826C0;
                        View view4 = addBankCardFragmentV2.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(L9.a.tv_valid_thru_title);
                        }
                        return null;
                    case 4:
                        int i114 = AddBankCardFragmentV2.f27826C0;
                        View view5 = addBankCardFragmentV2.f27318b;
                        if (view5 != null) {
                            return (ModelErrorDivider) view5.findViewById(L9.a.med_card_no);
                        }
                        return null;
                    case 5:
                        int i115 = AddBankCardFragmentV2.f27826C0;
                        View view6 = addBankCardFragmentV2.f27318b;
                        if (view6 != null) {
                            return (EditText) view6.findViewById(L9.a.et_bank_card_no);
                        }
                        return null;
                    case 6:
                        int i116 = AddBankCardFragmentV2.f27826C0;
                        View view7 = addBankCardFragmentV2.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(L9.a.tv_card_no_title);
                        }
                        return null;
                    case 7:
                        int i117 = AddBankCardFragmentV2.f27826C0;
                        View view8 = addBankCardFragmentV2.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(L9.a.tvTopTips);
                        }
                        return null;
                    case 8:
                        int i118 = AddBankCardFragmentV2.f27826C0;
                        MonthPickDialog monthPickDialog = new MonthPickDialog(addBankCardFragmentV2.requireContext());
                        monthPickDialog.setShowConfirmBtn(true);
                        monthPickDialog.setDateRange(0, 30);
                        monthPickDialog.setCallBack(addBankCardFragmentV2);
                        return monthPickDialog;
                    case 9:
                        int i119 = AddBankCardFragmentV2.f27826C0;
                        E eRequireActivity = addBankCardFragmentV2.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (C0617b) new androidx.camera.video.internal.c(eRequireActivity).h(C0617b.class);
                    case 10:
                        int i20 = AddBankCardFragmentV2.f27826C0;
                        View view9 = addBankCardFragmentV2.f27318b;
                        if (view9 != null) {
                            return (PpButton) view9.findViewById(L9.a.next_bt);
                        }
                        return null;
                    case 11:
                        int i21 = AddBankCardFragmentV2.f27826C0;
                        View view10 = addBankCardFragmentV2.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(L9.a.tv_add_card_tips);
                        }
                        return null;
                    case 12:
                        int i22 = AddBankCardFragmentV2.f27826C0;
                        View view11 = addBankCardFragmentV2.f27318b;
                        if (view11 != null) {
                            return (ModelErrorDivider) view11.findViewById(L9.a.med_card_pin);
                        }
                        return null;
                    case 13:
                        int i23 = AddBankCardFragmentV2.f27826C0;
                        View view12 = addBankCardFragmentV2.f27318b;
                        if (view12 != null) {
                            return (IconicsImageView) view12.findViewById(L9.a.iiv_card_pin_show);
                        }
                        return null;
                    case 14:
                        int i24 = AddBankCardFragmentV2.f27826C0;
                        View view13 = addBankCardFragmentV2.f27318b;
                        if (view13 != null) {
                            return (EditText) view13.findViewById(L9.a.et_card_pin);
                        }
                        return null;
                    case 15:
                        int i25 = AddBankCardFragmentV2.f27826C0;
                        View view14 = addBankCardFragmentV2.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(L9.a.tv_card_pin_title);
                        }
                        return null;
                    case 16:
                        int i26 = AddBankCardFragmentV2.f27826C0;
                        View view15 = addBankCardFragmentV2.f27318b;
                        if (view15 != null) {
                            return (ModelErrorDivider) view15.findViewById(L9.a.med_cvv);
                        }
                        return null;
                    case 17:
                        int i27 = AddBankCardFragmentV2.f27826C0;
                        View view16 = addBankCardFragmentV2.f27318b;
                        if (view16 != null) {
                            return (EditText) view16.findViewById(L9.a.et_cvv);
                        }
                        return null;
                    default:
                        int i28 = AddBankCardFragmentV2.f27826C0;
                        View view17 = addBankCardFragmentV2.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(L9.a.tv_cvv_title);
                        }
                        return null;
                }
            }
        });
        final int i20 = 2;
        this.f27833L = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.fragment.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankCardFragmentV2 f27911b;

            {
                this.f27911b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankCardFragmentV2 addBankCardFragmentV2 = this.f27911b;
                switch (i20) {
                    case 0:
                        int i110 = AddBankCardFragmentV2.f27826C0;
                        View view = addBankCardFragmentV2.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(L9.a.select_other_method_tv);
                        }
                        return null;
                    case 1:
                        int i111 = AddBankCardFragmentV2.f27826C0;
                        View view2 = addBankCardFragmentV2.f27318b;
                        if (view2 != null) {
                            return (ModelErrorDivider) view2.findViewById(L9.a.med_valid_thru);
                        }
                        return null;
                    case 2:
                        int i112 = AddBankCardFragmentV2.f27826C0;
                        View view3 = addBankCardFragmentV2.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(L9.a.tv_valid_thru);
                        }
                        return null;
                    case 3:
                        int i113 = AddBankCardFragmentV2.f27826C0;
                        View view4 = addBankCardFragmentV2.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(L9.a.tv_valid_thru_title);
                        }
                        return null;
                    case 4:
                        int i114 = AddBankCardFragmentV2.f27826C0;
                        View view5 = addBankCardFragmentV2.f27318b;
                        if (view5 != null) {
                            return (ModelErrorDivider) view5.findViewById(L9.a.med_card_no);
                        }
                        return null;
                    case 5:
                        int i115 = AddBankCardFragmentV2.f27826C0;
                        View view6 = addBankCardFragmentV2.f27318b;
                        if (view6 != null) {
                            return (EditText) view6.findViewById(L9.a.et_bank_card_no);
                        }
                        return null;
                    case 6:
                        int i116 = AddBankCardFragmentV2.f27826C0;
                        View view7 = addBankCardFragmentV2.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(L9.a.tv_card_no_title);
                        }
                        return null;
                    case 7:
                        int i117 = AddBankCardFragmentV2.f27826C0;
                        View view8 = addBankCardFragmentV2.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(L9.a.tvTopTips);
                        }
                        return null;
                    case 8:
                        int i118 = AddBankCardFragmentV2.f27826C0;
                        MonthPickDialog monthPickDialog = new MonthPickDialog(addBankCardFragmentV2.requireContext());
                        monthPickDialog.setShowConfirmBtn(true);
                        monthPickDialog.setDateRange(0, 30);
                        monthPickDialog.setCallBack(addBankCardFragmentV2);
                        return monthPickDialog;
                    case 9:
                        int i119 = AddBankCardFragmentV2.f27826C0;
                        E eRequireActivity = addBankCardFragmentV2.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (C0617b) new androidx.camera.video.internal.c(eRequireActivity).h(C0617b.class);
                    case 10:
                        int i21 = AddBankCardFragmentV2.f27826C0;
                        View view9 = addBankCardFragmentV2.f27318b;
                        if (view9 != null) {
                            return (PpButton) view9.findViewById(L9.a.next_bt);
                        }
                        return null;
                    case 11:
                        int i22 = AddBankCardFragmentV2.f27826C0;
                        View view10 = addBankCardFragmentV2.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(L9.a.tv_add_card_tips);
                        }
                        return null;
                    case 12:
                        int i23 = AddBankCardFragmentV2.f27826C0;
                        View view11 = addBankCardFragmentV2.f27318b;
                        if (view11 != null) {
                            return (ModelErrorDivider) view11.findViewById(L9.a.med_card_pin);
                        }
                        return null;
                    case 13:
                        int i24 = AddBankCardFragmentV2.f27826C0;
                        View view12 = addBankCardFragmentV2.f27318b;
                        if (view12 != null) {
                            return (IconicsImageView) view12.findViewById(L9.a.iiv_card_pin_show);
                        }
                        return null;
                    case 14:
                        int i25 = AddBankCardFragmentV2.f27826C0;
                        View view13 = addBankCardFragmentV2.f27318b;
                        if (view13 != null) {
                            return (EditText) view13.findViewById(L9.a.et_card_pin);
                        }
                        return null;
                    case 15:
                        int i26 = AddBankCardFragmentV2.f27826C0;
                        View view14 = addBankCardFragmentV2.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(L9.a.tv_card_pin_title);
                        }
                        return null;
                    case 16:
                        int i27 = AddBankCardFragmentV2.f27826C0;
                        View view15 = addBankCardFragmentV2.f27318b;
                        if (view15 != null) {
                            return (ModelErrorDivider) view15.findViewById(L9.a.med_cvv);
                        }
                        return null;
                    case 17:
                        int i28 = AddBankCardFragmentV2.f27826C0;
                        View view16 = addBankCardFragmentV2.f27318b;
                        if (view16 != null) {
                            return (EditText) view16.findViewById(L9.a.et_cvv);
                        }
                        return null;
                    default:
                        int i29 = AddBankCardFragmentV2.f27826C0;
                        View view17 = addBankCardFragmentV2.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(L9.a.tv_cvv_title);
                        }
                        return null;
                }
            }
        });
        final int i21 = 3;
        C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.fragment.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankCardFragmentV2 f27911b;

            {
                this.f27911b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankCardFragmentV2 addBankCardFragmentV2 = this.f27911b;
                switch (i21) {
                    case 0:
                        int i110 = AddBankCardFragmentV2.f27826C0;
                        View view = addBankCardFragmentV2.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(L9.a.select_other_method_tv);
                        }
                        return null;
                    case 1:
                        int i111 = AddBankCardFragmentV2.f27826C0;
                        View view2 = addBankCardFragmentV2.f27318b;
                        if (view2 != null) {
                            return (ModelErrorDivider) view2.findViewById(L9.a.med_valid_thru);
                        }
                        return null;
                    case 2:
                        int i112 = AddBankCardFragmentV2.f27826C0;
                        View view3 = addBankCardFragmentV2.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(L9.a.tv_valid_thru);
                        }
                        return null;
                    case 3:
                        int i113 = AddBankCardFragmentV2.f27826C0;
                        View view4 = addBankCardFragmentV2.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(L9.a.tv_valid_thru_title);
                        }
                        return null;
                    case 4:
                        int i114 = AddBankCardFragmentV2.f27826C0;
                        View view5 = addBankCardFragmentV2.f27318b;
                        if (view5 != null) {
                            return (ModelErrorDivider) view5.findViewById(L9.a.med_card_no);
                        }
                        return null;
                    case 5:
                        int i115 = AddBankCardFragmentV2.f27826C0;
                        View view6 = addBankCardFragmentV2.f27318b;
                        if (view6 != null) {
                            return (EditText) view6.findViewById(L9.a.et_bank_card_no);
                        }
                        return null;
                    case 6:
                        int i116 = AddBankCardFragmentV2.f27826C0;
                        View view7 = addBankCardFragmentV2.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(L9.a.tv_card_no_title);
                        }
                        return null;
                    case 7:
                        int i117 = AddBankCardFragmentV2.f27826C0;
                        View view8 = addBankCardFragmentV2.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(L9.a.tvTopTips);
                        }
                        return null;
                    case 8:
                        int i118 = AddBankCardFragmentV2.f27826C0;
                        MonthPickDialog monthPickDialog = new MonthPickDialog(addBankCardFragmentV2.requireContext());
                        monthPickDialog.setShowConfirmBtn(true);
                        monthPickDialog.setDateRange(0, 30);
                        monthPickDialog.setCallBack(addBankCardFragmentV2);
                        return monthPickDialog;
                    case 9:
                        int i119 = AddBankCardFragmentV2.f27826C0;
                        E eRequireActivity = addBankCardFragmentV2.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (C0617b) new androidx.camera.video.internal.c(eRequireActivity).h(C0617b.class);
                    case 10:
                        int i22 = AddBankCardFragmentV2.f27826C0;
                        View view9 = addBankCardFragmentV2.f27318b;
                        if (view9 != null) {
                            return (PpButton) view9.findViewById(L9.a.next_bt);
                        }
                        return null;
                    case 11:
                        int i23 = AddBankCardFragmentV2.f27826C0;
                        View view10 = addBankCardFragmentV2.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(L9.a.tv_add_card_tips);
                        }
                        return null;
                    case 12:
                        int i24 = AddBankCardFragmentV2.f27826C0;
                        View view11 = addBankCardFragmentV2.f27318b;
                        if (view11 != null) {
                            return (ModelErrorDivider) view11.findViewById(L9.a.med_card_pin);
                        }
                        return null;
                    case 13:
                        int i25 = AddBankCardFragmentV2.f27826C0;
                        View view12 = addBankCardFragmentV2.f27318b;
                        if (view12 != null) {
                            return (IconicsImageView) view12.findViewById(L9.a.iiv_card_pin_show);
                        }
                        return null;
                    case 14:
                        int i26 = AddBankCardFragmentV2.f27826C0;
                        View view13 = addBankCardFragmentV2.f27318b;
                        if (view13 != null) {
                            return (EditText) view13.findViewById(L9.a.et_card_pin);
                        }
                        return null;
                    case 15:
                        int i27 = AddBankCardFragmentV2.f27826C0;
                        View view14 = addBankCardFragmentV2.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(L9.a.tv_card_pin_title);
                        }
                        return null;
                    case 16:
                        int i28 = AddBankCardFragmentV2.f27826C0;
                        View view15 = addBankCardFragmentV2.f27318b;
                        if (view15 != null) {
                            return (ModelErrorDivider) view15.findViewById(L9.a.med_cvv);
                        }
                        return null;
                    case 17:
                        int i29 = AddBankCardFragmentV2.f27826C0;
                        View view16 = addBankCardFragmentV2.f27318b;
                        if (view16 != null) {
                            return (EditText) view16.findViewById(L9.a.et_cvv);
                        }
                        return null;
                    default:
                        int i210 = AddBankCardFragmentV2.f27826C0;
                        View view17 = addBankCardFragmentV2.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(L9.a.tv_cvv_title);
                        }
                        return null;
                }
            }
        });
        final int i22 = 4;
        this.f27834M = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.fragment.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankCardFragmentV2 f27911b;

            {
                this.f27911b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankCardFragmentV2 addBankCardFragmentV2 = this.f27911b;
                switch (i22) {
                    case 0:
                        int i110 = AddBankCardFragmentV2.f27826C0;
                        View view = addBankCardFragmentV2.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(L9.a.select_other_method_tv);
                        }
                        return null;
                    case 1:
                        int i111 = AddBankCardFragmentV2.f27826C0;
                        View view2 = addBankCardFragmentV2.f27318b;
                        if (view2 != null) {
                            return (ModelErrorDivider) view2.findViewById(L9.a.med_valid_thru);
                        }
                        return null;
                    case 2:
                        int i112 = AddBankCardFragmentV2.f27826C0;
                        View view3 = addBankCardFragmentV2.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(L9.a.tv_valid_thru);
                        }
                        return null;
                    case 3:
                        int i113 = AddBankCardFragmentV2.f27826C0;
                        View view4 = addBankCardFragmentV2.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(L9.a.tv_valid_thru_title);
                        }
                        return null;
                    case 4:
                        int i114 = AddBankCardFragmentV2.f27826C0;
                        View view5 = addBankCardFragmentV2.f27318b;
                        if (view5 != null) {
                            return (ModelErrorDivider) view5.findViewById(L9.a.med_card_no);
                        }
                        return null;
                    case 5:
                        int i115 = AddBankCardFragmentV2.f27826C0;
                        View view6 = addBankCardFragmentV2.f27318b;
                        if (view6 != null) {
                            return (EditText) view6.findViewById(L9.a.et_bank_card_no);
                        }
                        return null;
                    case 6:
                        int i116 = AddBankCardFragmentV2.f27826C0;
                        View view7 = addBankCardFragmentV2.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(L9.a.tv_card_no_title);
                        }
                        return null;
                    case 7:
                        int i117 = AddBankCardFragmentV2.f27826C0;
                        View view8 = addBankCardFragmentV2.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(L9.a.tvTopTips);
                        }
                        return null;
                    case 8:
                        int i118 = AddBankCardFragmentV2.f27826C0;
                        MonthPickDialog monthPickDialog = new MonthPickDialog(addBankCardFragmentV2.requireContext());
                        monthPickDialog.setShowConfirmBtn(true);
                        monthPickDialog.setDateRange(0, 30);
                        monthPickDialog.setCallBack(addBankCardFragmentV2);
                        return monthPickDialog;
                    case 9:
                        int i119 = AddBankCardFragmentV2.f27826C0;
                        E eRequireActivity = addBankCardFragmentV2.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (C0617b) new androidx.camera.video.internal.c(eRequireActivity).h(C0617b.class);
                    case 10:
                        int i23 = AddBankCardFragmentV2.f27826C0;
                        View view9 = addBankCardFragmentV2.f27318b;
                        if (view9 != null) {
                            return (PpButton) view9.findViewById(L9.a.next_bt);
                        }
                        return null;
                    case 11:
                        int i24 = AddBankCardFragmentV2.f27826C0;
                        View view10 = addBankCardFragmentV2.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(L9.a.tv_add_card_tips);
                        }
                        return null;
                    case 12:
                        int i25 = AddBankCardFragmentV2.f27826C0;
                        View view11 = addBankCardFragmentV2.f27318b;
                        if (view11 != null) {
                            return (ModelErrorDivider) view11.findViewById(L9.a.med_card_pin);
                        }
                        return null;
                    case 13:
                        int i26 = AddBankCardFragmentV2.f27826C0;
                        View view12 = addBankCardFragmentV2.f27318b;
                        if (view12 != null) {
                            return (IconicsImageView) view12.findViewById(L9.a.iiv_card_pin_show);
                        }
                        return null;
                    case 14:
                        int i27 = AddBankCardFragmentV2.f27826C0;
                        View view13 = addBankCardFragmentV2.f27318b;
                        if (view13 != null) {
                            return (EditText) view13.findViewById(L9.a.et_card_pin);
                        }
                        return null;
                    case 15:
                        int i28 = AddBankCardFragmentV2.f27826C0;
                        View view14 = addBankCardFragmentV2.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(L9.a.tv_card_pin_title);
                        }
                        return null;
                    case 16:
                        int i29 = AddBankCardFragmentV2.f27826C0;
                        View view15 = addBankCardFragmentV2.f27318b;
                        if (view15 != null) {
                            return (ModelErrorDivider) view15.findViewById(L9.a.med_cvv);
                        }
                        return null;
                    case 17:
                        int i210 = AddBankCardFragmentV2.f27826C0;
                        View view16 = addBankCardFragmentV2.f27318b;
                        if (view16 != null) {
                            return (EditText) view16.findViewById(L9.a.et_cvv);
                        }
                        return null;
                    default:
                        int i211 = AddBankCardFragmentV2.f27826C0;
                        View view17 = addBankCardFragmentV2.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(L9.a.tv_cvv_title);
                        }
                        return null;
                }
            }
        });
        final int i23 = 5;
        this.f27835Q = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.fragment.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankCardFragmentV2 f27911b;

            {
                this.f27911b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankCardFragmentV2 addBankCardFragmentV2 = this.f27911b;
                switch (i23) {
                    case 0:
                        int i110 = AddBankCardFragmentV2.f27826C0;
                        View view = addBankCardFragmentV2.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(L9.a.select_other_method_tv);
                        }
                        return null;
                    case 1:
                        int i111 = AddBankCardFragmentV2.f27826C0;
                        View view2 = addBankCardFragmentV2.f27318b;
                        if (view2 != null) {
                            return (ModelErrorDivider) view2.findViewById(L9.a.med_valid_thru);
                        }
                        return null;
                    case 2:
                        int i112 = AddBankCardFragmentV2.f27826C0;
                        View view3 = addBankCardFragmentV2.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(L9.a.tv_valid_thru);
                        }
                        return null;
                    case 3:
                        int i113 = AddBankCardFragmentV2.f27826C0;
                        View view4 = addBankCardFragmentV2.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(L9.a.tv_valid_thru_title);
                        }
                        return null;
                    case 4:
                        int i114 = AddBankCardFragmentV2.f27826C0;
                        View view5 = addBankCardFragmentV2.f27318b;
                        if (view5 != null) {
                            return (ModelErrorDivider) view5.findViewById(L9.a.med_card_no);
                        }
                        return null;
                    case 5:
                        int i115 = AddBankCardFragmentV2.f27826C0;
                        View view6 = addBankCardFragmentV2.f27318b;
                        if (view6 != null) {
                            return (EditText) view6.findViewById(L9.a.et_bank_card_no);
                        }
                        return null;
                    case 6:
                        int i116 = AddBankCardFragmentV2.f27826C0;
                        View view7 = addBankCardFragmentV2.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(L9.a.tv_card_no_title);
                        }
                        return null;
                    case 7:
                        int i117 = AddBankCardFragmentV2.f27826C0;
                        View view8 = addBankCardFragmentV2.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(L9.a.tvTopTips);
                        }
                        return null;
                    case 8:
                        int i118 = AddBankCardFragmentV2.f27826C0;
                        MonthPickDialog monthPickDialog = new MonthPickDialog(addBankCardFragmentV2.requireContext());
                        monthPickDialog.setShowConfirmBtn(true);
                        monthPickDialog.setDateRange(0, 30);
                        monthPickDialog.setCallBack(addBankCardFragmentV2);
                        return monthPickDialog;
                    case 9:
                        int i119 = AddBankCardFragmentV2.f27826C0;
                        E eRequireActivity = addBankCardFragmentV2.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (C0617b) new androidx.camera.video.internal.c(eRequireActivity).h(C0617b.class);
                    case 10:
                        int i24 = AddBankCardFragmentV2.f27826C0;
                        View view9 = addBankCardFragmentV2.f27318b;
                        if (view9 != null) {
                            return (PpButton) view9.findViewById(L9.a.next_bt);
                        }
                        return null;
                    case 11:
                        int i25 = AddBankCardFragmentV2.f27826C0;
                        View view10 = addBankCardFragmentV2.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(L9.a.tv_add_card_tips);
                        }
                        return null;
                    case 12:
                        int i26 = AddBankCardFragmentV2.f27826C0;
                        View view11 = addBankCardFragmentV2.f27318b;
                        if (view11 != null) {
                            return (ModelErrorDivider) view11.findViewById(L9.a.med_card_pin);
                        }
                        return null;
                    case 13:
                        int i27 = AddBankCardFragmentV2.f27826C0;
                        View view12 = addBankCardFragmentV2.f27318b;
                        if (view12 != null) {
                            return (IconicsImageView) view12.findViewById(L9.a.iiv_card_pin_show);
                        }
                        return null;
                    case 14:
                        int i28 = AddBankCardFragmentV2.f27826C0;
                        View view13 = addBankCardFragmentV2.f27318b;
                        if (view13 != null) {
                            return (EditText) view13.findViewById(L9.a.et_card_pin);
                        }
                        return null;
                    case 15:
                        int i29 = AddBankCardFragmentV2.f27826C0;
                        View view14 = addBankCardFragmentV2.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(L9.a.tv_card_pin_title);
                        }
                        return null;
                    case 16:
                        int i210 = AddBankCardFragmentV2.f27826C0;
                        View view15 = addBankCardFragmentV2.f27318b;
                        if (view15 != null) {
                            return (ModelErrorDivider) view15.findViewById(L9.a.med_cvv);
                        }
                        return null;
                    case 17:
                        int i211 = AddBankCardFragmentV2.f27826C0;
                        View view16 = addBankCardFragmentV2.f27318b;
                        if (view16 != null) {
                            return (EditText) view16.findViewById(L9.a.et_cvv);
                        }
                        return null;
                    default:
                        int i212 = AddBankCardFragmentV2.f27826C0;
                        View view17 = addBankCardFragmentV2.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(L9.a.tv_cvv_title);
                        }
                        return null;
                }
            }
        });
        final int i24 = 6;
        this.f27836X = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.fragment.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankCardFragmentV2 f27911b;

            {
                this.f27911b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankCardFragmentV2 addBankCardFragmentV2 = this.f27911b;
                switch (i24) {
                    case 0:
                        int i110 = AddBankCardFragmentV2.f27826C0;
                        View view = addBankCardFragmentV2.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(L9.a.select_other_method_tv);
                        }
                        return null;
                    case 1:
                        int i111 = AddBankCardFragmentV2.f27826C0;
                        View view2 = addBankCardFragmentV2.f27318b;
                        if (view2 != null) {
                            return (ModelErrorDivider) view2.findViewById(L9.a.med_valid_thru);
                        }
                        return null;
                    case 2:
                        int i112 = AddBankCardFragmentV2.f27826C0;
                        View view3 = addBankCardFragmentV2.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(L9.a.tv_valid_thru);
                        }
                        return null;
                    case 3:
                        int i113 = AddBankCardFragmentV2.f27826C0;
                        View view4 = addBankCardFragmentV2.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(L9.a.tv_valid_thru_title);
                        }
                        return null;
                    case 4:
                        int i114 = AddBankCardFragmentV2.f27826C0;
                        View view5 = addBankCardFragmentV2.f27318b;
                        if (view5 != null) {
                            return (ModelErrorDivider) view5.findViewById(L9.a.med_card_no);
                        }
                        return null;
                    case 5:
                        int i115 = AddBankCardFragmentV2.f27826C0;
                        View view6 = addBankCardFragmentV2.f27318b;
                        if (view6 != null) {
                            return (EditText) view6.findViewById(L9.a.et_bank_card_no);
                        }
                        return null;
                    case 6:
                        int i116 = AddBankCardFragmentV2.f27826C0;
                        View view7 = addBankCardFragmentV2.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(L9.a.tv_card_no_title);
                        }
                        return null;
                    case 7:
                        int i117 = AddBankCardFragmentV2.f27826C0;
                        View view8 = addBankCardFragmentV2.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(L9.a.tvTopTips);
                        }
                        return null;
                    case 8:
                        int i118 = AddBankCardFragmentV2.f27826C0;
                        MonthPickDialog monthPickDialog = new MonthPickDialog(addBankCardFragmentV2.requireContext());
                        monthPickDialog.setShowConfirmBtn(true);
                        monthPickDialog.setDateRange(0, 30);
                        monthPickDialog.setCallBack(addBankCardFragmentV2);
                        return monthPickDialog;
                    case 9:
                        int i119 = AddBankCardFragmentV2.f27826C0;
                        E eRequireActivity = addBankCardFragmentV2.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (C0617b) new androidx.camera.video.internal.c(eRequireActivity).h(C0617b.class);
                    case 10:
                        int i25 = AddBankCardFragmentV2.f27826C0;
                        View view9 = addBankCardFragmentV2.f27318b;
                        if (view9 != null) {
                            return (PpButton) view9.findViewById(L9.a.next_bt);
                        }
                        return null;
                    case 11:
                        int i26 = AddBankCardFragmentV2.f27826C0;
                        View view10 = addBankCardFragmentV2.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(L9.a.tv_add_card_tips);
                        }
                        return null;
                    case 12:
                        int i27 = AddBankCardFragmentV2.f27826C0;
                        View view11 = addBankCardFragmentV2.f27318b;
                        if (view11 != null) {
                            return (ModelErrorDivider) view11.findViewById(L9.a.med_card_pin);
                        }
                        return null;
                    case 13:
                        int i28 = AddBankCardFragmentV2.f27826C0;
                        View view12 = addBankCardFragmentV2.f27318b;
                        if (view12 != null) {
                            return (IconicsImageView) view12.findViewById(L9.a.iiv_card_pin_show);
                        }
                        return null;
                    case 14:
                        int i29 = AddBankCardFragmentV2.f27826C0;
                        View view13 = addBankCardFragmentV2.f27318b;
                        if (view13 != null) {
                            return (EditText) view13.findViewById(L9.a.et_card_pin);
                        }
                        return null;
                    case 15:
                        int i210 = AddBankCardFragmentV2.f27826C0;
                        View view14 = addBankCardFragmentV2.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(L9.a.tv_card_pin_title);
                        }
                        return null;
                    case 16:
                        int i211 = AddBankCardFragmentV2.f27826C0;
                        View view15 = addBankCardFragmentV2.f27318b;
                        if (view15 != null) {
                            return (ModelErrorDivider) view15.findViewById(L9.a.med_cvv);
                        }
                        return null;
                    case 17:
                        int i212 = AddBankCardFragmentV2.f27826C0;
                        View view16 = addBankCardFragmentV2.f27318b;
                        if (view16 != null) {
                            return (EditText) view16.findViewById(L9.a.et_cvv);
                        }
                        return null;
                    default:
                        int i213 = AddBankCardFragmentV2.f27826C0;
                        View view17 = addBankCardFragmentV2.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(L9.a.tv_cvv_title);
                        }
                        return null;
                }
            }
        });
        final int i25 = 7;
        this.f27837Y = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.fragment.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankCardFragmentV2 f27911b;

            {
                this.f27911b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankCardFragmentV2 addBankCardFragmentV2 = this.f27911b;
                switch (i25) {
                    case 0:
                        int i110 = AddBankCardFragmentV2.f27826C0;
                        View view = addBankCardFragmentV2.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(L9.a.select_other_method_tv);
                        }
                        return null;
                    case 1:
                        int i111 = AddBankCardFragmentV2.f27826C0;
                        View view2 = addBankCardFragmentV2.f27318b;
                        if (view2 != null) {
                            return (ModelErrorDivider) view2.findViewById(L9.a.med_valid_thru);
                        }
                        return null;
                    case 2:
                        int i112 = AddBankCardFragmentV2.f27826C0;
                        View view3 = addBankCardFragmentV2.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(L9.a.tv_valid_thru);
                        }
                        return null;
                    case 3:
                        int i113 = AddBankCardFragmentV2.f27826C0;
                        View view4 = addBankCardFragmentV2.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(L9.a.tv_valid_thru_title);
                        }
                        return null;
                    case 4:
                        int i114 = AddBankCardFragmentV2.f27826C0;
                        View view5 = addBankCardFragmentV2.f27318b;
                        if (view5 != null) {
                            return (ModelErrorDivider) view5.findViewById(L9.a.med_card_no);
                        }
                        return null;
                    case 5:
                        int i115 = AddBankCardFragmentV2.f27826C0;
                        View view6 = addBankCardFragmentV2.f27318b;
                        if (view6 != null) {
                            return (EditText) view6.findViewById(L9.a.et_bank_card_no);
                        }
                        return null;
                    case 6:
                        int i116 = AddBankCardFragmentV2.f27826C0;
                        View view7 = addBankCardFragmentV2.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(L9.a.tv_card_no_title);
                        }
                        return null;
                    case 7:
                        int i117 = AddBankCardFragmentV2.f27826C0;
                        View view8 = addBankCardFragmentV2.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(L9.a.tvTopTips);
                        }
                        return null;
                    case 8:
                        int i118 = AddBankCardFragmentV2.f27826C0;
                        MonthPickDialog monthPickDialog = new MonthPickDialog(addBankCardFragmentV2.requireContext());
                        monthPickDialog.setShowConfirmBtn(true);
                        monthPickDialog.setDateRange(0, 30);
                        monthPickDialog.setCallBack(addBankCardFragmentV2);
                        return monthPickDialog;
                    case 9:
                        int i119 = AddBankCardFragmentV2.f27826C0;
                        E eRequireActivity = addBankCardFragmentV2.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (C0617b) new androidx.camera.video.internal.c(eRequireActivity).h(C0617b.class);
                    case 10:
                        int i26 = AddBankCardFragmentV2.f27826C0;
                        View view9 = addBankCardFragmentV2.f27318b;
                        if (view9 != null) {
                            return (PpButton) view9.findViewById(L9.a.next_bt);
                        }
                        return null;
                    case 11:
                        int i27 = AddBankCardFragmentV2.f27826C0;
                        View view10 = addBankCardFragmentV2.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(L9.a.tv_add_card_tips);
                        }
                        return null;
                    case 12:
                        int i28 = AddBankCardFragmentV2.f27826C0;
                        View view11 = addBankCardFragmentV2.f27318b;
                        if (view11 != null) {
                            return (ModelErrorDivider) view11.findViewById(L9.a.med_card_pin);
                        }
                        return null;
                    case 13:
                        int i29 = AddBankCardFragmentV2.f27826C0;
                        View view12 = addBankCardFragmentV2.f27318b;
                        if (view12 != null) {
                            return (IconicsImageView) view12.findViewById(L9.a.iiv_card_pin_show);
                        }
                        return null;
                    case 14:
                        int i210 = AddBankCardFragmentV2.f27826C0;
                        View view13 = addBankCardFragmentV2.f27318b;
                        if (view13 != null) {
                            return (EditText) view13.findViewById(L9.a.et_card_pin);
                        }
                        return null;
                    case 15:
                        int i211 = AddBankCardFragmentV2.f27826C0;
                        View view14 = addBankCardFragmentV2.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(L9.a.tv_card_pin_title);
                        }
                        return null;
                    case 16:
                        int i212 = AddBankCardFragmentV2.f27826C0;
                        View view15 = addBankCardFragmentV2.f27318b;
                        if (view15 != null) {
                            return (ModelErrorDivider) view15.findViewById(L9.a.med_cvv);
                        }
                        return null;
                    case 17:
                        int i213 = AddBankCardFragmentV2.f27826C0;
                        View view16 = addBankCardFragmentV2.f27318b;
                        if (view16 != null) {
                            return (EditText) view16.findViewById(L9.a.et_cvv);
                        }
                        return null;
                    default:
                        int i214 = AddBankCardFragmentV2.f27826C0;
                        View view17 = addBankCardFragmentV2.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(L9.a.tv_cvv_title);
                        }
                        return null;
                }
            }
        });
        final int i26 = 8;
        this.f27838Z = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.fragment.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankCardFragmentV2 f27911b;

            {
                this.f27911b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankCardFragmentV2 addBankCardFragmentV2 = this.f27911b;
                switch (i26) {
                    case 0:
                        int i110 = AddBankCardFragmentV2.f27826C0;
                        View view = addBankCardFragmentV2.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(L9.a.select_other_method_tv);
                        }
                        return null;
                    case 1:
                        int i111 = AddBankCardFragmentV2.f27826C0;
                        View view2 = addBankCardFragmentV2.f27318b;
                        if (view2 != null) {
                            return (ModelErrorDivider) view2.findViewById(L9.a.med_valid_thru);
                        }
                        return null;
                    case 2:
                        int i112 = AddBankCardFragmentV2.f27826C0;
                        View view3 = addBankCardFragmentV2.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(L9.a.tv_valid_thru);
                        }
                        return null;
                    case 3:
                        int i113 = AddBankCardFragmentV2.f27826C0;
                        View view4 = addBankCardFragmentV2.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(L9.a.tv_valid_thru_title);
                        }
                        return null;
                    case 4:
                        int i114 = AddBankCardFragmentV2.f27826C0;
                        View view5 = addBankCardFragmentV2.f27318b;
                        if (view5 != null) {
                            return (ModelErrorDivider) view5.findViewById(L9.a.med_card_no);
                        }
                        return null;
                    case 5:
                        int i115 = AddBankCardFragmentV2.f27826C0;
                        View view6 = addBankCardFragmentV2.f27318b;
                        if (view6 != null) {
                            return (EditText) view6.findViewById(L9.a.et_bank_card_no);
                        }
                        return null;
                    case 6:
                        int i116 = AddBankCardFragmentV2.f27826C0;
                        View view7 = addBankCardFragmentV2.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(L9.a.tv_card_no_title);
                        }
                        return null;
                    case 7:
                        int i117 = AddBankCardFragmentV2.f27826C0;
                        View view8 = addBankCardFragmentV2.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(L9.a.tvTopTips);
                        }
                        return null;
                    case 8:
                        int i118 = AddBankCardFragmentV2.f27826C0;
                        MonthPickDialog monthPickDialog = new MonthPickDialog(addBankCardFragmentV2.requireContext());
                        monthPickDialog.setShowConfirmBtn(true);
                        monthPickDialog.setDateRange(0, 30);
                        monthPickDialog.setCallBack(addBankCardFragmentV2);
                        return monthPickDialog;
                    case 9:
                        int i119 = AddBankCardFragmentV2.f27826C0;
                        E eRequireActivity = addBankCardFragmentV2.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (C0617b) new androidx.camera.video.internal.c(eRequireActivity).h(C0617b.class);
                    case 10:
                        int i27 = AddBankCardFragmentV2.f27826C0;
                        View view9 = addBankCardFragmentV2.f27318b;
                        if (view9 != null) {
                            return (PpButton) view9.findViewById(L9.a.next_bt);
                        }
                        return null;
                    case 11:
                        int i28 = AddBankCardFragmentV2.f27826C0;
                        View view10 = addBankCardFragmentV2.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(L9.a.tv_add_card_tips);
                        }
                        return null;
                    case 12:
                        int i29 = AddBankCardFragmentV2.f27826C0;
                        View view11 = addBankCardFragmentV2.f27318b;
                        if (view11 != null) {
                            return (ModelErrorDivider) view11.findViewById(L9.a.med_card_pin);
                        }
                        return null;
                    case 13:
                        int i210 = AddBankCardFragmentV2.f27826C0;
                        View view12 = addBankCardFragmentV2.f27318b;
                        if (view12 != null) {
                            return (IconicsImageView) view12.findViewById(L9.a.iiv_card_pin_show);
                        }
                        return null;
                    case 14:
                        int i211 = AddBankCardFragmentV2.f27826C0;
                        View view13 = addBankCardFragmentV2.f27318b;
                        if (view13 != null) {
                            return (EditText) view13.findViewById(L9.a.et_card_pin);
                        }
                        return null;
                    case 15:
                        int i212 = AddBankCardFragmentV2.f27826C0;
                        View view14 = addBankCardFragmentV2.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(L9.a.tv_card_pin_title);
                        }
                        return null;
                    case 16:
                        int i213 = AddBankCardFragmentV2.f27826C0;
                        View view15 = addBankCardFragmentV2.f27318b;
                        if (view15 != null) {
                            return (ModelErrorDivider) view15.findViewById(L9.a.med_cvv);
                        }
                        return null;
                    case 17:
                        int i214 = AddBankCardFragmentV2.f27826C0;
                        View view16 = addBankCardFragmentV2.f27318b;
                        if (view16 != null) {
                            return (EditText) view16.findViewById(L9.a.et_cvv);
                        }
                        return null;
                    default:
                        int i215 = AddBankCardFragmentV2.f27826C0;
                        View view17 = addBankCardFragmentV2.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(L9.a.tv_cvv_title);
                        }
                        return null;
                }
            }
        });
        this.f27855z0 = 0L;
        this.f27828A0 = 0L;
        final int i27 = 9;
        this.f27830B0 = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.fragment.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankCardFragmentV2 f27911b;

            {
                this.f27911b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankCardFragmentV2 addBankCardFragmentV2 = this.f27911b;
                switch (i27) {
                    case 0:
                        int i110 = AddBankCardFragmentV2.f27826C0;
                        View view = addBankCardFragmentV2.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(L9.a.select_other_method_tv);
                        }
                        return null;
                    case 1:
                        int i111 = AddBankCardFragmentV2.f27826C0;
                        View view2 = addBankCardFragmentV2.f27318b;
                        if (view2 != null) {
                            return (ModelErrorDivider) view2.findViewById(L9.a.med_valid_thru);
                        }
                        return null;
                    case 2:
                        int i112 = AddBankCardFragmentV2.f27826C0;
                        View view3 = addBankCardFragmentV2.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(L9.a.tv_valid_thru);
                        }
                        return null;
                    case 3:
                        int i113 = AddBankCardFragmentV2.f27826C0;
                        View view4 = addBankCardFragmentV2.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(L9.a.tv_valid_thru_title);
                        }
                        return null;
                    case 4:
                        int i114 = AddBankCardFragmentV2.f27826C0;
                        View view5 = addBankCardFragmentV2.f27318b;
                        if (view5 != null) {
                            return (ModelErrorDivider) view5.findViewById(L9.a.med_card_no);
                        }
                        return null;
                    case 5:
                        int i115 = AddBankCardFragmentV2.f27826C0;
                        View view6 = addBankCardFragmentV2.f27318b;
                        if (view6 != null) {
                            return (EditText) view6.findViewById(L9.a.et_bank_card_no);
                        }
                        return null;
                    case 6:
                        int i116 = AddBankCardFragmentV2.f27826C0;
                        View view7 = addBankCardFragmentV2.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(L9.a.tv_card_no_title);
                        }
                        return null;
                    case 7:
                        int i117 = AddBankCardFragmentV2.f27826C0;
                        View view8 = addBankCardFragmentV2.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(L9.a.tvTopTips);
                        }
                        return null;
                    case 8:
                        int i118 = AddBankCardFragmentV2.f27826C0;
                        MonthPickDialog monthPickDialog = new MonthPickDialog(addBankCardFragmentV2.requireContext());
                        monthPickDialog.setShowConfirmBtn(true);
                        monthPickDialog.setDateRange(0, 30);
                        monthPickDialog.setCallBack(addBankCardFragmentV2);
                        return monthPickDialog;
                    case 9:
                        int i119 = AddBankCardFragmentV2.f27826C0;
                        E eRequireActivity = addBankCardFragmentV2.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (C0617b) new androidx.camera.video.internal.c(eRequireActivity).h(C0617b.class);
                    case 10:
                        int i28 = AddBankCardFragmentV2.f27826C0;
                        View view9 = addBankCardFragmentV2.f27318b;
                        if (view9 != null) {
                            return (PpButton) view9.findViewById(L9.a.next_bt);
                        }
                        return null;
                    case 11:
                        int i29 = AddBankCardFragmentV2.f27826C0;
                        View view10 = addBankCardFragmentV2.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(L9.a.tv_add_card_tips);
                        }
                        return null;
                    case 12:
                        int i210 = AddBankCardFragmentV2.f27826C0;
                        View view11 = addBankCardFragmentV2.f27318b;
                        if (view11 != null) {
                            return (ModelErrorDivider) view11.findViewById(L9.a.med_card_pin);
                        }
                        return null;
                    case 13:
                        int i211 = AddBankCardFragmentV2.f27826C0;
                        View view12 = addBankCardFragmentV2.f27318b;
                        if (view12 != null) {
                            return (IconicsImageView) view12.findViewById(L9.a.iiv_card_pin_show);
                        }
                        return null;
                    case 14:
                        int i212 = AddBankCardFragmentV2.f27826C0;
                        View view13 = addBankCardFragmentV2.f27318b;
                        if (view13 != null) {
                            return (EditText) view13.findViewById(L9.a.et_card_pin);
                        }
                        return null;
                    case 15:
                        int i213 = AddBankCardFragmentV2.f27826C0;
                        View view14 = addBankCardFragmentV2.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(L9.a.tv_card_pin_title);
                        }
                        return null;
                    case 16:
                        int i214 = AddBankCardFragmentV2.f27826C0;
                        View view15 = addBankCardFragmentV2.f27318b;
                        if (view15 != null) {
                            return (ModelErrorDivider) view15.findViewById(L9.a.med_cvv);
                        }
                        return null;
                    case 17:
                        int i215 = AddBankCardFragmentV2.f27826C0;
                        View view16 = addBankCardFragmentV2.f27318b;
                        if (view16 != null) {
                            return (EditText) view16.findViewById(L9.a.et_cvv);
                        }
                        return null;
                    default:
                        int i216 = AddBankCardFragmentV2.f27826C0;
                        View view17 = addBankCardFragmentV2.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(L9.a.tv_cvv_title);
                        }
                        return null;
                }
            }
        });
    }

    public static String A(int i7) {
        return i7 < 10 ? G.m(i7, "0") : String.valueOf(i7);
    }

    public static void E(ModelErrorDivider modelErrorDivider, String str) {
        if (modelErrorDivider != null) {
            modelErrorDivider.setErrorMessage(str);
        }
    }

    public final PpButton B() {
        return (PpButton) this.f27839j.getValue();
    }

    public final TextView C() {
        return (TextView) this.f27833L.getValue();
    }

    public final void D() {
        EditText editTextX = x();
        String strValueOf = String.valueOf(editTextX != null ? editTextX.getText() : null);
        AddBankCardReq addBankCardReq = this.f27845r0;
        if (addBankCardReq != null) {
            addBankCardReq.payType = 2;
            addBankCardReq.reUseable = 0;
            addBankCardReq.payerCardCvv = strValueOf;
            EditText editTextW = w();
            addBankCardReq.payerCardPin = String.valueOf(editTextW != null ? editTextW.getText() : null);
            addBankCardReq.payerCardExpiryMon = A(this.f27844q0);
            addBankCardReq.payerCardExpiryYear = String.valueOf(this.f27843p0);
            addBankCardReq.payerCardNo = y();
            BankInfo bankInfo = this.f27846s0;
            addBankCardReq.payerBankCode = bankInfo != null ? bankInfo.bankCode : null;
            addBankCardReq.transType = TransType.TRANS_TYPE_BIND_BANK_CARD;
            Number number = this.f27855z0;
            if (number == null) {
                number = 0;
            }
            addBankCardReq.cardBusinessType = number;
            BindBankCardReq bindBankCardReq = this.f27850v0;
            if (bindBankCardReq != null) {
                BankCardExtInfo bankCardExtInfo = new BankCardExtInfo();
                bankCardExtInfo.operate = 1;
                bankCardExtInfo.oldCardNo = bindBankCardReq.cardNo;
                addBankCardReq.bankCardExtInfo = bankCardExtInfo;
            }
        }
        AddBankCardViewModel addBankCardViewModel = (AddBankCardViewModel) this.f27333i;
        if (addBankCardViewModel != null) {
            AddBankCardReq addBankCardReq2 = this.f27845r0;
            C0623e c0623e = new C0623e(addBankCardReq2, null);
            l lVar = addBankCardViewModel.f28209j;
            lVar.f27356m = addBankCardReq2;
            Unit unit = Unit.f38893a;
            p140j8.f.v(addBankCardViewModel, c0623e, lVar, 0L);
        }
    }

    public final void F() {
        try {
            String string = SPUtils.getInstance("draft_record").getString("_key_bank_draft");
            if (string != null && string.length() != 0) {
                C0525w.f().getClass();
                PayByOrderReq payByOrderReq = (PayByOrderReq) C0525w.d(string, PayByOrderReq.class);
                if (payByOrderReq != null) {
                    O6.c cVar = new O6.c(requireContext());
                    cVar.f6596b = O6.d.f("Attention");
                    cVar.b(k.core_draft_tips);
                    String string2 = getResources().getString(k.core_no);
                    b bVar = new b(this, 0);
                    cVar.f6601g = string2;
                    cVar.f6603i = bVar;
                    String string3 = getResources().getString(k.core_continue);
                    p010a9.b bVar2 = new p010a9.b(16, payByOrderReq, this);
                    cVar.f6600f = string3;
                    cVar.f6602h = bVar2;
                    this.f27840k0 = cVar.g();
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    public final void G() {
        boolean z3;
        TextView textViewC = C();
        if (TextUtils.isEmpty(textViewC != null ? textViewC.getText() : null)) {
            z3 = false;
        } else {
            EditText editTextX = x();
            if (TextUtils.isEmpty(editTextX != null ? editTextX.getText() : null)) {
                z3 = false;
            } else {
                EditText editTextW = w();
                if (TextUtils.isEmpty(editTextW != null ? editTextW.getText() : null) || TextUtils.isEmpty(y())) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            }
        }
        PpButton ppButtonB = B();
        if (ppButtonB != null) {
            ppButtonB.setEnabled(z3);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return L9.b.cm_fragment_add_bank_card_v2;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        if (this.f27845r0 == null) {
            AddBankCardReq addBankCardReq = new AddBankCardReq();
            this.f27845r0 = addBankCardReq;
            addBankCardReq.currency = BaseApplication.getCurrency();
            AddBankCardReq addBankCardReq2 = this.f27845r0;
            if (addBankCardReq2 != null) {
                addBankCardReq2.orderType = "7";
            }
        }
        BindBankCardReq bindBankCardReq = this.f27850v0;
        if (bindBankCardReq != null && bindBankCardReq.bankCardStatus != 3) {
            EditText editTextV = v();
            if (editTextV != null) {
                editTextV.setText(bindBankCardReq.cardNo);
            }
            if (!TextUtils.isEmpty(bindBankCardReq.bankCode)) {
                BankInfo bankInfo = new BankInfo();
                bankInfo.bankCode = bindBankCardReq.bankCode;
                bankInfo.bankName = bindBankCardReq.bankName;
                bankInfo.bankUrl = bindBankCardReq.bankUrl;
                this.f27846s0 = bankInfo;
            }
            if (!TextUtils.isEmpty(bindBankCardReq.cardExpiryMon) && !TextUtils.isEmpty(bindBankCardReq.cardExpiryYear)) {
                String str = bindBankCardReq.cardExpiryMon;
                this.f27844q0 = str != null ? Integer.parseInt(str) : 0;
                String str2 = bindBankCardReq.cardExpiryYear;
                this.f27843p0 = str2 != null ? Integer.parseInt(str2) : 0;
                TextView textViewC = C();
                if (textViewC != null) {
                    textViewC.setText(bindBankCardReq.cardExpiryMon + "/" + bindBankCardReq.cardExpiryYear);
                }
            }
        }
        AddBankCardViewModel addBankCardViewModel = (AddBankCardViewModel) this.f27333i;
        l lVar = addBankCardViewModel != null ? addBankCardViewModel.f28206f : null;
        if (lVar != null) {
            lVar.e(this, new I(new f(this, 0), 6));
        }
        AddBankCardViewModel addBankCardViewModel2 = (AddBankCardViewModel) this.f27333i;
        l lVar2 = addBankCardViewModel2 != null ? addBankCardViewModel2.f28205e : null;
        if (lVar2 != null) {
            lVar2.e(this, new I(new f(this, 1), 6));
        }
        AddBankCardViewModel addBankCardViewModel3 = (AddBankCardViewModel) this.f27333i;
        final int i7 = 0;
        n.B(this, addBankCardViewModel3 != null ? addBankCardViewModel3.f28208i : null, this, new Function2(this) { // from class: com.transsnet.palmpay.core.ui.fragment.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankCardFragmentV2 f27913b;

            {
                this.f27913b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                PaymentMethod paymentMethod = null;
                AddBankCardFragmentV2 addBankCardFragmentV2 = this.f27913b;
                switch (i7) {
                    case 0:
                        CheckCardBindNumReq checkCardBindNumReq = (CheckCardBindNumReq) obj;
                        CommonResult resp = (CommonResult) obj2;
                        int i10 = AddBankCardFragmentV2.f27826C0;
                        Intrinsics.checkNotNullParameter(resp, "resp");
                        PpButton ppButtonB = addBankCardFragmentV2.B();
                        if (ppButtonB != null) {
                            ppButtonB.b(false);
                        }
                        if (!resp.isSuccess()) {
                            addBankCardFragmentV2.p(resp.getRespMsg());
                        } else if (Intrinsics.c(checkCardBindNumReq != null ? checkCardBindNumReq.getCardNo() : null, addBankCardFragmentV2.y())) {
                            if (addBankCardFragmentV2.f27853x0) {
                                ARouter aRouter = ARouter.getInstance();
                                Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
                                Postcard postcardBuild = ARouter.getInstance().build("/account/authentication");
                                Intrinsics.checkNotNullExpressionValue(postcardBuild, "build(...)");
                                r0.x(aRouter, addBankCardFragmentV2, postcardBuild, 91);
                            } else if (addBankCardFragmentV2.f27854y0) {
                                addBankCardFragmentV2.D();
                            } else {
                                MessageEvent messageEvent = new MessageEvent(MessageEvent.EVENT_ADD_NEW_BANK_CARD, addBankCardFragmentV2.f27855z0);
                                PaymentMethod paymentMethod2 = new PaymentMethod();
                                paymentMethod2.payType = 2;
                                paymentMethod2.senderAccountType = 5;
                                paymentMethod2.reUseable = 0;
                                EditText editTextX = addBankCardFragmentV2.x();
                                paymentMethod2.cvv = String.valueOf(editTextX != null ? editTextX.getText() : null);
                                EditText editTextW = addBankCardFragmentV2.w();
                                paymentMethod2.cardPin = String.valueOf(editTextW != null ? editTextW.getText() : null);
                                paymentMethod2.expiryMonth = AddBankCardFragmentV2.A(addBankCardFragmentV2.f27844q0);
                                paymentMethod2.expiryYear = String.valueOf(addBankCardFragmentV2.f27843p0);
                                paymentMethod2.cardNo = addBankCardFragmentV2.y();
                                BankInfo bankInfo2 = addBankCardFragmentV2.f27846s0;
                                if (bankInfo2 != null) {
                                    paymentMethod2.bankCode = bankInfo2.bankCode;
                                    paymentMethod2.bankName = bankInfo2.bankName;
                                    paymentMethod2.bankUrl = bankInfo2.bankUrl;
                                }
                                messageEvent.setEventObj(paymentMethod2);
                                messageEvent.setEventContent(addBankCardFragmentV2.f27852w0);
                                org.greenrobot.eventbus.c.b().f(messageEvent);
                                addBankCardFragmentV2.requireActivity().finish();
                            }
                        }
                        break;
                    case 1:
                        CheckModifyBankCardReq checkModifyBankCardReq = (CheckModifyBankCardReq) obj;
                        CommonBeanResult resp2 = (CommonBeanResult) obj2;
                        int i11 = AddBankCardFragmentV2.f27826C0;
                        Intrinsics.checkNotNullParameter(resp2, "resp");
                        PpButton ppButtonB2 = addBankCardFragmentV2.B();
                        if (ppButtonB2 != null) {
                            ppButtonB2.b(false);
                        }
                        if (!resp2.isSuccess()) {
                            addBankCardFragmentV2.p(resp2.getRespMsg());
                        } else if (Intrinsics.c(checkModifyBankCardReq != null ? checkModifyBankCardReq.oldCardNo : null, addBankCardFragmentV2.y())) {
                            addBankCardFragmentV2.D();
                        }
                        break;
                    default:
                        PayByOrderReq payByOrderReq = (PayByOrderReq) obj;
                        PayByOrderResp resp3 = (PayByOrderResp) obj2;
                        int i12 = AddBankCardFragmentV2.f27826C0;
                        Intrinsics.checkNotNullParameter(resp3, "resp");
                        if (resp3.isSuccess()) {
                            PayByOrderResp.DataBean data = resp3.getData();
                            if (data != null) {
                                if (data.flag) {
                                    CheckPayReq checkPayReq = new CheckPayReq();
                                    checkPayReq.orderNo = data.orderNo;
                                    checkPayReq.orderType = payByOrderReq != null ? payByOrderReq.orderType : null;
                                    checkPayReq.payId = data.payId;
                                    checkPayReq.subPayId = data.subPayId;
                                    checkPayReq.verifyMethod = data.verifyMethod;
                                    checkPayReq.payRouteId = data.payRouteId;
                                    checkPayReq.url = data.url;
                                    checkPayReq.transType = TransType.TRANS_TYPE_BIND_BANK_CARD;
                                    checkPayReq.bankCardNo = addBankCardFragmentV2.y();
                                    checkPayReq.bankName = "";
                                    checkPayReq.payAmount = payByOrderReq != null ? payByOrderReq.amount : 0L;
                                    try {
                                        Long lI = C0525w.i(data.orderData, "payFee");
                                        Intrinsics.checkNotNullExpressionValue(lI, "getJsonLong(...)");
                                        checkPayReq.feeAmount = lI.longValue();
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                    }
                                    d0 d0Var = new d0(addBankCardFragmentV2.requireContext());
                                    d0Var.f27748b = checkPayReq;
                                    BankInfo bankInfo3 = addBankCardFragmentV2.f27846s0;
                                    if (bankInfo3 != null) {
                                        paymentMethod = new PaymentMethod();
                                        paymentMethod.bankCode = bankInfo3.bankCode;
                                        paymentMethod.bankName = bankInfo3.bankName;
                                        paymentMethod.bankUrl = bankInfo3.bankUrl;
                                        paymentMethod.countryCode = bankInfo3.countryCode;
                                        paymentMethod.payType = 2;
                                        paymentMethod.senderAccountType = 5;
                                        paymentMethod.cardNo = addBankCardFragmentV2.y();
                                    }
                                    d0Var.f27751e = paymentMethod;
                                    d0Var.f27749c = resp3;
                                    HashMap map = new HashMap();
                                    map.put("extra_type", String.valueOf(addBankCardFragmentV2.f27855z0));
                                    map.put("extra_entry_type", String.valueOf(addBankCardFragmentV2.f27828A0));
                                    d0Var.f27752f = map;
                                    d0Var.a();
                                } else if ("7".equals(payByOrderReq != null ? payByOrderReq.orderType : null)) {
                                    J j6 = new J();
                                    j6.f7022a = payByOrderReq.orderType;
                                    j6.f7023b = resp3.getData();
                                    j6.f7025d = TransType.TRANS_TYPE_BIND_BANK_CARD;
                                    j6.f7026e = payByOrderReq.amount;
                                    j6.f7024c = data.orderNo;
                                    j6.f7027f = "";
                                    Long l5 = addBankCardFragmentV2.f27855z0;
                                    j6.f7029h = l5 != null ? l5.longValue() : 0L;
                                    Long l6 = addBankCardFragmentV2.f27828A0;
                                    j6.f7030i = l6 != null ? l6.longValue() : 0L;
                                    K.a(j6);
                                }
                            }
                        } else {
                            String respCode = resp3.getRespCode();
                            if (Intrinsics.c(respCode, "33000039") || Intrinsics.c(respCode, "33000040") || Intrinsics.c(respCode, "33000041") || Intrinsics.c(respCode, "33000093")) {
                                i0.i0(addBankCardFragmentV2.requireContext(), resp3.getRespCode(), resp3.getRespMsg(), true);
                            } else if ("CFRONT_700007".equalsIgnoreCase(resp3.getRespCode()) || "CFRONT_700002".equalsIgnoreCase(resp3.getRespCode()) || "CFRONT_700003".equalsIgnoreCase(resp3.getRespCode())) {
                                ToastUtils.showLong(resp3.getRespMsg(), new Object[0]);
                            } else {
                                addBankCardFragmentV2.p(resp3.getRespMsg());
                            }
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new Function1(this) { // from class: com.transsnet.palmpay.core.ui.fragment.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankCardFragmentV2 f27915b;

            {
                this.f27915b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AddBankCardFragmentV2 addBankCardFragmentV2 = this.f27915b;
                String it = (String) obj;
                switch (i7) {
                    case 0:
                        int i10 = AddBankCardFragmentV2.f27826C0;
                        Intrinsics.checkNotNullParameter(it, "it");
                        PpButton ppButtonB = addBankCardFragmentV2.B();
                        if (ppButtonB != null) {
                            ppButtonB.b(false);
                        }
                        ToastUtils.showLong(it, new Object[0]);
                        break;
                    default:
                        int i11 = AddBankCardFragmentV2.f27826C0;
                        Intrinsics.checkNotNullParameter(it, "it");
                        PpButton ppButtonB2 = addBankCardFragmentV2.B();
                        if (ppButtonB2 != null) {
                            ppButtonB2.b(false);
                        }
                        ToastUtils.showLong(it, new Object[0]);
                        break;
                }
                return Unit.f38893a;
            }
        }, false, null, 240);
        AddBankCardViewModel addBankCardViewModel4 = (AddBankCardViewModel) this.f27333i;
        final int i10 = 1;
        n.B(this, addBankCardViewModel4 != null ? addBankCardViewModel4.f28210o : null, this, new Function2(this) { // from class: com.transsnet.palmpay.core.ui.fragment.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankCardFragmentV2 f27913b;

            {
                this.f27913b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                PaymentMethod paymentMethod = null;
                AddBankCardFragmentV2 addBankCardFragmentV2 = this.f27913b;
                switch (i10) {
                    case 0:
                        CheckCardBindNumReq checkCardBindNumReq = (CheckCardBindNumReq) obj;
                        CommonResult resp = (CommonResult) obj2;
                        int i11 = AddBankCardFragmentV2.f27826C0;
                        Intrinsics.checkNotNullParameter(resp, "resp");
                        PpButton ppButtonB = addBankCardFragmentV2.B();
                        if (ppButtonB != null) {
                            ppButtonB.b(false);
                        }
                        if (!resp.isSuccess()) {
                            addBankCardFragmentV2.p(resp.getRespMsg());
                        } else if (Intrinsics.c(checkCardBindNumReq != null ? checkCardBindNumReq.getCardNo() : null, addBankCardFragmentV2.y())) {
                            if (addBankCardFragmentV2.f27853x0) {
                                ARouter aRouter = ARouter.getInstance();
                                Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
                                Postcard postcardBuild = ARouter.getInstance().build("/account/authentication");
                                Intrinsics.checkNotNullExpressionValue(postcardBuild, "build(...)");
                                r0.x(aRouter, addBankCardFragmentV2, postcardBuild, 91);
                            } else if (addBankCardFragmentV2.f27854y0) {
                                addBankCardFragmentV2.D();
                            } else {
                                MessageEvent messageEvent = new MessageEvent(MessageEvent.EVENT_ADD_NEW_BANK_CARD, addBankCardFragmentV2.f27855z0);
                                PaymentMethod paymentMethod2 = new PaymentMethod();
                                paymentMethod2.payType = 2;
                                paymentMethod2.senderAccountType = 5;
                                paymentMethod2.reUseable = 0;
                                EditText editTextX = addBankCardFragmentV2.x();
                                paymentMethod2.cvv = String.valueOf(editTextX != null ? editTextX.getText() : null);
                                EditText editTextW = addBankCardFragmentV2.w();
                                paymentMethod2.cardPin = String.valueOf(editTextW != null ? editTextW.getText() : null);
                                paymentMethod2.expiryMonth = AddBankCardFragmentV2.A(addBankCardFragmentV2.f27844q0);
                                paymentMethod2.expiryYear = String.valueOf(addBankCardFragmentV2.f27843p0);
                                paymentMethod2.cardNo = addBankCardFragmentV2.y();
                                BankInfo bankInfo2 = addBankCardFragmentV2.f27846s0;
                                if (bankInfo2 != null) {
                                    paymentMethod2.bankCode = bankInfo2.bankCode;
                                    paymentMethod2.bankName = bankInfo2.bankName;
                                    paymentMethod2.bankUrl = bankInfo2.bankUrl;
                                }
                                messageEvent.setEventObj(paymentMethod2);
                                messageEvent.setEventContent(addBankCardFragmentV2.f27852w0);
                                org.greenrobot.eventbus.c.b().f(messageEvent);
                                addBankCardFragmentV2.requireActivity().finish();
                            }
                        }
                        break;
                    case 1:
                        CheckModifyBankCardReq checkModifyBankCardReq = (CheckModifyBankCardReq) obj;
                        CommonBeanResult resp2 = (CommonBeanResult) obj2;
                        int i12 = AddBankCardFragmentV2.f27826C0;
                        Intrinsics.checkNotNullParameter(resp2, "resp");
                        PpButton ppButtonB2 = addBankCardFragmentV2.B();
                        if (ppButtonB2 != null) {
                            ppButtonB2.b(false);
                        }
                        if (!resp2.isSuccess()) {
                            addBankCardFragmentV2.p(resp2.getRespMsg());
                        } else if (Intrinsics.c(checkModifyBankCardReq != null ? checkModifyBankCardReq.oldCardNo : null, addBankCardFragmentV2.y())) {
                            addBankCardFragmentV2.D();
                        }
                        break;
                    default:
                        PayByOrderReq payByOrderReq = (PayByOrderReq) obj;
                        PayByOrderResp resp3 = (PayByOrderResp) obj2;
                        int i13 = AddBankCardFragmentV2.f27826C0;
                        Intrinsics.checkNotNullParameter(resp3, "resp");
                        if (resp3.isSuccess()) {
                            PayByOrderResp.DataBean data = resp3.getData();
                            if (data != null) {
                                if (data.flag) {
                                    CheckPayReq checkPayReq = new CheckPayReq();
                                    checkPayReq.orderNo = data.orderNo;
                                    checkPayReq.orderType = payByOrderReq != null ? payByOrderReq.orderType : null;
                                    checkPayReq.payId = data.payId;
                                    checkPayReq.subPayId = data.subPayId;
                                    checkPayReq.verifyMethod = data.verifyMethod;
                                    checkPayReq.payRouteId = data.payRouteId;
                                    checkPayReq.url = data.url;
                                    checkPayReq.transType = TransType.TRANS_TYPE_BIND_BANK_CARD;
                                    checkPayReq.bankCardNo = addBankCardFragmentV2.y();
                                    checkPayReq.bankName = "";
                                    checkPayReq.payAmount = payByOrderReq != null ? payByOrderReq.amount : 0L;
                                    try {
                                        Long lI = C0525w.i(data.orderData, "payFee");
                                        Intrinsics.checkNotNullExpressionValue(lI, "getJsonLong(...)");
                                        checkPayReq.feeAmount = lI.longValue();
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                    }
                                    d0 d0Var = new d0(addBankCardFragmentV2.requireContext());
                                    d0Var.f27748b = checkPayReq;
                                    BankInfo bankInfo3 = addBankCardFragmentV2.f27846s0;
                                    if (bankInfo3 != null) {
                                        paymentMethod = new PaymentMethod();
                                        paymentMethod.bankCode = bankInfo3.bankCode;
                                        paymentMethod.bankName = bankInfo3.bankName;
                                        paymentMethod.bankUrl = bankInfo3.bankUrl;
                                        paymentMethod.countryCode = bankInfo3.countryCode;
                                        paymentMethod.payType = 2;
                                        paymentMethod.senderAccountType = 5;
                                        paymentMethod.cardNo = addBankCardFragmentV2.y();
                                    }
                                    d0Var.f27751e = paymentMethod;
                                    d0Var.f27749c = resp3;
                                    HashMap map = new HashMap();
                                    map.put("extra_type", String.valueOf(addBankCardFragmentV2.f27855z0));
                                    map.put("extra_entry_type", String.valueOf(addBankCardFragmentV2.f27828A0));
                                    d0Var.f27752f = map;
                                    d0Var.a();
                                } else if ("7".equals(payByOrderReq != null ? payByOrderReq.orderType : null)) {
                                    J j6 = new J();
                                    j6.f7022a = payByOrderReq.orderType;
                                    j6.f7023b = resp3.getData();
                                    j6.f7025d = TransType.TRANS_TYPE_BIND_BANK_CARD;
                                    j6.f7026e = payByOrderReq.amount;
                                    j6.f7024c = data.orderNo;
                                    j6.f7027f = "";
                                    Long l5 = addBankCardFragmentV2.f27855z0;
                                    j6.f7029h = l5 != null ? l5.longValue() : 0L;
                                    Long l6 = addBankCardFragmentV2.f27828A0;
                                    j6.f7030i = l6 != null ? l6.longValue() : 0L;
                                    K.a(j6);
                                }
                            }
                        } else {
                            String respCode = resp3.getRespCode();
                            if (Intrinsics.c(respCode, "33000039") || Intrinsics.c(respCode, "33000040") || Intrinsics.c(respCode, "33000041") || Intrinsics.c(respCode, "33000093")) {
                                i0.i0(addBankCardFragmentV2.requireContext(), resp3.getRespCode(), resp3.getRespMsg(), true);
                            } else if ("CFRONT_700007".equalsIgnoreCase(resp3.getRespCode()) || "CFRONT_700002".equalsIgnoreCase(resp3.getRespCode()) || "CFRONT_700003".equalsIgnoreCase(resp3.getRespCode())) {
                                ToastUtils.showLong(resp3.getRespMsg(), new Object[0]);
                            } else {
                                addBankCardFragmentV2.p(resp3.getRespMsg());
                            }
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new Function1(this) { // from class: com.transsnet.palmpay.core.ui.fragment.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankCardFragmentV2 f27915b;

            {
                this.f27915b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AddBankCardFragmentV2 addBankCardFragmentV2 = this.f27915b;
                String it = (String) obj;
                switch (i10) {
                    case 0:
                        int i11 = AddBankCardFragmentV2.f27826C0;
                        Intrinsics.checkNotNullParameter(it, "it");
                        PpButton ppButtonB = addBankCardFragmentV2.B();
                        if (ppButtonB != null) {
                            ppButtonB.b(false);
                        }
                        ToastUtils.showLong(it, new Object[0]);
                        break;
                    default:
                        int i12 = AddBankCardFragmentV2.f27826C0;
                        Intrinsics.checkNotNullParameter(it, "it");
                        PpButton ppButtonB2 = addBankCardFragmentV2.B();
                        if (ppButtonB2 != null) {
                            ppButtonB2.b(false);
                        }
                        ToastUtils.showLong(it, new Object[0]);
                        break;
                }
                return Unit.f38893a;
            }
        }, false, null, 240);
        AddBankCardViewModel addBankCardViewModel5 = (AddBankCardViewModel) this.f27333i;
        final int i11 = 2;
        n.B(this, addBankCardViewModel5 != null ? addBankCardViewModel5.f28209j : null, this, new Function2(this) { // from class: com.transsnet.palmpay.core.ui.fragment.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankCardFragmentV2 f27913b;

            {
                this.f27913b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                PaymentMethod paymentMethod = null;
                AddBankCardFragmentV2 addBankCardFragmentV2 = this.f27913b;
                switch (i11) {
                    case 0:
                        CheckCardBindNumReq checkCardBindNumReq = (CheckCardBindNumReq) obj;
                        CommonResult resp = (CommonResult) obj2;
                        int i12 = AddBankCardFragmentV2.f27826C0;
                        Intrinsics.checkNotNullParameter(resp, "resp");
                        PpButton ppButtonB = addBankCardFragmentV2.B();
                        if (ppButtonB != null) {
                            ppButtonB.b(false);
                        }
                        if (!resp.isSuccess()) {
                            addBankCardFragmentV2.p(resp.getRespMsg());
                        } else if (Intrinsics.c(checkCardBindNumReq != null ? checkCardBindNumReq.getCardNo() : null, addBankCardFragmentV2.y())) {
                            if (addBankCardFragmentV2.f27853x0) {
                                ARouter aRouter = ARouter.getInstance();
                                Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
                                Postcard postcardBuild = ARouter.getInstance().build("/account/authentication");
                                Intrinsics.checkNotNullExpressionValue(postcardBuild, "build(...)");
                                r0.x(aRouter, addBankCardFragmentV2, postcardBuild, 91);
                            } else if (addBankCardFragmentV2.f27854y0) {
                                addBankCardFragmentV2.D();
                            } else {
                                MessageEvent messageEvent = new MessageEvent(MessageEvent.EVENT_ADD_NEW_BANK_CARD, addBankCardFragmentV2.f27855z0);
                                PaymentMethod paymentMethod2 = new PaymentMethod();
                                paymentMethod2.payType = 2;
                                paymentMethod2.senderAccountType = 5;
                                paymentMethod2.reUseable = 0;
                                EditText editTextX = addBankCardFragmentV2.x();
                                paymentMethod2.cvv = String.valueOf(editTextX != null ? editTextX.getText() : null);
                                EditText editTextW = addBankCardFragmentV2.w();
                                paymentMethod2.cardPin = String.valueOf(editTextW != null ? editTextW.getText() : null);
                                paymentMethod2.expiryMonth = AddBankCardFragmentV2.A(addBankCardFragmentV2.f27844q0);
                                paymentMethod2.expiryYear = String.valueOf(addBankCardFragmentV2.f27843p0);
                                paymentMethod2.cardNo = addBankCardFragmentV2.y();
                                BankInfo bankInfo2 = addBankCardFragmentV2.f27846s0;
                                if (bankInfo2 != null) {
                                    paymentMethod2.bankCode = bankInfo2.bankCode;
                                    paymentMethod2.bankName = bankInfo2.bankName;
                                    paymentMethod2.bankUrl = bankInfo2.bankUrl;
                                }
                                messageEvent.setEventObj(paymentMethod2);
                                messageEvent.setEventContent(addBankCardFragmentV2.f27852w0);
                                org.greenrobot.eventbus.c.b().f(messageEvent);
                                addBankCardFragmentV2.requireActivity().finish();
                            }
                        }
                        break;
                    case 1:
                        CheckModifyBankCardReq checkModifyBankCardReq = (CheckModifyBankCardReq) obj;
                        CommonBeanResult resp2 = (CommonBeanResult) obj2;
                        int i13 = AddBankCardFragmentV2.f27826C0;
                        Intrinsics.checkNotNullParameter(resp2, "resp");
                        PpButton ppButtonB2 = addBankCardFragmentV2.B();
                        if (ppButtonB2 != null) {
                            ppButtonB2.b(false);
                        }
                        if (!resp2.isSuccess()) {
                            addBankCardFragmentV2.p(resp2.getRespMsg());
                        } else if (Intrinsics.c(checkModifyBankCardReq != null ? checkModifyBankCardReq.oldCardNo : null, addBankCardFragmentV2.y())) {
                            addBankCardFragmentV2.D();
                        }
                        break;
                    default:
                        PayByOrderReq payByOrderReq = (PayByOrderReq) obj;
                        PayByOrderResp resp3 = (PayByOrderResp) obj2;
                        int i14 = AddBankCardFragmentV2.f27826C0;
                        Intrinsics.checkNotNullParameter(resp3, "resp");
                        if (resp3.isSuccess()) {
                            PayByOrderResp.DataBean data = resp3.getData();
                            if (data != null) {
                                if (data.flag) {
                                    CheckPayReq checkPayReq = new CheckPayReq();
                                    checkPayReq.orderNo = data.orderNo;
                                    checkPayReq.orderType = payByOrderReq != null ? payByOrderReq.orderType : null;
                                    checkPayReq.payId = data.payId;
                                    checkPayReq.subPayId = data.subPayId;
                                    checkPayReq.verifyMethod = data.verifyMethod;
                                    checkPayReq.payRouteId = data.payRouteId;
                                    checkPayReq.url = data.url;
                                    checkPayReq.transType = TransType.TRANS_TYPE_BIND_BANK_CARD;
                                    checkPayReq.bankCardNo = addBankCardFragmentV2.y();
                                    checkPayReq.bankName = "";
                                    checkPayReq.payAmount = payByOrderReq != null ? payByOrderReq.amount : 0L;
                                    try {
                                        Long lI = C0525w.i(data.orderData, "payFee");
                                        Intrinsics.checkNotNullExpressionValue(lI, "getJsonLong(...)");
                                        checkPayReq.feeAmount = lI.longValue();
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                    }
                                    d0 d0Var = new d0(addBankCardFragmentV2.requireContext());
                                    d0Var.f27748b = checkPayReq;
                                    BankInfo bankInfo3 = addBankCardFragmentV2.f27846s0;
                                    if (bankInfo3 != null) {
                                        paymentMethod = new PaymentMethod();
                                        paymentMethod.bankCode = bankInfo3.bankCode;
                                        paymentMethod.bankName = bankInfo3.bankName;
                                        paymentMethod.bankUrl = bankInfo3.bankUrl;
                                        paymentMethod.countryCode = bankInfo3.countryCode;
                                        paymentMethod.payType = 2;
                                        paymentMethod.senderAccountType = 5;
                                        paymentMethod.cardNo = addBankCardFragmentV2.y();
                                    }
                                    d0Var.f27751e = paymentMethod;
                                    d0Var.f27749c = resp3;
                                    HashMap map = new HashMap();
                                    map.put("extra_type", String.valueOf(addBankCardFragmentV2.f27855z0));
                                    map.put("extra_entry_type", String.valueOf(addBankCardFragmentV2.f27828A0));
                                    d0Var.f27752f = map;
                                    d0Var.a();
                                } else if ("7".equals(payByOrderReq != null ? payByOrderReq.orderType : null)) {
                                    J j6 = new J();
                                    j6.f7022a = payByOrderReq.orderType;
                                    j6.f7023b = resp3.getData();
                                    j6.f7025d = TransType.TRANS_TYPE_BIND_BANK_CARD;
                                    j6.f7026e = payByOrderReq.amount;
                                    j6.f7024c = data.orderNo;
                                    j6.f7027f = "";
                                    Long l5 = addBankCardFragmentV2.f27855z0;
                                    j6.f7029h = l5 != null ? l5.longValue() : 0L;
                                    Long l6 = addBankCardFragmentV2.f27828A0;
                                    j6.f7030i = l6 != null ? l6.longValue() : 0L;
                                    K.a(j6);
                                }
                            }
                        } else {
                            String respCode = resp3.getRespCode();
                            if (Intrinsics.c(respCode, "33000039") || Intrinsics.c(respCode, "33000040") || Intrinsics.c(respCode, "33000041") || Intrinsics.c(respCode, "33000093")) {
                                i0.i0(addBankCardFragmentV2.requireContext(), resp3.getRespCode(), resp3.getRespMsg(), true);
                            } else if ("CFRONT_700007".equalsIgnoreCase(resp3.getRespCode()) || "CFRONT_700002".equalsIgnoreCase(resp3.getRespCode()) || "CFRONT_700003".equalsIgnoreCase(resp3.getRespCode())) {
                                ToastUtils.showLong(resp3.getRespMsg(), new Object[0]);
                            } else {
                                addBankCardFragmentV2.p(resp3.getRespMsg());
                            }
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new com.facebook.react.packagerconnection.a(10), false, null, 240);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        AddBankCardViewModel addBankCardViewModel = (AddBankCardViewModel) this.f27333i;
        if (addBankCardViewModel != null) {
            p140j8.f.s(addBankCardViewModel, new C0626g(this.f27855z0, null), addBankCardViewModel.f28205e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        ARouter.getInstance().inject(this);
        org.greenrobot.eventbus.c.b().j(this);
        EditText editTextV = v();
        if (editTextV != null) {
            editTextV.setHint(G.i("").append(getString(L9.c.cm_enter_16_19_digits_number)).setFontFamily("sans-serif").create());
        }
        TextView textViewC = C();
        if (textViewC != null) {
            textViewC.setHint(G.i("").append(getString(L9.c.cm_mm_yy)).setFontFamily("sans-serif").create());
        }
        EditText editTextX = x();
        if (editTextX != null) {
            editTextX.setHint(new SpanUtils().append("").append("Enter CVV").setFontFamily("sans-serif").create());
        }
        EditText editTextW = w();
        if (editTextW != null) {
            editTextW.setHint(new SpanUtils().append("").append("Enter Card Pin").setFontFamily("sans-serif").create());
        }
        EditText editTextV2 = v();
        if (editTextV2 != null) {
            p220oa.h.r(editTextV2, new g(this, 2), null);
        }
        EditText editTextW2 = w();
        if (editTextW2 != null) {
            editTextW2.addTextChangedListener(new g(this, 0));
        }
        EditText editTextX2 = x();
        if (editTextX2 != null) {
            editTextX2.addTextChangedListener(new g(this, 1));
        }
        TextView textView = (TextView) this.f27836X.getValue();
        if (textView != null) {
            textView.setOnClickListener(new b(this, 4));
        }
        TextView textViewC2 = C();
        if (textViewC2 != null) {
            textViewC2.setOnClickListener(new b(this, 5));
        }
        IconicsImageView iconicsImageView = (IconicsImageView) this.t.getValue();
        if (iconicsImageView != null) {
            iconicsImageView.setOnClickListener(new b(this, 1));
        }
        TextView textView2 = (TextView) this.f27831C.getValue();
        if (textView2 != null) {
            textView2.setOnClickListener(new b(this, 2));
        }
        TextView textView3 = (TextView) this.f27851w.getValue();
        if (textView3 != null) {
            textView3.setOnClickListener(new ViewOnClickListenerC1478l(5));
        }
        PpButton ppButtonB = B();
        if (ppButtonB != null) {
            ppButtonB.setOnClickListener(new b(this, 3));
        }
        TextView textView4 = (TextView) this.f27841o.getValue();
        if (textView4 != null) {
            textView4.setVisibility(this.f27854y0 ? 0 : 4);
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AddBankCardAccountActivity.BackPressedListener
    public final void onBackPressed() {
        n0.g().q(new ClickEvent("addnewcardPagebackClick"));
        Long l5 = this.f27855z0;
        if (l5 != null) {
            if (l5.longValue() != 1) {
                l5 = null;
            }
            if (l5 != null) {
                org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_OC_BIND_CARD_EXIT, String.valueOf(l5.longValue())));
            }
        }
        requireActivity().finish();
    }

    @Override // com.transsnet.palmpay.core.dialog.MonthPickDialog.CallBack
    public final void onConfirmClick() {
        t tVar = this.f27838Z;
        String nowPickDate = ((MonthPickDialog) tVar.getValue()).getNowPickDate();
        this.f27843p0 = ((MonthPickDialog) tVar.getValue()).getNowPickYear();
        this.f27844q0 = ((MonthPickDialog) tVar.getValue()).getNowPickMonth();
        TextView textViewC = C();
        if (textViewC != null) {
            textViewC.setText(nowPickDate);
        }
        boolean zCheckDateBeforeNow = TimeUtils.checkDateBeforeNow(this.f27843p0, this.f27844q0);
        t tVar2 = this.f27832H;
        if (zCheckDateBeforeNow) {
            E((ModelErrorDivider) tVar2.getValue(), getString(k.core_invalid_date));
        } else {
            E((ModelErrorDivider) tVar2.getValue(), "");
        }
        G();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Editable text;
        super.onDestroyView();
        try {
            EditText editTextV = v();
            if (editTextV != null && (text = editTextV.getText()) != null && text.length() <= 0) {
                return;
            }
            C0525w c0525wF = C0525w.f();
            PayByOrderReq payByOrderReq = new PayByOrderReq();
            EditText editTextX = x();
            payByOrderReq.payerCardCvv = StringsKt.V(String.valueOf(editTextX != null ? editTextX.getText() : null)).toString();
            payByOrderReq.payerCardExpiryMon = String.valueOf(this.f27844q0);
            payByOrderReq.payerCardExpiryYear = String.valueOf(this.f27843p0);
            EditText editTextV2 = v();
            payByOrderReq.payerCardNo = String.valueOf(editTextV2 != null ? editTextV2.getText() : null);
            BankInfo bankInfo = this.f27846s0;
            if (bankInfo != null) {
                payByOrderReq.payerBankCode = bankInfo.bankCode;
                payByOrderReq.bankName = bankInfo.bankName;
                payByOrderReq.bankUrl = bankInfo.bankUrl;
            }
            SPUtils.getInstance("draft_record").put("_key_bank_draft", ((Gson) c0525wF.f7166b).toJson(payByOrderReq));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int eventType = event.getEventType();
        if (eventType == 275 || eventType == 282) {
            SPUtils.getInstance("draft_record").remove("_key_bank_draft");
            EditText editTextV = v();
            if (editTextV != null) {
                editTextV.setText("");
            }
            EditText editTextX = x();
            if (editTextX != null) {
                editTextX.setText("");
            }
            EditText editTextW = w();
            if (editTextW != null) {
                editTextW.setText("");
            }
            this.f27843p0 = 0;
            this.f27844q0 = 0;
            this.f27846s0 = null;
            TextView textViewC = C();
            if (textViewC != null) {
                textViewC.setText("");
            }
            G();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable MessageEvent messageEvent) {
        if (messageEvent == null) {
            return;
        }
        if (messageEvent.getEventType() == 7 || messageEvent.getEventType() == 6) {
            requireActivity().finish();
        }
        if (messageEvent.getEventType() == 520) {
            F();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f27850v0 == null) {
            F();
        }
    }

    public final void t() {
        PpButton ppButtonB = B();
        if (ppButtonB != null) {
            ppButtonB.b(true);
        }
        if (this.f27850v0 != null) {
            AddBankCardViewModel addBankCardViewModel = (AddBankCardViewModel) this.f27333i;
            if (addBankCardViewModel != null) {
                CheckModifyBankCardReq checkModifyBankCardReq = new CheckModifyBankCardReq();
                BankInfo bankInfo = this.f27846s0;
                checkModifyBankCardReq.bankCode = bankInfo != null ? bankInfo.bankCode : null;
                checkModifyBankCardReq.oldCardNo = y();
                C0621d c0621d = new C0621d(checkModifyBankCardReq, null);
                l lVar = addBankCardViewModel.f28210o;
                lVar.f27356m = checkModifyBankCardReq;
                Unit unit = Unit.f38893a;
                p140j8.f.v(addBankCardViewModel, c0621d, lVar, 0L);
                return;
            }
            return;
        }
        AddBankCardViewModel addBankCardViewModel2 = (AddBankCardViewModel) this.f27333i;
        if (addBankCardViewModel2 != null) {
            CheckCardBindNumReq req = new CheckCardBindNumReq();
            BankInfo bankInfo2 = this.f27846s0;
            req.setBankCode(bankInfo2 != null ? bankInfo2.bankCode : null);
            req.setCardNo(y());
            Intrinsics.checkNotNullParameter(req, "req");
            C0619c c0619c = new C0619c(req, null);
            l lVar2 = addBankCardViewModel2.f28208i;
            lVar2.f27356m = req;
            Unit unit2 = Unit.f38893a;
            p140j8.f.v(addBankCardViewModel2, c0619c, lVar2, 0L);
        }
    }

    public final boolean u() {
        t0 t0Var;
        t0 t0Var2;
        t0 t0Var3;
        int iS;
        EditText editTextX;
        t tVar;
        Editable text;
        String strY = y();
        if (((!TextUtils.isEmpty(strY) && strY.startsWith(TransType.TRANS_TYPE_EX_GRATIA_REFUND)) ? (char) 15 : (char) 16) == 15) {
            if (strY.length() != 15) {
                EditText editTextV = v();
                if (editTextV != null) {
                    editTextV.setError(getString(k.core_msg_invalid_bank_card_no_15_digit));
                    return false;
                }
                return false;
            }
            iS = i0.s(strY);
            editTextX = x();
            tVar = this.f27827A;
            if (editTextX != null || (text = editTextX.getText()) == null || iS != text.length()) {
                E((ModelErrorDivider) tVar.getValue(), getString(k.core_msg_invalid_cvv, Integer.valueOf(iS)));
                return false;
            }
            E((ModelErrorDivider) tVar.getValue(), "");
            boolean zCheckDateBeforeNow = TimeUtils.checkDateBeforeNow(this.f27843p0, this.f27844q0);
            t tVar2 = this.f27832H;
            if (zCheckDateBeforeNow) {
                E((ModelErrorDivider) tVar2.getValue(), getString(k.core_invalid_date));
                return false;
            }
            E((ModelErrorDivider) tVar2.getValue(), "");
            EditText editTextW = w();
            int length = String.valueOf(editTextW != null ? editTextW.getText() : null).length();
            t tVar3 = this.f27842p;
            if (length < 4) {
                E((ModelErrorDivider) tVar3.getValue(), "Enter 4-digit Card Pin");
                return false;
            }
            E((ModelErrorDivider) tVar3.getValue(), "");
            return true;
        }
        if (!r0.a1(strY)) {
            E(z(), getString(k.core_msg_invalid_bank_card_no));
            return false;
        }
        if (this.f27846s0 != null) {
            E(z(), "");
            iS = i0.s(strY);
            editTextX = x();
            tVar = this.f27827A;
            if (editTextX != null) {
            }
            E((ModelErrorDivider) tVar.getValue(), getString(k.core_msg_invalid_cvv, Integer.valueOf(iS)));
            return false;
        }
        String cardNo = y();
        if (cardNo.length() >= 16) {
            this.f27846s0 = null;
            PpButton ppButtonB = B();
            if (ppButtonB != null) {
                ppButtonB.b(true);
            }
            AddBankCardViewModel addBankCardViewModel = (AddBankCardViewModel) this.f27333i;
            if (addBankCardViewModel != null) {
                Intrinsics.checkNotNullParameter(cardNo, "cardNo");
                t0 t0Var4 = addBankCardViewModel.f28207g;
                if (t0Var4 != null && t0Var4.isActive() && (t0Var = addBankCardViewModel.f28207g) != null && !t0Var.isCancelled() && (t0Var2 = addBankCardViewModel.f28207g) != null && !t0Var2.isCompleted() && (t0Var3 = addBankCardViewModel.f28207g) != null) {
                    t0Var3.cancel((CancellationException) null);
                }
                addBankCardViewModel.f28207g = p140j8.f.s(addBankCardViewModel, new C0625f(cardNo, null), addBankCardViewModel.f28206f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            }
        }
        return false;
    }

    public final EditText v() {
        return (EditText) this.f27835Q.getValue();
    }

    public final EditText w() {
        return (EditText) this.f27849v.getValue();
    }

    public final EditText x() {
        return (EditText) this.f27829B.getValue();
    }

    public final String y() {
        Editable text;
        String string;
        String strK;
        EditText editTextV = v();
        return (editTextV == null || (text = editTextV.getText()) == null || (string = text.toString()) == null || (strK = y.k(string, " ", "")) == null) ? "" : strK;
    }

    public final ModelErrorDivider z() {
        return (ModelErrorDivider) this.f27834M.getValue();
    }
}
