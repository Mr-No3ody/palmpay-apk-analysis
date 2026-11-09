package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.C;
import androidx.constraintlayout.motion.widget.C1031d;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.h;
import androidx.constraintlayout.motion.widget.m;
import androidx.constraintlayout.motion.widget.v;
import androidx.constraintlayout.motion.widget.y;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class MotionEffect extends MotionHelper {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f15177A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f15178B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f15179C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f15180H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f15181L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f15182M;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f15183v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15184w;

    public MotionEffect(Context context) {
        super(context);
        this.f15183v = 0.1f;
        this.f15184w = 49;
        this.f15177A = 50;
        this.f15178B = 0;
        this.f15179C = 0;
        this.f15180H = true;
        this.f15181L = -1;
        this.f15182M = -1;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:107:0x021d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0223 A[LOOP:3: B:101:0x01f9->B:108:0x0223, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x0229 A[EDGE_INSN: B:120:0x0229->B:109:0x0229 BREAK  A[LOOP:3: B:101:0x01f9->B:108:0x0223], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x020b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x017e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0183  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e9  */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionHelperInterface
    public final void onPreSetup(MotionLayout motionLayout, HashMap map) {
        C1031d c1031d;
        C1031d c1031d2;
        C1031d c1031d3;
        int i7;
        int i10;
        int i11;
        View[] viewArr;
        int i12;
        y yVar;
        Iterator it;
        C c6;
        ArrayList arrayList;
        int i13;
        int i14;
        MotionEffect motionEffect = this;
        HashMap map2 = map;
        View[] viewArrI = motionEffect.i((ConstraintLayout) motionEffect.getParent());
        if (viewArrI == null) {
            J3.a.o();
            return;
        }
        C1031d c1031d4 = new C1031d();
        C1031d c1031d5 = new C1031d();
        c1031d4.f(Float.valueOf(motionEffect.f15183v), "alpha");
        c1031d5.f(Float.valueOf(motionEffect.f15183v), "alpha");
        int i15 = motionEffect.f15184w;
        c1031d4.f15322a = i15;
        c1031d5.f15322a = motionEffect.f15177A;
        h hVar = new h();
        hVar.f15322a = i15;
        hVar.f15353m = 0;
        hVar.f(0, "percentX");
        hVar.f(0, "percentY");
        h hVar2 = new h();
        hVar2.f15322a = motionEffect.f15177A;
        hVar2.f15353m = 0;
        int i16 = 1;
        hVar2.f(1, "percentX");
        hVar2.f(1, "percentY");
        C1031d c1031d6 = null;
        if (motionEffect.f15178B > 0) {
            c1031d = new C1031d();
            c1031d2 = new C1031d();
            c1031d.f(Integer.valueOf(motionEffect.f15178B), "translationX");
            c1031d.f15322a = motionEffect.f15177A;
            c1031d2.f(0, "translationX");
            c1031d2.f15322a = motionEffect.f15177A - 1;
        } else {
            c1031d = null;
            c1031d2 = null;
        }
        if (motionEffect.f15179C > 0) {
            c1031d6 = new C1031d();
            c1031d3 = new C1031d();
            c1031d6.f(Integer.valueOf(motionEffect.f15179C), "translationY");
            c1031d6.f15322a = motionEffect.f15177A;
            c1031d3.f(0, "translationY");
            c1031d3.f15322a = motionEffect.f15177A - 1;
        } else {
            c1031d3 = null;
        }
        int i17 = motionEffect.f15182M;
        if (i17 == -1) {
            int[] iArr = new int[4];
            int i18 = 0;
            i10 = 3;
            i11 = 2;
            while (i18 < viewArrI.length) {
                m mVar = (m) map2.get(viewArrI[i18]);
                if (mVar == null) {
                    i14 = i18;
                    i13 = i16;
                } else {
                    i13 = i16;
                    v vVar = mVar.f15387g;
                    float f10 = vVar.f15453e;
                    v vVar2 = mVar.f15386f;
                    i14 = i18;
                    float f11 = f10 - vVar2.f15453e;
                    float f12 = vVar.f15454f - vVar2.f15454f;
                    if (f12 < 0.0f) {
                        iArr[i13] = iArr[i13] + 1;
                    }
                    if (f12 > 0.0f) {
                        iArr[0] = iArr[0] + 1;
                    }
                    if (f11 > 0.0f) {
                        iArr[3] = iArr[3] + 1;
                    }
                    if (f11 < 0.0f) {
                        iArr[2] = iArr[2] + 1;
                    }
                }
                i18 = i14 + 1;
                i16 = i13;
            }
            i7 = i16;
            int i19 = iArr[0];
            i17 = 0;
            for (int i20 = i7; i20 < 4; i20++) {
                int i21 = iArr[i20];
                if (i19 < i21) {
                    i19 = i21;
                    i17 = i20;
                }
            }
        } else {
            i7 = 1;
            i10 = 3;
            i11 = 2;
        }
        int i22 = 0;
        while (i22 < viewArrI.length) {
            m mVar2 = (m) map2.get(viewArrI[i22]);
            if (mVar2 == null) {
                viewArr = viewArrI;
            } else {
                v vVar3 = mVar2.f15387g;
                float f13 = vVar3.f15453e;
                v vVar4 = mVar2.f15386f;
                viewArr = viewArrI;
                float f14 = f13 - vVar4.f15453e;
                float f15 = vVar3.f15454f - vVar4.f15454f;
                if (i17 == 0) {
                    if (f15 <= 0.0f || (motionEffect.f15180H && f14 != 0.0f)) {
                        i12 = motionEffect.f15181L;
                        if (i12 == -1) {
                            mVar2.a(c1031d4);
                            mVar2.a(c1031d5);
                            mVar2.a(hVar);
                            mVar2.a(hVar2);
                            if (motionEffect.f15178B > 0) {
                                mVar2.a(c1031d);
                                mVar2.a(c1031d2);
                            }
                            if (motionEffect.f15179C > 0) {
                                mVar2.a(c1031d6);
                                mVar2.a(c1031d3);
                            }
                        } else {
                            yVar = motionLayout.f15290a;
                            if (yVar != null) {
                                it = ((ArrayList) yVar.f15499q.f2185d).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        c6 = (C) it.next();
                                        if (c6.f15230a == i12) {
                                            arrayList = (ArrayList) c6.f15235f.f15343a.get(-1);
                                            if (arrayList == null) {
                                                break;
                                            }
                                            mVar2.f15402w.addAll(arrayList);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        i22++;
                        map2 = map;
                        viewArrI = viewArr;
                        i10 = 3;
                        i11 = 2;
                        i7 = 1;
                        motionEffect = this;
                    }
                } else if (i17 == i7) {
                    if (f15 >= 0.0f || (motionEffect.f15180H && f14 != 0.0f)) {
                        i12 = motionEffect.f15181L;
                        if (i12 == -1) {
                            mVar2.a(c1031d4);
                            mVar2.a(c1031d5);
                            mVar2.a(hVar);
                            mVar2.a(hVar2);
                            if (motionEffect.f15178B > 0) {
                                mVar2.a(c1031d);
                                mVar2.a(c1031d2);
                            }
                            if (motionEffect.f15179C > 0) {
                                mVar2.a(c1031d6);
                                mVar2.a(c1031d3);
                            }
                        } else {
                            yVar = motionLayout.f15290a;
                            if (yVar != null) {
                                it = ((ArrayList) yVar.f15499q.f2185d).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        c6 = (C) it.next();
                                        if (c6.f15230a == i12) {
                                            arrayList = (ArrayList) c6.f15235f.f15343a.get(-1);
                                            if (arrayList == null) {
                                                mVar2.f15402w.addAll(arrayList);
                                                break;
                                                break;
                                            } else {
                                                break;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i22++;
                        map2 = map;
                        viewArrI = viewArr;
                        i10 = 3;
                        i11 = 2;
                        i7 = 1;
                        motionEffect = this;
                    }
                } else if (i17 != i11) {
                    if (i17 != i10 || f14 <= 0.0f || (motionEffect.f15180H && f15 != 0.0f)) {
                        i12 = motionEffect.f15181L;
                        if (i12 == -1) {
                            mVar2.a(c1031d4);
                            mVar2.a(c1031d5);
                            mVar2.a(hVar);
                            mVar2.a(hVar2);
                            if (motionEffect.f15178B > 0) {
                                mVar2.a(c1031d);
                                mVar2.a(c1031d2);
                            }
                            if (motionEffect.f15179C > 0) {
                                mVar2.a(c1031d6);
                                mVar2.a(c1031d3);
                            }
                        } else {
                            yVar = motionLayout.f15290a;
                            if (yVar != null) {
                                it = ((ArrayList) yVar.f15499q.f2185d).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        c6 = (C) it.next();
                                        if (c6.f15230a == i12) {
                                            arrayList = (ArrayList) c6.f15235f.f15343a.get(-1);
                                            if (arrayList == null) {
                                                mVar2.f15402w.addAll(arrayList);
                                                break;
                                                break;
                                            } else {
                                                break;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i22++;
                    map2 = map;
                    viewArrI = viewArr;
                    i10 = 3;
                    i11 = 2;
                    i7 = 1;
                    motionEffect = this;
                } else if (f14 >= 0.0f || (motionEffect.f15180H && f15 != 0.0f)) {
                    i12 = motionEffect.f15181L;
                    if (i12 == -1) {
                        mVar2.a(c1031d4);
                        mVar2.a(c1031d5);
                        mVar2.a(hVar);
                        mVar2.a(hVar2);
                        if (motionEffect.f15178B > 0) {
                            mVar2.a(c1031d);
                            mVar2.a(c1031d2);
                        }
                        if (motionEffect.f15179C > 0) {
                            mVar2.a(c1031d6);
                            mVar2.a(c1031d3);
                        }
                    } else {
                        yVar = motionLayout.f15290a;
                        if (yVar != null) {
                            it = ((ArrayList) yVar.f15499q.f2185d).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    c6 = (C) it.next();
                                    if (c6.f15230a == i12) {
                                        arrayList = (ArrayList) c6.f15235f.f15343a.get(-1);
                                        if (arrayList == null) {
                                            mVar2.f15402w.addAll(arrayList);
                                            break;
                                            break;
                                        } else {
                                            break;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i22++;
                    map2 = map;
                    viewArrI = viewArr;
                    i10 = 3;
                    i11 = 2;
                    i7 = 1;
                    motionEffect = this;
                }
            }
            i22++;
            map2 = map;
            viewArrI = viewArr;
            i10 = 3;
            i11 = 2;
            i7 = 1;
            motionEffect = this;
        }
    }

    public final void q(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.MotionEffect);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == p.MotionEffect_motionEffect_start) {
                    int i10 = typedArrayObtainStyledAttributes.getInt(index, this.f15184w);
                    this.f15184w = i10;
                    this.f15184w = Math.max(Math.min(i10, 99), 0);
                } else if (index == p.MotionEffect_motionEffect_end) {
                    int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f15177A);
                    this.f15177A = i11;
                    this.f15177A = Math.max(Math.min(i11, 99), 0);
                } else if (index == p.MotionEffect_motionEffect_translationX) {
                    this.f15178B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15178B);
                } else if (index == p.MotionEffect_motionEffect_translationY) {
                    this.f15179C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15179C);
                } else if (index == p.MotionEffect_motionEffect_alpha) {
                    this.f15183v = typedArrayObtainStyledAttributes.getFloat(index, this.f15183v);
                } else if (index == p.MotionEffect_motionEffect_move) {
                    this.f15182M = typedArrayObtainStyledAttributes.getInt(index, this.f15182M);
                } else if (index == p.MotionEffect_motionEffect_strict) {
                    this.f15180H = typedArrayObtainStyledAttributes.getBoolean(index, this.f15180H);
                } else if (index == p.MotionEffect_motionEffect_viewTransition) {
                    this.f15181L = typedArrayObtainStyledAttributes.getResourceId(index, this.f15181L);
                }
            }
            int i12 = this.f15184w;
            int i13 = this.f15177A;
            if (i12 == i13) {
                if (i12 > 0) {
                    this.f15184w = i12 - 1;
                } else {
                    this.f15177A = i13 + 1;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public MotionEffect(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f15183v = 0.1f;
        this.f15184w = 49;
        this.f15177A = 50;
        this.f15178B = 0;
        this.f15179C = 0;
        this.f15180H = true;
        this.f15181L = -1;
        this.f15182M = -1;
        q(context, attrs);
    }

    public MotionEffect(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f15183v = 0.1f;
        this.f15184w = 49;
        this.f15177A = 50;
        this.f15178B = 0;
        this.f15179C = 0;
        this.f15180H = true;
        this.f15181L = -1;
        this.f15182M = -1;
        q(context, attrs);
    }
}
