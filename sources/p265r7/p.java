package p265r7;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.Toast;
import androidx.camera.camera2.internal.F;
import androidx.core.content.f;
import com.alibaba.android.arouter.utils.Consts;
import com.didiglobal.booster.instrument.ShadowToast;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.luck.picture.lib.config.PictureMimeType;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements ActivityEventListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o f41636g = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReactApplicationContext f41637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DownloadManager.Request f41638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ValueCallback f41639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ValueCallback f41640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public File f41641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public File f41642f;

    public p(ReactApplicationContext reactApplicationContext) {
        this.f41637a = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    public static Boolean a(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (str2.contains(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public static String[] c(String[] strArr) {
        String str;
        if (strArr.length != 0) {
            if (strArr.length != 1 || (str = strArr[0]) == null || str.length() != 0) {
                String[] strArr2 = new String[strArr.length];
                for (int i7 = 0; i7 < strArr.length; i7++) {
                    String str2 = strArr[i7];
                    if (str2.matches("\\.\\w+")) {
                        String strReplace = str2.replace(Consts.DOT, "");
                        String mimeTypeFromExtension = strReplace != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(strReplace) : null;
                        if (mimeTypeFromExtension != null) {
                            strArr2[i7] = mimeTypeFromExtension;
                        } else {
                            strArr2[i7] = str2;
                        }
                    } else {
                        strArr2[i7] = str2;
                    }
                }
                return strArr2;
            }
        }
        return new String[]{"*/*"};
    }

    public final void b(String str) {
        ReactApplicationContext reactApplicationContext = this.f41637a;
        try {
            ((DownloadManager) reactApplicationContext.getSystemService("download")).enqueue(this.f41638b);
            ShadowToast.show(Toast.makeText(reactApplicationContext, str, 1));
        } catch (IllegalArgumentException | SecurityException unused) {
        }
    }

    public final File d(int i7) {
        String str;
        String str2;
        int i10 = F.i(i7);
        if (i10 == 1) {
            String str3 = Environment.DIRECTORY_PICTURES;
            str = "image-";
            str2 = PictureMimeType.JPG;
        } else if (i10 != 2) {
            str = "";
            str2 = "";
        } else {
            String str4 = Environment.DIRECTORY_MOVIES;
            str = "video-";
            str2 = ".mp4";
        }
        String.valueOf(System.currentTimeMillis());
        return File.createTempFile(str, str2, this.f41637a.getExternalFilesDir(null));
    }

    public final Uri e(File file) {
        ReactApplicationContext reactApplicationContext = this.f41637a;
        return f.getUriForFile(reactApplicationContext, reactApplicationContext.getPackageName() + ".fileprovider", file);
    }

    public final Intent f() {
        Intent intent;
        Throwable e10;
        try {
            File fileD = d(2);
            this.f41641e = fileD;
            Uri uriE = e(fileD);
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
            try {
                intent.putExtra("output", uriE);
                return intent;
            } catch (IOException e11) {
                e10 = e11;
                Log.e("CREATE FILE", "Error occurred while creating the File", e10);
                e10.printStackTrace();
                return intent;
            } catch (IllegalArgumentException e12) {
                e10 = e12;
                Log.e("CREATE FILE", "Error occurred while creating the File", e10);
                e10.printStackTrace();
                return intent;
            }
        } catch (IOException | IllegalArgumentException e13) {
            intent = null;
            e10 = e13;
        }
    }

    public final Intent g() {
        Intent intent;
        Throwable e10;
        try {
            File fileD = d(3);
            this.f41642f = fileD;
            Uri uriE = e(fileD);
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
            try {
                intent.putExtra("output", uriE);
                return intent;
            } catch (IOException e11) {
                e10 = e11;
                Log.e("CREATE FILE", "Error occurred while creating the File", e10);
                e10.printStackTrace();
                return intent;
            } catch (IllegalArgumentException e12) {
                e10 = e12;
                Log.e("CREATE FILE", "Error occurred while creating the File", e10);
                e10.printStackTrace();
                return intent;
            }
        } catch (IOException | IllegalArgumentException e13) {
            intent = null;
            e10 = e13;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0097  */
    @Override // com.facebook.react.bridge.ActivityEventListener
    public final void onActivityResult(Activity activity, int i7, int i10, Intent intent) {
        Uri[] result;
        if (this.f41640d == null && this.f41639c == null) {
            return;
        }
        File file = this.f41641e;
        boolean z3 = file != null && file.length() > 0;
        File file2 = this.f41642f;
        boolean z8 = file2 != null && file2.length() > 0;
        if (i7 != 1) {
            if (i7 == 3) {
                if (i10 != -1) {
                    this.f41639c.onReceiveValue(null);
                } else if (z3) {
                    this.f41639c.onReceiveValue(e(this.f41641e));
                } else if (z8) {
                    this.f41639c.onReceiveValue(e(this.f41642f));
                } else {
                    this.f41639c.onReceiveValue(intent.getData());
                }
            }
        } else if (i10 != -1) {
            ValueCallback valueCallback = this.f41640d;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
        } else if (z3) {
            this.f41640d.onReceiveValue(new Uri[]{e(this.f41641e)});
        } else if (z8) {
            this.f41640d.onReceiveValue(new Uri[]{e(this.f41642f)});
        } else {
            ValueCallback valueCallback2 = this.f41640d;
            if (intent == null) {
                result = null;
            } else if (intent.getClipData() != null) {
                int itemCount = intent.getClipData().getItemCount();
                result = new Uri[itemCount];
                for (int i11 = 0; i11 < itemCount; i11++) {
                    result[i11] = intent.getClipData().getItemAt(i11).getUri();
                }
            } else if (intent.getData() == null || i10 != -1) {
                result = null;
            } else {
                result = WebChromeClient.FileChooserParams.parseResult(i10, intent);
            }
            valueCallback2.onReceiveValue(result);
        }
        File file3 = this.f41641e;
        if (file3 != null && !z3) {
            file3.delete();
        }
        File file4 = this.f41642f;
        if (file4 != null && !z8) {
            file4.delete();
        }
        this.f41640d = null;
        this.f41639c = null;
        this.f41641e = null;
        this.f41642f = null;
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public final void onNewIntent(Intent intent) {
    }
}
