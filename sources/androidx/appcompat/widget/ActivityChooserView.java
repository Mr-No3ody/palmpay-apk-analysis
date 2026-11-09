package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.AbstractC1051c;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39802c})
public class ActivityChooserView extends ViewGroup implements ActivityChooserModel$ActivityChooserModelClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0881s f12590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewOnClickListenerC0883t f12591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f12592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FrameLayout f12593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f12594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FrameLayout f12595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AbstractC1051c f12596g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0878q f12597i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ListPopupWindow f12598j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PopupWindow.OnDismissListener f12599o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f12600p;

    @RestrictTo({p192n.c.f39802c})
    public static class InnerLayout extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f12601a = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Z0 z0E = Z0.e(context, attributeSet, f12601a);
            setBackgroundDrawable(z0E.b(0));
            z0E.g();
        }
    }

    public ActivityChooserView(@NonNull Context context) {
        this(context, null);
    }

    public final void a() {
        if (b()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f12597i);
            }
        }
    }

    public final boolean b() {
        return getListPopupWindow().f12724p0.isShowing();
    }

    @RestrictTo({p192n.c.f39800a})
    public AbstractC0874o getDataModel() {
        this.f12590a.getClass();
        return null;
    }

    public ListPopupWindow getListPopupWindow() {
        if (this.f12598j == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.f12598j = listPopupWindow;
            listPopupWindow.setAdapter(this.f12590a);
            ListPopupWindow listPopupWindow2 = this.f12598j;
            listPopupWindow2.f12702A = this;
            listPopupWindow2.f12721k0 = true;
            listPopupWindow2.f12724p0.setFocusable(true);
            ListPopupWindow listPopupWindow3 = this.f12598j;
            ViewOnClickListenerC0883t viewOnClickListenerC0883t = this.f12591b;
            listPopupWindow3.f12703B = viewOnClickListenerC0883t;
            listPopupWindow3.f12724p0.setOnDismissListener(viewOnClickListenerC0883t);
        }
        return this.f12598j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12590a.getClass();
        this.f12600p = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12590a.getClass();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f12597i);
        }
        if (b()) {
            a();
        }
        this.f12600p = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        this.f12592c.layout(0, 0, i11 - i7, i12 - i10);
        if (b()) {
            return;
        }
        a();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.f12595f.getVisibility() != 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        }
        View view = this.f12592c;
        measureChild(view, i7, i10);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.ActivityChooserModel$ActivityChooserModelClient
    @RestrictTo({p192n.c.f39800a})
    public void setActivityChooserModel(AbstractC0874o abstractC0874o) {
        C0881s c0881s = this.f12590a;
        c0881s.f13000a.f12590a.getClass();
        c0881s.notifyDataSetChanged();
        if (b()) {
            a();
            if (b() || !this.f12600p) {
                return;
            }
            c0881s.getClass();
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
    }

    public void setDefaultActionButtonContentDescription(int i7) {
    }

    public void setExpandActivityOverflowButtonContentDescription(int i7) {
        this.f12594e.setContentDescription(getContext().getString(i7));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f12594e.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i7) {
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f12599o = onDismissListener;
    }

    @RestrictTo({p192n.c.f39802c})
    public void setProvider(AbstractC1051c abstractC1051c) {
        this.f12596g = abstractC1051c;
    }

    public ActivityChooserView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        int i10 = 0;
        new C0876p(this, i10);
        this.f12597i = new ViewTreeObserverOnGlobalLayoutListenerC0878q(this, i10);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p241q.j.ActivityChooserView, i7, 0);
        androidx.core.view.N.p(this, context, p241q.j.ActivityChooserView, attributeSet, typedArrayObtainStyledAttributes, i7, 0);
        typedArrayObtainStyledAttributes.getInt(p241q.j.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(p241q.j.ActivityChooserView_expandActivityOverflowButtonDrawable);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(p241q.g.abc_activity_chooser_view, (ViewGroup) this, true);
        ViewOnClickListenerC0883t viewOnClickListenerC0883t = new ViewOnClickListenerC0883t(this);
        this.f12591b = viewOnClickListenerC0883t;
        View viewFindViewById = findViewById(p241q.f.activity_chooser_view_content);
        this.f12592c = viewFindViewById;
        viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(p241q.f.default_activity_button);
        this.f12595f = frameLayout;
        frameLayout.setOnClickListener(viewOnClickListenerC0883t);
        frameLayout.setOnLongClickListener(viewOnClickListenerC0883t);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(p241q.f.expand_activities_button);
        frameLayout2.setOnClickListener(viewOnClickListenerC0883t);
        frameLayout2.setAccessibilityDelegate(new r());
        frameLayout2.setOnTouchListener(new C0860h(this, frameLayout2, 1));
        this.f12593d = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(p241q.f.image);
        this.f12594e = imageView;
        imageView.setImageDrawable(drawable);
        C0881s c0881s = new C0881s(this);
        this.f12590a = c0881s;
        c0881s.registerDataSetObserver(new C0876p(this, 1));
        Resources resources = context.getResources();
        Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(p241q.d.abc_config_prefDialogWidth));
    }
}
