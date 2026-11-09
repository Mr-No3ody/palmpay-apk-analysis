package com.google.maps.android.collections;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class CircleManager extends MapObjectManager<Circle, Collection> implements GoogleMap.OnCircleClickListener {
    public CircleManager(@NonNull GoogleMap googleMap) {
        super(googleMap);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ MapObjectManager.Collection getCollection(String str) {
        return super.getCollection(str);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCircleClickListener
    public void onCircleClick(@NonNull Circle circle) {
        Collection collection = (Collection) this.mAllObjects.get(circle);
        if (collection == null || collection.mCircleClickListener == null) {
            return;
        }
        collection.mCircleClickListener.onCircleClick(circle);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ boolean remove(Circle circle) {
        return super.remove(circle);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public void setListenersOnUiThread() {
        GoogleMap googleMap = this.mMap;
        if (googleMap != null) {
            googleMap.setOnCircleClickListener(this);
        }
    }

    public class Collection extends MapObjectManager.Collection {
        private GoogleMap.OnCircleClickListener mCircleClickListener;

        public Collection() {
            super();
        }

        public void addAll(java.util.Collection<CircleOptions> collection) {
            Iterator<CircleOptions> it = collection.iterator();
            while (it.hasNext()) {
                addCircle(it.next());
            }
        }

        public Circle addCircle(CircleOptions circleOptions) {
            Circle circleAddCircle = CircleManager.this.mMap.addCircle(circleOptions);
            super.add(circleAddCircle);
            return circleAddCircle;
        }

        public java.util.Collection<Circle> getCircles() {
            return getObjects();
        }

        public void hideAll() {
            Iterator<Circle> it = getCircles().iterator();
            while (it.hasNext()) {
                it.next().setVisible(false);
            }
        }

        public boolean remove(Circle circle) {
            return super.remove(circle);
        }

        public void setOnCircleClickListener(GoogleMap.OnCircleClickListener onCircleClickListener) {
            this.mCircleClickListener = onCircleClickListener;
        }

        public void showAll() {
            Iterator<Circle> it = getCircles().iterator();
            while (it.hasNext()) {
                it.next().setVisible(true);
            }
        }

        public void addAll(java.util.Collection<CircleOptions> collection, boolean z3) {
            Iterator<CircleOptions> it = collection.iterator();
            while (it.hasNext()) {
                addCircle(it.next()).setVisible(z3);
            }
        }
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ MapObjectManager.Collection newCollection(String str) {
        return super.newCollection(str);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public void removeObjectFromMap(Circle circle) {
        circle.remove();
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public Collection newCollection() {
        return new Collection();
    }
}
