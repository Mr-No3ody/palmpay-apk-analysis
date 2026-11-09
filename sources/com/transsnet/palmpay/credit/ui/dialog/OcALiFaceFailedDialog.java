package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\"\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u001d\u0010%\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010\u0019R\u001d\u0010(\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010\u0019R\u001d\u0010-\u001a\u0004\u0018\u00010)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0017\u001a\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010/¨\u00061"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/OcALiFaceFailedDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "leftBtText", "rightBtText", "title", FirebaseAnalytics.Param.CONTENT, "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "setListener", "()V", "initViews", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setLeftListener", "(Landroid/view/View$OnClickListener;)V", "setRightListener", "Ljava/lang/String;", "Landroid/widget/TextView;", "right_tv$delegate", "Lkotlin/Lazy;", "getRight_tv", "()Landroid/widget/TextView;", "right_tv", "Landroid/view/View;", "divider_view$delegate", "getDivider_view", "()Landroid/view/View;", "divider_view", "left_tv$delegate", "getLeft_tv", "left_tv", "failed_content_tv$delegate", "getFailed_content_tv", "failed_content_tv", "failed_title_tv$delegate", "getFailed_title_tv", "failed_title_tv", "Landroid/widget/ImageView;", "ivClose$delegate", "getIvClose", "()Landroid/widget/ImageView;", "ivClose", "leftListener", "Landroid/view/View$OnClickListener;", "rightListener", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcALiFaceFailedDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @Nullable
    private final String content;

    /* JADX INFO: renamed from: divider_view$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy divider_view;

    /* JADX INFO: renamed from: failed_content_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy failed_content_tv;

    /* JADX INFO: renamed from: failed_title_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy failed_title_tv;

    /* JADX INFO: renamed from: ivClose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivClose;

    @Nullable
    private final String leftBtText;

    @Nullable
    private View.OnClickListener leftListener;

    /* JADX INFO: renamed from: left_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy left_tv;

    @Nullable
    private final String rightBtText;

    @Nullable
    private View.OnClickListener rightListener;

    /* JADX INFO: renamed from: right_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy right_tv;

    @Nullable
    private final String title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcALiFaceFailedDialog(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        super(context, Ya.f.cs_oc_ali_face_failed_dialog_layout);
        Intrinsics.checkNotNullParameter(context, "context");
        this.leftBtText = str;
        this.rightBtText = str2;
        this.title = str3;
        this.content = str4;
        final int i7 = 0;
        this.right_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcALiFaceFailedDialog f30185b;

            {
                this.f30185b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return OcALiFaceFailedDialog.right_tv_delegate$lambda$0(this.f30185b);
                    case 1:
                        return OcALiFaceFailedDialog.divider_view_delegate$lambda$1(this.f30185b);
                    case 2:
                        return OcALiFaceFailedDialog.left_tv_delegate$lambda$2(this.f30185b);
                    case 3:
                        return OcALiFaceFailedDialog.failed_content_tv_delegate$lambda$3(this.f30185b);
                    case 4:
                        return OcALiFaceFailedDialog.failed_title_tv_delegate$lambda$4(this.f30185b);
                    default:
                        return OcALiFaceFailedDialog.ivClose_delegate$lambda$5(this.f30185b);
                }
            }
        });
        final int i10 = 1;
        this.divider_view = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcALiFaceFailedDialog f30185b;

            {
                this.f30185b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return OcALiFaceFailedDialog.right_tv_delegate$lambda$0(this.f30185b);
                    case 1:
                        return OcALiFaceFailedDialog.divider_view_delegate$lambda$1(this.f30185b);
                    case 2:
                        return OcALiFaceFailedDialog.left_tv_delegate$lambda$2(this.f30185b);
                    case 3:
                        return OcALiFaceFailedDialog.failed_content_tv_delegate$lambda$3(this.f30185b);
                    case 4:
                        return OcALiFaceFailedDialog.failed_title_tv_delegate$lambda$4(this.f30185b);
                    default:
                        return OcALiFaceFailedDialog.ivClose_delegate$lambda$5(this.f30185b);
                }
            }
        });
        final int i11 = 2;
        this.left_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcALiFaceFailedDialog f30185b;

            {
                this.f30185b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return OcALiFaceFailedDialog.right_tv_delegate$lambda$0(this.f30185b);
                    case 1:
                        return OcALiFaceFailedDialog.divider_view_delegate$lambda$1(this.f30185b);
                    case 2:
                        return OcALiFaceFailedDialog.left_tv_delegate$lambda$2(this.f30185b);
                    case 3:
                        return OcALiFaceFailedDialog.failed_content_tv_delegate$lambda$3(this.f30185b);
                    case 4:
                        return OcALiFaceFailedDialog.failed_title_tv_delegate$lambda$4(this.f30185b);
                    default:
                        return OcALiFaceFailedDialog.ivClose_delegate$lambda$5(this.f30185b);
                }
            }
        });
        final int i12 = 3;
        this.failed_content_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcALiFaceFailedDialog f30185b;

            {
                this.f30185b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return OcALiFaceFailedDialog.right_tv_delegate$lambda$0(this.f30185b);
                    case 1:
                        return OcALiFaceFailedDialog.divider_view_delegate$lambda$1(this.f30185b);
                    case 2:
                        return OcALiFaceFailedDialog.left_tv_delegate$lambda$2(this.f30185b);
                    case 3:
                        return OcALiFaceFailedDialog.failed_content_tv_delegate$lambda$3(this.f30185b);
                    case 4:
                        return OcALiFaceFailedDialog.failed_title_tv_delegate$lambda$4(this.f30185b);
                    default:
                        return OcALiFaceFailedDialog.ivClose_delegate$lambda$5(this.f30185b);
                }
            }
        });
        final int i13 = 4;
        this.failed_title_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcALiFaceFailedDialog f30185b;

            {
                this.f30185b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return OcALiFaceFailedDialog.right_tv_delegate$lambda$0(this.f30185b);
                    case 1:
                        return OcALiFaceFailedDialog.divider_view_delegate$lambda$1(this.f30185b);
                    case 2:
                        return OcALiFaceFailedDialog.left_tv_delegate$lambda$2(this.f30185b);
                    case 3:
                        return OcALiFaceFailedDialog.failed_content_tv_delegate$lambda$3(this.f30185b);
                    case 4:
                        return OcALiFaceFailedDialog.failed_title_tv_delegate$lambda$4(this.f30185b);
                    default:
                        return OcALiFaceFailedDialog.ivClose_delegate$lambda$5(this.f30185b);
                }
            }
        });
        final int i14 = 5;
        this.ivClose = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcALiFaceFailedDialog f30185b;

            {
                this.f30185b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return OcALiFaceFailedDialog.right_tv_delegate$lambda$0(this.f30185b);
                    case 1:
                        return OcALiFaceFailedDialog.divider_view_delegate$lambda$1(this.f30185b);
                    case 2:
                        return OcALiFaceFailedDialog.left_tv_delegate$lambda$2(this.f30185b);
                    case 3:
                        return OcALiFaceFailedDialog.failed_content_tv_delegate$lambda$3(this.f30185b);
                    case 4:
                        return OcALiFaceFailedDialog.failed_title_tv_delegate$lambda$4(this.f30185b);
                    default:
                        return OcALiFaceFailedDialog.ivClose_delegate$lambda$5(this.f30185b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View divider_view_delegate$lambda$1(OcALiFaceFailedDialog ocALiFaceFailedDialog) {
        return ocALiFaceFailedDialog.findViewById(Ya.e.divider_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView failed_content_tv_delegate$lambda$3(OcALiFaceFailedDialog ocALiFaceFailedDialog) {
        return (TextView) ocALiFaceFailedDialog.findViewById(Ya.e.failed_content_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView failed_title_tv_delegate$lambda$4(OcALiFaceFailedDialog ocALiFaceFailedDialog) {
        return (TextView) ocALiFaceFailedDialog.findViewById(Ya.e.failed_title_tv);
    }

    private final View getDivider_view() {
        return (View) this.divider_view.getValue();
    }

    private final TextView getFailed_content_tv() {
        return (TextView) this.failed_content_tv.getValue();
    }

    private final TextView getFailed_title_tv() {
        return (TextView) this.failed_title_tv.getValue();
    }

    private final ImageView getIvClose() {
        return (ImageView) this.ivClose.getValue();
    }

    private final TextView getLeft_tv() {
        return (TextView) this.left_tv.getValue();
    }

    private final TextView getRight_tv() {
        return (TextView) this.right_tv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivClose_delegate$lambda$5(OcALiFaceFailedDialog ocALiFaceFailedDialog) {
        return (ImageView) ocALiFaceFailedDialog.findViewById(Ya.e.ivClose);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView left_tv_delegate$lambda$2(OcALiFaceFailedDialog ocALiFaceFailedDialog) {
        return (TextView) ocALiFaceFailedDialog.findViewById(Ya.e.left_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView right_tv_delegate$lambda$0(OcALiFaceFailedDialog ocALiFaceFailedDialog) {
        return (TextView) ocALiFaceFailedDialog.findViewById(Ya.e.right_tv);
    }

    private final void setListener() {
        ImageView ivClose = getIvClose();
        if (ivClose != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.p0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcALiFaceFailedDialog f30179b;

                {
                    this.f30179b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f30179b.dismiss();
                            break;
                        case 1:
                            OcALiFaceFailedDialog.setListener$lambda$7(this.f30179b, view);
                            break;
                        default:
                            OcALiFaceFailedDialog.setListener$lambda$8(this.f30179b, view);
                            break;
                    }
                }
            }, ivClose);
        }
        TextView left_tv = getLeft_tv();
        if (left_tv != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.p0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcALiFaceFailedDialog f30179b;

                {
                    this.f30179b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f30179b.dismiss();
                            break;
                        case 1:
                            OcALiFaceFailedDialog.setListener$lambda$7(this.f30179b, view);
                            break;
                        default:
                            OcALiFaceFailedDialog.setListener$lambda$8(this.f30179b, view);
                            break;
                    }
                }
            }, left_tv);
        }
        TextView right_tv = getRight_tv();
        if (right_tv != null) {
            final int i11 = 2;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.p0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcALiFaceFailedDialog f30179b;

                {
                    this.f30179b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            this.f30179b.dismiss();
                            break;
                        case 1:
                            OcALiFaceFailedDialog.setListener$lambda$7(this.f30179b, view);
                            break;
                        default:
                            OcALiFaceFailedDialog.setListener$lambda$8(this.f30179b, view);
                            break;
                    }
                }
            }, right_tv);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$7(OcALiFaceFailedDialog ocALiFaceFailedDialog, View view) {
        View.OnClickListener onClickListener = ocALiFaceFailedDialog.leftListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        ocALiFaceFailedDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$8(OcALiFaceFailedDialog ocALiFaceFailedDialog, View view) {
        View.OnClickListener onClickListener = ocALiFaceFailedDialog.rightListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        ocALiFaceFailedDialog.dismiss();
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        TextView failed_title_tv = getFailed_title_tv();
        if (failed_title_tv != null) {
            failed_title_tv.setText(this.title);
        }
        TextView failed_content_tv = getFailed_content_tv();
        if (failed_content_tv != null) {
            failed_content_tv.setText(this.content);
        }
        if (TextUtils.isEmpty(this.leftBtText)) {
            TextView left_tv = getLeft_tv();
            if (left_tv != null) {
                left_tv.setVisibility(8);
            }
            View divider_view = getDivider_view();
            if (divider_view != null) {
                divider_view.setVisibility(8);
            }
        } else {
            TextView left_tv2 = getLeft_tv();
            if (left_tv2 != null) {
                left_tv2.setText(this.leftBtText);
            }
        }
        TextView right_tv = getRight_tv();
        if (right_tv != null) {
            right_tv.setText(this.rightBtText);
        }
        setListener();
    }

    public final void setLeftListener(@Nullable View.OnClickListener listener) {
        this.leftListener = listener;
    }

    public final void setRightListener(@Nullable View.OnClickListener listener) {
        this.rightListener = listener;
    }
}
