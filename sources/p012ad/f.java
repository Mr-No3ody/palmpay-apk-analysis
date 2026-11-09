package p012ad;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.luck.picture.lib.config.PictureMimeType;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import com.transsnet.palmpay.photograph.crop.PhotoCropActivity;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.text.SimpleDateFormat;
import java.util.Date;
import top.zibin.luban.io.a;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f11897b;

    public /* synthetic */ f(int i7) {
        this.f11896a = i7;
    }

    public static FileInputStream a(Context context, Uri uri) throws IOException {
        File fileCreateTempFile = File.createTempFile("FileUtil", OfflineConstant.TEMP_DIR_NAME, context.getApplicationContext().getCacheDir());
        fileCreateTempFile.deleteOnExit();
        InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(new URL(uri.toString()));
        try {
            ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(inputStreamOpenStream);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    fileOutputStream.getChannel().transferFrom(readableByteChannelNewChannel, 0L, Long.MAX_VALUE);
                    FileInputStream fileInputStream = new FileInputStream(fileCreateTempFile);
                    fileOutputStream.close();
                    readableByteChannelNewChannel.close();
                    inputStreamOpenStream.close();
                    return fileInputStream;
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (Throwable th2) {
                readableByteChannelNewChannel.close();
                throw th2;
            }
        } catch (Throwable th3) {
            inputStreamOpenStream.close();
            throw th3;
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) throws Throwable {
        OutputStream outputStreamOpenOutputStream = null;
        InputStream inputStreamA = null;
        outputStreamOpenOutputStream = null;
        boolean z3 = false;
        switch (this.f11896a) {
            case 0:
                PhotoCropActivity photoCropActivity = (PhotoCropActivity) ((WeakReference) this.f11897b).get();
                if (photoCropActivity != null) {
                    Bitmap output = photoCropActivity.f33111a.getOutput();
                    try {
                        a aVarG = a.g(photoCropActivity);
                        File fileCreateTempFile = File.createTempFile("Crop_" + ((SimpleDateFormat) aVarG.f42647d).format(new Date()), PictureMimeType.JPG, (File) aVarG.f42645b);
                        aVarG.f42646c = fileCreateTempFile.getAbsolutePath();
                        Uri uriFromFile = Uri.fromFile(fileCreateTempFile);
                        if (uriFromFile != null) {
                            try {
                                outputStreamOpenOutputStream = photoCropActivity.getContentResolver().openOutputStream(uriFromFile);
                                if (outputStreamOpenOutputStream != null && output != null) {
                                    output.compress(Bitmap.CompressFormat.JPEG, 90, outputStreamOpenOutputStream);
                                }
                                p002a.a.g(outputStreamOpenOutputStream);
                                z3 = true;
                            } catch (FileNotFoundException unused) {
                                p002a.a.g(outputStreamOpenOutputStream);
                            } catch (Throwable th) {
                                p002a.a.g(outputStreamOpenOutputStream);
                                throw th;
                            }
                        }
                    } catch (IOException e10) {
                        Log.e("PhotoCropActivity", e10.getMessage());
                    }
                    break;
                }
                return Boolean.valueOf(z3);
            default:
                String[] strArr = (String[]) objArr;
                try {
                    Uri uri = Uri.parse(strArr[0]);
                    boolean zStartsWith = uri.getScheme().startsWith("http");
                    Context context = (Context) this.f11897b;
                    inputStreamA = zStartsWith ? a(context, uri) : context.getContentResolver().openInputStream(uri);
                    break;
                } catch (Exception e11) {
                    p229p2.a.i("ReactNative", "Could not retrieve file for contentUri " + strArr[0], e11);
                }
                return inputStreamA;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Object obj) {
        switch (this.f11896a) {
            case 0:
                Boolean bool = (Boolean) obj;
                PhotoCropActivity photoCropActivity = (PhotoCropActivity) ((WeakReference) this.f11897b).get();
                if (photoCropActivity != null) {
                    photoCropActivity.setResult(bool.booleanValue() ? -1 : -2);
                    photoCropActivity.finish();
                }
                break;
            default:
                super.onPostExecute(obj);
                break;
        }
    }
}
