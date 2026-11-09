package com.transsnet.palmpay.ui.dialog.reward;

import Ac.e;
import Ac.f;
import Pa.r0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.PalmZoneChainProgressPopup;
import com.transsnet.palmpay.main.export.bean.rsp.RewardDisplay;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0012R\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/transsnet/palmpay/ui/dialog/reward/PalmZoneChainProgressDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/transsnet/palmpay/main/export/bean/rsp/PalmZoneChainProgressPopup;", "popup", "", "buildMessageText", "(Lcom/transsnet/palmpay/main/export/bean/rsp/PalmZoneChainProgressPopup;)Ljava/lang/CharSequence;", "", "initViews", "()V", "updateUi", "(Lcom/transsnet/palmpay/main/export/bean/rsp/PalmZoneChainProgressPopup;)V", "Landroid/widget/ImageView;", "ivHeader", "Landroid/widget/ImageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "clCard", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View;", "ivClose", "Landroid/view/View;", "Landroid/widget/TextView;", "tvTitle", "Landroid/widget/TextView;", "tvMessage", "clTomorrowBadge", "tvTomorrowReward", "ivTomorrowIcon", "Lcom/palmpay/lib/ui/button/PpButton;", "btnOk", "Lcom/palmpay/lib/ui/button/PpButton;", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPalmZoneChainProgressDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PalmZoneChainProgressDialog.kt\ncom/transsnet/palmpay/ui/dialog/reward/PalmZoneChainProgressDialog\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,127:1\n257#2,2:128\n*S KotlinDebug\n*F\n+ 1 PalmZoneChainProgressDialog.kt\ncom/transsnet/palmpay/ui/dialog/reward/PalmZoneChainProgressDialog\n*L\n85#1:128,2\n*E\n"})
public final class PalmZoneChainProgressDialog extends b {

    @Nullable
    private PpButton btnOk;

    @Nullable
    private ConstraintLayout clCard;

    @Nullable
    private ConstraintLayout clTomorrowBadge;

    @Nullable
    private View ivClose;

    @Nullable
    private ImageView ivHeader;

    @Nullable
    private ImageView ivTomorrowIcon;

    @Nullable
    private TextView tvMessage;

    @Nullable
    private TextView tvTitle;

    @Nullable
    private TextView tvTomorrowReward;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PalmZoneChainProgressDialog(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final CharSequence buildMessageText(PalmZoneChainProgressPopup popup) {
        String str = popup.message;
        if (str == null) {
            str = "";
        }
        String str2 = popup.todayRewardText;
        String str3 = str2 != null ? str2 : "";
        if (str3.length() == 0 || TextUtils.isEmpty(popup.message) || !y.m(str, str3, false)) {
            return str;
        }
        int iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorPrimary, getContext());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(iColorInt), 0, str3.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(PalmZoneChainProgressDialog palmZoneChainProgressDialog, View view) {
        if (r0.U0()) {
            return;
        }
        int id2 = view.getId();
        if (id2 == e.ivClose || id2 == e.btnOk) {
            palmZoneChainProgressDialog.dismiss();
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        WindowManager.LayoutParams attributes;
        WindowManager.LayoutParams attributes2;
        int i7 = 17;
        setContentView(f.main_dialog_palmzone_chain_progress);
        this.ivHeader = (ImageView) findViewById(e.ivHeader);
        this.clCard = (ConstraintLayout) findViewById(e.clCard);
        this.ivClose = findViewById(e.ivClose);
        this.tvTitle = (TextView) findViewById(e.tvTitle);
        this.tvMessage = (TextView) findViewById(e.tvMessage);
        this.clTomorrowBadge = (ConstraintLayout) findViewById(e.clTomorrowBadge);
        this.tvTomorrowReward = (TextView) findViewById(e.tvTomorrowReward);
        this.btnOk = (PpButton) findViewById(e.btnOk);
        this.ivTomorrowIcon = (ImageView) findViewById(e.ivTomorrowIcon);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        if (window != null && (attributes2 = window.getAttributes()) != null) {
            attributes2.width = (int) (ScreenUtils.getScreenWidth() * 0.9f);
        }
        if (window != null && (attributes = window.getAttributes()) != null) {
            attributes.height = -2;
        }
        h.q(new A8.b(this, i7), this.ivClose, this.btnOk);
    }

    public final void updateUi(@Nullable PalmZoneChainProgressPopup popup) {
        RewardDisplay rewardDisplay;
        if (popup == null) {
            dismiss();
            return;
        }
        boolean zC = Intrinsics.c(popup.showTomorrowBadge, Boolean.TRUE);
        ConstraintLayout constraintLayout = this.clTomorrowBadge;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(zC ? 0 : 8);
        }
        TextView textView = this.tvTitle;
        if (textView != null) {
            String str = popup.title;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
        }
        TextView textView2 = this.tvMessage;
        if (textView2 != null) {
            textView2.setText(buildMessageText(popup));
        }
        if (!zC || (rewardDisplay = popup.tomorrowRewardDisplay) == null) {
            return;
        }
        TextView textView3 = this.tvTomorrowReward;
        if (textView3 != null) {
            String str2 = rewardDisplay != null ? rewardDisplay.displayText : null;
            textView3.setText(str2 != null ? str2 : "");
        }
        ImageView imageView = this.ivTomorrowIcon;
        RewardDisplay rewardDisplay2 = popup.tomorrowRewardDisplay;
        r0.h1(imageView, rewardDisplay2 != null ? rewardDisplay2.icon : null, r.cv_palmpay_icon_yellow);
    }
}
