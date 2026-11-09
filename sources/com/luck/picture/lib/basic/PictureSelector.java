package com.luck.picture.lib.basic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import com.luck.picture.lib.config.PictureConfig;
import com.luck.picture.lib.entity.LocalMedia;
import java.lang.ref.SoftReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class PictureSelector {
    private final SoftReference<Activity> mActivity;
    private final SoftReference<Fragment> mFragment;

    private PictureSelector(Activity activity) {
        this(activity, null);
    }

    public static PictureSelector create(Context context) {
        return new PictureSelector((Activity) context);
    }

    public static ArrayList<LocalMedia> obtainSelectorList(Intent intent) {
        if (intent == null) {
            return new ArrayList<>();
        }
        ArrayList<LocalMedia> parcelableArrayListExtra = intent.getParcelableArrayListExtra(PictureConfig.EXTRA_RESULT_SELECTION);
        return parcelableArrayListExtra != null ? parcelableArrayListExtra : new ArrayList<>();
    }

    public static Intent putIntentResult(ArrayList<LocalMedia> arrayList) {
        return new Intent().putParcelableArrayListExtra(PictureConfig.EXTRA_RESULT_SELECTION, arrayList);
    }

    public PictureSelectionQueryModel dataSource(int i7) {
        return new PictureSelectionQueryModel(this, i7);
    }

    @Nullable
    public Activity getActivity() {
        return this.mActivity.get();
    }

    @Nullable
    public Fragment getFragment() {
        SoftReference<Fragment> softReference = this.mFragment;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public PictureSelectionCameraModel openCamera(int i7) {
        return new PictureSelectionCameraModel(this, i7);
    }

    public PictureSelectionModel openGallery(int i7) {
        return new PictureSelectionModel(this, i7);
    }

    public PictureSelectionPreviewModel openPreview() {
        return new PictureSelectionPreviewModel(this);
    }

    public PictureSelectionSystemModel openSystemGallery(int i7) {
        return new PictureSelectionSystemModel(this, i7);
    }

    private PictureSelector(Fragment fragment) {
        this(fragment.getActivity(), fragment);
    }

    public static PictureSelector create(AbstractActivityC0837o abstractActivityC0837o) {
        return new PictureSelector(abstractActivityC0837o);
    }

    private PictureSelector(Activity activity, Fragment fragment) {
        this.mActivity = new SoftReference<>(activity);
        this.mFragment = new SoftReference<>(fragment);
    }

    public static PictureSelector create(E e10) {
        return new PictureSelector(e10);
    }

    public static PictureSelector create(Fragment fragment) {
        return new PictureSelector(fragment);
    }
}
