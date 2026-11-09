package com.transsnet.palmpay.cash_in.ui.dialog;

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
import com.transsnet.palmpay.cash_in.bean.SubTaxItem;
import com.transsnet.palmpay.cash_in.bean.TaxItem;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p366y9.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0015B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/cash_in/ui/dialog/CashInTaxDetailDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "Landroid/view/View;", "v", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "Lcom/transsnet/palmpay/cash_in/bean/TaxItem;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "update", "(Lcom/transsnet/palmpay/cash_in/bean/TaxItem;)V", "Lz9/a;", "binding", "Lz9/a;", "LF9/a;", "mAdapter", "LF9/a;", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CashInTaxDetailDialog extends b implements View.OnClickListener {

    @Nullable
    private p380z9.a binding;

    @Nullable
    private F9.a mAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashInTaxDetailDialog(@NotNull Context context) {
        super(context, c.ci_layout_cash_in_tax_detail_dialog, w.BaseDialogTheme);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        View viewFindViewById = findViewById(p366y9.b.viewRoot);
        int i7 = p366y9.b.feeList;
        RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewFindViewById);
        if (recyclerView != null) {
            i7 = p366y9.b.ivClose;
            IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewFindViewById);
            if (iconicsImageView != null) {
                i7 = p366y9.b.tvConfirm;
                TextView textView = (TextView) p059e1.a.m(i7, viewFindViewById);
                if (textView != null) {
                    i7 = p366y9.b.tvTitle;
                    TextView textView2 = (TextView) p059e1.a.m(i7, viewFindViewById);
                    if (textView2 != null) {
                        i7 = p366y9.b.tvTotalAmount;
                        TextView textView3 = (TextView) p059e1.a.m(i7, viewFindViewById);
                        if (textView3 != null) {
                            i7 = p366y9.b.tvTotalName;
                            TextView textView4 = (TextView) p059e1.a.m(i7, viewFindViewById);
                            if (textView4 != null) {
                                this.binding = new p380z9.a((ConstraintLayout) viewFindViewById, recyclerView, iconicsImageView, textView, textView2, textView3, textView4);
                                this.mAdapter = new F9.a(c.ci_layout_cash_in_tax_detail_item, null);
                                p380z9.a aVar = this.binding;
                                if (aVar != null) {
                                    aVar.f44508b.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                                }
                                p380z9.a aVar2 = this.binding;
                                if (aVar2 != null) {
                                    aVar2.f44508b.setAdapter(this.mAdapter);
                                }
                                p380z9.a aVar3 = this.binding;
                                if (aVar3 != null) {
                                    aVar3.f44509c.setOnClickListener(this);
                                }
                                p380z9.a aVar4 = this.binding;
                                if (aVar4 != null) {
                                    aVar4.f44510d.setOnClickListener(this);
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

    public final void update(@Nullable TaxItem data) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        if (data != null) {
            F9.a aVar = this.mAdapter;
            if (aVar != null) {
                List<SubTaxItem> subFeeList = data.getSubFeeList();
                aVar.setList(subFeeList != null ? subFeeList : new ArrayList<>());
            }
            p380z9.a aVar2 = this.binding;
            if (aVar2 != null && (textView3 = aVar2.f44512f) != null) {
                Long subTotalFee = data.getSubTotalFee();
                textView3.setText(r0.B(subTotalFee != null ? subTotalFee.longValue() : 0L, false));
            }
            p380z9.a aVar3 = this.binding;
            if (aVar3 != null && (textView2 = aVar3.f44511e) != null) {
                String subTotalFeeTitle = data.getSubTotalFeeTitle();
                if (subTotalFeeTitle == null) {
                    subTotalFeeTitle = "";
                }
                textView2.setText(subTotalFeeTitle);
            }
            p380z9.a aVar4 = this.binding;
            if (aVar4 == null || (textView = aVar4.f44513g) == null) {
                return;
            }
            String subTotalFeeName = data.getSubTotalFeeName();
            textView.setText(subTotalFeeName != null ? subTotalFeeName : "");
        }
    }
}
