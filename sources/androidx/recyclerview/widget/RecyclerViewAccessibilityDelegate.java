package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.C1050b;
import androidx.core.view.N;
import java.util.Map;
import java.util.WeakHashMap;
import p074f0.d;
import p074f0.g;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerViewAccessibilityDelegate extends C1050b {
    private final ItemDelegate mItemDelegate;
    final RecyclerView mRecyclerView;

    public static class ItemDelegate extends C1050b {
        private Map<View, C1050b> mOriginalItemDelegates = new WeakHashMap();
        final RecyclerViewAccessibilityDelegate mRecyclerViewDelegate;

        public ItemDelegate(@NonNull RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
            this.mRecyclerViewDelegate = recyclerViewAccessibilityDelegate;
        }

        @Override // androidx.core.view.C1050b
        public boolean dispatchPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C1050b c1050b = this.mOriginalItemDelegates.get(view);
            return c1050b != null ? c1050b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C1050b
        @Nullable
        public g getAccessibilityNodeProvider(@NonNull View view) {
            C1050b c1050b = this.mOriginalItemDelegates.get(view);
            return c1050b != null ? c1050b.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
        }

        public C1050b getAndRemoveOriginalDelegateForItem(View view) {
            return this.mOriginalItemDelegates.remove(view);
        }

        @Override // androidx.core.view.C1050b
        public void onInitializeAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C1050b c1050b = this.mOriginalItemDelegates.get(view);
            if (c1050b != null) {
                c1050b.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C1050b
        public void onInitializeAccessibilityNodeInfo(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) d dVar) {
            if (this.mRecyclerViewDelegate.shouldIgnore() || this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager() == null) {
                super.onInitializeAccessibilityNodeInfo(view, dVar);
                return;
            }
            this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, dVar);
            C1050b c1050b = this.mOriginalItemDelegates.get(view);
            if (c1050b != null) {
                c1050b.onInitializeAccessibilityNodeInfo(view, dVar);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, dVar);
            }
        }

        @Override // androidx.core.view.C1050b
        public void onPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C1050b c1050b = this.mOriginalItemDelegates.get(view);
            if (c1050b != null) {
                c1050b.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C1050b
        public boolean onRequestSendAccessibilityEvent(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C1050b c1050b = this.mOriginalItemDelegates.get(viewGroup);
            return c1050b != null ? c1050b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.C1050b
        public boolean performAccessibilityAction(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, int i7, @Nullable @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            if (this.mRecyclerViewDelegate.shouldIgnore() || this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i7, bundle);
            }
            C1050b c1050b = this.mOriginalItemDelegates.get(view);
            if (c1050b != null) {
                if (c1050b.performAccessibilityAction(view, i7, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i7, bundle)) {
                return true;
            }
            return this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(view, i7, bundle);
        }

        public void saveOriginalDelegate(View view) {
            C1050b c1050bD = N.d(view);
            if (c1050bD == null || c1050bD == this) {
                return;
            }
            this.mOriginalItemDelegates.put(view, c1050bD);
        }

        @Override // androidx.core.view.C1050b
        public void sendAccessibilityEvent(@NonNull View view, int i7) {
            C1050b c1050b = this.mOriginalItemDelegates.get(view);
            if (c1050b != null) {
                c1050b.sendAccessibilityEvent(view, i7);
            } else {
                super.sendAccessibilityEvent(view, i7);
            }
        }

        @Override // androidx.core.view.C1050b
        public void sendAccessibilityEventUnchecked(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C1050b c1050b = this.mOriginalItemDelegates.get(view);
            if (c1050b != null) {
                c1050b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public RecyclerViewAccessibilityDelegate(@NonNull RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
        C1050b itemDelegate = getItemDelegate();
        if (itemDelegate == null || !(itemDelegate instanceof ItemDelegate)) {
            this.mItemDelegate = new ItemDelegate(this);
        } else {
            this.mItemDelegate = (ItemDelegate) itemDelegate;
        }
    }

    @NonNull
    public C1050b getItemDelegate() {
        return this.mItemDelegate;
    }

    @Override // androidx.core.view.C1050b
    public void onInitializeAccessibilityEvent(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || shouldIgnore()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C1050b
    public void onInitializeAccessibilityNodeInfo(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) d dVar) {
        super.onInitializeAccessibilityNodeInfo(view, dVar);
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return;
        }
        this.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(dVar);
    }

    @Override // androidx.core.view.C1050b
    public boolean performAccessibilityAction(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, int i7, @Nullable @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.performAccessibilityAction(view, i7, bundle)) {
            return true;
        }
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return false;
        }
        return this.mRecyclerView.getLayoutManager().performAccessibilityAction(i7, bundle);
    }

    public boolean shouldIgnore() {
        return this.mRecyclerView.hasPendingAdapterUpdates();
    }
}
