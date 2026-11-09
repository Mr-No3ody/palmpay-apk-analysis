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
import com.transsnet.palmpay.core.bean.cashier.CashierTaxDetailBean;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.e;
import p025ba.g;
import p142ja.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/core/ui/dialog/CashierPaymentTaxDetailDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "Landroid/view/View;", "v", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "Lcom/transsnet/palmpay/core/bean/cashier/CashierTaxDetailBean;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "update", "(Lcom/transsnet/palmpay/core/bean/cashier/CashierTaxDetailBean;)V", "Lja/h;", "binding", "Lja/h;", "LHa/b;", "mAdapter", "LHa/b;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CashierPaymentTaxDetailDialog extends b implements View.OnClickListener {

    @Nullable
    private h binding;

    @Nullable
    private Ha.b mAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashierPaymentTaxDetailDialog(@NotNull Context context) {
        super(context, g.core_layout_payment_tax_detail_dialog, w.BaseDialogTheme);
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
                                this.binding = new h((ConstraintLayout) viewFindViewById, recyclerView, iconicsImageView, textView, textView2, textView3, textView4);
                                this.mAdapter = new Ha.b(g.core_layout_tax_detail_item, null);
                                h hVar = this.binding;
                                if (hVar != null) {
                                    hVar.f38477b.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                                }
                                h hVar2 = this.binding;
                                if (hVar2 != null) {
                                    hVar2.f38477b.setAdapter(this.mAdapter);
                                }
                                h hVar3 = this.binding;
                                if (hVar3 != null) {
                                    hVar3.f38478c.setOnClickListener(this);
                                }
                                h hVar4 = this.binding;
                                if (hVar4 != null) {
                                    hVar4.f38479d.setOnClickListener(this);
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

    public final void update(@Nullable CashierTaxDetailBean data) {
        TextView textView;
        if (data != null) {
            Ha.b bVar = this.mAdapter;
            if (bVar != null) {
                List<CashierTaxDetailBean.TaxDetail> payerTaxDetails = data.getPayerTaxDetails();
                bVar.setList(payerTaxDetails != null ? payerTaxDetails : new ArrayList<>());
            }
            h hVar = this.binding;
            if (hVar == null || (textView = hVar.f38481f) == null) {
                return;
            }
            Long totalPayerTax = data.getTotalPayerTax();
            textView.setText(r0.B(totalPayerTax != null ? totalPayerTax.longValue() : 0L, false));
        }
    }
}
