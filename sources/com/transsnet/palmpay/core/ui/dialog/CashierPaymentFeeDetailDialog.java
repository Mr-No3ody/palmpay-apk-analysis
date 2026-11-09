package com.transsnet.palmpay.core.ui.dialog;

import Pa.r0;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.messaging.Constants;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.bean.cashier.PaymentFeeDetailBean;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.e;
import p142ja.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/core/ui/dialog/CashierPaymentFeeDetailDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "Landroid/view/View;", "v", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "Lcom/transsnet/palmpay/core/bean/cashier/PaymentFeeDetailBean;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "update", "(Lcom/transsnet/palmpay/core/bean/cashier/PaymentFeeDetailBean;)V", "Lja/g;", "binding", "Lja/g;", "LHa/a;", "mAdapter", "LHa/a;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CashierPaymentFeeDetailDialog extends b implements View.OnClickListener {

    @Nullable
    private g binding;

    @Nullable
    private Ha.a mAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashierPaymentFeeDetailDialog(@NotNull Context context) {
        super(context, p025ba.g.core_layout_payment_fee_detail_dialog, w.BaseDialogTheme);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        View viewFindViewById = findViewById(e.viewRoot);
        int i7 = e.feeList;
        RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewFindViewById);
        if (recyclerView != null) {
            i7 = e.ivClose;
            IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewFindViewById);
            if (iconicsImageView != null) {
                i7 = e.tvConfirm;
                TextView textView = (TextView) p059e1.a.m(i7, viewFindViewById);
                if (textView != null) {
                    i7 = e.tvTitle;
                    TextView textView2 = (TextView) p059e1.a.m(i7, viewFindViewById);
                    if (textView2 != null) {
                        i7 = e.tvTotalAmount;
                        TextView textView3 = (TextView) p059e1.a.m(i7, viewFindViewById);
                        if (textView3 != null) {
                            i7 = e.tvTotalName;
                            TextView textView4 = (TextView) p059e1.a.m(i7, viewFindViewById);
                            if (textView4 != null) {
                                this.binding = new g((ConstraintLayout) viewFindViewById, recyclerView, iconicsImageView, textView, textView2, textView3, textView4);
                                this.mAdapter = new Ha.a(p025ba.g.core_layout_fee_detail_item, null);
                                g gVar = this.binding;
                                if (gVar != null) {
                                    gVar.f38470b.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                                }
                                g gVar2 = this.binding;
                                if (gVar2 != null) {
                                    gVar2.f38470b.setAdapter(this.mAdapter);
                                }
                                g gVar3 = this.binding;
                                if (gVar3 != null) {
                                    gVar3.f38471c.setOnClickListener(this);
                                }
                                g gVar4 = this.binding;
                                if (gVar4 != null) {
                                    gVar4.f38472d.setOnClickListener(this);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v3) {
        dismiss();
    }

    public final void update(@Nullable PaymentFeeDetailBean data) {
        TextView textView;
        if (data != null) {
            Ha.a aVar = this.mAdapter;
            if (aVar != null) {
                aVar.setList(data.getDetail());
            }
            g gVar = this.binding;
            if (gVar == null || (textView = gVar.f38474f) == null) {
                return;
            }
            Long totalAmount = data.getTotalAmount();
            textView.setText(r0.B(totalAmount != null ? totalAmount.longValue() : 0L, false));
        }
    }
}
