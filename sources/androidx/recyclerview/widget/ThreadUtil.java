package androidx.recyclerview.widget;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes.dex */
interface ThreadUtil<T> {

    public interface BackgroundCallback<T> {
        void loadTile(int i7, int i10);

        @SuppressLint({"UnknownNullness"})
        void recycleTile(TileList.Tile<T> tile);

        void refresh(int i7);

        void updateRange(int i7, int i10, int i11, int i12, int i13);
    }

    public interface MainThreadCallback<T> {
        @SuppressLint({"UnknownNullness"})
        void addTile(int i7, TileList.Tile<T> tile);

        void removeTile(int i7, int i10);

        void updateItemCount(int i7, int i10);
    }

    BackgroundCallback<T> getBackgroundProxy(BackgroundCallback<T> backgroundCallback);

    MainThreadCallback<T> getMainThreadProxy(MainThreadCallback<T> mainThreadCallback);
}
