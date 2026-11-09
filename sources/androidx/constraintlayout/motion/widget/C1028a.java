package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1028a implements ProxyInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f15319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f15320c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MotionLayout f15321a;

    static {
        HashMap map = new HashMap();
        f15319b = map;
        HashMap map2 = new HashMap();
        f15320c = map2;
        map.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        map.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        map.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        map.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        map.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        map.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        map.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        map.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        map.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        map.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        map.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        map.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        map.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        map2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        map2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        map2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        map2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        map2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        map2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        map2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        map2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        map2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        map2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        map2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        map2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public C1028a(MotionLayout motionLayout) {
        this.f15321a = motionLayout;
    }

    public static void a(int i7, androidx.constraintlayout.widget.m mVar, View view, HashMap map, int i10, int i11) {
        String str = (String) f15319b.get(Pair.create(Integer.valueOf(i10), Integer.valueOf(i11)));
        String str2 = (String) map.get(str);
        if (str2 != null) {
            String str3 = (String) f15320c.get(str);
            mVar.h(view.getId(), i10, Integer.parseInt(str2), i11, str3 != null ? b(i7, (String) map.get(str3)) : 0);
        }
    }

    public static int b(int i7, String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(100)) == -1) {
            return 0;
        }
        return (int) ((Integer.valueOf(str.substring(0, iIndexOf)).intValue() * i7) / 160.0f);
    }

    public static void c(androidx.constraintlayout.widget.m mVar, View view, HashMap map, int i7) {
        String str = (String) map.get(i7 == 1 ? "layout_constraintVertical_bias" : "layout_constraintHorizontal_bias");
        if (str != null) {
            if (i7 == 0) {
                mVar.k(view.getId()).f15747e.f15813x = Float.parseFloat(str);
            } else if (i7 == 1) {
                mVar.k(view.getId()).f15747e.f15814y = Float.parseFloat(str);
            }
        }
    }

    public static void d(int i7, androidx.constraintlayout.widget.m mVar, View view, HashMap map, int i10) {
        String str = (String) map.get(i10 == 1 ? "layout_height" : "layout_width");
        if (str != null) {
            int iB = !str.equalsIgnoreCase("wrap_content") ? b(i7, str) : -2;
            if (i10 == 0) {
                mVar.k(view.getId()).f15747e.f15781c = iB;
            } else {
                mVar.k(view.getId()).f15747e.f15782d = iB;
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public final int designAccess(int i7, String str, Object obj, float[] fArr, int i10, float[] fArr2, int i11) {
        m mVar;
        View view = (View) obj;
        MotionLayout motionLayout = this.f15321a;
        if (i7 == 0) {
            mVar = null;
        } else if (motionLayout.f15290a == null || view == null || (mVar = (m) motionLayout.f15305p.get(view)) == null) {
            return -1;
        }
        if (i7 == 0) {
            return 1;
        }
        if (i7 == 1) {
            int iC = motionLayout.f15290a.c() / 16;
            mVar.c(iC, fArr2);
            return iC;
        }
        if (i7 == 2) {
            int iC2 = motionLayout.f15290a.c() / 16;
            mVar.b(null, fArr2);
            return iC2;
        }
        if (i7 != 3) {
            return -1;
        }
        motionLayout.f15290a.c();
        androidx.constraintlayout.core.motion.utils.b bVar = (androidx.constraintlayout.core.motion.utils.b) mVar.f15404y.get(str);
        if (bVar == null) {
            return -1;
        }
        for (int i12 = 0; i12 < fArr2.length; i12++) {
            fArr2[i12] = bVar.a(i12 / (fArr2.length - 1));
        }
        return fArr2.length;
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public final float getKeyFramePosition(Object obj, int i7, float f10, float f11) {
        m mVar;
        if ((obj instanceof View) && (mVar = (m) this.f15321a.f15305p.get((View) obj)) != null) {
            return mVar.g(f10, f11, i7);
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public final Object getKeyframeAtLocation(Object obj, float f10, float f11) {
        m mVar;
        View view = (View) obj;
        MotionLayout motionLayout = this.f15321a;
        if (motionLayout.f15290a == null) {
            return -1;
        }
        if (view == null || (mVar = (m) motionLayout.f15305p.get(view)) == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        RectF rectF = new RectF();
        v vVar = mVar.f15386f;
        float f12 = vVar.f15453e;
        rectF.left = f12;
        float f13 = vVar.f15454f;
        rectF.top = f13;
        rectF.right = f12 + vVar.f15455g;
        rectF.bottom = f13 + vVar.f15456i;
        RectF rectF2 = new RectF();
        v vVar2 = mVar.f15387g;
        float f14 = vVar2.f15453e;
        rectF2.left = f14;
        float f15 = vVar2.f15454f;
        rectF2.top = f15;
        rectF2.right = f14 + vVar2.f15455g;
        rectF2.bottom = f15 + vVar2.f15456i;
        for (AbstractC1029b abstractC1029b : mVar.f15402w) {
            if (abstractC1029b instanceof h) {
                h hVar = (h) abstractC1029b;
                hVar.getClass();
                float fCenterX = rectF.centerX();
                float fCenterY = rectF.centerY();
                float fCenterX2 = rectF2.centerX();
                float fCenterY2 = rectF2.centerY();
                int i7 = hVar.f15353m;
                if (i7 == 1) {
                    float f16 = fCenterX2 - fCenterX;
                    float f17 = fCenterY2 - fCenterY;
                    float f18 = hVar.f15351k;
                    float f19 = (f16 * f18) + fCenterX;
                    float f20 = hVar.f15352l;
                    hVar.f15354n = ((-f17) * f20) + f19;
                    hVar.f15355o = (f16 * f20) + (f17 * f18) + fCenterY;
                } else if (i7 != 2) {
                    float f21 = fCenterX2 - fCenterX;
                    float f22 = fCenterY2 - fCenterY;
                    float f23 = Float.isNaN(hVar.f15351k) ? 0.0f : hVar.f15351k;
                    float f24 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
                    float f25 = Float.isNaN(hVar.f15352l) ? 0.0f : hVar.f15352l;
                    hVar.f15354n = (int) (((Float.isNaN(Float.NaN) ? 0.0f : Float.NaN) * f22) + (f23 * f21) + fCenterX);
                    hVar.f15355o = (int) ((f22 * f25) + (f21 * f24) + fCenterY);
                } else {
                    float f26 = hVar.f15351k;
                    float f27 = 0;
                    hVar.f15354n = (width * f26) + f27;
                    hVar.f15355o = (height * f26) + f27;
                }
                if (Math.abs(f10 - hVar.f15354n) < 20.0f && Math.abs(f11 - hVar.f15355o) < 20.0f) {
                    return hVar;
                }
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public final Boolean getPositionKeyframe(Object obj, Object obj2, float f10, float f11, String[] strArr, float[] fArr) {
        if (!(obj instanceof h)) {
            return Boolean.FALSE;
        }
        MotionLayout motionLayout = this.f15321a;
        View view = (View) obj2;
        m mVar = (m) motionLayout.f15305p.get(view);
        mVar.getClass();
        RectF rectF = new RectF();
        v vVar = mVar.f15386f;
        float f12 = vVar.f15453e;
        rectF.left = f12;
        float f13 = vVar.f15454f;
        rectF.top = f13;
        rectF.right = f12 + vVar.f15455g;
        rectF.bottom = f13 + vVar.f15456i;
        RectF rectF2 = new RectF();
        v vVar2 = mVar.f15387g;
        float f14 = vVar2.f15453e;
        rectF2.left = f14;
        float f15 = vVar2.f15454f;
        rectF2.top = f15;
        rectF2.right = f14 + vVar2.f15455g;
        rectF2.bottom = f15 + vVar2.f15456i;
        int i7 = ((h) obj).f15353m;
        if (i7 == 1) {
            float fCenterX = rectF.centerX();
            float fCenterY = rectF.centerY();
            float fCenterX2 = rectF2.centerX() - fCenterX;
            float fCenterY2 = rectF2.centerY() - fCenterY;
            float fHypot = (float) Math.hypot(fCenterX2, fCenterY2);
            if (fHypot < 1.0E-4d) {
                System.out.println("distance ~ 0");
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
            } else {
                float f16 = fCenterX2 / fHypot;
                float f17 = fCenterY2 / fHypot;
                float f18 = f11 - fCenterY;
                float f19 = f10 - fCenterX;
                float fA = androidx.camera.video.u.a(f19, f17, f16 * f18, fHypot);
                float f20 = ((f17 * f18) + (f16 * f19)) / fHypot;
                String str = strArr[0];
                if (str == null) {
                    strArr[0] = "percentX";
                    strArr[1] = "percentY";
                    fArr[0] = f20;
                    fArr[1] = fA;
                } else if ("percentX".equals(str)) {
                    fArr[0] = f20;
                    fArr[1] = fA;
                }
            }
        } else if (i7 != 2) {
            float fCenterX3 = rectF.centerX();
            float fCenterY3 = rectF.centerY();
            float fCenterX4 = rectF2.centerX() - fCenterX3;
            float fCenterY4 = rectF2.centerY() - fCenterY3;
            String str2 = strArr[0];
            if (str2 == null) {
                strArr[0] = "percentX";
                fArr[0] = (f10 - fCenterX3) / fCenterX4;
                strArr[1] = "percentY";
                fArr[1] = (f11 - fCenterY3) / fCenterY4;
            } else if ("percentX".equals(str2)) {
                fArr[0] = (f10 - fCenterX3) / fCenterX4;
                fArr[1] = (f11 - fCenterY3) / fCenterY4;
            } else {
                fArr[1] = (f10 - fCenterX3) / fCenterX4;
                fArr[0] = (f11 - fCenterY3) / fCenterY4;
            }
        } else {
            rectF.centerX();
            rectF.centerY();
            rectF2.centerX();
            rectF2.centerY();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            int width = viewGroup.getWidth();
            int height = viewGroup.getHeight();
            String str3 = strArr[0];
            if (str3 == null) {
                strArr[0] = "percentX";
                fArr[0] = f10 / width;
                strArr[1] = "percentY";
                fArr[1] = f11 / height;
            } else if ("percentX".equals(str3)) {
                fArr[0] = f10 / width;
                fArr[1] = f11 / height;
            } else {
                fArr[1] = f10 / width;
                fArr[0] = f11 / height;
            }
        }
        motionLayout.t();
        motionLayout.f15274L = true;
        return Boolean.TRUE;
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public final long getTransitionTimeMs() {
        return this.f15321a.getTransitionTimeMs();
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public final void setAttributes(int i7, String str, Object obj, Object obj2) {
        Integer num;
        View view = (View) obj;
        HashMap map = (HashMap) obj2;
        MotionLayout motionLayout = this.f15321a;
        y yVar = motionLayout.f15290a;
        int iIntValue = (yVar == null || (num = (Integer) yVar.f15490h.get(str)) == null) ? 0 : num.intValue();
        androidx.constraintlayout.widget.m mVarB = motionLayout.f15290a.b(iIntValue);
        if (mVarB == null) {
            return;
        }
        mVarB.f15858f.remove(Integer.valueOf(view.getId()));
        d(i7, mVarB, view, map, 0);
        d(i7, mVarB, view, map, 1);
        a(i7, mVarB, view, map, 6, 6);
        a(i7, mVarB, view, map, 6, 7);
        a(i7, mVarB, view, map, 7, 7);
        a(i7, mVarB, view, map, 7, 6);
        a(i7, mVarB, view, map, 1, 1);
        a(i7, mVarB, view, map, 1, 2);
        a(i7, mVarB, view, map, 2, 2);
        a(i7, mVarB, view, map, 2, 1);
        a(i7, mVarB, view, map, 3, 3);
        a(i7, mVarB, view, map, 3, 4);
        a(i7, mVarB, view, map, 4, 3);
        a(i7, mVarB, view, map, 4, 4);
        a(i7, mVarB, view, map, 5, 5);
        c(mVarB, view, map, 0);
        c(mVarB, view, map, 1);
        String str2 = (String) map.get("layout_editor_absoluteX");
        if (str2 != null) {
            mVarB.k(view.getId()).f15747e.f15755D = b(i7, str2);
        }
        String str3 = (String) map.get("layout_editor_absoluteY");
        if (str3 != null) {
            mVarB.k(view.getId()).f15747e.f15756E = b(i7, str3);
        }
        motionLayout.C(iIntValue, mVarB);
        motionLayout.requestLayout();
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public final void setKeyFrame(Object obj, int i7, String str, Object obj2) {
        MotionLayout motionLayout = this.f15321a;
        y yVar = motionLayout.f15290a;
        if (yVar != null) {
            yVar.o((View) obj, i7, str, obj2);
            motionLayout.f15263C = i7 / 100.0f;
            motionLayout.f15259A = 0.0f;
            motionLayout.t();
            motionLayout.j(true);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public final boolean setKeyFramePosition(Object obj, int i7, int i10, float f10, float f11) {
        if (!(obj instanceof View)) {
            return false;
        }
        MotionLayout motionLayout = this.f15321a;
        if (motionLayout.f15290a == null) {
            return false;
        }
        m mVar = (m) motionLayout.f15305p.get(obj);
        int i11 = (int) (motionLayout.f15314w * 100.0f);
        if (mVar == null) {
            return false;
        }
        View view = (View) obj;
        x xVar = motionLayout.f15290a.f15485c;
        if (xVar == null) {
            return false;
        }
        for (f fVar : xVar.f15475k) {
            Iterator it = ((ArrayList) fVar.f15343a.get(Integer.valueOf(view.getId()))).iterator();
            while (it.hasNext()) {
                if (((AbstractC1029b) it.next()).f15322a == i11) {
                    float fG = mVar.g(f10, f11, 2);
                    float fG2 = mVar.g(f10, f11, 5);
                    motionLayout.f15290a.o(view, i11, "motion:percentX", Float.valueOf(fG));
                    motionLayout.f15290a.o(view, i11, "motion:percentY", Float.valueOf(fG2));
                    motionLayout.t();
                    motionLayout.j(true);
                    motionLayout.invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public final void setToolPosition(float f10) {
        MotionLayout motionLayout = this.f15321a;
        if (motionLayout.f15290a == null) {
            motionLayout.f15290a = null;
        }
        motionLayout.setProgress(f10);
        motionLayout.j(true);
        motionLayout.requestLayout();
        motionLayout.invalidate();
    }
}
