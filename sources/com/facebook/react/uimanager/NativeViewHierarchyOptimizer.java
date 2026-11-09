package com.facebook.react.uimanager;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;

/* JADX INFO: loaded from: classes.dex */
public class NativeViewHierarchyOptimizer {
    private static final boolean ENABLED = true;
    private static final String TAG = "NativeViewHierarchyOptimizer";
    private final ShadowNodeRegistry mShadowNodeRegistry;
    private final SparseBooleanArray mTagsWithLayoutVisited = new SparseBooleanArray();
    private final UIViewOperationQueue mUIViewOperationQueue;

    public static class NodeIndexPair {
        public final int index;
        public final ReactShadowNode node;

        public NodeIndexPair(ReactShadowNode reactShadowNode, int i7) {
            this.node = reactShadowNode;
            this.index = i7;
        }
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture(TAG, LegacyArchitectureLogLevel.ERROR);
    }

    public NativeViewHierarchyOptimizer(UIViewOperationQueue uIViewOperationQueue, ShadowNodeRegistry shadowNodeRegistry) {
        this.mUIViewOperationQueue = uIViewOperationQueue;
        this.mShadowNodeRegistry = shadowNodeRegistry;
    }

    private void addGrandchildren(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i7) {
        p059e1.a.d(reactShadowNode2.getNativeKind() != NativeKind.PARENT);
        for (int i10 = 0; i10 < reactShadowNode2.getChildCount(); i10++) {
            ReactShadowNode childAt = reactShadowNode2.getChildAt(i10);
            p059e1.a.d(childAt.getNativeParent() == null);
            int nativeChildCount = reactShadowNode.getNativeChildCount();
            if (childAt.getNativeKind() == NativeKind.NONE) {
                addNonNativeChild(reactShadowNode, childAt, i7);
            } else {
                addNativeChild(reactShadowNode, childAt, i7);
            }
            i7 += reactShadowNode.getNativeChildCount() - nativeChildCount;
        }
    }

    private void addNativeChild(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i7) {
        reactShadowNode.addNativeChildAt(reactShadowNode2, i7);
        this.mUIViewOperationQueue.enqueueManageChildren(reactShadowNode.getReactTag(), null, new ViewAtIndex[]{new ViewAtIndex(reactShadowNode2.getReactTag(), i7)}, null);
        if (reactShadowNode2.getNativeKind() != NativeKind.PARENT) {
            addGrandchildren(reactShadowNode, reactShadowNode2, i7 + 1);
        }
    }

    private void addNodeToNode(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i7) {
        int nativeOffsetForChild = reactShadowNode.getNativeOffsetForChild(reactShadowNode.getChildAt(i7));
        if (reactShadowNode.getNativeKind() != NativeKind.PARENT) {
            NodeIndexPair nodeIndexPairWalkUpUntilNativeKindIsParent = walkUpUntilNativeKindIsParent(reactShadowNode, nativeOffsetForChild);
            if (nodeIndexPairWalkUpUntilNativeKindIsParent == null) {
                return;
            }
            ReactShadowNode reactShadowNode3 = nodeIndexPairWalkUpUntilNativeKindIsParent.node;
            nativeOffsetForChild = nodeIndexPairWalkUpUntilNativeKindIsParent.index;
            reactShadowNode = reactShadowNode3;
        }
        if (reactShadowNode2.getNativeKind() != NativeKind.NONE) {
            addNativeChild(reactShadowNode, reactShadowNode2, nativeOffsetForChild);
        } else {
            addNonNativeChild(reactShadowNode, reactShadowNode2, nativeOffsetForChild);
        }
    }

    private void addNonNativeChild(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i7) {
        addGrandchildren(reactShadowNode, reactShadowNode2, i7);
    }

    private void applyLayoutBase(ReactShadowNode reactShadowNode) {
        int reactTag = reactShadowNode.getReactTag();
        if (this.mTagsWithLayoutVisited.get(reactTag)) {
            return;
        }
        this.mTagsWithLayoutVisited.put(reactTag, true);
        int screenX = reactShadowNode.getScreenX();
        int screenY = reactShadowNode.getScreenY();
        for (ReactShadowNode parent = reactShadowNode.getParent(); parent != null && parent.getNativeKind() != NativeKind.PARENT; parent = parent.getParent()) {
            if (!parent.isVirtual()) {
                int iRound = Math.round(parent.getLayoutX()) + screenX;
                screenY = Math.round(parent.getLayoutY()) + screenY;
                screenX = iRound;
            }
        }
        applyLayoutRecursive(reactShadowNode, screenX, screenY);
    }

