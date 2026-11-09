package com.transsnet.palmpay.teller.ui.fragment;

import Ed.U;
import N8.q0;
import Pa.i0;
import Pa.r0;
import Pd.d;
import Rd.C0596l;
import Wd.C0751z;
import Wd.I;
import Zd.C0803h;
import Zd.o;
import Zd.r;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.camera.camera2.internal.P0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.E;
import androidx.lifecycle.b0;
import androidx.viewbinding.ViewBinding;
import com.bumptech.glide.load.resource.bitmap.z;
import com.bumptech.glide.m;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.adsdk.widgets.banner.BannerAdView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.cashier.CoreCashierPaymentExtra;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.req.QueryServiceStateByCategoryIdReq;
import com.transsnet.palmpay.core.viewmodel.ModelAvailableCouponItem;
import com.transsnet.palmpay.core.viewmodel.ModelBillNoticeItem;
import com.transsnet.palmpay.custom_view.ModelItemSelection;
import com.transsnet.palmpay.custom_view.dialog.ToastDialog;
import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;
import com.transsnet.palmpay.custom_view.t;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.bean.BillPaymentHomeParams;
import com.transsnet.palmpay.teller.bean.BillerListItemBean;
import com.transsnet.palmpay.teller.bean.BillerListRsp;
import com.transsnet.palmpay.teller.bean.ChannelDataItemBean;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderReq;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderRsp;
import com.transsnet.palmpay.teller.bean.PaymentItemBean;
import com.transsnet.palmpay.teller.bean.PaymentItemListRsp;
import com.transsnet.palmpay.teller.ui.dialog.PickBillerDialog;
import com.transsnet.palmpay.teller.ui.dialog.PickPaymentItemDialog;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentHomeNGFragment;
import com.transsnet.palmpay.teller.viewmodel.BillPaymentHomeNGViewModel;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.fastkv.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p070ee.b;
import p070ee.c;
import p086fe.B0;
import p086fe.O;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001\rB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/fragment/BillPaymentHomeNGFragment;", "Lcom/transsnet/palmpay/teller/ui/fragment/BaseBillerFragment;", "Lcom/transsnet/palmpay/teller/viewmodel/BillPaymentHomeNGViewModel;", "LRd/l;", "Lcom/transsnet/palmpay/teller/ui/dialog/PickBillerDialog$CallBack;", "Lcom/transsnet/palmpay/teller/ui/dialog/PickPaymentItemDialog$CallBack;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "messageEvent", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBillPaymentHomeNGFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillPaymentHomeNGFragment.kt\ncom/transsnet/palmpay/teller/ui/fragment/BillPaymentHomeNGFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1275:1\n172#2,9:1276\n171#3,12:1285\n215#3:1297\n260#3,10:1298\n296#3:1308\n115#3,8:1309\n145#3:1317\n115#3,8:1318\n145#3:1326\n1#4:1327\n*S KotlinDebug\n*F\n+ 1 BillPaymentHomeNGFragment.kt\ncom/transsnet/palmpay/teller/ui/fragment/BillPaymentHomeNGFragment\n*L\n74#1:1276,9\n258#1:1285,12\n258#1:1297\n355#1:1298,10\n355#1:1308\n370#1:1309,8\n370#1:1317\n426#1:1318,8\n426#1:1326\n*E\n"})
public class BillPaymentHomeNGFragment extends BaseBillerFragment<BillPaymentHomeNGViewModel, C0596l> implements PickBillerDialog.CallBack, PickPaymentItemDialog.CallBack {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ int f34279r0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f34280A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ChannelDataItemBean f34281B;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public BillerListItemBean f34284L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public PaymentItemBean f34285M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public long f34286Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public String f34287X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public String f34288Y;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public long f34290k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public long f34291p0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b0 f34293v = p002a.a.h(this, G.a(B0.class), new r(this, 0), new r(this, 1), new r(this, 2));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f34294w = "0";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ArrayList f34282C = new ArrayList();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final ArrayList f34283H = new ArrayList();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public long f34289Z = Long.MAX_VALUE;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public long f34292q0 = Long.MAX_VALUE;

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

