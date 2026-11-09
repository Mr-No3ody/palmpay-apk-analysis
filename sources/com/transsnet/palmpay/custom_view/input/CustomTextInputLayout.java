package com.transsnet.palmpay.custom_view.input;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.annotation.RequiresApi;
import com.google.android.material.textfield.TextInputLayout;
import com.transsnet.palmpay.custom_view.x;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class CustomTextInputLayout extends TextInputLayout {
    private static final String TAG = "CustomTextInputLayout";
    private Object collapsingTextHelper;
    private float hintSize;
    private Rect mCollapsedBounds;
    private Method recalculateMethod;
    private Method setCollapsedBoundsMethod;
    private Method setExpandedTextSizeMethod;
    private Method setTypefacesMethod;

    @RequiresApi(api = 19)
    public CustomTextInputLayout(Context context) {
        this(context, null);
    }

    private void adjustBounds() {
        Object obj = this.collapsingTextHelper;
        if (obj == null) {
            return;
        }
        try {
            this.setCollapsedBoundsMethod.invoke(obj, Integer.valueOf(this.mCollapsedBounds.left - getEditText().getCompoundPaddingLeft()), Integer.valueOf(this.mCollapsedBounds.top), Integer.valueOf(this.mCollapsedBounds.right), Integer.valueOf(this.mCollapsedBounds.bottom));
            this.setTypefacesMethod.invoke(this.collapsingTextHelper, Typeface.DEFAULT);
            float f10 = this.hintSize;
            if (f10 != -1.0f) {
                this.setExpandedTextSizeMethod.invoke(this.collapsingTextHelper, Float.valueOf(f10));
            }
            this.recalculateMethod.invoke(this.collapsingTextHelper, new Object[0]);
        } catch (IllegalAccessException e10) {
            e = e10;
            F6.d.c(TAG, e.getMessage());
        } catch (IllegalArgumentException e11) {
            e = e11;
            F6.d.c(TAG, e.getMessage());
        } catch (InvocationTargetException e12) {
            e = e12;
            F6.d.c(TAG, e.getMessage());
        }
    }

    @RequiresApi(api = 19)
    private void init() {
        try {
            Field declaredField = TextInputLayout.class.getDeclaredField("collapsingTextHelper");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            this.collapsingTextHelper = obj;
            Field declaredField2 = obj.getClass().getDeclaredField("collapsedBounds");
            declaredField2.setAccessible(true);
            this.mCollapsedBounds = (Rect) declaredField2.get(this.collapsingTextHelper);
            Class<?> cls = this.collapsingTextHelper.getClass();
            Class cls2 = Integer.TYPE;
            Method declaredMethod = cls.getDeclaredMethod("setCollapsedBounds", cls2, cls2, cls2, cls2);
            this.setCollapsedBoundsMethod = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = this.collapsingTextHelper.getClass().getDeclaredMethod("setExpandedTextSize", Float.TYPE);
            this.setExpandedTextSizeMethod = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = this.collapsingTextHelper.getClass().getDeclaredMethod("setTypefaces", Typeface.class);
            this.setTypefacesMethod = declaredMethod3;
            declaredMethod3.setAccessible(true);
            this.recalculateMethod = this.collapsingTextHelper.getClass().getDeclaredMethod("recalculate", new Class[0]);
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException e10) {
            this.collapsingTextHelper = null;
            this.mCollapsedBounds = null;
            this.recalculateMethod = null;
            this.setCollapsedBoundsMethod = null;
            F6.d.c(TAG, "init: ", e10);
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        super.onLayout(z3, i7, i10, i11, i12);
        adjustBounds();
    }

    @RequiresApi(api = 19)
    public CustomTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @RequiresApi(api = 19)
    public CustomTextInputLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.hintSize = context.obtainStyledAttributes(attributeSet, x.CustomTextInputLayout).getDimension(x.CustomTextInputLayout_editHintTextSize, -1.0f);
        init();
    }
}
