package com.transsnet.palmpay.send_money.ui.dialog.kkcar;

import Bd.c;
import C0.G;
import Ef.a;
import Pa.n0;
import Pa.r0;
import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.v0;
import Xf.d;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RawRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.core.impl.utils.executor.g;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.TransferByLoanResult;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.u;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.resp.kkcar.KkCarQrCodePollOrderRsp;
import com.transsnet.palmpay.send_money.bean.resp.kkcar.KkCarQrCodeRsp;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p015ag.o;
import p025ba.k;
import p159kd.f;
import p159kd.h;
import p223od.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 I2\u00020\u0001:\u0001JB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\nJ\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u000eJ\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\nJ\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\nJ\u0010\u0010\u001a\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u00020\b2\b\b\u0001\u0010(\u001a\u00020 H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b+\u0010\u000eJ\u0017\u0010-\u001a\u00020\b2\u0006\u0010,\u001a\u00020 H\u0002¢\u0006\u0004\b-\u0010*J\u0017\u0010.\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b.\u0010\u000eJ\u0017\u0010/\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b/\u0010\u000eJ\u0017\u00100\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b0\u0010\u000eJ\u0017\u00102\u001a\u0002012\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u0002042\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u0002042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b7\u00108J!\u0010<\u001a\u00020\b2\u0006\u0010:\u001a\u0002092\b\u0010;\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/kkcar/KkCarPayResultDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp$QrCodeOrderDTO;", GetCustomerServiceUrlReq.ENTER_TYPE_ORDER_DETAIL, "<init>", "(Landroid/content/Context;Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp$QrCodeOrderDTO;)V", "", "initViews", "()V", "show", PPRNBridge.DIALOG_ACTION_DISMISS, "render", "(Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp$QrCodeOrderDTO;)V", "bindDetail", "bindActionButtons", "", "secondary", "applyOkButtonStyle", "(Z)V", "copyAccountNumber", "bindAmount", "bindTips", "startOrderPollingIfNeeded", "stopOrderPolling", "pollOrderOnce", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", OfflineConstant.OLD_DIR_NAME, OfflineConstant.NEW_DIR_NAME, "mergeOrder", "(Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp$QrCodeOrderDTO;Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp$QrCodeOrderDTO;)Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp$QrCodeOrderDTO;", "", "status", "isTerminalOrderStatus", "(Ljava/lang/Integer;)Z", "Landroid/graphics/drawable/Drawable;", "icon", "setStatusIcon", "(Landroid/graphics/drawable/Drawable;)V", "rawRes", "showSuccessLottie", "(I)V", "renderSuccess", "marginTopDp", "applyResultTitleMarginTop", "renderFailed", "renderPending", "renderClosed", "Lcom/transsnet/palmpay/core/util/statistic/ViewEvent;", "buildPayResultViewEvent", "(Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp$QrCodeOrderDTO;)Lcom/transsnet/palmpay/core/util/statistic/ViewEvent;", "", "mapOrderResultStatus", "(I)Ljava/lang/String;", "resolveOkButtonName", "(Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp$QrCodeOrderDTO;)Ljava/lang/String;", "Landroid/widget/TextView;", "view", ReactTextInputShadowNode.PROP_TEXT, "bindOptionalText", "(Landroid/widget/TextView;Ljava/lang/String;)V", "Lod/s;", "binding", "Lod/s;", "currentOrder", "Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp$QrCodeOrderDTO;", "Lkotlinx/coroutines/CoroutineScope;", "dialogScope", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/Job;", "orderPollJob", "Lkotlinx/coroutines/Job;", "Companion", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKkCarPayResultDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KkCarPayResultDialog.kt\ncom/transsnet/palmpay/send_money/ui/dialog/kkcar/KkCarPayResultDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,460:1\n1#2:461\n*E\n"})
public final class KkCarPayResultDialog extends b {

    @NotNull
    private static final String BUTTON_ADD_MONEY = "add_money";

    @NotNull
    private static final String BUTTON_CLOSE = "close";

    @NotNull
    private static final String BUTTON_COMPLETE = "complete";

