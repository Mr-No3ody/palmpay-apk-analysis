package com.transsnet.palmpay.core.dialog;

import Pa.r0;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.core.dialog.CommentTicketDialog;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/transsnet/palmpay/core/dialog/CommentTicketDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", FirebaseAnalytics.Param.CONTENT, "imgUrl", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "", "initViews", "()V", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "getListener", "()Landroid/view/View$OnClickListener;", "setListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/widget/TextView;", "mContentView", "Landroid/widget/TextView;", "Landroid/widget/ImageView;", "mIvCoupon", "Landroid/widget/ImageView;", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CommentTicketDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @NotNull
    private final String content;

    @NotNull
    private final String imgUrl;

    @Nullable
    private View.OnClickListener listener;

    @Nullable
    private TextView mContentView;

    @Nullable
    private ImageView mIvCoupon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentTicketDialog(@NotNull Context context, @NotNull String content, @NotNull String imgUrl) {
        super(context, L9.b.core_comment_dialog_layout);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(imgUrl, "imgUrl");
        this.content = content;
        this.imgUrl = imgUrl;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final View.OnClickListener getListener() {
        return this.listener;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        this.mContentView = (TextView) findViewById(L9.a.tvContent);
        this.mIvCoupon = (ImageView) findViewById(L9.a.ivCoupon);
        TextView textView = this.mContentView;
        if (textView != null) {
            textView.setText(this.content);
        }
        r0.l1(this.imgUrl, this.mIvCoupon);
        final int i7 = 0;
        findViewById(L9.a.btnOk).setOnClickListener(new View.OnClickListener(this) { // from class: ma.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentTicketDialog f39593b;

            {
                this.f39593b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.f39593b.dismiss();
                        break;
                    default:
                        this.f39593b.dismiss();
                        break;
                }
            }
        });
        final int i10 = 1;
        findViewById(L9.a.ivClose).setOnClickListener(new View.OnClickListener(this) { // from class: ma.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentTicketDialog f39593b;

            {
                this.f39593b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f39593b.dismiss();
                        break;
                    default:
                        this.f39593b.dismiss();
                        break;
                }
            }
        });
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
            window.setWindowAnimations(l.dialog_bottom_in_out);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = ScreenUtils.getScreenWidth() - SizeUtils.dp2px(32.0f);
            attributes.height = -2;
            window.setAttributes(attributes);
        }
    }

    public final void setListener(@Nullable View.OnClickListener onClickListener) {
        this.listener = onClickListener;
    }
}
