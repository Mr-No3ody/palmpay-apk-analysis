package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.android.flexbox.FlexItem;
import com.google.android.material.navigation.NavigationBarView;
import com.google.api.Service;
import com.transsnet.palmpay.core.bean.rsp.HomeMenuBean;
import com.transsnet.palmpay.core.config.BillBusinessType;
import com.transsnet.palmpay.core.dialog.ShareDialog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.1.4";
    private static q sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<ConstraintHelper> mConstraintHelpers;
    protected f mConstraintLayoutSpec;
    private m mConstraintSet;
    private int mConstraintSetId;
    private n mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected Q.f mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    c mMeasurer;
    private androidx.constraintlayout.core.d mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<Q.e> mTempMapIdToWidget;

    public ConstraintLayout(@NonNull Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new Q.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        a(null, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static q getSharedValues() {
        if (sSharedValues == null) {
            q qVar = new q();
            new SparseIntArray();
            qVar.f15860a = new HashMap();
            sSharedValues = qVar;
        }
        return sSharedValues;
    }

    public final void a(AttributeSet attributeSet, int i7) {
        Q.f fVar = this.mLayoutWidget;
        fVar.f7472h0 = this;
        c cVar = this.mMeasurer;
        fVar.f7521y0 = cVar;
        fVar.f7519w0.f7869f = cVar;
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.ConstraintLayout_Layout, i7, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == p.ConstraintLayout_Layout_android_minWidth) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == p.ConstraintLayout_Layout_android_minHeight) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == p.ConstraintLayout_Layout_android_maxWidth) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == p.ConstraintLayout_Layout_android_maxHeight) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == p.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == p.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == p.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        m mVar = new m();
                        this.mConstraintSet = mVar;
                        mVar.m(resourceId2, getContext());
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        Q.f fVar2 = this.mLayoutWidget;
        fVar2.f7508H0 = this.mOptimizationLevel;
        androidx.constraintlayout.core.c.f15087p = fVar2.X(512);
    }

    /* JADX WARN: Code duplicated, block: B:163:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:56:0x010e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0117  */
    /* JADX WARN: Code duplicated, block: B:59:0x0125  */
    /* JADX WARN: Code duplicated, block: B:61:0x012b  */
    /* JADX WARN: Code duplicated, block: B:68:0x014e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0157  */
    /* JADX WARN: Code duplicated, block: B:73:0x0164  */
    /* JADX WARN: Code duplicated, block: B:75:0x0169  */
    /* JADX WARN: Code duplicated, block: B:80:0x0181  */
    /* JADX WARN: Code duplicated, block: B:82:0x018f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0194  */
    /* JADX WARN: Code duplicated, block: B:85:0x019f  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01bc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:163:0x02cf -> B:164:0x02d0). Please report as a decompilation issue!!! */
    public void applyConstraintsFromLayoutParams(boolean isInEditMode, View child, Q.e widget, LayoutParams layoutParams, SparseArray<Q.e> idToWidget) {
        ConstraintLayout constraintLayout;
        float f10;
        int i7;
        Q.e eVar;
        int i10;
        int i11;
        int i12;
        Q.e eVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        Q.e eVar3;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Q.e eVar4;
        int i22;
        int i23;
        LayoutParams layoutParams2;
        int i24;
        int i25;
        Q.e eVar5;
        int i26;
        float f11;
        Q.e eVar6;
        Q.e eVar7;
        Q.e eVar8;
        int i27;
        float fAbs;
        int i28;
        float f12;
        Q.e eVar9 = widget;
        layoutParams.a();
        eVar9.i0 = child.getVisibility();
        if (layoutParams.f15645f0) {
            eVar9.f7438F = true;
            eVar9.i0 = 8;
        }
        eVar9.f7472h0 = child;
        if (child instanceof ConstraintHelper) {
            constraintLayout = this;
            ((ConstraintHelper) child).l(eVar9, constraintLayout.mLayoutWidget.f7522z0);
        } else {
            constraintLayout = this;
        }
        int i29 = -1;
        if (layoutParams.f15641d0) {
            Q.i iVar = (Q.i) eVar9;
            int i30 = layoutParams.f15660n0;
            int i31 = layoutParams.f15662o0;
            float f13 = layoutParams.f15664p0;
            if (f13 != -1.0f) {
                if (f13 > -1.0f) {
                    iVar.f7562u0 = f13;
                    iVar.f7563v0 = -1;
                    iVar.f7564w0 = -1;
                    return;
                }
                return;
            }
            if (i30 != -1) {
                if (i30 > -1) {
                    iVar.f7562u0 = -1.0f;
                    iVar.f7563v0 = i30;
                    iVar.f7564w0 = -1;
                    return;
                }
                return;
            }
            if (i31 == -1 || i31 <= -1) {
                return;
            }
            iVar.f7562u0 = -1.0f;
            iVar.f7563v0 = -1;
            iVar.f7564w0 = i31;
            return;
        }
        int i32 = layoutParams.f15647g0;
        int i33 = layoutParams.f15649h0;
        int i34 = layoutParams.i0;
        int i35 = layoutParams.f15652j0;
        int i36 = layoutParams.f15654k0;
        int i37 = layoutParams.f15656l0;
        float f14 = layoutParams.f15658m0;
        int i38 = layoutParams.f15663p;
        if (i38 != -1) {
            Q.e eVar10 = idToWidget.get(i38);
            if (eVar10 != null) {
                float f15 = layoutParams.f15667r;
                f12 = 0.0f;
                widget.w(7, eVar10, 7, layoutParams.f15665q, 0);
                eVar9 = widget;
                eVar9.f7436D = f15;
            } else {
                f12 = 0.0f;
            }
            eVar5 = eVar9;
            layoutParams2 = layoutParams;
            f10 = f12;
            i12 = 2;
            i26 = 5;
            i20 = 3;
            i13 = 4;
        } else {
            if (i32 != -1) {
                Q.e eVar11 = idToWidget.get(i32);
                if (eVar11 != null) {
                    f10 = 0.0f;
                    i7 = 2;
                    eVar9.w(2, eVar11, 2, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i36);
                } else {
                    f10 = 0.0f;
                    i7 = 2;
                }
            } else {
                f10 = 0.0f;
                i7 = 2;
                if (i33 != -1 && (eVar = idToWidget.get(i33)) != null) {
                    widget.w(2, eVar, 4, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i36);
                    i10 = 2;
                    i11 = 4;
                }
                if (i34 != -1) {
                    eVar8 = idToWidget.get(i34);
                    if (eVar8 != null) {
                        widget.w(i11, eVar8, i10, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i37);
                    }
                    i12 = i10;
                } else {
                    i12 = i10;
                    if (i35 != -1 && (eVar2 = idToWidget.get(i35)) != null) {
                        widget.w(i11, eVar2, i11, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i37);
                    }
                }
                i13 = i11;
                i14 = layoutParams.f15650i;
                if (i14 != -1) {
                    eVar7 = idToWidget.get(i14);
                    if (eVar7 != null) {
                        i15 = 3;
                        widget.w(3, eVar7, 3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f15672x);
                    } else {
                        i15 = 3;
                    }
                } else {
                    i15 = 3;
                    i16 = layoutParams.f15651j;
                    if (i16 == -1 && (eVar3 = idToWidget.get(i16)) != null) {
                        widget.w(3, eVar3, 5, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f15672x);
                        i17 = 3;
                        i18 = 5;
                    }
                    i19 = layoutParams.f15653k;
                    if (i19 != -1) {
                        eVar6 = idToWidget.get(i19);
                        if (eVar6 != null) {
                            widget.w(i18, eVar6, i17, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f15674z);
                        }
                        i20 = i17;
                    } else {
                        i20 = i17;
                        i21 = layoutParams.f15655l;
                        if (i21 != -1 && (eVar4 = idToWidget.get(i21)) != null) {
                            widget.w(i18, eVar4, i18, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f15674z);
                        }
                    }
                    i22 = i18;
                    i23 = layoutParams.f15657m;
                    if (i23 != -1) {
                        layoutParams2 = layoutParams;
                        constraintLayout.b(widget, layoutParams2, idToWidget, i23, 6);
                    } else {
                        layoutParams2 = layoutParams;
                        i24 = layoutParams2.f15659n;
                        if (i24 != -1) {
                            b(widget, layoutParams2, idToWidget, i24, i20);
                        } else {
                            i25 = layoutParams2.f15661o;
                            if (i25 != -1) {
                                b(widget, layoutParams2, idToWidget, i25, i22);
                                eVar5 = widget;
                                i26 = i22;
                            }
                            if (f14 >= f10) {
                                eVar5.f7468f0 = f14;
                            }
                            f11 = layoutParams2.f15615F;
                            if (f11 >= f10) {
                                eVar5.f7470g0 = f11;
                            }
                        }
                    }
                    eVar5 = widget;
                    i26 = i22;
                    if (f14 >= f10) {
                        eVar5.f7468f0 = f14;
                    }
                    f11 = layoutParams2.f15615F;
                    if (f11 >= f10) {
                        eVar5.f7470g0 = f11;
                    }
                }
                i17 = i15;
                i18 = 5;
                i19 = layoutParams.f15653k;
                if (i19 != -1) {
                    eVar6 = idToWidget.get(i19);
                    if (eVar6 != null) {
                        widget.w(i18, eVar6, i17, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f15674z);
                    }
                    i20 = i17;
                } else {
                    i20 = i17;
                    i21 = layoutParams.f15655l;
                    if (i21 != -1) {
                        widget.w(i18, eVar4, i18, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f15674z);
                    }
                }
                i22 = i18;
                i23 = layoutParams.f15657m;
                if (i23 != -1) {
                    layoutParams2 = layoutParams;
                    constraintLayout.b(widget, layoutParams2, idToWidget, i23, 6);
                } else {
                    layoutParams2 = layoutParams;
                    i24 = layoutParams2.f15659n;
                    if (i24 != -1) {
                        b(widget, layoutParams2, idToWidget, i24, i20);
                    } else {
                        i25 = layoutParams2.f15661o;
                        if (i25 != -1) {
                            b(widget, layoutParams2, idToWidget, i25, i22);
                            eVar5 = widget;
                            i26 = i22;
                        }
                        if (f14 >= f10) {
                            eVar5.f7468f0 = f14;
                        }
                        f11 = layoutParams2.f15615F;
                        if (f11 >= f10) {
                            eVar5.f7470g0 = f11;
                        }
                    }
                }
                eVar5 = widget;
                i26 = i22;
                if (f14 >= f10) {
                    eVar5.f7468f0 = f14;
                }
                f11 = layoutParams2.f15615F;
                if (f11 >= f10) {
                    eVar5.f7470g0 = f11;
                }
            }
            i10 = i7;
            i11 = 4;
            if (i34 != -1) {
                eVar8 = idToWidget.get(i34);
                if (eVar8 != null) {
                    widget.w(i11, eVar8, i10, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i37);
                }
                i12 = i10;
            } else {
                i12 = i10;
                if (i35 != -1) {
                    widget.w(i11, eVar2, i11, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i37);
                }
            }
            i13 = i11;
            i14 = layoutParams.f15650i;
            if (i14 != -1) {
                eVar7 = idToWidget.get(i14);
                if (eVar7 != null) {
                    i15 = 3;
                    widget.w(3, eVar7, 3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f15672x);
                } else {
                    i15 = 3;
                }
            } else {
                i15 = 3;
                i16 = layoutParams.f15651j;
                if (i16 == -1) {
                }
                i19 = layoutParams.f15653k;
                if (i19 != -1) {
                    eVar6 = idToWidget.get(i19);
                    if (eVar6 != null) {
                        widget.w(i18, eVar6, i17, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f15674z);
                    }
                    i20 = i17;
                } else {
                    i20 = i17;
                    i21 = layoutParams.f15655l;
                    if (i21 != -1) {
                        widget.w(i18, eVar4, i18, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f15674z);
                    }
                }
                i22 = i18;
                i23 = layoutParams.f15657m;
                if (i23 != -1) {
                    layoutParams2 = layoutParams;
                    constraintLayout.b(widget, layoutParams2, idToWidget, i23, 6);
                } else {
                    layoutParams2 = layoutParams;
                    i24 = layoutParams2.f15659n;
                    if (i24 != -1) {
                        b(widget, layoutParams2, idToWidget, i24, i20);
                    } else {
                        i25 = layoutParams2.f15661o;
                        if (i25 != -1) {
                            b(widget, layoutParams2, idToWidget, i25, i22);
                            eVar5 = widget;
                            i26 = i22;
                        }
                        if (f14 >= f10) {
                            eVar5.f7468f0 = f14;
                        }
                        f11 = layoutParams2.f15615F;
                        if (f11 >= f10) {
                            eVar5.f7470g0 = f11;
                        }
                    }
                }
                eVar5 = widget;
                i26 = i22;
                if (f14 >= f10) {
                    eVar5.f7468f0 = f14;
                }
                f11 = layoutParams2.f15615F;
                if (f11 >= f10) {
                    eVar5.f7470g0 = f11;
                }
            }
            i17 = i15;
            i18 = 5;
            i19 = layoutParams.f15653k;
            if (i19 != -1) {
                eVar6 = idToWidget.get(i19);
                if (eVar6 != null) {
                    widget.w(i18, eVar6, i17, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f15674z);
                }
                i20 = i17;
            } else {
                i20 = i17;
                i21 = layoutParams.f15655l;
                if (i21 != -1) {
                    widget.w(i18, eVar4, i18, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f15674z);
                }
            }
            i22 = i18;
            i23 = layoutParams.f15657m;
            if (i23 != -1) {
                layoutParams2 = layoutParams;
                constraintLayout.b(widget, layoutParams2, idToWidget, i23, 6);
            } else {
                layoutParams2 = layoutParams;
                i24 = layoutParams2.f15659n;
                if (i24 != -1) {
                    b(widget, layoutParams2, idToWidget, i24, i20);
                } else {
                    i25 = layoutParams2.f15661o;
                    if (i25 != -1) {
                        b(widget, layoutParams2, idToWidget, i25, i22);
                        eVar5 = widget;
                        i26 = i22;
                    }
                    if (f14 >= f10) {
                        eVar5.f7468f0 = f14;
                    }
                    f11 = layoutParams2.f15615F;
                    if (f11 >= f10) {
                        eVar5.f7470g0 = f11;
                    }
                }
            }
            eVar5 = widget;
            i26 = i22;
            if (f14 >= f10) {
                eVar5.f7468f0 = f14;
            }
            f11 = layoutParams2.f15615F;
            if (f11 >= f10) {
                eVar5.f7470g0 = f11;
            }
        }
        if (isInEditMode && ((i28 = layoutParams2.f15629T) != -1 || layoutParams2.f15630U != -1)) {
            int i39 = layoutParams2.f15630U;
            eVar5.f7460a0 = i28;
            eVar5.b0 = i39;
        }
        boolean z3 = layoutParams2.f15637a0;
        Q.d dVar = Q.d.f7429b;
        Q.d dVar2 = Q.d.f7428a;
        Q.d dVar3 = Q.d.f7431d;
        Q.d dVar4 = Q.d.f7430c;
        if (z3) {
            eVar5.N(dVar2);
            eVar5.P(((ViewGroup.MarginLayoutParams) layoutParams2).width);
            if (((ViewGroup.MarginLayoutParams) layoutParams2).width == -2) {
                eVar5.N(dVar);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams2).width == -1) {
            if (layoutParams2.f15632W) {
                eVar5.N(dVar4);
            } else {
                eVar5.N(dVar3);
            }
            eVar5.j(i12).f7425g = ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
            eVar5.j(i13).f7425g = ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
        } else {
            eVar5.N(dVar4);
            eVar5.P(0);
        }
        if (layoutParams2.b0) {
            eVar5.O(dVar2);
            eVar5.M(((ViewGroup.MarginLayoutParams) layoutParams2).height);
            if (((ViewGroup.MarginLayoutParams) layoutParams2).height == -2) {
                eVar5.O(dVar);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams2).height == -1) {
            if (layoutParams2.f15633X) {
                eVar5.O(dVar4);
            } else {
                eVar5.O(dVar3);
            }
            eVar5.j(i20).f7425g = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
            eVar5.j(i26).f7425g = ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        } else {
            eVar5.O(dVar4);
            eVar5.M(0);
        }
        String str = layoutParams2.f15616G;
        if (str == null || str.length() == 0) {
            eVar5.f7457Y = f10;
        } else {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                i27 = 0;
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i29 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i29 = 1;
                }
                i27 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i27);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    } else {
                        fAbs = f10;
                    }
                } else {
                    String strSubstring3 = str.substring(i27, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                        fAbs = f10;
                    } else {
                        float f16 = Float.parseFloat(strSubstring3);
                        float f17 = Float.parseFloat(strSubstring4);
                        if (f16 <= f10 || f17 <= f10) {
                            fAbs = f10;
                        } else {
                            fAbs = i29 == 1 ? Math.abs(f17 / f16) : Math.abs(f16 / f17);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
            if (fAbs > f10) {
                eVar5.f7457Y = fAbs;
                eVar5.f7458Z = i29;
            }
        }
        float f18 = layoutParams2.f15617H;
        float[] fArr = eVar5.f7483n0;
        fArr[0] = f18;
        fArr[1] = layoutParams2.f15618I;
        eVar5.f7479l0 = layoutParams2.f15619J;
        eVar5.f7481m0 = layoutParams2.f15620K;
        int i40 = layoutParams2.f15635Z;
        if (i40 >= 0 && i40 <= 3) {
            eVar5.f7488q = i40;
        }
        int i41 = layoutParams2.f15621L;
        int i42 = layoutParams2.f15623N;
        int i43 = layoutParams2.f15625P;
        float f19 = layoutParams2.f15627R;
        eVar5.f7490r = i41;
        eVar5.f7495u = i42;
        if (i43 == Integer.MAX_VALUE) {
            i43 = 0;
        }
        eVar5.f7496v = i43;
        eVar5.f7497w = f19;
        if (f19 > f10 && f19 < 1.0f && i41 == 0) {
            eVar5.f7490r = 2;
        }
        int i44 = layoutParams2.f15622M;
        int i45 = layoutParams2.f15624O;
        int i46 = layoutParams2.f15626Q;
        float f20 = layoutParams2.f15628S;
        eVar5.f7492s = i44;
        eVar5.f7498x = i45;
        eVar5.f7499y = i46 != Integer.MAX_VALUE ? i46 : 0;
        eVar5.f7500z = f20;
        if (f20 <= f10 || f20 >= 1.0f || i44 != 0) {
            return;
        }
        eVar5.f7492s = 2;
    }

    public final void b(Q.e eVar, LayoutParams layoutParams, SparseArray sparseArray, int i7, int i10) {
        View view = this.mChildrenByIds.get(i7);
        Q.e eVar2 = (Q.e) sparseArray.get(i7);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof LayoutParams)) {
            return;
        }
        layoutParams.c0 = true;
        if (i10 == 6) {
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.c0 = true;
            layoutParams2.f15666q0.f7437E = true;
        }
        eVar.j(6).b(eVar2.j(i10), layoutParams.f15613D, layoutParams.f15612C, true);
        eVar.f7437E = true;
        eVar.j(3).j();
        eVar.j(5).j();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams p3) {
        return p3 instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.mConstraintHelpers.get(i7).n(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i11 = Integer.parseInt(strArrSplit[0]);
                        int i12 = Integer.parseInt(strArrSplit[1]);
                        int i13 = Integer.parseInt(strArrSplit[2]);
                        int i14 = (int) ((i11 / 1080.0f) * width);
                        int i15 = (int) ((i12 / 1920.0f) * height);
                        int i16 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i14;
                        float f11 = i15;
                        float f12 = i14 + ((int) ((i13 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i15 + i16;
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(androidx.constraintlayout.core.d metrics) {
        this.mLayoutWidget.f7501A0.getClass();
    }

    @Override // android.view.View
    public void forceLayout() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        super.forceLayout();
    }

    public Object getDesignInformation(int type, Object value) {
        if (type != 0 || !(value instanceof String)) {
            return null;
        }
        String str = (String) value;
        HashMap<String, Integer> map = this.mDesignIds;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.f7508H0;
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.mLayoutWidget.f7474j == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.mLayoutWidget.f7474j = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.mLayoutWidget.f7474j = "parent";
            }
        }
        Q.f fVar = this.mLayoutWidget;
        if (fVar.f7477k0 == null) {
            fVar.f7477k0 = fVar.f7474j;
        }
        for (Q.e eVar : fVar.f7517u0) {
            View view = eVar.f7472h0;
            if (view != null) {
                if (eVar.f7474j == null && (id2 = view.getId()) != -1) {
                    eVar.f7474j = getContext().getResources().getResourceEntryName(id2);
                }
                if (eVar.f7477k0 == null) {
                    eVar.f7477k0 = eVar.f7474j;
                }
            }
        }
        this.mLayoutWidget.o(sb2);
        return sb2.toString();
    }

    public View getViewById(int id2) {
        return this.mChildrenByIds.get(id2);
    }

    public final Q.e getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).f15666q0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).f15666q0;
        }
        return null;
    }

    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int layoutDescription) {
        if (layoutDescription == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new f(getContext(), this, layoutDescription);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top2, int right, int bottom) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            Q.e eVar = layoutParams.f15666q0;
            if ((childAt.getVisibility() != 8 || layoutParams.f15641d0 || layoutParams.f15643e0 || zIsInEditMode) && !layoutParams.f15645f0) {
                int iS = eVar.s();
                int iT = eVar.t();
                int iR = eVar.r() + iS;
                int iL = eVar.l() + iT;
                childAt.layout(iS, iT, iR, iL);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iS, iT, iR, iL);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.mConstraintHelpers.get(i10).m();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        boolean z3;
        Q.e eVar;
        if (this.mOnMeasureWidthMeasureSpec == widthMeasureSpec) {
            int i7 = this.mOnMeasureHeightMeasureSpec;
        }
        int i10 = 0;
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (getChildAt(i11).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
            }
        }
        this.mOnMeasureWidthMeasureSpec = widthMeasureSpec;
        this.mOnMeasureHeightMeasureSpec = heightMeasureSpec;
        this.mLayoutWidget.f7522z0 = isRtl();
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            int childCount2 = getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount2) {
                    z3 = false;
                    break;
                } else {
                    if (getChildAt(i12).isLayoutRequested()) {
                        z3 = true;
                        break;
                    }
                    i12++;
                }
            }
            if (z3) {
                boolean zIsInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i13 = 0; i13 < childCount3; i13++) {
                    Q.e viewWidget = getViewWidget(getChildAt(i13));
                    if (viewWidget != null) {
                        viewWidget.D();
                    }
                }
                if (zIsInEditMode) {
                    for (int i14 = 0; i14 < childCount3; i14++) {
                        View childAt = getChildAt(i14);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                            int iIndexOf = resourceName.indexOf(47);
                            if (iIndexOf != -1) {
                                resourceName = resourceName.substring(iIndexOf + 1);
                            }
                            int id2 = childAt.getId();
                            if (id2 == 0) {
                                eVar = this.mLayoutWidget;
                            } else {
                                View viewFindViewById = this.mChildrenByIds.get(id2);
                                if (viewFindViewById == null && (viewFindViewById = findViewById(id2)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
                                    onViewAdded(viewFindViewById);
                                }
                                eVar = viewFindViewById == this ? this.mLayoutWidget : viewFindViewById == null ? null : ((LayoutParams) viewFindViewById.getLayoutParams()).f15666q0;
                            }
                            eVar.f7477k0 = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (this.mConstraintSetId != -1) {
                    for (int i15 = 0; i15 < childCount3; i15++) {
                        View childAt2 = getChildAt(i15);
                        if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof Constraints)) {
                            this.mConstraintSet = ((Constraints) childAt2).getConstraintSet();
                        }
                    }
                }
                m mVar = this.mConstraintSet;
                if (mVar != null) {
                    mVar.c(this);
                }
                this.mLayoutWidget.f7517u0.clear();
                int size = this.mConstraintHelpers.size();
                if (size > 0) {
                    int i16 = 0;
                    while (i16 < size) {
                        ConstraintHelper constraintHelper = this.mConstraintHelpers.get(i16);
                        if (constraintHelper.isInEditMode()) {
                            constraintHelper.setIds(constraintHelper.f15606e);
                        }
                        Q.j jVar = constraintHelper.f15605d;
                        if (jVar != null) {
                            jVar.removeAllIds();
                            for (int i17 = i10; i17 < constraintHelper.f15603b; i17++) {
                                int i18 = constraintHelper.f15602a[i17];
                                View viewById = getViewById(i18);
                                if (viewById == null) {
                                    Integer numValueOf = Integer.valueOf(i18);
                                    HashMap map = constraintHelper.f15609i;
                                    String str = (String) map.get(numValueOf);
                                    int iG = constraintHelper.g(this, str);
                                    if (iG != 0) {
                                        constraintHelper.f15602a[i17] = iG;
                                        map.put(Integer.valueOf(iG), str);
                                        viewById = getViewById(iG);
                                    }
                                }
                                if (viewById != null) {
                                    constraintHelper.f15605d.add(getViewWidget(viewById));
                                }
                            }
                            constraintHelper.f15605d.updateConstraints(this.mLayoutWidget);
                        }
                        i16++;
                        i10 = 0;
                    }
                }
                for (int i19 = 0; i19 < childCount3; i19++) {
                    View childAt3 = getChildAt(i19);
                    if (childAt3 instanceof Placeholder) {
                        Placeholder placeholder = (Placeholder) childAt3;
                        if (placeholder.f15690a == -1 && !placeholder.isInEditMode()) {
                            placeholder.setVisibility(placeholder.f15692c);
                        }
                        View viewFindViewById2 = findViewById(placeholder.f15690a);
                        placeholder.f15691b = viewFindViewById2;
                        if (viewFindViewById2 != null) {
                            ((LayoutParams) viewFindViewById2.getLayoutParams()).f15645f0 = true;
                            placeholder.f15691b.setVisibility(0);
                            placeholder.setVisibility(0);
                        }
                    }
                }
                this.mTempMapIdToWidget.clear();
                this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
                this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
                for (int i20 = 0; i20 < childCount3; i20++) {
                    View childAt4 = getChildAt(i20);
                    this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
                }
                for (int i21 = 0; i21 < childCount3; i21++) {
                    View childAt5 = getChildAt(i21);
                    Q.e viewWidget2 = getViewWidget(childAt5);
                    if (viewWidget2 != null) {
                        LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                        Q.f fVar = this.mLayoutWidget;
                        fVar.f7517u0.add(viewWidget2);
                        Q.e eVar2 = viewWidget2.f7454V;
                        if (eVar2 != null) {
                            ((Q.f) eVar2).f7517u0.remove(viewWidget2);
                            viewWidget2.D();
                        }
                        viewWidget2.f7454V = fVar;
                        applyConstraintsFromLayoutParams(zIsInEditMode, childAt5, viewWidget2, layoutParams, this.mTempMapIdToWidget);
                    }
                }
            }
            if (z3) {
                Q.f fVar2 = this.mLayoutWidget;
                fVar2.f7518v0.t(fVar2);
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, widthMeasureSpec, heightMeasureSpec);
        int iR = this.mLayoutWidget.r();
        int iL = this.mLayoutWidget.l();
        Q.f fVar3 = this.mLayoutWidget;
        resolveMeasuredDimension(widthMeasureSpec, heightMeasureSpec, iR, iL, fVar3.f7509I0, fVar3.f7510J0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        Q.e viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof Q.i)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Q.i iVar = new Q.i();
            layoutParams.f15666q0 = iVar;
            layoutParams.f15641d0 = true;
            iVar.T(layoutParams.f15631V);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.p();
            ((LayoutParams) view.getLayoutParams()).f15643e0 = true;
            if (!this.mConstraintHelpers.contains(constraintHelper)) {
                this.mConstraintHelpers.add(constraintHelper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        Q.e viewWidget = getViewWidget(view);
        this.mLayoutWidget.f7517u0.remove(viewWidget);
        viewWidget.D();
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int id2) {
        this.mConstraintLayoutSpec = new f(getContext(), this, id2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int widthMeasureSpec, int heightMeasureSpec, int measuredWidth, int measuredHeight, boolean isWidthMeasuredTooSmall, boolean isHeightMeasuredTooSmall) {
        c cVar = this.mMeasurer;
        int i7 = cVar.f15712e;
        int iResolveSizeAndState = View.resolveSizeAndState(measuredWidth + cVar.f15711d, widthMeasureSpec, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(measuredHeight + i7, heightMeasureSpec, 0);
        int i10 = iResolveSizeAndState & FlexItem.MAX_SIZE;
        int i11 = iResolveSizeAndState2 & FlexItem.MAX_SIZE;
        int iMin = Math.min(this.mMaxWidth, i10);
        int iMin2 = Math.min(this.mMaxHeight, i11);
        if (isWidthMeasuredTooSmall) {
            iMin |= PointerEventHelper.X_FLAG_SUPPORTS_HOVER;
        }
        if (isHeightMeasuredTooSmall) {
            iMin2 |= PointerEventHelper.X_FLAG_SUPPORTS_HOVER;
        }
        setMeasuredDimension(iMin, iMin2);
        this.mLastMeasureWidth = iMin;
        this.mLastMeasureHeight = iMin2;
    }

    /* JADX WARN: Code duplicated, block: B:151:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:153:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:156:0x0305 A[LOOP:9: B:154:0x02ff->B:156:0x0305, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:158:0x0348  */
    /* JADX WARN: Code duplicated, block: B:161:0x0364  */
    /* JADX WARN: Code duplicated, block: B:162:0x036a  */
    /* JADX WARN: Code duplicated, block: B:164:0x036e  */
    /* JADX WARN: Code duplicated, block: B:166:0x0378 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:167:0x037a  */
    /* JADX WARN: Code duplicated, block: B:168:0x037c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0098  */
    /* JADX WARN: Code duplicated, block: B:170:0x037f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0381  */
    /* JADX WARN: Code duplicated, block: B:173:0x0386  */
    /* JADX WARN: Code duplicated, block: B:181:0x0399  */
    /* JADX WARN: Code duplicated, block: B:183:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:19:0x009f  */
    /* JADX WARN: Code duplicated, block: B:210:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:237:0x042c  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:242:0x0445  */
    /* JADX WARN: Code duplicated, block: B:244:0x044a  */
    /* JADX WARN: Code duplicated, block: B:246:0x0450  */
    /* JADX WARN: Code duplicated, block: B:248:0x0453  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:251:0x0459  */
    /* JADX WARN: Code duplicated, block: B:252:0x045b  */
    /* JADX WARN: Code duplicated, block: B:255:0x047a  */
    /* JADX WARN: Code duplicated, block: B:257:0x0486  */
    /* JADX WARN: Code duplicated, block: B:258:0x048e  */
    /* JADX WARN: Code duplicated, block: B:260:0x04af  */
    /* JADX WARN: Code duplicated, block: B:267:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:278:0x0513  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:280:0x0517  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:292:0x0537 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:300:0x054e A[PHI: r20
      0x054e: PHI (r20v5 java.util.ArrayList) = (r20v3 java.util.ArrayList), (r20v3 java.util.ArrayList), (r20v3 java.util.ArrayList), (r20v6 java.util.ArrayList) binds: [B:290:0x0534, B:299:0x054c, B:296:0x0547, B:285:0x0526] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:303:0x056a  */
    /* JADX WARN: Code duplicated, block: B:306:0x057c  */
    /* JADX WARN: Code duplicated, block: B:308:0x0581  */
    /* JADX WARN: Code duplicated, block: B:311:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:313:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:315:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:317:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:320:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:322:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:325:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:331:0x05ef A[LOOP:5: B:276:0x0510->B:331:0x05ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:334:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:365:0x0430 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:370:0x05fc A[EDGE_INSN: B:370:0x05fc->B:332:0x05fc BREAK  A[LOOP:5: B:276:0x0510->B:331:0x05ef], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:374:0x05d7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0100 A[PHI: r6 r7
      0x0100: PHI (r6v3 int) = (r6v2 int), (r6v31 int) binds: [B:18:0x009d, B:334:0x0100] A[DONT_GENERATE, DONT_INLINE]
      0x0100: PHI (r7v1 int) = (r7v0 int), (r7v43 int) binds: [B:18:0x009d, B:334:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x011a  */
    /* JADX WARN: Code duplicated, block: B:66:0x013c  */
    /* JADX WARN: Multi-variable type inference failed */
    public void resolveSystem(Q.f fVar, int i7, int i10, int i11) {
        int i12;
        int i13;
        top.zibin.luban.io.a aVar;
        BasicMeasure$Measurer basicMeasure$Measurer;
        int size;
        int iR;
        int iL;
        boolean zC;
        int i14;
        Q.d dVar;
        int i15;
        int i16;
        int i17;
        int i18;
        Q.d dVar2;
        int i19;
        BasicMeasure$Measurer basicMeasure$Measurer2;
        int i20;
        boolean zU;
        int i21;
        ArrayList arrayList;
        int size2;
        Q.d[] dVarArr;
        boolean z3;
        boolean z8;
        int iMax;
        int iMax2;
        int i22;
        boolean z10;
        boolean z11;
        BasicMeasure$Measurer basicMeasure$Measurer3;
        int i23;
        boolean z12;
        int i24;
        ArrayList arrayList2;
        int i25;
        int i26;
        Q.e eVar;
        ArrayList arrayList3;
        int iR2;
        int iL2;
        int i27;
        int i28;
        boolean zM;
        int iR3;
        int i29;
        int iL3;
        Q.e eVar2;
        int iR4;
        int iL4;
        boolean z13;
        BasicMeasure$Measurer basicMeasure$Measurer4;
        int iR5;
        boolean z14;
        int iL5;
        int size3;
        BasicMeasure$Measurer basicMeasure$Measurer5;
        int i30;
        Q.e eVar3;
        Q.d dVarK;
        Q.d dVarK2;
        boolean z15;
        R.j jVar;
        R.l lVar;
        int iMin;
        boolean z16;
        R.d dVar3;
        boolean z17;
        Q.f fVar2;
        int i31;
        int i32;
        boolean z18;
        boolean z19;
        int i33;
        boolean z20;
        boolean z21;
        boolean z22;
        int i34;
        Q.e eVar4;
        Q.d[] dVarArr2;
        int i35;
        int i36;
        int i37;
        int i38;
        int mode = View.MeasureSpec.getMode(i10);
        int size4 = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size5 = View.MeasureSpec.getSize(i11);
        int i39 = 0;
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i40 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        c cVar = this.mMeasurer;
        cVar.f15709b = iMax3;
        cVar.f15710c = iMax4;
        cVar.f15711d = paddingWidth;
        cVar.f15712e = i40;
        cVar.f15713f = i10;
        cVar.f15714g = i11;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        if (iMax5 > 0 || iMax6 > 0) {
            if (!isRtl()) {
            }
            i12 = size4 - paddingWidth;
            i13 = size5 - i40;
            setSelfDimensionBehaviour(fVar, mode, i12, mode2, i13);
            fVar.f7502B0 = iMax6;
            fVar.f7503C0 = iMax3;
            aVar = fVar.f7518v0;
            aVar.getClass();
            basicMeasure$Measurer = fVar.f7521y0;
            size = fVar.f7517u0.size();
            iR = fVar.r();
            iL = fVar.l();
            zC = Q.k.c(i7, 128);
            if (!zC || Q.k.c(i7, 64)) {
                i14 = 1;
            } else {
                i14 = 0;
            }
            dVar = Q.d.f7430c;
            if (i14 != 0) {
                i34 = 0;
                while (true) {
                    if (i34 < size) {
                        i15 = i39;
                        eVar4 = (Q.e) fVar.f7517u0.get(i34);
                        i16 = 1;
                        dVarArr2 = eVar4.f7453U;
                        i35 = i14;
                        if (dVarArr2[i15] == dVar) {
                            i36 = 1;
                        } else {
                            i36 = i15;
                        }
                        if (dVarArr2[1] == dVar) {
                            i37 = 1;
                        } else {
                            i37 = i15;
                        }
                        if (i36 != 0 || i37 == 0 || eVar4.f7457Y <= 0.0f) {
                            i38 = i15;
                        } else {
                            i38 = 1;
                        }
                        if ((eVar4.y() || i38 == 0) && !((eVar4.z() && i38 != 0) || (eVar4 instanceof Q.m) || eVar4.y() || eVar4.z())) {
                            i34++;
                            i14 = i35;
                            i39 = i15;
                        } else {
                            i17 = i15;
                        }
                    } else {
                        i15 = i39;
                        i16 = 1;
                        i17 = i14;
                    }
                }
            } else {
                i15 = i39;
                i16 = 1;
                i17 = i14;
            }
            i18 = i17 & (((mode == 1073741824 || mode2 != 1073741824) && !zC) ? i15 : i16);
            dVar2 = Q.d.f7429b;
            if (i18 != 0) {
                int iMin2 = Math.min(fVar.f7435C[i15], i12);
                iMin = Math.min(fVar.f7435C[i16], i13);
                if (mode == 1073741824 || fVar.r() == iMin2) {
                    z16 = i16;
                } else {
                    fVar.P(iMin2);
                    z22 = i16;
                    fVar.f7519w0.f7865b = z22;
                }
                if (mode2 == 1073741824 && fVar.l() != iMin) {
                    z16 = z22;
                    fVar.M(iMin);
                    fVar.f7519w0.f7865b = z16;
                }
                z16 = z22;
                z16 = z22;
                dVar3 = fVar.f7519w0;
                if (mode == 1073741824 || mode2 != 1073741824) {
                    i19 = i18;
                    basicMeasure$Measurer2 = basicMeasure$Measurer;
                    i20 = size;
                    z17 = dVar3.f7865b;
                    fVar2 = dVar3.f7864a;
                    if (z17) {
                        for (Q.e eVar5 : fVar2.f7517u0) {
                            eVar5.i();
                            eVar5.f7459a = false;
                            R.j jVar2 = eVar5.f7463d;
                            jVar2.f7901e.f7881j = false;
                            jVar2.f7903g = false;
                            jVar2.m();
                            R.l lVar2 = eVar5.f7465e;
                            lVar2.f7901e.f7881j = false;
                            lVar2.f7903g = false;
                            lVar2.l();
                        }
                        i31 = 0;
                        fVar2.i();
                        fVar2.f7459a = false;
                        R.j jVar3 = fVar2.f7463d;
                        jVar3.f7901e.f7881j = false;
                        jVar3.f7903g = false;
                        jVar3.m();
                        R.l lVar3 = fVar2.f7465e;
                        lVar3.f7901e.f7881j = false;
                        lVar3.f7903g = false;
                        lVar3.l();
                        dVar3.c();
                    } else {
                        i31 = 0;
                    }
                    dVar3.b(dVar3.f7867d);
                    fVar2.f7460a0 = i31;
                    fVar2.b0 = i31;
                    fVar2.f7463d.f7904h.c(i31);
                    fVar2.f7465e.f7904h.c(i31);
                    i32 = 1073741824;
                    if (mode == 1073741824) {
                        zU = fVar.U(i31, zC);
                        i21 = 1;
                    } else {
                        zU = true;
                        i21 = 0;
                    }
                    if (mode2 == 1073741824) {
                        zU &= fVar.U(1, zC);
                        i21++;
                    }
                } else {
                    boolean z23 = dVar3.f7865b;
                    Q.f fVar3 = dVar3.f7864a;
                    if (z23 || dVar3.f7866c) {
                        Iterator it = fVar3.f7517u0.iterator();
                        while (it.hasNext()) {
                            Q.e eVar6 = (Q.e) it.next();
                            eVar6.i();
                            eVar6.f7459a = i15;
                            eVar6.f7463d.m();
                            eVar6.f7465e.l();
                            it = it;
                            i15 = 0;
                        }
                        fVar3.i();
                        i33 = 0;
                        fVar3.f7459a = false;
                        fVar3.f7463d.m();
                        fVar3.f7465e.l();
                        dVar3.f7866c = false;
                    } else {
                        i33 = i15;
                    }
                    dVar3.b(dVar3.f7867d);
                    fVar3.f7460a0 = i33;
                    fVar3.b0 = i33;
                    Q.d dVarK3 = fVar3.k(i33);
                    i19 = i18;
                    Q.d dVarK4 = fVar3.k(1);
                    if (dVar3.f7865b) {
                        dVar3.c();
                    }
                    int iS = fVar3.s();
                    i20 = size;
                    int iT = fVar3.t();
                    basicMeasure$Measurer2 = basicMeasure$Measurer;
                    fVar3.f7463d.f7904h.c(iS);
                    fVar3.f7465e.f7904h.c(iT);
                    dVar3.g();
                    Q.d dVar4 = Q.d.f7428a;
                    ArrayList<R.n> arrayList4 = dVar3.f7868e;
                    if (dVarK3 == dVar2 || dVarK4 == dVar2) {
                        if (zC) {
                            Iterator it2 = arrayList4.iterator();
                            while (it2.hasNext()) {
                                if (!((R.n) it2.next()).j()) {
                                    zC = false;
                                    break;
                                }
                            }
                        }
                        if (zC && dVarK3 == dVar2) {
                            fVar3.N(dVar4);
                            fVar3.P(dVar3.d(fVar3, 0));
                            fVar3.f7463d.f7901e.c(fVar3.r());
                        }
                        if (zC && dVarK4 == dVar2) {
                            fVar3.O(dVar4);
                            fVar3.M(dVar3.d(fVar3, 1));
                            fVar3.f7465e.f7901e.c(fVar3.l());
                        }
                    } else {
                        arrayList4 = arrayList4;
                        iT = iT;
                    }
                    Q.d dVar5 = fVar3.f7453U[0];
                    Q.d dVar6 = Q.d.f7431d;
                    if (dVar5 == dVar4 || dVar5 == dVar6) {
                        int iR6 = fVar3.r() + iS;
                        fVar3.f7463d.f7905i.c(iR6);
                        fVar3.f7463d.f7901e.c(iR6 - iS);
                        dVar3.g();
                        Q.d dVar7 = fVar3.f7453U[1];
                        if (dVar7 == dVar4 || dVar7 == dVar6) {
                            int iL6 = fVar3.l() + iT;
                            fVar3.f7465e.f7905i.c(iL6);
                            fVar3.f7465e.f7901e.c(iL6 - iT);
                        }
                        dVar3.g();
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    for (R.n nVar : arrayList4) {
                        if (nVar.f7898b != fVar3 || nVar.f7903g) {
                            nVar.d();
                        }
                    }
                    Iterator it3 = arrayList4.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z21 = true;
                            break;
                        }
                        R.n nVar2 = (R.n) it3.next();
                        if (z20 || nVar2.f7898b != fVar3) {
                            if (!nVar2.f7904h.f7881j || ((!nVar2.f7905i.f7881j && !(nVar2 instanceof R.h)) || (!nVar2.f7901e.f7881j && !(nVar2 instanceof R.c) && !(nVar2 instanceof R.h)))) {
                                z21 = false;
                                break;
                            }
                        }
                    }
                    fVar3.N(dVarK3);
                    fVar3.O(dVarK4);
                    zU = z21;
                    i32 = 1073741824;
                    i21 = 2;
                }
                if (zU) {
                    if (mode == i32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (mode2 == i32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    fVar.Q(z18, z19);
                }
            } else {
                i19 = i18;
                basicMeasure$Measurer2 = basicMeasure$Measurer;
                i20 = size;
                zU = false;
                i21 = 0;
            }
            if (zU || i21 != 2) {
                int i41 = fVar.f7508H0;
                if (i20 > 0) {
                    size3 = fVar.f7517u0.size();
                    boolean zX = fVar.X(64);
                    basicMeasure$Measurer5 = fVar.f7521y0;
                    for (i30 = 0; i30 < size3; i30++) {
                        eVar3 = (Q.e) fVar.f7517u0.get(i30);
                        if (!(eVar3 instanceof Q.i) && !(eVar3 instanceof Q.a) && !eVar3.f7439G && (!zX || (jVar = eVar3.f7463d) == null || (lVar = eVar3.f7465e) == null || !jVar.f7901e.f7881j || !lVar.f7901e.f7881j)) {
                            dVarK = eVar3.k(0);
                            dVarK2 = eVar3.k(1);
                            if (dVarK == dVar || eVar3.f7490r == 1 || dVarK2 != dVar || eVar3.f7492s == 1) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                            if (!z15 && fVar.X(1) && !(eVar3 instanceof Q.m)) {
                                if (dVarK == dVar && eVar3.f7490r == 0 && dVarK2 != dVar && !eVar3.y()) {
                                    z15 = true;
                                }
                                if (dVarK2 == dVar && eVar3.f7492s == 0 && dVarK != dVar && !eVar3.y()) {
                                    z15 = true;
                                }
                                if ((dVarK != dVar || dVarK2 == dVar) && eVar3.f7457Y > 0.0f) {
                                }
                            }
                            if (z15) {
                                aVar.m(0, eVar3, basicMeasure$Measurer5);
                            }
                        }
                    }
                    basicMeasure$Measurer5.didMeasures();
                }
                aVar.t(fVar);
                arrayList = (ArrayList) aVar.f42645b;
                size2 = arrayList.size();
                if (i20 > 0) {
                    aVar.p(fVar, 0, iR, iL);
                }
                if (size2 > 0) {
                    dVarArr = fVar.f7453U;
                    if (dVarArr[0] == dVar2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarArr[1] == dVar2) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    int iR7 = fVar.r();
                    Q.f fVar4 = (Q.f) aVar.f42647d;
                    iMax = Math.max(iR7, fVar4.f7464d0);
                    iMax2 = Math.max(fVar.l(), fVar4.f7466e0);
                    i22 = 0;
                    z10 = false;
                    while (i22 < size2) {
                        eVar2 = (Q.e) arrayList.get(i22);
                        if (eVar2 instanceof Q.m) {
                            iR4 = eVar2.r();
                            iL4 = eVar2.l();
                            z13 = z8;
                            basicMeasure$Measurer4 = basicMeasure$Measurer2;
                            boolean zM2 = z10 | aVar.m(1, eVar2, basicMeasure$Measurer4);
                            iR5 = eVar2.r();
                            z14 = zM2;
                            iL5 = eVar2.l();
                            if (iR5 != iR4) {
                                eVar2.P(iR5);
                                if (z3 && eVar2.s() + eVar2.f7455W > iMax) {
                                    iMax = Math.max(iMax, eVar2.j(4).e() + eVar2.s() + eVar2.f7455W);
                                }
                                z14 = true;
                            }
                            if (iL5 != iL4) {
                                eVar2.M(iL5);
                                if (z13 && eVar2.t() + eVar2.f7456X > iMax2) {
                                    iMax2 = Math.max(iMax2, eVar2.j(5).e() + eVar2.t() + eVar2.f7456X);
                                }
                                z14 = true;
                            }
                            z10 = z14 | ((Q.m) eVar2).f7573C0;
                        } else {
                            z13 = z8;
                            basicMeasure$Measurer4 = basicMeasure$Measurer2;
                        }
                        i22++;
                        basicMeasure$Measurer2 = basicMeasure$Measurer4;
                        z8 = z13;
                    }
                    z11 = z8;
                    basicMeasure$Measurer3 = basicMeasure$Measurer2;
                    i23 = 0;
                    while (i23 < 2) {
                        z12 = z10;
                        i24 = 0;
                        while (i24 < size2) {
                            eVar = (Q.e) arrayList.get(i24);
                            if (((eVar instanceof Helper) || (eVar instanceof Q.m)) && !(eVar instanceof Q.i)) {
                                arrayList3 = arrayList;
                                if (eVar.i0 == 8 && ((i19 == 0 || !eVar.f7463d.f7901e.f7881j || !eVar.f7465e.f7901e.f7881j) && !(eVar instanceof Q.m))) {
                                    iR2 = eVar.r();
                                    iL2 = eVar.l();
                                    i27 = size2;
                                    int i42 = eVar.c0;
                                    i28 = i24;
                                    zM = aVar.m(i23 == 1 ? 2 : 1, eVar, basicMeasure$Measurer3) | z12;
                                    iR3 = eVar.r();
                                    i29 = i23;
                                    iL3 = eVar.l();
                                    if (iR3 != iR2) {
                                        eVar.P(iR3);
                                        if (!z3 && eVar.s() + eVar.f7455W > iMax) {
                                            iMax = Math.max(iMax, eVar.j(4).e() + eVar.s() + eVar.f7455W);
                                        }
                                        zM = true;
                                    }
                                    if (iL3 != iL2) {
                                        eVar.M(iL3);
                                        if (!z11 && eVar.t() + eVar.f7456X > iMax2) {
                                            iMax2 = Math.max(iMax2, eVar.j(5).e() + eVar.t() + eVar.f7456X);
                                        }
                                        zM = true;
                                    }
                                    if (!eVar.f7437E && i42 != eVar.c0) {
                                        zM = true;
                                    }
                                }
                                z12 = zM;
                                size2 = i27;
                                i23 = i29;
                                i24 = i28 + 1;
                                arrayList = arrayList3;
                            } else {
                                arrayList3 = arrayList;
                            }
                            i27 = size2;
                            i29 = i23;
                            i28 = i24;
                            zM = z12;
                            z12 = zM;
                            size2 = i27;
                            i23 = i29;
                            i24 = i28 + 1;
                            arrayList = arrayList3;
                        }
                        arrayList2 = arrayList;
                        i25 = size2;
                        i26 = i23;
                        if (z12) {
                            break;
                        }
                        int i43 = i26 + 1;
                        aVar.p(fVar, i43, iR, iL);
                        i23 = i43;
                        arrayList = arrayList2;
                        size2 = i25;
                        z10 = false;
                    }
                }
                fVar.f7508H0 = i41;
                androidx.constraintlayout.core.c.f15087p = fVar.X(512);
            }
            return;
        }
        iMax5 = Math.max(0, getPaddingLeft());
        iMax6 = iMax5;
        i12 = size4 - paddingWidth;
        i13 = size5 - i40;
        setSelfDimensionBehaviour(fVar, mode, i12, mode2, i13);
        fVar.f7502B0 = iMax6;
        fVar.f7503C0 = iMax3;
        aVar = fVar.f7518v0;
        aVar.getClass();
        basicMeasure$Measurer = fVar.f7521y0;
        size = fVar.f7517u0.size();
        iR = fVar.r();
        iL = fVar.l();
        zC = Q.k.c(i7, 128);
        if (zC) {
            i14 = 1;
        } else {
            i14 = 1;
        }
        dVar = Q.d.f7430c;
        if (i14 != 0) {
            i34 = 0;
            while (true) {
                if (i34 < size) {
                    i15 = i39;
                    eVar4 = (Q.e) fVar.f7517u0.get(i34);
                    i16 = 1;
                    dVarArr2 = eVar4.f7453U;
                    i35 = i14;
                    if (dVarArr2[i15] == dVar) {
                        i36 = 1;
                    } else {
                        i36 = i15;
                    }
                    if (dVarArr2[1] == dVar) {
                        i37 = 1;
                    } else {
                        i37 = i15;
                    }
                    if (i36 != 0) {
                        i38 = i15;
                    } else {
                        i38 = i15;
                    }
                    if (eVar4.y()) {
                        i34++;
                        i14 = i35;
                        i39 = i15;
                    } else {
                        i34++;
                        i14 = i35;
                        i39 = i15;
                    }
                    i17 = i15;
                } else {
                    i15 = i39;
                    i16 = 1;
                    i17 = i14;
                }
            }
        } else {
            i15 = i39;
            i16 = 1;
            i17 = i14;
        }
        i18 = i17 & (((mode == 1073741824 || mode2 != 1073741824) && !zC) ? i15 : i16);
        dVar2 = Q.d.f7429b;
        if (i18 != 0) {
            int iMin3 = Math.min(fVar.f7435C[i15], i12);
            iMin = Math.min(fVar.f7435C[i16], i13);
            if (mode == 1073741824) {
                z16 = i16;
            } else {
                z16 = i16;
            }
            if (mode2 == 1073741824) {
                z16 = z22;
                fVar.M(iMin);
                fVar.f7519w0.f7865b = z16;
            }
            z16 = z22;
            z16 = z22;
            dVar3 = fVar.f7519w0;
            if (mode == 1073741824) {
                i19 = i18;
                basicMeasure$Measurer2 = basicMeasure$Measurer;
                i20 = size;
                z17 = dVar3.f7865b;
                fVar2 = dVar3.f7864a;
                if (z17) {
                    while (r5.hasNext()) {
                        eVar5.i();
                        eVar5.f7459a = false;
                        R.j jVar4 = eVar5.f7463d;
                        jVar4.f7901e.f7881j = false;
                        jVar4.f7903g = false;
                        jVar4.m();
                        R.l lVar4 = eVar5.f7465e;
                        lVar4.f7901e.f7881j = false;
                        lVar4.f7903g = false;
                        lVar4.l();
                    }
                    i31 = 0;
                    fVar2.i();
                    fVar2.f7459a = false;
                    R.j jVar5 = fVar2.f7463d;
                    jVar5.f7901e.f7881j = false;
                    jVar5.f7903g = false;
                    jVar5.m();
                    R.l lVar5 = fVar2.f7465e;
                    lVar5.f7901e.f7881j = false;
                    lVar5.f7903g = false;
                    lVar5.l();
                    dVar3.c();
                } else {
                    i31 = 0;
                }
                dVar3.b(dVar3.f7867d);
                fVar2.f7460a0 = i31;
                fVar2.b0 = i31;
                fVar2.f7463d.f7904h.c(i31);
                fVar2.f7465e.f7904h.c(i31);
                i32 = 1073741824;
                if (mode == 1073741824) {
                    zU = fVar.U(i31, zC);
                    i21 = 1;
                } else {
                    zU = true;
                    i21 = 0;
                }
                if (mode2 == 1073741824) {
                    zU &= fVar.U(1, zC);
                    i21++;
                }
            } else {
                i19 = i18;
                basicMeasure$Measurer2 = basicMeasure$Measurer;
                i20 = size;
                z17 = dVar3.f7865b;
                fVar2 = dVar3.f7864a;
                if (z17) {
                    while (r5.hasNext()) {
                        eVar5.i();
                        eVar5.f7459a = false;
                        R.j jVar6 = eVar5.f7463d;
                        jVar6.f7901e.f7881j = false;
                        jVar6.f7903g = false;
                        jVar6.m();
                        R.l lVar6 = eVar5.f7465e;
                        lVar6.f7901e.f7881j = false;
                        lVar6.f7903g = false;
                        lVar6.l();
                    }
                    i31 = 0;
                    fVar2.i();
                    fVar2.f7459a = false;
                    R.j jVar7 = fVar2.f7463d;
                    jVar7.f7901e.f7881j = false;
                    jVar7.f7903g = false;
                    jVar7.m();
                    R.l lVar7 = fVar2.f7465e;
                    lVar7.f7901e.f7881j = false;
                    lVar7.f7903g = false;
                    lVar7.l();
                    dVar3.c();
                } else {
                    i31 = 0;
                }
                dVar3.b(dVar3.f7867d);
                fVar2.f7460a0 = i31;
                fVar2.b0 = i31;
                fVar2.f7463d.f7904h.c(i31);
                fVar2.f7465e.f7904h.c(i31);
                i32 = 1073741824;
                if (mode == 1073741824) {
                    zU = fVar.U(i31, zC);
                    i21 = 1;
                } else {
                    zU = true;
                    i21 = 0;
                }
                if (mode2 == 1073741824) {
                    zU &= fVar.U(1, zC);
                    i21++;
                }
            }
            if (zU) {
                if (mode == i32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (mode2 == i32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                fVar.Q(z18, z19);
            }
        } else {
            i19 = i18;
            basicMeasure$Measurer2 = basicMeasure$Measurer;
            i20 = size;
            zU = false;
            i21 = 0;
        }
        if (zU) {
        }
        int i44 = fVar.f7508H0;
        if (i20 > 0) {
            size3 = fVar.f7517u0.size();
            boolean zX2 = fVar.X(64);
            basicMeasure$Measurer5 = fVar.f7521y0;
            while (i30 < size3) {
                eVar3 = (Q.e) fVar.f7517u0.get(i30);
                if (!(eVar3 instanceof Q.i)) {
                    dVarK = eVar3.k(0);
                    dVarK2 = eVar3.k(1);
                    if (dVarK == dVar) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        if (dVarK == dVar) {
                            z15 = true;
                        }
                        if (dVarK2 == dVar) {
                            z15 = true;
                        }
                        z15 = dVarK != dVar ? true : true;
                    }
                    if (z15) {
                        aVar.m(0, eVar3, basicMeasure$Measurer5);
                    }
                }
            }
            basicMeasure$Measurer5.didMeasures();
        }
        aVar.t(fVar);
        arrayList = (ArrayList) aVar.f42645b;
        size2 = arrayList.size();
        if (i20 > 0) {
            aVar.p(fVar, 0, iR, iL);
        }
        if (size2 > 0) {
            dVarArr = fVar.f7453U;
            if (dVarArr[0] == dVar2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarArr[1] == dVar2) {
                z8 = true;
            } else {
                z8 = false;
            }
            int iR8 = fVar.r();
            Q.f fVar5 = (Q.f) aVar.f42647d;
            iMax = Math.max(iR8, fVar5.f7464d0);
            iMax2 = Math.max(fVar.l(), fVar5.f7466e0);
            i22 = 0;
            z10 = false;
            while (i22 < size2) {
                eVar2 = (Q.e) arrayList.get(i22);
                if (eVar2 instanceof Q.m) {
                    z13 = z8;
                    basicMeasure$Measurer4 = basicMeasure$Measurer2;
                } else {
                    iR4 = eVar2.r();
                    iL4 = eVar2.l();
                    z13 = z8;
                    basicMeasure$Measurer4 = basicMeasure$Measurer2;
                    boolean zM3 = z10 | aVar.m(1, eVar2, basicMeasure$Measurer4);
                    iR5 = eVar2.r();
                    z14 = zM3;
                    iL5 = eVar2.l();
                    if (iR5 != iR4) {
                        eVar2.P(iR5);
                        if (z3) {
                            iMax = Math.max(iMax, eVar2.j(4).e() + eVar2.s() + eVar2.f7455W);
                        }
                        z14 = true;
                    }
                    if (iL5 != iL4) {
                        eVar2.M(iL5);
                        if (z13) {
                            iMax2 = Math.max(iMax2, eVar2.j(5).e() + eVar2.t() + eVar2.f7456X);
                        }
                        z14 = true;
                    }
                    z10 = z14 | ((Q.m) eVar2).f7573C0;
                }
                i22++;
                basicMeasure$Measurer2 = basicMeasure$Measurer4;
                z8 = z13;
            }
            z11 = z8;
            basicMeasure$Measurer3 = basicMeasure$Measurer2;
            i23 = 0;
            while (i23 < 2) {
                z12 = z10;
                i24 = 0;
                while (i24 < size2) {
                    eVar = (Q.e) arrayList.get(i24);
                    if (eVar instanceof Helper) {
                        arrayList3 = arrayList;
                        if (eVar.i0 == 8) {
                            i27 = size2;
                            i29 = i23;
                            i28 = i24;
                            zM = z12;
                        } else {
                            iR2 = eVar.r();
                            iL2 = eVar.l();
                            i27 = size2;
                            int i45 = eVar.c0;
                            i28 = i24;
                            zM = aVar.m(i23 == 1 ? 2 : 1, eVar, basicMeasure$Measurer3) | z12;
                            iR3 = eVar.r();
                            i29 = i23;
                            iL3 = eVar.l();
                            if (iR3 != iR2) {
                                eVar.P(iR3);
                                if (!z3) {
                                }
                                zM = true;
                            }
                            if (iL3 != iL2) {
                                eVar.M(iL3);
                                if (!z11) {
                                }
                                zM = true;
                            }
                            if (!eVar.f7437E) {
                            }
                        }
                    } else {
                        arrayList3 = arrayList;
                        if (eVar.i0 == 8) {
                            i27 = size2;
                            i29 = i23;
                            i28 = i24;
                            zM = z12;
                        } else {
                            iR2 = eVar.r();
                            iL2 = eVar.l();
                            i27 = size2;
                            int i46 = eVar.c0;
                            i28 = i24;
                            zM = aVar.m(i23 == 1 ? 2 : 1, eVar, basicMeasure$Measurer3) | z12;
                            iR3 = eVar.r();
                            i29 = i23;
                            iL3 = eVar.l();
                            if (iR3 != iR2) {
                                eVar.P(iR3);
                                if (!z3) {
                                }
                                zM = true;
                            }
                            if (iL3 != iL2) {
                                eVar.M(iL3);
                                if (!z11) {
                                }
                                zM = true;
                            }
                            if (!eVar.f7437E) {
                            }
                        }
                    }
                    z12 = zM;
                    size2 = i27;
                    i23 = i29;
                    i24 = i28 + 1;
                    arrayList = arrayList3;
                }
                arrayList2 = arrayList;
                i25 = size2;
                i26 = i23;
                if (z12) {
                    break;
                    break;
                }
                int i47 = i26 + 1;
                aVar.p(fVar, i47, iR, iL);
                i23 = i47;
                arrayList = arrayList2;
                size2 = i25;
                z10 = false;
            }
        }
        fVar.f7508H0 = i44;
        androidx.constraintlayout.core.c.f15087p = fVar.X(512);
    }

    public void setConstraintSet(m set) {
        this.mConstraintSet = set;
    }

    public void setDesignInformation(int type, Object value1, Object value2) {
        if (type == 0 && (value1 instanceof String) && (value2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String strSubstring = (String) value1;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            Integer num = (Integer) value2;
            num.intValue();
            this.mDesignIds.put(strSubstring, num);
        }
    }

    @Override // android.view.View
    public void setId(int id2) {
        this.mChildrenByIds.remove(getId());
        super.setId(id2);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int value) {
        if (value == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = value;
        requestLayout();
    }

    public void setMaxWidth(int value) {
        if (value == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = value;
        requestLayout();
    }

    public void setMinHeight(int value) {
        if (value == this.mMinHeight) {
            return;
        }
        this.mMinHeight = value;
        requestLayout();
    }

    public void setMinWidth(int value) {
        if (value == this.mMinWidth) {
            return;
        }
        this.mMinWidth = value;
        requestLayout();
    }

    public void setOnConstraintsChanged(n constraintsChangedListener) {
        f fVar = this.mConstraintLayoutSpec;
        if (fVar != null) {
            fVar.getClass();
        }
    }

    public void setOptimizationLevel(int level) {
        this.mOptimizationLevel = level;
        Q.f fVar = this.mLayoutWidget;
        fVar.f7508H0 = level;
        androidx.constraintlayout.core.c.f15087p = fVar.X(512);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x003e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:20:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2  */
    public void setSelfDimensionBehaviour(Q.f layout, int widthMode, int widthSize, int heightMode, int heightSize) {
        Q.d dVar;
        int i7;
        int i10;
        c cVar = this.mMeasurer;
        int i11 = cVar.f15712e;
        int i12 = cVar.f15711d;
        Q.d dVar2 = Q.d.f7428a;
        int childCount = getChildCount();
        Q.d dVar3 = Q.d.f7429b;
        if (widthMode != Integer.MIN_VALUE) {
            if (widthMode != 0) {
                if (widthMode != 1073741824) {
                    dVar = dVar2;
                } else {
                    widthSize = Math.min(this.mMaxWidth - i12, widthSize);
                    dVar = dVar2;
                }
                if (heightMode != Integer.MIN_VALUE) {
                    if (heightMode != 0) {
                        if (heightMode == 1073741824) {
                            heightSize = Math.min(this.mMaxHeight - i11, heightSize);
                        }
                        if (widthSize == layout.r() || heightSize != layout.l()) {
                            layout.f7519w0.f7866c = true;
                        }
                        layout.f7460a0 = 0;
                        layout.b0 = 0;
                        int i13 = this.mMaxWidth - i12;
                        int[] iArr = layout.f7435C;
                        iArr[0] = i13;
                        iArr[1] = this.mMaxHeight - i11;
                        layout.f7464d0 = 0;
                        layout.f7466e0 = 0;
                        layout.N(dVar);
                        layout.P(widthSize);
                        layout.O(dVar2);
                        layout.M(heightSize);
                        i7 = this.mMinWidth - i12;
                        if (i7 < 0) {
                            layout.f7464d0 = 0;
                        } else {
                            layout.f7464d0 = i7;
                        }
                        i10 = this.mMinHeight - i11;
                        if (i10 < 0) {
                            layout.f7466e0 = 0;
                        } else {
                            layout.f7466e0 = i10;
                        }
                    }
                    if (childCount == 0) {
                        heightSize = Math.max(0, this.mMinHeight);
                    } else {
                        dVar2 = dVar3;
                    }
                    heightSize = 0;
                    if (widthSize == layout.r()) {
                        layout.f7519w0.f7866c = true;
                    } else {
                        layout.f7519w0.f7866c = true;
                    }
                    layout.f7460a0 = 0;
                    layout.b0 = 0;
                    int i14 = this.mMaxWidth - i12;
                    int[] iArr2 = layout.f7435C;
                    iArr2[0] = i14;
                    iArr2[1] = this.mMaxHeight - i11;
                    layout.f7464d0 = 0;
                    layout.f7466e0 = 0;
                    layout.N(dVar);
                    layout.P(widthSize);
                    layout.O(dVar2);
                    layout.M(heightSize);
                    i7 = this.mMinWidth - i12;
                    if (i7 < 0) {
                        layout.f7464d0 = 0;
                    } else {
                        layout.f7464d0 = i7;
                    }
                    i10 = this.mMinHeight - i11;
                    if (i10 < 0) {
                        layout.f7466e0 = 0;
                    } else {
                        layout.f7466e0 = i10;
                    }
                }
                if (childCount == 0) {
                    heightSize = Math.max(0, this.mMinHeight);
                }
                dVar2 = dVar3;
                if (widthSize == layout.r()) {
                    layout.f7519w0.f7866c = true;
                } else {
                    layout.f7519w0.f7866c = true;
                }
                layout.f7460a0 = 0;
                layout.b0 = 0;
                int i15 = this.mMaxWidth - i12;
                int[] iArr3 = layout.f7435C;
                iArr3[0] = i15;
                iArr3[1] = this.mMaxHeight - i11;
                layout.f7464d0 = 0;
                layout.f7466e0 = 0;
                layout.N(dVar);
                layout.P(widthSize);
                layout.O(dVar2);
                layout.M(heightSize);
                i7 = this.mMinWidth - i12;
                if (i7 < 0) {
                    layout.f7464d0 = 0;
                } else {
                    layout.f7464d0 = i7;
                }
                i10 = this.mMinHeight - i11;
                if (i10 < 0) {
                    layout.f7466e0 = 0;
                } else {
                    layout.f7466e0 = i10;
                }
            }
            if (childCount == 0) {
                widthSize = Math.max(0, this.mMinWidth);
            } else {
                dVar = dVar3;
            }
            widthSize = 0;
            if (heightMode != Integer.MIN_VALUE) {
                if (heightMode != 0) {
                    if (heightMode == 1073741824) {
                        heightSize = Math.min(this.mMaxHeight - i11, heightSize);
                    }
                    if (widthSize == layout.r()) {
                        layout.f7519w0.f7866c = true;
                    } else {
                        layout.f7519w0.f7866c = true;
                    }
                    layout.f7460a0 = 0;
                    layout.b0 = 0;
                    int i16 = this.mMaxWidth - i12;
                    int[] iArr4 = layout.f7435C;
                    iArr4[0] = i16;
                    iArr4[1] = this.mMaxHeight - i11;
                    layout.f7464d0 = 0;
                    layout.f7466e0 = 0;
                    layout.N(dVar);
                    layout.P(widthSize);
                    layout.O(dVar2);
                    layout.M(heightSize);
                    i7 = this.mMinWidth - i12;
                    if (i7 < 0) {
                        layout.f7464d0 = 0;
                    } else {
                        layout.f7464d0 = i7;
                    }
                    i10 = this.mMinHeight - i11;
                    if (i10 < 0) {
                        layout.f7466e0 = 0;
                    } else {
                        layout.f7466e0 = i10;
                    }
                }
                if (childCount == 0) {
                    heightSize = Math.max(0, this.mMinHeight);
                } else {
                    dVar2 = dVar3;
                }
                heightSize = 0;
                if (widthSize == layout.r()) {
                    layout.f7519w0.f7866c = true;
                } else {
                    layout.f7519w0.f7866c = true;
                }
                layout.f7460a0 = 0;
                layout.b0 = 0;
                int i17 = this.mMaxWidth - i12;
                int[] iArr5 = layout.f7435C;
                iArr5[0] = i17;
                iArr5[1] = this.mMaxHeight - i11;
                layout.f7464d0 = 0;
                layout.f7466e0 = 0;
                layout.N(dVar);
                layout.P(widthSize);
                layout.O(dVar2);
                layout.M(heightSize);
                i7 = this.mMinWidth - i12;
                if (i7 < 0) {
                    layout.f7464d0 = 0;
                } else {
                    layout.f7464d0 = i7;
                }
                i10 = this.mMinHeight - i11;
                if (i10 < 0) {
                    layout.f7466e0 = 0;
                } else {
                    layout.f7466e0 = i10;
                }
            }
            if (childCount == 0) {
                heightSize = Math.max(0, this.mMinHeight);
            }
            dVar2 = dVar3;
            if (widthSize == layout.r()) {
                layout.f7519w0.f7866c = true;
            } else {
                layout.f7519w0.f7866c = true;
            }
            layout.f7460a0 = 0;
            layout.b0 = 0;
            int i18 = this.mMaxWidth - i12;
            int[] iArr6 = layout.f7435C;
            iArr6[0] = i18;
            iArr6[1] = this.mMaxHeight - i11;
            layout.f7464d0 = 0;
            layout.f7466e0 = 0;
            layout.N(dVar);
            layout.P(widthSize);
            layout.O(dVar2);
            layout.M(heightSize);
            i7 = this.mMinWidth - i12;
            if (i7 < 0) {
                layout.f7464d0 = 0;
            } else {
                layout.f7464d0 = i7;
            }
            i10 = this.mMinHeight - i11;
            if (i10 < 0) {
                layout.f7466e0 = 0;
            } else {
                layout.f7466e0 = i10;
            }
        }
        if (childCount == 0) {
            widthSize = Math.max(0, this.mMinWidth);
        }
        dVar = dVar3;
        if (heightMode != Integer.MIN_VALUE) {
            if (heightMode != 0) {
                if (heightMode == 1073741824) {
                    heightSize = Math.min(this.mMaxHeight - i11, heightSize);
                }
                if (widthSize == layout.r()) {
                    layout.f7519w0.f7866c = true;
                } else {
                    layout.f7519w0.f7866c = true;
                }
                layout.f7460a0 = 0;
                layout.b0 = 0;
                int i19 = this.mMaxWidth - i12;
                int[] iArr7 = layout.f7435C;
                iArr7[0] = i19;
                iArr7[1] = this.mMaxHeight - i11;
                layout.f7464d0 = 0;
                layout.f7466e0 = 0;
                layout.N(dVar);
                layout.P(widthSize);
                layout.O(dVar2);
                layout.M(heightSize);
                i7 = this.mMinWidth - i12;
                if (i7 < 0) {
                    layout.f7464d0 = 0;
                } else {
                    layout.f7464d0 = i7;
                }
                i10 = this.mMinHeight - i11;
                if (i10 < 0) {
                    layout.f7466e0 = 0;
                } else {
                    layout.f7466e0 = i10;
                }
            }
            if (childCount == 0) {
                heightSize = Math.max(0, this.mMinHeight);
            } else {
                dVar2 = dVar3;
            }
            heightSize = 0;
            if (widthSize == layout.r()) {
                layout.f7519w0.f7866c = true;
            } else {
                layout.f7519w0.f7866c = true;
            }
            layout.f7460a0 = 0;
            layout.b0 = 0;
            int i110 = this.mMaxWidth - i12;
            int[] iArr8 = layout.f7435C;
            iArr8[0] = i110;
            iArr8[1] = this.mMaxHeight - i11;
            layout.f7464d0 = 0;
            layout.f7466e0 = 0;
            layout.N(dVar);
            layout.P(widthSize);
            layout.O(dVar2);
            layout.M(heightSize);
            i7 = this.mMinWidth - i12;
            if (i7 < 0) {
                layout.f7464d0 = 0;
            } else {
                layout.f7464d0 = i7;
            }
            i10 = this.mMinHeight - i11;
            if (i10 < 0) {
                layout.f7466e0 = 0;
            } else {
                layout.f7466e0 = i10;
            }
        }
        if (childCount == 0) {
            heightSize = Math.max(0, this.mMinHeight);
        }
        dVar2 = dVar3;
        if (widthSize == layout.r()) {
            layout.f7519w0.f7866c = true;
        } else {
            layout.f7519w0.f7866c = true;
        }
        layout.f7460a0 = 0;
        layout.b0 = 0;
        int i111 = this.mMaxWidth - i12;
        int[] iArr9 = layout.f7435C;
        iArr9[0] = i111;
        iArr9[1] = this.mMaxHeight - i11;
        layout.f7464d0 = 0;
        layout.f7466e0 = 0;
        layout.N(dVar);
        layout.P(widthSize);
        layout.O(dVar2);
        layout.M(heightSize);
        i7 = this.mMinWidth - i12;
        if (i7 < 0) {
            layout.f7464d0 = 0;
        } else {
            layout.f7464d0 = i7;
        }
        i10 = this.mMinHeight - i11;
        if (i10 < 0) {
            layout.f7466e0 = 0;
        } else {
            layout.f7466e0 = i10;
        }
    }

    public void setState(int id2, int screenWidth, int screenHeight) {
        f fVar = this.mConstraintLayoutSpec;
        if (fVar != null) {
            fVar.b(screenWidth, screenHeight, id2);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new LayoutParams(getContext(), attrs);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p3) {
        return new LayoutParams(p3);
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new Q.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        a(attrs, 0);
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new Q.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        a(attrs, defStyleAttr);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f15610A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f15611B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public final int f15612C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public final int f15613D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public float f15614E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public float f15615F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public String f15616G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public float f15617H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public float f15618I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public int f15619J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public int f15620K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public int f15621L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public int f15622M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public int f15623N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f15624O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public int f15625P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public int f15626Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public float f15627R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public float f15628S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public int f15629T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public int f15630U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public int f15631V;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public boolean f15632W;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public boolean f15633X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public String f15634Y;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public int f15635Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15636a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public boolean f15637a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15638b;
        public boolean b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f15639c;
        public boolean c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f15640d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public boolean f15641d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f15642e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public boolean f15643e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f15644f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public boolean f15645f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f15646g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public int f15647g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f15648h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public int f15649h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f15650i;
        public int i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f15651j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public int f15652j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f15653k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public int f15654k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f15655l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public int f15656l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f15657m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public float f15658m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f15659n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public int f15660n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f15661o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public int f15662o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f15663p;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public float f15664p0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f15665q;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Q.e f15666q0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f15667r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f15668s;
        public int t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f15669u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f15670v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final int f15671w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f15672x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final int f15673y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f15674z;

        public LayoutParams(Context c6, AttributeSet attrs) {
            super(c6, attrs);
            this.f15636a = -1;
            this.f15638b = -1;
            this.f15639c = -1.0f;
            this.f15640d = true;
            this.f15642e = -1;
            this.f15644f = -1;
            this.f15646g = -1;
            this.f15648h = -1;
            this.f15650i = -1;
            this.f15651j = -1;
            this.f15653k = -1;
            this.f15655l = -1;
            this.f15657m = -1;
            this.f15659n = -1;
            this.f15661o = -1;
            this.f15663p = -1;
            this.f15665q = 0;
            this.f15667r = 0.0f;
            this.f15668s = -1;
            this.t = -1;
            this.f15669u = -1;
            this.f15670v = -1;
            this.f15671w = Integer.MIN_VALUE;
            this.f15672x = Integer.MIN_VALUE;
            this.f15673y = Integer.MIN_VALUE;
            this.f15674z = Integer.MIN_VALUE;
            this.f15610A = Integer.MIN_VALUE;
            this.f15611B = Integer.MIN_VALUE;
            this.f15612C = Integer.MIN_VALUE;
            this.f15613D = 0;
            this.f15614E = 0.5f;
            this.f15615F = 0.5f;
            this.f15616G = null;
            this.f15617H = -1.0f;
            this.f15618I = -1.0f;
            this.f15619J = 0;
            this.f15620K = 0;
            this.f15621L = 0;
            this.f15622M = 0;
            this.f15623N = 0;
            this.f15624O = 0;
            this.f15625P = 0;
            this.f15626Q = 0;
            this.f15627R = 1.0f;
            this.f15628S = 1.0f;
            this.f15629T = -1;
            this.f15630U = -1;
            this.f15631V = -1;
            this.f15632W = false;
            this.f15633X = false;
            this.f15634Y = null;
            this.f15635Z = 0;
            this.f15637a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.f15641d0 = false;
            this.f15643e0 = false;
            this.f15645f0 = false;
            this.f15647g0 = -1;
            this.f15649h0 = -1;
            this.i0 = -1;
            this.f15652j0 = -1;
            this.f15654k0 = Integer.MIN_VALUE;
            this.f15656l0 = Integer.MIN_VALUE;
            this.f15658m0 = 0.5f;
            this.f15666q0 = new Q.e();
            TypedArray typedArrayObtainStyledAttributes = c6.obtainStyledAttributes(attrs, p.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                int i10 = b.f15707a.get(index);
                switch (i10) {
                    case 1:
                        this.f15631V = typedArrayObtainStyledAttributes.getInt(index, this.f15631V);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f15663p);
                        this.f15663p = resourceId;
                        if (resourceId == -1) {
                            this.f15663p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f15665q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15665q);
                        break;
                    case 4:
                        float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f15667r) % 360.0f;
                        this.f15667r = f10;
                        if (f10 < 0.0f) {
                            this.f15667r = (360.0f - f10) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f15636a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15636a);
                        break;
                    case 6:
                        this.f15638b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15638b);
                        break;
                    case 7:
                        this.f15639c = typedArrayObtainStyledAttributes.getFloat(index, this.f15639c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15642e);
                        this.f15642e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f15642e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15644f);
                        this.f15644f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f15644f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15646g);
                        this.f15646g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f15646g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15648h);
                        this.f15648h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f15648h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15650i);
                        this.f15650i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f15650i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15651j);
                        this.f15651j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f15651j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15653k);
                        this.f15653k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f15653k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15655l);
                        this.f15655l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f15655l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15657m);
                        this.f15657m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f15657m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15668s);
                        this.f15668s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f15668s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.t);
                        this.t = resourceId12;
                        if (resourceId12 == -1) {
                            this.t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15669u);
                        this.f15669u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f15669u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15670v);
                        this.f15670v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f15670v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f15671w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15671w);
                        break;
                    case 22:
                        this.f15672x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15672x);
                        break;
                    case 23:
                        this.f15673y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15673y);
                        break;
                    case 24:
                        this.f15674z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15674z);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        this.f15610A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15610A);
                        break;
                    case 26:
                        this.f15611B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15611B);
                        break;
                    case 27:
                        this.f15632W = typedArrayObtainStyledAttributes.getBoolean(index, this.f15632W);
                        break;
                    case 28:
                        this.f15633X = typedArrayObtainStyledAttributes.getBoolean(index, this.f15633X);
                        break;
                    case 29:
                        this.f15614E = typedArrayObtainStyledAttributes.getFloat(index, this.f15614E);
                        break;
                    case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                        this.f15615F = typedArrayObtainStyledAttributes.getFloat(index, this.f15615F);
                        break;
                    case 31:
                        int i11 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f15621L = i11;
                        if (i11 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f15622M = i12;
                        if (i12 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.f15623N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15623N);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f15623N) == -2) {
                                this.f15623N = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.f15625P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15625P);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f15625P) == -2) {
                                this.f15625P = -2;
                            }
                        }
                        break;
                    case 35:
                        this.f15627R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f15627R));
                        this.f15621L = 2;
                        break;
                    case 36:
                        try {
                            this.f15624O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15624O);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f15624O) == -2) {
                                this.f15624O = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.f15626Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15626Q);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f15626Q) == -2) {
                                this.f15626Q = -2;
                            }
                        }
                        break;
                    case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                        this.f15628S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f15628S));
                        this.f15622M = 2;
                        break;
                    default:
                        switch (i10) {
                            case 44:
                                m.q(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f15617H = typedArrayObtainStyledAttributes.getFloat(index, this.f15617H);
                                break;
                            case 46:
                                this.f15618I = typedArrayObtainStyledAttributes.getFloat(index, this.f15618I);
                                break;
                            case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                                this.f15619J = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f15620K = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                                this.f15629T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15629T);
                                break;
                            case 50:
                                this.f15630U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15630U);
                                break;
                            case 51:
                                this.f15634Y = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15659n);
                                this.f15659n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f15659n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15661o);
                                this.f15661o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f15661o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.f15613D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15613D);
                                break;
                            case 55:
                                this.f15612C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15612C);
                                break;
                            default:
                                switch (i10) {
                                    case 64:
                                        m.p(this, typedArrayObtainStyledAttributes, index, 0);
                                        break;
                                    case HomeMenuBean.BOTTOM_TAB_INVEST /* 65 */:
                                        m.p(this, typedArrayObtainStyledAttributes, index, 1);
                                        break;
                                    case HomeMenuBean.BOTTOM_TAB_GIVEAWAY /* 66 */:
                                        this.f15635Z = typedArrayObtainStyledAttributes.getInt(index, this.f15635Z);
                                        break;
                                    case 67:
                                        this.f15640d = typedArrayObtainStyledAttributes.getBoolean(index, this.f15640d);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public final void a() {
            this.f15641d0 = false;
            this.f15637a0 = true;
            this.b0 = true;
            int i7 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i7 == -2 && this.f15632W) {
                this.f15637a0 = false;
                if (this.f15621L == 0) {
                    this.f15621L = 1;
                }
            }
            int i10 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i10 == -2 && this.f15633X) {
                this.b0 = false;
                if (this.f15622M == 0) {
                    this.f15622M = 1;
                }
            }
            if (i7 == 0 || i7 == -1) {
                this.f15637a0 = false;
                if (i7 == 0 && this.f15621L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f15632W = true;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.b0 = false;
                if (i10 == 0 && this.f15622M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f15633X = true;
                }
            }
            if (this.f15639c == -1.0f && this.f15636a == -1 && this.f15638b == -1) {
                return;
            }
            this.f15641d0 = true;
            this.f15637a0 = true;
            this.b0 = true;
            if (!(this.f15666q0 instanceof Q.i)) {
                this.f15666q0 = new Q.i();
            }
            ((Q.i) this.f15666q0).T(this.f15631V);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004a  */
        /* JADX WARN: Code duplicated, block: B:20:0x0051  */
        /* JADX WARN: Code duplicated, block: B:23:0x0058  */
        /* JADX WARN: Code duplicated, block: B:26:0x005e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0064  */
        /* JADX WARN: Code duplicated, block: B:38:0x007a  */
        /* JADX WARN: Code duplicated, block: B:39:0x0082 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x0084  */
        /* JADX WARN: Code duplicated, block: B:41:0x008b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x008d  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        public final void resolveLayoutDirection(int i7) {
            int i10;
            int i11;
            int i12;
            int i13;
            int i14 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i15 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i7);
            boolean z3 = false;
            boolean z8 = 1 == getLayoutDirection();
            this.i0 = -1;
            this.f15652j0 = -1;
            this.f15647g0 = -1;
            this.f15649h0 = -1;
            this.f15654k0 = this.f15671w;
            this.f15656l0 = this.f15673y;
            float f10 = this.f15614E;
            this.f15658m0 = f10;
            int i16 = this.f15636a;
            this.f15660n0 = i16;
            int i17 = this.f15638b;
            this.f15662o0 = i17;
            float f11 = this.f15639c;
            this.f15664p0 = f11;
            if (z8) {
                int i18 = this.f15668s;
                if (i18 != -1) {
                    this.i0 = i18;
                } else {
                    int i19 = this.t;
                    if (i19 != -1) {
                        this.f15652j0 = i19;
                    } else {
                        i10 = this.f15669u;
                        if (i10 != -1) {
                            this.f15649h0 = i10;
                            z3 = true;
                        }
                        i11 = this.f15670v;
                        if (i11 != -1) {
                            this.f15647g0 = i11;
                            z3 = true;
                        }
                        i12 = this.f15610A;
                        if (i12 != Integer.MIN_VALUE) {
                            this.f15656l0 = i12;
                        }
                        i13 = this.f15611B;
                        if (i13 != Integer.MIN_VALUE) {
                            this.f15654k0 = i13;
                        }
                        if (z3) {
                            this.f15658m0 = 1.0f - f10;
                        }
                        if (this.f15641d0 && this.f15631V == 1 && this.f15640d) {
                            if (f11 != -1.0f) {
                                this.f15664p0 = 1.0f - f11;
                                this.f15660n0 = -1;
                                this.f15662o0 = -1;
                            } else if (i16 != -1) {
                                this.f15662o0 = i16;
                                this.f15660n0 = -1;
                                this.f15664p0 = -1.0f;
                            } else if (i17 != -1) {
                                this.f15660n0 = i17;
                                this.f15662o0 = -1;
                                this.f15664p0 = -1.0f;
                            }
                        }
                    }
                }
                z3 = true;
                i10 = this.f15669u;
                if (i10 != -1) {
                    this.f15649h0 = i10;
                    z3 = true;
                }
                i11 = this.f15670v;
                if (i11 != -1) {
                    this.f15647g0 = i11;
                    z3 = true;
                }
                i12 = this.f15610A;
                if (i12 != Integer.MIN_VALUE) {
                    this.f15656l0 = i12;
                }
                i13 = this.f15611B;
                if (i13 != Integer.MIN_VALUE) {
                    this.f15654k0 = i13;
                }
                if (z3) {
                    this.f15658m0 = 1.0f - f10;
                }
                if (this.f15641d0) {
                    if (f11 != -1.0f) {
                        this.f15664p0 = 1.0f - f11;
                        this.f15660n0 = -1;
                        this.f15662o0 = -1;
                    } else if (i16 != -1) {
                        this.f15662o0 = i16;
                        this.f15660n0 = -1;
                        this.f15664p0 = -1.0f;
                    } else if (i17 != -1) {
                        this.f15660n0 = i17;
                        this.f15662o0 = -1;
                        this.f15664p0 = -1.0f;
                    }
                }
            } else {
                int i20 = this.f15668s;
                if (i20 != -1) {
                    this.f15649h0 = i20;
                }
                int i21 = this.t;
                if (i21 != -1) {
                    this.f15647g0 = i21;
                }
                int i22 = this.f15669u;
                if (i22 != -1) {
                    this.i0 = i22;
                }
                int i23 = this.f15670v;
                if (i23 != -1) {
                    this.f15652j0 = i23;
                }
                int i24 = this.f15610A;
                if (i24 != Integer.MIN_VALUE) {
                    this.f15654k0 = i24;
                }
                int i25 = this.f15611B;
                if (i25 != Integer.MIN_VALUE) {
                    this.f15656l0 = i25;
                }
            }
            if (this.f15669u == -1 && this.f15670v == -1 && this.t == -1 && this.f15668s == -1) {
                int i26 = this.f15646g;
                if (i26 != -1) {
                    this.i0 = i26;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i15 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i15;
                    }
                } else {
                    int i27 = this.f15648h;
                    if (i27 != -1) {
                        this.f15652j0 = i27;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i15 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i15;
                        }
                    }
                }
                int i28 = this.f15642e;
                if (i28 != -1) {
                    this.f15647g0 = i28;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i14 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i14;
                    return;
                }
                int i29 = this.f15644f;
                if (i29 != -1) {
                    this.f15649h0 = i29;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i14 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i14;
                }
            }
        }

        public LayoutParams(int i7, int i10) {
            super(i7, i10);
            this.f15636a = -1;
            this.f15638b = -1;
            this.f15639c = -1.0f;
            this.f15640d = true;
            this.f15642e = -1;
            this.f15644f = -1;
            this.f15646g = -1;
            this.f15648h = -1;
            this.f15650i = -1;
            this.f15651j = -1;
            this.f15653k = -1;
            this.f15655l = -1;
            this.f15657m = -1;
            this.f15659n = -1;
            this.f15661o = -1;
            this.f15663p = -1;
            this.f15665q = 0;
            this.f15667r = 0.0f;
            this.f15668s = -1;
            this.t = -1;
            this.f15669u = -1;
            this.f15670v = -1;
            this.f15671w = Integer.MIN_VALUE;
            this.f15672x = Integer.MIN_VALUE;
            this.f15673y = Integer.MIN_VALUE;
            this.f15674z = Integer.MIN_VALUE;
            this.f15610A = Integer.MIN_VALUE;
            this.f15611B = Integer.MIN_VALUE;
            this.f15612C = Integer.MIN_VALUE;
            this.f15613D = 0;
            this.f15614E = 0.5f;
            this.f15615F = 0.5f;
            this.f15616G = null;
            this.f15617H = -1.0f;
            this.f15618I = -1.0f;
            this.f15619J = 0;
            this.f15620K = 0;
            this.f15621L = 0;
            this.f15622M = 0;
            this.f15623N = 0;
            this.f15624O = 0;
            this.f15625P = 0;
            this.f15626Q = 0;
            this.f15627R = 1.0f;
            this.f15628S = 1.0f;
            this.f15629T = -1;
            this.f15630U = -1;
            this.f15631V = -1;
            this.f15632W = false;
            this.f15633X = false;
            this.f15634Y = null;
            this.f15635Z = 0;
            this.f15637a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.f15641d0 = false;
            this.f15643e0 = false;
            this.f15645f0 = false;
            this.f15647g0 = -1;
            this.f15649h0 = -1;
            this.i0 = -1;
            this.f15652j0 = -1;
            this.f15654k0 = Integer.MIN_VALUE;
            this.f15656l0 = Integer.MIN_VALUE;
            this.f15658m0 = 0.5f;
            this.f15666q0 = new Q.e();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f15636a = -1;
            this.f15638b = -1;
            this.f15639c = -1.0f;
            this.f15640d = true;
            this.f15642e = -1;
            this.f15644f = -1;
            this.f15646g = -1;
            this.f15648h = -1;
            this.f15650i = -1;
            this.f15651j = -1;
            this.f15653k = -1;
            this.f15655l = -1;
            this.f15657m = -1;
            this.f15659n = -1;
            this.f15661o = -1;
            this.f15663p = -1;
            this.f15665q = 0;
            this.f15667r = 0.0f;
            this.f15668s = -1;
            this.t = -1;
            this.f15669u = -1;
            this.f15670v = -1;
            this.f15671w = Integer.MIN_VALUE;
            this.f15672x = Integer.MIN_VALUE;
            this.f15673y = Integer.MIN_VALUE;
            this.f15674z = Integer.MIN_VALUE;
            this.f15610A = Integer.MIN_VALUE;
            this.f15611B = Integer.MIN_VALUE;
            this.f15612C = Integer.MIN_VALUE;
            this.f15613D = 0;
            this.f15614E = 0.5f;
            this.f15615F = 0.5f;
            this.f15616G = null;
            this.f15617H = -1.0f;
            this.f15618I = -1.0f;
            this.f15619J = 0;
            this.f15620K = 0;
            this.f15621L = 0;
            this.f15622M = 0;
            this.f15623N = 0;
            this.f15624O = 0;
            this.f15625P = 0;
            this.f15626Q = 0;
            this.f15627R = 1.0f;
            this.f15628S = 1.0f;
            this.f15629T = -1;
            this.f15630U = -1;
            this.f15631V = -1;
            this.f15632W = false;
            this.f15633X = false;
            this.f15634Y = null;
            this.f15635Z = 0;
            this.f15637a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.f15641d0 = false;
            this.f15643e0 = false;
            this.f15645f0 = false;
            this.f15647g0 = -1;
            this.f15649h0 = -1;
            this.i0 = -1;
            this.f15652j0 = -1;
            this.f15654k0 = Integer.MIN_VALUE;
            this.f15656l0 = Integer.MIN_VALUE;
            this.f15658m0 = 0.5f;
            this.f15666q0 = new Q.e();
        }
    }
}
