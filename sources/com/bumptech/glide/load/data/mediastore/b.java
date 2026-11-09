package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.f;
import com.bumptech.glide.load.e;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b implements DataFetcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f20555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f20556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InputStream f20557c;

    public b(Uri uri, c cVar) {
        this.f20555a = uri;
        this.f20556b = cVar;
    }

    public static b a(Context context, Uri uri, ThumbnailQuery thumbnailQuery) {
        return new b(uri, new c(com.bumptech.glide.b.b(context).f20436d.a().e(), thumbnailQuery, com.bumptech.glide.b.b(context).f20437e, context.getContentResolver()));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public final InputStream b() throws Throwable {
        Cursor cursorQuery;
        String string;
        boolean zIsEmpty;
        ContentResolver contentResolver;
        File file;
        InputStream inputStreamOpenInputStream;
        int iA;
        Uri uri = this.f20555a;
        c cVar = this.f20556b;
        Cursor cursor = null;
        inputStreamOpenInputStream = null;
        inputStreamOpenInputStream = null;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            try {
                cursorQuery = cVar.f20558a.query(uri);
                if (cursorQuery != null) {
                    try {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                string = cursorQuery.getString(0);
                                cursorQuery.close();
                            }
                        } catch (SecurityException unused) {
                            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                Objects.toString(uri);
                            }
                            if (cursorQuery != null) {
                            }
                            string = null;
                            zIsEmpty = TextUtils.isEmpty(string);
                            contentResolver = cVar.f20560c;
                            if (zIsEmpty) {
                                inputStreamOpenInputStream = null;
                            } else {
                                file = new File(string);
                                if (file.exists()) {
                                    inputStreamOpenInputStream = null;
                                } else {
                                    inputStreamOpenInputStream = null;
                                }
                            }
                            if (inputStreamOpenInputStream != null) {
                                try {
                                    inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                                    iA = e.a(cVar.f20561d, inputStreamOpenInputStream2, cVar.f20559b);
                                    if (inputStreamOpenInputStream2 != null) {
                                        try {
                                            inputStreamOpenInputStream2.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                } catch (IOException | NullPointerException unused3) {
                                    if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                        Objects.toString(uri);
                                    }
                                    if (inputStreamOpenInputStream2 != null) {
                                        try {
                                            inputStreamOpenInputStream2.close();
                                        } catch (IOException unused4) {
                                        }
                                    }
                                    iA = -1;
                                }
                            } else {
                                iA = -1;
                            }
                            if (iA != -1) {
                                return new f(inputStreamOpenInputStream, iA);
                            }
                            return inputStreamOpenInputStream;
                        }
                        zIsEmpty = TextUtils.isEmpty(string);
                        contentResolver = cVar.f20560c;
                        if (zIsEmpty) {
                            inputStreamOpenInputStream = null;
                        } else {
                            file = new File(string);
                            if (file.exists() || 0 >= file.length()) {
                                inputStreamOpenInputStream = null;
                            } else {
                                Uri uriFromFile = Uri.fromFile(file);
                                try {
                                    inputStreamOpenInputStream = contentResolver.openInputStream(uriFromFile);
                                } catch (NullPointerException e10) {
                                    throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e10));
                                }
                            }
                        }
                        if (inputStreamOpenInputStream != null) {
                            inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                            iA = e.a(cVar.f20561d, inputStreamOpenInputStream2, cVar.f20559b);
                            if (inputStreamOpenInputStream2 != null) {
                                inputStreamOpenInputStream2.close();
                            }
                        } else {
                            iA = -1;
                        }
                        if (iA != -1) {
                            return new f(inputStreamOpenInputStream, iA);
                        }
                        return inputStreamOpenInputStream;
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (SecurityException unused5) {
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                iA = e.a(cVar.f20561d, inputStreamOpenInputStream2, cVar.f20559b);
                if (inputStreamOpenInputStream2 != null) {
                    inputStreamOpenInputStream2.close();
                }
            } else {
                iA = -1;
            }
            if (iA != -1) {
                return new f(inputStreamOpenInputStream, iA);
            }
            return inputStreamOpenInputStream;
        } catch (Throwable th3) {
            if (inputStreamOpenInputStream2 != null) {
                try {
                    inputStreamOpenInputStream2.close();
                } catch (IOException unused6) {
                }
            }
            throw th3;
        }
        string = null;
        zIsEmpty = TextUtils.isEmpty(string);
        contentResolver = cVar.f20560c;
        if (zIsEmpty) {
            inputStreamOpenInputStream = null;
        } else {
            file = new File(string);
            if (file.exists()) {
                inputStreamOpenInputStream = null;
            } else {
                inputStreamOpenInputStream = null;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cleanup() {
        InputStream inputStream = this.f20557c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final Class getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final com.bumptech.glide.load.a getDataSource() {
        return com.bumptech.glide.load.a.f20508a;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void loadData(g gVar, DataFetcher.DataCallback dataCallback) throws Throwable {
        try {
            InputStream inputStreamB = b();
            this.f20557c = inputStreamB;
            dataCallback.onDataReady(inputStreamB);
        } catch (FileNotFoundException e10) {
            dataCallback.onLoadFailed(e10);
        }
    }
}
