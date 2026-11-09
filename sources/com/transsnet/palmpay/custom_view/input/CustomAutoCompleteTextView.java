package com.transsnet.palmpay.custom_view.input;

import Ed.ViewOnTouchListenerC0223c;
import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.transsnet.palmpay.core.ui.activity.T;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u0010\u0010\u001d\u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u000fJ\u0014\u0010\u001f\u001a\u00020\u00152\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\rJ\u0014\u0010!\u001a\u00020\u00152\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\rJ\u0014\u0010#\u001a\u00020\u00152\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\rJ\b\u0010%\u001a\u0004\u0018\u00010\u0011R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006&"}, d2 = {"Lcom/transsnet/palmpay/custom_view/input/CustomAutoCompleteTextView;", "Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mBackGroundId", "Lkotlin/Function0;", "onDropDownListTouchListener", "Lcom/transsnet/palmpay/custom_view/input/OnDropDownListTouchListener;", "mPopup", "Landroidx/appcompat/widget/ListPopupWindow;", "dropDownWidthProvider", "dropDownHorizontalOffsetProvider", "replaceText", "", ReactTextInputShadowNode.PROP_TEXT, "", "showDropDown", "dropDownListView", "Landroid/widget/ListView;", "getDropDownListView", "()Landroid/widget/ListView;", "setOnDropDownListTouchListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setDropDownListBackgroundResource", "resId", "setDropDownWidth", "widthProvider", "setDropDownHorizontalOffset", "offsetProvider", "getPopup", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CustomAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    @NotNull
    private Function0<Integer> dropDownHorizontalOffsetProvider;

    @NotNull
    private Function0<Integer> dropDownWidthProvider;

    @NotNull
    private Function0<Integer> mBackGroundId;

    @Nullable
    private ListPopupWindow mPopup;

    @Nullable
    private OnDropDownListTouchListener onDropDownListTouchListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomAutoCompleteTextView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mBackGroundId = new T(11);
        this.dropDownWidthProvider = new X6.c(this, 21);
        this.dropDownHorizontalOffsetProvider = new T(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int dropDownHorizontalOffsetProvider$lambda$2() {
        return 0;
    }

    private final ListView getDropDownListView() {
        try {
            Field declaredField = AutoCompleteTextView.class.getDeclaredField("mPopup");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            this.mPopup = obj instanceof ListPopupWindow ? (ListPopupWindow) obj : null;
            Field declaredField2 = obj != null ? obj.getClass().getDeclaredField("mDropDownList") : null;
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj2 = declaredField2 != null ? declaredField2.get(obj) : null;
            if (obj2 instanceof ListView) {
                return (ListView) obj2;
            }
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDropDown$lambda$3(CustomAutoCompleteTextView customAutoCompleteTextView, View view, MotionEvent motionEvent) {
        OnDropDownListTouchListener onDropDownListTouchListener = customAutoCompleteTextView.onDropDownListTouchListener;
        return onDropDownListTouchListener != null && onDropDownListTouchListener.onTouch(motionEvent);
    }

    @Nullable
    /* JADX INFO: renamed from: getPopup, reason: from getter */
    public final ListPopupWindow getMPopup() {
        return this.mPopup;
    }

    @Override // android.widget.AutoCompleteTextView
    public void replaceText(@Nullable CharSequence text) {
    }

    public final void setDropDownHorizontalOffset(@NotNull Function0<Integer> offsetProvider) {
        Intrinsics.checkNotNullParameter(offsetProvider, "offsetProvider");
        this.dropDownHorizontalOffsetProvider = offsetProvider;
    }

    public final void setDropDownListBackgroundResource(@NotNull Function0<Integer> resId) {
        Intrinsics.checkNotNullParameter(resId, "resId");
        this.mBackGroundId = resId;
    }

    public final void setDropDownWidth(@NotNull Function0<Integer> widthProvider) {
        Intrinsics.checkNotNullParameter(widthProvider, "widthProvider");
        this.dropDownWidthProvider = widthProvider;
    }

    public final void setOnDropDownListTouchListener(@Nullable OnDropDownListTouchListener listener) {
        this.onDropDownListTouchListener = listener;
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        int iIntValue = this.dropDownWidthProvider.invoke().intValue();
        if (iIntValue > 0) {
            setDropDownWidth(iIntValue);
        }
        setDropDownHorizontalOffset(this.dropDownHorizontalOffsetProvider.invoke().intValue());
        super.showDropDown();
        ListView dropDownListView = getDropDownListView();
        if (dropDownListView != null) {
            dropDownListView.setSelector(R.color.transparent);
        }
        int iIntValue2 = this.mBackGroundId.invoke().intValue();
        if (iIntValue2 > 0 && dropDownListView != null) {
            dropDownListView.setBackgroundResource(iIntValue2);
        }
        if (dropDownListView != null) {
            dropDownListView.setHorizontalScrollBarEnabled(false);
        }
        if (dropDownListView != null) {
            dropDownListView.setVerticalScrollBarEnabled(false);
        }
        if (dropDownListView != null) {
            dropDownListView.setOnTouchListener(new ViewOnTouchListenerC0223c(this, 6));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomAutoCompleteTextView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.mBackGroundId = new T(11);
        this.dropDownWidthProvider = new X6.c(this, 21);
        this.dropDownHorizontalOffsetProvider = new T(12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomAutoCompleteTextView(@NotNull Context context, @NotNull AttributeSet attrs, int i7) {
        super(context, attrs, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.mBackGroundId = new T(11);
        this.dropDownWidthProvider = new X6.c(this, 21);
        this.dropDownHorizontalOffsetProvider = new T(12);
    }
}
