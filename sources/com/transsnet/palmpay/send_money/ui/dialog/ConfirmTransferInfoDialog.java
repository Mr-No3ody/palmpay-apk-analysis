package com.transsnet.palmpay.send_money.ui.dialog;

import Ad.C0077y;
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
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmTransferInfoDialog;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159kd.d;
import p159kd.e;
import p159kd.f;
import p220oa.h;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0006.B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u001b\u0010'\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001eR\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010+R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010-¨\u0006/"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/ConfirmTransferInfoDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "LAd/y;", Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH, "Landroid/view/View;", "getView", "(LAd/y;)Landroid/view/View;", "", "initViews", "()V", "", "tips", "setTips", "(Ljava/lang/CharSequence;)V", "", "datas", "setData", "(Ljava/util/List;)V", "Lcom/transsnet/palmpay/send_money/ui/dialog/ConfirmTransferInfoDialog$OnConfirmTransferInfoListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnConfirmTransferInfoListener", "(Lcom/transsnet/palmpay/send_money/ui/dialog/ConfirmTransferInfoDialog$OnConfirmTransferInfoListener;)V", "Landroid/widget/TextView;", "tv_confirm$delegate", "Lkotlin/Lazy;", "getTv_confirm", "()Landroid/widget/TextView;", "tv_confirm", "Landroid/widget/LinearLayout;", "ll_info_container$delegate", "getLl_info_container", "()Landroid/widget/LinearLayout;", "ll_info_container", "tv_tips$delegate", "getTv_tips", "tv_tips", "Lcom/mikepenz/iconics/view/IconicsImageView;", "iv_close$delegate", "getIv_close", "()Lcom/mikepenz/iconics/view/IconicsImageView;", "iv_close", "Lcom/transsnet/palmpay/send_money/ui/dialog/ConfirmTransferInfoDialog$OnConfirmTransferInfoListener;", "OnConfirmTransferInfoListener", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConfirmTransferInfoDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfirmTransferInfoDialog.kt\ncom/transsnet/palmpay/send_money/ui/dialog/ConfirmTransferInfoDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1869#2,2:83\n*S KotlinDebug\n*F\n+ 1 ConfirmTransferInfoDialog.kt\ncom/transsnet/palmpay/send_money/ui/dialog/ConfirmTransferInfoDialog\n*L\n48#1:83,2\n*E\n"})
public final class ConfirmTransferInfoDialog extends b {

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

