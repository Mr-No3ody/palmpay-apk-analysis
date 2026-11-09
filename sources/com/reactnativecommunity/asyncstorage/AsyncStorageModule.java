package com.reactnativecommunity.asyncstorage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import androidx.camera.core.impl.utils.n;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.common.ModuleDataCleaner;
import com.horcrux.svg.Z;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p229p2.a;
import p7.b;
import p7.c;
import p7.d;
import p7.e;
import p7.f;
import p7.g;
import p7.i;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = "RNCAsyncStorage")
public final class AsyncStorageModule extends NativeAsyncStorageModuleSpec implements ModuleDataCleaner.Cleanable, LifecycleEventListener {
    private static final int MAX_SQL_KEYS = 999;
    public static final String NAME = "RNCAsyncStorage";
    private final i executor;
    private g mReactDatabaseSupplier;
    private boolean mShuttingDown;

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, AsyncTask.THREAD_POOL_EXECUTOR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ensureDatabase() {
        if (this.mShuttingDown) {
            return false;
        }
        this.mReactDatabaseSupplier.c();
        return true;
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void clear(Callback callback) {
        new e(this, getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.facebook.react.modules.common.ModuleDataCleaner.Cleanable
    public void clearSensitiveData() {
        g gVar = this.mReactDatabaseSupplier;
        synchronized (gVar) {
            try {
                synchronized (gVar) {
                    gVar.d().delete("catalystLocalStorage", null, null);
                }
            } catch (Exception unused) {
                if (!gVar.b()) {
                    throw new RuntimeException("Clearing and deleting database RKStorage failed");
                }
                a.a("ReactNative", "Deleted Local Database RKStorage");
                return;
            }
        }
        gVar.a();
        a.a("ReactNative", "Cleaned RKStorage");
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void getAllKeys(Callback callback) {
        new f(this, getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCAsyncStorage";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.mShuttingDown = false;
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiGet(ReadableArray readableArray, Callback callback) {
        if (readableArray == null) {
            callback.invoke(n.n("Invalid key"), null);
        } else {
            new p7.a(this, getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiMerge(ReadableArray readableArray, Callback callback) {
        new d(this, getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiRemove(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new c(this, getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiSet(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new b(this, getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mShuttingDown = true;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        this.mReactDatabaseSupplier.a();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @VisibleForTesting
    public AsyncStorageModule(ReactApplicationContext reactApplicationContext, Executor executor) throws Throwable {
        File file;
        long millis;
        FileChannel channel;
        FileChannel channel2;
        super(reactApplicationContext);
        this.mShuttingDown = false;
        if (!reactApplicationContext.getDatabasePath("RKStorage").exists()) {
            ArrayList<File> arrayList = new ArrayList();
            try {
                File[] fileArrListFiles = reactApplicationContext.getDatabasePath("noop").getParentFile().listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2.getName().startsWith("RKStorage-scoped-experience-") && !file2.getName().endsWith("-journal")) {
                            arrayList.add(file2);
                        }
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (arrayList.size() == 0) {
                file = null;
            } else {
                file = null;
                long j6 = -1;
                for (File file3 : arrayList) {
                    try {
                        if (Build.VERSION.SDK_INT >= 26) {
                            try {
                                millis = Files.readAttributes(file3.toPath(), Z.k(), new LinkOption[0]).creationTime().toMillis();
                            } catch (Exception unused) {
                                millis = -1;
                            }
                        } else {
                            millis = file3.lastModified();
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    if (millis > j6) {
                        j6 = millis;
                        file = file3;
                    }
                }
                if (file == null) {
                    file = (File) arrayList.get(0);
                }
            }
            if (file != null) {
                try {
                    if (g.f41263d == null) {
                        Context applicationContext = reactApplicationContext.getApplicationContext();
                        g gVar = new g(applicationContext, "RKStorage", null, 1);
                        gVar.f41266c = 6291456L;
                        gVar.f41264a = applicationContext;
                        g.f41263d = gVar;
                    }
                    g.f41263d.d();
                    FileInputStream fileInputStream = new FileInputStream(file);
                    FileOutputStream fileOutputStream = new FileOutputStream(reactApplicationContext.getDatabasePath("RKStorage"));
                    try {
                        channel = fileInputStream.getChannel();
                        try {
                            channel2 = fileOutputStream.getChannel();
                            try {
                                channel.transferTo(0L, channel.size(), channel2);
                                try {
                                    channel.close();
                                    if (channel2 != null) {
                                        channel2.close();
                                    }
                                    file.getName();
                                    try {
                                        for (File file4 : arrayList) {
                                            if (file4.delete()) {
                                                file4.getName();
                                            } else {
                                                file4.getName();
                                            }
                                        }
                                    } catch (Exception e12) {
                                        e12.printStackTrace();
                                    }
                                } catch (Throwable th) {
                                    if (channel2 != null) {
                                        channel2.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (channel != null) {
                                    try {
                                        channel.close();
                                    } finally {
                                        if (channel2 != null) {
                                            channel2.close();
                                        }
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            channel2 = null;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        channel = null;
                        channel2 = null;
                    }
                } catch (Exception e13) {
                    file.getName();
                    e13.printStackTrace();
                }
            }
        }
        this.executor = new i(executor);
        reactApplicationContext.addLifecycleEventListener(this);
        if (g.f41263d == null) {
            Context applicationContext2 = reactApplicationContext.getApplicationContext();
            g gVar2 = new g(applicationContext2, "RKStorage", null, 1);
            gVar2.f41266c = 6291456L;
            gVar2.f41264a = applicationContext2;
            g.f41263d = gVar2;
        }
        this.mReactDatabaseSupplier = g.f41263d;
    }
}