    public final boolean A(String str, String str2) {
        if (str != null) {
            ArrayList arrayList = this.f34283H;
            if (arrayList.isEmpty() || !Intrinsics.c(((PaymentItemBean) arrayList.get(0)).billerId, str)) {
                BillPaymentHomeNGViewModel billPaymentHomeNGViewModel = (BillPaymentHomeNGViewModel) this.f27333i;
                if (billPaymentHomeNGViewModel != null) {
                    billPaymentHomeNGViewModel.f(false, false, this.f34294w, str);
                }
            } else {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (!TextUtils.isEmpty(((PaymentItemBean) arrayList.get(i7)).paymentItemId) && Intrinsics.c(((PaymentItemBean) arrayList.get(i7)).paymentItemId, str2)) {
                        z((PaymentItemBean) arrayList.get(i7));
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void B(String str, String str2, String str3, Long l5, boolean z3, boolean z8) {
        C0596l c0596l;
        C0596l c0596l2;
        this.f34288Y = str;
        this.f34287X = str2;
        if (str3 != null && (c0596l2 = (C0596l) this.f27335j) != null) {
            c0596l2.f8391p.setNumber(str3);
        }
        long jLongValue = l5.longValue();
        this.f34286Q = jLongValue;
        if (jLongValue > 0 && (c0596l = (C0596l) this.f27335j) != null) {
            c0596l.f8387g.setAmount(r0.A(jLongValue));
        }
        String str4 = this.f34288Y;
        if (str4 != null) {
            ArrayList arrayList = this.f34282C;
            if (arrayList.isEmpty()) {
                BillPaymentHomeNGViewModel billPaymentHomeNGViewModel = (BillPaymentHomeNGViewModel) this.f27333i;
                if (billPaymentHomeNGViewModel != null) {
                    billPaymentHomeNGViewModel.e(this.f34294w, false, z8);
                }
            } else {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (Intrinsics.c(((BillerListItemBean) arrayList.get(i7)).getBillerId(), str4)) {
                        y((BillerListItemBean) arrayList.get(i7), z3, z8);
                        break;
                    }
                }
            }
        }
        if (TextUtils.isEmpty(this.f34287X)) {
            this.f34285M = null;
            this.f34286Q = 0L;
            E("");
            C0596l c0596l3 = (C0596l) this.f27335j;
            if (c0596l3 != null) {
                c0596l3.f8387g.setAmount("");
            }
        } else {
            String str5 = this.f34287X;
            if (str5 != null) {
                A(this.f34288Y, str5);
            }
        }
        H();
    }

    public final void C(boolean z3) {
        if (this.f34281B == null) {
            this.f34281B = new ChannelDataItemBean();
        }
        ChannelDataItemBean channelDataItemBean = this.f34281B;
        if (channelDataItemBean != null) {
            B(channelDataItemBean.getBillerId(), channelDataItemBean.getPaymentItemId(), channelDataItemBean.getCustomerId(), Long.valueOf(channelDataItemBean.getBusinessAmount()), false, z3);
        }
    }

    public final void E(String str) {
        C0596l c0596l = (C0596l) this.f27335j;
        if (c0596l != null) {
            c0596l.f8389j.h(str);
        }
        C0596l c0596l2 = (C0596l) this.f27335j;
        if (c0596l2 != null) {
            c0596l2.t.setVisibility(8);
        }
        PaymentItemBean paymentItemBean = this.f34285M;
        if (paymentItemBean != null) {
            if (TextUtils.isEmpty(paymentItemBean.remark)) {
                C0596l c0596l3 = (C0596l) this.f27335j;
                if (c0596l3 != null) {
                    c0596l3.t.setVisibility(8);
                    return;
                }
                return;
            }
            C0596l c0596l4 = (C0596l) this.f27335j;
            if (c0596l4 != null) {
                c0596l4.t.setVisibility(0);
            }
            C0596l c0596l5 = (C0596l) this.f27335j;
            if (c0596l5 != null) {
                TextView textView = c0596l5.t;
                PaymentItemBean paymentItemBean2 = this.f34285M;
                textView.setText(paymentItemBean2 != null ? paymentItemBean2.remark : null);
            }
        }
    }

    public final void F() {
        PickBillerDialog pickBillerDialog = new PickBillerDialog(requireActivity());
        String str = c.f36289a;
        pickBillerDialog.setBusinessName(c.c(getContext(), this.f34294w));
        pickBillerDialog.setCallBack(this);
        pickBillerDialog.show();
        pickBillerDialog.setBillers(this.f34282C);
    }

    public final void G() {
        PickPaymentItemDialog pickPaymentItemDialog = new PickPaymentItemDialog(requireActivity());
        pickPaymentItemDialog.setCallBack(this);
        boolean z3 = false;
        if (BaseApplication.isNG() && (Intrinsics.c(this.f34294w, "2") || Intrinsics.c(this.f34294w, TransType.TRANS_TYPE_AIRTIME_LOAN) || Intrinsics.c(this.f34294w, TransType.TRANS_TYPE_REPAY_CASH_LOAN) || Intrinsics.c(this.f34294w, "14") || Intrinsics.c(this.f34294w, TransType.TRANS_TYPE_COMMISSION) || Intrinsics.c(this.f34294w, "27") || Intrinsics.c(this.f34294w, TransType.TRANS_TYPE_BIND_BANK_CARD) || Intrinsics.c(this.f34294w, "29") || Intrinsics.c(this.f34294w, "30") || Intrinsics.c(this.f34294w, "31"))) {
            z3 = true;
        }
        pickPaymentItemDialog.setBFavorite(z3);
        if (Intrinsics.c(this.f34294w, "2")) {
            String string = getString(Vd.a.qt_bouquet);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            pickPaymentItemDialog.setTitleItemlName(string);
        }
        pickPaymentItemDialog.show();
        pickPaymentItemDialog.setBiller(this.f34284L);
        pickPaymentItemDialog.setPaymentItems(this.f34283H);
    }

    public final void H() {
        C0596l c0596l;
        PpButton ppButton;
        PpAmountEditText ppAmountEditText;
        PpAmountEditText ppAmountEditText2;
        ModelItemSelection modelItemSelection;
        ModelItemSelection modelItemSelection2;
        PpButton ppButton2;
        C0596l c0596l2 = (C0596l) this.f27335j;
        if (c0596l2 != null && (ppButton2 = c0596l2.f8392v) != null) {
            ppButton2.setEnabled(false);
        }
        C0596l c0596l3 = (C0596l) this.f27335j;
        String amountString = null;
        if (TextUtils.isEmpty((c0596l3 == null || (modelItemSelection2 = c0596l3.f8388i) == null) ? null : modelItemSelection2.getItemValue())) {
            return;
        }
        C0596l c0596l4 = (C0596l) this.f27335j;
        if (TextUtils.isEmpty((c0596l4 == null || (modelItemSelection = c0596l4.f8389j) == null) ? null : modelItemSelection.getItemValue()) || TextUtils.isEmpty(w())) {
            return;
        }
        C0596l c0596l5 = (C0596l) this.f27335j;
        if (c0596l5 != null && (ppAmountEditText2 = c0596l5.f8387g) != null) {
            amountString = ppAmountEditText2.getAmountString();
        }
        if (TextUtils.isEmpty(amountString)) {
            return;
        }
        C0596l c0596l6 = (C0596l) this.f27335j;
        if (r0.f((c0596l6 == null || (ppAmountEditText = c0596l6.f8387g) == null) ? 0.0d : ppAmountEditText.getDoubleAmount()) <= 0 || (c0596l = (C0596l) this.f27335j) == null || (ppButton = c0596l.f8392v) == null) {
            return;
        }
        ppButton.setEnabled(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        ((B0) this.f34293v.getValue()).f36482d.e(this, new C0803h(this, 1));
        BillPaymentHomeNGViewModel billPaymentHomeNGViewModel = (BillPaymentHomeNGViewModel) this.f27333i;
        l lVar = billPaymentHomeNGViewModel != null ? billPaymentHomeNGViewModel.t : null;
        if (lVar != null) {
            lVar.e(this, new I(new o(this, 1), 4));
        }
        BillPaymentHomeNGViewModel billPaymentHomeNGViewModel2 = (BillPaymentHomeNGViewModel) this.f27333i;
        final int i7 = 2;
        n.B(this, billPaymentHomeNGViewModel2 != null ? billPaymentHomeNGViewModel2.f34397e : null, this, new Function2(this) { // from class: Zd.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillPaymentHomeNGFragment f11677b;

            {
                this.f11677b = this;
            }

            /* JADX WARN: Code duplicated, block: B:108:0x01fd  */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                boolean zA;
                String paymentItemId;
                CreateTellerOrderRsp.DataBean dataBean;
                String str;
                BillPaymentHomeNGViewModel billPaymentHomeNGViewModel3;
                String str2 = "";
                BillPaymentHomeNGFragment billPaymentHomeNGFragment = this.f11677b;
                switch (i7) {
                    case 0:
                        BillPaymentHomeParams billPaymentHomeParams = (BillPaymentHomeParams) obj;
                        PaymentItemListRsp rsp = (PaymentItemListRsp) obj2;
                        int i10 = BillPaymentHomeNGFragment.f34279r0;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        if (rsp.isSuccess()) {
                            List<PaymentItemBean> list = rsp.data;
                            if (list != null) {
                                billPaymentHomeNGFragment.f34283H.clear();
                                ArrayList arrayList = billPaymentHomeNGFragment.f34283H;
                                arrayList.addAll(list);
                                if (!TextUtils.isEmpty(billPaymentHomeNGFragment.f34287X)) {
                                    String str3 = billPaymentHomeNGFragment.f34287X;
                                    if (str3 == null || arrayList.isEmpty()) {
                                        zA = false;
                                    } else {
                                        zA = billPaymentHomeNGFragment.A(billPaymentHomeNGFragment.f34288Y, str3);
                                    }
                                } else if (arrayList.isEmpty()) {
                                    zA = false;
                                } else {
                                    String str4 = billPaymentHomeNGFragment.f34288Y;
                                    ChannelDataItemBean channelDataItemBean = billPaymentHomeNGFragment.f34281B;
                                    if (channelDataItemBean != null && (paymentItemId = channelDataItemBean.getPaymentItemId()) != null) {
                                        str2 = paymentItemId;
                                    }
                                    zA = billPaymentHomeNGFragment.A(str4, str2);
                                }
                                if (billPaymentHomeParams != null && !billPaymentHomeParams.getIsSelectPaymentItemForOtherPager() && !zA && arrayList.size() == 1) {
                                    billPaymentHomeNGFragment.onPaymentItemClick((PaymentItemBean) arrayList.get(0));
                                }
                                if (billPaymentHomeParams != null && billPaymentHomeParams.getShowDialog()) {
                                    billPaymentHomeNGFragment.G();
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 1:
                        CreateTellerOrderReq createTellerOrderReq = (CreateTellerOrderReq) obj;
                        CreateTellerOrderRsp rsp2 = (CreateTellerOrderRsp) obj2;
                        int i11 = BillPaymentHomeNGFragment.f34279r0;
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        if (!rsp2.isSuccess()) {
                            ToastUtils.showLong(rsp2.getRespMsg(), new Object[0]);
                        } else if (createTellerOrderReq != null && (dataBean = rsp2.data) != null) {
                            if (TextUtils.isEmpty(dataBean.orderNo)) {
                                if (!TextUtils.isEmpty(dataBean.outstandingTips)) {
                                    billPaymentHomeNGFragment.p(dataBean.outstandingTips);
                                }
                            } else if (rsp2.isSuccess()) {
                                CreateTellerOrderRsp.DataBean dataBean2 = rsp2.data;
                                if (dataBean2 != null) {
                                    androidx.fragment.app.E mActivity = billPaymentHomeNGFragment.f27319c;
                                    Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
                                    C0751z c0751z = new C0751z(mActivity, 0);
                                    c0751z.f4978i = dataBean2.calculationExtInfo;
                                    c0751z.f4971b = rsp2.data.orderNo;
                                    c0751z.c(Long.valueOf(createTellerOrderReq.businessAmount));
                                    Object obj3 = p070ee.b.f36288a;
                                    c0751z.f4972c = p070ee.b.b(billPaymentHomeNGFragment.f34294w);
                                    c0751z.f4974e = "5";
                                    ArrayList arrayList2 = new ArrayList();
                                    String string = billPaymentHomeNGFragment.getString(Pd.f.qt_biller_name);
                                    PaymentItemBean paymentItemBean = billPaymentHomeNGFragment.f34285M;
                                    if (paymentItemBean == null || (str = paymentItemBean.billerName) == null) {
                                        str = "";
                                    }
                                    arrayList2.add(new CoreCashierPaymentExtra(string, str));
                                    if (!TextUtils.isEmpty(dataBean2.fullName)) {
                                        String string2 = billPaymentHomeNGFragment.getString(Vd.a.qt_account_name);
                                        String str5 = dataBean2.fullName;
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        arrayList2.add(new CoreCashierPaymentExtra(string2, str5));
                                    }
                                    String strX = billPaymentHomeNGFragment.x(billPaymentHomeNGFragment.f34285M);
                                    if (strX == null) {
                                        strX = billPaymentHomeNGFragment.getString(Vd.a.qt_internet_customer_id);
                                        Intrinsics.checkNotNullExpressionValue(strX, "getString(...)");
                                    }
                                    arrayList2.add(new CoreCashierPaymentExtra(strX, billPaymentHomeNGFragment.w()));
                                    if (!TextUtils.isEmpty(dataBean2.address)) {
                                        String string3 = billPaymentHomeNGFragment.getString(p025ba.k.core_address);
                                        String str6 = dataBean2.address;
                                        arrayList2.add(new CoreCashierPaymentExtra(string3, str6 != null ? str6 : ""));
                                    }
                                    c0751z.b(arrayList2);
                                    c0751z.d();
                                }
                            } else if ("B00015".equals(rsp2.getRespCode())) {
                                C0596l c0596l = (C0596l) billPaymentHomeNGFragment.f27335j;
                                if (c0596l != null) {
                                    ModelNumberInputLayout modelNumberInputLayout = c0596l.f8391p;
                                    String respMsg = rsp2.getRespMsg();
                                    modelNumberInputLayout.setErrorMessage(respMsg != null ? respMsg : "");
                                }
                            } else {
                                String respMsg2 = rsp2.getRespMsg();
                                ToastUtils.showLong(respMsg2 != null ? respMsg2 : "", new Object[0]);
                            }
                        }
                        break;
                    default:
                        BillPaymentHomeParams billPaymentHomeParams2 = (BillPaymentHomeParams) obj;
                        BillerListRsp rsp3 = (BillerListRsp) obj2;
                        int i12 = BillPaymentHomeNGFragment.f34279r0;
                        Intrinsics.checkNotNullParameter(rsp3, "rsp");
                        if (rsp3.isSuccess()) {
                            List<BillerListItemBean> list2 = rsp3.data;
                            if (list2 != null) {
                                billPaymentHomeNGFragment.f34282C.clear();
                                billPaymentHomeNGFragment.f34282C.addAll(list2);
                                ChannelDataItemBean channelDataItemBean2 = billPaymentHomeNGFragment.f34281B;
                                if (channelDataItemBean2 != null) {
                                    billPaymentHomeNGFragment.B(channelDataItemBean2.getBillerId(), channelDataItemBean2.getPaymentItemId(), channelDataItemBean2.getCustomerId(), Long.valueOf(channelDataItemBean2.getBusinessAmount()), true, false);
                                }
                                String str7 = billPaymentHomeNGFragment.f34280A;
                                if (str7 != null) {
                                    if (TextUtils.isEmpty(str7)) {
                                        str7 = null;
                                    }
                                    if (str7 != null) {
                                        billPaymentHomeNGFragment.B(str7, "", "", 0L, true, false);
                                    }
                                }
                                ChannelDataItemBean channelDataItemBean3 = billPaymentHomeNGFragment.f34281B;
                                if ((channelDataItemBean3 == null || TextUtils.isEmpty(channelDataItemBean3.getBillerName())) && TextUtils.isEmpty(billPaymentHomeNGFragment.f34280A) && (billPaymentHomeNGViewModel3 = (BillPaymentHomeNGViewModel) billPaymentHomeNGFragment.f27333i) != null) {
                                    billPaymentHomeNGViewModel3.g(billPaymentHomeNGFragment.f34294w);
                                }
                                if (billPaymentHomeParams2 != null && billPaymentHomeParams2.getShowDialog()) {
                                    billPaymentHomeNGFragment.F();
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp3.getRespMsg(), new Object[0]);
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new Wd.G(20), false, null, 224);
        BillPaymentHomeNGViewModel billPaymentHomeNGViewModel3 = (BillPaymentHomeNGViewModel) this.f27333i;
        final int i10 = 0;
        n.B(this, billPaymentHomeNGViewModel3 != null ? billPaymentHomeNGViewModel3.f34398f : null, this, new Function2(this) { // from class: Zd.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillPaymentHomeNGFragment f11677b;

            {
                this.f11677b = this;
            }

            /* JADX WARN: Code duplicated, block: B:108:0x01fd  */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                boolean zA;
                String paymentItemId;
                CreateTellerOrderRsp.DataBean dataBean;
                String str;
                BillPaymentHomeNGViewModel billPaymentHomeNGViewModel4;
                String str2 = "";
                BillPaymentHomeNGFragment billPaymentHomeNGFragment = this.f11677b;
                switch (i10) {
                    case 0:
                        BillPaymentHomeParams billPaymentHomeParams = (BillPaymentHomeParams) obj;
                        PaymentItemListRsp rsp = (PaymentItemListRsp) obj2;
                        int i11 = BillPaymentHomeNGFragment.f34279r0;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        if (rsp.isSuccess()) {
                            List<PaymentItemBean> list = rsp.data;
                            if (list != null) {
                                billPaymentHomeNGFragment.f34283H.clear();
                                ArrayList arrayList = billPaymentHomeNGFragment.f34283H;
                                arrayList.addAll(list);
                                if (!TextUtils.isEmpty(billPaymentHomeNGFragment.f34287X)) {
                                    String str3 = billPaymentHomeNGFragment.f34287X;
                                    if (str3 == null || arrayList.isEmpty()) {
                                        zA = false;
                                    } else {
                                        zA = billPaymentHomeNGFragment.A(billPaymentHomeNGFragment.f34288Y, str3);
                                    }
                                } else if (arrayList.isEmpty()) {
                                    zA = false;
                                } else {
                                    String str4 = billPaymentHomeNGFragment.f34288Y;
                                    ChannelDataItemBean channelDataItemBean = billPaymentHomeNGFragment.f34281B;
                                    if (channelDataItemBean != null && (paymentItemId = channelDataItemBean.getPaymentItemId()) != null) {
                                        str2 = paymentItemId;
                                    }
                                    zA = billPaymentHomeNGFragment.A(str4, str2);
                                }
                                if (billPaymentHomeParams != null && !billPaymentHomeParams.getIsSelectPaymentItemForOtherPager() && !zA && arrayList.size() == 1) {
                                    billPaymentHomeNGFragment.onPaymentItemClick((PaymentItemBean) arrayList.get(0));
                                }
                                if (billPaymentHomeParams != null && billPaymentHomeParams.getShowDialog()) {
                                    billPaymentHomeNGFragment.G();
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 1:
                        CreateTellerOrderReq createTellerOrderReq = (CreateTellerOrderReq) obj;
                        CreateTellerOrderRsp rsp2 = (CreateTellerOrderRsp) obj2;
                        int i12 = BillPaymentHomeNGFragment.f34279r0;
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        if (!rsp2.isSuccess()) {
                            ToastUtils.showLong(rsp2.getRespMsg(), new Object[0]);
                        } else if (createTellerOrderReq != null && (dataBean = rsp2.data) != null) {
                            if (TextUtils.isEmpty(dataBean.orderNo)) {
                                if (!TextUtils.isEmpty(dataBean.outstandingTips)) {
                                    billPaymentHomeNGFragment.p(dataBean.outstandingTips);
                                }
                            } else if (rsp2.isSuccess()) {
                                CreateTellerOrderRsp.DataBean dataBean2 = rsp2.data;
                                if (dataBean2 != null) {
                                    androidx.fragment.app.E mActivity = billPaymentHomeNGFragment.f27319c;
                                    Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
                                    C0751z c0751z = new C0751z(mActivity, 0);
                                    c0751z.f4978i = dataBean2.calculationExtInfo;
                                    c0751z.f4971b = rsp2.data.orderNo;
                                    c0751z.c(Long.valueOf(createTellerOrderReq.businessAmount));
                                    Object obj3 = p070ee.b.f36288a;
                                    c0751z.f4972c = p070ee.b.b(billPaymentHomeNGFragment.f34294w);
                                    c0751z.f4974e = "5";
                                    ArrayList arrayList2 = new ArrayList();
                                    String string = billPaymentHomeNGFragment.getString(Pd.f.qt_biller_name);
                                    PaymentItemBean paymentItemBean = billPaymentHomeNGFragment.f34285M;
                                    if (paymentItemBean == null || (str = paymentItemBean.billerName) == null) {
                                        str = "";
                                    }
                                    arrayList2.add(new CoreCashierPaymentExtra(string, str));
                                    if (!TextUtils.isEmpty(dataBean2.fullName)) {
                                        String string2 = billPaymentHomeNGFragment.getString(Vd.a.qt_account_name);
                                        String str5 = dataBean2.fullName;
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        arrayList2.add(new CoreCashierPaymentExtra(string2, str5));
                                    }
                                    String strX = billPaymentHomeNGFragment.x(billPaymentHomeNGFragment.f34285M);
                                    if (strX == null) {
                                        strX = billPaymentHomeNGFragment.getString(Vd.a.qt_internet_customer_id);
                                        Intrinsics.checkNotNullExpressionValue(strX, "getString(...)");
                                    }
                                    arrayList2.add(new CoreCashierPaymentExtra(strX, billPaymentHomeNGFragment.w()));
                                    if (!TextUtils.isEmpty(dataBean2.address)) {
                                        String string3 = billPaymentHomeNGFragment.getString(p025ba.k.core_address);
                                        String str6 = dataBean2.address;
                                        arrayList2.add(new CoreCashierPaymentExtra(string3, str6 != null ? str6 : ""));
                                    }
                                    c0751z.b(arrayList2);
                                    c0751z.d();
                                }
                            } else if ("B00015".equals(rsp2.getRespCode())) {
                                C0596l c0596l = (C0596l) billPaymentHomeNGFragment.f27335j;
                                if (c0596l != null) {
                                    ModelNumberInputLayout modelNumberInputLayout = c0596l.f8391p;
                                    String respMsg = rsp2.getRespMsg();
                                    modelNumberInputLayout.setErrorMessage(respMsg != null ? respMsg : "");
                                }
                            } else {
                                String respMsg2 = rsp2.getRespMsg();
                                ToastUtils.showLong(respMsg2 != null ? respMsg2 : "", new Object[0]);
                            }
                        }
                        break;
                    default:
                        BillPaymentHomeParams billPaymentHomeParams2 = (BillPaymentHomeParams) obj;
                        BillerListRsp rsp3 = (BillerListRsp) obj2;
                        int i13 = BillPaymentHomeNGFragment.f34279r0;
                        Intrinsics.checkNotNullParameter(rsp3, "rsp");
                        if (rsp3.isSuccess()) {
                            List<BillerListItemBean> list2 = rsp3.data;
                            if (list2 != null) {
                                billPaymentHomeNGFragment.f34282C.clear();
                                billPaymentHomeNGFragment.f34282C.addAll(list2);
                                ChannelDataItemBean channelDataItemBean2 = billPaymentHomeNGFragment.f34281B;
                                if (channelDataItemBean2 != null) {
                                    billPaymentHomeNGFragment.B(channelDataItemBean2.getBillerId(), channelDataItemBean2.getPaymentItemId(), channelDataItemBean2.getCustomerId(), Long.valueOf(channelDataItemBean2.getBusinessAmount()), true, false);
                                }
                                String str7 = billPaymentHomeNGFragment.f34280A;
                                if (str7 != null) {
                                    if (TextUtils.isEmpty(str7)) {
                                        str7 = null;
                                    }
                                    if (str7 != null) {
                                        billPaymentHomeNGFragment.B(str7, "", "", 0L, true, false);
                                    }
                                }
                                ChannelDataItemBean channelDataItemBean3 = billPaymentHomeNGFragment.f34281B;
                                if ((channelDataItemBean3 == null || TextUtils.isEmpty(channelDataItemBean3.getBillerName())) && TextUtils.isEmpty(billPaymentHomeNGFragment.f34280A) && (billPaymentHomeNGViewModel4 = (BillPaymentHomeNGViewModel) billPaymentHomeNGFragment.f27333i) != null) {
                                    billPaymentHomeNGViewModel4.g(billPaymentHomeNGFragment.f34294w);
                                }
                                if (billPaymentHomeParams2 != null && billPaymentHomeParams2.getShowDialog()) {
                                    billPaymentHomeNGFragment.F();
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp3.getRespMsg(), new Object[0]);
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new Wd.G(18), false, null, 224);
        BillPaymentHomeNGViewModel billPaymentHomeNGViewModel4 = (BillPaymentHomeNGViewModel) this.f27333i;
        l lVar2 = billPaymentHomeNGViewModel4 != null ? billPaymentHomeNGViewModel4.f34399g : null;
        if (lVar2 != null) {
            lVar2.e(this, new I(new o(this, this), 4));
        }
        BillPaymentHomeNGViewModel billPaymentHomeNGViewModel5 = (BillPaymentHomeNGViewModel) this.f27333i;
        l lVar3 = billPaymentHomeNGViewModel5 != null ? billPaymentHomeNGViewModel5.f34400i : null;
        if (lVar3 != null) {
            lVar3.e(this, new I(new o(this, 0), 4));
        }
        BillPaymentHomeNGViewModel billPaymentHomeNGViewModel6 = (BillPaymentHomeNGViewModel) this.f27333i;
        final int i11 = 1;
        n.B(this, billPaymentHomeNGViewModel6 != null ? billPaymentHomeNGViewModel6.f34401j : null, this, new Function2(this) { // from class: Zd.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillPaymentHomeNGFragment f11677b;

            {
                this.f11677b = this;
            }

            /* JADX WARN: Code duplicated, block: B:108:0x01fd  */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                boolean zA;
                String paymentItemId;
                CreateTellerOrderRsp.DataBean dataBean;
                String str;
                BillPaymentHomeNGViewModel billPaymentHomeNGViewModel7;
                String str2 = "";
                BillPaymentHomeNGFragment billPaymentHomeNGFragment = this.f11677b;
                switch (i11) {
                    case 0:
                        BillPaymentHomeParams billPaymentHomeParams = (BillPaymentHomeParams) obj;
                        PaymentItemListRsp rsp = (PaymentItemListRsp) obj2;
                        int i12 = BillPaymentHomeNGFragment.f34279r0;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        if (rsp.isSuccess()) {
                            List<PaymentItemBean> list = rsp.data;
                            if (list != null) {
                                billPaymentHomeNGFragment.f34283H.clear();
                                ArrayList arrayList = billPaymentHomeNGFragment.f34283H;
                                arrayList.addAll(list);
                                if (!TextUtils.isEmpty(billPaymentHomeNGFragment.f34287X)) {
                                    String str3 = billPaymentHomeNGFragment.f34287X;
                                    if (str3 == null || arrayList.isEmpty()) {
                                        zA = false;
                                    } else {
                                        zA = billPaymentHomeNGFragment.A(billPaymentHomeNGFragment.f34288Y, str3);
                                    }
                                } else if (arrayList.isEmpty()) {
                                    zA = false;
                                } else {
                                    String str4 = billPaymentHomeNGFragment.f34288Y;
                                    ChannelDataItemBean channelDataItemBean = billPaymentHomeNGFragment.f34281B;
                                    if (channelDataItemBean != null && (paymentItemId = channelDataItemBean.getPaymentItemId()) != null) {
                                        str2 = paymentItemId;
                                    }
                                    zA = billPaymentHomeNGFragment.A(str4, str2);
                                }
                                if (billPaymentHomeParams != null && !billPaymentHomeParams.getIsSelectPaymentItemForOtherPager() && !zA && arrayList.size() == 1) {
                                    billPaymentHomeNGFragment.onPaymentItemClick((PaymentItemBean) arrayList.get(0));
                                }
                                if (billPaymentHomeParams != null && billPaymentHomeParams.getShowDialog()) {
                                    billPaymentHomeNGFragment.G();
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 1:
                        CreateTellerOrderReq createTellerOrderReq = (CreateTellerOrderReq) obj;
                        CreateTellerOrderRsp rsp2 = (CreateTellerOrderRsp) obj2;
                        int i13 = BillPaymentHomeNGFragment.f34279r0;
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        if (!rsp2.isSuccess()) {
                            ToastUtils.showLong(rsp2.getRespMsg(), new Object[0]);
                        } else if (createTellerOrderReq != null && (dataBean = rsp2.data) != null) {
                            if (TextUtils.isEmpty(dataBean.orderNo)) {
                                if (!TextUtils.isEmpty(dataBean.outstandingTips)) {
                                    billPaymentHomeNGFragment.p(dataBean.outstandingTips);
                                }
                            } else if (rsp2.isSuccess()) {
                                CreateTellerOrderRsp.DataBean dataBean2 = rsp2.data;
                                if (dataBean2 != null) {
                                    androidx.fragment.app.E mActivity = billPaymentHomeNGFragment.f27319c;
                                    Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
                                    C0751z c0751z = new C0751z(mActivity, 0);
                                    c0751z.f4978i = dataBean2.calculationExtInfo;
                                    c0751z.f4971b = rsp2.data.orderNo;
                                    c0751z.c(Long.valueOf(createTellerOrderReq.businessAmount));
                                    Object obj3 = p070ee.b.f36288a;
                                    c0751z.f4972c = p070ee.b.b(billPaymentHomeNGFragment.f34294w);
                                    c0751z.f4974e = "5";
                                    ArrayList arrayList2 = new ArrayList();
                                    String string = billPaymentHomeNGFragment.getString(Pd.f.qt_biller_name);
                                    PaymentItemBean paymentItemBean = billPaymentHomeNGFragment.f34285M;
                                    if (paymentItemBean == null || (str = paymentItemBean.billerName) == null) {
                                        str = "";
                                    }
                                    arrayList2.add(new CoreCashierPaymentExtra(string, str));
                                    if (!TextUtils.isEmpty(dataBean2.fullName)) {
                                        String string2 = billPaymentHomeNGFragment.getString(Vd.a.qt_account_name);
                                        String str5 = dataBean2.fullName;
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        arrayList2.add(new CoreCashierPaymentExtra(string2, str5));
                                    }
                                    String strX = billPaymentHomeNGFragment.x(billPaymentHomeNGFragment.f34285M);
                                    if (strX == null) {
                                        strX = billPaymentHomeNGFragment.getString(Vd.a.qt_internet_customer_id);
                                        Intrinsics.checkNotNullExpressionValue(strX, "getString(...)");
                                    }
                                    arrayList2.add(new CoreCashierPaymentExtra(strX, billPaymentHomeNGFragment.w()));
                                    if (!TextUtils.isEmpty(dataBean2.address)) {
                                        String string3 = billPaymentHomeNGFragment.getString(p025ba.k.core_address);
                                        String str6 = dataBean2.address;
                                        arrayList2.add(new CoreCashierPaymentExtra(string3, str6 != null ? str6 : ""));
                                    }
                                    c0751z.b(arrayList2);
                                    c0751z.d();
                                }
                            } else if ("B00015".equals(rsp2.getRespCode())) {
                                C0596l c0596l = (C0596l) billPaymentHomeNGFragment.f27335j;
                                if (c0596l != null) {
                                    ModelNumberInputLayout modelNumberInputLayout = c0596l.f8391p;
                                    String respMsg = rsp2.getRespMsg();
                                    modelNumberInputLayout.setErrorMessage(respMsg != null ? respMsg : "");
                                }
                            } else {
                                String respMsg2 = rsp2.getRespMsg();
                                ToastUtils.showLong(respMsg2 != null ? respMsg2 : "", new Object[0]);
                            }
                        }
                        break;
                    default:
                        BillPaymentHomeParams billPaymentHomeParams2 = (BillPaymentHomeParams) obj;
                        BillerListRsp rsp3 = (BillerListRsp) obj2;
                        int i14 = BillPaymentHomeNGFragment.f34279r0;
                        Intrinsics.checkNotNullParameter(rsp3, "rsp");
                        if (rsp3.isSuccess()) {
                            List<BillerListItemBean> list2 = rsp3.data;
                            if (list2 != null) {
                                billPaymentHomeNGFragment.f34282C.clear();
                                billPaymentHomeNGFragment.f34282C.addAll(list2);
                                ChannelDataItemBean channelDataItemBean2 = billPaymentHomeNGFragment.f34281B;
                                if (channelDataItemBean2 != null) {
                                    billPaymentHomeNGFragment.B(channelDataItemBean2.getBillerId(), channelDataItemBean2.getPaymentItemId(), channelDataItemBean2.getCustomerId(), Long.valueOf(channelDataItemBean2.getBusinessAmount()), true, false);
                                }
                                String str7 = billPaymentHomeNGFragment.f34280A;
                                if (str7 != null) {
                                    if (TextUtils.isEmpty(str7)) {
                                        str7 = null;
                                    }
                                    if (str7 != null) {
                                        billPaymentHomeNGFragment.B(str7, "", "", 0L, true, false);
                                    }
                                }
                                ChannelDataItemBean channelDataItemBean3 = billPaymentHomeNGFragment.f34281B;
                                if ((channelDataItemBean3 == null || TextUtils.isEmpty(channelDataItemBean3.getBillerName())) && TextUtils.isEmpty(billPaymentHomeNGFragment.f34280A) && (billPaymentHomeNGViewModel7 = (BillPaymentHomeNGViewModel) billPaymentHomeNGFragment.f27333i) != null) {
                                    billPaymentHomeNGViewModel7.g(billPaymentHomeNGFragment.f34294w);
                                }
                                if (billPaymentHomeParams2 != null && billPaymentHomeParams2.getShowDialog()) {
                                    billPaymentHomeNGFragment.F();
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp3.getRespMsg(), new Object[0]);
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new Wd.G(19), true, null, 224);
        BillPaymentHomeNGViewModel billPaymentHomeNGViewModel7 = (BillPaymentHomeNGViewModel) this.f27333i;
        l lVar4 = billPaymentHomeNGViewModel7 != null ? billPaymentHomeNGViewModel7.f34403p : null;
        if (lVar4 != null) {
            lVar4.e(this, new I(new U(4), 4));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        InterstitialAdView interstitialAdViewJ;
        BillPaymentHomeNGViewModel billPaymentHomeNGViewModel = (BillPaymentHomeNGViewModel) this.f27333i;
        if (billPaymentHomeNGViewModel != null) {
            String categoryId = this.f34294w;
            Intrinsics.checkNotNullParameter(categoryId, "categoryId");
            if (BaseApplication.hasLogin()) {
                QueryServiceStateByCategoryIdReq queryServiceStateByCategoryIdReq = new QueryServiceStateByCategoryIdReq();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(categoryId);
                queryServiceStateByCategoryIdReq.categoryId = arrayList;
                f.s(billPaymentHomeNGViewModel, new O(queryServiceStateByCategoryIdReq, null), billPaymentHomeNGViewModel.f34402o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            }
        }
        BillPaymentHomeNGViewModel billPaymentHomeNGViewModel2 = (BillPaymentHomeNGViewModel) this.f27333i;
        if (billPaymentHomeNGViewModel2 != null) {
            billPaymentHomeNGViewModel2.h(this.f34294w);
        }
        C(false);
        BillPaymentHomeNGViewModel billPaymentHomeNGViewModel3 = (BillPaymentHomeNGViewModel) this.f27333i;
        if (billPaymentHomeNGViewModel3 != null) {
            billPaymentHomeNGViewModel3.e(this.f34294w, false, false);
        }
        Object obj = b.f36288a;
        String strB = b.b(this.f34294w);
        if (TransType.TRANS_TYPE_BILLER_BETTING.equals(strB)) {
            InterstitialAdView interstitialAdViewJ2 = org.chromium.support_lib_boundary.util.b.j(getString(k.betting_home_page_pop_slot_id));
            if (interstitialAdViewJ2 != null) {
                InterstitialAdView.show$default(interstitialAdViewJ2, requireActivity(), null, 2, null);
                return;
            }
            return;
        }
        if (!"17".equals(strB) || (interstitialAdViewJ = org.chromium.support_lib_boundary.util.b.j(getString(k.tv_home_page_pop_slot_id))) == null) {
            return;
        }
        InterstitialAdView.show$default(interstitialAdViewJ, requireActivity(), null, 2, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:268:0x056a  */
    /* JADX WARN: Code duplicated, block: B:270:0x0570  */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x03bc, code lost:
    
        if (r1.equals("19") != true) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03da, code lost:
    
        if (r1.equals("18") != true) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03f8, code lost:
    
        if (r1.equals("17") != true) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0416, code lost:
    
        if (r1.equals("16") != true) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0434, code lost:
    
        if (r1.equals("15") != true) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0450, code lost:
    
        if (r1.equals("14") != true) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x046c, code lost:
    
        if (r1.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_AIRTIME_LOAN) != true) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x048a, code lost:
    
        if (r1.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_REPAY_CASH_LOAN) != true) goto L268;
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v26 int, still in use, count: 8, list:
      (r4v26 int) from 0x01a5: IF  (r4v26 int) == (49 int)  -> B:131:0x02f7 A[HIDDEN] (LINE:422)
      (r4v26 int) from 0x01a9: IF  (r4v26 int) != (50 int)  -> B:72:0x01ab A[HIDDEN] (LINE:426)
      (r4v26 int) from 0x01ad: IF  (r4v26 int) != (53 int)  -> B:74:0x01af A[HIDDEN] (LINE:430)
      (r4v26 int) from 0x01b1: IF  (r4v26 int) != (1599 int)  -> B:76:0x01b3 A[HIDDEN] (LINE:434)
      (r4v26 int) from 0x01b5: IF  (r4v26 int) != (1570 int)  -> B:78:0x01b7 A[HIDDEN] (LINE:438)
      (r4v26 int) from 0x01b9: IF  (r4v26 int) != (1571 int)  -> B:80:0x01bb A[HIDDEN] (LINE:442)
      (r4v26 int) from 0x01bd: IF  (r4v26 int) != (1629 int)  -> B:82:0x01bf A[HIDDEN] (LINE:446)
      (r4v26 int) from 0x01c1: IF  (r4v26 int) != (1630 int)  -> B:84:0x01c3 A[HIDDEN] (LINE:450)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:276)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:354)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v26 int, still in use, count: 8, list:
      (r4v26 int) from 0x01a5: IF  (r4v26 int) == (49 int)  -> B:131:0x02f7 A[HIDDEN] (LINE:422)
      (r4v26 int) from 0x01a9: IF  (r4v26 int) != (50 int)  -> B:72:0x01ab A[HIDDEN] (LINE:426)
      (r4v26 int) from 0x01ad: IF  (r4v26 int) != (53 int)  -> B:74:0x01af A[HIDDEN] (LINE:430)
      (r4v26 int) from 0x01b1: IF  (r4v26 int) != (1599 int)  -> B:76:0x01b3 A[HIDDEN] (LINE:434)
      (r4v26 int) from 0x01b5: IF  (r4v26 int) != (1570 int)  -> B:78:0x01b7 A[HIDDEN] (LINE:438)
      (r4v26 int) from 0x01b9: IF  (r4v26 int) != (1571 int)  -> B:80:0x01bb A[HIDDEN] (LINE:442)
      (r4v26 int) from 0x01bd: IF  (r4v26 int) != (1629 int)  -> B:82:0x01bf A[HIDDEN] (LINE:446)
      (r4v26 int) from 0x01c1: IF  (r4v26 int) != (1630 int)  -> B:84:0x01c3 A[HIDDEN] (LINE:450)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:84:0x01c3. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int o() {
        /*
            Method dump skipped, instruction units count: 1492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsnet.palmpay.teller.ui.fragment.BillPaymentHomeNGFragment.o():int");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i10 == -1 && i7 == 101 && intent != null) {
            B(intent.getStringExtra("extra_data_1"), intent.getStringExtra("extra_data_2"), intent.getStringExtra("customerId"), Long.valueOf(intent.getLongExtra("amount", 0L)), false, true);
        }
    }

    @Override // com.transsnet.palmpay.teller.ui.dialog.PickBillerDialog.CallBack
    public final void onBillerClick(BillerListItemBean billerListItemBean) {
        if (ActivityUtils.isValidActivityContext(this.f27319c)) {
            this.f34287X = null;
            this.f34288Y = null;
            this.f34286Q = 0L;
            y(billerListItemBean, true, false);
            this.f34285M = null;
            E("");
            H();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Override // com.transsnet.palmpay.teller.ui.dialog.PickPaymentItemDialog.CallBack
    public final void onPaymentItemClick(PaymentItemBean paymentItemBean) {
        if (ActivityUtils.isValidActivityContext(this.f27319c) && paymentItemBean != null) {
            this.f34287X = null;
            this.f34288Y = null;
            this.f34286Q = 0L;
            z(paymentItemBean);
            H();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable MessageEvent messageEvent) {
    }

    @Override // com.transsnet.palmpay.teller.ui.fragment.BaseBillerFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        ModelAvailableCouponItem modelAvailableCouponItem;
        super.onResume();
        C0596l c0596l = (C0596l) this.f27335j;
        if (c0596l == null || (modelAvailableCouponItem = c0596l.f8384d) == null) {
            return;
        }
        modelAvailableCouponItem.e();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(d.qt_activity_bill_payment_home_ng, viewGroup, false);
        int i7 = Pd.c.adBanner;
        BannerAdView bannerAdView = (BannerAdView) p059e1.a.m(i7, viewInflate);
        if (bannerAdView != null) {
            i7 = Pd.c.adNotice;
            ModelBillNoticeItem modelBillNoticeItem = (ModelBillNoticeItem) p059e1.a.m(i7, viewInflate);
            if (modelBillNoticeItem != null) {
                i7 = Pd.c.availCoupons;
                ModelAvailableCouponItem modelAvailableCouponItem = (ModelAvailableCouponItem) p059e1.a.m(i7, viewInflate);
                if (modelAvailableCouponItem != null) {
                    i7 = Pd.c.checkSaveToBeneficiaries;
                    IconicsCheckBox iconicsCheckBox = (IconicsCheckBox) p059e1.a.m(i7, viewInflate);
                    if (iconicsCheckBox != null) {
                        i7 = Pd.c.clRoot;
                        ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
                        if (constraintLayout != null) {
                            i7 = Pd.c.editTextPayAmount;
                            PpAmountEditText ppAmountEditText = (PpAmountEditText) p059e1.a.m(i7, viewInflate);
                            if (ppAmountEditText != null) {
                                i7 = Pd.c.inputBiller;
                                ModelItemSelection modelItemSelection = (ModelItemSelection) p059e1.a.m(i7, viewInflate);
                                if (modelItemSelection != null) {
                                    i7 = Pd.c.inputPaymentItem;
                                    ModelItemSelection modelItemSelection2 = (ModelItemSelection) p059e1.a.m(i7, viewInflate);
                                    if (modelItemSelection2 != null) {
                                        i7 = Pd.c.ll_save_to_beneficiary;
                                        LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                        if (linearLayout != null) {
                                            i7 = Pd.c.model_input_customer;
                                            ModelNumberInputLayout modelNumberInputLayout = (ModelNumberInputLayout) p059e1.a.m(i7, viewInflate);
                                            if (modelNumberInputLayout != null) {
                                                i7 = Pd.c.qab_cashback_iv;
                                                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                                if (textView != null) {
                                                    i7 = Pd.c.space_amount_1;
                                                    if (((Space) p059e1.a.m(i7, viewInflate)) != null) {
                                                        i7 = Pd.c.space_amount_2;
                                                        if (((Space) p059e1.a.m(i7, viewInflate)) != null) {
                                                            i7 = Pd.c.space_body_1;
                                                            if (((Space) p059e1.a.m(i7, viewInflate)) != null) {
                                                                i7 = Pd.c.space_body_2;
                                                                if (((Space) p059e1.a.m(i7, viewInflate)) != null) {
                                                                    i7 = Pd.c.textViewNext;
                                                                    PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
                                                                    if (ppButton != null) {
                                                                        i7 = Pd.c.titleBar;
                                                                        PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                                                        if (ppTitleBar != null) {
                                                                            C0596l c0596l = new C0596l((LinearLayout) viewInflate, bannerAdView, modelBillNoticeItem, modelAvailableCouponItem, iconicsCheckBox, constraintLayout, ppAmountEditText, modelItemSelection, modelItemSelection2, linearLayout, modelNumberInputLayout, textView, ppButton, ppTitleBar);
                                                                            Intrinsics.checkNotNullExpressionValue(c0596l, "inflate(...)");
                                                                            return c0596l;
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.teller.ui.fragment.BaseBillerFragment
    public final P0 u() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        P0 p3 = new P0(contextRequireContext);
        C0596l c0596l = (C0596l) this.f27335j;
        p3.f13251f = c0596l != null ? c0596l.f8386f : null;
        p3.f13249d = q0.y(getString(k.core_no_network), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, getString(k.core_no_network_common_tips));
        X6.c listener = new X6.c(this, 5);
        Intrinsics.checkNotNullParameter(listener, "listener");
        p3.f13247b = listener;
        return p3;
    }

    public final String w() {
        ModelNumberInputLayout modelNumberInputLayout;
        String number;
        C0596l c0596l = (C0596l) this.f27335j;
        return (c0596l == null || (modelNumberInputLayout = c0596l.f8391p) == null || (number = modelNumberInputLayout.getNumber()) == null) ? "" : number;
    }

    public final String x(PaymentItemBean paymentItemBean) {
        String str = c.f36289a;
        String string = getString(c.e(this.f34294w));
        if (paymentItemBean != null && !TextUtils.isEmpty(paymentItemBean.promptText)) {
            return paymentItemBean.promptText;
        }
        BillerListItemBean billerListItemBean = this.f34284L;
        if (TextUtils.isEmpty(billerListItemBean != null ? billerListItemBean.getUserIdTips() : null)) {
            return string;
        }
        BillerListItemBean billerListItemBean2 = this.f34284L;
        if (billerListItemBean2 != null) {
            return billerListItemBean2.getUserIdTips();
        }
        return null;
    }

    public final void y(BillerListItemBean billerListItemBean, boolean z3, boolean z8) {
        TextView titleTv;
        ImageView startIconView;
        if (i0.W(requireActivity()) && billerListItemBean != null) {
            if (this.f34284L != null) {
                String billerId = billerListItemBean.getBillerId();
                BillerListItemBean billerListItemBean2 = this.f34284L;
                if (!Intrinsics.c(billerId, billerListItemBean2 != null ? billerListItemBean2.getBillerId() : null) && z3) {
                    C0596l c0596l = (C0596l) this.f27335j;
                    if (c0596l != null) {
                        c0596l.f8391p.setNumber("");
                    }
                    C0596l c0596l2 = (C0596l) this.f27335j;
                    if (c0596l2 != null) {
                        c0596l2.f8387g.setAmount("");
                    }
                }
            }
            this.f34284L = billerListItemBean;
            C0596l c0596l3 = (C0596l) this.f27335j;
            if (c0596l3 != null) {
                c0596l3.f8388i.h(billerListItemBean.getBillerName());
            }
            C0596l c0596l4 = (C0596l) this.f27335j;
            if (c0596l4 != null) {
                ModelItemSelection modelItemSelection = c0596l4.f8388i;
                Integer status = billerListItemBean.getStatus();
                modelItemSelection.d(status != null && status.intValue() == 1);
            }
            Integer status2 = billerListItemBean.getStatus();
            if (status2 == null || status2.intValue() != 1) {
                String billerName = billerListItemBean.getBillerName();
                if (billerName == null) {
                    billerName = "";
                }
                E eRequireActivity = requireActivity();
                String string = getString(Pd.f.qt_service_temporarily_unavailable_3, billerName);
                ToastDialog toastDialog = new ToastDialog(eRequireActivity, t.cv_toast_dialog);
                toastDialog.setMessage(string);
                toastDialog.setTitle((String) null);
                toastDialog.setIcon(0);
                toastDialog.setIcon((Drawable) null);
                toastDialog.setBackground(0);
                toastDialog.show(4000L);
            }
            C0596l c0596l5 = (C0596l) this.f27335j;
            if (c0596l5 != null && (startIconView = c0596l5.f8388i.getStartIconView()) != null) {
                ((m) ((m) com.bumptech.glide.b.c(getContext()).d(this).load(billerListItemBean.getInstitutionLogo()).a(new G1.d().I(new z(CommonViewExtKt.getDp(4)), true)).x(com.transsnet.palmpay.custom_view.r.cv_palmpay_logo_6)).j(com.transsnet.palmpay.custom_view.r.cv_palmpay_logo_6)).S(startIconView);
            }
            C0596l c0596l6 = (C0596l) this.f27335j;
            if (c0596l6 != null && (titleTv = c0596l6.f8391p.getTitleTv()) != null) {
                titleTv.setText(x(null));
            }
            C0596l c0596l7 = (C0596l) this.f27335j;
            if (c0596l7 != null) {
                ModelNumberInputLayout modelNumberInputLayout = c0596l7.f8391p;
                String strX = x(null);
                modelNumberInputLayout.setHint(strX != null ? strX : "");
            }
            BillPaymentHomeNGViewModel billPaymentHomeNGViewModel = (BillPaymentHomeNGViewModel) this.f27333i;
            if (billPaymentHomeNGViewModel != null) {
                billPaymentHomeNGViewModel.f(false, z8, this.f34294w, billerListItemBean.getBillerId());
            }
        }
    }

    public final void z(PaymentItemBean paymentItemBean) {
        PpAmountEditText ppAmountEditText;
        PpAmountEditText ppAmountEditText2;
        C0596l c0596l;
        PpAmountEditText ppAmountEditText3;
        PpAmountEditText ppAmountEditText4;
        PpAmountEditText ppAmountEditText5;
        C0596l c0596l2;
        PpAmountEditText ppAmountEditText6;
        ModelNumberInputLayout modelNumberInputLayout;
        ModelNumberInputLayout modelNumberInputLayout2;
        TextView titleTv;
        if (paymentItemBean == null) {
            return;
        }
        this.f34285M = paymentItemBean;
        String paymentItemName = paymentItemBean.paymentItemName;
        Intrinsics.checkNotNullExpressionValue(paymentItemName, "paymentItemName");
        E(paymentItemName);
        C0596l c0596l3 = (C0596l) this.f27335j;
        if (c0596l3 != null && (modelNumberInputLayout2 = c0596l3.f8391p) != null && (titleTv = modelNumberInputLayout2.getTitleTv()) != null) {
            titleTv.setText(x(paymentItemBean));
        }
        C0596l c0596l4 = (C0596l) this.f27335j;
        if (c0596l4 != null && (modelNumberInputLayout = c0596l4.f8391p) != null) {
            String strX = x(paymentItemBean);
            if (strX == null) {
                strX = "";
            }
            modelNumberInputLayout.setHint(strX);
        }
        long j6 = paymentItemBean.amount;
        if (j6 > 0 && (c0596l2 = (C0596l) this.f27335j) != null && (ppAmountEditText6 = c0596l2.f8387g) != null) {
            ppAmountEditText6.setAmount(r0.A(j6));
        }
        if (paymentItemBean.isAmountFixed != 0 || paymentItemBean.amount <= 0) {
            long j10 = this.f34286Q;
            if (j10 > 0 && (c0596l = (C0596l) this.f27335j) != null && (ppAmountEditText3 = c0596l.f8387g) != null) {
                ppAmountEditText3.setAmount(r0.A(j10));
            }
            C0596l c0596l5 = (C0596l) this.f27335j;
            if (c0596l5 != null && (ppAmountEditText2 = c0596l5.f8387g) != null) {
                ppAmountEditText2.setEnabled(true);
            }
            C0596l c0596l6 = (C0596l) this.f27335j;
            if (c0596l6 != null && (ppAmountEditText = c0596l6.f8387g) != null) {
                ppAmountEditText.d(false);
            }
        } else {
            C0596l c0596l7 = (C0596l) this.f27335j;
            if (c0596l7 != null && (ppAmountEditText5 = c0596l7.f8387g) != null) {
                ppAmountEditText5.setEnabled(false);
            }
            C0596l c0596l8 = (C0596l) this.f27335j;
            if (c0596l8 != null && (ppAmountEditText4 = c0596l8.f8387g) != null) {
                ppAmountEditText4.d(true);
            }
        }
        this.f34291p0 = paymentItemBean.minAmount;
        if (paymentItemBean.maxAmount == 0) {
            paymentItemBean.maxAmount = Long.MAX_VALUE;
        }
        this.f34292q0 = paymentItemBean.maxAmount;
    }
}
