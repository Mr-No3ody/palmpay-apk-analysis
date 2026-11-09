package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.internal.compat.workaround.b;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.StateListCornerSize;
import com.google.android.material.shape.StateListShapeAppearanceModel;
import com.google.android.material.shape.StateListSizeChange;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialButtonGroup extends LinearLayout {
    private static final int DEF_STYLE_RES = R.style.Widget_Material3_MaterialButtonGroup;
    private static final String LOG_TAG = "MButtonGroup";

    @Nullable
    private StateListSizeChange buttonSizeChange;
    private Integer[] childOrder;
    private final Comparator<MaterialButton> childOrderComparator;
    private boolean childShapesDirty;

    @Nullable
    private StateListShapeAppearanceModel groupStateListShapeAppearance;

    @Nullable
    StateListCornerSize innerCornerSize;
    private final List<ShapeAppearanceModel> originalChildShapeAppearanceModels;
    private final List<StateListShapeAppearanceModel> originalChildStateListShapeAppearanceModels;
    private final PressedStateTracker pressedStateTracker;

    @Px
    private int spacing;

    public class PressedStateTracker implements MaterialButton.OnPressedChangeListener {
        private PressedStateTracker() {
        }

        @Override // com.google.android.material.button.MaterialButton.OnPressedChangeListener
        public void onPressedChanged(@NonNull MaterialButton materialButton, boolean z3) {
            MaterialButtonGroup.this.invalidate();
        }
    }

    public MaterialButtonGroup(@NonNull Context context) {
        this(context, null);
    }

    private void adjustChildMarginsAndUpdateLayout() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i7 = firstVisibleChildIndex + 1; i7 < getChildCount(); i7++) {
            MaterialButton childButton = getChildButton(i7);
            MaterialButton childButton2 = getChildButton(i7 - 1);
            if (this.spacing <= 0) {
                iMin = Math.min(childButton.getStrokeWidth(), childButton2.getStrokeWidth());
                childButton.setShouldDrawSurfaceColorStroke(true);
                childButton2.setShouldDrawSurfaceColorStroke(true);
            } else {
                childButton.setShouldDrawSurfaceColorStroke(false);
                childButton2.setShouldDrawSurfaceColorStroke(false);
                iMin = 0;
            }
            LinearLayout.LayoutParams layoutParamsBuildLayoutParams = buildLayoutParams(childButton);
            if (getOrientation() == 0) {
                layoutParamsBuildLayoutParams.setMarginEnd(0);
                layoutParamsBuildLayoutParams.setMarginStart(this.spacing - iMin);
                layoutParamsBuildLayoutParams.topMargin = 0;
            } else {
                layoutParamsBuildLayoutParams.bottomMargin = 0;
                layoutParamsBuildLayoutParams.topMargin = this.spacing - iMin;
                layoutParamsBuildLayoutParams.setMarginStart(0);
            }
            childButton.setLayoutParams(layoutParamsBuildLayoutParams);
        }
        resetChildMargins(firstVisibleChildIndex);
    }

    private void adjustChildSizeChange() {
        if (this.buttonSizeChange == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Integer.MAX_VALUE;
        for (int i7 = firstVisibleChildIndex; i7 <= lastVisibleChildIndex; i7++) {
            if (isChildVisible(i7)) {
                int buttonAllowedWidthIncrease = getButtonAllowedWidthIncrease(i7);
                if (i7 != firstVisibleChildIndex && i7 != lastVisibleChildIndex) {
                    buttonAllowedWidthIncrease /= 2;
                }
                iMin = Math.min(iMin, buttonAllowedWidthIncrease);
            }
        }
        int i10 = firstVisibleChildIndex;
        while (i10 <= lastVisibleChildIndex) {
            if (isChildVisible(i10)) {
                getChildButton(i10).setSizeChange(this.buttonSizeChange);
                getChildButton(i10).setWidthChangeMax((i10 == firstVisibleChildIndex || i10 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i10++;
        }
    }

    private int getButtonAllowedWidthIncrease(int i7) {
        if (!isChildVisible(i7) || this.buttonSizeChange == null) {
            return 0;
        }
        int iMax = Math.max(0, this.buttonSizeChange.getMaxWidthChange(getChildButton(i7).getWidth()));
        MaterialButton prevVisibleChildButton = getPrevVisibleChildButton(i7);
        int allowedWidthDecrease = prevVisibleChildButton == null ? 0 : prevVisibleChildButton.getAllowedWidthDecrease();
        MaterialButton nextVisibleChildButton = getNextVisibleChildButton(i7);
        return Math.min(iMax, allowedWidthDecrease + (nextVisibleChildButton != null ? nextVisibleChildButton.getAllowedWidthDecrease() : 0));
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            if (isChildVisible(i7)) {
                return i7;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (isChildVisible(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    @Nullable
    private MaterialButton getNextVisibleChildButton(int i7) {
        int childCount = getChildCount();
        do {
            i7++;
            if (i7 >= childCount) {
                return null;
            }
        } while (!isChildVisible(i7));
        return getChildButton(i7);
    }

    @NonNull
    private StateListShapeAppearanceModel.Builder getOriginalStateListShapeBuilder(boolean z3, boolean z8, int i7) {
        StateListShapeAppearanceModel stateListShapeAppearanceModel = this.groupStateListShapeAppearance;
        if (stateListShapeAppearanceModel == null || (!z3 && !z8)) {
            stateListShapeAppearanceModel = this.originalChildStateListShapeAppearanceModels.get(i7);
        }
        return stateListShapeAppearanceModel == null ? new StateListShapeAppearanceModel.Builder(this.originalChildShapeAppearanceModels.get(i7)) : stateListShapeAppearanceModel.toBuilder();
    }

    @Nullable
    private MaterialButton getPrevVisibleChildButton(int i7) {
        for (int i10 = i7 - 1; i10 >= 0; i10--) {
            if (isChildVisible(i10)) {
                return getChildButton(i10);
            }
        }
        return null;
    }

    private boolean isChildVisible(int i7) {
        return getChildAt(i7).getVisibility() != 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int lambda$new$0(MaterialButton materialButton, MaterialButton materialButton2) {
        int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
        return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(indexOfChild(materialButton), indexOfChild(materialButton2));
    }

    private void recoverAllChildrenLayoutParams() {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            getChildButton(i7).recoverOriginalLayoutParams();
        }
    }

    private void resetChildMargins(int i7) {
        if (getChildCount() == 0 || i7 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildButton(i7).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            layoutParams.setMarginEnd(0);
            layoutParams.setMarginStart(0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    private void updateChildOrder() {
        TreeMap treeMap = new TreeMap(this.childOrderComparator);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            treeMap.put(getChildButton(i7), Integer.valueOf(i7));
        }
        this.childOrder = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i7, @Nullable ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(LOG_TAG, "Child views must be of type MaterialButton.");
            return;
        }
        recoverAllChildrenLayoutParams();
        this.childShapesDirty = true;
        super.addView(view, i7, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.pressedStateTracker);
        this.originalChildShapeAppearanceModels.add(materialButton.getShapeAppearanceModel());
        this.originalChildStateListShapeAppearanceModels.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    @NonNull
    public LinearLayout.LayoutParams buildLayoutParams(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        updateChildOrder();
        super.dispatchDraw(canvas);
    }

    @Nullable
    @RestrictTo({c.f39801b})
    public StateListSizeChange getButtonSizeChange() {
        return this.buttonSizeChange;
    }

    @NonNull
    public MaterialButton getChildButton(int i7) {
        return (MaterialButton) getChildAt(i7);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i7, int i10) {
        Integer[] numArr = this.childOrder;
        return (numArr == null || i10 >= numArr.length) ? i10 : numArr[i10].intValue();
    }

    @NonNull
    public CornerSize getInnerCornerSize() {
        return this.innerCornerSize.getDefaultCornerSize();
    }

    @NonNull
    @RestrictTo({c.f39801b})
    public StateListCornerSize getInnerCornerSizeStateList() {
        return this.innerCornerSize;
    }

    @Nullable
    public ShapeAppearanceModel getShapeAppearance() {
        StateListShapeAppearanceModel stateListShapeAppearanceModel = this.groupStateListShapeAppearance;
        if (stateListShapeAppearanceModel == null) {
            return null;
        }
        return stateListShapeAppearanceModel.getDefaultShape(true);
    }

    @Px
    public int getSpacing() {
        return this.spacing;
    }

    @Nullable
    @RestrictTo({c.f39801b})
    public StateListShapeAppearanceModel getStateListShapeAppearance() {
        return this.groupStateListShapeAppearance;
    }

    public void onButtonWidthChanged(@NonNull MaterialButton materialButton, int i7) {
        int iIndexOfChild = indexOfChild(materialButton);
        if (iIndexOfChild < 0) {
            return;
        }
        MaterialButton prevVisibleChildButton = getPrevVisibleChildButton(iIndexOfChild);
        MaterialButton nextVisibleChildButton = getNextVisibleChildButton(iIndexOfChild);
        if (prevVisibleChildButton == null && nextVisibleChildButton == null) {
            return;
        }
        if (prevVisibleChildButton == null) {
            nextVisibleChildButton.setDisplayedWidthDecrease(i7);
        }
        if (nextVisibleChildButton == null) {
            prevVisibleChildButton.setDisplayedWidthDecrease(i7);
        }
        if (prevVisibleChildButton == null || nextVisibleChildButton == null) {
            return;
        }
        prevVisibleChildButton.setDisplayedWidthDecrease(i7 / 2);
        nextVisibleChildButton.setDisplayedWidthDecrease((i7 + 1) / 2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        super.onLayout(z3, i7, i10, i11, i12);
        if (z3) {
            recoverAllChildrenLayoutParams();
            adjustChildSizeChange();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        updateChildShapes();
        adjustChildMarginsAndUpdateLayout();
        super.onMeasure(i7, i10);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.originalChildShapeAppearanceModels.remove(iIndexOfChild);
            this.originalChildStateListShapeAppearanceModels.remove(iIndexOfChild);
        }
        this.childShapesDirty = true;
        updateChildShapes();
        recoverAllChildrenLayoutParams();
        adjustChildMarginsAndUpdateLayout();
    }

    @RestrictTo({c.f39801b})
    public void setButtonSizeChange(@NonNull StateListSizeChange stateListSizeChange) {
        if (this.buttonSizeChange != stateListSizeChange) {
            this.buttonSizeChange = stateListSizeChange;
            adjustChildSizeChange();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            getChildButton(i7).setEnabled(z3);
        }
    }

    public void setInnerCornerSize(@NonNull CornerSize cornerSize) {
        this.innerCornerSize = StateListCornerSize.create(cornerSize);
        this.childShapesDirty = true;
        updateChildShapes();
        invalidate();
    }

    @RestrictTo({c.f39801b})
    public void setInnerCornerSizeStateList(@NonNull StateListCornerSize stateListCornerSize) {
        this.innerCornerSize = stateListCornerSize;
        this.childShapesDirty = true;
        updateChildShapes();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i7) {
        if (getOrientation() != i7) {
            this.childShapesDirty = true;
        }
        super.setOrientation(i7);
    }

    public void setShapeAppearance(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.groupStateListShapeAppearance = new StateListShapeAppearanceModel.Builder(shapeAppearanceModel).build();
        this.childShapesDirty = true;
        updateChildShapes();
        invalidate();
    }

    public void setSpacing(@Px int i7) {
        this.spacing = i7;
        invalidate();
        requestLayout();
    }

    @RestrictTo({c.f39801b})
    public void setStateListShapeAppearance(@Nullable StateListShapeAppearanceModel stateListShapeAppearanceModel) {
        this.groupStateListShapeAppearance = stateListShapeAppearanceModel;
        this.childShapesDirty = true;
        updateChildShapes();
        invalidate();
    }

    @VisibleForTesting
    public void updateChildShapes() {
        int iSwapCornerPositionRtl;
        if (!(this.innerCornerSize == null && this.groupStateListShapeAppearance == null) && this.childShapesDirty) {
            this.childShapesDirty = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i7 = 0;
            while (i7 < childCount) {
                MaterialButton childButton = getChildButton(i7);
                if (childButton.getVisibility() != 8) {
                    boolean z3 = i7 == firstVisibleChildIndex;
                    boolean z8 = i7 == lastVisibleChildIndex;
                    StateListShapeAppearanceModel.Builder originalStateListShapeBuilder = getOriginalStateListShapeBuilder(z3, z8, i7);
                    boolean z10 = getOrientation() == 0;
                    boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
                    if (z10) {
                        iSwapCornerPositionRtl = z3 ? 5 : 0;
                        if (z8) {
                            iSwapCornerPositionRtl |= 10;
                        }
                        if (zIsLayoutRtl) {
                            iSwapCornerPositionRtl = StateListShapeAppearanceModel.swapCornerPositionRtl(iSwapCornerPositionRtl);
                        }
                    } else {
                        iSwapCornerPositionRtl = z3 ? 3 : 0;
                        if (z8) {
                            iSwapCornerPositionRtl |= 12;
                        }
                    }
                    StateListShapeAppearanceModel stateListShapeAppearanceModelBuild = originalStateListShapeBuilder.setCornerSizeOverride(this.innerCornerSize, ~iSwapCornerPositionRtl).build();
                    if (stateListShapeAppearanceModelBuild.isStateful()) {
                        childButton.setStateListShapeAppearanceModel(stateListShapeAppearanceModelBuild);
                    } else {
                        childButton.setShapeAppearanceModel(stateListShapeAppearanceModelBuild.getDefaultShape(true));
                    }
                }
                i7++;
            }
        }
    }

    public MaterialButtonGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        int i10 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i7, i10), attributeSet, i7);
        this.originalChildShapeAppearanceModels = new ArrayList();
        this.originalChildStateListShapeAppearanceModels = new ArrayList();
        this.pressedStateTracker = new PressedStateTracker();
        this.childOrderComparator = new b(this, 4);
        this.childShapesDirty = true;
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.MaterialButtonGroup, i7, i10, new int[0]);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.MaterialButtonGroup_buttonSizeChange)) {
            this.buttonSizeChange = StateListSizeChange.create(context2, typedArrayObtainStyledAttributes, R.styleable.MaterialButtonGroup_buttonSizeChange);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.MaterialButtonGroup_shapeAppearance)) {
            StateListShapeAppearanceModel stateListShapeAppearanceModelCreate = StateListShapeAppearanceModel.create(context2, typedArrayObtainStyledAttributes, R.styleable.MaterialButtonGroup_shapeAppearance);
            this.groupStateListShapeAppearance = stateListShapeAppearanceModelCreate;
            if (stateListShapeAppearanceModelCreate == null) {
                this.groupStateListShapeAppearance = new StateListShapeAppearanceModel.Builder(ShapeAppearanceModel.builder(context2, typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialButtonGroup_shapeAppearance, 0), typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialButtonGroup_shapeAppearanceOverlay, 0)).build()).build();
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.MaterialButtonGroup_innerCornerSize)) {
            this.innerCornerSize = StateListCornerSize.create(context2, typedArrayObtainStyledAttributes, R.styleable.MaterialButtonGroup_innerCornerSize, new AbsoluteCornerSize(0.0f));
        }
        this.spacing = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialButtonGroup_android_spacing, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialButtonGroup_android_enabled, true));
        typedArrayObtainStyledAttributes.recycle();
    }
}
