package com.transsnet.palmpay.betting.ui.fragment;

import N8.q0;
import Pa.r0;
import Pd.f;
import Rd.i0;
import Tb.c;
import Vd.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.camera2.internal.P0;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.E;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.m;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.adsdk.widgets.banner.BannerAdView;
import com.transsnet.palmpay.betting.bean.BettingBillerListItemBean;
import com.transsnet.palmpay.betting.ui.dialog.PickBettingBillerDialog;
import com.transsnet.palmpay.betting.ui.fragment.BettingWithdrawHomeFragment;
import com.transsnet.palmpay.betting.viewmodel.BettingWithDrawViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.custom_view.ModelItemSelection;
import com.transsnet.palmpay.custom_view.dialog.ToastDialog;
import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.t;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.bean.BettingWithdrawRecentUserIDReq;
import com.transsnet.palmpay.teller.bean.ChannelDataItemBean;
import com.transsnet.palmpay.teller.bean.CheckBettingValidationReq;
import com.transsnet.palmpay.teller.bean.CreateBettingOrderReq;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderReq;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderRsp;
import com.transsnet.palmpay.teller.bean.PaymentItemBean;
import com.transsnet.palmpay.teller.ui.fragment.BaseBillerFragment;
import com.transsnet.palmpay.util.ScrollViewUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.fastkv.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.D;
import p025ba.k;
import p070ee.b;
import p141j9.C1798f;
import p189me.jessyan.autosize.internal.CancelAdapt;
import p220oa.h;
import p284sb.C2023v;
import p287se.d;
import p323v9.g;
import x9.A;
import x9.u;
import x9.v;
import x9.x;
import x9.y;
import x9.z;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/betting/ui/fragment/BettingWithdrawHomeFragment;", "Lcom/transsnet/palmpay/teller/ui/fragment/BaseBillerFragment;", "Lcom/transsnet/palmpay/betting/viewmodel/BettingWithDrawViewModel;", "LRd/i0;", "Lcom/transsnet/palmpay/betting/ui/dialog/PickBettingBillerDialog$CallBack;", "Landroid/text/TextWatcher;", "Lme/jessyan/autosize/internal/CancelAdapt;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBettingWithdrawHomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BettingWithdrawHomeFragment.kt\ncom/transsnet/palmpay/betting/ui/fragment/BettingWithdrawHomeFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,741:1\n260#2,10:742\n296#2:752\n260#2,10:753\n296#2:763\n260#2,10:764\n296#2:774\n260#2,10:775\n296#2:785\n260#2,10:786\n296#2:796\n*S KotlinDebug\n*F\n+ 1 BettingWithdrawHomeFragment.kt\ncom/transsnet/palmpay/betting/ui/fragment/BettingWithdrawHomeFragment\n*L\n188#1:742,10\n188#1:752\n205#1:753,10\n205#1:763\n212#1:764,10\n212#1:774\n219#1:775,10\n219#1:785\n226#1:786,10\n226#1:796\n*E\n"})
public final class BettingWithdrawHomeFragment extends BaseBillerFragment<BettingWithDrawViewModel, i0> implements PickBettingBillerDialog.CallBack, TextWatcher, CancelAdapt {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public BettingBillerListItemBean f26730B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public PaymentItemBean f26731C;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f26733L;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f26735Q;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ChannelDataItemBean f26737w;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f26736v = TransType.TRANS_TYPE_MERCHANT_PAYMENT;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ArrayList f26729A = new ArrayList();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f26732H = Long.MAX_VALUE;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public String f26734M = "";

    public final void A() {
        PickBettingBillerDialog pickBettingBillerDialog = new PickBettingBillerDialog(requireContext(), m());
        String string = getString(a.qt_betting);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        pickBettingBillerDialog.setBusinessName(string);
        pickBettingBillerDialog.setCallBack(this);
        pickBettingBillerDialog.show();
        pickBettingBillerDialog.setBillers(this.f26729A);
        BettingBillerListItemBean bettingBillerListItemBean = this.f26730B;
        if (bettingBillerListItemBean != null) {
            pickBettingBillerDialog.setSelectBiller(bettingBillerListItemBean);
        }
    }

    public final void B(String biller) {
        Intrinsics.checkNotNullParameter(biller, "biller");
        Context contextRequireContext = requireContext();
        String string = getString(f.qt_service_temporarily_unavailable_3, biller);
        ToastDialog toastDialog = new ToastDialog(contextRequireContext, t.cv_toast_dialog);
        toastDialog.setMessage(string);
        toastDialog.setTitle((String) null);
        toastDialog.setIcon(0);
        toastDialog.setIcon((Drawable) null);
        toastDialog.setBackground(0);
        toastDialog.show(4000L);
    }

