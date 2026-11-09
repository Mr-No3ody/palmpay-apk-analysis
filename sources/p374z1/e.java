package p374z1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.executor.g;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.t;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes.dex */
public final class e implements DataFetcher {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String[] f44420p = {"_data"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ModelLoader f44422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ModelLoader f44423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri f44424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f44425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f44426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f44427g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Class f44428i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f44429j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile DataFetcher f44430o;

    public e(Context context, ModelLoader modelLoader, ModelLoader modelLoader2, Uri uri, int i7, int i10, h hVar, Class cls) {
        this.f44421a = context.getApplicationContext();
        this.f44422b = modelLoader;
        this.f44423c = modelLoader2;
        this.f44424d = uri;
        this.f44425e = i7;
        this.f44426f = i10;
        this.f44427g = hVar;
        this.f44428i = cls;
    }

    public final DataFetcher a() throws Throwable {
        t tVarBuildLoadData;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f44421a;
        h hVar = this.f44427g;
        int i7 = this.f44426f;
        int i10 = this.f44425e;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.f44424d;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, f44420p, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            tVarBuildLoadData = this.f44422b.buildLoadData(file, i10, i7, hVar);
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            Uri requireOriginal = this.f44424d;
            boolean zY = g.y(requireOriginal);
            ModelLoader modelLoader = this.f44423c;
            if (zY && requireOriginal.getPathSegments().contains("picker")) {
                tVarBuildLoadData = modelLoader.buildLoadData(requireOriginal, i10, i7, hVar);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                tVarBuildLoadData = modelLoader.buildLoadData(requireOriginal, i10, i7, hVar);
            }
        }
        if (tVarBuildLoadData != null) {
            return tVarBuildLoadData.f20869c;
        }
        return null;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
        this.f44429j = true;
        DataFetcher dataFetcher = this.f44430o;
        if (dataFetcher != null) {
            dataFetcher.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cleanup() {
        DataFetcher dataFetcher = this.f44430o;
        if (dataFetcher != null) {
            dataFetcher.cleanup();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final Class getDataClass() {
        return this.f44428i;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final a getDataSource() {
        return a.f20508a;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void loadData(com.bumptech.glide.g gVar, DataFetcher.DataCallback dataCallback) throws Throwable {
        try {
            DataFetcher dataFetcherA = a();
            if (dataFetcherA == null) {
                dataCallback.onLoadFailed(new IllegalArgumentException("Failed to build fetcher for: " + this.f44424d));
            } else {
                this.f44430o = dataFetcherA;
                if (this.f44429j) {
                    cancel();
                } else {
                    dataFetcherA.loadData(gVar, dataCallback);
                }
            }
        } catch (FileNotFoundException e10) {
            dataCallback.onLoadFailed(e10);
        }
    }
}
