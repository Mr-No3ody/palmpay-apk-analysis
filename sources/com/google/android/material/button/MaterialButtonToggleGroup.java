package com.google.android.material.button;

import Sd.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.annotation.BoolRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.C1050b;
import androidx.core.view.N;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.StateListCornerSize;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p045d3.k;
import p074f0.d;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends MaterialButtonGroup {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_MaterialButtonToggleGroup;
    private static final String LOG_TAG = "MButtonToggleGroup";
    private Set<Integer> checkedIds;

    @IdRes
    private final int defaultCheckId;
    private final LinkedHashSet<OnButtonCheckedListener> onButtonCheckedListeners;
    private boolean selectionRequired;
    private boolean singleSelection;
    private boolean skipCheckedStateTracker;

    public interface OnButtonCheckedListener {
        void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, @IdRes int i7, boolean z3);
    }

    public MaterialButtonToggleGroup(@NonNull Context context) {
        this(context, null);
    }

    private void checkInternal(@IdRes int i7, boolean z3) {
        if (i7 == -1) {
            Log.e(LOG_TAG, "Button ID is not valid: " + i7);
            return;
        }
        HashSet hashSet = new HashSet(this.checkedIds);
        if (z3 && !hashSet.contains(Integer.valueOf(i7))) {
            if (this.singleSelection && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i7));
        } else {
            if (z3 || !hashSet.contains(Integer.valueOf(i7))) {
                return;
            }
            if (!this.selectionRequired || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i7));
            }
        }
        updateCheckedIds(hashSet);
    }

    private void dispatchOnButtonChecked(@IdRes int i7, boolean z3) {
        Iterator<OnButtonCheckedListener> it = this.onButtonCheckedListeners.iterator();
        while (it.hasNext()) {
            it.next().onButtonChecked(this, i7, z3);
        }
    }

    @NonNull
    private String getChildrenA11yClassName() {
        return (this.singleSelection ? RadioButton.class : ToggleButton.class).getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getIndexWithinVisibleButtons(@Nullable View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) == view) {
                return i7;
            }
            if ((getChildAt(i10) instanceof MaterialButton) && isChildVisible(i10)) {
                i7++;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i7 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if ((getChildAt(i10) instanceof MaterialButton) && isChildVisible(i10)) {
                i7++;
            }
        }
        return i7;
    }

    private boolean isChildVisible(int i7) {
        return getChildAt(i7).getVisibility() != 8;
    }

    private void setCheckedStateForView(@IdRes int i7, boolean z3) {
        View viewFindViewById = findViewById(i7);
        if (viewFindViewById instanceof MaterialButton) {
            this.skipCheckedStateTracker = true;
            ((MaterialButton) viewFindViewById).setChecked(z3);
            this.skipCheckedStateTracker = false;
        }
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    private void updateCheckedIds(Set<Integer> set) {
        Set<Integer> set2 = this.checkedIds;
        this.checkedIds = new HashSet(set);
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            int id2 = getChildButton(i7).getId();
            setCheckedStateForView(id2, set.contains(Integer.valueOf(id2)));
            if (set2.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                dispatchOnButtonChecked(id2, set.contains(Integer.valueOf(id2)));
            }
        }
        invalidate();
    }

    private void updateChildrenA11yClassName() {
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            getChildButton(i7).setA11yClassName(childrenA11yClassName);
        }
    }

    public void addOnButtonCheckedListener(@NonNull OnButtonCheckedListener onButtonCheckedListener) {
        this.onButtonCheckedListeners.add(onButtonCheckedListener);
    }

    @Override // com.google.android.material.button.MaterialButtonGroup, android.view.ViewGroup
    public void addView(@NonNull View view, int i7, @NonNull ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(LOG_TAG, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i7, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        checkInternal(materialButton.getId(), materialButton.isChecked());
        N.q(materialButton, new C1050b() { // from class: com.google.android.material.button.MaterialButtonToggleGroup.1
            @Override // androidx.core.view.C1050b
            public void onInitializeAccessibilityNodeInfo(View view2, @NonNull d dVar) {
                super.onInitializeAccessibilityNodeInfo(view2, dVar);
                dVar.n(k.h(0, 1, MaterialButtonToggleGroup.this.getIndexWithinVisibleButtons(view2), 1, false, ((MaterialButton) view2).isChecked()));
            }
        });
    }

    public void check(@IdRes int i7) {
        checkInternal(i7, true);
    }

    public void clearChecked() {
        updateCheckedIds(new HashSet());
    }

    public void clearOnButtonCheckedListeners() {
        this.onButtonCheckedListeners.clear();
    }

    @IdRes
    public int getCheckedButtonId() {
        if (!this.singleSelection || this.checkedIds.isEmpty()) {
            return -1;
        }
        return this.checkedIds.iterator().next().intValue();
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            int id2 = getChildButton(i7).getId();
            if (this.checkedIds.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    public boolean isSelectionRequired() {
        return this.selectionRequired;
    }

    public boolean isSingleSelection() {
        return this.singleSelection;
    }

    public void onButtonCheckedStateChanged(@NonNull MaterialButton materialButton, boolean z3) {
        if (this.skipCheckedStateTracker) {
            return;
        }
        checkInternal(materialButton.getId(), z3);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i7 = this.defaultCheckId;
        if (i7 != -1) {
            updateCheckedIds(Collections.singleton(Integer.valueOf(i7)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) b.c(1, getVisibleButtonCount(), isSingleSelection() ? 1 : 2, false).f8871b);
    }

    public void removeOnButtonCheckedListener(@NonNull OnButtonCheckedListener onButtonCheckedListener) {
        this.onButtonCheckedListeners.remove(onButtonCheckedListener);
    }

    public void setSelectionRequired(boolean z3) {
        this.selectionRequired = z3;
    }

    public void setSingleSelection(boolean z3) {
        if (this.singleSelection != z3) {
            this.singleSelection = z3;
            clearChecked();
        }
        updateChildrenA11yClassName();
    }

    public void uncheck(@IdRes int i7) {
        checkInternal(i7, false);
    }

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonToggleGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        int i10 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i7, i10), attributeSet, i7);
        this.onButtonCheckedListeners = new LinkedHashSet<>();
        this.skipCheckedStateTracker = false;
        this.checkedIds = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(getContext(), attributeSet, R.styleable.MaterialButtonToggleGroup, i7, i10, new int[0]);
        setSingleSelection(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialButtonToggleGroup_singleSelection, false));
        this.defaultCheckId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialButtonToggleGroup_checkedButton, -1);
        this.selectionRequired = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialButtonToggleGroup_selectionRequired, false);
        if (this.innerCornerSize == null) {
            this.innerCornerSize = StateListCornerSize.create(new AbsoluteCornerSize(0.0f));
        }
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialButtonToggleGroup_android_enabled, true));
        typedArrayObtainStyledAttributes.recycle();
        setImportantForAccessibility(1);
    }

    public void setSingleSelection(@BoolRes int i7) {
        setSingleSelection(getResources().getBoolean(i7));
    }
}
