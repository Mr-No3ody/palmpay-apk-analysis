package com.transsnet.palmpay.send_money.ui.view;

import Ab.i;
import C0.G;
import N8.q0;
import Pa.i0;
import Pa.r0;
import android.content.Context;
import android.graphics.Color;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.send_money.bean.TradeRecordDetailResp;
import com.transsnet.palmpay.send_money.bean.resp.TransReceiptTypeBean;
import com.transsnet.palmpay.send_money.ui.view.TransferSpecialReceipt;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159kd.f;
import p159kd.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001:\u0001>J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u001aR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\"R\u001b\u0010&\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0013\u001a\u0004\b%\u0010\u001aR\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0013\u001a\u0004\b)\u0010*R\u001b\u0010.\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0013\u001a\u0004\b-\u0010\u001aR\u001b\u00101\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0013\u001a\u0004\b0\u0010\"R\u001b\u00104\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u0013\u001a\u0004\b3\u0010\u001aR\u001b\u00107\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u0013\u001a\u0004\b6\u0010\u001aR\u001b\u0010:\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u0013\u001a\u0004\b9\u0010\u001aR\u001b\u0010=\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u0013\u001a\u0004\b<\u0010\"¨\u0006?"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/view/TransferSpecialReceipt;", "Landroid/widget/FrameLayout;", "Lcom/transsnet/palmpay/send_money/bean/resp/TransReceiptTypeBean;", "receiptType", "", "setSkin", "(Lcom/transsnet/palmpay/send_money/bean/resp/TransReceiptTypeBean;)V", "Lcom/transsnet/palmpay/send_money/bean/TradeRecordDetailResp$RecordDetail;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setData", "(Lcom/transsnet/palmpay/send_money/bean/TradeRecordDetailResp$RecordDetail;)V", "", "getNote", "()Ljava/lang/String;", "note", "setNote", "(Ljava/lang/String;)V", "Landroidx/constraintlayout/widget/Group;", "b", "Lkotlin/Lazy;", "getGroup_share", "()Landroidx/constraintlayout/widget/Group;", "group_share", "Landroid/widget/TextView;", "c", "getTv_slogan", "()Landroid/widget/TextView;", "tv_slogan", "d", "getTv_sender_info", "tv_sender_info", "Landroid/widget/ImageView;", "e", "getIv_edit", "()Landroid/widget/ImageView;", "iv_edit", "f", "getTv_note", "tv_note", "Landroid/widget/EditText;", "g", "getEt_note", "()Landroid/widget/EditText;", "et_note", "i", "getTv_recipient_name", "tv_recipient_name", "j", "getIv_info_bg", "iv_info_bg", "o", "getTv_recipient_account", "tv_recipient_account", "p", "getTv_amount", "tv_amount", "t", "getTv_sender_name", "tv_sender_name", "v", "getIv_bg", "iv_bg", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransferSpecialReceipt extends FrameLayout {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f33886w = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f33888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f33889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f33891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f33892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f33893g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f33894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f33895j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f33896o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f33897p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f33898v;

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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferSpecialReceipt(@NotNull Context context) {
        this(context, null, 0, 14);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditText getEt_note() {
        Object value = this.f33893g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (EditText) value;
    }

    private final Group getGroup_share() {
        Object value = this.f33888b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Group) value;
    }

    private final ImageView getIv_bg() {
        Object value = this.f33898v.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final ImageView getIv_edit() {
        Object value = this.f33891e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final ImageView getIv_info_bg() {
        Object value = this.f33895j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final TextView getTv_amount() {
        Object value = this.f33897p.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_note() {
        Object value = this.f33892f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_recipient_account() {
        Object value = this.f33896o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_recipient_name() {
        Object value = this.f33894i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_sender_info() {
        Object value = this.f33890d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_sender_name() {
        Object value = this.t.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_slogan() {
        Object value = this.f33889c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    @NotNull
    public final String getNote() {
        return y.k(StringsKt.V(getEt_note().getText().toString()).toString(), "\u3000 ", "");
    }

    public final void setData(@Nullable TradeRecordDetailResp.RecordDetail data) {
        String strU;
        String strO;
        String strU2;
        if (data != null) {
            String senderFullName = data.getSenderFullName();
            String str = "";
            if (!TextUtils.isEmpty(senderFullName != null ? StringsKt.V(senderFullName).toString() : null)) {
                getTv_sender_name().setText(data.getSenderFullName() + " send you");
            } else if (!TextUtils.isEmpty(data.getSenderPhone())) {
                TextView tv_sender_name = getTv_sender_name();
                String senderPhone = data.getSenderPhone();
                if (senderPhone == null || (strU = r0.u(senderPhone)) == null) {
                    strU = "";
                }
                tv_sender_name.setText(strU.concat(" send you"));
            }
            getTv_amount().setText(r0.B(data.getAmount(), false));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(!TextUtils.isEmpty(data.getReceiptDesc()) ? q0.j(data.getReceiptDesc(), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE) : "");
            sb2.append("Recipient’s Account:\n");
            String recipientBankName = (data.getBusinessType() == 3 || data.getBusinessType() == 9 || data.getBusinessType() == 16) ? data.getRecipientBankName() : getContext().getString(h.sm_palmpay_text);
            if (!TextUtils.isEmpty(recipientBankName)) {
                sb2.append(recipientBankName);
                sb2.append(" | ");
            }
            int businessType = data.getBusinessType();
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
                        if (recipientPhone == null || (strO = r0.w(recipientPhone)) == null) {
                            strO = "";
                        }
                        break;
                }
            } else {
                strO = i0.o(data.getPartnerAccountNo());
            }
            if (!TextUtils.isEmpty(strO)) {
                sb2.append(strO);
            }
            getTv_recipient_account().setText(sb2);
            G.x("Dear ", data.getRecipientFullName(), getTv_recipient_name());
            TextView tv_sender_info = getTv_sender_info();
            String senderFullName2 = data.getSenderFullName();
            String senderPhone2 = data.getSenderPhone();
            if (senderPhone2 != null && (strU2 = r0.u(senderPhone2)) != null) {
                str = strU2;
            }
            Long createTime = data.getCreateTime();
            tv_sender_info.setText(senderFullName2 + "(" + str + ")\n" + r0.N(createTime != null ? createTime.longValue() : 0L) + "\nTransation ID: " + data.getOrderNo());
            if (this.f33887a) {
                p220oa.h.C(getGroup_share());
                getEt_note().setEnabled(false);
                p220oa.h.c(getIv_edit());
            } else {
                p220oa.h.c(getGroup_share());
                getEt_note().setEnabled(true);
                p220oa.h.C(getIv_edit());
            }
        }
    }

    public final void setNote(@Nullable String note) {
        EditText et_note = getEt_note();
        if (et_note != null) {
            et_note.setText(note);
        }
        TextView tv_note = getTv_note();
        if (tv_note != null) {
            tv_note.setText(note);
        }
    }

    public final void setSkin(@Nullable TransReceiptTypeBean receiptType) {
        if (receiptType != null) {
            ImageView iv_bg = getIv_bg();
            boolean z3 = this.f33887a;
            r0.l1(z3 ? receiptType.getOutThemeImage() : receiptType.getPpThemeImage(), iv_bg);
            r0.l1(z3 ? receiptType.getOutWatermarkImage() : receiptType.getPpWatermarkImage(), getIv_info_bg());
            if (!TextUtils.isEmpty(receiptType.getOtherTextColor())) {
                getTv_sender_name().setTextColor(Color.parseColor(receiptType.getOtherTextColor()));
                getTv_recipient_account().setTextColor(Color.parseColor(receiptType.getOtherTextColor()));
            }
            if (!TextUtils.isEmpty(receiptType.getAmountTextColor())) {
                getTv_amount().setTextColor(Color.parseColor(receiptType.getAmountTextColor()));
            }
            if (!TextUtils.isEmpty(receiptType.getWishes())) {
                getEt_note().setText(receiptType.getWishes());
            }
            if (!z3) {
                p220oa.h.C(getIv_edit());
                getEt_note().setVisibility(0);
                getTv_note().setVisibility(8);
                getEt_note().setEnabled(true);
                p220oa.h.c(getGroup_share());
                return;
            }
            p220oa.h.C(getGroup_share());
            p220oa.h.c(getIv_edit());
            getEt_note().setEnabled(false);
            getEt_note().setVisibility(4);
            getTv_note().setVisibility(0);
            TextView tv_slogan = getTv_slogan();
            String slogan = receiptType.getSlogan();
            if (slogan == null) {
                slogan = "";
            }
            tv_slogan.setText(slogan);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferSpecialReceipt(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferSpecialReceipt(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 8);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TransferSpecialReceipt(Context context, AttributeSet attributeSet, int i7, int i10) {
        final int i11 = 3;
        final int i12 = 8;
        final int i13 = 4;
        final int i14 = 1;
        final int i15 = 0;
        final int i16 = 2;
        attributeSet = (i10 & 2) != 0 ? null : attributeSet;
        i7 = (i10 & 4) != 0 ? 0 : i7;
        boolean z3 = (i10 & 8) == 0;
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, i7);
        this.f33887a = z3;
        this.f33888b = C2131j.b(new Function0(this) { // from class: Gd.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferSpecialReceipt f3359b;

            {
                this.f3359b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferSpecialReceipt transferSpecialReceipt = this.f3359b;
                switch (i15) {
                    case 0:
                        int i17 = TransferSpecialReceipt.f33886w;
                        return (Group) transferSpecialReceipt.findViewById(p159kd.e.group_share);
                    case 1:
                        int i18 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_recipient_account);
                    case 2:
                        int i19 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_amount);
                    case 3:
                        int i20 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_sender_name);
                    case 4:
                        int i21 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_bg);
                    case 5:
                        int i22 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_slogan);
                    case 6:
                        int i23 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_sender_info);
                    case 7:
                        int i24 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_edit);
                    case 8:
                        int i25 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_note);
                    case 9:
                        int i26 = TransferSpecialReceipt.f33886w;
                        return (EditText) transferSpecialReceipt.findViewById(p159kd.e.et_note);
                    case 10:
                        int i27 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_recipient_name);
                    default:
                        int i28 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_info_bg);
                }
            }
        });
        final int i17 = 5;
        this.f33889c = C2131j.b(new Function0(this) { // from class: Gd.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferSpecialReceipt f3359b;

            {
                this.f3359b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferSpecialReceipt transferSpecialReceipt = this.f3359b;
                switch (i17) {
                    case 0:
                        int i18 = TransferSpecialReceipt.f33886w;
                        return (Group) transferSpecialReceipt.findViewById(p159kd.e.group_share);
                    case 1:
                        int i19 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_recipient_account);
                    case 2:
                        int i110 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_amount);
                    case 3:
                        int i20 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_sender_name);
                    case 4:
                        int i21 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_bg);
                    case 5:
                        int i22 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_slogan);
                    case 6:
                        int i23 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_sender_info);
                    case 7:
                        int i24 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_edit);
                    case 8:
                        int i25 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_note);
                    case 9:
                        int i26 = TransferSpecialReceipt.f33886w;
                        return (EditText) transferSpecialReceipt.findViewById(p159kd.e.et_note);
                    case 10:
                        int i27 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_recipient_name);
                    default:
                        int i28 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_info_bg);
                }
            }
        });
        final int i18 = 6;
        this.f33890d = C2131j.b(new Function0(this) { // from class: Gd.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferSpecialReceipt f3359b;

            {
                this.f3359b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferSpecialReceipt transferSpecialReceipt = this.f3359b;
                switch (i18) {
                    case 0:
                        int i19 = TransferSpecialReceipt.f33886w;
                        return (Group) transferSpecialReceipt.findViewById(p159kd.e.group_share);
                    case 1:
                        int i110 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_recipient_account);
                    case 2:
                        int i111 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_amount);
                    case 3:
                        int i20 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_sender_name);
                    case 4:
                        int i21 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_bg);
                    case 5:
                        int i22 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_slogan);
                    case 6:
                        int i23 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_sender_info);
                    case 7:
                        int i24 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_edit);
                    case 8:
                        int i25 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_note);
                    case 9:
                        int i26 = TransferSpecialReceipt.f33886w;
                        return (EditText) transferSpecialReceipt.findViewById(p159kd.e.et_note);
                    case 10:
                        int i27 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_recipient_name);
                    default:
                        int i28 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_info_bg);
                }
            }
        });
        final int i19 = 7;
        this.f33891e = C2131j.b(new Function0(this) { // from class: Gd.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferSpecialReceipt f3359b;

            {
                this.f3359b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferSpecialReceipt transferSpecialReceipt = this.f3359b;
                switch (i19) {
                    case 0:
                        int i110 = TransferSpecialReceipt.f33886w;
                        return (Group) transferSpecialReceipt.findViewById(p159kd.e.group_share);
                    case 1:
                        int i111 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_recipient_account);
                    case 2:
                        int i112 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_amount);
                    case 3:
                        int i20 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_sender_name);
                    case 4:
                        int i21 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_bg);
                    case 5:
                        int i22 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_slogan);
                    case 6:
                        int i23 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_sender_info);
                    case 7:
                        int i24 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_edit);
                    case 8:
                        int i25 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_note);
                    case 9:
                        int i26 = TransferSpecialReceipt.f33886w;
                        return (EditText) transferSpecialReceipt.findViewById(p159kd.e.et_note);
                    case 10:
                        int i27 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_recipient_name);
                    default:
                        int i28 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_info_bg);
                }
            }
        });
        this.f33892f = C2131j.b(new Function0(this) { // from class: Gd.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferSpecialReceipt f3359b;

            {
                this.f3359b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferSpecialReceipt transferSpecialReceipt = this.f3359b;
                switch (i12) {
                    case 0:
                        int i110 = TransferSpecialReceipt.f33886w;
                        return (Group) transferSpecialReceipt.findViewById(p159kd.e.group_share);
                    case 1:
                        int i111 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_recipient_account);
                    case 2:
                        int i112 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_amount);
                    case 3:
                        int i20 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_sender_name);
                    case 4:
                        int i21 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_bg);
                    case 5:
                        int i22 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_slogan);
                    case 6:
                        int i23 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_sender_info);
                    case 7:
                        int i24 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_edit);
                    case 8:
                        int i25 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_note);
                    case 9:
                        int i26 = TransferSpecialReceipt.f33886w;
                        return (EditText) transferSpecialReceipt.findViewById(p159kd.e.et_note);
                    case 10:
                        int i27 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_recipient_name);
                    default:
                        int i28 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_info_bg);
                }
            }
        });
        final int i20 = 9;
        this.f33893g = C2131j.b(new Function0(this) { // from class: Gd.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferSpecialReceipt f3359b;

            {
                this.f3359b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferSpecialReceipt transferSpecialReceipt = this.f3359b;
                switch (i20) {
                    case 0:
                        int i110 = TransferSpecialReceipt.f33886w;
                        return (Group) transferSpecialReceipt.findViewById(p159kd.e.group_share);
                    case 1:
                        int i111 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_recipient_account);
                    case 2:
                        int i112 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_amount);
                    case 3:
                        int i21 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_sender_name);
                    case 4:
                        int i22 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_bg);
                    case 5:
                        int i23 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_slogan);
                    case 6:
                        int i24 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_sender_info);
                    case 7:
                        int i25 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_edit);
                    case 8:
                        int i26 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_note);
                    case 9:
                        int i27 = TransferSpecialReceipt.f33886w;
                        return (EditText) transferSpecialReceipt.findViewById(p159kd.e.et_note);
                    case 10:
                        int i28 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_recipient_name);
                    default:
                        int i29 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_info_bg);
                }
            }
        });
        final int i21 = 10;
        this.f33894i = C2131j.b(new Function0(this) { // from class: Gd.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferSpecialReceipt f3359b;

            {
                this.f3359b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferSpecialReceipt transferSpecialReceipt = this.f3359b;
                switch (i21) {
                    case 0:
                        int i110 = TransferSpecialReceipt.f33886w;
                        return (Group) transferSpecialReceipt.findViewById(p159kd.e.group_share);
                    case 1:
                        int i111 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_recipient_account);
                    case 2:
                        int i112 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_amount);
                    case 3:
                        int i22 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_sender_name);
                    case 4:
                        int i23 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_bg);
                    case 5:
                        int i24 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_slogan);
                    case 6:
                        int i25 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_sender_info);
                    case 7:
                        int i26 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_edit);
                    case 8:
                        int i27 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_note);
                    case 9:
                        int i28 = TransferSpecialReceipt.f33886w;
                        return (EditText) transferSpecialReceipt.findViewById(p159kd.e.et_note);
                    case 10:
                        int i29 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_recipient_name);
                    default:
                        int i210 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_info_bg);
                }
            }
        });
        final int i22 = 11;
        this.f33895j = C2131j.b(new Function0(this) { // from class: Gd.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferSpecialReceipt f3359b;

            {
                this.f3359b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferSpecialReceipt transferSpecialReceipt = this.f3359b;
                switch (i22) {
                    case 0:
                        int i110 = TransferSpecialReceipt.f33886w;
                        return (Group) transferSpecialReceipt.findViewById(p159kd.e.group_share);
                    case 1:
                        int i111 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_recipient_account);
                    case 2:
                        int i112 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_amount);
                    case 3:
                        int i23 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_sender_name);
                    case 4:
                        int i24 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_bg);
                    case 5:
                        int i25 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_slogan);
                    case 6:
                        int i26 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_sender_info);
                    case 7:
                        int i27 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_edit);
                    case 8:
                        int i28 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_note);
                    case 9:
                        int i29 = TransferSpecialReceipt.f33886w;
                        return (EditText) transferSpecialReceipt.findViewById(p159kd.e.et_note);
                    case 10:
                        int i210 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_recipient_name);
                    default:
                        int i211 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_info_bg);
                }
            }
        });
        this.f33896o = C2131j.b(new Function0(this) { // from class: Gd.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferSpecialReceipt f3359b;

            {
                this.f3359b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferSpecialReceipt transferSpecialReceipt = this.f3359b;
                switch (i14) {
                    case 0:
                        int i110 = TransferSpecialReceipt.f33886w;
                        return (Group) transferSpecialReceipt.findViewById(p159kd.e.group_share);
                    case 1:
                        int i111 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_recipient_account);
                    case 2:
                        int i112 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_amount);
                    case 3:
                        int i23 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_sender_name);
                    case 4:
                        int i24 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_bg);
                    case 5:
                        int i25 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_slogan);
                    case 6:
                        int i26 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_sender_info);
                    case 7:
                        int i27 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_edit);
                    case 8:
                        int i28 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_note);
                    case 9:
                        int i29 = TransferSpecialReceipt.f33886w;
                        return (EditText) transferSpecialReceipt.findViewById(p159kd.e.et_note);
                    case 10:
                        int i210 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_recipient_name);
                    default:
                        int i211 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_info_bg);
                }
            }
        });
        this.f33897p = C2131j.b(new Function0(this) { // from class: Gd.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferSpecialReceipt f3359b;

            {
                this.f3359b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferSpecialReceipt transferSpecialReceipt = this.f3359b;
                switch (i16) {
                    case 0:
                        int i110 = TransferSpecialReceipt.f33886w;
                        return (Group) transferSpecialReceipt.findViewById(p159kd.e.group_share);
                    case 1:
                        int i111 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_recipient_account);
                    case 2:
                        int i112 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_amount);
                    case 3:
                        int i23 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_sender_name);
                    case 4:
                        int i24 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_bg);
                    case 5:
                        int i25 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_slogan);
                    case 6:
                        int i26 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_sender_info);
                    case 7:
                        int i27 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_edit);
                    case 8:
                        int i28 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_note);
                    case 9:
                        int i29 = TransferSpecialReceipt.f33886w;
                        return (EditText) transferSpecialReceipt.findViewById(p159kd.e.et_note);
                    case 10:
                        int i210 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_recipient_name);
                    default:
                        int i211 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_info_bg);
                }
            }
        });
        this.t = C2131j.b(new Function0(this) { // from class: Gd.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferSpecialReceipt f3359b;

            {
                this.f3359b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferSpecialReceipt transferSpecialReceipt = this.f3359b;
                switch (i11) {
                    case 0:
                        int i110 = TransferSpecialReceipt.f33886w;
                        return (Group) transferSpecialReceipt.findViewById(p159kd.e.group_share);
                    case 1:
                        int i111 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_recipient_account);
                    case 2:
                        int i112 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_amount);
                    case 3:
                        int i23 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_sender_name);
                    case 4:
                        int i24 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_bg);
                    case 5:
                        int i25 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_slogan);
                    case 6:
                        int i26 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_sender_info);
                    case 7:
                        int i27 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_edit);
                    case 8:
                        int i28 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_note);
                    case 9:
                        int i29 = TransferSpecialReceipt.f33886w;
                        return (EditText) transferSpecialReceipt.findViewById(p159kd.e.et_note);
                    case 10:
                        int i210 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_recipient_name);
                    default:
                        int i211 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_info_bg);
                }
            }
        });
        this.f33898v = C2131j.b(new Function0(this) { // from class: Gd.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferSpecialReceipt f3359b;

            {
                this.f3359b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferSpecialReceipt transferSpecialReceipt = this.f3359b;
                switch (i13) {
                    case 0:
                        int i110 = TransferSpecialReceipt.f33886w;
                        return (Group) transferSpecialReceipt.findViewById(p159kd.e.group_share);
                    case 1:
                        int i111 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_recipient_account);
                    case 2:
                        int i112 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_amount);
                    case 3:
                        int i23 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_sender_name);
                    case 4:
                        int i24 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_bg);
                    case 5:
                        int i25 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_slogan);
                    case 6:
                        int i26 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_sender_info);
                    case 7:
                        int i27 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_edit);
                    case 8:
                        int i28 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_note);
                    case 9:
                        int i29 = TransferSpecialReceipt.f33886w;
                        return (EditText) transferSpecialReceipt.findViewById(p159kd.e.et_note);
                    case 10:
                        int i210 = TransferSpecialReceipt.f33886w;
                        return (TextView) transferSpecialReceipt.findViewById(p159kd.e.tv_recipient_name);
                    default:
                        int i211 = TransferSpecialReceipt.f33886w;
                        return (ImageView) transferSpecialReceipt.findViewById(p159kd.e.iv_info_bg);
                }
            }
        });
        View.inflate(context, f.sm_layout_transfer_common_receipt, this);
        int iDip2px = ScreenUtils.dip2px(16.0f);
        setPadding(iDip2px, iDip2px, iDip2px, iDip2px);
        EditText et_note = getEt_note();
        Intrinsics.checkNotNullParameter(et_note, "<this>");
        et_note.setFilters(new InputFilter[]{new B8.b(3)});
        getEt_note().setText("\u3000 ");
        getEt_note().addTextChangedListener(new i(this, 14));
    }
}
