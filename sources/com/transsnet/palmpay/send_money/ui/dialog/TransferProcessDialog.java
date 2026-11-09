package com.transsnet.palmpay.send_money.ui.dialog;

import Ad.a0;
import android.content.Context;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.BillProcessData2;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.bean.BillProcessTitleData1;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.w;
import com.transsnet.palmpay.send_money.ui.dialog.TransferProcessDialog;
import com.transsnet.palmpay.send_money.ui.view.TransferToBankProgressModel;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.l;
import p159kd.e;
import p159kd.f;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/TransferProcessDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "changeDialogHeight", "()V", "initViews", "Lcom/transsnet/palmpay/core/bean/BillProcessDetail;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "fillData", "(Lcom/transsnet/palmpay/core/bean/BillProcessDetail;)V", "Landroidx/recyclerview/widget/RecyclerView;", "rv_status_progress$delegate", "Lkotlin/Lazy;", "getRv_status_progress", "()Landroidx/recyclerview/widget/RecyclerView;", "rv_status_progress", "Lcom/transsnet/palmpay/send_money/ui/view/TransferToBankProgressModel;", "v_progress$delegate", "getV_progress", "()Lcom/transsnet/palmpay/send_money/ui/view/TransferToBankProgressModel;", "v_progress", "Landroid/widget/ImageView;", "iv_close$delegate", "getIv_close", "()Landroid/widget/ImageView;", "iv_close", "LAd/a0;", "adapter$delegate", "getAdapter", "()LAd/a0;", "adapter", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransferProcessDialog extends b {

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter;

    /* JADX INFO: renamed from: iv_close$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy iv_close;

    /* JADX INFO: renamed from: rv_status_progress$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy rv_status_progress;

    /* JADX INFO: renamed from: v_progress$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy v_progress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferProcessDialog(@NotNull Context context) {
        super(context, f.sm_dialog_transfer_progress, w.BaseDialogTheme);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i7 = 0;
        this.rv_status_progress = C2131j.b(new Function0(this) { // from class: Ad.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferProcessDialog f197b;

            {
                this.f197b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return TransferProcessDialog.rv_status_progress_delegate$lambda$0(this.f197b);
                    case 1:
                        return TransferProcessDialog.v_progress_delegate$lambda$1(this.f197b);
                    default:
                        return TransferProcessDialog.iv_close_delegate$lambda$2(this.f197b);
                }
            }
        });
        final int i10 = 1;
        this.v_progress = C2131j.b(new Function0(this) { // from class: Ad.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferProcessDialog f197b;

            {
                this.f197b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return TransferProcessDialog.rv_status_progress_delegate$lambda$0(this.f197b);
                    case 1:
                        return TransferProcessDialog.v_progress_delegate$lambda$1(this.f197b);
                    default:
                        return TransferProcessDialog.iv_close_delegate$lambda$2(this.f197b);
                }
            }
        });
        final int i11 = 2;
        this.iv_close = C2131j.b(new Function0(this) { // from class: Ad.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferProcessDialog f197b;

            {
                this.f197b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return TransferProcessDialog.rv_status_progress_delegate$lambda$0(this.f197b);
                    case 1:
                        return TransferProcessDialog.v_progress_delegate$lambda$1(this.f197b);
                    default:
                        return TransferProcessDialog.iv_close_delegate$lambda$2(this.f197b);
                }
            }
        });
        this.adapter = C2131j.b(new Aa.a(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 adapter_delegate$lambda$3() {
        return new a0(f.sm_item_transfer_status_progress, null);
    }

    private final void changeDialogHeight() {
        Window window = getWindow();
        Intrinsics.e(window);
        window.setGravity(80);
        window.setWindowAnimations(l.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        attributes.height = -2;
        window.setAttributes(attributes);
    }

    private final a0 getAdapter() {
        return (a0) this.adapter.getValue();
    }

    private final ImageView getIv_close() {
        Object value = this.iv_close.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final RecyclerView getRv_status_progress() {
        Object value = this.rv_status_progress.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    private final TransferToBankProgressModel getV_progress() {
        Object value = this.v_progress.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TransferToBankProgressModel) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView iv_close_delegate$lambda$2(TransferProcessDialog transferProcessDialog) {
        return (ImageView) transferProcessDialog.findViewById(e.iv_close);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView rv_status_progress_delegate$lambda$0(TransferProcessDialog transferProcessDialog) {
        return (RecyclerView) transferProcessDialog.findViewById(e.rv_status_progress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransferToBankProgressModel v_progress_delegate$lambda$1(TransferProcessDialog transferProcessDialog) {
        return (TransferToBankProgressModel) transferProcessDialog.findViewById(e.v_progress);
    }

    public final void fillData(@Nullable BillProcessDetail data) {
        if (data != null) {
            TransferToBankProgressModel v_progress = getV_progress();
            List<BillProcessTitleData1> list = data.tips;
            int i7 = TransferToBankProgressModel.f33911i;
            v_progress.a(list, false);
            List<BillProcessData2> list2 = data.fullTips;
            if (list2 != null) {
                getAdapter().setList(list2);
            }
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        getIv_close().setOnClickListener(new A8.b(this, 8));
        getRv_status_progress().setLayoutManager(new LinearLayoutManager(getContext()));
        getRv_status_progress().setAdapter(getAdapter());
        changeDialogHeight();
    }
}
