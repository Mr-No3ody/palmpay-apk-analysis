package androidx.gridlayout.widget;

import N8.q0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.core.view.N;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.util.Arrays;
import p317v0.b;
import p317v0.c;
import p317v0.g;
import p317v0.h;
import p317v0.j;

/* JADX INFO: loaded from: classes.dex */
public class GridLayout extends ViewGroup {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final b f17263L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final b f17264M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final b f17265Q;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final b f17267k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final c f17270p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final c f17271q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final b f17272r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final b f17273s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final b f17274t0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f17277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f17278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17283g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Printer f17284i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final LogPrinter f17266j = new LogPrinter(3, GridLayout.class.getName());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p317v0.a f17268o = new p317v0.a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f17269p = p301u0.b.GridLayout_orientation;
    public static final int t = p301u0.b.GridLayout_rowCount;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f17275v = p301u0.b.GridLayout_columnCount;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f17276w = p301u0.b.GridLayout_useDefaultMargins;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f17259A = p301u0.b.GridLayout_alignmentMode;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f17260B = p301u0.b.GridLayout_rowOrderPreserved;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f17261C = p301u0.b.GridLayout_columnOrderPreserved;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final b f17262H = new b(0);

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f17285c = (-2147483647) - Integer.MIN_VALUE;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f17286d = p301u0.b.GridLayout_Layout_android_layout_margin;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f17287e = p301u0.b.GridLayout_Layout_android_layout_marginLeft;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f17288f = p301u0.b.GridLayout_Layout_android_layout_marginTop;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f17289g = p301u0.b.GridLayout_Layout_android_layout_marginRight;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f17290h = p301u0.b.GridLayout_Layout_android_layout_marginBottom;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f17291i = p301u0.b.GridLayout_Layout_layout_column;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f17292j = p301u0.b.GridLayout_Layout_layout_columnSpan;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f17293k = p301u0.b.GridLayout_Layout_layout_columnWeight;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f17294l = p301u0.b.GridLayout_Layout_layout_row;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f17295m = p301u0.b.GridLayout_Layout_layout_rowSpan;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f17296n = p301u0.b.GridLayout_Layout_layout_rowWeight;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f17297o = p301u0.b.GridLayout_Layout_layout_gravity;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j f17298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public j f17299b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            j jVar = j.f43033e;
            this.f17298a = jVar;
            this.f17299b = jVar;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p301u0.b.GridLayout_Layout);
            try {
                int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(f17286d, Integer.MIN_VALUE);
                ((ViewGroup.MarginLayoutParams) this).leftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(f17287e, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(f17288f, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).rightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(f17289g, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(f17290h, dimensionPixelSize);
                typedArrayObtainStyledAttributes.recycle();
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, p301u0.b.GridLayout_Layout);
                try {
                    int i7 = typedArrayObtainStyledAttributes2.getInt(f17297o, 0);
                    int i10 = typedArrayObtainStyledAttributes2.getInt(f17291i, Integer.MIN_VALUE);
                    int i11 = f17292j;
                    int i12 = f17285c;
                    this.f17299b = GridLayout.l(i10, typedArrayObtainStyledAttributes2.getInt(i11, i12), GridLayout.d(i7, true), typedArrayObtainStyledAttributes2.getFloat(f17293k, 0.0f));
                    this.f17298a = GridLayout.l(typedArrayObtainStyledAttributes2.getInt(f17294l, Integer.MIN_VALUE), typedArrayObtainStyledAttributes2.getInt(f17295m, i12), GridLayout.d(i7, false), typedArrayObtainStyledAttributes2.getFloat(f17296n, 0.0f));
                } finally {
                    typedArrayObtainStyledAttributes2.recycle();
                }
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LayoutParams)) {
                return false;
            }
            LayoutParams layoutParams = (LayoutParams) obj;
            return this.f17299b.equals(layoutParams.f17299b) && this.f17298a.equals(layoutParams.f17298a);
        }

        public final int hashCode() {
            return this.f17299b.hashCode() + (this.f17298a.hashCode() * 31);
        }

        @Override // android.view.ViewGroup.LayoutParams
        public final void setBaseAttributes(TypedArray typedArray, int i7, int i10) {
            ((ViewGroup.MarginLayoutParams) this).width = typedArray.getLayoutDimension(i7, -2);
            ((ViewGroup.MarginLayoutParams) this).height = typedArray.getLayoutDimension(i10, -2);
        }
    }

    static {
        b bVar = new b(1);
        b bVar2 = new b(2);
        f17263L = bVar;
        f17264M = bVar2;
        f17265Q = bVar;
        f17267k0 = bVar2;
        f17270p0 = new c(bVar, bVar2);
        f17271q0 = new c(bVar2, bVar);
        f17272r0 = new b(3);
        f17273s0 = new b(4);
        f17274t0 = new b(5);
    }

    public GridLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f17277a = new a(this, true);
        this.f17278b = new a(this, false);
        this.f17279c = 0;
        this.f17280d = false;
        this.f17281e = 1;
        this.f17283g = 0;
        this.f17284i = f17266j;
        this.f17282f = context.getResources().getDimensionPixelOffset(p301u0.a.default_gap);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p301u0.b.GridLayout);
        N.p(this, context, p301u0.b.GridLayout, attributeSet, typedArrayObtainStyledAttributes, i7, 0);
        try {
            setRowCount(typedArrayObtainStyledAttributes.getInt(t, Integer.MIN_VALUE));
            setColumnCount(typedArrayObtainStyledAttributes.getInt(f17275v, Integer.MIN_VALUE));
            setOrientation(typedArrayObtainStyledAttributes.getInt(f17269p, 0));
            setUseDefaultMargins(typedArrayObtainStyledAttributes.getBoolean(f17276w, false));
            setAlignmentMode(typedArrayObtainStyledAttributes.getInt(f17259A, 1));
            setRowOrderPreserved(typedArrayObtainStyledAttributes.getBoolean(f17260B, true));
            setColumnOrderPreserved(typedArrayObtainStyledAttributes.getBoolean(f17261C, true));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static p059e1.a d(int i7, boolean z3) {
        int i10 = (i7 & (z3 ? 7 : HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR)) >> (z3 ? 0 : 4);
        if (i10 == 1) {
            return f17272r0;
        }
        if (i10 == 3) {
            return z3 ? f17270p0 : f17263L;
        }
        if (i10 == 5) {
            return z3 ? f17271q0 : f17264M;
        }
        if (i10 == 7) {
            return f17274t0;
        }
        if (i10 != 8388611) {
            return i10 != 8388613 ? f17262H : f17267k0;
        }
        return f17265Q;
    }

    public static void g(String str) {
        throw new IllegalArgumentException(q0.j(str, ". "));
    }

    public static void k(LayoutParams layoutParams, int i7, int i10, int i11, int i12) {
        h hVar = new h(i7, i10 + i7);
        j jVar = layoutParams.f17298a;
        layoutParams.f17298a = new j(jVar.f43034a, hVar, jVar.f43036c, jVar.f43037d);
        h hVar2 = new h(i11, i12 + i11);
        j jVar2 = layoutParams.f17299b;
        layoutParams.f17299b = new j(jVar2.f43034a, hVar2, jVar2.f43036c, jVar2.f43037d);
    }

    public static j l(int i7, int i10, p059e1.a aVar, float f10) {
        return new j(i7 != Integer.MIN_VALUE, new h(i7, i10 + i7), aVar, f10);
    }

    public final void a(LayoutParams layoutParams, boolean z3) {
        String str = z3 ? "column" : "row";
        h hVar = (z3 ? layoutParams.f17299b : layoutParams.f17298a).f43035b;
        int i7 = hVar.f43030a;
        if (i7 != Integer.MIN_VALUE && i7 < 0) {
            g(str.concat(" indices must be positive"));
            throw null;
        }
        int i10 = (z3 ? this.f17277a : this.f17278b).f17301b;
        if (i10 != Integer.MIN_VALUE) {
            if (hVar.f43031b > i10) {
                g(str + " indices (start + span) mustn't exceed the " + str + " count");
                throw null;
            }
            if (hVar.a() <= i10) {
                return;
            }
            g(str + " span mustn't exceed the " + str + " count");
            throw null;
        }
    }

    public final int b() {
        int childCount = getChildCount();
        int iHashCode = 1;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                iHashCode = ((LayoutParams) childAt.getLayoutParams()).hashCode() + (iHashCode * 31);
            }
        }
        return iHashCode;
    }

    public final void c() {
        int i7 = this.f17283g;
        if (i7 != 0) {
            if (i7 != b()) {
                this.f17284i.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
                h();
                c();
                return;
            }
            return;
        }
        boolean z3 = this.f17279c == 0;
        int i10 = (z3 ? this.f17277a : this.f17278b).f17301b;
        if (i10 == Integer.MIN_VALUE) {
            i10 = 0;
        }
        int[] iArr = new int[i10];
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i13).getLayoutParams();
            j jVar = z3 ? layoutParams.f17298a : layoutParams.f17299b;
            h hVar = jVar.f43035b;
            int iA = hVar.a();
            boolean z8 = jVar.f43034a;
            if (z8) {
                i11 = hVar.f43030a;
            }
            j jVar2 = z3 ? layoutParams.f17299b : layoutParams.f17298a;
            h hVar2 = jVar2.f43035b;
            int iA2 = hVar2.a();
            boolean z10 = jVar2.f43034a;
            int i14 = hVar2.f43030a;
            if (i10 != 0) {
                iA2 = Math.min(iA2, i10 - (z10 ? Math.min(i14, i10) : 0));
            }
            if (z10) {
                i12 = i14;
            }
            if (i10 != 0) {
                if (!z8 || !z10) {
                    while (true) {
                        int i15 = i12 + iA2;
                        if (i15 <= i10) {
                            int i16 = i12;
                            while (true) {
                                if (i16 >= i15) {
                                    break;
                                } else if (iArr[i16] > i11) {
                                    break;
                                } else {
                                    i16++;
                                }
                            }
                        }
                        if (z10) {
                            i11++;
                        } else if (i15 <= i10) {
                            i12++;
                        } else {
                            i11++;
                            i12 = 0;
                        }
                    }
                }
                Arrays.fill(iArr, Math.min(i12, i10), Math.min(i12 + iA2, i10), i11 + iA);
            }
            if (z3) {
                k(layoutParams, i11, iA, i12, iA2);
            } else {
                k(layoutParams, i12, iA2, i11, iA);
            }
            i12 += iA2;
        }
        this.f17283g = b();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams)) {
            return false;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        a(layoutParams2, true);
        a(layoutParams2, false);
        return true;
    }

    public final int e(View view, boolean z3, boolean z8) {
        int[] iArr;
        if (this.f17281e == 1) {
            return f(view, z3, z8);
        }
        a aVar = z3 ? this.f17277a : this.f17278b;
        if (z8) {
            if (aVar.f17309j == null) {
                aVar.f17309j = new int[aVar.f() + 1];
            }
            if (!aVar.f17310k) {
                aVar.c(true);
                aVar.f17310k = true;
            }
            iArr = aVar.f17309j;
        } else {
            if (aVar.f17311l == null) {
                aVar.f17311l = new int[aVar.f() + 1];
            }
            if (!aVar.f17312m) {
                aVar.c(false);
                aVar.f17312m = true;
            }
            iArr = aVar.f17311l;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        h hVar = (z3 ? layoutParams.f17299b : layoutParams.f17298a).f43035b;
        return iArr[z8 ? hVar.f43030a : hVar.f43031b];
    }

    public final int f(View view, boolean z3, boolean z8) {
        int i7;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (z3) {
            i7 = z8 ? ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin : ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            i7 = z8 ? ((ViewGroup.MarginLayoutParams) layoutParams).topMargin : ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        if (i7 != Integer.MIN_VALUE) {
            return i7;
        }
        if (this.f17280d && view.getClass() != Space.class) {
            return this.f17282f / 2;
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        j jVar = j.f43033e;
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.f17298a = jVar;
        layoutParams.f17299b = jVar;
        layoutParams.setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        layoutParams.f17298a = jVar;
        layoutParams.f17299b = jVar;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getAlignmentMode() {
        return this.f17281e;
    }

    public int getColumnCount() {
        return this.f17277a.f();
    }

    public int getOrientation() {
        return this.f17279c;
    }

    public Printer getPrinter() {
        return this.f17284i;
    }

    public int getRowCount() {
        return this.f17278b.f();
    }

    public boolean getUseDefaultMargins() {
        return this.f17280d;
    }

    public final void h() {
        this.f17283g = 0;
        a aVar = this.f17277a;
        if (aVar != null) {
            aVar.l();
        }
        a aVar2 = this.f17278b;
        if (aVar2 != null) {
            aVar2.l();
        }
        if (aVar == null || aVar2 == null) {
            return;
        }
        aVar.m();
        aVar2.m();
    }

    public final void i(View view, int i7, int i10, int i11, int i12) {
        view.measure(ViewGroup.getChildMeasureSpec(i7, e(view, true, false) + e(view, true, true), i11), ViewGroup.getChildMeasureSpec(i10, e(view, false, false) + e(view, false, true), i12));
    }

    public final void j(int i7, int i10, boolean z3) {
        int i11;
        int i12;
        int childCount = getChildCount();
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 8) {
                i11 = i7;
                i12 = i10;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z3) {
                    i11 = i7;
                    i12 = i10;
                    i(childAt, i11, i12, ((ViewGroup.MarginLayoutParams) layoutParams).width, ((ViewGroup.MarginLayoutParams) layoutParams).height);
                } else {
                    i11 = i7;
                    i12 = i10;
                    boolean z8 = this.f17279c == 0;
                    j jVar = z8 ? layoutParams.f17299b : layoutParams.f17298a;
                    if (jVar.a(z8) == f17274t0) {
                        int[] iArrH = (z8 ? this.f17277a : this.f17278b).h();
                        h hVar = jVar.f43035b;
                        int iE = (iArrH[hVar.f43031b] - iArrH[hVar.f43030a]) - (e(childAt, z8, false) + e(childAt, z8, true));
                        if (z8) {
                            i(childAt, i11, i12, iE, ((ViewGroup.MarginLayoutParams) layoutParams).height);
                        } else {
                            i(childAt, i11, i12, ((ViewGroup.MarginLayoutParams) layoutParams).width, iE);
                        }
                    }
                }
            }
            i13++;
            i7 = i11;
            i10 = i12;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z8;
        GridLayout gridLayout = this;
        gridLayout.c();
        int i17 = i11 - i7;
        int paddingLeft = gridLayout.getPaddingLeft();
        int paddingTop = gridLayout.getPaddingTop();
        int paddingRight = gridLayout.getPaddingRight();
        int paddingBottom = gridLayout.getPaddingBottom();
        int i18 = (i17 - paddingLeft) - paddingRight;
        a aVar = gridLayout.f17277a;
        aVar.f17320v.f43032a = i18;
        aVar.f17321w.f43032a = -i18;
        boolean z10 = false;
        aVar.f17316q = false;
        aVar.h();
        int i19 = ((i12 - i10) - paddingTop) - paddingBottom;
        a aVar2 = gridLayout.f17278b;
        aVar2.f17320v.f43032a = i19;
        aVar2.f17321w.f43032a = -i19;
        aVar2.f17316q = false;
        aVar2.h();
        int[] iArrH = aVar.h();
        int[] iArrH2 = aVar2.h();
        int childCount = gridLayout.getChildCount();
        int i20 = 0;
        while (i20 < childCount) {
            View childAt = gridLayout.getChildAt(i20);
            if (childAt.getVisibility() == 8) {
                i14 = i20;
                i13 = i17;
                i15 = paddingLeft;
                i16 = paddingTop;
                z8 = z10;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                j jVar = layoutParams.f17299b;
                j jVar2 = layoutParams.f17298a;
                h hVar = jVar.f43035b;
                h hVar2 = jVar2.f43035b;
                int i21 = i20;
                int i22 = iArrH[hVar.f43030a];
                int i23 = iArrH2[hVar2.f43030a];
                int i24 = iArrH[hVar.f43031b];
                int i25 = iArrH2[hVar2.f43031b];
                int i26 = i24 - i22;
                int i27 = i25 - i23;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                p059e1.a aVarA = jVar.a(true);
                p059e1.a aVarA2 = jVar2.a(false);
                androidx.camera.video.internal.c cVarG = aVar.g();
                g gVar = (g) ((Object[]) cVarG.f14622c)[((int[]) cVarG.f14621b)[i21]];
                androidx.camera.video.internal.c cVarG2 = aVar2.g();
                i13 = i17;
                g gVar2 = (g) ((Object[]) cVarG2.f14622c)[((int[]) cVarG2.f14621b)[i21]];
                int iU = aVarA.u(i26 - gVar.d(true), childAt);
                int iU2 = aVarA2.u(i27 - gVar2.d(true), childAt);
                int iE = gridLayout.e(childAt, true, true);
                int iE2 = gridLayout.e(childAt, false, true);
                int iE3 = gridLayout.e(childAt, true, false);
                int i28 = iE + iE3;
                int iE4 = iE2 + gridLayout.e(childAt, false, false);
                i14 = i21;
                i15 = paddingLeft;
                i16 = paddingTop;
                z8 = false;
                int iA = gVar.a(gridLayout, childAt, aVarA, measuredWidth + i28, true);
                int iA2 = gVar2.a(this, childAt, aVarA2, measuredHeight + iE4, false);
                int iZ = aVarA.z(measuredWidth, i26 - i28);
                int iZ2 = aVarA2.z(measuredHeight, i27 - iE4);
                int i29 = i22 + iU + iA;
                int i30 = getLayoutDirection() == 1 ? (((i13 - iZ) - paddingRight) - iE3) - i29 : i15 + iE + i29;
                int i31 = i16 + i23 + iU2 + iA2 + iE2;
                if (iZ != childAt.getMeasuredWidth() || iZ2 != childAt.getMeasuredHeight()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(iZ, 1073741824), View.MeasureSpec.makeMeasureSpec(iZ2, 1073741824));
                }
                childAt.layout(i30, i31, iZ + i30, iZ2 + i31);
            }
            i20 = i14 + 1;
            gridLayout = this;
            paddingLeft = i15;
            paddingTop = i16;
            i17 = i13;
            z10 = z8;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int iJ;
        int iJ2;
        c();
        a aVar = this.f17278b;
        a aVar2 = this.f17277a;
        if (aVar2 != null && aVar != null) {
            aVar2.m();
            aVar.m();
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingRight) + i7), View.MeasureSpec.getMode(i7));
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingBottom) + i10), View.MeasureSpec.getMode(i10));
        j(iMakeMeasureSpec, iMakeMeasureSpec2, true);
        if (this.f17279c == 0) {
            iJ2 = aVar2.j(iMakeMeasureSpec);
            j(iMakeMeasureSpec, iMakeMeasureSpec2, false);
            iJ = aVar.j(iMakeMeasureSpec2);
        } else {
            iJ = aVar.j(iMakeMeasureSpec2);
            j(iMakeMeasureSpec, iMakeMeasureSpec2, false);
            iJ2 = aVar2.j(iMakeMeasureSpec);
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iJ2 + paddingRight, getSuggestedMinimumWidth()), i7, 0), View.resolveSizeAndState(Math.max(iJ + paddingBottom, getSuggestedMinimumHeight()), i10, 0));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        h();
    }

    public void setAlignmentMode(int i7) {
        this.f17281e = i7;
        requestLayout();
    }

    public void setColumnCount(int i7) {
        this.f17277a.o(i7);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z3) {
        a aVar = this.f17277a;
        aVar.f17319u = z3;
        aVar.l();
        h();
        requestLayout();
    }

    public void setOrientation(int i7) {
        if (this.f17279c != i7) {
            this.f17279c = i7;
            h();
            requestLayout();
        }
    }

    public void setPrinter(Printer printer) {
        if (printer == null) {
            printer = f17268o;
        }
        this.f17284i = printer;
    }

    public void setRowCount(int i7) {
        this.f17278b.o(i7);
        h();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z3) {
        a aVar = this.f17278b;
        aVar.f17319u = z3;
        aVar.l();
        h();
        requestLayout();
    }

    public void setUseDefaultMargins(boolean z3) {
        this.f17280d = z3;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
            j jVar = j.f43033e;
            layoutParams3.f17298a = jVar;
            layoutParams3.f17299b = jVar;
            layoutParams3.f17298a = layoutParams2.f17298a;
            layoutParams3.f17299b = layoutParams2.f17299b;
            return layoutParams3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            j jVar2 = j.f43033e;
            layoutParams4.f17298a = jVar2;
            layoutParams4.f17299b = jVar2;
            return layoutParams4;
        }
        LayoutParams layoutParams5 = new LayoutParams(layoutParams);
        j jVar3 = j.f43033e;
        layoutParams5.f17298a = jVar3;
        layoutParams5.f17299b = jVar3;
        return layoutParams5;
    }

    public GridLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GridLayout(Context context) {
        this(context, null);
    }
}
