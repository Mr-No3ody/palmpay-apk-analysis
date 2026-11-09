package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.x;
import androidx.constraintlayout.motion.widget.y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class ReactiveGuide extends View implements SharedValues$SharedValuesListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15696d;

    public ReactiveGuide(Context context) {
        super(context);
        this.f15693a = -1;
        this.f15694b = false;
        this.f15695c = 0;
        this.f15696d = true;
        super.setVisibility(8);
        a(null);
    }

    public final void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.ConstraintLayout_ReactiveGuide);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == p.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
                    this.f15693a = typedArrayObtainStyledAttributes.getResourceId(index, this.f15693a);
                } else if (index == p.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
                    this.f15694b = typedArrayObtainStyledAttributes.getBoolean(index, this.f15694b);
                } else if (index == p.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToConstraintSet) {
                    this.f15695c = typedArrayObtainStyledAttributes.getResourceId(index, this.f15695c);
                } else if (index == p.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToAllConstraintSets) {
                    this.f15696d = typedArrayObtainStyledAttributes.getBoolean(index, this.f15696d);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f15693a != -1) {
            ConstraintLayout.getSharedValues().a(this.f15693a, this);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.f15695c;
    }

    public int getAttributeId() {
        return this.f15693a;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(0, 0);
    }

    @Override // androidx.constraintlayout.widget.SharedValues$SharedValuesListener
    public final void onNewValue(int i7, int i10, int i11) {
        m mVar;
        setGuidelineBegin(i10);
        int id2 = getId();
        if (id2 > 0 && (getParent() instanceof MotionLayout)) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            int currentState = motionLayout.getCurrentState();
            int i12 = this.f15695c;
            if (i12 != 0) {
                currentState = i12;
            }
            int i13 = 0;
            if (!this.f15694b) {
                if (!this.f15696d) {
                    m mVarN = motionLayout.n(currentState);
                    mVarN.k(id2).f15747e.f15786f = i10;
                    mVarN.k(id2).f15747e.f15784e = -1;
                    mVarN.k(id2).f15747e.f15788g = -1.0f;
                    motionLayout.C(currentState, mVarN);
                    return;
                }
                int[] constraintSetIds = motionLayout.getConstraintSetIds();
                while (i13 < constraintSetIds.length) {
                    int i14 = constraintSetIds[i13];
                    m mVarN2 = motionLayout.n(i14);
                    mVarN2.k(id2).f15747e.f15786f = i10;
                    mVarN2.k(id2).f15747e.f15784e = -1;
                    mVarN2.k(id2).f15747e.f15788g = -1.0f;
                    motionLayout.C(i14, mVarN2);
                    i13++;
                }
                return;
            }
            if (this.f15696d) {
                int[] constraintSetIds2 = motionLayout.getConstraintSetIds();
                while (i13 < constraintSetIds2.length) {
                    int i15 = constraintSetIds2[i13];
                    if (i15 != currentState) {
                        m mVarN3 = motionLayout.n(i15);
                        mVarN3.k(id2).f15747e.f15786f = i10;
                        mVarN3.k(id2).f15747e.f15784e = -1;
                        mVarN3.k(id2).f15747e.f15788g = -1.0f;
                        motionLayout.C(i15, mVarN3);
                    }
                    i13++;
                }
            }
            y yVar = motionLayout.f15290a;
            if (yVar == null) {
                mVar = null;
            } else {
                m mVarB = yVar.b(currentState);
                m mVar2 = new m();
                mVar2.f(mVarB);
                mVar = mVar2;
            }
            mVar.k(id2).f15747e.f15786f = i10;
            mVar.k(id2).f15747e.f15784e = -1;
            mVar.k(id2).f15747e.f15788g = -1.0f;
            if (motionLayout.f15290a != null && motionLayout.f15299f == currentState) {
                motionLayout.C(o.view_transition, motionLayout.n(currentState));
                motionLayout.setState(o.view_transition, -1, -1);
                motionLayout.C(currentState, mVar);
                x xVar = new x(motionLayout.f15290a, o.view_transition, currentState);
                xVar.f15472h = Math.max(1000, 8);
                motionLayout.setTransition(xVar);
                motionLayout.x();
            }
        }
    }

    public void setAnimateChange(boolean animate) {
        this.f15694b = animate;
    }

    public void setApplyToConstraintSetId(int id2) {
        this.f15695c = id2;
    }

    public void setAttributeId(int id2) {
        HashSet<WeakReference> hashSet;
        q sharedValues = ConstraintLayout.getSharedValues();
        int i7 = this.f15693a;
        if (i7 != -1 && (hashSet = (HashSet) sharedValues.f15860a.get(Integer.valueOf(i7))) != null) {
            ArrayList arrayList = new ArrayList();
            for (WeakReference weakReference : hashSet) {
                SharedValues$SharedValuesListener sharedValues$SharedValuesListener = (SharedValues$SharedValuesListener) weakReference.get();
                if (sharedValues$SharedValuesListener == null || sharedValues$SharedValuesListener == this) {
                    arrayList.add(weakReference);
                }
            }
            hashSet.removeAll(arrayList);
        }
        this.f15693a = id2;
        if (id2 != -1) {
            sharedValues.a(id2, this);
        }
    }

    public void setGuidelineBegin(int margin) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f15636a = margin;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int margin) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f15638b = margin;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float ratio) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f15639c = ratio;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
    }

    public ReactiveGuide(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f15693a = -1;
        this.f15694b = false;
        this.f15695c = 0;
        this.f15696d = true;
        super.setVisibility(8);
        a(attrs);
    }

    public ReactiveGuide(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f15693a = -1;
        this.f15694b = false;
        this.f15695c = 0;
        this.f15696d = true;
        super.setVisibility(8);
        a(attrs);
    }
}
