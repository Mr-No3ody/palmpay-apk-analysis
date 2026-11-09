package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLBorrowDateDisableDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "Landroid/widget/TextView;", "continue_loan_tv$delegate", "Lkotlin/Lazy;", "getContinue_loan_tv", "()Landroid/widget/TextView;", "continue_loan_tv", "extend_content_tv$delegate", "getExtend_content_tv", "extend_content_tv", "Landroid/widget/ImageView;", "keep_repaying_close_img$delegate", "getKeep_repaying_close_img", "()Landroid/widget/ImageView;", "keep_repaying_close_img", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLBorrowDateDisableDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    /* JADX INFO: renamed from: continue_loan_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy continue_loan_tv;

    /* JADX INFO: renamed from: extend_content_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy extend_content_tv;

    /* JADX INFO: renamed from: keep_repaying_close_img$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy keep_repaying_close_img;

    public CLBorrowDateDisableDialog(@Nullable Context context) {
        super(context, Ya.f.cs_cl_borrow_date_disable_dialog_layout);
        final int i7 = 0;
        this.continue_loan_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowDateDisableDialog f30126b;

            {
                this.f30126b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return CLBorrowDateDisableDialog.continue_loan_tv_delegate$lambda$0(this.f30126b);
                    case 1:
                        return CLBorrowDateDisableDialog.extend_content_tv_delegate$lambda$1(this.f30126b);
                    default:
                        return CLBorrowDateDisableDialog.keep_repaying_close_img_delegate$lambda$2(this.f30126b);
                }
            }
        });
        final int i10 = 1;
        this.extend_content_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowDateDisableDialog f30126b;

            {
                this.f30126b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return CLBorrowDateDisableDialog.continue_loan_tv_delegate$lambda$0(this.f30126b);
                    case 1:
                        return CLBorrowDateDisableDialog.extend_content_tv_delegate$lambda$1(this.f30126b);
                    default:
                        return CLBorrowDateDisableDialog.keep_repaying_close_img_delegate$lambda$2(this.f30126b);
                }
            }
        });
        final int i11 = 2;
        this.keep_repaying_close_img = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowDateDisableDialog f30126b;

            {
                this.f30126b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return CLBorrowDateDisableDialog.continue_loan_tv_delegate$lambda$0(this.f30126b);
                    case 1:
                        return CLBorrowDateDisableDialog.extend_content_tv_delegate$lambda$1(this.f30126b);
                    default:
                        return CLBorrowDateDisableDialog.keep_repaying_close_img_delegate$lambda$2(this.f30126b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView continue_loan_tv_delegate$lambda$0(CLBorrowDateDisableDialog cLBorrowDateDisableDialog) {
        return (TextView) cLBorrowDateDisableDialog.findViewById(Ya.e.continue_loan_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView extend_content_tv_delegate$lambda$1(CLBorrowDateDisableDialog cLBorrowDateDisableDialog) {
        return (TextView) cLBorrowDateDisableDialog.findViewById(Ya.e.extend_content_tv);
    }

    private final TextView getContinue_loan_tv() {
        return (TextView) this.continue_loan_tv.getValue();
    }

    private final TextView getExtend_content_tv() {
        return (TextView) this.extend_content_tv.getValue();
    }

    private final ImageView getKeep_repaying_close_img() {
        return (ImageView) this.keep_repaying_close_img.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView keep_repaying_close_img_delegate$lambda$2(CLBorrowDateDisableDialog cLBorrowDateDisableDialog) {
        return (ImageView) cLBorrowDateDisableDialog.findViewById(Ya.e.keep_repaying_close_img);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        TextView extend_content_tv = getExtend_content_tv();
        if (extend_content_tv != null) {
            C0.G.w(this.mContext, L6.b.ppColorTextPrimary, com.horcrux.svg.d0.i(this.mContext, Ya.b.cs_cl_main_color, com.horcrux.svg.d0.i(this.mContext, L6.b.ppColorTextPrimary, C0.G.i("Please keep"), " repaying on time"), " to extend the loan period"), extend_content_tv);
        }
        ImageView keep_repaying_close_img = getKeep_repaying_close_img();
        if (keep_repaying_close_img != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.h

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLBorrowDateDisableDialog f30120b;

                {
                    this.f30120b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f30120b.dismiss();
                            break;
                        default:
                            this.f30120b.dismiss();
                            break;
                    }
                }
            }, keep_repaying_close_img);
        }
        TextView continue_loan_tv = getContinue_loan_tv();
        if (continue_loan_tv != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.h

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLBorrowDateDisableDialog f30120b;

                {
                    this.f30120b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f30120b.dismiss();
                            break;
                        default:
                            this.f30120b.dismiss();
                            break;
                    }
                }
            }, continue_loan_tv);
        }
    }
}
