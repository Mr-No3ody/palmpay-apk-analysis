package com.transsnet.palmpay.custom_view.dialog;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/transsnet/palmpay/custom_view/dialog/BaseChainResponsibilityDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "layoutId", "<init>", "(Landroid/content/Context;I)V", "", "handlerChain", "()V", "interceptChain", "nextChain", "Lcom/transsnet/palmpay/custom_view/dialog/BaseChainResponsibilityDialog;", "getNextChain", "()Lcom/transsnet/palmpay/custom_view/dialog/BaseChainResponsibilityDialog;", "setNextChain", "(Lcom/transsnet/palmpay/custom_view/dialog/BaseChainResponsibilityDialog;)V", "", "loanProduct", "Ljava/lang/String;", "getLoanProduct", "()Ljava/lang/String;", "setLoanProduct", "(Ljava/lang/String;)V", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseChainResponsibilityDialog extends b {

    @Nullable
    private String loanProduct;

    @Nullable
    private BaseChainResponsibilityDialog nextChain;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BaseChainResponsibilityDialog(@NotNull Context context, int i7) {
        super(context, i7);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    public final String getLoanProduct() {
        return this.loanProduct;
    }

    @Nullable
    public final BaseChainResponsibilityDialog getNextChain() {
        return this.nextChain;
    }

    public abstract void handlerChain();

    public final void interceptChain() {
        show();
        this.nextChain = null;
    }

    public final void setLoanProduct(@Nullable String str) {
        this.loanProduct = str;
    }

    public final void setNextChain(@Nullable BaseChainResponsibilityDialog baseChainResponsibilityDialog) {
        this.nextChain = baseChainResponsibilityDialog;
    }
}
