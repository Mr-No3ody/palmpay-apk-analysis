package androidx.constraintlayout.core.state;

/* JADX INFO: loaded from: classes.dex */
public interface RegistryCallback {
    String currentLayoutInformation();

    String currentMotionScene();

    long getLastModified();

    void onDimensions(int i7, int i10);

    void onNewMotionScene(String str);

    void onProgress(float f10);

    void setDrawDebug(int i7);

    void setLayoutInformationMode(int i7);
}
