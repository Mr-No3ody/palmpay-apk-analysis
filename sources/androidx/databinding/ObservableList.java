package androidx.databinding;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ObservableList<T> extends List<T> {
    void addOnListChangedCallback(e eVar);

    void removeOnListChangedCallback(e eVar);
}
