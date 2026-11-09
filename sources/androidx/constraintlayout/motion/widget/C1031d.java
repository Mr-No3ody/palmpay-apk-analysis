package androidx.constraintlayout.motion.widget;

import C0.G;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.common.base.Ascii;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1031d extends AbstractC1029b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15327e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f15328f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f15329g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f15330h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f15331i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f15332j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f15333k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f15334l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f15335m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f15336n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f15337o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f15338p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f15339q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f15340r = Float.NaN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f15341s = Float.NaN;

    public C1031d() {
        this.f15325d = new HashMap();
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC1029b
    /* JADX INFO: renamed from: a */
    public final AbstractC1029b clone() {
        C1031d c1031d = new C1031d();
        c1031d.f15322a = this.f15322a;
        c1031d.f15323b = this.f15323b;
        c1031d.f15324c = this.f15324c;
        c1031d.f15325d = this.f15325d;
        c1031d.f15327e = this.f15327e;
        c1031d.f15328f = this.f15328f;
        c1031d.f15329g = this.f15329g;
        c1031d.f15330h = this.f15330h;
        c1031d.f15331i = this.f15331i;
        c1031d.f15332j = this.f15332j;
        c1031d.f15333k = this.f15333k;
        c1031d.f15334l = this.f15334l;
        c1031d.f15335m = this.f15335m;
        c1031d.f15336n = this.f15336n;
        c1031d.f15337o = this.f15337o;
        c1031d.f15338p = this.f15338p;
        c1031d.f15339q = this.f15339q;
        c1031d.f15340r = this.f15340r;
        c1031d.f15341s = this.f15341s;
        return c1031d;
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC1029b
    public final void b(HashSet hashSet) {
        if (!Float.isNaN(this.f15328f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f15329g)) {
            hashSet.add(ViewProps.ELEVATION);
        }
        if (!Float.isNaN(this.f15330h)) {
            hashSet.add(ViewProps.ROTATION);
        }
        if (!Float.isNaN(this.f15331i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f15332j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f15333k)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f15334l)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f15338p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f15339q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f15340r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f15335m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f15336n)) {
            hashSet.add(ViewProps.SCALE_X);
        }
        if (!Float.isNaN(this.f15337o)) {
            hashSet.add(ViewProps.SCALE_Y);
        }
        if (!Float.isNaN(this.f15341s)) {
            hashSet.add(ReactProgressBarViewManager.PROP_PROGRESS);
        }
        if (this.f15325d.size() > 0) {
            Iterator it = this.f15325d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC1029b
    public final void c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.p.KeyAttribute);
        SparseIntArray sparseIntArray = AbstractC1030c.f15326a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            SparseIntArray sparseIntArray2 = AbstractC1030c.f15326a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f15328f = typedArrayObtainStyledAttributes.getFloat(index, this.f15328f);
                    break;
                case 2:
                    this.f15329g = typedArrayObtainStyledAttributes.getDimension(index, this.f15329g);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f15330h = typedArrayObtainStyledAttributes.getFloat(index, this.f15330h);
                    break;
                case 5:
                    this.f15331i = typedArrayObtainStyledAttributes.getFloat(index, this.f15331i);
                    break;
                case 6:
                    this.f15332j = typedArrayObtainStyledAttributes.getFloat(index, this.f15332j);
                    break;
                case 7:
                    this.f15336n = typedArrayObtainStyledAttributes.getFloat(index, this.f15336n);
                    break;
                case 8:
                    this.f15335m = typedArrayObtainStyledAttributes.getFloat(index, this.f15335m);
                    break;
                case 9:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 10:
                    if (MotionLayout.f1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f15323b);
                        this.f15323b = resourceId;
                        if (resourceId == -1) {
                            this.f15324c = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f15324c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f15323b = typedArrayObtainStyledAttributes.getResourceId(index, this.f15323b);
                    }
                    break;
                case 12:
                    this.f15322a = typedArrayObtainStyledAttributes.getInt(index, this.f15322a);
                    break;
                case 13:
                    this.f15327e = typedArrayObtainStyledAttributes.getInteger(index, this.f15327e);
                    break;
                case 14:
                    this.f15337o = typedArrayObtainStyledAttributes.getFloat(index, this.f15337o);
                    break;
                case 15:
                    this.f15338p = typedArrayObtainStyledAttributes.getDimension(index, this.f15338p);
                    break;
                case 16:
                    this.f15339q = typedArrayObtainStyledAttributes.getDimension(index, this.f15339q);
                    break;
                case 17:
                    this.f15340r = typedArrayObtainStyledAttributes.getDimension(index, this.f15340r);
                    break;
                case 18:
                    this.f15341s = typedArrayObtainStyledAttributes.getFloat(index, this.f15341s);
                    break;
                case 19:
                    this.f15333k = typedArrayObtainStyledAttributes.getDimension(index, this.f15333k);
                    break;
                case 20:
                    this.f15334l = typedArrayObtainStyledAttributes.getDimension(index, this.f15334l);
                    break;
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC1029b
    public final void d(HashMap map) {
        if (this.f15327e == -1) {
            return;
        }
        if (!Float.isNaN(this.f15328f)) {
            map.put("alpha", Integer.valueOf(this.f15327e));
        }
        if (!Float.isNaN(this.f15329g)) {
            map.put(ViewProps.ELEVATION, Integer.valueOf(this.f15327e));
        }
        if (!Float.isNaN(this.f15330h)) {
            map.put(ViewProps.ROTATION, Integer.valueOf(this.f15327e));
        }
        if (!Float.isNaN(this.f15331i)) {
            map.put("rotationX", Integer.valueOf(this.f15327e));
        }
        if (!Float.isNaN(this.f15332j)) {
            map.put("rotationY", Integer.valueOf(this.f15327e));
        }
        if (!Float.isNaN(this.f15333k)) {
            map.put("transformPivotX", Integer.valueOf(this.f15327e));
        }
        if (!Float.isNaN(this.f15334l)) {
            map.put("transformPivotY", Integer.valueOf(this.f15327e));
        }
        if (!Float.isNaN(this.f15338p)) {
            map.put("translationX", Integer.valueOf(this.f15327e));
        }
        if (!Float.isNaN(this.f15339q)) {
            map.put("translationY", Integer.valueOf(this.f15327e));
        }
        if (!Float.isNaN(this.f15340r)) {
            map.put("translationZ", Integer.valueOf(this.f15327e));
        }
        if (!Float.isNaN(this.f15335m)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f15327e));
        }
        if (!Float.isNaN(this.f15336n)) {
            map.put(ViewProps.SCALE_X, Integer.valueOf(this.f15327e));
        }
        if (!Float.isNaN(this.f15337o)) {
            map.put(ViewProps.SCALE_Y, Integer.valueOf(this.f15327e));
        }
        if (!Float.isNaN(this.f15341s)) {
            map.put(ReactProgressBarViewManager.PROP_PROGRESS, Integer.valueOf(this.f15327e));
        }
        if (this.f15325d.size() > 0) {
            Iterator it = this.f15325d.keySet().iterator();
            while (it.hasNext()) {
                map.put(G.o("CUSTOM,", (String) it.next()), Integer.valueOf(this.f15327e));
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void f(Object obj, String str) {
        byte b7 = -1;
        switch (str.hashCode()) {
            case -1913008125:
                if (str.equals("motionProgress")) {
                    b7 = 0;
                }
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    b7 = 1;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    b7 = 2;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    b7 = 3;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    b7 = 4;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    b7 = 5;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    b7 = 6;
                }
                break;
            case -908189618:
                if (str.equals(ViewProps.SCALE_X)) {
                    b7 = 7;
                }
                break;
            case -908189617:
                if (str.equals(ViewProps.SCALE_Y)) {
                    b7 = 8;
                }
                break;
            case -760884510:
                if (str.equals("transformPivotX")) {
                    b7 = 9;
                }
                break;
            case -760884509:
                if (str.equals("transformPivotY")) {
                    b7 = 10;
                }
                break;
            case -40300674:
                if (str.equals(ViewProps.ROTATION)) {
                    b7 = Ascii.VT;
                }
                break;
            case -4379043:
                if (str.equals(ViewProps.ELEVATION)) {
                    b7 = Ascii.FF;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    b7 = Ascii.CR;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b7 = Ascii.SO;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    b7 = Ascii.SI;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    b7 = Ascii.DLE;
                }
                break;
        }
        switch (b7) {
            case 0:
                this.f15341s = AbstractC1029b.e((Number) obj);
                break;
            case 1:
                obj.toString();
                break;
            case 2:
                this.f15331i = AbstractC1029b.e((Number) obj);
                break;
            case 3:
                this.f15332j = AbstractC1029b.e((Number) obj);
                break;
            case 4:
                this.f15338p = AbstractC1029b.e((Number) obj);
                break;
            case 5:
                this.f15339q = AbstractC1029b.e((Number) obj);
                break;
            case 6:
                this.f15340r = AbstractC1029b.e((Number) obj);
                break;
            case 7:
                this.f15336n = AbstractC1029b.e((Number) obj);
                break;
            case 8:
                this.f15337o = AbstractC1029b.e((Number) obj);
                break;
            case 9:
                this.f15333k = AbstractC1029b.e((Number) obj);
                break;
            case 10:
                this.f15334l = AbstractC1029b.e((Number) obj);
                break;
            case 11:
                this.f15330h = AbstractC1029b.e((Number) obj);
                break;
            case 12:
                this.f15329g = AbstractC1029b.e((Number) obj);
                break;
            case 13:
                this.f15335m = AbstractC1029b.e((Number) obj);
                break;
            case 14:
                this.f15328f = AbstractC1029b.e((Number) obj);
                break;
            case 15:
                Number number = (Number) obj;
                this.f15327e = number instanceof Integer ? ((Integer) number).intValue() : Integer.parseInt(number.toString());
                break;
            case 16:
                if (!(obj instanceof Boolean)) {
                    Boolean.parseBoolean(obj.toString());
                    break;
                }
                break;
        }
    }
}
