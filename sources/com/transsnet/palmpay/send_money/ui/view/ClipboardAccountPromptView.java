package com.transsnet.palmpay.send_money.ui.view;

import Bc.p;
import Dd.g;
import Pa.AbstractC0508e;
import Pa.n0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159kd.e;
import p159kd.f;
import p159kd.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/view/ClipboardAccountPromptView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClipboardAccountPromptView extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f33832b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f33833a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ClipboardAccountPromptView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void c(String accountNo, String eventPrefix, Function1 onPaste) {
        Intrinsics.checkNotNullParameter(accountNo, "accountNo");
        Intrinsics.checkNotNullParameter(eventPrefix, "eventPrefix");
        Intrinsics.checkNotNullParameter(onPaste, "onPaste");
        p pVar = this.f33833a;
        ((TextView) pVar.f812c).setText(getContext().getString(h.sm_clipboard_account_copied, AbstractC0508e.b(accountNo)));
        ((TextView) pVar.f813d).setOnClickListener(new g(eventPrefix, this, onPaste, accountNo));
        p220oa.h.C(this);
        n0.g().v(eventPrefix.concat("_View"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ClipboardAccountPromptView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ClipboardAccountPromptView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ClipboardAccountPromptView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(f.sm_view_clipboard_account_prompt, (ViewGroup) this, false);
        addView(viewInflate);
        int i10 = e.tv_copied_account;
        TextView textView = (TextView) p059e1.a.m(i10, viewInflate);
        if (textView != null) {
            i10 = e.tv_paste;
            TextView textView2 = (TextView) p059e1.a.m(i10, viewInflate);
            if (textView2 != null) {
                p pVar = new p((ConstraintLayout) viewInflate, textView, textView2, 20);
                Intrinsics.checkNotNullExpressionValue(pVar, "inflate(...)");
                this.f33833a = pVar;
                p220oa.h.c(this);
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
