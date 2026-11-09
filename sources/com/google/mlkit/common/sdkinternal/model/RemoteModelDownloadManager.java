package com.google.mlkit.common.sdkinternal.model;

import android.app.DownloadManager;
import android.content.IntentFilter;
import android.database.Cursor;
import android.os.ParcelFileDescriptor;
import android.util.LongSparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.camera.camera2.internal.F;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zziy;
import com.google.android.gms.internal.mlkit_common.zzje;
import com.google.android.gms.internal.mlkit_common.zzmh;
import com.google.android.gms.internal.mlkit_common.zzmq;
import com.google.android.gms.internal.mlkit_common.zzmt;
import com.google.android.gms.internal.mlkit_common.zznb;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.DownloadConditions;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.ModelInfo;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class RemoteModelDownloadManager {
    private static final GmsLogger zza = new GmsLogger("ModelDownloadManager", "");

    @GuardedBy("RemoteModelDownloadManager.class")
    private static final Map zzb = new HashMap();

    @GuardedBy("this")
    private final LongSparseArray zzc = new LongSparseArray();

    @GuardedBy("this")
    private final LongSparseArray zzd = new LongSparseArray();
    private final MlKitContext zze;

    @Nullable
    private final DownloadManager zzf;
    private final RemoteModel zzg;
    private final ModelType zzh;
    private final zzmq zzi;
    private final SharedPrefManager zzj;
    private final ModelFileHelper zzk;

    @Nullable
    private final ModelInfoRetrieverInterop zzl;
    private final RemoteModelFileManager zzm;
    private DownloadConditions zzn;

    @VisibleForTesting
    public RemoteModelDownloadManager(@NonNull MlKitContext mlKitContext, @NonNull RemoteModel remoteModel, @NonNull ModelFileHelper modelFileHelper, @NonNull RemoteModelFileManager remoteModelFileManager, @Nullable ModelInfoRetrieverInterop modelInfoRetrieverInterop, @NonNull zzmq zzmqVar) {
        this.zze = mlKitContext;
        this.zzh = remoteModel.getModelType();
        this.zzg = remoteModel;
        DownloadManager downloadManager = (DownloadManager) mlKitContext.getApplicationContext().getSystemService("download");
        this.zzf = downloadManager;
        this.zzi = zzmqVar;
        if (downloadManager == null) {
            zza.d("ModelDownloadManager", "Download manager service is not available in the service.");
        }
        this.zzk = modelFileHelper;
        this.zzj = SharedPrefManager.getInstance(mlKitContext);
        this.zzl = modelInfoRetrieverInterop;
        this.zzm = remoteModelFileManager;
    }

    @NonNull
    @KeepForSdk
    public static synchronized RemoteModelDownloadManager getInstance(@NonNull MlKitContext mlKitContext, @NonNull RemoteModel remoteModel, @NonNull ModelFileHelper modelFileHelper, @NonNull RemoteModelFileManager remoteModelFileManager, @Nullable ModelInfoRetrieverInterop modelInfoRetrieverInterop) {
        Map map;
        RemoteModel remoteModel2;
        try {
            map = zzb;
            if (map.containsKey(remoteModel)) {
                remoteModel2 = remoteModel;
            } else {
                remoteModel2 = remoteModel;
                map.put(remoteModel2, new RemoteModelDownloadManager(mlKitContext, remoteModel2, modelFileHelper, remoteModelFileManager, modelInfoRetrieverInterop, zznb.zzb("common")));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (RemoteModelDownloadManager) map.get(remoteModel2);
    }

    private final Task zzj(long j6) throws Throwable {
        this.zze.getApplicationContext().registerReceiver(zzm(j6), new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), null, MLTaskExecutor.getInstance().getHandler());
        return zzk(j6).getTask();
    }

    private final synchronized TaskCompletionSource zzk(long j6) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.zzd.get(j6);
        if (taskCompletionSource != null) {
            return taskCompletionSource;
        }
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        this.zzd.put(j6, taskCompletionSource2);
        return taskCompletionSource2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MlKitException zzl(@Nullable Long l5) {
        DownloadManager downloadManager = this.zzf;
        Cursor cursorQuery = null;
        if (downloadManager != null && l5 != null) {
            cursorQuery = downloadManager.query(new DownloadManager.Query().setFilterById(l5.longValue()));
        }
        int i7 = 13;
        String strC = "Model downloading failed";
        if (cursorQuery != null && cursorQuery.moveToFirst()) {
            int i10 = cursorQuery.getInt(cursorQuery.getColumnIndex("reason"));
            if (i10 == 1006) {
                strC = "Model downloading failed due to insufficient space on the device.";
                i7 = 101;
            } else {
                strC = F.c(i10, "Model downloading failed due to error code: ", " from Android DownloadManager");
            }
        }
        return new MlKitException(strC, i7);
    }

    private final synchronized zzd zzm(long j6) throws Throwable {
        try {
            try {
                zzd zzdVar = (zzd) this.zzc.get(j6);
                if (zzdVar != null) {
                    return zzdVar;
                }
                zzd zzdVar2 = new zzd(this, j6, zzk(j6), null);
                this.zzc.put(j6, zzdVar2);
                return zzdVar2;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Nullable
    private final synchronized Long zzn(@NonNull DownloadManager.Request request, @NonNull ModelInfo modelInfo) {
        DownloadManager downloadManager = this.zzf;
        if (downloadManager == null) {
            return null;
        }
        long jEnqueue = downloadManager.enqueue(request);
        zza.d("ModelDownloadManager", "Schedule a new downloading task: " + jEnqueue);
        this.zzj.setDownloadingModelInfo(jEnqueue, modelInfo);
        this.zzi.zzf(zzmt.zzg(), this.zzg, zziy.NO_ERROR, false, modelInfo.getModelType(), zzje.SCHEDULED);
        return Long.valueOf(jEnqueue);
    }

    @Nullable
    @WorkerThread
    private final synchronized Long zzo(@NonNull ModelInfo modelInfo, @NonNull DownloadConditions downloadConditions) throws MlKitException {
        try {
            Preconditions.checkNotNull(downloadConditions, "DownloadConditions can not be null");
            String downloadingModelHash = this.zzj.getDownloadingModelHash(this.zzg);
            Integer downloadingModelStatusCode = getDownloadingModelStatusCode();
            if (downloadingModelHash != null && downloadingModelHash.equals(modelInfo.getModelHash()) && downloadingModelStatusCode != null) {
                Integer downloadingModelStatusCode2 = getDownloadingModelStatusCode();
                if (downloadingModelStatusCode2 == null || (downloadingModelStatusCode2.intValue() != 8 && downloadingModelStatusCode2.intValue() != 16)) {
                    zzmq zzmqVar = this.zzi;
                    zzmh zzmhVarZzg = zzmt.zzg();
                    RemoteModel remoteModel = this.zzg;
                    zzmqVar.zzf(zzmhVarZzg, remoteModel, zziy.NO_ERROR, false, remoteModel.getModelType(), zzje.DOWNLOADING);
                }
                zza.d("ModelDownloadManager", "New model is already in downloading, do nothing.");
                return null;
            }
            GmsLogger gmsLogger = zza;
            gmsLogger.d("ModelDownloadManager", "Need to download a new model.");
            removeOrCancelDownload();
            DownloadManager.Request request = new DownloadManager.Request(modelInfo.getModelUri());
            if (this.zzk.modelExistsLocally(modelInfo.getModelNameForPersist(), modelInfo.getModelType())) {
                gmsLogger.d("ModelDownloadManager", "Model update is enabled and have a previous downloaded model, use download condition");
                this.zzi.zzf(zzmt.zzg(), this.zzg, zziy.NO_ERROR, false, modelInfo.getModelType(), zzje.UPDATE_AVAILABLE);
            }
            request.setRequiresCharging(downloadConditions.isChargingRequired());
            if (downloadConditions.isWifiRequired()) {
                request.setAllowedNetworkTypes(2);
            }
            return zzn(request, modelInfo);
        } catch (Throwable th) {
            throw th;
        }
    }

    @NonNull
    @KeepForSdk
    @WorkerThread
    public Task<Void> ensureModelDownloaded() {
        MlKitException mlKitException;
        ModelInfo modelInfoZzg;
        this.zzi.zzf(zzmt.zzg(), this.zzg, zziy.NO_ERROR, false, ModelType.UNKNOWN, zzje.EXPLICITLY_REQUESTED);
        Long lZzo = null;
        try {
            modelInfoZzg = zzg();
            mlKitException = null;
        } catch (MlKitException e10) {
            mlKitException = e10;
            modelInfoZzg = null;
        }
        try {
            Integer downloadingModelStatusCode = getDownloadingModelStatusCode();
            Long downloadingId = getDownloadingId();
            if (!modelExistsLocally() && (downloadingModelStatusCode == null || downloadingModelStatusCode.intValue() != 8)) {
                if (downloadingModelStatusCode != null && downloadingModelStatusCode.intValue() == 16) {
                    MlKitException mlKitExceptionZzl = zzl(downloadingId);
                    removeOrCancelDownload();
                    return Tasks.forException(mlKitExceptionZzl);
                }
                if (downloadingModelStatusCode == null || (!(downloadingModelStatusCode.intValue() == 4 || downloadingModelStatusCode.intValue() == 2 || downloadingModelStatusCode.intValue() == 1) || downloadingId == null || getDownloadingModelHash() == null)) {
                    if (modelInfoZzg != null) {
                        lZzo = zzo(modelInfoZzg, this.zzn);
                    }
                    return lZzo == null ? Tasks.forException(new MlKitException("Failed to schedule the download task", 13, mlKitException)) : zzj(lZzo.longValue());
                }
                zzmq zzmqVar = this.zzi;
                zzmh zzmhVarZzg = zzmt.zzg();
                RemoteModel remoteModel = this.zzg;
                zzmqVar.zzf(zzmhVarZzg, remoteModel, zziy.NO_ERROR, false, remoteModel.getModelType(), zzje.DOWNLOADING);
                return zzj(downloadingId.longValue());
            }
            if (modelInfoZzg != null) {
                Long lZzo2 = zzo(modelInfoZzg, this.zzn);
                if (lZzo2 != null) {
                    return zzj(lZzo2.longValue());
                }
                zza.i("ModelDownloadManager", "Didn't schedule download for the updated model");
            }
            return Tasks.forResult(null);
        } catch (MlKitException e11) {
            return Tasks.forException(new MlKitException("Failed to ensure the model is downloaded.", 13, e11));
        }
    }

    @Nullable
    @KeepForSdk
    public synchronized ParcelFileDescriptor getDownloadedFile() {
        Long downloadingId = getDownloadingId();
        DownloadManager downloadManager = this.zzf;
        ParcelFileDescriptor parcelFileDescriptorOpenDownloadedFile = null;
        if (downloadManager == null || downloadingId == null) {
            return null;
        }
        try {
            parcelFileDescriptorOpenDownloadedFile = downloadManager.openDownloadedFile(downloadingId.longValue());
        } catch (FileNotFoundException unused) {
            zza.e("ModelDownloadManager", "Downloaded file is not found");
        }
        return parcelFileDescriptorOpenDownloadedFile;
    }

    @Nullable
    @KeepForSdk
    public synchronized Long getDownloadingId() {
        return this.zzj.getDownloadingModelId(this.zzg);
    }

    @Nullable
    @KeepForSdk
    public synchronized String getDownloadingModelHash() {
        return this.zzj.getDownloadingModelHash(this.zzg);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[Catch: all -> 0x0047, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0002, B:8:0x000f, B:19:0x0043, B:38:0x0071, B:45:0x0090, B:44:0x007b, B:10:0x0027, B:12:0x002d, B:25:0x004b, B:27:0x0052, B:29:0x0059, B:31:0x005f, B:33:0x0067), top: B:53:0x0002, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x004b A[Catch: all -> 0x003c, TRY_ENTER, TryCatch #3 {all -> 0x003c, blocks: (B:10:0x0027, B:12:0x002d, B:25:0x004b, B:27:0x0052, B:29:0x0059, B:31:0x005f, B:33:0x0067), top: B:56:0x0027, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    @Nullable
    @KeepForSdk
    public synchronized Integer getDownloadingModelStatusCode() {
        Integer numValueOf;
        Long downloadingId = getDownloadingId();
        DownloadManager downloadManager = this.zzf;
        if (downloadManager != null && downloadingId != null) {
            Cursor cursorQuery = downloadManager.query(new DownloadManager.Query().setFilterById(downloadingId.longValue()));
            if (cursorQuery == null) {
                numValueOf = null;
                if (numValueOf == null) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
                if (numValueOf.intValue() != 2) {
                }
                cursorQuery.close();
                return num;
            }
            try {
                if (cursorQuery.moveToFirst()) {
                    numValueOf = Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("status")));
                } else {
                    numValueOf = null;
                }
                if (numValueOf == null) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
                Integer num = (numValueOf.intValue() != 2 || numValueOf.intValue() == 4 || numValueOf.intValue() == 1 || numValueOf.intValue() == 8 || numValueOf.intValue() == 16) ? numValueOf : null;
                cursorQuery.close();
                return num;
            } catch (Throwable th) {
                try {
                    cursorQuery.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
            throw th;
        }
        return null;
    }

    @KeepForSdk
    public int getFailureReason(@NonNull Long l5) {
        int columnIndex;
        DownloadManager downloadManager = this.zzf;
        Cursor cursorQuery = null;
        if (downloadManager != null && l5 != null) {
            cursorQuery = downloadManager.query(new DownloadManager.Query().setFilterById(l5.longValue()));
        }
        if (cursorQuery == null || !cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex("reason")) == -1) {
            return 0;
        }
        return cursorQuery.getInt(columnIndex);
    }

    @KeepForSdk
    @WorkerThread
    public boolean isModelDownloadedAndValid() throws MlKitException {
        try {
            if (modelExistsLocally()) {
                return true;
            }
        } catch (MlKitException unused) {
            zza.d("ModelDownloadManager", "Failed to check if the model exist locally.");
        }
        Long downloadingId = getDownloadingId();
        String downloadingModelHash = getDownloadingModelHash();
        if (downloadingId == null || downloadingModelHash == null) {
            zza.d("ModelDownloadManager", "No new model is downloading.");
            removeOrCancelDownload();
            return false;
        }
        Integer downloadingModelStatusCode = getDownloadingModelStatusCode();
        zza.d("ModelDownloadManager", "Download Status code: ".concat(String.valueOf(downloadingModelStatusCode)));
        if (downloadingModelStatusCode != null) {
            return Objects.equal(downloadingModelStatusCode, 8) && zzi(downloadingModelHash) != null;
        }
        removeOrCancelDownload();
        return false;
    }

    @KeepForSdk
    public boolean modelExistsLocally() throws MlKitException {
        return this.zzk.modelExistsLocally(this.zzg.getUniqueModelNameForPersist(), this.zzh);
    }

    @KeepForSdk
    public synchronized void removeOrCancelDownload() throws MlKitException {
        Long downloadingId = getDownloadingId();
        if (this.zzf != null && downloadingId != null) {
            zza.d("ModelDownloadManager", "Cancel or remove existing downloading task: ".concat(downloadingId.toString()));
            if (this.zzf.remove(downloadingId.longValue()) > 0 || getDownloadingModelStatusCode() == null) {
                this.zzk.deleteTempFilesInPrivateFolder(this.zzg.getUniqueModelNameForPersist(), this.zzg.getModelType());
                this.zzj.clearDownloadingModelInfo(this.zzg);
            }
        }
    }

    @KeepForSdk
    public void setDownloadConditions(@NonNull DownloadConditions downloadConditions) {
        Preconditions.checkNotNull(downloadConditions, "DownloadConditions can not be null");
        this.zzn = downloadConditions;
    }

    @KeepForSdk
    public synchronized void updateLatestModelHashAndType(@NonNull String str) throws MlKitException {
        this.zzj.setLatestModelHash(this.zzg, str);
        removeOrCancelDownload();
    }

    @Nullable
    @WorkerThread
    public final synchronized ModelInfo zzg() throws MlKitException {
        try {
            boolean zModelExistsLocally = modelExistsLocally();
            if (zModelExistsLocally) {
                zzmq zzmqVar = this.zzi;
                zzmh zzmhVarZzg = zzmt.zzg();
                RemoteModel remoteModel = this.zzg;
                zzmqVar.zzf(zzmhVarZzg, remoteModel, zziy.NO_ERROR, false, remoteModel.getModelType(), zzje.LIVE);
            }
            ModelInfoRetrieverInterop modelInfoRetrieverInterop = this.zzl;
            if (modelInfoRetrieverInterop == null) {
                throw new MlKitException("Please include com.google.mlkit:linkfirebase sdk as your dependency when you try to download from Firebase.", 14);
            }
            ModelInfo modelInfoRetrieveRemoteModelInfo = modelInfoRetrieverInterop.retrieveRemoteModelInfo(this.zzg);
            if (modelInfoRetrieveRemoteModelInfo == null) {
                return null;
            }
            MlKitContext mlKitContext = this.zze;
            RemoteModel remoteModel2 = this.zzg;
            String modelHash = modelInfoRetrieveRemoteModelInfo.getModelHash();
            SharedPrefManager sharedPrefManager = SharedPrefManager.getInstance(mlKitContext);
            boolean zEquals = modelHash.equals(sharedPrefManager.getIncompatibleModelHash(remoteModel2));
            boolean z3 = false;
            boolean z8 = true;
            if (zEquals && CommonUtils.getAppVersion(mlKitContext.getApplicationContext()).equals(sharedPrefManager.getPreviousAppVersion())) {
                zza.e("ModelDownloadManager", "The model is incompatible with TFLite and the app is not upgraded, do not download");
                z8 = false;
            }
            if (!zModelExistsLocally) {
                this.zzj.clearLatestModelHash(this.zzg);
            }
            boolean zEquals2 = modelInfoRetrieveRemoteModelInfo.getModelHash().equals(SharedPrefManager.getInstance(this.zze).getLatestModelHash(this.zzg));
            boolean z10 = !zEquals2;
            if (!z8) {
                z3 = z10;
            } else if (!zModelExistsLocally || !zEquals2) {
                return modelInfoRetrieveRemoteModelInfo;
            }
            if (zModelExistsLocally && (z3 ^ z8)) {
                return null;
            }
            throw new MlKitException("The model " + this.zzg.getModelName() + " is incompatible with TFLite runtime", 100);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Nullable
    public final File zzi(@NonNull String str) throws MlKitException {
        GmsLogger gmsLogger = zza;
        gmsLogger.d("ModelDownloadManager", "Model downloaded successfully");
        this.zzi.zzf(zzmt.zzg(), this.zzg, zziy.NO_ERROR, true, this.zzh, zzje.SUCCEEDED);
        ParcelFileDescriptor downloadedFile = getDownloadedFile();
        if (downloadedFile == null) {
            removeOrCancelDownload();
            return null;
        }
        gmsLogger.d("ModelDownloadManager", "moving downloaded model from external storage to private folder.");
        try {
            return this.zzm.moveModelToPrivateFolder(downloadedFile, str, this.zzg);
        } finally {
            removeOrCancelDownload();
        }
    }
}
