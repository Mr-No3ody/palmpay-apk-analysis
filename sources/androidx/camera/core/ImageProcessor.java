package androidx.camera.core;

import E.AbstractC0210o;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public interface ImageProcessor {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({p192n.c.f39800a})
    public @interface OutputFormats {
    }

    public interface Request {
        @NonNull
        ImageProxy getInputImage();

        int getOutputFormat();
    }

    public interface Response {
        @NonNull
        ImageProxy getOutputImage();
    }

    @NonNull
    Response process(@NonNull Request request) throws AbstractC0210o;
}
