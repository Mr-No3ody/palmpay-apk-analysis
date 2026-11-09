package com.facebook.react.devsupport;

import Ab.y;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.E;
import androidx.core.view.N;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.q0;
import com.facebook.react.R;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/facebook/react/devsupport/LogBoxDialog;", "Landroid/app/Dialog;", "context", "Landroid/app/Activity;", "reactRootView", "Landroid/view/View;", "<init>", "(Landroid/app/Activity;Landroid/view/View;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LogBoxDialog extends Dialog {

    @Nullable
    private final View reactRootView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogBoxDialog(@NotNull Activity context, @Nullable View view) {
        super(context, R.style.Theme_Catalyst_LogBox);
        Intrinsics.checkNotNullParameter(context, "context");
        this.reactRootView = view;
        requestWindowFeature(1);
        if (view != null) {
            setContentView(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q0 onCreate$lambda$3$lambda$1(int i7, View view, q0 windowInsets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        androidx.core.graphics.e eVarG = windowInsets.f16277a.g(i7);
        Intrinsics.checkNotNullExpressionValue(eVarG, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.f(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).setMargins(eVarG.f16058a, eVarG.f16059b, eVarG.f16060c, eVarG.f16061d);
        return q0.f16276b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q0 onCreate$lambda$3$lambda$2(Function2 function2, View p3, q0 p10) {
        Intrinsics.checkNotNullParameter(p3, "p0");
        Intrinsics.checkNotNullParameter(p10, "p1");
        return (q0) function2.invoke(p3, p10);
    }

    @Override // android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(-16777216));
        }
        View view = this.reactRootView;
        if (view != null) {
            final y yVar = new y(22);
            OnApplyWindowInsetsListener onApplyWindowInsetsListener = new OnApplyWindowInsetsListener() { // from class: com.facebook.react.devsupport.l
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final q0 onApplyWindowInsets(View view2, q0 q0Var) {
                    return LogBoxDialog.onCreate$lambda$3$lambda$2(yVar, view2, q0Var);
                }
            };
            WeakHashMap weakHashMap = N.f16168a;
            E.n(view, onApplyWindowInsetsListener);
        }
    }
}
