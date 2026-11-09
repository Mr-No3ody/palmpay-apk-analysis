package androidx.databinding;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface ObservableMap<K, V> extends Map<K, V> {
    void addOnMapChangedCallback(f fVar);

    void removeOnMapChangedCallback(f fVar);
}
