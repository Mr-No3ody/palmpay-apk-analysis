package com.transsnet.palmpay.core.ui.activity;

import Pa.C0525w;
import Pa.i0;
import Pa.r0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.uimanager.ViewProps;
import com.google.gson.Gson;
import com.google.maps.android.BuildConfig;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.payment.CheckPayReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.bean.req.CheckBankCardInfoReq;
import com.transsnet.palmpay.core.bean.req.CheckCardBindNumReq;
import com.transsnet.palmpay.core.bean.req.QueryBankListReq;
import com.transsnet.palmpay.core.bean.rsp.CardNoBankInfoRsp;
import com.transsnet.palmpay.core.bean.rsp.CheckBankCardInfoRsp;
import com.transsnet.palmpay.core.dialog.MonthPickDialog;
import com.transsnet.palmpay.core.dialog.SelectBankDialog;
import com.transsnet.palmpay.core.ui.mvp.contract.AddNewCardContract$IView;
import com.transsnet.palmpay.core.viewmodel.ModelBankCardItem1;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.TimeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/coreImpl/use_new_card")
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u0011\u0012B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/core/ui/activity/AddNewCardWithPaymentActivity;", "Lcom/transsnet/palmpay/core/base/i;", "LLa/l;", "Lcom/transsnet/palmpay/core/ui/mvp/contract/AddNewCardContract$IView;", "Lcom/transsnet/palmpay/core/dialog/MonthPickDialog$CallBack;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/View;", "v", "", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "messageEvent", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "CheckCvvDialog", "a", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AddNewCardWithPaymentActivity extends com.transsnet.palmpay.core.base.i implements AddNewCardContract$IView, MonthPickDialog.CallBack, View.OnClickListener {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ int f27421r0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f27422A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f27423B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public BankInfo f27424C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public List f27425H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public PayByOrderReq f27426L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final String f27427M = "draft_record";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final String f27428Q = "_key_bank_draft";

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public String f27429X = "";

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public O6.d f27430Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public O6.c f27431Z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p355xf.t f27432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p355xf.t f27433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p355xf.t f27434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p355xf.t f27435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p355xf.t f27436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p355xf.t f27437g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p355xf.t f27438i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p355xf.t f27439j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f27440k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p355xf.t f27441o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p355xf.t f27442p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f27443p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f27444q0;
    public final p355xf.t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SelectBankDialog f27445v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public MonthPickDialog f27446w;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/core/ui/activity/AddNewCardWithPaymentActivity$CheckCvvDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Lcom/transsnet/palmpay/core/ui/activity/AddNewCardWithPaymentActivity;Landroid/content/Context;)V", "", "initViews", "()V", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class CheckCvvDialog extends com.transsnet.palmpay.custom_view.dialog.b {
        public CheckCvvDialog(Context context) {
            super(context, p025ba.g.core_layout_how_to_get_cvv);
        }

        @Override // com.transsnet.palmpay.custom_view.dialog.b
        public void initViews() {
            View viewFindViewById = findViewById(p025ba.e.tvOk);
            if (viewFindViewById != null) {
                viewFindViewById.setOnClickListener(new Yd.i(this, 21));
            }
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startActivity(@NotNull Context context, @Nullable PayByOrderReq payByOrderReq) {
            context.startActivity(C0.G.e(context, "context", context, AddNewCardWithPaymentActivity.class).putExtra("pay_content", payByOrderReq));
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public AddNewCardWithPaymentActivity() {
        final int i7 = 0;
        this.f27432b = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNewCardWithPaymentActivity f27761b;

            {
                this.f27761b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddNewCardWithPaymentActivity addNewCardWithPaymentActivity = this.f27761b;
                switch (i7) {
                    case 0:
                        int i10 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.select_other_method_tv);
                    case 1:
                        int i11 = AddNewCardWithPaymentActivity.f27421r0;
                        return (EditText) addNewCardWithPaymentActivity.findViewById(L9.a.card_num_et);
                    case 2:
                        int i12 = AddNewCardWithPaymentActivity.f27421r0;
                        return (PpTitleBar) addNewCardWithPaymentActivity.findViewById(L9.a.titleBar);
                    case 3:
                        int i13 = AddNewCardWithPaymentActivity.f27421r0;
                        return (Button) addNewCardWithPaymentActivity.findViewById(L9.a.next_bt);
                    case 4:
                        int i14 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError3);
                    case 5:
                        int i15 = AddNewCardWithPaymentActivity.f27421r0;
                        return (EditText) addNewCardWithPaymentActivity.findViewById(L9.a.cvv_et);
                    case 6:
                        int i16 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvCvvTitle);
                    case 7:
                        int i17 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError2);
                    case 8:
                        int i18 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.valid_date_tv);
                    case 9:
                        int i19 = AddNewCardWithPaymentActivity.f27421r0;
                        return (ModelBankCardItem1) addNewCardWithPaymentActivity.findViewById(L9.a.bank_name_tv);
                    default:
                        int i20 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError1);
                }
            }
        });
        final int i10 = 3;
        this.f27433c = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNewCardWithPaymentActivity f27761b;

            {
                this.f27761b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddNewCardWithPaymentActivity addNewCardWithPaymentActivity = this.f27761b;
                switch (i10) {
                    case 0:
                        int i11 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.select_other_method_tv);
                    case 1:
                        int i12 = AddNewCardWithPaymentActivity.f27421r0;
                        return (EditText) addNewCardWithPaymentActivity.findViewById(L9.a.card_num_et);
                    case 2:
                        int i13 = AddNewCardWithPaymentActivity.f27421r0;
                        return (PpTitleBar) addNewCardWithPaymentActivity.findViewById(L9.a.titleBar);
                    case 3:
                        int i14 = AddNewCardWithPaymentActivity.f27421r0;
                        return (Button) addNewCardWithPaymentActivity.findViewById(L9.a.next_bt);
                    case 4:
                        int i15 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError3);
                    case 5:
                        int i16 = AddNewCardWithPaymentActivity.f27421r0;
                        return (EditText) addNewCardWithPaymentActivity.findViewById(L9.a.cvv_et);
                    case 6:
                        int i17 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvCvvTitle);
                    case 7:
                        int i18 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError2);
                    case 8:
                        int i19 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.valid_date_tv);
                    case 9:
                        int i110 = AddNewCardWithPaymentActivity.f27421r0;
                        return (ModelBankCardItem1) addNewCardWithPaymentActivity.findViewById(L9.a.bank_name_tv);
                    default:
                        int i20 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError1);
                }
            }
        });
        final int i11 = 4;
        this.f27434d = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNewCardWithPaymentActivity f27761b;

            {
                this.f27761b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddNewCardWithPaymentActivity addNewCardWithPaymentActivity = this.f27761b;
                switch (i11) {
                    case 0:
                        int i12 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.select_other_method_tv);
                    case 1:
                        int i13 = AddNewCardWithPaymentActivity.f27421r0;
                        return (EditText) addNewCardWithPaymentActivity.findViewById(L9.a.card_num_et);
                    case 2:
                        int i14 = AddNewCardWithPaymentActivity.f27421r0;
                        return (PpTitleBar) addNewCardWithPaymentActivity.findViewById(L9.a.titleBar);
                    case 3:
                        int i15 = AddNewCardWithPaymentActivity.f27421r0;
                        return (Button) addNewCardWithPaymentActivity.findViewById(L9.a.next_bt);
                    case 4:
                        int i16 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError3);
                    case 5:
                        int i17 = AddNewCardWithPaymentActivity.f27421r0;
                        return (EditText) addNewCardWithPaymentActivity.findViewById(L9.a.cvv_et);
                    case 6:
                        int i18 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvCvvTitle);
                    case 7:
                        int i19 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError2);
                    case 8:
                        int i110 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.valid_date_tv);
                    case 9:
                        int i111 = AddNewCardWithPaymentActivity.f27421r0;
                        return (ModelBankCardItem1) addNewCardWithPaymentActivity.findViewById(L9.a.bank_name_tv);
                    default:
                        int i20 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError1);
                }
            }
        });
        final int i12 = 5;
        this.f27435e = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNewCardWithPaymentActivity f27761b;

            {
                this.f27761b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddNewCardWithPaymentActivity addNewCardWithPaymentActivity = this.f27761b;
                switch (i12) {
                    case 0:
                        int i13 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.select_other_method_tv);
                    case 1:
                        int i14 = AddNewCardWithPaymentActivity.f27421r0;
                        return (EditText) addNewCardWithPaymentActivity.findViewById(L9.a.card_num_et);
                    case 2:
                        int i15 = AddNewCardWithPaymentActivity.f27421r0;
                        return (PpTitleBar) addNewCardWithPaymentActivity.findViewById(L9.a.titleBar);
                    case 3:
                        int i16 = AddNewCardWithPaymentActivity.f27421r0;
                        return (Button) addNewCardWithPaymentActivity.findViewById(L9.a.next_bt);
                    case 4:
                        int i17 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError3);
                    case 5:
                        int i18 = AddNewCardWithPaymentActivity.f27421r0;
                        return (EditText) addNewCardWithPaymentActivity.findViewById(L9.a.cvv_et);
                    case 6:
                        int i19 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvCvvTitle);
                    case 7:
                        int i110 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError2);
                    case 8:
                        int i111 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.valid_date_tv);
                    case 9:
                        int i112 = AddNewCardWithPaymentActivity.f27421r0;
                        return (ModelBankCardItem1) addNewCardWithPaymentActivity.findViewById(L9.a.bank_name_tv);
                    default:
                        int i20 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError1);
                }
            }
        });
        final int i13 = 6;
        this.f27436f = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNewCardWithPaymentActivity f27761b;

            {
                this.f27761b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddNewCardWithPaymentActivity addNewCardWithPaymentActivity = this.f27761b;
                switch (i13) {
                    case 0:
                        int i14 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.select_other_method_tv);
                    case 1:
                        int i15 = AddNewCardWithPaymentActivity.f27421r0;
                        return (EditText) addNewCardWithPaymentActivity.findViewById(L9.a.card_num_et);
                    case 2:
                        int i16 = AddNewCardWithPaymentActivity.f27421r0;
                        return (PpTitleBar) addNewCardWithPaymentActivity.findViewById(L9.a.titleBar);
                    case 3:
                        int i17 = AddNewCardWithPaymentActivity.f27421r0;
                        return (Button) addNewCardWithPaymentActivity.findViewById(L9.a.next_bt);
                    case 4:
                        int i18 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError3);
                    case 5:
                        int i19 = AddNewCardWithPaymentActivity.f27421r0;
                        return (EditText) addNewCardWithPaymentActivity.findViewById(L9.a.cvv_et);
                    case 6:
                        int i110 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvCvvTitle);
                    case 7:
                        int i111 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError2);
                    case 8:
                        int i112 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.valid_date_tv);
                    case 9:
                        int i113 = AddNewCardWithPaymentActivity.f27421r0;
                        return (ModelBankCardItem1) addNewCardWithPaymentActivity.findViewById(L9.a.bank_name_tv);
                    default:
                        int i20 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError1);
                }
            }
        });
        final int i14 = 7;
        this.f27437g = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNewCardWithPaymentActivity f27761b;

            {
                this.f27761b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddNewCardWithPaymentActivity addNewCardWithPaymentActivity = this.f27761b;
                switch (i14) {
                    case 0:
                        int i15 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.select_other_method_tv);
                    case 1:
                        int i16 = AddNewCardWithPaymentActivity.f27421r0;
                        return (EditText) addNewCardWithPaymentActivity.findViewById(L9.a.card_num_et);
                    case 2:
                        int i17 = AddNewCardWithPaymentActivity.f27421r0;
                        return (PpTitleBar) addNewCardWithPaymentActivity.findViewById(L9.a.titleBar);
                    case 3:
                        int i18 = AddNewCardWithPaymentActivity.f27421r0;
                        return (Button) addNewCardWithPaymentActivity.findViewById(L9.a.next_bt);
                    case 4:
                        int i19 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError3);
                    case 5:
                        int i110 = AddNewCardWithPaymentActivity.f27421r0;
                        return (EditText) addNewCardWithPaymentActivity.findViewById(L9.a.cvv_et);
                    case 6:
                        int i111 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvCvvTitle);
                    case 7:
                        int i112 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError2);
                    case 8:
                        int i113 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.valid_date_tv);
                    case 9:
                        int i114 = AddNewCardWithPaymentActivity.f27421r0;
                        return (ModelBankCardItem1) addNewCardWithPaymentActivity.findViewById(L9.a.bank_name_tv);
                    default:
                        int i20 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError1);
                }
            }
        });
        final int i15 = 8;
        this.f27438i = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNewCardWithPaymentActivity f27761b;

            {
                this.f27761b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddNewCardWithPaymentActivity addNewCardWithPaymentActivity = this.f27761b;
                switch (i15) {
                    case 0:
                        int i16 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.select_other_method_tv);
                    case 1:
                        int i17 = AddNewCardWithPaymentActivity.f27421r0;
                        return (EditText) addNewCardWithPaymentActivity.findViewById(L9.a.card_num_et);
                    case 2:
                        int i18 = AddNewCardWithPaymentActivity.f27421r0;
                        return (PpTitleBar) addNewCardWithPaymentActivity.findViewById(L9.a.titleBar);
                    case 3:
                        int i19 = AddNewCardWithPaymentActivity.f27421r0;
                        return (Button) addNewCardWithPaymentActivity.findViewById(L9.a.next_bt);
                    case 4:
                        int i110 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError3);
                    case 5:
                        int i111 = AddNewCardWithPaymentActivity.f27421r0;
                        return (EditText) addNewCardWithPaymentActivity.findViewById(L9.a.cvv_et);
                    case 6:
                        int i112 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvCvvTitle);
                    case 7:
                        int i113 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError2);
                    case 8:
                        int i114 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.valid_date_tv);
                    case 9:
                        int i115 = AddNewCardWithPaymentActivity.f27421r0;
                        return (ModelBankCardItem1) addNewCardWithPaymentActivity.findViewById(L9.a.bank_name_tv);
                    default:
                        int i20 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError1);
                }
            }
        });
        final int i16 = 9;
        this.f27439j = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNewCardWithPaymentActivity f27761b;

            {
                this.f27761b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddNewCardWithPaymentActivity addNewCardWithPaymentActivity = this.f27761b;
                switch (i16) {
                    case 0:
                        int i17 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.select_other_method_tv);
                    case 1:
                        int i18 = AddNewCardWithPaymentActivity.f27421r0;
                        return (EditText) addNewCardWithPaymentActivity.findViewById(L9.a.card_num_et);
                    case 2:
                        int i19 = AddNewCardWithPaymentActivity.f27421r0;
                        return (PpTitleBar) addNewCardWithPaymentActivity.findViewById(L9.a.titleBar);
                    case 3:
                        int i110 = AddNewCardWithPaymentActivity.f27421r0;
                        return (Button) addNewCardWithPaymentActivity.findViewById(L9.a.next_bt);
                    case 4:
                        int i111 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError3);
                    case 5:
                        int i112 = AddNewCardWithPaymentActivity.f27421r0;
                        return (EditText) addNewCardWithPaymentActivity.findViewById(L9.a.cvv_et);
                    case 6:
                        int i113 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvCvvTitle);
                    case 7:
                        int i114 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError2);
                    case 8:
                        int i115 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.valid_date_tv);
                    case 9:
                        int i116 = AddNewCardWithPaymentActivity.f27421r0;
                        return (ModelBankCardItem1) addNewCardWithPaymentActivity.findViewById(L9.a.bank_name_tv);
                    default:
                        int i20 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError1);
                }
            }
        });
        final int i17 = 10;
        this.f27441o = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNewCardWithPaymentActivity f27761b;

            {
                this.f27761b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddNewCardWithPaymentActivity addNewCardWithPaymentActivity = this.f27761b;
                switch (i17) {
                    case 0:
                        int i18 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.select_other_method_tv);
                    case 1:
                        int i19 = AddNewCardWithPaymentActivity.f27421r0;
                        return (EditText) addNewCardWithPaymentActivity.findViewById(L9.a.card_num_et);
                    case 2:
                        int i110 = AddNewCardWithPaymentActivity.f27421r0;
                        return (PpTitleBar) addNewCardWithPaymentActivity.findViewById(L9.a.titleBar);
                    case 3:
                        int i111 = AddNewCardWithPaymentActivity.f27421r0;
                        return (Button) addNewCardWithPaymentActivity.findViewById(L9.a.next_bt);
                    case 4:
                        int i112 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError3);
                    case 5:
                        int i113 = AddNewCardWithPaymentActivity.f27421r0;
                        return (EditText) addNewCardWithPaymentActivity.findViewById(L9.a.cvv_et);
                    case 6:
                        int i114 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvCvvTitle);
                    case 7:
                        int i115 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError2);
                    case 8:
                        int i116 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.valid_date_tv);
                    case 9:
                        int i117 = AddNewCardWithPaymentActivity.f27421r0;
                        return (ModelBankCardItem1) addNewCardWithPaymentActivity.findViewById(L9.a.bank_name_tv);
                    default:
                        int i20 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError1);
                }
            }
        });
        final int i18 = 1;
        this.f27442p = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNewCardWithPaymentActivity f27761b;

            {
                this.f27761b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddNewCardWithPaymentActivity addNewCardWithPaymentActivity = this.f27761b;
                switch (i18) {
                    case 0:
                        int i19 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.select_other_method_tv);
                    case 1:
                        int i110 = AddNewCardWithPaymentActivity.f27421r0;
                        return (EditText) addNewCardWithPaymentActivity.findViewById(L9.a.card_num_et);
                    case 2:
                        int i111 = AddNewCardWithPaymentActivity.f27421r0;
                        return (PpTitleBar) addNewCardWithPaymentActivity.findViewById(L9.a.titleBar);
                    case 3:
                        int i112 = AddNewCardWithPaymentActivity.f27421r0;
                        return (Button) addNewCardWithPaymentActivity.findViewById(L9.a.next_bt);
                    case 4:
                        int i113 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError3);
                    case 5:
                        int i114 = AddNewCardWithPaymentActivity.f27421r0;
                        return (EditText) addNewCardWithPaymentActivity.findViewById(L9.a.cvv_et);
                    case 6:
                        int i115 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvCvvTitle);
                    case 7:
                        int i116 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError2);
                    case 8:
                        int i117 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.valid_date_tv);
                    case 9:
                        int i118 = AddNewCardWithPaymentActivity.f27421r0;
                        return (ModelBankCardItem1) addNewCardWithPaymentActivity.findViewById(L9.a.bank_name_tv);
                    default:
                        int i20 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError1);
                }
            }
        });
        final int i19 = 2;
        this.t = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNewCardWithPaymentActivity f27761b;

            {
                this.f27761b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddNewCardWithPaymentActivity addNewCardWithPaymentActivity = this.f27761b;
                switch (i19) {
                    case 0:
                        int i110 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.select_other_method_tv);
                    case 1:
                        int i111 = AddNewCardWithPaymentActivity.f27421r0;
                        return (EditText) addNewCardWithPaymentActivity.findViewById(L9.a.card_num_et);
                    case 2:
                        int i112 = AddNewCardWithPaymentActivity.f27421r0;
                        return (PpTitleBar) addNewCardWithPaymentActivity.findViewById(L9.a.titleBar);
                    case 3:
                        int i113 = AddNewCardWithPaymentActivity.f27421r0;
                        return (Button) addNewCardWithPaymentActivity.findViewById(L9.a.next_bt);
                    case 4:
                        int i114 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError3);
                    case 5:
                        int i115 = AddNewCardWithPaymentActivity.f27421r0;
                        return (EditText) addNewCardWithPaymentActivity.findViewById(L9.a.cvv_et);
                    case 6:
                        int i116 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvCvvTitle);
                    case 7:
                        int i117 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError2);
                    case 8:
                        int i118 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.valid_date_tv);
                    case 9:
                        int i119 = AddNewCardWithPaymentActivity.f27421r0;
                        return (ModelBankCardItem1) addNewCardWithPaymentActivity.findViewById(L9.a.bank_name_tv);
                    default:
                        int i20 = AddNewCardWithPaymentActivity.f27421r0;
                        return (TextView) addNewCardWithPaymentActivity.findViewById(L9.a.tvError1);
                }
            }
        });
    }

    public static final boolean m(AddNewCardWithPaymentActivity addNewCardWithPaymentActivity, String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return true;
        }
        return !TextUtils.isEmpty(str) && Intrinsics.c(str, str2);
    }

    public static void u(TextView textView, String str) {
        if (TextUtils.isEmpty(str)) {
            p220oa.h.s(textView, false);
        } else {
            p220oa.h.s(textView, true);
            textView.setText(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddNewCardContract$IView
    public final void getBindBankCardTips(CommonBeanResult commonBeanResult) {
        T data;
        if (commonBeanResult == null || !commonBeanResult.isSuccess() || (data = commonBeanResult.data) == 0) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(data, "data");
        this.f27429X = (String) data;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return L9.b.core_activity_use_new_card;
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.BasePaymentContract.IView
    public final void handleBankList(List bankInfos) {
        SelectBankDialog selectBankDialog;
        Intrinsics.checkNotNullParameter(bankInfos, "bankInfos");
        this.f27425H = bankInfos;
        SelectBankDialog selectBankDialog2 = this.f27445v;
        if (selectBankDialog2 == null || !selectBankDialog2.isShowing() || (selectBankDialog = this.f27445v) == null) {
            return;
        }
        selectBankDialog.setBankCardInfos(this.f27425H);
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddNewCardContract$IView
    public final void handleCheckCardBindNum(CommonResult response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!response.isSuccess()) {
            String respMsg = response.getRespMsg();
            Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
            t(respMsg);
            return;
        }
        PayByOrderReq payByOrderReq = this.f27426L;
        if (!"7".equals(payByOrderReq != null ? payByOrderReq.orderType : null)) {
            o();
            return;
        }
        if (i0.W(this)) {
            String string = this.f27429X;
            if (string == null) {
                string = getString(p025ba.k.core_msg_add_credit_repay_card);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
            this.f27429X = string;
            O6.c cVar = new O6.c(this);
            cVar.e(p025ba.k.core_title_attention);
            cVar.f6598d = this.f27429X;
            cVar.d(p025ba.k.core_confirm, new ViewOnClickListenerC1472f(this, 0));
            cVar.c(p025ba.k.core_cancel, null);
            O6.d dVarA = cVar.a();
            dVarA.setCanceledOnTouchOutside(false);
            dVarA.show();
        }
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddNewCardContract$IView
    public final void handleCheckInputBankCardInfoRsp(CheckBankCardInfoReq req, CheckBankCardInfoRsp rsp) {
        Intrinsics.checkNotNullParameter(req, "req");
        Intrinsics.checkNotNullParameter(rsp, "rsp");
        if (!rsp.isSuccess()) {
            String respMsg = rsp.getRespMsg();
            Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
            t(respMsg);
            return;
        }
        CheckBankCardInfoRsp.Data data = rsp.data;
        if (data == null) {
            n();
            return;
        }
        if (Intrinsics.c(req.bankCode, data.bankCode)) {
            n();
            return;
        }
        O6.c cVar = new O6.c(this);
        cVar.e(p025ba.k.core_title_attention);
        cVar.f6605k = true;
        cVar.b(p025ba.k.core_msg_wrong_bank_selected);
        cVar.d(p025ba.k.core_yes, new p010a9.b(11, this, rsp));
        cVar.c(p025ba.k.core_no, null);
        cVar.g();
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddNewCardContract$IView
    public final void handleGetBankInfoByCardNoRsp(CardNoBankInfoRsp cardNoBankInfoRsp) {
        if (cardNoBankInfoRsp == null || !cardNoBankInfoRsp.isSuccess() || cardNoBankInfoRsp.getData() == null) {
            return;
        }
        this.f27424C = cardNoBankInfoRsp.getData();
        ModelBankCardItem1 modelBankCardItem1P = p();
        if (modelBankCardItem1P != null) {
            modelBankCardItem1P.setBankInfo(this.f27424C);
        }
        v();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        org.greenrobot.eventbus.c.b().j(this);
        this.f27425H = new ArrayList();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new La.l();
    }

    public final void n() {
        showLoadingDialog(true);
        CheckCardBindNumReq checkCardBindNumReq = new CheckCardBindNumReq();
        BankInfo bankInfo = this.f27424C;
        checkCardBindNumReq.setBankCode(bankInfo != null ? bankInfo.bankCode : null);
        checkCardBindNumReq.setCardNo(s());
        La.l lVar = (La.l) this.f27350a;
        if (lVar != null) {
            lVar.checkCardBindNum(checkCardBindNumReq);
        }
    }

    public final void o() {
        PayByOrderReq payByOrderReq = this.f27426L;
        if (payByOrderReq != null) {
            payByOrderReq.payType = 2;
        }
        if (payByOrderReq != null) {
            payByOrderReq.reUseable = 0;
        }
        if (payByOrderReq != null) {
            payByOrderReq.payerCardCvv = r().getText().toString();
        }
        PayByOrderReq payByOrderReq2 = this.f27426L;
        if (payByOrderReq2 != null) {
            int i7 = this.f27423B;
            payByOrderReq2.payerCardExpiryMon = i7 < 10 ? C0.G.m(i7, "0") : String.valueOf(i7);
        }
        PayByOrderReq payByOrderReq3 = this.f27426L;
        if (payByOrderReq3 != null) {
            payByOrderReq3.payerCardExpiryYear = String.valueOf(this.f27422A);
        }
        PayByOrderReq payByOrderReq4 = this.f27426L;
        if (payByOrderReq4 != null) {
            payByOrderReq4.payerCardNo = s();
        }
        PayByOrderReq payByOrderReq5 = this.f27426L;
        if (payByOrderReq5 != null) {
            BankInfo bankInfo = this.f27424C;
            payByOrderReq5.payerBankCode = bankInfo != null ? bankInfo.bankCode : null;
        }
        if (payByOrderReq5 != null) {
            payByOrderReq5.transType = TransType.TRANS_TYPE_BIND_BANK_CARD;
        }
        showLoadingDialog(true);
        La.l lVar = (La.l) this.f27350a;
        if (lVar != null) {
            lVar.payByOrderNo(this.f27426L);
        }
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 1000) {
            if ((intent != null ? intent.getParcelableExtra("BANK_CARD_INFO") : null) != null) {
                this.f27424C = (BankInfo) intent.getParcelableExtra("BANK_CARD_INFO");
                ModelBankCardItem1 modelBankCardItem1P = p();
                if (modelBankCardItem1P != null) {
                    modelBankCardItem1P.setBankInfo(this.f27424C);
                }
            }
            v();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        try {
            Editable text = q().getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            if (text.length() != 0) {
                PayByOrderReq payByOrderReq = new PayByOrderReq();
                payByOrderReq.payerCardCvv = StringsKt.V(r().getText().toString()).toString();
                payByOrderReq.payerCardExpiryMon = String.valueOf(this.f27423B);
                payByOrderReq.payerCardExpiryYear = String.valueOf(this.f27422A);
                payByOrderReq.payerCardNo = q().getText().toString();
                BankInfo bankInfo = this.f27424C;
                if (bankInfo != null) {
                    payByOrderReq.payerBankCode = bankInfo.bankCode;
                    payByOrderReq.bankName = bankInfo.bankName;
                    payByOrderReq.bankUrl = bankInfo.bankUrl;
                }
                SPUtils.getInstance(this.f27427M).put(this.f27428Q, ((Gson) C0525w.f().f7166b).toJson(payByOrderReq));
            }
        } catch (Exception unused) {
        }
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v3) {
        boolean z3;
        boolean z8 = false;
        if (v3 == null || v3.getId() != L9.a.next_bt) {
            if (v3 != null && v3.getId() == L9.a.bank_name_tv) {
                ARouter.getInstance().build("/sm/select_bank_activity").withInt("bank_list_type", 0).navigation(this, 1000);
                return;
            }
            return;
        }
        if (r0.U0()) {
            return;
        }
        if (this.f27424C == null) {
            ToastUtils.showShort("Please select a bank", new Object[0]);
        } else {
            if (r0.a1(s())) {
                z3 = true;
            } else {
                TextView textView = (TextView) this.f27441o.getValue();
                Intrinsics.checkNotNullExpressionValue(textView, "<get-tvError1>(...)");
                u(textView, getString(p025ba.k.core_msg_invalid_bank_card_no));
                z3 = false;
            }
            int iS = i0.s(s());
            EditText editTextR = r();
            if (iS != String.valueOf(editTextR != null ? editTextR.getText() : null).length()) {
                TextView textView2 = (TextView) this.f27434d.getValue();
                Intrinsics.checkNotNullExpressionValue(textView2, "<get-tvError3>(...)");
                u(textView2, getString(p025ba.k.core_msg_invalid_cvv, Integer.valueOf(iS)));
                z3 = false;
            }
            if (TimeUtils.checkDateBeforeNow(this.f27422A, this.f27423B)) {
                TextView textView3 = (TextView) this.f27437g.getValue();
                Intrinsics.checkNotNullExpressionValue(textView3, "<get-tvError2>(...)");
                u(textView3, getString(p025ba.k.core_invalid_date));
            } else {
                z8 = z3;
            }
        }
        if (!z8 || this.f27426L == null) {
            return;
        }
        if (!BaseApplication.isNG()) {
            n();
            return;
        }
        La.l lVar = (La.l) this.f27350a;
        if (lVar != null) {
            String strS = s();
            BankInfo bankInfo = this.f27424C;
            lVar.checkInputBankCardInfo(new CheckBankCardInfoReq(1, strS, bankInfo != null ? bankInfo.bankCode : null, "0"));
        }
    }

    @Override // com.transsnet.palmpay.core.dialog.MonthPickDialog.CallBack
    public final void onConfirmClick() {
        MonthPickDialog monthPickDialog = this.f27446w;
        String nowPickDate = monthPickDialog != null ? monthPickDialog.getNowPickDate() : null;
        MonthPickDialog monthPickDialog2 = this.f27446w;
        this.f27422A = monthPickDialog2 != null ? monthPickDialog2.getNowPickYear() : 0;
        MonthPickDialog monthPickDialog3 = this.f27446w;
        this.f27423B = monthPickDialog3 != null ? monthPickDialog3.getNowPickMonth() : 0;
        TextView textView = (TextView) this.f27438i.getValue();
        if (textView != null) {
            textView.setText(nowPickDate);
        }
        if (TimeUtils.checkDateBeforeNow(this.f27422A, this.f27423B)) {
            TextView textView2 = (TextView) this.f27437g.getValue();
            Intrinsics.checkNotNullExpressionValue(textView2, "<get-tvError2>(...)");
            u(textView2, getString(p025ba.k.core_invalid_date));
        }
        v();
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        super.onPause();
        MonthPickDialog monthPickDialog = this.f27446w;
        if (monthPickDialog != null) {
            monthPickDialog.setCallBack(null);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable MessageEvent messageEvent) {
        if (messageEvent == null) {
            return;
        }
        if (messageEvent.getEventType() == 275) {
            finish();
            return;
        }
        if (messageEvent.getEventType() == 289) {
            TextView textView = (TextView) this.f27438i.getValue();
            if (textView != null) {
                textView.setText("");
            }
            EditText editTextR = r();
            if (editTextR != null) {
                editTextR.setText("");
            }
            this.f27422A = 0;
            this.f27423B = 0;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        MonthPickDialog monthPickDialog = this.f27446w;
        if (monthPickDialog != null) {
            monthPickDialog.setCallBack(this);
        }
    }

    public final ModelBankCardItem1 p() {
        return (ModelBankCardItem1) this.f27439j.getValue();
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        super.processLogic(bundle);
        La.l lVar = (La.l) this.f27350a;
        if (lVar != null) {
            lVar.queryBankList(new QueryBankListReq(1));
        }
        La.l lVar2 = (La.l) this.f27350a;
        if (lVar2 != null) {
            lVar2.getBindBankCardTips();
        }
    }

    public final EditText q() {
        return (EditText) this.f27442p.getValue();
    }

    public final EditText r() {
        return (EditText) this.f27435e.getValue();
    }

    public final String s() {
        Editable text;
        if (q() != null) {
            EditText editTextQ = q();
            String string = (editTextQ == null || (text = editTextQ.getText()) == null) ? null : text.toString();
            if (!TextUtils.isEmpty(string)) {
                Intrinsics.e(string);
                return kotlin.text.y.k(string, " ", "");
            }
        }
        return "";
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        TextView textView;
        TextPaint paint;
        TextPaint paint2;
        ARouter.getInstance().inject(this);
        PayByOrderReq payByOrderReq = (PayByOrderReq) getIntent().getSerializableExtra("pay_content");
        this.f27426L = payByOrderReq;
        if (payByOrderReq == null) {
            try {
                String string = SPUtils.getInstance(this.f27427M).getString(this.f27428Q);
                if (string != null && string.length() != 0) {
                    C0525w.f().getClass();
                    PayByOrderReq payByOrderReq2 = (PayByOrderReq) C0525w.d(string, PayByOrderReq.class);
                    if (payByOrderReq2 != null) {
                        O6.c cVar = new O6.c(this);
                        this.f27431Z = cVar;
                        cVar.b(p025ba.k.core_draft_tips);
                        O6.c cVar2 = this.f27431Z;
                        Intrinsics.e(cVar2);
                        String string2 = getResources().getString(p025ba.k.core_cancel);
                        ViewOnClickListenerC1472f viewOnClickListenerC1472f = new ViewOnClickListenerC1472f(this, 5);
                        cVar2.f6601g = string2;
                        cVar2.f6603i = viewOnClickListenerC1472f;
                        O6.c cVar3 = this.f27431Z;
                        Intrinsics.e(cVar3);
                        String string3 = getResources().getString(p025ba.k.core_confirm);
                        p010a9.b bVar = new p010a9.b(12, payByOrderReq2, this);
                        cVar3.f6600f = string3;
                        cVar3.f6602h = bVar;
                        O6.c cVar4 = this.f27431Z;
                        Intrinsics.e(cVar4);
                        O6.d dVarA = cVar4.a();
                        this.f27430Y = dVarA;
                        dVarA.show();
                    }
                }
            } catch (Exception unused) {
            }
            PayByOrderReq payByOrderReq3 = new PayByOrderReq();
            this.f27426L = payByOrderReq3;
            payByOrderReq3.currency = BaseApplication.getCurrency();
            PayByOrderReq payByOrderReq4 = this.f27426L;
            if (payByOrderReq4 != null) {
                payByOrderReq4.orderType = "7";
            }
        }
        ModelBankCardItem1 modelBankCardItem1P = p();
        if (modelBankCardItem1P != null) {
            modelBankCardItem1P.setBottomLineHeight(SizeUtils.dp2px(0.5f));
        }
        boolean zEquals = "cl_installment_router".equals(this.f27444q0);
        p355xf.t tVar = this.f27432b;
        if (zEquals) {
            ((TextView) tVar.getValue()).setVisibility(0);
            TextView textView2 = (TextView) tVar.getValue();
            if (textView2 != null && (paint2 = textView2.getPaint()) != null) {
                paint2.setFlags(8);
            }
            TextView textView3 = (TextView) tVar.getValue();
            if (textView3 != null && (paint = textView3.getPaint()) != null) {
                paint.setAntiAlias(true);
            }
        } else {
            ((TextView) tVar.getValue()).setVisibility(8);
        }
        TextView textView4 = (TextView) tVar.getValue();
        if (textView4 != null) {
            textView4.setOnClickListener(new ViewOnClickListenerC1472f(this, 1));
        }
        boolean zIsNG = BaseApplication.isNG();
        p355xf.t tVar2 = this.t;
        if (zIsNG) {
            PpTitleBar ppTitleBar = (PpTitleBar) tVar2.getValue();
            if (ppTitleBar != null) {
                ppTitleBar.setRightText(CommonViewExtKt.string(p025ba.k.core_faq, this));
            }
        } else {
            PpTitleBar ppTitleBar2 = (PpTitleBar) tVar2.getValue();
            if (ppTitleBar2 != null) {
                ppTitleBar2.setRightText("");
            }
        }
        MonthPickDialog monthPickDialog = new MonthPickDialog(this);
        this.f27446w = monthPickDialog;
        monthPickDialog.setShowConfirmBtn(true);
        MonthPickDialog monthPickDialog2 = this.f27446w;
        if (monthPickDialog2 != null) {
            monthPickDialog2.setDateRange(0, 30);
        }
        Button button = (Button) this.f27433c.getValue();
        if (button != null) {
            button.setOnClickListener(this);
        }
        TextView textView5 = (TextView) this.f27438i.getValue();
        if (textView5 != null) {
            textView5.setOnClickListener(new ViewOnClickListenerC1472f(this, 2));
        }
        SelectBankDialog selectBankDialog = new SelectBankDialog(this);
        this.f27445v = selectBankDialog;
        selectBankDialog.setLoading();
        SelectBankDialog selectBankDialog2 = this.f27445v;
        if (selectBankDialog2 != null) {
            selectBankDialog2.setCallBack(new com.google.firebase.crashlytics.internal.concurrency.b(this, 28));
        }
        ModelBankCardItem1 modelBankCardItem1P2 = p();
        if (modelBankCardItem1P2 != null) {
            modelBankCardItem1P2.setOnClickListener(this);
        }
        v();
        final int i7 = 0;
        q().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: com.transsnet.palmpay.core.ui.activity.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNewCardWithPaymentActivity f27769b;

            {
                this.f27769b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z3) {
                AddNewCardWithPaymentActivity addNewCardWithPaymentActivity = this.f27769b;
                switch (i7) {
                    case 0:
                        int i10 = AddNewCardWithPaymentActivity.f27421r0;
                        if (!z3 && !r0.a1(addNewCardWithPaymentActivity.s())) {
                            TextView textView6 = (TextView) addNewCardWithPaymentActivity.f27441o.getValue();
                            Intrinsics.checkNotNullExpressionValue(textView6, "<get-tvError1>(...)");
                            AddNewCardWithPaymentActivity.u(textView6, addNewCardWithPaymentActivity.getString(p025ba.k.core_msg_invalid_bank_card_no));
                            break;
                        }
                        break;
                    default:
                        int i11 = AddNewCardWithPaymentActivity.f27421r0;
                        if (!z3) {
                            int iS = i0.s(addNewCardWithPaymentActivity.s());
                            EditText editTextR = addNewCardWithPaymentActivity.r();
                            if (iS != String.valueOf(editTextR != null ? editTextR.getText() : null).length()) {
                                TextView textView7 = (TextView) addNewCardWithPaymentActivity.f27434d.getValue();
                                Intrinsics.checkNotNullExpressionValue(textView7, "<get-tvError3>(...)");
                                AddNewCardWithPaymentActivity.u(textView7, addNewCardWithPaymentActivity.getString(p025ba.k.core_msg_invalid_cvv, Integer.valueOf(iS)));
                            }
                        }
                        break;
                }
            }
        });
        EditText editTextQ = q();
        if (editTextQ != null) {
            editTextQ.addTextChangedListener(new C1474h(this, 0));
        }
        EditText editTextR = r();
        if (editTextR != null) {
            editTextR.addTextChangedListener(new C1474h(this, 1));
        }
        final int i10 = 1;
        r().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: com.transsnet.palmpay.core.ui.activity.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNewCardWithPaymentActivity f27769b;

            {
                this.f27769b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z3) {
                AddNewCardWithPaymentActivity addNewCardWithPaymentActivity = this.f27769b;
                switch (i10) {
                    case 0:
                        int i11 = AddNewCardWithPaymentActivity.f27421r0;
                        if (!z3 && !r0.a1(addNewCardWithPaymentActivity.s())) {
                            TextView textView6 = (TextView) addNewCardWithPaymentActivity.f27441o.getValue();
                            Intrinsics.checkNotNullExpressionValue(textView6, "<get-tvError1>(...)");
                            AddNewCardWithPaymentActivity.u(textView6, addNewCardWithPaymentActivity.getString(p025ba.k.core_msg_invalid_bank_card_no));
                            break;
                        }
                        break;
                    default:
                        int i12 = AddNewCardWithPaymentActivity.f27421r0;
                        if (!z3) {
                            int iS = i0.s(addNewCardWithPaymentActivity.s());
                            EditText editTextR2 = addNewCardWithPaymentActivity.r();
                            if (iS != String.valueOf(editTextR2 != null ? editTextR2.getText() : null).length()) {
                                TextView textView7 = (TextView) addNewCardWithPaymentActivity.f27434d.getValue();
                                Intrinsics.checkNotNullExpressionValue(textView7, "<get-tvError3>(...)");
                                AddNewCardWithPaymentActivity.u(textView7, addNewCardWithPaymentActivity.getString(p025ba.k.core_msg_invalid_cvv, Integer.valueOf(iS)));
                            }
                        }
                        break;
                }
            }
        });
        ModelBankCardItem1 modelBankCardItem1P3 = p();
        if (modelBankCardItem1P3 != null && (textView = modelBankCardItem1P3.f28263d) != null) {
            textView.addTextChangedListener(new C1474h(this, 2));
        }
        PpTitleBar ppTitleBar3 = (PpTitleBar) tVar2.getValue();
        if (ppTitleBar3 != null) {
            ppTitleBar3.setRightTextViewClickListener(new W8.d(27));
        }
        PpTitleBar ppTitleBar4 = (PpTitleBar) tVar2.getValue();
        if (ppTitleBar4 != null) {
            ppTitleBar4.setBackButtonClickListener(new ViewOnClickListenerC1472f(this, 3));
        }
        ((TextView) this.f27436f.getValue()).setOnClickListener(new ViewOnClickListenerC1472f(this, 4));
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.BasePaymentContract.IView
    public final void showPayResult(PayByOrderResp resp) {
        Intrinsics.checkNotNullParameter(resp, "resp");
        showLoadingDialog(false);
        if (!resp.isSuccess() || resp.getData() == null) {
            String respCode = resp.getRespCode();
            if (Intrinsics.c(respCode, "33000039") || Intrinsics.c(respCode, "33000040") || Intrinsics.c(respCode, "33000041") || Intrinsics.c(respCode, "33000093")) {
                i0.i0(this, resp.getRespCode(), resp.getRespMsg(), true);
                return;
            }
            if ("CFRONT_700007".equalsIgnoreCase(resp.getRespCode()) || "CFRONT_700002".equalsIgnoreCase(resp.getRespCode()) || "CFRONT_700003".equalsIgnoreCase(resp.getRespCode())) {
                ToastUtils.showLong(resp.getRespMsg(), new Object[0]);
                return;
            }
            String respMsg = resp.getRespMsg();
            Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
            t(respMsg);
            return;
        }
        PaymentMethod paymentMethod = null;
        if (!resp.getData().flag) {
            PayByOrderReq payByOrderReq = this.f27426L;
            if (!"7".equals(payByOrderReq != null ? payByOrderReq.orderType : null) || resp.getData() == null) {
                return;
            }
            String strJ = C0525w.j(resp.getData().businessData, "payStatus");
            String businessData = resp.getData().businessData;
            Intrinsics.checkNotNullExpressionValue(businessData, "businessData");
            String strJ2 = C0525w.j(businessData, "errorMsg");
            if (TextUtils.isEmpty(strJ2) || TextUtils.equals(strJ2, BuildConfig.TRAVIS)) {
                strJ2 = !TextUtils.isEmpty(C0525w.j(businessData, "channelErrorCode")) ? C0525w.j(businessData, "desc") : null;
            }
            PayByOrderReq payByOrderReq2 = this.f27426L;
            if ("7".equals(payByOrderReq2 != null ? payByOrderReq2.orderType : null)) {
                C0.G.z("/main/add_card_complete", "payStatus", strJ, "errorMsg", strJ2);
                finish();
                return;
            }
            return;
        }
        CheckPayReq checkPayReq = new CheckPayReq();
        PayByOrderReq payByOrderReq3 = this.f27426L;
        if (TextUtils.isEmpty(payByOrderReq3 != null ? payByOrderReq3.orderNo : null)) {
            checkPayReq.orderNo = C0525w.j(resp.getData().businessData, "orderId");
        } else {
            PayByOrderReq payByOrderReq4 = this.f27426L;
            checkPayReq.orderNo = payByOrderReq4 != null ? payByOrderReq4.orderNo : null;
        }
        PayByOrderReq payByOrderReq5 = this.f27426L;
        checkPayReq.orderType = payByOrderReq5 != null ? payByOrderReq5.orderType : null;
        checkPayReq.payId = resp.getData().payId;
        checkPayReq.subPayId = resp.getData().subPayId;
        checkPayReq.verifyMethod = resp.getData().verifyMethod;
        checkPayReq.payRouteId = resp.getData().payRouteId;
        checkPayReq.url = resp.getData().url;
        checkPayReq.transType = TransType.TRANS_TYPE_BIND_BANK_CARD;
        checkPayReq.bankCardNo = s();
        checkPayReq.bankName = "";
        PayByOrderReq payByOrderReq6 = this.f27426L;
        checkPayReq.payAmount = payByOrderReq6 != null ? payByOrderReq6.amount : 0L;
        try {
            Long lI = C0525w.i(resp.getData().orderData, "payFee");
            Intrinsics.checkNotNullExpressionValue(lI, "getJsonLong(...)");
            checkPayReq.feeAmount = lI.longValue();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        d0 d0Var = new d0(this);
        d0Var.f27748b = checkPayReq;
        BankInfo bankInfo = this.f27424C;
        if (bankInfo != null) {
            paymentMethod = new PaymentMethod();
            paymentMethod.bankCode = bankInfo.bankCode;
            paymentMethod.bankName = bankInfo.bankName;
            paymentMethod.bankUrl = bankInfo.bankUrl;
            paymentMethod.countryCode = bankInfo.countryCode;
            paymentMethod.payType = 2;
            paymentMethod.senderAccountType = 5;
            paymentMethod.cardNo = s();
        }
        d0Var.f27751e = paymentMethod;
        d0Var.f27749c = resp;
        d0Var.a();
    }

    public final void t(String str) {
        O6.c cVar = new O6.c(this);
        cVar.e(p025ba.k.core_payment_error_info);
        cVar.f6605k = true;
        cVar.f6598d = str;
        cVar.d(p025ba.k.core_payment_confirm, null);
        O6.d dVarA = cVar.a();
        dVarA.setCanceledOnTouchOutside(false);
        dVarA.setCancelable(false);
        dVarA.show();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    public final void v() {
        boolean z3;
        if (this.f27424C != null) {
            TextView textView = (TextView) this.f27438i.getValue();
            if (TextUtils.isEmpty(textView != null ? textView.getText() : null)) {
                z3 = false;
            } else {
                EditText editTextR = r();
                if (TextUtils.isEmpty(editTextR != null ? editTextR.getText() : null) || TextUtils.isEmpty(s())) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            }
        } else {
            z3 = false;
        }
        Button button = (Button) this.f27433c.getValue();
        if (button != null) {
            button.setEnabled(z3);
        }
    }
}
