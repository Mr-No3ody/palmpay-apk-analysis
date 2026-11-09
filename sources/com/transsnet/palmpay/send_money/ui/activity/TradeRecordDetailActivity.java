package com.transsnet.palmpay.send_money.ui.activity;

import C0.G;
import Jd.c;
import Kd.C0415t0;
import Kd.C0418u0;
import N8.q0;
import Pa.i0;
import Pa.r0;
import Vb.j;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.camera.video.u;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.firebase.perf.util.Constants;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.bean.BillProcessTitleData1;
import com.transsnet.palmpay.core.bean.OrderDetailQuestionBean;
import com.transsnet.palmpay.core.bean.cashier.CoreCashierPaymentExtra;
import com.transsnet.palmpay.core.bean.req.CancelVoucherReq;
import com.transsnet.palmpay.core.bean.rsp.PaymentMethodComb;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.ui.widget.FixedSavingsLayout;
import com.transsnet.palmpay.custom_view.dialog.VoucherMsgDialog;
import com.transsnet.palmpay.custom_view.dialog.t;
import com.transsnet.palmpay.custom_view.model.OrderResultAmountStyle1;
import com.transsnet.palmpay.custom_view.model.OrderResultAmountStyle2;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.v;
import com.transsnet.palmpay.send_money.bean.OrderCompensateBean;
import com.transsnet.palmpay.send_money.bean.TradeRecordDetailResp;
import com.transsnet.palmpay.send_money.ui.dialog.TransferProcessDialog;
import com.transsnet.palmpay.send_money.ui.view.BankCustomerServiceView;
import com.transsnet.palmpay.send_money.ui.view.TransferDetailBottomModel;
import com.transsnet.palmpay.send_money.ui.view.TransferDetailQuestionView;
import com.transsnet.palmpay.send_money.ui.view.TransferToBankProgressModel;
import com.transsnet.palmpay.send_money.ui.view.TransferToFastTransferSafeguardProgressModel;
import com.transsnet.palmpay.send_money.ui.view.TransferToPalmPayProgressView;
import com.transsnet.palmpay.send_money.viewmodel.TradeRecordViewModel;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p054dd.n;
import p054dd.q;
import p159kd.d;
import p159kd.e;
import p159kd.f;
import p173ld.o;
import p184m8.b;
import p220oa.h;
import p223od.w;
import p270rd.A;
import p270rd.B;
import p270rd.C;
import p270rd.C1958a;
import p270rd.D;
import p270rd.E;
import p270rd.F;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "03 详情页", path = "/smorder/detail")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\fB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/TradeRecordDetailActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/TradeRecordViewModel;", "Lod/w;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/View;", "view", "", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTradeRecordDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeRecordDetailActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/TradeRecordDetailActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1400:1\n171#2,12:1401\n215#2:1413\n171#2,12:1414\n215#2:1426\n171#2,12:1427\n215#2:1439\n562#3,10:1440\n1#4:1450\n1878#5,3:1451\n1869#5,2:1454\n1869#5,2:1456\n13472#6,2:1458\n*S KotlinDebug\n*F\n+ 1 TradeRecordDetailActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/TradeRecordDetailActivity\n*L\n148#1:1401,12\n148#1:1413\n158#1:1414,12\n158#1:1426\n166#1:1427,12\n166#1:1439\n187#1:1440,10\n538#1:1451,3\n570#1:1454,2\n885#1:1456,2\n1228#1:1458,2\n*E\n"})
public final class TradeRecordDetailActivity extends BaseMvvmVBActivity<TradeRecordViewModel, w> implements View.OnClickListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final a f33213B = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public TransferToFastTransferSafeguardProgressModel f33214A;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f33216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f33217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TradeRecordDetailResp.RecordDetail f33218g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public BillProcessDetail f33221o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public OrderResultHeaderModel f33222p;
    public TransferToPalmPayProgressView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TransferToBankProgressModel f33223v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TransferDetailQuestionView f33224w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f33215d = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f33219i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f33220j = "";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void startActivity(@NotNull Context context, @Nullable String str) {
            context.startActivity(G.e(context, "context", context, TradeRecordDetailActivity.class).putExtra("orderId", str));
        }

        private a() {
        }

        @JvmStatic
        public final void startActivity(@NotNull Context context, @Nullable String str, int i7) {
            context.startActivity(G.e(context, "context", context, TradeRecordDetailActivity.class).putExtra("orderId", str).putExtra("orderType", i7));
        }
    }

    public static final void n(TradeRecordDetailActivity tradeRecordDetailActivity, boolean z3) {
        if (z3) {
            t tVar = new t(tradeRecordDetailActivity);
            tVar.b();
            tVar.d(Constants.MAX_URL_LENGTH);
        } else {
            t tVar2 = new t(tradeRecordDetailActivity);
            tVar2.a();
            tVar2.d(Constants.MAX_URL_LENGTH);
        }
    }

    public static OrderResultItemModel r(TradeRecordDetailActivity tradeRecordDetailActivity, String str, CharSequence charSequence, int i7) {
        int i10 = (i7 & 16) != 0 ? 1002 : 1003;
        tradeRecordDetailActivity.getClass();
        OrderResultItemModel orderResultItemModel = new OrderResultItemModel(tradeRecordDetailActivity, i10, str, charSequence);
        orderResultItemModel.setItemKeyRightIconVisibility(false);
        orderResultItemModel.f();
        if (i10 == 1003) {
            orderResultItemModel.setOnCopyListener(new b(9));
        }
        w wVar = (w) tradeRecordDetailActivity.f27334c;
        if (wVar != null) {
            wVar.f40526d.addView(orderResultItemModel);
        }
        return orderResultItemModel;
    }

    public static boolean s() {
        User user = BaseApplication.getInstance().getUser();
        return user != null && user.shouldApplyForBalance();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((TradeRecordViewModel) l()).f34022e;
        if (lVar != null) {
            lVar.e(this, new q(new D(this, this, 0), 19));
        }
        l lVar2 = ((TradeRecordViewModel) l()).f34023f;
        if (lVar2 != null) {
            lVar2.e(this, new q(new D(this, this, 1), 19));
        }
        l lVar3 = ((TradeRecordViewModel) l()).f34024g;
        if (lVar3 != null) {
            lVar3.e(this, new q(new D(this, this, 2), 19));
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
        View viewInflate = getLayoutInflater().inflate(f.sm_trade_record_detail_activity, (ViewGroup) null, false);
        int i7 = e.iv_transfer_result_extend;
        ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
        if (imageView != null) {
            i7 = e.layout_fixed_savings;
            FixedSavingsLayout fixedSavingsLayout = (FixedSavingsLayout) p059e1.a.m(i7, viewInflate);
            if (fixedSavingsLayout != null) {
                i7 = e.ll_container_middle;
                LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                if (linearLayout != null) {
                    i7 = e.ll_fee_detail;
                    LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                    if (linearLayout2 != null) {
                        i7 = e.model_transfer_detail_bottom;
                        TransferDetailBottomModel transferDetailBottomModel = (TransferDetailBottomModel) p059e1.a.m(i7, viewInflate);
                        if (transferDetailBottomModel != null) {
                            i7 = e.record_cancel_btn;
                            Button button = (Button) p059e1.a.m(i7, viewInflate);
                            if (button != null) {
                                i7 = e.title_bar;
                                PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                if (ppTitleBar != null) {
                                    i7 = e.vs_header;
                                    ViewStub viewStub = (ViewStub) p059e1.a.m(i7, viewInflate);
                                    if (viewStub != null) {
                                        i7 = e.vs_question;
                                        ViewStub viewStub2 = (ViewStub) p059e1.a.m(i7, viewInflate);
                                        if (viewStub2 != null) {
                                            i7 = e.vs_to_bank_progress;
                                            ViewStub viewStub3 = (ViewStub) p059e1.a.m(i7, viewInflate);
                                            if (viewStub3 != null) {
                                                i7 = e.vs_to_pp_progress;
                                                ViewStub viewStub4 = (ViewStub) p059e1.a.m(i7, viewInflate);
                                                if (viewStub4 != null) {
                                                    i7 = e.vs_transfer_to_bank_fast_refund_progress;
                                                    if (((ViewStub) p059e1.a.m(i7, viewInflate)) != null) {
                                                        w wVar = new w((LinearLayout) viewInflate, imageView, fixedSavingsLayout, linearLayout, linearLayout2, transferDetailBottomModel, button, ppTitleBar, viewStub, viewStub2, viewStub3, viewStub4);
                                                        Intrinsics.checkNotNullExpressionValue(wVar, "inflate(...)");
                                                        return wVar;
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

    /* JADX WARN: Code duplicated, block: B:131:0x022f  */
    /* JADX WARN: Code duplicated, block: B:146:0x0269  */
    /* JADX WARN: Code duplicated, block: B:155:0x0288  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [android.view.View$OnClickListener] */
    /* JADX WARN: Type inference failed for: r3v102 */
    /* JADX WARN: Type inference failed for: r3v103, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r3v167 */
    /* JADX WARN: Type inference failed for: r3v168, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v192 */
    /* JADX WARN: Type inference failed for: r3v193 */
    /* JADX WARN: Type inference failed for: r4v44, types: [java.lang.StringBuilder] */
    public final void o() {
        String strW;
        long j6;
        String strSubstring;
        String strSubstring2;
        List<OrderDetailQuestionBean> list;
        ImageView orderStatusArrow;
        LinearLayout orderStatusLayout;
        ImageView orderStatusArrow2;
        int i7;
        OrderResultHeaderModel orderResultHeaderModel;
        w wVar = (w) this.f27334c;
        if (wVar != null) {
            h.s(wVar.f40527e, true);
            Unit unit = Unit.f38893a;
        }
        TradeRecordDetailResp.RecordDetail recordDetail = this.f33218g;
        if (recordDetail != null) {
            AttributeSet attributeSet = null;
            if (TextUtils.isEmpty(recordDetail.getRecipientFullName())) {
                OrderResultHeaderModel orderResultHeaderModel2 = this.f33222p;
                if (orderResultHeaderModel2 != null) {
                    int i10 = recordDetail.getBusinessType() == 16 ? p159kd.h.sm_bill_detail_book_transfer_to_s_short : p159kd.h.sm_bill_detail_transfer_to_s_short;
                    String recipientPhone = recordDetail.getRecipientPhone();
                    orderResultHeaderModel2.o(getString(i10, recipientPhone != null ? r0.w(recipientPhone) : null));
                }
            } else {
                OrderResultHeaderModel orderResultHeaderModel3 = this.f33222p;
                if (orderResultHeaderModel3 != null) {
                    orderResultHeaderModel3.o(getString(recordDetail.getBusinessType() == 16 ? p159kd.h.sm_bill_detail_book_transfer_to_s_short : p159kd.h.sm_bill_detail_transfer_to_s_short, recordDetail.getRecipientFullName()));
                }
            }
            OrderResultHeaderModel orderResultHeaderModel4 = this.f33222p;
            int i11 = 0;
            if (orderResultHeaderModel4 != null) {
                Long payAmount = recordDetail.getPayAmount();
                orderResultHeaderModel4.c(r0.B(payAmount != null ? payAmount.longValue() : 0L, false));
            }
            int i12 = 6;
            if (recordDetail.getOrderStatus() == 1 || recordDetail.getOrderStatus() == 13 || recordDetail.getOrderStatus() == 6) {
                OrderResultHeaderModel orderResultHeaderModel5 = this.f33222p;
                if (orderResultHeaderModel5 != null) {
                    Long payAmount2 = recordDetail.getPayAmount();
                    orderResultHeaderModel5.c(r0.B(payAmount2 != null ? payAmount2.longValue() : 0L, false));
                }
            } else if ((recordDetail.getOrderStatus() == 5 || recordDetail.getOrderStatus() == 15) && (orderResultHeaderModel = this.f33222p) != null) {
                Long payAmount3 = recordDetail.getPayAmount();
                orderResultHeaderModel.c(r0.B(payAmount3 != null ? payAmount3.longValue() : 0L, false));
            }
            SpanUtils spanUtils = new SpanUtils();
            if (!TextUtils.isEmpty(recordDetail.getRecipientPhone())) {
                String recipientPhone2 = recordDetail.getRecipientPhone();
                if (recipientPhone2 != null) {
                    strW = r0.w(recipientPhone2);
                } else {
                    strW = null;
                }
            } else if (TextUtils.isEmpty(recordDetail.getRecipientBankAccount())) {
                strW = "";
            } else {
                String recipientBankAccount = recordDetail.getRecipientBankAccount();
                if (recipientBankAccount != null) {
                    strW = r0.w(recipientBankAccount);
                } else {
                    strW = null;
                }
            }
            if (TextUtils.isEmpty(recordDetail.getRecipientFullName())) {
                j6 = 0;
                StringBuilder sb2 = new StringBuilder();
                if (!TextUtils.isEmpty(recordDetail.getRecipientBankName())) {
                    sb2.append(recordDetail.getRecipientBankName());
                }
                if (!TextUtils.isEmpty(strW)) {
                    if (!TextUtils.isEmpty(sb2)) {
                        sb2.append(" | ");
                    }
                    sb2.append(strW);
                }
                spanUtils.append(sb2);
            } else {
                String recipientFullName = recordDetail.getRecipientFullName();
                if (recipientFullName == null) {
                    recipientFullName = "";
                }
                spanUtils.append(recipientFullName);
                StringBuilder sb3 = new StringBuilder();
                if (TextUtils.isEmpty(recordDetail.getRecipientBankName())) {
                    j6 = 0;
                } else {
                    j6 = 0;
                    sb3.append(recordDetail.getRecipientBankName());
                }
                if (!TextUtils.isEmpty(strW)) {
                    if (!TextUtils.isEmpty(sb3)) {
                        sb3.append(" | ");
                    }
                    sb3.append(strW);
                }
                if (!TextUtils.isEmpty(sb3)) {
                    spanUtils.appendLine().append(sb3).setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorTextNormal, this));
                }
                Unit unit2 = Unit.f38893a;
            }
            r(this, getString(k.core_recipient), spanUtils.create(), 60);
            if (!TextUtils.isEmpty(recordDetail.getShopName())) {
                r(this, getString(p159kd.h.sm_shop_name), recordDetail.getShopName(), 60);
            }
            if (!TextUtils.isEmpty(recordDetail.getPayeeQRAccountNo())) {
                String string = getString(p159kd.h.sm_qr_card_no);
                String payeeQRAccountNo = recordDetail.getPayeeQRAccountNo();
                r(this, string, payeeQRAccountNo != null ? r0.w(payeeQRAccountNo) : null, 60);
            }
            if (!TextUtils.isEmpty(recordDetail.getPartnerAccountNo())) {
                int businessType = recordDetail.getBusinessType();
                String string2 = businessType != 11 ? (businessType == 13 || businessType == 14) ? getString(k.core_merchant_account_id) : getString(k.core_account) : getString(k.core_partner_account_id);
                String partnerAccountNo = recordDetail.getPartnerAccountNo();
                r(this, string2, partnerAccountNo != null ? r0.w(partnerAccountNo) : null, 60);
            }
            int i13 = 1;
            if ((recordDetail.getBusinessType() == 9 || recordDetail.getBusinessType() == 3 || recordDetail.getBusinessType() == 16) && ((recordDetail.getOrderStatus() == 3 || recordDetail.getOrderStatus() == 5) && !TextUtils.isEmpty(recordDetail.getChannelTransactionId()))) {
                String channelTransactionId = recordDetail.getChannelTransactionId();
                if (channelTransactionId == null) {
                    strSubstring = "";
                } else {
                    String channelTransactionId2 = recordDetail.getChannelTransactionId();
                    strSubstring = channelTransactionId.substring(0, (channelTransactionId2 != null ? channelTransactionId2.length() : 0) / 2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    if (strSubstring == null) {
                        strSubstring = "";
                    }
                }
                String channelTransactionId3 = recordDetail.getChannelTransactionId();
                if (channelTransactionId3 == null) {
                    strSubstring2 = "";
                } else {
                    String channelTransactionId4 = recordDetail.getChannelTransactionId();
                    strSubstring2 = channelTransactionId3.substring((channelTransactionId4 != null ? channelTransactionId4.length() : 0) / 2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    if (strSubstring2 == null) {
                        strSubstring2 = "";
                    }
                }
                String[] strArr = {strSubstring, strSubstring2};
                r(this, getString(p159kd.h.sm_session_id), q0.y(strArr[0], ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, strArr[1]), 44);
                if (!TextUtils.isEmpty(recordDetail.getCustomerServiceTips())) {
                    String customerServiceTips = recordDetail.getCustomerServiceTips();
                    String customerServiceHighlightText = recordDetail.getCustomerServiceHighlightText();
                    BankCustomerServiceView bankCustomerServiceView = new BankCustomerServiceView(this, attributeSet, i12, i11);
                    bankCustomerServiceView.c(customerServiceTips, customerServiceHighlightText);
                    B listener = new B(this);
                    Intrinsics.checkNotNullParameter(listener, "listener");
                    bankCustomerServiceView.f33831b = listener;
                    w wVar2 = (w) this.f27334c;
                    if (wVar2 != null) {
                        wVar2.f40526d.addView(bankCustomerServiceView);
                    }
                    h.j(bankCustomerServiceView, Integer.valueOf(-ScreenUtils.dip2px(10.0f)), Integer.valueOf(ScreenUtils.dip2px(8.0f)), Integer.valueOf(ScreenUtils.dip2px(8.0f)), 0);
                }
            }
            if (!TextUtils.isEmpty(recordDetail.getRecipientRemark())) {
                r(this, getString(k.core_notes), recordDetail.getRecipientRemark(), 60);
            } else if (!TextUtils.isEmpty(recordDetail.getSenderRemark())) {
                r(this, getString(k.core_notes), recordDetail.getSenderRemark(), 60);
            }
            if (recordDetail.getBusinessType() == 10 && !TextUtils.isEmpty(recordDetail.getPayeeQRAccountNo())) {
                String string3 = getString(k.core_remark);
                String payeeQRAccountNo2 = recordDetail.getPayeeQRAccountNo();
                r(this, string3, "Transfer to QR Card \nNo." + (payeeQRAccountNo2 != null ? r0.w(payeeQRAccountNo2) : attributeSet), 60);
            }
            if (recordDetail.getOrderStatus() == 5 || recordDetail.getOrderStatus() == 6 || recordDetail.getOrderStatus() == 13 || recordDetail.getOrderStatus() == 12 || recordDetail.getOrderStatus() == 11 || recordDetail.getOrderStatus() == 14) {
                String string4 = getString(k.core_completion_time);
                Long updateTime = recordDetail.getUpdateTime();
                r(this, string4, r0.N(updateTime != null ? updateTime.longValue() : j6), 60);
            } else {
                String string5 = getString(k.core_create_time);
                Long createTime = recordDetail.getCreateTime();
                r(this, string5, r0.N(createTime != null ? createTime.longValue() : j6), 60);
            }
            if (!TextUtils.isEmpty(recordDetail.getPartnerPhone())) {
                String string6 = getString(p159kd.h.sm_bill_detail_sender_info);
                int i14 = p159kd.h.sm_bill_detail_name_and_phone;
                String senderFullName = recordDetail.getSenderFullName();
                String senderPhone = recordDetail.getSenderPhone();
                r(this, string6, getString(i14, senderFullName, senderPhone != null ? r0.w(senderPhone) : attributeSet), 60);
            }
            if (!TextUtils.isEmpty(recordDetail.getOrderNo())) {
                r(this, getString(k.core_receipt_transaction_id), recordDetail.getOrderNo(), 44);
            }
            if (recordDetail.getEarlyRefundGuarantee() == 2) {
                r(this, getString(p159kd.h.sm_2_hours_assurance), new SpanUtils().appendImage(d.sm_ic_early_refund_effect).append(" " + recordDetail.getEarlyRefundDesc()).create(), 60);
            }
            if (!TextUtils.isEmpty(recordDetail.getTransferApplication())) {
                r(this, getString(p159kd.h.sm_transaction_application), recordDetail.getTransferApplication(), 60);
            }
            String paymentTypeDesc = recordDetail.getPaymentTypeDesc();
            this.f33219i = paymentTypeDesc;
            if (TextUtils.isEmpty(paymentTypeDesc)) {
                this.f33219i = c.e(recordDetail.getBusinessType(), this);
            }
            OrderResultItemModel orderResultItemModelR = r(this, getString(k.core_bill_detail_bill_type), this.f33219i, 60);
            List<PaymentMethodComb> paymentMethods = recordDetail.getPaymentMethods();
            if (paymentMethods == null || paymentMethods.isEmpty()) {
                String payTypeDesc = recordDetail.getPayTypeDesc();
                this.f33220j = payTypeDesc;
                if (TextUtils.isEmpty(payTypeDesc)) {
                    int payType = recordDetail.getPayType();
                    String senderBankName = recordDetail.getSenderBankName();
                    String senderBankCard = recordDetail.getSenderBankCard();
                    if (payType == 1) {
                        senderBankName = BaseApplication.getContext().getString(p159kd.h.sm_confirm_balance);
                    } else if (payType == 2) {
                        if (TextUtils.isEmpty(senderBankName) && TextUtils.isEmpty(senderBankCard)) {
                            senderBankName = BaseApplication.getContext().getResources().getString(p159kd.h.sm_bank_card_payment_method);
                        } else if (TextUtils.isEmpty(senderBankCard)) {
                            if (senderBankName.length() > 12) {
                                senderBankName = senderBankName.substring(0, 12);
                            }
                        } else if (TextUtils.isEmpty(senderBankName)) {
                            senderBankName = "**** " + r0.f0(senderBankCard);
                        } else if (senderBankName.length() > 12) {
                            senderBankName = senderBankName.substring(0, 12) + "... (**** " + r0.f0(senderBankCard) + ")";
                        } else {
                            StringBuilder sbT = G.t(senderBankName, "(**** ");
                            sbT.append(r0.f0(senderBankCard));
                            sbT.append(")");
                            senderBankName = sbT.toString();
                        }
                    } else if (payType == 7) {
                        senderBankName = (TextUtils.isEmpty(senderBankName) && TextUtils.isEmpty(senderBankCard)) ? BaseApplication.getContext().getResources().getString(k.core_bank_account) : r0.A0(senderBankName, senderBankCard);
                    } else if (payType == 11) {
                        senderBankName = BaseApplication.getContext().getResources().getString(p159kd.h.sm_mobile_wallet_payment_method);
                    } else if (payType == 18) {
                        senderBankName = BaseApplication.getContext().getResources().getString(k.core_ok_card);
                    } else {
                        senderBankName = payType == 40 ? BaseApplication.getContext().getResources().getString(k.core_palmpay_payment_cash_box) : BaseApplication.getContext().getString(p159kd.h.sm_confirm_balance);
                    }
                    this.f33220j = senderBankName;
                }
                r(this, getString(p159kd.h.sm_bill_detail_account), this.f33220j, 60);
            } else {
                List<PaymentMethodComb> paymentMethods2 = recordDetail.getPaymentMethods();
                if (paymentMethods2 != null) {
                    int i15 = 0;
                    for (Object obj : paymentMethods2) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            C1850q.k();
                            throw attributeSet;
                        }
                        PaymentMethodComb paymentMethodComb = (PaymentMethodComb) obj;
                        String string7 = i15 == 0 ? getString(p159kd.h.sm_bill_detail_account) : "";
                        String paymentMethod = paymentMethodComb.getPaymentMethod();
                        String jumpUrl = paymentMethodComb.getJumpUrl();
                        int i17 = (jumpUrl == null || jumpUrl.length() == 0) ? 1002 : 1004;
                        String jumpUrl2 = paymentMethodComb.getJumpUrl();
                        ?? nVar = (jumpUrl2 == null || jumpUrl2.length() == 0) ? attributeSet : new n(22, this, paymentMethodComb);
                        OrderResultItemModel orderResultItemModel = new OrderResultItemModel(this, i17, string7, paymentMethod);
                        if (nVar != 0) {
                            orderResultItemModel.setOnClickListener(new j(i13, nVar));
                        }
                        w wVar3 = (w) this.f27334c;
                        if (wVar3 != null) {
                            wVar3.f40526d.addView(orderResultItemModel);
                        }
                        i15 = i16;
                        i13 = 1;
                    }
                    Unit unit3 = Unit.f38893a;
                }
            }
            q(getString(p159kd.h.sm_transfer_amount), c.a(recordDetail.getAmount()), false, null);
            List<TradeRecordDetailResp.RecordDetail.TransferTax> transferTaxes = recordDetail.getTransferTaxes();
            if (transferTaxes != null) {
                if (transferTaxes.isEmpty()) {
                    transferTaxes = null;
                }
                if (transferTaxes != null) {
                    for (TradeRecordDetailResp.RecordDetail.TransferTax transferTax : transferTaxes) {
                        SpanUtils spanUtils2 = new SpanUtils();
                        Long underlineTax = transferTax.getUnderlineTax();
                        if ((underlineTax != null ? underlineTax.longValue() : j6) > j6) {
                            Long underlineTax2 = transferTax.getUnderlineTax();
                            spanUtils2.append(c.a(underlineTax2 != null ? underlineTax2.longValue() : j6)).setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, this)).setStrikethrough().append(" ");
                        }
                        Long tax = transferTax.getTax();
                        spanUtils2.append(c.a(tax != null ? tax.longValue() : j6));
                        String taxName = transferTax.getTaxName();
                        SpannableStringBuilder spannableStringBuilderCreate = spanUtils2.create();
                        List<TradeRecordDetailResp.RecordDetail.SubTax> subTaxList = transferTax.getSubTaxList();
                        if (subTaxList != null) {
                            i7 = 1;
                            boolean z3 = !subTaxList.isEmpty();
                            q(taxName, spannableStringBuilderCreate, z3, new C(this, transferTax, i7));
                        } else {
                            i7 = 1;
                        }
                        q(taxName, spannableStringBuilderCreate, z3, new C(this, transferTax, i7));
                    }
                    Unit unit4 = Unit.f38893a;
                }
            }
            if (recordDetail.getCsLevyFee() > j6 || recordDetail.getPlatformCsLevyFee() > j6) {
                SpanUtils spanUtilsAppend = new SpanUtils().append(c.a(recordDetail.getCsLevyFee()));
                if (recordDetail.getPlatformCsLevyFee() > j6) {
                    spanUtilsAppend.append(" ").append(c.a(recordDetail.getPlatformCsLevyFee())).setStrikethrough().setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, this));
                }
                q(getString(p159kd.h.sm_bill_detail_cybersecurity_fee), spanUtilsAppend.create(), !TextUtils.isEmpty(recordDetail.getCsLevyFeeJumpUrl()), new A(this, recordDetail, 1));
            }
            if (recordDetail.getEarlyRefundPayerFee() > j6 && recordDetail.getEarlyRefundGuarantee() == 2) {
                q(getString(p159kd.h.sm_2_hours_assurance_service_fee), c.a(recordDetail.getEarlyRefundPayerFee()), false, null);
            }
            if (recordDetail.getDeductPoint() > j6) {
                q(getString(p159kd.h.sm_bill_detail_used_points), u.i(recordDetail.getDeductPoint(), "-"), false, null);
            }
            Long returnBonus = recordDetail.getReturnBonus();
            if ((returnBonus != null ? returnBonus.longValue() : j6) > j6) {
                String string8 = getString(v.cv_all_data_bonus_earned);
                Long returnBonus2 = recordDetail.getReturnBonus();
                q(string8, i0.t(returnBonus2 != null ? returnBonus2.longValue() : j6), false, null);
            }
            if (recordDetail.getRedeemPoint() > j6) {
                q(getString(p159kd.h.sm_bill_detail_earned_points), u.i(recordDetail.getRedeemPoint(), "+"), false, null);
            }
            if (recordDetail.getCashEarned() > j6) {
                q(getString(k.core_cash_earned), r0.B(recordDetail.getCashEarned(), false), false, null);
            }
            Long couponAmount = recordDetail.getCouponAmount();
            if ((couponAmount != null ? couponAmount.longValue() : j6) > j6) {
                String string9 = getString(p159kd.h.sm_bill_detail_coupon);
                Long couponAmount2 = recordDetail.getCouponAmount();
                q(string9, "-" + r0.B(couponAmount2 != null ? couponAmount2.longValue() : j6, false), false, null);
            }
            Long discountAmount = recordDetail.getDiscountAmount();
            if ((discountAmount != null ? discountAmount.longValue() : j6) > j6) {
                String string10 = getString(k.core_discount);
                Long discountAmount2 = recordDetail.getDiscountAmount();
                list = null;
                q(string10, "-" + r0.B(discountAmount2 != null ? discountAmount2.longValue() : j6, false), false, null);
            } else {
                list = null;
            }
            String string11 = getString(p159kd.h.sm_payment_amount);
            Long payAmount4 = recordDetail.getPayAmount();
            OrderResultAmountStyle2 orderResultAmountStyle2 = new OrderResultAmountStyle2(this, string11, c.a(payAmount4 != null ? payAmount4.longValue() : j6));
            w wVar4 = (w) this.f27334c;
            if (wVar4 != null) {
                wVar4.f40527e.addView(orderResultAmountStyle2);
            }
            if (recordDetail.getBusinessType() == 7 || recordDetail.getBusinessType() == 8) {
                p(recordDetail.getRecipientHeadImage());
                OrderResultHeaderModel orderResultHeaderModel6 = this.f33222p;
                if (orderResultHeaderModel6 != null) {
                    Long payAmount5 = recordDetail.getPayAmount();
                    orderResultHeaderModel6.c(r0.B(payAmount5 != null ? payAmount5.longValue() : j6, false));
                }
                String string12 = getString(p159kd.h.sm_bill_detail_revoke);
                this.f33219i = string12;
                orderResultItemModelR.j(string12);
            } else if (recordDetail.getBusinessType() == 5) {
                p(recordDetail.getRecipientHeadImage());
                if (recordDetail.getOrderStatus() == 3) {
                    if (s()) {
                        w wVar5 = (w) this.f27334c;
                        if (wVar5 != null) {
                            wVar5.f40529g.setText(k.core_apply_for_balance);
                            Unit unit5 = Unit.f38893a;
                        }
                        w wVar6 = (w) this.f27334c;
                        if (wVar6 != null) {
                            wVar6.f40529g.setVisibility(0);
                            Unit unit6 = Unit.f38893a;
                        }
                    } else {
                        w wVar7 = (w) this.f27334c;
                        if (wVar7 != null) {
                            wVar7.f40529g.setText(p159kd.h.sm_bill_detail_cancel_action);
                            Unit unit7 = Unit.f38893a;
                        }
                    }
                    w wVar8 = (w) this.f27334c;
                    if (wVar8 != null) {
                        wVar8.f40529g.setVisibility(0);
                        Unit unit8 = Unit.f38893a;
                    }
                    OrderResultHeaderModel orderResultHeaderModel7 = this.f33222p;
                    if (orderResultHeaderModel7 != null) {
                        Long payAmount6 = recordDetail.getPayAmount();
                        orderResultHeaderModel7.c(r0.B(payAmount6 != null ? payAmount6.longValue() : j6, false));
                    }
                } else if (recordDetail.getOrderStatus() > 3) {
                    w wVar9 = (w) this.f27334c;
                    if (wVar9 != null) {
                        wVar9.f40529g.setVisibility(8);
                        Unit unit9 = Unit.f38893a;
                    }
                    OrderResultHeaderModel orderResultHeaderModel8 = this.f33222p;
                    if (orderResultHeaderModel8 != null) {
                        Long payAmount7 = recordDetail.getPayAmount();
                        orderResultHeaderModel8.c(r0.B(payAmount7 != null ? payAmount7.longValue() : j6, false));
                    }
                } else {
                    w wVar10 = (w) this.f27334c;
                    if (wVar10 != null) {
                        wVar10.f40529g.setVisibility(8);
                        Unit unit10 = Unit.f38893a;
                    }
                    OrderResultHeaderModel orderResultHeaderModel9 = this.f33222p;
                    if (orderResultHeaderModel9 != null) {
                        Long payAmount8 = recordDetail.getPayAmount();
                        orderResultHeaderModel9.c(r0.B(payAmount8 != null ? payAmount8.longValue() : j6, false));
                    }
                }
            } else if (recordDetail.getBusinessType() == 4) {
                p(recordDetail.getRecipientHeadImage());
                OrderResultHeaderModel orderResultHeaderModel10 = this.f33222p;
                if (orderResultHeaderModel10 != null) {
                    orderResultHeaderModel10.o(getString(p159kd.h.sm_bill_detail_request_from_s, recordDetail.getRecipientFullName()));
                }
                int orderStatus = recordDetail.getOrderStatus();
                if (orderStatus == 2) {
                    w wVar11 = (w) this.f27334c;
                    if (wVar11 != null) {
                        wVar11.f40529g.setText(k.core_send_money);
                        Unit unit11 = Unit.f38893a;
                    }
                    w wVar12 = (w) this.f27334c;
                    if (wVar12 != null) {
                        wVar12.f40529g.setBackgroundResource(p025ba.d.core_next_btn_selector_corner_12dp_bg);
                        Unit unit12 = Unit.f38893a;
                    }
                    w wVar13 = (w) this.f27334c;
                    if (wVar13 != null) {
                        wVar13.f40529g.setTextColor(getColor(L6.b.ppColorTextBase));
                        Unit unit13 = Unit.f38893a;
                    }
                    w wVar14 = (w) this.f27334c;
                    if (wVar14 != null) {
                        wVar14.f40529g.setVisibility(0);
                        Unit unit14 = Unit.f38893a;
                    }
                    OrderResultHeaderModel orderResultHeaderModel11 = this.f33222p;
                    if (orderResultHeaderModel11 != null) {
                        orderResultHeaderModel11.c(r0.B(recordDetail.getAmount(), false));
                    }
                } else if (orderStatus != 5) {
                    w wVar15 = (w) this.f27334c;
                    if (wVar15 != null) {
                        wVar15.f40529g.setVisibility(8);
                        Unit unit15 = Unit.f38893a;
                    }
                    OrderResultHeaderModel orderResultHeaderModel12 = this.f33222p;
                    if (orderResultHeaderModel12 != null) {
                        orderResultHeaderModel12.c(r0.B(recordDetail.getAmount(), false));
                    }
                } else {
                    w wVar16 = (w) this.f27334c;
                    if (wVar16 != null) {
                        wVar16.f40529g.setVisibility(8);
                        Unit unit16 = Unit.f38893a;
                    }
                    OrderResultHeaderModel orderResultHeaderModel13 = this.f33222p;
                    if (orderResultHeaderModel13 != null) {
                        Long payAmount9 = recordDetail.getPayAmount();
                        orderResultHeaderModel13.c(r0.B(payAmount9 != null ? payAmount9.longValue() : j6, false));
                    }
                }
            } else if (recordDetail.getBusinessType() == 3 || recordDetail.getBusinessType() == 9 || recordDetail.getBusinessType() == 16) {
                p(recordDetail.getRecipientBankUrl());
                Unit unit17 = Unit.f38893a;
            } else if (recordDetail.getBusinessType() == 6) {
                String recipientHeadImage = recordDetail.getRecipientHeadImage();
                OrderResultHeaderModel orderResultHeaderModel14 = this.f33222p;
                r0.j1(orderResultHeaderModel14 != null ? (ImageView) orderResultHeaderModel14.findViewById(s.iv_order_result_logo) : list, recipientHeadImage, G1.d.O(r.cv_mobile_wallet_icon));
                Unit unit18 = Unit.f38893a;
            } else {
                p(recordDetail.getRecipientHeadImage());
                Unit unit19 = Unit.f38893a;
            }
            OrderCompensateBean orderCompensate = recordDetail.getOrderCompensate();
            if (orderCompensate != null && Intrinsics.c(orderCompensate.getShowCompensate(), Boolean.TRUE)) {
                TransferToPalmPayProgressView transferToPalmPayProgressView = this.t;
                if (transferToPalmPayProgressView != null) {
                    h.C(transferToPalmPayProgressView);
                    Unit unit20 = Unit.f38893a;
                }
                TransferToPalmPayProgressView transferToPalmPayProgressView2 = this.t;
                if (transferToPalmPayProgressView2 != null) {
                    transferToPalmPayProgressView2.setData(orderCompensate);
                    Unit unit21 = Unit.f38893a;
                }
            }
            TransferToBankProgressModel transferToBankProgressModel = this.f33223v;
            if (transferToBankProgressModel != null) {
                h.c(transferToBankProgressModel);
                Unit unit22 = Unit.f38893a;
            }
            TransferDetailQuestionView transferDetailQuestionView = this.f33224w;
            if (transferDetailQuestionView != null) {
                h.c(transferDetailQuestionView);
                Unit unit23 = Unit.f38893a;
            }
            BillProcessDetail orderStatusInfo = recordDetail.getOrderStatusInfo();
            if (orderStatusInfo != null) {
                List<OrderDetailQuestionBean> list2 = orderStatusInfo.faqLinkList;
                if (list2 != null) {
                    if (list2.size() <= 0) {
                        list2 = list;
                    }
                    if (list2 != null) {
                        TransferDetailQuestionView transferDetailQuestionView2 = this.f33224w;
                        if (transferDetailQuestionView2 != null) {
                            h.C(transferDetailQuestionView2);
                            Unit unit24 = Unit.f38893a;
                        }
                        TransferDetailQuestionView transferDetailQuestionView3 = this.f33224w;
                        if (transferDetailQuestionView3 != null) {
                            transferDetailQuestionView3.setData(list2);
                            Unit unit25 = Unit.f38893a;
                        }
                    }
                }
                if (!orderStatusInfo.showProcessBar) {
                    OrderResultHeaderModel orderResultHeaderModel15 = this.f33222p;
                    if (orderResultHeaderModel15 == null || (orderStatusArrow = orderResultHeaderModel15.getOrderStatusArrow()) == null) {
                        return;
                    }
                    h.c(orderStatusArrow);
                    Unit unit26 = Unit.f38893a;
                    return;
                }
                OrderResultHeaderModel orderResultHeaderModel16 = this.f33222p;
                if (orderResultHeaderModel16 != null && (orderStatusArrow2 = orderResultHeaderModel16.getOrderStatusArrow()) != null) {
                    h.C(orderStatusArrow2);
                    Unit unit27 = Unit.f38893a;
                }
                OrderResultHeaderModel orderResultHeaderModel17 = this.f33222p;
                if (orderResultHeaderModel17 != null && (orderStatusLayout = orderResultHeaderModel17.getOrderStatusLayout()) != null) {
                    orderStatusLayout.setOnClickListener(this);
                    Unit unit28 = Unit.f38893a;
                }
                List<BillProcessTitleData1> list3 = orderStatusInfo.tips;
                if (list3 != null) {
                    List list4 = list3.size() > 0 ? list3 : list;
                    if (list4 != null) {
                        TransferToBankProgressModel transferToBankProgressModel2 = this.f33223v;
                        if (transferToBankProgressModel2 != null) {
                            h.C(transferToBankProgressModel2);
                            Unit unit29 = Unit.f38893a;
                        }
                        TransferToBankProgressModel transferToBankProgressModel3 = this.f33223v;
                        if (transferToBankProgressModel3 != null) {
                            transferToBankProgressModel3.a(list4, true);
                            Unit unit30 = Unit.f38893a;
                        }
                        Unit unit31 = Unit.f38893a;
                    }
                }
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View view) {
        BillProcessDetail billProcessDetail;
        List<BillProcessTitleData1> list;
        Intrinsics.checkNotNullParameter(view, "view");
        int id2 = view.getId();
        if (id2 != e.record_cancel_btn) {
            if (id2 != s.layout_order_status || (billProcessDetail = this.f33221o) == null || (list = billProcessDetail.tips) == null) {
                return;
            }
            if ((list.size() > 0 ? list : null) != null) {
                TransferProcessDialog transferProcessDialog = new TransferProcessDialog(this);
                transferProcessDialog.show();
                transferProcessDialog.fillData(this.f33221o);
                return;
            }
            return;
        }
        TradeRecordDetailResp.RecordDetail recordDetail = this.f33218g;
        if (recordDetail != null) {
            int i7 = this.f33217f;
            if (i7 != 1) {
                if (i7 == 2) {
                    if (recordDetail.getBusinessType() == 4) {
                        showLoadingDialog(true);
                        CancelVoucherReq cancelVoucherReq = new CancelVoucherReq();
                        cancelVoucherReq.setOrderId(this.f33216e);
                        cancelVoucherReq.setRole(2);
                        TradeRecordViewModel tradeRecordViewModel = (TradeRecordViewModel) l();
                        tradeRecordViewModel.getClass();
                        p140j8.f.s(tradeRecordViewModel, new C0415t0(cancelVoucherReq, null), tradeRecordViewModel.f34023f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        return;
                    }
                    if (recordDetail.getBusinessType() == 5) {
                        if (s()) {
                            q0.u("/account/ask_apply_for_balance");
                            return;
                        }
                        String str = this.f33216e;
                        String string = getString(v.cv_voucher_msg_dialog_title);
                        String string2 = getString(v.cv_voucher_msg_dialog_collect_button);
                        F f10 = new F(this, str);
                        VoucherMsgDialog voucherMsgDialog = new VoucherMsgDialog(this, com.transsnet.palmpay.custom_view.t.cv_voucher_msg_dialog);
                        voucherMsgDialog.setmOperation(string2);
                        voucherMsgDialog.setmTitle(string);
                        voucherMsgDialog.setShowSkip(true);
                        voucherMsgDialog.setOnVoucherMsgClickLister(f10);
                        voucherMsgDialog.show();
                        return;
                    }
                    return;
                }
                return;
            }
            if (recordDetail.getBusinessType() == 5) {
                if (s()) {
                    q0.u("/account/ask_apply_for_balance");
                    return;
                }
                showLoadingDialog(true);
                CancelVoucherReq cancelVoucherReq2 = new CancelVoucherReq();
                cancelVoucherReq2.setOrderId(this.f33216e);
                cancelVoucherReq2.setRole(1);
                TradeRecordViewModel tradeRecordViewModel2 = (TradeRecordViewModel) l();
                tradeRecordViewModel2.getClass();
                p140j8.f.s(tradeRecordViewModel2, new C0418u0(cancelVoucherReq2, null), tradeRecordViewModel2.f34024g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                return;
            }
            if (recordDetail.getBusinessType() == 4) {
                C1958a c1958a = new C1958a(this);
                c1958a.f41720n = recordDetail.getRecipientPhone();
                c1958a.f41718l = Integer.valueOf(recordDetail.getBusinessType());
                c1958a.f4971b = recordDetail.getOrderNo();
                c1958a.c(Long.valueOf(recordDetail.getAmount()));
                c1958a.f4972c = "03";
                c1958a.f4974e = "1";
                ArrayList arrayList = new ArrayList();
                String string3 = getString(k.core_account_number);
                String recipientPhone = recordDetail.getRecipientPhone();
                arrayList.add(new CoreCashierPaymentExtra(string3, recipientPhone != null ? r0.w(recipientPhone) : null));
                if (!TextUtils.isEmpty(recordDetail.getRecipientFullName())) {
                    arrayList.add(new CoreCashierPaymentExtra(getString(k.core_name), recordDetail.getRecipientFullName()));
                }
                c1958a.b(arrayList);
                c1958a.d();
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f33215d) {
            this.f33215d = false;
        } else {
            if (TextUtils.isEmpty(this.f33216e)) {
                return;
            }
            ((TradeRecordViewModel) l()).d(this.f33216e);
        }
    }

    public final void p(String str) {
        if (str != null) {
            OrderResultHeaderModel orderResultHeaderModel = this.f33222p;
            if (orderResultHeaderModel != null) {
                orderResultHeaderModel.h(str);
                return;
            }
            return;
        }
        OrderResultHeaderModel orderResultHeaderModel2 = this.f33222p;
        if (orderResultHeaderModel2 != null) {
            orderResultHeaderModel2.d(r.cv_avatar_default);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        this.f33216e = getIntent().getStringExtra("orderId");
        this.f33217f = getIntent().getIntExtra("orderType", 0);
        if (TextUtils.isEmpty(this.f33216e)) {
            String queryParameter = getQueryParameter("orderId");
            this.f33216e = queryParameter;
            if (TextUtils.isEmpty(queryParameter)) {
                finish();
                return;
            }
        }
        Handler uIHandler = getUIHandler();
        Intrinsics.checkNotNullExpressionValue(uIHandler, "getUIHandler(...)");
        getWindow().getDecorView().post(new p7.h(uIHandler, 2, this, false));
    }

    public final OrderResultAmountStyle1 q(String str, CharSequence charSequence, boolean z3, View.OnClickListener onClickListener) {
        ImageView amountItemTipsIv;
        OrderResultAmountStyle1 orderResultAmountStyle1 = new OrderResultAmountStyle1(this, str, charSequence);
        orderResultAmountStyle1.b(z3 ? 0 : 8);
        if (onClickListener != null && z3 && (amountItemTipsIv = orderResultAmountStyle1.getAmountItemTipsIv()) != null) {
            amountItemTipsIv.setOnClickListener(new j(0, onClickListener));
        }
        w wVar = (w) this.f27334c;
        if (wVar != null) {
            wVar.f40527e.addView(orderResultAmountStyle1);
        }
        return orderResultAmountStyle1;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ImageView rightImageView1;
        super.setupView();
        w wVar = (w) this.f27334c;
        if (wVar != null && (rightImageView1 = wVar.f40530i.getRightImageView1()) != null) {
            rightImageView1.setImageDrawable(p059e1.a.h(this, S6.a.pay_CustomerService, null, CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, this), 24.0f));
        }
        w wVar2 = (w) this.f27334c;
        if (wVar2 != null) {
            wVar2.f40530i.setRightImageView1ClickListener(new o(this, 17));
        }
        w wVar3 = (w) this.f27334c;
        if (wVar3 != null) {
            wVar3.f40528f.setOnTransferDetailBottomModelListener(new E(this));
        }
        w wVar4 = (w) this.f27334c;
        if (wVar4 != null) {
            wVar4.f40529g.setOnClickListener(this);
        }
    }
}
