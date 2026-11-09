package com.dylanvann.fastimage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.model.Headers;
import com.bumptech.glide.load.model.l;
import com.facebook.react.views.imagehelper.ImageSource;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class FastImageSource extends ImageSource {
    private static final String ANDROID_CONTENT_SCHEME = "content";
    private static final String ANDROID_RESOURCE_SCHEME = "android.resource";
    private static final String DATA_SCHEME = "data";
    private static final String LOCAL_FILE_SCHEME = "file";
    private static final String LOCAL_RESOURCE_SCHEME = "res";
    private final Headers mHeaders;
    private Uri mUri;

    public FastImageSource(Context context, String str) {
        this(context, str, null);
    }

    public static boolean isBase64Uri(Uri uri) {
        return "data".equals(uri.getScheme());
    }

    public static boolean isContentUri(Uri uri) {
        return "content".equals(uri.getScheme());
    }

    public static boolean isLocalFileUri(Uri uri) {
        return "file".equals(uri.getScheme());
    }

    public static boolean isLocalResourceUri(Uri uri) {
        return LOCAL_RESOURCE_SCHEME.equals(uri.getScheme());
    }

    public static boolean isResourceUri(Uri uri) {
        return ANDROID_RESOURCE_SCHEME.equals(uri.getScheme());
    }

    public l getGlideUrl() {
        return new l(getUri().toString(), getHeaders());
    }

    public Headers getHeaders() {
        return this.mHeaders;
    }

    public Object getSourceForLoad() {
        if (isContentUri()) {
            return getSource();
        }
        if (isBase64Resource()) {
            return getSource();
        }
        if (get_isResource()) {
            return getUri();
        }
        return isLocalFile() ? getUri().toString() : getGlideUrl();
    }

    @Override // com.facebook.react.views.imagehelper.ImageSource
    public Uri getUri() {
        return this.mUri;
    }

    public boolean isBase64Resource() {
        Uri uri = this.mUri;
        return uri != null && isBase64Uri(uri);
    }

    public boolean isLocalFile() {
        Uri uri = this.mUri;
        return uri != null && isLocalFileUri(uri);
    }

    @Override // com.facebook.react.views.imagehelper.ImageSource
    /* JADX INFO: renamed from: isResource */
    public boolean get_isResource() {
        Uri uri = this.mUri;
        return uri != null && isResourceUri(uri);
    }

    public FastImageSource(Context context, String str, @Nullable Headers headers) {
        this(context, str, 0.0d, 0.0d, headers);
    }

    public boolean isContentUri() {
        Uri uri = this.mUri;
        return uri != null && isContentUri(uri);
    }

    public FastImageSource(Context context, String str, double d2, double d10, @Nullable Headers headers) {
        super(context, str, d2, d10);
        this.mHeaders = headers == null ? Headers.f20819a : headers;
        this.mUri = super.getUri();
        if (get_isResource() && TextUtils.isEmpty(this.mUri.toString())) {
            throw new Resources.NotFoundException("Local Resource Not Found. Resource: '" + getSource() + "'.");
        }
        if (isLocalResourceUri(this.mUri)) {
            this.mUri = Uri.parse(this.mUri.toString().replace("res:/", "android.resource://" + context.getPackageName() + "/"));
        }
    }
}
