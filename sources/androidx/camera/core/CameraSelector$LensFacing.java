package androidx.camera.core;

import androidx.annotation.OptIn;
import androidx.annotation.RestrictTo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE, ElementType.TYPE_USE, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
@OptIn(markerClass = {ExperimentalLensFacing.class})
@Retention(RetentionPolicy.SOURCE)
@RestrictTo({p192n.c.f39801b})
public @interface CameraSelector$LensFacing {
}
