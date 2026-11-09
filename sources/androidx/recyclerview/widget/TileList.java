package androidx.recyclerview.widget;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
class TileList<T> {
    Tile<T> mLastAccessedTile;
    final int mTileSize;
    private final SparseArray<Tile<T>> mTiles = new SparseArray<>(10);

    public static class Tile<T> {
        public int mItemCount;
        public final T[] mItems;
        Tile<T> mNext;
        public int mStartPosition;

        public Tile(@NonNull Class<T> cls, int i7) {
            this.mItems = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i7));
        }

        public boolean containsPosition(int i7) {
            int i10 = this.mStartPosition;
            return i10 <= i7 && i7 < i10 + this.mItemCount;
        }

        public T getByPosition(int i7) {
            return this.mItems[i7 - this.mStartPosition];
        }
    }

    public TileList(int i7) {
        this.mTileSize = i7;
    }

    public Tile<T> addOrReplace(Tile<T> tile) {
        int iIndexOfKey = this.mTiles.indexOfKey(tile.mStartPosition);
        if (iIndexOfKey < 0) {
            this.mTiles.put(tile.mStartPosition, tile);
            return null;
        }
        Tile<T> tileValueAt = this.mTiles.valueAt(iIndexOfKey);
        this.mTiles.setValueAt(iIndexOfKey, tile);
        if (this.mLastAccessedTile == tileValueAt) {
            this.mLastAccessedTile = tile;
        }
        return tileValueAt;
    }

    public void clear() {
        this.mTiles.clear();
    }

    public Tile<T> getAtIndex(int i7) {
        if (i7 < 0 || i7 >= this.mTiles.size()) {
            return null;
        }
        return this.mTiles.valueAt(i7);
    }

    public T getItemAt(int i7) {
        Tile<T> tile = this.mLastAccessedTile;
        if (tile == null || !tile.containsPosition(i7)) {
            int iIndexOfKey = this.mTiles.indexOfKey(i7 - (i7 % this.mTileSize));
            if (iIndexOfKey < 0) {
                return null;
            }
            this.mLastAccessedTile = this.mTiles.valueAt(iIndexOfKey);
        }
        return this.mLastAccessedTile.getByPosition(i7);
    }

    public Tile<T> removeAtPos(int i7) {
        Tile<T> tile = this.mTiles.get(i7);
        if (this.mLastAccessedTile == tile) {
            this.mLastAccessedTile = null;
        }
        this.mTiles.delete(i7);
        return tile;
    }

    public int size() {
        return this.mTiles.size();
    }
}
