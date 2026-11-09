package com.facebook.drawee.view;

import I2.b;
import I2.d;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Arrays;
import javax.annotation.Nullable;
import p213o2.e;
import p245q3.a;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(a.f41451a)
@Deprecated
public class GenericDraweeView extends DraweeView<I2.a> {
    public GenericDraweeView(Context context) throws Throwable {
        super(context);
        inflateHierarchy(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:177:0x024b A[PHI: r0 r2 r3
      0x024b: PHI (r0v21 boolean) = (r0v16 boolean), (r0v23 boolean) binds: [B:193:0x026b, B:176:0x0249] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r2v19 boolean) = (r2v15 boolean), (r2v21 boolean) binds: [B:193:0x026b, B:176:0x0249] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r3v14 boolean) = (r3v10 boolean), (r3v16 boolean) binds: [B:193:0x026b, B:176:0x0249] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:178:0x024d A[PHI: r0 r2 r3
      0x024d: PHI (r0v18 boolean) = (r0v16 boolean), (r0v16 boolean), (r0v23 boolean), (r0v23 boolean) binds: [B:192:0x0269, B:193:0x026b, B:175:0x0247, B:176:0x0249] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r2v17 boolean) = (r2v15 boolean), (r2v15 boolean), (r2v21 boolean), (r2v21 boolean) binds: [B:192:0x0269, B:193:0x026b, B:175:0x0247, B:176:0x0249] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r3v12 boolean) = (r3v10 boolean), (r3v10 boolean), (r3v16 boolean), (r3v16 boolean) binds: [B:192:0x0269, B:193:0x026b, B:175:0x0247, B:176:0x0249] A[DONT_GENERATE, DONT_INLINE]] */
    public void inflateHierarchy(Context context, @Nullable AttributeSet attributeSet) throws Throwable {
        float f10;
        boolean z3;
        boolean z8;
        boolean z10;
        boolean z11;
        int i7;
        int i10;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        int i12;
        int i13;
        Context context2 = context;
        p181m3.a.a();
        p181m3.a.a();
        b bVar = new b(context2.getResources());
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, B2.a.GenericDraweeHierarchy);
            try {
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                boolean z15 = true;
                int i14 = 0;
                boolean z16 = true;
                boolean z17 = true;
                boolean z18 = true;
                boolean z19 = true;
                boolean z20 = true;
                boolean z21 = true;
                boolean z22 = true;
                int integer = 0;
                int dimensionPixelSize = 0;
                while (i14 < indexCount) {
                    try {
                        int index = typedArrayObtainStyledAttributes.getIndex(i14);
                        if (index == B2.a.GenericDraweeHierarchy_actualImageScaleType) {
                            try {
                                bVar.f3984l = p118hf.a.y(typedArrayObtainStyledAttributes, index);
                                i11 = indexCount;
                                i13 = integer;
                                i12 = dimensionPixelSize;
                                z14 = z15;
                                z15 = z14;
                                dimensionPixelSize = i12;
                                integer = i13;
                            } catch (Throwable th) {
                                th = th;
                            }
                        } else if (index == B2.a.GenericDraweeHierarchy_placeholderImage) {
                            bVar.f3976d = p118hf.a.v(context2, typedArrayObtainStyledAttributes, index);
                            i11 = indexCount;
                            i13 = integer;
                            i12 = dimensionPixelSize;
                            z14 = z15;
                            z15 = z14;
                            dimensionPixelSize = i12;
                            integer = i13;
                        } else {
                            i11 = indexCount;
                            if (index == B2.a.GenericDraweeHierarchy_pressedStateOverlayImage) {
                                Drawable drawableV = p118hf.a.v(context2, typedArrayObtainStyledAttributes, index);
                                if (drawableV == null) {
                                    bVar.f3987o = null;
                                } else {
                                    StateListDrawable stateListDrawable = new StateListDrawable();
                                    stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawableV);
                                    bVar.f3987o = stateListDrawable;
                                }
                            } else if (index == B2.a.GenericDraweeHierarchy_progressBarImage) {
                                bVar.f3982j = p118hf.a.v(context2, typedArrayObtainStyledAttributes, index);
                            } else if (index == B2.a.GenericDraweeHierarchy_fadeDuration) {
                                bVar.f3974b = typedArrayObtainStyledAttributes.getInt(index, 0);
                            } else if (index == B2.a.GenericDraweeHierarchy_viewAspectRatio) {
                                bVar.f3975c = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                            } else if (index == B2.a.GenericDraweeHierarchy_placeholderImageScaleType) {
                                bVar.f3977e = p118hf.a.y(typedArrayObtainStyledAttributes, index);
                            } else if (index == B2.a.GenericDraweeHierarchy_retryImage) {
                                bVar.f3978f = p118hf.a.v(context2, typedArrayObtainStyledAttributes, index);
                            } else if (index == B2.a.GenericDraweeHierarchy_retryImageScaleType) {
                                bVar.f3979g = p118hf.a.y(typedArrayObtainStyledAttributes, index);
                            } else if (index == B2.a.GenericDraweeHierarchy_failureImage) {
                                bVar.f3980h = p118hf.a.v(context2, typedArrayObtainStyledAttributes, index);
                            } else if (index == B2.a.GenericDraweeHierarchy_failureImageScaleType) {
                                bVar.f3981i = p118hf.a.y(typedArrayObtainStyledAttributes, index);
                            } else if (index == B2.a.GenericDraweeHierarchy_progressBarImageScaleType) {
                                bVar.f3983k = p118hf.a.y(typedArrayObtainStyledAttributes, index);
                            } else if (index == B2.a.GenericDraweeHierarchy_progressBarAutoRotateInterval) {
                                integer = typedArrayObtainStyledAttributes.getInteger(index, integer);
                            } else {
                                i13 = integer;
                                if (index == B2.a.GenericDraweeHierarchy_backgroundImage) {
                                    bVar.f3985m = p118hf.a.v(context2, typedArrayObtainStyledAttributes, index);
                                } else if (index == B2.a.GenericDraweeHierarchy_overlayImage) {
                                    Drawable drawableV2 = p118hf.a.v(context2, typedArrayObtainStyledAttributes, index);
                                    if (drawableV2 == null) {
                                        bVar.f3986n = null;
                                    } else {
                                        bVar.f3986n = Arrays.asList(drawableV2);
                                    }
                                } else {
                                    if (index == B2.a.GenericDraweeHierarchy_roundAsCircle) {
                                        p118hf.a.x(bVar).f3992b = typedArrayObtainStyledAttributes.getBoolean(index, false);
                                    } else {
                                        if (index == B2.a.GenericDraweeHierarchy_roundedCornerRadius) {
                                            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dimensionPixelSize);
                                        } else {
                                            int i15 = dimensionPixelSize;
                                            if (index == B2.a.GenericDraweeHierarchy_roundTopLeft) {
                                                z16 = typedArrayObtainStyledAttributes.getBoolean(index, z16);
                                            } else if (index == B2.a.GenericDraweeHierarchy_roundTopRight) {
                                                z18 = typedArrayObtainStyledAttributes.getBoolean(index, z18);
                                            } else if (index == B2.a.GenericDraweeHierarchy_roundBottomLeft) {
                                                z22 = typedArrayObtainStyledAttributes.getBoolean(index, z22);
                                            } else if (index == B2.a.GenericDraweeHierarchy_roundBottomRight) {
                                                z20 = typedArrayObtainStyledAttributes.getBoolean(index, z20);
                                            } else if (index == B2.a.GenericDraweeHierarchy_roundTopStart) {
                                                z17 = typedArrayObtainStyledAttributes.getBoolean(index, z17);
                                            } else if (index == B2.a.GenericDraweeHierarchy_roundTopEnd) {
                                                z19 = typedArrayObtainStyledAttributes.getBoolean(index, z19);
                                            } else {
                                                if (index != B2.a.GenericDraweeHierarchy_roundBottomStart) {
                                                    if (index == B2.a.GenericDraweeHierarchy_roundBottomEnd) {
                                                        z21 = typedArrayObtainStyledAttributes.getBoolean(index, z21);
                                                    } else if (index == B2.a.GenericDraweeHierarchy_roundWithOverlayColor) {
                                                        d dVarX = p118hf.a.x(bVar);
                                                        i12 = i15;
                                                        dVarX.f3994d = typedArrayObtainStyledAttributes.getColor(index, 0);
                                                        dVarX.f3991a = 1;
                                                        z14 = z15;
                                                    } else {
                                                        i12 = i15;
                                                        if (index == B2.a.GenericDraweeHierarchy_roundingBorderWidth) {
                                                            d dVarX2 = p118hf.a.x(bVar);
                                                            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                                                            try {
                                                                dVarX2.getClass();
                                                                z14 = z15;
                                                                try {
                                                                    e.b(dimensionPixelSize2 >= 0.0f, "the border width cannot be < 0");
                                                                    dVarX2.f3995e = dimensionPixelSize2;
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    typedArrayObtainStyledAttributes.recycle();
                                                                    context.getResources().getConfiguration().getLayoutDirection();
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                z14 = z15;
                                                            }
                                                        } else {
                                                            z14 = z15;
                                                            if (index == B2.a.GenericDraweeHierarchy_roundingBorderColor) {
                                                                p118hf.a.x(bVar).f3996f = typedArrayObtainStyledAttributes.getColor(index, 0);
                                                            } else if (index == B2.a.GenericDraweeHierarchy_roundingBorderPadding) {
                                                                d dVarX3 = p118hf.a.x(bVar);
                                                                float dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                                                                dVarX3.getClass();
                                                                e.b(dimensionPixelSize3 >= 0.0f, "the padding cannot be < 0");
                                                                dVarX3.f3997g = dimensionPixelSize3;
                                                            }
                                                        }
                                                    }
                                                    typedArrayObtainStyledAttributes.recycle();
                                                    context.getResources().getConfiguration().getLayoutDirection();
                                                    throw th;
                                                }
                                                dimensionPixelSize = i15;
                                                z15 = typedArrayObtainStyledAttributes.getBoolean(index, z15);
                                            }
                                            dimensionPixelSize = i15;
                                        }
                                        integer = i13;
                                    }
                                    z15 = z14;
                                    dimensionPixelSize = i12;
                                    integer = i13;
                                }
                                i12 = dimensionPixelSize;
                                z14 = z15;
                                z15 = z14;
                                dimensionPixelSize = i12;
                                integer = i13;
                            }
                            i13 = integer;
                            i12 = dimensionPixelSize;
                            z14 = z15;
                            z15 = z14;
                            dimensionPixelSize = i12;
                            integer = i13;
                        }
                        i14++;
                        context2 = context;
                        indexCount = i11;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                i7 = integer;
                int i16 = dimensionPixelSize;
                f10 = 0.0f;
                boolean z23 = z15;
                typedArrayObtainStyledAttributes.recycle();
                if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                    z12 = z16 && z19;
                    z8 = z18 && z17;
                    z10 = z20 && z23;
                    if (z22 && z21) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                } else {
                    z12 = z16 && z17;
                    z8 = z18 && z19;
                    z10 = z20 && z21;
                    if (z22 && z23) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                }
                boolean z24 = z13;
                z11 = z12;
                z3 = z24;
                i10 = i16;
            } catch (Throwable th5) {
                th = th5;
            }
        } else {
            f10 = 0.0f;
            z3 = true;
            z8 = true;
            z10 = true;
            z11 = true;
            i7 = 0;
            i10 = 0;
        }
        if (bVar.f3982j != null && i7 > 0) {
            bVar.f3982j = new com.facebook.drawee.drawable.b(bVar.f3982j, i7, true);
        }
        if (i10 > 0) {
            d dVarX4 = p118hf.a.x(bVar);
            float f11 = z11 ? i10 : f10;
            float f12 = z8 ? i10 : f10;
            float f13 = z10 ? i10 : f10;
            float f14 = z3 ? i10 : f10;
            if (dVarX4.f3993c == null) {
                dVarX4.f3993c = new float[8];
            }
            float[] fArr = dVarX4.f3993c;
            fArr[1] = f11;
            fArr[0] = f11;
            fArr[3] = f12;
            fArr[2] = f12;
            fArr[5] = f13;
            fArr[4] = f13;
            fArr[7] = f14;
            fArr[6] = f14;
        }
        p181m3.a.a();
        setAspectRatio(bVar.f3975c);
        setHierarchy(bVar.a());
        p181m3.a.a();
    }

    public GenericDraweeView(Context context, @Nullable AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        inflateHierarchy(context, attributeSet);
    }

    public GenericDraweeView(Context context, @Nullable AttributeSet attributeSet, int i7) throws Throwable {
        super(context, attributeSet, i7);
        inflateHierarchy(context, attributeSet);
    }
}
