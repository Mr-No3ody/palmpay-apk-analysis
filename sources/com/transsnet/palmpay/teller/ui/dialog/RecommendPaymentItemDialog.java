package com.transsnet.palmpay.teller.ui.dialog;

import Pa.r0;
import Pd.c;
import Pd.d;
import Pd.f;
import Rd.Y;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.core.callback.CompleteCallback;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.teller.bean.PaymentItemBean;
import com.transsnet.palmpay.teller.ui.dialog.RecommendPaymentItemDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p059e1.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/dialog/RecommendPaymentItemDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "layoutId", "(Landroid/content/Context;I)V", "styleId", "(Landroid/content/Context;II)V", "", "initViews", "()V", "Lcom/transsnet/palmpay/teller/bean/PaymentItemBean;", "item", "setPaymentItem", "(Lcom/transsnet/palmpay/teller/bean/PaymentItemBean;)V", "LRd/Y;", "binding", "LRd/Y;", "Lcom/transsnet/palmpay/core/callback/CompleteCallback;", "completeCallback", "Lcom/transsnet/palmpay/core/callback/CompleteCallback;", "getCompleteCallback", "()Lcom/transsnet/palmpay/core/callback/CompleteCallback;", "setCompleteCallback", "(Lcom/transsnet/palmpay/core/callback/CompleteCallback;)V", "mPaymentItemBean", "Lcom/transsnet/palmpay/teller/bean/PaymentItemBean;", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RecommendPaymentItemDialog extends b {

    @Nullable
    private Y binding;

    @Nullable
    private CompleteCallback<PaymentItemBean> completeCallback;

    @Nullable
    private PaymentItemBean mPaymentItemBean;

    public RecommendPaymentItemDialog(@Nullable Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(RecommendPaymentItemDialog recommendPaymentItemDialog, View view) {
        CompleteCallback<PaymentItemBean> completeCallback = recommendPaymentItemDialog.completeCallback;
        if (completeCallback != null) {
            completeCallback.onComplete(recommendPaymentItemDialog.mPaymentItemBean);
        }
        recommendPaymentItemDialog.dismiss();
    }

    @Nullable
    public final CompleteCallback<PaymentItemBean> getCompleteCallback() {
        return this.completeCallback;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(d.qt_dialog_recommend_payment_item);
        View viewFindViewById = findViewById(c.viewRoot);
        int i7 = c.ivClose;
        ImageView imageView = (ImageView) a.m(i7, viewFindViewById);
        if (imageView != null) {
            i7 = c.tvAmount;
            TextView textView = (TextView) a.m(i7, viewFindViewById);
            if (textView != null) {
                i7 = c.tvBillerName;
                TextView textView2 = (TextView) a.m(i7, viewFindViewById);
                if (textView2 != null) {
                    i7 = c.tvConfirm;
                    TextView textView3 = (TextView) a.m(i7, viewFindViewById);
                    if (textView3 != null) {
                        i7 = c.tvPaymentName;
                        TextView textView4 = (TextView) a.m(i7, viewFindViewById);
                        if (textView4 != null) {
                            FrameLayout frameLayout = (FrameLayout) viewFindViewById;
                            this.binding = new Y(frameLayout, imageView, textView, textView2, textView3, textView4, frameLayout);
                            final int i10 = 0;
                            textView3.setOnClickListener(new View.OnClickListener(this) { // from class: Yd.t

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ RecommendPaymentItemDialog f11370b;

                                {
                                    this.f11370b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i10) {
                                        case 0:
                                            RecommendPaymentItemDialog.initViews$lambda$0(this.f11370b, view);
                                            break;
                                        default:
                                            this.f11370b.dismiss();
                                            break;
                                    }
                                }
                            });
                            Y y8 = this.binding;
                            if (y8 != null) {
                                final int i11 = 1;
                                y8.f8181b.setOnClickListener(new View.OnClickListener(this) { // from class: Yd.t

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ RecommendPaymentItemDialog f11370b;

                                    {
                                        this.f11370b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i11) {
                                            case 0:
                                                RecommendPaymentItemDialog.initViews$lambda$0(this.f11370b, view);
                                                break;
                                            default:
                                                this.f11370b.dismiss();
                                                break;
                                        }
                                    }
                                });
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }

    public final void setCompleteCallback(@Nullable CompleteCallback<PaymentItemBean> completeCallback) {
        this.completeCallback = completeCallback;
    }

    public final void setPaymentItem(@NotNull PaymentItemBean item) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        Intrinsics.checkNotNullParameter(item, "item");
        this.mPaymentItemBean = item;
        Y y8 = this.binding;
        if (y8 != null && (textView3 = y8.f8183d) != null) {
            textView3.setText(item.billerName);
        }
        Y y10 = this.binding;
        if (y10 != null && (textView2 = y10.f8185f) != null) {
            textView2.setText(item.paymentItemName);
        }
        Y y11 = this.binding;
        if (y11 == null || (textView = y11.f8182c) == null) {
            return;
        }
        long j6 = item.amount;
        textView.setText(j6 > 0 ? r0.B(j6, false) : this.mContext.getString(f.qt_fill_amount));
    }

    public RecommendPaymentItemDialog(@Nullable Context context, int i7) {
        super(context, i7);
    }

    public RecommendPaymentItemDialog(@Nullable Context context, int i7, int i10) {
        super(context, i7, i10);
    }
}
