package com.facebook.react.uimanager;

import C0.G;
import E.AbstractC0198c;
import H3.e;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Trace;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.Nullable;
import com.facebook.react.R;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.touch.JSResponderHandler;
import com.facebook.react.uimanager.layoutanimation.LayoutAnimationController;
import com.facebook.react.uimanager.layoutanimation.LayoutAnimationListener;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.concurrent.NotThreadSafe;

/* JADX INFO: loaded from: classes.dex */
@NotThreadSafe
public class NativeViewHierarchyManager {
    private static final String TAG;
    private final boolean DEBUG_MODE;
    private final RectF mBoundingBox;
    private final JSResponderHandler mJSResponderHandler;
    private volatile boolean mLayoutAnimationEnabled;
    private final LayoutAnimationController mLayoutAnimator;
    private HashMap<Integer, Set<Integer>> mPendingDeletionsForTag;
    private final SparseBooleanArray mRootTags;
    private final RootViewManager mRootViewManager;
    private final SparseArray<ViewManager> mTagsToViewManagers;
    private final SparseArray<View> mTagsToViews;
    private final ViewManagerRegistry mViewManagers;

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("NativeViewHierarchyManager", LegacyArchitectureLogLevel.ERROR);
        TAG = "NativeViewHierarchyManager";
    }

    public NativeViewHierarchyManager(ViewManagerRegistry viewManagerRegistry) {
        this(viewManagerRegistry, new RootViewManager());
    }

    private boolean arrayContains(@Nullable int[] iArr, int i7) {
        if (iArr == null) {
            return false;
        }
        for (int i10 : iArr) {
            if (i10 == i7) {
                return true;
            }
        }
        return false;
    }

    private void computeBoundingBox(View view, int[] iArr) {
        this.mBoundingBox.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        mapRectFromViewToWindowCoords(view, this.mBoundingBox);
        iArr[0] = Math.round(this.mBoundingBox.left);
        iArr[1] = Math.round(this.mBoundingBox.top);
        RectF rectF = this.mBoundingBox;
        iArr[2] = Math.round(rectF.right - rectF.left);
        RectF rectF2 = this.mBoundingBox;
        iArr[3] = Math.round(rectF2.bottom - rectF2.top);
    }

    private static String constructManageChildrenErrorMessage(ViewGroup viewGroup, ViewGroupManager viewGroupManager, @Nullable int[] iArr, @Nullable ViewAtIndex[] viewAtIndexArr, @Nullable int[] iArr2) {
        StringBuilder sb2 = new StringBuilder();
        if (viewGroup != null) {
            sb2.append("View tag:" + viewGroup.getId() + " View Type:" + viewGroup.getClass().toString() + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            StringBuilder sb3 = new StringBuilder("  children(");
            sb3.append(viewGroupManager.getChildCount(viewGroup));
            sb3.append("): [\n");
            sb2.append(sb3.toString());
            for (int i7 = 0; viewGroupManager.getChildAt(viewGroup, i7) != null; i7 += 16) {
                int i10 = 0;
                while (true) {
                    int i11 = i7 + i10;
                    if (viewGroupManager.getChildAt(viewGroup, i11) == null || i10 >= 16) {
                        break;
                    }
                    sb2.append(viewGroupManager.getChildAt(viewGroup, i11).getId() + ",");
                    i10++;
                }
                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            }
            sb2.append(" ],\n");
        }
        if (iArr != null) {
            sb2.append("  indicesToRemove(" + iArr.length + "): [\n");
            for (int i12 = 0; i12 < iArr.length; i12 += 16) {
                int i13 = 0;
                while (true) {
                    int i14 = i12 + i13;
                    if (i14 >= iArr.length || i13 >= 16) {
                        break;
                    }
                    sb2.append(iArr[i14] + ",");
                    i13++;
                }
                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            }
            sb2.append(" ],\n");
        }
        if (viewAtIndexArr != null) {
            sb2.append("  viewsToAdd(" + viewAtIndexArr.length + "): [\n");
            for (int i15 = 0; i15 < viewAtIndexArr.length; i15 += 16) {
                int i16 = 0;
                while (true) {
                    int i17 = i15 + i16;
                    if (i17 >= viewAtIndexArr.length || i16 >= 16) {
                        break;
                    }
                    sb2.append("[" + viewAtIndexArr[i17].mIndex + "," + viewAtIndexArr[i17].mTag + "],");
                    i16++;
                }
                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            }
            sb2.append(" ],\n");
        }
        if (iArr2 != null) {
            sb2.append("  tagsToDelete(" + iArr2.length + "): [\n");
            for (int i18 = 0; i18 < iArr2.length; i18 += 16) {
                int i19 = 0;
                while (true) {
                    int i20 = i18 + i19;
                    if (i20 >= iArr2.length || i19 >= 16) {
                        break;
                    }
                    sb2.append(iArr2[i20] + ",");
                    i19++;
                }
                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            }
            sb2.append(" ]\n");
        }
        return sb2.toString();
    }

    private static String constructSetChildrenErrorMessage(ViewGroup viewGroup, ViewGroupManager viewGroupManager, ReadableArray readableArray) {
        ViewAtIndex[] viewAtIndexArr = new ViewAtIndex[readableArray.size()];
        for (int i7 = 0; i7 < readableArray.size(); i7++) {
            viewAtIndexArr[i7] = new ViewAtIndex(readableArray.getInt(i7), i7);
        }
        return constructManageChildrenErrorMessage(viewGroup, viewGroupManager, null, viewAtIndexArr, null);
    }

    private Set<Integer> getPendingDeletionsForTag(int i7) {
        if (this.mPendingDeletionsForTag == null) {
            this.mPendingDeletionsForTag = new HashMap<>();
        }
        if (!this.mPendingDeletionsForTag.containsKey(Integer.valueOf(i7))) {
            this.mPendingDeletionsForTag.put(Integer.valueOf(i7), new HashSet());
        }
        return this.mPendingDeletionsForTag.get(Integer.valueOf(i7));
    }

    private ThemedReactContext getReactContextForView(int i7) {
        View view = this.mTagsToViews.get(i7);
        if (view != null) {
            return (ThemedReactContext) view.getContext();
        }
        throw new JSApplicationIllegalArgumentException(G.m(i7, "Could not find view with tag "));
    }

    private void mapRectFromViewToWindowCoords(View view, RectF rectF) {
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.mapRect(rectF);
        }
        rectF.offset(view.getLeft(), view.getTop());
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            Matrix matrix2 = view2.getMatrix();
            if (!matrix2.isIdentity()) {
                matrix2.mapRect(rectF);
            }
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
    }

    public synchronized void addRootView(int i7, View view) {
        addRootViewGroup(i7, view);
    }

    public final synchronized void addRootViewGroup(int i7, View view) {
        try {
            if (this.DEBUG_MODE) {
                p229p2.a.d(TAG, "addRootViewGroup[%d]: %s", Integer.valueOf(i7), view != null ? view.toString() : "<null>");
            }
            if (view.getId() != -1) {
                p229p2.a.h(TAG, "Trying to add a root view with an explicit id (" + view.getId() + ") already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
            }
            this.mTagsToViews.put(i7, view);
            this.mTagsToViewManagers.put(i7, this.mRootViewManager);
            this.mRootTags.put(i7, true);
            view.setId(i7);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void clearJSResponder() {
        this.mJSResponderHandler.clearJSResponder();
    }

    public synchronized void clearLayoutAnimation() {
        this.mLayoutAnimator.reset();
    }

    public synchronized void configureLayoutAnimation(ReadableMap readableMap, Callback callback) {
        this.mLayoutAnimator.initializeFromConfig(readableMap, callback);
    }

    public synchronized void createView(ThemedReactContext themedReactContext, int i7, String str, @Nullable ReactStylesDiffMap reactStylesDiffMap) {
        try {
            if (this.DEBUG_MODE) {
                p229p2.a.b(TAG, "createView[%d]: %s %s", Integer.valueOf(i7), str, reactStylesDiffMap != null ? reactStylesDiffMap.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            p1.d dVarD = AbstractC0198c.d("NativeViewHierarchyManager_createView");
            dVarD.b(i7, "tag");
            dVarD.c(str, "className");
            dVarD.e();
            try {
                ViewManager<?, ?> viewManager = this.mViewManagers.get(str);
                this.mTagsToViews.put(i7, viewManager.createView(i7, themedReactContext, reactStylesDiffMap, null, this.mJSResponderHandler));
                this.mTagsToViewManagers.put(i7, viewManager);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Deprecated
    public synchronized void dispatchCommand(int i7, int i10, @Nullable ReadableArray readableArray) {
        try {
            if (this.DEBUG_MODE) {
                p229p2.a.b(TAG, "dispatchCommand[%d]: %d %s", Integer.valueOf(i7), Integer.valueOf(i10), readableArray != null ? readableArray.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            View view = this.mTagsToViews.get(i7);
            if (view == null) {
                throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i7 + "] and command " + i10);
            }
            resolveViewManager(i7).receiveCommand(view, i10, readableArray);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void dropView(View view) {
        try {
            if (this.DEBUG_MODE) {
                p229p2.a.c(TAG, "dropView[%d]", Integer.valueOf(view != null ? view.getId() : -1));
            }
            UiThreadUtil.assertOnUiThread();
            if (view == null) {
                return;
            }
            if (this.mTagsToViewManagers.get(view.getId()) == null) {
                return;
            }
            if (!this.mRootTags.get(view.getId())) {
                resolveViewManager(view.getId()).onDropViewInstance(view);
            }
            ViewManager viewManager = this.mTagsToViewManagers.get(view.getId());
            if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
                ViewGroup viewGroup = (ViewGroup) view;
                ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
                for (int childCount = viewGroupManager.getChildCount(viewGroup) - 1; childCount >= 0; childCount--) {
                    View childAt = viewGroupManager.getChildAt(viewGroup, childCount);
                    if (childAt == null) {
                        p229p2.a.h(TAG, "Unable to drop null child view");
                    } else if (this.mTagsToViews.get(childAt.getId()) != null) {
                        dropView(childAt);
                    }
                }
                viewGroupManager.removeAllViews(viewGroup);
            }
            this.mTagsToViews.remove(view.getId());
            this.mTagsToViewManagers.remove(view.getId());
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int findTargetTagForTouch(int i7, float f10, float f11) {
        View view;
        try {
            if (this.DEBUG_MODE) {
                p229p2.a.b(TAG, "findTargetTagForTouch[%d]: %f %f", Integer.valueOf(i7), Float.valueOf(f10), Float.valueOf(f11));
            }
            UiThreadUtil.assertOnUiThread();
            view = this.mTagsToViews.get(i7);
            if (view == null) {
                throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i7);
            }
        } catch (Throwable th) {
            throw th;
        }
        return TouchTargetHelper.findTargetTagForTouch(f10, f11, (ViewGroup) view);
    }

    @Nullable
    public synchronized long getInstanceHandle(int i7) {
        Long l5;
        View view = this.mTagsToViews.get(i7);
        if (view == null) {
            throw new IllegalViewOperationException("Unable to find view for tag: " + i7);
        }
        l5 = (Long) view.getTag(R.id.view_tag_instance_handle);
        if (l5 == null) {
            throw new IllegalViewOperationException("Unable to find instanceHandle for tag: " + i7);
        }
        return l5.longValue();
    }

    public synchronized int getRootViewNum() {
        return this.mRootTags.size();
    }

    public synchronized void manageChildren(int i7, @Nullable int[] iArr, @Nullable ViewAtIndex[] viewAtIndexArr, @Nullable int[] iArr2) throws Throwable {
        Throwable th;
        final int i10;
        try {
            try {
                if (this.DEBUG_MODE) {
                    try {
                        String str = TAG;
                        String string = iArr != null ? iArr.toString() : "<null>";
                        String string2 = viewAtIndexArr != null ? viewAtIndexArr.toString() : "<null>";
                        String string3 = iArr2 != null ? iArr2.toString() : "<null>";
                        p229p2.b bVar = p229p2.a.f41180a;
                        if (bVar.isLoggable(3)) {
                            bVar.getClass();
                            p229p2.b.a(3, str, "createView[" + i7 + "]: " + string + " " + string2 + " " + string3);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                UiThreadUtil.assertOnUiThread();
                final Set<Integer> pendingDeletionsForTag = getPendingDeletionsForTag(i7);
                final ViewGroup viewGroup = (ViewGroup) this.mTagsToViews.get(i7);
                final ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i7);
                if (viewGroup == null) {
                    throw new IllegalViewOperationException("Trying to manageChildren view with tag " + i7 + " which doesn't exist\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                }
                int childCount = viewGroupManager.getChildCount(viewGroup);
                if (iArr != null) {
                    int length = iArr.length - 1;
                    while (length >= 0) {
                        int i11 = iArr[length];
                        if (i11 < 0) {
                            throw new IllegalViewOperationException("Trying to remove a negative view index:" + i11 + " view tag: " + i7 + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                        }
                        if (viewGroupManager.getChildAt(viewGroup, i11) == null) {
                            if (this.mRootTags.get(i7) && viewGroupManager.getChildCount(viewGroup) == 0) {
                                return;
                            }
                            throw new IllegalViewOperationException("Trying to remove a view index above child count " + i11 + " view tag: " + i7 + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                        }
                        if (i11 >= childCount) {
                            throw new IllegalViewOperationException("Trying to remove an out of order view index:" + i11 + " view tag: " + i7 + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                        }
                        View childAt = viewGroupManager.getChildAt(viewGroup, i11);
                        if (!this.mLayoutAnimationEnabled || !this.mLayoutAnimator.shouldAnimateLayout(childAt) || !arrayContains(iArr2, childAt.getId())) {
                            viewGroupManager.removeViewAt(viewGroup, i11);
                        }
                        length--;
                        childCount = i11;
                    }
                }
                if (iArr2 != null) {
                    int i12 = 0;
                    while (i12 < iArr2.length) {
                        int i13 = iArr2[i12];
                        final View view = this.mTagsToViews.get(i13);
                        if (view == null) {
                            throw new IllegalViewOperationException("Trying to destroy unknown view tag: " + i13 + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                        }
                        if (this.mLayoutAnimationEnabled && this.mLayoutAnimator.shouldAnimateLayout(view)) {
                            pendingDeletionsForTag.add(Integer.valueOf(i13));
                            i10 = i7;
                            this.mLayoutAnimator.deleteView(view, new LayoutAnimationListener() { // from class: com.facebook.react.uimanager.NativeViewHierarchyManager.1
                                @Override // com.facebook.react.uimanager.layoutanimation.LayoutAnimationListener
                                public void onAnimationEnd() {
                                    UiThreadUtil.assertOnUiThread();
                                    viewGroupManager.removeView(viewGroup, view);
                                    NativeViewHierarchyManager.this.dropView(view);
                                    pendingDeletionsForTag.remove(Integer.valueOf(view.getId()));
                                    if (pendingDeletionsForTag.isEmpty()) {
                                        NativeViewHierarchyManager.this.mPendingDeletionsForTag.remove(Integer.valueOf(i10));
                                    }
                                }
                            });
                        } else {
                            i10 = i7;
                            dropView(view);
                        }
                        i12++;
                        i7 = i10;
                    }
                }
                int i14 = i7;
                if (viewAtIndexArr != null) {
                    for (ViewAtIndex viewAtIndex : viewAtIndexArr) {
                        View view2 = this.mTagsToViews.get(viewAtIndex.mTag);
                        if (view2 == null) {
                            throw new IllegalViewOperationException("Trying to add unknown view tag: " + viewAtIndex.mTag + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                        }
                        int i15 = viewAtIndex.mIndex;
                        if (!pendingDeletionsForTag.isEmpty()) {
                            i15 = 0;
                            int i16 = 0;
                            while (i15 < viewGroup.getChildCount() && i16 != viewAtIndex.mIndex) {
                                if (!pendingDeletionsForTag.contains(Integer.valueOf(viewGroup.getChildAt(i15).getId()))) {
                                    i16++;
                                }
                                i15++;
                            }
                        }
                        viewGroupManager.addView(viewGroup, view2, i15);
                    }
                }
                if (pendingDeletionsForTag.isEmpty()) {
                    this.mPendingDeletionsForTag.remove(Integer.valueOf(i14));
                }
                return;
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    public synchronized void measure(int i7, int[] iArr) {
        try {
            if (this.DEBUG_MODE) {
                p229p2.a.c(TAG, "measure[%d]", Integer.valueOf(i7));
            }
            UiThreadUtil.assertOnUiThread();
            View view = this.mTagsToViews.get(i7);
            if (view == null) {
                throw new NoSuchNativeViewException("No native view for " + i7 + " currently exists");
            }
            View view2 = (View) RootViewUtil.getRootView(view);
            if (view2 == null) {
                throw new NoSuchNativeViewException("Native view " + i7 + " is no longer on screen");
            }
            computeBoundingBox(view2, iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            computeBoundingBox(view, iArr);
            iArr[0] = iArr[0] - i10;
            iArr[1] = iArr[1] - i11;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void measureInWindow(int i7, int[] iArr) {
        try {
            if (this.DEBUG_MODE) {
                p229p2.a.c(TAG, "measureInWindow[%d]", Integer.valueOf(i7));
            }
            UiThreadUtil.assertOnUiThread();
            View view = this.mTagsToViews.get(i7);
            if (view == null) {
                throw new NoSuchNativeViewException("No native view for " + i7 + " currently exists");
            }
            view.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            iArr[0] = iArr[0] - rect.left;
            iArr[1] = iArr[1] - rect.top;
            iArr[2] = view.getWidth();
            iArr[3] = view.getHeight();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void removeRootView(int i7) {
        try {
            if (this.DEBUG_MODE) {
                p229p2.a.c(TAG, "removeRootView[%d]", Integer.valueOf(i7));
            }
            UiThreadUtil.assertOnUiThread();
            if (!this.mRootTags.get(i7)) {
                SoftAssertions.assertUnreachable("View with tag " + i7 + " is not registered as a root view");
            }
            View view = this.mTagsToViews.get(i7);
            dropView(view);
            this.mRootTags.delete(i7);
            if (view != null) {
                view.setId(-1);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized View resolveView(int i7) {
        View view;
        view = this.mTagsToViews.get(i7);
        if (view == null) {
            throw new IllegalViewOperationException("Trying to resolve view with tag " + i7 + " which doesn't exist");
        }
        return view;
    }

    public final synchronized ViewManager resolveViewManager(int i7) {
        ViewManager viewManager;
        viewManager = this.mTagsToViewManagers.get(i7);
        if (viewManager == null) {
            throw new IllegalViewOperationException("ViewManager for tag " + i7 + " could not be found.\n");
        }
        return viewManager;
    }

    public synchronized void sendAccessibilityEvent(int i7, int i10) {
        View view = this.mTagsToViews.get(i7);
        if (view == null) {
            throw new RetryableMountingLayerException("Could not find view with tag " + i7);
        }
        view.sendAccessibilityEvent(i10);
    }

    public synchronized void setChildren(int i7, ReadableArray readableArray) {
        try {
            if (this.DEBUG_MODE) {
                p229p2.a.d(TAG, "setChildren[%d]: %s", Integer.valueOf(i7), readableArray != null ? readableArray.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            ViewGroup viewGroup = (ViewGroup) this.mTagsToViews.get(i7);
            ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i7);
            for (int i10 = 0; i10 < readableArray.size(); i10++) {
                View view = this.mTagsToViews.get(readableArray.getInt(i10));
                if (view == null) {
                    throw new IllegalViewOperationException("Trying to add unknown view tag: " + readableArray.getInt(i10) + "\n detail: " + constructSetChildrenErrorMessage(viewGroup, viewGroupManager, readableArray));
                }
                viewGroupManager.addView(viewGroup, view, i10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void setJSResponder(int i7, int i10, boolean z3) {
        try {
            if (!z3) {
                this.mJSResponderHandler.setJSResponder(i10, null);
                return;
            }
            View view = this.mTagsToViews.get(i7);
            if (i10 != i7 && (view instanceof ViewParent)) {
                this.mJSResponderHandler.setJSResponder(i10, (ViewParent) view);
                return;
            }
            if (this.mRootTags.get(i7)) {
                SoftAssertions.assertUnreachable("Cannot block native responder on " + i7 + " that is a root view");
            }
            this.mJSResponderHandler.setJSResponder(i10, view.getParent());
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setLayoutAnimationEnabled(boolean z3) {
        this.mLayoutAnimationEnabled = z3;
    }

    public synchronized void updateInstanceHandle(int i7, long j6) {
        UiThreadUtil.assertOnUiThread();
        try {
            updateInstanceHandle(resolveView(i7), j6);
        } catch (IllegalViewOperationException e10) {
            p229p2.a.i(TAG, "Unable to update properties for view tag " + i7, e10);
        }
    }

    @Deprecated
    public void updateLayout(int i7, int i10, int i11, int i12, int i13) throws Throwable {
        updateLayout(i7, i7, i10, i11, i12, i13, e.INHERIT);
    }

    public synchronized void updateProperties(int i7, ReactStylesDiffMap reactStylesDiffMap) {
        try {
            if (this.DEBUG_MODE) {
                p229p2.a.d(TAG, "updateProperties[%d]: %s", Integer.valueOf(i7), reactStylesDiffMap.toString());
            }
            UiThreadUtil.assertOnUiThread();
            try {
                ViewManager viewManagerResolveViewManager = resolveViewManager(i7);
                View viewResolveView = resolveView(i7);
                if (reactStylesDiffMap != null) {
                    viewManagerResolveViewManager.updateProperties(viewResolveView, reactStylesDiffMap);
                }
            } catch (IllegalViewOperationException e10) {
                p229p2.a.i(TAG, "Unable to update properties for view tag " + i7, e10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void updateViewExtraData(int i7, Object obj) {
        try {
            if (this.DEBUG_MODE) {
                p229p2.a.d(TAG, "updateViewExtraData[%d]: %s", Integer.valueOf(i7), obj.toString());
            }
            UiThreadUtil.assertOnUiThread();
            resolveViewManager(i7).updateExtraData(resolveView(i7), obj);
        } catch (Throwable th) {
            throw th;
        }
    }

    public NativeViewHierarchyManager(ViewManagerRegistry viewManagerRegistry, RootViewManager rootViewManager) {
        ReactBuildConfig reactBuildConfig = ReactBuildConfig.INSTANCE;
        this.DEBUG_MODE = false;
        this.mJSResponderHandler = new JSResponderHandler();
        this.mLayoutAnimator = new LayoutAnimationController();
        this.mBoundingBox = new RectF();
        this.mViewManagers = viewManagerRegistry;
        this.mTagsToViews = new SparseArray<>();
        this.mTagsToViewManagers = new SparseArray<>();
        this.mRootTags = new SparseBooleanArray();
        this.mRootViewManager = rootViewManager;
    }

    public synchronized void updateLayout(int i7, int i10, int i11, int i12, int i13, int i14, e eVar) throws Throwable {
        Throwable th;
        Throwable th2;
        try {
            try {
                if (this.DEBUG_MODE) {
                    try {
                        String str = TAG;
                        if (p229p2.a.f41180a.isLoggable(3)) {
                            p229p2.a.a(str, "updateLayout[" + i10 + "]->[" + i7 + "]: " + i11 + " " + i12 + " " + i13 + " " + i14);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
                UiThreadUtil.assertOnUiThread();
                p1.d dVarD = AbstractC0198c.d("NativeViewHierarchyManager_updateLayout");
                dVarD.b(i7, "parentTag");
                dVarD.b(i10, "tag");
                dVarD.e();
                try {
                    View viewResolveView = resolveView(i10);
                    viewResolveView.setLayoutDirection(LayoutDirectionUtil.toAndroidFromYoga(eVar));
                    viewResolveView.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
                    ViewParent parent = viewResolveView.getParent();
                    if (parent instanceof RootView) {
                        try {
                            parent.requestLayout();
                        } catch (Throwable th4) {
                            th2 = th4;
                            Trace.endSection();
                            throw th2;
                        }
                    }
                    if (this.mRootTags.get(i7)) {
                        try {
                            updateLayout(viewResolveView, i11, i12, i13, i14);
                        } catch (Throwable th5) {
                            th = th5;
                            th2 = th;
                            Trace.endSection();
                            throw th2;
                        }
                    } else {
                        NativeModule nativeModule = (ViewManager) this.mTagsToViewManagers.get(i7);
                        if (!(nativeModule instanceof IViewManagerWithChildren)) {
                            throw new IllegalViewOperationException("Trying to use view with tag " + i7 + " as a parent, but its Manager doesn't implement IViewManagerWithChildren");
                        }
                        IViewManagerWithChildren iViewManagerWithChildren = (IViewManagerWithChildren) nativeModule;
                        if (iViewManagerWithChildren != null && !iViewManagerWithChildren.needsCustomLayoutForChildren()) {
                            updateLayout(viewResolveView, i11, i12, i13, i14);
                        }
                    }
                    Trace.endSection();
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
                th = th;
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            th = th;
            throw th;
        }
    }

    private void updateInstanceHandle(View view, long j6) {
        UiThreadUtil.assertOnUiThread();
        view.setTag(R.id.view_tag_instance_handle, Long.valueOf(j6));
    }

    public synchronized void dispatchCommand(int i7, String str, @Nullable ReadableArray readableArray) {
        try {
            if (this.DEBUG_MODE) {
                p229p2.a.b(TAG, "dispatchCommand[%d]: %s %s", Integer.valueOf(i7), str, readableArray != null ? readableArray.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            View view = this.mTagsToViews.get(i7);
            if (view != null) {
                resolveViewManager(i7).receiveCommand(view, str, readableArray);
            } else {
                throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i7 + "] and command " + str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void updateLayout(View view, int i7, int i10, int i11, int i12) {
        if (this.mLayoutAnimationEnabled && this.mLayoutAnimator.shouldAnimateLayout(view)) {
            this.mLayoutAnimator.applyLayoutUpdate(view, i7, i10, i11, i12);
        } else {
            view.layout(i7, i10, i7 + i11, i10 + i12);
        }
    }
}
