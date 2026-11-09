package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39802c})
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f12848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LayoutInflater f12849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnInflateListener f12850e;

    public interface OnInflateListener {
        void onInflate(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f12846a == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f12849d;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f12846a, viewGroup, false);
        int i7 = this.f12847b;
        if (i7 != -1) {
            viewInflate.setId(i7);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f12848c = new WeakReference(viewInflate);
        OnInflateListener onInflateListener = this.f12850e;
        if (onInflateListener != null) {
            onInflateListener.onInflate(this, viewInflate);
        }
        return viewInflate;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f12847b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f12849d;
    }

    public int getLayoutResource() {
        return this.f12846a;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i7) {
        this.f12847b = i7;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f12849d = layoutInflater;
    }

    public void setLayoutResource(int i7) {
        this.f12846a = i7;
    }

    public void setOnInflateListener(OnInflateListener onInflateListener) {
        this.f12850e = onInflateListener;
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        WeakReference weakReference = this.f12848c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i7);
            return;
        }
        super.setVisibility(i7);
        if (i7 == 0 || i7 == 4) {
            a();
        }
    }

    public ViewStubCompat(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f12846a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p241q.j.ViewStubCompat, i7, 0);
        this.f12847b = typedArrayObtainStyledAttributes.getResourceId(p241q.j.ViewStubCompat_android_inflatedId, -1);
        this.f12846a = typedArrayObtainStyledAttributes.getResourceId(p241q.j.ViewStubCompat_android_layout, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(p241q.j.ViewStubCompat_android_id, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
