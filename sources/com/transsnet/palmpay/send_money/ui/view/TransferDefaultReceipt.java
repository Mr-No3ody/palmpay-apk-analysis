package com.transsnet.palmpay.send_money.ui.view;

import C0.G;
import N8.q0;
import Pa.i0;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.send_money.bean.TradeRecordDetailResp;
import com.transsnet.palmpay.send_money.ui.view.TransferDefaultReceipt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159kd.f;
import p159kd.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001b\u0010\u001d\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013R\u001b\u0010 \u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013R\u001b\u0010#\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010\u0013R\u001b\u0010&\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b%\u0010\u0013R\u001b\u0010)\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0011\u001a\u0004\b(\u0010\u0013R\u001b\u0010,\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0011\u001a\u0004\b+\u0010\u0013R\u001b\u0010/\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0011\u001a\u0004\b.\u0010\u0013R\u001b\u00102\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0011\u001a\u0004\b1\u0010\u0013R\u001b\u00105\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0011\u001a\u0004\b4\u0010\u0013R\u001b\u00108\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u0011\u001a\u0004\b7\u0010\u0013R\u001b\u0010;\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u0011\u001a\u0004\b:\u0010\u0013¨\u0006<"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/view/TransferDefaultReceipt;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/transsnet/palmpay/send_money/bean/TradeRecordDetailResp$RecordDetail;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "setData", "(Lcom/transsnet/palmpay/send_money/bean/TradeRecordDetailResp$RecordDetail;)V", "Landroid/widget/TextView;", "a", "Lkotlin/Lazy;", "getTv_session_id", "()Landroid/widget/TextView;", "tv_session_id", "b", "getTv_session_id_title", "tv_session_id_title", "c", "getTv_transaction_id", "tv_transaction_id", "d", "getTv_transaction_id_title", "tv_transaction_id_title", "e", "getTv_remark", "tv_remark", "f", "getTv_remark_title", "tv_remark_title", "g", "getTv_transaction_type", "tv_transaction_type", "i", "getTv_sender_account", "tv_sender_account", "j", "getTv_sender_name", "tv_sender_name", "o", "getTv_recipient_account", "tv_recipient_account", "p", "getTv_recipient_name", "tv_recipient_name", "t", "getTv_date", "tv_date", "v", "getTv_recipient_desc", "tv_recipient_desc", "w", "getStr_amount", "str_amount", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferDefaultReceipt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferDefaultReceipt.kt\ncom/transsnet/palmpay/send_money/ui/view/TransferDefaultReceipt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1#2:159\n*E\n"})
public final class TransferDefaultReceipt extends LinearLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f33854A = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f33855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f33856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f33857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f33859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f33860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f33861g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f33862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f33863j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f33864o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f33865p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f33866v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f33867w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferDefaultReceipt(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final TextView getStr_amount() {
        Object value = this.f33867w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_date() {
        Object value = this.t.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_recipient_account() {
        Object value = this.f33864o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_recipient_desc() {
        Object value = this.f33866v.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_recipient_name() {
        Object value = this.f33865p.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_remark() {
        Object value = this.f33859e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_remark_title() {
        Object value = this.f33860f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_sender_account() {
        Object value = this.f33862i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_sender_name() {
        Object value = this.f33863j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_session_id() {
        Object value = this.f33855a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_session_id_title() {
        Object value = this.f33856b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_transaction_id() {
        Object value = this.f33857c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_transaction_id_title() {
        Object value = this.f33858d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_transaction_type() {
        Object value = this.f33861g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0169  */
    public final void setData(@Nullable TradeRecordDetailResp.RecordDetail data) {
        String recipientBankName;
        String strO;
        String channelTransactionId;
        String strSubstring;
        if (data != null) {
            StringBuilder sb2 = new StringBuilder();
            if (data.getBusinessType() == 3 || data.getBusinessType() == 9 || data.getBusinessType() == 16) {
                recipientBankName = data.getRecipientBankName();
                if (recipientBankName == null) {
                    recipientBankName = "";
                }
            } else {
                recipientBankName = getContext().getString(h.sm_palmpay_text);
                Intrinsics.e(recipientBankName);
            }
            if (!TextUtils.isEmpty(recipientBankName)) {
                sb2.append(recipientBankName);
                sb2.append(" | ");
            }
            int businessType = data.getBusinessType();
            String strSubstring2 = null;
            if (businessType == 3 || businessType == 16) {
                strO = i0.o(data.getRecipientBankAccount());
            } else if (businessType != 13 && businessType != 14) {
                switch (businessType) {
                    case 9:
                        strO = i0.o(data.getRecipientBankAccount());
                        break;
                    case 10:
                        strO = i0.E(data.getPayeeQRAccountNo());
                        break;
                    case 11:
                        strO = i0.o(data.getPartnerAccountNo());
                        break;
                    default:
                        String recipientPhone = data.getRecipientPhone();
                        strO = recipientPhone == null ? null : r0.w(recipientPhone);
                        break;
                }
            } else {
                strO = i0.o(data.getPartnerAccountNo());
            }
            if (!TextUtils.isEmpty(strO)) {
                sb2.append(strO);
            }
            if (TextUtils.isEmpty(data.getRecipientFullName())) {
                getTv_recipient_name().setText(sb2);
            } else {
                getTv_recipient_name().setText(data.getRecipientFullName());
                getTv_recipient_account().setText(sb2);
                p220oa.h.C(getTv_recipient_account());
            }
            if (TextUtils.isEmpty(data.getReceiptDesc())) {
                p220oa.h.c(getTv_recipient_desc());
            } else {
                p220oa.h.C(getTv_recipient_desc());
                getTv_recipient_desc().setText(data.getReceiptDesc());
            }
            if (data.getAmount() > 0) {
                getStr_amount().setText(r0.B(data.getAmount(), false));
            }
            if (!TextUtils.isEmpty(data.getSenderFullName())) {
                getTv_sender_name().setText(data.getSenderFullName());
                if (!TextUtils.isEmpty(data.getSenderPhone())) {
                    TextView tv_sender_account = getTv_sender_account();
                    String senderPhone = data.getSenderPhone();
                    G.x("PalmPay | ", senderPhone != null ? r0.u(senderPhone) : null, tv_sender_account);
                }
            } else if (!TextUtils.isEmpty(data.getSenderPhone())) {
                TextView tv_sender_name = getTv_sender_name();
                String senderPhone2 = data.getSenderPhone();
                G.x("PalmPay | ", senderPhone2 != null ? r0.u(senderPhone2) : null, tv_sender_name);
            }
            TextView tv_transaction_type = getTv_transaction_type();
            String paymentTypeDesc = data.getPaymentTypeDesc();
            if (paymentTypeDesc == null) {
                paymentTypeDesc = Jd.c.e(data.getBusinessType(), getContext());
            } else {
                if (TextUtils.isEmpty(paymentTypeDesc)) {
                    paymentTypeDesc = null;
                }
                if (paymentTypeDesc == null) {
                    paymentTypeDesc = Jd.c.e(data.getBusinessType(), getContext());
                }
            }
            tv_transaction_type.setText(paymentTypeDesc);
            if (!TextUtils.isEmpty(data.getSenderRemark())) {
                getTv_remark().setText(data.getSenderRemark());
                getTv_remark_title().setVisibility(0);
                getTv_remark().setVisibility(0);
            }
            if (!TextUtils.isEmpty(data.getOrderNo())) {
                getTv_transaction_id().setText(data.getOrderNo());
                getTv_transaction_id_title().setVisibility(0);
                getTv_transaction_id().setVisibility(0);
            }
            if (!TextUtils.isEmpty(data.getChannelTransactionId())) {
                TextView tv_session_id = getTv_session_id();
                String channelTransactionId2 = data.getChannelTransactionId();
                if ((channelTransactionId2 != null ? channelTransactionId2.length() : 0) > 15) {
                    String channelTransactionId3 = data.getChannelTransactionId();
                    if (channelTransactionId3 != null) {
                        strSubstring = channelTransactionId3.substring(0, 15);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    } else {
                        strSubstring = null;
                    }
                    String channelTransactionId4 = data.getChannelTransactionId();
                    if (channelTransactionId4 != null) {
                        strSubstring2 = channelTransactionId4.substring(15);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    }
                    channelTransactionId = q0.y(strSubstring, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, strSubstring2);
                } else {
                    channelTransactionId = data.getChannelTransactionId();
                }
                tv_session_id.setText(channelTransactionId);
                getTv_session_id_title().setVisibility(0);
                getTv_session_id().setVisibility(0);
            }
            Long createTime = data.getCreateTime();
            if ((createTime != null ? createTime.longValue() : 0L) > 0) {
                TextView tv_date = getTv_date();
                Long createTime2 = data.getCreateTime();
                tv_date.setText(r0.N(createTime2 != null ? createTime2.longValue() : 0L));
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferDefaultReceipt(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TransferDefaultReceipt(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferDefaultReceipt(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f33855a = C2131j.b(new Function0(this) { // from class: Gd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferDefaultReceipt f3339b;

            {
                this.f3339b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferDefaultReceipt transferDefaultReceipt = this.f3339b;
                switch (i10) {
                    case 0:
                        int i11 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_session_id);
                    case 1:
                        int i12 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_type);
                    case 2:
                        int i13 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_sender_account);
                    case 3:
                        int i14 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_sender_name);
                    case 4:
                        int i15 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_account);
                    case 5:
                        int i16 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_name);
                    case 6:
                        int i17 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_date);
                    case 7:
                        int i18 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_desc);
                    case 8:
                        int i19 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.str_amount);
                    case 9:
                        int i20 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_session_id_title);
                    case 10:
                        int i21 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_id);
                    case 11:
                        int i22 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_id_title);
                    case 12:
                        int i23 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_remark);
                    default:
                        int i24 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_remark_title);
                }
            }
        });
        final int i11 = 9;
        this.f33856b = C2131j.b(new Function0(this) { // from class: Gd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferDefaultReceipt f3339b;

            {
                this.f3339b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferDefaultReceipt transferDefaultReceipt = this.f3339b;
                switch (i11) {
                    case 0:
                        int i12 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_session_id);
                    case 1:
                        int i13 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_type);
                    case 2:
                        int i14 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_sender_account);
                    case 3:
                        int i15 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_sender_name);
                    case 4:
                        int i16 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_account);
                    case 5:
                        int i17 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_name);
                    case 6:
                        int i18 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_date);
                    case 7:
                        int i19 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_desc);
                    case 8:
                        int i110 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.str_amount);
                    case 9:
                        int i20 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_session_id_title);
                    case 10:
                        int i21 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_id);
                    case 11:
                        int i22 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_id_title);
                    case 12:
                        int i23 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_remark);
                    default:
                        int i24 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_remark_title);
                }
            }
        });
        final int i12 = 10;
        this.f33857c = C2131j.b(new Function0(this) { // from class: Gd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferDefaultReceipt f3339b;

            {
                this.f3339b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferDefaultReceipt transferDefaultReceipt = this.f3339b;
                switch (i12) {
                    case 0:
                        int i13 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_session_id);
                    case 1:
                        int i14 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_type);
                    case 2:
                        int i15 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_sender_account);
                    case 3:
                        int i16 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_sender_name);
                    case 4:
                        int i17 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_account);
                    case 5:
                        int i18 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_name);
                    case 6:
                        int i19 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_date);
                    case 7:
                        int i110 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_desc);
                    case 8:
                        int i111 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.str_amount);
                    case 9:
                        int i20 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_session_id_title);
                    case 10:
                        int i21 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_id);
                    case 11:
                        int i22 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_id_title);
                    case 12:
                        int i23 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_remark);
                    default:
                        int i24 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_remark_title);
                }
            }
        });
        final int i13 = 11;
        this.f33858d = C2131j.b(new Function0(this) { // from class: Gd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferDefaultReceipt f3339b;

            {
                this.f3339b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferDefaultReceipt transferDefaultReceipt = this.f3339b;
                switch (i13) {
                    case 0:
                        int i14 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_session_id);
                    case 1:
                        int i15 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_type);
                    case 2:
                        int i16 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_sender_account);
                    case 3:
                        int i17 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_sender_name);
                    case 4:
                        int i18 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_account);
                    case 5:
                        int i19 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_name);
                    case 6:
                        int i110 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_date);
                    case 7:
                        int i111 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_desc);
                    case 8:
                        int i112 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.str_amount);
                    case 9:
                        int i20 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_session_id_title);
                    case 10:
                        int i21 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_id);
                    case 11:
                        int i22 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_id_title);
                    case 12:
                        int i23 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_remark);
                    default:
                        int i24 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_remark_title);
                }
            }
        });
        final int i14 = 12;
        this.f33859e = C2131j.b(new Function0(this) { // from class: Gd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferDefaultReceipt f3339b;

            {
                this.f3339b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferDefaultReceipt transferDefaultReceipt = this.f3339b;
                switch (i14) {
                    case 0:
                        int i15 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_session_id);
                    case 1:
                        int i16 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_type);
                    case 2:
                        int i17 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_sender_account);
                    case 3:
                        int i18 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_sender_name);
                    case 4:
                        int i19 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_account);
                    case 5:
                        int i110 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_name);
                    case 6:
                        int i111 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_date);
                    case 7:
                        int i112 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_desc);
                    case 8:
                        int i113 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.str_amount);
                    case 9:
                        int i20 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_session_id_title);
                    case 10:
                        int i21 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_id);
                    case 11:
                        int i22 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_id_title);
                    case 12:
                        int i23 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_remark);
                    default:
                        int i24 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_remark_title);
                }
            }
        });
        final int i15 = 13;
        this.f33860f = C2131j.b(new Function0(this) { // from class: Gd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferDefaultReceipt f3339b;

            {
                this.f3339b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferDefaultReceipt transferDefaultReceipt = this.f3339b;
                switch (i15) {
                    case 0:
                        int i16 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_session_id);
                    case 1:
                        int i17 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_type);
                    case 2:
                        int i18 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_sender_account);
                    case 3:
                        int i19 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_sender_name);
                    case 4:
                        int i110 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_account);
                    case 5:
                        int i111 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_name);
                    case 6:
                        int i112 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_date);
                    case 7:
                        int i113 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_desc);
                    case 8:
                        int i114 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.str_amount);
                    case 9:
                        int i20 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_session_id_title);
                    case 10:
                        int i21 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_id);
                    case 11:
                        int i22 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_id_title);
                    case 12:
                        int i23 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_remark);
                    default:
                        int i24 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_remark_title);
                }
            }
        });
        final int i16 = 1;
        this.f33861g = C2131j.b(new Function0(this) { // from class: Gd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferDefaultReceipt f3339b;

            {
                this.f3339b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferDefaultReceipt transferDefaultReceipt = this.f3339b;
                switch (i16) {
                    case 0:
                        int i17 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_session_id);
                    case 1:
                        int i18 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_type);
                    case 2:
                        int i19 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_sender_account);
                    case 3:
                        int i110 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_sender_name);
                    case 4:
                        int i111 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_account);
                    case 5:
                        int i112 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_name);
                    case 6:
                        int i113 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_date);
                    case 7:
                        int i114 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_desc);
                    case 8:
                        int i115 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.str_amount);
                    case 9:
                        int i20 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_session_id_title);
                    case 10:
                        int i21 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_id);
                    case 11:
                        int i22 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_id_title);
                    case 12:
                        int i23 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_remark);
                    default:
                        int i24 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_remark_title);
                }
            }
        });
        final int i17 = 2;
        this.f33862i = C2131j.b(new Function0(this) { // from class: Gd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferDefaultReceipt f3339b;

            {
                this.f3339b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferDefaultReceipt transferDefaultReceipt = this.f3339b;
                switch (i17) {
                    case 0:
                        int i18 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_session_id);
                    case 1:
                        int i19 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_type);
                    case 2:
                        int i110 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_sender_account);
                    case 3:
                        int i111 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_sender_name);
                    case 4:
                        int i112 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_account);
                    case 5:
                        int i113 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_name);
                    case 6:
                        int i114 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_date);
                    case 7:
                        int i115 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_desc);
                    case 8:
                        int i116 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.str_amount);
                    case 9:
                        int i20 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_session_id_title);
                    case 10:
                        int i21 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_id);
                    case 11:
                        int i22 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_id_title);
                    case 12:
                        int i23 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_remark);
                    default:
                        int i24 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_remark_title);
                }
            }
        });
        final int i18 = 3;
        this.f33863j = C2131j.b(new Function0(this) { // from class: Gd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferDefaultReceipt f3339b;

            {
                this.f3339b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferDefaultReceipt transferDefaultReceipt = this.f3339b;
                switch (i18) {
                    case 0:
                        int i19 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_session_id);
                    case 1:
                        int i110 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_type);
                    case 2:
                        int i111 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_sender_account);
                    case 3:
                        int i112 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_sender_name);
                    case 4:
                        int i113 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_account);
                    case 5:
                        int i114 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_name);
                    case 6:
                        int i115 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_date);
                    case 7:
                        int i116 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_desc);
                    case 8:
                        int i117 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.str_amount);
                    case 9:
                        int i20 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_session_id_title);
                    case 10:
                        int i21 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_id);
                    case 11:
                        int i22 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_id_title);
                    case 12:
                        int i23 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_remark);
                    default:
                        int i24 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_remark_title);
                }
            }
        });
        final int i19 = 4;
        this.f33864o = C2131j.b(new Function0(this) { // from class: Gd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferDefaultReceipt f3339b;

            {
                this.f3339b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferDefaultReceipt transferDefaultReceipt = this.f3339b;
                switch (i19) {
                    case 0:
                        int i110 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_session_id);
                    case 1:
                        int i111 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_type);
                    case 2:
                        int i112 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_sender_account);
                    case 3:
                        int i113 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_sender_name);
                    case 4:
                        int i114 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_account);
                    case 5:
                        int i115 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_name);
                    case 6:
                        int i116 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_date);
                    case 7:
                        int i117 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_desc);
                    case 8:
                        int i118 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.str_amount);
                    case 9:
                        int i20 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_session_id_title);
                    case 10:
                        int i21 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_id);
                    case 11:
                        int i22 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_id_title);
                    case 12:
                        int i23 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_remark);
                    default:
                        int i24 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_remark_title);
                }
            }
        });
        final int i20 = 5;
        this.f33865p = C2131j.b(new Function0(this) { // from class: Gd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferDefaultReceipt f3339b;

            {
                this.f3339b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferDefaultReceipt transferDefaultReceipt = this.f3339b;
                switch (i20) {
                    case 0:
                        int i110 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_session_id);
                    case 1:
                        int i111 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_type);
                    case 2:
                        int i112 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_sender_account);
                    case 3:
                        int i113 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_sender_name);
                    case 4:
                        int i114 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_account);
                    case 5:
                        int i115 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_name);
                    case 6:
                        int i116 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_date);
                    case 7:
                        int i117 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_desc);
                    case 8:
                        int i118 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.str_amount);
                    case 9:
                        int i21 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_session_id_title);
                    case 10:
                        int i22 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_id);
                    case 11:
                        int i23 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_id_title);
                    case 12:
                        int i24 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_remark);
                    default:
                        int i25 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_remark_title);
                }
            }
        });
        final int i21 = 6;
        this.t = C2131j.b(new Function0(this) { // from class: Gd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferDefaultReceipt f3339b;

            {
                this.f3339b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferDefaultReceipt transferDefaultReceipt = this.f3339b;
                switch (i21) {
                    case 0:
                        int i110 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_session_id);
                    case 1:
                        int i111 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_type);
                    case 2:
                        int i112 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_sender_account);
                    case 3:
                        int i113 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_sender_name);
                    case 4:
                        int i114 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_account);
                    case 5:
                        int i115 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_name);
                    case 6:
                        int i116 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_date);
                    case 7:
                        int i117 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_desc);
                    case 8:
                        int i118 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.str_amount);
                    case 9:
                        int i22 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_session_id_title);
                    case 10:
                        int i23 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_id);
                    case 11:
                        int i24 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_id_title);
                    case 12:
                        int i25 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_remark);
                    default:
                        int i26 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_remark_title);
                }
            }
        });
        final int i22 = 7;
        this.f33866v = C2131j.b(new Function0(this) { // from class: Gd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferDefaultReceipt f3339b;

            {
                this.f3339b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferDefaultReceipt transferDefaultReceipt = this.f3339b;
                switch (i22) {
                    case 0:
                        int i110 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_session_id);
                    case 1:
                        int i111 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_type);
                    case 2:
                        int i112 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_sender_account);
                    case 3:
                        int i113 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_sender_name);
                    case 4:
                        int i114 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_account);
                    case 5:
                        int i115 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_name);
                    case 6:
                        int i116 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_date);
                    case 7:
                        int i117 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_desc);
                    case 8:
                        int i118 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.str_amount);
                    case 9:
                        int i23 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_session_id_title);
                    case 10:
                        int i24 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_id);
                    case 11:
                        int i25 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_id_title);
                    case 12:
                        int i26 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_remark);
                    default:
                        int i27 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_remark_title);
                }
            }
        });
        final int i23 = 8;
        this.f33867w = C2131j.b(new Function0(this) { // from class: Gd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferDefaultReceipt f3339b;

            {
                this.f3339b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferDefaultReceipt transferDefaultReceipt = this.f3339b;
                switch (i23) {
                    case 0:
                        int i110 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_session_id);
                    case 1:
                        int i111 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_type);
                    case 2:
                        int i112 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_sender_account);
                    case 3:
                        int i113 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_sender_name);
                    case 4:
                        int i114 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_account);
                    case 5:
                        int i115 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_name);
                    case 6:
                        int i116 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_date);
                    case 7:
                        int i117 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_recipient_desc);
                    case 8:
                        int i118 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.str_amount);
                    case 9:
                        int i24 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_session_id_title);
                    case 10:
                        int i25 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_id);
                    case 11:
                        int i26 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_transaction_id_title);
                    case 12:
                        int i27 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_remark);
                    default:
                        int i28 = TransferDefaultReceipt.f33854A;
                        return (TextView) transferDefaultReceipt.findViewById(p159kd.e.tv_remark_title);
                }
            }
        });
        View.inflate(context, f.sm_layout_transfer_default_receipt, this);
        setOrientation(1);
        setBackgroundResource(r.cv_receipt_bg_2);
    }
}
