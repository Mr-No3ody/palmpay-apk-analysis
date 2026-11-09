package com.transsnet.palmpay.custom_view.input;

import G7.f;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import android.widget.ListPopupWindow;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0014\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/custom_view/input/InputAutoCompleteTextView;", "Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "externalOnDismissListener", "Lkotlin/Function0;", "", "setInternalOnDismissListener", "setOnDismissListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InputAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    @Nullable
    private Function0<Unit> externalOnDismissListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputAutoCompleteTextView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setInternalOnDismissListener();
    }

    private final void setInternalOnDismissListener() {
        try {
            Field declaredField = AutoCompleteTextView.class.getDeclaredField("mPopup");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Intrinsics.f(obj, "null cannot be cast to non-null type android.widget.ListPopupWindow");
            ((ListPopupWindow) obj).setOnDismissListener(new f(this, 2));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setInternalOnDismissListener$lambda$0(InputAutoCompleteTextView inputAutoCompleteTextView) {
        Function0<Unit> function0 = inputAutoCompleteTextView.externalOnDismissListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setOnDismissListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.externalOnDismissListener = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputAutoCompleteTextView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        setInternalOnDismissListener();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputAutoCompleteTextView(@NotNull Context context, @NotNull AttributeSet attrs, int i7) {
        super(context, attrs, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        setInternalOnDismissListener();
    }
}
