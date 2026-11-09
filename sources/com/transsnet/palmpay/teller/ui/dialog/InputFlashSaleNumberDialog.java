package com.transsnet.palmpay.teller.ui.dialog;

import C0.G;
import Pa.r0;
import Pd.c;
import Pd.d;
import Rd.W;
import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.palmpay.core.bean.RecommendedItem;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.callback.CompleteCallback;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.v;
import com.transsnet.palmpay.teller.ui.dialog.InputFlashSaleNumberDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p059e1.a;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\tJ1\u0010\u001d\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\u001f\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b!\u0010\"R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010'¨\u0006("}, d2 = {"Lcom/transsnet/palmpay/teller/ui/dialog/InputFlashSaleNumberDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/text/TextWatcher;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "", "initViews", "()V", "Lcom/transsnet/palmpay/core/callback/CompleteCallback;", "", "callback", "setCallback", "(Lcom/transsnet/palmpay/core/callback/CompleteCallback;)V", "mobile", "updateMobile", "(Ljava/lang/String;)V", "Lcom/transsnet/palmpay/core/bean/RecommendedItem;", "item", "updateUi", "(Lcom/transsnet/palmpay/core/bean/RecommendedItem;)V", "show", "", "p0", "", "p1", TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW, "p3", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "Landroid/app/Activity;", "LRd/W;", "binding", "LRd/W;", "Lcom/transsnet/palmpay/core/callback/CompleteCallback;", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InputFlashSaleNumberDialog extends b implements TextWatcher {

    @NotNull
    private Activity activity;

    @Nullable
    private W binding;

    @Nullable
    private CompleteCallback<String> callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputFlashSaleNumberDialog(@NotNull Activity activity) {
        super(activity, d.qt_dialog_input_flash_sale_number);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(InputFlashSaleNumberDialog inputFlashSaleNumberDialog, View view) {
        inputFlashSaleNumberDialog.dismiss();
        inputFlashSaleNumberDialog.activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(InputFlashSaleNumberDialog inputFlashSaleNumberDialog, View view) {
        W w3 = inputFlashSaleNumberDialog.binding;
        String mobileNumber = w3 != null ? w3.f8167c.getMobileNumber() : null;
        if (r0.b1(mobileNumber)) {
            CompleteCallback<String> completeCallback = inputFlashSaleNumberDialog.callback;
            if (completeCallback != null) {
                completeCallback.onComplete(mobileNumber);
            }
            inputFlashSaleNumberDialog.dismiss();
            return;
        }
        W w6 = inputFlashSaleNumberDialog.binding;
        if (w6 != null) {
            w6.f8167c.setBottomText(h.B(CommonViewExtKt.string(v.cv_msg_enter_recipient_mobile_number, inputFlashSaleNumberDialog.mContext), null, null, Integer.valueOf(L6.b.ppColorError), null, null, null, 1019));
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable p3) {
        PpButton ppButton;
        PpFormVertical ppFormVertical;
        String editContent;
        W w3 = this.binding;
        if (w3 == null || (ppButton = w3.f8166b) == null) {
            return;
        }
        ppButton.setEnabled(((w3 == null || (ppFormVertical = w3.f8167c) == null || (editContent = ppFormVertical.getEditContent()) == null) ? 0 : editContent.length()) > 0);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence p3, int p10, int p11, int p12) {
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        View viewFindViewById = findViewById(c.viewRoot);
        int i7 = c.btnConfirm;
        PpButton ppButton = (PpButton) a.m(i7, viewFindViewById);
        if (ppButton != null) {
            i7 = c.inputMobile;
            PpFormVertical ppFormVertical = (PpFormVertical) a.m(i7, viewFindViewById);
            if (ppFormVertical != null) {
                i7 = c.ivClose;
                IconicsImageView iconicsImageView = (IconicsImageView) a.m(i7, viewFindViewById);
                if (iconicsImageView != null) {
                    i7 = c.ivIcon;
                    ImageView imageView = (ImageView) a.m(i7, viewFindViewById);
                    if (imageView != null) {
                        i7 = c.tvAmount1;
                        TextView textView = (TextView) a.m(i7, viewFindViewById);
                        if (textView != null) {
                            i7 = c.tvAmount2;
                            TextView textView2 = (TextView) a.m(i7, viewFindViewById);
                            if (textView2 != null) {
                                i7 = c.tvDiscount;
                                TextView textView3 = (TextView) a.m(i7, viewFindViewById);
                                if (textView3 != null) {
                                    i7 = c.tvMsg;
                                    TextView textView4 = (TextView) a.m(i7, viewFindViewById);
                                    if (textView4 != null) {
                                        i7 = c.tvName;
                                        TextView textView5 = (TextView) a.m(i7, viewFindViewById);
                                        if (textView5 != null) {
                                            i7 = c.tvTime;
                                            TextView textView6 = (TextView) a.m(i7, viewFindViewById);
                                            if (textView6 != null) {
                                                i7 = c.viewContainer;
                                                if (((CardView) a.m(i7, viewFindViewById)) != null) {
                                                    this.binding = new W((ConstraintLayout) viewFindViewById, ppButton, ppFormVertical, iconicsImageView, imageView, textView, textView2, textView3, textView4, textView5, textView6);
                                                    final int i10 = 0;
                                                    iconicsImageView.setOnClickListener(new View.OnClickListener(this) { // from class: Yd.k

                                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                        public final /* synthetic */ InputFlashSaleNumberDialog f11342b;

                                                        {
                                                            this.f11342b = this;
                                                        }

                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            switch (i10) {
                                                                case 0:
                                                                    InputFlashSaleNumberDialog.initViews$lambda$0(this.f11342b, view);
                                                                    break;
                                                                default:
                                                                    InputFlashSaleNumberDialog.initViews$lambda$1(this.f11342b, view);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    W w3 = this.binding;
                                                    if (w3 != null) {
                                                        final int i11 = 1;
                                                        w3.f8166b.setOnClickListener(new View.OnClickListener(this) { // from class: Yd.k

                                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                            public final /* synthetic */ InputFlashSaleNumberDialog f11342b;

                                                            {
                                                                this.f11342b = this;
                                                            }

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                switch (i11) {
                                                                    case 0:
                                                                        InputFlashSaleNumberDialog.initViews$lambda$0(this.f11342b, view);
                                                                        break;
                                                                    default:
                                                                        InputFlashSaleNumberDialog.initViews$lambda$1(this.f11342b, view);
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                    }
                                                    W w6 = this.binding;
                                                    if (w6 != null) {
                                                        w6.f8167c.setEditTextWatcher(this);
                                                    }
                                                    W w10 = this.binding;
                                                    if (w10 != null) {
                                                        w10.f8167c.setCountryCodeText("+234");
                                                    }
                                                    W w11 = this.binding;
                                                    if (w11 != null) {
                                                        w11.f8167c.f24415j.setVisibility(8);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence p3, int p10, int p11, int p12) {
    }

    public final void setCallback(@NotNull CompleteCallback<String> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        if (isShowing()) {
            return;
        }
        super.show();
    }

    public final void updateMobile(@Nullable String mobile) {
        PpFormVertical ppFormVertical;
        W w3 = this.binding;
        if (w3 == null || (ppFormVertical = w3.f8167c) == null) {
            return;
        }
        ppFormVertical.setEditContent(r0.w0(mobile));
    }

    public final void updateUi(@Nullable RecommendedItem item) {
        if (item != null) {
            W w3 = this.binding;
            if (w3 != null) {
                w3.f8173j.setText(item.volume);
            }
            W w6 = this.binding;
            if (w6 != null) {
                G.x("/", item.validity, w6.f8174o);
            }
            W w10 = this.binding;
            if (w10 != null) {
                w10.f8171g.setText(item.discountInfo);
            }
            W w11 = this.binding;
            if (w11 != null) {
                w11.f8172i.setText(item.description);
            }
            W w12 = this.binding;
            r0.h1(w12 != null ? w12.f8168d : null, item.billerIcon, r.cv_default_palmpay_icon_gray);
            W w13 = this.binding;
            if (w13 != null) {
                TextView textView = w13.f8169e;
                Long l5 = item.discountPackageAmount;
                textView.setText(r0.M(12, 16, l5 != null ? l5.longValue() : 0L));
            }
            W w14 = this.binding;
            if (w14 != null) {
                TextView textView2 = w14.f8170f;
                textView2.getPaint().setStrikeThruText(true);
                Long l6 = item.price;
                textView2.setText(r0.B(l6 != null ? l6.longValue() : 0L, false));
            }
        }
    }
}
