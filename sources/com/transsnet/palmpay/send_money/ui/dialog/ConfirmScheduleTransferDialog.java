package com.transsnet.palmpay.send_money.ui.dialog;

import Ad.C0074v;
import C0.G;
import Pa.i0;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.send_money.bean.req.ScheduleTransferCreateReq;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmScheduleTransferDialog;
import java.text.SimpleDateFormat;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159kd.e;
import p159kd.f;
import p220oa.h;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\t4B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u001b\u0010$\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u001b\u0010'\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010\u001bR\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0019\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0019\u001a\u0004\b/\u00100R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00102R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00103¨\u00065"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/ConfirmScheduleTransferDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initData", "()V", "LAd/v;", Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH, "Landroid/view/View;", "getView", "(LAd/v;)Landroid/view/View;", "initViews", "Lcom/transsnet/palmpay/send_money/bean/req/ScheduleTransferCreateReq;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setData", "(Lcom/transsnet/palmpay/send_money/bean/req/ScheduleTransferCreateReq;)V", "Lcom/transsnet/palmpay/send_money/ui/dialog/ConfirmScheduleTransferDialog$OnConfirmTransferInfoListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnConfirmTransferInfoListener", "(Lcom/transsnet/palmpay/send_money/ui/dialog/ConfirmScheduleTransferDialog$OnConfirmTransferInfoListener;)V", "Landroid/widget/TextView;", "tv_confirm$delegate", "Lkotlin/Lazy;", "getTv_confirm", "()Landroid/widget/TextView;", "tv_confirm", "Landroid/widget/LinearLayout;", "ll_info_container$delegate", "getLl_info_container", "()Landroid/widget/LinearLayout;", "ll_info_container", "tv_info$delegate", "getTv_info", "tv_info", "tv_name$delegate", "getTv_name", "tv_name", "Landroid/widget/ImageView;", "iv_avatar$delegate", "getIv_avatar", "()Landroid/widget/ImageView;", "iv_avatar", "Lcom/mikepenz/iconics/view/IconicsImageView;", "iv_close$delegate", "getIv_close", "()Lcom/mikepenz/iconics/view/IconicsImageView;", "iv_close", "Lcom/transsnet/palmpay/send_money/ui/dialog/ConfirmScheduleTransferDialog$OnConfirmTransferInfoListener;", "Lcom/transsnet/palmpay/send_money/bean/req/ScheduleTransferCreateReq;", "OnConfirmTransferInfoListener", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConfirmScheduleTransferDialog extends b {

    @Nullable
    private ScheduleTransferCreateReq data;

    /* JADX INFO: renamed from: iv_avatar$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy iv_avatar;

    /* JADX INFO: renamed from: iv_close$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy iv_close;

    @Nullable
    private OnConfirmTransferInfoListener listener;

    /* JADX INFO: renamed from: ll_info_container$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ll_info_container;

    /* JADX INFO: renamed from: tv_confirm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_confirm;

    /* JADX INFO: renamed from: tv_info$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_info;

    /* JADX INFO: renamed from: tv_name$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_name;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/ConfirmScheduleTransferDialog$OnConfirmTransferInfoListener;", "", "onConfirmClick", "", "req", "Lcom/transsnet/palmpay/send_money/bean/req/ScheduleTransferCreateReq;", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnConfirmTransferInfoListener {
        void onConfirmClick(@Nullable ScheduleTransferCreateReq req);
    }

    public ConfirmScheduleTransferDialog(@Nullable Context context) {
        super(context);
        final int i7 = 0;
        this.tv_confirm = C2131j.b(new Function0(this) { // from class: Ad.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmScheduleTransferDialog f251b;

            {
                this.f251b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return ConfirmScheduleTransferDialog.tv_confirm_delegate$lambda$0(this.f251b);
                    case 1:
                        return ConfirmScheduleTransferDialog.ll_info_container_delegate$lambda$1(this.f251b);
                    case 2:
                        return ConfirmScheduleTransferDialog.tv_info_delegate$lambda$2(this.f251b);
                    case 3:
                        return ConfirmScheduleTransferDialog.tv_name_delegate$lambda$3(this.f251b);
                    case 4:
                        return ConfirmScheduleTransferDialog.iv_avatar_delegate$lambda$4(this.f251b);
                    default:
                        return ConfirmScheduleTransferDialog.iv_close_delegate$lambda$5(this.f251b);
                }
            }
        });
        final int i10 = 1;
        this.ll_info_container = C2131j.b(new Function0(this) { // from class: Ad.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmScheduleTransferDialog f251b;

            {
                this.f251b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return ConfirmScheduleTransferDialog.tv_confirm_delegate$lambda$0(this.f251b);
                    case 1:
                        return ConfirmScheduleTransferDialog.ll_info_container_delegate$lambda$1(this.f251b);
                    case 2:
                        return ConfirmScheduleTransferDialog.tv_info_delegate$lambda$2(this.f251b);
                    case 3:
                        return ConfirmScheduleTransferDialog.tv_name_delegate$lambda$3(this.f251b);
                    case 4:
                        return ConfirmScheduleTransferDialog.iv_avatar_delegate$lambda$4(this.f251b);
                    default:
                        return ConfirmScheduleTransferDialog.iv_close_delegate$lambda$5(this.f251b);
                }
            }
        });
        final int i11 = 2;
        this.tv_info = C2131j.b(new Function0(this) { // from class: Ad.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmScheduleTransferDialog f251b;

            {
                this.f251b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return ConfirmScheduleTransferDialog.tv_confirm_delegate$lambda$0(this.f251b);
                    case 1:
                        return ConfirmScheduleTransferDialog.ll_info_container_delegate$lambda$1(this.f251b);
                    case 2:
                        return ConfirmScheduleTransferDialog.tv_info_delegate$lambda$2(this.f251b);
                    case 3:
                        return ConfirmScheduleTransferDialog.tv_name_delegate$lambda$3(this.f251b);
                    case 4:
                        return ConfirmScheduleTransferDialog.iv_avatar_delegate$lambda$4(this.f251b);
                    default:
                        return ConfirmScheduleTransferDialog.iv_close_delegate$lambda$5(this.f251b);
                }
            }
        });
        final int i12 = 3;
        this.tv_name = C2131j.b(new Function0(this) { // from class: Ad.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmScheduleTransferDialog f251b;

            {
                this.f251b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return ConfirmScheduleTransferDialog.tv_confirm_delegate$lambda$0(this.f251b);
                    case 1:
                        return ConfirmScheduleTransferDialog.ll_info_container_delegate$lambda$1(this.f251b);
                    case 2:
                        return ConfirmScheduleTransferDialog.tv_info_delegate$lambda$2(this.f251b);
                    case 3:
                        return ConfirmScheduleTransferDialog.tv_name_delegate$lambda$3(this.f251b);
                    case 4:
                        return ConfirmScheduleTransferDialog.iv_avatar_delegate$lambda$4(this.f251b);
                    default:
                        return ConfirmScheduleTransferDialog.iv_close_delegate$lambda$5(this.f251b);
                }
            }
        });
        final int i13 = 4;
        this.iv_avatar = C2131j.b(new Function0(this) { // from class: Ad.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmScheduleTransferDialog f251b;

            {
                this.f251b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return ConfirmScheduleTransferDialog.tv_confirm_delegate$lambda$0(this.f251b);
                    case 1:
                        return ConfirmScheduleTransferDialog.ll_info_container_delegate$lambda$1(this.f251b);
                    case 2:
                        return ConfirmScheduleTransferDialog.tv_info_delegate$lambda$2(this.f251b);
                    case 3:
                        return ConfirmScheduleTransferDialog.tv_name_delegate$lambda$3(this.f251b);
                    case 4:
                        return ConfirmScheduleTransferDialog.iv_avatar_delegate$lambda$4(this.f251b);
                    default:
                        return ConfirmScheduleTransferDialog.iv_close_delegate$lambda$5(this.f251b);
                }
            }
        });
        final int i14 = 5;
        this.iv_close = C2131j.b(new Function0(this) { // from class: Ad.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmScheduleTransferDialog f251b;

            {
                this.f251b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return ConfirmScheduleTransferDialog.tv_confirm_delegate$lambda$0(this.f251b);
                    case 1:
                        return ConfirmScheduleTransferDialog.ll_info_container_delegate$lambda$1(this.f251b);
                    case 2:
                        return ConfirmScheduleTransferDialog.tv_info_delegate$lambda$2(this.f251b);
                    case 3:
                        return ConfirmScheduleTransferDialog.tv_name_delegate$lambda$3(this.f251b);
                    case 4:
                        return ConfirmScheduleTransferDialog.iv_avatar_delegate$lambda$4(this.f251b);
                    default:
                        return ConfirmScheduleTransferDialog.iv_close_delegate$lambda$5(this.f251b);
                }
            }
        });
    }

    private final ImageView getIv_avatar() {
        Object value = this.iv_avatar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final IconicsImageView getIv_close() {
        Object value = this.iv_close.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IconicsImageView) value;
    }

    private final LinearLayout getLl_info_container() {
        Object value = this.ll_info_container.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    private final TextView getTv_confirm() {
        Object value = this.tv_confirm.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_info() {
        Object value = this.tv_info.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_name() {
        Object value = this.tv_name.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final View getView(C0074v info) {
        View viewInflate = getLayoutInflater().inflate(f.sm_layout_confirm_schedule_transfer_detail_item, (ViewGroup) null);
        if (info != null) {
            TextView textView = (TextView) viewInflate.findViewById(e.tv_item_key);
            textView.setText(info.f254a);
            textView.setTextColor(getContext().getColor(L6.b.ppColorTextNormal));
            TextView textView2 = (TextView) viewInflate.findViewById(e.tv_item_value);
            textView2.setText(info.f255b);
            textView2.setTextColor(getContext().getColor(L6.b.ppColorTextPrimary));
            if (!TextUtils.isEmpty(null)) {
                ImageView imageView = (ImageView) viewInflate.findViewById(e.iv_item_value_icon);
                r0.l1(null, imageView);
                Intrinsics.e(imageView);
                h.C(imageView);
            }
        }
        Intrinsics.e(viewInflate);
        return viewInflate;
    }

    private final void initData() {
        ScheduleTransferCreateReq scheduleTransferCreateReq;
        String strB;
        if (getTv_name() == null || (scheduleTransferCreateReq = this.data) == null) {
            return;
        }
        getTv_name().setText(scheduleTransferCreateReq.getPayeeName());
        Integer type = scheduleTransferCreateReq.getType();
        if (type != null && type.intValue() == 1) {
            r0.m1(scheduleTransferCreateReq.getPayeeIcon(), getIv_avatar());
            TextView tv_info = getTv_info();
            String payeePhone = scheduleTransferCreateReq.getPayeePhone();
            G.x("PalmPay | ", payeePhone != null ? r0.w(payeePhone) : null, tv_info);
        } else {
            r0.o1(scheduleTransferCreateReq.getPayeeIcon(), getIv_avatar());
            getTv_info().setText(r0.H(scheduleTransferCreateReq.getPayeeBankName()) + " | " + i0.r(scheduleTransferCreateReq.getPayeeBankNo()));
        }
        getLl_info_container().removeAllViews();
        LinearLayout ll_info_container = getLl_info_container();
        C0074v c0074v = new C0074v();
        c0074v.f254a = getContext().getString(p159kd.h.sm_transfer_amount);
        Long businessAmount = scheduleTransferCreateReq.getBusinessAmount();
        c0074v.f255b = r0.B(businessAmount != null ? businessAmount.longValue() : 0L, false);
        Unit unit = Unit.f38893a;
        ll_info_container.addView(getView(c0074v));
        LinearLayout ll_info_container2 = getLl_info_container();
        C0074v c0074v2 = new C0074v();
        Context context = getContext();
        Integer taskType = scheduleTransferCreateReq.getTaskType();
        c0074v2.f254a = context.getString((taskType != null && taskType.intValue() == 2) ? p159kd.h.sm_start_date : p159kd.h.sm_transfer_time);
        SimpleDateFormat simpleDateFormat = Jd.b.f4773a;
        Integer taskType2 = scheduleTransferCreateReq.getTaskType();
        int iIntValue = taskType2 != null ? taskType2.intValue() : 0;
        Long taskStartDate = scheduleTransferCreateReq.getTaskStartDate();
        c0074v2.f255b = Jd.b.g(iIntValue, taskStartDate != null ? taskStartDate.longValue() : 0L, true);
        ll_info_container2.addView(getView(c0074v2));
        Integer taskType3 = scheduleTransferCreateReq.getTaskType();
        if (taskType3 != null && taskType3.intValue() == 1) {
            return;
        }
        LinearLayout ll_info_container3 = getLl_info_container();
        C0074v c0074v3 = new C0074v();
        c0074v3.f254a = getContext().getString(p159kd.h.sm_end_time);
        Integer transferNum = scheduleTransferCreateReq.getTransferNum();
        if ((transferNum != null ? transferNum.intValue() : 0) <= 0) {
            strB = "No End";
        } else {
            Long taskEndDate = scheduleTransferCreateReq.getTaskEndDate();
            strB = Jd.b.b(Long.valueOf(taskEndDate != null ? taskEndDate.longValue() : 0L));
        }
        c0074v3.f255b = strB;
        ll_info_container3.addView(getView(c0074v3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$7(ConfirmScheduleTransferDialog confirmScheduleTransferDialog, View view) {
        OnConfirmTransferInfoListener onConfirmTransferInfoListener = confirmScheduleTransferDialog.listener;
        if (onConfirmTransferInfoListener != null) {
            onConfirmTransferInfoListener.onConfirmClick(confirmScheduleTransferDialog.data);
        }
        confirmScheduleTransferDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView iv_avatar_delegate$lambda$4(ConfirmScheduleTransferDialog confirmScheduleTransferDialog) {
        return (ImageView) confirmScheduleTransferDialog.findViewById(e.iv_avatar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IconicsImageView iv_close_delegate$lambda$5(ConfirmScheduleTransferDialog confirmScheduleTransferDialog) {
        return (IconicsImageView) confirmScheduleTransferDialog.findViewById(e.iv_close);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout ll_info_container_delegate$lambda$1(ConfirmScheduleTransferDialog confirmScheduleTransferDialog) {
        return (LinearLayout) confirmScheduleTransferDialog.findViewById(e.ll_info_container);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_confirm_delegate$lambda$0(ConfirmScheduleTransferDialog confirmScheduleTransferDialog) {
        return (TextView) confirmScheduleTransferDialog.findViewById(e.tv_confirm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_info_delegate$lambda$2(ConfirmScheduleTransferDialog confirmScheduleTransferDialog) {
        return (TextView) confirmScheduleTransferDialog.findViewById(e.tv_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_name_delegate$lambda$3(ConfirmScheduleTransferDialog confirmScheduleTransferDialog) {
        return (TextView) confirmScheduleTransferDialog.findViewById(e.tv_name);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(f.sm_dialog_confirm_schedule_transfer);
        final int i7 = 0;
        getIv_close().setOnClickListener(new View.OnClickListener(this) { // from class: Ad.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmScheduleTransferDialog f253b;

            {
                this.f253b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.f253b.dismiss();
                        break;
                    default:
                        ConfirmScheduleTransferDialog.initViews$lambda$7(this.f253b, view);
                        break;
                }
            }
        });
        final int i10 = 1;
        getTv_confirm().setOnClickListener(new View.OnClickListener(this) { // from class: Ad.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmScheduleTransferDialog f253b;

            {
                this.f253b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f253b.dismiss();
                        break;
                    default:
                        ConfirmScheduleTransferDialog.initViews$lambda$7(this.f253b, view);
                        break;
                }
            }
        });
        initData();
    }

    public final void setData(@Nullable ScheduleTransferCreateReq data) {
        this.data = data;
        initData();
    }

    public final void setOnConfirmTransferInfoListener(@NotNull OnConfirmTransferInfoListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }
}
