package com.transsnet.palmpay.core.ui.dialog;

import Ce.ViewOnClickListenerC0159a;
import android.content.Context;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.ui.widget.BillDetailProcessDataWedgit;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.w;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.e;
import p025ba.g;
import p025ba.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/core/ui/dialog/BillDetailProcessDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "changeDialogHeight", "()V", "initViews", "Lcom/transsnet/palmpay/core/bean/BillProcessDetail;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "fillData", "(Lcom/transsnet/palmpay/core/bean/BillProcessDetail;)V", "Landroid/widget/ImageView;", "mIvClose", "Landroid/widget/ImageView;", "Lcom/transsnet/palmpay/core/ui/widget/BillDetailProcessDataWedgit;", "mBillDetailProcess", "Lcom/transsnet/palmpay/core/ui/widget/BillDetailProcessDataWedgit;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BillDetailProcessDialog extends b {

    @Nullable
    private BillDetailProcessDataWedgit mBillDetailProcess;

    @Nullable
    private ImageView mIvClose;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillDetailProcessDialog(@NotNull Context context) {
        super(context, g.core_layout_bill_detail_process_dialog, w.BaseDialogTheme);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void changeDialogHeight() {
        Window window = getWindow();
        Intrinsics.e(window);
        window.setGravity(80);
        window.setWindowAnimations(l.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        attributes.height = -2;
        window.setAttributes(attributes);
    }

    public final void fillData(@Nullable BillProcessDetail data) {
        BillDetailProcessDataWedgit billDetailProcessDataWedgit = this.mBillDetailProcess;
        if (billDetailProcessDataWedgit != null) {
            billDetailProcessDataWedgit.f();
        }
        BillDetailProcessDataWedgit billDetailProcessDataWedgit2 = this.mBillDetailProcess;
        if (billDetailProcessDataWedgit2 != null) {
            billDetailProcessDataWedgit2.e(true);
        }
        BillDetailProcessDataWedgit billDetailProcessDataWedgit3 = this.mBillDetailProcess;
        if (billDetailProcessDataWedgit3 != null) {
            billDetailProcessDataWedgit3.c(data);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        this.mIvClose = (ImageView) findViewById(e.ivClose);
        this.mBillDetailProcess = (BillDetailProcessDataWedgit) findViewById(e.bdpd_bill_process);
        ImageView imageView = this.mIvClose;
        if (imageView != null) {
            imageView.setOnClickListener(new ViewOnClickListenerC0159a(this, 29));
        }
        changeDialogHeight();
    }
}