    private void applyLayoutRecursive(ReactShadowNode reactShadowNode, int i7, int i10) {
        if (reactShadowNode.getNativeKind() != NativeKind.NONE && reactShadowNode.getNativeParent() != null) {
            this.mUIViewOperationQueue.enqueueUpdateLayout(reactShadowNode.getLayoutParent().getReactTag(), reactShadowNode.getReactTag(), i7, i10, reactShadowNode.getScreenWidth(), reactShadowNode.getScreenHeight(), reactShadowNode.getLayoutDirection());
            return;
        }
        for (int i11 = 0; i11 < reactShadowNode.getChildCount(); i11++) {
            ReactShadowNode childAt = reactShadowNode.getChildAt(i11);
            int reactTag = childAt.getReactTag();
            if (!this.mTagsWithLayoutVisited.get(reactTag)) {
                this.mTagsWithLayoutVisited.put(reactTag, true);
                applyLayoutRecursive(childAt, childAt.getScreenX() + i7, childAt.getScreenY() + i10);
            }
        }
    }

    public static void assertNodeSupportedWithoutOptimizer(ReactShadowNode reactShadowNode) {
        p059e1.a.e(reactShadowNode.getNativeKind() != NativeKind.LEAF, "Nodes with NativeKind.LEAF are not supported when the optimizer is disabled");
    }

    public static void handleRemoveNode(ReactShadowNode reactShadowNode) {
        reactShadowNode.removeAllNativeChildren();
    }

    private static boolean isLayoutOnlyAndCollapsable(@Nullable ReactStylesDiffMap reactStylesDiffMap) {
        if (reactStylesDiffMap == null) {
            return true;
        }
        if (reactStylesDiffMap.hasKey(ViewProps.COLLAPSABLE) && !reactStylesDiffMap.getBoolean(ViewProps.COLLAPSABLE, true)) {
            return false;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = reactStylesDiffMap.getBackingMap().keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            if (!ViewProps.isLayoutOnly(reactStylesDiffMap.getBackingMap(), readableMapKeySetIteratorKeySetIterator.nextKey())) {
                return false;
            }
        }
        return true;
    }

    private void removeNodeFromParent(ReactShadowNode reactShadowNode, boolean z3) {
        if (reactShadowNode.getNativeKind() != NativeKind.PARENT) {
            for (int childCount = reactShadowNode.getChildCount() - 1; childCount >= 0; childCount--) {
                removeNodeFromParent(reactShadowNode.getChildAt(childCount), z3);
            }
        }
        ReactShadowNode nativeParent = reactShadowNode.getNativeParent();
        if (nativeParent != null) {
            int iIndexOfNativeChild = nativeParent.indexOfNativeChild(reactShadowNode);
            nativeParent.removeNativeChildAt(iIndexOfNativeChild);
            this.mUIViewOperationQueue.enqueueManageChildren(nativeParent.getReactTag(), new int[]{iIndexOfNativeChild}, null, z3 ? new int[]{reactShadowNode.getReactTag()} : null);
        }
    }

    private void transitionLayoutOnlyViewToNativeView(ReactShadowNode reactShadowNode, @Nullable ReactStylesDiffMap reactStylesDiffMap) {
        ReactShadowNode parent = reactShadowNode.getParent();
        if (parent == null) {
            reactShadowNode.setIsLayoutOnly(false);
            return;
        }
        int iIndexOf = parent.indexOf(reactShadowNode);
        parent.removeChildAt(iIndexOf);
        removeNodeFromParent(reactShadowNode, false);
        reactShadowNode.setIsLayoutOnly(false);
        this.mUIViewOperationQueue.enqueueCreateView(reactShadowNode.getThemedContext(), reactShadowNode.getReactTag(), reactShadowNode.getViewClass(), reactStylesDiffMap);
        parent.addChildAt(reactShadowNode, iIndexOf);
        addNodeToNode(parent, reactShadowNode, iIndexOf);
        for (int i7 = 0; i7 < reactShadowNode.getChildCount(); i7++) {
            addNodeToNode(reactShadowNode, reactShadowNode.getChildAt(i7), i7);
        }
        StringBuilder sb2 = new StringBuilder("Transitioning LayoutOnlyView - tag: ");
        sb2.append(reactShadowNode.getReactTag());
        sb2.append(" - rootTag: ");
        sb2.append(reactShadowNode.getRootTag());
        sb2.append(" - hasProps: ");
        sb2.append(reactStylesDiffMap != null);
        sb2.append(" - tagsWithLayout.size: ");
        sb2.append(this.mTagsWithLayoutVisited.size());
        p229p2.a.k(TAG, sb2.toString());
        p059e1.a.d(this.mTagsWithLayoutVisited.size() == 0);
        applyLayoutBase(reactShadowNode);
        for (int i10 = 0; i10 < reactShadowNode.getChildCount(); i10++) {
            applyLayoutBase(reactShadowNode.getChildAt(i10));
        }
        this.mTagsWithLayoutVisited.clear();
    }

