package com.luck.picture.lib.basic;

import android.content.Intent;
import android.os.Bundle;
import com.luck.picture.lib.entity.LocalMedia;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public interface IPictureSelectorCommonEvent {
    boolean checkAddBitmapWatermark();

    boolean checkCompressValidity();

    boolean checkCropValidity();

    @Deprecated
    boolean checkOldCompressValidity();

    @Deprecated
    boolean checkOldCropValidity();

    @Deprecated
    boolean checkOldTransformSandboxFile();

    boolean checkOnlyMimeTypeValidity(LocalMedia localMedia, boolean z3, String str, String str2, long j6, long j10);

    boolean checkTransformSandboxFile();

    boolean checkVideoThumbnail();

    boolean checkWithMimeTypeValidity(LocalMedia localMedia, boolean z3, String str, int i7, long j6, long j10);

    int confirmSelect(LocalMedia localMedia, boolean z3);

    void dismissLoading();

    void dispatchCameraMediaResult(LocalMedia localMedia);

    int getResourceId();

    void handlePermissionDenied(String[] strArr);

    void handlePermissionSettingResult(String[] strArr);

    void initAppLanguage();

    void onApplyPermissionsEvent(int i7, String[] strArr);

    void onCheckOriginalChange();

    void onCompress(ArrayList<LocalMedia> arrayList);

    void onCreateLoader();

    void onCrop(ArrayList<LocalMedia> arrayList);

    void onEditMedia(Intent intent);

    void onEnterFragment();

    void onExitFragment();

    void onFixedSelectedChange(LocalMedia localMedia);

    void onFragmentResume();

    void onInterceptCameraEvent(int i7);

    void onKeyBackFragmentFinish();

    @Deprecated
    void onOldCompress(ArrayList<LocalMedia> arrayList);

    void onOldCrop(ArrayList<LocalMedia> arrayList);

    void onPermissionExplainEvent(boolean z3, String[] strArr);

    void onRecreateEngine();

    void onResultEvent(ArrayList<LocalMedia> arrayList);

    void onSelectedChange(boolean z3, LocalMedia localMedia);

    void onSelectedOnlyCamera();

    void openImageCamera();

    void openSelectedCamera();

    void openSoundRecording();

    void openVideoCamera();

    void reStartSavedInstance(Bundle bundle);

    void sendChangeSubSelectPositionEvent(boolean z3);

    void sendFixedSelectedChangeEvent(LocalMedia localMedia);

    void sendSelectedChangeEvent(boolean z3, LocalMedia localMedia);

    void sendSelectedOriginalChangeEvent();

    void showLoading();
}
