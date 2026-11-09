package com.flexibank.sdk.core.viewmodel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.gridlayout.widget.GridLayout;
import com.flexibank.sdk.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/flexibank/sdk/core/viewmodel/FlexiBankKeyboardGridLayout;", "Landroidx/gridlayout/widget/GridLayout;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/flexibank/sdk/core/viewmodel/FlexiBankKeyboardGridLayout$NumKeyboardClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setNumKeyboardClickListener", "(Lcom/flexibank/sdk/core/viewmodel/FlexiBankKeyboardGridLayout$NumKeyboardClickListener;)V", "NumKeyboardClickListener", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankKeyboardGridLayout extends GridLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public NumKeyboardClickListener f22093u0;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/flexibank/sdk/core/viewmodel/FlexiBankKeyboardGridLayout$NumKeyboardClickListener;", "", "onNumClick", "", "num", "", "onDeleteClick", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface NumKeyboardClickListener {
        void onDeleteClick();

        void onNumClick(@Nullable String num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexiBankKeyboardGridLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getId() == p.fb_digit_del) {
            NumKeyboardClickListener numKeyboardClickListener = this.f22093u0;
            if (numKeyboardClickListener != null) {
                Intrinsics.e(numKeyboardClickListener);
                numKeyboardClickListener.onDeleteClick();
                return;
            }
            return;
        }
        NumKeyboardClickListener numKeyboardClickListener2 = this.f22093u0;
        if (numKeyboardClickListener2 != null) {
            Intrinsics.e(numKeyboardClickListener2);
            numKeyboardClickListener2.onNumClick(((TextView) view).getText().toString());
        }
    }

    public final void setNumKeyboardClickListener(@Nullable NumKeyboardClickListener listener) {
        this.f22093u0 = listener;
        findViewById(p.fb_digit_0).setOnClickListener(this);
        findViewById(p.fb_digit_1).setOnClickListener(this);
        findViewById(p.fb_digit_2).setOnClickListener(this);
        findViewById(p.fb_digit_3).setOnClickListener(this);
        findViewById(p.fb_digit_4).setOnClickListener(this);
        findViewById(p.fb_digit_5).setOnClickListener(this);
        findViewById(p.fb_digit_6).setOnClickListener(this);
        findViewById(p.fb_digit_7).setOnClickListener(this);
        findViewById(p.fb_digit_8).setOnClickListener(this);
        findViewById(p.fb_digit_9).setOnClickListener(this);
        findViewById(p.fb_digit_del).setOnClickListener(this);
    }
}
