package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.ShowableListMenu;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class ListPopupWindow implements ShowableListMenu {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final Method f12700q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final Method f12701r0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public View f12702A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public AdapterView.OnItemClickListener f12703B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f12704C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final RunnableC0882s0 f12705H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final ViewOnTouchListenerC0888v0 f12706L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final C0886u0 f12707M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final RunnableC0882s0 f12708Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final Handler f12709X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Rect f12710Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Rect f12711Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ListAdapter f12713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DropDownListView f12714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12718g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f12719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12720j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f12721k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f12722o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f12723p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final PopupWindow f12724p0;
    public int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f12725v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C0884t0 f12726w;

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f12700q0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f12701r0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public ListPopupWindow(Context context) {
        this(context, null, p241q.a.listPopupWindowStyle);
    }

    public DropDownListView a(Context context, boolean z3) {
        return new DropDownListView(context, z3);
    }

    public final void b(int i7) {
        Drawable background = this.f12724p0.getBackground();
        if (background == null) {
            this.f12716e = i7;
            return;
        }
        Rect rect = this.f12710Y;
        background.getPadding(rect);
        this.f12716e = rect.left + rect.right + i7;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void dismiss() {
        PopupWindow popupWindow = this.f12724p0;
        popupWindow.dismiss();
        popupWindow.setContentView(null);
        this.f12714c = null;
        this.f12709X.removeCallbacks(this.f12705H);
    }

    public final Drawable getBackground() {
        return this.f12724p0.getBackground();
    }

    public final int getHorizontalOffset() {
        return this.f12717f;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final ListView getListView() {
        return this.f12714c;
    }

    public final int getVerticalOffset() {
        if (this.f12720j) {
            return this.f12718g;
        }
        return 0;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final boolean isShowing() {
        return this.f12724p0.isShowing();
    }

    public void setAdapter(ListAdapter listAdapter) {
        C0884t0 c0884t0 = this.f12726w;
        if (c0884t0 == null) {
            this.f12726w = new C0884t0(this, 0);
        } else {
            ListAdapter listAdapter2 = this.f12713b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c0884t0);
            }
        }
        this.f12713b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f12726w);
        }
        DropDownListView dropDownListView = this.f12714c;
        if (dropDownListView != null) {
            dropDownListView.setAdapter(this.f12713b);
        }
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        this.f12724p0.setBackgroundDrawable(drawable);
    }

    public final void setHorizontalOffset(int i7) {
        this.f12717f = i7;
    }

    public final void setVerticalOffset(int i7) {
        this.f12718g = i7;
        this.f12720j = true;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void show() {
        int i7;
        int iMakeMeasureSpec;
        int paddingBottom;
        DropDownListView dropDownListView;
        DropDownListView dropDownListView2 = this.f12714c;
        PopupWindow popupWindow = this.f12724p0;
        Context context = this.f12712a;
        if (dropDownListView2 == null) {
            DropDownListView dropDownListViewA = a(context, !this.f12721k0);
            this.f12714c = dropDownListViewA;
            dropDownListViewA.setAdapter(this.f12713b);
            this.f12714c.setOnItemClickListener(this.f12703B);
            this.f12714c.setFocusable(true);
            this.f12714c.setFocusableInTouchMode(true);
            this.f12714c.setOnItemSelectedListener(new C0877p0(this, 0));
            this.f12714c.setOnScrollListener(this.f12707M);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f12704C;
            if (onItemSelectedListener != null) {
                this.f12714c.setOnItemSelectedListener(onItemSelectedListener);
            }
            popupWindow.setContentView(this.f12714c);
        }
        Drawable background = popupWindow.getBackground();
        Rect rect = this.f12710Y;
        if (background != null) {
            background.getPadding(rect);
            int i10 = rect.top;
            i7 = rect.bottom + i10;
            if (!this.f12720j) {
                this.f12718g = -i10;
            }
        } else {
            rect.setEmpty();
            i7 = 0;
        }
        int iA = AbstractC0879q0.a(popupWindow, this.f12702A, this.f12718g, popupWindow.getInputMethodMode() == 2);
        int i11 = this.f12715d;
        if (i11 == -1) {
            paddingBottom = iA + i7;
        } else {
            int i12 = this.f12716e;
            if (i12 != -2) {
                iMakeMeasureSpec = i12 != -1 ? View.MeasureSpec.makeMeasureSpec(i12, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.f12714c.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f12714c.getPaddingBottom() + this.f12714c.getPaddingTop() + i7 : 0);
        }
        boolean z3 = this.f12724p0.getInputMethodMode() == 2;
        popupWindow.setWindowLayoutType(this.f12719i);
        if (popupWindow.isShowing()) {
            if (this.f12702A.isAttachedToWindow()) {
                int width = this.f12716e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f12702A.getWidth();
                }
                if (i11 == -1) {
                    i11 = z3 ? paddingBottom : -1;
                    if (z3) {
                        popupWindow.setWidth(this.f12716e == -1 ? -1 : 0);
                        popupWindow.setHeight(0);
                    } else {
                        popupWindow.setWidth(this.f12716e == -1 ? -1 : 0);
                        popupWindow.setHeight(-1);
                    }
                } else if (i11 == -2) {
                    i11 = paddingBottom;
                }
                popupWindow.setOutsideTouchable(true);
                View view = this.f12702A;
                int i13 = this.f12717f;
                int i14 = this.f12718g;
                if (width < 0) {
                    width = -1;
                }
                popupWindow.update(view, i13, i14, width, i11 < 0 ? -1 : i11);
                return;
            }
            return;
        }
        int width2 = this.f12716e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f12702A.getWidth();
        }
        if (i11 == -1) {
            i11 = -1;
        } else if (i11 == -2) {
            i11 = paddingBottom;
        }
        popupWindow.setWidth(width2);
        popupWindow.setHeight(i11);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f12700q0;
            if (method != null) {
                try {
                    method.invoke(popupWindow, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        } else {
            AbstractC0880r0.b(popupWindow, true);
        }
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchInterceptor(this.f12706L);
        if (this.f12723p) {
            popupWindow.setOverlapAnchor(this.f12722o);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f12701r0;
            if (method2 != null) {
                try {
                    method2.invoke(popupWindow, this.f12711Z);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            AbstractC0880r0.a(popupWindow, this.f12711Z);
        }
        popupWindow.showAsDropDown(this.f12702A, this.f12717f, this.f12718g, this.t);
        this.f12714c.setSelection(-1);
        if ((!this.f12721k0 || this.f12714c.isInTouchMode()) && (dropDownListView = this.f12714c) != null) {
            dropDownListView.setListSelectionHidden(true);
            dropDownListView.requestLayout();
        }
        if (this.f12721k0) {
            return;
        }
        this.f12709X.post(this.f12708Q);
    }

    public ListPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p241q.a.listPopupWindowStyle);
    }

    public ListPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i7) {
        this(context, attributeSet, i7, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i7, int i10) {
        this.f12715d = -2;
        this.f12716e = -2;
        this.f12719i = 1002;
        this.t = 0;
        this.f12725v = Integer.MAX_VALUE;
        this.f12705H = new RunnableC0882s0(this, 1);
        this.f12706L = new ViewOnTouchListenerC0888v0(this);
        this.f12707M = new C0886u0(this);
        this.f12708Q = new RunnableC0882s0(this, 0);
        this.f12710Y = new Rect();
        this.f12712a = context;
        this.f12709X = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p241q.j.ListPopupWindow, i7, 0);
        this.f12717f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p241q.j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p241q.j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f12718g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f12720j = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i7, 0);
        appCompatPopupWindow.a(context, attributeSet, i7);
        this.f12724p0 = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}
