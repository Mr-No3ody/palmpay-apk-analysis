package androidx.appcompat.view.menu;

import Ce.ViewOnAttachStateChangeListenerC0160b;
import N8.q0;
import Pa.C0525w;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AbstractC0890w0;
import androidx.appcompat.widget.AbstractC0892x0;
import androidx.appcompat.widget.C0894y0;
import androidx.appcompat.widget.DropDownListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class g extends r implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f12395q0 = p241q.g.abc_cascading_menu_item_layout;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public View f12396A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f12397B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f12398C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f12399H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f12400L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f12401M;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f12403X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public MenuPresenter.Callback f12404Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ViewTreeObserver f12405Z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f12406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f12410f;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public s f12414k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f12417p0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f12419w;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f12411g = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f12412i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Be.c f12413j = new Be.c(this, 8);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0160b f12415o = new ViewOnAttachStateChangeListenerC0160b(this, 5);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0525w f12416p = new C0525w(this, 12);
    public int t = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f12418v = 0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f12402Q = false;

    public g(Context context, View view, int i7, boolean z3) {
        this.f12406b = context;
        this.f12419w = view;
        this.f12408d = i7;
        this.f12409e = z3;
        this.f12397B = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f12407c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(p241q.d.abc_config_prefDialogWidth));
        this.f12410f = new Handler();
    }

    @Override // androidx.appcompat.view.menu.r
    public final void a(k kVar) {
        kVar.addMenuPresenter(this, this.f12406b);
        if (isShowing()) {
            j(kVar);
        } else {
            this.f12411g.add(kVar);
        }
    }

    @Override // androidx.appcompat.view.menu.r
    public final void c(View view) {
        if (this.f12419w != view) {
            this.f12419w = view;
            this.f12418v = Gravity.getAbsoluteGravity(this.t, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.r
    public final void d(boolean z3) {
        this.f12402Q = z3;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void dismiss() {
        ArrayList arrayList = this.f12412i;
        int size = arrayList.size();
        if (size > 0) {
            f[] fVarArr = (f[]) arrayList.toArray(new f[size]);
            for (int i7 = size - 1; i7 >= 0; i7--) {
                f fVar = fVarArr[i7];
                if (fVar.f12392a.f12724p0.isShowing()) {
                    fVar.f12392a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.r
    public final void e(int i7) {
        if (this.t != i7) {
            this.t = i7;
            this.f12418v = Gravity.getAbsoluteGravity(i7, this.f12419w.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.r
    public final void f(int i7) {
        this.f12398C = true;
        this.f12400L = i7;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.r
    public final void g(PopupWindow.OnDismissListener onDismissListener) {
        this.f12414k0 = (s) onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final ListView getListView() {
        ArrayList arrayList = this.f12412i;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((f) q0.i(1, arrayList)).f12392a.f12714c;
    }

    @Override // androidx.appcompat.view.menu.r
    public final void h(boolean z3) {
        this.f12403X = z3;
    }

    @Override // androidx.appcompat.view.menu.r
    public final void i(int i7) {
        this.f12399H = true;
        this.f12401M = i7;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final boolean isShowing() {
        ArrayList arrayList = this.f12412i;
        return arrayList.size() > 0 && ((f) arrayList.get(0)).f12392a.f12724p0.isShowing();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01de  */
    /* JADX WARN: Code duplicated, block: B:111:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0100  */
    /* JADX WARN: Code duplicated, block: B:57:0x0108  */
    /* JADX WARN: Code duplicated, block: B:61:0x0116  */
    /* JADX WARN: Code duplicated, block: B:64:0x0145  */
    /* JADX WARN: Code duplicated, block: B:66:0x0151  */
    /* JADX WARN: Code duplicated, block: B:68:0x0154  */
    /* JADX WARN: Code duplicated, block: B:69:0x0156  */
    /* JADX WARN: Code duplicated, block: B:73:0x015e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0160  */
    /* JADX WARN: Code duplicated, block: B:77:0x016a  */
    /* JADX WARN: Code duplicated, block: B:78:0x016f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0182  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:87:0x01af A[PHI: r5
      0x01af: PHI (r5v16 int) = (r5v8 int), (r5v17 int) binds: [B:88:0x01b1, B:86:0x01ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d8  */
    public final void j(k kVar) {
        boolean z3;
        int i7;
        f fVar;
        View childAt;
        Rect rect;
        Rect rect2;
        int i10;
        PopupWindow popupWindow;
        DropDownListView dropDownListView;
        int[] iArr;
        Rect rect3;
        int i11;
        boolean z8;
        int[] iArr2;
        int[] iArr3;
        int i12;
        int i13;
        int width;
        Method method;
        MenuItem item;
        j jVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f12406b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        j jVar2 = new j(kVar, layoutInflaterFrom, this.f12409e, f12395q0);
        if (!isShowing() && this.f12402Q) {
            jVar2.f12431c = true;
        } else if (isShowing()) {
            int size = kVar.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    z3 = false;
                    break;
                }
                MenuItem item2 = kVar.getItem(i14);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z3 = true;
                    break;
                }
                i14++;
            }
            jVar2.f12431c = z3;
        }
        int iB = r.b(jVar2, context, this.f12407c);
        C0894y0 c0894y0 = new C0894y0(context, null, this.f12408d, 0);
        c0894y0.f13031s0 = this.f12416p;
        c0894y0.f12703B = this;
        c0894y0.f12724p0.setOnDismissListener(this);
        c0894y0.f12702A = this.f12419w;
        c0894y0.t = this.f12418v;
        c0894y0.f12721k0 = true;
        c0894y0.f12724p0.setFocusable(true);
        c0894y0.f12724p0.setInputMethodMode(2);
        c0894y0.setAdapter(jVar2);
        c0894y0.b(iB);
        c0894y0.t = this.f12418v;
        ArrayList arrayList = this.f12412i;
        if (arrayList.size() > 0) {
            fVar = (f) q0.i(1, arrayList);
            k kVar2 = fVar.f12393b;
            int size2 = kVar2.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size2) {
                    item = null;
                    break;
                }
                item = kVar2.getItem(i15);
                if (item.hasSubMenu() && kVar == item.getSubMenu()) {
                    break;
                } else {
                    i15++;
                }
            }
            if (item == null) {
                i7 = 1;
                childAt = null;
            } else {
                DropDownListView dropDownListView2 = fVar.f12392a.f12714c;
                ListAdapter adapter = dropDownListView2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    jVar = (j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    jVar = (j) adapter;
                    headersCount = 0;
                }
                int count = jVar.getCount();
                i7 = 1;
                int i16 = 0;
                while (true) {
                    if (i16 >= count) {
                        i16 = -1;
                        break;
                    } else if (item == jVar.getItem(i16)) {
                        break;
                    } else {
                        i16++;
                    }
                }
                if (i16 != -1 && (firstVisiblePosition = (i16 + headersCount) - dropDownListView2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < dropDownListView2.getChildCount()) {
                    childAt = dropDownListView2.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt != null) {
                i10 = Build.VERSION.SDK_INT;
                popupWindow = c0894y0.f12724p0;
                if (i10 <= 28) {
                    method = C0894y0.f13030t0;
                    if (method != null) {
                        try {
                            method.invoke(popupWindow, Boolean.FALSE);
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    AbstractC0892x0.a(popupWindow, false);
                }
                AbstractC0890w0.a(c0894y0.f12724p0, null);
                dropDownListView = ((f) arrayList.get(arrayList.size() - 1)).f12392a.f12714c;
                iArr = new int[2];
                dropDownListView.getLocationOnScreen(iArr);
                rect3 = new Rect();
                this.f12396A.getWindowVisibleDisplayFrame(rect3);
                if (this.f12397B == i7) {
                    if (dropDownListView.getWidth() + iArr[0] + iB > rect3.right) {
                        i11 = 0;
                    } else {
                        i11 = 1;
                    }
                } else if (iArr[0] - iB < 0) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                if (i11 == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                this.f12397B = i11;
                if (Build.VERSION.SDK_INT >= 26) {
                    c0894y0.f12702A = childAt;
                    i13 = 0;
                    i12 = 0;
                } else {
                    iArr2 = new int[2];
                    this.f12419w.getLocationOnScreen(iArr2);
                    iArr3 = new int[2];
                    childAt.getLocationOnScreen(iArr3);
                    if ((this.f12418v & 7) == 5) {
                        iArr2[0] = this.f12419w.getWidth() + iArr2[0];
                        iArr3[0] = childAt.getWidth() + iArr3[0];
                    }
                    i12 = iArr3[0] - iArr2[0];
                    i13 = iArr3[1] - iArr2[1];
                }
                if ((this.f12418v & 5) == 5) {
                    if (z8) {
                        width = i12 + iB;
                    } else {
                        iB = childAt.getWidth();
                        width = i12 - iB;
                    }
                } else if (z8) {
                    width = i12 + childAt.getWidth();
                } else {
                    width = i12 - iB;
                }
                c0894y0.f12717f = width;
                c0894y0.f12723p = true;
                c0894y0.f12722o = true;
                c0894y0.setVerticalOffset(i13);
            } else {
                if (this.f12398C) {
                    c0894y0.f12717f = this.f12400L;
                }
                if (this.f12399H) {
                    c0894y0.setVerticalOffset(this.f12401M);
                }
                rect = this.f12476a;
                if (rect != null) {
                    rect2 = new Rect(rect);
                } else {
                    rect2 = null;
                }
                c0894y0.f12711Z = rect2;
            }
            arrayList.add(new f(c0894y0, kVar, this.f12397B));
            c0894y0.show();
            DropDownListView dropDownListView3 = c0894y0.f12714c;
            dropDownListView3.setOnKeyListener(this);
            if (fVar == null || !this.f12403X || kVar.getHeaderTitle() == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(p241q.g.abc_popup_menu_header_item_layout, (ViewGroup) dropDownListView3, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(kVar.getHeaderTitle());
            dropDownListView3.addHeaderView(frameLayout, null, false);
            c0894y0.show();
            return;
        }
        i7 = 1;
        fVar = null;
        childAt = null;
        if (childAt != null) {
            i10 = Build.VERSION.SDK_INT;
            popupWindow = c0894y0.f12724p0;
            if (i10 <= 28) {
                method = C0894y0.f13030t0;
                if (method != null) {
                    method.invoke(popupWindow, Boolean.FALSE);
                }
            } else {
                AbstractC0892x0.a(popupWindow, false);
            }
            AbstractC0890w0.a(c0894y0.f12724p0, null);
            dropDownListView = ((f) arrayList.get(arrayList.size() - 1)).f12392a.f12714c;
            iArr = new int[2];
            dropDownListView.getLocationOnScreen(iArr);
            rect3 = new Rect();
            this.f12396A.getWindowVisibleDisplayFrame(rect3);
            if (this.f12397B == i7) {
                if (dropDownListView.getWidth() + iArr[0] + iB > rect3.right) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
            } else if (iArr[0] - iB < 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (i11 == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f12397B = i11;
            if (Build.VERSION.SDK_INT >= 26) {
                c0894y0.f12702A = childAt;
                i13 = 0;
                i12 = 0;
            } else {
                iArr2 = new int[2];
                this.f12419w.getLocationOnScreen(iArr2);
                iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.f12418v & 7) == 5) {
                    iArr2[0] = this.f12419w.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                }
                i12 = iArr3[0] - iArr2[0];
                i13 = iArr3[1] - iArr2[1];
            }
            if ((this.f12418v & 5) == 5) {
                if (z8) {
                    width = i12 + iB;
                } else {
                    iB = childAt.getWidth();
                    width = i12 - iB;
                }
            } else if (z8) {
                width = i12 + childAt.getWidth();
            } else {
                width = i12 - iB;
            }
            c0894y0.f12717f = width;
            c0894y0.f12723p = true;
            c0894y0.f12722o = true;
            c0894y0.setVerticalOffset(i13);
        } else {
            if (this.f12398C) {
                c0894y0.f12717f = this.f12400L;
            }
            if (this.f12399H) {
                c0894y0.setVerticalOffset(this.f12401M);
            }
            rect = this.f12476a;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            c0894y0.f12711Z = rect2;
        }
        arrayList.add(new f(c0894y0, kVar, this.f12397B));
        c0894y0.show();
        DropDownListView dropDownListView4 = c0894y0.f12714c;
        dropDownListView4.setOnKeyListener(this);
        if (fVar == null) {
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onCloseMenu(k kVar, boolean z3) {
        ArrayList arrayList = this.f12412i;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (kVar == ((f) arrayList.get(i7)).f12393b) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 < 0) {
            return;
        }
        int i10 = i7 + 1;
        if (i10 < arrayList.size()) {
            ((f) arrayList.get(i10)).f12393b.close(false);
        }
        f fVar = (f) arrayList.remove(i7);
        fVar.f12393b.removeMenuPresenter(this);
        boolean z8 = this.f12417p0;
        C0894y0 c0894y0 = fVar.f12392a;
        if (z8) {
            AbstractC0890w0.b(c0894y0.f12724p0, null);
            c0894y0.f12724p0.setAnimationStyle(0);
        }
        c0894y0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f12397B = ((f) arrayList.get(size2 - 1)).f12394c;
        } else {
            this.f12397B = this.f12419w.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z3) {
                ((f) arrayList.get(0)).f12393b.close(false);
                return;
            }
            return;
        }
        dismiss();
        MenuPresenter.Callback callback = this.f12404Y;
        if (callback != null) {
            callback.onCloseMenu(kVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f12405Z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f12405Z.removeGlobalOnLayoutListener(this.f12413j);
            }
            this.f12405Z = null;
        }
        this.f12396A.removeOnAttachStateChangeListener(this.f12415o);
        this.f12414k0.onDismiss();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        f fVar;
        ArrayList arrayList = this.f12412i;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                fVar = null;
                break;
            }
            fVar = (f) arrayList.get(i7);
            if (!fVar.f12392a.f12724p0.isShowing()) {
                break;
            } else {
                i7++;
            }
        }
        if (fVar != null) {
            fVar.f12393b.close(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i7 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean onSubMenuSelected(w wVar) {
        for (f fVar : this.f12412i) {
            if (wVar == fVar.f12393b) {
                fVar.f12392a.f12714c.requestFocus();
                return true;
            }
        }
        if (!wVar.hasVisibleItems()) {
            return false;
        }
        a(wVar);
        MenuPresenter.Callback callback = this.f12404Y;
        if (callback != null) {
            callback.onOpenSubMenu(wVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void setCallback(MenuPresenter.Callback callback) {
        this.f12404Y = callback;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void show() {
        if (isShowing()) {
            return;
        }
        ArrayList arrayList = this.f12411g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j((k) it.next());
        }
        arrayList.clear();
        View view = this.f12419w;
        this.f12396A = view;
        if (view != null) {
            boolean z3 = this.f12405Z == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f12405Z = viewTreeObserver;
            if (z3) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f12413j);
            }
            this.f12396A.addOnAttachStateChangeListener(this.f12415o);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void updateMenuView(boolean z3) {
        Iterator it = this.f12412i.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((f) it.next()).f12392a.f12714c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((j) adapter).notifyDataSetChanged();
        }
    }
}
