package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLInterestDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "mContent", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "", "initViews", "()V", "Ljava/lang/String;", "Landroid/widget/Button;", "interest_ok_bt$delegate", "Lkotlin/Lazy;", "getInterest_ok_bt", "()Landroid/widget/Button;", "interest_ok_bt", "Landroid/widget/TextView;", "interest_desc_content_tv$delegate", "getInterest_desc_content_tv", "()Landroid/widget/TextView;", "interest_desc_content_tv", "Landroid/widget/ImageView;", "interest_close_img$delegate", "getInterest_close_img", "()Landroid/widget/ImageView;", "interest_close_img", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLInterestDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    /* JADX INFO: renamed from: interest_close_img$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy interest_close_img;

    /* JADX INFO: renamed from: interest_desc_content_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy interest_desc_content_tv;

    /* JADX INFO: renamed from: interest_ok_bt$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy interest_ok_bt;

    @Nullable
    private final String mContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CLInterestDialog(@NotNull Context context, @Nullable String str) {
        super(context, Ya.f.cs_cl_interest_dialog_layout);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mContent = str;
        final int i7 = 0;
        this.interest_ok_bt = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.G

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInterestDialog f29973b;

            {
                this.f29973b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return CLInterestDialog.interest_ok_bt_delegate$lambda$0(this.f29973b);
                    case 1:
                        return CLInterestDialog.interest_desc_content_tv_delegate$lambda$1(this.f29973b);
                    default:
                        return CLInterestDialog.interest_close_img_delegate$lambda$2(this.f29973b);
                }
            }
        });
        final int i10 = 1;
        this.interest_desc_content_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.G

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInterestDialog f29973b;

            {
                this.f29973b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return CLInterestDialog.interest_ok_bt_delegate$lambda$0(this.f29973b);
                    case 1:
                        return CLInterestDialog.interest_desc_content_tv_delegate$lambda$1(this.f29973b);
                    default:
                        return CLInterestDialog.interest_close_img_delegate$lambda$2(this.f29973b);
                }
            }
        });
        final int i11 = 2;
        this.interest_close_img = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.G

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInterestDialog f29973b;

            {
                this.f29973b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return CLInterestDialog.interest_ok_bt_delegate$lambda$0(this.f29973b);
                    case 1:
                        return CLInterestDialog.interest_desc_content_tv_delegate$lambda$1(this.f29973b);
                    default:
                        return CLInterestDialog.interest_close_img_delegate$lambda$2(this.f29973b);
                }
            }
        });
    }

    private final ImageView getInterest_close_img() {
        return (ImageView) this.interest_close_img.getValue();
    }

    private final TextView getInterest_desc_content_tv() {
        return (TextView) this.interest_desc_content_tv.getValue();
    }

    private final Button getInterest_ok_bt() {
        return (Button) this.interest_ok_bt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView interest_close_img_delegate$lambda$2(CLInterestDialog cLInterestDialog) {
        return (ImageView) cLInterestDialog.findViewById(Ya.e.interest_close_img);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView interest_desc_content_tv_delegate$lambda$1(CLInterestDialog cLInterestDialog) {
        return (TextView) cLInterestDialog.findViewById(Ya.e.interest_desc_content_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button interest_ok_bt_delegate$lambda$0(CLInterestDialog cLInterestDialog) {
        return (Button) cLInterestDialog.findViewById(Ya.e.interest_ok_bt);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        TextView interest_desc_content_tv = getInterest_desc_content_tv();
        if (interest_desc_content_tv != null) {
            interest_desc_content_tv.setText(this.mContent);
        }
        ImageView interest_close_img = getInterest_close_img();
        if (interest_close_img != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.F

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLInterestDialog f29967b;

                {
                    this.f29967b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f29967b.dismiss();
                            break;
                        default:
                            this.f29967b.dismiss();
                            break;
                    }
                }
            }, interest_close_img);
        }
        Button interest_ok_bt = getInterest_ok_bt();
        if (interest_ok_bt != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.F

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLInterestDialog f29967b;

                {
                    this.f29967b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f29967b.dismiss();
                            break;
                        default:
                            this.f29967b.dismiss();
                            break;
                    }
                }
            }, interest_ok_bt);
        }
    }
}
