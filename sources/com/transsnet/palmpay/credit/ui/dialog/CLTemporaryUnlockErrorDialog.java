package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.BaseApplication;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\nR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLTemporaryUnlockErrorDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "errorMsg", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "", "setListener", "()V", "jump2ServicePage", "initViews", "Ljava/lang/String;", "getErrorMsg", "()Ljava/lang/String;", "setErrorMsg", "(Ljava/lang/String;)V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLTemporaryUnlockErrorDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @Nullable
    private String errorMsg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CLTemporaryUnlockErrorDialog(@NotNull Context context, @Nullable String str) {
        super(context, Ya.f.cs_cl_temporary_unlock_error_dialog);
        Intrinsics.checkNotNullParameter(context, "context");
        this.errorMsg = str;
    }

    private final void jump2ServicePage() {
        String strG = com.transsnet.palmpay.core.config.d.g("/h5/help/main?cardNo=%1$s&deviceTag=%2$s&loanProduct=%3$s&phone=%4$s");
        Intrinsics.checkNotNullExpressionValue(strG, "getH5Url(...)");
        String str = String.format(strG, Arrays.copyOf(new Object[]{"", "", "OK_CARD", BaseApplication.get().getUser().getPhoneNumber()}, 4));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Pa.i0.c0(str);
    }

    private final void setListener() {
        View viewFindViewById = findViewById(Ya.e.iivClose);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        final int i7 = 0;
        p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTemporaryUnlockErrorDialog f30094b;

            {
                this.f30094b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.f30094b.dismiss();
                        break;
                    case 1:
                        CLTemporaryUnlockErrorDialog.setListener$lambda$1(this.f30094b, view);
                        break;
                    default:
                        CLTemporaryUnlockErrorDialog.setListener$lambda$2(this.f30094b, view);
                        break;
                }
            }
        }, viewFindViewById);
        View viewFindViewById2 = findViewById(Ya.e.btnRepay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        final int i10 = 1;
        p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTemporaryUnlockErrorDialog f30094b;

            {
                this.f30094b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f30094b.dismiss();
                        break;
                    case 1:
                        CLTemporaryUnlockErrorDialog.setListener$lambda$1(this.f30094b, view);
                        break;
                    default:
                        CLTemporaryUnlockErrorDialog.setListener$lambda$2(this.f30094b, view);
                        break;
                }
            }
        }, viewFindViewById2);
        View viewFindViewById3 = findViewById(Ya.e.tvCustomerService);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        final int i11 = 2;
        p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTemporaryUnlockErrorDialog f30094b;

            {
                this.f30094b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f30094b.dismiss();
                        break;
                    case 1:
                        CLTemporaryUnlockErrorDialog.setListener$lambda$1(this.f30094b, view);
                        break;
                    default:
                        CLTemporaryUnlockErrorDialog.setListener$lambda$2(this.f30094b, view);
                        break;
                }
            }
        }, viewFindViewById3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$1(CLTemporaryUnlockErrorDialog cLTemporaryUnlockErrorDialog, View view) {
        com.palmpay.lib.apm.launchcounter.util.d.x(null, "MobileInstallmentRepaymentHome");
        cLTemporaryUnlockErrorDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2(CLTemporaryUnlockErrorDialog cLTemporaryUnlockErrorDialog, View view) {
        cLTemporaryUnlockErrorDialog.jump2ServicePage();
        cLTemporaryUnlockErrorDialog.dismiss();
    }

    @Nullable
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        ((TextView) findViewById(Ya.e.tvExpireTips)).setText(this.errorMsg);
        setListener();
    }

    public final void setErrorMsg(@Nullable String str) {
        this.errorMsg = str;
    }
}
