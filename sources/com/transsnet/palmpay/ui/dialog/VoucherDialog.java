package com.transsnet.palmpay.ui.dialog;

import Ac.e;
import Ac.f;
import Ac.h;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.LastPayerDataBean;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.ui.dialog.VoucherDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p025ba.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/ui/dialog/VoucherDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Lcom/transsnet/palmpay/core/bean/LastPayerDataBean;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Landroid/content/Context;Lcom/transsnet/palmpay/core/bean/LastPayerDataBean;)V", "", "initViews", "()V", "show", "Lcom/transsnet/palmpay/core/bean/LastPayerDataBean;", "getData", "()Lcom/transsnet/palmpay/core/bean/LastPayerDataBean;", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVoucherDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoucherDialog.kt\ncom/transsnet/palmpay/ui/dialog/VoucherDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
public final class VoucherDialog extends b {

    @Nullable
    private final LastPayerDataBean data;

    public VoucherDialog(@Nullable Context context, @Nullable LastPayerDataBean lastPayerDataBean) {
        super(context, f.main_layout_voucher_dialog);
        this.data = lastPayerDataBean;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(VoucherDialog voucherDialog, View view) {
        Postcard postcardBuild = ARouter.getInstance().build("/smorder/detail");
        LastPayerDataBean lastPayerDataBean = voucherDialog.data;
        postcardBuild.withString("orderId", lastPayerDataBean != null ? lastPayerDataBean.orderId : null).navigation();
        voucherDialog.dismiss();
    }

    @Nullable
    public final LastPayerDataBean getData() {
        return this.data;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        Long l5;
        showAtCenter(getWindow(), l.dialog_fade_in_out);
        ImageView imageView = (ImageView) findViewById(e.ivAvatar);
        LastPayerDataBean lastPayerDataBean = this.data;
        r0.h1(imageView, lastPayerDataBean != null ? lastPayerDataBean.senderHeadImage : null, r.cv_avatar_default);
        ImageView imageView2 = (ImageView) findViewById(e.ivIcon);
        LastPayerDataBean lastPayerDataBean2 = this.data;
        imageView2.setVisibility((lastPayerDataBean2 == null || lastPayerDataBean2.authenType != 0) ? 0 : 8);
        LastPayerDataBean lastPayerDataBean3 = this.data;
        if (!TextUtils.isEmpty(lastPayerDataBean3 != null ? lastPayerDataBean3.senderNickname : null)) {
            TextView textView = (TextView) findViewById(e.tvName);
            Context context = getContext();
            int i7 = h.main_x_sent_you_x;
            LastPayerDataBean lastPayerDataBean4 = this.data;
            textView.setText(context.getString(i7, lastPayerDataBean4 != null ? lastPayerDataBean4.senderNickname : null, (lastPayerDataBean4 == null || (l5 = lastPayerDataBean4.amount) == null) ? null : r0.B(l5.longValue(), true)));
        }
        LastPayerDataBean lastPayerDataBean5 = this.data;
        Long l6 = lastPayerDataBean5 != null ? lastPayerDataBean5.amount : null;
        Intrinsics.e(l6);
        double dH = r0.h(l6.longValue());
        ((TextView) findViewById(e.tvAmount)).setText("₦" + dH);
        View viewFindViewById = findViewById(e.ivClose);
        if (viewFindViewById != null) {
            final int i10 = 0;
            viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: Ae.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ VoucherDialog f311b;

                {
                    this.f311b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f311b.dismiss();
                            break;
                        default:
                            VoucherDialog.initViews$lambda$2(this.f311b, view);
                            break;
                    }
                }
            });
        }
        View viewFindViewById2 = findViewById(e.btnConfirm);
        if (viewFindViewById2 != null) {
            final int i11 = 1;
            viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: Ae.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ VoucherDialog f311b;

                {
                    this.f311b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            this.f311b.dismiss();
                            break;
                        default:
                            VoucherDialog.initViews$lambda$2(this.f311b, view);
                            break;
                    }
                }
            });
        }
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        if (this.data != null) {
            super.show();
        }
    }
}
