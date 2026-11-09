package com.transsnet.palmpay.ui.dialog;

import Ac.e;
import Ac.f;
import Ac.h;
import Ae.g;
import Bc.u;
import Pa.AbstractC0508e;
import Pa.n0;
import Pa.r0;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.bean.rsp.ClipboardMatchInfoResp;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.w;
import com.transsnet.palmpay.ui.dialog.HomepageClipboardTransferDialog;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p059e1.a;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ+\u0010\u0017\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u000eJ\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001c\u0010\u000eJ\u000f\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/transsnet/palmpay/ui/dialog/HomepageClipboardTransferDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Lcom/transsnet/palmpay/core/bean/rsp/ClipboardMatchInfoResp;", "matchInfo", "", "requestedAccountNo", "Lkotlin/Function1;", "", "onTransfer", "<init>", "(Landroid/content/Context;Lcom/transsnet/palmpay/core/bean/rsp/ClipboardMatchInfoResp;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "bindData", "()V", "bindGenericStyle", "bindBankStyle", "bindPalmPayStyle", "bindNamedTitle", "bankName", "bankPic", "", "usePalmPayFallback", "bindBankInfo", "(Ljava/lang/String;Ljava/lang/String;Z)V", "bindClickListeners", "getDisplayAccountNo", "()Ljava/lang/String;", "initViews", "show", "Lcom/transsnet/palmpay/core/bean/rsp/ClipboardMatchInfoResp;", "Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "LBc/u;", "binding", "LBc/u;", "LAe/g;", "style", "LAe/g;", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHomepageClipboardTransferDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomepageClipboardTransferDialog.kt\ncom/transsnet/palmpay/ui/dialog/HomepageClipboardTransferDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,231:1\n1#2:232\n257#3,2:233\n257#3,2:235\n257#3,2:237\n257#3,2:239\n257#3,2:241\n257#3,2:243\n257#3,2:245\n*S KotlinDebug\n*F\n+ 1 HomepageClipboardTransferDialog.kt\ncom/transsnet/palmpay/ui/dialog/HomepageClipboardTransferDialog\n*L\n112#1:233,2\n113#1:235,2\n114#1:237,2\n123#1:239,2\n137#1:241,2\n170#1:243,2\n171#1:245,2\n*E\n"})
public final class HomepageClipboardTransferDialog extends b {

    @Nullable
    private u binding;

    @NotNull
    private final ClipboardMatchInfoResp matchInfo;

    @NotNull
    private final Function1<ClipboardMatchInfoResp, Unit> onTransfer;

    @NotNull
    private final String requestedAccountNo;

