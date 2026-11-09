package com.transsnet.palmpay.airtime.ui.dialog;

import C0.G;
import Pa.n0;
import Pa.r0;
import Pd.c;
import Pd.d;
import Rd.X;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.horcrux.svg.d0;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.airtime.ui.dialog.NotEnoughAssetsDialog;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p059e1.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/dialog/NotEnoughAssetsDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "amount", "<init>", "(Landroid/content/Context;J)V", "", "initViews", "()V", "copy", "", "transType", "(Ljava/lang/String;)Lcom/transsnet/palmpay/airtime/ui/dialog/NotEnoughAssetsDialog;", "J", "mTransType", "Ljava/lang/String;", "LRd/X;", "binding", "LRd/X;", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NotEnoughAssetsDialog extends b {
    private final long amount;

    @Nullable
    private X binding;
    private String mTransType;

    public NotEnoughAssetsDialog(@Nullable Context context, long j6) {
        super(context, d.qt_dialog_not_enough_assets_for_top_up);
        this.amount = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1$lambda$0(NotEnoughAssetsDialog notEnoughAssetsDialog, View view) {
        notEnoughAssetsDialog.copy();
        n0 n0VarG = n0.g();
        ClickEvent clickEvent = new ClickEvent("PP_NotEnoughAssetsDialog_CopyClick");
        String str = notEnoughAssetsDialog.mTransType;
        if (str != null) {
            n0VarG.k(clickEvent.add("element_name", str));
        } else {
            Intrinsics.n("mTransType");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(NotEnoughAssetsDialog notEnoughAssetsDialog, View view) {
        notEnoughAssetsDialog.copy();
        n0 n0VarG = n0.g();
        ClickEvent clickEvent = new ClickEvent("PP_NotEnoughAssetsDialog_CopyToAddClick");
        String str = notEnoughAssetsDialog.mTransType;
        if (str != null) {
            n0VarG.k(clickEvent.add("element_name", str));
        } else {
            Intrinsics.n("mTransType");
            throw null;
        }
    }

    public final void copy() {
        ClipboardUtils.copyText(r0.w0(BaseApplication.get().getUser().getPhoneNumber()));
        dismiss();
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        showAtBottom(getWindow());
        View viewFindViewById = findViewById(c.rootView);
        int i7 = c.btnContinue;
        PpButton ppButton = (PpButton) a.m(i7, viewFindViewById);
        if (ppButton != null) {
            i7 = c.ivClose;
            if (((IconicsImageView) a.m(i7, viewFindViewById)) != null) {
                i7 = c.layoutInfo;
                if (((ConstraintLayout) a.m(i7, viewFindViewById)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
                    i7 = c.tvAccountCopy;
                    IconicsTextView iconicsTextView = (IconicsTextView) a.m(i7, viewFindViewById);
                    if (iconicsTextView != null) {
                        i7 = c.tvMsg;
                        TextView textView = (TextView) a.m(i7, viewFindViewById);
                        if (textView != null) {
                            i7 = c.tvTitle;
                            TextView textView2 = (TextView) a.m(i7, viewFindViewById);
                            if (textView2 != null) {
                                this.binding = new X(constraintLayout, ppButton, iconicsTextView, textView, textView2);
                                User user = BaseApplication.get().getUser();
                                String strW0 = r0.w0(user != null ? user.getPhoneNumber() : null);
                                X x3 = this.binding;
                                if (x3 != null) {
                                    IconicsTextView iconicsTextView2 = x3.f8177c;
                                    final int i10 = 0;
                                    iconicsTextView2.setOnClickListener(new View.OnClickListener(this) { // from class: l9.c

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final /* synthetic */ NotEnoughAssetsDialog f39290b;

                                        {
                                            this.f39290b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i10) {
                                                case 0:
                                                    NotEnoughAssetsDialog.initViews$lambda$1$lambda$0(this.f39290b, view);
                                                    break;
                                                default:
                                                    NotEnoughAssetsDialog.initViews$lambda$2(this.f39290b, view);
                                                    break;
                                            }
                                        }
                                    });
                                    iconicsTextView2.setText(strW0);
                                    r0.R1(iconicsTextView2, "fonts/PalmPayNum-Bold.ttf");
                                }
                                X x7 = this.binding;
                                if (x7 != null) {
                                    final int i11 = 1;
                                    x7.f8176b.setOnClickListener(new View.OnClickListener(this) { // from class: l9.c

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final /* synthetic */ NotEnoughAssetsDialog f39290b;

                                        {
                                            this.f39290b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i11) {
                                                case 0:
                                                    NotEnoughAssetsDialog.initViews$lambda$1$lambda$0(this.f39290b, view);
                                                    break;
                                                default:
                                                    NotEnoughAssetsDialog.initViews$lambda$2(this.f39290b, view);
                                                    break;
                                            }
                                        }
                                    });
                                }
                                String strF = r0.F(this.amount);
                                X x10 = this.binding;
                                if (x10 != null) {
                                    x10.f8179e.setText(d0.j(" ", strF, G.i("Available Balance Below ")).setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorPrimary, getContext())).create());
                                }
                                X x11 = this.binding;
                                if (x11 != null) {
                                    x11.f8178d.setText(new SpanUtils().append("Your next top-up has a ").append("99% failure rate!").setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorWarning, getContext())).append("\nAdd money to boost success. Your PalmPay Account No:").setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, getContext())).create());
                                }
                                n0 n0VarG = n0.g();
                                ViewEvent viewEvent = new ViewEvent("PP_NotEnoughAssetsDialog");
                                String str = this.mTransType;
                                if (str != null) {
                                    n0VarG.u(viewEvent.add("element_name", str).add("element_details", strF));
                                    return;
                                } else {
                                    Intrinsics.n("mTransType");
                                    throw null;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }

    @NotNull
    public final NotEnoughAssetsDialog transType(@NotNull String transType) {
        Intrinsics.checkNotNullParameter(transType, "transType");
        this.mTransType = transType;
        return this;
    }
}
