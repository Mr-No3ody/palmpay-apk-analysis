package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsnet.palmpay.credit.bean.resp.BlockItem;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0015R\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010!\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b \u0010\u0015R\u001d\u0010&\u001a\u0004\u0018\u00010\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u000e\u001a\u0004\b$\u0010%R\u001d\u0010)\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u000e\u001a\u0004\b(\u0010\u0015R\u001d\u0010,\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u000e\u001a\u0004\b+\u0010\u0015R\u001d\u00101\u001a\u0004\u0018\u00010-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u000e\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLRouteInterceptDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Lcom/transsnet/palmpay/credit/bean/resp/BlockItem;", "blockItem", "<init>", "(Landroid/content/Context;Lcom/transsnet/palmpay/credit/bean/resp/BlockItem;)V", "", "initViews", "()V", "Lcom/transsnet/palmpay/credit/bean/resp/BlockItem;", "Landroidx/appcompat/widget/AppCompatImageView;", "ivClose$delegate", "Lkotlin/Lazy;", "getIvClose", "()Landroidx/appcompat/widget/AppCompatImageView;", "ivClose", "Landroid/widget/TextView;", "tvTitle$delegate", "getTvTitle", "()Landroid/widget/TextView;", "tvTitle", "tvContent$delegate", "getTvContent", "tvContent", "Landroidx/constraintlayout/widget/ConstraintLayout;", "layoutBtn$delegate", "getLayoutBtn", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "layoutBtn", "tvBtn$delegate", "getTvBtn", "tvBtn", "Landroid/widget/LinearLayout;", "layoutAccount$delegate", "getLayoutAccount", "()Landroid/widget/LinearLayout;", "layoutAccount", "tvAccount1$delegate", "getTvAccount1", "tvAccount1", "tvAccount2$delegate", "getTvAccount2", "tvAccount2", "Landroid/widget/ImageView;", "ivBtnIcon$delegate", "getIvBtnIcon", "()Landroid/widget/ImageView;", "ivBtnIcon", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLRouteInterceptDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @NotNull
    private final BlockItem blockItem;

    /* JADX INFO: renamed from: ivBtnIcon$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivBtnIcon;

    /* JADX INFO: renamed from: ivClose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivClose;

    /* JADX INFO: renamed from: layoutAccount$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy layoutAccount;

    /* JADX INFO: renamed from: layoutBtn$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy layoutBtn;

    /* JADX INFO: renamed from: tvAccount1$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvAccount1;

    /* JADX INFO: renamed from: tvAccount2$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvAccount2;

    /* JADX INFO: renamed from: tvBtn$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvBtn;

    /* JADX INFO: renamed from: tvContent$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvContent;

    /* JADX INFO: renamed from: tvTitle$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvTitle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CLRouteInterceptDialog(@NotNull Context context, @NotNull BlockItem blockItem) {
        super(context, Ya.f.cs_cl_credit_route_intercept_dialog);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(blockItem, "blockItem");
        this.blockItem = blockItem;
        final int i7 = 0;
        this.ivClose = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.Y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRouteInterceptDialog f30067b;

            {
                this.f30067b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return CLRouteInterceptDialog.ivClose_delegate$lambda$0(this.f30067b);
                    case 1:
                        return CLRouteInterceptDialog.tvTitle_delegate$lambda$1(this.f30067b);
                    case 2:
                        return CLRouteInterceptDialog.tvContent_delegate$lambda$2(this.f30067b);
                    case 3:
                        return CLRouteInterceptDialog.layoutBtn_delegate$lambda$3(this.f30067b);
                    case 4:
                        return CLRouteInterceptDialog.tvBtn_delegate$lambda$4(this.f30067b);
                    case 5:
                        return CLRouteInterceptDialog.layoutAccount_delegate$lambda$5(this.f30067b);
                    case 6:
                        return CLRouteInterceptDialog.tvAccount1_delegate$lambda$6(this.f30067b);
                    case 7:
                        return CLRouteInterceptDialog.tvAccount2_delegate$lambda$7(this.f30067b);
                    default:
                        return CLRouteInterceptDialog.ivBtnIcon_delegate$lambda$8(this.f30067b);
                }
            }
        });
        final int i10 = 1;
        this.tvTitle = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.Y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRouteInterceptDialog f30067b;

            {
                this.f30067b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return CLRouteInterceptDialog.ivClose_delegate$lambda$0(this.f30067b);
                    case 1:
                        return CLRouteInterceptDialog.tvTitle_delegate$lambda$1(this.f30067b);
                    case 2:
                        return CLRouteInterceptDialog.tvContent_delegate$lambda$2(this.f30067b);
                    case 3:
                        return CLRouteInterceptDialog.layoutBtn_delegate$lambda$3(this.f30067b);
                    case 4:
                        return CLRouteInterceptDialog.tvBtn_delegate$lambda$4(this.f30067b);
                    case 5:
                        return CLRouteInterceptDialog.layoutAccount_delegate$lambda$5(this.f30067b);
                    case 6:
                        return CLRouteInterceptDialog.tvAccount1_delegate$lambda$6(this.f30067b);
                    case 7:
                        return CLRouteInterceptDialog.tvAccount2_delegate$lambda$7(this.f30067b);
                    default:
                        return CLRouteInterceptDialog.ivBtnIcon_delegate$lambda$8(this.f30067b);
                }
            }
        });
        final int i11 = 2;
        this.tvContent = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.Y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRouteInterceptDialog f30067b;

            {
                this.f30067b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return CLRouteInterceptDialog.ivClose_delegate$lambda$0(this.f30067b);
                    case 1:
                        return CLRouteInterceptDialog.tvTitle_delegate$lambda$1(this.f30067b);
                    case 2:
                        return CLRouteInterceptDialog.tvContent_delegate$lambda$2(this.f30067b);
                    case 3:
                        return CLRouteInterceptDialog.layoutBtn_delegate$lambda$3(this.f30067b);
                    case 4:
                        return CLRouteInterceptDialog.tvBtn_delegate$lambda$4(this.f30067b);
                    case 5:
                        return CLRouteInterceptDialog.layoutAccount_delegate$lambda$5(this.f30067b);
                    case 6:
                        return CLRouteInterceptDialog.tvAccount1_delegate$lambda$6(this.f30067b);
                    case 7:
                        return CLRouteInterceptDialog.tvAccount2_delegate$lambda$7(this.f30067b);
                    default:
                        return CLRouteInterceptDialog.ivBtnIcon_delegate$lambda$8(this.f30067b);
                }
            }
        });
        final int i12 = 3;
        this.layoutBtn = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.Y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRouteInterceptDialog f30067b;

            {
                this.f30067b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return CLRouteInterceptDialog.ivClose_delegate$lambda$0(this.f30067b);
                    case 1:
                        return CLRouteInterceptDialog.tvTitle_delegate$lambda$1(this.f30067b);
                    case 2:
                        return CLRouteInterceptDialog.tvContent_delegate$lambda$2(this.f30067b);
                    case 3:
                        return CLRouteInterceptDialog.layoutBtn_delegate$lambda$3(this.f30067b);
                    case 4:
                        return CLRouteInterceptDialog.tvBtn_delegate$lambda$4(this.f30067b);
                    case 5:
                        return CLRouteInterceptDialog.layoutAccount_delegate$lambda$5(this.f30067b);
                    case 6:
                        return CLRouteInterceptDialog.tvAccount1_delegate$lambda$6(this.f30067b);
                    case 7:
                        return CLRouteInterceptDialog.tvAccount2_delegate$lambda$7(this.f30067b);
                    default:
                        return CLRouteInterceptDialog.ivBtnIcon_delegate$lambda$8(this.f30067b);
                }
            }
        });
        final int i13 = 4;
        this.tvBtn = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.Y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRouteInterceptDialog f30067b;

            {
                this.f30067b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return CLRouteInterceptDialog.ivClose_delegate$lambda$0(this.f30067b);
                    case 1:
                        return CLRouteInterceptDialog.tvTitle_delegate$lambda$1(this.f30067b);
                    case 2:
                        return CLRouteInterceptDialog.tvContent_delegate$lambda$2(this.f30067b);
                    case 3:
                        return CLRouteInterceptDialog.layoutBtn_delegate$lambda$3(this.f30067b);
                    case 4:
                        return CLRouteInterceptDialog.tvBtn_delegate$lambda$4(this.f30067b);
                    case 5:
                        return CLRouteInterceptDialog.layoutAccount_delegate$lambda$5(this.f30067b);
                    case 6:
                        return CLRouteInterceptDialog.tvAccount1_delegate$lambda$6(this.f30067b);
                    case 7:
                        return CLRouteInterceptDialog.tvAccount2_delegate$lambda$7(this.f30067b);
                    default:
                        return CLRouteInterceptDialog.ivBtnIcon_delegate$lambda$8(this.f30067b);
                }
            }
        });
        final int i14 = 5;
        this.layoutAccount = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.Y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRouteInterceptDialog f30067b;

            {
                this.f30067b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return CLRouteInterceptDialog.ivClose_delegate$lambda$0(this.f30067b);
                    case 1:
                        return CLRouteInterceptDialog.tvTitle_delegate$lambda$1(this.f30067b);
                    case 2:
                        return CLRouteInterceptDialog.tvContent_delegate$lambda$2(this.f30067b);
                    case 3:
                        return CLRouteInterceptDialog.layoutBtn_delegate$lambda$3(this.f30067b);
                    case 4:
                        return CLRouteInterceptDialog.tvBtn_delegate$lambda$4(this.f30067b);
                    case 5:
                        return CLRouteInterceptDialog.layoutAccount_delegate$lambda$5(this.f30067b);
                    case 6:
                        return CLRouteInterceptDialog.tvAccount1_delegate$lambda$6(this.f30067b);
                    case 7:
                        return CLRouteInterceptDialog.tvAccount2_delegate$lambda$7(this.f30067b);
                    default:
                        return CLRouteInterceptDialog.ivBtnIcon_delegate$lambda$8(this.f30067b);
                }
            }
        });
        final int i15 = 6;
        this.tvAccount1 = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.Y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRouteInterceptDialog f30067b;

            {
                this.f30067b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return CLRouteInterceptDialog.ivClose_delegate$lambda$0(this.f30067b);
                    case 1:
                        return CLRouteInterceptDialog.tvTitle_delegate$lambda$1(this.f30067b);
                    case 2:
                        return CLRouteInterceptDialog.tvContent_delegate$lambda$2(this.f30067b);
                    case 3:
                        return CLRouteInterceptDialog.layoutBtn_delegate$lambda$3(this.f30067b);
                    case 4:
                        return CLRouteInterceptDialog.tvBtn_delegate$lambda$4(this.f30067b);
                    case 5:
                        return CLRouteInterceptDialog.layoutAccount_delegate$lambda$5(this.f30067b);
                    case 6:
                        return CLRouteInterceptDialog.tvAccount1_delegate$lambda$6(this.f30067b);
                    case 7:
                        return CLRouteInterceptDialog.tvAccount2_delegate$lambda$7(this.f30067b);
                    default:
                        return CLRouteInterceptDialog.ivBtnIcon_delegate$lambda$8(this.f30067b);
                }
            }
        });
        final int i16 = 7;
        this.tvAccount2 = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.Y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRouteInterceptDialog f30067b;

            {
                this.f30067b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return CLRouteInterceptDialog.ivClose_delegate$lambda$0(this.f30067b);
                    case 1:
                        return CLRouteInterceptDialog.tvTitle_delegate$lambda$1(this.f30067b);
                    case 2:
                        return CLRouteInterceptDialog.tvContent_delegate$lambda$2(this.f30067b);
                    case 3:
                        return CLRouteInterceptDialog.layoutBtn_delegate$lambda$3(this.f30067b);
                    case 4:
                        return CLRouteInterceptDialog.tvBtn_delegate$lambda$4(this.f30067b);
                    case 5:
                        return CLRouteInterceptDialog.layoutAccount_delegate$lambda$5(this.f30067b);
                    case 6:
                        return CLRouteInterceptDialog.tvAccount1_delegate$lambda$6(this.f30067b);
                    case 7:
                        return CLRouteInterceptDialog.tvAccount2_delegate$lambda$7(this.f30067b);
                    default:
                        return CLRouteInterceptDialog.ivBtnIcon_delegate$lambda$8(this.f30067b);
                }
            }
        });
        final int i17 = 8;
        this.ivBtnIcon = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.Y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRouteInterceptDialog f30067b;

            {
                this.f30067b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return CLRouteInterceptDialog.ivClose_delegate$lambda$0(this.f30067b);
                    case 1:
                        return CLRouteInterceptDialog.tvTitle_delegate$lambda$1(this.f30067b);
                    case 2:
                        return CLRouteInterceptDialog.tvContent_delegate$lambda$2(this.f30067b);
                    case 3:
                        return CLRouteInterceptDialog.layoutBtn_delegate$lambda$3(this.f30067b);
                    case 4:
                        return CLRouteInterceptDialog.tvBtn_delegate$lambda$4(this.f30067b);
                    case 5:
                        return CLRouteInterceptDialog.layoutAccount_delegate$lambda$5(this.f30067b);
                    case 6:
                        return CLRouteInterceptDialog.tvAccount1_delegate$lambda$6(this.f30067b);
                    case 7:
                        return CLRouteInterceptDialog.tvAccount2_delegate$lambda$7(this.f30067b);
                    default:
                        return CLRouteInterceptDialog.ivBtnIcon_delegate$lambda$8(this.f30067b);
                }
            }
        });
    }

    private final ImageView getIvBtnIcon() {
        return (ImageView) this.ivBtnIcon.getValue();
    }

    private final AppCompatImageView getIvClose() {
        return (AppCompatImageView) this.ivClose.getValue();
    }

    private final LinearLayout getLayoutAccount() {
        return (LinearLayout) this.layoutAccount.getValue();
    }

    private final ConstraintLayout getLayoutBtn() {
        return (ConstraintLayout) this.layoutBtn.getValue();
    }

    private final TextView getTvAccount1() {
        return (TextView) this.tvAccount1.getValue();
    }

    private final TextView getTvAccount2() {
        return (TextView) this.tvAccount2.getValue();
    }

    private final TextView getTvBtn() {
        return (TextView) this.tvBtn.getValue();
    }

    private final TextView getTvContent() {
        return (TextView) this.tvContent.getValue();
    }

    private final TextView getTvTitle() {
        return (TextView) this.tvTitle.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$11(CLRouteInterceptDialog cLRouteInterceptDialog, View view) {
        cLRouteInterceptDialog.dismiss();
        BlockItem blockItem = cLRouteInterceptDialog.blockItem;
        if (blockItem.getJumpPath() == null || blockItem.getJumpType() == null) {
            return;
        }
        Pa.F.f(blockItem.getJumpPath(), blockItem.getJumpType(), blockItem.getJumpParams());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivBtnIcon_delegate$lambda$8(CLRouteInterceptDialog cLRouteInterceptDialog) {
        return (ImageView) cLRouteInterceptDialog.findViewById(Ya.e.ivBtnIcon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppCompatImageView ivClose_delegate$lambda$0(CLRouteInterceptDialog cLRouteInterceptDialog) {
        return (AppCompatImageView) cLRouteInterceptDialog.findViewById(Ya.e.ivClose);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout layoutAccount_delegate$lambda$5(CLRouteInterceptDialog cLRouteInterceptDialog) {
        return (LinearLayout) cLRouteInterceptDialog.findViewById(Ya.e.layoutAccount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstraintLayout layoutBtn_delegate$lambda$3(CLRouteInterceptDialog cLRouteInterceptDialog) {
        return (ConstraintLayout) cLRouteInterceptDialog.findViewById(Ya.e.layoutBtn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvAccount1_delegate$lambda$6(CLRouteInterceptDialog cLRouteInterceptDialog) {
        return (TextView) cLRouteInterceptDialog.findViewById(Ya.e.tvAccount1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvAccount2_delegate$lambda$7(CLRouteInterceptDialog cLRouteInterceptDialog) {
        return (TextView) cLRouteInterceptDialog.findViewById(Ya.e.tvAccount2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvBtn_delegate$lambda$4(CLRouteInterceptDialog cLRouteInterceptDialog) {
        return (TextView) cLRouteInterceptDialog.findViewById(Ya.e.tvBtn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvContent_delegate$lambda$2(CLRouteInterceptDialog cLRouteInterceptDialog) {
        return (TextView) cLRouteInterceptDialog.findViewById(Ya.e.tvContent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvTitle_delegate$lambda$1(CLRouteInterceptDialog cLRouteInterceptDialog) {
        return (TextView) cLRouteInterceptDialog.findViewById(Ya.e.tvTitle);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        TextView tvBtn;
        setCancelable(false);
        TextView tvTitle = getTvTitle();
        if (tvTitle != null) {
            p220oa.h.s(tvTitle, !TextUtils.isEmpty(this.blockItem.getTitle()));
        }
        TextView tvTitle2 = getTvTitle();
        if (tvTitle2 != null) {
            tvTitle2.setText(this.blockItem.getTitle());
        }
        TextView tvContent = getTvContent();
        if (tvContent != null) {
            p220oa.h.s(tvContent, !TextUtils.isEmpty(this.blockItem.getContent()));
        }
        TextView tvContent2 = getTvContent();
        if (tvContent2 != null) {
            tvContent2.setText(this.blockItem.getContent());
        }
        List<String> phoneNumList = this.blockItem.getPhoneNumList();
        LinearLayout layoutAccount = getLayoutAccount();
        if (layoutAccount != null) {
            p220oa.h.s(layoutAccount, (phoneNumList != null ? phoneNumList.size() : 0) > 0);
        }
        TextView tvAccount1 = getTvAccount1();
        if (tvAccount1 != null) {
            tvAccount1.setText(phoneNumList != null ? (String) CollectionsKt.G(0, phoneNumList) : null);
        }
        TextView tvAccount2 = getTvAccount2();
        if (tvAccount2 != null) {
            tvAccount2.setText(phoneNumList != null ? (String) CollectionsKt.G(1, phoneNumList) : null);
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.blockItem.getIconUrl());
        boolean z3 = !zIsEmpty;
        ImageView ivBtnIcon = getIvBtnIcon();
        if (ivBtnIcon != null) {
            p220oa.h.s(ivBtnIcon, z3);
        }
        if (!zIsEmpty) {
            Pa.r0.l1(this.blockItem.getIconUrl(), getIvBtnIcon());
        }
        if (!TextUtils.isEmpty(this.blockItem.getButton()) && (tvBtn = getTvBtn()) != null) {
            tvBtn.setText(this.blockItem.getButton());
        }
        AppCompatImageView ivClose = getIvClose();
        if (ivClose != null) {
            final int i7 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.Z

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLRouteInterceptDialog f30071b;

                {
                    this.f30071b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            CLRouteInterceptDialog.initViews$lambda$11(this.f30071b, view);
                            break;
                        default:
                            this.f30071b.dismiss();
                            break;
                    }
                }
            }, ivClose);
        }
        ConstraintLayout layoutBtn = getLayoutBtn();
        if (layoutBtn != null) {
            final int i10 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.Z

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLRouteInterceptDialog f30071b;

                {
                    this.f30071b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            CLRouteInterceptDialog.initViews$lambda$11(this.f30071b, view);
                            break;
                        default:
                            this.f30071b.dismiss();
                            break;
                    }
                }
            }, layoutBtn);
        }
    }
}
