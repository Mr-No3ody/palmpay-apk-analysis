package com.transsnet.palmpay.credit.ui.activity;

import Db.C0190g;
import Db.C0191h;
import Db.C0192i;
import L6.b;
import Oc.A;
import Pa.r0;
import Ya.e;
import Ya.f;
import Ya.g;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.core.bean.req.ParseInstalmentsQrcodeReq;
import com.transsnet.palmpay.core.bean.rsp.ParseInstalmentsQrcodeRsp;
import com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView;
import com.transsnet.palmpay.credit.base.CreditBaseMvvmActivity;
import com.transsnet.palmpay.credit.ui.activity.InputAmountActivity;
import com.transsnet.palmpay.credit.ui.viewmodel.InputAmountViewModel;
import com.transsnet.palmpay.custom_view.StateAmountEditText;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.ConfigReq;
import com.transsnet.palmpay.send_money.bean.req.TransferCreateOrderReq;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.x;
import kotlin.reflect.KProperty;
import kotlin.text.D;
import p054dd.q;
import p141j9.C1794b;
import p141j9.C1807o;
import p173ld.o;
import p220oa.h;
import p284sb.C2011i;
import p284sb.C2012j;
import p284sb.C2013k;
import p284sb.ViewTreeObserverOnGlobalLayoutListenerC2010h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC输入金额页", path = "/credit_score/input_amount")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/InputAmountActivity;", "Lcom/transsnet/palmpay/credit/base/CreditBaseMvvmActivity;", "Lcom/transsnet/palmpay/credit/ui/viewmodel/InputAmountViewModel;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInputAmountActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputAmountActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/InputAmountActivity\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,472:1\n55#2,12:473\n84#2,3:485\n171#3,12:488\n215#3:500\n171#3,12:501\n215#3:513\n108#4:514\n80#4,22:515\n1#5:537\n*S KotlinDebug\n*F\n+ 1 InputAmountActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/InputAmountActivity\n*L\n121#1:473,12\n121#1:485,3\n191#1:488,12\n191#1:500\n200#1:501,12\n200#1:513\n340#1:514\n340#1:515,22\n*E\n"})
public final class InputAmountActivity extends CreditBaseMvvmActivity<InputAmountViewModel> {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f28671Z;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f28672A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ParseInstalmentsQrcodeRsp.DataBean f28673B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f28674C;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public BalanceAndLimitResp.BalanceAndLimitData f28676L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f28677M;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ViewTreeObserverOnGlobalLayoutListenerC2010h f28679X;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f28681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f28682g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f28683i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f28684j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f28685o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f28686p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f28687v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f28688w;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C1794b f28675H = new C1794b(this, 25);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f28678Q = true;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final o f28680Y = new o(this, 25);

    static {
        x xVar = new x("type", "getType()I", InputAmountActivity.class);
        G.f38952a.getClass();
        f28671Z = new KProperty[]{xVar};
    }

