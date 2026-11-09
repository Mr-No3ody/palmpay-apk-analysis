package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.credit.bean.rsp.QueryPopUpsReq;
import com.transsnet.palmpay.custom_view.dialog.BaseChainResponsibilityDialog;
import com.transsnet.palmpay.util.SPUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0014J\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/OpenFlexiSuccDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseChainResponsibilityDialog;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "btnTv", "Landroid/widget/TextView;", "amountTv", "text1", "close", "Landroid/widget/ImageView;", "findViews", "", "handlerChain", "initViews", "fillData", "creditQuota", "", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OpenFlexiSuccDialog extends BaseChainResponsibilityDialog {

    @Nullable
    private TextView amountTv;

    @Nullable
    private TextView btnTv;

    @Nullable
    private ImageView close;

    @Nullable
    private TextView text1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OpenFlexiSuccDialog(@NotNull Context context) {
        super(context, p116hb.d.cs_cl_result_open_flexi_succ_dialog);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void findViews() {
        this.btnTv = (TextView) findViewById(p116hb.c.btnTv);
        this.amountTv = (TextView) findViewById(p116hb.c.amountTv);
        this.text1 = (TextView) findViewById(p116hb.c.text1);
        this.close = (ImageView) findViewById(p116hb.c.close);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(OpenFlexiSuccDialog openFlexiSuccDialog, View view) {
        Pa.n0.g().m(openFlexiSuccDialog.getClass().getSimpleName().concat("_element_click"), "FlexiResult Pay", "");
        openFlexiSuccDialog.dismiss();
        Pa.i0.b0(com.transsnet.palmpay.core.config.d.g("/flexi/ng/service-usage-manual"));
    }

    public final void fillData(long creditQuota) {
        show();
        TextView textView = this.amountTv;
        if (textView != null) {
            textView.setText(Pa.r0.A(creditQuota));
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseChainResponsibilityDialog
    public void handlerChain() {
        if (!SPUtils.getInstance().getBoolean(BaseApplication.getInstance().getUser().getPhoneNumber() + "_FINANCE_HOME_FLEXI_SHOWED", false)) {
            C0.G.h(p221ob.c.f40268a).queryPopUps(new QueryPopUpsReq(10)).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new W0(this));
            return;
        }
        BaseChainResponsibilityDialog nextChain = getNextChain();
        if (nextChain != null) {
            nextChain.handlerChain();
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        findViews();
        TextView textView = this.text1;
        if (textView != null) {
            textView.setText(getContext().getString(p116hb.f.cs_you_have_flexi_limit_of));
        }
        TextView textView2 = this.btnTv;
        if (textView2 != null) {
            textView2.setText(getContext().getString(p116hb.f.cs_view_flexi_limit_manual));
        }
        ImageView imageView = this.close;
        if (imageView != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.V0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OpenFlexiSuccDialog f30058b;

                {
                    this.f30058b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f30058b.dismiss();
                            break;
                        default:
                            OpenFlexiSuccDialog.initViews$lambda$1(this.f30058b, view);
                            break;
                    }
                }
            }, imageView);
        }
        TextView textView3 = this.btnTv;
        if (textView3 != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.V0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OpenFlexiSuccDialog f30058b;

                {
                    this.f30058b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f30058b.dismiss();
                            break;
                        default:
                            OpenFlexiSuccDialog.initViews$lambda$1(this.f30058b, view);
                            break;
                    }
                }
            }, textView3);
        }
    }
}
