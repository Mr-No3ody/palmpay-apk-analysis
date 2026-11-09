package com.google.android.material.datepicker;

import Ed.ViewOnFocusChangeListenerC0235o;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import com.google.android.material.internal.ViewUtils;
import java.text.SimpleDateFormat;
import java.util.Collection;
import p024b9.g;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({p192n.c.f39801b})
public interface DateSelector<S> extends Parcelable {
    static boolean isTouchExplorationEnabled(@NonNull Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$showKeyboardWithAutoHideBehavior$0(EditText[] editTextArr, View view, boolean z3) {
        for (EditText editText : editTextArr) {
            if (editText.hasFocus()) {
                return;
            }
        }
        ViewUtils.hideKeyboard(view, false);
    }

    static void showKeyboardWithAutoHideBehavior(@NonNull EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        ViewOnFocusChangeListenerC0235o viewOnFocusChangeListenerC0235o = new ViewOnFocusChangeListenerC0235o(editTextArr, 12);
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(viewOnFocusChangeListenerC0235o);
        }
        EditText editText2 = editTextArr[0];
        editText2.postDelayed(new g(editText2, 20), 100L);
    }

    @StyleRes
    int getDefaultThemeResId(Context context);

    @StringRes
    int getDefaultTitleResId();

    @Nullable
    String getError();

    @NonNull
    Collection<Long> getSelectedDays();

    @NonNull
    Collection<p058e0.a> getSelectedRanges();

    @Nullable
    S getSelection();

    @NonNull
    String getSelectionContentDescription(@NonNull Context context);

    @NonNull
    String getSelectionDisplayString(Context context);

    boolean isSelectionComplete();

    @NonNull
    View onCreateTextInputView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, @NonNull CalendarConstraints calendarConstraints, @NonNull OnSelectionChangedListener<S> onSelectionChangedListener);

    void select(long j6);

    void setSelection(@NonNull S s3);

    void setTextInputFormat(@Nullable SimpleDateFormat simpleDateFormat);
}
