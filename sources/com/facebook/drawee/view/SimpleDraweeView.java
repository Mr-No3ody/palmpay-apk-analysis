package com.facebook.drawee.view;

import C2.b;
import C2.c;
import F2.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
import com.facebook.imagepipeline.request.d;
import javax.annotation.Nullable;
import p181m3.a;
import p213o2.e;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SimpleDraweeView extends GenericDraweeView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c f21339b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f21340a;

    public SimpleDraweeView(Context context) {
        super(context);
        c(context, null);
    }

    public final void c(Context context, AttributeSet attributeSet) {
        int resourceId;
        try {
            a.a();
            if (isInEditMode()) {
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                e.e(f21339b, "SimpleDraweeView was not initialized!");
                this.f21340a = f21339b.get();
            }
            if (attributeSet != null) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, B2.a.SimpleDraweeView);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(B2.a.SimpleDraweeView_actualImageUri)) {
                        d(Uri.parse(typedArrayObtainStyledAttributes.getString(B2.a.SimpleDraweeView_actualImageUri)));
                    } else if (typedArrayObtainStyledAttributes.hasValue(B2.a.SimpleDraweeView_actualImageResource) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(B2.a.SimpleDraweeView_actualImageResource, -1)) != -1) {
                        if (isInEditMode()) {
                            setImageResource(resourceId);
                        } else {
                            setActualImageResource(resourceId);
                        }
                    }
                    typedArrayObtainStyledAttributes.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
            }
            a.a();
        } catch (Throwable th2) {
            a.a();
            throw th2;
        }
    }

    public final void d(Uri uri) {
        f fVar = this.f21340a;
        fVar.f2560a = null;
        b bVar = (b) fVar;
        bVar.d(uri);
        bVar.f2565f = getController();
        setController(bVar.build());
    }

    public f getControllerBuilder() {
        return this.f21340a;
    }

    public void setActualImageResource(@DrawableRes int i7) {
        Uri uri = p333w2.a.f43254a;
        d(new Uri.Builder().scheme("res").path(String.valueOf(i7)).build());
    }

    public void setImageRequest(d dVar) {
        f fVar = this.f21340a;
        fVar.f2561b = dVar;
        fVar.f2565f = getController();
        setController(fVar.build());
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView
    public void setImageResource(int i7) {
        super.setImageResource(i7);
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        d(uri);
    }

    public void setImageURI(@Nullable String str) {
        d(str != null ? Uri.parse(str) : null);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context, attributeSet);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        c(context, attributeSet);
    }
}
