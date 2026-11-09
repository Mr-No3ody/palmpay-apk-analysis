package com.transsnet.palmpay.core.viewmodel;

import Ae.o;
import M3.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.g;
import p025ba.m;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/transsnet/palmpay/core/viewmodel/PayResultLotteryView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/transsnet/palmpay/core/bean/message/PushMessage;", "pushMessage", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/PushMessage;)V", "Lcom/transsnet/palmpay/core/viewmodel/ActivityWebView;", "a", "Lkotlin/Lazy;", "getPrlWebView", "()Lcom/transsnet/palmpay/core/viewmodel/ActivityWebView;", "prlWebView", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PayResultLotteryView extends ConstraintLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f28557c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f28558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PushMessage f28559b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PayResultLotteryView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ActivityWebView getPrlWebView() {
        Object value = this.f28558a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ActivityWebView) value;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.greenrobot.eventbus.c.b().j(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        org.greenrobot.eventbus.c.b().l(this);
        super.onDetachedFromWindow();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable PushMessage pushMessage) {
        if (pushMessage == null || !"99".equals(pushMessage.content.messageType)) {
            return;
        }
        this.f28559b = pushMessage;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PayResultLotteryView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayResultLotteryView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28558a = C2131j.b(new f(this, 22));
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.CorePayResultLotteryView);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            typedArrayObtainStyledAttributes.getString(m.CorePayResultLotteryView_corePrlTransType);
            typedArrayObtainStyledAttributes.recycle();
        }
        LayoutInflater.from(context).inflate(g.core_layout_pay_result_lottery_view, (ViewGroup) this, true);
        getPrlWebView().setLayerType(2, null);
        getPrlWebView().setWebChromeClient(new o(this, 4));
    }
}
