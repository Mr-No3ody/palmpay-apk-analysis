package com.rmondjone.camera;

import M.f;
import Oe.a;
import android.hardware.Camera;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import java.util.SortedSet;
import p321v7.b;

/* JADX INFO: loaded from: classes3.dex */
public class CameraPreview extends SurfaceView implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SurfaceHolder f24694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Camera f24695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BaseMvvmActivity f24697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f24698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f24699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24700g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AspectRatio f24701i;

    public CameraPreview(BaseMvvmActivity baseMvvmActivity, Camera camera, AspectRatio aspectRatio) {
        super(baseMvvmActivity);
        this.f24698e = new a(28);
        this.f24699f = new a(28);
        this.f24697d = baseMvvmActivity;
        this.f24695b = camera;
        SurfaceHolder holder = getHolder();
        this.f24694a = holder;
        holder.addCallback(this);
        holder.setType(3);
        this.f24700g = baseMvvmActivity.getWindowManager().getDefaultDisplay().getRotation();
        this.f24701i = aspectRatio;
    }

    private int getDisplayOrientation() {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i7 = 0;
        Camera.getCameraInfo(0, cameraInfo);
        int i10 = this.f24700g;
        if (i10 != 0) {
            if (i10 == 1) {
                i7 = 90;
            } else if (i10 == 2) {
                i7 = 180;
            } else if (i10 == 3) {
                i7 = 270;
            }
        }
        int i11 = ((i7 + 45) / 90) * 90;
        return cameraInfo.facing == 1 ? ((cameraInfo.orientation - i11) + MessageEvent.EVENT_CL_REPAYMENT_FAILED) % MessageEvent.EVENT_CL_REPAYMENT_FAILED : (cameraInfo.orientation + i11) % MessageEvent.EVENT_CL_REPAYMENT_FAILED;
    }

    public void setCamera(Camera camera) {
        this.f24695b = camera;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i10, int i11) {
        if (surfaceHolder.getSurface() == null) {
            return;
        }
        try {
            Camera camera = this.f24695b;
            if (camera != null) {
                camera.stopPreview();
                this.f24695b.setPreviewDisplay(this.f24694a);
                this.f24695b.startPreview();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        a aVar = this.f24699f;
        a aVar2 = this.f24698e;
        if (this.f24695b == null) {
            return;
        }
        try {
            if (this.f24701i == null) {
                BaseMvvmActivity baseMvvmActivity = this.f24697d;
                int width = baseMvvmActivity.getWindow().getDecorView().getWidth();
                int height = baseMvvmActivity.getWindow().getDecorView().getHeight();
                this.f24701i = AspectRatio.c(Math.min(width, height), Math.max(width, height));
            }
            this.f24695b.setDisplayOrientation(getDisplayOrientation());
            Camera.Parameters parameters = this.f24695b.getParameters();
            ((f) aVar2.f6830b).clear();
            for (Camera.Size size : parameters.getSupportedPreviewSizes()) {
                aVar2.b(new b(Math.min(size.width, size.height), Math.max(size.width, size.height)));
            }
            ((f) aVar.f6830b).clear();
            for (Camera.Size size2 : parameters.getSupportedPictureSizes()) {
                aVar.b(new b(Math.min(size2.width, size2.height), Math.max(size2.width, size2.height)));
            }
            SortedSet<b> sortedSetF = aVar2.f(this.f24701i);
            int width2 = getWidth();
            int height2 = getHeight();
            int i7 = this.f24700g;
            if (i7 == 1 || i7 == 3) {
                height2 = width2;
                width2 = height2;
            }
            bVar = new b(width2, height2);
            if (sortedSetF != null && !sortedSetF.isEmpty()) {
                for (b bVar : sortedSetF) {
                    if (width2 <= bVar.f43092a && height2 <= bVar.f43093b) {
                        break;
                    }
                }
            }
            int i10 = bVar.f43093b;
            int i11 = bVar.f43092a;
            b bVar2 = (b) aVar.f(this.f24701i).last();
            parameters.setPreviewSize(Math.max(i11, i10), Math.min(i11, i10));
            int i12 = bVar2.f43092a;
            int i13 = bVar2.f43093b;
            parameters.setPictureSize(Math.max(i12, i13), Math.min(bVar2.f43092a, i13));
            parameters.setPictureFormat(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            parameters.setRotation(0);
            Camera camera = this.f24695b;
            if (camera != null) {
                camera.setParameters(parameters);
                this.f24695b.setPreviewDisplay(surfaceHolder);
                this.f24695b.startPreview();
                this.f24696c = true;
            }
        } catch (Exception e10) {
            Log.e("CameraPreview", "相机预览错误: " + e10.getMessage());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Camera camera = this.f24695b;
        if (camera == null || !this.f24696c) {
            return;
        }
        try {
            camera.stopPreview();
            this.f24695b.release();
            this.f24695b = null;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
