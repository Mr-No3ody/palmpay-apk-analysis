package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends ConstraintHelper {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15599j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15600o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Q.a f15601p;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f15601p.f7399x0;
    }

    public int getMargin() {
        return this.f15601p.f7400y0;
    }

    public int getType() {
        return this.f15599j;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void j(AttributeSet attributeSet) {
        super.j(attributeSet);
        this.f15601p = new Q.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == p.ConstraintLayout_Layout_barrierDirection) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == p.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f15601p.f7399x0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == p.ConstraintLayout_Layout_barrierMargin) {
                    this.f15601p.f7400y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f15605d = this.f15601p;
        p();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void k(h hVar, Q.j jVar, Constraints.LayoutParams layoutParams, SparseArray sparseArray) {
        super.k(hVar, jVar, layoutParams, sparseArray);
        if (jVar instanceof Q.a) {
            Q.a aVar = (Q.a) jVar;
            boolean z3 = ((Q.f) jVar.f7454V).f7522z0;
            i iVar = hVar.f15747e;
            q(aVar, iVar.f15789g0, z3);
            aVar.f7399x0 = iVar.f15804o0;
            aVar.f7400y0 = iVar.f15791h0;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void l(Q.e eVar, boolean z3) {
        q(eVar, this.f15599j, z3);
    }

    public final void q(Q.e eVar, int i7, boolean z3) {
        this.f15600o = i7;
        if (z3) {
            int i10 = this.f15599j;
            if (i10 == 5) {
                this.f15600o = 1;
            } else if (i10 == 6) {
                this.f15600o = 0;
            }
        } else {
            int i11 = this.f15599j;
            if (i11 == 5) {
                this.f15600o = 0;
            } else if (i11 == 6) {
                this.f15600o = 1;
            }
        }
        if (eVar instanceof Q.a) {
            ((Q.a) eVar).f7398w0 = this.f15600o;
        }
    }

    public void setAllowsGoneWidget(boolean supportGone) {
        this.f15601p.f7399x0 = supportGone;
    }

    public void setDpMargin(int margin) {
        this.f15601p.f7400y0 = (int) ((margin * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int margin) {
        this.f15601p.f7400y0 = margin;
    }

    public void setType(int type) {
        this.f15599j = type;
    }

    public Barrier(Context context, AttributeSet attrs) {
        super(context, attrs);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        super.setVisibility(8);
    }
}
