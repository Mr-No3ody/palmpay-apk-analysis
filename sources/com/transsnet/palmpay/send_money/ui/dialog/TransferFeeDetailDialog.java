package com.transsnet.palmpay.send_money.ui.dialog;

import Ad.Y;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.w;
import com.transsnet.palmpay.send_money.bean.TradeRecordDetailResp;
import com.transsnet.palmpay.send_money.ui.dialog.TransferFeeDetailDialog;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159kd.e;
import p159kd.f;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\"B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/TransferFeeDetailDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "Landroid/view/View;", "v", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "Lcom/transsnet/palmpay/send_money/bean/TradeRecordDetailResp$RecordDetail$TransferTax;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "update", "(Lcom/transsnet/palmpay/send_money/bean/TradeRecordDetailResp$RecordDetail$TransferTax;)V", "Landroid/widget/TextView;", "tvConfirm$delegate", "Lkotlin/Lazy;", "getTvConfirm", "()Landroid/widget/TextView;", "tvConfirm", "Landroidx/recyclerview/widget/RecyclerView;", "feeList$delegate", "getFeeList", "()Landroidx/recyclerview/widget/RecyclerView;", "feeList", "Landroid/widget/ImageView;", "ivClose$delegate", "getIvClose", "()Landroid/widget/ImageView;", "ivClose", "LAd/Y;", "mAdapter", "LAd/Y;", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransferFeeDetailDialog extends b implements View.OnClickListener {

    /* JADX INFO: renamed from: feeList$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy feeList;

    /* JADX INFO: renamed from: ivClose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivClose;

    @Nullable
    private Y mAdapter;

    /* JADX INFO: renamed from: tvConfirm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvConfirm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferFeeDetailDialog(@NotNull Context context) {
        super(context, f.sm_dialog_transfer_fee_detail, w.BaseDialogTheme);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i7 = 0;
        this.tvConfirm = C2131j.b(new Function0(this) { // from class: Ad.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferFeeDetailDialog f195b;

            {
                this.f195b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return TransferFeeDetailDialog.tvConfirm_delegate$lambda$0(this.f195b);
                    case 1:
                        return TransferFeeDetailDialog.feeList_delegate$lambda$1(this.f195b);
                    default:
                        return TransferFeeDetailDialog.ivClose_delegate$lambda$2(this.f195b);
                }
            }
        });
        final int i10 = 1;
        this.feeList = C2131j.b(new Function0(this) { // from class: Ad.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferFeeDetailDialog f195b;

            {
                this.f195b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return TransferFeeDetailDialog.tvConfirm_delegate$lambda$0(this.f195b);
                    case 1:
                        return TransferFeeDetailDialog.feeList_delegate$lambda$1(this.f195b);
                    default:
                        return TransferFeeDetailDialog.ivClose_delegate$lambda$2(this.f195b);
                }
            }
        });
        final int i11 = 2;
        this.ivClose = C2131j.b(new Function0(this) { // from class: Ad.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferFeeDetailDialog f195b;

            {
                this.f195b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return TransferFeeDetailDialog.tvConfirm_delegate$lambda$0(this.f195b);
                    case 1:
                        return TransferFeeDetailDialog.feeList_delegate$lambda$1(this.f195b);
                    default:
                        return TransferFeeDetailDialog.ivClose_delegate$lambda$2(this.f195b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView feeList_delegate$lambda$1(TransferFeeDetailDialog transferFeeDetailDialog) {
        return (RecyclerView) transferFeeDetailDialog.findViewById(e.feeList);
    }

    private final RecyclerView getFeeList() {
        Object value = this.feeList.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    private final ImageView getIvClose() {
        Object value = this.ivClose.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final TextView getTvConfirm() {
        Object value = this.tvConfirm.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivClose_delegate$lambda$2(TransferFeeDetailDialog transferFeeDetailDialog) {
        return (ImageView) transferFeeDetailDialog.findViewById(e.ivClose);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvConfirm_delegate$lambda$0(TransferFeeDetailDialog transferFeeDetailDialog) {
        return (TextView) transferFeeDetailDialog.findViewById(e.tvConfirm);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        this.mAdapter = new Y(f.sm_item_fee_detail, null);
        getFeeList().setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        getFeeList().setAdapter(this.mAdapter);
        getIvClose().setOnClickListener(this);
        getTvConfirm().setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v3) {
        dismiss();
    }

    public final void update(@Nullable TradeRecordDetailResp.RecordDetail.TransferTax data) {
        if (data != null) {
            ((TextView) findViewById(e.tvTitle)).setText(data.getSubTaxTitle());
            Y y8 = this.mAdapter;
            if (y8 != null) {
                y8.setList(data.getSubTaxList());
            }
        }
    }
}
