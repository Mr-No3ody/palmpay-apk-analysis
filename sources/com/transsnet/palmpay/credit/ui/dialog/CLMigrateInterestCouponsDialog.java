package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.IntentUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLMigrateInterestCouponsDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$MigrateAppInfo;", "migrateAppInfo", "<init>", "(Landroid/content/Context;Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$MigrateAppInfo;)V", "", "findViews", "()V", "initViews", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$MigrateAppInfo;", "Landroid/widget/TextView;", "tv_download", "Landroid/widget/TextView;", "tv_coupon_count_off", "Landroid/widget/ImageView;", "iv_close", "Landroid/widget/ImageView;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLMigrateInterestCouponsDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @Nullable
    private ImageView iv_close;

    @Nullable
    private QueryLoanDialogPopUpsBean.MigrateAppInfo migrateAppInfo;

    @Nullable
    private TextView tv_coupon_count_off;

    @Nullable
    private TextView tv_download;

    public CLMigrateInterestCouponsDialog(@Nullable Context context, @Nullable QueryLoanDialogPopUpsBean.MigrateAppInfo migrateAppInfo) {
        super(context, p116hb.d.cs_cl_migrate_interest_coupons_dialog_layout);
        this.migrateAppInfo = migrateAppInfo;
    }

    private final void findViews() {
        this.tv_download = (TextView) findViewById(p116hb.c.tv_download);
        this.tv_coupon_count_off = (TextView) findViewById(p116hb.c.tv_coupon_count_off);
        this.iv_close = (ImageView) findViewById(p116hb.c.iv_close);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$3(CLMigrateInterestCouponsDialog cLMigrateInterestCouponsDialog, View view) {
        QueryLoanDialogPopUpsBean.MigrateAppInfo migrateAppInfo = cLMigrateInterestCouponsDialog.migrateAppInfo;
        if (migrateAppInfo != null) {
            if (AppUtils.isAppInstalled("com.legend.cash")) {
                Pa.i0.Z(cLMigrateInterestCouponsDialog.getContext());
            } else if ("OUTER".equals(migrateAppInfo.getUrlRedirectType())) {
                ActivityUtils.startActivity(IntentUtils.getOpenUrlIntent(migrateAppInfo.getCashAppDownloadUrl(), true));
            } else {
                Pa.i0.c0(migrateAppInfo.getCashAppDownloadUrl());
            }
        }
        cLMigrateInterestCouponsDialog.dismiss();
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        String couponDiscountInfo;
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
        TextView textView = this.tv_coupon_count_off;
        if (textView != null) {
            SpanUtils spanUtils = new SpanUtils();
            QueryLoanDialogPopUpsBean.MigrateAppInfo migrateAppInfo = this.migrateAppInfo;
            if (migrateAppInfo == null || (couponDiscountInfo = migrateAppInfo.getCouponDiscountInfo()) == null) {
                couponDiscountInfo = "0";
            }
            textView.setText(spanUtils.append(couponDiscountInfo).append("% OFF").create());
        }
        ImageView imageView = this.iv_close;
        if (imageView != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.J

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLMigrateInterestCouponsDialog f29985b;

                {
                    this.f29985b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f29985b.dismiss();
                            break;
                        default:
                            CLMigrateInterestCouponsDialog.initViews$lambda$3(this.f29985b, view);
                            break;
                    }
                }
            }, imageView);
        }
        TextView textView2 = this.tv_download;
        if (textView2 != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.J

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLMigrateInterestCouponsDialog f29985b;

                {
                    this.f29985b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f29985b.dismiss();
                            break;
                        default:
                            CLMigrateInterestCouponsDialog.initViews$lambda$3(this.f29985b, view);
                            break;
                    }
                }
            }, textView2);
        }
    }
}
