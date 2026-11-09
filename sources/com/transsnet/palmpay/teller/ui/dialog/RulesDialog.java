package com.transsnet.palmpay.teller.ui.dialog;

import Pd.c;
import Pd.d;
import Yd.i;
import android.content.Context;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p025ba.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/dialog/RulesDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "titleString", "desc", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "", "initViews", "()V", "Ljava/lang/String;", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RulesDialog extends b {

    @NotNull
    private final String desc;

    @NotNull
    private final String titleString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RulesDialog(@NotNull Context context, @NotNull String titleString, @NotNull String desc) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(titleString, "titleString");
        Intrinsics.checkNotNullParameter(desc, "desc");
        this.titleString = titleString;
        this.desc = desc;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(d.qt_dialog_betting_discount_info);
        ImageView imageView = (ImageView) findViewById(c.ivBettingDiscountClose);
        TextView textView = (TextView) findViewById(c.tvBettingDiscountTitle);
        TextView textView2 = (TextView) findViewById(c.tvBettingDiscountDesc);
        textView.setText(this.titleString);
        textView2.setText(this.desc);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setWindowAnimations(l.dialog_bottom_in_out);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = ScreenUtils.getScreenWidth();
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        imageView.setOnClickListener(new i(this, 4));
    }
}
