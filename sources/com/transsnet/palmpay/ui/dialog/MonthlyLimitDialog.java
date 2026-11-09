package com.transsnet.palmpay.ui.dialog;

import Ac.e;
import Ac.f;
import Bc.v;
import Pa.r0;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p059e1.a;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/ui/dialog/MonthlyLimitDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "LBc/v;", "binding", "LBc/v;", "", "MONTHLY_OVERVIEW_MODULE", "Ljava/lang/String;", "Companion", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MonthlyLimitDialog extends b {

    @NotNull
    private final String MONTHLY_OVERVIEW_MODULE;

    @Nullable
    private v binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonthlyLimitDialog(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.MONTHLY_OVERVIEW_MODULE = "MonthlyOverviewHome";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(MonthlyLimitDialog monthlyLimitDialog, View view) {
        if (r0.U0()) {
            return;
        }
        int id2 = view.getId();
        if (id2 == e.btnCancel) {
            monthlyLimitDialog.dismiss();
            return;
        }
        if (id2 == e.btnNext) {
            d.x(null, monthlyLimitDialog.MONTHLY_OVERVIEW_MODULE);
            monthlyLimitDialog.dismiss();
        } else if (id2 == e.ivClose) {
            monthlyLimitDialog.dismiss();
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(f.main_dialog_monthly_limit);
        showAtCenter(getWindow(), w.Animation_CommonDialog);
        View viewFindViewById = findViewById(e.viewRoot);
        int i7 = e.btnCancel;
        TextView textView = (TextView) a.m(i7, viewFindViewById);
        if (textView != null) {
            i7 = e.btnNext;
            TextView textView2 = (TextView) a.m(i7, viewFindViewById);
            if (textView2 != null) {
                i7 = e.ivClose;
                IconicsImageView iconicsImageView = (IconicsImageView) a.m(i7, viewFindViewById);
                if (iconicsImageView != null) {
                    i7 = e.tvMsg;
                    TextView textView3 = (TextView) a.m(i7, viewFindViewById);
                    if (textView3 != null) {
                        i7 = e.tvTitle;
                        TextView textView4 = (TextView) a.m(i7, viewFindViewById);
                        if (textView4 != null) {
                            this.binding = new v((RelativeLayout) viewFindViewById, textView, textView2, iconicsImageView, textView3, textView4);
                            h.q(new A8.b(this, 9), textView, textView2, iconicsImageView);
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }
}
