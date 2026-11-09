package com.transsnet.palmpay.photograph;

import C9.ViewOnClickListenerC0146m;
import E.AbstractC0198c;
import Zc.b;
import Zc.c;
import Zc.d;
import Zc.e;
import Zc.f;
import Zc.i;
import Zc.j;
import Zc.l;
import Zc.m;
import Zc.n;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.didiglobal.booster.instrument.ShadowToast;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.permissions.PermissionConfig;
import com.transsnet.palmpay.photograph.crop.PhotoCropActivity;
import java.io.File;
import java.util.ArrayList;
import top.zibin.luban.io.a;

/* JADX INFO: loaded from: classes4.dex */
public class PhotoPickerActivity extends AbstractActivityC0837o implements PhotoLoadTask$PhotoLoaderCallback, OnItemClickListener<Uri>, PhotoFolderViewController$OnClickFolderCallback {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f33071j = {PermissionConfig.READ_EXTERNAL_STORAGE};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String[] f33072o = {PermissionConfig.READ_MEDIA_IMAGES};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f33073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f33074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f33075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f33076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f33077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f33078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f33079g = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ViewOnClickListenerC0146m f33080i = new ViewOnClickListenerC0146m(this, 17);

    public final void e() {
        e eVar = this.f33075c;
        if (eVar != null) {
            eVar.cancel(true);
            eVar.f11625a = null;
            this.f33075c = null;
        }
        e eVar2 = new e();
        eVar2.f11626b = getApplicationContext();
        eVar2.f11625a = this;
        this.f33075c = eVar2;
        eVar2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 100) {
            if (i10 != -1) {
                if (i10 == -2) {
                    ShadowToast.show(Toast.makeText(this, "crop fail", 0));
                }
            } else {
                Intent intent2 = new Intent();
                intent2.setData(Uri.fromFile(new File((String) a.g(this).f42646c)));
                setResult(-1, intent2);
                finish();
            }
        }
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        c cVar = this.f33077e;
        if (cVar == null || cVar.f11619b.getVisibility() != 0) {
            super.onBackPressed();
        } else {
            this.f33077e.a();
        }
    }

    @Override // com.transsnet.palmpay.photograph.PhotoFolderViewController$OnClickFolderCallback
    public final void onClick(b bVar) {
        f fVar = this.f33074b;
        if (fVar != null) {
            ArrayList arrayList = bVar.f11617c;
            ArrayList arrayList2 = fVar.f11627a;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            fVar.notifyDataSetChanged();
        }
        this.f33076d.setText(bVar.f11615a);
        c cVar = this.f33077e;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i7 = Build.VERSION.SDK_INT;
        Window window = getWindow();
        window.getDecorView().setSystemUiVisibility(UserMetadata.MAX_INTERNAL_KEY_SIZE);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getColor(i.photograph_colorPrimary));
        setContentView(m.activity_photo_picker);
        if ((getPackageName() + ".action.PHOTO_PICKER_ONLY").equals(getIntent().getAction())) {
            this.f33079g = false;
        }
        ((ImageButton) findViewById(l.backBtn)).setOnClickListener(new Yd.i(this, 6));
        this.f33073a = (RecyclerView) findViewById(l.photograph_photo_picker_rv);
        TextView textView = (TextView) findViewById(l.photograph_select_album);
        this.f33076d = textView;
        textView.setOnClickListener(this.f33080i);
        this.f33073a.setLayoutManager(new GridLayoutManager((Context) this, 4, 1, false));
        RecyclerView recyclerView = this.f33073a;
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(j.photo_picker_divider_space);
        d dVar = new d();
        dVar.f11624a = dimensionPixelOffset;
        recyclerView.addItemDecoration(dVar);
        f fVar = new f();
        fVar.f11628b = this;
        fVar.f11627a = new ArrayList();
        int i10 = getResources().getDisplayMetrics().widthPixels / 4;
        fVar.f11630d = i10;
        fVar.f11631e = i10;
        this.f33074b = fVar;
        fVar.f11629c = this;
        this.f33073a.setAdapter(fVar);
        if (i7 >= 33) {
            String[] strArr = f33072o;
            if (AbstractC0198c.I(this, strArr)) {
                e();
                return;
            } else {
                requestPermissions(strArr, 10);
                return;
            }
        }
        String[] strArr2 = f33071j;
        if (AbstractC0198c.I(this, strArr2)) {
            e();
        } else {
            requestPermissions(strArr2, 10);
        }
    }

    @Override // androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        e eVar = this.f33075c;
        if (eVar != null) {
            eVar.cancel(true);
            eVar.f11625a = null;
            this.f33075c = null;
        }
    }

    @Override // com.transsnet.palmpay.photograph.OnItemClickListener
    public final void onItemClick(Uri uri) {
        Uri uri2 = uri;
        try {
            if (!this.f33079g) {
                Intent intent = new Intent();
                intent.setData(uri2);
                setResult(-1, intent);
                finish();
                return;
            }
            a.g(this).getClass();
            Intent intent2 = new Intent();
            intent2.setClass(this, PhotoCropActivity.class);
            intent2.setDataAndType(uri2, SelectMimeType.SYSTEM_IMAGE);
            startActivityForResult(intent2, 100);
        } catch (Exception e10) {
            Log.e("PhotoPickerActivity", e10.getMessage());
        }
    }

    @Override // com.transsnet.palmpay.photograph.PhotoLoadTask$PhotoLoaderCallback
    public final void onPostExecute(ArrayList arrayList) {
        this.f33078f = arrayList;
        f fVar = this.f33074b;
        if (fVar != null) {
            ArrayList arrayList2 = ((b) arrayList.get(0)).f11617c;
            ArrayList arrayList3 = fVar.f11627a;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            fVar.notifyDataSetChanged();
        }
        this.f33076d.setText(((b) arrayList.get(0)).f11615a);
    }

    @Override // com.transsnet.palmpay.photograph.PhotoLoadTask$PhotoLoaderCallback
    public final void onProgressUpdate(ArrayList arrayList) {
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity, androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        for (int i10 : iArr) {
            if (i10 != 0) {
                ShadowToast.show(Toast.makeText(getApplicationContext(), n.photograph_denied_permission_photo, 0));
                return;
            }
        }
        if (i7 == 10) {
            e();
        }
    }

    @Override // com.transsnet.palmpay.photograph.PhotoLoadTask$PhotoLoaderCallback
    public final void onTaskCancelled() {
    }
}
