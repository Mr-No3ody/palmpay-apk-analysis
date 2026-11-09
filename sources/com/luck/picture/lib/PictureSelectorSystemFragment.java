package com.luck.picture.lib;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.a;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.luck.picture.lib.basic.PictureCommonFragment;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.config.SelectorConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.interfaces.OnPermissionsInterceptListener;
import com.luck.picture.lib.interfaces.OnRequestPermissionListener;
import com.luck.picture.lib.permissions.PermissionChecker;
import com.luck.picture.lib.permissions.PermissionConfig;
import com.luck.picture.lib.permissions.PermissionResultCallback;
import com.luck.picture.lib.utils.SdkVersionUtils;
import com.luck.picture.lib.utils.ToastUtils;
import java.util.ArrayList;
import java.util.List;
import p177m.b;

/* JADX INFO: loaded from: classes3.dex */
public class PictureSelectorSystemFragment extends PictureCommonFragment {
    public static final String TAG = "PictureSelectorSystemFragment";
    private a mContentLauncher;
    private a mContentsLauncher;
    private a mDocMultipleLauncher;
    private a mDocSingleLauncher;

    private void createContent() {
        this.mContentLauncher = registerForActivityResult(new b() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.9
            @Override // p177m.b
            @NonNull
            public Intent createIntent(@NonNull Context context, String str) {
                if (TextUtils.equals(SelectMimeType.SYSTEM_VIDEO, str)) {
                    return new Intent("android.intent.action.PICK", MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
                }
                return TextUtils.equals(SelectMimeType.SYSTEM_AUDIO, str) ? new Intent("android.intent.action.PICK", MediaStore.Audio.Media.EXTERNAL_CONTENT_URI) : new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            }

            @Override // p177m.b
            public Uri parseResult(int i7, @Nullable Intent intent) {
                if (intent == null) {
                    return null;
                }
                return intent.getData();
            }
        }, new ActivityResultCallback<Uri>() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.10
            @Override // androidx.activity.result.ActivityResultCallback
            public void onActivityResult(Uri uri) throws Throwable {
                if (uri == null) {
                    PictureSelectorSystemFragment.this.onKeyBackFragmentFinish();
                    return;
                }
                LocalMedia localMediaBuildLocalMedia = PictureSelectorSystemFragment.this.buildLocalMedia(uri.toString());
                localMediaBuildLocalMedia.setPath(SdkVersionUtils.isQ() ? localMediaBuildLocalMedia.getPath() : localMediaBuildLocalMedia.getRealPath());
                if (PictureSelectorSystemFragment.this.confirmSelect(localMediaBuildLocalMedia, false) == 0) {
                    PictureSelectorSystemFragment.this.dispatchTransformResult();
                } else {
                    PictureSelectorSystemFragment.this.onKeyBackFragmentFinish();
                }
            }
        });
    }

    private void createMultipleContents() {
        this.mContentsLauncher = registerForActivityResult(new b() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.7
            @Override // p177m.b
            @NonNull
            public Intent createIntent(@NonNull Context context, String str) {
                Intent intent;
                if (TextUtils.equals(SelectMimeType.SYSTEM_VIDEO, str)) {
                    intent = new Intent("android.intent.action.PICK", MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
                } else {
                    intent = TextUtils.equals(SelectMimeType.SYSTEM_AUDIO, str) ? new Intent("android.intent.action.PICK", MediaStore.Audio.Media.EXTERNAL_CONTENT_URI) : new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                }
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                return intent;
            }

            @Override // p177m.b
            public List<Uri> parseResult(int i7, @Nullable Intent intent) {
                ArrayList arrayList = new ArrayList();
                if (intent != null) {
                    if (intent.getClipData() != null) {
                        ClipData clipData = intent.getClipData();
                        int itemCount = clipData.getItemCount();
                        for (int i10 = 0; i10 < itemCount; i10++) {
                            arrayList.add(clipData.getItemAt(i10).getUri());
                        }
                    } else if (intent.getData() != null) {
                        arrayList.add(intent.getData());
                    }
                }
                return arrayList;
            }
        }, new ActivityResultCallback<List<Uri>>() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.8
            @Override // androidx.activity.result.ActivityResultCallback
            public void onActivityResult(List<Uri> list) throws Throwable {
                if (list == null || list.size() == 0) {
                    PictureSelectorSystemFragment.this.onKeyBackFragmentFinish();
                    return;
                }
                for (int i7 = 0; i7 < list.size(); i7++) {
                    LocalMedia localMediaBuildLocalMedia = PictureSelectorSystemFragment.this.buildLocalMedia(list.get(i7).toString());
                    localMediaBuildLocalMedia.setPath(SdkVersionUtils.isQ() ? localMediaBuildLocalMedia.getPath() : localMediaBuildLocalMedia.getRealPath());
                    ((PictureCommonFragment) PictureSelectorSystemFragment.this).selectorConfig.addSelectResult(localMediaBuildLocalMedia);
                }
                PictureSelectorSystemFragment.this.dispatchTransformResult();
            }
        });
    }

    private void createMultipleDocuments() {
        this.mDocMultipleLauncher = registerForActivityResult(new b() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.3
            @Override // p177m.b
            @NonNull
            public Intent createIntent(@NonNull Context context, String str) {
                Intent intent = new Intent("android.intent.action.PICK");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType(str);
                return intent;
            }

            @Override // p177m.b
            public List<Uri> parseResult(int i7, @Nullable Intent intent) {
                ArrayList arrayList = new ArrayList();
                if (intent != null) {
                    if (intent.getClipData() != null) {
                        ClipData clipData = intent.getClipData();
                        int itemCount = clipData.getItemCount();
                        for (int i10 = 0; i10 < itemCount; i10++) {
                            arrayList.add(clipData.getItemAt(i10).getUri());
                        }
                    } else if (intent.getData() != null) {
                        arrayList.add(intent.getData());
                    }
                }
                return arrayList;
            }
        }, new ActivityResultCallback<List<Uri>>() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.4
            @Override // androidx.activity.result.ActivityResultCallback
            public void onActivityResult(List<Uri> list) throws Throwable {
                if (list == null || list.size() == 0) {
                    PictureSelectorSystemFragment.this.onKeyBackFragmentFinish();
                    return;
                }
                for (int i7 = 0; i7 < list.size(); i7++) {
                    LocalMedia localMediaBuildLocalMedia = PictureSelectorSystemFragment.this.buildLocalMedia(list.get(i7).toString());
                    localMediaBuildLocalMedia.setPath(SdkVersionUtils.isQ() ? localMediaBuildLocalMedia.getPath() : localMediaBuildLocalMedia.getRealPath());
                    ((PictureCommonFragment) PictureSelectorSystemFragment.this).selectorConfig.addSelectResult(localMediaBuildLocalMedia);
                }
                PictureSelectorSystemFragment.this.dispatchTransformResult();
            }
        });
    }

    private void createSingleDocuments() {
        this.mDocSingleLauncher = registerForActivityResult(new b() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.5
            @Override // p177m.b
            @NonNull
            public Intent createIntent(@NonNull Context context, String str) {
                Intent intent = new Intent("android.intent.action.PICK");
                intent.setType(str);
                return intent;
            }

            @Override // p177m.b
            public Uri parseResult(int i7, @Nullable Intent intent) {
                if (intent == null) {
                    return null;
                }
                return intent.getData();
            }
        }, new ActivityResultCallback<Uri>() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.6
            @Override // androidx.activity.result.ActivityResultCallback
            public void onActivityResult(Uri uri) throws Throwable {
                if (uri == null) {
                    PictureSelectorSystemFragment.this.onKeyBackFragmentFinish();
                    return;
                }
                LocalMedia localMediaBuildLocalMedia = PictureSelectorSystemFragment.this.buildLocalMedia(uri.toString());
                localMediaBuildLocalMedia.setPath(SdkVersionUtils.isQ() ? localMediaBuildLocalMedia.getPath() : localMediaBuildLocalMedia.getRealPath());
                if (PictureSelectorSystemFragment.this.confirmSelect(localMediaBuildLocalMedia, false) == 0) {
                    PictureSelectorSystemFragment.this.dispatchTransformResult();
                } else {
                    PictureSelectorSystemFragment.this.onKeyBackFragmentFinish();
                }
            }
        });
    }

    private void createSystemContracts() {
        SelectorConfig selectorConfig = this.selectorConfig;
        if (selectorConfig.selectionMode == 1) {
            if (selectorConfig.chooseMode == SelectMimeType.ofAll()) {
                createSingleDocuments();
                return;
            } else {
                createContent();
                return;
            }
        }
        if (selectorConfig.chooseMode == SelectMimeType.ofAll()) {
            createMultipleDocuments();
        } else {
            createMultipleContents();
        }
    }

    private String getInput() {
        if (this.selectorConfig.chooseMode == SelectMimeType.ofVideo()) {
            return SelectMimeType.SYSTEM_VIDEO;
        }
        return this.selectorConfig.chooseMode == SelectMimeType.ofAudio() ? SelectMimeType.SYSTEM_AUDIO : SelectMimeType.SYSTEM_IMAGE;
    }

    public static PictureSelectorSystemFragment newInstance() {
        return new PictureSelectorSystemFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openSystemAlbum() {
        onPermissionExplainEvent(false, null);
        SelectorConfig selectorConfig = this.selectorConfig;
        if (selectorConfig.selectionMode == 1) {
            if (selectorConfig.chooseMode == SelectMimeType.ofAll()) {
                this.mDocSingleLauncher.a(SelectMimeType.SYSTEM_ALL);
                return;
            } else {
                this.mContentLauncher.a(getInput());
                return;
            }
        }
        if (selectorConfig.chooseMode == SelectMimeType.ofAll()) {
            this.mDocMultipleLauncher.a(SelectMimeType.SYSTEM_ALL);
        } else {
            this.mContentsLauncher.a(getInput());
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public String getFragmentTag() {
        return TAG;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public int getResourceId() {
        return R.layout.ps_empty;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void handlePermissionSettingResult(String[] strArr) {
        onPermissionExplainEvent(false, null);
        SelectorConfig selectorConfig = this.selectorConfig;
        OnPermissionsInterceptListener onPermissionsInterceptListener = selectorConfig.onPermissionsEventListener;
        if (onPermissionsInterceptListener != null ? onPermissionsInterceptListener.hasPermissions(this, strArr) : PermissionChecker.isCheckReadStorage(selectorConfig.chooseMode, getContext())) {
            openSystemAlbum();
        } else {
            ToastUtils.showToast(getContext(), getString(R.string.ps_jurisdiction));
            onKeyBackFragmentFinish();
        }
        PermissionConfig.CURRENT_REQUEST_PERMISSION = new String[0];
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i10 == 0) {
            onKeyBackFragmentFinish();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onApplyPermissionsEvent(int i7, String[] strArr) {
        if (i7 == -2) {
            this.selectorConfig.onPermissionsEventListener.requestPermission(this, PermissionConfig.getReadPermissionArray(getAppContext(), this.selectorConfig.chooseMode), new OnRequestPermissionListener() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.2
                @Override // com.luck.picture.lib.interfaces.OnRequestPermissionListener
                public void onCall(String[] strArr2, boolean z3) {
                    if (z3) {
                        PictureSelectorSystemFragment.this.openSystemAlbum();
                    } else {
                        PictureSelectorSystemFragment.this.handlePermissionDenied(strArr2);
                    }
                }
            });
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        a aVar = this.mDocMultipleLauncher;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this.mDocSingleLauncher;
        if (aVar2 != null) {
            aVar2.b();
        }
        a aVar3 = this.mContentsLauncher;
        if (aVar3 != null) {
            aVar3.b();
        }
        a aVar4 = this.mContentLauncher;
        if (aVar4 != null) {
            aVar4.b();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        createSystemContracts();
        if (PermissionChecker.isCheckReadStorage(this.selectorConfig.chooseMode, getContext())) {
            openSystemAlbum();
            return;
        }
        final String[] readPermissionArray = PermissionConfig.getReadPermissionArray(getAppContext(), this.selectorConfig.chooseMode);
        onPermissionExplainEvent(true, readPermissionArray);
        if (this.selectorConfig.onPermissionsEventListener != null) {
            onApplyPermissionsEvent(-2, readPermissionArray);
        } else {
            PermissionChecker.getInstance().requestPermissions(this, readPermissionArray, new PermissionResultCallback() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.1
                @Override // com.luck.picture.lib.permissions.PermissionResultCallback
                public void onDenied() {
                    PictureSelectorSystemFragment.this.handlePermissionDenied(readPermissionArray);
                }

                @Override // com.luck.picture.lib.permissions.PermissionResultCallback
                public void onGranted() {
                    PictureSelectorSystemFragment.this.openSystemAlbum();
                }
            });
        }
    }
}