    @NotNull
    private final g style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HomepageClipboardTransferDialog(@NotNull Context context, @NotNull ClipboardMatchInfoResp matchInfo, @NotNull String requestedAccountNo, @NotNull Function1<? super ClipboardMatchInfoResp, Unit> onTransfer) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(matchInfo, "matchInfo");
        Intrinsics.checkNotNullParameter(requestedAccountNo, "requestedAccountNo");
        Intrinsics.checkNotNullParameter(onTransfer, "onTransfer");
        this.matchInfo = matchInfo;
        this.requestedAccountNo = requestedAccountNo;
        this.onTransfer = onTransfer;
        this.style = g.f274a.fromMatchType(matchInfo.getMatchType());
    }

    private final void bindBankInfo(String bankName, String bankPic, boolean usePalmPayFallback) {
        u uVar = this.binding;
        if (uVar == null) {
            return;
        }
        if (bankName == null || StringsKt.F(bankName)) {
            bankName = null;
        }
        LinearLayout layoutBank = uVar.f855f;
        Intrinsics.checkNotNullExpressionValue(layoutBank, "layoutBank");
        layoutBank.setVisibility(bankName != null ? 0 : 8);
        View viewBankDivider = uVar.t;
        Intrinsics.checkNotNullExpressionValue(viewBankDivider, "viewBankDivider");
        viewBankDivider.setVisibility(bankName != null ? 0 : 8);
        uVar.f858j.setText(bankName == null ? "" : bankName);
        if (bankName == null) {
            return;
        }
        ImageView imageView = uVar.f853d;
        if (usePalmPayFallback) {
            if (bankPic == null) {
                bankPic = "";
            }
            r0.u1(imageView, bankPic, r.cv_palmpay_logo_small_16dp);
        } else {
            if (bankPic == null) {
                bankPic = "";
            }
            r0.o1(bankPic, imageView);
        }
    }

    private final void bindBankStyle() {
        u uVar = this.binding;
        if (uVar == null) {
            return;
        }
        ImageView ivAvatar = uVar.f852c;
        Intrinsics.checkNotNullExpressionValue(ivAvatar, "ivAvatar");
        ivAvatar.setVisibility(8);
        bindNamedTitle();
        bindBankInfo(this.matchInfo.getBankName(), this.matchInfo.getBankPic(), false);
    }

    private final void bindClickListeners() {
        u uVar = this.binding;
        if (uVar != null) {
            final int i7 = 0;
            uVar.f854e.setOnClickListener(new View.OnClickListener(this) { // from class: Ae.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ HomepageClipboardTransferDialog f273b;

                {
                    this.f273b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            HomepageClipboardTransferDialog.bindClickListeners$lambda$4(this.f273b, view);
                            break;
                        default:
                            HomepageClipboardTransferDialog.bindClickListeners$lambda$5(this.f273b, view);
                            break;
                    }
                }
            });
        }
        u uVar2 = this.binding;
        if (uVar2 != null) {
            final int i10 = 1;
            uVar2.f851b.setOnClickListener(new View.OnClickListener(this) { // from class: Ae.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ HomepageClipboardTransferDialog f273b;

                {
                    this.f273b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            HomepageClipboardTransferDialog.bindClickListeners$lambda$4(this.f273b, view);
                            break;
                        default:
                            HomepageClipboardTransferDialog.bindClickListeners$lambda$5(this.f273b, view);
                            break;
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindClickListeners$lambda$4(HomepageClipboardTransferDialog homepageClipboardTransferDialog, View view) {
        int iOrdinal = homepageClipboardTransferDialog.style.ordinal();
        if (iOrdinal == 0) {
            n0.g().l("Transfer_GenericClipboardPopUp_Close_Click");
        } else if (iOrdinal == 1) {
            n0.g().l("Transfer_BankClipboardPopUp_Close_Click");
        } else {
            if (iOrdinal != 2) {
                throw new l();
            }
            n0.g().l("Transfer_PalmPayClipboardPopUp_Close_Click");
        }
        n0.g().l("TransferClipboardPopUpClose");
        homepageClipboardTransferDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindClickListeners$lambda$5(HomepageClipboardTransferDialog homepageClipboardTransferDialog, View view) {
        int iOrdinal = homepageClipboardTransferDialog.style.ordinal();
        if (iOrdinal == 0) {
            n0.g().l("Transfer_GenericClipboardPopUp_TransferNow_Click");
        } else if (iOrdinal == 1) {
            n0.g().l("Transfer_BankClipboardPopUp_TransferNow_Click");
        } else {
            if (iOrdinal != 2) {
                throw new l();
            }
            n0.g().l("Transfer_PalmPayClipboardPopUp_TransferNow_Click");
        }
        n0.g().l("TransferClipboardPopUpClick");
        homepageClipboardTransferDialog.dismiss();
        homepageClipboardTransferDialog.onTransfer.invoke(homepageClipboardTransferDialog.matchInfo);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    private final void bindData() {
        u uVar = this.binding;
        if (uVar == null) {
            return;
        }
        String strB = AbstractC0508e.b(getDisplayAccountNo());
        TextView textView = uVar.f857i;
        textView.setText(strB);
        String tip = this.matchInfo.getTip();
        if (tip == null) {
            tip = getContext().getString(h.main_home_clipboard_default_tip);
            Intrinsics.checkNotNullExpressionValue(tip, "getString(...)");
        } else {
            if (StringsKt.F(tip)) {
                tip = null;
            }
            if (tip == null) {
                tip = getContext().getString(h.main_home_clipboard_default_tip);
                Intrinsics.checkNotNullExpressionValue(tip, "getString(...)");
            }
        }
        uVar.f859o.setText(tip);
        r0.R1(textView, "fonts/PalmPayNum-Bold.ttf");
        int iOrdinal = this.style.ordinal();
        if (iOrdinal == 0) {
            bindGenericStyle();
        } else if (iOrdinal == 1) {
            bindBankStyle();
        } else {
            if (iOrdinal != 2) {
                throw new l();
            }
            bindPalmPayStyle();
        }
    }

    private final void bindGenericStyle() {
        u uVar = this.binding;
        if (uVar == null) {
            return;
        }
        ImageView ivAvatar = uVar.f852c;
        Intrinsics.checkNotNullExpressionValue(ivAvatar, "ivAvatar");
        ivAvatar.setVisibility(8);
        LinearLayout layoutBank = uVar.f855f;
        Intrinsics.checkNotNullExpressionValue(layoutBank, "layoutBank");
        layoutBank.setVisibility(8);
        View viewBankDivider = uVar.t;
        Intrinsics.checkNotNullExpressionValue(viewBankDivider, "viewBankDivider");
        viewBankDivider.setVisibility(8);
        uVar.f860p.setText(h.main_home_clipboard_transfer_generic_title);
    }

    private final void bindNamedTitle() {
        TextView textView;
        String accountName = this.matchInfo.getAccountName();
        if (accountName == null || StringsKt.F(accountName)) {
            accountName = null;
        }
        u uVar = this.binding;
        if (uVar == null || (textView = uVar.f860p) == null) {
            return;
        }
        textView.setText(accountName == null ? getContext().getString(h.main_home_clipboard_transfer_generic_title) : getContext().getString(h.main_home_clipboard_transfer_named_title, accountName));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    private final void bindPalmPayStyle() {
        u uVar = this.binding;
        if (uVar == null) {
            return;
        }
        ImageView ivAvatar = uVar.f852c;
        Intrinsics.checkNotNullExpressionValue(ivAvatar, "ivAvatar");
        ivAvatar.setVisibility(0);
        String accountPic = this.matchInfo.getAccountPic();
        if (accountPic == null) {
            accountPic = "";
        }
        r0.m1(accountPic, ivAvatar);
        bindNamedTitle();
        String bankName = this.matchInfo.getBankName();
        if (bankName == null) {
            bankName = getContext().getString(h.main_palmpay_text);
            Intrinsics.checkNotNullExpressionValue(bankName, "getString(...)");
        } else {
            if (StringsKt.F(bankName)) {
                bankName = null;
            }
            if (bankName == null) {
                bankName = getContext().getString(h.main_palmpay_text);
                Intrinsics.checkNotNullExpressionValue(bankName, "getString(...)");
            }
        }
        bindBankInfo(bankName, this.matchInfo.getBankPic(), true);
    }

    private final String getDisplayAccountNo() {
        String accountNo = this.matchInfo.getAccountNo();
        if (accountNo != null) {
            if (StringsKt.F(accountNo)) {
                accountNo = null;
            }
            if (accountNo != null) {
                return accountNo;
            }
        }
        return this.requestedAccountNo;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        View viewM;
        setContentView(f.main_dialog_homepage_clipboard_transfer);
        View viewFindViewById = findViewById(e.viewRoot);
        int i7 = e.btnTransfer;
        PpButton ppButton = (PpButton) a.m(i7, viewFindViewById);
        if (ppButton != null) {
            i7 = e.ivAvatar;
            ImageView imageView = (ImageView) a.m(i7, viewFindViewById);
            if (imageView != null) {
                i7 = e.ivBank;
                ImageView imageView2 = (ImageView) a.m(i7, viewFindViewById);
                if (imageView2 != null) {
                    i7 = e.ivClose;
                    IconicsImageView iconicsImageView = (IconicsImageView) a.m(i7, viewFindViewById);
                    if (iconicsImageView != null) {
                        i7 = e.layoutAccountInfo;
                        if (((LinearLayout) a.m(i7, viewFindViewById)) != null) {
                            i7 = e.layoutBank;
                            LinearLayout linearLayout = (LinearLayout) a.m(i7, viewFindViewById);
                            if (linearLayout != null) {
                                i7 = e.layoutContent;
                                if (((LinearLayout) a.m(i7, viewFindViewById)) != null) {
                                    i7 = e.tvAccountLabel;
                                    TextView textView = (TextView) a.m(i7, viewFindViewById);
                                    if (textView != null) {
                                        i7 = e.tvAccountNo;
                                        TextView textView2 = (TextView) a.m(i7, viewFindViewById);
                                        if (textView2 != null) {
                                            i7 = e.tvBankName;
                                            TextView textView3 = (TextView) a.m(i7, viewFindViewById);
                                            if (textView3 != null) {
                                                i7 = e.tvTip;
                                                TextView textView4 = (TextView) a.m(i7, viewFindViewById);
                                                if (textView4 != null) {
                                                    i7 = e.tvTitle;
                                                    TextView textView5 = (TextView) a.m(i7, viewFindViewById);
                                                    if (textView5 != null && (viewM = a.m((i7 = e.viewBankDivider), viewFindViewById)) != null) {
                                                        this.binding = new u((ConstraintLayout) viewFindViewById, ppButton, imageView, imageView2, iconicsImageView, linearLayout, textView, textView2, textView3, textView4, textView5, viewM);
                                                        showAtCenter(getWindow(), w.Animation_CommonDialog, ScreenUtils.getScreenWidth() - CommonViewExtKt.getDp(48));
                                                        setCancelable(false);
                                                        setCanceledOnTouchOutside(false);
                                                        bindData();
                                                        bindClickListeners();
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        super.show();
        int iOrdinal = this.style.ordinal();
        if (iOrdinal == 0) {
            n0.g().v("Transfer_GenericClipboardPopUp_View");
        } else if (iOrdinal == 1) {
            n0.g().v("Transfer_BankClipboardPopUp_View");
        } else {
            if (iOrdinal != 2) {
                throw new l();
            }
            n0.g().v("Transfer_PalmPayClipboardPopUp_View");
        }
        n0.g().v("TransferClipboardPopUpView");
    }
}
