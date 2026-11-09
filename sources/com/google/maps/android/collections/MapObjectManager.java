package com.google.maps.android.collections;

import C0.G;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.GoogleMap;
import com.google.maps.android.collections.MapObjectManager.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class MapObjectManager<O, C extends Collection> {
    protected final GoogleMap mMap;
    private final Map<String, C> mNamedCollections = new HashMap();
    protected final Map<O, C> mAllObjects = new HashMap();

    public class Collection {
        private final Set<O> mObjects = new LinkedHashSet();

        public Collection() {
        }

        public void add(O o10) {
            this.mObjects.add(o10);
            MapObjectManager.this.mAllObjects.put(o10, this);
        }

        public void clear() {
            for (O o10 : this.mObjects) {
                MapObjectManager.this.removeObjectFromMap(o10);
                MapObjectManager.this.mAllObjects.remove(o10);
            }
            this.mObjects.clear();
        }

        public java.util.Collection<O> getObjects() {
            return Collections.unmodifiableCollection(this.mObjects);
        }

        public boolean remove(O o10) {
            if (!this.mObjects.remove(o10)) {
                return false;
            }
            MapObjectManager.this.mAllObjects.remove(o10);
            MapObjectManager.this.removeObjectFromMap(o10);
            return true;
        }
    }

    public MapObjectManager(@NonNull GoogleMap googleMap) {
        this.mMap = googleMap;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.maps.android.collections.MapObjectManager.1
            @Override // java.lang.Runnable
            public void run() {
                MapObjectManager.this.setListenersOnUiThread();
            }
        });
    }

    public C getCollection(String str) {
        return this.mNamedCollections.get(str);
    }

    public abstract C newCollection();

    public C newCollection(String str) {
        if (this.mNamedCollections.get(str) != null) {
            throw new IllegalArgumentException(G.o("collection id is not unique: ", str));
        }
        C c6 = (C) newCollection();
        this.mNamedCollections.put(str, c6);
        return c6;
    }

    public boolean remove(O o10) {
        C c6 = this.mAllObjects.get(o10);
        return c6 != null && c6.remove(o10);
    }

    public abstract void removeObjectFromMap(O o10);

    public abstract void setListenersOnUiThread();
}
