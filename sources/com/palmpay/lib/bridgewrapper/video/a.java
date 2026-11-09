package com.palmpay.lib.bridgewrapper.video;

import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.appcompat.app.AbstractActivityC0837o;
import com.palmpay.lib.bridge.SyncBridge;
import com.palmpay.lib.bridgewrapper.photo.upload.PhotoUploadBridge;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements ActivityResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SyncBridge f23808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0837o f23809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23810d;

    public /* synthetic */ a(SyncBridge syncBridge, AbstractActivityC0837o abstractActivityC0837o, Object obj, int i7) {
        this.f23807a = i7;
        this.f23808b = syncBridge;
        this.f23809c = abstractActivityC0837o;
        this.f23810d = obj;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        switch (this.f23807a) {
            case 0:
                VideoUploadBridge.m120pickVideo$lambda8((VideoUploadBridge) this.f23808b, this.f23809c, (VideoUploadBridge.VideoUploadParam) this.f23810d, (ActivityResult) obj);
                break;
            case 1:
                VideoUploadBridge.m121recordVideo$lambda5((VideoUploadBridge) this.f23808b, this.f23809c, (VideoUploadBridge.VideoUploadParam) this.f23810d, (ActivityResult) obj);
                break;
            default:
                PhotoUploadBridge.m116openGallery$lambda8((PhotoUploadBridge) this.f23808b, this.f23809c, (PhotoUploadBridge.PhotoUploadParam) this.f23810d, (Uri) obj);
                break;
        }
    }
}
