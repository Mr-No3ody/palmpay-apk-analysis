package com.reactnativecommunity.webview;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import androidx.core.content.d;
import com.alibaba.android.arouter.utils.Consts;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.luck.picture.lib.permissions.PermissionConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p265r7.m;
import p265r7.n;
import p265r7.o;
import p265r7.p;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = NativeRNCWebViewModuleSpec.NAME)
public class RNCWebViewModule extends NativeRNCWebViewModuleSpec {
    private final p mRNCWebViewModuleImpl;

    public RNCWebViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mRNCWebViewModuleImpl = new p(reactApplicationContext);
    }

    public void downloadFile(String str) {
        this.mRNCWebViewModuleImpl.b(str);
    }

    @Override // com.reactnativecommunity.webview.NativeRNCWebViewModuleSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return NativeRNCWebViewModuleSpec.NAME;
    }

    public boolean grantFileDownloaderPermissions(String str, String str2) {
        p pVar = this.mRNCWebViewModuleImpl;
        ReactApplicationContext reactApplicationContext = pVar.f41637a;
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        if (Build.VERSION.SDK_INT > 28) {
            return true;
        }
        boolean z3 = d.a(currentActivity, PermissionConfig.WRITE_EXTERNAL_STORAGE) == 0;
        if (z3) {
            return z3;
        }
        ComponentCallbacks2 currentActivity2 = reactApplicationContext.getCurrentActivity();
        if (currentActivity2 == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (!(currentActivity2 instanceof PermissionAwareActivity)) {
            throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        }
        ((PermissionAwareActivity) currentActivity2).requestPermissions(new String[]{PermissionConfig.WRITE_EXTERNAL_STORAGE}, 1, new m(pVar, str, str2));
        return z3;
    }

    @Override // com.reactnativecommunity.webview.NativeRNCWebViewModuleSpec
    public void isFileUploadSupported(Promise promise) {
        this.mRNCWebViewModuleImpl.getClass();
        promise.resolve(Boolean.TRUE);
    }

    public void setDownloadRequest(DownloadManager.Request request) {
        this.mRNCWebViewModuleImpl.f41638b = request;
    }

    @Override // com.reactnativecommunity.webview.NativeRNCWebViewModuleSpec
    public void shouldStartLoadWithLockIdentifier(boolean z3, double d2) {
        AtomicReference atomicReference;
        this.mRNCWebViewModuleImpl.getClass();
        o oVar = p.f41636g;
        Double dValueOf = Double.valueOf(d2);
        synchronized (oVar) {
            atomicReference = (AtomicReference) oVar.f41635b.get(dValueOf);
        }
        if (atomicReference != null) {
            synchronized (atomicReference) {
                try {
                    atomicReference.set(z3 ? n.f41632c : n.f41631b);
                    atomicReference.notify();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void startPhotoPickerIntent(ValueCallback<Uri> valueCallback, String str) {
        String mimeTypeFromExtension;
        Intent intentF;
        Intent intentG;
        p pVar = this.mRNCWebViewModuleImpl;
        pVar.f41639c = valueCallback;
        Activity currentActivity = pVar.f41637a.getCurrentActivity();
        String mimeTypeFromExtension2 = str.isEmpty() ? "*/*" : str;
        if (str.matches("\\.\\w+")) {
            String strReplace = str.replace(Consts.DOT, "");
            mimeTypeFromExtension2 = strReplace != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(strReplace) : null;
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(mimeTypeFromExtension2);
        Intent intentCreateChooser = Intent.createChooser(intent, "");
        ArrayList arrayList = new ArrayList();
        if (str.matches("\\.\\w+")) {
            String strReplace2 = str.replace(Consts.DOT, "");
            mimeTypeFromExtension = strReplace2 != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(strReplace2) : null;
        } else {
            mimeTypeFromExtension = str;
        }
        if ((mimeTypeFromExtension.isEmpty() || mimeTypeFromExtension.toLowerCase().contains("image")) && (intentF = pVar.f()) != null) {
            arrayList.add(intentF);
        }
        if (str.matches("\\.\\w+")) {
            String strReplace3 = str.replace(Consts.DOT, "");
            str = strReplace3 != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(strReplace3) : null;
        }
        if ((str.isEmpty() || str.toLowerCase().contains("video")) && (intentG = pVar.g()) != null) {
            arrayList.add(intentG);
        }
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (intentCreateChooser.resolveActivity(currentActivity.getPackageManager()) != null) {
            currentActivity.startActivityForResult(intentCreateChooser, 3);
        }
    }

    public boolean startPhotoPickerIntent(ValueCallback<Uri[]> valueCallback, String[] strArr, boolean z3, boolean z8) {
        Intent intentG;
        p pVar = this.mRNCWebViewModuleImpl;
        pVar.f41640d = valueCallback;
        ReactApplicationContext reactApplicationContext = pVar.f41637a;
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        ArrayList arrayList = new ArrayList();
        Activity currentActivity2 = reactApplicationContext.getCurrentActivity();
        Intent intentF = null;
        try {
            if (!Arrays.asList(currentActivity2.getPackageManager().getPackageInfo(currentActivity2.getApplicationContext().getPackageName(), 4096).requestedPermissions).contains("android.permission.CAMERA") || d.a(currentActivity2, "android.permission.CAMERA") == 0) {
                String[] strArrC = p.c(strArr);
                if ((p.a("*/*", strArrC).booleanValue() || p.a("image", strArrC).booleanValue()) && (intentF = pVar.f()) != null) {
                    arrayList.add(intentF);
                }
                String[] strArrC2 = p.c(strArr);
                if ((p.a("*/*", strArrC2).booleanValue() || p.a("video", strArrC2).booleanValue()) && (intentG = pVar.g()) != null) {
                    arrayList.add(intentG);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Intent intent = new Intent("android.intent.action.CHOOSER");
        if (!z8) {
            Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
            intent2.addCategory("android.intent.category.OPENABLE");
            intent2.setType("*/*");
            intent2.putExtra("android.intent.extra.MIME_TYPES", p.c(strArr));
            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", z3);
            intent.putExtra("android.intent.extra.INTENT", intent2);
            intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
            intentF = intent;
        }
        if (intentF != null && intentF.resolveActivity(currentActivity.getPackageManager()) != null) {
            currentActivity.startActivityForResult(intentF, 1);
        }
        return true;
    }
}