    public InputAmountActivity() {
        final int i7 = 0;
        this.f28681f = C2131j.b(new Function0(this) { // from class: sb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAmountActivity f42161b;

            {
                this.f42161b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputAmountActivity inputAmountActivity = this.f42161b;
                switch (i7) {
                    case 0:
                        KProperty[] kPropertyArr = InputAmountActivity.f28671Z;
                        return (DigitalKeyboardView) inputAmountActivity.findViewById(e.keyboard_view);
                    case 1:
                        KProperty[] kPropertyArr2 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvReceiptName);
                    case 2:
                        KProperty[] kPropertyArr3 = InputAmountActivity.f28671Z;
                        return (ImageView) inputAmountActivity.findViewById(e.ivRecentlyBank);
                    case 3:
                        KProperty[] kPropertyArr4 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tv_note_hint);
                    case 4:
                        KProperty[] kPropertyArr5 = InputAmountActivity.f28671Z;
                        return (EditText) inputAmountActivity.findViewById(e.et_note);
                    case 5:
                        KProperty[] kPropertyArr6 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.balance_tv);
                    case 6:
                        KProperty[] kPropertyArr7 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvTips);
                    case 7:
                        KProperty[] kPropertyArr8 = InputAmountActivity.f28671Z;
                        return (StateAmountEditText) inputAmountActivity.findViewById(e.transfer_money_et);
                    case 8:
                        KProperty[] kPropertyArr9 = InputAmountActivity.f28671Z;
                        return (ImageView) inputAmountActivity.findViewById(e.iv_discount);
                    default:
                        KProperty[] kPropertyArr10 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvRecentlyBankName);
                }
            }
        });
        final int i10 = 3;
        this.f28682g = C2131j.b(new Function0(this) { // from class: sb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAmountActivity f42161b;

            {
                this.f42161b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputAmountActivity inputAmountActivity = this.f42161b;
                switch (i10) {
                    case 0:
                        KProperty[] kPropertyArr = InputAmountActivity.f28671Z;
                        return (DigitalKeyboardView) inputAmountActivity.findViewById(e.keyboard_view);
                    case 1:
                        KProperty[] kPropertyArr2 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvReceiptName);
                    case 2:
                        KProperty[] kPropertyArr3 = InputAmountActivity.f28671Z;
                        return (ImageView) inputAmountActivity.findViewById(e.ivRecentlyBank);
                    case 3:
                        KProperty[] kPropertyArr4 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tv_note_hint);
                    case 4:
                        KProperty[] kPropertyArr5 = InputAmountActivity.f28671Z;
                        return (EditText) inputAmountActivity.findViewById(e.et_note);
                    case 5:
                        KProperty[] kPropertyArr6 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.balance_tv);
                    case 6:
                        KProperty[] kPropertyArr7 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvTips);
                    case 7:
                        KProperty[] kPropertyArr8 = InputAmountActivity.f28671Z;
                        return (StateAmountEditText) inputAmountActivity.findViewById(e.transfer_money_et);
                    case 8:
                        KProperty[] kPropertyArr9 = InputAmountActivity.f28671Z;
                        return (ImageView) inputAmountActivity.findViewById(e.iv_discount);
                    default:
                        KProperty[] kPropertyArr10 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvRecentlyBankName);
                }
            }
        });
        final int i11 = 4;
        this.f28683i = C2131j.b(new Function0(this) { // from class: sb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAmountActivity f42161b;

            {
                this.f42161b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputAmountActivity inputAmountActivity = this.f42161b;
                switch (i11) {
                    case 0:
                        KProperty[] kPropertyArr = InputAmountActivity.f28671Z;
                        return (DigitalKeyboardView) inputAmountActivity.findViewById(e.keyboard_view);
                    case 1:
                        KProperty[] kPropertyArr2 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvReceiptName);
                    case 2:
                        KProperty[] kPropertyArr3 = InputAmountActivity.f28671Z;
                        return (ImageView) inputAmountActivity.findViewById(e.ivRecentlyBank);
                    case 3:
                        KProperty[] kPropertyArr4 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tv_note_hint);
                    case 4:
                        KProperty[] kPropertyArr5 = InputAmountActivity.f28671Z;
                        return (EditText) inputAmountActivity.findViewById(e.et_note);
                    case 5:
                        KProperty[] kPropertyArr6 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.balance_tv);
                    case 6:
                        KProperty[] kPropertyArr7 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvTips);
                    case 7:
                        KProperty[] kPropertyArr8 = InputAmountActivity.f28671Z;
                        return (StateAmountEditText) inputAmountActivity.findViewById(e.transfer_money_et);
                    case 8:
                        KProperty[] kPropertyArr9 = InputAmountActivity.f28671Z;
                        return (ImageView) inputAmountActivity.findViewById(e.iv_discount);
                    default:
                        KProperty[] kPropertyArr10 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvRecentlyBankName);
                }
            }
        });
        final int i12 = 5;
        this.f28684j = C2131j.b(new Function0(this) { // from class: sb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAmountActivity f42161b;

            {
                this.f42161b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputAmountActivity inputAmountActivity = this.f42161b;
                switch (i12) {
                    case 0:
                        KProperty[] kPropertyArr = InputAmountActivity.f28671Z;
                        return (DigitalKeyboardView) inputAmountActivity.findViewById(e.keyboard_view);
                    case 1:
                        KProperty[] kPropertyArr2 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvReceiptName);
                    case 2:
                        KProperty[] kPropertyArr3 = InputAmountActivity.f28671Z;
                        return (ImageView) inputAmountActivity.findViewById(e.ivRecentlyBank);
                    case 3:
                        KProperty[] kPropertyArr4 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tv_note_hint);
                    case 4:
                        KProperty[] kPropertyArr5 = InputAmountActivity.f28671Z;
                        return (EditText) inputAmountActivity.findViewById(e.et_note);
                    case 5:
                        KProperty[] kPropertyArr6 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.balance_tv);
                    case 6:
                        KProperty[] kPropertyArr7 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvTips);
                    case 7:
                        KProperty[] kPropertyArr8 = InputAmountActivity.f28671Z;
                        return (StateAmountEditText) inputAmountActivity.findViewById(e.transfer_money_et);
                    case 8:
                        KProperty[] kPropertyArr9 = InputAmountActivity.f28671Z;
                        return (ImageView) inputAmountActivity.findViewById(e.iv_discount);
                    default:
                        KProperty[] kPropertyArr10 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvRecentlyBankName);
                }
            }
        });
        final int i13 = 6;
        this.f28685o = C2131j.b(new Function0(this) { // from class: sb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAmountActivity f42161b;

            {
                this.f42161b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputAmountActivity inputAmountActivity = this.f42161b;
                switch (i13) {
                    case 0:
                        KProperty[] kPropertyArr = InputAmountActivity.f28671Z;
                        return (DigitalKeyboardView) inputAmountActivity.findViewById(e.keyboard_view);
                    case 1:
                        KProperty[] kPropertyArr2 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvReceiptName);
                    case 2:
                        KProperty[] kPropertyArr3 = InputAmountActivity.f28671Z;
                        return (ImageView) inputAmountActivity.findViewById(e.ivRecentlyBank);
                    case 3:
                        KProperty[] kPropertyArr4 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tv_note_hint);
                    case 4:
                        KProperty[] kPropertyArr5 = InputAmountActivity.f28671Z;
                        return (EditText) inputAmountActivity.findViewById(e.et_note);
                    case 5:
                        KProperty[] kPropertyArr6 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.balance_tv);
                    case 6:
                        KProperty[] kPropertyArr7 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvTips);
                    case 7:
                        KProperty[] kPropertyArr8 = InputAmountActivity.f28671Z;
                        return (StateAmountEditText) inputAmountActivity.findViewById(e.transfer_money_et);
                    case 8:
                        KProperty[] kPropertyArr9 = InputAmountActivity.f28671Z;
                        return (ImageView) inputAmountActivity.findViewById(e.iv_discount);
                    default:
                        KProperty[] kPropertyArr10 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvRecentlyBankName);
                }
            }
        });
        final int i14 = 7;
        this.f28686p = C2131j.b(new Function0(this) { // from class: sb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAmountActivity f42161b;

            {
                this.f42161b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputAmountActivity inputAmountActivity = this.f42161b;
                switch (i14) {
                    case 0:
                        KProperty[] kPropertyArr = InputAmountActivity.f28671Z;
                        return (DigitalKeyboardView) inputAmountActivity.findViewById(e.keyboard_view);
                    case 1:
                        KProperty[] kPropertyArr2 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvReceiptName);
                    case 2:
                        KProperty[] kPropertyArr3 = InputAmountActivity.f28671Z;
                        return (ImageView) inputAmountActivity.findViewById(e.ivRecentlyBank);
                    case 3:
                        KProperty[] kPropertyArr4 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tv_note_hint);
                    case 4:
                        KProperty[] kPropertyArr5 = InputAmountActivity.f28671Z;
                        return (EditText) inputAmountActivity.findViewById(e.et_note);
                    case 5:
                        KProperty[] kPropertyArr6 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.balance_tv);
                    case 6:
                        KProperty[] kPropertyArr7 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvTips);
                    case 7:
                        KProperty[] kPropertyArr8 = InputAmountActivity.f28671Z;
                        return (StateAmountEditText) inputAmountActivity.findViewById(e.transfer_money_et);
                    case 8:
                        KProperty[] kPropertyArr9 = InputAmountActivity.f28671Z;
                        return (ImageView) inputAmountActivity.findViewById(e.iv_discount);
                    default:
                        KProperty[] kPropertyArr10 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvRecentlyBankName);
                }
            }
        });
        final int i15 = 8;
        this.t = C2131j.b(new Function0(this) { // from class: sb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAmountActivity f42161b;

            {
                this.f42161b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputAmountActivity inputAmountActivity = this.f42161b;
                switch (i15) {
                    case 0:
                        KProperty[] kPropertyArr = InputAmountActivity.f28671Z;
                        return (DigitalKeyboardView) inputAmountActivity.findViewById(e.keyboard_view);
                    case 1:
                        KProperty[] kPropertyArr2 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvReceiptName);
                    case 2:
                        KProperty[] kPropertyArr3 = InputAmountActivity.f28671Z;
                        return (ImageView) inputAmountActivity.findViewById(e.ivRecentlyBank);
                    case 3:
                        KProperty[] kPropertyArr4 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tv_note_hint);
                    case 4:
                        KProperty[] kPropertyArr5 = InputAmountActivity.f28671Z;
                        return (EditText) inputAmountActivity.findViewById(e.et_note);
                    case 5:
                        KProperty[] kPropertyArr6 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.balance_tv);
                    case 6:
                        KProperty[] kPropertyArr7 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvTips);
                    case 7:
                        KProperty[] kPropertyArr8 = InputAmountActivity.f28671Z;
                        return (StateAmountEditText) inputAmountActivity.findViewById(e.transfer_money_et);
                    case 8:
                        KProperty[] kPropertyArr9 = InputAmountActivity.f28671Z;
                        return (ImageView) inputAmountActivity.findViewById(e.iv_discount);
                    default:
                        KProperty[] kPropertyArr10 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvRecentlyBankName);
                }
            }
        });
        final int i16 = 9;
        this.f28687v = C2131j.b(new Function0(this) { // from class: sb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAmountActivity f42161b;

            {
                this.f42161b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputAmountActivity inputAmountActivity = this.f42161b;
                switch (i16) {
                    case 0:
                        KProperty[] kPropertyArr = InputAmountActivity.f28671Z;
                        return (DigitalKeyboardView) inputAmountActivity.findViewById(e.keyboard_view);
                    case 1:
                        KProperty[] kPropertyArr2 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvReceiptName);
                    case 2:
                        KProperty[] kPropertyArr3 = InputAmountActivity.f28671Z;
                        return (ImageView) inputAmountActivity.findViewById(e.ivRecentlyBank);
                    case 3:
                        KProperty[] kPropertyArr4 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tv_note_hint);
                    case 4:
                        KProperty[] kPropertyArr5 = InputAmountActivity.f28671Z;
                        return (EditText) inputAmountActivity.findViewById(e.et_note);
                    case 5:
                        KProperty[] kPropertyArr6 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.balance_tv);
                    case 6:
                        KProperty[] kPropertyArr7 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvTips);
                    case 7:
                        KProperty[] kPropertyArr8 = InputAmountActivity.f28671Z;
                        return (StateAmountEditText) inputAmountActivity.findViewById(e.transfer_money_et);
                    case 8:
                        KProperty[] kPropertyArr9 = InputAmountActivity.f28671Z;
                        return (ImageView) inputAmountActivity.findViewById(e.iv_discount);
                    default:
                        KProperty[] kPropertyArr10 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvRecentlyBankName);
                }
            }
        });
        final int i17 = 1;
        this.f28688w = C2131j.b(new Function0(this) { // from class: sb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAmountActivity f42161b;

            {
                this.f42161b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputAmountActivity inputAmountActivity = this.f42161b;
                switch (i17) {
                    case 0:
                        KProperty[] kPropertyArr = InputAmountActivity.f28671Z;
                        return (DigitalKeyboardView) inputAmountActivity.findViewById(e.keyboard_view);
                    case 1:
                        KProperty[] kPropertyArr2 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvReceiptName);
                    case 2:
                        KProperty[] kPropertyArr3 = InputAmountActivity.f28671Z;
                        return (ImageView) inputAmountActivity.findViewById(e.ivRecentlyBank);
                    case 3:
                        KProperty[] kPropertyArr4 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tv_note_hint);
                    case 4:
                        KProperty[] kPropertyArr5 = InputAmountActivity.f28671Z;
                        return (EditText) inputAmountActivity.findViewById(e.et_note);
                    case 5:
                        KProperty[] kPropertyArr6 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.balance_tv);
                    case 6:
                        KProperty[] kPropertyArr7 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvTips);
                    case 7:
                        KProperty[] kPropertyArr8 = InputAmountActivity.f28671Z;
                        return (StateAmountEditText) inputAmountActivity.findViewById(e.transfer_money_et);
                    case 8:
                        KProperty[] kPropertyArr9 = InputAmountActivity.f28671Z;
                        return (ImageView) inputAmountActivity.findViewById(e.iv_discount);
                    default:
                        KProperty[] kPropertyArr10 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvRecentlyBankName);
                }
            }
        });
        final int i18 = 2;
        this.f28672A = C2131j.b(new Function0(this) { // from class: sb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAmountActivity f42161b;

            {
                this.f42161b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputAmountActivity inputAmountActivity = this.f42161b;
                switch (i18) {
                    case 0:
                        KProperty[] kPropertyArr = InputAmountActivity.f28671Z;
                        return (DigitalKeyboardView) inputAmountActivity.findViewById(e.keyboard_view);
                    case 1:
                        KProperty[] kPropertyArr2 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvReceiptName);
                    case 2:
                        KProperty[] kPropertyArr3 = InputAmountActivity.f28671Z;
                        return (ImageView) inputAmountActivity.findViewById(e.ivRecentlyBank);
                    case 3:
                        KProperty[] kPropertyArr4 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tv_note_hint);
                    case 4:
                        KProperty[] kPropertyArr5 = InputAmountActivity.f28671Z;
                        return (EditText) inputAmountActivity.findViewById(e.et_note);
                    case 5:
                        KProperty[] kPropertyArr6 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.balance_tv);
                    case 6:
                        KProperty[] kPropertyArr7 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvTips);
                    case 7:
                        KProperty[] kPropertyArr8 = InputAmountActivity.f28671Z;
                        return (StateAmountEditText) inputAmountActivity.findViewById(e.transfer_money_et);
                    case 8:
                        KProperty[] kPropertyArr9 = InputAmountActivity.f28671Z;
                        return (ImageView) inputAmountActivity.findViewById(e.iv_discount);
                    default:
                        KProperty[] kPropertyArr10 = InputAmountActivity.f28671Z;
                        return (TextView) inputAmountActivity.findViewById(e.tvRecentlyBankName);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_activity_input_amount;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final EditText n() {
        Object value = this.f28683i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (EditText) value;
    }

    public final DigitalKeyboardView o() {
        Object value = this.f28681f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (DigitalKeyboardView) value;
    }

    public final StateAmountEditText p() {
        Object value = this.f28686p.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (StateAmountEditText) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        l lVar = ((InputAmountViewModel) l()).f30683e;
        if (lVar != null) {
            lVar.e(this, new q(new C2012j(this, this, 0), 27));
        }
        l lVar2 = ((InputAmountViewModel) l()).f30685g;
        if (lVar2 != null) {
            lVar2.e(this, new q(new C2012j(this, this, 1), 27));
        }
        n.B(this, ((InputAmountViewModel) l()).f30684f, this, new C1807o(this, 8), new D(23), false, null, 240);
        InputAmountViewModel inputAmountViewModel = (InputAmountViewModel) l();
        ParseInstalmentsQrcodeReq req = new ParseInstalmentsQrcodeReq("", this.f28674C);
        inputAmountViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        p140j8.f.s(inputAmountViewModel, new C0192i(req, null), inputAmountViewModel.f30685g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        ConfigReq req2 = new ConfigReq();
        req2.setPayeeAccountType(4);
        InputAmountViewModel inputAmountViewModel2 = (InputAmountViewModel) l();
        inputAmountViewModel2.getClass();
        Intrinsics.checkNotNullParameter(req2, "req");
        p140j8.f.s(inputAmountViewModel2, new C0191h(req2, null), inputAmountViewModel2.f30683e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    public final TextView q() {
        Object value = this.f28682g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final void r() {
        Editable text;
        String string;
        if (p().getDouble() <= 0.0d) {
            ToastUtils.showShort(getString(g.cs_please_enter_the_amount), new Object[0]);
            return;
        }
        KProperty[] kPropertyArr = f28671Z;
        KProperty kProperty = kPropertyArr[0];
        C1794b c1794b = this.f28675H;
        if (((Number) c1794b.getValue(this, kProperty)).intValue() == 1) {
            h.x(this, "Invalid account number");
            return;
        }
        if (((Number) c1794b.getValue(this, kPropertyArr[0])).intValue() == 2) {
            TransferCreateOrderReq req = new TransferCreateOrderReq();
            req.setAmount(Long.valueOf(r0.f(p().getDouble())));
            req.setAccountNo(this.f28674C);
            req.setOrderSourceType("PAYSHOP");
            req.setTransType("03");
            EditText editTextN = n();
            if (editTextN != null && (text = editTextN.getText()) != null && (string = text.toString()) != null) {
                if (string.length() <= 0) {
                    string = null;
                }
                if (string != null) {
                    req.setTransferNotes(string);
                }
            }
            ParseInstalmentsQrcodeRsp.DataBean dataBean = this.f28673B;
            if (dataBean != null) {
                req.setBusinessType(Integer.valueOf(dataBean.businessType));
            }
            InputAmountViewModel inputAmountViewModel = (InputAmountViewModel) l();
            inputAmountViewModel.getClass();
            Intrinsics.checkNotNullParameter(req, "req");
            C0190g c0190g = new C0190g(req, null);
            l lVar = inputAmountViewModel.f30684f;
            lVar.f27356m = req;
            Unit unit = Unit.f38893a;
            p140j8.f.v(inputAmountViewModel, c0190g, lVar, 0L);
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [sb.h] */
    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
        p().setShowSoftInputOnFocus(false);
        final int i7 = 0;
        p().setOnTouchListener(new View.OnTouchListener(this) { // from class: sb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAmountActivity f42163b;

            {
                this.f42163b = this;
            }

            /* JADX WARN: Code duplicated, block: B:32:0x008c  */
            /* JADX WARN: Code duplicated, block: B:33:0x009b  */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent event) {
                InputAmountActivity inputAmountActivity = this.f42163b;
                switch (i7) {
                    case 0:
                        KProperty[] kPropertyArr = InputAmountActivity.f28671Z;
                        if (event.getAction() == 0) {
                            inputAmountActivity.f28678Q = true;
                        }
                        break;
                    case 1:
                        KProperty[] kPropertyArr2 = InputAmountActivity.f28671Z;
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event.getAction() == 0) {
                            inputAmountActivity.f28678Q = true;
                            KeyboardUtils.hideSoftInput(inputAmountActivity.n());
                            String string = inputAmountActivity.n().getText().toString();
                            int length = string.length() - 1;
                            int i10 = 0;
                            boolean z3 = false;
                            while (i10 <= length) {
                                boolean z8 = Intrinsics.h(string.charAt(!z3 ? i10 : length), 32) <= 0;
                                if (z3) {
                                    if (z8) {
                                        length--;
                                    } else if (string.subSequence(i10, length + 1).toString().length() > 0) {
                                        inputAmountActivity.q().setVisibility(0);
                                        inputAmountActivity.n().setVisibility(8);
                                    } else {
                                        inputAmountActivity.q().setVisibility(8);
                                        inputAmountActivity.n().setVisibility(0);
                                    }
                                    break;
                                } else if (z8) {
                                    i10++;
                                } else {
                                    z3 = true;
                                }
                            }
                            if (string.subSequence(i10, length + 1).toString().length() > 0) {
                                inputAmountActivity.q().setVisibility(0);
                                inputAmountActivity.n().setVisibility(8);
                            } else {
                                inputAmountActivity.q().setVisibility(8);
                                inputAmountActivity.n().setVisibility(0);
                            }
                        }
                        break;
                    case 2:
                        KProperty[] kPropertyArr3 = InputAmountActivity.f28671Z;
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event.getAction() == 0) {
                            inputAmountActivity.f28678Q = false;
                            h.s(inputAmountActivity.o(), false);
                        }
                        break;
                    default:
                        KProperty[] kPropertyArr4 = InputAmountActivity.f28671Z;
                        if (event.getAction() == 0) {
                            KeyboardUtils.hideSoftInput(inputAmountActivity.n());
                        }
                        break;
                }
                return false;
            }
        });
        p().f30975b = false;
        p().addTextChangedListener(new R3.e(this, 20));
        o().setActionButtonEnable(false);
        o().setDigitalKeyboardClickListener(new C2013k(this));
        final int i10 = 0;
        this.f28679X = new ViewTreeObserver.OnGlobalLayoutListener(this) { // from class: sb.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAmountActivity f42165b;

            {
                this.f42165b = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                InputAmountActivity inputAmountActivity = this.f42165b;
                switch (i10) {
                    case 0:
                        KProperty[] kPropertyArr = InputAmountActivity.f28671Z;
                        Rect rect = new Rect();
                        inputAmountActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                        int iHeight = rect.height();
                        int i11 = inputAmountActivity.f28677M;
                        if (i11 == 0) {
                            inputAmountActivity.f28677M = iHeight;
                        } else if (i11 == iHeight) {
                            if (inputAmountActivity.f28678Q) {
                                h.s(inputAmountActivity.o(), true);
                            }
                        } else if (!inputAmountActivity.f28678Q) {
                            inputAmountActivity.f28678Q = true;
                            h.s(inputAmountActivity.o(), false);
                        }
                        break;
                    default:
                        KProperty[] kPropertyArr2 = InputAmountActivity.f28671Z;
                        Rect rect2 = new Rect();
                        inputAmountActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
                        int iHeight2 = rect2.height();
                        if (inputAmountActivity.f28677M == 0) {
                            inputAmountActivity.f28677M = iHeight2;
                            break;
                        } else if (!inputAmountActivity.isFinishing()) {
                            if (inputAmountActivity.f28677M == iHeight2) {
                                if (inputAmountActivity.f28678Q && inputAmountActivity.o() != null) {
                                    h.s(inputAmountActivity.o(), true);
                                    break;
                                }
                            } else if (!inputAmountActivity.f28678Q && inputAmountActivity.o() != null) {
                                inputAmountActivity.f28678Q = true;
                                h.s(inputAmountActivity.o(), false);
                                break;
                            }
                        }
                        break;
                }
            }
        };
        getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this.f28679X);
        final int i11 = 1;
        p().setOnTouchListener(new View.OnTouchListener(this) { // from class: sb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAmountActivity f42163b;

            {
                this.f42163b = this;
            }

            /* JADX WARN: Code duplicated, block: B:32:0x008c  */
            /* JADX WARN: Code duplicated, block: B:33:0x009b  */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent event) {
                InputAmountActivity inputAmountActivity = this.f42163b;
                switch (i11) {
                    case 0:
                        KProperty[] kPropertyArr = InputAmountActivity.f28671Z;
                        if (event.getAction() == 0) {
                            inputAmountActivity.f28678Q = true;
                        }
                        break;
                    case 1:
                        KProperty[] kPropertyArr2 = InputAmountActivity.f28671Z;
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event.getAction() == 0) {
                            inputAmountActivity.f28678Q = true;
                            KeyboardUtils.hideSoftInput(inputAmountActivity.n());
                            String string = inputAmountActivity.n().getText().toString();
                            int length = string.length() - 1;
                            int i12 = 0;
                            boolean z3 = false;
                            while (i12 <= length) {
                                boolean z8 = Intrinsics.h(string.charAt(!z3 ? i12 : length), 32) <= 0;
                                if (z3) {
                                    if (z8) {
                                        length--;
                                    } else if (string.subSequence(i12, length + 1).toString().length() > 0) {
                                        inputAmountActivity.q().setVisibility(0);
                                        inputAmountActivity.n().setVisibility(8);
                                    } else {
                                        inputAmountActivity.q().setVisibility(8);
                                        inputAmountActivity.n().setVisibility(0);
                                    }
                                    break;
                                } else if (z8) {
                                    i12++;
                                } else {
                                    z3 = true;
                                }
                            }
                            if (string.subSequence(i12, length + 1).toString().length() > 0) {
                                inputAmountActivity.q().setVisibility(0);
                                inputAmountActivity.n().setVisibility(8);
                            } else {
                                inputAmountActivity.q().setVisibility(8);
                                inputAmountActivity.n().setVisibility(0);
                            }
                        }
                        break;
                    case 2:
                        KProperty[] kPropertyArr3 = InputAmountActivity.f28671Z;
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event.getAction() == 0) {
                            inputAmountActivity.f28678Q = false;
                            h.s(inputAmountActivity.o(), false);
                        }
                        break;
                    default:
                        KProperty[] kPropertyArr4 = InputAmountActivity.f28671Z;
                        if (event.getAction() == 0) {
                            KeyboardUtils.hideSoftInput(inputAmountActivity.n());
                        }
                        break;
                }
                return false;
            }
        });
        n().setOnEditorActionListener(new A(this, 7));
        final int i12 = 2;
        n().setOnTouchListener(new View.OnTouchListener(this) { // from class: sb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAmountActivity f42163b;

            {
                this.f42163b = this;
            }

            /* JADX WARN: Code duplicated, block: B:32:0x008c  */
            /* JADX WARN: Code duplicated, block: B:33:0x009b  */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent event) {
                InputAmountActivity inputAmountActivity = this.f42163b;
                switch (i12) {
                    case 0:
                        KProperty[] kPropertyArr = InputAmountActivity.f28671Z;
                        if (event.getAction() == 0) {
                            inputAmountActivity.f28678Q = true;
                        }
                        break;
                    case 1:
                        KProperty[] kPropertyArr2 = InputAmountActivity.f28671Z;
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event.getAction() == 0) {
                            inputAmountActivity.f28678Q = true;
                            KeyboardUtils.hideSoftInput(inputAmountActivity.n());
                            String string = inputAmountActivity.n().getText().toString();
                            int length = string.length() - 1;
                            int i13 = 0;
                            boolean z3 = false;
                            while (i13 <= length) {
                                boolean z8 = Intrinsics.h(string.charAt(!z3 ? i13 : length), 32) <= 0;
                                if (z3) {
                                    if (z8) {
                                        length--;
                                    } else if (string.subSequence(i13, length + 1).toString().length() > 0) {
                                        inputAmountActivity.q().setVisibility(0);
                                        inputAmountActivity.n().setVisibility(8);
                                    } else {
                                        inputAmountActivity.q().setVisibility(8);
                                        inputAmountActivity.n().setVisibility(0);
                                    }
                                    break;
                                } else if (z8) {
                                    i13++;
                                } else {
                                    z3 = true;
                                }
                            }
                            if (string.subSequence(i13, length + 1).toString().length() > 0) {
                                inputAmountActivity.q().setVisibility(0);
                                inputAmountActivity.n().setVisibility(8);
                            } else {
                                inputAmountActivity.q().setVisibility(8);
                                inputAmountActivity.n().setVisibility(0);
                            }
                        }
                        break;
                    case 2:
                        KProperty[] kPropertyArr3 = InputAmountActivity.f28671Z;
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event.getAction() == 0) {
                            inputAmountActivity.f28678Q = false;
                            h.s(inputAmountActivity.o(), false);
                        }
                        break;
                    default:
                        KProperty[] kPropertyArr4 = InputAmountActivity.f28671Z;
                        if (event.getAction() == 0) {
                            KeyboardUtils.hideSoftInput(inputAmountActivity.n());
                        }
                        break;
                }
                return false;
            }
        });
        n().addTextChangedListener(new C2011i());
        final int i13 = 1;
        getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this) { // from class: sb.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAmountActivity f42165b;

            {
                this.f42165b = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                InputAmountActivity inputAmountActivity = this.f42165b;
                switch (i13) {
                    case 0:
                        KProperty[] kPropertyArr = InputAmountActivity.f28671Z;
                        Rect rect = new Rect();
                        inputAmountActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                        int iHeight = rect.height();
                        int i14 = inputAmountActivity.f28677M;
                        if (i14 == 0) {
                            inputAmountActivity.f28677M = iHeight;
                        } else if (i14 == iHeight) {
                            if (inputAmountActivity.f28678Q) {
                                h.s(inputAmountActivity.o(), true);
                            }
                        } else if (!inputAmountActivity.f28678Q) {
                            inputAmountActivity.f28678Q = true;
                            h.s(inputAmountActivity.o(), false);
                        }
                        break;
                    default:
                        KProperty[] kPropertyArr2 = InputAmountActivity.f28671Z;
                        Rect rect2 = new Rect();
                        inputAmountActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
                        int iHeight2 = rect2.height();
                        if (inputAmountActivity.f28677M == 0) {
                            inputAmountActivity.f28677M = iHeight2;
                            break;
                        } else if (!inputAmountActivity.isFinishing()) {
                            if (inputAmountActivity.f28677M == iHeight2) {
                                if (inputAmountActivity.f28678Q && inputAmountActivity.o() != null) {
                                    h.s(inputAmountActivity.o(), true);
                                    break;
                                }
                            } else if (!inputAmountActivity.f28678Q && inputAmountActivity.o() != null) {
                                inputAmountActivity.f28678Q = true;
                                h.s(inputAmountActivity.o(), false);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        h.l(this.f28680Y, q());
        final int i14 = 3;
        findViewById(e.viewContainer).setOnTouchListener(new View.OnTouchListener(this) { // from class: sb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAmountActivity f42163b;

            {
                this.f42163b = this;
            }

            /* JADX WARN: Code duplicated, block: B:32:0x008c  */
            /* JADX WARN: Code duplicated, block: B:33:0x009b  */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent event) {
                InputAmountActivity inputAmountActivity = this.f42163b;
                switch (i14) {
                    case 0:
                        KProperty[] kPropertyArr = InputAmountActivity.f28671Z;
                        if (event.getAction() == 0) {
                            inputAmountActivity.f28678Q = true;
                        }
                        break;
                    case 1:
                        KProperty[] kPropertyArr2 = InputAmountActivity.f28671Z;
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event.getAction() == 0) {
                            inputAmountActivity.f28678Q = true;
                            KeyboardUtils.hideSoftInput(inputAmountActivity.n());
                            String string = inputAmountActivity.n().getText().toString();
                            int length = string.length() - 1;
                            int i15 = 0;
                            boolean z3 = false;
                            while (i15 <= length) {
                                boolean z8 = Intrinsics.h(string.charAt(!z3 ? i15 : length), 32) <= 0;
                                if (z3) {
                                    if (z8) {
                                        length--;
                                    } else if (string.subSequence(i15, length + 1).toString().length() > 0) {
                                        inputAmountActivity.q().setVisibility(0);
                                        inputAmountActivity.n().setVisibility(8);
                                    } else {
                                        inputAmountActivity.q().setVisibility(8);
                                        inputAmountActivity.n().setVisibility(0);
                                    }
                                    break;
                                } else if (z8) {
                                    i15++;
                                } else {
                                    z3 = true;
                                }
                            }
                            if (string.subSequence(i15, length + 1).toString().length() > 0) {
                                inputAmountActivity.q().setVisibility(0);
                                inputAmountActivity.n().setVisibility(8);
                            } else {
                                inputAmountActivity.q().setVisibility(8);
                                inputAmountActivity.n().setVisibility(0);
                            }
                        }
                        break;
                    case 2:
                        KProperty[] kPropertyArr3 = InputAmountActivity.f28671Z;
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event.getAction() == 0) {
                            inputAmountActivity.f28678Q = false;
                            h.s(inputAmountActivity.o(), false);
                        }
                        break;
                    default:
                        KProperty[] kPropertyArr4 = InputAmountActivity.f28671Z;
                        if (event.getAction() == 0) {
                            KeyboardUtils.hideSoftInput(inputAmountActivity.n());
                        }
                        break;
                }
                return false;
            }
        });
    }
}
