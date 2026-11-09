package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.Helper;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintHelper extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f15602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f15604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Q.j f15605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f15607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View[] f15608g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f15609i;

    public ConstraintHelper(Context context) {
        super(context);
        this.f15602a = new int[32];
        this.f15608g = null;
        this.f15609i = new HashMap();
        this.f15604c = context;
        j(null);
    }

    public final void a(String str) {
        if (str == null || str.length() == 0 || this.f15604c == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iH = h(strTrim);
        if (iH != 0) {
            this.f15609i.put(Integer.valueOf(iH), strTrim);
            b(iH);
        }
    }

    public final void b(int i7) {
        if (i7 == getId()) {
            return;
        }
        int i10 = this.f15603b + 1;
        int[] iArr = this.f15602a;
        if (i10 > iArr.length) {
            this.f15602a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f15602a;
        int i11 = this.f15603b;
        iArr2[i11] = i7;
        this.f15603b = i11 + 1;
    }

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.f15604c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && strTrim.equals(((ConstraintLayout.LayoutParams) layoutParams).f15634Y) && childAt.getId() != -1) {
                b(childAt.getId());
            }
        }
    }

    public final void d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        e((ConstraintLayout) parent);
    }

    public final void e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i7 = 0; i7 < this.f15603b; i7++) {
            View viewById = constraintLayout.getViewById(this.f15602a[i7]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void f(ConstraintLayout constraintLayout) {
    }

    public final int g(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f15604c.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = constraintLayout.getChildAt(i7);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f15602a, this.f15603b);
    }

    public final int h(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iG = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                iG = ((Integer) designInformation).intValue();
            }
        }
        if (iG == 0 && constraintLayout != null) {
            iG = g(constraintLayout, str);
        }
        if (iG == 0) {
            try {
                iG = o.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (iG != 0) {
            return iG;
        }
        Context context = this.f15604c;
        return context.getResources().getIdentifier(str, "id", context.getPackageName());
    }

    public final View[] i(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f15608g;
        if (viewArr == null || viewArr.length != this.f15603b) {
            this.f15608g = new View[this.f15603b];
        }
        for (int i7 = 0; i7 < this.f15603b; i7++) {
            this.f15608g[i7] = constraintLayout.getViewById(this.f15602a[i7]);
        }
        return this.f15608g;
    }

    public void j(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == p.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f15606e = string;
                    setIds(string);
                } else if (index == p.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f15607f = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void k(h hVar, Q.j jVar, Constraints.LayoutParams layoutParams, SparseArray sparseArray) {
        i iVar = hVar.f15747e;
        int[] iArr = iVar.f15794j0;
        int i7 = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = iVar.f15796k0;
            if (str != null) {
                if (str.length() > 0) {
                    String[] strArrSplit = iVar.f15796k0.split(",");
                    getContext();
                    int[] iArrCopyOf = new int[strArrSplit.length];
                    int i10 = 0;
                    for (String str2 : strArrSplit) {
                        int iH = h(str2.trim());
                        if (iH != 0) {
                            iArrCopyOf[i10] = iH;
                            i10++;
                        }
                    }
                    if (i10 != strArrSplit.length) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i10);
                    }
                    iVar.f15794j0 = iArrCopyOf;
                } else {
                    iVar.f15794j0 = null;
                }
            }
        }
        jVar.removeAllIds();
        if (iVar.f15794j0 == null) {
            return;
        }
        while (true) {
            int[] iArr2 = iVar.f15794j0;
            if (i7 >= iArr2.length) {
                return;
            }
            Q.e eVar = (Q.e) sparseArray.get(iArr2[i7]);
            if (eVar != null) {
                jVar.add(eVar);
            }
            i7++;
        }
    }

    public void n(ConstraintLayout constraintLayout) {
    }

    public void o(Helper helper, SparseArray sparseArray) {
        helper.removeAllIds();
        for (int i7 = 0; i7 < this.f15603b; i7++) {
            helper.add((Q.e) sparseArray.get(this.f15602a[i7]));
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f15606e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f15607f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        setMeasuredDimension(0, 0);
    }

    public final void p() {
        if (this.f15605d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).f15666q0 = this.f15605d;
        }
    }

    public void setIds(String idList) {
        this.f15606e = idList;
        if (idList == null) {
            return;
        }
        int i7 = 0;
        this.f15603b = 0;
        while (true) {
            int iIndexOf = idList.indexOf(44, i7);
            if (iIndexOf == -1) {
                a(idList.substring(i7));
                return;
            } else {
                a(idList.substring(i7, iIndexOf));
                i7 = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String tagList) {
        this.f15607f = tagList;
        if (tagList == null) {
            return;
        }
        int i7 = 0;
        this.f15603b = 0;
        while (true) {
            int iIndexOf = tagList.indexOf(44, i7);
            if (iIndexOf == -1) {
                c(tagList.substring(i7));
                return;
            } else {
                c(tagList.substring(i7, iIndexOf));
                i7 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] ids) {
        this.f15606e = null;
        this.f15603b = 0;
        for (int i7 : ids) {
            b(i7);
        }
    }

    @Override // android.view.View
    public final void setTag(int i7, Object obj) {
        super.setTag(i7, obj);
        if (obj == null && this.f15606e == null) {
            b(i7);
        }
    }

    public ConstraintHelper(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f15602a = new int[32];
        this.f15608g = null;
        this.f15609i = new HashMap();
        this.f15604c = context;
        j(attrs);
    }

    public ConstraintHelper(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f15602a = new int[32];
        this.f15608g = null;
        this.f15609i = new HashMap();
        this.f15604c = context;
        j(attrs);
    }

    public void m() {
    }

    public void l(Q.e eVar, boolean z3) {
    }
}
