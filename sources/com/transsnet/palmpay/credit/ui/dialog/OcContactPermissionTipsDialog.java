package com.transsnet.palmpay.credit.ui.dialog;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcContactActivity;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u00062\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/OcContactPermissionTipsDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcContactActivity;", "activity", "<init>", "(Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcContactActivity;)V", "", "initViews", "()V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", FirebaseAnalytics.Param.CONTENT, "setContent", "(Ljava/lang/StringBuilder;)V", "Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcContactActivity;", "Landroid/widget/Button;", "no_permission_sure_bt$delegate", "Lkotlin/Lazy;", "getNo_permission_sure_bt", "()Landroid/widget/Button;", "no_permission_sure_bt", "Landroid/widget/TextView;", "permission_content_tv$delegate", "getPermission_content_tv", "()Landroid/widget/TextView;", "permission_content_tv", "Landroid/widget/ImageView;", "no_permission_closeI_img$delegate", "getNo_permission_closeI_img", "()Landroid/widget/ImageView;", "no_permission_closeI_img", "mContent", "Ljava/lang/StringBuilder;", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcContactPermissionTipsDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @NotNull
    private final OcContactActivity activity;

    @Nullable
    private StringBuilder mContent;

    /* JADX INFO: renamed from: no_permission_closeI_img$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy no_permission_closeI_img;

    /* JADX INFO: renamed from: no_permission_sure_bt$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy no_permission_sure_bt;

    /* JADX INFO: renamed from: permission_content_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy permission_content_tv;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcContactPermissionTipsDialog(@NotNull OcContactActivity activity) {
        super(activity, Ya.f.cs_contact_permission_tips_dialog_layout);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        final int i7 = 0;
        this.no_permission_sure_bt = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.u0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactPermissionTipsDialog f30208b;

            {
                this.f30208b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return OcContactPermissionTipsDialog.no_permission_sure_bt_delegate$lambda$0(this.f30208b);
                    case 1:
                        return OcContactPermissionTipsDialog.permission_content_tv_delegate$lambda$1(this.f30208b);
                    default:
                        return OcContactPermissionTipsDialog.no_permission_closeI_img_delegate$lambda$2(this.f30208b);
                }
            }
        });
        final int i10 = 1;
        this.permission_content_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.u0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactPermissionTipsDialog f30208b;

            {
                this.f30208b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return OcContactPermissionTipsDialog.no_permission_sure_bt_delegate$lambda$0(this.f30208b);
                    case 1:
                        return OcContactPermissionTipsDialog.permission_content_tv_delegate$lambda$1(this.f30208b);
                    default:
                        return OcContactPermissionTipsDialog.no_permission_closeI_img_delegate$lambda$2(this.f30208b);
                }
            }
        });
        final int i11 = 2;
        this.no_permission_closeI_img = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.u0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcContactPermissionTipsDialog f30208b;

            {
                this.f30208b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return OcContactPermissionTipsDialog.no_permission_sure_bt_delegate$lambda$0(this.f30208b);
                    case 1:
                        return OcContactPermissionTipsDialog.permission_content_tv_delegate$lambda$1(this.f30208b);
                    default:
                        return OcContactPermissionTipsDialog.no_permission_closeI_img_delegate$lambda$2(this.f30208b);
                }
            }
        });
    }

    private final ImageView getNo_permission_closeI_img() {
        return (ImageView) this.no_permission_closeI_img.getValue();
    }

    private final Button getNo_permission_sure_bt() {
        return (Button) this.no_permission_sure_bt.getValue();
    }

    private final TextView getPermission_content_tv() {
        return (TextView) this.permission_content_tv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$3(OcContactPermissionTipsDialog ocContactPermissionTipsDialog, View view) {
        OcContactActivity ocContactActivity = ocContactPermissionTipsDialog.activity;
        int i7 = OcContactActivity.f29378l1;
        ocContactActivity.y();
        ocContactPermissionTipsDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$4(OcContactPermissionTipsDialog ocContactPermissionTipsDialog, View view) {
        OcContactActivity ocContactActivity = ocContactPermissionTipsDialog.activity;
        int i7 = OcContactActivity.f29378l1;
        ocContactActivity.y();
        ocContactPermissionTipsDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView no_permission_closeI_img_delegate$lambda$2(OcContactPermissionTipsDialog ocContactPermissionTipsDialog) {
        return (ImageView) ocContactPermissionTipsDialog.findViewById(Ya.e.no_permission_closeI_img);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button no_permission_sure_bt_delegate$lambda$0(OcContactPermissionTipsDialog ocContactPermissionTipsDialog) {
        return (Button) ocContactPermissionTipsDialog.findViewById(Ya.e.no_permission_sure_bt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView permission_content_tv_delegate$lambda$1(OcContactPermissionTipsDialog ocContactPermissionTipsDialog) {
        return (TextView) ocContactPermissionTipsDialog.findViewById(Ya.e.permission_content_tv);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        TextView permission_content_tv;
        setCancelable(false);
        if (!TextUtils.isEmpty(this.mContent) && (permission_content_tv = getPermission_content_tv()) != null) {
            permission_content_tv.setText(this.mContent);
        }
        ImageView no_permission_closeI_img = getNo_permission_closeI_img();
        if (no_permission_closeI_img != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.v0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcContactPermissionTipsDialog f30212b;

                {
                    this.f30212b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            OcContactPermissionTipsDialog.initViews$lambda$3(this.f30212b, view);
                            break;
                        default:
                            OcContactPermissionTipsDialog.initViews$lambda$4(this.f30212b, view);
                            break;
                    }
                }
            }, no_permission_closeI_img);
        }
        Button no_permission_sure_bt = getNo_permission_sure_bt();
        if (no_permission_sure_bt != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.v0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcContactPermissionTipsDialog f30212b;

                {
                    this.f30212b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            OcContactPermissionTipsDialog.initViews$lambda$3(this.f30212b, view);
                            break;
                        default:
                            OcContactPermissionTipsDialog.initViews$lambda$4(this.f30212b, view);
                            break;
                    }
                }
            }, no_permission_sure_bt);
        }
    }

    public final void setContent(@Nullable StringBuilder content) {
        this.mContent = content;
    }
}
