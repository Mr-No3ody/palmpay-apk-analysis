package com.transsnet.palmpay.teller.ui.activity;

import Bc.C0107d;
import Dd.b;
import Pa.i0;
import Pa.r0;
import Pd.c;
import Pd.d;
import Pd.f;
import Rd.C0601q;
import Ua.E0;
import Wd.E;
import Wd.G;
import Wd.H;
import Wd.I;
import Wd.J;
import Wd.K;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mikepenz.iconics.IconicsDrawable;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.betting.bean.BettingBillerListItemBean;
import com.transsnet.palmpay.betting.bean.BettingBillerListRsp;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.CloseContactBean;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.req.AddFamilyAccontReq;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.custom_view.ModelItemSelection;
import com.transsnet.palmpay.custom_view.dialog.ToastDialog;
import com.transsnet.palmpay.custom_view.dialog.y;
import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.t;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.bean.BillPaymentHomeParams;
import com.transsnet.palmpay.teller.bean.BillerListItemBean;
import com.transsnet.palmpay.teller.bean.BillerListRsp;
import com.transsnet.palmpay.teller.bean.PaymentItemBean;
import com.transsnet.palmpay.teller.bean.PaymentItemListRsp;
import com.transsnet.palmpay.teller.ui.activity.EditBeneficiaryActivity;
import com.transsnet.palmpay.teller.ui.dialog.PickBillerNewDialog;
import com.transsnet.palmpay.teller.ui.dialog.PickPaymentItemDialog;
import com.transsnet.palmpay.teller.viewmodel.EditBeneficiaryViewModel;
import com.transsnet.palmpay.util.SpanUtils;
import io.fastkv.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p025ba.e;
import p059e1.a;
import p086fe.N0;
import p086fe.R0;
import p185ma.m;
import p355xf.C2131j;
import p355xf.EnumC2132k;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "场景/Edit Beneficiary", path = "/quick_teller/edit_beneficiaries", remark = "ignore")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/activity/EditBeneficiaryActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/teller/viewmodel/EditBeneficiaryViewModel;", "LRd/q;", "Lcom/transsnet/palmpay/teller/ui/dialog/PickBillerNewDialog$CallBack;", "Landroid/text/TextWatcher;", "Lcom/transsnet/palmpay/teller/ui/dialog/PickPaymentItemDialog$CallBack;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEditBeneficiaryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditBeneficiaryActivity.kt\ncom/transsnet/palmpay/teller/ui/activity/EditBeneficiaryActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,785:1\n1869#2:786\n1870#2:803\n1869#2,2:816\n327#3,4:787\n327#3,4:791\n327#3,4:795\n327#3,4:799\n327#3,4:804\n327#3,4:808\n327#3,4:812\n260#4,10:818\n296#4:828\n260#4,10:829\n296#4:839\n260#4,10:840\n296#4:850\n1#5:851\n*S KotlinDebug\n*F\n+ 1 EditBeneficiaryActivity.kt\ncom/transsnet/palmpay/teller/ui/activity/EditBeneficiaryActivity\n*L\n242#1:786\n242#1:803\n324#1:816,2\n245#1:787,4\n253#1:791,4\n263#1:795,4\n267#1:799,4\n280#1:804,4\n287#1:808,4\n299#1:812,4\n413#1:818,10\n413#1:828\n451#1:829,10\n451#1:839\n464#1:840,10\n464#1:850\n*E\n"})
public final class EditBeneficiaryActivity extends BaseMvvmVBActivity<EditBeneficiaryViewModel, C0601q> implements PickBillerNewDialog.CallBack, TextWatcher, PickPaymentItemDialog.CallBack {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f34202M = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ArrayList f34203A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public BillerListItemBean f34204B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public PaymentItemBean f34205C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public E0 f34206H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f34207L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f34208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34209e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f34211g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f34213j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CloseContactBean f34214o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f34215p;
    public final Object t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f34216v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f34217w;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f34210f = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f34212i = "0";

    public EditBeneficiaryActivity() {
        EnumC2132k enumC2132k = EnumC2132k.f43971c;
        final int i7 = 2;
        this.f34215p = C2131j.a(enumC2132k, new Function0(this) { // from class: Wd.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditBeneficiaryActivity f10710b;

            {
                this.f10710b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                EditBeneficiaryActivity editBeneficiaryActivity = this.f10710b;
                switch (i7) {
                    case 0:
                        int i10 = EditBeneficiaryActivity.f34202M;
                        return (ModelItemSelection) editBeneficiaryActivity.findViewById(Pd.c.inputPaymentItem);
                    case 1:
                        int i11 = EditBeneficiaryActivity.f34202M;
                        return (ModelNumberInputLayout) editBeneficiaryActivity.findViewById(Pd.c.viewCustomerId);
                    default:
                        int i12 = EditBeneficiaryActivity.f34202M;
                        return (ModelItemSelection) editBeneficiaryActivity.findViewById(Pd.c.inputBiller);
                }
            }
        });
        final int i10 = 0;
        this.t = C2131j.a(enumC2132k, new Function0(this) { // from class: Wd.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditBeneficiaryActivity f10710b;

            {
                this.f10710b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                EditBeneficiaryActivity editBeneficiaryActivity = this.f10710b;
                switch (i10) {
                    case 0:
                        int i11 = EditBeneficiaryActivity.f34202M;
                        return (ModelItemSelection) editBeneficiaryActivity.findViewById(Pd.c.inputPaymentItem);
                    case 1:
                        int i12 = EditBeneficiaryActivity.f34202M;
                        return (ModelNumberInputLayout) editBeneficiaryActivity.findViewById(Pd.c.viewCustomerId);
                    default:
                        int i13 = EditBeneficiaryActivity.f34202M;
                        return (ModelItemSelection) editBeneficiaryActivity.findViewById(Pd.c.inputBiller);
                }
            }
        });
        final int i11 = 1;
        this.f34216v = C2131j.a(enumC2132k, new Function0(this) { // from class: Wd.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditBeneficiaryActivity f10710b;

            {
                this.f10710b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                EditBeneficiaryActivity editBeneficiaryActivity = this.f10710b;
                switch (i11) {
                    case 0:
                        int i12 = EditBeneficiaryActivity.f34202M;
                        return (ModelItemSelection) editBeneficiaryActivity.findViewById(Pd.c.inputPaymentItem);
                    case 1:
                        int i13 = EditBeneficiaryActivity.f34202M;
                        return (ModelNumberInputLayout) editBeneficiaryActivity.findViewById(Pd.c.viewCustomerId);
                    default:
                        int i14 = EditBeneficiaryActivity.f34202M;
                        return (ModelItemSelection) editBeneficiaryActivity.findViewById(Pd.c.inputBiller);
                }
            }
        });
        this.f34217w = new ArrayList();
        this.f34203A = new ArrayList();
    }