    public final void C() {
        PpAmountEditText ppAmountEditText;
        PpAmountEditText ppAmountEditText2;
        TextView textView;
        ModelNumberInputLayout modelNumberInputLayout;
        ModelNumberInputLayout modelNumberInputLayout2;
        ModelItemSelection modelItemSelection;
        TextView textView2;
        i0 i0Var = (i0) this.f27335j;
        if (i0Var != null && (textView2 = i0Var.f8348g) != null) {
            textView2.setEnabled(false);
        }
        i0 i0Var2 = (i0) this.f27335j;
        String amountString = null;
        if (TextUtils.isEmpty((i0Var2 == null || (modelItemSelection = i0Var2.f8353v) == null) ? null : modelItemSelection.getItemValue())) {
            return;
        }
        i0 i0Var3 = (i0) this.f27335j;
        if (TextUtils.isEmpty((i0Var3 == null || (modelNumberInputLayout2 = i0Var3.f8341A) == null) ? null : modelNumberInputLayout2.getNumber())) {
            return;
        }
        if (this.f26735Q) {
            i0 i0Var4 = (i0) this.f27335j;
            if (i0Var4 != null && (modelNumberInputLayout = i0Var4.f8354w) != null) {
                amountString = modelNumberInputLayout.getNumber();
            }
            if (TextUtils.isEmpty(amountString)) {
                return;
            }
        } else {
            i0 i0Var5 = (i0) this.f27335j;
            if (i0Var5 != null && (ppAmountEditText2 = i0Var5.f8352p) != null) {
                amountString = ppAmountEditText2.getAmountString();
            }
            if (TextUtils.isEmpty(amountString)) {
                return;
            }
            i0 i0Var6 = (i0) this.f27335j;
            if (((i0Var6 == null || (ppAmountEditText = i0Var6.f8352p) == null) ? 0L : ppAmountEditText.getLongAmount()) <= 0) {
                return;
            }
        }
        i0 i0Var7 = (i0) this.f27335j;
        if (i0Var7 == null || (textView = i0Var7.f8348g) == null) {
            return;
        }
        textView.setEnabled(true);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        ModelNumberInputLayout filter;
        ModelNumberInputLayout filter2;
        final int i7 = 1;
        final int i10 = 0;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f26737w = (ChannelDataItemBean) arguments.getParcelable("billpayment_data");
        }
        i0 i0Var = (i0) this.f27335j;
        if (i0Var != null) {
            i0Var.f8353v.setOnClickListener(new View.OnClickListener(this) { // from class: v9.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BettingWithdrawHomeFragment f43125b;

                {
                    this.f43125b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BettingWithDrawViewModel bettingWithDrawViewModel;
                    Integer status;
                    int i11 = 0;
                    BettingWithdrawHomeFragment bettingWithdrawHomeFragment = this.f43125b;
                    switch (i10) {
                        case 0:
                            if (!bettingWithdrawHomeFragment.f26729A.isEmpty()) {
                                bettingWithdrawHomeFragment.A();
                            } else {
                                BettingWithDrawViewModel bettingWithDrawViewModel2 = (BettingWithDrawViewModel) bettingWithdrawHomeFragment.f27333i;
                                if (bettingWithDrawViewModel2 != null) {
                                    b function = new b(bettingWithdrawHomeFragment, i11);
                                    Intrinsics.checkNotNullParameter(function, "function");
                                    x xVar = new x(1, null);
                                    l lVar = bettingWithDrawViewModel2.f26785g;
                                    lVar.f27356m = function;
                                    Unit unit = Unit.f38893a;
                                    p140j8.f.v(bettingWithDrawViewModel2, xVar, lVar, 0L);
                                }
                            }
                            break;
                        default:
                            if (!r0.U0()) {
                                if (!BaseApplication.hasLogin()) {
                                    Pa.i0.K(null, null);
                                } else {
                                    BettingBillerListItemBean bettingBillerListItemBean = bettingWithdrawHomeFragment.f26730B;
                                    if (bettingBillerListItemBean != null && ((status = bettingBillerListItemBean.getStatus()) == null || status.intValue() != 1)) {
                                        String billerName = bettingBillerListItemBean.getBillerName();
                                        if (billerName == null) {
                                            billerName = "";
                                        }
                                        bettingWithdrawHomeFragment.B(billerName);
                                    } else {
                                        if (!bettingWithdrawHomeFragment.f26735Q) {
                                            i0 i0Var2 = (i0) bettingWithdrawHomeFragment.f27335j;
                                            long longAmount = i0Var2 != null ? i0Var2.f8352p.getLongAmount() : 0L;
                                            if (longAmount <= 0) {
                                                ToastUtils.showLong(bettingWithdrawHomeFragment.getString(f.qt_msg_amount_above_desc, r0.B(0L, false)), new Object[0]);
                                            } else if (longAmount < bettingWithdrawHomeFragment.f26733L || longAmount > bettingWithdrawHomeFragment.f26732H) {
                                                i0 i0Var3 = (i0) bettingWithdrawHomeFragment.f27335j;
                                                ScrollViewUtils.scrollToView(i0Var3 != null ? i0Var3.f8350j : null, i0Var3 != null ? i0Var3.f8352p : null);
                                                i0 i0Var4 = (i0) bettingWithdrawHomeFragment.f27335j;
                                                if (i0Var4 != null) {
                                                    i0Var4.f8352p.setError(bettingWithdrawHomeFragment.getString(f.qt_msg_amount_range_desc, r0.B(bettingWithdrawHomeFragment.f26733L, false), r0.B(bettingWithdrawHomeFragment.f26732H, false)));
                                                }
                                            }
                                        }
                                        if (!bettingWithdrawHomeFragment.f26735Q) {
                                            BettingBillerListItemBean bettingBillerListItemBean2 = bettingWithdrawHomeFragment.f26730B;
                                            String billerId = bettingBillerListItemBean2 != null ? bettingBillerListItemBean2.getBillerId() : null;
                                            BettingBillerListItemBean bettingBillerListItemBean3 = bettingWithdrawHomeFragment.f26730B;
                                            String billerName2 = bettingBillerListItemBean3 != null ? bettingBillerListItemBean3.getBillerName() : null;
                                            i0 i0Var5 = (i0) bettingWithdrawHomeFragment.f27335j;
                                            Long lValueOf = Long.valueOf(r0.f(i0Var5 != null ? i0Var5.f8352p.getDoubleAmount() : 0.0d));
                                            String currency = BaseApplication.getCurrency();
                                            i0 i0Var6 = (i0) bettingWithdrawHomeFragment.f27335j;
                                            String number = i0Var6 != null ? i0Var6.f8341A.getNumber() : null;
                                            BettingBillerListItemBean bettingBillerListItemBean4 = bettingWithdrawHomeFragment.f26730B;
                                            String billerIcon = bettingBillerListItemBean4 != null ? bettingBillerListItemBean4.getBillerIcon() : null;
                                            PaymentItemBean paymentItemBean = bettingWithdrawHomeFragment.f26731C;
                                            CreateBettingOrderReq req = new CreateBettingOrderReq(billerId, billerName2, lValueOf, currency, number, billerIcon, paymentItemBean != null ? paymentItemBean.paymentItemId : null, paymentItemBean != null ? paymentItemBean.paymentItemName : null, TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW, false, null, 1536, null);
                                            BettingWithDrawViewModel bettingWithDrawViewModel3 = (BettingWithDrawViewModel) bettingWithdrawHomeFragment.f27333i;
                                            if (bettingWithDrawViewModel3 != null) {
                                                Intrinsics.checkNotNullParameter(req, "req");
                                                p140j8.f.s(bettingWithDrawViewModel3, new y(req, null), bettingWithDrawViewModel3.f26790v, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                            }
                                            break;
                                        } else {
                                            BettingBillerListItemBean bettingBillerListItemBean5 = bettingWithdrawHomeFragment.f26730B;
                                            if (bettingBillerListItemBean5 != null && (bettingWithDrawViewModel = (BettingWithDrawViewModel) bettingWithdrawHomeFragment.f27333i) != null) {
                                                String billerId2 = bettingBillerListItemBean5.getBillerId();
                                                i0 i0Var7 = (i0) bettingWithdrawHomeFragment.f27335j;
                                                CheckBettingValidationReq req2 = new CheckBettingValidationReq(billerId2, i0Var7 != null ? i0Var7.f8341A.getNumber() : null);
                                                Intrinsics.checkNotNullParameter(req2, "req");
                                                p140j8.f.s(bettingWithDrawViewModel, new v(req2, null), bettingWithDrawViewModel.f26787j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                            break;
                    }
                }
            });
        }
        C();
        i0 i0Var2 = (i0) this.f27335j;
        if (i0Var2 != null && (filter2 = i0Var2.f8341A.setFilter(new InputFilter[]{new Tb.a(0), new c(32, 0)})) != null) {
            filter2.build();
        }
        i0 i0Var3 = (i0) this.f27335j;
        if (i0Var3 != null && (filter = i0Var3.f8354w.setFilter(new InputFilter[]{new c(32, 0)})) != null) {
            filter.build();
        }
        i0 i0Var4 = (i0) this.f27335j;
        if (i0Var4 != null) {
            i0Var4.f8341A.setOnNumberInputListener(new p323v9.f(this));
        }
        i0 i0Var5 = (i0) this.f27335j;
        if (i0Var5 != null) {
            i0Var5.f8354w.setOnNumberInputListener(new g(this));
        }
        i0 i0Var6 = (i0) this.f27335j;
        if (i0Var6 != null) {
            i0Var6.f8352p.setTextInputListener(new d(this, 19));
        }
        i0 i0Var7 = (i0) this.f27335j;
        if (i0Var7 != null) {
            i0Var7.f8348g.setOnClickListener(new View.OnClickListener(this) { // from class: v9.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BettingWithdrawHomeFragment f43125b;

                {
                    this.f43125b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BettingWithDrawViewModel bettingWithDrawViewModel;
                    Integer status;
                    int i11 = 0;
                    BettingWithdrawHomeFragment bettingWithdrawHomeFragment = this.f43125b;
                    switch (i7) {
                        case 0:
                            if (!bettingWithdrawHomeFragment.f26729A.isEmpty()) {
                                bettingWithdrawHomeFragment.A();
                            } else {
                                BettingWithDrawViewModel bettingWithDrawViewModel2 = (BettingWithDrawViewModel) bettingWithdrawHomeFragment.f27333i;
                                if (bettingWithDrawViewModel2 != null) {
                                    b function = new b(bettingWithdrawHomeFragment, i11);
                                    Intrinsics.checkNotNullParameter(function, "function");
                                    x xVar = new x(1, null);
                                    l lVar = bettingWithDrawViewModel2.f26785g;
                                    lVar.f27356m = function;
                                    Unit unit = Unit.f38893a;
                                    p140j8.f.v(bettingWithDrawViewModel2, xVar, lVar, 0L);
                                }
                            }
                            break;
                        default:
                            if (!r0.U0()) {
                                if (!BaseApplication.hasLogin()) {
                                    Pa.i0.K(null, null);
                                } else {
                                    BettingBillerListItemBean bettingBillerListItemBean = bettingWithdrawHomeFragment.f26730B;
                                    if (bettingBillerListItemBean != null && ((status = bettingBillerListItemBean.getStatus()) == null || status.intValue() != 1)) {
                                        String billerName = bettingBillerListItemBean.getBillerName();
                                        if (billerName == null) {
                                            billerName = "";
                                        }
                                        bettingWithdrawHomeFragment.B(billerName);
                                    } else {
                                        if (!bettingWithdrawHomeFragment.f26735Q) {
                                            i0 i0Var8 = (i0) bettingWithdrawHomeFragment.f27335j;
                                            long longAmount = i0Var8 != null ? i0Var8.f8352p.getLongAmount() : 0L;
                                            if (longAmount <= 0) {
                                                ToastUtils.showLong(bettingWithdrawHomeFragment.getString(f.qt_msg_amount_above_desc, r0.B(0L, false)), new Object[0]);
                                            } else if (longAmount < bettingWithdrawHomeFragment.f26733L || longAmount > bettingWithdrawHomeFragment.f26732H) {
                                                i0 i0Var9 = (i0) bettingWithdrawHomeFragment.f27335j;
                                                ScrollViewUtils.scrollToView(i0Var9 != null ? i0Var9.f8350j : null, i0Var9 != null ? i0Var9.f8352p : null);
                                                i0 i0Var10 = (i0) bettingWithdrawHomeFragment.f27335j;
                                                if (i0Var10 != null) {
                                                    i0Var10.f8352p.setError(bettingWithdrawHomeFragment.getString(f.qt_msg_amount_range_desc, r0.B(bettingWithdrawHomeFragment.f26733L, false), r0.B(bettingWithdrawHomeFragment.f26732H, false)));
                                                }
                                            }
                                        }
                                        if (!bettingWithdrawHomeFragment.f26735Q) {
                                            BettingBillerListItemBean bettingBillerListItemBean2 = bettingWithdrawHomeFragment.f26730B;
                                            String billerId = bettingBillerListItemBean2 != null ? bettingBillerListItemBean2.getBillerId() : null;
                                            BettingBillerListItemBean bettingBillerListItemBean3 = bettingWithdrawHomeFragment.f26730B;
                                            String billerName2 = bettingBillerListItemBean3 != null ? bettingBillerListItemBean3.getBillerName() : null;
                                            i0 i0Var11 = (i0) bettingWithdrawHomeFragment.f27335j;
                                            Long lValueOf = Long.valueOf(r0.f(i0Var11 != null ? i0Var11.f8352p.getDoubleAmount() : 0.0d));
                                            String currency = BaseApplication.getCurrency();
                                            i0 i0Var12 = (i0) bettingWithdrawHomeFragment.f27335j;
                                            String number = i0Var12 != null ? i0Var12.f8341A.getNumber() : null;
                                            BettingBillerListItemBean bettingBillerListItemBean4 = bettingWithdrawHomeFragment.f26730B;
                                            String billerIcon = bettingBillerListItemBean4 != null ? bettingBillerListItemBean4.getBillerIcon() : null;
                                            PaymentItemBean paymentItemBean = bettingWithdrawHomeFragment.f26731C;
                                            CreateBettingOrderReq req = new CreateBettingOrderReq(billerId, billerName2, lValueOf, currency, number, billerIcon, paymentItemBean != null ? paymentItemBean.paymentItemId : null, paymentItemBean != null ? paymentItemBean.paymentItemName : null, TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW, false, null, 1536, null);
                                            BettingWithDrawViewModel bettingWithDrawViewModel3 = (BettingWithDrawViewModel) bettingWithdrawHomeFragment.f27333i;
                                            if (bettingWithDrawViewModel3 != null) {
                                                Intrinsics.checkNotNullParameter(req, "req");
                                                p140j8.f.s(bettingWithDrawViewModel3, new y(req, null), bettingWithDrawViewModel3.f26790v, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                            }
                                            break;
                                        } else {
                                            BettingBillerListItemBean bettingBillerListItemBean5 = bettingWithdrawHomeFragment.f26730B;
                                            if (bettingBillerListItemBean5 != null && (bettingWithDrawViewModel = (BettingWithDrawViewModel) bettingWithdrawHomeFragment.f27333i) != null) {
                                                String billerId2 = bettingBillerListItemBean5.getBillerId();
                                                i0 i0Var13 = (i0) bettingWithdrawHomeFragment.f27335j;
                                                CheckBettingValidationReq req2 = new CheckBettingValidationReq(billerId2, i0Var13 != null ? i0Var13.f8341A.getNumber() : null);
                                                Intrinsics.checkNotNullParameter(req2, "req");
                                                p140j8.f.s(bettingWithDrawViewModel, new v(req2, null), bettingWithDrawViewModel.f26787j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                            break;
                    }
                }
            });
        }
        HashMap map = new HashMap();
        Object obj = b.f36288a;
        map.put(LogConstants.Autotrack.ELEMENT_TRANS_TYPE, b.b(this.f26736v));
        AutoTrackUtil.trackActivityProperties(getActivity(), map);
        i0 i0Var8 = (i0) this.f27335j;
        AutoTrackUtil.trackViewProperties(i0Var8 != null ? i0Var8.f8348g : null, map);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        final int i7 = 1;
        final int i10 = 0;
        if (this.f26737w == null) {
            this.f26737w = new ChannelDataItemBean();
        }
        ChannelDataItemBean channelDataItemBean = this.f26737w;
        if (channelDataItemBean != null) {
            String billerId = channelDataItemBean.getBillerId();
            channelDataItemBean.getPaymentItemId();
            z(billerId, channelDataItemBean.getCustomerId(), false);
        }
        BettingWithDrawViewModel bettingWithDrawViewModel = (BettingWithDrawViewModel) this.f27333i;
        if (bettingWithDrawViewModel != null) {
            u function = new u(i10);
            Intrinsics.checkNotNullParameter(function, "function");
            x xVar = new x(1, null);
            l lVar = bettingWithDrawViewModel.f26785g;
            lVar.f27356m = function;
            Unit unit = Unit.f38893a;
            p140j8.f.v(bettingWithDrawViewModel, xVar, lVar, 0L);
        }
        i0 i0Var = (i0) this.f27335j;
        if (i0Var != null) {
            BannerAdView bannerAdView = i0Var.f8343b;
            i0 i0Var2 = (i0) this.f27335j;
            bannerAdView.setAdListener(new com.chuanyi.ad.a(i0Var2 != null ? i0Var2.f8343b : null, "BettingWithdraw"));
        }
        BettingWithDrawViewModel bettingWithDrawViewModel2 = (BettingWithDrawViewModel) this.f27333i;
        n.B(this, bettingWithDrawViewModel2 != null ? bettingWithDrawViewModel2.f26785g : null, this, new Function2(this) { // from class: v9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BettingWithdrawHomeFragment f43129b;

            {
                this.f43129b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ChannelDataItemBean channelDataItemBean2;
                BettingWithDrawViewModel bettingWithDrawViewModel3;
                switch (i10) {
                    case 0:
                        Function0 function0 = (Function0) obj;
                        CommonListResultV2 rsp = (CommonListResultV2) obj2;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        Collection collection = rsp.data;
                        BettingWithdrawHomeFragment bettingWithdrawHomeFragment = this.f43129b;
                        if (collection != null) {
                            ArrayList arrayList = new ArrayList();
                            bettingWithdrawHomeFragment.f26729A = arrayList;
                            arrayList.addAll(collection);
                            ChannelDataItemBean channelDataItemBean3 = bettingWithdrawHomeFragment.f26737w;
                            if (channelDataItemBean3 != null) {
                                String billerId2 = channelDataItemBean3.getBillerId();
                                channelDataItemBean3.getPaymentItemId();
                                String customerId = channelDataItemBean3.getCustomerId();
                                channelDataItemBean3.getBusinessAmount();
                                bettingWithdrawHomeFragment.z(billerId2, customerId, true);
                            }
                            if (!bettingWithdrawHomeFragment.f26729A.isEmpty() && (((channelDataItemBean2 = bettingWithdrawHomeFragment.f26737w) == null || TextUtils.isEmpty(channelDataItemBean2.getBillerName())) && (bettingWithDrawViewModel3 = (BettingWithDrawViewModel) bettingWithdrawHomeFragment.f27333i) != null)) {
                                p140j8.f.s(bettingWithDrawViewModel3, new z(bettingWithDrawViewModel3, null), bettingWithDrawViewModel3.f26786i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                            }
                            i0 i0Var3 = (i0) bettingWithdrawHomeFragment.f27335j;
                            if (i0Var3 != null) {
                                h.s(i0Var3.f8349i, !bettingWithdrawHomeFragment.f26729A.isEmpty());
                            }
                        }
                        if (function0 != null) {
                            function0.invoke();
                        }
                        break;
                    default:
                        CreateTellerOrderReq createTellerOrderReq = (CreateTellerOrderReq) obj;
                        CreateTellerOrderRsp rsp2 = (CreateTellerOrderRsp) obj2;
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        BettingWithdrawHomeFragment bettingWithdrawHomeFragment2 = this.f43129b;
                        bettingWithdrawHomeFragment2.getClass();
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        if (bettingWithdrawHomeFragment2.f26731C == null) {
                            bettingWithdrawHomeFragment2.f26731C = new PaymentItemBean();
                        }
                        PaymentItemBean paymentItemBean = bettingWithdrawHomeFragment2.f26731C;
                        if (paymentItemBean != null) {
                            paymentItemBean.categoryId = bettingWithdrawHomeFragment2.f26736v;
                            BettingBillerListItemBean bettingBillerListItemBean = bettingWithdrawHomeFragment2.f26730B;
                            paymentItemBean.billerName = bettingBillerListItemBean != null ? bettingBillerListItemBean.getBillerName() : null;
                            BettingBillerListItemBean bettingBillerListItemBean2 = bettingWithdrawHomeFragment2.f26730B;
                            paymentItemBean.billerId = bettingBillerListItemBean2 != null ? bettingBillerListItemBean2.getBillerId() : null;
                            paymentItemBean.paymentItemId = "";
                            paymentItemBean.institutionLogo = "";
                            paymentItemBean.paymentItemName = "";
                        }
                        ARouter.getInstance().build("/quick_teller/betting_withdraw_confirm_payment_order").withSerializable("payment_item", bettingWithdrawHomeFragment2.f26731C).withString("customerId", bettingWithdrawHomeFragment2.x()).withString("fullName", createTellerOrderReq != null ? createTellerOrderReq.fullName : null).withString("reference_id", createTellerOrderReq != null ? createTellerOrderReq.referenceId : null).withString("key_address", createTellerOrderReq != null ? createTellerOrderReq.address : null).withLong("amount", createTellerOrderReq != null ? createTellerOrderReq.businessAmount : 0L).withString("orderNo", rsp2.data.orderNo).navigation();
                        break;
                }
                return Unit.f38893a;
            }
        }, new D(29), false, null, 240);
        BettingWithDrawViewModel bettingWithDrawViewModel3 = (BettingWithDrawViewModel) this.f27333i;
        l lVar2 = bettingWithDrawViewModel3 != null ? bettingWithDrawViewModel3.f26786i : null;
        if (lVar2 != null) {
            lVar2.e(this, new C2023v(new p323v9.h(this, this, i10), 13));
        }
        BettingWithDrawViewModel bettingWithDrawViewModel4 = (BettingWithDrawViewModel) this.f27333i;
        n.B(this, bettingWithDrawViewModel4 != null ? bettingWithDrawViewModel4.f26784f : null, this, new Ab.y(28), new p323v9.d(i10), false, null, 224);
        BettingWithDrawViewModel bettingWithDrawViewModel5 = (BettingWithDrawViewModel) this.f27333i;
        l lVar3 = bettingWithDrawViewModel5 != null ? bettingWithDrawViewModel5.f26790v : null;
        if (lVar3 != null) {
            lVar3.e(this, new C2023v(new p323v9.h(this, this, i7), 13));
        }
        BettingWithDrawViewModel bettingWithDrawViewModel6 = (BettingWithDrawViewModel) this.f27333i;
        l lVar4 = bettingWithDrawViewModel6 != null ? bettingWithDrawViewModel6.f26787j : null;
        if (lVar4 != null) {
            lVar4.e(this, new C2023v(new p323v9.h(this, this, 2), 13));
        }
        BettingWithDrawViewModel bettingWithDrawViewModel7 = (BettingWithDrawViewModel) this.f27333i;
        l lVar5 = bettingWithDrawViewModel7 != null ? bettingWithDrawViewModel7.t : null;
        if (lVar5 != null) {
            lVar5.e(this, new C2023v(new p323v9.h(this, this, 3), 13));
        }
        BettingWithDrawViewModel bettingWithDrawViewModel8 = (BettingWithDrawViewModel) this.f27333i;
        l lVar6 = bettingWithDrawViewModel8 != null ? bettingWithDrawViewModel8.f26789p : null;
        if (lVar6 != null) {
            lVar6.e(this, new C2023v(new p323v9.h(this, this, 4), 13));
        }
        BettingWithDrawViewModel bettingWithDrawViewModel9 = (BettingWithDrawViewModel) this.f27333i;
        n.B(this, bettingWithDrawViewModel9 != null ? bettingWithDrawViewModel9.f26788o : null, this, new Function2(this) { // from class: v9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BettingWithdrawHomeFragment f43129b;

            {
                this.f43129b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ChannelDataItemBean channelDataItemBean2;
                BettingWithDrawViewModel bettingWithDrawViewModel10;
                switch (i7) {
                    case 0:
                        Function0 function0 = (Function0) obj;
                        CommonListResultV2 rsp = (CommonListResultV2) obj2;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        Collection collection = rsp.data;
                        BettingWithdrawHomeFragment bettingWithdrawHomeFragment = this.f43129b;
                        if (collection != null) {
                            ArrayList arrayList = new ArrayList();
                            bettingWithdrawHomeFragment.f26729A = arrayList;
                            arrayList.addAll(collection);
                            ChannelDataItemBean channelDataItemBean3 = bettingWithdrawHomeFragment.f26737w;
                            if (channelDataItemBean3 != null) {
                                String billerId2 = channelDataItemBean3.getBillerId();
                                channelDataItemBean3.getPaymentItemId();
                                String customerId = channelDataItemBean3.getCustomerId();
                                channelDataItemBean3.getBusinessAmount();
                                bettingWithdrawHomeFragment.z(billerId2, customerId, true);
                            }
                            if (!bettingWithdrawHomeFragment.f26729A.isEmpty() && (((channelDataItemBean2 = bettingWithdrawHomeFragment.f26737w) == null || TextUtils.isEmpty(channelDataItemBean2.getBillerName())) && (bettingWithDrawViewModel10 = (BettingWithDrawViewModel) bettingWithdrawHomeFragment.f27333i) != null)) {
                                p140j8.f.s(bettingWithDrawViewModel10, new z(bettingWithDrawViewModel10, null), bettingWithDrawViewModel10.f26786i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                            }
                            i0 i0Var3 = (i0) bettingWithdrawHomeFragment.f27335j;
                            if (i0Var3 != null) {
                                h.s(i0Var3.f8349i, !bettingWithdrawHomeFragment.f26729A.isEmpty());
                            }
                        }
                        if (function0 != null) {
                            function0.invoke();
                        }
                        break;
                    default:
                        CreateTellerOrderReq createTellerOrderReq = (CreateTellerOrderReq) obj;
                        CreateTellerOrderRsp rsp2 = (CreateTellerOrderRsp) obj2;
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        BettingWithdrawHomeFragment bettingWithdrawHomeFragment2 = this.f43129b;
                        bettingWithdrawHomeFragment2.getClass();
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        if (bettingWithdrawHomeFragment2.f26731C == null) {
                            bettingWithdrawHomeFragment2.f26731C = new PaymentItemBean();
                        }
                        PaymentItemBean paymentItemBean = bettingWithdrawHomeFragment2.f26731C;
                        if (paymentItemBean != null) {
                            paymentItemBean.categoryId = bettingWithdrawHomeFragment2.f26736v;
                            BettingBillerListItemBean bettingBillerListItemBean = bettingWithdrawHomeFragment2.f26730B;
                            paymentItemBean.billerName = bettingBillerListItemBean != null ? bettingBillerListItemBean.getBillerName() : null;
                            BettingBillerListItemBean bettingBillerListItemBean2 = bettingWithdrawHomeFragment2.f26730B;
                            paymentItemBean.billerId = bettingBillerListItemBean2 != null ? bettingBillerListItemBean2.getBillerId() : null;
                            paymentItemBean.paymentItemId = "";
                            paymentItemBean.institutionLogo = "";
                            paymentItemBean.paymentItemName = "";
                        }
                        ARouter.getInstance().build("/quick_teller/betting_withdraw_confirm_payment_order").withSerializable("payment_item", bettingWithdrawHomeFragment2.f26731C).withString("customerId", bettingWithdrawHomeFragment2.x()).withString("fullName", createTellerOrderReq != null ? createTellerOrderReq.fullName : null).withString("reference_id", createTellerOrderReq != null ? createTellerOrderReq.referenceId : null).withString("key_address", createTellerOrderReq != null ? createTellerOrderReq.address : null).withLong("amount", createTellerOrderReq != null ? createTellerOrderReq.businessAmount : 0L).withString("orderNo", rsp2.data.orderNo).navigation();
                        break;
                }
                return Unit.f38893a;
            }
        }, new p323v9.d(i7), false, null, 240);
    }

    @Override // com.transsnet.palmpay.betting.ui.dialog.PickBettingBillerDialog.CallBack
    public final void onDialogBillerClick(BettingBillerListItemBean bettingBillerListItemBean) {
        y(bettingBillerListItemBean, true);
        this.f26731C = null;
        BettingWithDrawViewModel bettingWithDrawViewModel = (BettingWithDrawViewModel) this.f27333i;
        if (bettingWithDrawViewModel != null) {
            BettingBillerListItemBean bettingBillerListItemBean2 = this.f26730B;
            BettingWithdrawRecentUserIDReq req = new BettingWithdrawRecentUserIDReq(bettingBillerListItemBean2 != null ? bettingBillerListItemBean2.getBillerId() : null, this.f26736v, "");
            C1798f function = new C1798f(this, 23);
            Intrinsics.checkNotNullParameter(req, "req");
            Intrinsics.checkNotNullParameter(function, "function");
            A a3 = new A(req, null);
            l lVar = bettingWithDrawViewModel.f26784f;
            lVar.f27356m = function;
            Unit unit = Unit.f38893a;
            p140j8.f.v(bettingWithDrawViewModel, a3, lVar, 0L);
        }
    }

    @Override // com.transsnet.palmpay.teller.ui.fragment.BaseBillerFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        TextView textView;
        super.onResume();
        i0 i0Var = (i0) this.f27335j;
        if (i0Var == null || (textView = i0Var.f8346e) == null) {
            return;
        }
        textView.setText(BaseApplication.get().getUser().getFullName());
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        C();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(Pd.d.qt_fragment_home_withdraw_betting, viewGroup, false);
        int i7 = Pd.c.adBettingBanner;
        BannerAdView bannerAdView = (BannerAdView) p059e1.a.m(i7, viewInflate);
        if (bannerAdView != null) {
            i7 = Pd.c.amountWithdrawRoot;
            LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
            if (linearLayout != null) {
                i7 = Pd.c.authNameNotPass;
                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView != null) {
                    i7 = Pd.c.authNameWithdrawName;
                    TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView2 != null) {
                        i7 = Pd.c.authNameWithdrawRoot;
                        LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                        if (linearLayout2 != null) {
                            i7 = Pd.c.bettingWithdraw;
                            TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView3 != null) {
                                i7 = Pd.c.bettingWithdrawLl;
                                LinearLayout linearLayout3 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                if (linearLayout3 != null) {
                                    i7 = Pd.c.bettingWithdrawNScrollView;
                                    NestedScrollView nestedScrollView = (NestedScrollView) p059e1.a.m(i7, viewInflate);
                                    if (nestedScrollView != null) {
                                        i7 = Pd.c.billerRoot;
                                        if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                            i7 = Pd.c.confirmCodeWithdrawRoot;
                                            LinearLayout linearLayout4 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                            if (linearLayout4 != null) {
                                                i7 = Pd.c.etBettingAmount;
                                                PpAmountEditText ppAmountEditText = (PpAmountEditText) p059e1.a.m(i7, viewInflate);
                                                if (ppAmountEditText != null) {
                                                    i7 = Pd.c.paymentRoot;
                                                    if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                                        FrameLayout frameLayout = (FrameLayout) viewInflate;
                                                        i7 = Pd.c.tevSelectBiller;
                                                        ModelItemSelection modelItemSelection = (ModelItemSelection) p059e1.a.m(i7, viewInflate);
                                                        if (modelItemSelection != null) {
                                                            i7 = Pd.c.viewBettingConfirmCode;
                                                            ModelNumberInputLayout modelNumberInputLayout = (ModelNumberInputLayout) p059e1.a.m(i7, viewInflate);
                                                            if (modelNumberInputLayout != null) {
                                                                i7 = Pd.c.viewBettingCustomerId;
                                                                ModelNumberInputLayout modelNumberInputLayout2 = (ModelNumberInputLayout) p059e1.a.m(i7, viewInflate);
                                                                if (modelNumberInputLayout2 != null) {
                                                                    i0 i0Var = new i0(frameLayout, bannerAdView, linearLayout, textView, textView2, linearLayout2, textView3, linearLayout3, nestedScrollView, linearLayout4, ppAmountEditText, frameLayout, modelItemSelection, modelNumberInputLayout, modelNumberInputLayout2);
                                                                    Intrinsics.checkNotNullExpressionValue(i0Var, "inflate(...)");
                                                                    return i0Var;
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.teller.ui.fragment.BaseBillerFragment
    public final P0 u() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        P0 p3 = new P0(contextRequireContext);
        i0 i0Var = (i0) this.f27335j;
        p3.f13251f = i0Var != null ? i0Var.t : null;
        p3.f13249d = q0.y(getString(k.core_no_network), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, getString(k.core_no_network_common_tips));
        p323v9.b listener = new p323v9.b(this, 1);
        Intrinsics.checkNotNullParameter(listener, "listener");
        p3.f13247b = listener;
        return p3;
    }

    public final void w() {
        if (this.f26729A.isEmpty()) {
            return;
        }
        z(((BettingBillerListItemBean) this.f26729A.get(0)).getBillerId(), "", true);
    }

    public final String x() {
        ModelNumberInputLayout modelNumberInputLayout;
        String number;
        i0 i0Var = (i0) this.f27335j;
        return (i0Var == null || (modelNumberInputLayout = i0Var.f8341A) == null || (number = modelNumberInputLayout.getNumber()) == null) ? "" : number;
    }

    public final void y(BettingBillerListItemBean bettingBillerListItemBean, boolean z3) {
        Window window;
        View decorView;
        i0 i0Var;
        ImageView startIconView;
        i0 i0Var2;
        if (Pa.i0.W(getActivity()) && bettingBillerListItemBean != null) {
            if (this.f26730B != null) {
                String billerId = bettingBillerListItemBean.getBillerId();
                BettingBillerListItemBean bettingBillerListItemBean2 = this.f26730B;
                if (!Intrinsics.c(billerId, bettingBillerListItemBean2 != null ? bettingBillerListItemBean2.getBillerId() : null) && z3) {
                    i0 i0Var3 = (i0) this.f27335j;
                    if (i0Var3 != null) {
                        i0Var3.f8341A.setNumber("");
                    }
                    i0 i0Var4 = (i0) this.f27335j;
                    if (i0Var4 != null) {
                        i0Var4.f8352p.setAmount("");
                    }
                }
            }
            this.f26730B = bettingBillerListItemBean;
            i0 i0Var5 = (i0) this.f27335j;
            if (i0Var5 != null) {
                ModelItemSelection modelItemSelection = i0Var5.f8353v;
                String billerName = bettingBillerListItemBean.getBillerName();
                if (billerName == null) {
                    billerName = "";
                }
                modelItemSelection.h(billerName);
            }
            if (TextUtils.isEmpty(bettingBillerListItemBean.getBillerTips())) {
                i0 i0Var6 = (i0) this.f27335j;
                if (i0Var6 != null) {
                    i0Var6.f8353v.g("");
                }
            } else {
                i0 i0Var7 = (i0) this.f27335j;
                if (i0Var7 != null) {
                    i0Var7.f8353v.g(bettingBillerListItemBean.getBillerTips());
                }
            }
            i0 i0Var8 = (i0) this.f27335j;
            boolean z8 = false;
            if (i0Var8 != null) {
                ModelItemSelection modelItemSelection2 = i0Var8.f8353v;
                Integer status = bettingBillerListItemBean.getStatus();
                modelItemSelection2.d(status != null && status.intValue() == 1);
            }
            Integer status2 = bettingBillerListItemBean.getStatus();
            if (status2 == null || status2.intValue() != 1) {
                String billerName2 = bettingBillerListItemBean.getBillerName();
                if (billerName2 == null) {
                    billerName2 = "";
                }
                B(billerName2);
            }
            String userIdCopy = bettingBillerListItemBean.getUserIdCopy();
            if (userIdCopy != null && (i0Var2 = (i0) this.f27335j) != null) {
                i0Var2.f8341A.setHint(userIdCopy);
            }
            i0 i0Var9 = (i0) this.f27335j;
            if (i0Var9 != null && (startIconView = i0Var9.f8353v.getStartIconView()) != null) {
                E eRequireActivity = requireActivity();
                ((m) com.bumptech.glide.b.c(eRequireActivity).e(eRequireActivity).load(bettingBillerListItemBean.getBillerIcon()).a(new G1.d().I(new com.bumptech.glide.load.resource.bitmap.z(CommonViewExtKt.getDp(4)), true)).x(r.cv_palmpay_logo_6)).S(startIconView);
            }
            Long upperLimitPerTime = bettingBillerListItemBean.getUpperLimitPerTime();
            this.f26732H = upperLimitPerTime != null ? upperLimitPerTime.longValue() : 0L;
            Long lowerLimitPerTime = bettingBillerListItemBean.getLowerLimitPerTime();
            long jLongValue = lowerLimitPerTime != null ? lowerLimitPerTime.longValue() : 0L;
            this.f26733L = jLongValue;
            i0 i0Var10 = (i0) this.f27335j;
            if (i0Var10 != null) {
                i0Var10.f8352p.setHintText(r0.m0(jLongValue) + " is minimum");
            }
            Integer verificationMode = bettingBillerListItemBean.getVerificationMode();
            if (verificationMode != null && verificationMode.intValue() == 2) {
                z8 = true;
            }
            this.f26735Q = z8;
            if (z8 && !TextUtils.isEmpty(bettingBillerListItemBean.getConformationCodeTips()) && (i0Var = (i0) this.f27335j) != null) {
                ModelNumberInputLayout modelNumberInputLayout = i0Var.f8354w;
                String conformationCodeTips = bettingBillerListItemBean.getConformationCodeTips();
                modelNumberInputLayout.setHint(conformationCodeTips != null ? conformationCodeTips : "");
            }
            i0 i0Var11 = (i0) this.f27335j;
            if (i0Var11 != null) {
                h.s(i0Var11.f8344c, !this.f26735Q);
            }
            i0 i0Var12 = (i0) this.f27335j;
            if (i0Var12 != null) {
                h.s(i0Var12.f8351o, this.f26735Q);
            }
            i0 i0Var13 = (i0) this.f27335j;
            if (i0Var13 != null) {
                h.s(i0Var13.f8347f, this.f26735Q);
            }
            E activity = getActivity();
            if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
                return;
            }
            decorView.requestLayout();
        }
    }

    public final void z(String str, String str2, boolean z3) {
        Integer status;
        i0 i0Var;
        int i7 = 0;
        if (str != null) {
            if (this.f26729A.isEmpty()) {
                BettingWithDrawViewModel bettingWithDrawViewModel = (BettingWithDrawViewModel) this.f27333i;
                if (bettingWithDrawViewModel != null) {
                    u function = new u(i7);
                    Intrinsics.checkNotNullParameter(function, "function");
                    x xVar = new x(1, null);
                    l lVar = bettingWithDrawViewModel.f26785g;
                    lVar.f27356m = function;
                    Unit unit = Unit.f38893a;
                    p140j8.f.v(bettingWithDrawViewModel, xVar, lVar, 0L);
                }
            } else {
                int size = this.f26729A.size();
                while (i7 < size) {
                    if (Intrinsics.c(((BettingBillerListItemBean) this.f26729A.get(i7)).getBillerId(), str) && (status = ((BettingBillerListItemBean) this.f26729A.get(i7)).getStatus()) != null && status.intValue() == 1) {
                        y((BettingBillerListItemBean) this.f26729A.get(i7), z3);
                        if (str2 == null || (i0Var = (i0) this.f27335j) == null) {
                            return;
                        }
                        i0Var.f8341A.setNumber(str2);
                        return;
                    }
                    i7++;
                }
            }
            w();
        }
    }
}
