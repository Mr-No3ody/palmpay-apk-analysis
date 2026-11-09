package X7;

import V7.e;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.util.Log;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import kotlin.jvm.internal.Intrinsics;
import p360y2.c;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f11054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f11055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f11056c;

    public b(Context context, e eVar, Uri uri) {
        this.f11054a = context;
        this.f11055b = eVar;
        this.f11056c = uri;
    }

    @Override // p360y2.c
    public final void onFailureImpl(DataSource dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Log.e("[RNScreens]", "Error loading image: " + this.f11056c, dataSource.getFailureCause());
    }

    @Override // p360y2.c
    public final void onNewResultImpl(DataSource dataSource) {
        CloseableReference closeableReference;
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        if (dataSource.isFinished() && (closeableReference = (CloseableReference) dataSource.getResult()) != null) {
            Object objF = closeableReference.f();
            Intrinsics.checkNotNullExpressionValue(objF, "get(...)");
            CloseableImage closeableImage = (CloseableImage) objF;
            if (closeableImage instanceof CloseableStaticBitmap) {
                Bitmap underlyingBitmap = ((CloseableStaticBitmap) closeableImage).getUnderlyingBitmap();
                Intrinsics.checkNotNullExpressionValue(underlyingBitmap, "getUnderlyingBitmap(...)");
                Resources resources = this.f11054a.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                this.f11055b.invoke(new BitmapDrawable(resources, underlyingBitmap));
            }
            closeableReference.close();
        }
    }
}
