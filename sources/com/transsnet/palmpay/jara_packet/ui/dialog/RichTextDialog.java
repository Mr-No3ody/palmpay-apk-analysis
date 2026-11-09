package com.transsnet.palmpay.jara_packet.ui.dialog;

import Pa.k0;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.w;
import com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p236pc.d;
import p236pc.e;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u00002\u00020\u0001:\u0001>B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\b2\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u001b\u0010)\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b(\u0010%R\u001b\u0010,\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001e\u001a\u0004\b+\u0010 R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001e\u001a\u0004\b/\u00100R\u001b\u00104\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u001e\u001a\u0004\b3\u0010 R\u001b\u00107\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u001e\u001a\u0004\b6\u00100R\"\u00108\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/ui/dialog/RichTextDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Lcom/transsnet/palmpay/jara_packet/ui/dialog/RichTextDialog$ConfirmInterface;", "confirmInterface", "<init>", "(Landroid/content/Context;Lcom/transsnet/palmpay/jara_packet/ui/dialog/RichTextDialog$ConfirmInterface;)V", "", "initViews", "()V", "", "cancelText", "confirmText", "setActionName", "(Ljava/lang/String;Ljava/lang/String;)V", "getConfirmName", "()Ljava/lang/String;", FirebaseAnalytics.Param.CONTENT, "setContent", "(Ljava/lang/String;)V", "setBottomContent", "title", "setTitle", "", "res", "setTopImageView", "(I)V", "Landroid/widget/TextView;", "jp_rich_dialog_content2$delegate", "Lkotlin/Lazy;", "getJp_rich_dialog_content2", "()Landroid/widget/TextView;", "jp_rich_dialog_content2", "Landroid/widget/Button;", "jp_rich_dialog_confirm$delegate", "getJp_rich_dialog_confirm", "()Landroid/widget/Button;", "jp_rich_dialog_confirm", "jp_rich_dialog_cancel$delegate", "getJp_rich_dialog_cancel", "jp_rich_dialog_cancel", "jp_rich_dialog_content$delegate", "getJp_rich_dialog_content", "jp_rich_dialog_content", "Landroid/widget/ImageView;", "jp_rich_dialog_top$delegate", "getJp_rich_dialog_top", "()Landroid/widget/ImageView;", "jp_rich_dialog_top", "jp_rich_dialog_title$delegate", "getJp_rich_dialog_title", "jp_rich_dialog_title", "jp_rich_dialog_close$delegate", "getJp_rich_dialog_close", "jp_rich_dialog_close", "mConfirmInterface", "Lcom/transsnet/palmpay/jara_packet/ui/dialog/RichTextDialog$ConfirmInterface;", "getMConfirmInterface", "()Lcom/transsnet/palmpay/jara_packet/ui/dialog/RichTextDialog$ConfirmInterface;", "setMConfirmInterface", "(Lcom/transsnet/palmpay/jara_packet/ui/dialog/RichTextDialog$ConfirmInterface;)V", "ConfirmInterface", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class RichTextDialog extends b {

    /* JADX INFO: renamed from: jp_rich_dialog_cancel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy jp_rich_dialog_cancel;

    /* JADX INFO: renamed from: jp_rich_dialog_close$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy jp_rich_dialog_close;

    /* JADX INFO: renamed from: jp_rich_dialog_confirm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy jp_rich_dialog_confirm;

    /* JADX INFO: renamed from: jp_rich_dialog_content$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy jp_rich_dialog_content;

    /* JADX INFO: renamed from: jp_rich_dialog_content2$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy jp_rich_dialog_content2;

    /* JADX INFO: renamed from: jp_rich_dialog_title$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy jp_rich_dialog_title;

    /* JADX INFO: renamed from: jp_rich_dialog_top$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy jp_rich_dialog_top;

    @NotNull
    private ConfirmInterface mConfirmInterface;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H&¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/ui/dialog/RichTextDialog$ConfirmInterface;", "", "confirm", "", "", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ConfirmInterface {
        void confirm(boolean confirm);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichTextDialog(@NotNull Context context, @NotNull ConfirmInterface confirmInterface) {
        super(context, e.jp_layout_rich_text_dialog, w.BaseDialogTheme);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(confirmInterface, "confirmInterface");
        final int i7 = 0;
        this.jp_rich_dialog_content2 = C2131j.b(new Function0(this) { // from class: vc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RichTextDialog f43151b;

            {
                this.f43151b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return RichTextDialog.jp_rich_dialog_content2_delegate$lambda$0(this.f43151b);
                    case 1:
                        return RichTextDialog.jp_rich_dialog_confirm_delegate$lambda$1(this.f43151b);
                    case 2:
                        return RichTextDialog.jp_rich_dialog_cancel_delegate$lambda$2(this.f43151b);
                    case 3:
                        return RichTextDialog.jp_rich_dialog_content_delegate$lambda$3(this.f43151b);
                    case 4:
                        return RichTextDialog.jp_rich_dialog_top_delegate$lambda$4(this.f43151b);
                    case 5:
                        return RichTextDialog.jp_rich_dialog_title_delegate$lambda$5(this.f43151b);
                    default:
                        return RichTextDialog.jp_rich_dialog_close_delegate$lambda$6(this.f43151b);
                }
            }
        });
        final int i10 = 1;
        this.jp_rich_dialog_confirm = C2131j.b(new Function0(this) { // from class: vc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RichTextDialog f43151b;

            {
                this.f43151b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return RichTextDialog.jp_rich_dialog_content2_delegate$lambda$0(this.f43151b);
                    case 1:
                        return RichTextDialog.jp_rich_dialog_confirm_delegate$lambda$1(this.f43151b);
                    case 2:
                        return RichTextDialog.jp_rich_dialog_cancel_delegate$lambda$2(this.f43151b);
                    case 3:
                        return RichTextDialog.jp_rich_dialog_content_delegate$lambda$3(this.f43151b);
                    case 4:
                        return RichTextDialog.jp_rich_dialog_top_delegate$lambda$4(this.f43151b);
                    case 5:
                        return RichTextDialog.jp_rich_dialog_title_delegate$lambda$5(this.f43151b);
                    default:
                        return RichTextDialog.jp_rich_dialog_close_delegate$lambda$6(this.f43151b);
                }
            }
        });
        final int i11 = 2;
        this.jp_rich_dialog_cancel = C2131j.b(new Function0(this) { // from class: vc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RichTextDialog f43151b;

            {
                this.f43151b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return RichTextDialog.jp_rich_dialog_content2_delegate$lambda$0(this.f43151b);
                    case 1:
                        return RichTextDialog.jp_rich_dialog_confirm_delegate$lambda$1(this.f43151b);
                    case 2:
                        return RichTextDialog.jp_rich_dialog_cancel_delegate$lambda$2(this.f43151b);
                    case 3:
                        return RichTextDialog.jp_rich_dialog_content_delegate$lambda$3(this.f43151b);
                    case 4:
                        return RichTextDialog.jp_rich_dialog_top_delegate$lambda$4(this.f43151b);
                    case 5:
                        return RichTextDialog.jp_rich_dialog_title_delegate$lambda$5(this.f43151b);
                    default:
                        return RichTextDialog.jp_rich_dialog_close_delegate$lambda$6(this.f43151b);
                }
            }
        });
        final int i12 = 3;
        this.jp_rich_dialog_content = C2131j.b(new Function0(this) { // from class: vc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RichTextDialog f43151b;

            {
                this.f43151b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return RichTextDialog.jp_rich_dialog_content2_delegate$lambda$0(this.f43151b);
                    case 1:
                        return RichTextDialog.jp_rich_dialog_confirm_delegate$lambda$1(this.f43151b);
                    case 2:
                        return RichTextDialog.jp_rich_dialog_cancel_delegate$lambda$2(this.f43151b);
                    case 3:
                        return RichTextDialog.jp_rich_dialog_content_delegate$lambda$3(this.f43151b);
                    case 4:
                        return RichTextDialog.jp_rich_dialog_top_delegate$lambda$4(this.f43151b);
                    case 5:
                        return RichTextDialog.jp_rich_dialog_title_delegate$lambda$5(this.f43151b);
                    default:
                        return RichTextDialog.jp_rich_dialog_close_delegate$lambda$6(this.f43151b);
                }
            }
        });
        final int i13 = 4;
        this.jp_rich_dialog_top = C2131j.b(new Function0(this) { // from class: vc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RichTextDialog f43151b;

            {
                this.f43151b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return RichTextDialog.jp_rich_dialog_content2_delegate$lambda$0(this.f43151b);
                    case 1:
                        return RichTextDialog.jp_rich_dialog_confirm_delegate$lambda$1(this.f43151b);
                    case 2:
                        return RichTextDialog.jp_rich_dialog_cancel_delegate$lambda$2(this.f43151b);
                    case 3:
                        return RichTextDialog.jp_rich_dialog_content_delegate$lambda$3(this.f43151b);
                    case 4:
                        return RichTextDialog.jp_rich_dialog_top_delegate$lambda$4(this.f43151b);
                    case 5:
                        return RichTextDialog.jp_rich_dialog_title_delegate$lambda$5(this.f43151b);
                    default:
                        return RichTextDialog.jp_rich_dialog_close_delegate$lambda$6(this.f43151b);
                }
            }
        });
        final int i14 = 5;
        this.jp_rich_dialog_title = C2131j.b(new Function0(this) { // from class: vc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RichTextDialog f43151b;

            {
                this.f43151b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return RichTextDialog.jp_rich_dialog_content2_delegate$lambda$0(this.f43151b);
                    case 1:
                        return RichTextDialog.jp_rich_dialog_confirm_delegate$lambda$1(this.f43151b);
                    case 2:
                        return RichTextDialog.jp_rich_dialog_cancel_delegate$lambda$2(this.f43151b);
                    case 3:
                        return RichTextDialog.jp_rich_dialog_content_delegate$lambda$3(this.f43151b);
                    case 4:
                        return RichTextDialog.jp_rich_dialog_top_delegate$lambda$4(this.f43151b);
                    case 5:
                        return RichTextDialog.jp_rich_dialog_title_delegate$lambda$5(this.f43151b);
                    default:
                        return RichTextDialog.jp_rich_dialog_close_delegate$lambda$6(this.f43151b);
                }
            }
        });
        final int i15 = 6;
        this.jp_rich_dialog_close = C2131j.b(new Function0(this) { // from class: vc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RichTextDialog f43151b;

            {
                this.f43151b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return RichTextDialog.jp_rich_dialog_content2_delegate$lambda$0(this.f43151b);
                    case 1:
                        return RichTextDialog.jp_rich_dialog_confirm_delegate$lambda$1(this.f43151b);
                    case 2:
                        return RichTextDialog.jp_rich_dialog_cancel_delegate$lambda$2(this.f43151b);
                    case 3:
                        return RichTextDialog.jp_rich_dialog_content_delegate$lambda$3(this.f43151b);
                    case 4:
                        return RichTextDialog.jp_rich_dialog_top_delegate$lambda$4(this.f43151b);
                    case 5:
                        return RichTextDialog.jp_rich_dialog_title_delegate$lambda$5(this.f43151b);
                    default:
                        return RichTextDialog.jp_rich_dialog_close_delegate$lambda$6(this.f43151b);
                }
            }
        });
        this.mConfirmInterface = confirmInterface;
    }

    private final Button getJp_rich_dialog_cancel() {
        Object value = this.jp_rich_dialog_cancel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Button) value;
    }

    private final ImageView getJp_rich_dialog_close() {
        Object value = this.jp_rich_dialog_close.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final Button getJp_rich_dialog_confirm() {
        Object value = this.jp_rich_dialog_confirm.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Button) value;
    }

    private final TextView getJp_rich_dialog_content() {
        Object value = this.jp_rich_dialog_content.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getJp_rich_dialog_content2() {
        Object value = this.jp_rich_dialog_content2.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getJp_rich_dialog_title() {
        Object value = this.jp_rich_dialog_title.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final ImageView getJp_rich_dialog_top() {
        Object value = this.jp_rich_dialog_top.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$7(RichTextDialog richTextDialog, View view) {
        richTextDialog.mConfirmInterface.confirm(false);
        richTextDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$8(RichTextDialog richTextDialog, View view) {
        richTextDialog.mConfirmInterface.confirm(true);
        richTextDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button jp_rich_dialog_cancel_delegate$lambda$2(RichTextDialog richTextDialog) {
        return (Button) richTextDialog.findViewById(d.jp_rich_dialog_cancel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView jp_rich_dialog_close_delegate$lambda$6(RichTextDialog richTextDialog) {
        return (ImageView) richTextDialog.findViewById(d.jp_rich_dialog_close);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button jp_rich_dialog_confirm_delegate$lambda$1(RichTextDialog richTextDialog) {
        return (Button) richTextDialog.findViewById(d.jp_rich_dialog_confirm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView jp_rich_dialog_content2_delegate$lambda$0(RichTextDialog richTextDialog) {
        return (TextView) richTextDialog.findViewById(d.jp_rich_dialog_content2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView jp_rich_dialog_content_delegate$lambda$3(RichTextDialog richTextDialog) {
        return (TextView) richTextDialog.findViewById(d.jp_rich_dialog_content);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView jp_rich_dialog_title_delegate$lambda$5(RichTextDialog richTextDialog) {
        return (TextView) richTextDialog.findViewById(d.jp_rich_dialog_title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView jp_rich_dialog_top_delegate$lambda$4(RichTextDialog richTextDialog) {
        return (ImageView) richTextDialog.findViewById(d.jp_rich_dialog_top);
    }

    @NotNull
    public final String getConfirmName() {
        return getJp_rich_dialog_confirm().getText().toString();
    }

    @NotNull
    public final ConfirmInterface getMConfirmInterface() {
        return this.mConfirmInterface;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        final int i7 = 0;
        getJp_rich_dialog_cancel().setOnClickListener(new View.OnClickListener(this) { // from class: vc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RichTextDialog f43153b;

            {
                this.f43153b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        RichTextDialog.initViews$lambda$7(this.f43153b, view);
                        break;
                    case 1:
                        RichTextDialog.initViews$lambda$8(this.f43153b, view);
                        break;
                    default:
                        this.f43153b.dismiss();
                        break;
                }
            }
        });
        final int i10 = 1;
        getJp_rich_dialog_confirm().setOnClickListener(new View.OnClickListener(this) { // from class: vc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RichTextDialog f43153b;

            {
                this.f43153b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        RichTextDialog.initViews$lambda$7(this.f43153b, view);
                        break;
                    case 1:
                        RichTextDialog.initViews$lambda$8(this.f43153b, view);
                        break;
                    default:
                        this.f43153b.dismiss();
                        break;
                }
            }
        });
        final int i11 = 2;
        getJp_rich_dialog_close().setOnClickListener(new View.OnClickListener(this) { // from class: vc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RichTextDialog f43153b;

            {
                this.f43153b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        RichTextDialog.initViews$lambda$7(this.f43153b, view);
                        break;
                    case 1:
                        RichTextDialog.initViews$lambda$8(this.f43153b, view);
                        break;
                    default:
                        this.f43153b.dismiss();
                        break;
                }
            }
        });
    }

    public final void setActionName(@NotNull String cancelText, @NotNull String confirmText) {
        Intrinsics.checkNotNullParameter(cancelText, "cancelText");
        Intrinsics.checkNotNullParameter(confirmText, "confirmText");
        if (cancelText.length() == 0) {
            getJp_rich_dialog_cancel().setVisibility(8);
        }
        getJp_rich_dialog_cancel().setText(cancelText);
        getJp_rich_dialog_confirm().setText(confirmText);
    }

    public final void setBottomContent(@Nullable String content) {
        if (content != null) {
            SpannableString spannableString = new SpannableString(content);
            k0.d(spannableString, "[a-zA-Z]*([1-9]\\d*)[a-zA-Z]*", getContext().getColor(L6.b.ppColorWarning), SizeUtils.dp2px(14.0f), "sans-serif-black");
            k0.d(spannableString, "[a-zA-Z]*(₦[1-9]\\d*)[a-zA-Z]*", getContext().getColor(L6.b.ppColorWarning), SizeUtils.dp2px(14.0f), "sans-serif-black");
            getJp_rich_dialog_content2().setVisibility(0);
            getJp_rich_dialog_content2().setText(spannableString);
        }
    }

    public final void setContent(@Nullable String content) {
        if (content != null) {
            SpannableString spannableString = new SpannableString(content);
            k0.d(spannableString, "[a-zA-Z]*([1-9]\\d*)[a-zA-Z]*", getContext().getColor(L6.b.ppColorWarning), SizeUtils.dp2px(14.0f), "sans-serif-black");
            k0.d(spannableString, "[a-zA-Z]*(₦[1-9]\\d*)[a-zA-Z]*", getContext().getColor(L6.b.ppColorWarning), SizeUtils.dp2px(14.0f), "sans-serif-black");
            getJp_rich_dialog_content().setText(spannableString);
        }
    }

    public final void setMConfirmInterface(@NotNull ConfirmInterface confirmInterface) {
        Intrinsics.checkNotNullParameter(confirmInterface, "<set-?>");
        this.mConfirmInterface = confirmInterface;
    }

    public final void setTitle(@Nullable String title) {
        if (!TextUtils.isEmpty(title)) {
            getJp_rich_dialog_title().setVisibility(0);
        }
        getJp_rich_dialog_title().setText(title);
    }

    public final void setTopImageView(@DrawableRes int res) {
        getJp_rich_dialog_top().setImageResource(res);
    }
}
