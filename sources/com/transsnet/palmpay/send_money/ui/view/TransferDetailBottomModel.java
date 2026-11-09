package com.transsnet.palmpay.send_money.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.transsnet.palmpay.send_money.ui.view.TransferDetailBottomModel;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159kd.e;
import p159kd.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0014B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/view/TransferDetailBottomModel;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/transsnet/palmpay/send_money/ui/view/TransferDetailBottomModel$OnTransferDetailBottomModelListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setOnTransferDetailBottomModelListener", "(Lcom/transsnet/palmpay/send_money/ui/view/TransferDetailBottomModel$OnTransferDetailBottomModelListener;)V", "c", "Lcom/transsnet/palmpay/send_money/ui/view/TransferDetailBottomModel$OnTransferDetailBottomModelListener;", "getListener", "()Lcom/transsnet/palmpay/send_money/ui/view/TransferDetailBottomModel$OnTransferDetailBottomModelListener;", "setListener", "OnTransferDetailBottomModelListener", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransferDetailBottomModel extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f33868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f33869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public OnTransferDetailBottomModelListener listener;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/view/TransferDetailBottomModel$OnTransferDetailBottomModelListener;", "", "onLeftClick", "", "v", "Landroid/view/View;", "onRightClick", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnTransferDetailBottomModelListener {
        void onLeftClick(@NotNull View v3);

        void onRightClick(@NotNull View v3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferDetailBottomModel(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    public final OnTransferDetailBottomModelListener getListener() {
        return this.listener;
    }

    public final void setListener(@Nullable OnTransferDetailBottomModelListener onTransferDetailBottomModelListener) {
        this.listener = onTransferDetailBottomModelListener;
    }

    public final void setOnTransferDetailBottomModelListener(@Nullable OnTransferDetailBottomModelListener listener) {
        this.listener = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferDetailBottomModel(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TransferDetailBottomModel(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferDetailBottomModel(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, f.sm_layout_transfer_detail_bottom, this);
        setBackgroundResource(L6.b.ppColorBackgroundLight);
        this.f33868a = (LinearLayout) findViewById(e.ll_feedback_now);
        LinearLayout linearLayout = (LinearLayout) findViewById(e.ll_view_receipt);
        this.f33869b = linearLayout;
        if (linearLayout != null) {
            final int i10 = 0;
            linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: Gd.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TransferDetailBottomModel f3341b;

                {
                    this.f3341b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            TransferDetailBottomModel.OnTransferDetailBottomModelListener onTransferDetailBottomModelListener = this.f3341b.listener;
                            if (onTransferDetailBottomModelListener != null) {
                                Intrinsics.e(view);
                                onTransferDetailBottomModelListener.onLeftClick(view);
                            }
                            break;
                        default:
                            TransferDetailBottomModel.OnTransferDetailBottomModelListener onTransferDetailBottomModelListener2 = this.f3341b.listener;
                            if (onTransferDetailBottomModelListener2 != null) {
                                Intrinsics.e(view);
                                onTransferDetailBottomModelListener2.onRightClick(view);
                            }
                            break;
                    }
                }
            });
        }
        LinearLayout linearLayout2 = this.f33868a;
        if (linearLayout2 != null) {
            final int i11 = 1;
            linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: Gd.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TransferDetailBottomModel f3341b;

                {
                    this.f3341b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            TransferDetailBottomModel.OnTransferDetailBottomModelListener onTransferDetailBottomModelListener = this.f3341b.listener;
                            if (onTransferDetailBottomModelListener != null) {
                                Intrinsics.e(view);
                                onTransferDetailBottomModelListener.onLeftClick(view);
                            }
                            break;
                        default:
                            TransferDetailBottomModel.OnTransferDetailBottomModelListener onTransferDetailBottomModelListener2 = this.f3341b.listener;
                            if (onTransferDetailBottomModelListener2 != null) {
                                Intrinsics.e(view);
                                onTransferDetailBottomModelListener2.onRightClick(view);
                            }
                            break;
                    }
                }
            });
        }
    }
}
