package com.google.android.gms.maps.model;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public class AdvancedMarkerOptions extends MarkerOptions {

    @Retention(RetentionPolicy.RUNTIME)
    public @interface CollisionBehavior {
        public static final int OPTIONAL_AND_HIDES_LOWER_PRIORITY = 2;
        public static final int REQUIRED = 0;
        public static final int REQUIRED_AND_HIDES_OPTIONAL = 1;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    @NonNull
    public AdvancedMarkerOptions alpha(float f10) {
        super.alpha(f10);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    @NonNull
    public AdvancedMarkerOptions anchor(float f10, float f11) {
        super.anchor(f10, f11);
        return this;
    }

    @NonNull
    public AdvancedMarkerOptions collisionBehavior(@CollisionBehavior int i7) {
        zzd(i7);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    @NonNull
    public AdvancedMarkerOptions contentDescription(@Nullable String str) {
        super.contentDescription(str);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    @NonNull
    public AdvancedMarkerOptions draggable(boolean z3) {
        super.draggable(z3);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    @NonNull
    public AdvancedMarkerOptions flat(boolean z3) {
        super.flat(z3);
        return this;
    }

    public int getCollisionBehavior() {
        return zza();
    }

    @Nullable
    public View getIconView() {
        return zzc();
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    @NonNull
    public AdvancedMarkerOptions icon(@Nullable BitmapDescriptor bitmapDescriptor) {
        super.icon(bitmapDescriptor);
        return this;
    }

    @NonNull
    public AdvancedMarkerOptions iconView(@Nullable View view) {
        zze(view);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    @NonNull
    public AdvancedMarkerOptions infoWindowAnchor(float f10, float f11) {
        super.infoWindowAnchor(f10, f11);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    @NonNull
    public AdvancedMarkerOptions position(@NonNull LatLng latLng) {
        super.position(latLng);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    @NonNull
    public AdvancedMarkerOptions rotation(float f10) {
        super.rotation(f10);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    @NonNull
    public AdvancedMarkerOptions snippet(@Nullable String str) {
        super.snippet(str);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    @NonNull
    public AdvancedMarkerOptions title(@Nullable String str) {
        super.title(str);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    @NonNull
    public AdvancedMarkerOptions visible(boolean z3) {
        super.visible(z3);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    @NonNull
    public AdvancedMarkerOptions zIndex(float f10) {
        super.zIndex(f10);
        return this;
    }
}
