package com.transsnet.palmpay.jara_packet.ui.dialog;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.w;
import com.transsnet.palmpay.jara_packet.ui.dialog.ReferEarnTipDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p236pc.d;
import p236pc.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/ui/dialog/ReferEarnTipDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "mContent", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "", "initViews", "()V", "Ljava/lang/String;", "getMContent", "()Ljava/lang/String;", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReferEarnTipDialog extends b {

    @NotNull
    private final String mContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferEarnTipDialog(@NotNull Context context, @NotNull String mContent) {
        super(context, e.jp_re_tip_dialog, w.BaseDialogTheme);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mContent, "mContent");
        this.mContent = mContent;
    }

    @NotNull
    public final String getMContent() {
        return this.mContent;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        View viewFindViewById = findViewById(d.ivClose);
        if (viewFindViewById != null) {
            final int i7 = 0;
            viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: vc.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ReferEarnTipDialog f43149b;

                {
                    this.f43149b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f43149b.dismiss();
                            break;
                        default:
                            this.f43149b.dismiss();
                            break;
                    }
                }
            });
        }
        View viewFindViewById2 = findViewById(d.btnConfirm);
        if (viewFindViewById2 != null) {
            final int i10 = 1;
            viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: vc.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ReferEarnTipDialog f43149b;

                {
                    this.f43149b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f43149b.dismiss();
                            break;
                        default:
                            this.f43149b.dismiss();
                            break;
                    }
                }
            });
        }
        TextView textView = (TextView) findViewById(d.tvContent);
        if (textView != null) {
            textView.setText(this.mContent);
        }
    }
}
