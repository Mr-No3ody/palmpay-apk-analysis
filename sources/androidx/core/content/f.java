package androidx.core.content;

import C0.G;
import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.video.u;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends ContentProvider {
    private static final String ATTR_NAME = "name";
    private static final String ATTR_PATH = "path";
    private static final String DISPLAYNAME_FIELD = "displayName";
    private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final String TAG_CACHE_PATH = "cache-path";
    private static final String TAG_EXTERNAL = "external-path";
    private static final String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final String TAG_EXTERNAL_FILES = "external-files-path";
    private static final String TAG_EXTERNAL_MEDIA = "external-media-path";
    private static final String TAG_FILES_PATH = "files-path";
    private static final String TAG_ROOT_PATH = "root-path";

    @GuardedBy("mLock")
    private String mAuthority;

    @Nullable
    @GuardedBy("mLock")
    private FileProvider$PathStrategy mLocalPathStrategy;

    @NonNull
    private final Object mLock = new Object();
    private final int mResourceId = 0;
    private static final String[] COLUMNS = {"_display_name", "_size"};
    private static final File DEVICE_ROOT = new File("/");

    @GuardedBy("sCache")
    private static final HashMap<String, FileProvider$PathStrategy> sCache = new HashMap<>();

    public static String access$000(String str) {
        return (str.length() <= 0 || str.charAt(str.length() - 1) != '/') ? str : u.f(1, 0, str);
    }

    public static FileProvider$PathStrategy b(Context context, int i7, String str) {
        FileProvider$PathStrategy fileProvider$PathStrategyC;
        HashMap<String, FileProvider$PathStrategy> map = sCache;
        synchronized (map) {
            try {
                fileProvider$PathStrategyC = map.get(str);
                if (fileProvider$PathStrategyC == null) {
                    try {
                        try {
                            fileProvider$PathStrategyC = c(context, i7, str);
                            map.put(str, fileProvider$PathStrategyC);
                        } catch (IOException e10) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e10);
                        }
                    } catch (XmlPullParserException e11) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e11);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fileProvider$PathStrategyC;
    }

    public static e c(Context context, int i7, String str) throws XmlPullParserException, IOException {
        e eVar = new e(str);
        XmlResourceParser fileProviderPathsMetaData = getFileProviderPathsMetaData(context, str, context.getPackageManager().resolveContentProvider(str, 128), i7);
        while (true) {
            int next = fileProviderPathsMetaData.next();
            if (next == 1) {
                return eVar;
            }
            if (next == 2) {
                String name = fileProviderPathsMetaData.getName();
                File externalStorageDirectory = null;
                String attributeValue = fileProviderPathsMetaData.getAttributeValue(null, "name");
                String attributeValue2 = fileProviderPathsMetaData.getAttributeValue(null, ATTR_PATH);
                if (TAG_ROOT_PATH.equals(name)) {
                    externalStorageDirectory = DEVICE_ROOT;
                } else if (TAG_FILES_PATH.equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if (TAG_CACHE_PATH.equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if (TAG_EXTERNAL.equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if (TAG_EXTERNAL_FILES.equals(name)) {
                    File[] externalFilesDirs = context.getExternalFilesDirs(null);
                    if (externalFilesDirs.length > 0) {
                        externalStorageDirectory = externalFilesDirs[0];
                    }
                } else if (TAG_EXTERNAL_CACHE.equals(name)) {
                    File[] externalCacheDirs = context.getExternalCacheDirs();
                    if (externalCacheDirs.length > 0) {
                        externalStorageDirectory = externalCacheDirs[0];
                    }
                } else if (TAG_EXTERNAL_MEDIA.equals(name)) {
                    File[] externalMediaDirs = context.getExternalMediaDirs();
                    if (externalMediaDirs.length > 0) {
                        externalStorageDirectory = externalMediaDirs[0];
                    }
                }
                if (externalStorageDirectory == null) {
                    continue;
                } else {
                    String str2 = new String[]{attributeValue2}[0];
                    if (str2 != null) {
                        externalStorageDirectory = new File(externalStorageDirectory, str2);
                    }
                    if (TextUtils.isEmpty(attributeValue)) {
                        throw new IllegalArgumentException("Name must not be empty");
                    }
                    try {
                        eVar.f16014b.put(attributeValue, externalStorageDirectory.getCanonicalFile());
                    } catch (IOException e10) {
                        throw new IllegalArgumentException(u.k(externalStorageDirectory, "Failed to resolve canonical path for "), e10);
                    }
                }
            }
        }
    }

    @VisibleForTesting
    public static XmlResourceParser getFileProviderPathsMetaData(Context context, String str, @Nullable ProviderInfo providerInfo, int i7) {
        if (providerInfo == null) {
            throw new IllegalArgumentException(G.o("Couldn't find meta-data for provider with authority ", str));
        }
        if (providerInfo.metaData == null && i7 != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt(META_DATA_FILE_PROVIDER_PATHS, i7);
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), META_DATA_FILE_PROVIDER_PATHS);
        if (xmlResourceParserLoadXmlMetaData != null) {
            return xmlResourceParserLoadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    public static Uri getUriForFile(@NonNull Context context, @NonNull String str, @NonNull File file) {
        return b(context, 0, str).getUriForFile(file);
    }

    public final FileProvider$PathStrategy a() {
        FileProvider$PathStrategy fileProvider$PathStrategy;
        synchronized (this.mLock) {
            try {
                if (this.mAuthority == null) {
                    throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                }
                if (this.mLocalPathStrategy == null) {
                    this.mLocalPathStrategy = b(getContext(), this.mResourceId, this.mAuthority);
                }
                fileProvider$PathStrategy = this.mLocalPathStrategy;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fileProvider$PathStrategy;
    }

    @Override // android.content.ContentProvider
    @CallSuper
    public void attachInfo(@NonNull Context context, @NonNull ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        synchronized (this.mLock) {
            this.mAuthority = str;
        }
        HashMap<String, FileProvider$PathStrategy> map = sCache;
        synchronized (map) {
            map.remove(str);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return a().getFileForUri(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        File fileForUri = a().getFileForUri(uri);
        int iLastIndexOf = fileForUri.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileForUri.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getTypeAnonymous(@NonNull Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(@NonNull Uri uri, @NonNull ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(@NonNull Uri uri, @NonNull String str) throws FileNotFoundException {
        int i7;
        File fileForUri = a().getFileForUri(uri);
        if ("r".equals(str)) {
            i7 = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i7 = 738197504;
        } else if ("wa".equals(str)) {
            i7 = 704643072;
        } else if ("rw".equals(str)) {
            i7 = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                throw new IllegalArgumentException(G.o("Invalid mode: ", str));
            }
            i7 = 1006632960;
        }
        return ParcelFileDescriptor.open(fileForUri, i7);
    }

    @Override // android.content.ContentProvider
    @NonNull
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        int i7;
        File fileForUri = a().getFileForUri(uri);
        String queryParameter = uri.getQueryParameter(DISPLAYNAME_FIELD);
        if (strArr == null) {
            strArr = COLUMNS;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i10 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i10] = "_display_name";
                i7 = i10 + 1;
                objArr[i10] = queryParameter == null ? fileForUri.getName() : queryParameter;
            } else {
                if ("_size".equals(str3)) {
                    strArr3[i10] = "_size";
                    i7 = i10 + 1;
                    objArr[i10] = Long.valueOf(fileForUri.length());
                }
            }
            i10 = i7;
        }
        String[] strArr4 = new String[i10];
        System.arraycopy(strArr3, 0, strArr4, 0, i10);
        Object[] objArr2 = new Object[i10];
        System.arraycopy(objArr, 0, objArr2, 0, i10);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @NonNull ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    @NonNull
    @SuppressLint({"StreamFiles"})
    public static Uri getUriForFile(@NonNull Context context, @NonNull String str, @NonNull File file, @NonNull String str2) {
        return getUriForFile(context, str, file).buildUpon().appendQueryParameter(DISPLAYNAME_FIELD, str2).build();
    }
}
