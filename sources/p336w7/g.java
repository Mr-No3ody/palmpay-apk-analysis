package p336w7;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Base64;
import com.alibaba.android.arouter.utils.Consts;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.google.android.gms.maps.GoogleMap;
import com.rnmaps.maps.MapModule;
import com.rnmaps.maps.MapView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UIManager f43291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f43292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Promise f43293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Integer f43294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Integer f43295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f43296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f43297g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ReactApplicationContext f43298i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Bitmap.CompressFormat f43299j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ double f43300o;

    public g(UIManager uIManager, double d2, Promise promise, Integer num, Integer num2, String str, String str2, ReactApplicationContext reactApplicationContext, Bitmap.CompressFormat compressFormat, double d10) {
        this.f43291a = uIManager;
        this.f43292b = d2;
        this.f43293c = promise;
        this.f43294d = num;
        this.f43295e = num2;
        this.f43296f = str;
        this.f43297g = str2;
        this.f43298i = reactApplicationContext;
        this.f43299j = compressFormat;
        this.f43300o = d10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GoogleMap googleMap;
        MapView mapView = (MapView) this.f43291a.resolveView((int) this.f43292b);
        if (mapView == null || (googleMap = mapView.f24870a) == null) {
            this.f43293c.reject("E_SNAPSHOT", "Cannot take snapshot because map view or map is null");
            return;
        }
        final Integer num = this.f43294d;
        final Integer num2 = this.f43295e;
        final String str = this.f43297g;
        final ReactApplicationContext reactApplicationContext = this.f43298i;
        final Bitmap.CompressFormat compressFormat = this.f43299j;
        final double d2 = this.f43300o;
        final Promise promise = this.f43293c;
        final String str2 = this.f43296f;
        googleMap.snapshot(new GoogleMap.SnapshotReadyCallback() { // from class: w7.f
            @Override // com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback
            public final void onSnapshotReady(Bitmap bitmap) {
                String str3 = str;
                ReactApplicationContext reactApplicationContext2 = reactApplicationContext;
                Promise promise2 = promise;
                if (bitmap == null) {
                    promise2.reject("Failed to generate bitmap, snapshot = null");
                    return;
                }
                Integer num3 = num;
                if (num3.intValue() != 0) {
                    Integer num4 = num2;
                    if (num4.intValue() != 0 && (num3.intValue() != bitmap.getWidth() || num4.intValue() != bitmap.getHeight())) {
                        bitmap = Bitmap.createScaledBitmap(bitmap, num3.intValue(), num4.intValue(), true);
                    }
                }
                String str4 = str2;
                boolean zEquals = str4.equals("file");
                Bitmap.CompressFormat compressFormat2 = compressFormat;
                double d10 = d2;
                if (!zEquals) {
                    if (str4.equals(MapModule.SNAPSHOT_RESULT_BASE64)) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmap.compress(compressFormat2, (int) (d10 * 100.0d), byteArrayOutputStream);
                        MapModule.closeQuietly(byteArrayOutputStream);
                        promise2.resolve(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
                        return;
                    }
                    return;
                }
                try {
                    File fileCreateTempFile = File.createTempFile("AirMapSnapshot", Consts.DOT + str3, reactApplicationContext2.getCacheDir());
                    FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    bitmap.compress(compressFormat2, (int) (d10 * 100.0d), fileOutputStream);
                    MapModule.closeQuietly(fileOutputStream);
                    promise2.resolve(Uri.fromFile(fileCreateTempFile).toString());
                } catch (Exception e10) {
                    promise2.reject(e10);
                }
            }
        });
    }
}