    public static final void n(EditBeneficiaryActivity editBeneficiaryActivity, boolean z3, String str) {
        editBeneficiaryActivity.getClass();
        if (i0.W(editBeneficiaryActivity)) {
            if (z3) {
                str = editBeneficiaryActivity.getString(f.qt_beneficifaries_success);
            } else if (str.length() == 0) {
                str = editBeneficiaryActivity.getString(f.qt_beneficifaries_fail);
                Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
            }
            Intrinsics.e(str);
            int i7 = z3 ? r.cv_snackbar_success_default : r.cv_snackbar_fail_default;
            ToastDialog toastDialog = new ToastDialog(editBeneficiaryActivity, t.cv_toast_dialog);
            toastDialog.setMessage(str);
            toastDialog.setTitle((String) null);
            toastDialog.setIcon(i7);
            toastDialog.setIcon((Drawable) null);
            toastDialog.setBackground(0);
            if (z3) {
                editBeneficiaryActivity.f34207L = true;
                toastDialog.setOnDismissListener(new b(editBeneficiaryActivity, 14));
            }
            toastDialog.show(2000L);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f34207L) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        final int i7 = 0;
        n.B(this, ((EditBeneficiaryViewModel) l()).f34426e, this, new Function2(this) { // from class: Wd.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditBeneficiaryActivity f10708b;

            {
                this.f10708b = this;
            }

            /* JADX WARN: Code duplicated, block: B:42:0x00be  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                List<BettingBillerListItemBean> allBillers;
                CloseContactBean closeContactBean;
                EditBeneficiaryActivity editBeneficiaryActivity = this.f10708b;
                BillPaymentHomeParams billPaymentHomeParams = (BillPaymentHomeParams) obj;
                switch (i7) {
                    case 0:
                        BillerListRsp rsp = (BillerListRsp) obj2;
                        int i10 = EditBeneficiaryActivity.f34202M;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        List<BillerListItemBean> list = rsp.data;
                        if (list != null) {
                            editBeneficiaryActivity.u(list, billPaymentHomeParams);
                        }
                        break;
                    case 1:
                        CommonBeanResult rsp2 = (CommonBeanResult) obj2;
                        int i11 = EditBeneficiaryActivity.f34202M;
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        BettingBillerListRsp bettingBillerListRsp = (BettingBillerListRsp) rsp2.data;
                        if (bettingBillerListRsp != null && (allBillers = bettingBillerListRsp.getAllBillers()) != null) {
                            editBeneficiaryActivity.u(allBillers, billPaymentHomeParams);
                        }
                        break;
                    default:
                        PaymentItemListRsp rsp3 = (PaymentItemListRsp) obj2;
                        int i12 = EditBeneficiaryActivity.f34202M;
                        Intrinsics.checkNotNullParameter(rsp3, "rsp");
                        List<PaymentItemBean> list2 = rsp3.data;
                        if (list2 != null) {
                            ArrayList arrayList = new ArrayList();
                            editBeneficiaryActivity.f34203A = arrayList;
                            arrayList.addAll(list2);
                            if (billPaymentHomeParams != null && billPaymentHomeParams.getShowDialog()) {
                                editBeneficiaryActivity.w();
                            }
                            if (editBeneficiaryActivity.f34213j != 0 && (closeContactBean = editBeneficiaryActivity.f34214o) != null && !TextUtils.isEmpty(closeContactBean.billerId) && !TextUtils.isEmpty(closeContactBean.itemId)) {
                                String str = closeContactBean.billerId;
                                String itemId = closeContactBean.itemId;
                                Intrinsics.checkNotNullExpressionValue(itemId, "itemId");
                                if (str == null) {
                                    com.transsnet.palmpay.custom_view.dialog.y yVar = new com.transsnet.palmpay.custom_view.dialog.y(editBeneficiaryActivity);
                                    yVar.f31328f = S6.a.pay_SelectedOutline;
                                    yVar.f31324b = editBeneficiaryActivity.getString(Pd.f.qt_beneficifaries_payment_item_unavailable);
                                    yVar.h();
                                } else if (editBeneficiaryActivity.f34203A.isEmpty()) {
                                    editBeneficiaryActivity.q().h("");
                                    editBeneficiaryActivity.f34205C = null;
                                    com.transsnet.palmpay.custom_view.dialog.y yVar2 = new com.transsnet.palmpay.custom_view.dialog.y(editBeneficiaryActivity);
                                    yVar2.f31328f = S6.a.pay_SelectedOutline;
                                    yVar2.f31324b = editBeneficiaryActivity.getString(Pd.f.qt_beneficifaries_payment_item_unavailable);
                                    yVar2.h();
                                } else {
                                    if (Intrinsics.c(((PaymentItemBean) editBeneficiaryActivity.f34203A.get(0)).billerId, str)) {
                                        int size = editBeneficiaryActivity.f34203A.size();
                                        for (int i13 = 0; i13 < size; i13++) {
                                            if (Intrinsics.c(((PaymentItemBean) editBeneficiaryActivity.f34203A.get(i13)).paymentItemId, itemId)) {
                                                PaymentItemBean paymentItemBean = (PaymentItemBean) editBeneficiaryActivity.f34203A.get(i13);
                                                if (paymentItemBean != null) {
                                                    editBeneficiaryActivity.q().h(paymentItemBean.paymentItemName);
                                                    editBeneficiaryActivity.f34205C = paymentItemBean;
                                                    TextView titleTv = editBeneficiaryActivity.r().getTitleTv();
                                                    if (titleTv != null) {
                                                        titleTv.setText(editBeneficiaryActivity.o(paymentItemBean));
                                                    }
                                                    ModelNumberInputLayout modelNumberInputLayoutR = editBeneficiaryActivity.r();
                                                    String strO = editBeneficiaryActivity.o(paymentItemBean);
                                                    modelNumberInputLayoutR.setHint(strO != null ? strO : "");
                                                }
                                            }
                                        }
                                    } else {
                                        editBeneficiaryActivity.q().h("");
                                        editBeneficiaryActivity.f34205C = null;
                                    }
                                    com.transsnet.palmpay.custom_view.dialog.y yVar3 = new com.transsnet.palmpay.custom_view.dialog.y(editBeneficiaryActivity);
                                    yVar3.f31328f = S6.a.pay_SelectedOutline;
                                    yVar3.f31324b = editBeneficiaryActivity.getString(Pd.f.qt_beneficifaries_payment_item_unavailable);
                                    yVar3.h();
                                }
                            }
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new G(0), true, null, 224);
        final int i10 = 1;
        n.B(this, ((EditBeneficiaryViewModel) l()).f34427f, this, new Function2(this) { // from class: Wd.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditBeneficiaryActivity f10708b;

            {
                this.f10708b = this;
            }

            /* JADX WARN: Code duplicated, block: B:42:0x00be  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                List<BettingBillerListItemBean> allBillers;
                CloseContactBean closeContactBean;
                EditBeneficiaryActivity editBeneficiaryActivity = this.f10708b;
                BillPaymentHomeParams billPaymentHomeParams = (BillPaymentHomeParams) obj;
                switch (i10) {
                    case 0:
                        BillerListRsp rsp = (BillerListRsp) obj2;
                        int i11 = EditBeneficiaryActivity.f34202M;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        List<BillerListItemBean> list = rsp.data;
                        if (list != null) {
                            editBeneficiaryActivity.u(list, billPaymentHomeParams);
                        }
                        break;
                    case 1:
                        CommonBeanResult rsp2 = (CommonBeanResult) obj2;
                        int i12 = EditBeneficiaryActivity.f34202M;
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        BettingBillerListRsp bettingBillerListRsp = (BettingBillerListRsp) rsp2.data;
                        if (bettingBillerListRsp != null && (allBillers = bettingBillerListRsp.getAllBillers()) != null) {
                            editBeneficiaryActivity.u(allBillers, billPaymentHomeParams);
                        }
                        break;
                    default:
                        PaymentItemListRsp rsp3 = (PaymentItemListRsp) obj2;
                        int i13 = EditBeneficiaryActivity.f34202M;
                        Intrinsics.checkNotNullParameter(rsp3, "rsp");
                        List<PaymentItemBean> list2 = rsp3.data;
                        if (list2 != null) {
                            ArrayList arrayList = new ArrayList();
                            editBeneficiaryActivity.f34203A = arrayList;
                            arrayList.addAll(list2);
                            if (billPaymentHomeParams != null && billPaymentHomeParams.getShowDialog()) {
                                editBeneficiaryActivity.w();
                            }
                            if (editBeneficiaryActivity.f34213j != 0 && (closeContactBean = editBeneficiaryActivity.f34214o) != null && !TextUtils.isEmpty(closeContactBean.billerId) && !TextUtils.isEmpty(closeContactBean.itemId)) {
                                String str = closeContactBean.billerId;
                                String itemId = closeContactBean.itemId;
                                Intrinsics.checkNotNullExpressionValue(itemId, "itemId");
                                if (str == null) {
                                    com.transsnet.palmpay.custom_view.dialog.y yVar3 = new com.transsnet.palmpay.custom_view.dialog.y(editBeneficiaryActivity);
                                    yVar3.f31328f = S6.a.pay_SelectedOutline;
                                    yVar3.f31324b = editBeneficiaryActivity.getString(Pd.f.qt_beneficifaries_payment_item_unavailable);
                                    yVar3.h();
                                } else if (editBeneficiaryActivity.f34203A.isEmpty()) {
                                    editBeneficiaryActivity.q().h("");
                                    editBeneficiaryActivity.f34205C = null;
                                    com.transsnet.palmpay.custom_view.dialog.y yVar4 = new com.transsnet.palmpay.custom_view.dialog.y(editBeneficiaryActivity);
                                    yVar4.f31328f = S6.a.pay_SelectedOutline;
                                    yVar4.f31324b = editBeneficiaryActivity.getString(Pd.f.qt_beneficifaries_payment_item_unavailable);
                                    yVar4.h();
                                } else {
                                    if (Intrinsics.c(((PaymentItemBean) editBeneficiaryActivity.f34203A.get(0)).billerId, str)) {
                                        int size = editBeneficiaryActivity.f34203A.size();
                                        for (int i14 = 0; i14 < size; i14++) {
                                            if (Intrinsics.c(((PaymentItemBean) editBeneficiaryActivity.f34203A.get(i14)).paymentItemId, itemId)) {
                                                PaymentItemBean paymentItemBean = (PaymentItemBean) editBeneficiaryActivity.f34203A.get(i14);
                                                if (paymentItemBean != null) {
                                                    editBeneficiaryActivity.q().h(paymentItemBean.paymentItemName);
                                                    editBeneficiaryActivity.f34205C = paymentItemBean;
                                                    TextView titleTv = editBeneficiaryActivity.r().getTitleTv();
                                                    if (titleTv != null) {
                                                        titleTv.setText(editBeneficiaryActivity.o(paymentItemBean));
                                                    }
                                                    ModelNumberInputLayout modelNumberInputLayoutR = editBeneficiaryActivity.r();
                                                    String strO = editBeneficiaryActivity.o(paymentItemBean);
                                                    modelNumberInputLayoutR.setHint(strO != null ? strO : "");
                                                }
                                            }
                                        }
                                    } else {
                                        editBeneficiaryActivity.q().h("");
                                        editBeneficiaryActivity.f34205C = null;
                                    }
                                    com.transsnet.palmpay.custom_view.dialog.y yVar5 = new com.transsnet.palmpay.custom_view.dialog.y(editBeneficiaryActivity);
                                    yVar5.f31328f = S6.a.pay_SelectedOutline;
                                    yVar5.f31324b = editBeneficiaryActivity.getString(Pd.f.qt_beneficifaries_payment_item_unavailable);
                                    yVar5.h();
                                }
                            }
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new G(1), true, null, 224);
        final int i11 = 2;
        n.B(this, ((EditBeneficiaryViewModel) l()).f34428g, this, new Function2(this) { // from class: Wd.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditBeneficiaryActivity f10708b;

            {
                this.f10708b = this;
            }

            /* JADX WARN: Code duplicated, block: B:42:0x00be  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                List<BettingBillerListItemBean> allBillers;
                CloseContactBean closeContactBean;
                EditBeneficiaryActivity editBeneficiaryActivity = this.f10708b;
                BillPaymentHomeParams billPaymentHomeParams = (BillPaymentHomeParams) obj;
                switch (i11) {
                    case 0:
                        BillerListRsp rsp = (BillerListRsp) obj2;
                        int i12 = EditBeneficiaryActivity.f34202M;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        List<BillerListItemBean> list = rsp.data;
                        if (list != null) {
                            editBeneficiaryActivity.u(list, billPaymentHomeParams);
                        }
                        break;
                    case 1:
                        CommonBeanResult rsp2 = (CommonBeanResult) obj2;
                        int i13 = EditBeneficiaryActivity.f34202M;
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        BettingBillerListRsp bettingBillerListRsp = (BettingBillerListRsp) rsp2.data;
                        if (bettingBillerListRsp != null && (allBillers = bettingBillerListRsp.getAllBillers()) != null) {
                            editBeneficiaryActivity.u(allBillers, billPaymentHomeParams);
                        }
                        break;
                    default:
                        PaymentItemListRsp rsp3 = (PaymentItemListRsp) obj2;
                        int i14 = EditBeneficiaryActivity.f34202M;
                        Intrinsics.checkNotNullParameter(rsp3, "rsp");
                        List<PaymentItemBean> list2 = rsp3.data;
                        if (list2 != null) {
                            ArrayList arrayList = new ArrayList();
                            editBeneficiaryActivity.f34203A = arrayList;
                            arrayList.addAll(list2);
                            if (billPaymentHomeParams != null && billPaymentHomeParams.getShowDialog()) {
                                editBeneficiaryActivity.w();
                            }
                            if (editBeneficiaryActivity.f34213j != 0 && (closeContactBean = editBeneficiaryActivity.f34214o) != null && !TextUtils.isEmpty(closeContactBean.billerId) && !TextUtils.isEmpty(closeContactBean.itemId)) {
                                String str = closeContactBean.billerId;
                                String itemId = closeContactBean.itemId;
                                Intrinsics.checkNotNullExpressionValue(itemId, "itemId");
                                if (str == null) {
                                    com.transsnet.palmpay.custom_view.dialog.y yVar5 = new com.transsnet.palmpay.custom_view.dialog.y(editBeneficiaryActivity);
                                    yVar5.f31328f = S6.a.pay_SelectedOutline;
                                    yVar5.f31324b = editBeneficiaryActivity.getString(Pd.f.qt_beneficifaries_payment_item_unavailable);
                                    yVar5.h();
                                } else if (editBeneficiaryActivity.f34203A.isEmpty()) {
                                    editBeneficiaryActivity.q().h("");
                                    editBeneficiaryActivity.f34205C = null;
                                    com.transsnet.palmpay.custom_view.dialog.y yVar6 = new com.transsnet.palmpay.custom_view.dialog.y(editBeneficiaryActivity);
                                    yVar6.f31328f = S6.a.pay_SelectedOutline;
                                    yVar6.f31324b = editBeneficiaryActivity.getString(Pd.f.qt_beneficifaries_payment_item_unavailable);
                                    yVar6.h();
                                } else {
                                    if (Intrinsics.c(((PaymentItemBean) editBeneficiaryActivity.f34203A.get(0)).billerId, str)) {
                                        int size = editBeneficiaryActivity.f34203A.size();
                                        for (int i15 = 0; i15 < size; i15++) {
                                            if (Intrinsics.c(((PaymentItemBean) editBeneficiaryActivity.f34203A.get(i15)).paymentItemId, itemId)) {
                                                PaymentItemBean paymentItemBean = (PaymentItemBean) editBeneficiaryActivity.f34203A.get(i15);
                                                if (paymentItemBean != null) {
                                                    editBeneficiaryActivity.q().h(paymentItemBean.paymentItemName);
                                                    editBeneficiaryActivity.f34205C = paymentItemBean;
                                                    TextView titleTv = editBeneficiaryActivity.r().getTitleTv();
                                                    if (titleTv != null) {
                                                        titleTv.setText(editBeneficiaryActivity.o(paymentItemBean));
                                                    }
                                                    ModelNumberInputLayout modelNumberInputLayoutR = editBeneficiaryActivity.r();
                                                    String strO = editBeneficiaryActivity.o(paymentItemBean);
                                                    modelNumberInputLayoutR.setHint(strO != null ? strO : "");
                                                }
                                            }
                                        }
                                    } else {
                                        editBeneficiaryActivity.q().h("");
                                        editBeneficiaryActivity.f34205C = null;
                                    }
                                    com.transsnet.palmpay.custom_view.dialog.y yVar7 = new com.transsnet.palmpay.custom_view.dialog.y(editBeneficiaryActivity);
                                    yVar7.f31328f = S6.a.pay_SelectedOutline;
                                    yVar7.f31324b = editBeneficiaryActivity.getString(Pd.f.qt_beneficifaries_payment_item_unavailable);
                                    yVar7.h();
                                }
                            }
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new G(2), true, null, 224);
        l lVar = ((EditBeneficiaryViewModel) l()).f34429i;
        if (lVar != null) {
            lVar.e(this, new I(new H(this, this, 0), 0));
        }
        l lVar2 = ((EditBeneficiaryViewModel) l()).f34430j;
        if (lVar2 != null) {
            lVar2.e(this, new I(new H(this, this, 1), 0));
        }
        l lVar3 = ((EditBeneficiaryViewModel) l()).f34431o;
        if (lVar3 != null) {
            lVar3.e(this, new I(new H(this, this, 2), 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(L6.b.ppColorBackgroundDark, this), !isDarkMode());
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewM;
        View viewInflate = getLayoutInflater().inflate(d.qt_activity_edit_beneficiary, (ViewGroup) null, false);
        int i7 = c.inputBiller;
        if (((ModelItemSelection) a.m(i7, viewInflate)) != null) {
            i7 = c.inputPaymentItem;
            if (((ModelItemSelection) a.m(i7, viewInflate)) != null && (viewM = a.m((i7 = c.qaeb_time_remind), viewInflate)) != null) {
                int i10 = e.cltr_area2;
                if (((LinearLayout) a.m(i10, viewM)) != null) {
                    i10 = e.cltr_remind_period_tv;
                    TextView textView = (TextView) a.m(i10, viewM);
                    if (textView != null) {
                        i10 = e.cltr_remind_time_tv;
                        TextView textView2 = (TextView) a.m(i10, viewM);
                        if (textView2 != null) {
                            i10 = e.cltr_switch;
                            if (((SwitchCompat) a.m(i10, viewM)) != null) {
                                i10 = e.cltr_title2;
                                TextView textView3 = (TextView) a.m(i10, viewM);
                                if (textView3 != null) {
                                    i10 = c.qt_reminder_frequency_row;
                                    if (((LinearLayout) a.m(i10, viewM)) != null) {
                                        i10 = c.qt_reminder_time_row;
                                        if (((LinearLayout) a.m(i10, viewM)) != null) {
                                            C0107d c0107d = new C0107d((LinearLayout) viewM, textView, textView2, textView3, 17);
                                            i7 = c.textViewSave;
                                            PpButton ppButton = (PpButton) a.m(i7, viewInflate);
                                            if (ppButton != null) {
                                                i7 = c.titleBar;
                                                PpTitleBar ppTitleBar = (PpTitleBar) a.m(i7, viewInflate);
                                                if (ppTitleBar != null) {
                                                    i7 = c.viewCustomerId;
                                                    if (((ModelNumberInputLayout) a.m(i7, viewInflate)) != null) {
                                                        C0601q c0601q = new C0601q((ConstraintLayout) viewInflate, c0107d, ppButton, ppTitleBar);
                                                        Intrinsics.checkNotNullExpressionValue(c0601q, "inflate(...)");
                                                        return c0601q;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM.getResources().getResourceName(i10)));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final String o(PaymentItemBean paymentItemBean) {
        String str = p070ee.c.f36289a;
        String string = getString(p070ee.c.e(this.f34212i));
        if (paymentItemBean != null && !TextUtils.isEmpty(paymentItemBean.promptText)) {
            return paymentItemBean.promptText;
        }
        BillerListItemBean billerListItemBean = this.f34204B;
        if (TextUtils.isEmpty(billerListItemBean != null ? billerListItemBean.getUserIdTips() : null)) {
            return string;
        }
        BillerListItemBean billerListItemBean2 = this.f34204B;
        if (billerListItemBean2 != null) {
            return billerListItemBean2.getUserIdTips();
        }
        return null;
    }

    @Override // com.transsnet.palmpay.teller.ui.dialog.PickBillerNewDialog.CallBack
    public final void onBillerClick(int i7, BillerListItemBean billerListItemBean) {
        t(billerListItemBean, true);
        q().h("");
        this.f34205C = null;
        TextView titleTv = r().getTitleTv();
        if (titleTv != null) {
            titleTv.setText(o(null));
        }
        ModelNumberInputLayout modelNumberInputLayoutR = r();
        String strO = o(null);
        modelNumberInputLayoutR.setHint(strO != null ? strO : "");
        x();
    }

    @Override // com.transsnet.palmpay.teller.ui.dialog.PickPaymentItemDialog.CallBack
    public final void onPaymentItemClick(PaymentItemBean paymentItemBean) {
        if (paymentItemBean == null) {
            return;
        }
        q().h(paymentItemBean.paymentItemName);
        this.f34205C = paymentItemBean;
        TextView titleTv = r().getTitleTv();
        if (titleTv != null) {
            titleTv.setText(o(paymentItemBean));
        }
        ModelNumberInputLayout modelNumberInputLayoutR = r();
        String strO = o(paymentItemBean);
        if (strO == null) {
            strO = "";
        }
        modelNumberInputLayoutR.setHint(strO);
        x();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        x();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ModelItemSelection p() {
        return (ModelItemSelection) this.f34215p.getValue();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        ((EditBeneficiaryViewModel) l()).d(this.f34212i, false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ModelItemSelection q() {
        return (ModelItemSelection) this.t.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ModelNumberInputLayout r() {
        return (ModelNumberInputLayout) this.f34216v.getValue();
    }

    public final E0 s() {
        E0 e10 = this.f34206H;
        if (e10 != null) {
            return e10;
        }
        Intrinsics.n("timeRemindViewHandler");
        throw null;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        int i7 = 2;
        boolean z3 = true;
        boolean z8 = true;
        final int i10 = 0;
        super.setupView();
        Iterator it = C1850q.h(p(), q()).iterator();
        while (true) {
            String str = "";
            if (!it.hasNext()) {
                TextView titleTv = r().getTitleTv();
                if (titleTv != null) {
                    titleTv.setIncludeFontPadding(false);
                    ViewGroup.LayoutParams layoutParams = titleTv.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    ((ViewGroup.MarginLayoutParams) layoutParams2).height = CommonViewExtKt.getDp(18);
                    titleTv.setLayoutParams(layoutParams2);
                }
                AppCompatAutoCompleteTextView numberEdit = r().getNumberEdit();
                if (numberEdit != null) {
                    numberEdit.setIncludeFontPadding(false);
                    numberEdit.setMinHeight(0);
                    numberEdit.setPadding(0, 0, 0, 0);
                    numberEdit.setTypeface(Typeface.create("sans-serif-medium", 0));
                    ViewGroup.LayoutParams layoutParams3 = numberEdit.getLayoutParams();
                    if (layoutParams3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                    ((ViewGroup.MarginLayoutParams) layoutParams4).height = CommonViewExtKt.getDp(24);
                    ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = CommonViewExtKt.getDp(8);
                    numberEdit.setLayoutParams(layoutParams4);
                }
                TextView errorTv = r().getErrorTv();
                if (errorTv != null) {
                    errorTv.setIncludeFontPadding(false);
                    errorTv.setMinHeight(CommonViewExtKt.getDp(24));
                    errorTv.setPadding(0, CommonViewExtKt.getDp(2), 0, CommonViewExtKt.getDp(4));
                }
                ImageView dividerIv = r().getDividerIv();
                if (dividerIv != null) {
                    dividerIv.setVisibility(8);
                    ViewGroup.LayoutParams layoutParams5 = dividerIv.getLayoutParams();
                    if (layoutParams5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
                    ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = CommonViewExtKt.getDp(11);
                    dividerIv.setLayoutParams(layoutParams6);
                }
                r().setErrorListener(new J(this));
                C0601q c0601q = (C0601q) this.f27334c;
                LinearLayout linearLayout = c0601q != null ? (LinearLayout) c0601q.f8452b.f680b : null;
                Intrinsics.e(linearLayout);
                E0 e10 = new E0(linearLayout, false);
                Intrinsics.checkNotNullParameter(e10, "<set-?>");
                this.f34206H = e10;
                C0601q c0601q2 = (C0601q) this.f27334c;
                if (c0601q2 != null) {
                    LinearLayout linearLayout2 = (LinearLayout) c0601q2.f8452b.f680b;
                    final TextView textView = (TextView) linearLayout2.findViewById(e.cltr_remind_period_tv);
                    final TextView textView2 = (TextView) linearLayout2.findViewById(e.cltr_remind_time_tv);
                    Iterator it2 = C1850q.h(textView, textView2).iterator();
                    while (it2.hasNext()) {
                        ((TextView) it2.next()).setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, a.h(this, S6.a.pay_Arrowdown, null, CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, this), 20.0f), (Drawable) null);
                    }
                    linearLayout2.findViewById(c.qt_reminder_frequency_row).setOnClickListener(new View.OnClickListener() { // from class: Wd.F
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            TextView textView3 = textView;
                            switch (i10) {
                                case 0:
                                    int i11 = EditBeneficiaryActivity.f34202M;
                                    textView3.performClick();
                                    break;
                                default:
                                    int i12 = EditBeneficiaryActivity.f34202M;
                                    textView3.performClick();
                                    break;
                            }
                        }
                    });
                    View viewFindViewById = linearLayout2.findViewById(c.qt_reminder_time_row);
                    final boolean z10 = z8 ? 1 : 0;
                    viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: Wd.F
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            TextView textView3 = textView2;
                            switch (z10) {
                                case 0:
                                    int i11 = EditBeneficiaryActivity.f34202M;
                                    textView3.performClick();
                                    break;
                                default:
                                    int i12 = EditBeneficiaryActivity.f34202M;
                                    textView3.performClick();
                                    break;
                            }
                        }
                    });
                }
                this.f34211g = s().c();
                s().f9330u = new Sd.b(this, 9);
                ARouter.getInstance().inject(this);
                p().f(new E(this, z3 ? 1 : 0));
                q().f(new E(this, i7));
                ModelNumberInputLayout filter = r().setFilter(new InputFilter[]{new Tb.a(0), new Tb.c(32, 0)});
                if (filter != null) {
                    filter.build();
                }
                r().setOnNumberInputListener(new K(this));
                C0601q c0601q3 = (C0601q) this.f27334c;
                if (c0601q3 != null) {
                    c0601q3.f8453c.setOnClickListener(new E(this, 3));
                }
                String str2 = p070ee.c.f36289a;
                this.f34210f = p070ee.c.c(this, this.f34212i);
                if (this.f34213j != 0) {
                    C0601q c0601q4 = (C0601q) this.f27334c;
                    if (c0601q4 != null) {
                        c0601q4.f8454d.setTitle(getString(f.qt_edit_beneficiaries));
                    }
                } else {
                    C0601q c0601q5 = (C0601q) this.f27334c;
                    if (c0601q5 != null) {
                        c0601q5.f8454d.setTitle(getString(f.qt_add_beneficiaries));
                    }
                }
                HashMap map = new HashMap();
                map.put(LogConstants.Autotrack.ELEMENT_TRANS_TYPE, this.f34210f);
                AutoTrackUtil.trackActivityProperties(this, map);
                if (this.f34213j != 0) {
                    CloseContactBean closeContactBean = this.f34214o;
                    if (closeContactBean != null) {
                        r().setNumber(closeContactBean.customerId);
                        E0 e0S = s();
                        boolean z11 = closeContactBean.reminder != 0;
                        SwitchCompat switchCompat = (SwitchCompat) e0S.f9320j.getValue();
                        if (switchCompat != null) {
                            switchCompat.setChecked(z11);
                        }
                        if (closeContactBean.reminder != 0) {
                            E0 e0S2 = s();
                            String remindPeriod = closeContactBean.remindPeriod;
                            Intrinsics.checkNotNullExpressionValue(remindPeriod, "remindPeriod");
                            e0S2.f(remindPeriod);
                            E0 e0S3 = s();
                            String remindTime = closeContactBean.remindTime;
                            Intrinsics.checkNotNullExpressionValue(remindTime, "remindTime");
                            e0S3.g(remindTime);
                        }
                    }
                } else {
                    SwitchCompat switchCompat2 = (SwitchCompat) s().f9320j.getValue();
                    if (switchCompat2 != null) {
                        switchCompat2.setChecked(false);
                    }
                }
                String string = getString(p070ee.c.e(this.f34212i));
                String str3 = str;
                if (string != null) {
                    str3 = string;
                }
                TextView titleTv2 = r().getTitleTv();
                if (titleTv2 != null) {
                    titleTv2.setText(str3);
                }
                r().setHint("Enter ".concat(str3));
                return;
            }
            ModelItemSelection modelItemSelection = (ModelItemSelection) it.next();
            TextView textView3 = (TextView) modelItemSelection.findViewById(s.tvTitle);
            textView3.setIncludeFontPadding(false);
            ViewGroup.LayoutParams layoutParams7 = textView3.getLayoutParams();
            if (layoutParams7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
            ((ViewGroup.MarginLayoutParams) layoutParams8).height = CommonViewExtKt.getDp(18);
            layoutParams8.f15653k = -1;
            ((ViewGroup.MarginLayoutParams) layoutParams8).bottomMargin = 0;
            textView3.setLayoutParams(layoutParams8);
            TextView textView4 = (TextView) modelItemSelection.findViewById(s.tvItem);
            textView4.setIncludeFontPadding(false);
            ViewGroup.LayoutParams layoutParams9 = textView4.getLayoutParams();
            if (layoutParams9 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams10 = (ConstraintLayout.LayoutParams) layoutParams9;
            ((ViewGroup.MarginLayoutParams) layoutParams10).height = CommonViewExtKt.getDp(20);
            layoutParams10.f15650i = -1;
            layoutParams10.f15651j = s.tvTitle;
            layoutParams10.f15655l = -1;
            ((ViewGroup.MarginLayoutParams) layoutParams10).topMargin = CommonViewExtKt.getDp(8);
            textView4.setLayoutParams(layoutParams10);
            View viewFindViewById2 = modelItemSelection.findViewById(s.ivStartIcon);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            ViewGroup.LayoutParams layoutParams11 = viewFindViewById2.getLayoutParams();
            if (layoutParams11 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams12 = (ConstraintLayout.LayoutParams) layoutParams11;
            int i11 = s.tvItem;
            layoutParams12.f15650i = i11;
            layoutParams12.f15655l = i11;
            viewFindViewById2.setLayoutParams(layoutParams12);
            View viewFindViewById3 = modelItemSelection.findViewById(s.vLine);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            ViewGroup.LayoutParams layoutParams13 = viewFindViewById3.getLayoutParams();
            if (layoutParams13 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams14 = (ConstraintLayout.LayoutParams) layoutParams13;
            ((ViewGroup.MarginLayoutParams) layoutParams14).height = CommonViewExtKt.getDp(1);
            ((ViewGroup.MarginLayoutParams) layoutParams14).topMargin = CommonViewExtKt.getDp(11);
            viewFindViewById3.setLayoutParams(layoutParams14);
            IconicsDrawable icon = a.h(this, S6.a.pay_Arrowdown, null, CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, this), 20.0f);
            Intrinsics.checkNotNullExpressionValue(icon, "dropdownArrow(...)");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Bc.f fVar = modelItemSelection.f31035b;
            if (fVar != null) {
                ((ImageView) fVar.f698d).setImageDrawable(icon);
            }
            SpanUtils spanUtils = new SpanUtils();
            CharSequence hint = ((TextView) modelItemSelection.findViewById(s.tvItem)).getHint();
            String string2 = hint != null ? hint.toString() : null;
            if (string2 == null) {
                string2 = "";
            }
            SpannableStringBuilder spannableStringBuilderCreate = spanUtils.append(string2).setFontFamily("sans-serif").setFontSize(CommonViewExtKt.getDp(14)).create();
            if (fVar != null) {
                TextView textView5 = (TextView) fVar.f702i;
                CharSequence charSequence = str;
                if (spannableStringBuilderCreate != null) {
                    charSequence = spannableStringBuilderCreate;
                }
                textView5.setHint(charSequence);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    public final void t(BillerListItemBean billerListItemBean, boolean z3) {
        String billerIcon;
        ImageView startIconView;
        if (i0.W(this) && billerListItemBean != null) {
            if (this.f34204B != null) {
                String billerId = billerListItemBean.getBillerId();
                BillerListItemBean billerListItemBean2 = this.f34204B;
                if (!Intrinsics.c(billerId, billerListItemBean2 != null ? billerListItemBean2.getBillerId() : null)) {
                    r().setNumber("");
                }
            }
            this.f34204B = billerListItemBean;
            p().h(billerListItemBean.getBillerName());
            String institutionLogo = billerListItemBean.getInstitutionLogo();
            if (institutionLogo == null) {
                billerIcon = billerListItemBean.getBillerIcon();
            } else {
                billerIcon = StringsKt.F(institutionLogo) ? null : institutionLogo;
                if (billerIcon == null) {
                    billerIcon = billerListItemBean.getBillerIcon();
                }
            }
            ModelItemSelection modelItemSelectionP = p();
            boolean z8 = billerIcon == null || StringsKt.F(billerIcon);
            Bc.f fVar = modelItemSelectionP.f31035b;
            if (fVar != null) {
                ((ImageView) fVar.f699e).setVisibility(!z8 ? 0 : 8);
            }
            if (billerIcon != null && !StringsKt.F(billerIcon) && (startIconView = p().getStartIconView()) != null) {
                r0.l1(billerIcon, startIconView);
            }
            if (z3) {
                ((EditBeneficiaryViewModel) l()).e(this.f34212i, billerListItemBean.getBillerId(), false);
            }
        }
    }

    public final void u(List list, BillPaymentHomeParams billPaymentHomeParams) {
        EditBeneficiaryActivity editBeneficiaryActivity;
        ArrayList arrayList = new ArrayList();
        this.f34217w = arrayList;
        arrayList.addAll(list);
        if (billPaymentHomeParams == null || !billPaymentHomeParams.getShowDialog()) {
            editBeneficiaryActivity = this;
        } else {
            editBeneficiaryActivity = this;
            PickBillerNewDialog pickBillerNewDialog = new PickBillerNewDialog(editBeneficiaryActivity, this.f34212i, 0, false, 0, 20, null);
            pickBillerNewDialog.setCallBack(this);
            pickBillerNewDialog.show();
            pickBillerNewDialog.setBillers(editBeneficiaryActivity.f34217w);
        }
        if (editBeneficiaryActivity.f34213j == 0) {
            if (editBeneficiaryActivity.f34217w.size() == 1) {
                onBillerClick(0, (BillerListItemBean) editBeneficiaryActivity.f34217w.get(0));
                return;
            }
            return;
        }
        CloseContactBean closeContactBean = editBeneficiaryActivity.f34214o;
        if (closeContactBean == null || TextUtils.isEmpty(closeContactBean.billerId)) {
            return;
        }
        String str = closeContactBean.billerId;
        if (editBeneficiaryActivity.f34217w.isEmpty()) {
            ((EditBeneficiaryViewModel) l()).d(editBeneficiaryActivity.f34212i, false);
        } else {
            int size = editBeneficiaryActivity.f34217w.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (Intrinsics.c(((BillerListItemBean) editBeneficiaryActivity.f34217w.get(i7)).getBillerId(), str)) {
                    t((BillerListItemBean) editBeneficiaryActivity.f34217w.get(i7), false);
                    ((EditBeneficiaryViewModel) l()).e(editBeneficiaryActivity.f34212i, closeContactBean.billerId, false);
                    return;
                }
            }
        }
        y yVar = new y(this);
        yVar.f31328f = S6.a.pay_SelectedOutline;
        yVar.f31324b = getString(f.qt_beneficifaries_biller_unavailable);
        yVar.h();
    }

    public final void v() {
        int iIntValue;
        AddFamilyAccontReq addFamilyAccontReq = new AddFamilyAccontReq();
        addFamilyAccontReq.customerId = r() != null ? r().getNumber() : "";
        PaymentItemBean paymentItemBean = this.f34205C;
        addFamilyAccontReq.itemId = paymentItemBean != null ? paymentItemBean.paymentItemId : null;
        BillerListItemBean billerListItemBean = this.f34204B;
        addFamilyAccontReq.billerName = billerListItemBean != null ? billerListItemBean.getBillerName() : null;
        PaymentItemBean paymentItemBean2 = this.f34205C;
        addFamilyAccontReq.institutionLogo = paymentItemBean2 != null ? paymentItemBean2.institutionLogo : null;
        addFamilyAccontReq.categoryId = this.f34212i;
        addFamilyAccontReq.itemName = paymentItemBean2 != null ? paymentItemBean2.paymentItemName : null;
        BillerListItemBean billerListItemBean2 = this.f34204B;
        addFamilyAccontReq.billerId = billerListItemBean2 != null ? billerListItemBean2.getBillerId() : null;
        addFamilyAccontReq.reminder = s().d() ? 1 : 0;
        String str = s().f9325o;
        addFamilyAccontReq.remindPeriod = str;
        addFamilyAccontReq.remindTime = "week".equals(str) ? com.airbnb.lottie.model.layer.d.l("getDefault(...)", s().f9326p, "toUpperCase(...)") : s().f9326p;
        if (!"day".equals(addFamilyAccontReq.remindPeriod)) {
            iIntValue = 0;
            break;
        }
        String str2 = s().f9326p;
        String[] strArr = m.f39612b;
        Integer[] numArr = m.f39613c;
        int length = strArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                iIntValue = 0;
                break;
            } else {
                if (Intrinsics.c(str2, strArr[i7])) {
                    iIntValue = numArr[i7].intValue();
                    break;
                }
                i7++;
            }
        }
        addFamilyAccontReq.remindHour = iIntValue;
        if (this.f34213j == 0) {
            EditBeneficiaryViewModel editBeneficiaryViewModel = (EditBeneficiaryViewModel) l();
            editBeneficiaryViewModel.getClass();
            p140j8.f.s(editBeneficiaryViewModel, new N0(addFamilyAccontReq, null), editBeneficiaryViewModel.f34430j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        } else {
            CloseContactBean closeContactBean = this.f34214o;
            addFamilyAccontReq.accountId = closeContactBean != null ? closeContactBean.accountId : null;
            EditBeneficiaryViewModel editBeneficiaryViewModel2 = (EditBeneficiaryViewModel) l();
            editBeneficiaryViewModel2.getClass();
            p140j8.f.s(editBeneficiaryViewModel2, new R0(addFamilyAccontReq, null), editBeneficiaryViewModel2.f34431o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    public final void w() {
        PickPaymentItemDialog pickPaymentItemDialog = new PickPaymentItemDialog(this);
        pickPaymentItemDialog.setCallBack(this);
        boolean z3 = false;
        if (BaseApplication.isNG() && (Intrinsics.c(this.f34212i, "2") || Intrinsics.c(this.f34212i, TransType.TRANS_TYPE_AIRTIME_LOAN) || Intrinsics.c(this.f34212i, TransType.TRANS_TYPE_REPAY_CASH_LOAN) || Intrinsics.c(this.f34212i, "14"))) {
            z3 = true;
        }
        pickPaymentItemDialog.setBFavorite(z3);
        pickPaymentItemDialog.show();
        pickPaymentItemDialog.setBiller(this.f34204B);
        pickPaymentItemDialog.setPaymentItems(this.f34203A);
    }

    public final void x() {
        C0601q c0601q;
        PpButton ppButton;
        PpButton ppButton2;
        C0601q c0601q2 = (C0601q) this.f27334c;
        if (c0601q2 != null && (ppButton2 = c0601q2.f8453c) != null) {
            ppButton2.setEnabled(false);
        }
        if (TextUtils.isEmpty(p().getItemValue()) || TextUtils.isEmpty(q().getItemValue()) || TextUtils.isEmpty(r().getNumber()) || !this.f34211g || (c0601q = (C0601q) this.f27334c) == null || (ppButton = c0601q.f8453c) == null) {
            return;
        }
        ppButton.setEnabled(true);
    }
}
