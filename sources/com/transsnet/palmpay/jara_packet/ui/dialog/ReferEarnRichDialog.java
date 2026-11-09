package com.transsnet.palmpay.jara_packet.ui.dialog;

import Pa.n0;
import android.content.Context;
import com.transsnet.palmpay.custom_view.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p236pc.c;
import p236pc.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/ui/dialog/ReferEarnRichDialog;", "Lcom/transsnet/palmpay/jara_packet/ui/dialog/RichTextDialog;", "Landroid/content/Context;", "context", "", "type", "Lcom/transsnet/palmpay/jara_packet/ui/dialog/RichTextDialog$ConfirmInterface;", "confirmInterface", "<init>", "(Landroid/content/Context;ILcom/transsnet/palmpay/jara_packet/ui/dialog/RichTextDialog$ConfirmInterface;)V", "", "initViews", "()V", "I", "getType", "()I", "Lcom/transsnet/palmpay/jara_packet/ui/dialog/RichTextDialog$ConfirmInterface;", "getConfirmInterface", "()Lcom/transsnet/palmpay/jara_packet/ui/dialog/RichTextDialog$ConfirmInterface;", "Companion", "a", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReferEarnRichDialog extends RichTextDialog {

    @NotNull
    private final RichTextDialog.ConfirmInterface confirmInterface;
    private final int type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int RE_TYPE_UPGRADE = 1;
    private static final int RE_TYPE_WITHDRAW_SUCC = 2;
    private static final int RE_TYPE_WITHDRAW_FAIL_RISK = 3;
    private static final int RE_TYPE_RETAIN = 4;
    private static final int RE_TYPE_ENABLE_ORDER_DISABLE = 5;
    private static final int RE_TYPE_ENALBE_ORDER_CONFIRM = 6;
    private static final int RE_TYPE_WITHDRAW_SUCC_BIND = 7;
    private static final int RE_TYPE_WITHDRAW_SUCC_COMMENT = 8;
    private static final int RE_TYPE_WITHDRAW_SUCC_RATE = 9;
    private static final int RE_TYPE_WITHDRAW_MANUAL_REVIEW = 10;
    private static final int RE_TYPE_REAL_NAME_RATE = 11;

    /* JADX INFO: renamed from: com.transsnet.palmpay.jara_packet.ui.dialog.ReferEarnRichDialog$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getRE_TYPE_ENABLE_ORDER_DISABLE() {
            return ReferEarnRichDialog.RE_TYPE_ENABLE_ORDER_DISABLE;
        }

        public final int getRE_TYPE_ENALBE_ORDER_CONFIRM() {
            return ReferEarnRichDialog.RE_TYPE_ENALBE_ORDER_CONFIRM;
        }

        public final int getRE_TYPE_REAL_NAME_RATE() {
            return ReferEarnRichDialog.RE_TYPE_REAL_NAME_RATE;
        }

        public final int getRE_TYPE_RETAIN() {
            return ReferEarnRichDialog.RE_TYPE_RETAIN;
        }

        public final int getRE_TYPE_UPGRADE() {
            return ReferEarnRichDialog.RE_TYPE_UPGRADE;
        }

        public final int getRE_TYPE_WITHDRAW_FAIL_RISK() {
            return ReferEarnRichDialog.RE_TYPE_WITHDRAW_FAIL_RISK;
        }

        public final int getRE_TYPE_WITHDRAW_MANUAL_REVIEW() {
            return ReferEarnRichDialog.RE_TYPE_WITHDRAW_MANUAL_REVIEW;
        }

        public final int getRE_TYPE_WITHDRAW_SUCC() {
            return ReferEarnRichDialog.RE_TYPE_WITHDRAW_SUCC;
        }

        public final int getRE_TYPE_WITHDRAW_SUCC_BIND() {
            return ReferEarnRichDialog.RE_TYPE_WITHDRAW_SUCC_BIND;
        }

        public final int getRE_TYPE_WITHDRAW_SUCC_COMMENT() {
            return ReferEarnRichDialog.RE_TYPE_WITHDRAW_SUCC_COMMENT;
        }

        public final int getRE_TYPE_WITHDRAW_SUCC_RATE() {
            return ReferEarnRichDialog.RE_TYPE_WITHDRAW_SUCC_RATE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferEarnRichDialog(@NotNull Context context, int i7, @NotNull RichTextDialog.ConfirmInterface confirmInterface) {
        super(context, confirmInterface);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(confirmInterface, "confirmInterface");
        this.type = i7;
        this.confirmInterface = confirmInterface;
    }

    @NotNull
    public final RichTextDialog.ConfirmInterface getConfirmInterface() {
        return this.confirmInterface;
    }

    public final int getType() {
        return this.type;
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog, com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        super.initViews();
        int i7 = this.type;
        if (i7 == RE_TYPE_UPGRADE) {
            n0.g().m("event_track_dialog_screen", "Reward Upgrade", "");
            setTopImageView(c.jp_cash_dialog_top_upgrade);
            setTitle(getContext().getString(f.jp_reward_upgrade));
            return;
        }
        if (i7 == RE_TYPE_WITHDRAW_SUCC) {
            setTopImageView(c.jp_cash_dialog_top_withdraw_succ);
            setTitle(getContext().getString(f.jp_congratulations));
            String string = getContext().getString(f.jp_view_now);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = getContext().getString(f.jp_claim_more);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            setActionName(string, string2);
            return;
        }
        if (i7 == RE_TYPE_WITHDRAW_SUCC_RATE) {
            n0.g().m("event_track_dialog_screen", "Withdraw Success-rate", "");
            setTopImageView(c.jp_cash_dialog_top_withdraw_succ);
            setTitle(getContext().getString(f.jp_congratulations));
            String string3 = getContext().getString(f.jp_view_now);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String string4 = getContext().getString(f.jp_rate_palmpay);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            setActionName(string3, string4);
            return;
        }
        if (i7 == RE_TYPE_WITHDRAW_FAIL_RISK) {
            n0.g().m("event_track_dialog_screen", "Withdraw Failed", "");
            setTopImageView(c.jp_cash_dialog_top_fail);
            setTitle(getContext().getString(f.jp_withdraw_failed));
            String string5 = getContext().getString(v.cv_close);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            setActionName("", string5);
            return;
        }
        if (i7 == RE_TYPE_RETAIN) {
            setTopImageView(c.jp_cash_dialog_top_retain);
            setTitle(getContext().getString(f.jp_dont_miss_out));
            String string6 = getContext().getString(f.jp_maybe_later_n);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            String string7 = getContext().getString(f.jp_invite_now_n);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            setActionName(string6, string7);
            return;
        }
        if (i7 == RE_TYPE_ENABLE_ORDER_DISABLE) {
            n0.g().m("event_track_dialog_screen", "Withdraw limit", "");
            setTopImageView(c.jp_cash_dialog_top_withdraw_unenable);
            String string8 = getContext().getString(f.jp_invite_new_users_2);
            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
            setActionName("", string8);
            return;
        }
        if (i7 == RE_TYPE_ENALBE_ORDER_CONFIRM) {
            n0.g().m("event_track_dialog_screen", "Withdraw no limit", "");
            setTopImageView(c.jp_cash_dialog_top_withdraw_enable);
            return;
        }
        if (i7 == RE_TYPE_WITHDRAW_SUCC_BIND) {
            n0.g().m("event_track_dialog_screen", "Withdraw Success-addcard", "");
            setTopImageView(c.jp_cash_dialog_top_withdraw_bind);
            setTitle(getContext().getString(f.jp_congratulations));
        } else if (i7 == RE_TYPE_WITHDRAW_SUCC_COMMENT) {
            setTopImageView(c.jp_cash_dialog_top_withdraw_succ);
            setTitle(getContext().getString(f.jp_congratulations));
        } else if (i7 == RE_TYPE_WITHDRAW_MANUAL_REVIEW) {
            n0.g().m("event_track_dialog_screen", "Withdraw Processing", "");
            setTopImageView(c.jp_cash_dialog_top_processing);
            setTitle(getContext().getString(f.jp_processing));
        } else if (i7 == RE_TYPE_REAL_NAME_RATE) {
            n0.g().m("event_track_dialog_screen", "Withdraw Processing-resolve", "");
            setTopImageView(c.jp_cash_dialog_top_realname_rate);
            setTitle(getContext().getString(f.jp_processing));
        }
    }
}
