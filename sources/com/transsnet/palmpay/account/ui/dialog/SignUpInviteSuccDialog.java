package com.transsnet.palmpay.account.ui.dialog;

import F8.d;
import F8.e;
import Nc.x;
import Pa.F;
import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0012BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/account/ui/dialog/SignUpInviteSuccDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "memberName", "fatherMemberName", FirebaseAnalytics.Param.CONTENT, "androidLinkUrl", "Lcom/transsnet/palmpay/account/ui/dialog/SignUpInviteSuccDialog$SignUpInviteJumpCoupon;", "signUpInviteJumpCoupon", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/account/ui/dialog/SignUpInviteSuccDialog$SignUpInviteJumpCoupon;)V", "", "initViews", "()V", "Ljava/lang/String;", "Lcom/transsnet/palmpay/account/ui/dialog/SignUpInviteSuccDialog$SignUpInviteJumpCoupon;", "SignUpInviteJumpCoupon", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SignUpInviteSuccDialog extends b {

    @Nullable
    private final String androidLinkUrl;

    @Nullable
    private final String content;

    @Nullable
    private final String fatherMemberName;

    @Nullable
    private final String memberName;

    @NotNull
    private final SignUpInviteJumpCoupon signUpInviteJumpCoupon;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/account/ui/dialog/SignUpInviteSuccDialog$SignUpInviteJumpCoupon;", "", "jumpCoupon", "", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface SignUpInviteJumpCoupon {
        void jumpCoupon();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpInviteSuccDialog(@Nullable Context context, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull SignUpInviteJumpCoupon signUpInviteJumpCoupon) {
        super(context, e.ac_dialog_sign_up_invite_succ);
        Intrinsics.checkNotNullParameter(signUpInviteJumpCoupon, "signUpInviteJumpCoupon");
        this.memberName = str;
        this.fatherMemberName = str2;
        this.content = str3;
        this.androidLinkUrl = str4;
        this.signUpInviteJumpCoupon = signUpInviteJumpCoupon;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(SignUpInviteSuccDialog signUpInviteSuccDialog, View view) {
        int id2 = view.getId();
        if (id2 != d.btnConfirm) {
            if (id2 == d.ivClose) {
                signUpInviteSuccDialog.dismiss();
                return;
            }
            return;
        }
        if (!TextUtils.isEmpty(signUpInviteSuccDialog.androidLinkUrl)) {
            ActivityUtils.startActivity(F.a(signUpInviteSuccDialog.getContext(), signUpInviteSuccDialog.androidLinkUrl));
        }
        signUpInviteSuccDialog.dismiss();
        SignUpInviteJumpCoupon signUpInviteJumpCoupon = signUpInviteSuccDialog.signUpInviteJumpCoupon;
        if (signUpInviteJumpCoupon != null) {
            signUpInviteJumpCoupon.jumpCoupon();
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        showAtBottom(getWindow());
        View viewFindViewById = findViewById(d.btnConfirm);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = findViewById(d.ivClose);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        View viewFindViewById3 = findViewById(d.tvTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        View viewFindViewById4 = findViewById(d.tvMsg);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        View viewFindViewById5 = findViewById(d.tvBottomDesc);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        h.q(new x(this, 18), viewFindViewById, viewFindViewById2);
        ((TextView) viewFindViewById3).setText(Html.fromHtml(this.memberName));
        ((TextView) viewFindViewById4).setText(Html.fromHtml(this.content));
        ((TextView) viewFindViewById5).setText(Html.fromHtml(this.fatherMemberName));
    }
}