    /* JADX INFO: renamed from: tv_tips$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_tips;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/ConfirmTransferInfoDialog$OnConfirmTransferInfoListener;", "", "onConfirmClick", "", "view", "Landroid/view/View;", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnConfirmTransferInfoListener {
        void onConfirmClick(@NotNull View view);
    }

    public ConfirmTransferInfoDialog(@Nullable Context context) {
        super(context);
        final int i7 = 0;
        this.tv_confirm = C2131j.b(new Function0(this) { // from class: Ad.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmTransferInfoDialog f259b;

            {
                this.f259b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return ConfirmTransferInfoDialog.tv_confirm_delegate$lambda$0(this.f259b);
                    case 1:
                        return ConfirmTransferInfoDialog.ll_info_container_delegate$lambda$1(this.f259b);
                    case 2:
                        return ConfirmTransferInfoDialog.tv_tips_delegate$lambda$2(this.f259b);
                    default:
                        return ConfirmTransferInfoDialog.iv_close_delegate$lambda$3(this.f259b);
                }
            }
        });
        final int i10 = 1;
        this.ll_info_container = C2131j.b(new Function0(this) { // from class: Ad.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmTransferInfoDialog f259b;

            {
                this.f259b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return ConfirmTransferInfoDialog.tv_confirm_delegate$lambda$0(this.f259b);
                    case 1:
                        return ConfirmTransferInfoDialog.ll_info_container_delegate$lambda$1(this.f259b);
                    case 2:
                        return ConfirmTransferInfoDialog.tv_tips_delegate$lambda$2(this.f259b);
                    default:
                        return ConfirmTransferInfoDialog.iv_close_delegate$lambda$3(this.f259b);
                }
            }
        });
        final int i11 = 2;
        this.tv_tips = C2131j.b(new Function0(this) { // from class: Ad.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmTransferInfoDialog f259b;

            {
                this.f259b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return ConfirmTransferInfoDialog.tv_confirm_delegate$lambda$0(this.f259b);
                    case 1:
                        return ConfirmTransferInfoDialog.ll_info_container_delegate$lambda$1(this.f259b);
                    case 2:
                        return ConfirmTransferInfoDialog.tv_tips_delegate$lambda$2(this.f259b);
                    default:
                        return ConfirmTransferInfoDialog.iv_close_delegate$lambda$3(this.f259b);
                }
            }
        });
        final int i12 = 3;
        this.iv_close = C2131j.b(new Function0(this) { // from class: Ad.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmTransferInfoDialog f259b;

            {
                this.f259b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return ConfirmTransferInfoDialog.tv_confirm_delegate$lambda$0(this.f259b);
                    case 1:
                        return ConfirmTransferInfoDialog.ll_info_container_delegate$lambda$1(this.f259b);
                    case 2:
                        return ConfirmTransferInfoDialog.tv_tips_delegate$lambda$2(this.f259b);
                    default:
                        return ConfirmTransferInfoDialog.iv_close_delegate$lambda$3(this.f259b);
                }
            }
        });
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

    private final TextView getTv_tips() {
        Object value = this.tv_tips.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final View getView(C0077y info) {
        View viewInflate = getLayoutInflater().inflate(f.sm_layout_confirm_transfer_info_item, (ViewGroup) null);
        if (info != null) {
            ((TextView) viewInflate.findViewById(e.tv_item_key)).setText(info.f260a);
            ((TextView) viewInflate.findViewById(e.tv_item_value)).setText(info.f261b);
            if (!TextUtils.isEmpty(info.f262c)) {
                ImageView imageView = (ImageView) viewInflate.findViewById(e.iv_item_value_icon);
                r0.l1(info.f262c, imageView);
                Intrinsics.e(imageView);
                h.C(imageView);
            }
        }
        Intrinsics.e(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$5(ConfirmTransferInfoDialog confirmTransferInfoDialog, View view) {
        OnConfirmTransferInfoListener onConfirmTransferInfoListener = confirmTransferInfoDialog.listener;
        if (onConfirmTransferInfoListener != null) {
            Intrinsics.e(view);
            onConfirmTransferInfoListener.onConfirmClick(view);
        }
        confirmTransferInfoDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IconicsImageView iv_close_delegate$lambda$3(ConfirmTransferInfoDialog confirmTransferInfoDialog) {
        return (IconicsImageView) confirmTransferInfoDialog.findViewById(e.iv_close);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout ll_info_container_delegate$lambda$1(ConfirmTransferInfoDialog confirmTransferInfoDialog) {
        return (LinearLayout) confirmTransferInfoDialog.findViewById(e.ll_info_container);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_confirm_delegate$lambda$0(ConfirmTransferInfoDialog confirmTransferInfoDialog) {
        return (TextView) confirmTransferInfoDialog.findViewById(e.tv_confirm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_tips_delegate$lambda$2(ConfirmTransferInfoDialog confirmTransferInfoDialog) {
        return (TextView) confirmTransferInfoDialog.findViewById(e.tv_tips);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(f.sm_dialog_confirm_transfer_info);
        final int i7 = 0;
        getIv_close().setOnClickListener(new View.OnClickListener(this) { // from class: Ad.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmTransferInfoDialog f257b;

            {
                this.f257b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.f257b.dismiss();
                        break;
                    default:
                        ConfirmTransferInfoDialog.initViews$lambda$5(this.f257b, view);
                        break;
                }
            }
        });
        final int i10 = 1;
        getTv_confirm().setOnClickListener(new View.OnClickListener(this) { // from class: Ad.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmTransferInfoDialog f257b;

            {
                this.f257b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f257b.dismiss();
                        break;
                    default:
                        ConfirmTransferInfoDialog.initViews$lambda$5(this.f257b, view);
                        break;
                }
            }
        });
        getTv_tips().setText(new SpanUtils().appendImage(d.sm_ic_none_verified).append(getContext().getString(p159kd.h.sm_information_confirmed_to_sb)).create());
    }

    public final void setData(@NotNull List<C0077y> datas) {
        Intrinsics.checkNotNullParameter(datas, "datas");
        Iterator<T> it = datas.iterator();
        while (it.hasNext()) {
            getLl_info_container().addView(getView((C0077y) it.next()));
        }
    }

    public final void setOnConfirmTransferInfoListener(@NotNull OnConfirmTransferInfoListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    public final void setTips(@NotNull CharSequence tips) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        getTv_tips().setText(tips);
    }
}
