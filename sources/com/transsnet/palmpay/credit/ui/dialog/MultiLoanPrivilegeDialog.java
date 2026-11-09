package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import com.adjust.sdk.Constants;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.credit.bean.MultiLoanInfo;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/MultiLoanPrivilegeDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "isNewHome", "Lcom/transsnet/palmpay/credit/bean/MultiLoanInfo;", Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH, "Lkotlin/Function0;", "", "onCtaClick", "<init>", "(Landroid/content/Context;ZLcom/transsnet/palmpay/credit/bean/MultiLoanInfo;Lkotlin/jvm/functions/Function0;)V", "applyThemeColors", "()V", "", "viewId", "colorRes", "tintCircleBackground", "(II)V", "initViews", "Z", "Lcom/transsnet/palmpay/credit/bean/MultiLoanInfo;", "Lkotlin/jvm/functions/Function0;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MultiLoanPrivilegeDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @NotNull
    private final MultiLoanInfo info;
    private final boolean isNewHome;

    @NotNull
    private final Function0<Unit> onCtaClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiLoanPrivilegeDialog(@Nullable Context context, boolean z3, @NotNull MultiLoanInfo info, @NotNull Function0<Unit> onCtaClick) {
        super(context, p116hb.d.cs_multi_loan_privilege_dialog);
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(onCtaClick, "onCtaClick");
        this.isNewHome = z3;
        this.info = info;
        this.onCtaClick = onCtaClick;
    }

    private final void applyThemeColors() {
        int i7 = this.isNewHome ? L6.b.ppColorFlexiCashPrimary : L6.b.ppColorFlexiCashPrimary;
        int color = getContext().getColor(i7);
        PpButton ppButton = (PpButton) findViewById(p116hb.c.btnCta);
        if (ppButton != null) {
            ppButton.setBackgroundTintList(ColorStateList.valueOf(color));
        }
        tintCircleBackground(p116hb.c.viewIconCircleLeft, i7);
        tintCircleBackground(p116hb.c.viewIconCircleRight, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$4$lambda$3(MultiLoanPrivilegeDialog multiLoanPrivilegeDialog, View view) {
        multiLoanPrivilegeDialog.onCtaClick.invoke();
        multiLoanPrivilegeDialog.dismiss();
    }

    private final void tintCircleBackground(int viewId, @ColorRes int colorRes) {
        View viewFindViewById = findViewById(viewId);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundTintList(ColorStateList.valueOf(getContext().getColor(colorRes)));
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = ScreenUtils.getScreenWidth();
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        String string = this.isNewHome ? getContext().getString(p116hb.f.cs_multi_loan_popup_header_new) : getContext().getString(p116hb.f.cs_multi_loan_popup_header_old);
        Intrinsics.e(string);
        ImageView imageView = (ImageView) findViewById(p116hb.c.ivHeader);
        if (imageView != null) {
            Pa.r0.l1(string, imageView);
        }
        TextView textView = (TextView) findViewById(p116hb.c.tvSummary);
        if (textView != null) {
            p220oa.h.f(textView, this.info.getPopupSummary());
        }
        applyThemeColors();
        PpButton ppButton = (PpButton) findViewById(p116hb.c.btnCta);
        if (ppButton != null) {
            ppButton.setText(this.info.getPopupCtaText());
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.o0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MultiLoanPrivilegeDialog f30173b;

                {
                    this.f30173b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            MultiLoanPrivilegeDialog.initViews$lambda$4$lambda$3(this.f30173b, view);
                            break;
                        default:
                            this.f30173b.dismiss();
                            break;
                    }
                }
            }, ppButton);
        }
        View viewFindViewById = findViewById(p116hb.c.ivClose);
        if (viewFindViewById != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.o0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MultiLoanPrivilegeDialog f30173b;

                {
                    this.f30173b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            MultiLoanPrivilegeDialog.initViews$lambda$4$lambda$3(this.f30173b, view);
                            break;
                        default:
                            this.f30173b.dismiss();
                            break;
                    }
                }
            }, viewFindViewById);
        }
    }
}
