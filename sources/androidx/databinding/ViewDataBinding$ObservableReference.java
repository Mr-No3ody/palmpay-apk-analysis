package androidx.databinding;

import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
interface ViewDataBinding$ObservableReference<T> {
    void addListener(T t);

    i getListener();

    void removeListener(T t);

    void setLifecycleOwner(LifecycleOwner lifecycleOwner);
}
