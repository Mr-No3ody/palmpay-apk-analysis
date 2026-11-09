package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.view.TintableBackgroundView;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner implements TintableBackgroundView {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f12612j = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0885u f12613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f12614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F f12615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f12616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SpinnerPopup f12618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12619g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f12620i;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new N();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f12621a;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeByte(this.f12621a ? (byte) 1 : (byte) 0);
        }
    }

    @VisibleForTesting
    public interface SpinnerPopup {
        void dismiss();

        Drawable getBackground();

        CharSequence getHintText();

        int getHorizontalOffset();

        int getHorizontalOriginalOffset();

        int getVerticalOffset();

        boolean isShowing();

        void setAdapter(ListAdapter listAdapter);

        void setBackgroundDrawable(Drawable drawable);

        void setHorizontalOffset(int i7);

        void setHorizontalOriginalOffset(int i7);

        void setPromptText(CharSequence charSequence);

        void setVerticalOffset(int i7);

        void show(int i7, int i10);
    }

    public AppCompatSpinner(@NonNull Context context) {
        this(context, null);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i7 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f12620i;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0885u c0885u = this.f12613a;
        if (c0885u != null) {
            c0885u.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        SpinnerPopup spinnerPopup = this.f12618f;
        return spinnerPopup != null ? spinnerPopup.getHorizontalOffset() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        SpinnerPopup spinnerPopup = this.f12618f;
        return spinnerPopup != null ? spinnerPopup.getVerticalOffset() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f12618f != null ? this.f12619g : super.getDropDownWidth();
    }

    @VisibleForTesting
    public final SpinnerPopup getInternalPopup() {
        return this.f12618f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        SpinnerPopup spinnerPopup = this.f12618f;
        return spinnerPopup != null ? spinnerPopup.getBackground() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f12614b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        SpinnerPopup spinnerPopup = this.f12618f;
        return spinnerPopup != null ? spinnerPopup.getHintText() : super.getPrompt();
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({p192n.c.f39802c})
    public ColorStateList getSupportBackgroundTintList() {
        C0885u c0885u = this.f12613a;
        if (c0885u != null) {
            return c0885u.b();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({p192n.c.f39802c})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0885u c0885u = this.f12613a;
        if (c0885u != null) {
            return c0885u.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SpinnerPopup spinnerPopup = this.f12618f;
        if (spinnerPopup == null || !spinnerPopup.isShowing()) {
            return;
        }
        spinnerPopup.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.f12618f == null || View.MeasureSpec.getMode(i7) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i7)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f12621a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new G(this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SpinnerPopup spinnerPopup = this.f12618f;
        savedState.f12621a = spinnerPopup != null && spinnerPopup.isShowing();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        F f10 = this.f12615c;
        if (f10 == null || !f10.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        SpinnerPopup spinnerPopup = this.f12618f;
        if (spinnerPopup == null) {
            return super.performClick();
        }
        if (spinnerPopup.isShowing()) {
            return true;
        }
        this.f12618f.show(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0885u c0885u = this.f12613a;
        if (c0885u != null) {
            c0885u.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i7) {
        super.setBackgroundResource(i7);
        C0885u c0885u = this.f12613a;
        if (c0885u != null) {
            c0885u.f(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i7) {
        SpinnerPopup spinnerPopup = this.f12618f;
        if (spinnerPopup == null) {
            super.setDropDownHorizontalOffset(i7);
        } else {
            spinnerPopup.setHorizontalOriginalOffset(i7);
            spinnerPopup.setHorizontalOffset(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i7) {
        SpinnerPopup spinnerPopup = this.f12618f;
        if (spinnerPopup != null) {
            spinnerPopup.setVerticalOffset(i7);
        } else {
            super.setDropDownVerticalOffset(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i7) {
        if (this.f12618f != null) {
            this.f12619g = i7;
        } else {
            super.setDropDownWidth(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        SpinnerPopup spinnerPopup = this.f12618f;
        if (spinnerPopup != null) {
            spinnerPopup.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(@DrawableRes int i7) {
        setPopupBackgroundDrawable(p264r5.a.q(i7, getPopupContext()));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        SpinnerPopup spinnerPopup = this.f12618f;
        if (spinnerPopup != null) {
            spinnerPopup.setPromptText(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({p192n.c.f39802c})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C0885u c0885u = this.f12613a;
        if (c0885u != null) {
            c0885u.h(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({p192n.c.f39802c})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C0885u c0885u = this.f12613a;
        if (c0885u != null) {
            c0885u.i(mode);
        }
    }

    public AppCompatSpinner(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p241q.a.spinnerStyle);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f12617e) {
            this.f12616d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        SpinnerPopup spinnerPopup = this.f12618f;
        if (spinnerPopup != null) {
            Context context = this.f12614b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            J j6 = new J();
            j6.f12691a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                j6.f12692b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof android.widget.ThemedSpinnerAdapter) {
                    H.a((android.widget.ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() == null) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                    }
                }
            }
            spinnerPopup.setAdapter(j6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x0098  */
    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c8  */
    public AppCompatSpinner(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i7);
        this.f12620i = new Rect();
        W0.a(this, getContext());
        Z0 z0F = Z0.f(context, attributeSet, p241q.j.Spinner, i7, 0);
        this.f12613a = new C0885u(this);
        int i10 = p241q.j.Spinner_popupTheme;
        TypedArray typedArray = z0F.f12863b;
        int resourceId = typedArray.getResourceId(i10, 0);
        if (resourceId != 0) {
            this.f12614b = new ContextThemeWrapper(context, resourceId);
        } else {
            this.f12614b = context;
        }
        int i11 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f12612j, i7, 0);
            try {
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                    i11 = typedArrayObtainStyledAttributes.getInt(0, 0);
                }
            } catch (Exception unused) {
                if (typedArrayObtainStyledAttributes != null) {
                }
                if (i11 != 0) {
                    I i12 = new I(this);
                    this.f12618f = i12;
                    i12.f12688c = typedArray.getString(p241q.j.Spinner_android_prompt);
                } else if (i11 == 1) {
                    M m7 = new M(this, this.f12614b, attributeSet, i7);
                    Z0 z0F2 = Z0.f(this.f12614b, attributeSet, p241q.j.Spinner, i7, 0);
                    this.f12619g = z0F2.f12863b.getLayoutDimension(p241q.j.Spinner_android_dropDownWidth, -2);
                    m7.setBackgroundDrawable(z0F2.b(p241q.j.Spinner_android_popupBackground));
                    m7.f12727s0 = typedArray.getString(p241q.j.Spinner_android_prompt);
                    z0F2.g();
                    this.f12618f = m7;
                    this.f12615c = new F(this, this, m7);
                }
                textArray = typedArray.getTextArray(p241q.j.Spinner_android_entries);
                if (textArray != null) {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                    arrayAdapter.setDropDownViewResource(p241q.g.support_simple_spinner_dropdown_item);
                    setAdapter((SpinnerAdapter) arrayAdapter);
                }
                z0F.g();
                this.f12617e = true;
                spinnerAdapter = this.f12616d;
                if (spinnerAdapter != null) {
                    setAdapter(spinnerAdapter);
                    this.f12616d = null;
                }
                this.f12613a.d(attributeSet, i7);
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception unused2) {
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i11 != 0) {
            I i13 = new I(this);
            this.f12618f = i13;
            i13.f12688c = typedArray.getString(p241q.j.Spinner_android_prompt);
        } else if (i11 == 1) {
            M m10 = new M(this, this.f12614b, attributeSet, i7);
            Z0 z0F3 = Z0.f(this.f12614b, attributeSet, p241q.j.Spinner, i7, 0);
            this.f12619g = z0F3.f12863b.getLayoutDimension(p241q.j.Spinner_android_dropDownWidth, -2);
            m10.setBackgroundDrawable(z0F3.b(p241q.j.Spinner_android_popupBackground));
            m10.f12727s0 = typedArray.getString(p241q.j.Spinner_android_prompt);
            z0F3.g();
            this.f12618f = m10;
            this.f12615c = new F(this, this, m10);
        }
        textArray = typedArray.getTextArray(p241q.j.Spinner_android_entries);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(p241q.g.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        z0F.g();
        this.f12617e = true;
        spinnerAdapter = this.f12616d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f12616d = null;
        }
        this.f12613a.d(attributeSet, i7);
    }
}