    private NodeIndexPair walkUpUntilNativeKindIsParent(ReactShadowNode reactShadowNode, int i7) {
        while (reactShadowNode.getNativeKind() != NativeKind.PARENT) {
            ReactShadowNode parent = reactShadowNode.getParent();
            if (parent == null) {
                return null;
            }
            i7 = i7 + (reactShadowNode.getNativeKind() == NativeKind.LEAF ? 1 : 0) + parent.getNativeOffsetForChild(reactShadowNode);
            reactShadowNode = parent;
        }
        return new NodeIndexPair(reactShadowNode, i7);
    }

    public void handleCreateView(ReactShadowNode reactShadowNode, ThemedReactContext themedReactContext, @Nullable ReactStylesDiffMap reactStylesDiffMap) {
        reactShadowNode.setIsLayoutOnly(reactShadowNode.getViewClass().equals("RCTView") && isLayoutOnlyAndCollapsable(reactStylesDiffMap));
        if (reactShadowNode.getNativeKind() != NativeKind.NONE) {
            this.mUIViewOperationQueue.enqueueCreateView(themedReactContext, reactShadowNode.getReactTag(), reactShadowNode.getViewClass(), reactStylesDiffMap);
        }
    }

    public void handleForceViewToBeNonLayoutOnly(ReactShadowNode reactShadowNode) {
        if (reactShadowNode.isLayoutOnly()) {
            transitionLayoutOnlyViewToNativeView(reactShadowNode, null);
        }
    }

    public void handleManageChildren(ReactShadowNode reactShadowNode, int[] iArr, int[] iArr2, ViewAtIndex[] viewAtIndexArr, int[] iArr3) {
        boolean z3;
        for (int i7 : iArr2) {
            int i10 = 0;
            while (true) {
                if (i10 >= iArr3.length) {
                    z3 = false;
                    break;
                } else {
                    if (iArr3[i10] == i7) {
                        z3 = true;
                        break;
                    }
                    i10++;
                }
            }
            removeNodeFromParent(this.mShadowNodeRegistry.getNode(i7), z3);
        }
        for (ViewAtIndex viewAtIndex : viewAtIndexArr) {
            addNodeToNode(reactShadowNode, this.mShadowNodeRegistry.getNode(viewAtIndex.mTag), viewAtIndex.mIndex);
        }
    }

    public void handleSetChildren(ReactShadowNode reactShadowNode, ReadableArray readableArray) {
        for (int i7 = 0; i7 < readableArray.size(); i7++) {
            addNodeToNode(reactShadowNode, this.mShadowNodeRegistry.getNode(readableArray.getInt(i7)), i7);
        }
    }

    public void handleUpdateLayout(ReactShadowNode reactShadowNode) {
        applyLayoutBase(reactShadowNode);
    }

    public void handleUpdateView(ReactShadowNode reactShadowNode, String str, ReactStylesDiffMap reactStylesDiffMap) {
        if (reactShadowNode.isLayoutOnly() && !isLayoutOnlyAndCollapsable(reactStylesDiffMap)) {
            transitionLayoutOnlyViewToNativeView(reactShadowNode, reactStylesDiffMap);
        } else {
            if (reactShadowNode.isLayoutOnly()) {
                return;
            }
            this.mUIViewOperationQueue.enqueueUpdateProperties(reactShadowNode.getReactTag(), str, reactStylesDiffMap);
        }
    }

    public void onBatchComplete() {
        this.mTagsWithLayoutVisited.clear();
    }

    public void onViewUpdatesCompleted(ReactShadowNode reactShadowNode) {
        this.mTagsWithLayoutVisited.clear();
    }
}