    @NotNull
    private static final String BUTTON_QUIT = "quit";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int FREE_RIDE_LOTTIE_HEIGHT_DP = 183;
    public static final int FREE_RIDE_TITLE_MARGIN_TOP_DP = 120;
    private static final int ORDER_FAIL_TYPE_ADD_MONEY = 1;
    public static final long ORDER_POLL_INTERVAL_MS = 5000;
    public static final long ORDER_POLL_START_DELAY_MS = 5000;
    public static final int STATUS_CLOSED = 4;
    public static final int STATUS_FAILED = 2;
    public static final int STATUS_PENDING = 3;
    private static final int STATUS_SUCCESS = 1;
    public static final int SUCCESS_LOTTIE_HEIGHT_DP = 64;
    public static final int SUCCESS_TITLE_MARGIN_TOP_DP = 72;

    @NotNull
    private static final String TRACK_APP_NATIVE = "native";

    @Nullable
    private static KkCarPayResultDialog currentShowing;

    @Nullable
    private s binding;

    @NotNull
    private KkCarQrCodeRsp.QrCodeOrderDTO currentOrder;

    @NotNull
    private final CoroutineScope dialogScope;

    @Nullable
    private Job orderPollJob;

    /* JADX INFO: renamed from: com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final KkCarPayResultDialog tryShow(@Nullable Context context, @NotNull KkCarQrCodeRsp.QrCodeOrderDTO order) {
            Intrinsics.checkNotNullParameter(order, "order");
            if (context == null) {
                return null;
            }
            KkCarPayResultDialog kkCarPayResultDialog = KkCarPayResultDialog.currentShowing;
            if (kkCarPayResultDialog == null || !kkCarPayResultDialog.isShowing()) {
                return new KkCarPayResultDialog(context, order);
            }
            return null;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KkCarPayResultDialog(@Nullable Context context, @NotNull KkCarQrCodeRsp.QrCodeOrderDTO order) {
        super(context, f.sm_kk_dialog_pay_result);
        Intrinsics.checkNotNullParameter(order, "order");
        this.currentOrder = order;
        v0 v0VarC = AbstractC0780y.c();
        p042cg.f fVar = I.f10809a;
        this.dialogScope = AbstractC0777v.a(e.c(v0VarC, ((d) o.f11960a).f11224e));
    }

    private final void applyOkButtonStyle(boolean secondary) {
        s sVar = this.binding;
        if (sVar == null) {
            return;
        }
        int i7 = secondary ? L6.d.lib_ui_button_bg_corner_secondary : L6.d.lib_ui_button_bg_corner_primary_5;
        int iColorInt = secondary ? CommonViewExtKt.colorInt(L6.b.ppColorPrimary, getContext()) : CommonViewExtKt.colorInt(L6.b.ppColorButtonTextWhite, getContext());
        PpButton ppButton = sVar.f40494c;
        ppButton.setBackgroundResource(i7);
        ppButton.setTextColor(iColorInt);
    }

    private final void applyResultTitleMarginTop(int marginTopDp) {
        s sVar = this.binding;
        if (sVar == null) {
            return;
        }
        TextView textView = sVar.t;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = CommonViewExtKt.getDp(marginTopDp);
            textView.setLayoutParams(layoutParams2);
        }
    }

    private final void bindActionButtons(KkCarQrCodeRsp.QrCodeOrderDTO order) {
        Integer orderFailType;
        s sVar = this.binding;
        if (sVar == null) {
            return;
        }
        Integer orderStatus = order.getOrderStatus();
        PpButton btnKkResultAddMoney = sVar.f40493b;
        PpButton ppButton = sVar.f40494c;
        if (orderStatus != null && orderStatus.intValue() == 2 && (orderFailType = order.getOrderFailType()) != null && orderFailType.intValue() == 1) {
            ppButton.setText(getContext().getString(h.sm_kk_qr_result_quit));
            applyOkButtonStyle(true);
            Intrinsics.checkNotNullExpressionValue(btnKkResultAddMoney, "btnKkResultAddMoney");
            p220oa.h.s(btnKkResultAddMoney, true);
            return;
        }
        ppButton.setText(getContext().getString(k.core_complete));
        applyOkButtonStyle(false);
        Intrinsics.checkNotNullExpressionValue(btnKkResultAddMoney, "btnKkResultAddMoney");
        p220oa.h.c(btnKkResultAddMoney);
    }

    private final void bindAmount(KkCarQrCodeRsp.QrCodeOrderDTO order) {
        s sVar = this.binding;
        if (sVar == null) {
            return;
        }
        Integer orderStatus = order.getOrderStatus();
        long jLongValue = 0;
        if (orderStatus != null && orderStatus.intValue() == 1) {
            Long payAmount = order.getPayAmount();
            if (payAmount != null) {
                jLongValue = payAmount.longValue();
            }
        } else {
            Long amount = order.getAmount();
            if (amount != null) {
                jLongValue = amount.longValue();
            }
        }
        String strB = r0.B(jLongValue, false);
        TextView tvKkResultAmount = sVar.f40499i;
        tvKkResultAmount.setText(strB);
        Intrinsics.checkNotNullExpressionValue(tvKkResultAmount, "tvKkResultAmount");
        p220oa.h.s(tvKkResultAmount, true);
    }

    private final void bindDetail(KkCarQrCodeRsp.QrCodeOrderDTO order) {
        Integer orderStatus;
        s sVar = this.binding;
        if (sVar == null) {
            return;
        }
        Long discountAmount = order.getDiscountAmount();
        long jLongValue = discountAmount != null ? discountAmount.longValue() : 0L;
        LinearLayout llKkResultDetail = sVar.f40498g;
        if (jLongValue <= 0 || (orderStatus = order.getOrderStatus()) == null || orderStatus.intValue() != 1) {
            Intrinsics.checkNotNullExpressionValue(llKkResultDetail, "llKkResultDetail");
            p220oa.h.c(llKkResultDetail);
            return;
        }
        Long amount = order.getAmount();
        sVar.f40501o.setText(r0.B(amount != null ? amount.longValue() : 0L, false));
        sVar.f40500j.setText(r0.B(jLongValue, false));
        Intrinsics.checkNotNullExpressionValue(llKkResultDetail, "llKkResultDetail");
        p220oa.h.s(llKkResultDetail, true);
    }

    private final void bindOptionalText(TextView view, String text) {
        if (text == null || text.length() == 0) {
            p220oa.h.c(view);
        } else {
            view.setText(text);
            p220oa.h.s(view, true);
        }
    }

    private final void bindTips(KkCarQrCodeRsp.QrCodeOrderDTO order) {
        s sVar = this.binding;
        if (sVar == null) {
            return;
        }
        TextView tvKkResultTips = sVar.f40502p;
        Intrinsics.checkNotNullExpressionValue(tvKkResultTips, "tvKkResultTips");
        bindOptionalText(tvKkResultTips, order.getTips());
    }

    private final ViewEvent buildPayResultViewEvent(KkCarQrCodeRsp.QrCodeOrderDTO order) {
        ViewEvent element = new ViewEvent("keke_pay_result_popup_show").add("app", TRACK_APP_NATIVE);
        String orderId = order.getOrderId();
        if (orderId != null) {
            if (orderId.length() <= 0) {
                orderId = null;
            }
            if (orderId != null) {
                element = element.add("order_id", orderId);
            }
        }
        Integer orderStatus = order.getOrderStatus();
        if (orderStatus != null) {
            element = element.add("result", mapOrderResultStatus(orderStatus.intValue()));
        }
        Long amount = order.getAmount();
        if (amount != null) {
            element = element.add("payment_amount", String.valueOf(amount.longValue()));
        }
        Long discountAmount = order.getDiscountAmount();
        if (discountAmount != null) {
            element = element.add("discount_amount", String.valueOf(discountAmount.longValue()));
        }
        Long payAmount = order.getPayAmount();
        if (payAmount != null) {
            element = element.add("pay_amount", String.valueOf(payAmount.longValue()));
        }
        String tips = order.getTips();
        if (tips != null) {
            String str = tips.length() > 0 ? tips : null;
            if (str != null) {
                element = element.add("message", str);
            }
        }
        Intrinsics.checkNotNullExpressionValue(element, "element");
        return element;
    }

    private final void copyAccountNumber() {
        User user = BaseApplication.getInstance().getUser();
        String strW0 = r0.w0(user != null ? user.getPhoneNumber() : null);
        if (strW0 == null || strW0.length() == 0) {
            return;
        }
        ClipboardUtils.copyText(strW0);
        ToastUtils.showShort(getContext().getString(k.core_core_copy_successfully), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(KkCarPayResultDialog kkCarPayResultDialog, View view) {
        if (r0.U0()) {
            return;
        }
        n0.g().k(((ClickEvent) G.f("keke_pay_result_popup_click", "app", TRACK_APP_NATIVE)).add("button_name", "close"));
        kkCarPayResultDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(KkCarPayResultDialog kkCarPayResultDialog, View view) {
        if (r0.U0()) {
            return;
        }
        n0.g().k(((ClickEvent) G.f("keke_pay_result_popup_click", "app", TRACK_APP_NATIVE)).add("button_name", kkCarPayResultDialog.resolveOkButtonName(kkCarPayResultDialog.currentOrder)));
        kkCarPayResultDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(KkCarPayResultDialog kkCarPayResultDialog, View view) {
        if (r0.U0()) {
            return;
        }
        n0.g().k(((ClickEvent) G.f("keke_pay_result_popup_click", "app", TRACK_APP_NATIVE)).add("button_name", BUTTON_ADD_MONEY));
        kkCarPayResultDialog.copyAccountNumber();
    }

    private final boolean isTerminalOrderStatus(Integer status) {
        return (status != null && status.intValue() == 1) || (status != null && status.intValue() == 2);
    }

    private final String mapOrderResultStatus(int status) {
        if (status == 1) {
            return "success";
        }
        if (status == 2) {
            return TransferByLoanResult.STATUS_FAILED;
        }
        if (status != 3) {
            return status != 4 ? "unknown" : "closed";
        }
        return "pending";
    }

    private final KkCarQrCodeRsp.QrCodeOrderDTO mergeOrder(KkCarQrCodeRsp.QrCodeOrderDTO old, KkCarQrCodeRsp.QrCodeOrderDTO qrCodeOrderDTO) {
        String orderId = qrCodeOrderDTO.getOrderId();
        if (orderId == null) {
            orderId = old.getOrderId();
        }
        String str = orderId;
        Integer orderStatus = qrCodeOrderDTO.getOrderStatus();
        if (orderStatus == null) {
            orderStatus = old.getOrderStatus();
        }
        Integer num = orderStatus;
        Integer orderFailType = qrCodeOrderDTO.getOrderFailType();
        if (orderFailType == null) {
            orderFailType = old.getOrderFailType();
        }
        Integer num2 = orderFailType;
        Long amount = qrCodeOrderDTO.getAmount();
        if (amount == null) {
            amount = old.getAmount();
        }
        Long l5 = amount;
        Long payAmount = qrCodeOrderDTO.getPayAmount();
        if (payAmount == null) {
            payAmount = old.getPayAmount();
        }
        Long l6 = payAmount;
        Long discountAmount = qrCodeOrderDTO.getDiscountAmount();
        if (discountAmount == null) {
            discountAmount = old.getDiscountAmount();
        }
        Long l8 = discountAmount;
        String tips = qrCodeOrderDTO.getTips();
        if (tips == null) {
            tips = old.getTips();
        }
        String str2 = tips;
        String driverName = qrCodeOrderDTO.getDriverName();
        if (driverName == null) {
            driverName = old.getDriverName();
        }
        String str3 = driverName;
        String driverAvatar = qrCodeOrderDTO.getDriverAvatar();
        if (driverAvatar == null) {
            driverAvatar = old.getDriverAvatar();
        }
        return old.copy(str, num, num2, l5, l6, l8, str2, str3, driverAvatar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object pollOrderOnce(Continuation<? super Boolean> continuation) throws Throwable {
        Bd.b bVar;
        KkCarQrCodeRsp.QrCodeOrderDTO qrCodeOrderDTO;
        if (continuation instanceof Bd.b) {
            bVar = (Bd.b) continuation;
            int i7 = bVar.f896c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                bVar.f896c = i7 - Integer.MIN_VALUE;
            } else {
                bVar = new Bd.b(this, continuation);
            }
        } else {
            bVar = new Bd.b(this, continuation);
        }
        Object objS = bVar.f894a;
        a aVar = a.f2423a;
        int i10 = bVar.f896c;
        if (i10 == 0) {
            g.M(objS);
            String orderId = this.currentOrder.getOrderId();
            p042cg.f fVar = I.f10809a;
            p042cg.e eVar = p042cg.e.f19009c;
            c cVar = new c(orderId, null);
            bVar.f896c = 1;
            objS = AbstractC0780y.s(eVar, cVar, bVar);
            if (objS == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(objS);
        }
        CommonBeanResult commonBeanResult = (CommonBeanResult) objS;
        if (commonBeanResult == null) {
            return Boolean.FALSE;
        }
        if (!commonBeanResult.isSuccess()) {
            return Boolean.FALSE;
        }
        KkCarQrCodePollOrderRsp kkCarQrCodePollOrderRsp = (KkCarQrCodePollOrderRsp) commonBeanResult.data;
        if (kkCarQrCodePollOrderRsp == null || (qrCodeOrderDTO = kkCarQrCodePollOrderRsp.getQrCodeOrderDTO()) == null) {
            return Boolean.FALSE;
        }
        KkCarQrCodeRsp.QrCodeOrderDTO qrCodeOrderDTOMergeOrder = mergeOrder(this.currentOrder, qrCodeOrderDTO);
        this.currentOrder = qrCodeOrderDTOMergeOrder;
        render(qrCodeOrderDTOMergeOrder);
        return Boolean.valueOf(isTerminalOrderStatus(this.currentOrder.getOrderStatus()));
    }

    private final void render(KkCarQrCodeRsp.QrCodeOrderDTO order) {
        Integer orderStatus = order.getOrderStatus();
        if (orderStatus != null && orderStatus.intValue() == 1) {
            renderSuccess(order);
        } else if (orderStatus != null && orderStatus.intValue() == 2) {
            renderFailed(order);
        } else if (orderStatus != null && orderStatus.intValue() == 3) {
            renderPending(order);
        } else if (orderStatus != null && orderStatus.intValue() == 4) {
            renderClosed(order);
        } else {
            renderClosed(order);
        }
        bindAmount(order);
        bindDetail(order);
        bindTips(order);
        bindActionButtons(order);
    }

    private final void renderClosed(KkCarQrCodeRsp.QrCodeOrderDTO order) {
        s sVar = this.binding;
        if (sVar == null) {
            return;
        }
        OrderResultHeaderModel.a aVar = OrderResultHeaderModel.f31610A;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setStatusIcon(aVar.closeIcon(context, 48.0f));
        sVar.t.setText(getContext().getString(k.core_failed));
    }

    private final void renderFailed(KkCarQrCodeRsp.QrCodeOrderDTO order) {
        s sVar = this.binding;
        if (sVar == null) {
            return;
        }
        OrderResultHeaderModel.a aVar = OrderResultHeaderModel.f31610A;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setStatusIcon(aVar.failIcon(context, 48.0f));
        sVar.t.setText(getContext().getString(k.core_failed));
    }

    private final void renderPending(KkCarQrCodeRsp.QrCodeOrderDTO order) {
        s sVar = this.binding;
        if (sVar == null) {
            return;
        }
        OrderResultHeaderModel.a aVar = OrderResultHeaderModel.f31610A;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setStatusIcon(aVar.processingIcon(context, 48.0f));
        sVar.t.setText(getContext().getString(k.core_processing));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0029  */
    private final void renderSuccess(KkCarQrCodeRsp.QrCodeOrderDTO order) {
        boolean z3;
        s sVar = this.binding;
        if (sVar == null) {
            return;
        }
        Long payAmount = order.getPayAmount();
        if ((payAmount != null ? payAmount.longValue() : 0L) != 0) {
            z3 = false;
        } else {
            Long discountAmount = order.getDiscountAmount();
            if ((discountAmount != null ? discountAmount.longValue() : 0L) > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        showSuccessLottie(z3 ? u.cv_anim_signup_success : u.cv_result_success);
        applyResultTitleMarginTop(z3 ? FREE_RIDE_TITLE_MARGIN_TOP_DP : 72);
        String string = getContext().getString(k.core_successful);
        TextView textView = sVar.t;
        textView.setText(string);
        if (z3) {
            textView.setText(getContext().getString(h.sm_kk_qr_result_success_free));
        }
    }

    private final String resolveOkButtonName(KkCarQrCodeRsp.QrCodeOrderDTO order) {
        Integer orderFailType;
        Integer orderStatus = order.getOrderStatus();
        return (orderStatus != null && orderStatus.intValue() == 2 && (orderFailType = order.getOrderFailType()) != null && orderFailType.intValue() == 1) ? BUTTON_QUIT : BUTTON_COMPLETE;
    }

    private final void setStatusIcon(Drawable icon) {
        s sVar = this.binding;
        if (sVar == null) {
            return;
        }
        LottieAnimationView lavKkResultStatusIcon = sVar.f40497f;
        lavKkResultStatusIcon.a();
        Intrinsics.checkNotNullExpressionValue(lavKkResultStatusIcon, "lavKkResultStatusIcon");
        p220oa.h.c(lavKkResultStatusIcon);
        AppCompatImageView ivKkResultSuccessIcon = sVar.f40496e;
        Intrinsics.checkNotNullExpressionValue(ivKkResultSuccessIcon, "ivKkResultSuccessIcon");
        p220oa.h.c(ivKkResultSuccessIcon);
        ImageView ivKkResultStatusIcon = sVar.f40495d;
        Intrinsics.checkNotNullExpressionValue(ivKkResultStatusIcon, "ivKkResultStatusIcon");
        p220oa.h.s(ivKkResultStatusIcon, true);
        ivKkResultStatusIcon.setImageDrawable(icon);
    }

    private final void showSuccessLottie(@RawRes int rawRes) {
        s sVar = this.binding;
        if (sVar == null) {
            return;
        }
        ImageView ivKkResultStatusIcon = sVar.f40495d;
        Intrinsics.checkNotNullExpressionValue(ivKkResultStatusIcon, "ivKkResultStatusIcon");
        p220oa.h.c(ivKkResultStatusIcon);
        LottieAnimationView lavKkResultStatusIcon = sVar.f40497f;
        Intrinsics.checkNotNullExpressionValue(lavKkResultStatusIcon, "lavKkResultStatusIcon");
        p220oa.h.s(lavKkResultStatusIcon, true);
        boolean z3 = rawRes == u.cv_anim_signup_success;
        int dp = z3 ? CommonViewExtKt.getDp(FREE_RIDE_LOTTIE_HEIGHT_DP) : CommonViewExtKt.getDp(64);
        ViewGroup.LayoutParams layoutParams = lavKkResultStatusIcon.getLayoutParams();
        layoutParams.height = dp;
        lavKkResultStatusIcon.setLayoutParams(layoutParams);
        lavKkResultStatusIcon.setAnimation(rawRes);
        lavKkResultStatusIcon.e();
        AppCompatImageView ivKkResultSuccessIcon = sVar.f40496e;
        Intrinsics.checkNotNullExpressionValue(ivKkResultSuccessIcon, "ivKkResultSuccessIcon");
        p220oa.h.s(ivKkResultSuccessIcon, z3);
    }

    private final void startOrderPollingIfNeeded() {
        if (isTerminalOrderStatus(this.currentOrder.getOrderStatus())) {
            return;
        }
        stopOrderPolling();
        this.orderPollJob = AbstractC0780y.m(this.dialogScope, null, null, new Bd.d(this, null), 3);
    }

    private final void stopOrderPolling() {
        Job job = this.orderPollJob;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        this.orderPollJob = null;
    }

    @JvmStatic
    @Nullable
    public static final KkCarPayResultDialog tryShow(@Nullable Context context, @NotNull KkCarQrCodeRsp.QrCodeOrderDTO qrCodeOrderDTO) {
        return INSTANCE.tryShow(context, qrCodeOrderDTO);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        stopOrderPolling();
        AbstractC0777v.c(this.dialogScope, null);
        if (currentShowing == this) {
            currentShowing = null;
        }
        super.dismiss();
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        View viewFindViewById = findViewById(p159kd.e.rootView);
        int i7 = p159kd.e.btnKkResultAddMoney;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, viewFindViewById);
        if (ppButton != null) {
            i7 = p159kd.e.btnKkResultOk;
            PpButton ppButton2 = (PpButton) p059e1.a.m(i7, viewFindViewById);
            if (ppButton2 != null) {
                i7 = p159kd.e.clHeader;
                if (((ConstraintLayout) p059e1.a.m(i7, viewFindViewById)) != null) {
                    i7 = p159kd.e.ivKkResultClose;
                    IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewFindViewById);
                    if (iconicsImageView != null) {
                        i7 = p159kd.e.ivKkResultStatusIcon;
                        ImageView imageView = (ImageView) p059e1.a.m(i7, viewFindViewById);
                        if (imageView != null) {
                            i7 = p159kd.e.ivKkResultSuccessIcon;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) p059e1.a.m(i7, viewFindViewById);
                            if (appCompatImageView != null) {
                                i7 = p159kd.e.lavKkResultStatusIcon;
                                LottieAnimationView lottieAnimationView = (LottieAnimationView) p059e1.a.m(i7, viewFindViewById);
                                if (lottieAnimationView != null) {
                                    i7 = p159kd.e.llKkResultDetail;
                                    LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewFindViewById);
                                    if (linearLayout != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
                                        i7 = p159kd.e.tvKkResultAmount;
                                        TextView textView = (TextView) p059e1.a.m(i7, viewFindViewById);
                                        if (textView != null) {
                                            i7 = p159kd.e.tvKkResultDiscountAmount;
                                            TextView textView2 = (TextView) p059e1.a.m(i7, viewFindViewById);
                                            if (textView2 != null) {
                                                i7 = p159kd.e.tvKkResultPaymentAmount;
                                                TextView textView3 = (TextView) p059e1.a.m(i7, viewFindViewById);
                                                if (textView3 != null) {
                                                    i7 = p159kd.e.tvKkResultTips;
                                                    TextView textView4 = (TextView) p059e1.a.m(i7, viewFindViewById);
                                                    if (textView4 != null) {
                                                        i7 = p159kd.e.tvKkResultTitle;
                                                        TextView textView5 = (TextView) p059e1.a.m(i7, viewFindViewById);
                                                        if (textView5 != null) {
                                                            this.binding = new s(constraintLayout, ppButton, ppButton2, iconicsImageView, imageView, appCompatImageView, lottieAnimationView, linearLayout, textView, textView2, textView3, textView4, textView5);
                                                            final int i10 = 0;
                                                            iconicsImageView.setOnClickListener(new View.OnClickListener(this) { // from class: Bd.a

                                                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                                public final /* synthetic */ KkCarPayResultDialog f893b;

                                                                {
                                                                    this.f893b = this;
                                                                }

                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    switch (i10) {
                                                                        case 0:
                                                                            KkCarPayResultDialog.initViews$lambda$0(this.f893b, view);
                                                                            break;
                                                                        case 1:
                                                                            KkCarPayResultDialog.initViews$lambda$1(this.f893b, view);
                                                                            break;
                                                                        default:
                                                                            KkCarPayResultDialog.initViews$lambda$2(this.f893b, view);
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            s sVar = this.binding;
                                                            if (sVar != null) {
                                                                final int i11 = 1;
                                                                sVar.f40494c.setOnClickListener(new View.OnClickListener(this) { // from class: Bd.a

                                                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                                    public final /* synthetic */ KkCarPayResultDialog f893b;

                                                                    {
                                                                        this.f893b = this;
                                                                    }

                                                                    @Override // android.view.View.OnClickListener
                                                                    public final void onClick(View view) {
                                                                        switch (i11) {
                                                                            case 0:
                                                                                KkCarPayResultDialog.initViews$lambda$0(this.f893b, view);
                                                                                break;
                                                                            case 1:
                                                                                KkCarPayResultDialog.initViews$lambda$1(this.f893b, view);
                                                                                break;
                                                                            default:
                                                                                KkCarPayResultDialog.initViews$lambda$2(this.f893b, view);
                                                                                break;
                                                                        }
                                                                    }
                                                                });
                                                            }
                                                            s sVar2 = this.binding;
                                                            if (sVar2 != null) {
                                                                final int i12 = 2;
                                                                sVar2.f40493b.setOnClickListener(new View.OnClickListener(this) { // from class: Bd.a

                                                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                                    public final /* synthetic */ KkCarPayResultDialog f893b;

                                                                    {
                                                                        this.f893b = this;
                                                                    }

                                                                    @Override // android.view.View.OnClickListener
                                                                    public final void onClick(View view) {
                                                                        switch (i12) {
                                                                            case 0:
                                                                                KkCarPayResultDialog.initViews$lambda$0(this.f893b, view);
                                                                                break;
                                                                            case 1:
                                                                                KkCarPayResultDialog.initViews$lambda$1(this.f893b, view);
                                                                                break;
                                                                            default:
                                                                                KkCarPayResultDialog.initViews$lambda$2(this.f893b, view);
                                                                                break;
                                                                        }
                                                                    }
                                                                });
                                                            }
                                                            render(this.currentOrder);
                                                            n0.g().u(buildPayResultViewEvent(this.currentOrder));
                                                            startOrderPollingIfNeeded();
                                                            Window window = getWindow();
                                                            if (window != null) {
                                                                showAtBottom(window);
                                                                return;
                                                            }
                                                            return;
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        KkCarPayResultDialog kkCarPayResultDialog = currentShowing;
        if (kkCarPayResultDialog == null || kkCarPayResultDialog == this || !kkCarPayResultDialog.isShowing()) {
            currentShowing = this;
            super.show();
        }
    }
}
