package com.transsnet.palmpay.core.ui.dialog;

import Ha.d;
import Pa.F;
import Pa.r0;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.bean.rsp.JunePopWindowsBean;
import com.transsnet.palmpay.core.ui.dialog.CoinRewardDialog;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.w;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.e;
import p025ba.g;
import p220oa.h;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 A2\u00020\u0001:\u0002BCB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0011\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!R\u001b\u0010%\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0015\u001a\u0004\b$\u0010\u001cR\u001b\u0010(\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0015\u001a\u0004\b'\u0010!R\u001b\u0010+\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0015\u001a\u0004\b*\u0010!R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0015\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u0015\u001a\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010@\u001a\u0004\u0018\u00010=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006D"}, d2 = {"Lcom/transsnet/palmpay/core/ui/dialog/CoinRewardDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Lcom/transsnet/palmpay/core/ui/dialog/CoinRewardDialog$ActionInterface;", "juneActionInterface", "<init>", "(Landroid/content/Context;Lcom/transsnet/palmpay/core/ui/dialog/CoinRewardDialog$ActionInterface;)V", "", "initViews", "()V", "Lcom/transsnet/palmpay/core/bean/rsp/JunePopWindowsBean;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/net/Uri;", "topBgUrl", "", "buttonColor", "fillData", "(Lcom/transsnet/palmpay/core/bean/rsp/JunePopWindowsBean;Landroid/net/Uri;Ljava/lang/String;)V", "Lcom/palmpay/lib/ui/button/PpButton;", "cdja_btn$delegate", "Lkotlin/Lazy;", "getCdja_btn", "()Lcom/palmpay/lib/ui/button/PpButton;", "cdja_btn", "Landroid/widget/TextView;", "cdja_content$delegate", "getCdja_content", "()Landroid/widget/TextView;", "cdja_content", "Landroid/widget/ImageView;", "cdja_pic$delegate", "getCdja_pic", "()Landroid/widget/ImageView;", "cdja_pic", "cdja_title$delegate", "getCdja_title", "cdja_title", "cdja_close$delegate", "getCdja_close", "cdja_close", "ivTopBg$delegate", "getIvTopBg", "ivTopBg", "Landroid/widget/Space;", "spaceTopAnchor$delegate", "getSpaceTopAnchor", "()Landroid/widget/Space;", "spaceTopAnchor", "Landroid/view/View;", "bgView$delegate", "getBgView", "()Landroid/view/View;", "bgView", "mData", "Lcom/transsnet/palmpay/core/bean/rsp/JunePopWindowsBean;", "mActionInterface", "Lcom/transsnet/palmpay/core/ui/dialog/CoinRewardDialog$ActionInterface;", "Landroid/view/View$OnClickListener;", "onClickListener", "Landroid/view/View$OnClickListener;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getRootLayout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "rootLayout", "Companion", "a", "ActionInterface", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CoinRewardDialog extends b {
    public static final int TYPE_ACTION_COLLECT = 1;
    public static final int TYPE_ACTION_DISMISS = 2;
    public static final int TYPE_ACTION_REDEEM = 4;
    public static final int TYPE_ACTION_TASKS = 3;

    @NotNull
    public static final String TYPE_URL_COLLECT = "collect";

    @NotNull
    public static final String TYPE_URL_REDEEM = "redeem";

    @NotNull
    public static final String TYPE_URL_TASK = "doTask";

    /* JADX INFO: renamed from: bgView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy bgView;

    /* JADX INFO: renamed from: cdja_btn$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cdja_btn;

    /* JADX INFO: renamed from: cdja_close$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cdja_close;

    /* JADX INFO: renamed from: cdja_content$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cdja_content;

    /* JADX INFO: renamed from: cdja_pic$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cdja_pic;

    /* JADX INFO: renamed from: cdja_title$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cdja_title;

    /* JADX INFO: renamed from: ivTopBg$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivTopBg;

    @Nullable
    private ActionInterface mActionInterface;

    @Nullable
    private JunePopWindowsBean mData;

    @NotNull
    private final View.OnClickListener onClickListener;

    /* JADX INFO: renamed from: spaceTopAnchor$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy spaceTopAnchor;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H&¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/core/ui/dialog/CoinRewardDialog$ActionInterface;", "", "action", "", "", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ActionInterface {
        void action(int action);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinRewardDialog(@NotNull Context context, @NotNull ActionInterface juneActionInterface) {
        super(context, g.core_dialog_coin_reward_activity, w.BaseDialogTheme);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(juneActionInterface, "juneActionInterface");
        final int i7 = 0;
        this.cdja_btn = C2131j.b(new Function0(this) { // from class: Ha.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoinRewardDialog f3773b;

            {
                this.f3773b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return CoinRewardDialog.cdja_btn_delegate$lambda$0(this.f3773b);
                    case 1:
                        return CoinRewardDialog.cdja_content_delegate$lambda$1(this.f3773b);
                    case 2:
                        return CoinRewardDialog.cdja_pic_delegate$lambda$2(this.f3773b);
                    case 3:
                        return CoinRewardDialog.cdja_title_delegate$lambda$3(this.f3773b);
                    case 4:
                        return CoinRewardDialog.cdja_close_delegate$lambda$4(this.f3773b);
                    case 5:
                        return CoinRewardDialog.ivTopBg_delegate$lambda$5(this.f3773b);
                    case 6:
                        return CoinRewardDialog.spaceTopAnchor_delegate$lambda$6(this.f3773b);
                    default:
                        return CoinRewardDialog.bgView_delegate$lambda$7(this.f3773b);
                }
            }
        });
        final int i10 = 1;
        this.cdja_content = C2131j.b(new Function0(this) { // from class: Ha.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoinRewardDialog f3773b;

            {
                this.f3773b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return CoinRewardDialog.cdja_btn_delegate$lambda$0(this.f3773b);
                    case 1:
                        return CoinRewardDialog.cdja_content_delegate$lambda$1(this.f3773b);
                    case 2:
                        return CoinRewardDialog.cdja_pic_delegate$lambda$2(this.f3773b);
                    case 3:
                        return CoinRewardDialog.cdja_title_delegate$lambda$3(this.f3773b);
                    case 4:
                        return CoinRewardDialog.cdja_close_delegate$lambda$4(this.f3773b);
                    case 5:
                        return CoinRewardDialog.ivTopBg_delegate$lambda$5(this.f3773b);
                    case 6:
                        return CoinRewardDialog.spaceTopAnchor_delegate$lambda$6(this.f3773b);
                    default:
                        return CoinRewardDialog.bgView_delegate$lambda$7(this.f3773b);
                }
            }
        });
        final int i11 = 2;
        this.cdja_pic = C2131j.b(new Function0(this) { // from class: Ha.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoinRewardDialog f3773b;

            {
                this.f3773b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return CoinRewardDialog.cdja_btn_delegate$lambda$0(this.f3773b);
                    case 1:
                        return CoinRewardDialog.cdja_content_delegate$lambda$1(this.f3773b);
                    case 2:
                        return CoinRewardDialog.cdja_pic_delegate$lambda$2(this.f3773b);
                    case 3:
                        return CoinRewardDialog.cdja_title_delegate$lambda$3(this.f3773b);
                    case 4:
                        return CoinRewardDialog.cdja_close_delegate$lambda$4(this.f3773b);
                    case 5:
                        return CoinRewardDialog.ivTopBg_delegate$lambda$5(this.f3773b);
                    case 6:
                        return CoinRewardDialog.spaceTopAnchor_delegate$lambda$6(this.f3773b);
                    default:
                        return CoinRewardDialog.bgView_delegate$lambda$7(this.f3773b);
                }
            }
        });
        final int i12 = 3;
        this.cdja_title = C2131j.b(new Function0(this) { // from class: Ha.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoinRewardDialog f3773b;

            {
                this.f3773b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return CoinRewardDialog.cdja_btn_delegate$lambda$0(this.f3773b);
                    case 1:
                        return CoinRewardDialog.cdja_content_delegate$lambda$1(this.f3773b);
                    case 2:
                        return CoinRewardDialog.cdja_pic_delegate$lambda$2(this.f3773b);
                    case 3:
                        return CoinRewardDialog.cdja_title_delegate$lambda$3(this.f3773b);
                    case 4:
                        return CoinRewardDialog.cdja_close_delegate$lambda$4(this.f3773b);
                    case 5:
                        return CoinRewardDialog.ivTopBg_delegate$lambda$5(this.f3773b);
                    case 6:
                        return CoinRewardDialog.spaceTopAnchor_delegate$lambda$6(this.f3773b);
                    default:
                        return CoinRewardDialog.bgView_delegate$lambda$7(this.f3773b);
                }
            }
        });
        final int i13 = 4;
        this.cdja_close = C2131j.b(new Function0(this) { // from class: Ha.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoinRewardDialog f3773b;

            {
                this.f3773b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return CoinRewardDialog.cdja_btn_delegate$lambda$0(this.f3773b);
                    case 1:
                        return CoinRewardDialog.cdja_content_delegate$lambda$1(this.f3773b);
                    case 2:
                        return CoinRewardDialog.cdja_pic_delegate$lambda$2(this.f3773b);
                    case 3:
                        return CoinRewardDialog.cdja_title_delegate$lambda$3(this.f3773b);
                    case 4:
                        return CoinRewardDialog.cdja_close_delegate$lambda$4(this.f3773b);
                    case 5:
                        return CoinRewardDialog.ivTopBg_delegate$lambda$5(this.f3773b);
                    case 6:
                        return CoinRewardDialog.spaceTopAnchor_delegate$lambda$6(this.f3773b);
                    default:
                        return CoinRewardDialog.bgView_delegate$lambda$7(this.f3773b);
                }
            }
        });
        final int i14 = 5;
        this.ivTopBg = C2131j.b(new Function0(this) { // from class: Ha.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoinRewardDialog f3773b;

            {
                this.f3773b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return CoinRewardDialog.cdja_btn_delegate$lambda$0(this.f3773b);
                    case 1:
                        return CoinRewardDialog.cdja_content_delegate$lambda$1(this.f3773b);
                    case 2:
                        return CoinRewardDialog.cdja_pic_delegate$lambda$2(this.f3773b);
                    case 3:
                        return CoinRewardDialog.cdja_title_delegate$lambda$3(this.f3773b);
                    case 4:
                        return CoinRewardDialog.cdja_close_delegate$lambda$4(this.f3773b);
                    case 5:
                        return CoinRewardDialog.ivTopBg_delegate$lambda$5(this.f3773b);
                    case 6:
                        return CoinRewardDialog.spaceTopAnchor_delegate$lambda$6(this.f3773b);
                    default:
                        return CoinRewardDialog.bgView_delegate$lambda$7(this.f3773b);
                }
            }
        });
        final int i15 = 6;
        this.spaceTopAnchor = C2131j.b(new Function0(this) { // from class: Ha.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoinRewardDialog f3773b;

            {
                this.f3773b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return CoinRewardDialog.cdja_btn_delegate$lambda$0(this.f3773b);
                    case 1:
                        return CoinRewardDialog.cdja_content_delegate$lambda$1(this.f3773b);
                    case 2:
                        return CoinRewardDialog.cdja_pic_delegate$lambda$2(this.f3773b);
                    case 3:
                        return CoinRewardDialog.cdja_title_delegate$lambda$3(this.f3773b);
                    case 4:
                        return CoinRewardDialog.cdja_close_delegate$lambda$4(this.f3773b);
                    case 5:
                        return CoinRewardDialog.ivTopBg_delegate$lambda$5(this.f3773b);
                    case 6:
                        return CoinRewardDialog.spaceTopAnchor_delegate$lambda$6(this.f3773b);
                    default:
                        return CoinRewardDialog.bgView_delegate$lambda$7(this.f3773b);
                }
            }
        });
        final int i16 = 7;
        this.bgView = C2131j.b(new Function0(this) { // from class: Ha.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoinRewardDialog f3773b;

            {
                this.f3773b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return CoinRewardDialog.cdja_btn_delegate$lambda$0(this.f3773b);
                    case 1:
                        return CoinRewardDialog.cdja_content_delegate$lambda$1(this.f3773b);
                    case 2:
                        return CoinRewardDialog.cdja_pic_delegate$lambda$2(this.f3773b);
                    case 3:
                        return CoinRewardDialog.cdja_title_delegate$lambda$3(this.f3773b);
                    case 4:
                        return CoinRewardDialog.cdja_close_delegate$lambda$4(this.f3773b);
                    case 5:
                        return CoinRewardDialog.ivTopBg_delegate$lambda$5(this.f3773b);
                    case 6:
                        return CoinRewardDialog.spaceTopAnchor_delegate$lambda$6(this.f3773b);
                    default:
                        return CoinRewardDialog.bgView_delegate$lambda$7(this.f3773b);
                }
            }
        });
        this.onClickListener = new d(this, 0);
        this.mActionInterface = juneActionInterface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View bgView_delegate$lambda$7(CoinRewardDialog coinRewardDialog) {
        return coinRewardDialog.findViewById(e.bgView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PpButton cdja_btn_delegate$lambda$0(CoinRewardDialog coinRewardDialog) {
        return (PpButton) coinRewardDialog.findViewById(e.cdja_btn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView cdja_close_delegate$lambda$4(CoinRewardDialog coinRewardDialog) {
        return (ImageView) coinRewardDialog.findViewById(e.cdja_close);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView cdja_content_delegate$lambda$1(CoinRewardDialog coinRewardDialog) {
        return (TextView) coinRewardDialog.findViewById(e.cdja_content);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView cdja_pic_delegate$lambda$2(CoinRewardDialog coinRewardDialog) {
        return (ImageView) coinRewardDialog.findViewById(e.cdja_pic);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView cdja_title_delegate$lambda$3(CoinRewardDialog coinRewardDialog) {
        return (TextView) coinRewardDialog.findViewById(e.cdja_title);
    }

    private final View getBgView() {
        Object value = this.bgView.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (View) value;
    }

    private final PpButton getCdja_btn() {
        Object value = this.cdja_btn.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (PpButton) value;
    }

    private final ImageView getCdja_close() {
        Object value = this.cdja_close.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final TextView getCdja_content() {
        Object value = this.cdja_content.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final ImageView getCdja_pic() {
        Object value = this.cdja_pic.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final TextView getCdja_title() {
        Object value = this.cdja_title.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final ImageView getIvTopBg() {
        Object value = this.ivTopBg.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final ConstraintLayout getRootLayout() {
        ViewParent parent = getSpaceTopAnchor().getParent();
        if (parent instanceof ConstraintLayout) {
            return (ConstraintLayout) parent;
        }
        return null;
    }

    private final Space getSpaceTopAnchor() {
        Object value = this.spaceTopAnchor.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Space) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivTopBg_delegate$lambda$5(CoinRewardDialog coinRewardDialog) {
        return (ImageView) coinRewardDialog.findViewById(e.ivTopBg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClickListener$lambda$9(CoinRewardDialog coinRewardDialog, View view) {
        String upperCase;
        int id2 = view.getId();
        if (id2 == e.cdja_close) {
            ActionInterface actionInterface = coinRewardDialog.mActionInterface;
            if (actionInterface != null) {
                actionInterface.action(2);
            }
            coinRewardDialog.dismiss();
            return;
        }
        if (id2 == e.cdja_btn) {
            JunePopWindowsBean junePopWindowsBean = coinRewardDialog.mData;
            if (junePopWindowsBean != null && !TextUtils.isEmpty(junePopWindowsBean.buttonUrl)) {
                String str = junePopWindowsBean.buttonUrl;
                if (str != null) {
                    upperCase = str.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                } else {
                    upperCase = null;
                }
                Locale locale = Locale.ROOT;
                String upperCase2 = TYPE_URL_COLLECT.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                if (Intrinsics.c(upperCase, upperCase2)) {
                    ActionInterface actionInterface2 = coinRewardDialog.mActionInterface;
                    if (actionInterface2 != null) {
                        actionInterface2.action(1);
                    }
                } else {
                    String upperCase3 = TYPE_URL_REDEEM.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                    if (Intrinsics.c(upperCase, upperCase3)) {
                        ActionInterface actionInterface3 = coinRewardDialog.mActionInterface;
                        if (actionInterface3 != null) {
                            actionInterface3.action(4);
                        }
                    } else {
                        String upperCase4 = TYPE_URL_TASK.toUpperCase(locale);
                        Intrinsics.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
                        if (Intrinsics.c(upperCase, upperCase4)) {
                            ActionInterface actionInterface4 = coinRewardDialog.mActionInterface;
                            if (actionInterface4 != null) {
                                actionInterface4.action(3);
                            }
                        } else {
                            ActionInterface actionInterface5 = coinRewardDialog.mActionInterface;
                            if (actionInterface5 != null) {
                                actionInterface5.action(2);
                            }
                            ActivityUtils.startActivity(F.a(coinRewardDialog.mContext, junePopWindowsBean.buttonUrl));
                        }
                    }
                }
            }
            coinRewardDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Space spaceTopAnchor_delegate$lambda$6(CoinRewardDialog coinRewardDialog) {
        return (Space) coinRewardDialog.findViewById(e.spaceTopAnchor);
    }

    public final void fillData(@Nullable JunePopWindowsBean data, @Nullable Uri topBgUrl, @Nullable String buttonColor) {
        if (data != null) {
            this.mData = data;
            h.s(getCdja_title(), !TextUtils.isEmpty(data.title));
            getCdja_title().setText(data.title);
            h.s(getCdja_content(), !TextUtils.isEmpty(data.content));
            getCdja_content().setText(data.content);
            r0.l1(data.icon, getCdja_pic());
            h.s(getCdja_pic(), !TextUtils.isEmpty(data.icon));
            getCdja_btn().setText(data.button);
            if (topBgUrl != null) {
                try {
                    r0.f1(getIvTopBg(), topBgUrl);
                } catch (Exception unused) {
                }
            }
            h.s(getIvTopBg(), topBgUrl != null);
            h.s(getSpaceTopAnchor(), topBgUrl != null);
        }
        if (TextUtils.isEmpty(buttonColor)) {
            return;
        }
        int iHexToColorInt = buttonColor != null ? CommonViewExtKt.hexToColorInt(buttonColor, getContext(), CommonViewExtKt.colorInt(L6.b.ppColorPrimary, getContext())) : CommonViewExtKt.colorInt(L6.b.ppColorPrimary, getContext());
        PpButton cdja_btn = getCdja_btn();
        if (cdja_btn != null) {
            h.n(cdja_btn, iHexToColorInt, CommonViewExtKt.getDp(12), null, null, 124);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        h.q(this.onClickListener, getCdja_close(), getCdja_btn());
    }
}
