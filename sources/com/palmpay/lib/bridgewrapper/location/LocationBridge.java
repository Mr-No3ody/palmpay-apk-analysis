package com.palmpay.lib.bridgewrapper.location;

import U8.a;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.camera.video.u;
import com.didi.drouter.annotation.Service;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.concurrency.b;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.palmpay.lib.bridgewrapper.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140j8.f;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/location/get"}, function = {IBridge.class})
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0019\u001aB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0003J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016J\b\u0010\u0018\u001a\u00020\nH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/location/LocationBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Ljava/lang/Void;", "Ljava/lang/Runnable;", "()V", "locationCallback", "Lcom/palmpay/lib/bridgewrapper/location/LocationBridge$LocationCallbackReference;", "mFusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getCurrentLocation", "", "handleTimeout", "error", "", "onHandle", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "requestPermissions", "", "", "requestTimeout", "", "run", "startRecordTime", "LocationBean", "LocationCallbackReference", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class LocationBridge extends SyncBridge<Void> implements Runnable {

    @Nullable
    private LocationCallbackReference locationCallback;

    @Nullable
    private FusedLocationProviderClient mFusedLocationClient;

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/location/LocationBridge$LocationBean;", "", "latitude", "", "longitude", "(Ljava/lang/String;Ljava/lang/String;)V", "getLatitude", "()Ljava/lang/String;", "getLongitude", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class LocationBean {

        @Nullable
        private final String latitude;

        @Nullable
        private final String longitude;

        public LocationBean(@Nullable String str, @Nullable String str2) {
            this.latitude = str;
            this.longitude = str2;
        }

        public static /* synthetic */ LocationBean copy$default(LocationBean locationBean, String str, String str2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = locationBean.latitude;
            }
            if ((i7 & 2) != 0) {
                str2 = locationBean.longitude;
            }
            return locationBean.copy(str, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLatitude() {
            return this.latitude;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLongitude() {
            return this.longitude;
        }

        @NotNull
        public final LocationBean copy(@Nullable String latitude, @Nullable String longitude) {
            return new LocationBean(latitude, longitude);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocationBean)) {
                return false;
            }
            LocationBean locationBean = (LocationBean) other;
            return Intrinsics.c(this.latitude, locationBean.latitude) && Intrinsics.c(this.longitude, locationBean.longitude);
        }

        @Nullable
        public final String getLatitude() {
            return this.latitude;
        }

        @Nullable
        public final String getLongitude() {
            return this.longitude;
        }

        public int hashCode() {
            String str = this.latitude;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.longitude;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("LocationBean(latitude=");
            sb2.append(this.latitude);
            sb2.append(", longitude=");
            return u.p(sb2, this.longitude, ')');
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/location/LocationBridge$LocationCallbackReference;", "Lcom/google/android/gms/location/LocationCallback;", "locationCallback", "(Lcom/google/android/gms/location/LocationCallback;)V", "mLocationCallbackRef", "Ljava/lang/ref/WeakReference;", "onLocationAvailability", "", "locationAvailability", "Lcom/google/android/gms/location/LocationAvailability;", "onLocationResult", "locationResult", "Lcom/google/android/gms/location/LocationResult;", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class LocationCallbackReference extends LocationCallback {

        @NotNull
        private final WeakReference<LocationCallback> mLocationCallbackRef;

        public LocationCallbackReference(@Nullable LocationCallback locationCallback) {
            this.mLocationCallbackRef = new WeakReference<>(locationCallback);
        }

        @Override // com.google.android.gms.location.LocationCallback
        public void onLocationAvailability(@NotNull LocationAvailability locationAvailability) {
            Intrinsics.checkNotNullParameter(locationAvailability, "locationAvailability");
            super.onLocationAvailability(locationAvailability);
            LocationCallback locationCallback = this.mLocationCallbackRef.get();
            if (locationCallback != null) {
                locationCallback.onLocationAvailability(locationAvailability);
            }
        }

        @Override // com.google.android.gms.location.LocationCallback
        public void onLocationResult(@NotNull LocationResult locationResult) {
            Intrinsics.checkNotNullParameter(locationResult, "locationResult");
            super.onLocationResult(locationResult);
            LocationCallback locationCallback = this.mLocationCallbackRef.get();
            if (locationCallback != null) {
                locationCallback.onLocationResult(locationResult);
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    private final void getCurrentLocation() {
        Activity activity = getActivity();
        AbstractActivityC0837o abstractActivityC0837o = activity instanceof AbstractActivityC0837o ? (AbstractActivityC0837o) activity : null;
        if (abstractActivityC0837o != null) {
            f.n(abstractActivityC0837o).d(requestPermissions()).e(new a(29, this, abstractActivityC0837o));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getCurrentLocation$lambda-3$lambda-2, reason: not valid java name */
    public static final void m108getCurrentLocation$lambda3$lambda2(final LocationBridge this$0, AbstractActivityC0837o it, boolean z3, List list, List list2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(list, "<anonymous parameter 1>");
        Intrinsics.checkNotNullParameter(list2, "<anonymous parameter 2>");
        if (!z3) {
            Handler mHandler = this$0.getMHandler();
            if (mHandler != null) {
                mHandler.removeCallbacksAndMessages(null);
            }
            this$0.handleReject(it.getString(R.string.apply_permission_tips));
            return;
        }
        this$0.mFusedLocationClient = LocationServices.getFusedLocationProviderClient((Activity) it);
        LocationRequest locationRequestCreate = LocationRequest.create();
        Intrinsics.checkNotNullExpressionValue(locationRequestCreate, "create()");
        locationRequestCreate.setPriority(100);
        locationRequestCreate.setInterval(1000L);
        locationRequestCreate.setFastestInterval(500L);
        locationRequestCreate.setMaxWaitTime(this$0.requestTimeout());
        LocationCallbackReference locationCallbackReference = new LocationCallbackReference(new LocationCallback() { // from class: com.palmpay.lib.bridgewrapper.location.LocationBridge$getCurrentLocation$1$1$1
            @Override // com.google.android.gms.location.LocationCallback
            public void onLocationResult(@NotNull LocationResult locationResult) {
                FusedLocationProviderClient fusedLocationProviderClient;
                Intrinsics.checkNotNullParameter(locationResult, "locationResult");
                super.onLocationResult(locationResult);
                Handler mHandler2 = this.this$0.getMHandler();
                if (mHandler2 != null) {
                    mHandler2.removeCallbacksAndMessages(null);
                }
                LocationBridge.LocationCallbackReference locationCallbackReference2 = this.this$0.locationCallback;
                if (locationCallbackReference2 != null && (fusedLocationProviderClient = this.this$0.mFusedLocationClient) != null) {
                    fusedLocationProviderClient.removeLocationUpdates(locationCallbackReference2);
                }
                LocationBridge locationBridge = this.this$0;
                Location lastLocation = locationResult.getLastLocation();
                String strValueOf = String.valueOf(lastLocation != null ? Double.valueOf(lastLocation.getLatitude()) : null);
                Location lastLocation2 = locationResult.getLastLocation();
                BaseBridge.handleSuccess$default(locationBridge, new LocationBridge.LocationBean(strValueOf, String.valueOf(lastLocation2 != null ? Double.valueOf(lastLocation2.getLongitude()) : null)), null, 2, null);
                Location lastLocation3 = locationResult.getLastLocation();
                if (lastLocation3 != null) {
                    lastLocation3.getLatitude();
                }
                Location lastLocation4 = locationResult.getLastLocation();
                if (lastLocation4 != null) {
                    lastLocation4.getLongitude();
                }
            }
        });
        this$0.locationCallback = locationCallbackReference;
        FusedLocationProviderClient fusedLocationProviderClient = this$0.mFusedLocationClient;
        if (fusedLocationProviderClient != null) {
            Looper looperMyLooper = Looper.myLooper();
            Intrinsics.e(looperMyLooper);
            Task<Void> taskRequestLocationUpdates = fusedLocationProviderClient.requestLocationUpdates(locationRequestCreate, locationCallbackReference, looperMyLooper);
            if (taskRequestLocationUpdates != null) {
                taskRequestLocationUpdates.addOnFailureListener(new b(this$0, 6));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getCurrentLocation$lambda-3$lambda-2$lambda-1, reason: not valid java name */
    public static final void m109getCurrentLocation$lambda3$lambda2$lambda1(LocationBridge this$0, Exception error) {
        FusedLocationProviderClient fusedLocationProviderClient;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "error");
        Handler mHandler = this$0.getMHandler();
        if (mHandler != null) {
            mHandler.removeCallbacksAndMessages(null);
        }
        LocationCallbackReference locationCallbackReference = this$0.locationCallback;
        if (locationCallbackReference != null && (fusedLocationProviderClient = this$0.mFusedLocationClient) != null) {
            fusedLocationProviderClient.removeLocationUpdates(locationCallbackReference);
        }
        if (!(error instanceof ApiException)) {
            this$0.handleFail(error);
        } else if (((ApiException) error).getStatusCode() == 15) {
            this$0.handleTimeout(error);
        } else {
            this$0.handleFail(error);
        }
    }

    private final void startRecordTime() {
        Handler mHandler = getMHandler();
        if (mHandler != null) {
            mHandler.removeCallbacksAndMessages(null);
        }
        Handler mHandler2 = getMHandler();
        if (mHandler2 != null) {
            mHandler2.postDelayed(this, requestTimeout());
        }
    }

    public void handleTimeout(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        handleFail(error);
    }

    @NotNull
    public List<String> requestPermissions() {
        return C1850q.h("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
    }

    public long requestTimeout() {
        return 5000L;
    }

    @Override // java.lang.Runnable
    public void run() {
        handleTimeout(new Throwable("timeout"));
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable Void params, @Nullable IBridgeCallback callback) {
        startRecordTime();
        getCurrentLocation();
    }
}
