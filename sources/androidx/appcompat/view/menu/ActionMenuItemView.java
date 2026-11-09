package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39802c})
public class ActionMenuItemView extends AppCompatTextView implements MenuView.ItemView, View.OnClickListener, ActionMenuView.ActionMenuChildView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f12331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f12332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f12333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MenuBuilder$ItemInvoker f12334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f12335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f12336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12337g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f12339j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12340o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f12341p;

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public final boolean b() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (i7 < 480) {
            return (i7 >= 640 && i10 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void c() {
        boolean z3 = true;
        boolean z8 = !TextUtils.isEmpty(this.f12332b);
        if (this.f12333c != null && ((this.f12331a.f12465y & 4) != 4 || (!this.f12337g && !this.f12338i))) {
            z3 = false;
        }
        boolean z10 = z8 & z3;
        setText(z10 ? this.f12332b : null);
        CharSequence charSequence = this.f12331a.f12458q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z10 ? null : this.f12331a.f12446e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f12331a.f12459r;
        if (TextUtils.isEmpty(charSequence2)) {
            com.facebook.imagepipeline.nativecode.b.S(this, z10 ? null : this.f12331a.f12446e);
        } else {
            com.facebook.imagepipeline.nativecode.b.S(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public m getItemData() {
        return this.f12331a;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final void initialize(m mVar, int i7) {
        this.f12331a = mVar;
        setIcon(mVar.getIcon());
        setTitle(prefersCondensedTitle() ? mVar.getTitleCondensed() : mVar.f12446e);
        setId(mVar.f12442a);
        setVisibility(mVar.isVisible() ? 0 : 8);
        setEnabled(mVar.isEnabled());
        if (mVar.hasSubMenu() && this.f12335e == null) {
            this.f12335e = new b(this);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    public final boolean needsDividerAfter() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    public final boolean needsDividerBefore() {
        return !TextUtils.isEmpty(getText()) && this.f12331a.getIcon() == null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MenuBuilder$ItemInvoker menuBuilder$ItemInvoker = this.f12334d;
        if (menuBuilder$ItemInvoker != null) {
            menuBuilder$ItemInvoker.invokeItem(this.f12331a);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f12337g = b();
        c();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i11 = this.f12340o) >= 0) {
            super.setPadding(i11, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i7, i10);
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int measuredWidth = getMeasuredWidth();
        int i12 = this.f12339j;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i12) : i12;
        if (mode != 1073741824 && i12 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i10);
        }
        if (!zIsEmpty || this.f12333c == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f12333c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (this.f12331a.hasSubMenu() && (bVar = this.f12335e) != null && bVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final boolean prefersCondensedTitle() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z3) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z3) {
    }

    public void setExpandedFormat(boolean z3) {
        if (this.f12338i != z3) {
            this.f12338i = z3;
            m mVar = this.f12331a;
            if (mVar != null) {
                mVar.f12455n.onItemActionRequestChanged(mVar);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(Drawable drawable) {
        this.f12333c = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i7 = this.f12341p;
            if (intrinsicWidth > i7) {
                intrinsicHeight = (int) (intrinsicHeight * (i7 / intrinsicWidth));
                intrinsicWidth = i7;
            }
            if (intrinsicHeight > i7) {
                intrinsicWidth = (int) (intrinsicWidth * (i7 / intrinsicHeight));
            } else {
                i7 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i7);
        }
        setCompoundDrawables(drawable, null, null, null);
        c();
    }

    public void setItemInvoker(MenuBuilder$ItemInvoker menuBuilder$ItemInvoker) {
        this.f12334d = menuBuilder$ItemInvoker;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.f12340o = i7;
        super.setPadding(i7, i10, i11, i12);
    }

    public void setPopupCallback(c cVar) {
        this.f12336f = cVar;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final void setShortcut(boolean z3, char c6) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(CharSequence charSequence) {
        this.f12332b = charSequence;
        c();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final boolean showsIcon() {
        return true;
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Resources resources = context.getResources();
        this.f12337g = b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p241q.j.ActionMenuItemView, i7, 0);
        this.f12339j = typedArrayObtainStyledAttributes.getDimensionPixelSize(p241q.j.ActionMenuItemView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f12341p = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f12340o = -1;
        setSaveEnabled(false);
    }
}
