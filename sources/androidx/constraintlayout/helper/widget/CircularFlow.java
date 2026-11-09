package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.widget.p;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class CircularFlow extends VirtualLayout {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static int f15148Q;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static float f15149k0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f15150A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f15151B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f15152C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f15153H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Float f15154L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Integer f15155M;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ConstraintLayout f15156p;
    public int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float[] f15157v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int[] f15158w;

    public CircularFlow(Context context) {
        super(context);
    }

    private void setAngles(String idList) {
        if (idList == null) {
            return;
        }
        int i7 = 0;
        this.f15151B = 0;
        while (true) {
            int iIndexOf = idList.indexOf(44, i7);
            if (iIndexOf == -1) {
                r(idList.substring(i7).trim());
                return;
            } else {
                r(idList.substring(i7, iIndexOf).trim());
                i7 = iIndexOf + 1;
            }
        }
    }

    private void setRadius(String idList) {
        if (idList == null) {
            return;
        }
        int i7 = 0;
        this.f15150A = 0;
        while (true) {
            int iIndexOf = idList.indexOf(44, i7);
            if (iIndexOf == -1) {
                s(idList.substring(i7).trim());
                return;
            } else {
                s(idList.substring(i7, iIndexOf).trim());
                i7 = iIndexOf + 1;
            }
        }
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.f15157v, this.f15151B);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.f15158w, this.f15150A);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void j(AttributeSet attributeSet) {
        super.j(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == p.ConstraintLayout_Layout_circularflow_viewCenter) {
                    this.t = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                } else if (index == p.ConstraintLayout_Layout_circularflow_angles) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f15152C = string;
                    setAngles(string);
                } else if (index == p.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f15153H = string2;
                    setRadius(string2);
                } else if (index == p.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    Float fValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, f15149k0));
                    this.f15154L = fValueOf;
                    setDefaultAngle(fValueOf.floatValue());
                } else if (index == p.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, f15148Q));
                    this.f15155M = numValueOf;
                    setDefaultRadius(numValueOf.intValue());
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f15152C;
        if (str != null) {
            this.f15157v = new float[1];
            setAngles(str);
        }
        String str2 = this.f15153H;
        if (str2 != null) {
            this.f15158w = new int[1];
            setRadius(str2);
        }
        Float f10 = this.f15154L;
        if (f10 != null) {
            setDefaultAngle(f10.floatValue());
        }
        Integer num = this.f15155M;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        this.f15156p = (ConstraintLayout) getParent();
        for (int i7 = 0; i7 < this.f15603b; i7++) {
            View viewById = this.f15156p.getViewById(this.f15602a[i7]);
            if (viewById != null) {
                int i10 = f15148Q;
                float f11 = f15149k0;
                int[] iArr = this.f15158w;
                HashMap map = this.f15609i;
                if (iArr == null || i7 >= iArr.length) {
                    Integer num2 = this.f15155M;
                    if (num2 == null || num2.intValue() == -1) {
                        Log.e("CircularFlow", "Added radius to view with id: " + ((String) map.get(Integer.valueOf(viewById.getId()))));
                    } else {
                        this.f15150A++;
                        if (this.f15158w == null) {
                            this.f15158w = new int[1];
                        }
                        int[] radius = getRadius();
                        this.f15158w = radius;
                        radius[this.f15150A - 1] = i10;
                    }
                } else {
                    i10 = iArr[i7];
                }
                float[] fArr = this.f15157v;
                if (fArr == null || i7 >= fArr.length) {
                    Float f12 = this.f15154L;
                    if (f12 == null || f12.floatValue() == -1.0f) {
                        Log.e("CircularFlow", "Added angle to view with id: " + ((String) map.get(Integer.valueOf(viewById.getId()))));
                    } else {
                        this.f15151B++;
                        if (this.f15157v == null) {
                            this.f15157v = new float[1];
                        }
                        float[] angles = getAngles();
                        this.f15157v = angles;
                        angles[this.f15151B - 1] = f11;
                    }
                } else {
                    f11 = fArr[i7];
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewById.getLayoutParams();
                layoutParams.f15667r = f11;
                layoutParams.f15663p = this.t;
                layoutParams.f15665q = i10;
                viewById.setLayoutParams(layoutParams);
            }
        }
        d();
    }

    public final void r(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.f15604c == null || (fArr = this.f15157v) == null) {
            return;
        }
        if (this.f15151B + 1 > fArr.length) {
            this.f15157v = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.f15157v[this.f15151B] = Integer.parseInt(str);
        this.f15151B++;
    }

    public final void s(String str) {
        Context context;
        int[] iArr;
        if (str == null || str.length() == 0 || (context = this.f15604c) == null || (iArr = this.f15158w) == null) {
            return;
        }
        if (this.f15150A + 1 > iArr.length) {
            this.f15158w = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.f15158w[this.f15150A] = (int) (Integer.parseInt(str) * context.getResources().getDisplayMetrics().density);
        this.f15150A++;
    }

    public void setDefaultAngle(float angle) {
        f15149k0 = angle;
    }

    public void setDefaultRadius(int radius) {
        f15148Q = radius;
    }

    public CircularFlow(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CircularFlow(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
