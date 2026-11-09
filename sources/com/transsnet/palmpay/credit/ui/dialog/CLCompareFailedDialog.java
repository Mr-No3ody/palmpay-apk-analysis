package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010#\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001fR\u001d\u0010&\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001aR\u001d\u0010)\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010\u001aR\u001d\u0010.\u001a\u0004\u0018\u00010*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0018\u001a\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100¨\u00062"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLCompareFailedDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "leftBtText", "rightBtText", "title", FirebaseAnalytics.Param.CONTENT, "bottomContent", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "setListener", "()V", "initViews", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setTryAgainListener", "(Landroid/view/View$OnClickListener;)V", "setSkipListener", "Ljava/lang/String;", "Landroid/widget/TextView;", "bottom_tv$delegate", "Lkotlin/Lazy;", "getBottom_tv", "()Landroid/widget/TextView;", "bottom_tv", "Landroid/widget/Button;", "skip_bt$delegate", "getSkip_bt", "()Landroid/widget/Button;", "skip_bt", "try_again_bt$delegate", "getTry_again_bt", "try_again_bt", "content_tv$delegate", "getContent_tv", "content_tv", "title_tv$delegate", "getTitle_tv", "title_tv", "Landroid/widget/ImageView;", "ivClose$delegate", "getIvClose", "()Landroid/widget/ImageView;", "ivClose", "tryAgainListener", "Landroid/view/View$OnClickListener;", "skipListener", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLCompareFailedDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @Nullable
    private final String bottomContent;

    /* JADX INFO: renamed from: bottom_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy bottom_tv;

    @Nullable
    private final String content;

    /* JADX INFO: renamed from: content_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy content_tv;

    /* JADX INFO: renamed from: ivClose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivClose;

    @Nullable
    private final String leftBtText;

    @Nullable
    private final String rightBtText;

    @Nullable
    private View.OnClickListener skipListener;

    /* JADX INFO: renamed from: skip_bt$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy skip_bt;

    @Nullable
    private final String title;

    /* JADX INFO: renamed from: title_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy title_tv;

    @Nullable
    private View.OnClickListener tryAgainListener;

    /* JADX INFO: renamed from: try_again_bt$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy try_again_bt;

    public /* synthetic */ CLCompareFailedDialog(Context context, String str, String str2, String str3, String str4, String str5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, str3, str4, (i7 & 32) != 0 ? null : str5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView bottom_tv_delegate$lambda$0(CLCompareFailedDialog cLCompareFailedDialog) {
        return (TextView) cLCompareFailedDialog.findViewById(Ya.e.bottom_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView content_tv_delegate$lambda$3(CLCompareFailedDialog cLCompareFailedDialog) {
        return (TextView) cLCompareFailedDialog.findViewById(Ya.e.content_tv);
    }

    private final TextView getBottom_tv() {
        return (TextView) this.bottom_tv.getValue();
    }

    private final TextView getContent_tv() {
        return (TextView) this.content_tv.getValue();
    }

    private final ImageView getIvClose() {
        return (ImageView) this.ivClose.getValue();
    }

    private final Button getSkip_bt() {
        return (Button) this.skip_bt.getValue();
    }

    private final TextView getTitle_tv() {
        return (TextView) this.title_tv.getValue();
    }

    private final Button getTry_again_bt() {
        return (Button) this.try_again_bt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivClose_delegate$lambda$5(CLCompareFailedDialog cLCompareFailedDialog) {
        return (ImageView) cLCompareFailedDialog.findViewById(Ya.e.ivClose);
    }

    private final void setListener() {
        ImageView ivClose = getIvClose();
        if (ivClose != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLCompareFailedDialog f30158b;

                {
                    this.f30158b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            CLCompareFailedDialog.setListener$lambda$6(this.f30158b, view);
                            break;
                        case 1:
                            CLCompareFailedDialog.setListener$lambda$7(this.f30158b, view);
                            break;
                        default:
                            CLCompareFailedDialog.setListener$lambda$8(this.f30158b, view);
                            break;
                    }
                }
            }, ivClose);
        }
        Button try_again_bt = getTry_again_bt();
        if (try_again_bt != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLCompareFailedDialog f30158b;

                {
                    this.f30158b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            CLCompareFailedDialog.setListener$lambda$6(this.f30158b, view);
                            break;
                        case 1:
                            CLCompareFailedDialog.setListener$lambda$7(this.f30158b, view);
                            break;
                        default:
                            CLCompareFailedDialog.setListener$lambda$8(this.f30158b, view);
                            break;
                    }
                }
            }, try_again_bt);
        }
        Button skip_bt = getSkip_bt();
        if (skip_bt != null) {
            final int i11 = 2;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLCompareFailedDialog f30158b;

                {
                    this.f30158b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            CLCompareFailedDialog.setListener$lambda$6(this.f30158b, view);
                            break;
                        case 1:
                            CLCompareFailedDialog.setListener$lambda$7(this.f30158b, view);
                            break;
                        default:
                            CLCompareFailedDialog.setListener$lambda$8(this.f30158b, view);
                            break;
                    }
                }
            }, skip_bt);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$6(CLCompareFailedDialog cLCompareFailedDialog, View view) {
        cLCompareFailedDialog.dismiss();
        Pa.n0.g().m("CLCompareFailedDialog_element_click", "close_img", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$7(CLCompareFailedDialog cLCompareFailedDialog, View view) {
        View.OnClickListener onClickListener = cLCompareFailedDialog.tryAgainListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        cLCompareFailedDialog.dismiss();
        Pa.n0.g().m("CLCompareFailedDialog_element_click", "try_again_bt", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$8(CLCompareFailedDialog cLCompareFailedDialog, View view) {
        View.OnClickListener onClickListener = cLCompareFailedDialog.skipListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        cLCompareFailedDialog.dismiss();
        Pa.n0.g().m("CLCompareFailedDialog_element_click", "skip_bt", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button skip_bt_delegate$lambda$1(CLCompareFailedDialog cLCompareFailedDialog) {
        return (Button) cLCompareFailedDialog.findViewById(Ya.e.skip_bt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView title_tv_delegate$lambda$4(CLCompareFailedDialog cLCompareFailedDialog) {
        return (TextView) cLCompareFailedDialog.findViewById(Ya.e.title_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button try_again_bt_delegate$lambda$2(CLCompareFailedDialog cLCompareFailedDialog) {
        return (Button) cLCompareFailedDialog.findViewById(Ya.e.try_again_bt);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        if (TextUtils.isEmpty(this.leftBtText)) {
            Button try_again_bt = getTry_again_bt();
            if (try_again_bt != null) {
                try_again_bt.setVisibility(8);
            }
        } else {
            Button try_again_bt2 = getTry_again_bt();
            if (try_again_bt2 != null) {
                try_again_bt2.setText(this.leftBtText);
            }
            Button try_again_bt3 = getTry_again_bt();
            if (try_again_bt3 != null) {
                try_again_bt3.setVisibility(0);
            }
        }
        if (!TextUtils.isEmpty(this.rightBtText)) {
            Button skip_bt = getSkip_bt();
            if (skip_bt != null) {
                skip_bt.setText(this.rightBtText);
            }
            Button skip_bt2 = getSkip_bt();
            if (skip_bt2 != null) {
                skip_bt2.setVisibility(0);
            }
        }
        TextView title_tv = getTitle_tv();
        if (title_tv != null) {
            title_tv.setText(this.title);
        }
        TextView content_tv = getContent_tv();
        if (content_tv != null) {
            content_tv.setText(this.content);
        }
        if (!TextUtils.isEmpty(this.bottomContent)) {
            TextView bottom_tv = getBottom_tv();
            if (bottom_tv != null) {
                bottom_tv.setText(this.bottomContent);
            }
            TextView bottom_tv2 = getBottom_tv();
            if (bottom_tv2 != null) {
                bottom_tv2.setVisibility(0);
            }
        }
        setListener();
    }

    public final void setSkipListener(@Nullable View.OnClickListener listener) {
        this.skipListener = listener;
    }

    public final void setTryAgainListener(@Nullable View.OnClickListener listener) {
        this.tryAgainListener = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CLCompareFailedDialog(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        super(context, Ya.f.cs_cl_compare_img_failed_dialog_layout);
        Intrinsics.checkNotNullParameter(context, "context");
        this.leftBtText = str;
        this.rightBtText = str2;
        this.title = str3;
        this.content = str4;
        this.bottomContent = str5;
        final int i7 = 0;
        this.bottom_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLCompareFailedDialog f30164b;

            {
                this.f30164b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return CLCompareFailedDialog.bottom_tv_delegate$lambda$0(this.f30164b);
                    case 1:
                        return CLCompareFailedDialog.skip_bt_delegate$lambda$1(this.f30164b);
                    case 2:
                        return CLCompareFailedDialog.try_again_bt_delegate$lambda$2(this.f30164b);
                    case 3:
                        return CLCompareFailedDialog.content_tv_delegate$lambda$3(this.f30164b);
                    case 4:
                        return CLCompareFailedDialog.title_tv_delegate$lambda$4(this.f30164b);
                    default:
                        return CLCompareFailedDialog.ivClose_delegate$lambda$5(this.f30164b);
                }
            }
        });
        final int i10 = 1;
        this.skip_bt = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLCompareFailedDialog f30164b;

            {
                this.f30164b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return CLCompareFailedDialog.bottom_tv_delegate$lambda$0(this.f30164b);
                    case 1:
                        return CLCompareFailedDialog.skip_bt_delegate$lambda$1(this.f30164b);
                    case 2:
                        return CLCompareFailedDialog.try_again_bt_delegate$lambda$2(this.f30164b);
                    case 3:
                        return CLCompareFailedDialog.content_tv_delegate$lambda$3(this.f30164b);
                    case 4:
                        return CLCompareFailedDialog.title_tv_delegate$lambda$4(this.f30164b);
                    default:
                        return CLCompareFailedDialog.ivClose_delegate$lambda$5(this.f30164b);
                }
            }
        });
        final int i11 = 2;
        this.try_again_bt = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLCompareFailedDialog f30164b;

            {
                this.f30164b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return CLCompareFailedDialog.bottom_tv_delegate$lambda$0(this.f30164b);
                    case 1:
                        return CLCompareFailedDialog.skip_bt_delegate$lambda$1(this.f30164b);
                    case 2:
                        return CLCompareFailedDialog.try_again_bt_delegate$lambda$2(this.f30164b);
                    case 3:
                        return CLCompareFailedDialog.content_tv_delegate$lambda$3(this.f30164b);
                    case 4:
                        return CLCompareFailedDialog.title_tv_delegate$lambda$4(this.f30164b);
                    default:
                        return CLCompareFailedDialog.ivClose_delegate$lambda$5(this.f30164b);
                }
            }
        });
        final int i12 = 3;
        this.content_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLCompareFailedDialog f30164b;

            {
                this.f30164b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return CLCompareFailedDialog.bottom_tv_delegate$lambda$0(this.f30164b);
                    case 1:
                        return CLCompareFailedDialog.skip_bt_delegate$lambda$1(this.f30164b);
                    case 2:
                        return CLCompareFailedDialog.try_again_bt_delegate$lambda$2(this.f30164b);
                    case 3:
                        return CLCompareFailedDialog.content_tv_delegate$lambda$3(this.f30164b);
                    case 4:
                        return CLCompareFailedDialog.title_tv_delegate$lambda$4(this.f30164b);
                    default:
                        return CLCompareFailedDialog.ivClose_delegate$lambda$5(this.f30164b);
                }
            }
        });
        final int i13 = 4;
        this.title_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLCompareFailedDialog f30164b;

            {
                this.f30164b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return CLCompareFailedDialog.bottom_tv_delegate$lambda$0(this.f30164b);
                    case 1:
                        return CLCompareFailedDialog.skip_bt_delegate$lambda$1(this.f30164b);
                    case 2:
                        return CLCompareFailedDialog.try_again_bt_delegate$lambda$2(this.f30164b);
                    case 3:
                        return CLCompareFailedDialog.content_tv_delegate$lambda$3(this.f30164b);
                    case 4:
                        return CLCompareFailedDialog.title_tv_delegate$lambda$4(this.f30164b);
                    default:
                        return CLCompareFailedDialog.ivClose_delegate$lambda$5(this.f30164b);
                }
            }
        });
        final int i14 = 5;
        this.ivClose = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLCompareFailedDialog f30164b;

            {
                this.f30164b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return CLCompareFailedDialog.bottom_tv_delegate$lambda$0(this.f30164b);
                    case 1:
                        return CLCompareFailedDialog.skip_bt_delegate$lambda$1(this.f30164b);
                    case 2:
                        return CLCompareFailedDialog.try_again_bt_delegate$lambda$2(this.f30164b);
                    case 3:
                        return CLCompareFailedDialog.content_tv_delegate$lambda$3(this.f30164b);
                    case 4:
                        return CLCompareFailedDialog.title_tv_delegate$lambda$4(this.f30164b);
                    default:
                        return CLCompareFailedDialog.ivClose_delegate$lambda$5(this.f30164b);
                }
            }
        });
    }
}
