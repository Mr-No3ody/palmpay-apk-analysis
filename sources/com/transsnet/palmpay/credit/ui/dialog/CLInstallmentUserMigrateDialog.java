package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.core.interfaces.ILoanCreditService;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLInstallmentUserMigrateDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "ifJointDebit", "", "loanProduct", "<init>", "(Landroid/content/Context;ZLjava/lang/String;)V", "", "findViews", "()V", "initViews", "Z", "Ljava/lang/String;", "Landroid/widget/Button;", "btn_installment_user_migrate_btn", "Landroid/widget/Button;", "Landroid/widget/TextView;", "tv_installment_user_migrate_content", "Landroid/widget/TextView;", "Landroid/widget/ImageView;", "iv_installment_user_migrate_title", "Landroid/widget/ImageView;", "iv_installment_user_migrate_close", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLInstallmentUserMigrateDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @Nullable
    private Button btn_installment_user_migrate_btn;
    private final boolean ifJointDebit;

    @Nullable
    private ImageView iv_installment_user_migrate_close;

    @Nullable
    private ImageView iv_installment_user_migrate_title;

    @Nullable
    private final String loanProduct;

    @Nullable
    private TextView tv_installment_user_migrate_content;

    public /* synthetic */ CLInstallmentUserMigrateDialog(Context context, boolean z3, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? false : z3, (i7 & 4) != 0 ? null : str);
    }

    private final void findViews() {
        this.btn_installment_user_migrate_btn = (Button) findViewById(p116hb.c.btn_installment_user_migrate_btn);
        this.tv_installment_user_migrate_content = (TextView) findViewById(p116hb.c.tv_installment_user_migrate_content);
        this.iv_installment_user_migrate_title = (ImageView) findViewById(p116hb.c.iv_installment_user_migrate_title);
        this.iv_installment_user_migrate_close = (ImageView) findViewById(p116hb.c.iv_installment_user_migrate_close);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$3(CLInstallmentUserMigrateDialog cLInstallmentUserMigrateDialog, View view) {
        cLInstallmentUserMigrateDialog.dismiss();
        if (TextUtils.isEmpty(cLInstallmentUserMigrateDialog.loanProduct)) {
            N8.q0.v("/main/home", "tab", "finance");
            return;
        }
        androidx.fragment.app.E activity = cLInstallmentUserMigrateDialog.getActivity(cLInstallmentUserMigrateDialog.getContext());
        if (activity != null) {
            ILoanCreditService iLoanCreditService = (ILoanCreditService) com.horcrux.svg.d0.m("/credit_score/loan_credit_service", "null cannot be cast to non-null type com.transsnet.palmpay.core.interfaces.ILoanCreditService");
            androidx.fragment.app.Z supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            iLoanCreditService.startBorrow(supportFragmentManager, cLInstallmentUserMigrateDialog.loanProduct, (124 & 4) != 0 ? null : null, (124 & 8) != 0 ? null : 2, (124 & 16) != 0 ? null : null, null, null);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        findViews();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
            window.setWindowAnimations(p025ba.l.dialog_bottom_in_out);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = ScreenUtils.getScreenWidth() - CommonViewExtKt.getDp(48);
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        ImageView imageView = this.iv_installment_user_migrate_title;
        if (imageView != null) {
            imageView.setImageResource(this.ifJointDebit ? p116hb.b.cs_cl_received_multiple_loan_services : p116hb.b.cs_cl_borrowing_multiple_services_online);
        }
        TextView textView = this.tv_installment_user_migrate_content;
        if (textView != null) {
            textView.setText(getContext().getString(this.ifJointDebit ? p116hb.f.cs_cl_installment_user_migrate_content_join_debit : p116hb.f.cs_cl_installment_user_migrate_content_no_join_debit));
        }
        Button button = this.btn_installment_user_migrate_btn;
        if (button != null) {
            button.setText(getContext().getString(this.ifJointDebit ? p116hb.f.cs_cl_borrow : p025ba.k.core_ok));
        }
        ImageView imageView2 = this.iv_installment_user_migrate_close;
        if (imageView2 != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.E

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLInstallmentUserMigrateDialog f29963b;

                {
                    this.f29963b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f29963b.dismiss();
                            break;
                        default:
                            CLInstallmentUserMigrateDialog.initViews$lambda$3(this.f29963b, view);
                            break;
                    }
                }
            }, imageView2);
        }
        Button button2 = this.btn_installment_user_migrate_btn;
        if (button2 != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.E

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLInstallmentUserMigrateDialog f29963b;

                {
                    this.f29963b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f29963b.dismiss();
                            break;
                        default:
                            CLInstallmentUserMigrateDialog.initViews$lambda$3(this.f29963b, view);
                            break;
                    }
                }
            }, button2);
        }
    }

    public CLInstallmentUserMigrateDialog(@Nullable Context context, boolean z3, @Nullable String str) {
        super(context, p116hb.d.cs_cl_installment_user_migrate_dialog_layout);
        this.ifJointDebit = z3;
        this.loanProduct = str;
    }
}
